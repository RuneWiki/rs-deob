import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class176 extends class247 {

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "[Lla;")
    public class131[] field2776;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "[B")
    public byte[] field2765;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "[B")
    public byte[] field2766;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "[Lig;")
    public class167[] field2771;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "[I")
    private int[] field2777;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "[B")
    public byte[] field2778;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "[S")
    public short[] field2774;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public int field2769;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "Ljf;")
    public static class216 field2767 = new class216(16);

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field2775 = 0;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILkl;[I[B)Z")
    public final boolean method1251(int arg0, class124 arg1, int[] arg2, byte[] arg3) {
        boolean var5 = true;
        if (arg0 != 12672) {
            return true;
        }
        field2768++;
        int var6 = 0;
        class131 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field2777[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method804(arg2, 30986, var9 >> 2);
                        } else {
                            var7 = arg1.method807(arg2, var9 >> 2, -19762);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2776[var8] = var7;
                        this.field2777[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
    public static final void method1252(boolean arg0) {
        field2782++;
        int var1 = class45.field548;
        int var2 = class206.field3229;
        int var3 = class89.field1332;
        int var4 = class249.field4040 - 3;
        byte var5 = 20;
        if (class196.field3103 == null || class5.field69 == null) {
            if (class295.field4726.method509(27635, class3.field51) && class295.field4726.method509(27635, class161.field2411)) {
                class196.field3103 = class62.method394(class295.field4726, 101, class3.field51, 0);
                class5.field69 = class62.method394(class295.field4726, 95, class161.field2411, 0);
            } else {
                class151.method1033(var1, var2, var3, var5, class293.field4707, 256 - class294.field4713);
            }
        }
        if (class196.field3103 != null && class5.field69 != null) {
            int var6 = (var3 - (class5.field69.field3353 * 2)) / class196.field3103.field3353;
            for (int var7 = 0; var7 < var6; var7++) {
                class196.field3103.method285(class196.field3103.field3353 * var7 + var1 + class5.field69.field3353, var2);
            }
            class5.field69.method285(var1, var2);
            class5.field69.method288(var1 + var3 - class5.field69.field3353, var2);
        }
        class306.field4885.method1486(class177.field2783, var1 + 3, var2 - -14, class273.field4446, -1);
        class151.method1033(var1, var2 + var5, var3, var4 - var5, class293.field4707, 256 - class294.field4713);
        int var8 = class71.field1042;
        int var9 = class50.field633;
        for (int var10 = 0; var10 < class173.field2721; var10++) {
            int var18 = (class173.field2721 - var10 - 1) * 15 + var2 + var5 + 13;
            if (var1 < var9 && (var1 + var3) > var9 && (var18 - 13) < var8 && var18 + 3 > var8) {
                class151.method1033(var1, var18 - 12, var3, 15, class275.field4467, 256 - class153.field2288);
            }
        }
        if ((class28.field338 == null || class163.field2537 == null || class262.field4250 == null) && class295.field4726.method509(27635, class1.field8) && class295.field4726.method509(27635, class184.field2900) && class295.field4726.method509(27635, class192.field3053)) {
            class28.field338 = class62.method394(class295.field4726, -118, class1.field8, 0);
            class163.field2537 = class62.method394(class295.field4726, -65, class184.field2900, 0);
            class262.field4250 = class62.method394(class295.field4726, -121, class192.field3053, 0);
        }
        if (class28.field338 != null && class163.field2537 != null && class262.field4250 != null) {
            int var11 = (var3 - (class262.field4250.field3353 * 2)) / class28.field338.field3353;
            for (int var12 = 0; var12 < var11; var12++) {
                class28.field338.method285(var1 + class262.field4250.field3353 + (class28.field338.field3353 * var12), var2 + var4 - class28.field338.field3351);
            }
            int var13 = (var4 - var5 - class262.field4250.field3351) / class163.field2537.field3351;
            for (int var14 = 0; var14 < var13; var14++) {
                class163.field2537.method285(var1, class163.field2537.field3351 * var14 + var2 + var5);
                class163.field2537.method288(var1 + var3 - class163.field2537.field3353, class163.field2537.field3351 * var14 + var2 + var5);
            }
            class262.field4250.method285(var1, var2 + var4 - class262.field4250.field3351);
            class262.field4250.method288(var1 + var3 - class262.field4250.field3353, var2 + var4 + -class262.field4250.field3351);
        }
        int var15 = 0;
        if (arg0) {
            field2767 = null;
        }
        while (var15 < class173.field2721) {
            int var16 = var2 + var5 + ((class173.field2721 + -1 - var15) * 15) + 13;
            int var17 = class273.field4446;
            if (var9 > var1 && var1 + var3 > var9 && var8 > var16 - 13 && var16 + 3 > var8) {
                var17 = class271.field4410;
            }
            class306.field4885.method1486(class211.method1463(-85, var15), var1 + 3, var16, var17, 0);
            var15++;
        }
        class287.method1961(class45.field548, -128, class249.field4040, class206.field3229, class89.field1332);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
    public static final void method1253(int arg0) {
        field2773++;
        int var1 = class13.field187 * 128 + 64;
        int var2 = class248.field4033 * 128 + 64;
        int var3 = class52.method351(arg0 + 10, var2, var1, class148.field2204) - class234.field3780;
        if (class69.field1029 >= 100) {
            class255.field4159 = class248.field4033 * 128 + 64;
            class99.field1474 = class13.field187 * 128 + 64;
            class21.field279 = class52.method351(-104, class255.field4159, class99.field1474, class148.field2204) - class234.field3780;
        } else {
            if (var3 > class21.field279) {
                class21.field279 += (var3 - class21.field279) * class69.field1029 / 1000 + class174.field2727;
                if (var3 < class21.field279) {
                    class21.field279 = var3;
                }
            }
            if (class21.field279 > var3) {
                class21.field279 -= class174.field2727 + ((class21.field279 - var3) * class69.field1029 / 1000);
                if (var3 > class21.field279) {
                    class21.field279 = var3;
                }
            }
            if (var2 > class255.field4159) {
                class255.field4159 += class174.field2727 + ((var2 - class255.field4159) * class69.field1029 / 1000);
                if (var2 < class255.field4159) {
                    class255.field4159 = var2;
                }
            }
            if (var2 < class255.field4159) {
                class255.field4159 -= (class255.field4159 - var2) * class69.field1029 / 1000 + class174.field2727;
                if (class255.field4159 < var2) {
                    class255.field4159 = var2;
                }
            }
            if (class99.field1474 < var1) {
                class99.field1474 += class174.field2727 + ((var1 - class99.field1474) * class69.field1029 / 1000);
                if (var1 < class99.field1474) {
                    class99.field1474 = var1;
                }
            }
            if (class99.field1474 > var1) {
                class99.field1474 -= class174.field2727 + ((class99.field1474 - var1) * class69.field1029 / 1000);
                if (class99.field1474 < var1) {
                    class99.field1474 = var1;
                }
            }
        }
        int var4 = class82.field1250 * 128 + 64;
        int var5 = class50.field639 * 128 + 64;
        int var6 = class52.method351(arg0 ^ 0x22, var5, var4, class148.field2204) - class284.field4608;
        int var7 = var5 - class255.field4159;
        int var8 = var4 - class99.field1474;
        int var9 = var6 - class21.field279;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        if (arg0 != -123) {
            field2779 = 22;
        }
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (Math.atan2((double) var8, (double) var7) * -325.949D) & 0x7FF;
        if (var11 > 383) {
            var11 = 383;
        }
        if (var11 > class147.field2189) {
            class147.field2189 += (var11 - class147.field2189) * class49.field628 / 1000 + class211.field3292;
            if (var11 < class147.field2189) {
                class147.field2189 = var11;
            }
        }
        int var13 = var12 - class56.field817;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (class147.field2189 > var11) {
            class147.field2189 -= (class147.field2189 - var11) * class49.field628 / 1000 + class211.field3292;
            if (var11 > class147.field2189) {
                class147.field2189 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class56.field817 += class49.field628 * var13 / 1000 + class211.field3292;
            class56.field817 &= 0x7FF;
        }
        if (var13 < 0) {
            class56.field817 -= class211.field3292 + (-var13 * class49.field628 / 1000);
            class56.field817 &= 0x7FF;
        }
        int var14 = var12 - class56.field817;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class56.field817 = var12;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)Lde;")
    public static final class58 method1254(int arg0, int arg1, int arg2) {
        class113 var3 = class184.field2892[arg0][arg1][arg2];
        return var3 == null || var3.field1650 == null ? null : var3.field1650;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1255(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg3;
        field2772++;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg3 - arg4;
        int var12 = arg1 - arg4;
        int var13 = arg1 * arg1;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var15 << 1;
        int var20 = var16 << 1;
        int var21 = arg3 << 1;
        int var22 = (1 - var21) * var13 + var17;
        int var23 = var14 - ((var21 - 1) * var18);
        int var24 = var11 << 1;
        int var25 = (1 - var24) * var16 + var19;
        int var26 = var15 - ((var24 - 1) * var20);
        int var27 = var14 << 2;
        int var28 = var16 << 2;
        int var29 = var13 << 2;
        int var30 = var15 << 2;
        int var31 = (var21 - 3) * var18;
        if (arg0 != -10325) {
            return;
        }
        int var32 = var19 * 3;
        int var33 = var17 * 3;
        int var34 = (var24 - 3) * var20;
        int var35 = var30;
        int var36 = var27;
        if (arg2 >= class115.field1678 && arg2 <= class60.field882) {
            int[] var37 = class78.field1180[arg2];
            int var38 = class196.method1369(class187.field2938, arg7 - arg1, true, class56.field816);
            int var39 = class196.method1369(class187.field2938, arg7 + arg1, true, class56.field816);
            int var40 = class196.method1369(class187.field2938, arg7 - var12, true, class56.field816);
            int var41 = class196.method1369(class187.field2938, arg7 + var12, true, class56.field816);
            class16.method97(arg0 + 10318, var37, var40, arg6, var38);
            class16.method97(-7, var37, var41, arg5, var40);
            class16.method97(-7, var37, var39, arg6, var41);
        }
        int var42 = (var11 - 1) * var28;
        int var43 = (arg3 - 1) * var29;
        while (var8 > 0) {
            boolean var44 = var11 >= var8;
            var8--;
            if (var22 < 0) {
                while (var22 < 0) {
                    var23 += var36;
                    var9++;
                    var22 += var33;
                    var33 += var27;
                    var36 += var27;
                }
            }
            int var45 = arg2 + var8;
            int var46 = arg2 - var8;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var32;
                        var32 += var30;
                        var26 += var35;
                        var35 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var10++;
                    var25 += var32;
                    var32 += var30;
                    var26 += var35;
                    var35 += var30;
                }
                var26 += -var34;
                var25 += -var42;
                var34 -= var28;
                var42 -= var28;
            }
            if (var23 < 0) {
                var22 += var33;
                var23 += var36;
                var33 += var27;
                var36 += var27;
                var9++;
            }
            var23 += -var31;
            var31 -= var29;
            if (var45 >= class115.field1678 && var46 <= class60.field882) {
                int var47 = class196.method1369(class187.field2938, arg7 + var9, true, class56.field816);
                int var48 = class196.method1369(class187.field2938, arg7 - var9, true, class56.field816);
                if (var44) {
                    int var49 = class196.method1369(class187.field2938, arg7 + var10, true, class56.field816);
                    int var50 = class196.method1369(class187.field2938, arg7 - var10, true, class56.field816);
                    if (var46 >= class115.field1678) {
                        int[] var51 = class78.field1180[var46];
                        class16.method97(-7, var51, var50, arg6, var48);
                        class16.method97(arg0 ^ 0x2852, var51, var49, arg5, var50);
                        class16.method97(arg0 + 10318, var51, var47, arg6, var49);
                    }
                    if (class60.field882 >= var45) {
                        int[] var52 = class78.field1180[var45];
                        class16.method97(arg0 ^ 0x2852, var52, var50, arg6, var48);
                        class16.method97(-7, var52, var49, arg5, var50);
                        class16.method97(-7, var52, var47, arg6, var49);
                    }
                } else {
                    if (class115.field1678 <= var46) {
                        class16.method97(-7, class78.field1180[var46], var47, arg6, var48);
                    }
                    if (var45 <= class60.field882) {
                        class16.method97(-7, class78.field1180[var45], var47, arg6, var48);
                    }
                }
            }
            var22 += -var43;
            var43 -= var29;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method1256(byte arg0, String arg1) {
        long var2 = 0L;
        field2780++;
        if (arg0 != 127) {
            field2767 = null;
        }
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 'A');
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 - 21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
    public final void method1257(int arg0) {
        field2770++;
        if (arg0 <= 52) {
            this.method1251(-101, (class124) null, (int[]) null, (byte[]) null);
        }
        this.field2777 = null;
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V")
    public static void method1258(int arg0) {
        field2767 = null;
        if (arg0 > -72) {
            method1258(125);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIILvl;IZ)V")
    public static final void method1259(int arg0, int arg1, int arg2, int arg3, class73 arg4, int arg5, boolean arg6) {
        class105.field1535 = arg1;
        class92.field1369 = arg2;
        class93.field1400 = arg5;
        class138.field1992 = arg4;
        class68.field1023 = arg3;
        field2781++;
        class261.field4244 = arg6;
        class294.field4712 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)[Lff;")
    public static final class48[] method1260(int arg0) {
        field2764++;
        class48[] var1 = new class48[class139.field2000];
        for (int var2 = arg0; var2 < class139.field2000; var2++) {
            int var3 = class64.field924[var2] * class284.field4603[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class190.field2959[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class229.field3539[class205.method1411(255, var5[var6])];
            }
            var1[var2] = new class48(class15.field215, class86.field1308, class166.field2569[var2], class277.field4480[var2], class64.field924[var2], class284.field4603[var2], var4);
        }
        class115.method762((byte) -27);
        return var1;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
    public class176() {
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "([B)V")
    public class176(byte[] arg0) {
        this.field2776 = new class131[128];
        this.field2765 = new byte[128];
        this.field2766 = new byte[128];
        this.field2771 = new class167[128];
        this.field2777 = new int[128];
        this.field2778 = new byte[128];
        this.field2774 = new short[128];
        class170 var2 = new class170(arg0);
        int var3;
        for (var3 = 0; var2.field2650[var2.field2676 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1215(128);
        }
        var2.field2676++;
        var3++;
        int var6 = var2.field2676;
        var2.field2676 += var3;
        int var7;
        for (var7 = 0; var2.field2650[var2.field2676 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1215(128);
        }
        var7++;
        var2.field2676++;
        int var10 = var2.field2676;
        var2.field2676 += var7;
        int var11;
        for (var11 = 0; var2.field2650[var2.field2676 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1215(128);
        }
        var11++;
        byte[] var14 = new byte[var11];
        var2.field2676++;
        int var15;
        if (var11 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method1218(-41);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var18 <= var16) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class167[] var19 = new class167[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class167 var103 = var19[var20] = new class167();
            int var104 = var2.method1218(124);
            if (var104 > 0) {
                var103.field2570 = new byte[var104 * 2];
            }
            int var105 = var2.method1218(-77);
            if (var105 > 0) {
                var103.field2578 = new byte[var105 * 2 + 2];
                var103.field2578[1] = 64;
            }
        }
        int var21 = var2.method1218(-115);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = 0;
        int var24 = var2.method1218(94);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        while (var2.field2650[var2.field2676 + var23] != 0) {
            var23++;
        }
        byte[] var26 = new byte[var23];
        for (int var27 = 0; var27 < var23; var27++) {
            var26[var27] = var2.method1215(128);
        }
        int var28 = 0;
        var2.field2676++;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method1218(119);
            this.field2774[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method1218(-86);
            this.field2774[var31] = (short) (this.field2774[var31] + (var30 << 8));
        }
        int var32 = 0;
        var23++;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length <= var33) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var2.method1220(-26360);
            }
            var32--;
            this.field2774[var35] = (short) (this.field2774[var35] + (class205.method1411(2, var34 - 1) << 14));
            this.field2777[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field2777[var39] != 0) {
                if (var36 == 0) {
                    if (var4.length > var37) {
                        var36 = var4[var37++];
                    } else {
                        var36 = -1;
                    }
                    var38 = var2.field2650[var6++] - 1;
                }
                var36--;
                this.field2765[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field2777[var43] != 0) {
                if (var41 == 0) {
                    var42 = var2.field2650[var10++] + 16 << 2;
                    if (var8.length > var40) {
                        var41 = var8[var40++];
                    } else {
                        var41 = -1;
                    }
                }
                this.field2766[var43] = (byte) var42;
                var41--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class167 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field2777[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var12.length <= var44) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                this.field2771[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var26.length <= var48) {
                    var49 = -1;
                } else {
                    var49 = var26[var48++];
                }
                if (this.field2777[var51] > 0) {
                    var50 = var2.method1218(89) + 1;
                }
            }
            this.field2778[var51] = (byte) var50;
            var49--;
        }
        this.field2769 = var2.method1218(93) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class167 var100 = var19[var52];
            if (var100.field2570 != null) {
                for (int var101 = 1; var101 < var100.field2570.length; var101 += 2) {
                    var100.field2570[var101] = var2.method1215(128);
                }
            }
            if (var100.field2578 != null) {
                for (int var102 = 3; var102 < (var100.field2578.length - 2); var102 += 2) {
                    var100.field2578[var102] = var2.method1215(128);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method1215(128);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var2.method1215(128);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class167 var97 = var19[var55];
            if (var97.field2578 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2578.length; var99 += 2) {
                    var98 += var2.method1218(-119) + 1;
                    var97.field2578[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class167 var94 = var19[var56];
            if (var94.field2570 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field2570.length; var96 += 2) {
                    var95 = var2.method1218(116) + var95 + 1;
                    var94.field2570[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method1218(-124);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method1218(-68) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[1];
            byte var60 = var22[0];
            for (int var61 = 0; var61 < var60; var61++) {
                this.field2778[var61] = (byte) (this.field2778[var61] * var59 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                var62 += 2;
                int var67 = (var65 - var60) * var59 + ((var65 - var60) / 2);
                for (int var68 = var60; var68 < var65; var68++) {
                    int var69 = class180.method1277((byte) -126, var67, var65 - var60);
                    this.field2778[var68] = (byte) (this.field2778[var68] * var69 + 32 >> 6);
                    var67 += var66 - var59;
                }
                var59 = var66;
                var60 = var65;
            }
            Object var63 = null;
            for (int var64 = var60; var64 < 128; var64++) {
                this.field2778[var64] = (byte) (this.field2778[var64] * var59 + 32 >> 6);
            }
        }
        if (var25 != null) {
            int var70 = var2.method1218(66);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 -= -var2.method1218(-101) - 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field2766[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field2766[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var25.length) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                var75 += 2;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class180.method1277((byte) -126, var81, var79 - var72);
                    var81 += var80 - var73;
                    int var84 = (this.field2766[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field2766[var82] = (byte) var84;
                }
                var73 = var80;
                var72 = var79;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field2766[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field2766[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field2571 = var2.method1218(69);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class167 var93 = var19[var87];
            if (var93.field2570 != null) {
                var93.field2579 = var2.method1218(126);
            }
            if (var93.field2578 != null) {
                var93.field2580 = var2.method1218(73);
            }
            if (var93.field2571 > 0) {
                var93.field2577 = var2.method1218(-57);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field2582 = var2.method1218(-94);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class167 var92 = var19[var89];
            if (var92.field2582 > 0) {
                var92.field2573 = var2.method1218(118);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class167 var91 = var19[var90];
            if (var91.field2573 > 0) {
                var91.field2584 = var2.method1218(-117);
            }
        }
    }
}
