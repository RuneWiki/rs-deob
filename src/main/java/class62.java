import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class62 {

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    private int field1014 = -1;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    private int field1007 = 0;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Loj;")
    private class246 field1011 = new class246();

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "Z")
    public boolean field1022 = false;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    private int field1010;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "[Lva;")
    private class287[] field1015;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[[[I")
    private int[][][] field1008;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1021 = "Loading wordpack - ";

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Loj;")
    public static class246 field1020 = new class246();

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field1025 = 0;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "Ljava/lang/String;")
    public static String field1028 = "Loaded update list";

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "J")
    public static long field1027;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "Ldk;")
    public static class251 field1026;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "Lgl;")
    public static class289 field1024;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "[I")
    public static int[] field1023;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)[[I")
    public final int[][] method419(int arg0, byte arg1) {
        field1012++;
        int var3 = 108 % ((arg1 - 55) / 37);
        if (this.field1018 == this.field1010) {
            this.field1022 = this.field1015[arg0] == null;
            this.field1015[arg0] = class203.field3237;
            return this.field1008[arg0];
        } else if (this.field1018 == 1) {
            this.field1022 = this.field1014 != arg0;
            this.field1014 = arg0;
            return this.field1008[0];
        } else {
            class287 var4 = this.field1015[arg0];
            if (var4 == null) {
                this.field1022 = true;
                if (this.field1007 < this.field1018) {
                    var4 = new class287(arg0, this.field1007);
                    this.field1007++;
                } else {
                    class287 var5 = (class287) this.field1011.method1640((byte) -48);
                    var4 = new class287(arg0, var5.field4599);
                    this.field1015[var5.field4597] = null;
                    var5.method913(-3542);
                }
                this.field1015[arg0] = var4;
            } else {
                this.field1022 = false;
            }
            this.field1011.method1645(71, var4);
            return this.field1008[var4.field4599];
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public final void method420(byte arg0) {
        for (int var2 = 0; var2 < this.field1018; var2++) {
            this.field1008[var2][0] = null;
            this.field1008[var2][1] = null;
            this.field1008[var2][2] = null;
            this.field1008[var2] = null;
        }
        if (arg0 >= -111) {
            this.field1018 = 80;
        }
        field1005++;
        this.field1008 = null;
        this.field1015 = null;
        this.field1011.method1650((byte) -119);
        this.field1011 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)[[[I")
    public final int[][][] method421(boolean arg0) {
        if (arg0) {
            return null;
        }
        field1013++;
        if (this.field1018 != this.field1010) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1018; var2++) {
            this.field1015[var2] = class203.field3237;
        }
        return this.field1008;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lhl;")
    public static final class145 method422(int arg0) {
        field1019++;
        try {
            if (arg0 != 3) {
                field1024 = null;
            }
            return (class145) Class.forName("qh").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIII)V")
    public static final void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1016++;
        class273.method1828((byte) -96, arg1);
        if (arg0 >= -16) {
            field1024 = null;
        }
        int var7 = arg1 - arg6;
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = 0;
        int var9 = arg1;
        int var10 = var7;
        int var11 = -var7;
        int var12 = -arg1;
        int var13 = -1;
        if (class85.field1409 <= arg3 && arg3 <= class234.field3774) {
            int[] var14 = class204.field3253[arg3];
            int var15 = class123.method866(class82.field1374, arg2 - arg1, (byte) 81, class259.field4188);
            int var16 = class123.method866(class82.field1374, arg1 + arg2, (byte) -121, class259.field4188);
            int var17 = class123.method866(class82.field1374, arg2 - var7, (byte) 84, class259.field4188);
            int var18 = class123.method866(class82.field1374, arg2 + var7, (byte) 47, class259.field4188);
            class73.method494(arg5, var14, 4028, var17, var15);
            class73.method494(arg4, var14, 4028, var18, var17);
            class73.method494(arg5, var14, 4028, var16, var18);
        }
        int var19 = -1;
        while (var8 < var9) {
            var13 += 2;
            var12 += var13;
            var19 += 2;
            var11 += var19;
            if (var11 >= 0 && var10 >= 1) {
                var10--;
                class167.field2727[var10] = var8;
                var11 -= var10 << 1;
            }
            var8++;
            if (var12 >= 0) {
                var9--;
                var12 -= var9 << 1;
                int var20 = arg3 + var9;
                int var21 = arg3 - var9;
                if (var20 >= class85.field1409 && class234.field3774 >= var21) {
                    if (var9 >= var7) {
                        int var22 = class123.method866(class82.field1374, arg2 + var8, (byte) -87, class259.field4188);
                        int var23 = class123.method866(class82.field1374, arg2 - var8, (byte) -67, class259.field4188);
                        if (class234.field3774 >= var20) {
                            class73.method494(arg5, class204.field3253[var20], 4028, var22, var23);
                        }
                        if (var21 >= class85.field1409) {
                            class73.method494(arg5, class204.field3253[var21], 4028, var22, var23);
                        }
                    } else {
                        int var24 = class167.field2727[var9];
                        int var25 = class123.method866(class82.field1374, arg2 + var8, (byte) 53, class259.field4188);
                        int var26 = class123.method866(class82.field1374, arg2 - var8, (byte) -87, class259.field4188);
                        int var27 = class123.method866(class82.field1374, arg2 + var24, (byte) -74, class259.field4188);
                        int var28 = class123.method866(class82.field1374, arg2 - var24, (byte) 102, class259.field4188);
                        if (var20 <= class234.field3774) {
                            int[] var29 = class204.field3253[var20];
                            class73.method494(arg5, var29, 4028, var28, var26);
                            class73.method494(arg4, var29, 4028, var27, var28);
                            class73.method494(arg5, var29, 4028, var25, var27);
                        }
                        if (var21 >= class85.field1409) {
                            int[] var30 = class204.field3253[var21];
                            class73.method494(arg5, var30, 4028, var28, var26);
                            class73.method494(arg4, var30, 4028, var27, var28);
                            class73.method494(arg5, var30, 4028, var25, var27);
                        }
                    }
                }
            }
            int var31 = arg3 - var8;
            int var32 = arg3 + var8;
            if (class85.field1409 <= var32 && class234.field3774 >= var31) {
                int var33 = arg2 + var9;
                int var34 = arg2 - var9;
                if (class82.field1374 <= var33 && class259.field4188 >= var34) {
                    int var35 = class123.method866(class82.field1374, var33, (byte) -79, class259.field4188);
                    int var36 = class123.method866(class82.field1374, var34, (byte) 44, class259.field4188);
                    if (var8 >= var7) {
                        if (class234.field3774 >= var32) {
                            class73.method494(arg5, class204.field3253[var32], 4028, var35, var36);
                        }
                        if (var31 >= class85.field1409) {
                            class73.method494(arg5, class204.field3253[var31], 4028, var35, var36);
                        }
                    } else {
                        int var37 = var10 >= var8 ? var10 : class167.field2727[var8];
                        int var38 = class123.method866(class82.field1374, arg2 + var37, (byte) 119, class259.field4188);
                        int var39 = class123.method866(class82.field1374, arg2 - var37, (byte) 116, class259.field4188);
                        if (class234.field3774 >= var32) {
                            int[] var40 = class204.field3253[var32];
                            class73.method494(arg5, var40, 4028, var39, var36);
                            class73.method494(arg4, var40, 4028, var38, var39);
                            class73.method494(arg5, var40, 4028, var35, var38);
                        }
                        if (var31 >= class85.field1409) {
                            int[] var41 = class204.field3253[var31];
                            class73.method494(arg5, var41, 4028, var39, var36);
                            class73.method494(arg4, var41, 4028, var38, var39);
                            class73.method494(arg5, var41, 4028, var35, var38);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V")
    public static final void method424(int arg0, int arg1) {
        class81.field1329.method1262(arg0, 2736);
        field1009++;
        if (arg1 < 84) {
            field1020 = null;
        }
        class71.field1202.method1262(arg0, 2736);
        class90.field1464.method1262(arg0, 2736);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
    public static final void method425(byte arg0) {
        for (int var1 = 0; var1 < class195.field3163; var1++) {
            int var10002 = class291.field4678[var1]--;
            if (class291.field4678[var1] >= -10) {
                class114 var4 = class30.field371[var1];
                if (var4 == null) {
                    var4 = class114.method798(class229.field3690, class199.field3203[var1], 0);
                    if (var4 == null) {
                        continue;
                    }
                    class291.field4678[var1] += var4.method801();
                    class30.field371[var1] = var4;
                }
                if (class291.field4678[var1] < 0) {
                    int var5;
                    if (class11.field118[var1] == 0) {
                        var5 = class126.field1995[var1] * class183.field3011 >> 8;
                    } else {
                        int var6 = class11.field118[var1] >> 16 & 0xFF;
                        int var7 = (class11.field118[var1] & 0xFF) * 128;
                        int var8 = var6 * 128 + 64 - class239.field3829.field637;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = class11.field118[var1] >> 8 & 0xFF;
                        int var10 = var9 * 128 + 64 - class239.field3829.field710;
                        if (var10 < 0) {
                            var10 = -var10;
                        }
                        int var11 = var8 + var10 - 128;
                        if (var7 < var11) {
                            class291.field4678[var1] = -100;
                            continue;
                        }
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        var5 = (var7 - var11) * class126.field1995[var1] * class32.field481 / var7 >> 8;
                    }
                    if (var5 > 0) {
                        class248 var12 = var4.method800().method1656(class151.field2342);
                        class102 var13 = class102.method715(var12, 100, var5);
                        var13.method702(class4.field47[var1] - 1);
                        class6.field68.method1596(var13);
                    }
                    class291.field4678[var1] = -100;
                }
            } else {
                class195.field3163--;
                for (int var3 = var1; var3 < class195.field3163; var3++) {
                    class199.field3203[var3] = class199.field3203[var3 + 1];
                    class30.field371[var3] = class30.field371[var3 + 1];
                    class4.field47[var3] = class4.field47[var3 + 1];
                    class291.field4678[var3] = class291.field4678[var3 + 1];
                    class11.field118[var3] = class11.field118[var3 + 1];
                    class126.field1995[var3] = class126.field1995[var3 + 1];
                }
                var1--;
            }
        }
        if (class277.field4451 && !class159.method1096(-31)) {
            if (class214.field3548 != 0 && class281.field4498 != -1) {
                class295.method1959(class281.field4498, class50.field852, false, 0, true, class214.field3548);
            }
            class277.field4451 = false;
        } else if (class214.field3548 != 0 && class281.field4498 != -1 && !class159.method1096(-23)) {
            class314.field5061.method828(107, 249);
            class314.field5061.method1125(class281.field4498, 255);
            class281.field4498 = -1;
            class47.field795++;
        }
        int var2 = -55 % ((36 - arg0) / 58);
        field1017++;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V")
    public static void method426(boolean arg0) {
        if (!arg0) {
            method423(20, 110, 107, 77, 0, 109, 50);
        }
        field1024 = null;
        field1021 = null;
        field1023 = null;
        field1020 = null;
        field1026 = null;
        field1028 = null;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(III)V")
    public class62(int arg0, int arg1, int arg2) {
        this.field1010 = arg1;
        this.field1015 = new class287[this.field1010];
        this.field1018 = arg0;
        this.field1008 = new int[this.field1018][3][arg2];
    }
}
