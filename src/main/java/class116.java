import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class116 extends class23 {

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
    private int field2090 = 4096;

    @OriginalMember(owner = "client!kg", name = "Z", descriptor = "I")
    private int field2099 = 0;

    @OriginalMember(owner = "client!kg", name = "ab", descriptor = "[[[B")
    public static byte[][][] field2100 = new byte[4][104][104];

    @OriginalMember(owner = "client!kg", name = "eb", descriptor = "I")
    public static int field2104 = 0;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "J")
    public static volatile long field2093 = 0L;

    @OriginalMember(owner = "client!kg", name = "fb", descriptor = "Z")
    public static boolean field2105 = false;

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "Li;")
    public static class88 field2091 = class208.method1425(105, "titlebutton");

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!kg", name = "W", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!kg", name = "Y", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!kg", name = "bb", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!kg", name = "cb", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!kg", name = "db", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!kg", name = "hb", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!kg", name = "ib", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!kg", name = "jb", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!kg", name = "X", descriptor = "[Llj;")
    public static class130[] field2097;

    @OriginalMember(owner = "client!kg", name = "gb", descriptor = "[[B")
    public static byte[][] field2106;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)V")
    public static void method789(int arg0) {
        int var1 = -107 % ((arg0 - -55) / 47);
        field2106 = null;
        field2091 = null;
        field2097 = null;
        field2100 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        ++field2092;
        if (arg1 < 19) {
            this.field2099 = -51;
        }
        int[] var3 = super.field379.method1080(false, arg0);
        if (super.field379.field3100) {
            int[] var4 = this.method120(arg0, false, 0);
            for (int var5 = 0; ~class70.field1276 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (this.field2099 <= var6) {
                    if (this.field2090 >= var6) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field2090;
                    }
                } else {
                    var3[var5] = this.field2099;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)V")
    public static final void method790(byte arg0, int arg1) {
        if (arg1 == -1 && !class110.field2014) {
            class1.method5(31818);
        } else if (~arg1 != 0 && (~class2.field25 != ~arg1 || !class102.method709(100)) && class65.field1183 != 0 && !class110.field2014) {
            class106.method732(0, class65.field1183, false, arg1, 2, class99.field1816, 0);
        }
        ++field2101;
        class2.field25 = arg1;
        int var2 = -105 % ((4 - arg0) / 35);
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class116() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "(I)V")
    public static final void method791(int arg0) {
        if (~class114.field2063 < -2) {
            --class114.field2063;
            class208.field3954 = class67.field1211;
        }
        int var1 = 79 % ((arg0 - 33) / 50);
        if (~class105.field1912 < -1) {
            --class105.field1912;
        }
        ++field2095;
        if (class58.field1097) {
            class58.field1097 = false;
            class201.method1382(87);
        } else {
            for (int var2 = 0; var2 < 100 && class12.method61(-122); ++var2) {
            }
            if (class229.field4286 == 30) {
                class15.method71(false, class146.field2749, 56);
                Object var3 = class219.field4145.field715;
                synchronized (class219.field4145.field715) {
                    if (!class57.field1077) {
                        class219.field4145.field718 = 0;
                    } else if (~class36.field625 != -1 || class219.field4145.field718 >= 40) {
                        class146.field2749.method30((byte) -63, 111);
                        ++class226.field4242;
                        class146.field2749.method346(255, 0);
                        int var4 = class146.field2749.field831;
                        int var5 = 0;
                        for (int var6 = 0; var6 < class219.field4145.field718 && ~(-var4 + class146.field2749.field831) > -241; ++var6) {
                            ++var5;
                            int var7 = class219.field4145.field719[var6];
                            if (var7 >= 0) {
                                if (~var7 < -503) {
                                    var7 = 502;
                                }
                            } else {
                                var7 = 0;
                            }
                            int var8 = class219.field4145.field720[var6];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (var8 > 764) {
                                var8 = 764;
                            }
                            int var9 = var7 * 765 - -var8;
                            if (~class219.field4145.field719[var6] == 0 && class219.field4145.field720[var6] == -1) {
                                var9 = 524287;
                                var8 = -1;
                                var7 = -1;
                            }
                            if (class7.field110 == var8 && class211.field4006 == var7) {
                                if (~class147.field2767 > -2048) {
                                    ++class147.field2767;
                                }
                            } else {
                                int var10 = -class211.field4006 + var7;
                                class211.field4006 = var7;
                                int var11 = var8 - class7.field110;
                                class7.field110 = var8;
                                if (~class147.field2767 > -9 && var11 >= -32 && var11 <= 31 && ~var10 <= 31 && var10 <= 31) {
                                    var10 += 32;
                                    var11 += 32;
                                    class146.field2749.method305(95, (class147.field2767 << 12) - -(var11 << 6) + var10);
                                    class147.field2767 = 0;
                                } else if (class147.field2767 < 8) {
                                    class146.field2749.method337((class147.field2767 << 19) + 8388608 + var9, (byte) -61);
                                    class147.field2767 = 0;
                                } else {
                                    class146.field2749.method338(2112555600, (class147.field2767 << 19) + var9 + -1073741824);
                                    class147.field2767 = 0;
                                }
                            }
                        }
                        class146.field2749.method341(-var4 + class146.field2749.field831, 65);
                        if (var5 < class219.field4145.field718) {
                            class219.field4145.field718 -= var5;
                            for (int var12 = 0; class219.field4145.field718 > var12; ++var12) {
                                class219.field4145.field720[var12] = class219.field4145.field720[var12 - -var5];
                                class219.field4145.field719[var12] = class219.field4145.field719[var12 - -var5];
                            }
                        } else {
                            class219.field4145.field718 = 0;
                        }
                    }
                }
                if (~class36.field625 != -1) {
                    ++class202.field3856;
                    long var13 = (class36.field623 - class99.field1806) / 50L;
                    class99.field1806 = class36.field623;
                    int var15 = class172.field3341;
                    int var16 = class226.field4241;
                    if (~var15 <= -1) {
                        if (~var15 < -503) {
                            var15 = 502;
                        }
                    } else {
                        var15 = 0;
                    }
                    if (var16 >= 0) {
                        if (var16 > 764) {
                            var16 = 764;
                        }
                    } else {
                        var16 = 0;
                    }
                    if (var13 > 4095L) {
                        var13 = 4095L;
                    }
                    byte var17 = 0;
                    int var18 = var15 * 765 + var16;
                    if (class36.field625 == 2) {
                        var17 = 1;
                    }
                    class146.field2749.method30((byte) -36, 63);
                    int var19 = (int) var13;
                    class146.field2749.method326(-1, (var17 << 19) + ((var19 << 20) - -var18));
                }
                if (class247.field4513[96] || class247.field4513[97] || class247.field4513[98] || class247.field4513[99]) {
                    class176.field3548 = true;
                }
                if (~class88.field1638 < -1) {
                    --class88.field1638;
                }
                if (class176.field3548 && ~class88.field1638 >= -1) {
                    ++class67.field1203;
                    class176.field3548 = false;
                    class88.field1638 = 20;
                    class146.field2749.method30((byte) -96, 173);
                    class146.field2749.method331(class207.field3932, 18975);
                    class146.field2749.method305(125, class64.field1173);
                }
                if (class175.field3522 && !class22.field355) {
                    ++class66.field1187;
                    class22.field355 = true;
                    class146.field2749.method30((byte) -118, 130);
                    class146.field2749.method346(255, 1);
                }
                if (!class175.field3522 && class22.field355) {
                    ++class66.field1187;
                    class22.field355 = false;
                    class146.field2749.method30((byte) -100, 130);
                    class146.field2749.method346(255, 0);
                }
                class190.method1330(-25194);
                if (class229.field4286 == 30) {
                    class113.method775(-4197);
                    class48.method367(11449);
                    ++class192.field3702;
                    if (class192.field3702 > 750) {
                        class201.method1382(24);
                    } else {
                        class171.method1216(-11989);
                        class167.method1146((byte) -47);
                        class153.method1048(false);
                        if (class90.field1707 != null) {
                            class189.method1317((byte) -61);
                        }
                        if (~class157.field3019 != -1) {
                            class45.field796 += 20;
                            if (class45.field796 >= 400) {
                                class157.field3019 = 0;
                            }
                        }
                        ++class17.field261;
                        if (class57.field1091 != null) {
                            ++class139.field2575;
                            if (class139.field2575 >= 15) {
                                class200.method1373(65280, class57.field1091);
                                class57.field1091 = null;
                            }
                        }
                        if (class135.field2516 != null) {
                            class200.method1373(65280, class135.field2516);
                            ++class248.field4537;
                            if (~class28.field471 < ~(class219.field4148 + 5) || class219.field4148 - 5 > class28.field471 || ~class239.field4451 < ~(class48.field894 - -5) || ~(class48.field894 + -5) < ~class239.field4451) {
                                class43.field739 = true;
                            }
                            if (~class156.field3018 == -1) {
                                if (class43.field739 && class248.field4537 >= 5) {
                                    if (class225.field4231 == class135.field2516 && class18.field305 != class172.field3335) {
                                        ++class21.field328;
                                        class174 var20 = class135.field2516;
                                        byte var21 = 0;
                                        if (class155.field2993 == 1 && ~var20.field3441 == -207) {
                                            var21 = 1;
                                        }
                                        if (var20.field3390[class172.field3335] <= 0) {
                                            var21 = 0;
                                        }
                                        if (class159.method1072(class80.method530(-881710560, var20), (byte) -52)) {
                                            int var22 = class18.field305;
                                            int var23 = class172.field3335;
                                            var20.field3390[var23] = var20.field3390[var22];
                                            var20.field3476[var23] = var20.field3476[var22];
                                            var20.field3390[var22] = -1;
                                            var20.field3476[var22] = 0;
                                        } else if (~var21 != -2) {
                                            var20.method1246(-125, class172.field3335, class18.field305);
                                        } else {
                                            int var24 = class18.field305;
                                            int var25 = class172.field3335;
                                            while (var24 != var25) {
                                                if (~var25 > ~var24) {
                                                    var20.method1246(-114, var24 + -1, var24);
                                                    --var24;
                                                } else if (var24 < var25) {
                                                    var20.method1246(-124, var24 - -1, var24);
                                                    ++var24;
                                                }
                                            }
                                        }
                                        class146.field2749.method30((byte) -64, 207);
                                        class146.field2749.method351(false, class135.field2516.field3425);
                                        class146.field2749.method314(class18.field305, (byte) -109);
                                        class146.field2749.method327(-85, var21);
                                        class146.field2749.method344(class172.field3335, (byte) -51);
                                    }
                                } else if ((~class203.field3861 == -2 || class234.method1556(class203.field3864 + -1, -1)) && ~class203.field3864 < -3) {
                                    class136.method906(32768);
                                } else if (~class203.field3864 < -1) {
                                    class175.method1259(2, class203.field3864 + -1);
                                }
                                class36.field625 = 0;
                                class139.field2575 = 10;
                                class135.field2516 = null;
                            }
                        }
                        class81.field1467 = 0;
                        class149.field2907 = false;
                        class122.field2219 = null;
                        class174 var26 = class36.field635;
                        class174 var27 = class65.field1177;
                        class65.field1177 = null;
                        class29.field487 = false;
                        class36.field635 = null;
                        while (class43.method279((byte) 31) && ~class81.field1467 > -129) {
                            class242.field4481[class81.field1467] = class137.field2558;
                            class191.field3687[class81.field1467] = class219.field4150;
                            ++class81.field1467;
                        }
                        class90.field1707 = null;
                        if (class43.field723 != -1) {
                            class230.method1535(0, class145.field2727, 0, 0, class222.field4194, 94, class43.field723, 0);
                        }
                        ++class67.field1211;
                        while (true) {
                            class39 var28;
                            class174 var29;
                            class174 var30;
                            do {
                                var28 = (class39) class35.field619.method1615(126);
                                if (var28 == null) {
                                    while (true) {
                                        class39 var31;
                                        class174 var32;
                                        class174 var33;
                                        do {
                                            var31 = (class39) class199.field3812.method1615(124);
                                            if (var31 == null) {
                                                while (true) {
                                                    class39 var34;
                                                    class174 var35;
                                                    class174 var36;
                                                    do {
                                                        var34 = (class39) class74.field1349.method1615(127);
                                                        if (var34 == null) {
                                                            if (class175.field3534 && class90.field1707 == null) {
                                                                class175.field3534 = false;
                                                            }
                                                            if (class179.field3570 != null) {
                                                                class99.method690((byte) -27);
                                                            }
                                                            if (~class114.field2059 != 0) {
                                                                int var37 = class114.field2059;
                                                                int var38 = class90.field1715;
                                                                boolean var39 = class207.method1423(3044, 0, 0, var38, var37, class240.field4458.field4089[0], 0, 0, 0, true, 0, class240.field4458.field4143[0]);
                                                                class114.field2059 = -1;
                                                                if (var39) {
                                                                    class147.field2759 = class226.field4241;
                                                                    class45.field796 = 0;
                                                                    class155.field2999 = class172.field3341;
                                                                    class157.field3019 = 1;
                                                                }
                                                            }
                                                            class50.method372((byte) -95);
                                                            if (class65.field1177 != var27) {
                                                                if (var27 != null) {
                                                                    class200.method1373(65280, var27);
                                                                }
                                                                if (class65.field1177 != null) {
                                                                    class200.method1373(65280, class65.field1177);
                                                                }
                                                            }
                                                            if (class36.field635 != var26 && ~class46.field859 == ~class138.field2565) {
                                                                if (var26 != null) {
                                                                    class200.method1373(65280, var26);
                                                                }
                                                                if (class36.field635 != null) {
                                                                    class200.method1373(65280, class36.field635);
                                                                }
                                                            }
                                                            if (class36.field635 != null) {
                                                                if (~class138.field2565 < ~class46.field859) {
                                                                    ++class46.field859;
                                                                    if (~class46.field859 == ~class138.field2565) {
                                                                        class200.method1373(65280, class36.field635);
                                                                    }
                                                                }
                                                            } else if (~class46.field859 < -1) {
                                                                --class46.field859;
                                                            }
                                                            class180.method1285(false);
                                                            if (class179.field3569) {
                                                                class239.method1579((byte) -128);
                                                            }
                                                            for (int var40 = 0; var40 < 5; ++var40) {
                                                                int var10002 = class190.field3676[var40]++;
                                                            }
                                                            int var41 = class147.method986(2);
                                                            int var42 = class105.method731(0);
                                                            if (~var41 < -4501 && ~var42 < -4501) {
                                                                class105.field1912 = 250;
                                                                ++class36.field626;
                                                                class151.method1033((byte) -113, 4000);
                                                                class146.field2749.method30((byte) -89, 226);
                                                            }
                                                            ++class111.field2029;
                                                            ++class77.field1384;
                                                            ++class144.field2709;
                                                            if (class111.field2029 > 500) {
                                                                class111.field2029 = 0;
                                                                int var43 = (int) (8.0D * Math.random());
                                                                if (~(var43 & 4) == -5) {
                                                                    class98.field1797 += class29.field481;
                                                                }
                                                                if ((var43 & 2) == 2) {
                                                                    class33.field536 += class232.field4359;
                                                                }
                                                                if ((1 & var43) == 1) {
                                                                    class223.field4201 += class136.field2533;
                                                                }
                                                            }
                                                            if (~class77.field1384 < -501) {
                                                                class77.field1384 = 0;
                                                                int var44 = (int) (8.0D * Math.random());
                                                                if ((2 & var44) == 2) {
                                                                    class65.field1185 += class161.field3113;
                                                                }
                                                                if (~(1 & var44) == -2) {
                                                                    class52.field943 += class88.field1644;
                                                                }
                                                            }
                                                            if (~class65.field1185 > 19) {
                                                                class161.field3113 = 1;
                                                            }
                                                            if (~class65.field1185 < -11) {
                                                                class161.field3113 = -1;
                                                            }
                                                            if (class33.field536 < -55) {
                                                                class232.field4359 = 2;
                                                            }
                                                            if (class52.field943 < -60) {
                                                                class88.field1644 = 2;
                                                            }
                                                            if (class98.field1797 < -40) {
                                                                class29.field481 = 1;
                                                            }
                                                            if (~class33.field536 < -56) {
                                                                class232.field4359 = -2;
                                                            }
                                                            if (~class98.field1797 < -41) {
                                                                class29.field481 = -1;
                                                            }
                                                            if (~class52.field943 < -61) {
                                                                class88.field1644 = -2;
                                                            }
                                                            if (class223.field4201 < -50) {
                                                                class136.field2533 = 2;
                                                            }
                                                            if (class223.field4201 > 50) {
                                                                class136.field2533 = -2;
                                                            }
                                                            if (~class144.field2709 < -51) {
                                                                class146.field2749.method30((byte) -69, 19);
                                                                ++class31.field498;
                                                            }
                                                            try {
                                                                if (class33.field556 != null && class146.field2749.field831 > 0) {
                                                                    class33.field556.method913(class146.field2749.field831, 0, class146.field2749.field842, 17492);
                                                                    class146.field2749.field831 = 0;
                                                                    class144.field2709 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var45) {
                                                                class201.method1382(100);
                                                                return;
                                                            }
                                                        }
                                                        var35 = var34.field678;
                                                        if (~var35.field3408 > -1) {
                                                            break;
                                                        }
                                                        var36 = class239.method1581(-64, var35.field3506);
                                                    } while (var36 == null || var36.field3467 == null || ~var35.field3408 <= ~var36.field3467.length || var36.field3467[var35.field3408] != var35);
                                                    class200.method1375(var34, -876775538);
                                                }
                                            }
                                            var32 = var31.field678;
                                            if (var32.field3408 < 0) {
                                                break;
                                            }
                                            var33 = class239.method1581(-64, var32.field3506);
                                        } while (var33 == null || var33.field3467 == null || ~var33.field3467.length >= ~var32.field3408 || var33.field3467[var32.field3408] != var32);
                                        class200.method1375(var31, -876775538);
                                    }
                                }
                                var29 = var28.field678;
                                if (var29.field3408 < 0) {
                                    break;
                                }
                                var30 = class239.method1581(-64, var29.field3506);
                            } while (var30 == null || var30.field3467 == null || var30.field3467.length <= var29.field3408 || var30.field3467[var29.field3408] != var29);
                            class200.method1375(var28, -876775538);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method792(byte arg0, Component arg1) {
        arg1.removeMouseListener(class43.field732);
        arg1.removeMouseMotionListener(class43.field732);
        arg1.removeFocusListener(class43.field732);
        class46.field807 = 0;
        ++field2096;
        if (arg0 > -53) {
            field2100 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(IB)[[I")
    public final int[][] method7(int arg0, byte arg1) {
        ++field2098;
        int[][] var3 = super.field364.method1541(true, arg0);
        if (arg1 != 13) {
            field2106 = null;
        }
        if (super.field364.field4312) {
            int[][] var4 = this.method121(0, (byte) -125, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class70.field1276; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 <= ~this.field2099) {
                    if (~this.field2090 <= ~var12) {
                        var10[var11] = var12;
                    } else {
                        var10[var11] = this.field2090;
                    }
                } else {
                    var10[var11] = this.field2099;
                }
                if (this.field2099 <= var13) {
                    if (~this.field2090 > ~var13) {
                        var8[var11] = this.field2090;
                    } else {
                        var8[var11] = var13;
                    }
                } else {
                    var8[var11] = this.field2099;
                }
                if (var14 >= this.field2099) {
                    if (var14 > this.field2090) {
                        var9[var11] = this.field2090;
                    } else {
                        var9[var11] = var14;
                    }
                } else {
                    var9[var11] = this.field2099;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field369 = ~arg0.method347(26119) == -2;
                }
            } else {
                this.field2090 = arg0.method301(arg1 + 97);
            }
        } else {
            this.field2099 = arg0.method301(55);
        }
        if (arg1 != -3) {
            this.method7(59, (byte) -115);
        }
        ++field2107;
    }
}
