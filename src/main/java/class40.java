import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class40 {

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Lmb;")
    public class110 field780 = new class110();

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lwf;")
    public static class204 field778 = new class204(32);

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field787 = -1;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "[Ldb;")
    public static class32[] field795 = new class32[2048];

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public static int field798 = 0;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "Leh;")
    private static class47 field800 = class195.method1282((byte) -4, "Select a world");

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Leh;")
    public static class47 field786 = field800;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "Ljava/lang/Object;")
    public static Object field803 = new Object();

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "Leh;")
    private static class47 field805 = class195.method1282((byte) -4, "Username: ");

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "Leh;")
    public static class47 field806 = field805;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "Lmb;")
    private class110 field796;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "[I")
    public static int[] field794;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "[Ldh;")
    public static class38[] field791;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "[Ljg;")
    public static class88[] field807;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "[[[[Z")
    public static boolean[][][][] field804;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lmb;B)V")
    public final void method337(class110 arg0, byte arg1) {
        if (arg0.field2287 != null) {
            arg0.method885(arg1 + 25);
        }
        arg0.field2287 = this.field780.field2287;
        if (arg1 == -22) {
            field788++;
            arg0.field2280 = this.field780;
            arg0.field2287.field2280 = arg0;
            arg0.field2280.field2287 = arg0;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)Z")
    public static final boolean method338(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class115.field2349; var3++) {
            class142 var4 = class149.field2921[var3];
            if (var4.field2791 == 1) {
                int var5 = var4.field2783 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2799 * var5 >> 8) + var4.field2786;
                    int var7 = (var4.field2784 * var5 >> 8) + var4.field2797;
                    int var8 = (var4.field2804 * var5 >> 8) + var4.field2802;
                    int var9 = (var4.field2789 * var5 >> 8) + var4.field2803;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2791 == 2) {
                int var10 = arg0 - var4.field2783;
                if (var10 > 0) {
                    int var11 = (var4.field2799 * var10 >> 8) + var4.field2786;
                    int var12 = (var4.field2784 * var10 >> 8) + var4.field2797;
                    int var13 = (var4.field2804 * var10 >> 8) + var4.field2802;
                    int var14 = (var4.field2789 * var10 >> 8) + var4.field2803;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2791 == 3) {
                int var15 = var4.field2786 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2785 * var15 >> 8) + var4.field2783;
                    int var17 = (var4.field2796 * var15 >> 8) + var4.field2788;
                    int var18 = (var4.field2804 * var15 >> 8) + var4.field2802;
                    int var19 = (var4.field2789 * var15 >> 8) + var4.field2803;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2791 == 4) {
                int var20 = arg2 - var4.field2786;
                if (var20 > 0) {
                    int var21 = (var4.field2785 * var20 >> 8) + var4.field2783;
                    int var22 = (var4.field2796 * var20 >> 8) + var4.field2788;
                    int var23 = (var4.field2804 * var20 >> 8) + var4.field2802;
                    int var24 = (var4.field2789 * var20 >> 8) + var4.field2803;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2791 == 5) {
                int var25 = arg1 - var4.field2802;
                if (var25 > 0) {
                    int var26 = (var4.field2785 * var25 >> 8) + var4.field2783;
                    int var27 = (var4.field2796 * var25 >> 8) + var4.field2788;
                    int var28 = (var4.field2799 * var25 >> 8) + var4.field2786;
                    int var29 = (var4.field2784 * var25 >> 8) + var4.field2797;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
    public static void method339(boolean arg0) {
        field786 = null;
        field791 = null;
        field803 = null;
        field806 = null;
        field804 = null;
        field778 = null;
        field800 = null;
        field805 = null;
        field807 = null;
        field794 = null;
        field795 = null;
        if (arg0) {
            method338(122, -54, -41);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)Lmb;")
    public final class110 method340(boolean arg0) {
        field793++;
        class110 var2 = this.field796;
        if (this.field780 == var2) {
            this.field796 = null;
            return null;
        }
        this.field796 = var2.field2287;
        if (arg0) {
            field805 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static final void method341(byte arg0) {
        if (arg0 != -115) {
            field786 = null;
        }
        field782++;
        class189.field3660.method993(1);
        class116.field2357.method993(1);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)Lmb;")
    public final class110 method342(int arg0) {
        if (arg0 != 8292) {
            method341((byte) 83);
        }
        class110 var2 = this.field780.field2280;
        field777++;
        if (this.field780 == var2) {
            return null;
        } else {
            var2.method885(3);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILgf;II)V")
    public static final void method343(int arg0, int arg1, class61 arg2, int arg3, int arg4) {
        field785++;
        if (class20.field385 >= 3) {
            class169.method1155(arg0, arg4, 0, arg2.field1285, arg2.field1296);
        } else {
            class181.field3464.method447(arg0, arg4, arg2.field1187, arg2.field1303, class181.field3464.field982 / 2, class181.field3464.field977 / 2, class160.field3116, 256, arg2.field1285, arg2.field1296);
        }
        if (arg1 >= -51) {
            field800 = null;
        }
        class137.field2679[arg3] = true;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Lmb;")
    public final class110 method344(int arg0) {
        if (arg0 != -28880) {
            method339(true);
        }
        class110 var2 = this.field780.field2287;
        field799++;
        if (this.field780 == var2) {
            this.field796 = null;
            return null;
        } else {
            this.field796 = var2.field2287;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class40() {
        this.field780.field2287 = this.field780;
        this.field780.field2280 = this.field780;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Lmb;")
    public final class110 method345(int arg0) {
        class110 var2 = this.field780.field2280;
        field783++;
        if (this.field780 == var2) {
            this.field796 = null;
            return null;
        } else if (arg0 > -90) {
            return null;
        } else {
            this.field796 = var2.field2280;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILmb;)V")
    public final void method346(int arg0, class110 arg1) {
        if (arg0 != 8) {
            this.method340(false);
        }
        field789++;
        if (arg1.field2287 != null) {
            arg1.method885(3);
        }
        arg1.field2287 = this.field780;
        arg1.field2280 = this.field780.field2280;
        arg1.field2287.field2280 = arg1;
        arg1.field2280.field2287 = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(Z)V")
    public static final void method347(boolean arg0) {
        class162.method1107((byte) 27, false);
        field802++;
        class156.field3049 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class54.field1041.length; var2++) {
            if (class3.field32[var2] != -1 && class54.field1041[var2] == null) {
                class54.field1041[var2] = class87.field1862.method67(class3.field32[var2], -1, 0);
                if (class54.field1041[var2] == null) {
                    class156.field3049++;
                    var1 = false;
                }
            }
            if (class117.field2382[var2] != -1 && class43.field868[var2] == null) {
                class43.field868[var2] = class87.field1862.method79(class176.field3374[var2], 16, 0, class117.field2382[var2]);
                if (class43.field868[var2] == null) {
                    var1 = false;
                    class156.field3049++;
                }
            }
        }
        if (!var1) {
            class116.field2362 = 1;
            return;
        }
        class132.field2605 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class54.field1041.length; var4++) {
            byte[] var56 = class43.field868[var4];
            if (var56 != null) {
                int var57 = (class198.field3870[var4] & 0xFF) * 64 - class34.field649;
                int var58 = (class198.field3870[var4] >> 8) * 64 - class127.field2536;
                if (class34.field663) {
                    var58 = 10;
                    var57 = 10;
                }
                var3 &= class121.method934(11118, var58, var56, var57);
            }
        }
        if (!var3) {
            class116.field2362 = 2;
            return;
        }
        if (class116.field2362 != 0) {
            class148.method1046(true, !arg0, class5.method24(new class47[] { class196.field3808, class147.field2885 }, (byte) 67));
        }
        class126.method951((byte) -127);
        class99.method800(-126);
        class126.method951((byte) -127);
        class135.method982();
        class126.method951((byte) -128);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class54.field1043[var5].method322(116);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class182.field3490[var6][var54][var55] = 0;
                }
            }
        }
        class126.method951((byte) -126);
        class54.method474((byte) -124);
        int var7 = class54.field1041.length;
        class69.method617(false);
        class162.method1107((byte) 27, arg0);
        if (!class34.field663) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class198.field3870[var8] >> 8) * 64 - class127.field2536;
                int var18 = (class198.field3870[var8] & 0xFF) * 64 - class34.field649;
                byte[] var19 = class54.field1041[var8];
                if (var19 != null) {
                    class126.method951((byte) -127);
                    class148.method1043(class54.field1043, 75, var17, (class138.field2715 - 6) * 8, var18, (class23.field447 - 6) * 8, var19);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class198.field3870[var9] >> 8) * 64 - class127.field2536;
                int var15 = (class198.field3870[var9] & 0xFF) * 64 - class34.field649;
                byte[] var16 = class54.field1041[var9];
                if (var16 == null && class23.field447 < 800) {
                    class126.method951((byte) -128);
                    class152.method1064(64, false, 64, var14, var15);
                }
            }
            class162.method1107((byte) 27, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class43.field868[var10];
                if (var11 != null) {
                    int var12 = (class198.field3870[var10] & 0xFF) * 64 - class34.field649;
                    int var13 = (class198.field3870[var10] >> 8) * 64 - class127.field2536;
                    class126.method951((byte) -128);
                    class125.method949(var11, var13, class54.field1043, (byte) 43, var12);
                }
            }
        }
        if (class34.field663) {
            for (int var20 = 0; var20 < 4; var20++) {
                class126.method951((byte) -126);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        boolean var36 = false;
                        int var37 = class23.field463[var20][var34][var35];
                        if (var37 != -1) {
                            int var38 = var37 >> 1 & 0x3;
                            int var39 = var37 >> 14 & 0x3FF;
                            int var40 = var37 >> 3 & 0x7FF;
                            int var41 = (var39 / 8 << 8) + var40 / 8;
                            int var42 = var37 >> 24 & 0x3;
                            for (int var43 = 0; var43 < class198.field3870.length; var43++) {
                                if (class198.field3870[var43] == var41 && class54.field1041[var43] != null) {
                                    class161.method1104(class54.field1043, var38, var42, class54.field1041[var43], var34 * 8, (var40 & 0x7) * 8, (var39 & 0x7) * 8, var20, var35 * 8, 75);
                                    var36 = true;
                                    break;
                                }
                            }
                        }
                        if (!var36) {
                            class132.method973(var20, (byte) 31, var35 * 8, var34 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class23.field463[0][var21][var32];
                    if (var33 == -1) {
                        class152.method1064(8, !arg0, 8, var21 * 8, var32 * 8);
                    }
                }
            }
            class162.method1107((byte) 27, true);
            for (int var22 = 0; var22 < 4; var22++) {
                class126.method951((byte) -126);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class23.field463[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 1 & 0x3;
                            int var28 = var25 >> 14 & 0x3FF;
                            int var29 = var25 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; var31 < class198.field3870.length; var31++) {
                                if (class198.field3870[var31] == var30 && class43.field868[var31] != null) {
                                    class25.method234(120, class43.field868[var31], var27, class54.field1043, (var29 & 0x7) * 8, var26, (var28 & 0x7) * 8, var24 * 8, var23 * 8, var22);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class162.method1107((byte) 27, true);
        class99.method800(-128);
        class126.method951((byte) -126);
        class155.method1076(-73, class54.field1043);
        class162.method1107((byte) 27, true);
        int var44 = class195.field3803;
        if (var44 > class196.field3827) {
            var44 = class196.field3827;
        }
        if (class196.field3827 - 1 > var44) {
            int var45 = class196.field3827 - 1;
        }
        if (class204.field4029) {
            class170.method1158(class195.field3803);
        } else {
            class170.method1158(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class159.method1094(var53, var46, (byte) -97);
            }
        }
        class126.method951((byte) -128);
        class130.method964(0);
        class99.method800(-122);
        if (class34.field655 != null) {
            class167.field3243++;
            class60.field1174.method657(28182, 183);
            class60.field1174.method606(1057001181, -1424429928);
        }
        if (!class34.field663) {
            int var47 = (class23.field447 + 6) / 8;
            int var48 = (class138.field2715 + 6) / 8;
            int var49 = (class23.field447 - 6) / 8;
            int var50 = (class138.field2715 - 6) / 8;
            for (int var51 = var50 - 1; var51 <= var48 + 1; var51++) {
                for (int var52 = var49 - 1; var52 <= var47 + 1; var52++) {
                    if (var50 > var51 || var48 < var51 || var49 > var52 || var47 < var52) {
                        class87.field1862.method62((byte) -59, class5.method24(new class47[] { class92.field1931, class167.method1133(var51, (byte) -108), class119.field2408, class167.method1133(var52, (byte) 105) }, (byte) 103));
                        class87.field1862.method62((byte) -59, class5.method24(new class47[] { class36.field690, class167.method1133(var51, (byte) -100), class119.field2408, class167.method1133(var52, (byte) 68) }, (byte) 119));
                    }
                }
            }
        }
        class198.method1299(0, 30);
        class126.method951((byte) -126);
        class108.method869(4346);
        class60.field1174.method657(28182, 79);
        class108.method875((byte) 104);
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)Lmb;")
    public final class110 method348(int arg0) {
        if (arg0 != 13949) {
            return null;
        }
        field781++;
        class110 var2 = this.field796;
        if (this.field780 == var2) {
            this.field796 = null;
            return null;
        } else {
            this.field796 = var2.field2280;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lmb;ILmb;)V")
    public final void method349(class110 arg0, int arg1, class110 arg2) {
        if (arg2.field2287 != null) {
            arg2.method885(arg1 ^ 0x3);
        }
        field792++;
        arg2.field2280 = arg0;
        arg2.field2287 = arg0.field2287;
        arg2.field2287.field2280 = arg2;
        if (arg1 != 0) {
            field791 = null;
        }
        arg2.field2280.field2287 = arg2;
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
    public final void method350(int arg0) {
        field801++;
        if (arg0 < 56) {
            return;
        }
        while (true) {
            class110 var2 = this.field780.field2280;
            if (this.field780 == var2) {
                return;
            }
            var2.method885(3);
        }
    }
}
