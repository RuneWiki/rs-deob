import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class719 extends class644 {

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "[I")
    private int[] field10022;

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "[I")
    private int[] field10021;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "Lau;")
    private class739 field10013;

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "Lau;")
    private class739 field10023;

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "Lau;")
    private class739 field10019;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "[Lau;")
    private class739[] field10015;

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "Z")
    public static boolean field10018 = false;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "Lfh;")
    public static class653 field10016 = new class653();

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    public static int field10012;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
    public static int field10014;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
    public static int field10017;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "I")
    public static int field10020;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "I")
    public static int field10024;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "I")
    public static int field10025;

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "I")
    public static int field10026;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 7)
    public static void method4017(int arg0) {
        field10016 = null;
        if (arg0 != 397151784) {
            method4019(-84);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZLnd;IIZIDLd;)[I", line = 19)
    public final int[] method4018(boolean arg0, class547 arg1, int arg2, int arg3, boolean arg4, int arg5, double arg6, class153 arg7) {
        class712.field9870 = arg7;
        field10014++;
        class75.field1064 = arg1;
        for (int var10 = 0; var10 < this.field10015.length; var10++) {
            this.field10015[var10].method3338((byte) -66, arg5, arg3);
        }
        class180.method1228((byte) -108, arg6);
        class611.method3430((byte) 91, arg3, arg5);
        int[] var11 = new int[arg3 * arg5];
        int var12;
        int var13;
        byte var14;
        if (arg0) {
            var12 = arg5 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var14 = 1;
            var13 = arg5;
            var12 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg3; var16++) {
            if (arg4) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field10023.field10297) {
                int[] var18 = this.field10023.method215(-23347, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field10023.method223((byte) 48, var16);
                var19 = var22[2];
                var20 = var22[0];
                var21 = var22[1];
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class551.field7703[var25];
                int var28 = class551.field7703[var24];
                int var29 = class551.field7703[var26];
                int var30 = (var28 << 16) + (var27 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg4) {
                    var15 += arg5 - 1;
                }
            }
        }
        for (int var17 = arg2; var17 < this.field10015.length; var17++) {
            this.field10015[var17].method1886(false);
        }
        return var11;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V", line = 156)
    public static final void method4019(int arg0) {
        class533.field7401 = class453.method2542(35, 8, 8, 0.4F, 0, 2048, true, 4);
        int var1 = 27 / ((arg0 - 70) / 48);
        field10020++;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BZLd;IILnd;)[F", line = 172)
    public final float[] method4020(byte arg0, boolean arg1, class153 arg2, int arg3, int arg4, class547 arg5) {
        class75.field1064 = arg5;
        class712.field9870 = arg2;
        field10025++;
        for (int var7 = 0; var7 < this.field10015.length; var7++) {
            this.field10015[var7].method3338((byte) -66, arg4, arg3);
        }
        class611.method3430((byte) -72, arg3, arg4);
        float[] var8 = new float[arg3 * 4 * arg4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg3; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field10023.field10297) {
                int[] var16 = this.field10023.method215(-23347, var10);
                var15 = var16;
                var14 = var16;
                var13 = var16;
            } else {
                int[][] var12 = this.field10023.method223((byte) 111, var10);
                var13 = var12[2];
                var14 = var12[0];
                var15 = var12[1];
            }
            int[] var17;
            if (this.field10019.field10297) {
                var17 = this.field10019.method215(-23347, var10);
            } else {
                var17 = this.field10019.method223((byte) 94, var10)[0];
            }
            if (arg1) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field10013.field10297) {
                var18 = this.field10013.method215(-23347, var10);
            } else {
                var18 = this.field10013.method223((byte) 29, var10)[0];
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = var20;
                if (arg1) {
                    var9 += (arg4 << 2) - 4;
                }
            }
        }
        if (arg0 >= -59) {
            this.field10013 = null;
        }
        for (int var11 = 0; var11 < this.field10015.length; var11++) {
            this.field10015[var11].method1886(false);
        }
        return var8;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILd;Lnd;)Z", line = 288)
    public final boolean method4021(int arg0, class153 arg1, class547 arg2) {
        field10026++;
        if (class553.field7718 < 0) {
            for (int var4 = 0; var4 < this.field10021.length; var4++) {
                if (!arg2.method3154(this.field10021[var4], (byte) 98)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field10021.length; var5++) {
                if (!arg2.method3157(this.field10021[var5], 0, class553.field7718)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field10022.length; var6++) {
            if (!arg1.method1071((byte) 126, this.field10022[var6])) {
                return false;
            }
        }
        int var7 = -52 % (arg0 / 59);
        return true;
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(I)V", line = 341)
    public static final void method4022(int arg0) {
        class654.field9104.method2723(0);
        field10024++;
        class522.method3031(1603);
        if (arg0 != -29891) {
            method4022(80);
        }
        class705.field9777 = 0;
        class494.field6994 = null;
        class661.field9200 = 0;
        class609.field8448.field6193 = 0;
        class154.field2099 = null;
        class255.field3248 = null;
        class117.method911(52);
        class306.field4038 = null;
        class101.field1399 = 0;
        class194.field2654 = 0;
        class600.field8359 = 0;
        class602.field8365 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IDLd;ZBILnd;)[I", line = 368)
    public final int[] method4023(int arg0, double arg1, class153 arg2, boolean arg3, byte arg4, int arg5, class547 arg6) {
        class75.field1064 = arg6;
        class712.field9870 = arg2;
        field10017++;
        for (int var9 = 0; var9 < this.field10015.length; var9++) {
            this.field10015[var9].method3338((byte) -66, arg0, arg5);
        }
        class180.method1228((byte) -118, arg1);
        class611.method3430((byte) 125, arg5, arg0);
        int[] var10 = new int[arg0 * arg5];
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field10023.field10297) {
                int[] var14 = this.field10023.method215(-23347, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field10023.method223((byte) 48, var12);
                var15 = var18[2];
                var17 = var18[1];
                var16 = var18[0];
            }
            int[] var19;
            if (this.field10019.field10297) {
                var19 = this.field10019.method215(arg4 ^ 0x5B11, var12);
            } else {
                var19 = this.field10019.method223((byte) 40, var12)[0];
            }
            if (arg3) {
                var11 = var12;
            }
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                int var21 = var16[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var17[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var15[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class551.field7703[var21];
                int var25 = class551.field7703[var22];
                int var26 = class551.field7703[var23];
                int var27;
                if (var24 == 0 && var25 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var24 << 16) + (var27 << 24) + ((var25 << 8) - -var26);
                if (arg3) {
                    var11 += arg0 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field10015.length; var13++) {
            this.field10015[var13].method1886(false);
        }
        if (arg4 != -36) {
            this.method4023(-77, -0.12948243638718201D, null, true, (byte) 13, -44, null);
        }
        return var10;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V", line = 503)
    public class719() {
        this.field10022 = new int[0];
        this.field10021 = new int[0];
        this.field10013 = new class381(0);
        this.field10013.field10296 = 1;
        this.field10023 = new class381();
        this.field10023.field10296 = 1;
        this.field10019 = new class381();
        this.field10015 = new class739[] { this.field10023, this.field10019, this.field10013 };
        this.field10019.field10296 = 1;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lsl;)V", line = 518)
    public class719(class461 arg0) {
        int var2 = arg0.method2600((byte) -125);
        int var3 = 0;
        int var4 = 0;
        this.field10015 = new class739[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class739 var16 = class83.method692(arg0, (byte) 75);
            if (var16.method1889(false) >= 0) {
                var3++;
            }
            if (var16.method3336(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field10314.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2600((byte) -125);
            }
            this.field10015[var6] = var16;
        }
        this.field10021 = new int[var3];
        this.field10022 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class739 var11 = this.field10015[var9];
            int var12 = var11.field10314.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field10314[var13] = this.field10015[var5[var9][var13]];
            }
            int var14 = var11.method1889(false);
            int var15 = var11.method3336(-1);
            if (var14 > 0) {
                this.field10021[var7++] = var14;
            }
            if (var15 > 0) {
                this.field10022[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field10023 = this.field10015[arg0.method2600((byte) -125)];
        this.field10019 = this.field10015[arg0.method2600((byte) -124)];
        Object var10 = null;
        this.field10013 = this.field10015[arg0.method2600((byte) -126)];
    }
}
