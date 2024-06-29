import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class3 {

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field49 = 0;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lha;I)V")
    public static final void method22(class475 arg0, int arg1) {
        field45++;
        int var2 = 0;
        int var3 = 0;
        if (class593.field8489) {
            var2 = class45.method342(false);
            var3 = class87.method771(-2);
        }
        arg0.method488(var2, var3, class709.field9923 + var2, var3 + 350);
        arg0.method436(var2, var3, class709.field9923, 350, class518.field7119 << 24 | 0x332277, 1);
        class528.method3090(3985, var3 + 350, var3, var2, class709.field9923 + var2);
        int var4 = 350 / class531.field7399;
        if (class442.field6126 > 0) {
            int var5 = 346 - class531.field7399 - 4;
            int var6 = var4 * var5 / (class442.field6126 + var4 - 1);
            int var7 = 4;
            if (class442.field6126 > 1) {
                var7 += (class442.field6126 - class719.field10037 - 1) * (var5 - var6) / (class442.field6126 - 1);
            }
            arg0.method436(class709.field9923 + var2 - 16, var3 - -var7, 12, var6, class518.field7119 << 24 | 0x332277, 2);
            for (int var8 = class719.field10037; var8 < class719.field10037 + var4 && var8 < class442.field6126; var8++) {
                String[] var9 = class544.method3151((byte) -43, '\b', class334.field4738[var8]);
                int var10 = (class709.field9923 - 16 - 8) / var9.length;
                for (int var11 = 0; var11 < var9.length; var11++) {
                    int var12 = (var10 * var11) + 8;
                    arg0.method488(var2 + var12, var3, var2 + var12 + var10 - 8, var3 + 350);
                    class420.field5827.method2628(-1, class554.method3198(var9[var11], 0), var2 + var12, -119, -class491.field6733 + 350 + -class30.field322.field6399 + var3 + -2 + -((var8 - class719.field10037) * class531.field7399), -16777216);
                }
            }
        }
        class71.field1124.method2621(-1, "Build: 643", -101, -16777216, var2 + class709.field9923 - 25, var3 + -20 + 350);
        arg0.method488(var2, var3, class709.field9923 + var2, var3 + 350);
        arg0.method2770(var3 + 350 - class491.field6733, class709.field9923, var2, arg1 + 9, -1);
        class670.field9398.method2628(-1, "--> " + class554.method3198(class57.field883, 0), var2 + 10, -97, -class675.field9477.field6399 - 1 + var3 + 350, -16777216);
        if (class531.field7395) {
            int var13 = -1;
            if (class594.field8494 % 30 > 15) {
                var13 = 16777215;
            }
            arg0.method2774(12, true, class675.field9477.method2748("--> " + class554.method3198(class57.field883, arg1 ^ 0xFFFFFFF8).substring(0, class467.field6372), 8364) + var2 + 10, var13, var3 + 339 - class675.field9477.field6399);
        }
        if (arg1 != -8) {
            field47 = 63;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLdr;)I")
    public static final int method23(boolean arg0, class629 arg1) {
        field44++;
        if (class629.field8915 == arg1) {
            return 5120;
        } else if (class629.field8916 == arg1) {
            return 5122;
        } else if (class629.field8917 == arg1) {
            return 5124;
        } else if (class629.field8918 == arg1) {
            return 5121;
        } else if (class629.field8919 == arg1) {
            return 5123;
        } else if (class629.field8920 == arg1) {
            return 5125;
        } else if (class629.field8921 == arg1) {
            return 5131;
        } else if (class629.field8922 == arg1) {
            return 5126;
        } else {
            if (arg0) {
                method24(119, -80, -125, 103, 58, -63, -116);
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIII)V")
    public static final void method24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 8 && arg3 != 16) {
            class172 var7 = class514.field7096[arg0][arg5][arg1];
            if (var7 == null) {
                var7 = new class172(arg0);
            }
            if (arg3 == 1) {
                var7.field2597 = (short) arg6;
                var7.field2602 = (short) arg2;
            } else if (arg3 == 2) {
                var7.field2596 = (short) arg2;
                var7.field2601 = (short) arg6;
            }
            if (class401.field5524) {
                class492.method2871(true);
            }
        } else if (arg3 == 8) {
            int var14 = arg5 << class679.field9600;
            int var15 = class253.field3624 + var14;
            int var16 = arg1 << class679.field9600;
            int var17 = class253.field3624 + var16;
            int var18 = class495.field6799[arg0].method2476(arg1, arg5, -1);
            int var19 = class495.field6799[arg0].method2476(arg1 + 1, arg5 + 1, arg4 ^ 0xFFFFFFFE);
            class289.field4221[class260.field3684++] = new class131(arg3, arg0, var14, var15, var15, var14, var18, var19, var19 - arg6, -arg6 + var18, var16, var17, var17, var16);
        } else {
            int var8 = (arg5 << class679.field9600) + class253.field3624;
            int var9 = var8 - class253.field3624;
            int var10 = arg1 << class679.field9600;
            int var11 = var10 + class253.field3624;
            int var12 = class495.field6799[arg0].method2476(arg1, arg5 + 1, -1);
            int var13 = class495.field6799[arg0].method2476(arg1 + 1, arg5, arg4 ^ 0xFFFFFFFE);
            class289.field4221[class260.field3684++] = new class131(arg3, arg0, var8, var9, var9, var8, var12, var13, var13 - arg6, -arg6 + var12, var10, var11, var11, var10);
        }
        field48++;
        if (arg4 != 1) {
            method24(95, 92, -81, -107, 110, -122, 5);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIZZ)V")
    public static final void method25(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        class143.method1147(arg4, arg3, arg1, class556.field7710.length - 1, arg2, 0, -58);
        field46++;
        int var5 = -39 % ((56 - arg0) / 62);
        class213.field3123 = 0;
        class138.field2288 = null;
    }
}
