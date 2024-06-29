import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class174 implements class430 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Lwn;")
    public static class663 field2600 = new class663();

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field2606 = -1;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Luc;")
    public static class27 field2607 = new class27(46, 3);

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field2608 = 0;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1195(int arg0) {
        class663[] var1 = class625.field8714;
        synchronized (class625.field8714) {
            int var2 = arg0;
            while (true) {
                if (var2 >= class625.field8714.length) {
                    break;
                }
                class625.field8714[var2] = new class663();
                class25.field328[var2] = 0;
                var2++;
            }
        }
        field2602++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([IBJLlaa;)Ljava/lang/String;", line = 28)
    public final String method1196(int[] arg0, byte arg1, long arg2, class106 arg3) {
        field2601++;
        if (class417.field5877 == arg3) {
            class312 var6 = class136.field1924.method680((byte) 56, arg0[0]);
            return var6.method1915((int) arg2, 107);
        } else if (class526.field7210 == arg3 || class349.field5022 == arg3) {
            class257 var7 = class648.field9184.method3064((int) arg2, -54);
            return var7.field3655;
        } else {
            if (arg1 > -81) {
                field2600 = null;
            }
            return class245.field3486 == arg3 || class479.field6693 == arg3 || class288.field4011 == arg3 ? class136.field1924.method680((byte) 56, arg0[0]).method1915((int) arg2, 99) : null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(FIFILtfa;[BBFIIFIF)V", line = 69)
    public static final void method1197(float arg0, int arg1, float arg2, int arg3, class31 arg4, byte[] arg5, byte arg6, float arg7, int arg8, int arg9, float arg10, int arg11, float arg12) {
        for (int var13 = 0; var13 < arg11; var13++) {
            class534.method2954(arg5, arg7, arg10, arg8, arg12, arg0, arg1, arg2, -95, var13, arg11, arg3, arg9, arg4);
            arg8 += arg1 * arg3;
        }
        if (arg6 > -74) {
            field2605 = -24;
        }
        field2604++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 96)
    public static void method1198(byte arg0) {
        field2607 = null;
        if (arg0 != -79) {
            method1197(0.84085673F, 52, 1.4277649F, 62, null, null, (byte) -42, -0.5102271F, 99, -25, 0.6943355F, 106, -1.1433415F);
        }
        field2600 = null;
    }
}
