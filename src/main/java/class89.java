import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class89 extends class100 {

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
    private int field2065 = -1;

    @OriginalMember(owner = "client!mf", name = "tb", descriptor = "Z")
    private boolean field2077 = false;

    @OriginalMember(owner = "client!mf", name = "rb", descriptor = "Z")
    private volatile boolean field2075 = false;

    @OriginalMember(owner = "client!mf", name = "Bb", descriptor = "Lrb;")
    private class120 field2085;

    @OriginalMember(owner = "client!mf", name = "vb", descriptor = "Lrb;")
    private class120 field2079;

    @OriginalMember(owner = "client!mf", name = "qb", descriptor = "I")
    private int field2074;

    @OriginalMember(owner = "client!mf", name = "mb", descriptor = "Lfc;")
    public static class39 field2070 = class90.method774("Handel akzeptieren", -125);

    @OriginalMember(owner = "client!mf", name = "Hb", descriptor = "Lfc;")
    public static class39 field2091 = class90.method774("@cr1@", -78);

    @OriginalMember(owner = "client!mf", name = "Gb", descriptor = "Lfc;")
    private static class39 field2090 = class90.method774("shake:", -79);

    @OriginalMember(owner = "client!mf", name = "Ib", descriptor = "Lfc;")
    public static class39 field2092 = class90.method774("welle:", -94);

    @OriginalMember(owner = "client!mf", name = "kb", descriptor = "Lfc;")
    public static class39 field2068 = class90.method774("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", -82);

    @OriginalMember(owner = "client!mf", name = "ub", descriptor = "Lfc;")
    public static class39 field2078 = field2090;

    @OriginalMember(owner = "client!mf", name = "Kb", descriptor = "Lfc;")
    public static class39 field2094 = class90.method774("sl_back", -82);

    @OriginalMember(owner = "client!mf", name = "Mb", descriptor = "Lfc;")
    public static class39 field2096 = class90.method774("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", -99);

    @OriginalMember(owner = "client!mf", name = "Fb", descriptor = "Lfc;")
    public static class39 field2089 = field2090;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!mf", name = "ib", descriptor = "I")
    private int field2066;

    @OriginalMember(owner = "client!mf", name = "jb", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!mf", name = "lb", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!mf", name = "ob", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!mf", name = "pb", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!mf", name = "sb", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!mf", name = "wb", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!mf", name = "xb", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!mf", name = "yb", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!mf", name = "zb", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!mf", name = "Ab", descriptor = "I")
    private int field2084;

    @OriginalMember(owner = "client!mf", name = "Cb", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!mf", name = "Db", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!mf", name = "Eb", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!mf", name = "Jb", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!mf", name = "Lb", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!mf", name = "Nb", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!mf", name = "nb", descriptor = "[Z")
    private volatile boolean[] field2071;

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lrb;Lrb;IZZZ)V", line = 8)
    public class89(class120 arg0, class120 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2085 = arg1;
        this.field2079 = arg0;
        this.field2074 = arg2;
        this.field2077 = arg5;
        class127.method1052(this.field2074, this, (byte) -8);
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(BI)Lfb;", line = 20)
    public static final class38 method755(byte arg0, int arg1) {
        ++field2097;
        class38 var2 = (class38) class140.field3540.method931(false, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class104.field2639.method839(5, 16, arg1);
            if (arg0 != 47) {
                method755((byte) -3, 19);
            }
            class38 var4 = new class38();
            if (var3 != null) {
                var4.method432(false, new class25(var3));
            }
            class140.field3540.method934(0, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V", line = 48)
    public static void method756(int arg0) {
        if (arg0 != -977580216) {
            method756(-73);
        }
        field2094 = null;
        field2078 = null;
        field2068 = null;
        field2096 = null;
        field2091 = null;
        field2070 = null;
        field2090 = null;
        field2092 = null;
        field2089 = null;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)V", line = 71)
    public final void method757(int arg0, int arg1) {
        if (arg1 != 743) {
            this.field2075 = true;
        }
        ++field2088;
        class115.method1002(arg0, this.field2074, -1446144656);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(III)V", line = 83)
    public final void method758(int arg0, int arg1, int arg2) {
        this.field2066 = arg2;
        if (arg1 < -40) {
            this.field2084 = arg0;
            if (this.field2085 != null) {
                class29.method362(this.field2085, this.field2074, (byte) 96, this);
            } else {
                class61.method607(this.field2074, this, (byte) 2, 255, true, (byte) 0, this.field2084);
            }
            ++field2076;
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(BI)V", line = 101)
    public final void method759(byte arg0, int arg1) {
        ++field2069;
        if (this.field2079 != null && this.field2071 != null && this.field2071[arg1]) {
            class29.method362(this.field2079, arg1, (byte) -88, this);
        } else {
            class61.method607(arg1, this, (byte) 2, this.field2074, true, (byte) 2, super.field2489[arg1]);
        }
        int var3 = -50 / ((55 - arg0) / 56);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(ZI)V", line = 124)
    public static final void method760(boolean arg0, int arg1) {
        ++field2073;
        class6.field194 = arg0;
        if (arg1 != -2) {
            field2095 = -102;
        }
        if (!class6.field194) {
            int var2 = class39.field1065.method320(false);
            int var3 = class39.field1065.method320(false);
            int var4 = (-class39.field1065.field710 + class128.field3275) / 16;
            class151.field3749 = new int[var4][4];
            for (int var5 = 0; ~var5 > ~var4; ++var5) {
                for (int var14 = 0; var14 < 4; ++var14) {
                    class151.field3749[var5][var14] = class39.field1065.method311(255);
                }
            }
            int var6 = class39.field1065.method320(false);
            int var7 = class39.field1065.method320(false);
            boolean var8 = false;
            if ((~(var3 / 8) == -49 || ~(var3 / 8) == -50) && ~(var6 / 8) == -49) {
                var8 = true;
            }
            if (~(var3 / 8) == -49 && ~(var6 / 8) == -149) {
                var8 = true;
            }
            int var9 = class39.field1065.method280(1630016912);
            class16.field469 = new int[var4];
            class146.field3641 = new byte[var4][];
            class9.field248 = new int[var4];
            class58.field1428 = new int[var4];
            class120.field3119 = new byte[var4][];
            int var10 = 0;
            for (int var11 = (var3 + -6) / 8; var11 <= (var3 + 6) / 8; ++var11) {
                for (int var12 = (var6 + -6) / 8; ~var12 >= ~((var6 + 6) / 8); ++var12) {
                    int var13 = (var11 << 8) + var12;
                    if (!var8 || ~var12 != -50 && ~var12 != -150 && ~var12 != -148 && ~var11 != -51 && (~var11 != -50 || var12 != 47)) {
                        class9.field248[var10] = var13;
                        class58.field1428[var10] = client.field557.method848(class137.method1111(new class39[] { class71.field1673, class86.method734(var11, class83.method697(arg1, -2220)), class137.field3434, class86.method734(var12, 2218) }, (byte) -51), (byte) 78);
                        class16.field469[var10] = client.field557.method848(class137.method1111(new class39[] { class55.field1380, class86.method734(var11, class83.method697(arg1, -2220)), class137.field3434, class86.method734(var12, 2218) }, (byte) -92), (byte) 75);
                        ++var10;
                    }
                }
            }
            class28.method353(var9, var3, 103, var6, var7, var2);
        } else {
            class39.field1065.method390((byte) -102);
            for (int var15 = 0; var15 < 4; ++var15) {
                for (int var35 = 0; var35 < 13; ++var35) {
                    for (int var36 = 0; ~var36 > -14; ++var36) {
                        int var37 = class39.field1065.method396(1, (byte) 127);
                        if (var37 != 1) {
                            class7.field235[var15][var35][var36] = -1;
                        } else {
                            class7.field235[var15][var35][var36] = class39.field1065.method396(26, (byte) 108);
                        }
                    }
                }
            }
            class39.field1065.method395((byte) 111);
            int var16 = (-class39.field1065.field710 + class128.field3275) / 16;
            class151.field3749 = new int[var16][4];
            for (int var17 = 0; ~var16 < ~var17; ++var17) {
                for (int var34 = 0; ~var34 > -5; ++var34) {
                    class151.field3749[var17][var34] = class39.field1065.method307(12);
                }
            }
            int var18 = class39.field1065.method321((byte) 123);
            int var19 = class39.field1065.method320(false);
            int var20 = class39.field1065.method292(arg1 + -126);
            int var21 = class39.field1065.method301(-4853);
            int var22 = class39.field1065.method301(-4853);
            class120.field3119 = new byte[var16][];
            class9.field248 = new int[var16];
            class146.field3641 = new byte[var16][];
            class16.field469 = new int[var16];
            class58.field1428 = new int[var16];
            int var23 = 0;
            for (int var24 = 0; var24 < 4; ++var24) {
                for (int var25 = 0; var25 < 13; ++var25) {
                    for (int var26 = 0; ~var26 > -14; ++var26) {
                        int var27 = class7.field235[var24][var25][var26];
                        if (~var27 != 0) {
                            int var28 = 1023 & var27 >> 14;
                            int var29 = 2047 & var27 >> 3;
                            int var30 = (var28 / 8 << 8) + var29 / 8;
                            for (int var31 = 0; var23 > var31; ++var31) {
                                if (~class9.field248[var31] == ~var30) {
                                    var30 = -1;
                                    break;
                                }
                            }
                            if (~var30 != 0) {
                                class9.field248[var23] = var30;
                                int var32 = (65525 & var30) >> 8;
                                int var33 = var30 & 255;
                                class58.field1428[var23] = client.field557.method848(class137.method1111(new class39[] { class71.field1673, class86.method734(var32, 2218), class137.field3434, class86.method734(var33, arg1 + 2220) }, (byte) 102), (byte) 120);
                                class16.field469[var23] = client.field557.method848(class137.method1111(new class39[] { class55.field1380, class86.method734(var32, 2218), class137.field3434, class86.method734(var33, 2218) }, (byte) 113), (byte) 107);
                                ++var23;
                            }
                        }
                    }
                }
            }
            class28.method353(var18, var21, -65, var22, var19, var20);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V", line = 344)
    private final void method761(byte arg0) {
        if (arg0 != -33) {
            method763(false, -16);
        }
        this.field2071 = new boolean[super.field2486.length];
        ++field2082;
        for (int var2 = 0; ~var2 > ~this.field2071.length; ++var2) {
            this.field2071[var2] = false;
        }
        if (this.field2079 == null) {
            this.field2075 = true;
        } else {
            this.field2065 = -1;
            for (int var3 = 0; this.field2071.length > var3; ++var3) {
                if (~super.field2498[var3] < -1) {
                    class151.method1203(var3, -120, this, this.field2079);
                    this.field2065 = var3;
                }
            }
            if (this.field2065 == -1) {
                this.field2075 = true;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(BI)V", line = 399)
    public static final void method762(byte arg0, int arg1) {
        ++field2081;
        if (class66.method631(0, arg1)) {
            class99[] var2 = class65.field1571[arg1];
            if (arg0 <= 11) {
                field2068 = null;
            }
            for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
                class99 var4 = var2[var3];
                if (var4 != null) {
                    var4.field2410 = 0;
                    var4.field2394 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(ZI)V", line = 435)
    public static final void method763(boolean arg0, int arg1) {
        ++field2086;
        if (arg1 == 33538048) {
            if (class94.field2197.field2916 >> 7 == class72.field1683 && class94.field2197.field2909 >> 7 == class128.field3253) {
                class72.field1683 = 0;
            }
            int var2 = class111.field2871;
            if (arg0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < var2; ++var3) {
                class142 var4;
                int var5;
                if (arg0) {
                    var4 = class94.field2197;
                    var5 = 33538048;
                } else {
                    var5 = class31.field862[var3] << 14;
                    var4 = class101.field2525[class31.field862[var3]];
                }
                if (var4 != null && var4.method979(18)) {
                    var4.field3569 = false;
                    int var6 = var4.field2909 >> 7;
                    int var7 = var4.field2916 >> 7;
                    if ((class74.field1705 && class111.field2871 > 50 || class111.field2871 > 200) && !arg0 && var4.field2920 == var4.field2869) {
                        var4.field3569 = true;
                    }
                    if (~var7 <= -1 && ~var7 > -105 && ~var6 <= -1 && var6 < 104) {
                        if (var4.field3584 != null && class70.field1654 >= var4.field3579 && ~class70.field1654 > ~var4.field3565) {
                            var4.field3569 = false;
                            var4.field3591 = class153.method1225(128, var4.field2909, class24.field661, var4.field2916);
                            class139.field3503.method41(class24.field661, var4.field2916, var4.field2909, var4.field3591, 60, var4, var4.field2900, var5, var4.field3556, var4.field3571, var4.field3551, var4.field3561);
                        } else {
                            if ((var4.field2916 & 127) == 64 && (var4.field2909 & 127) == 64) {
                                if (~class57.field1422[var7][var6] == ~class147.field3662) {
                                    continue;
                                }
                                class57.field1422[var7][var6] = class147.field3662;
                            }
                            var4.field3591 = class153.method1225(arg1 ^ 33538176, var4.field2909, class24.field661, var4.field2916);
                            class139.field3503.method52(class24.field661, var4.field2916, var4.field2909, var4.field3591, 60, var4, var4.field2900, var5, var4.field2875);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)I", line = 519)
    public final int method764(int arg0) {
        ++field2072;
        if (this.field2075) {
            return 100;
        } else if (super.field2486 != null) {
            return 99;
        } else {
            if (arg0 != 0) {
                this.method758(114, -98, -77);
            }
            int var2 = class60.method596(this.field2074, 255, (byte) -125);
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I[BLrb;IZ)V", line = 559)
    public final void method765(int arg0, byte[] arg1, class120 arg2, int arg3, boolean arg4) {
        ++field2067;
        if (this.field2085 == arg2) {
            if (this.field2075) {
                throw new RuntimeException();
            }
            if (arg1 == null) {
                class61.method607(this.field2074, this, (byte) 2, 255, true, (byte) 0, this.field2084);
                return;
            }
            class68.field1614.reset();
            class68.field1614.update(arg1, 0, arg1.length);
            int var6 = (int) class68.field1614.getValue();
            if (this.field2084 != var6 || ~this.field2066 != ~super.field2471) {
                class61.method607(this.field2074, this, (byte) 2, 255, true, (byte) 0, this.field2084);
                return;
            }
            this.method836(arg1, -5039);
            this.method761((byte) -33);
        } else {
            if (!arg4 && this.field2065 == arg0) {
                this.field2075 = true;
            }
            if (arg1 == null || arg1.length <= 2) {
                this.field2071[arg0] = false;
                if (this.field2077 || arg4) {
                    class61.method607(arg0, this, (byte) 2, this.field2074, arg4, (byte) 2, super.field2489[arg0]);
                }
                return;
            }
            class68.field1614.reset();
            class68.field1614.update(arg1, 0, arg1.length + -2);
            int var7 = (int) class68.field1614.getValue();
            int var8 = ((arg1[arg1.length + -2] & 255) << 8) + (255 & arg1[arg1.length - 1]);
            if (~super.field2489[arg0] != ~var7 || ~super.field2457[arg0] != ~var8) {
                this.field2071[arg0] = false;
                if (this.field2077 || arg4) {
                    class61.method607(arg0, this, (byte) 2, this.field2074, arg4, (byte) 2, super.field2489[arg0]);
                }
                return;
            }
            this.field2071[arg0] = true;
            if (arg4) {
                super.field2486[arg0] = class43.method502(false, arg1, (byte) 120);
            }
        }
        if (arg3 != 0) {
            method763(true, 40);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZZB[BI)V", line = 662)
    public final void method766(boolean arg0, boolean arg1, byte arg2, byte[] arg3, int arg4) {
        ++field2080;
        if (arg2 >= -1) {
            this.method764(-70);
        }
        if (!arg0) {
            arg3[arg3.length + -2] = (byte) (super.field2457[arg4] >> 8);
            arg3[arg3.length + -1] = (byte) super.field2457[arg4];
            if (this.field2079 != null) {
                class43.method511(arg4, (byte) -125, arg3, this.field2079);
                this.field2071[arg4] = true;
            }
            if (arg1) {
                super.field2486[arg4] = class43.method502(false, arg3, (byte) 109);
                return;
            }
        } else {
            if (this.field2075) {
                throw new RuntimeException();
            }
            if (this.field2085 != null) {
                class43.method511(this.field2074, (byte) -127, arg3, this.field2085);
            }
            this.method836(arg3, -5039);
            this.method761((byte) -33);
        }
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)I", line = 719)
    public final int method767(int arg0) {
        ++field2093;
        int var2 = 0;
        int var3 = 0;
        for (int var4 = arg0; ~super.field2486.length < ~var4; ++var4) {
            if (super.field2498[var4] > 0) {
                var2 += 100;
                var3 += this.method769(true, var4);
            }
        }
        if (~var2 == -1) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lob;I)I", line = 762)
    public static final int method768(class99 arg0, int arg1) {
        ++field2083;
        int var2 = 32 % ((arg1 - 13) / 56);
        class140 var3 = (class140) class149.field3705.method995(false, ((long) arg0.field2406 << 32) + (long) arg0.field2412);
        return var3 != null ? var3.field3531 : arg0.field2453;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(ZI)I", line = 779)
    private final int method769(boolean arg0, int arg1) {
        ++field2087;
        if (super.field2486[arg1] != null) {
            return 100;
        } else if (this.field2071[arg1]) {
            return 100;
        } else {
            if (!arg0) {
                this.field2077 = true;
            }
            return class60.method596(arg1, this.field2074, (byte) 44);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)V", line = 798)
    public static final void method770(boolean arg0) {
        ++field2064;
        try {
            Graphics var1 = class140.field3523.getGraphics();
            if (!arg0) {
                method762((byte) 90, 24);
            }
            class35.field967.method129(var1, 0, 4, (byte) -128);
            class140.field3539.method129(var1, 0, 357, (byte) -126);
            class87.field2011.method129(var1, 722, 4, (byte) -127);
            class16.field450.method129(var1, 743, 205, (byte) -127);
            class83.field1847.method129(var1, 0, 0, (byte) -124);
            class71.field1672.method129(var1, 516, 4, (byte) -127);
            class140.field3536.method129(var1, 516, 205, (byte) -124);
            class37.field1013.method129(var1, 496, 357, (byte) -128);
            class83.field1843.method129(var1, 0, 338, (byte) -125);
        } catch (Exception var2) {
            class140.field3523.repaint();
        }
    }
}
