import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class195 {

    @OriginalMember(owner = "client!rea", name = "s", descriptor = "Z")
    public boolean field2861 = false;

    @OriginalMember(owner = "client!rea", name = "q", descriptor = "Lmga;")
    private class666 field2859 = new class666(64);

    @OriginalMember(owner = "client!rea", name = "t", descriptor = "Lmga;")
    public class666 field2862 = new class666(500);

    @OriginalMember(owner = "client!rea", name = "u", descriptor = "Lmga;")
    public class666 field2863 = new class666(30);

    @OriginalMember(owner = "client!rea", name = "v", descriptor = "Lmga;")
    public class666 field2864 = new class666(50);

    @OriginalMember(owner = "client!rea", name = "n", descriptor = "Lbi;")
    public class449 field2856;

    @OriginalMember(owner = "client!rea", name = "h", descriptor = "Z")
    public boolean field2850;

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "Lbi;")
    private class449 field2846;

    @OriginalMember(owner = "client!rea", name = "r", descriptor = "Ljv;")
    public static class73 field2860 = new class73("", 10);

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "F")
    public static float field2847;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!rea", name = "g", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!rea", name = "i", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!rea", name = "j", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!rea", name = "l", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!rea", name = "m", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!rea", name = "o", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!rea", name = "p", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!rea", name = "w", descriptor = "I")
    public int field2865;

    @OriginalMember(owner = "client!rea", name = "f", descriptor = "Llt;")
    public static class633 field2848;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rea", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field2866;

    // $FF: synthetic method
    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1268(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIII)Lvj;", line = 10)
    public static final class411 method1257(int arg0, int arg1, int arg2, int arg3) {
        field2853++;
        class24 var4 = class703.field9899[arg3][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        class411 var5 = null;
        int var6 = -1;
        for (class684 var7 = var4.field409; var7 != null; var7 = var7.field9618) {
            class641 var8 = var7.field9619;
            if (var8 instanceof class411) {
                class411 var9 = (class411) var8;
                int var10 = (var9.method2317((byte) 40) - 1) * 256 + 252;
                int var11 = var9.field8620 - var10 >> 9;
                int var12 = var9.field8612 - var10 >> 9;
                int var13 = var9.field8620 + var10 >> 9;
                int var14 = var9.field8612 + var10 >> 9;
                if (arg1 >= var11 && var12 <= arg2 && var13 >= arg1 && arg2 <= var14) {
                    int var15 = (var13 + 1 - arg1) * (var14 + 1 - arg2);
                    if (var6 < var15) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        if (arg0 != 0) {
            field2848 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IB)Lbd;", line = 73)
    public final class58 method1258(int arg0, byte arg1) {
        field2844++;
        class666 var3 = this.field2859;
        class58 var4;
        synchronized (this.field2859) {
            var4 = (class58) this.field2859.method3750((long) arg0, false);
        }
        if (var4 != null) {
            return var4;
        }
        class449 var5 = this.field2846;
        byte[] var6;
        synchronized (this.field2846) {
            if (arg1 >= -20) {
                this.field2863 = null;
            }
            var6 = this.field2846.method2537(false, class440.method2495(-1340305368, arg0), class445.method2508(false, arg0));
        }
        class58 var7 = new class58();
        var7.field832 = this;
        var7.field824 = arg0;
        if (var6 != null) {
            var7.method476(new class335(var6), 14644);
        }
        var7.method485(-125);
        if (!this.field2850 && var7.field853) {
            var7.field852 = null;
            var7.field811 = null;
        }
        if (var7.field901) {
            var7.field826 = 0;
            var7.field867 = false;
        }
        class666 var8 = this.field2859;
        synchronized (this.field2859) {
            this.field2859.method3745(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(BI)V", line = 119)
    public final void method1259(byte arg0, int arg1) {
        field2851++;
        this.field2859 = new class666(arg1);
        if (arg0 != -82) {
            this.field2856 = null;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IZ)V", line = 130)
    public final void method1260(int arg0, boolean arg1) {
        field2854++;
        if (arg0 == -22754 && this.field2861 != arg1) {
            this.field2861 = arg1;
            this.method1261(arg0 ^ 0xFFFFA731);
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V", line = 147)
    public final void method1261(int arg0) {
        field2849++;
        class666 var2 = this.field2859;
        synchronized (this.field2859) {
            if (arg0 < 13) {
                this.field2850 = false;
            }
            this.field2859.method3739(0);
        }
        class666 var3 = this.field2862;
        synchronized (this.field2862) {
            this.field2862.method3739(0);
        }
        class666 var4 = this.field2863;
        synchronized (this.field2863) {
            this.field2863.method3739(0);
        }
        class666 var5 = this.field2864;
        synchronized (this.field2864) {
            this.field2864.method3739(0);
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZI)V", line = 169)
    public final void method1262(boolean arg0, int arg1) {
        field2843++;
        this.field2865 = arg1;
        class666 var3 = this.field2862;
        synchronized (this.field2862) {
            this.field2862.method3739(0);
        }
        class666 var4 = this.field2863;
        synchronized (this.field2863) {
            this.field2863.method3739(0);
        }
        class666 var5 = this.field2864;
        synchronized (this.field2864) {
            this.field2864.method3739(0);
            if (arg0) {
                this.field2846 = null;
            }
        }
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(BI)V", line = 191)
    public final void method1263(byte arg0, int arg1) {
        field2845++;
        if (arg0 <= 102) {
            this.method1259((byte) 38, 78);
        }
        class666 var3 = this.field2859;
        synchronized (this.field2859) {
            this.field2859.method3740((byte) 60, arg1);
        }
        class666 var4 = this.field2862;
        synchronized (this.field2862) {
            this.field2862.method3740((byte) 60, arg1);
        }
        class666 var5 = this.field2863;
        synchronized (this.field2863) {
            this.field2863.method3740((byte) 60, arg1);
        }
        class666 var6 = this.field2864;
        synchronized (this.field2864) {
            this.field2864.method3740((byte) 60, arg1);
        }
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)V", line = 221)
    public final void method1264(int arg0) {
        class666 var2 = this.field2859;
        synchronized (this.field2859) {
            this.field2859.method3748(6);
        }
        field2852++;
        class666 var3 = this.field2862;
        synchronized (this.field2862) {
            this.field2862.method3748(6);
            if (arg0 >= -6) {
                this.field2850 = false;
            }
        }
        class666 var4 = this.field2863;
        synchronized (this.field2863) {
            this.field2863.method3748(6);
        }
        class666 var5 = this.field2864;
        synchronized (this.field2864) {
            this.field2864.method3748(6);
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILoa;I)Z", line = 243)
    public static final boolean method1265(int arg0, class651 arg1, int arg2) {
        field2855++;
        int var3 = (class34.field530 - 104) / 2;
        int var4 = (class34.field531 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var57 = var4; var57 < (var4 + 104); var57++) {
                for (int var58 = arg0; var58 <= 3; var58++) {
                    if (class37.method291(arg0, var57, var6, -1, var58)) {
                        int var59 = var58;
                        if (class69.method541(arg2 - 4, var57, var6)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class509.method2819(var59, var57, (byte) -79, var6);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        if (arg2 != 4) {
            field2848 = null;
        }
        class265.field3677 = arg1.method374(var7, 0, 512, 512, 512);
        class634.method3499(false);
        int var9 = ((int) (Math.random() * 20.0D)) - (-((((int) (Math.random() * 20.0D)) + 228 << 16) + (((int) (Math.random() * 20.0D)) + 238 - 10 << 8)) - 238) - 10 | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
        boolean[][] var12 = new boolean[class234.field3285 + 1][class234.field3285 + 1];
        for (int var13 = var3; var13 < var3 + 104; var13 += class234.field3285) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class234.field3285) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var39 = var13 - 1;
                    var37 += 4;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = class234.field3285 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = var36 + class234.field3285;
                if (var42 < 104) {
                    var38 += 4;
                    var42++;
                }
                arg1.method421(0, 0, var37 + (class234.field3285 * 4), class234.field3285 * 4 + var38);
                arg1.method87(-16777216);
                for (int var43 = arg0; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class234.field3285; var50++) {
                        for (int var56 = 0; var56 <= class234.field3285; var56++) {
                            var12[var50][var56] = class37.method291(arg0, var40 + var56, var39 + var50, -1, var43);
                        }
                    }
                    class684.field9625[var43].method21(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class249.field3450) {
                        for (int var51 = -4; var51 < class234.field3285; var51++) {
                            for (int var52 = -4; var52 < class234.field3285; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var53 >= var3 && var54 >= var4 && class37.method291(arg0, var54, var53, -1, var43)) {
                                    int var55 = var43;
                                    if (class69.method541(0, var54, var53)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class147.method1058(var38 + ((class234.field3285 - var52) * 4) - 4, var55, var9, var53, var10, var37 + (var51 * 4), (byte) -18, arg1, var54);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class249.field3450) {
                    class661 var44 = class591.field7820[arg0];
                    for (int var45 = 0; var45 < class234.field3285; var45++) {
                        for (int var46 = 0; var46 < class234.field3285; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field9391[var47 - var44.field9385][var48 - var44.field9388];
                            if ((var49 & 0x40240000) != 0) {
                                arg1.method3567(4, var45 * 4 + var37, 4, (class234.field3285 - var46) * 4 + var38 - 4, -1713569622, (byte) 113);
                            } else if ((var49 & 0x800000) != 0) {
                                arg1.method3570(var37 + (var45 * 4), 1, -1713569622, (class234.field3285 - var46) * 4 + var38 - 4, 4);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg1.method3566(-1713569622, var45 * 4 + var37 + 3, 126, 4, (class234.field3285 - var46) * 4 + var38 - 4);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg1.method3570(var45 * 4 + var37, 1, -1713569622, (class234.field3285 - var46) * 4 + var38 + 3 - 4, 4);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg1.method3566(-1713569622, var45 * 4 + var37, arg2 ^ 0x78, 4, (class234.field3285 - var46) * 4 + var38 - 4);
                            }
                        }
                    }
                }
                arg1.method415(var37, var38, class234.field3285 * 4, class234.field3285 * 4, var11, 2);
                class265.field3677.method273((var13 - var3) * 4 + 48, 464 - (var36 - var4) * 4 + -(class234.field3285 * 4), class234.field3285 * 4, class234.field3285 * 4, var37, var38);
            }
        }
        arg1.method435();
        arg1.method87(-16777215);
        class449.method2540((byte) -57);
        class243.field3392 = 0;
        class312.field4299.method3255((byte) -123);
        if (!class249.field3450) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg0; (arg0 + 1) >= var21 && var21 <= 3; var21++) {
                        if (class37.method291(arg0, var20, var14, -1, var21)) {
                            class532 var22 = (class532) class34.method269(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class532) class503.method2793(var21, var14, var20, field2866 == null ? (field2866 = method1268("qi")) : field2866);
                            }
                            if (var22 == null) {
                                var22 = (class532) class219.method1390(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class532) class74.method581(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class58 var23 = class470.field6288.method1258(var22.method146(false), (byte) -83);
                                if (!var23.field853 || class127.field2140) {
                                    int var24 = var23.field845;
                                    if (var23.field888 != null) {
                                        for (int var25 = 0; var25 < var23.field888.length; var25++) {
                                            if (var23.field888[var25] != -1) {
                                                class58 var26 = class470.field6288.method1258(var23.field888[var25], (byte) -49);
                                                if (var26.field845 >= 0) {
                                                    var24 = var26.field845;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class634 var28 = class521.field6960.method1487(var24, (byte) 115);
                                            if (var28 != null && var28.field8515) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class591.field7820[var21].field9391;
                                            int var32 = class591.field7820[var21].field9385;
                                            int var33 = class591.field7820[var21].field9388;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var29 > (var14 - 3) && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < var3 + 104 - 1 && (var14 + 3) > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && (var20 - 3) < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var4 + 103 > var30 && (var20 + 3) > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class70.field1051[class243.field3392] = var23.field824;
                                        class518.field6906[class243.field3392] = var29;
                                        class82.field1287[class243.field3392] = var30;
                                        class243.field3392++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class304.field4221 != null) {
                class525.field6997.field6162 = 1;
                class521.field6960.method1491(64, 59, 1024);
                for (int var15 = 0; var15 < class304.field4221.field2570; var15++) {
                    int var16 = class304.field4221.field2565[var15];
                    if ((var16 >> 28) == class199.field2897.field8609) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class473.field6334;
                        int var18 = (var16 & 0x3FFF) - class233.field3269;
                        if (var17 >= 0 && var17 < class34.field530 && var18 >= 0 && class34.field531 > var18) {
                            class312.field4299.method3265(new class704(var15), (byte) -86);
                        } else {
                            class634 var19 = class521.field6960.method1487(class304.field4221.field2559[var15], (byte) 115);
                            if (var19.field8532 != null && var19.field8525 + var17 >= 0 && class34.field530 > var19.field8544 + var17 && (var19.field8512 + var18) >= 0 && class34.field531 > (var19.field8531 + var18)) {
                                class312.field4299.method3265(new class704(var15), (byte) -126);
                            }
                        }
                    }
                }
                class521.field6960.method1491(64, arg2 + 113, 128);
                class525.field6997.field6162 = 2;
                class525.field6997.method2530((byte) -93);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZB)V", line = 692)
    public final void method1266(boolean arg0, byte arg1) {
        field2857++;
        if (this.field2850 == arg0) {
            return;
        }
        this.field2850 = arg0;
        if (arg1 != -81) {
            this.field2859 = null;
        }
        this.method1261(arg1 ^ 0xFFFFFFEE);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(B)V", line = 707)
    public static void method1267(byte arg0) {
        field2848 = null;
        if (arg0 <= 46) {
            method1267((byte) 79);
        }
        field2860 = null;
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lpca;IZLbi;Lbi;)V", line = 741)
    public class195(class671 arg0, int arg1, boolean arg2, class449 arg3, class449 arg4) {
        this.field2856 = arg4;
        this.field2850 = arg2;
        this.field2846 = arg3;
        if (this.field2846 != null) {
            int var6 = this.field2846.method2545(0) - 1;
            this.field2846.method2527(0, var6);
        }
    }
}
