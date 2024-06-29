import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class58 extends class143 {

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "Z")
    public boolean field905 = true;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "Z")
    public boolean field932 = false;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    private int field936 = 0;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "Lad;")
    public class269 field914;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "Lgj;")
    public class249 field910;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "Lkd;")
    public class215 field903;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "J")
    private long field921;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "Lba;")
    public class172 field901;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "Z")
    public static boolean field904 = false;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "Lud;")
    public static class2 field922 = new class2();

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    private int field906;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    private int field907;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    private int field908;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    private int field911;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    private int field912;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    private int field915;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    private int field916;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    private int field917;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    private int field918;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    private int field923;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    private int field924;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    private int field925;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    private int field927;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    private int field930;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    public int field931;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    private int field933;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    private int field935;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "Ljava/lang/String;")
    public static String field937;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
    public static void method477(boolean arg0) {
        if (arg0) {
            field937 = null;
        }
        field922 = null;
        field937 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lha;Ljava/lang/String;I)I")
    public static final int method478(class31 arg0, String arg1, int arg2) {
        field919++;
        int var3 = arg0.field541;
        byte[] var4 = class120.method909((byte) -114, arg1);
        arg0.method287(var4.length, -66);
        arg0.field541 += class296.field4756.method449(var4.length, arg0.field560, false, 0, var4, arg0.field541);
        if (arg2 != 29963) {
            field937 = null;
        }
        return arg0.field541 - var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZILjava/lang/String;I[BI)I")
    public static final int method479(boolean arg0, int arg1, String arg2, int arg3, byte[] arg4, int arg5) {
        int var6 = arg5 - arg3;
        field920++;
        if (arg0) {
            field922 = null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg2.charAt(arg3 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg4[arg1 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg4[arg1 + var7] = -128;
            } else if (var8 == '‚') {
                arg4[arg1 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg4[arg1 + var7] = -125;
            } else if (var8 == '„') {
                arg4[arg1 + var7] = -124;
            } else if (var8 == '…') {
                arg4[arg1 + var7] = -123;
            } else if (var8 == '†') {
                arg4[arg1 + var7] = -122;
            } else if (var8 == '‡') {
                arg4[arg1 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg4[arg1 + var7] = -120;
            } else if (var8 == '‰') {
                arg4[arg1 + var7] = -119;
            } else if (var8 == 'Š') {
                arg4[arg1 + var7] = -118;
            } else if (var8 == '‹') {
                arg4[arg1 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg4[arg1 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg4[arg1 + var7] = -114;
            } else if (var8 == '‘') {
                arg4[arg1 + var7] = -111;
            } else if (var8 == '’') {
                arg4[arg1 + var7] = -110;
            } else if (var8 == '“') {
                arg4[arg1 + var7] = -109;
            } else if (var8 == '”') {
                arg4[arg1 + var7] = -108;
            } else if (var8 == '•') {
                arg4[arg1 + var7] = -107;
            } else if (var8 == '–') {
                arg4[arg1 + var7] = -106;
            } else if (var8 == '—') {
                arg4[arg1 + var7] = -105;
            } else if (var8 == '˜') {
                arg4[arg1 + var7] = -104;
            } else if (var8 == '™') {
                arg4[arg1 + var7] = -103;
            } else if (var8 == 'š') {
                arg4[arg1 + var7] = -102;
            } else if (var8 == '›') {
                arg4[arg1 + var7] = -101;
            } else if (var8 == 'œ') {
                arg4[arg1 + var7] = -100;
            } else if (var8 == 'ž') {
                arg4[arg1 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg4[arg1 + var7] = -97;
            } else {
                arg4[arg1 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)I")
    public static final int method480(boolean arg0, int arg1) {
        if (arg0) {
            return 72;
        }
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        field913++;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZJBI)V")
    public final void method481(int arg0, int arg1, boolean arg2, long arg3, byte arg4, int arg5) {
        if (this.field932) {
            arg2 = false;
        } else if (class249.field3983 < this.field901.field2611) {
            arg2 = false;
        } else if (class249.field3974 > class246.field3917[class249.field3983]) {
            arg2 = false;
        } else if (this.field912 == this.field911 && this.field933 == this.field912 && this.field918 == this.field915 && this.field927 == this.field915 && this.field930 == this.field906 && this.field930 == this.field917) {
            arg2 = false;
        } else if (this.field901.field2615 != -1) {
            int var8 = (int) (arg3 - this.field921);
            if (this.field901.field2613 || this.field901.field2615 >= var8) {
                var8 %= this.field901.field2615;
            } else {
                arg2 = false;
            }
            if (!this.field901.field2616 && var8 < this.field901.field2655) {
                arg2 = false;
            }
            if (this.field901.field2616 && var8 >= this.field901.field2655) {
                arg2 = false;
            }
        }
        field926++;
        if (arg2) {
            this.field936 += (int) ((double) arg1 * ((double) (this.field901.field2602 - this.field901.field2648) * Math.random() + (double) this.field901.field2648));
            if (this.field936 > 63) {
                int var9 = this.field936 >> 6;
                this.field936 &= 0x3F;
                if (this.field905) {
                    int var10 = this.field912 - this.field911;
                    int var11 = this.field930 - this.field906;
                    int var12 = this.field915 - this.field918;
                    int var13 = this.field933 - this.field911;
                    int var14 = this.field927 - this.field918;
                    this.field925 = var10 * var14 - (var12 * var13);
                    int var15 = this.field917 - this.field906;
                    this.field924 = var12 * var15 - (var11 * var14);
                    this.field935 = var11 * var13 - (var10 * var15);
                    while (true) {
                        if (this.field924 <= 32767 && this.field935 <= 32767 && this.field925 <= 32767 && this.field924 >= -32767 && this.field935 >= -32767 && this.field925 >= -32767) {
                            int var16 = (int) Math.sqrt((double) (this.field925 * this.field925 + this.field935 * this.field935 + this.field924 * this.field924));
                            if (var16 <= 0) {
                                var16 = 1;
                            }
                            this.field924 = this.field924 * 32767 / var16;
                            this.field935 = this.field935 * 32767 / var16;
                            this.field925 = this.field925 * 32767 / var16;
                            if (this.field901.field2610 > 0 || this.field901.field2624 > 0) {
                                int var18 = (int) (Math.atan2((double) this.field925, (double) this.field924) * 2047.0D / 6.283185307179586D);
                                int var19 = (int) (Math.atan2((double) this.field935, Math.sqrt((double) (this.field925 * this.field925 + this.field924 * this.field924))) * 2047.0D / 6.283185307179586D);
                                this.field923 = this.field901.field2624 - this.field901.field2626;
                                this.field907 = this.field901.field2626 + var19 - (this.field923 / 2);
                                int var20 = var18 - this.field910.field3987;
                                this.field908 = this.field901.field2610 - this.field901.field2621;
                                this.field916 = var20 + this.field901.field2621 - (this.field908 / 2);
                            } else if (this.field910.field3987 != 0) {
                                int var17 = this.field925 * arg5 + this.field924 * arg0 >> 16;
                                this.field925 = this.field925 * arg0 - (this.field924 * arg5) >> 16;
                                this.field924 = var17;
                            }
                            this.field905 = false;
                            break;
                        }
                        this.field924 >>= 0x1;
                        this.field925 >>= 0x1;
                        this.field935 >>= 0x1;
                    }
                }
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22;
                    int var23;
                    int var24;
                    if (this.field901.field2610 <= 0 && this.field901.field2624 <= 0) {
                        var22 = this.field925;
                        var23 = this.field935;
                        var24 = this.field924;
                    } else {
                        int var25 = this.field916 + (int) ((double) this.field908 * Math.random());
                        int var26 = var25 & 0x7FF;
                        int var27 = class224.field3597[var26] >> 1;
                        int var28 = (int) ((double) this.field923 * Math.random()) + this.field907;
                        int var29 = class224.field3601[var26] >> 1;
                        int var30 = var28 & 0x3FF;
                        int var31 = class224.field3601[var30] >> 1;
                        var24 = var27 * var31 >> 15;
                        var22 = var29 * var31 >> 15;
                        int var32 = class224.field3597[var30] >> 1;
                        var23 = var32 * -1;
                    }
                    int var33 = (int) (Math.random() * 255.0D);
                    int var34 = (int) (Math.random() * 255.0D);
                    int var35 = (255 - var33) * var34 >> 8;
                    int var36 = 255 - var33 - var35;
                    int var37 = this.field933 * var36 + this.field912 * var35 + this.field911 * var33 >> 8;
                    int var38 = this.field927 * var36 + (this.field918 * var33 + (this.field915 * var35)) >> 8;
                    int var39 = this.field930 * var35 + this.field906 * var33 + (this.field917 * var36) >> 8;
                    if (this.field910.field3987 != 0) {
                        int var40 = arg0 * var37 + arg5 * var39 >> 16;
                        var39 = arg0 * var39 - (arg5 * var37) >> 16;
                        var37 = var40;
                    }
                    int var41 = (int) (Math.random() * (double) (this.field901.field2637 - this.field901.field2631)) + this.field901.field2631;
                    int var42;
                    if (this.field901.field2596) {
                        double var43 = Math.random();
                        var42 = (int) ((double) this.field901.field2605 * var43 + (double) this.field901.field2620) << 24 | (int) ((double) this.field901.field2590 * var43 + (double) this.field901.field2625) | (int) ((double) this.field901.field2649 * var43 + (double) this.field901.field2644) << 16 | (int) ((double) this.field901.field2640 * var43 + (double) this.field901.field2598) << 8;
                    } else {
                        var42 = (int) (Math.random() * (double) this.field901.field2640 + (double) this.field901.field2598) << 8 | (int) (Math.random() * (double) this.field901.field2649 + (double) this.field901.field2644) << 16 | (int) (Math.random() * (double) this.field901.field2590 + (double) this.field901.field2625) | (int) ((double) this.field901.field2620 + Math.random() * (double) this.field901.field2605) << 24;
                    }
                    int var45 = (int) (Math.random() * (double) (this.field901.field2618 - this.field901.field2599)) + this.field901.field2599;
                    if (class249.field3975 == class249.field3973) {
                        new class243(this, this.field910.field3993 + var37, this.field910.field3996 + var38, this.field910.field3988 + var39, var24, var23, var22, var41, var45, var42);
                    } else {
                        class243 var46 = class249.field3966[class249.field3973];
                        class249.field3973 = class249.field3973 + 1 & 0x3FF;
                        var46.method1653(this, this.field910.field3993 + var37, this.field910.field3996 + var38, this.field910.field3988 + var39, var24, var23, var22, var41, var45, var42);
                    }
                }
            }
        }
        if (arg4 >= -82) {
            return;
        }
        this.field929 = 0;
        for (class243 var48 = (class243) this.field903.method1483((byte) 119); var48 != null; var48 = (class243) this.field903.method1485(940)) {
            var48.method1654(arg3, arg1);
            this.field929++;
        }
        class249.field3972 += this.field929;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field912 = arg5;
        this.field930 = arg0;
        field928++;
        this.field911 = arg9;
        this.field917 = arg3;
        this.field927 = arg7;
        this.field933 = arg1;
        this.field918 = arg4;
        this.field906 = arg8;
        int var11 = (this.field933 + this.field911 + this.field912) / arg6 + this.field910.field3993;
        this.field915 = arg2;
        int var12 = (this.field918 + this.field927 + this.field915) / 3 + this.field910.field3996;
        int var13 = (this.field906 + this.field917 + this.field930) / 3 + this.field910.field3988;
        if (this.field902 != var11 || this.field909 != var12 || this.field931 != var13) {
            this.field909 = var12;
            this.field931 = var13;
            this.field902 = var11;
            this.field905 = true;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)Z")
    public static final boolean method483(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class305.field4907; var3++) {
            class207 var4 = class254.field4065[var3];
            if (var4.field3197 == 1) {
                int var5 = var4.field3200 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3198 * var5 >> 8) + var4.field3194;
                    int var7 = (var4.field3191 * var5 >> 8) + var4.field3188;
                    int var8 = (var4.field3192 * var5 >> 8) + var4.field3204;
                    int var9 = (var4.field3190 * var5 >> 8) + var4.field3184;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3197 == 2) {
                int var10 = arg0 - var4.field3200;
                if (var10 > 0) {
                    int var11 = (var4.field3198 * var10 >> 8) + var4.field3194;
                    int var12 = (var4.field3191 * var10 >> 8) + var4.field3188;
                    int var13 = (var4.field3192 * var10 >> 8) + var4.field3204;
                    int var14 = (var4.field3190 * var10 >> 8) + var4.field3184;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3197 == 3) {
                int var15 = var4.field3194 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3201 * var15 >> 8) + var4.field3200;
                    int var17 = (var4.field3196 * var15 >> 8) + var4.field3195;
                    int var18 = (var4.field3192 * var15 >> 8) + var4.field3204;
                    int var19 = (var4.field3190 * var15 >> 8) + var4.field3184;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3197 == 4) {
                int var20 = arg2 - var4.field3194;
                if (var20 > 0) {
                    int var21 = (var4.field3201 * var20 >> 8) + var4.field3200;
                    int var22 = (var4.field3196 * var20 >> 8) + var4.field3195;
                    int var23 = (var4.field3192 * var20 >> 8) + var4.field3204;
                    int var24 = (var4.field3190 * var20 >> 8) + var4.field3184;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3197 == 5) {
                int var25 = arg1 - var4.field3204;
                if (var25 > 0) {
                    int var26 = (var4.field3201 * var25 >> 8) + var4.field3200;
                    int var27 = (var4.field3196 * var25 >> 8) + var4.field3195;
                    int var28 = (var4.field3198 * var25 >> 8) + var4.field3194;
                    int var29 = (var4.field3191 * var25 >> 8) + var4.field3188;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
    public static final void method484(int arg0) {
        field934++;
        if (class106.field1666 != null || arg0 <= 69 || class113.field1747 != null) {
            return;
        }
        int var1 = class68.field1075;
        if (!class207.field3185) {
            if (var1 == 1 && class14.field174 > 0) {
                short var2 = class86.field1282[class14.field174 - 1];
                if (var2 == 39 || var2 == 26 || var2 == 47 || var2 == 48 || var2 == 6 || var2 == 20 || var2 == 37 || var2 == 15 || var2 == 22 || var2 == 3 || var2 == 58 || var2 == 1001) {
                    int var3 = class49.field803[class14.field174 - 1];
                    int var4 = class240.field3812[class14.field174 - 1];
                    class222 var5 = class169.method1217(var4, 12180);
                    class28 var6 = client.method1159(var5);
                    if (var6.method227((byte) 89) || var6.method237(-107)) {
                        class297.field4781 = 0;
                        class117.field1783 = false;
                        if (class106.field1666 != null) {
                            class80.method628((byte) -65, class106.field1666);
                        }
                        class106.field1666 = class169.method1217(var4, 12180);
                        class163.field2451 = class240.field3829;
                        class127.field1909 = class73.field1126;
                        class183.field2881 = var3;
                        class80.method628((byte) -95, class106.field1666);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class291.field4524 == 1 && class14.field174 > 2 || class27.method221((byte) 123, class14.field174 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class14.field174 > 0 || class8.field127 == 1) {
                class160.method1161((byte) 121);
            }
            if (var1 == 1 && class14.field174 > 0 || class8.field127 == 2) {
                class126.method946((byte) 64);
                return;
            }
            return;
        }
        if (var1 != 1) {
            int var7 = class171.field2587;
            int var8 = class157.field2340;
            if ((class237.field3737 - 10) > var7 || (class237.field3737 + class272.field4345 + 10) < var7 || var8 < class259.field4109 - 10 || class259.field4109 + class209.field3233 + 10 < var8) {
                class207.field3185 = false;
                class18.method137(class259.field4109, -126, class209.field3233, class272.field4345, class237.field3737);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var9 = class237.field3737;
        int var10 = class272.field4345;
        int var11 = class259.field4109;
        int var12 = class73.field1126;
        int var13 = class240.field3829;
        int var14 = -1;
        for (int var15 = 0; var15 < class14.field174; var15++) {
            if (class284.field4471) {
                int var17 = (class14.field174 - var15 - 1) * 15 + var11 + 33;
                if (var9 < var12 && var12 < (var9 + var10) && var17 - 13 < var13 && var13 < (var17 + 3)) {
                    var14 = var15;
                }
            } else {
                int var16 = (class14.field174 - var15 - 1) * 15 + var11 + 31;
                if (var9 < var12 && var9 + var10 > var12 && var13 > (var16 - 13) && var13 < (var16 + 3)) {
                    var14 = var15;
                }
            }
        }
        if (var14 != -1) {
            class48.method406(120, var14);
        }
        class207.field3185 = false;
        class18.method137(class259.field4109, -125, class209.field3233, class272.field4345, class237.field3737);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lad;Lgj;J)V")
    public class58(class269 arg0, class249 arg1, long arg2) {
        this.field914 = arg0;
        this.field910 = arg1;
        this.field903 = new class215();
        this.field921 = arg2;
        this.field936 = (int) ((double) this.field936 + Math.random() * 64.0D);
        this.field901 = this.field914.field4269;
    }
}
