import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class103 extends class698 {

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field1541;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "Lmea;")
    public static class355 field1538 = new class355("", 16);

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "Llp;")
    public static class69 field1546;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static final void method734(byte arg0) {
        if (class108.field1617 < 0) {
            class425.field6217 = -1;
            class519.field7277 = -1;
            class108.field1617 = 0;
        }
        int var1 = -18 % ((arg0 + 45) / 42);
        field1540++;
        if (class55.field851 < class108.field1617) {
            class108.field1617 = class55.field851;
            class425.field6217 = -1;
            class519.field7277 = -1;
        }
        if (class19.field375 < 0) {
            class519.field7277 = -1;
            class19.field375 = 0;
            class425.field6217 = -1;
        }
        if (class55.field869 < class19.field375) {
            class425.field6217 = -1;
            class519.field7277 = -1;
            class19.field375 = class55.field869;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
    public final void method735(boolean arg0) {
        field1542++;
        if (arg0) {
            this.field1541.method2072();
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(JBIIZ)Ljava/lang/String;")
    public static final String method736(long arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        field1539++;
        char var6 = ',';
        char var7 = '.';
        if (arg3 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg3 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg0 < 0L) {
            arg0 = -arg0;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg2 > 0) {
            for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg0 * 10)));
            }
            var9.append(var6);
        }
        if (arg1 != -55) {
            method737(59, 89);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg0 * 10)));
            if (arg0 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I)V")
    public class103(int arg0) {
        this.field1541 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
    public static final void method737(int arg0, int arg1) {
        class692 var2 = class449.field6502;
        synchronized (class449.field6502) {
            class449.field6502.method3900(arg1, 0);
        }
        field1544++;
        class692 var3 = class495.field7010;
        synchronized (class495.field7010) {
            if (arg0 != 10) {
                field1546 = null;
            }
            class495.field7010.method3900(arg1, arg0 - 10);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
    public static void method738(byte arg0) {
        field1538 = null;
        int var1 = -125 % ((-arg0 - 58) / 44);
        field1546 = null;
    }
}
