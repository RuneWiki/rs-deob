import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class211 {

    @OriginalMember(owner = "client!client", name = "V", descriptor = "[I")
    public static int[] field720 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field715 = 0;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static volatile int field728 = 0;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
    public static boolean field736;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ljk;IIIIIII)V")
    public static final void method316(class297[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class297 var9 = arg0[var8];
            if (var9 != null && var9.field4542 == arg1 && (!var9.field4647 || var9.field4553 == 0 || var9.field4694 || method333(var9).field4515 != 0 || class260.field3988 == var9 || var9.field4600 == 1338) && (!var9.field4647 || !method330(var9))) {
                int var10 = var9.field4700 + arg6;
                int var11 = var9.field4578 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field4553 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field4627 + var10;
                    int var17 = var9.field4531 + var11;
                    if (var9.field4553 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class223.field3464 == var9) {
                    class68.field1119 = true;
                    class210.field3145 = var10;
                    class169.field2481 = var11;
                }
                if (!var9.field4647 || var12 < var14 && var13 < var15) {
                    if (var9.field4553 == 0) {
                        if (!var9.field4647 && method330(var9) && class148.field2144 != var9) {
                            continue;
                        }
                        if (var9.field4538 && class12.field172 >= var12 && class105.field1542 >= var13 && class12.field172 < var14 && class105.field1542 < var15) {
                            for (class43 var18 = (class43) class122.field1813.method1894((byte) -90); var18 != null; var18 = (class43) class122.field1813.method1886(-6)) {
                                if (var18.field761) {
                                    var18.method1193(123);
                                    var18.field750.field4680 = false;
                                }
                            }
                            if (class8.field92 == 0) {
                                class223.field3464 = null;
                                class260.field3988 = null;
                            }
                            class97.field1438 = 0;
                        }
                    }
                    if (var9.field4647) {
                        boolean var19;
                        if (class12.field172 >= var12 && class105.field1542 >= var13 && class12.field172 < var14 && class105.field1542 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class215.field3304 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class295.field4482 == 1 && class157.field2303 >= var12 && class87.field1317 >= var13 && class157.field2303 < var14 && class87.field1317 < var15) {
                            var21 = true;
                        }
                        if (var9.field4541 != null) {
                            for (int var22 = 0; var22 < var9.field4541.length; var22++) {
                                if (class293.field4451[var9.field4541[var22]]) {
                                    if (var9.field4621 == null || class120.field1794 >= var9.field4621[var22]) {
                                        byte var23 = var9.field4633[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class293.field4451[86] && !class293.field4451[82] && !class293.field4451[81]) && ((var23 & 0x2) == 0 || class293.field4451[86]) && ((var23 & 0x1) == 0 || class293.field4451[82]) && ((var23 & 0x4) == 0 || class293.field4451[81])) {
                                            class231.method1572("", var9.field4683, var22 + 1, -1, (byte) -107);
                                            int var24 = var9.field4696[var22];
                                            if (var9.field4621 == null) {
                                                var9.field4621 = new int[var9.field4541.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field4621[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field4621[var22] = class120.field1794 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field4621 != null) {
                                    var9.field4621[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class177.method1168(class157.field2303 - var10, -101, class87.field1317 - var11, var9);
                        }
                        if (class223.field3464 != null && class223.field3464 != var9 && var19 && method333(var9).method1956(-80)) {
                            class34.field619 = var9;
                        }
                        if (class260.field3988 == var9) {
                            class108.field1582 = true;
                            class109.field1629 = var10;
                            class109.field1601 = var11;
                        }
                        if (var9.field4694 || var9.field4600 != 0) {
                            if (var19 && class136.field1984 != 0 && var9.field4589 != null) {
                                class43 var25 = new class43();
                                var25.field761 = true;
                                var25.field750 = var9;
                                var25.field762 = class136.field1984;
                                var25.field767 = var9.field4589;
                                class122.field1813.method1881(var25, (byte) -56);
                            }
                            if (class223.field3464 != null || class211.field3177 != null || class66.field1093 || var9.field4600 != 1400 && class97.field1438 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field4600 != 0) {
                                if (var9.field4600 == 1337) {
                                    class174.field2550 = var9;
                                    continue;
                                }
                                if (var9.field4600 == 1338) {
                                    if (var21) {
                                        class261.field4024 = class157.field2303 - var10;
                                        class104.field1537 = class87.field1317 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field4600 == 1400) {
                                    class244.field3773 = var9;
                                    if (var21) {
                                        if (class293.field4451[82] && class149.field2165 > 0) {
                                            int var26 = (int) ((double) (class157.field2303 - var10 - var9.field4627 / 2) * 2.0D / (double) class78.field1243);
                                            int var27 = (int) ((double) (class87.field1317 - var11 - var9.field4531 / 2) * 2.0D / (double) class78.field1243);
                                            int var28 = class220.field3433 + var26;
                                            int var29 = class12.field171 + var27;
                                            int var30 = class141.field2029 + var28;
                                            int var31 = class235.field3619 + class67.field1114 - var29 - 1;
                                            class283 var32 = class3.method40(0);
                                            int[] var33 = var32.method1875((byte) -84, var31, var30);
                                            if (var33 != null) {
                                                class245.method1671(-71, var33[2], var33[0], var33[1]);
                                                class64.method520((byte) 16);
                                            }
                                            continue;
                                        }
                                        class97.field1438 = 1;
                                        class287.field4394 = class12.field172;
                                        class234.field3609 = class105.field1542;
                                        continue;
                                    }
                                    if (var20 && class97.field1438 > 0) {
                                        if (class97.field1438 == 1 && (class287.field4394 != class12.field172 || class234.field3609 != class105.field1542)) {
                                            class100.field1453 = class220.field3433;
                                            class173.field2531 = class12.field171;
                                            class97.field1438 = 2;
                                        }
                                        if (class97.field1438 == 2) {
                                            class5.method53(16571, (int) ((double) (class287.field4394 - class12.field172) * 2.0D / (double) class44.field777) + class100.field1453);
                                            class91.method689((int) ((double) (class234.field3609 - class105.field1542) * 2.0D / (double) class44.field777) + class173.field2531, -109);
                                        }
                                        continue;
                                    }
                                    class97.field1438 = 0;
                                    continue;
                                }
                                if (var9.field4600 == 1401) {
                                    if (var20) {
                                        class90.method680(var9.field4531, class105.field1542 - var11, var9.field4627, class12.field172 - var10, -1);
                                    }
                                    continue;
                                }
                                if (var9.field4600 == 1402) {
                                    class297.method1979((byte) -80, var9);
                                    continue;
                                }
                            }
                            if (!var9.field4525 && var21) {
                                var9.field4525 = true;
                                if (var9.field4649 != null) {
                                    class43 var34 = new class43();
                                    var34.field761 = true;
                                    var34.field750 = var9;
                                    var34.field757 = class157.field2303 - var10;
                                    var34.field762 = class87.field1317 - var11;
                                    var34.field767 = var9.field4649;
                                    class122.field1813.method1881(var34, (byte) -56);
                                }
                            }
                            if (var9.field4525 && var20 && var9.field4698 != null) {
                                class43 var35 = new class43();
                                var35.field761 = true;
                                var35.field750 = var9;
                                var35.field757 = class12.field172 - var10;
                                var35.field762 = class105.field1542 - var11;
                                var35.field767 = var9.field4698;
                                class122.field1813.method1881(var35, (byte) -56);
                            }
                            if (var9.field4525 && !var20) {
                                var9.field4525 = false;
                                if (var9.field4558 != null) {
                                    class43 var36 = new class43();
                                    var36.field761 = true;
                                    var36.field750 = var9;
                                    var36.field757 = class12.field172 - var10;
                                    var36.field762 = class105.field1542 - var11;
                                    var36.field767 = var9.field4558;
                                    class43.field764.method1881(var36, (byte) -56);
                                }
                            }
                            if (var20 && var9.field4535 != null) {
                                class43 var37 = new class43();
                                var37.field761 = true;
                                var37.field750 = var9;
                                var37.field757 = class12.field172 - var10;
                                var37.field762 = class105.field1542 - var11;
                                var37.field767 = var9.field4535;
                                class122.field1813.method1881(var37, (byte) -56);
                            }
                            if (!var9.field4680 && var19) {
                                var9.field4680 = true;
                                if (var9.field4693 != null) {
                                    class43 var38 = new class43();
                                    var38.field761 = true;
                                    var38.field750 = var9;
                                    var38.field757 = class12.field172 - var10;
                                    var38.field762 = class105.field1542 - var11;
                                    var38.field767 = var9.field4693;
                                    class122.field1813.method1881(var38, (byte) -56);
                                }
                            }
                            if (var9.field4680 && var19 && var9.field4559 != null) {
                                class43 var39 = new class43();
                                var39.field761 = true;
                                var39.field750 = var9;
                                var39.field757 = class12.field172 - var10;
                                var39.field762 = class105.field1542 - var11;
                                var39.field767 = var9.field4559;
                                class122.field1813.method1881(var39, (byte) -56);
                            }
                            if (var9.field4680 && !var19) {
                                var9.field4680 = false;
                                if (var9.field4607 != null) {
                                    class43 var40 = new class43();
                                    var40.field761 = true;
                                    var40.field750 = var9;
                                    var40.field757 = class12.field172 - var10;
                                    var40.field762 = class105.field1542 - var11;
                                    var40.field767 = var9.field4607;
                                    class43.field764.method1881(var40, (byte) -56);
                                }
                            }
                            if (var9.field4566 != null) {
                                class43 var41 = new class43();
                                var41.field750 = var9;
                                var41.field767 = var9.field4566;
                                class236.field3632.method1881(var41, (byte) -56);
                            }
                            if (var9.field4643 != null && class37.field645 > var9.field4575) {
                                if (var9.field4552 == null || class37.field645 - var9.field4575 > 32) {
                                    class43 var46 = new class43();
                                    var46.field750 = var9;
                                    var46.field767 = var9.field4643;
                                    class122.field1813.method1881(var46, (byte) -56);
                                } else {
                                    label572: for (int var42 = var9.field4575; var42 < class37.field645; var42++) {
                                        int var43 = class50.field814[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field4552.length; var44++) {
                                            if (var9.field4552[var44] == var43) {
                                                class43 var45 = new class43();
                                                var45.field750 = var9;
                                                var45.field767 = var9.field4643;
                                                class122.field1813.method1881(var45, (byte) -56);
                                                break label572;
                                            }
                                        }
                                    }
                                }
                                var9.field4575 = class37.field645;
                            }
                            if (var9.field4568 != null && class3.field44 > var9.field4651) {
                                if (var9.field4549 == null || class3.field44 - var9.field4651 > 32) {
                                    class43 var51 = new class43();
                                    var51.field750 = var9;
                                    var51.field767 = var9.field4568;
                                    class122.field1813.method1881(var51, (byte) -56);
                                } else {
                                    label548: for (int var47 = var9.field4651; var47 < class3.field44; var47++) {
                                        int var48 = class231.field3585[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field4549.length; var49++) {
                                            if (var9.field4549[var49] == var48) {
                                                class43 var50 = new class43();
                                                var50.field750 = var9;
                                                var50.field767 = var9.field4568;
                                                class122.field1813.method1881(var50, (byte) -56);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field4651 = class3.field44;
                            }
                            if (var9.field4655 != null && class213.field3278 > var9.field4669) {
                                if (var9.field4603 == null || class213.field3278 - var9.field4669 > 32) {
                                    class43 var56 = new class43();
                                    var56.field750 = var9;
                                    var56.field767 = var9.field4655;
                                    class122.field1813.method1881(var56, (byte) -56);
                                } else {
                                    label524: for (int var52 = var9.field4669; var52 < class213.field3278; var52++) {
                                        int var53 = class37.field647[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field4603.length; var54++) {
                                            if (var9.field4603[var54] == var53) {
                                                class43 var55 = new class43();
                                                var55.field750 = var9;
                                                var55.field767 = var9.field4655;
                                                class122.field1813.method1881(var55, (byte) -56);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field4669 = class213.field3278;
                            }
                            if (var9.field4678 != null && class32.field574 > var9.field4661) {
                                if (var9.field4692 == null || class32.field574 - var9.field4661 > 32) {
                                    class43 var61 = new class43();
                                    var61.field750 = var9;
                                    var61.field767 = var9.field4678;
                                    class122.field1813.method1881(var61, (byte) -56);
                                } else {
                                    label500: for (int var57 = var9.field4661; var57 < class32.field574; var57++) {
                                        int var58 = class21.field357[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field4692.length; var59++) {
                                            if (var9.field4692[var59] == var58) {
                                                class43 var60 = new class43();
                                                var60.field750 = var9;
                                                var60.field767 = var9.field4678;
                                                class122.field1813.method1881(var60, (byte) -56);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field4661 = class32.field574;
                            }
                            if (var9.field4610 != null && class105.field1558 > var9.field4580) {
                                if (var9.field4543 == null || class105.field1558 - var9.field4580 > 32) {
                                    class43 var66 = new class43();
                                    var66.field750 = var9;
                                    var66.field767 = var9.field4610;
                                    class122.field1813.method1881(var66, (byte) -56);
                                } else {
                                    label476: for (int var62 = var9.field4580; var62 < class105.field1558; var62++) {
                                        int var63 = class181.field2641[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field4543.length; var64++) {
                                            if (var9.field4543[var64] == var63) {
                                                class43 var65 = new class43();
                                                var65.field750 = var9;
                                                var65.field767 = var9.field4610;
                                                class122.field1813.method1881(var65, (byte) -56);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field4580 = class105.field1558;
                            }
                            if (class109.field1592 > var9.field4602 && var9.field4582 != null) {
                                class43 var67 = new class43();
                                var67.field750 = var9;
                                var67.field767 = var9.field4582;
                                class122.field1813.method1881(var67, (byte) -56);
                            }
                            if (class226.field3533 > var9.field4602 && var9.field4635 != null) {
                                class43 var68 = new class43();
                                var68.field750 = var9;
                                var68.field767 = var9.field4635;
                                class122.field1813.method1881(var68, (byte) -56);
                            }
                            if (class211.field3185 > var9.field4602 && var9.field4634 != null) {
                                class43 var69 = new class43();
                                var69.field750 = var9;
                                var69.field767 = var9.field4634;
                                class122.field1813.method1881(var69, (byte) -56);
                            }
                            if (class140.field2023 > var9.field4602 && var9.field4545 != null) {
                                class43 var70 = new class43();
                                var70.field750 = var9;
                                var70.field767 = var9.field4545;
                                class122.field1813.method1881(var70, (byte) -56);
                            }
                            if (class12.field173 > var9.field4602 && var9.field4684 != null) {
                                class43 var71 = new class43();
                                var71.field750 = var9;
                                var71.field767 = var9.field4684;
                                class122.field1813.method1881(var71, (byte) -56);
                            }
                            var9.field4602 = class169.field2494;
                            if (var9.field4533 != null) {
                                for (int var72 = 0; var72 < class4.field56; var72++) {
                                    class43 var73 = new class43();
                                    var73.field750 = var9;
                                    var73.field759 = class5.field61[var72];
                                    var73.field752 = class295.field4478[var72];
                                    var73.field767 = var9.field4533;
                                    class122.field1813.method1881(var73, (byte) -56);
                                }
                            }
                            if (class160.field2324 && var9.field4585 != null) {
                                class43 var74 = new class43();
                                var74.field750 = var9;
                                var74.field767 = var9.field4585;
                                class122.field1813.method1881(var74, (byte) -56);
                            }
                        }
                    }
                    if (!var9.field4647 && class223.field3464 == null && class211.field3177 == null && !class66.field1093) {
                        if ((var9.field4616 >= 0 || var9.field4671 != 0) && class12.field172 >= var12 && class105.field1542 >= var13 && class12.field172 < var14 && class105.field1542 < var15) {
                            if (var9.field4616 >= 0) {
                                class148.field2144 = arg0[var9.field4616];
                            } else {
                                class148.field2144 = var9;
                            }
                        }
                        if (var9.field4553 == 8 && class12.field172 >= var12 && class105.field1542 >= var13 && class12.field172 < var14 && class105.field1542 < var15) {
                            class245.field3820 = var9;
                        }
                        if (var9.field4675 > var9.field4531) {
                            class164.method1122(-81, class105.field1542, var9.field4675, var9.field4627 + var10, var11, var9, class12.field172, var9.field4531);
                        }
                    }
                    if (var9.field4553 == 0) {
                        method316(arg0, var9.field4683, var12, var13, var14, var15, var10 - var9.field4656, var11 - var9.field4594);
                        if (var9.field4646 != null) {
                            method316(var9.field4646, var9.field4683, var12, var13, var14, var15, var10 - var9.field4656, var11 - var9.field4594);
                        }
                        class123 var75 = (class123) class124.field1833.method306((long) var9.field4683, 16216);
                        if (var75 != null) {
                            class179.method1178(var13, var12, var11, -10562, var75.field1823, var10, var14, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public static void method317(byte arg0) {
        if (arg0 < 66) {
            method323(7L, -14);
        }
        field720 = null;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method318(int arg0) {
        field735++;
        class262.method1776(765);
        class142.field2042 = new class173();
        class18.field329 = new class164();
        if (class138.field1999 != 0) {
            class297.field4571 = new byte[50][];
        }
        class100.method733(class217.field3338, (byte) 52);
        if (class146.field2119 == 0) {
            class113.field1737 = this.getCodeBase().getHost();
            class145.field2109 = 443;
            class258.field3959 = 43594;
        } else if (class146.field2119 == 1) {
            class113.field1737 = this.getCodeBase().getHost();
            class145.field2109 = class266.field4151 + 50000;
            class258.field3959 = class266.field4151 + 40000;
        } else if (class146.field2119 == 2) {
            class258.field3959 = class266.field4151 + 40000;
            class145.field2109 = class266.field4151 + 50000;
            class113.field1737 = "127.0.0.1";
        }
        if (class246.field3836 == 1) {
            class137.field1995 = class172.field2524;
            class222.field3461 = class278.field4290;
            class172.field2521 = true;
            class206.field3086 = class169.field2483;
            class23.field380 = class22.field360;
        } else {
            class206.field3086 = class112.field1713;
            class222.field3461 = class136.field1988;
            class137.field1995 = class75.field1204;
            class23.field380 = class85.field1303;
        }
        if (class26.field514 == 3 && class146.field2119 != 2) {
            class258.field3964 = class266.field4151;
        }
        class147.field2138 = class113.field1737;
        class110.field1662 = class258.field3959;
        class91.field1378 = class176.field2572 = class164.field2395 = class135.field1977 = new short[256];
        class223.field3474 = class110.field1662;
        class163.field2374 = class258.field3959;
        class178.field2605 = class145.field2109;
        class90.method682((byte) -93);
        class21.method150(class297.field4569, 55);
        class133.method915(arg0 ^ 0x60, class297.field4569);
        class265.field4141 = class90.method685(16560);
        if (class265.field4141 != null) {
            class265.field4141.method1653(class297.field4569, -1);
        }
        class13.field193 = class26.field514;
        try {
            if (class217.field3338.field504 != null) {
                class136.field1982 = new class142(class217.field3338.field504, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class285.field4375[var2] = new class142(class217.field3338.field508[var2], 6000, 0);
                }
                class82.field1271 = new class142(class217.field3338.field507, 6000, 0);
                class209.field3129 = new class222(255, class136.field1982, class82.field1271, 500000);
                class185.field2703 = new class142(class217.field3338.field501, 24, 0);
                class217.field3338.field501 = null;
                class217.field3338.field504 = null;
                class217.field3338.field508 = null;
                class217.field3338.field507 = null;
            }
            if (arg0 != 24) {
                this.method325((byte) 28);
            }
        } catch (IOException var3) {
            class82.field1271 = null;
            class209.field3129 = null;
            class136.field1982 = null;
            class185.field2703 = null;
        }
        class47.field799 = class285.field4372;
        if (class146.field2119 != 0) {
            class151.field2198 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjk;)Ljk;")
    public static final class297 method319(boolean arg0, class297 arg1) {
        field734++;
        if (arg1.field4542 != -1) {
            return class151.method1023(-30464, arg1.field4542);
        }
        int var2 = arg1.field4683 >>> 16;
        class233 var3 = new class233(class124.field1833);
        for (class123 var4 = (class123) var3.method1584(0); var4 != null; var4 = (class123) var3.method1586(0)) {
            if (var4.field1823 == var2) {
                return class151.method1023(-30464, (int) var4.field2628);
            }
        }
        if (arg0) {
            field728 = 67;
        }
        return null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method320(byte arg0) {
        field718++;
        if (class42.field742 == 1000) {
            return;
        }
        long var2 = class194.method1308(arg0 ^ 0x12) / 1000000L - class212.field3258;
        if (arg0 != 19) {
            this.method322(-22);
        }
        class212.field3258 = class194.method1308(1) / 1000000L;
        boolean var4 = class106.method775(true);
        if (var4 && class233.field3601 && class182.field2648 != null) {
            class182.field2648.method808((byte) -93);
        }
        if ((class42.field742 == 30 || class42.field742 == 10) && (class197.field2980 || class265.field4146 != 0L && class265.field4146 < class257.method1736(arg0 + 14342))) {
            class297.method1978(class227.method1552(false), class197.field2980, -18786, class145.field2097, class49.field811);
        }
        if (class247.field3838 == null) {
            Container var5;
            if (class247.field3838 != null) {
                var5 = class247.field3838;
            } else if (class167.field2459 == null) {
                var5 = class217.field3338.field505;
            } else {
                var5 = class167.field2459;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class167.field2459 == var5) {
                Insets var8 = class167.field2459.getInsets();
                var6 -= var8.left + var8.right;
                var7 -= var8.top + var8.bottom;
            }
            if (class145.field2099 != var6 || class23.field385 != var7) {
                if (class26.field512.startsWith("mac")) {
                    class23.field385 = var7;
                    class145.field2099 = var6;
                } else {
                    class262.method1776(arg0 + 746);
                }
                class265.field4146 = class257.method1736(arg0 + 14342) + 500L;
            }
        }
        boolean var9 = false;
        if (class100.field1456) {
            class100.field1456 = false;
            var9 = true;
        }
        if (var9) {
            class10.method76(736);
        }
        if (class42.field742 == 0) {
            class205.method1359(var9, class297.field4660, class149.field2160, 119, (Color) null);
        } else if (class42.field742 == 5) {
            class221.method1518(arg0 - 28298, false, class105.field1555);
        } else if (class42.field742 == 10) {
            class135.method927(56);
        } else if (class42.field742 == 25 || class42.field742 == 28) {
            if (class109.field1606 == 1) {
                if (class108.field1584 < class17.field310) {
                    class108.field1584 = class17.field310;
                }
                int var11 = (class108.field1584 - class17.field310) * 50 / class108.field1584;
                class226.method1550(false, false, class295.field4491 + "<br>(" + var11 + "%)");
            } else if (class109.field1606 == 2) {
                if (class251.field3891 < class259.field3968) {
                    class251.field3891 = class259.field3968;
                }
                int var10 = ((class251.field3891 - class259.field3968) * 50 / class251.field3891) + 50;
                class226.method1550(false, false, class295.field4491 + "<br>(" + var10 + "%)");
            } else {
                class226.method1550(false, false, class295.field4491);
            }
        } else if (class42.field742 == 30) {
            class117.method828((byte) 84, var2);
        } else if (class42.field742 == 40) {
            class226.method1550(false, false, class147.field2133 + "<br>" + class212.field3257);
        }
        if ((class42.field742 == 30 || class42.field742 == 10) && class275.field4250 == 0 && !var9) {
            try {
                Graphics var12 = class297.field4569.getGraphics();
                for (int var13 = 0; var13 < class123.field1818; var13++) {
                    if (class285.field4371[var13]) {
                        class148.field2148.method695(class150.field2189[var13], class247.field3848[var13], var12, class188.field2802[var13], (byte) 31, class166.field2453[var13]);
                        class285.field4371[var13] = false;
                    }
                }
            } catch (Exception var17) {
                class297.field4569.repaint();
            }
        } else if (class42.field742 != 0) {
            try {
                Graphics var14 = class297.field4569.getGraphics();
                class148.field2148.method696(0, 0, var14, true);
                for (int var15 = 0; var15 < class123.field1818; var15++) {
                    class285.field4371[var15] = false;
                }
            } catch (Exception var16) {
                class297.field4569.repaint();
            }
        }
        if (class211.field3182) {
            class24.method161((byte) 123);
        }
        if (class170.field2503 && class42.field742 == 10 && class184.field2677 != -1) {
            class170.field2503 = false;
            class58.method479(class217.field3338, -230);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method321(int arg0, int arg1) {
        class261.field4020 = null;
        class18.field329.field2415 = arg1;
        class54.field877 = null;
        class18.field329.field2416++;
        class145.field2092 = arg0;
        field719++;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method322(int arg0) {
        field716++;
        if (class18.field329.field2416 > class75.field1201) {
            if (class223.field3474 == class163.field2374) {
                class223.field3474 = class178.field2605;
            } else {
                class223.field3474 = class163.field2374;
            }
            class109.field1612 = (class18.field329.field2416 * 50 - 50) * 5;
            if (class109.field1612 > 3000) {
                class109.field1612 = 3000;
            }
            if (class18.field329.field2416 >= 2 && class18.field329.field2415 == 6) {
                this.method1387("js5connect_outofdate", arg0 ^ 0xFFFFDC63);
                class42.field742 = 1000;
                return;
            }
            if (class18.field329.field2416 >= 4 && class18.field329.field2415 == -1) {
                this.method1387("js5crc", 91);
                class42.field742 = 1000;
                return;
            }
            if (class18.field329.field2416 >= 4 && (class42.field742 == 0 || class42.field742 == 5)) {
                if (class18.field329.field2415 == 7 || class18.field329.field2415 == 9) {
                    this.method1387("js5connect_full", -116);
                } else if (class18.field329.field2415 <= 0) {
                    this.method1387("js5io", 70);
                } else {
                    this.method1387("js5connect", 123);
                }
                class42.field742 = 1000;
                return;
            }
        }
        if (arg0 != 9184) {
            main((String[]) null);
        }
        class75.field1201 = class18.field329.field2416;
        if (class109.field1612 > 0) {
            class109.field1612--;
            return;
        }
        try {
            if (class145.field2092 == 0) {
                class54.field877 = class217.field3338.method187(class147.field2138, class223.field3474, arg0 ^ 0xFFFFDC50);
                class145.field2092++;
            }
            if (class145.field2092 == 1) {
                if (class54.field877.field713 == 2) {
                    this.method321(0, 1000);
                    return;
                }
                if (class54.field877.field713 == 1) {
                    class145.field2092++;
                }
            }
            if (class145.field2092 == 2) {
                class261.field4020 = new class253((Socket) class54.field877.field709, class217.field3338);
                class54 var2 = new class54(5);
                var2.method437(true, 15);
                var2.method453((byte) 97, 540);
                class261.field4020.method1715(var2.field848, 105, 0, 5);
                class145.field2092++;
                class295.field4490 = class257.method1736(14361);
            }
            if (class145.field2092 == 3) {
                if (class42.field742 == 0 || class42.field742 == 5 || class261.field4020.method1725(0) > 0) {
                    int var3 = class261.field4020.method1726((byte) 127);
                    if (var3 != 0) {
                        this.method321(0, var3);
                        return;
                    }
                    class145.field2092++;
                } else if ((class257.method1736(14361) - class295.field4490) > 30000L) {
                    this.method321(0, 1001);
                    return;
                }
            }
            if (class145.field2092 == 4) {
                boolean var4 = class42.field742 == 5 || class42.field742 == 10 || class42.field742 == 28;
                class18.field329.method1112((byte) -42, !var4, class261.field4020);
                class54.field877 = null;
                class145.field2092 = 0;
                class261.field4020 = null;
            }
        } catch (IOException var5) {
            this.method321(0, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
    public static final void method323(long arg0, int arg1) {
        field724++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class92.method693(arg0 - 1L, 0);
            class92.method693(1L, 0);
        } else {
            class92.method693(arg0, 0);
        }
        if (arg1 > -112) {
            field720 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method324(int arg0) {
        field723++;
        method317((byte) 86);
        class283.method1877((byte) 60);
        class240.method1645(-30);
        class159.method1074(-104);
        class50.method379(arg0 - 3);
        class49.method376((byte) -128);
        class211.method1392(-32415);
        class69.method548(-18701);
        class249.method1704((byte) -81);
        class196.method1323(8);
        class130.method895(arg0 + 124);
        class54.method418(63);
        class164.method1109(200);
        class173.method1149(arg0 + 99999999);
        class84.method646(-3);
        class61.method506(10432);
        class237.method1608(arg0 - 9648);
        class142.method966(arg0 + 12);
        class222.method1524(arg0);
        class139.method947((byte) 113);
        class87.method662(true);
        class225.method1537(-116);
        class78.method620(true);
        class297.method1982((byte) 54);
        class224.method1531(arg0 + 4228);
        class284.method1884(arg0 ^ 0xFFFFF8AC);
        class256.method1733((byte) -94);
        class287.method1904(2);
        class160.method1079(arg0 - 30173);
        class212.method1433(16);
        class111.method805(arg0 ^ 0x61D5);
        class261.method1769((byte) -41);
        class220.method1503(arg0 + 97);
        class25.method170(-21130);
        class201.method1338(-20192);
        class188.method1247((byte) 119);
        class184.method1205(-12315);
        class189.method1261((byte) -90);
        class123.method867(~arg0);
        class296.method1960((byte) -92);
        class181.method1191((byte) 104);
        class195.method1319((byte) 88);
        class162.method1091(69);
        class198.method1327(arg0 ^ 0x25);
        class152.method1030(-106);
        class85.method653(false);
        class209.method1378((byte) 90);
        class91.method691((byte) -112);
        class226.method1547((byte) 59);
        class140.method950((byte) 2);
        class112.method812((byte) 17);
        class82.method639(arg0 - 66);
        class18.method128(125);
        class148.method1006((byte) -89);
        class64.method521((byte) 57);
        class172.method1148((byte) 29);
        class51.method388(arg0 - 112);
        class19.method138(arg0 ^ 0xFFFFFF9B);
        class208.method1373(0);
        class219.method1499();
        class122.method863(true);
        class15.method100(-10);
        class263.method1792();
        class156.method1058(-1);
        class9.method70((byte) 127);
        class180.method1184(false);
        class244.method1659(8);
        class8.method67(-128);
        class177.method1170((byte) -119);
        class227.method1555(arg0 + 124);
        class192.method1280();
        class154.method1046(96);
        class1.method3((byte) 126);
        class94.method705();
        class207.method1370(-104);
        class151.method1024(29915);
        class21.method147(-121);
        class158.method1070();
        class146.method998(true);
        class6.method59((byte) -117);
        class72.method574();
        class223.method1525((byte) 125);
        class106.method772((byte) 105);
        class260.method1752(3807);
        class259.method1745(arg0 - 1);
        class89.method674((byte) 104);
        class108.method783((byte) -70);
        class137.method931((byte) -66);
        class131.method900(arg0 ^ 0x57);
        class134.method920(-32280);
        class141.method953(true);
        class45.method358((byte) -58);
        class110.method796(-104);
        class104.method761(arg0 + 128);
        class243.method1654(-113);
        class58.method476(107);
        class204.method1355();
        class286.method1898(-127);
        class186.method1218(0);
        class245.method1679(arg0 ^ 0xFFFFFFAB);
        class229.method1560(-612062672);
        class199.method1328((byte) 106);
        class100.method736(2);
        class144.method979();
        class149.method1009((byte) -44);
        class170.method1141(true);
        class232.method1578(15789);
        class275.method1842((byte) -109);
        class60.method490((byte) -49);
        class236.method1593(31447);
        class65.method523();
        class119.method839();
        class281.method1870(true);
        class75.method598(true);
        class251.method1712(58);
        class194.method1306(arg0 + 8031);
        class293.method1934(false);
        class247.method1697(5);
        class66.method528((byte) -90);
        class43.method348(338);
        class264.method1794(arg0 + 6);
        class128.method884((byte) -79);
        class30.method209((byte) 91);
        class176.method1166((byte) -108);
        class67.method533((byte) 24);
        class29.method205(arg0 + 1024);
        class101.method739((byte) 54);
        class205.method1360((byte) -115);
        class291.method1928();
        class221.method1517(16777215);
        class179.method1180((byte) -125);
        class70.method552();
        class36.method282(arg0 + 28);
        class178.method1176((byte) -105);
        class20.method139((byte) -125);
        class280.method1860(arg0 ^ 0x6F);
        class105.method765(-31746);
        class270.method1817(-6503);
        class269.method1816(-110);
        class248.method1699(15);
        class147.method1001((byte) 27);
        class294.method1938();
        class235.method1589(false);
        class77.method610((byte) 100);
        class126.method881(arg0 ^ 0x4E);
        class239.method1636(105);
        class63.method518(true);
        class218.method1462(arg0 ^ 0x4E40);
        class190.method1271((byte) 56);
        class55.method467(0);
        class109.method787((byte) 127);
        class135.method926(-1);
        class150.method1015((byte) 124);
        class90.method686(71);
        class120.method855((byte) -21);
        class143.method971(-260247600);
        class285.method1895(arg0 - 3668);
        class81.method638(0);
        class86.method659(-71);
        class74.method596();
        class10.method75(123);
        class37.method288(arg0 ^ 0x6E04);
        class59.method487(17400);
        class182.method1196(false);
        class23.method157(126);
        class113.method813(true);
        class28.method200();
        class290.method1925();
        class83.method643(false);
        class234.method1588(arg0 ^ 0x5926);
        class71.method555(-1);
        class27.method193(-9459);
        class38.method295();
        class95.method713();
        class185.method1208(7065);
        class136.method929((byte) 8);
        class34.method234((byte) 52);
        class14.method95(0);
        class33.method223((byte) -27);
        class121.method858(arg0);
        class266.method1799(arg0 ^ 0x2);
        class42.method345((byte) 118);
        class32.method219(arg0);
        class175.method1160(106);
        class155.method1052(true);
        class16.method118((byte) 6);
        class157.method1061((byte) 82);
        class24.method163(5);
        class295.method1941(-108);
        class3.method41(arg0 ^ 0xFFFFCC36);
        class115.method823(-115);
        class163.method1104((byte) -31);
        class265.method1796(true);
        class47.method374((byte) -99);
        class13.method90(4096);
        class277.method1847((byte) -116);
        class117.method830(-76);
        class202.method1345(true);
        class262.method1774((byte) 124);
        class102.method746(93);
        class12.method86(95);
        class241.method1648((byte) -2);
        class278.method1852((byte) 56);
        class215.method1450(4096);
        class258.method1739((byte) 2);
        class7.method61(16);
        class273.method1826(0);
        class214.method1441(-125);
        class124.method872(false);
        class206.method1363((byte) -125);
        class217.method1460(3917);
        class56.method468((byte) 123);
        class171.method1146(8226);
        class231.method1567(arg0);
        class17.method124(true);
        class292.method1929((byte) 55);
        class168.method1135(-2);
        class166.method1130(arg0 - 2525);
        class191.method1275((byte) -102);
        class5.method54(0);
        class197.method1324((byte) -126);
        class213.method1438(-88);
        class62.method512(-92);
        class246.method1686(-117);
        class76.method606(0);
        class114.method819((byte) -46);
        class210.method1385(true);
        class4.method49(0);
        class92.method692(false);
        class174.method1159(2245);
        class268.method1811((byte) 62);
        class22.method152((byte) 121);
        class127.method883(arg0);
        class167.method1133(0);
        class11.method81(115);
        class73.method582(109);
        class250.method1705(32);
        class165.method1124(arg0 ^ 0x77);
        class169.method1139(26759);
        class216.method1452(-5);
        if (class211.field3186) {
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method325(byte arg0) {
        field725++;
        if (arg0 >= -61) {
            field729 = 49;
        }
        boolean var2 = class18.field329.method1117(false);
        if (!var2) {
            this.method322(9184);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field722++;
        if (!this.method1393(-120)) {
            return;
        }
        class266.field4151 = Integer.parseInt(this.getParameter("worldid"));
        class146.field2119 = Integer.parseInt(this.getParameter("modewhere"));
        if (class146.field2119 < 0 || class146.field2119 > 1) {
            class146.field2119 = 0;
        }
        class138.field1999 = Integer.parseInt(this.getParameter("modewhat"));
        if (class138.field1999 < 0 || class138.field1999 > 2) {
            class138.field1999 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class50.field820 = true;
        } else {
            class50.field820 = false;
        }
        try {
            class24.field394 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class24.field394 = 0;
        }
        class81.method637(class24.field394, -116);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class296.field4510 = true;
        } else {
            class296.field4510 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class150.field2183 = true;
        } else {
            class150.field2183 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class246.field3836 = 1;
        } else {
            class246.field3836 = 0;
        }
        try {
            class246.field3826 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class246.field3826 = 0;
        }
        class4.field58 = this.getParameter("settings");
        if (class4.field58 == null) {
            class4.field58 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class269.field4188 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class269.field4188 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class256.field3942 = true;
        } else {
            class256.field3942 = false;
        }
        class163.field2378 = this;
        this.method1390(503, class138.field1999 + 32, 765, true, 540);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method326(int arg0) {
        field733++;
        if (class42.field742 == 1000) {
            return;
        }
        class120.field1794++;
        if (class120.field1794 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class67.field1100 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class262.field4039.setSeed((long) class67.field1100);
        }
        this.method325((byte) -125);
        if (class155.field2274 != null) {
            class155.field2274.method645((byte) 70);
        }
        class4.method48((byte) -104);
        class195.method1316(-91);
        if (arg0 > -92) {
            field715 = -97;
        }
        class36.method285(9535);
        class162.method1096(true);
        if (class265.field4141 != null) {
            int var3 = class265.field4141.method1651(103);
            class136.field1984 = var3;
        }
        if (class42.field742 == 0) {
            this.method328(126);
            class231.method1573(-101);
        } else if (class42.field742 == 5) {
            this.method328(126);
            class231.method1573(-98);
        } else if (class42.field742 == 25 || class42.field742 == 28) {
            class180.method1186((byte) -73);
        }
        if (class42.field742 == 10) {
            this.method327(true);
            class33.method225(3);
            class296.method1959((byte) -11);
            class173.method1155(1);
        } else if (class42.field742 == 30) {
            class258.method1741(-1);
        } else if (class42.field742 == 40) {
            class173.method1155(1);
            if (class147.field2132 != -3) {
                if (class147.field2132 == 15) {
                    class199.method1329((byte) 38);
                } else if (class147.field2132 != 2) {
                    class208.method1372(true);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    private final void method327(boolean arg0) {
        field717++;
        for (class4.field56 = 0; class68.method538((byte) 59) && class4.field56 < 128; class4.field56++) {
            class5.field61[class4.field56] = class22.field365;
            class295.field4478[class4.field56] = class249.field3867;
        }
        class177.field2599++;
        if (class184.field2677 != -1) {
            class179.method1178(0, 0, 0, -10562, class184.field2677, 0, class126.field1854, class85.field1311);
        }
        class169.field2494++;
        class154.method1044((byte) -116);
        while (true) {
            class43 var2;
            class297 var3;
            class297 var4;
            do {
                var2 = (class43) class236.field3632.method1888(arg0);
                if (var2 == null) {
                    while (true) {
                        class43 var5;
                        class297 var6;
                        class297 var7;
                        do {
                            var5 = (class43) class43.field764.method1888(true);
                            if (var5 == null) {
                                while (true) {
                                    class43 var8;
                                    class297 var9;
                                    class297 var10;
                                    do {
                                        var8 = (class43) class122.field1813.method1888(true);
                                        if (var8 == null) {
                                            if (!arg0) {
                                                return;
                                            }
                                            if (class223.field3464 != null) {
                                                class181.method1192(29975);
                                            }
                                            if (class42.field743 != null && class42.field743.field713 == 1) {
                                                if (class42.field743.field709 != null) {
                                                    class262.method1777(arg0, class153.field2239, class165.field2419);
                                                }
                                                class165.field2419 = null;
                                                class42.field743 = null;
                                                class153.field2239 = false;
                                            }
                                            if (class120.field1794 % 1500 == 0) {
                                                class270.method1820((byte) 126);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field750;
                                        if (var9.field4528 < 0) {
                                            break;
                                        }
                                        var10 = class151.method1023(-30464, var9.field4542);
                                    } while (var10 == null || var10.field4646 == null || var9.field4528 >= var10.field4646.length || var10.field4646[var9.field4528] != var9);
                                    class137.method934(200000, var8);
                                }
                            }
                            var6 = var5.field750;
                            if (var6.field4528 < 0) {
                                break;
                            }
                            var7 = class151.method1023(-30464, var6.field4542);
                        } while (var7 == null || var7.field4646 == null || var7.field4646.length <= var6.field4528 || var7.field4646[var6.field4528] != var6);
                        class137.method934(200000, var5);
                    }
                }
                var3 = var2.field750;
                if (var3.field4528 < 0) {
                    break;
                }
                var4 = class151.method1023(-30464, var3.field4542);
            } while (var4 == null || var4.field4646 == null || var3.field4528 >= var4.field4646.length || var4.field4646[var3.field4528] != var3);
            class137.method934(200000, var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method328(int arg0) {
        if (!class170.field2503) {
            label241: while (true) {
                do {
                    if (!class68.method538((byte) 103)) {
                        break label241;
                    }
                } while (class249.field3867 != 's' && class249.field3867 != 'S');
                class170.field2503 = true;
            }
        }
        if (arg0 <= 125) {
            field728 = -32;
        }
        field726++;
        if (class254.field3924 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class257.method1736(14361);
            if (class97.field1424 == 0L) {
                class97.field1424 = var4;
            }
            if (var3 > 16384 && var4 - class97.field1424 < 5000L) {
                if ((var4 - class37.field644) > 1000L) {
                    System.gc();
                    class37.field644 = var4;
                }
                class149.field2160 = class110.field1644;
                class297.field4660 = 5;
            } else {
                class149.field2160 = class4.field50;
                class297.field4660 = 5;
                class254.field3924 = 10;
            }
        } else if (class254.field3924 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class243.field3763[var6] = new class78(104, 104);
            }
            class297.field4660 = 10;
            class149.field2160 = class121.field1798;
            class254.field3924 = 30;
        } else if (class254.field3924 == 30) {
            if (class155.field2274 == null) {
                class155.field2274 = new class84(class18.field329, class142.field2042);
            }
            if (class155.field2274.method650((byte) 87)) {
                class215.field3301 = class21.method143(true, 1000000, 0, true, false);
                class81.field1266 = class21.method143(true, 1000000, 1, true, false);
                class37.field650 = class21.method143(false, 1000000, 2, true, true);
                class239.field3694 = class21.method143(true, 1000000, 3, true, false);
                class211.field3161 = class21.method143(true, 1000000, 4, true, false);
                class210.field3143 = class21.method143(true, 1000000, 5, true, true);
                class220.field3404 = class21.method143(true, 1000000, 6, false, true);
                class287.field4392 = class21.method143(true, 1000000, 7, true, false);
                class36.field637 = class21.method143(true, 1000000, 8, true, false);
                class152.field2221 = class21.method143(true, 1000000, 9, true, false);
                class259.field3966 = class21.method143(true, 1000000, 10, true, false);
                class100.field1465 = class21.method143(true, 1000000, 11, true, false);
                class124.field1841 = class21.method143(true, 1000000, 12, true, false);
                class58.field962 = class21.method143(true, 1000000, 13, true, false);
                class60.field984 = class21.method143(true, 1000000, 14, false, false);
                class146.field2121 = class21.method143(true, 1000000, 15, true, false);
                class181.field2640 = class21.method143(true, 1000000, 16, true, false);
                class185.field2706 = class21.method143(true, 1000000, 17, true, false);
                class259.field3976 = class21.method143(true, 1000000, 18, true, false);
                class136.field1986 = class21.method143(true, 1000000, 19, true, false);
                class171.field2510 = class21.method143(true, 1000000, 20, true, false);
                class211.field3181 = class21.method143(true, 1000000, 21, true, false);
                class120.field1793 = class21.method143(true, 1000000, 22, true, false);
                class34.field603 = class21.method143(true, 1000000, 23, true, true);
                class247.field3847 = class21.method143(true, 1000000, 24, true, false);
                class43.field769 = class21.method143(true, 1000000, 25, true, false);
                class202.field3047 = class21.method143(true, 1000000, 26, true, true);
                class176.field2587 = class21.method143(true, 1000000, 27, true, false);
                class196.field2956 = class21.method143(true, 1000000, 28, true, true);
                class149.field2160 = class163.field2382;
                class254.field3924 = 40;
                class297.field4660 = 15;
            } else {
                class149.field2160 = class105.field1552;
                class297.field4660 = 12;
            }
        } else if (class254.field3924 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class64.field1064[var8].method497(0) * class112.field1714[var8] / 100;
            }
            if (var7 == 100) {
                class297.field4660 = 20;
                class149.field2160 = class45.field783;
                class51.method389(class36.field637, 560447809);
                class191.method1274(1, class36.field637);
                class105.method770(class36.field637, true);
                class254.field3924 = 41;
            } else {
                class297.field4660 = 20;
                if (var7 != 0) {
                    class149.field2160 = class109.field1616 + var7 + "%";
                }
            }
        } else if (class254.field3924 == 41) {
            if (class196.field2956.method1628(-99)) {
                this.method334(9, class196.field2956.method1620(false, 1));
                class254.field3924 = 45;
                class297.field4660 = 25;
                class149.field2160 = class100.field1463;
            } else {
                class149.field2160 = class69.field1145 + class196.field2956.method1599(0) + "%";
                class297.field4660 = 25;
            }
        } else if (class254.field3924 == 45) {
            class85.method652(2, 22050, class25.field431, false);
            class120.field1792 = new class212();
            class120.field1792.method1424(128, (byte) 85, 9);
            class182.field2648 = class56.method470(class297.field4569, class217.field3338, 22050, -18999, 0);
            class182.field2648.method806((byte) 116, class120.field1792);
            class176.method1164(class120.field1792, class60.field984, class146.field2121, class211.field3161, (byte) -96);
            class258.field3961 = class56.method470(class297.field4569, class217.field3338, 2048, -18999, 1);
            class108.field1581 = new class132();
            class258.field3961.method806((byte) -56, class108.field1581);
            class209.field3126 = new class228(22050, class174.field2547);
            class208.field3117 = class220.field3404.method1621("scape main", 1);
            class149.field2160 = class64.field1071;
            class297.field4660 = 30;
            class254.field3924 = 50;
        } else if (class254.field3924 == 50) {
            int var9 = class227.method1553((byte) -102, class36.field637, class58.field962);
            int var10 = class30.method211(6);
            if (var9 < var10) {
                class149.field2160 = class210.field3141 + var9 * 100 / var10 + "%";
                class297.field4660 = 35;
            } else {
                class297.field4660 = 35;
                class149.field2160 = class264.field4131;
                class254.field3924 = 60;
            }
        } else if (class254.field3924 == 60) {
            int var11 = class134.method922(class36.field637, (byte) -104);
            int var12 = class297.method1974((byte) 92);
            if (var11 < var12) {
                class297.field4660 = 40;
                class149.field2160 = class7.field84 + var11 * 100 / var12 + "%";
            } else {
                class297.field4660 = 40;
                class149.field2160 = class176.field2586;
                class254.field3924 = 65;
            }
        } else if (class254.field3924 == 65) {
            class1.method7((byte) 6, class36.field637, class58.field962);
            class297.field4660 = 45;
            class149.field2160 = class157.field2306;
            class88.method668(true, 5);
            class254.field3924 = 70;
        } else if (class254.field3924 == 70) {
            byte var13 = 0;
            class37.field650.method1628(73);
            int var14 = var13 + class37.field650.method1599(0);
            class181.field2640.method1628(-120);
            int var15 = var14 + class181.field2640.method1599(0);
            class185.field2706.method1628(-119);
            int var16 = var15 + class185.field2706.method1599(0);
            class259.field3976.method1628(-60);
            int var17 = var16 + class259.field3976.method1599(0);
            class136.field1986.method1628(124);
            int var18 = var17 + class136.field1986.method1599(0);
            class171.field2510.method1628(124);
            int var19 = var18 + class171.field2510.method1599(0);
            class211.field3181.method1628(-124);
            int var20 = var19 + class211.field3181.method1599(0);
            class120.field1793.method1628(120);
            int var21 = var20 + class120.field1793.method1599(0);
            class247.field3847.method1628(-50);
            int var22 = var21 + class247.field3847.method1599(0);
            class43.field769.method1628(58);
            int var23 = var22 + class43.field769.method1599(0);
            class176.field2587.method1628(-77);
            int var24 = var23 + class176.field2587.method1599(0);
            if (var24 < 1100) {
                class297.field4660 = 50;
                class149.field2160 = class105.field1554 + var24 / 11 + "%";
            } else {
                class143.method974(class37.field650, 20);
                class100.method737(0, class37.field650);
                class18.method130(class37.field650, (byte) -75);
                class296.method1954(false, class37.field650, class287.field4392);
                class245.method1667(class181.field2640, true, class287.field4392, (byte) -83);
                class3.method44(class259.field3976, (byte) 125, class287.field4392);
                class235.method1590(class287.field4392, class136.field1986, true, 256, class42.field741);
                class188.method1248(class37.field650, -126);
                class51.method384(class171.field2510, true, class81.field1266, class215.field3301);
                class44.method356(0, class37.field650);
                class218.method1465(class211.field3181, false, class287.field4392);
                class184.method1204((byte) -127, class120.field1793);
                class163.method1108(class37.field650, (byte) -99);
                class247.method1696(class239.field3694, class287.field4392, class36.field637, class58.field962, (byte) -99);
                class32.method218(16711680, class37.field650);
                class189.method1264(class185.field2706, 0);
                class37.method289(57, new class229(), class43.field769, class247.field3847);
                class183.method1197(class43.field769, 21057, class247.field3847);
                class214.method1445(0, class37.field650);
                class146.method1000(class37.field650, (byte) 4);
                class76.method608(118, class37.field650);
                class96.method721((byte) -80, class37.field650, class36.field637);
                class142.method965(-14189, class36.field637, class37.field650);
                class297.field4660 = 50;
                class149.field2160 = class67.field1115;
                class51.method390(11);
                class254.field3924 = 80;
            }
        } else if (class254.field3924 == 80) {
            int var25 = class183.method1202(-128, class36.field637);
            int var26 = class248.method1700(15);
            if (var25 < var26) {
                class297.field4660 = 60;
                class149.field2160 = class32.field568 + var25 * 100 / var26 + "%";
            } else {
                class138.method935(false, class36.field637);
                class297.field4660 = 60;
                class149.field2160 = class36.field638;
                class254.field3924 = 90;
            }
        } else if (class254.field3924 == 90) {
            if (class202.field3047.method1628(-66)) {
                class275 var27 = new class275(class152.field2221, class202.field3047, class36.field637, 20, !class249.field3869);
                class119.method841(var27);
                if (class176.field2585 == 1) {
                    class119.method852(0.9F);
                }
                if (class176.field2585 == 2) {
                    class119.method852(0.8F);
                }
                if (class176.field2585 == 3) {
                    class119.method852(0.7F);
                }
                if (class176.field2585 == 4) {
                    class119.method852(0.6F);
                }
                class149.field2160 = class175.field2571;
                class254.field3924 = 100;
                class297.field4660 = 70;
            } else {
                class149.field2160 = class140.field2025 + class202.field3047.method1599(0) + "%";
                class297.field4660 = 70;
            }
        } else if (class254.field3924 == 100) {
            if (class181.method1190(class36.field637, -2001)) {
                class254.field3924 = 110;
            }
        } else if (class254.field3924 == 110) {
            class264.field4132 = new class196();
            class217.field3338.method181(class264.field4132, 10, (byte) 94);
            class149.field2160 = class167.field2466;
            class254.field3924 = 120;
            class297.field4660 = 75;
        } else if (class254.field3924 == 120) {
            if (class259.field3966.method1627(1, "", "huffman")) {
                class281 var28 = new class281(class259.field3966.method1615("huffman", "", 0));
                class236.method1595(6777, var28);
                class149.field2160 = class76.field1215;
                class297.field4660 = 80;
                class254.field3924 = 130;
            } else {
                class297.field4660 = 80;
                class149.field2160 = class20.field343 + "0%";
            }
        } else if (class254.field3924 == 130) {
            if (!class239.field3694.method1628(50)) {
                class149.field2160 = class239.field3709 + class239.field3694.method1599(0) * 3 / 4 + "%";
                class297.field4660 = 85;
            } else if (!class124.field1841.method1628(-66)) {
                class149.field2160 = class239.field3709 + (class124.field1841.method1599(0) / 10 + 75) + "%";
                class297.field4660 = 85;
            } else if (!class58.field962.method1628(-122)) {
                class149.field2160 = class239.field3709 + (class58.field962.method1599(0) / 20 + 85) + "%";
                class297.field4660 = 85;
            } else if (class34.field603.method1611(-1, "details")) {
                class19.method132((byte) -92, class34.field603, class124.field1839);
                class204.method1356(class287.field4392);
                class254.field3924 = 135;
                class297.field4660 = 95;
                class149.field2160 = class184.field2676;
            } else {
                class149.field2160 = class239.field3709 + (class34.field603.method1613("details", (byte) 111) / 10 + 90) + "%";
                class297.field4660 = 85;
            }
        } else if (class254.field3924 == 135) {
            int var29 = class76.method607(67);
            if (var29 == -1) {
                class297.field4660 = 95;
                class149.field2160 = class117.field1763;
            } else if (var29 == 7 || var29 == 9) {
                this.method1387("worldlistfull", 112);
                class88.method668(true, 1000);
            } else if (class49.field807) {
                class254.field3924 = 140;
                class149.field2160 = class210.field3140;
                class297.field4660 = 96;
            } else {
                this.method1387("worldlistio_" + var29, -126);
                class88.method668(true, 1000);
            }
        } else if (class254.field3924 == 140) {
            class265.field4143 = class239.field3694.method1621("loginscreen", 1);
            class210.field3143.method1610(false, true, false);
            class220.field3404.method1610(false, true, true);
            class36.field637.method1610(false, true, true);
            class58.field962.method1610(false, true, true);
            class259.field3966.method1610(false, true, true);
            class239.field3694.method1610(false, true, true);
            class211.field3182 = true;
            class297.field4660 = 97;
            class254.field3924 = 150;
            class149.field2160 = class223.field3472;
        } else if (class254.field3924 == 150) {
            if (class170.field2503) {
                class124.field1840 = 0;
                class249.field3862 = 0;
                class162.field2350 = 0;
                field715 = 0;
            }
            class170.field2503 = true;
            class58.method479(class217.field3338, -230);
            class297.method1978(class124.field1840, false, -18786, -1, -1);
            class254.field3924 = 160;
            class149.field2160 = class123.field1829;
            class297.field4660 = 100;
        } else if (class254.field3924 == 160) {
            class20.method140(true, (byte) -79);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljk;)Ljk;")
    public static final class297 method329(class297 arg0) {
        int var1 = method333(arg0).method1968((byte) 124);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class151.method1023(-30464, arg0.field4542);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljk;)Z")
    public static final boolean method330(class297 arg0) {
        if (class112.field1712) {
            if (method333(arg0).field4515 != 0) {
                return false;
            }
            if (arg0.field4553 == 0) {
                return false;
            }
        }
        return arg0.field4662;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method331(int arg0) {
        if (arg0 == 0) {
            field732++;
            class8.field93.method940(arg0 + 25);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field730++;
        try {
            if (arg0.length != 4) {
                class273.method1828("argument count", (byte) -19);
            }
            class266.field4151 = Integer.parseInt(arg0[0]);
            class146.field2119 = 2;
            if (arg0[1].equals("live")) {
                class138.field1999 = 0;
            } else if (arg0[1].equals("rc")) {
                class138.field1999 = 1;
            } else if (arg0[1].equals("wip")) {
                class138.field1999 = 2;
            } else {
                class273.method1828("modewhat", (byte) -19);
            }
            class50.field820 = false;
            class24.field394 = class110.method795(-109, arg0[2]);
            if (class24.field394 == -1) {
                if (arg0[2].equals("english")) {
                    class24.field394 = 0;
                } else if (arg0[2].equals("german")) {
                    class24.field394 = 1;
                } else {
                    class273.method1828("language", (byte) -19);
                }
            }
            class81.method637(class24.field394, -35);
            class296.field4510 = false;
            class150.field2183 = false;
            if (arg0[3].equals("game0")) {
                class246.field3836 = 0;
            } else if (arg0[3].equals("game1")) {
                class246.field3836 = 1;
            } else {
                class273.method1828("game", (byte) -19);
            }
            class256.field3942 = false;
            class4.field58 = "";
            class269.field4188 = 0;
            class246.field3826 = 0;
            client var1 = new client();
            class163.field2378 = var1;
            var1.method1388("runescape", class138.field1999 + 32, 540, 768, 29, (byte) 49, 1024, false);
            class167.field2459.setLocation(40, 40);
        } catch (Exception var3) {
            class121.method860((byte) 21, (String) null, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method332(int arg0) {
        field727++;
        if (class264.field4132 != null) {
            class264.field4132.field2957 = false;
        }
        class264.field4132 = null;
        if (class22.field369 != null) {
            class22.field369.method1718(-17492);
            class22.field369 = null;
        }
        class177.method1171(class297.field4569, -1);
        class104.method755(255, class297.field4569);
        if (class265.field4141 != null) {
            class265.field4141.method1652((byte) -21, class297.field4569);
        }
        class205.method1358(34);
        class131.method903((byte) -126);
        class265.field4141 = null;
        if (class182.field2648 != null) {
            class182.field2648.method811((byte) -116);
        }
        if (class258.field3961 != null) {
            class258.field3961.method811((byte) -116);
        }
        class18.field329.method1110(true);
        int var2 = -36 % ((arg0 - 35) / 51);
        class142.field2042.method1151(-124);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ljk;)Lkd;")
    public static final class296 method333(class297 arg0) {
        class296 var1 = (class296) class281.field4309.method306(((long) arg0.field4683 << 32) + (long) arg0.field4528, 16216);
        return var1 == null ? arg0.field4521 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[B)V")
    private final void method334(int arg0, byte[] arg1) {
        field721++;
        class54 var3 = new class54(arg1);
        if (arg0 != 9) {
            return;
        }
        while (true) {
            int var4 = var3.method407(255);
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                var3.method423(99);
                var3.method423(-101);
                var3.method423(arg0 ^ 0xFFFFFF84);
                var3.method423(124);
                var3.method423(arg0 + 67);
                var3.method423(-115);
            }
        }
    }
}
