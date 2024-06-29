import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class520 extends class65 {

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "Lcb;")
    public static class631 field7512 = new class631(21, -1);

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public int field7511;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    public int field7515;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public static int field7516;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "Lkba;")
    public static class184 field7513;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZI)V", line = 3)
    public static final void method3097(boolean arg0, int arg1) {
        if (arg0 && class729.field10201 != null) {
            class399.field5924 = class729.field10201.field7884;
        } else {
            class399.field5924 = -1;
        }
        field7517++;
        class729.field10201 = null;
        class297.field4516 = null;
        class612.field8632 = 0;
        class508.field7390 = null;
        class729.method4038();
        class729.field10210.method3465(arg1 ^ arg1);
        class4.field32 = null;
        class120.field1849 = -1;
        class370.field5623 = null;
        class372.field5641 = null;
        class505.field7362 = -1;
        class398.field5923 = null;
        class611.field8608 = null;
        class729.field10209 = null;
        class86.field1271 = null;
        class256.field4030 = null;
        class494.field7153 = null;
        class275.field4205 = null;
        if (class729.field10206 != null) {
            class729.field10206.method2556(-118);
            class729.field10206.method2557(64, 36, 128);
        }
        if (class729.field10208 != null) {
            class729.field10208.method3853(64, (byte) -12, 64);
        }
        if (class729.field10204 != null) {
            class729.field10204.method3067(64, (byte) -88);
        }
        class52.field836.method1716(64, (byte) 125);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IFIIIIIIF[FI[F)V", line = 50)
    public static final void method3098(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8, float[] arg9, int arg10, float[] arg11) {
        field7514++;
        int var12 = arg6 - arg7;
        int var13 = arg0 - arg3;
        int var14 = arg4 - arg5;
        float var15 = arg9[2] * (float) var14 + arg9[1] * (float) var12 + arg9[0] * (float) var13;
        float var16 = arg9[5] * (float) var14 + arg9[4] * (float) var12 + arg9[3] * (float) var13;
        float var17 = arg9[8] * (float) var14 + arg9[6] * (float) var13 + arg9[7] * (float) var12;
        if (arg10 >= -27) {
            field7513 = null;
        }
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg8 != 1.0F) {
            var18 = arg8 * var18;
        }
        float var19 = var16 + arg1 + 0.5F;
        if (arg2 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg2 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg2 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        arg11[0] = var18;
        arg11[1] = var19;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lib;)V", line = 105)
    public static final void method3099(class1 arg0) {
        class532.field7659 = arg0;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 112)
    public static void method3100(int arg0) {
        field7512 = null;
        field7513 = null;
        if (arg0 != 16210) {
            field7513 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILha;)V", line = 128)
    public static final void method3101(int arg0, class544 arg1) {
        field7516++;
        if (!(class608.field8588 >= 2 || class552.field7867) || class146.field2298 != null) {
            return;
        }
        String var2;
        if (class552.field7867 && class608.field8588 < 2) {
            var2 = class131.field2134 + class641.field9025.method3621(113, class467.field6804) + class355.field5375 + " ->";
        } else if (class637.field8955 && class543.field7749.method455(arg0 - 14470, 81) && class608.field8588 > 2) {
            var2 = class208.method1519(false, class237.field3813);
        } else {
            class208 var3 = class237.field3813;
            if (var3 == null) {
                return;
            }
            var2 = class208.method1519(false, var3);
            int[] var4 = null;
            if (class313.method2064(100, var3.field3488)) {
                var4 = class556.field7917.method741(arg0 + 126, (int) var3.field3473).field9701;
            } else if (var3.field3489 != -1) {
                var4 = class556.field7917.method741(126, var3.field3489).field9701;
            } else if (class4.method16((byte) -100, var3.field3488)) {
                class53 var5 = (class53) class332.field4881.method3512(true, (long) ((int) var3.field3473));
                if (var5 != null) {
                    class461 var6 = var5.field847;
                    class504 var7 = var6.field6688;
                    if (var7.field7308 != null) {
                        var7 = var7.method3046(arg0 + 108, class422.field6216);
                    }
                    if (var7 != null) {
                        var4 = var7.field7310;
                    }
                }
            } else if (class354.method2271(var3.field3488, 25)) {
                Object var8 = null;
                class595 var9;
                if (var3.field3488 == 1006) {
                    var9 = class576.field8167.method3074(0, (int) var3.field3473);
                } else {
                    var9 = class576.field8167.method3074(0, (int) (var3.field3473 >>> 32 & 0x7FFFFFFFL));
                }
                if (var9.field8351 != null) {
                    var9 = var9.method3413(-1, class422.field6216);
                }
                if (var9 != null) {
                    var4 = var9.field8434;
                }
            }
            if (var4 != null) {
                var2 = var2 + class740.method4144(var4, (byte) 27);
            }
        }
        if (class608.field8588 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class608.field8588 - 2) + class641.field9018.method3621(arg0 + 119, class467.field6804);
        }
        if (arg0 != 1) {
            field7512 = null;
        }
        if (class25.field249 != null) {
            class400 var11 = class25.field249.method2249((byte) 108, arg1);
            if (var11 == null) {
                var11 = class257.field4034;
            }
            var11.method2469(class25.field249.field5341, class601.field8501, class25.field249.field5230, var2, class25.field249.field5316, class680.field9614, class625.field8753, class481.field6949, class25.field249.field5278, class616.field8698, class465.field6788, class25.field249.field5280, class735.field10354, class25.field249.field5212, 58);
            class598.method3436(class616.field8698[0], class616.field8698[3], (byte) -123, class616.field8698[2], class616.field8698[1]);
        } else if (class550.field7847 != null && class565.field8012 == class519.field7498) {
            int var10 = class257.field4034.method2485(class680.field9614, 0, class625.field8753, class601.field8501, class13.field121 + 4, 5, 16777215, class465.field6788, class382.field5739 + 16, var2);
            class598.method3436(class13.field121 + 4, 16, (byte) -123, class632.field8881.method510(var2, 174) + var10, class382.field5739);
            return;
        }
    }
}
