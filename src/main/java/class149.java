import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class149 {

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Lwd;")
    public static class150 field3641 = class2.method9(true, "hitmarks");

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Lwd;")
    public static class150 field3645 = class2.method9(true, "::fpsoff");

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    private int field3644;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "J")
    private long field3647;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "J")
    private long field3658;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lob;")
    public static class99 field3639;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Z")
    public boolean field3648;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "[I")
    private int[] field3640;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "[I")
    private int[] field3646;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "[Lqd;")
    public static class114[] field3655;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lh;IILh;I)Lbe;")
    public final class13 method1156(class49 arg0, int arg1, int arg2, class49 arg3, int arg4) {
        field3649++;
        if (this.field3644 != -1) {
            return class24.method192(this.field3644, (byte) -104).method851(arg0, arg4, arg1, arg3, (byte) -34);
        }
        if (arg2 >= -14) {
            this.method1162(31);
        }
        long var6 = this.field3658;
        int[] var8 = this.field3646;
        if (arg0 != null && (arg0.field1318 >= 0 || arg0.field1281 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field3646[var9];
            }
            if (arg0.field1318 >= 0) {
                var6 += arg0.field1318 - this.field3646[5] << 8;
                var8[5] = arg0.field1318;
            }
            if (arg0.field1281 >= 0) {
                var6 += arg0.field1281 - this.field3646[3] << 16;
                var8[3] = arg0.field1281;
            }
        }
        class13 var10 = (class13) class43.field1198.method440(var6, 26976);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if (var21 >= 256 && var21 < 512 && !class141.method1060((byte) 75, var21 - 256).method75(1)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class4.method26((byte) 112, var21 - 512).method167(-1, this.field3648)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field3647 != -1L) {
                    var10 = (class13) class43.field1198.method440(this.field3647, 26976);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class27[] var13 = new class27[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class27 var19 = class141.method1060((byte) 77, var18 - 256).method71(0);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class27 var20 = class4.method26((byte) 92, var18 - 512).method165(-116, this.field3648);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class27 var16 = new class27(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field3640[var17] != 0) {
                        var16.method234(class66.field1667[var17][0], class66.field1667[var17][this.field3640[var17]]);
                        if (var17 == 1) {
                            var16.method234(client.field633[0], client.field633[this.field3640[var17]]);
                        }
                    }
                }
                var10 = var16.method223(64, 850, -30, -50, -30);
                class43.field1198.method433(var10, var6, (byte) -122);
                this.field3647 = var6;
            }
        }
        if (arg0 == null && arg3 == null) {
            return var10;
        }
        class13 var22;
        if (arg0 != null && arg3 != null) {
            var22 = arg0.method370(arg1, 19814, var10, arg4, arg3);
        } else if (arg0 == null) {
            var22 = arg3.method366(var10, (byte) 100, arg1);
        } else {
            var22 = arg0.method366(var10, (byte) 115, arg4);
        }
        return var22;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIB)V")
    public final void method1157(boolean arg0, int arg1, byte arg2) {
        field3660++;
        int var4 = this.field3640[arg1];
        if (arg0) {
            var4++;
            if (class66.field1667[arg1].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class66.field1667[arg1].length - 1;
            }
        }
        if (arg2 == 64) {
            this.field3640[arg1] = var4;
            this.method1166((byte) 125);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BIII)I")
    public static final int method1158(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 58) {
            return -96;
        }
        field3659++;
        if ((class131.field3097[arg2][arg1][arg3] & 0x8) == 0) {
            return arg2 <= 0 || (class131.field3097[1][arg1][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZZ)V")
    public final void method1159(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.method1159(false, false);
        }
        field3642++;
        if (arg1 != this.field3648) {
            this.method1163(arg1, null, false, this.field3640, -1);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZI)V")
    public final void method1160(int arg0, boolean arg1, int arg2) {
        field3643++;
        if (arg2 == 1 && this.field3648) {
            return;
        }
        if (arg0 != -16) {
            this.field3647 = 55L;
        }
        int var4 = this.field3646[class103.field2345[arg2]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class11 var5;
        do {
            if (arg1) {
                var4++;
                if (var4 >= class31.field927) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class31.field927 - 1;
                }
            }
            var5 = class141.method1060((byte) 57, var4);
        } while (var5 == null || var5.field267 || (this.field3648 ? 7 : 0) + arg2 != var5.field265);
        this.field3646[class103.field2345[arg2]] = var4 + 256;
        this.method1166((byte) 125);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lse;I)V")
    public static final void method1161(class127 arg0, int arg1) {
        if (class11.field280 == arg0.field3014 || arg0.field3005 == -1 || arg0.field2979 != 0 || arg0.field2985 + 1 > class111.method785(arg0.field3005, 22969).field1298[arg0.field2960]) {
            int var2 = arg0.field3014 - arg0.field2996;
            int var3 = class11.field280 - arg0.field2996;
            int var4 = arg0.field2993 * 64 + arg0.field2942 * 128;
            int var5 = arg0.field2950 * 128 + arg0.field2993 * 64;
            int var6 = arg0.field2932 * 128 + arg0.field2993 * 64;
            int var7 = arg0.field2962 * 128 + arg0.field2993 * 64;
            arg0.field3000 = ((var2 - var3) * var4 + var3 * var7) / var2;
            arg0.field2939 = ((var2 - var3) * var5 + var3 * var6) / var2;
        }
        field3651++;
        arg0.field2957 = 0;
        if (arg0.field3007 == 0) {
            arg0.field3006 = 1024;
        }
        if (arg1 != -24315) {
            method1164(39);
        }
        if (arg0.field3007 == 1) {
            arg0.field3006 = 1536;
        }
        if (arg0.field3007 == 2) {
            arg0.field3006 = 0;
        }
        if (arg0.field3007 == 3) {
            arg0.field3006 = 512;
        }
        arg0.field2971 = arg0.field3006;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)I")
    public final int method1162(int arg0) {
        if (arg0 != -4513) {
            field3639 = null;
        }
        field3654++;
        return this.field3644 == -1 ? (this.field3646[11] << 5) + (this.field3646[0] << 15) + (this.field3640[0] << 25) + (this.field3640[4] << 20) + (this.field3646[8] << 10) + this.field3646[1] : 305419896 - -class24.method192(this.field3644, (byte) -98).field2722;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z[IZ[II)V")
    public final void method1163(boolean arg0, int[] arg1, boolean arg2, int[] arg3, int arg4) {
        if (arg2) {
            this.method1169((byte) 52, null);
        }
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class31.field927; var7++) {
                    class11 var8 = class141.method1060((byte) 102, var7);
                    if (var8 != null && !var8.field267 && var8.field265 == (arg0 ? 7 : 0) + var6) {
                        arg1[class103.field2345[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        field3656++;
        this.field3640 = arg3;
        this.field3644 = arg4;
        this.field3646 = arg1;
        this.field3648 = arg0;
        this.method1166((byte) 121);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    public static void method1164(int arg0) {
        field3641 = null;
        field3639 = null;
        field3655 = null;
        field3645 = null;
        int var1 = -62 / ((27 - arg0) / 44);
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)Lde;")
    public final class27 method1165(int arg0) {
        field3652++;
        if (this.field3644 != -1) {
            return class24.method192(this.field3644, (byte) -108).method855((byte) 14);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field3646[var3];
            if (var12 >= 256 && var12 < 512 && !class141.method1060((byte) -111, var12 - 256).method70((byte) 27)) {
                var2 = true;
            }
            if (var12 >= 512 && !class4.method26((byte) 99, var12 - 512).method154(this.field3648, (byte) -17)) {
                var2 = true;
            }
        }
        if (arg0 != 13633) {
            method1158((byte) 89, -26, 66, 97);
        }
        if (var2) {
            return null;
        }
        class27[] var4 = new class27[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field3646[var6];
            if (var9 >= 256 && var9 < 512) {
                class27 var10 = class141.method1060((byte) 70, var9 - 256).method68(false);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class27 var11 = class4.method26((byte) 99, var9 - 512).method155((byte) -120, this.field3648);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class27 var7 = new class27(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field3640[var8] != 0) {
                var7.method234(class66.field1667[var8][0], class66.field1667[var8][this.field3640[var8]]);
                if (var8 == 1) {
                    var7.method234(client.field633[0], client.field633[this.field3640[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    private final void method1166(byte arg0) {
        field3653++;
        long var2 = this.field3658;
        int var4 = this.field3646[5];
        int var5 = this.field3646[9];
        this.field3646[5] = var5;
        this.field3658 = 0L;
        this.field3646[9] = var4;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field3658 <<= 0x4;
            if (this.field3646[var6] >= 256) {
                this.field3658 += this.field3646[var6] - 256;
            }
        }
        if (this.field3646[0] >= 256) {
            this.field3658 += this.field3646[0] - 256 >> 4;
        }
        if (this.field3646[1] >= 256) {
            this.field3658 += this.field3646[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field3658 <<= 0x3;
            this.field3658 += this.field3640[var7];
        }
        this.field3646[5] = var4;
        this.field3646[9] = var5;
        this.field3658 <<= 0x1;
        this.field3658 += this.field3648 ? 1 : 0;
        if (var2 != 0L && this.field3658 != var2) {
            class43.field1198.method438(300, var2);
        }
        if (arg0 <= 119) {
            this.field3647 = -87L;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIIZZ)Lce;")
    public static final class20 method1167(boolean arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field3661++;
        if (arg1 < 104) {
            field3639 = null;
        }
        class106 var5 = null;
        if (class113.field2630 != null) {
            var5 = new class106(arg2, class113.field2630, class78.field1922[arg2], 1000000);
        }
        return new class20(var5, class28.field863, arg2, arg4, arg0, arg3);
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
    public static final void method1168(int arg0) {
        class72.field1798 = 0;
        if (arg0 >= -30) {
            method1161(null, 121);
        }
        for (int var1 = -1; var1 < class133.field3128 + class109.field2533; var1++) {
            class127 var18;
            if (var1 == -1) {
                var18 = class46.field1244;
            } else if (var1 < class109.field2533) {
                var18 = class137.field3217[class61.field1574[var1]];
            } else {
                var18 = class37.field1013[class101.field2309[var1 - class109.field2533]];
            }
            if (var18 != null && var18.method133((byte) -109)) {
                if (var18 instanceof class18) {
                    class118 var19 = ((class18) var18).field478;
                    if (var19.field2714 != null) {
                        var19 = var19.method858(90);
                    }
                    if (var19 == null) {
                        continue;
                    }
                }
                if (class109.field2533 <= var1) {
                    class118 var20 = ((class18) var18).field478;
                    if (var20.field2714 != null) {
                        var20 = var20.method858(76);
                    }
                    if (var20.field2707 >= 0 && var20.field2707 < class24.field719.length) {
                        class40.method292(var18, 11705, var18.field2945 + 15);
                        if (class127.field2937 > -1) {
                            class24.field719[var20.field2707].method398(class127.field2937 - 12, class68.field1725 - 30);
                        }
                    }
                    if (class101.field2292 == 1 && class101.field2309[var1 - class109.field2533] == class29.field879 && class11.field280 % 20 < 10) {
                        class40.method292(var18, 11705, var18.field2945 + 15);
                        if (class127.field2937 > -1) {
                            class66.field1671[0].method398(class127.field2937 - 12, class68.field1725 + -28);
                        }
                    }
                } else {
                    int var21 = 30;
                    class111 var22 = (class111) var18;
                    if (var22.field2565 != -1 || var22.field2558 != -1) {
                        class40.method292(var18, 11705, var18.field2945 + 15);
                        if (class127.field2937 > -1) {
                            if (var22.field2565 != -1) {
                                class38.field1034[var22.field2565].method398(class127.field2937 - 12, class68.field1725 - var21);
                                var21 += 25;
                            }
                            if (var22.field2558 != -1) {
                                class24.field719[var22.field2558].method398(class127.field2937 - 12, -var21 + class68.field1725);
                                var21 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class101.field2292 == 10 && class61.field1574[var1] == class98.field2249) {
                        class40.method292(var18, 11705, var18.field2945 + 15);
                        if (class127.field2937 > -1) {
                            class66.field1671[1].method398(class127.field2937 - 12, -var21 + class68.field1725);
                        }
                    }
                }
                if (var18.field3015 != null && (class109.field2533 <= var1 || class135.field3183 == 0 || class135.field3183 == 3 || class135.field3183 == 1 && class133.method994(((class111) var18).field2555, false))) {
                    class40.method292(var18, 11705, var18.field2945);
                    if (class127.field2937 > -1 && class91.field2111 > class72.field1798) {
                        class91.field2127[class72.field1798] = class134.field3150.method1038(var18.field3015) / 2;
                        class91.field2113[class72.field1798] = class134.field3150.field3268;
                        class91.field2119[class72.field1798] = class127.field2937;
                        class91.field2131[class72.field1798] = class68.field1725;
                        class91.field2137[class72.field1798] = var18.field2958;
                        class91.field2117[class72.field1798] = var18.field2986;
                        class91.field2120[class72.field1798] = var18.field2946;
                        class91.field2124[class72.field1798] = var18.field3015;
                        class72.field1798++;
                    }
                }
                if (class11.field280 < var18.field3009) {
                    class40.method292(var18, 11705, var18.field2945 + 15);
                    if (class127.field2937 > -1) {
                        int var23 = var18.field2959 * 30 / var18.field3001;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        class120.method872(class127.field2937 - 15, class68.field1725 + -3, var23, 5, 65280);
                        class120.method872(class127.field2937 + var23 - 15, class68.field1725 - 3, 30 - var23, 5, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    if (var18.field2977[var24] > class11.field280) {
                        class40.method292(var18, 11705, var18.field2945 / 2);
                        if (class127.field2937 > -1) {
                            if (var24 == 1) {
                                class68.field1725 -= 20;
                            }
                            if (var24 == 2) {
                                class68.field1725 -= 10;
                                class127.field2937 -= 15;
                            }
                            if (var24 == 3) {
                                class68.field1725 -= 10;
                                class127.field2937 += 15;
                            }
                            class125.field2902[var18.field2954[var24]].method398(class127.field2937 - 12, class68.field1725 + -12);
                            class105.field2374.method1052(class29.method239(1000, var18.field2944[var24]), class127.field2937, class68.field1725 + 4, 0);
                            class105.field2374.method1052(class29.method239(1000, var18.field2944[var24]), class127.field2937 - 1, class68.field1725 + 3, 16777215);
                        }
                    }
                }
            }
        }
        field3650++;
        for (int var2 = 0; var2 < class72.field1798; var2++) {
            int var3 = class91.field2119[var2];
            int var4 = class91.field2131[var2];
            int var5 = class91.field2127[var2];
            int var6 = class91.field2113[var2];
            boolean var7 = true;
            while (var7) {
                var7 = false;
                for (int var17 = 0; var17 < var2; var17++) {
                    if (var4 + 2 > class91.field2131[var17] + -class91.field2113[var17] && class91.field2131[var17] + 2 > -var6 + var4 && class91.field2127[var17] + class91.field2119[var17] > -var5 + var3 && var3 + var5 > class91.field2119[var17] + -class91.field2127[var17] && class91.field2131[var17] - class91.field2113[var17] < var4) {
                        var4 = class91.field2131[var17] - class91.field2113[var17];
                        var7 = true;
                    }
                }
            }
            class127.field2937 = class91.field2119[var2];
            class68.field1725 = class91.field2131[var2] = var4;
            class150 var8 = class91.field2124[var2];
            if (class111.field2573 == 0) {
                int var9 = 16776960;
                if (class91.field2137[var2] < 6) {
                    var9 = class108.field2497[class91.field2137[var2]];
                }
                if (class91.field2137[var2] == 6) {
                    var9 = class54.field1415 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class91.field2137[var2] == 7) {
                    var9 = class54.field1415 % 20 >= 10 ? 65535 : 255;
                }
                if (class91.field2137[var2] == 8) {
                    var9 = class54.field1415 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class91.field2137[var2] == 9) {
                    int var10 = 150 - class91.field2120[var2];
                    if (var10 < 50) {
                        var9 = var10 * 1280 + 16711680;
                    } else if (var10 < 100) {
                        var9 = 16776960 + 16384000 - var10 * 327680;
                    } else if (var10 < 150) {
                        var9 = var10 * 5 + 65280 - 500;
                    }
                }
                if (class91.field2137[var2] == 10) {
                    int var11 = 150 - class91.field2120[var2];
                    if (var11 < 50) {
                        var9 = var11 * 5 + 16711680;
                    } else if (var11 < 100) {
                        var9 = 33095935 - var11 * 327680;
                    } else if (var11 < 150) {
                        var9 = var11 * 327680 - (var11 - 100) * 5 - 32767745;
                    }
                }
                if (class91.field2137[var2] == 11) {
                    int var12 = 150 - class91.field2120[var2];
                    if (var12 < 50) {
                        var9 = 16777215 - var12 * 327685;
                    } else if (var12 < 100) {
                        var9 = var12 * 327685 + 65280 - 16384250;
                    } else if (var12 < 150) {
                        var9 = 16777215 + 32768000 - var12 * 327680;
                    }
                }
                if (class91.field2117[var2] == 0) {
                    class134.field3150.method1052(var8, class127.field2937, class68.field1725 + 1, 0);
                    class134.field3150.method1052(var8, class127.field2937, class68.field1725, var9);
                }
                if (class91.field2117[var2] == 1) {
                    class134.field3150.method1049(var8, class127.field2937, class68.field1725 + 1, 0, class54.field1415);
                    class134.field3150.method1049(var8, class127.field2937, class68.field1725, var9, class54.field1415);
                }
                if (class91.field2117[var2] == 2) {
                    class134.field3150.method1037(var8, class127.field2937, class68.field1725 + 1, 0, class54.field1415);
                    class134.field3150.method1037(var8, class127.field2937, class68.field1725, var9, class54.field1415);
                }
                if (class91.field2117[var2] == 3) {
                    class134.field3150.method1042(var8, class127.field2937, class68.field1725 + 1, 0, class54.field1415, 150 - class91.field2120[var2]);
                    class134.field3150.method1042(var8, class127.field2937, class68.field1725, var9, class54.field1415, 150 - class91.field2120[var2]);
                }
                if (class91.field2117[var2] == 4) {
                    int var13 = class134.field3150.method1038(var8);
                    int var14 = (var13 + 100) * (-class91.field2120[var2] + 150) / 150;
                    class120.method874(class127.field2937 - 50, 0, class127.field2937 + 50, 334);
                    class134.field3150.method1053(var8, class127.field2937 + 50 - var14, class68.field1725 - -1, 0);
                    class134.field3150.method1053(var8, class127.field2937 + 50 - var14, class68.field1725, var9);
                    class120.method871();
                }
                if (class91.field2117[var2] == 5) {
                    int var15 = 0;
                    int var16 = 150 - class91.field2120[var2];
                    class120.method874(0, class68.field1725 - class134.field3150.field3268 - 1, 512, class68.field1725 + 5);
                    if (var16 < 25) {
                        var15 = var16 - 25;
                    } else if (var16 > 125) {
                        var15 = var16 - 125;
                    }
                    class134.field3150.method1052(var8, class127.field2937, class68.field1725 + var15 + 1, 0);
                    class134.field3150.method1052(var8, class127.field2937, class68.field1725 + var15, var9);
                    class120.method871();
                }
            } else {
                class134.field3150.method1052(var8, class127.field2937, class68.field1725 + 1, 0);
                class134.field3150.method1052(var8, class127.field2937, class68.field1725, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLwb;)V")
    public final void method1169(byte arg0, class148 arg1) {
        arg1.method1126(31159, this.field3648 ? 1 : 0);
        field3657++;
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field3646[class103.field2345[var3]];
            if (var5 == 0) {
                arg1.method1126(31159, -1);
            } else {
                arg1.method1126(arg0 + 31133, var5 + -256);
            }
        }
        if (arg0 != 26) {
            field3639 = null;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg1.method1126(arg0 + 31133, this.field3640[var4]);
        }
    }
}
