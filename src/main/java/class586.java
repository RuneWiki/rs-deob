import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class586 {

    @OriginalMember(owner = "client!nda", name = "k", descriptor = "I")
    private int field8093 = -1;

    @OriginalMember(owner = "client!nda", name = "p", descriptor = "Z")
    private boolean field8098 = true;

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "[Laba;")
    private class238[] field8089;

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "I")
    private int field8090;

    @OriginalMember(owner = "client!nda", name = "r", descriptor = "I")
    private int field8100;

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
    private int field8084;

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "I")
    private int field8091;

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "[Laba;")
    private class238[] field8086;

    @OriginalMember(owner = "client!nda", name = "q", descriptor = "Laba;")
    private class238 field8099;

    @OriginalMember(owner = "client!nda", name = "t", descriptor = "Z")
    public static boolean field8102 = false;

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "Lbr;")
    public static class192 field8087 = new class192("", 14);

    @OriginalMember(owner = "client!nda", name = "v", descriptor = "[I")
    public static int[] field8104 = new int[2048];

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "I")
    public static int field8083;

    @OriginalMember(owner = "client!nda", name = "f", descriptor = "I")
    public static int field8088;

    @OriginalMember(owner = "client!nda", name = "j", descriptor = "I")
    public static int field8092;

    @OriginalMember(owner = "client!nda", name = "l", descriptor = "I")
    private int field8094;

    @OriginalMember(owner = "client!nda", name = "m", descriptor = "I")
    public static int field8095;

    @OriginalMember(owner = "client!nda", name = "n", descriptor = "I")
    public static int field8096;

    @OriginalMember(owner = "client!nda", name = "o", descriptor = "I")
    private int field8097;

    @OriginalMember(owner = "client!nda", name = "s", descriptor = "I")
    public static int field8101;

    @OriginalMember(owner = "client!nda", name = "u", descriptor = "I")
    public static int field8103;

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "Lf;")
    private class532 field8085;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V", line = 9)
    public static void method3243(int arg0) {
        if (arg0 != 1) {
            method3245(-1.6966816F, -1.0885171F, -2.5373428F, (byte) -108);
        }
        field8104 = null;
        field8087 = null;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IF)F", line = 21)
    public static final float method3244(int arg0, float arg1) {
        if (arg0 != 9692) {
            field8104 = null;
        }
        field8092++;
        return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(FFFB)I", line = 32)
    public static final int method3245(float arg0, float arg1, float arg2, byte arg3) {
        field8101++;
        if (arg3 != -104) {
            method3244(34, 1.2710594F);
        }
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        float var6 = arg0 < 0.0F ? -arg0 : arg0;
        if (var5 > var4 && var5 > var6) {
            return (arg2 > 0.0F) ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return (arg0 > 0.0F) ? 2 : 3;
        } else if ((arg1 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Z)V", line = 76)
    public static final void method3246(boolean arg0) {
        field8083++;
        class391.field5236 = 0;
        int var1 = class289.field3807.method963(-121);
        int var2 = class289.field3807.method931(28);
        int var3 = class289.field3807.method945((byte) -113);
        boolean var4 = class289.field3807.method930(255) == 1;
        class645.method3589(-88);
        class5.method33((byte) 76, var3);
        int var5 = (class151.field2070 - class289.field3807.field2219) / 16;
        class581.field7947 = new int[var5][4];
        if (arg0) {
            return;
        }
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class581.field7947[var6][var10] = class289.field3807.method908(false);
            }
        }
        class361.field4785 = new byte[var5][];
        class311.field4201 = new int[var5];
        class297.field3929 = new byte[var5][];
        class191.field2645 = null;
        class229.field2972 = new int[var5];
        class245.field3207 = new int[var5];
        class611.field8486 = new byte[var5][];
        class502.field6923 = null;
        class552.field7545 = new int[var5];
        class37.field506 = new byte[var5][];
        class126.field1760 = new int[var5];
        int var7 = 0;
        for (int var8 = (var2 - (class703.field9886 >> 4)) / 8; var8 <= (((class703.field9886 >> 4) + var2) / 8); var8++) {
            for (int var9 = (var1 - (class431.field5789 >> 4)) / 8; var9 <= (((class431.field5789 >> 4) + var1) / 8); var9++) {
                class126.field1760[var7] = (var8 << 8) + var9;
                class245.field3207[var7] = class543.field7433.method1959(5743, "m" + var8 + "_" + var9);
                class229.field2972[var7] = class543.field7433.method1959(5743, "l" + var8 + "_" + var9);
                class552.field7545[var7] = class543.field7433.method1959(5743, "um" + var8 + "_" + var9);
                class311.field4201[var7] = class543.field7433.method1959(5743, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class96.method545(11, var2, (byte) 17, var1, var4);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IBLr;)Z", line = 153)
    public final boolean method3247(int arg0, byte arg1, class562 arg2) {
        if (this.field8093 != arg0) {
            this.field8093 = arg0;
            int var4 = class245.method1497(arg0, (byte) -124);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field8094 != var4) {
                this.field8085 = null;
                this.field8094 = var4;
            }
            if (this.field8089 != null) {
                this.field8097 = 0;
                int[] var5 = new int[this.field8089.length];
                for (int var6 = 0; var6 < this.field8089.length; var6++) {
                    class238 var7 = this.field8089[var6];
                    if (var7.method1479(this.field8100, this.field8090, this.field8084, this.field8093)) {
                        var5[this.field8097] = var7.field3153;
                        this.field8086[this.field8097++] = var7;
                    }
                }
                class658.method3761(this.field8097 - 1, 0, 0, this.field8086, var5);
            }
            this.field8098 = true;
        }
        field8103++;
        if (arg1 > -33) {
            this.method3247(112, (byte) -104, null);
        }
        boolean var8 = false;
        if (this.field8098) {
            this.field8098 = false;
            for (int var9 = this.field8097 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field8086[var9].method1469(arg2, this.field8099);
                this.field8098 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(I[Laba;IIII)V", line = 549)
    public class586(int arg0, class238[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8089 = arg1;
        this.field8090 = arg4;
        this.field8100 = arg3;
        this.field8084 = arg5;
        this.field8091 = arg0;
        if (arg1 == null) {
            this.field8086 = null;
            this.field8099 = null;
        } else {
            this.field8086 = new class238[arg1.length];
            this.field8099 = arg2 < 0 ? null : arg1[arg2];
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIIIILr;III)V", line = 239)
    public final void method3248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class562 arg6, int arg7, int arg8, int arg9) {
        int var11 = arg7 + arg4 & 0x3FFF;
        field8096++;
        if (this.field8091 == -1) {
            arg6.method1113(arg2, arg9, arg8, arg0, arg5, 0);
        } else {
            class105 var12 = class574.field7845.method2959(arg1 + 24094, this.field8091);
            if (this.field8085 == null && class574.field7845.method2961(true, this.field8091)) {
                int[] var13 = var12.field1253 ? class574.field7845.method2963(false, this.field8094, true, this.field8094, 0.7F, this.field8091) : class574.field7845.method2964(this.field8091, (byte) 67, this.field8094, false, 0.7F, this.field8094);
                this.field8085 = arg6.method1122(var13, 0, this.field8094, this.field8094, this.field8094);
            }
            if (var12.field1253) {
                arg6.method1113(arg2, arg9, arg8, arg0, arg5, 0);
            }
            if (this.field8085 != null) {
                int var14 = var12.field1253 ? 1 : 0;
                int var15 = arg0 * arg3 / -4096;
                int var16;
                for (var16 = arg0 * var11 / 4096 + (arg8 - arg0) / 2; var16 > arg0; var16 -= arg0) {
                }
                while (var16 < 0) {
                    var16 += arg0;
                }
                while (arg0 < var15) {
                    var15 -= arg0;
                }
                while (var15 < 0) {
                    var15 += arg0;
                }
                for (int var17 = var16 - arg0; var17 < arg8; var17 += arg0) {
                    for (int var18 = var15 - arg0; var18 < arg0; var18 += arg0) {
                        this.field8085.method2991(arg2 + var17, arg9 + var18, arg0, arg0, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field8097 - 1; var19 >= 0; var19--) {
            this.field8086[var19].method1475(arg6, arg2, arg9, arg8, arg0, arg3, var11);
        }
        if (arg1 != -24009) {
            this.field8085 = null;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)V", line = 317)
    public final void method3249(byte arg0) {
        if (this.field8089 != null) {
            for (int var2 = 0; var2 < this.field8089.length; var2++) {
                this.field8089[var2].method1478();
            }
        }
        field8088++;
        if (arg0 == 68) {
            this.field8085 = null;
        }
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(B)V", line = 349)
    public static final void method3250(byte arg0) {
        field8095++;
        if (class602.field8408.method3567(class618.field8566, (byte) -109) != 2) {
            return;
        }
        byte var1 = (byte) (class647.field8940 - 4 & 0xFF);
        int var2 = class647.field8940 % class703.field9886;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class431.field5789; var18++) {
                class614.field8511[var3][var2][var18] = var1;
            }
        }
        if (class298.field3942 == 3) {
            return;
        }
        if (arg0 != -13) {
            method3243(-83);
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class323.field4355[var4] = -1000000;
            class62.field780[var4] = 1000000;
            class699.field9859[var4] = 0;
            class474.field6605[var4] = 1000000;
            class302.field3994[var4] = 0;
        }
        int var5 = class408.field5369.field398;
        int var6 = class408.field5369.field397;
        if (class311.field4200 != 1 && class342.field4585 == -1) {
            int var7 = class180.method1211(class298.field3942, true, class82.field946, class147.field1980);
            if ((var7 - class148.field1986) < 3200 && (class31.field440[class298.field3942][class82.field946 >> 9][class147.field1980 >> 9] & 0x4) != 0) {
                class154.method902(false, 1, class153.field2168, class147.field1980 >> 9, false, class82.field946 >> 9);
                return;
            }
            return;
        }
        if (class311.field4200 != 1) {
            var5 = class342.field4585;
            var6 = class83.field1004;
        }
        if ((class31.field440[class298.field3942][var5 >> 9][var6 >> 9] & 0x4) != 0) {
            class154.method902(false, 0, class153.field2168, var6 >> 9, false, var5 >> 9);
        }
        if (class558.field7615 >= 2560) {
            return;
        }
        int var8 = class82.field946 >> 9;
        int var9 = class147.field1980 >> 9;
        int var10 = var5 >> 9;
        int var11 = var6 >> 9;
        int var12;
        if (var8 < var10) {
            var12 = var10 - var8;
        } else {
            var12 = var8 - var10;
        }
        int var13;
        if (var9 >= var11) {
            var13 = var9 - var11;
        } else {
            var13 = var11 - var9;
        }
        if ((var12 != 0 || var13 != 0) && -class703.field9886 < var12 && class703.field9886 > var12 && var13 > (-class431.field5789) && class431.field5789 > var13) {
            if (var12 <= var13) {
                int var14 = var12 * 65536 / var13;
                int var15 = 32768;
                while (var9 != var11) {
                    if (var11 > var9) {
                        var9++;
                    } else if (var9 > var11) {
                        var9--;
                    }
                    if ((class31.field440[class298.field3942][var8][var9] & 0x4) != 0) {
                        class154.method902(false, 1, class153.field2168, var9, false, var8);
                        return;
                    }
                    var15 += var14;
                    if (var15 >= 65536) {
                        if (var8 < var10) {
                            var8++;
                        } else if (var10 < var8) {
                            var8--;
                        }
                        var15 -= 65536;
                        if ((class31.field440[class298.field3942][var8][var9] & 0x4) != 0) {
                            class154.method902(false, 1, class153.field2168, var9, false, var8);
                            return;
                        }
                    }
                }
                return;
            }
            int var16 = var13 * 65536 / var12;
            int var17 = 32768;
            while (var8 != var10) {
                if (var10 > var8) {
                    var8++;
                } else if (var10 < var8) {
                    var8--;
                }
                if ((class31.field440[class298.field3942][var8][var9] & 0x4) != 0) {
                    class154.method902(false, 1, class153.field2168, var9, false, var8);
                    return;
                }
                var17 += var16;
                if (var17 >= 65536) {
                    var17 -= 65536;
                    if (var9 < var11) {
                        var9++;
                    } else if (var9 > var11) {
                        var9--;
                    }
                    if ((class31.field440[class298.field3942][var8][var9] & 0x4) != 0) {
                        class154.method902(false, 1, class153.field2168, var9, false, var8);
                        return;
                    }
                }
            }
            return;
        }
        class91.method499("RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class125.field1745 + "," + class4.field23, null, (byte) 124);
        return;
    }
}
