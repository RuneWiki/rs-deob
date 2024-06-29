import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class512 extends class270 {

    @OriginalMember(owner = "client!pda", name = "v", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field6531;

    @OriginalMember(owner = "client!pda", name = "t", descriptor = "Luw;")
    public static class208 field6529 = new class208(24, 0);

    @OriginalMember(owner = "client!pda", name = "w", descriptor = "Luw;")
    public static class208 field6532 = new class208(45, 12);

    @OriginalMember(owner = "client!pda", name = "q", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!pda", name = "r", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!pda", name = "s", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!pda", name = "u", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!pda", name = "x", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(Z)V", line = 3)
    public final void method2826(boolean arg0) {
        if (arg0) {
            field6530++;
            this.field6531.method2531();
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V", line = 18)
    public static void method2827(int arg0) {
        field6532 = null;
        field6529 = null;
        if (arg0 < 1) {
            field6532 = null;
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILqf;)V", line = 30)
    public static final void method2828(int arg0, class403 arg1) {
        field6526++;
        arg1.method1084((byte) 32);
        boolean var2 = false;
        for (class403 var3 = (class403) class253.field3440.method3855(arg0 - 8113); var3 != null; var3 = (class403) class253.field3440.method3861(true)) {
            if (class458.method2590(var3.method2354(0), arg1.method2354(0), arg0 - 8006)) {
                class231.method1482(12514, var3, arg1);
                var2 = true;
                break;
            }
        }
        if (arg0 != 8113) {
            field6532 = null;
        }
        if (!var2) {
            class253.field3440.method3862(arg1, false);
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)[Lgp;", line = 62)
    public static final class576[] method2829(byte arg0) {
        field6527++;
        if (arg0 != -49) {
            method2827(33);
        }
        return new class576[] { class604.field7675, class730.field9570, class170.field2261, class278.field3612, class316.field3940, class448.field5845, class682.field8797, class598.field7611, class169.field2250, class406.field5386 };
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIIIIIIIII)V", line = 74)
    public static final void method2830(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != -1725741207) {
            method2827(-100);
        }
        field6528++;
        if (arg8 >= class498.field6390 && arg8 <= class30.field274 && class498.field6390 <= arg9 && class30.field274 >= arg9 && class498.field6390 <= arg4 && arg4 <= class30.field274 && arg1 >= class498.field6390 && class30.field274 >= arg1 && class80.field1131 <= arg5 && arg5 <= class405.field5375 && arg0 >= class80.field1131 && class405.field5375 >= arg0 && arg2 >= class80.field1131 && class405.field5375 >= arg2 && arg7 >= class80.field1131 && class405.field5375 >= arg7) {
            class174.method1087(arg6, (byte) -118, arg1, arg5, arg7, arg9, arg2, arg8, arg4, arg0);
        } else {
            class47.method291(arg8, arg7, arg2, arg6, arg4, -180721044, arg0, arg1, arg9, arg5);
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IBII)I", line = 101)
    public static final int method2831(int arg0, byte arg1, int arg2, int arg3) {
        field6533++;
        if (class116.field1542 == null) {
            return 0;
        }
        int var4 = arg2 >> 9;
        int var5 = arg3 >> 9;
        if (var4 < 0 || var5 < 0 || (class240.field3280 - 1) < var4 || (class276.field3602 - 1) < var5) {
            return 0;
        }
        int var6 = -34 % ((11 - arg1) / 36);
        int var7 = arg0;
        if (arg0 < 3 && (class410.field5439[1][var4][var5] & 0x2) != 0) {
            var7 = arg0 + 1;
        }
        return class116.field1542[var7].method2072((byte) 102, arg2, arg3);
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(I)V", line = 126)
    public class512(int arg0) {
        this.field6531 = new NativeHeap(arg0);
    }
}
