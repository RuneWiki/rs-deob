import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class563 extends class187 {

    @OriginalMember(owner = "client!ts", name = "u", descriptor = "Lol;")
    private class301 field7982;

    @OriginalMember(owner = "client!ts", name = "q", descriptor = "Lcga;")
    private class509 field7978;

    @OriginalMember(owner = "client!ts", name = "v", descriptor = "I")
    public static int field7983 = 0;

    @OriginalMember(owner = "client!ts", name = "t", descriptor = "F")
    public static float field7981;

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "I")
    public static int field7974;

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
    public static int field7975;

    @OriginalMember(owner = "client!ts", name = "o", descriptor = "I")
    public static int field7976;

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
    public static int field7977;

    @OriginalMember(owner = "client!ts", name = "r", descriptor = "I")
    public static int field7979;

    @OriginalMember(owner = "client!ts", name = "s", descriptor = "I")
    public static int field7980;

    @OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
    public static int field7984;

    @OriginalMember(owner = "client!ts", name = "x", descriptor = "I")
    public static int field7985;

    @OriginalMember(owner = "client!ts", name = "y", descriptor = "I")
    public static int field7986;

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "I")
    public static int field7987;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "Lqn;")
    public static class71 field7973;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V", line = 5)
    public static void method3255(byte arg0) {
        if (arg0 >= -5) {
            method3257(110, (class732) null, false, false, (class732) null, 99, true);
        }
        field7973 = null;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZ)V", line = 16)
    public final void method172(int arg0, boolean arg1) {
        ++field7977;
        if (arg0 <= 56) {
            field7983 = -99;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBLkka;)Z", line = 27)
    public static final boolean method3256(int arg0, byte arg1, class329 arg2) {
        ++field7986;
        int var3 = arg2.method2078(2, 15455);
        if (var3 == 0) {
            if (arg2.method2078(1, 15455) != 0) {
                method3256(arg0, (byte) -84, arg2);
            }
            int var4 = arg2.method2078(6, 15455);
            int var5 = arg2.method2078(6, 15455);
            boolean var6 = ~arg2.method2078(1, 15455) == -2;
            if (var6) {
                class88.field1218[class35.field582++] = arg0;
            }
            if (class527.field7150[arg0] != null) {
                throw new RuntimeException("hr:lr");
            } else {
                class593 var7 = class606.field8464[arg0];
                class771 var8 = class527.field7150[arg0] = new class771();
                var8.field5288 = arg0;
                if (class341.field4601[arg0] != null) {
                    var8.method4245(-65536, class341.field4601[arg0]);
                }
                var8.method2340(73, var7.field8335, true);
                var8.field5286 = var7.field8330;
                int var9 = var7.field8331;
                int var10 = var9 >> 28;
                int var11 = (4191056 & var9) >> 14;
                int var12 = var9 & 255;
                int var13 = (var11 << 6) + var4 + -class217.field3198;
                var8.field10639 = var7.field8328;
                var8.field10635 = var7.field8333;
                int var14 = (var12 << 6) + var5 + -class400.field5510;
                var8.field5306[0] = class104.field1679[arg0];
                var8.field7391 = var8.field7404 = (byte) var10;
                if (class61.method425(var14, arg1 + 16424, var13)) {
                    ++var8.field7404;
                }
                var8.method4237(var14, var13, 0);
                var8.field10618 = false;
                class606.field8464[arg0] = null;
                return true;
            }
        } else if (var3 == 1) {
            int var15 = arg2.method2078(2, arg1 ^ -15373);
            int var16 = class606.field8464[arg0].field8331;
            class606.field8464[arg0].field8331 = ((3 & (var16 >> 28) + var15) << 28) - -(var16 & 268435455);
            return false;
        } else if (~var3 == -3) {
            int var17 = arg2.method2078(5, arg1 + 15539);
            int var18 = var17 >> 3;
            int var19 = var17 & 7;
            int var20 = class606.field8464[arg0].field8331;
            int var21 = (var20 >> 28) - -var18 & 3;
            int var22 = 255 & var20 >> 14;
            int var23 = 255 & var20;
            if (~var19 == -1) {
                --var23;
                --var22;
            }
            if (var19 == 1) {
                --var23;
            }
            if (~var19 == -3) {
                --var23;
                ++var22;
            }
            if (~var19 == -4) {
                --var22;
            }
            if (~var19 == -5) {
                ++var22;
            }
            if (~var19 == -6) {
                --var22;
                ++var23;
            }
            if (~var19 == -7) {
                ++var23;
            }
            if (var19 == 7) {
                ++var23;
                ++var22;
            }
            class606.field8464[arg0].field8331 = (var21 << 28) - (-(var22 << 14) - var23);
            return false;
        } else {
            int var24 = arg2.method2078(18, 15455);
            int var25 = var24 >> 16;
            int var26 = 255 & var24 >> 8;
            int var27 = var24 & 255;
            if (arg1 != -84) {
                return false;
            } else {
                int var28 = class606.field8464[arg0].field8331;
                int var29 = (var28 >> 28) + var25 & 3;
                int var30 = 255 & (var28 >> 14) + var26;
                int var31 = var27 + var28 & 255;
                class606.field8464[arg0].field8331 = (var29 << 28) + (var30 << 14) + var31;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBLqk;)V", line = 196)
    public final void method167(int arg0, byte arg1, class18 arg2) {
        super.field2885.method939(arg2, 8448);
        ++field7976;
        super.field2885.method999(true, arg0);
        if (arg1 != -126) {
            this.field7978 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)Z", line = 209)
    public final boolean method171(int arg0) {
        if (arg0 != 20220) {
            return true;
        } else {
            ++field7980;
            return true;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZB)V", line = 220)
    public final void method168(boolean arg0, byte arg1) {
        this.field7978.method2906('\u0000', 67);
        ++field7985;
        int var3 = -18 % ((arg1 - 36) / 48);
        if (this.field7982.field4146) {
            super.field2885.method1002(1, -5172);
            super.field2885.method939(this.field7982.field4143, 8448);
            super.field2885.method1002(0, -5172);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZI)V", line = 239)
    public final void method170(int arg0, boolean arg1, int arg2) {
        ++field7974;
        float var4 = (float) ((arg0 & 3) + 1) * -5.0E-4F;
        float var5 = (float) ((arg0 >> 3 & 3) - -1) * 5.0E-4F;
        float var6 = (arg0 & 64) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        super.field2885.method1002(1, -5172);
        boolean var7 = ~(128 & arg0) != -1;
        if (!var7) {
            class666.field9271[3] = 0.0F;
            class666.field9271[0] = 0.0F;
            class666.field9271[2] = var6;
            class666.field9271[1] = 0.0F;
        } else {
            class666.field9271[1] = 0.0F;
            class666.field9271[3] = 0.0F;
            class666.field9271[2] = 0.0F;
            class666.field9271[0] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class666.field9271, 0);
        class666.field9271[2] = 0.0F;
        class666.field9271[1] = var6;
        if (!arg1) {
            this.field7978 = null;
        }
        class666.field9271[3] = (float) super.field2885.field1938 * var4 % 1.0F;
        class666.field9271[0] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class666.field9271, 0);
        if (!this.field7982.field4146) {
            int var8 = (int) ((float) super.field2885.field1938 * var5 * 16.0F);
            super.field2885.method939(this.field7982.field4144[var8 % 16], 8448);
        } else {
            class666.field9271[2] = 0.0F;
            class666.field9271[1] = 0.0F;
            class666.field9271[0] = 0.0F;
            class666.field9271[3] = (float) super.field2885.field1938 * var5 % 1.0F;
            OpenGL.glTexGenfv(8194, 9473, class666.field9271, 0);
        }
        super.field2885.method1002(0, -5172);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILwaa;ZZLwaa;IZ)I", line = 297)
    public static final int method3257(int arg0, class732 arg1, boolean arg2, boolean arg3, class732 arg4, int arg5, boolean arg6) {
        ++field7984;
        int var7 = class557.method3203(arg4, arg2, arg0, arg1, arg3);
        if (~var7 != -1) {
            return arg2 ? -var7 : var7;
        } else if (~arg5 == 0) {
            return 0;
        } else {
            int var8 = class557.method3203(arg4, arg6, arg5, arg1, arg3);
            return arg6 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Leaa;IIILcq;IIIIIII)V", line = 336)
    public static final void method3258(class528 arg0, int arg1, int arg2, int arg3, class494 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        class413.field5659 = arg8;
        class499.field6825 = arg2;
        class334.field4514 = null;
        class22.field468 = arg11;
        class570.field8130 = arg5;
        if (arg7 != 20305) {
            field7983 = 81;
        }
        class433.field5888 = null;
        class410.field5615 = arg9;
        class71.field1048 = null;
        class13.field200 = arg4;
        class592.field8321 = arg1;
        class358.field4899 = arg10;
        ++field7987;
        class725.field9967 = arg6;
        class608.field8487 = arg0;
        class309.field4221 = arg3;
        class760.method4208(false);
        class245.field3481 = true;
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lhk;Lol;)V", line = 362)
    public class563(class111 arg0, class301 arg1) {
        super(arg0);
        this.field7982 = arg1;
        this.field7978 = new class509(arg0, 2);
        this.field7978.method2902(0, 4864);
        super.field2885.method1002(1, -5172);
        if (this.field7982.field4146) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field2885.method1002(0, -5172);
        this.field7978.method2901(4);
        this.field7978.method2902(1, 4864);
        super.field2885.method1002(1, -5172);
        if (this.field7982.field4146) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field2885.method1002(0, -5172);
        this.field7978.method2901(4);
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)V", line = 395)
    public static final void method3259(byte arg0) {
        class573.field8161 = -1;
        int var1 = -111 % ((arg0 - 30) / 44);
        class231.field3356 = -1;
        class392.field5380 = -1;
        class442.field5989 = 0;
        ++field7975;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V", line = 410)
    public final void method169(boolean arg0) {
        ++field7979;
        this.field7978.method2906('\u0001', -51);
        super.field2885.method1002(1, -5172);
        super.field2885.method939((class18) null, 8448);
        if (arg0) {
            super.field2885.method1002(0, -5172);
        }
    }
}
