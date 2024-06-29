import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class190 extends class64 {

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
    private int field3762 = 10;

    @OriginalMember(owner = "client!vb", name = "T", descriptor = "I")
    private int field3766 = 0;

    @OriginalMember(owner = "client!vb", name = "gb", descriptor = "I")
    private int field3779 = 2048;

    @OriginalMember(owner = "client!vb", name = "ab", descriptor = "Z")
    public static boolean field3773 = false;

    @OriginalMember(owner = "client!vb", name = "cb", descriptor = "I")
    public static int field3775 = 0;

    @OriginalMember(owner = "client!vb", name = "X", descriptor = "I")
    public static int field3770 = 0;

    @OriginalMember(owner = "client!vb", name = "eb", descriptor = "Lsa;")
    public static class162 field3777 = new class162(64);

    @OriginalMember(owner = "client!vb", name = "jb", descriptor = "Lcd;")
    public static class23 field3782 = class54.method414("gr-Un:", -1);

    @OriginalMember(owner = "client!vb", name = "kb", descriptor = "I")
    public static int field3783 = 0;

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!vb", name = "R", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!vb", name = "V", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!vb", name = "W", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!vb", name = "Y", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!vb", name = "bb", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!vb", name = "db", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!vb", name = "fb", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!vb", name = "hb", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!vb", name = "Z", descriptor = "Lkh;")
    public static class97 field3772;

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "[I")
    private int[] field3767;

    @OriginalMember(owner = "client!vb", name = "ib", descriptor = "[I")
    private int[] field3781;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
    public final void method44(byte arg0) {
        this.method1231(3219);
        if (arg0 != -22) {
            this.field3779 = 41;
        }
        ++field3769;
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)V")
    private final void method1231(int arg0) {
        int var2 = 0;
        this.field3767 = new int[this.field3762 + 1];
        ++field3780;
        this.field3781 = new int[this.field3762 - -1];
        if (arg0 != 3219) {
            method1235(-17, (Component) null, -84, 99);
        }
        int var3 = 4096 / this.field3762;
        int var4 = this.field3779 * var3 >> 12;
        for (int var5 = 0; this.field3762 > var5; ++var5) {
            this.field3781[var5] = var2;
            this.field3767[var5] = var2 + var4;
            var2 += var3;
        }
        this.field3781[this.field3762] = 4096;
        this.field3767[this.field3762] = this.field3767[0] + 4096;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lcd;I)V")
    public static final void method1232(class23 arg0, int arg1) {
        ++field3768;
        if (class102.field2181 >= 2) {
            if (arg0.method146(-125, class23.field520)) {
                System.gc();
            }
            if (arg0.method146(arg1 + 26400, class170.field3381)) {
                class117.method737(-21734);
            }
            if (arg0.method146(127, client.field575)) {
                class100.field2116 = true;
            }
            if (arg0.method146(-19, class19.field400)) {
                class100.field2116 = false;
            }
            if (arg0.method146(arg1 ^ -26440, class124.field2546)) {
                for (int var2 = 0; var2 < 4; ++var2) {
                    for (int var3 = 1; ~var3 > -104; ++var3) {
                        for (int var4 = 1; ~var4 > -104; ++var4) {
                            class62.field1435[var2].field1261[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg0.method146(-103, class61.field1426) && ~class199.field3894 == -3) {
                throw new RuntimeException();
            }
            if (arg0.method144(class43.field917, 0)) {
                class25.field547 = arg0.method136(12, -3331).method139(-13).method135((byte) -98);
                class107.method701(10945, (class23) null, 0, class3.method14(true, new class23[] { class2.field15, class184.method1132(-1, class25.field547) }));
            }
            if (arg0.method146(123, class200.field3965)) {
                class57.field1338 = true;
            }
        }
        if (arg1 == -26436) {
            ++class53.field1255;
            class159.field3190.method631(104, arg1 ^ 26435);
            class159.field3190.method1180(arg0.method143(-41) - 1, (byte) 105);
            class159.field3190.method1191(arg0.method136(2, -3331), (byte) -103);
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
    public class190() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V")
    public static void method1233(byte arg0) {
        if (arg0 != 84) {
            field3772 = null;
        }
        field3782 = null;
        field3777 = null;
        field3772 = null;
    }

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)V")
    public static final void method1234(int arg0) {
        class151.method939(false, 93);
        class172.field3426 = 0;
        ++field3778;
        boolean var1 = true;
        for (int var2 = 0; var2 < class55.field1299.length; ++var2) {
            if (~class135.field2794[var2] != 0 && class55.field1299[var2] == null) {
                class55.field1299[var2] = class82.field1779.method651(4, 0, class135.field2794[var2]);
                if (class55.field1299[var2] == null) {
                    ++class172.field3426;
                    var1 = false;
                }
            }
            if (class34.field690[var2] != -1 && class16.field340[var2] == null) {
                class16.field340[var2] = class82.field1779.method640((byte) 5, class67.field1577[var2], class34.field690[var2], 0);
                if (class16.field340[var2] == null) {
                    var1 = false;
                    ++class172.field3426;
                }
            }
        }
        if (!var1) {
            class101.field2156 = 1;
        } else {
            boolean var3 = true;
            class176.field3504 = 0;
            for (int var4 = 0; var4 < class55.field1299.length; ++var4) {
                byte[] var57 = class16.field340[var4];
                if (var57 != null) {
                    int var58 = (class117.field2427[var4] >> 8) * 64 + -class155.field3099;
                    int var59 = (255 & class117.field2427[var4]) * 64 - class94.field1989;
                    if (class186.field3639) {
                        var58 = 10;
                        var59 = 10;
                    }
                    var3 &= class47.method370(var58, var57, var59, (byte) -67);
                }
            }
            if (!var3) {
                class101.field2156 = 2;
            } else {
                int var5 = 49 / ((arg0 - 7) / 49);
                if (class101.field2156 != 0) {
                    class193.method1249(true, -17570, class3.method14(true, new class23[] { class21.field443, class181.field3573 }));
                }
                class175.method1097(true);
                class23.method145(true);
                class175.method1097(true);
                class205.field4041.method820();
                class175.method1097(true);
                System.gc();
                for (int var6 = 0; ~var6 > -5; ++var6) {
                    class62.field1435[var6].method425((byte) 51);
                }
                for (int var7 = 0; var7 < 4; ++var7) {
                    for (int var55 = 0; var55 < 104; ++var55) {
                        for (int var56 = 0; var56 < 104; ++var56) {
                            class53.field1253[var7][var55][var56] = 0;
                        }
                    }
                }
                class175.method1097(true);
                class153.method947((byte) -98);
                int var8 = class55.field1299.length;
                class63.method464(0);
                class151.method939(true, 103);
                if (!class186.field3639) {
                    for (int var9 = 0; ~var8 < ~var9; ++var9) {
                        int var18 = (class117.field2427[var9] >> 8) * 64 + -class155.field3099;
                        byte[] var19 = class55.field1299[var9];
                        int var20 = (class117.field2427[var9] & 255) * 64 + -class94.field1989;
                        if (var19 != null) {
                            class175.method1097(true);
                            class47.method375(var19, 122, class58.field1349 * 8 + -48, class84.field1787 * 8 + -48, var20, class62.field1435, var18);
                        }
                    }
                    for (int var10 = 0; var8 > var10; ++var10) {
                        byte[] var15 = class55.field1299[var10];
                        int var16 = (class117.field2427[var10] >> 8) * 64 - class155.field3099;
                        int var17 = (class117.field2427[var10] & 255) * 64 + -class94.field1989;
                        if (var15 == null && ~class84.field1787 > -801) {
                            class175.method1097(true);
                            class97.method649(var16, false, 64, var17, 64);
                        }
                    }
                    class151.method939(true, 125);
                    for (int var11 = 0; var8 > var11; ++var11) {
                        byte[] var12 = class16.field340[var11];
                        if (var12 != null) {
                            int var13 = (255 & class117.field2427[var11]) * 64 + -class94.field1989;
                            int var14 = (class117.field2427[var11] >> 8) * 64 - class155.field3099;
                            class175.method1097(true);
                            class141.method908(class62.field1435, -119, var13, var12, class205.field4041, var14);
                        }
                    }
                }
                if (class186.field3639) {
                    for (int var21 = 0; ~var21 > -5; ++var21) {
                        class175.method1097(true);
                        for (int var35 = 0; ~var35 > -14; ++var35) {
                            for (int var36 = 0; ~var36 > -14; ++var36) {
                                int var37 = class101.field2168[var21][var35][var36];
                                boolean var38 = false;
                                if (~var37 != 0) {
                                    int var39 = (52074211 & var37) >> 24;
                                    int var40 = (7 & var37) >> 1;
                                    int var41 = 1023 & var37 >> 14;
                                    int var42 = 2047 & var37 >> 3;
                                    int var43 = (var41 / 8 << 8) + var42 / 8;
                                    for (int var44 = 0; var44 < class117.field2427.length; ++var44) {
                                        if (~class117.field2427[var44] == ~var43 && class55.field1299[var44] != null) {
                                            class158.method970(class55.field1299[var44], var39, (var41 & 7) * 8, var35 * 8, class62.field1435, var36 * 8, (var42 & 7) * 8, -27429, var40, var21);
                                            var38 = true;
                                            break;
                                        }
                                    }
                                }
                                if (!var38) {
                                    class114.method727(var36 * 8, var35 * 8, (byte) -49, var21);
                                }
                            }
                        }
                    }
                    for (int var22 = 0; ~var22 > -14; ++var22) {
                        for (int var33 = 0; ~var33 > -14; ++var33) {
                            int var34 = class101.field2168[0][var22][var33];
                            if (var34 == -1) {
                                class97.method649(var22 * 8, false, 8, var33 * 8, 8);
                            }
                        }
                    }
                    class151.method939(true, 50);
                    for (int var23 = 0; ~var23 > -5; ++var23) {
                        class175.method1097(true);
                        for (int var24 = 0; ~var24 > -14; ++var24) {
                            for (int var25 = 0; ~var25 > -14; ++var25) {
                                int var26 = class101.field2168[var23][var24][var25];
                                if (~var26 != 0) {
                                    int var27 = (var26 & 16766581) >> 14;
                                    int var28 = (var26 & 62427247) >> 24;
                                    int var29 = (7 & var26) >> 1;
                                    int var30 = var26 >> 3 & 2047;
                                    int var31 = (var27 / 8 << 8) + var30 / 8;
                                    for (int var32 = 0; ~var32 > ~class117.field2427.length; ++var32) {
                                        if (class117.field2427[var32] == var31 && class16.field340[var32] != null) {
                                            class113.method723((7 & var27) * 8, (byte) 113, var24 * 8, var25 * 8, class62.field1435, (7 & var30) * 8, var28, class205.field4041, class16.field340[var32], var29, var23);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class151.method939(true, 33);
                class23.method145(true);
                class175.method1097(true);
                class184.method1131(class62.field1435, class205.field4041, 75);
                class151.method939(true, 61);
                int var45 = class21.field445;
                if (~var45 < ~class59.field1385) {
                    var45 = class59.field1385;
                }
                if (class59.field1385 + -1 > var45) {
                    int var46 = class59.field1385 - 1;
                }
                if (class193.field3810) {
                    class205.field4041.method821(class21.field445);
                } else {
                    class205.field4041.method821(0);
                }
                for (int var47 = 0; ~var47 > -105; ++var47) {
                    for (int var54 = 0; ~var54 > -105; ++var54) {
                        class168.method1029(var54, var47, -1);
                    }
                }
                class175.method1097(true);
                class199.method1289(-1);
                class25.field545.method997(false);
                if (class12.field286 != null) {
                    class159.field3190.method631(180, -1);
                    ++class138.field2855;
                    class159.field3190.method1186(1057001181, -12);
                }
                if (!class186.field3639) {
                    int var48 = (class58.field1349 - 6) / 8;
                    int var49 = (class58.field1349 - -6) / 8;
                    int var50 = (class84.field1787 + -6) / 8;
                    int var51 = (class84.field1787 + 6) / 8;
                    for (int var52 = var48 + -1; var52 <= var49 - -1; ++var52) {
                        for (int var53 = var50 + -1; ~(var51 + 1) <= ~var53; ++var53) {
                            if (var52 < var48 || ~var49 > ~var52 || ~var53 > ~var50 || ~var51 > ~var53) {
                                class82.field1779.method643(106, class3.method14(true, new class23[] { class55.field1294, class184.method1132(-1, var52), class145.field2961, class184.method1132(-1, var53) }));
                                class82.field1779.method643(109, class3.method14(true, new class23[] { class47.field1068, class184.method1132(-1, var52), class145.field2961, class184.method1132(-1, var53) }));
                            }
                        }
                    }
                }
                class48.method379(30, (byte) 18);
                class175.method1097(true);
                class28.method213(842646466);
                class159.field3190.method631(185, -1);
                class15.method83((byte) 39);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/awt/Component;II)Lj;")
    public static final class80 method1235(int arg0, Component arg1, int arg2, int arg3) {
        if (arg0 < 16) {
            method1234(61);
        }
        ++field3764;
        try {
            Class var4 = Class.forName("qf");
            class80 var5 = (class80) var4.newInstance();
            var5.method546(arg2, arg3, arg1, (byte) -121);
            return var5;
        } catch (Throwable var7) {
            class81 var6 = new class81();
            var6.method546(arg2, arg3, arg1, (byte) -95);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)V")
    public static final void method1236(int arg0, byte arg1) {
        ++field3765;
        int[] var2 = class143.field2932.field782;
        int var3 = var2.length;
        for (int var4 = 0; var3 > var4; ++var4) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; ++var5) {
            int var21 = (52736 - var5 * 512) * 4 + 24628;
            for (int var22 = 1; ~var22 > -104; ++var22) {
                if (~(24 & class53.field1253[arg0][var22][var5]) == -1) {
                    class205.field4041.method779(var2, var21, 512, arg0, var22, var5);
                }
                if (~arg0 > -4 && (class53.field1253[arg0 + 1][var22][var5] & 8) != 0) {
                    class205.field4041.method779(var2, var21, 512, arg0 + 1, var22, var5);
                }
                var21 += 4;
            }
        }
        class143.field2932.method298();
        int var6 = (228 - -((int) (20.0D * Math.random())) << 8) + (238 - (-((int) (Math.random() * 20.0D)) - -10) << 16) - -((int) (Math.random() * 20.0D)) - -238 - 10;
        int var7 = 238 + ((int) (Math.random() * 20.0D) - 10) << 16;
        for (int var8 = 1; ~var8 > -104; ++var8) {
            for (int var20 = 1; ~var20 > -104; ++var20) {
                if (~(class53.field1253[arg0][var20][var8] & 24) == -1) {
                    class60.method456(var8, arg0, 17780, var6, var20, var7);
                }
                if (arg0 < 3 && (class53.field1253[arg0 + 1][var20][var8] & 8) != 0) {
                    class60.method456(var8, arg0 + 1, 17780, var6, var20, var7);
                }
            }
        }
        class143.field2935 = 0;
        for (int var9 = 0; var9 < 104; ++var9) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = class205.field4041.method783(class59.field1385, var9, var11);
                if (~var12 != -1) {
                    int var13 = (var12 & 536860003) >> 14;
                    int var14 = class65.method486(var13, (byte) -66).field2221;
                    if (~var14 <= -1) {
                        int var15 = var9;
                        int var16 = var11;
                        if (~var14 != -23 && ~var14 != -30 && ~var14 != -35 && ~var14 != -37 && var14 != 46 && var14 != 47 && ~var14 != -49) {
                            int[][] var17 = class62.field1435[class59.field1385].field1261;
                            for (int var18 = 0; var18 < 10; ++var18) {
                                int var19 = (int) (Math.random() * 4.0D);
                                if (~var19 == -1 && var15 > 0 && ~var15 < ~(var9 + -3) && (19661064 & var17[var15 + -1][var16]) == 0) {
                                    --var15;
                                }
                                if (var19 == 1 && var15 < 103 && var9 + 3 > var15 && (19661184 & var17[var15 + 1][var16]) == 0) {
                                    ++var15;
                                }
                                if (var19 == 2 && ~var16 < -1 && ~(var11 - 3) > ~var16 && ~(19661058 & var17[var15][var16 + -1]) == -1) {
                                    --var16;
                                }
                                if (~var19 == -4 && ~var16 > -104 && var16 < var11 - -3 && (19661088 & var17[var15][var16 - -1]) == 0) {
                                    ++var16;
                                }
                            }
                        }
                        class94.field1993[class143.field2935] = class22.field461[var14];
                        class61.field1423[class143.field2935] = var15;
                        class176.field3502[class143.field2935] = var16;
                        ++class143.field2935;
                    }
                }
            }
        }
        class151.field3012.method542(7350);
        int var10 = -88 % ((arg1 - 36) / 52);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        ++field3774;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field3766 = arg2.method1202(-128);
                }
            } else {
                this.field3779 = arg2.method1197(-1);
            }
        } else {
            this.field3762 = arg2.method1202(112);
        }
        int var5 = 23 / ((arg0 - 7) / 43);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field3776;
        int[] var3 = super.field1513.method1033(-91, arg0);
        if (arg1 != -9421) {
            method1234(-53);
        }
        if (super.field1513.field3368) {
            int var4 = class95.field1995[arg0];
            if (~this.field3766 == -1) {
                short var5 = 0;
                for (int var6 = 0; this.field3762 > var6; ++var6) {
                    if (var4 >= this.field3781[var6] && this.field3781[var6 + 1] > var4) {
                        if (~this.field3767[var6] < ~var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class93.method608(var3, 0, class168.field3367, var5);
            } else {
                for (int var7 = 0; ~class168.field3367 < ~var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class174.field3475[var7];
                    int var11 = this.field3766;
                    if (var11 != 1) {
                        if (~var11 != -3) {
                            if (~var11 == -4) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var10 - (-var4 + 4096) >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; var12 < this.field3762; ++var12) {
                        if (~var8 <= ~this.field3781[var12] && ~this.field3781[var12 + 1] < ~var8) {
                            if (var8 < this.field3767[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }
}
