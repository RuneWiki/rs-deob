import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class237 extends class101 {

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "Z")
    public static volatile boolean field3206 = true;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "Lvl;")
    public static class15 field3201 = new class15();

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "Lml;")
    public static class410 field3207 = new class410("", 19);

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public int field3196;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public int field3202;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "Laj;")
    public static class333 field3203;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lwc;III)V")
    public static final void method1530(class73 arg0, int arg1, int arg2, int arg3) {
        field3195++;
        if (arg3 != -1) {
            field3207 = null;
        }
        int[] var4 = new int[4];
        class278.method1802(var4, 0, var4.length, arg1);
        class535.method3055((byte) 33, arg0, var4, arg2);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static void method1531(byte arg0) {
        field3207 = null;
        if (arg0 < 124) {
            field3201 = null;
        }
        field3203 = null;
        field3201 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static final void method1532(int arg0) {
        class186.method1293(arg0, -1, 255);
        field3197++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z[Ljava/lang/Object;[J)V")
    public static final void method1533(boolean arg0, Object[] arg1, long[] arg2) {
        field3198++;
        if (!arg0) {
            class570.method3192(arg1, arg2.length - 1, 0, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIBI)V")
    public static final void method1534(boolean arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -2) {
            return;
        }
        if (class507.field7007.method3953((long) arg1, 14) == null) {
            if (class99.field1387) {
                class150 var4 = new class150(arg1, new class627(4096, class134.field1966, arg1), arg3, arg0);
                var4.field2082.method2731(class179.field2383[class38.field589], arg2);
                class507.field7007.method3962((long) arg1, var4, -121);
            } else {
                class672.method3739(82, arg1, arg0);
            }
        }
        field3200++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lwea;)V")
    public static final void method1535(class167 arg0) {
        class192.field2582.method551(arg0.field2257, arg0.field2246 + (arg0.method24(748449288) >> 1), arg0.field2259, class292.field4271);
        arg0.field2245 = class292.field4271[0];
        arg0.field2251 = class292.field4271[1];
        arg0.field2253 = class292.field4271[2];
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIB)V")
    public static final void method1536(int arg0, int arg1, int arg2, byte arg3) {
        field3204++;
        if (arg3 == -84) {
            class66.field931 = new byte[arg0][arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V")
    public static final void method1537(byte arg0) {
        field3199++;
        if (arg0 <= 109) {
            return;
        }
        for (int var1 = 0; var1 < class667.field9214; var1++) {
            int var2 = class584.field7798[var1];
            class192 var3 = ((class174) class234.field3169.method3953((long) var2, 14)).field2336;
            int var4 = class89.field1233.method2398(-1372747256);
            if ((var4 & 0x4) != 0) {
                var4 += class89.field1233.method2398(-1372747256) << 8;
            }
            if ((var4 & 0x1000) != 0) {
                var4 += class89.field1233.method2398(-1372747256) << 16;
            }
            if ((var4 & 0x40) != 0) {
                int[] var5 = new int[4];
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] = class89.field1233.method2358((byte) -30);
                    if (var5[var6] == 65535) {
                        var5[var6] = -1;
                    }
                }
                int var7 = class89.field1233.method2412(-77);
                class553.method3126(var3, var5, var7, false);
            }
            if ((var4 & 0x20) != 0) {
                if (var3.field2577.method1459(true)) {
                    class417.method2574(var3, (byte) 88);
                }
                var3.method1328(class364.field5309.method3338((byte) 123, class89.field1233.method2410(65280)), false);
                var3.method1020(-1, var3.field2577.field2960);
                var3.field1790 = var3.field2577.field2961 << 3;
                if (var3.field2577.method1459(true)) {
                    class647.method3618(var3.field1890[0], var3.field1884[0], var3, null, null, 0, -107, var3.field2250);
                }
            }
            if ((var4 & 0x8000) != 0) {
                var3.field1809 = class89.field1233.method2409(true);
                var3.field1853 = class89.field1233.method2387((byte) -107);
                var3.field1846 = class89.field1233.method2387((byte) -78);
                var3.field1861 = (byte) class89.field1233.method2398(-1372747256);
                var3.field1871 = class100.field1401 + class89.field1233.method2410(65280);
                var3.field1805 = class100.field1401 + class89.field1233.method2358((byte) -30);
            }
            if ((var4 & 0x40000) != 0) {
                int var8 = class89.field1233.method2359(-1);
                int var9 = class89.field1233.method2376((byte) 121);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var10 = class89.field1233.method2412(-105);
                int var11 = var10 & 0x7;
                int var12 = (var10 & 0x7A) >> 3;
                if (var12 == 15) {
                    var12 = -1;
                }
                var3.method1011(var9, 2, var8, var12, var11, 0);
            }
            if ((var4 & 0x80000) != 0) {
                var3.field2553 = class89.field1233.method2379((byte) 85);
                if ("".equals(var3.field2553) || var3.field2553.equals(var3.field2577.field2948)) {
                    var3.field2553 = var3.field2577.field2948;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field1787 = class89.field1233.method2358((byte) -30);
                if (var3.field1787 == 65535) {
                    var3.field1787 = -1;
                }
            }
            if ((var4 & 0x800) != 0) {
                int var13 = var3.field2577.field2944.length;
                int var14 = 0;
                if (var3.field2577.field2984 != null) {
                    var14 = var3.field2577.field2984.length;
                }
                int var15 = 0;
                if (var3.field2577.field2949 != null) {
                    var15 = var3.field2577.field2949.length;
                }
                int var16 = class89.field1233.method2398(-1372747256);
                if ((var16 & 0x1) == 1) {
                    var3.field2576 = null;
                } else {
                    int[] var17 = null;
                    if ((var16 & 0x2) == 2) {
                        var17 = new int[var13];
                        for (int var18 = 0; var18 < var13; var18++) {
                            var17[var18] = class89.field1233.method2405(-361);
                        }
                    }
                    short[] var19 = null;
                    if ((var16 & 0x4) == 4) {
                        var19 = new short[var14];
                        for (int var20 = 0; var20 < var14; var20++) {
                            var19[var20] = (short) class89.field1233.method2410(65280);
                        }
                    }
                    short[] var21 = null;
                    if ((var16 & 0x8) == 8) {
                        var21 = new short[var15];
                        for (int var22 = 0; var22 < var15; var22++) {
                            var21[var22] = (short) class89.field1233.method2410(65280);
                        }
                    }
                    long var23 = (long) (var3.field2584++) << 32 | (long) var2;
                    var3.field2576 = new class407(var23, var17, var19, var21);
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field2570 = class89.field1233.method2405(-361);
                var3.field2554 = class89.field1233.method2358((byte) -30);
            }
            if ((var4 & 0x100) != 0) {
                int var25 = class89.field1233.method2405(-361);
                int var26 = class89.field1233.method2384(127);
                if (var25 == 65535) {
                    var25 = -1;
                }
                int var27 = class89.field1233.method2412(-84);
                int var28 = var27 & 0x7;
                int var29 = (var27 & 0x7E) >> 3;
                if (var29 == 15) {
                    var29 = -1;
                }
                var3.method1011(var26, 1, var25, var29, var28, 0);
            }
            if ((var4 & 0x4000) != 0) {
                int var30 = class89.field1233.method2412(-48);
                int[] var31 = new int[var30];
                int[] var32 = new int[var30];
                for (int var33 = 0; var33 < var30; var33++) {
                    int var34 = class89.field1233.method2410(65280);
                    if ((var34 & 0xC000) == 49152) {
                        int var35 = class89.field1233.method2359(-1);
                        var31[var33] = class213.method1409(var34 << 16, var35);
                    } else {
                        var31[var33] = var34;
                    }
                    var32[var33] = class89.field1233.method2359(-1);
                }
                var3.method1007((byte) -2, var32, var31);
            }
            if ((var4 & 0x8) != 0) {
                int var36 = class89.field1233.method2359(-1);
                if (var36 == 65535) {
                    var36 = -1;
                }
                int var37 = class89.field1233.method2384(103);
                int var38 = class89.field1233.method2375((byte) 31);
                int var39 = var38 & 0x7;
                int var40 = var38 >> 3 & 0xF;
                if (var40 == 15) {
                    var40 = -1;
                }
                var3.method1011(var37, 0, var36, var40, var39, 0);
            }
            if ((var4 & 0x1) != 0) {
                int var41 = class89.field1233.method2381(-82);
                if (var41 > 0) {
                    for (int var42 = 0; var42 < var41; var42++) {
                        int var43 = -1;
                        int var44 = -1;
                        int var45 = class89.field1233.method2370(-2);
                        int var46 = -1;
                        if (var45 == 32767) {
                            var45 = class89.field1233.method2370(-2);
                            var44 = class89.field1233.method2370(-2);
                            var43 = class89.field1233.method2370(-2);
                            var46 = class89.field1233.method2370(-2);
                        } else if (var45 == 32766) {
                            var45 = -1;
                        } else {
                            var44 = class89.field1233.method2370(-2);
                        }
                        int var47 = class89.field1233.method2370(-2);
                        int var48 = class89.field1233.method2398(-1372747256);
                        var3.method1010(-127, var47, class100.field1401, var46, var45, var43, var44, var48);
                    }
                }
            }
            if ((var4 & 0x2000) != 0) {
                var3.field1814 = class89.field1233.method2356(-128);
                var3.field1841 = class89.field1233.method2387((byte) -70);
                var3.field1791 = class89.field1233.method2356(-128);
                var3.field1874 = class89.field1233.method2356(-128);
                var3.field1836 = class89.field1233.method2359(-1) + class100.field1401;
                var3.field1803 = class89.field1233.method2410(65280) + class100.field1401;
                var3.field1830 = class89.field1233.method2381(-124);
                var3.field1874 += var3.field1884[0];
                var3.field1791 += var3.field1890[0];
                var3.field1888 = 0;
                var3.field1814 += var3.field1890[0];
                var3.field1841 += var3.field1884[0];
                var3.field1883 = 1;
            }
            if ((var4 & 0x20000) != 0) {
                int var49 = var3.field2577.field2983.length;
                int var50 = 0;
                if (var3.field2577.field2984 != null) {
                    var50 = var3.field2577.field2984.length;
                }
                byte var51 = 0;
                if (var3.field2577.field2949 != null) {
                    var50 = var3.field2577.field2949.length;
                }
                int var52 = class89.field1233.method2381(-23);
                if ((var52 & 0x1) != 1) {
                    int[] var53 = null;
                    if ((var52 & 0x2) == 2) {
                        var53 = new int[var49];
                        for (int var54 = 0; var54 < var49; var54++) {
                            var53[var54] = class89.field1233.method2405(-361);
                        }
                    }
                    short[] var55 = null;
                    if ((var52 & 0x4) == 4) {
                        var55 = new short[var50];
                        for (int var56 = 0; var56 < var50; var56++) {
                            var55[var56] = (short) class89.field1233.method2410(65280);
                        }
                    }
                    short[] var57 = null;
                    if ((var52 & 0x8) == 8) {
                        var57 = new short[var51];
                        for (int var58 = 0; var58 < var51; var58++) {
                            var57[var58] = (short) class89.field1233.method2410(65280);
                        }
                    }
                    long var59 = (long) var2 | (long) (var3.field2575++) << 32;
                    new class407(var59, var53, var55, var57);
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1797 = class89.field1233.method2379((byte) 85);
                var3.field1875 = 100;
            }
            if ((var4 & 0x400) != 0) {
                int var61 = class89.field1233.method2405(-361);
                var3.field1849 = class89.field1233.method2398(-1372747256);
                var3.field1845 = class89.field1233.method2398(-1372747256);
                var3.field1855 = (var61 & 0x8000) != 0;
                var3.field1843 = var61 & 0x7FFF;
                var3.field1862 = class100.field1401 + var3.field1843 + var3.field1849;
            }
            if ((var4 & 0x10000) != 0) {
                var3.field2578 = class89.field1233.method2358((byte) -30);
                if (var3.field2578 == 65535) {
                    var3.field2578 = var3.field2577.field2955;
                }
            }
            if ((var4 & 0x200) != 0) {
                int var62 = class89.field1233.method2398(-1372747256);
                int[] var63 = new int[var62];
                int[] var64 = new int[var62];
                int[] var65 = new int[var62];
                for (int var66 = 0; var66 < var62; var66++) {
                    int var67 = class89.field1233.method2405(-361);
                    if (var67 == 65535) {
                        var67 = -1;
                    }
                    var63[var66] = var67;
                    var64[var66] = class89.field1233.method2375((byte) 31);
                    var65[var66] = class89.field1233.method2410(65280);
                }
                class226.method1491(var63, var3, 3563, var65, var64);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)V")
    public static final void method1538(byte arg0, int arg1) {
        field3205++;
        int var2 = -120 / ((arg0 + 52) / 50);
        class16 var3 = class94.method753(8, 13175, (long) arg1);
        var3.method118(585134072);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(FIFF)F")
    public static final float method1539(float arg0, int arg1, float arg2, float arg3) {
        if (arg1 != 0) {
            field3207 = null;
        }
        field3194++;
        return (arg3 - arg0) * arg2 + arg0;
    }
}
