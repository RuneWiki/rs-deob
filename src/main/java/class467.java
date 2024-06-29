import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class467 extends InputStream {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field6879 = 0;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Lpu;")
    public static class179 field6880 = new class179("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "[I")
    public static int[] field6885 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field6884;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Lhp;", line = 4)
    public static final class293 method2844(int arg0, int arg1) {
        field6883++;
        class150[] var2 = class364.field5371;
        synchronized (class364.field5371) {
            if (arg0 != -22755) {
                return null;
            }
            class293 var4;
            if (class364.field5371.length <= arg1 || class364.field5371[arg1].method1074((byte) 126)) {
                var4 = new class293();
                var4.field4524 = new class41[arg1];
                for (int var5 = 0; var5 < arg1; var5++) {
                    var4.field4524[var5] = new class41();
                }
            } else {
                var4 = (class293) class364.field5371[arg1].method1072(true);
                var4.method2069(arg0 + 22744);
                int var10002 = class267.field4257[arg1]--;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 38)
    public static void method2845(int arg0) {
        if (arg0 == 0) {
            field6880 = null;
            field6885 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILwn;Lcl;IILza;ILae;)V", line = 49)
    public static final void method2846(int arg0, class177 arg1, class53 arg2, int arg3, int arg4, class299 arg5, int arg6, class30 arg7) {
        if (arg6 != 4) {
            method2847(-1, 115, (byte) -77);
        }
        field6878++;
        int var8 = arg2.field820 - (arg3 / 2) - 5;
        int var9 = arg0 + 2;
        if (arg7.field364 != 0) {
            arg5.method1991(var9, arg7.field364, arg3 + 10, arg4 * arg1.method1253() + 1 + arg0 + -var9, 123, var8);
        }
        if (arg7.field339 != 0) {
            arg5.method1992(var8, (byte) -81, var9, arg3 + 10, -var9 + 1 + (arg0 - -(arg1.method1253() * arg4)), arg7.field339);
        }
        int var10 = arg7.field327;
        if (arg2.field815 && arg7.field349 != -1) {
            var10 = arg7.field349;
        }
        for (int var11 = 0; var11 < arg4; var11++) {
            String var12 = class185.field2842[var11];
            if (var11 < arg4 - 1) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg1.method1249(arg5, var12, arg2.field820, arg0, var10, true);
            arg0 += arg1.method1253();
        }
    }

    @OriginalMember(owner = "client!ld", name = "read", descriptor = "()I", line = 102)
    public final int read() {
        field6881++;
        class468.method2848(30000L, (byte) 86);
        return -1;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIB)I", line = 114)
    public static final int method2847(int arg0, int arg1, byte arg2) {
        field6884++;
        if (arg1 == 4 || arg1 == 5) {
            return class9.field103[arg0 & 0x3];
        } else {
            if (arg2 < 82) {
                method2845(47);
            }
            return 256;
        }
    }
}
