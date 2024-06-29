import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class198 {

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    private int field3324 = 0;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public int field3322 = -1;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "Z")
    public boolean field3316 = false;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    private int field3327 = 0;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    private int field3312 = 0;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    private int field3323 = 128;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    private int field3326 = 128;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "Z")
    public boolean field3328 = false;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "[I")
    public static int[] field3308 = new int[1000];

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "F")
    public static float field3329;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public int field3321;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    private int field3325;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "Lek;")
    public static class206 field3319;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "[I")
    public static int[] field3307;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "[S")
    private short[] field3310;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "[S")
    private short[] field3311;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "[S")
    private short[] field3314;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "[S")
    private short[] field3330;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIILml;IJZ)Z", line = 4)
    public static final boolean method1350(int arg0, int arg1, int arg2, int arg3, int arg4, class152 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class251.method1769(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 44)
    public static void method1351(int arg0) {
        if (arg0 < 82) {
            field3319 = (class206) null;
        }
        field3319 = null;
        field3308 = null;
        field3307 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Loe;I)V", line = 56)
    public final void method1352(class146 arg0, int arg1) {
        field3320++;
        if (arg1 != -28977) {
            method1353((class127) null, -87, true, (class1) null, 111, 3, 97, (class280) null);
        }
        while (true) {
            int var3 = arg0.method1005((byte) 122);
            if (var3 == 0) {
                return;
            }
            this.method1355(-29539, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lsb;IZLaj;IIILqj;)V", line = 78)
    public static final void method1353(class127 arg0, int arg1, boolean arg2, class1 arg3, int arg4, int arg5, int arg6, class280 arg7) {
        class168 var8 = null;
        field3318++;
        if (arg3.field35 == 0) {
            if ((double) class38.field828 == 3.0D) {
                var8 = class314.field5115;
            }
            if ((double) class38.field828 == 4.0D) {
                var8 = class23.field580;
            }
            if ((double) class38.field828 == 6.0D) {
                var8 = class212.field3513;
            }
            if ((double) class38.field828 >= 8.0D) {
                var8 = class222.field3670;
            }
        } else if (arg3.field35 == 1) {
            if ((double) class38.field828 == 3.0D) {
                var8 = class212.field3513;
            }
            if ((double) class38.field828 == 4.0D) {
                var8 = class222.field3670;
            }
            if ((double) class38.field828 == 6.0D) {
                var8 = class174.field2892;
            }
            if ((double) class38.field828 >= 8.0D) {
                var8 = class26.field665;
            }
        } else if (arg3.field35 == 2) {
            if ((double) class38.field828 == 3.0D) {
                var8 = class174.field2892;
            }
            if ((double) class38.field828 == 4.0D) {
                var8 = class26.field665;
            }
            if ((double) class38.field828 == 6.0D) {
                var8 = class124.field2187;
            }
            if ((double) class38.field828 >= 8.0D) {
                var8 = class282.field4610;
            }
        }
        if (var8 != null) {
            int var9 = arg3.field1;
            if (arg0.field2210 && arg3.field17 != -1) {
                var9 = arg3.field17;
            }
            int var10 = class173.field2877.method630(arg3.field15, (int[]) null, class10.field291);
            int var11 = arg0.field2227;
            int var12;
            if (arg2) {
                var12 = var11 - var10 * var8.method1200() / 2;
            } else {
                var12 = var11 - ((var10 - 1) * var8.method1201() + (arg1 + (var8.method1200() / 2)));
            }
            int var13 = var12 - var8.method1200();
            int var14 = var12 + var8.method1200() / 2;
            int var15 = 0;
            for (int var16 = 0; var16 < var10; var16++) {
                String var17 = class10.field291[var16];
                if ((var10 - 1) > var16) {
                    var17 = var17.substring(0, var17.length() - 4);
                }
                int var18 = var8.method1192(var17);
                if (var18 > var15) {
                    var15 = var18;
                }
            }
            arg7.field4569 = var13 + arg6;
            arg7.field4565 = arg0.field2223 + (var15 / 2) + arg4;
            arg7.field4571 = arg4 + arg0.field2223 - (var15 / 2);
            int var19 = var13 + 2;
            arg7.field4573 = arg6 + (var13 + (var8.method1201() * var10));
            int var20 = arg0.field2223 - (var15 / 2) - 5;
            if (arg3.field26 != 0) {
                class270.method1890(var20, var19, var15 + 10, (var8.method1201() * var10 + var13 - var19) + 1, arg3.field26, arg3.field26 >>> 24);
            }
            if (arg3.field34 != 0) {
                class270.method1901(var20, var19, var15 + 10, (var13 + var10 * var8.method1201() - var19) + 1, arg3.field34, arg3.field34 >>> 24);
            }
            for (int var21 = 0; var21 < var10; var21++) {
                String var22 = class10.field291[var21];
                if (var10 - 1 > var21) {
                    var22 = var22.substring(0, var22.length() - 4);
                }
                int var23 = var8.method1192(var22);
                if (var23 > var15) {
                    var15 = var23;
                }
                var8.method1199(var22, arg0.field2223, var14, var9, true);
                var14 += var8.method1201();
            }
        }
        int var24 = -82 / ((-arg5 - 53) / 45);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IB)Leb;", line = 233)
    public static final class133 method1354(int arg0, byte arg1) {
        class133 var2 = (class133) class140.field2375.method893((long) arg0, arg1 ^ 0x2B);
        field3331++;
        if (arg1 != 74) {
            return (class133) null;
        } else if (var2 == null) {
            class133 var3 = class115.method854(class232.field3808, arg0, false, class229.field3757, 0);
            if (var3 != null) {
                class140.field2375.method888((long) arg0, var3, 83);
            }
            return var3;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILoe;I)V", line = 267)
    private final void method1355(int arg0, class146 arg1, int arg2) {
        if (arg2 == 1) {
            this.field3325 = arg1.method989(124);
        } else if (arg2 == 2) {
            this.field3322 = arg1.method989(64);
        } else if (arg2 == 4) {
            this.field3323 = arg1.method989(arg0 ^ 0xFFFF8CF9);
        } else if (arg2 == 5) {
            this.field3326 = arg1.method989(60);
        } else if (arg2 == 6) {
            this.field3312 = arg1.method989(94);
        } else if (arg2 == 7) {
            this.field3327 = arg1.method1005((byte) 122);
        } else if (arg2 == 8) {
            this.field3324 = arg1.method1005((byte) 122);
        } else if (arg2 == 9) {
            this.field3328 = true;
        } else if (arg2 == 10) {
            this.field3316 = true;
        } else if (arg2 == 40) {
            int var4 = arg1.method1005((byte) 122);
            this.field3310 = new short[var4];
            this.field3314 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3314[var5] = (short) arg1.method989(class115.method856(arg0, -29466));
                this.field3310[var5] = (short) arg1.method989(123);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method1005((byte) 122);
            this.field3330 = new short[var6];
            this.field3311 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3330[var7] = (short) arg1.method989(102);
                this.field3311[var7] = (short) arg1.method989(125);
            }
        }
        field3315++;
        if (arg0 != -29539) {
            method1353((class127) null, -124, true, (class1) null, 95, 81, -111, (class280) null);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)[F", line = 360)
    public static final float[] method1356(byte arg0) {
        field3317++;
        float var1 = class259.method1816() + class259.method1820();
        int var2 = class259.method1817();
        if (arg0 != 100) {
            return (float[]) null;
        }
        float var3 = (float) ((var2 & 0xFFD4) >> 8) / 255.0F;
        class174.field2888[3] = 1.0F;
        float var4 = (float) ((var2 & 0xFF5E8F) >> 16) / 255.0F;
        float var5 = 0.58823526F;
        class174.field2888[0] = class105.field1924[0] * var4 * var5 * var1;
        float var6 = (float) (var2 & 0xFF) / 255.0F;
        class174.field2888[2] = class105.field1924[2] * var6 * var5 * var1;
        class174.field2888[1] = class105.field1924[1] * var3 * var5 * var1;
        return class174.field2888;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIII)Lhb;", line = 399)
    public final class42 method1357(int arg0, int arg1, int arg2, int arg3) {
        field3309++;
        class42 var5 = (class42) class108.field1986.method893((long) this.field3321, arg3 + 136);
        if (arg3 != -11) {
            this.field3326 = -88;
        }
        if (var5 == null) {
            class48 var6 = class48.method401(class274.field4467, this.field3325, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field3314 != null) {
                for (int var7 = 0; var7 < this.field3314.length; var7++) {
                    var6.method410(this.field3314[var7], this.field3310[var7]);
                }
            }
            if (this.field3330 != null) {
                for (int var8 = 0; var8 < this.field3330.length; var8++) {
                    var6.method400(this.field3330[var8], this.field3311[var8]);
                }
            }
            var5 = var6.method424(this.field3327 + 64, 850 - -this.field3324, -30, -50, -30);
            class108.field1986.method888((long) this.field3321, var5, 85);
        }
        class42 var9;
        if (this.field3322 == -1 || arg0 == -1) {
            var9 = var5.method355(true, true, true);
        } else {
            var9 = class258.method1807(this.field3322, 108).method2145(arg2, arg0, 65535, var5, arg1);
        }
        if (this.field3323 != 128 || this.field3326 != 128) {
            var9.method351(this.field3323, this.field3326, this.field3323);
        }
        if (this.field3312 != 0) {
            if (this.field3312 == 90) {
                var9.method343();
            }
            if (this.field3312 == 180) {
                var9.method341();
            }
            if (this.field3312 == 270) {
                var9.method354();
            }
        }
        return var9;
    }
}
