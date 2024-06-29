import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class517 extends class304 implements class207 {

    @OriginalMember(owner = "client!rw", name = "C", descriptor = "I")
    public static int field7279 = 0;

    @OriginalMember(owner = "client!rw", name = "A", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!rw", name = "B", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!rw", name = "D", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!rw", name = "E", descriptor = "I")
    public static int field7281;

    @OriginalMember(owner = "client!rw", name = "G", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!rw", name = "H", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!rw", name = "F", descriptor = "[Ls;")
    public static class402[] field7282;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(JI)V", line = 5)
    public static final void method2965(long arg0, int arg1) {
        ++field7277;
        if (arg1 < -70) {
            if (~arg0 < -1L) {
                if (~(arg0 % 10L) != -1L) {
                    class753.method4198(arg0, false);
                } else {
                    class753.method4198(arg0 - 1L, false);
                    class753.method4198(1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILka;III)Lufa;", line = 27)
    public static final class152 method2966(int arg0, class219 arg1, int arg2, int arg3, int arg4) {
        if (arg3 <= 91) {
            return null;
        } else {
            ++field7278;
            return arg1 == null ? null : new class152(arg0, arg4, arg2, arg1.method1347(), arg1.method1339(), arg1.method1359(), arg1.method1353(), arg1.method1361(), arg1.method1344(), arg1.method1355());
        }
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(Z)V", line = 48)
    public static void method2967(boolean arg0) {
        field7282 = null;
        if (!arg0) {
            method2967(true);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V", line = 58)
    public static final void method2968(int arg0) {
        if (arg0 == 5121) {
            ++field7280;
            class71.field954.method776((byte) -36);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(BII)Z", line = 72)
    public static final boolean method2969(byte arg0, int arg1, int arg2) {
        ++field7281;
        if (arg0 < 87) {
            field7282 = null;
        }
        return (34 & arg2) != 0;
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lck;IZ[[I)V", line = 86)
    public class517(class221 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class440.field6178, class240.field3093, arg1 * arg1 * 6, arg2);
        super.field3921.method3711(false, this);
        if (arg2) {
            for (int var5 = 0; ~var5 > -7; ++var5) {
                this.method1785(arg3[var5], arg1, arg1, 1, var5 + 34069);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method1798(109), arg1, arg1, 0, class436.method2578(6145, super.field3923), super.field3921.field2901, arg3[var6], 0);
            }
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIIIIIIII)V", line = 121)
    public static final void method2970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field7283;
        if (class666.method3606(105, arg2)) {
            if (arg1 == -22704) {
                int var10 = 0;
                int var11 = 0;
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                if (class107.field1323) {
                    var10 = class614.field8598;
                    var12 = class423.field6027;
                    var13 = class303.field3890;
                    var11 = class453.field6360;
                    var14 = class393.field5484;
                    class393.field5484 = 1;
                }
                if (class238.field3072[arg2] == null) {
                    class90.method628(arg5, arg0, arg3, arg4, arg8, arg6, class323.field4125[arg2], arg7 < 0, -1, arg7, (byte) -13);
                } else {
                    class90.method628(arg5, arg0, arg3, arg4, arg8, arg6, class238.field3072[arg2], ~arg7 > -1, -1, arg7, (byte) -13);
                }
                if (class107.field1323) {
                    if (arg7 >= 0 && class393.field5484 == 2) {
                        class365.method2249(true, class303.field3890, class453.field6360, class423.field6027, class614.field8598);
                    }
                    class303.field3890 = var13;
                    class614.field8598 = var10;
                    class393.field5484 = var14;
                    class453.field6360 = var11;
                    class423.field6027 = var12;
                }
            }
        } else if (arg7 != -1) {
            class709.field9971[arg7] = true;
        } else {
            for (int var9 = 0; var9 < 100; ++var9) {
                class709.field9971[var9] = true;
            }
        }
    }
}
