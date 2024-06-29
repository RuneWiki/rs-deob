import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class284 {

    @OriginalMember(owner = "client!client", name = "L", descriptor = "Z")
    public static boolean field2846 = false;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lid;")
    private static class149 field2855 = class60.method382("wishes to trade with you)3", (byte) 112);

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field2857 = 0;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Lid;")
    public static class149 field2854 = field2855;

    @OriginalMember(owner = "client!client", name = "C", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Lid;")
    public static class149 field2862;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "[[Z")
    public static boolean[][] field2851;

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method1103(int arg0) {
        field2853++;
        if (class50.field914 != null) {
            class50.field914.field3323 = false;
        }
        class50.field914 = null;
        if (class164.field3047 != null) {
            class164.field3047.method1398((byte) 125);
            class164.field3047 = null;
        }
        class37.method220(~arg0, class244.field4295);
        class108.method751(class244.field4295, 0);
        if (class25.field381 != null) {
            class25.field381.method251((byte) 52, class244.field4295);
        }
        class182.method1262(arg0 ^ 0x34EC);
        class50.method323(arg0);
        class25.field381 = null;
        if (class116.field1991 != null) {
            class116.field1991.method983(arg0 + 123);
        }
        if (class79.field1476 != null) {
            class79.field1476.method983(86);
        }
        class271.field4868.method333(true);
        class2.field23.method1827(false);
        try {
            if (class259.field4546 != null) {
                class259.field4546.method1795(-2275);
            }
            if (class36.field538 != null) {
                for (int var2 = 0; var2 < class36.field538.length; var2++) {
                    if (class36.field538[var2] != null) {
                        class36.field538[var2].method1795(-2275);
                    }
                }
            }
            if (class126.field2210 != null) {
                class126.field2210.method1795(arg0 ^ 0xFFFFF71D);
            }
            if (class172.field3169 != null) {
                class172.field3169.method1795(-2275);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Laj;)Ll;")
    public static final class161 method1104(class47 arg0) {
        class161 var1 = (class161) class122.field2152.method639((byte) -43, ((long) arg0.field834 << 32) + (long) arg0.field799);
        return var1 == null ? arg0.field842 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Laj;IIIIIII)V")
    public static final void method1105(class47[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class47 var9 = arg0[var8];
            if (var9 != null && var9.field707 == arg1 && (!var9.field718 || var9.field760 == 0 || var9.field702 || method1104(var9).field2992 != 0 || class102.field1801 == var9 || var9.field820 == 1338) && (!var9.field718 || !method1107(var9))) {
                int var10 = var9.field754 + arg6;
                int var11 = var9.field784 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field760 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field722 + var10;
                    int var17 = var9.field727 + var11;
                    if (var9.field760 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class244.field4296 == var9) {
                    class174.field3204 = true;
                    class163.field3020 = var10;
                    class45.field691 = var11;
                }
                if (!var9.field718 || var12 < var14 && var13 < var15) {
                    if (var9.field760 == 0) {
                        if (!var9.field718 && method1107(var9) && class176.field3224 != var9) {
                            continue;
                        }
                        if (var9.field857 && class49.field883 >= var12 && class285.field5068 >= var13 && class49.field883 < var14 && class285.field5068 < var15) {
                            for (class1 var18 = (class1) class258.field4506.method1140(0); var18 != null; var18 = (class1) class258.field4506.method1127(0)) {
                                if (var18.field6) {
                                    var18.method401((byte) -118);
                                    var18.field13.field847 = false;
                                }
                            }
                            if (class270.field4856 == 0) {
                                class244.field4296 = null;
                                class102.field1801 = null;
                            }
                            class223.field3929 = 0;
                        }
                    }
                    if (var9.field718) {
                        boolean var19;
                        if (class49.field883 >= var12 && class285.field5068 >= var13 && class49.field883 < var14 && class285.field5068 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class263.field4671 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class80.field1487 == 1 && class260.field4582 >= var12 && class159.field2921 >= var13 && class260.field4582 < var14 && class159.field2921 < var15) {
                            var21 = true;
                        }
                        if (var9.field840 != null) {
                            for (int var22 = 0; var22 < var9.field840.length; var22++) {
                                if (class131.field2312[var9.field840[var22]]) {
                                    if (var9.field719 == null || class118.field2022 >= var9.field719[var22]) {
                                        byte var23 = var9.field853[var22];
                                        if (var23 == 0 || ((var23 & 0x2) == 0 || class131.field2312[86]) && ((var23 & 0x1) == 0 || class131.field2312[82]) && ((var23 & 0x4) == 0 || class131.field2312[81])) {
                                            class186.method1283(class171.field3158, 10, -1, var9.field834, var22 + 1);
                                            int var24 = var9.field780[var22];
                                            if (var9.field719 == null) {
                                                var9.field719 = new int[var9.field840.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field719[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field719[var22] = class118.field2022 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field719 != null) {
                                    var9.field719[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            method1118(class260.field4582 - var10, (byte) 61, var9, class159.field2921 - var11);
                        }
                        if (class244.field4296 != null && class244.field4296 != var9 && var19 && method1104(var9).method1188(0)) {
                            class116.field1995 = var9;
                        }
                        if (class102.field1801 == var9) {
                            class20.field305 = true;
                            class143.field2603 = var10;
                            class99.field1755 = var11;
                        }
                        if (var9.field702 || var9.field820 != 0) {
                            if (var19 && class180.field3250 != 0 && var9.field839 != null) {
                                class1 var25 = new class1();
                                var25.field6 = true;
                                var25.field13 = var9;
                                var25.field21 = class180.field3250;
                                var25.field17 = var9.field839;
                                class258.field4506.method1131(var25, false);
                            }
                            if (class244.field4296 != null || class23.field322 != null || class32.field481 || var9.field820 != 1400 && class223.field3929 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field820 != 0) {
                                if (var9.field820 == 1337) {
                                    class7.field86 = var9;
                                    class182.method1267(var9, 94);
                                    continue;
                                }
                                if (var9.field820 == 1338) {
                                    if (var21) {
                                        class48.field877 = class260.field4582 - var10;
                                        class263.field4684 = class159.field2921 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field820 == 1400) {
                                    class10.field139 = var9;
                                    if (var21) {
                                        if (class131.field2312[82] && class258.field4519 > 0) {
                                            int var26 = (int) ((double) (class260.field4582 - var10 - var9.field722 / 2) * 2.0D / (double) class11.field156);
                                            int var27 = (int) ((double) (class159.field2921 - var11 - var9.field727 / 2) * 2.0D / (double) class11.field156);
                                            int var28 = class106.field1840 + var26;
                                            int var29 = class163.field3019 + var27;
                                            int var30 = class80.field1480 + var28;
                                            int var31 = class287.field5086 + class91.field1615 - var29 - 1;
                                            class101.method723(var30, var31, 0, 2074796454);
                                            class48.method308((byte) 10);
                                            continue;
                                        }
                                        class223.field3929 = 1;
                                        class106.field1839 = class49.field883;
                                        class106.field1831 = class285.field5068;
                                        continue;
                                    }
                                    if (var20 && class223.field3929 > 0) {
                                        if (class223.field3929 == 1 && (class49.field883 != class106.field1839 || class285.field5068 != class106.field1831)) {
                                            class15.field211 = class106.field1840;
                                            class95.field1680 = class163.field3019;
                                            class223.field3929 = 2;
                                        }
                                        if (class223.field3929 == 2) {
                                            class96.method697((int) ((double) (class106.field1839 - class49.field883) * 2.0D / (double) class199.field3616) + class15.field211, -1);
                                            class9.method45((byte) 123, (int) ((double) (class106.field1831 - class285.field5068) * 2.0D / (double) class199.field3616) + class95.field1680);
                                        }
                                        continue;
                                    }
                                    class223.field3929 = 0;
                                    continue;
                                }
                                if (var9.field820 == 1401) {
                                    if (var20) {
                                        class13.method81(var9.field722, class285.field5068 - var11, class49.field883 - var10, (byte) -91, var9.field727);
                                    }
                                    continue;
                                }
                                if (var9.field820 == 1402) {
                                    class182.method1267(var9, 114);
                                    continue;
                                }
                            }
                            if (!var9.field829 && var21) {
                                var9.field829 = true;
                                if (var9.field830 != null) {
                                    class1 var32 = new class1();
                                    var32.field6 = true;
                                    var32.field13 = var9;
                                    var32.field14 = class260.field4582 - var10;
                                    var32.field21 = class159.field2921 - var11;
                                    var32.field17 = var9.field830;
                                    class258.field4506.method1131(var32, false);
                                }
                            }
                            if (var9.field829 && var20 && var9.field813 != null) {
                                class1 var33 = new class1();
                                var33.field6 = true;
                                var33.field13 = var9;
                                var33.field14 = class49.field883 - var10;
                                var33.field21 = class285.field5068 - var11;
                                var33.field17 = var9.field813;
                                class258.field4506.method1131(var33, false);
                            }
                            if (var9.field829 && !var20) {
                                var9.field829 = false;
                                if (var9.field700 != null) {
                                    class1 var34 = new class1();
                                    var34.field6 = true;
                                    var34.field13 = var9;
                                    var34.field14 = class49.field883 - var10;
                                    var34.field21 = class285.field5068 - var11;
                                    var34.field17 = var9.field700;
                                    class231.field4045.method1131(var34, false);
                                }
                            }
                            if (var20 && var9.field742 != null) {
                                class1 var35 = new class1();
                                var35.field6 = true;
                                var35.field13 = var9;
                                var35.field14 = class49.field883 - var10;
                                var35.field21 = class285.field5068 - var11;
                                var35.field17 = var9.field742;
                                class258.field4506.method1131(var35, false);
                            }
                            if (!var9.field847 && var19) {
                                var9.field847 = true;
                                if (var9.field843 != null) {
                                    class1 var36 = new class1();
                                    var36.field6 = true;
                                    var36.field13 = var9;
                                    var36.field14 = class49.field883 - var10;
                                    var36.field21 = class285.field5068 - var11;
                                    var36.field17 = var9.field843;
                                    class258.field4506.method1131(var36, false);
                                }
                            }
                            if (var9.field847 && var19 && var9.field787 != null) {
                                class1 var37 = new class1();
                                var37.field6 = true;
                                var37.field13 = var9;
                                var37.field14 = class49.field883 - var10;
                                var37.field21 = class285.field5068 - var11;
                                var37.field17 = var9.field787;
                                class258.field4506.method1131(var37, false);
                            }
                            if (var9.field847 && !var19) {
                                var9.field847 = false;
                                if (var9.field741 != null) {
                                    class1 var38 = new class1();
                                    var38.field6 = true;
                                    var38.field13 = var9;
                                    var38.field14 = class49.field883 - var10;
                                    var38.field21 = class285.field5068 - var11;
                                    var38.field17 = var9.field741;
                                    class231.field4045.method1131(var38, false);
                                }
                            }
                            if (var9.field729 != null) {
                                class1 var39 = new class1();
                                var39.field13 = var9;
                                var39.field17 = var9.field729;
                                class17.field253.method1131(var39, false);
                            }
                            if (var9.field801 != null && class84.field1531 > var9.field868) {
                                if (var9.field740 == null || class84.field1531 - var9.field868 > 32) {
                                    class1 var44 = new class1();
                                    var44.field13 = var9;
                                    var44.field17 = var9.field801;
                                    class258.field4506.method1131(var44, false);
                                } else {
                                    label565: for (int var40 = var9.field868; var40 < class84.field1531; var40++) {
                                        int var41 = class65.field1154[var40 & 0x1F];
                                        for (int var42 = 0; var42 < var9.field740.length; var42++) {
                                            if (var9.field740[var42] == var41) {
                                                class1 var43 = new class1();
                                                var43.field13 = var9;
                                                var43.field17 = var9.field801;
                                                class258.field4506.method1131(var43, false);
                                                break label565;
                                            }
                                        }
                                    }
                                }
                                var9.field868 = class84.field1531;
                            }
                            if (var9.field814 != null && class38.field569 > var9.field708) {
                                if (var9.field816 == null || class38.field569 - var9.field708 > 32) {
                                    class1 var49 = new class1();
                                    var49.field13 = var9;
                                    var49.field17 = var9.field814;
                                    class258.field4506.method1131(var49, false);
                                } else {
                                    label541: for (int var45 = var9.field708; var45 < class38.field569; var45++) {
                                        int var46 = class226.field3966[var45 & 0x1F];
                                        for (int var47 = 0; var47 < var9.field816.length; var47++) {
                                            if (var9.field816[var47] == var46) {
                                                class1 var48 = new class1();
                                                var48.field13 = var9;
                                                var48.field17 = var9.field814;
                                                class258.field4506.method1131(var48, false);
                                                break label541;
                                            }
                                        }
                                    }
                                }
                                var9.field708 = class38.field569;
                            }
                            if (var9.field835 != null && class104.field1814 > var9.field695) {
                                if (var9.field696 == null || class104.field1814 - var9.field695 > 32) {
                                    class1 var54 = new class1();
                                    var54.field13 = var9;
                                    var54.field17 = var9.field835;
                                    class258.field4506.method1131(var54, false);
                                } else {
                                    label517: for (int var50 = var9.field695; var50 < class104.field1814; var50++) {
                                        int var51 = class255.field4455[var50 & 0x1F];
                                        for (int var52 = 0; var52 < var9.field696.length; var52++) {
                                            if (var9.field696[var52] == var51) {
                                                class1 var53 = new class1();
                                                var53.field13 = var9;
                                                var53.field17 = var9.field835;
                                                class258.field4506.method1131(var53, false);
                                                break label517;
                                            }
                                        }
                                    }
                                }
                                var9.field695 = class104.field1814;
                            }
                            if (var9.field849 != null && class83.field1516 > var9.field867) {
                                if (var9.field789 == null || class83.field1516 - var9.field867 > 32) {
                                    class1 var59 = new class1();
                                    var59.field13 = var9;
                                    var59.field17 = var9.field849;
                                    class258.field4506.method1131(var59, false);
                                } else {
                                    label493: for (int var55 = var9.field867; var55 < class83.field1516; var55++) {
                                        int var56 = class213.field3780[var55 & 0x1F];
                                        for (int var57 = 0; var57 < var9.field789.length; var57++) {
                                            if (var9.field789[var57] == var56) {
                                                class1 var58 = new class1();
                                                var58.field13 = var9;
                                                var58.field17 = var9.field849;
                                                class258.field4506.method1131(var58, false);
                                                break label493;
                                            }
                                        }
                                    }
                                }
                                var9.field867 = class83.field1516;
                            }
                            if (var9.field745 != null && class91.field1621 > var9.field837) {
                                if (var9.field788 == null || class91.field1621 - var9.field837 > 32) {
                                    class1 var64 = new class1();
                                    var64.field13 = var9;
                                    var64.field17 = var9.field745;
                                    class258.field4506.method1131(var64, false);
                                } else {
                                    label469: for (int var60 = var9.field837; var60 < class91.field1621; var60++) {
                                        int var61 = class79.field1469[var60 & 0x1F];
                                        for (int var62 = 0; var62 < var9.field788.length; var62++) {
                                            if (var9.field788[var62] == var61) {
                                                class1 var63 = new class1();
                                                var63.field13 = var9;
                                                var63.field17 = var9.field745;
                                                class258.field4506.method1131(var63, false);
                                                break label469;
                                            }
                                        }
                                    }
                                }
                                var9.field837 = class91.field1621;
                            }
                            if (class223.field3927 > var9.field836 && var9.field709 != null) {
                                class1 var65 = new class1();
                                var65.field13 = var9;
                                var65.field17 = var9.field709;
                                class258.field4506.method1131(var65, false);
                            }
                            if (class38.field562 > var9.field836 && var9.field714 != null) {
                                class1 var66 = new class1();
                                var66.field13 = var9;
                                var66.field17 = var9.field714;
                                class258.field4506.method1131(var66, false);
                            }
                            if (class97.field1708 > var9.field836 && var9.field864 != null) {
                                class1 var67 = new class1();
                                var67.field13 = var9;
                                var67.field17 = var9.field864;
                                class258.field4506.method1131(var67, false);
                            }
                            if (class139.field2543 > var9.field836 && var9.field730 != null) {
                                class1 var68 = new class1();
                                var68.field13 = var9;
                                var68.field17 = var9.field730;
                                class258.field4506.method1131(var68, false);
                            }
                            if (class10.field143 > var9.field836 && var9.field856 != null) {
                                class1 var69 = new class1();
                                var69.field13 = var9;
                                var69.field17 = var9.field856;
                                class258.field4506.method1131(var69, false);
                            }
                            var9.field836 = class90.field1606;
                            if (var9.field717 != null) {
                                for (int var70 = 0; var70 < class40.field633; var70++) {
                                    class1 var71 = new class1();
                                    var71.field13 = var9;
                                    var71.field8 = class248.field4353[var70];
                                    var71.field15 = class11.field157[var70];
                                    var71.field17 = var9.field717;
                                    class258.field4506.method1131(var71, false);
                                }
                            }
                            if (class52.field938 && var9.field759 != null) {
                                class1 var72 = new class1();
                                var72.field13 = var9;
                                var72.field17 = var9.field759;
                                class258.field4506.method1131(var72, false);
                            }
                        }
                    }
                    if (!var9.field718 && class244.field4296 == null && class23.field322 == null && !class32.field481) {
                        if ((var9.field779 >= 0 || var9.field721 != 0) && class49.field883 >= var12 && class285.field5068 >= var13 && class49.field883 < var14 && class285.field5068 < var15) {
                            if (var9.field779 >= 0) {
                                class176.field3224 = arg0[var9.field779];
                            } else {
                                class176.field3224 = var9;
                            }
                        }
                        if (var9.field760 == 8 && class49.field883 >= var12 && class285.field5068 >= var13 && class49.field883 < var14 && class285.field5068 < var15) {
                            class24.field346 = var9;
                        }
                        if (var9.field755 > var9.field727) {
                            class255.method1756(class285.field5068, var9.field755, -83, var9, var11, class49.field883, var9.field722 + var10, var9.field727);
                        }
                    }
                    if (var9.field760 == 0) {
                        method1105(arg0, var9.field834, var12, var13, var14, var15, var10 - var9.field805, var11 - var9.field824);
                        if (var9.field761 != null) {
                            method1105(var9.field761, var9.field834, var12, var13, var14, var15, var10 - var9.field805, var11 - var9.field824);
                        }
                        class3 var73 = (class3) class34.field499.method639((byte) -27, (long) var9.field834);
                        if (var73 != null) {
                            class133.method935(var15, var11, var14, var10, (byte) -40, var73.field42, var12, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method1106(byte arg0) {
        if (arg0 >= -95) {
            this.init();
        }
        field2865++;
        class164.method1204(-103);
        class2.field23 = new class263();
        class271.field4868 = new class50();
        if (class80.field1484 != 0) {
            class273.field4907 = new byte[50][];
        }
        class87.method650(-100, class272.field4900);
        if (class236.field4132 == 0) {
            class75.field1362 = this.getCodeBase().getHost();
            class111.field1922 = 43594;
            class7.field81 = 443;
        } else if (class236.field4132 == 1) {
            class75.field1362 = this.getCodeBase().getHost();
            class7.field81 = class259.field4549 + 50000;
            class111.field1922 = class259.field4549 + 40000;
        } else if (class236.field4132 == 2) {
            class111.field1922 = class259.field4549 + 40000;
            class75.field1362 = "127.0.0.1";
            class7.field81 = class259.field4549 + 50000;
        }
        class184.field3321 = class111.field1922;
        class44.field673 = class75.field1362;
        if (class245.field4306 == 1) {
            class174.field3202 = class233.field4102;
            class127.field2229 = true;
            class195.field3500 = class157.field2893;
            class260.field4579 = class101.field1784;
            class116.field1975 = class157.field2880;
        } else {
            class195.field3500 = class32.field485;
            class260.field4579 = class259.field4556;
            class174.field3202 = class286.field5080;
            class116.field1975 = class100.field1763;
        }
        class169.field3130 = class7.field81;
        class47.field774 = class111.field1922;
        class67.field1179 = class109.field1888 = class96.field1693 = class230.field4015 = new short[256];
        if (class29.field427 == 3 && class236.field4132 != 2) {
            class147.field2652 = class259.field4549;
        }
        class32.field469 = class47.field774;
        class110.method779(12506);
        class247.method1721((byte) 112, class244.field4295);
        class75.method538(0, class244.field4295);
        class25.field381 = class174.method1236(-110);
        if (class25.field381 != null) {
            class25.field381.method248(false, class244.field4295);
        }
        class95.field1677 = class29.field427;
        try {
            if (class272.field4900.field441 != null) {
                class259.field4546 = new class260(class272.field4900.field441, 5200, 0);
                for (int var2 = 0; var2 < 28; var2++) {
                    class36.field538[var2] = new class260(class272.field4900.field423[var2], 6000, 0);
                }
                class126.field2210 = new class260(class272.field4900.field434, 6000, 0);
                class34.field488 = new class166(255, class259.field4546, class126.field2210, 500000);
                class172.field3169 = new class260(class272.field4900.field429, 24, 0);
                class272.field4900.field423 = null;
                class272.field4900.field434 = null;
                class272.field4900.field429 = null;
                class272.field4900.field441 = null;
            }
        } catch (IOException var3) {
            class259.field4546 = null;
            class172.field3169 = null;
            class126.field2210 = null;
            class34.field488 = null;
        }
        if (class236.field4132 != 0) {
            class168.field3129 = true;
        }
        class52.field945 = class222.field3899;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Laj;)Z")
    public static final boolean method1107(class47 arg0) {
        if (class38.field563) {
            if (method1104(arg0).field2992 != 0) {
                return false;
            }
            if (arg0.field760 == 0) {
                return false;
            }
        }
        return arg0.field846;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            int var1 = -1;
            if (arg0.length != 4) {
                class214.method1453((byte) 79, "argument count");
            }
            class259.field4549 = Integer.parseInt(arg0[0]);
            class236.field4132 = 2;
            if (arg0[1].equals("live")) {
                class80.field1484 = 0;
            } else if (arg0[1].equals("rc")) {
                class80.field1484 = 1;
            } else if (arg0[1].equals("wip")) {
                class80.field1484 = 2;
            } else {
                class214.method1453((byte) 79, "modewhat");
            }
            class279.field4987 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class110.method776(0, class37.method214(var2, 0, var2.length, 0));
            } catch (Exception var5) {
            }
            if (var1 != -1) {
                class39.field588 = var1;
            } else if (arg0[2].equals("english")) {
                class39.field588 = 0;
            } else if (arg0[2].equals("german")) {
                class39.field588 = 1;
            } else {
                class214.method1453((byte) 79, "language");
            }
            class255.method1761((byte) 127, class39.field588);
            class82.field1504 = false;
            field2846 = false;
            if (arg0[3].equals("game0")) {
                class245.field4306 = 0;
            } else if (arg0[3].equals("game1")) {
                class245.field4306 = 1;
            } else {
                class214.method1453((byte) 79, "game");
            }
            class35.field523 = false;
            class216.field3807 = 0;
            class185.field3335 = 0;
            class159.field2927 = class171.field3158;
            client var3 = new client();
            class140.field2578 = var3;
            var3.method1951(1024, class80.field1484 + 32, 28, 530, "runescape", 768, false, -11014);
            class69.field1203.setLocation(40, 40);
        } catch (Exception var6) {
            class100.method720(var6, (String) null, 1);
        }
        field2852++;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2850++;
        if (!this.method1955(8)) {
            return;
        }
        class259.field4549 = Integer.parseInt(this.getParameter("worldid"));
        class236.field4132 = Integer.parseInt(this.getParameter("modewhere"));
        if (class236.field4132 < 0 || class236.field4132 > 1) {
            class236.field4132 = 0;
        }
        class80.field1484 = Integer.parseInt(this.getParameter("modewhat"));
        if (class80.field1484 < 0 || class80.field1484 > 2) {
            class80.field1484 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class279.field4987 = true;
        } else {
            class279.field4987 = false;
        }
        try {
            class39.field588 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class39.field588 = 0;
        }
        class255.method1761((byte) 127, class39.field588);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class82.field1504 = true;
        } else {
            class82.field1504 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            field2846 = true;
        } else {
            field2846 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class245.field4306 = 1;
        } else {
            class245.field4306 = 0;
        }
        try {
            class216.field3807 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class216.field3807 = 0;
        }
        class159.field2927 = class112.field1929.method1045(this, 31365);
        if (class159.field2927 == null) {
            class159.field2927 = class171.field3158;
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class185.field3335 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class185.field3335 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class35.field523 = true;
        } else {
            class35.field523 = false;
        }
        class140.field2578 = this;
        this.method1947(-126, 765, class80.field1484 + 32, 530, 503);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method1108(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field2847++;
        if (class107.field1845 == 1000) {
            return;
        }
        boolean var2 = class48.method307(false);
        if (var2 && class71.field1241 && class116.field1991 != null) {
            class116.field1991.method979(-7755);
        }
        if ((class107.field1845 == 30 || class107.field1845 == 10) && (class22.field308 || class99.field1749 != 0L && class99.field1749 < class81.method608(19644))) {
            class227.method1521(class214.field3792, true, class79.method600(arg0 + 90), class22.field308, class257.field4489);
        }
        if (class47.field756 == null) {
            Container var3;
            if (class47.field756 != null) {
                var3 = class47.field756;
            } else if (class69.field1203 == null) {
                var3 = class272.field4900.field436;
            } else {
                var3 = class69.field1203;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class69.field1203 == var3) {
                Insets var6 = class69.field1203.getInsets();
                var5 -= var6.top + var6.bottom;
                var4 -= var6.right + var6.left;
            }
            if (class35.field530 != var4 || class273.field4910 != var5) {
                if (class29.field433.startsWith("mac")) {
                    class273.field4910 = var5;
                    class35.field530 = var4;
                } else {
                    class164.method1204(arg0 ^ 0xFFFFFFAC);
                }
                class99.field1749 = class81.method608(19644) + 500L;
            }
        }
        boolean var7 = false;
        if (class218.field3852) {
            var7 = true;
            class218.field3852 = false;
        }
        if (var7) {
            class7.method35(57);
        }
        if (class107.field1845 == 0) {
            class197.method1349(class171.field3152, var7, class32.field478, (byte) 75, (Color) null);
        } else if (class107.field1845 == 5) {
            class103.method728(-1, class173.field3180, false);
        } else if (class107.field1845 == 10) {
            class17.method99(arg0 ^ 0xFFFFFFCA);
        } else if (class107.field1845 == 25 || class107.field1845 == 28) {
            if (class175.field3213 == 1) {
                if (class111.field1918 < class277.field4946) {
                    class111.field1918 = class277.field4946;
                }
                int var8 = (class111.field1918 - class277.field4946) * 50 / class111.field1918;
                class73.method471(class237.method1603(new class149[] { class3.field39, class5.field58, class211.method1434(var8, true), class181.field3259 }, -102), false, (byte) -63);
            } else if (class175.field3213 == 2) {
                if (class10.field147 < class57.field1003) {
                    class10.field147 = class57.field1003;
                }
                int var9 = (class10.field147 - class57.field1003) * 50 / class10.field147 + 50;
                class73.method471(class237.method1603(new class149[] { class3.field39, class5.field58, class211.method1434(var9, true), class181.field3259 }, arg0 ^ 0xFFFFFF87), false, (byte) -44);
            } else {
                class73.method471(class3.field39, false, (byte) -81);
            }
        } else if (class107.field1845 == 30) {
            class124.method874((byte) 120);
        } else if (class107.field1845 == 40) {
            class73.method471(class237.method1603(new class149[] { class83.field1513, class43.field663, class79.field1478 }, -114), false, (byte) -68);
        }
        if ((class107.field1845 == 30 || class107.field1845 == 10) && class287.field5119 == 0 && !var7) {
            try {
                Graphics var12 = class244.field4295.getGraphics();
                for (int var13 = 0; var13 < class259.field4538; var13++) {
                    if (class216.field3819[var13]) {
                        class226.field3970.method1467((byte) -6, class259.field4548[var13], class157.field2887[var13], class54.field979[var13], class41.field645[var13], var12);
                        class216.field3819[var13] = false;
                    }
                }
            } catch (Exception var14) {
                class244.field4295.repaint();
            }
        } else if (class107.field1845 != 0) {
            try {
                Graphics var10 = class244.field4295.getGraphics();
                class226.field3970.method1472(1000, 0, 0, var10);
                for (int var11 = 0; var11 < class259.field4538; var11++) {
                    class216.field3819[var11] = false;
                }
            } catch (Exception var15) {
                class244.field4295.repaint();
            }
        }
        if (class243.field4269) {
            class37.method217(false);
        }
        if (class15.field219 && class107.field1845 == 10 && class11.field161 != -1) {
            class15.field219 = false;
            class83.method620(class272.field4900, (byte) 88);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private final void method1109(boolean arg0) {
        field2849++;
        if (class49.field893 < class271.field4868.field930) {
            class196.field3541 = (class271.field4868.field930 - 1) * 50 * 5;
            if (class32.field469 == class184.field3321) {
                class32.field469 = class169.field3130;
            } else {
                class32.field469 = class184.field3321;
            }
            if (class196.field3541 > 3000) {
                class196.field3541 = 3000;
            }
            if (class271.field4868.field930 >= 2 && class271.field4868.field929 == 6) {
                this.method1946(31439, "js5connect_outofdate");
                class107.field1845 = 1000;
                return;
            }
            if (class271.field4868.field930 >= 4 && class271.field4868.field929 == -1) {
                this.method1946(31439, "js5crc");
                class107.field1845 = 1000;
                return;
            }
            if (class271.field4868.field930 >= 4 && (class107.field1845 == 0 || class107.field1845 == 5)) {
                if (class271.field4868.field929 == 7 || class271.field4868.field929 == 9) {
                    this.method1946(31439, "js5connect_full");
                } else if (class271.field4868.field929 <= 0) {
                    this.method1946(31439, "js5io");
                } else {
                    this.method1946(31439, "js5connect");
                }
                class107.field1845 = 1000;
                return;
            }
        }
        if (arg0) {
            return;
        }
        class49.field893 = class271.field4868.field930;
        if (class196.field3541 > 0) {
            class196.field3541--;
            return;
        }
        try {
            if (class183.field3299 == 0) {
                class77.field1448 = class272.field4900.method174(class32.field469, false, class44.field673);
                class183.field3299++;
            }
            if (class183.field3299 == 1) {
                if (class77.field1448.field3358 == 2) {
                    this.method1112(-102, 1000);
                    return;
                }
                if (class77.field1448.field3358 == 1) {
                    class183.field3299++;
                }
            }
            if (class183.field3299 == 2) {
                class39.field599 = new class205((Socket) class77.field1448.field3357, class272.field4900);
                class74 var2 = new class74(5);
                var2.method494((byte) 4, 15);
                var2.method517(530, 125);
                class39.field599.method1400(0, var2.field1321, 5, (byte) 88);
                class183.field3299++;
                class30.field446 = class81.method608(19644);
            }
            if (class183.field3299 == 3) {
                if (class107.field1845 == 0 || class107.field1845 == 5 || class39.field599.method1392(1) > 0) {
                    int var3 = class39.field599.method1397(17506);
                    if (var3 != 0) {
                        this.method1112(-103, var3);
                        return;
                    }
                    class183.field3299++;
                } else if ((class81.method608(19644) - class30.field446) > 30000L) {
                    this.method1112(-112, 1001);
                    return;
                }
            }
            if (class183.field3299 == 4) {
                boolean var4 = class107.field1845 == 5 || class107.field1845 == 10 || class107.field1845 == 28;
                class271.field4868.method325(!var4, (byte) 119, class39.field599);
                class39.field599 = null;
                class77.field1448 = null;
                class183.field3299 = 0;
            }
        } catch (IOException var5) {
            this.method1112(-111, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lid;Laj;B)Lid;")
    public static final class149 method1110(class149 arg0, class47 arg1, byte arg2) {
        if (arg2 > 0) {
            method1115((class47) null);
        }
        if (arg0.method1036((byte) -128, class222.field3901) != -1) {
            label62: while (true) {
                int var3 = arg0.method1036((byte) -128, class288.field5149);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.method1036((byte) -128, class208.field3729);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.method1036((byte) -128, class257.field4505);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.method1036((byte) -128, class85.field1558);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.method1036((byte) -128, class13.field171);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.method1036((byte) -128, class217.field3829);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class149 var9 = class171.field3158;
                                                        if (class133.field2416 != null) {
                                                            var9 = class63.method396(class133.field2416.field3359, true);
                                                            try {
                                                                if (class133.field2416.field3357 != null) {
                                                                    byte[] var10 = ((String) class133.field2416.field3357).getBytes("ISO-8859-1");
                                                                    var9 = class37.method214(var10, 0, var10.length, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg0 = class237.method1603(new class149[] { arg0.method1024(0, -5975, var8), var9, arg0.method1025((byte) 34, var8 + 4) }, -125);
                                                    }
                                                }
                                                arg0 = class237.method1603(new class149[] { arg0.method1024(0, -5975, var7), class243.method1692(class113.method795(arg1, 4, (byte) 106), (byte) 11), arg0.method1025((byte) 34, var7 + 2) }, -100);
                                            }
                                        }
                                        arg0 = class237.method1603(new class149[] { arg0.method1024(0, -5975, var6), class243.method1692(class113.method795(arg1, 3, (byte) 78), (byte) 11), arg0.method1025((byte) 34, var6 + 2) }, -104);
                                    }
                                }
                                arg0 = class237.method1603(new class149[] { arg0.method1024(0, -5975, var5), class243.method1692(class113.method795(arg1, 2, (byte) -97), (byte) 11), arg0.method1025((byte) 34, var5 + 2) }, -103);
                            }
                        }
                        arg0 = class237.method1603(new class149[] { arg0.method1024(0, -5975, var4), class243.method1692(class113.method795(arg1, 1, (byte) -57), (byte) 11), arg0.method1025((byte) 34, var4 + 2) }, -102);
                    }
                }
                arg0 = class237.method1603(new class149[] { arg0.method1024(0, -5975, var3), class243.method1692(class113.method795(arg1, 0, (byte) -37), (byte) 11), arg0.method1025((byte) 34, var3 + 2) }, -125);
            }
        }
        field2858++;
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static void method1111(byte arg0) {
        field2862 = null;
        field2854 = null;
        field2851 = null;
        field2855 = null;
        if (arg0 > -82) {
            main((String[]) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method1112(int arg0, int arg1) {
        class271.field4868.field930++;
        class39.field599 = null;
        class77.field1448 = null;
        if (arg0 <= -101) {
            class271.field4868.field929 = arg1;
            field2863++;
            class183.field3299 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method1113(boolean arg0) {
        method1111((byte) -120);
        class149.method1035(125);
        class61.method383(0);
        class24.method136(17882);
        class278.method1921(false);
        field2864++;
        class284.method1949(95);
        class65.method409(0);
        class273.method1894(1000);
        class184.method1272(4);
        class180.method1255(false);
        class74.method505(8);
        class205.method1401(-82);
        class50.method321(-120);
        class263.method1831(1);
        class134.method942(5430);
        class196.method1333(-25377);
        class230.method1528(-67);
        class260.method1799((byte) -113);
        class166.method1213((byte) 14);
        class189.method1294(true);
        class20.method114(arg0);
        class28.method161((byte) -127);
        class108.method763((byte) -40);
        class47.method291((byte) -69);
        class127.method887((byte) -99);
        class157.method1134(30551);
        class190.method1296((byte) 127);
        class85.method635(1);
        class43.method249(-32768);
        class281.method1932(2);
        class37.method218(-95);
        class140.method985(7);
        class11.method65(0);
        class194.method1317(17158);
        class164.method1200(0);
        class131.method916((byte) 17);
        class231.method1563(-21485);
        class268.method1860(-66);
        class18.method105(112);
        class59.method376((byte) 85);
        class3.method15(true);
        class161.method1177(4);
        class64.method403(arg0);
        class69.method439(-127);
        class195.method1326((byte) 87);
        class174.method1237((byte) 52);
        class137.method958((byte) -93);
        class242.method1689(126);
        class170.method1222((byte) -15);
        class270.method1876((byte) 56);
        class163.method1198(1560117857);
        class255.method1753(119);
        class16.method97(124);
        class126.method879((byte) 62);
        class276.method1906(true);
        class86.method643(-11725);
        class272.method1891(108);
        class63.method397(-67);
        class122.method863(45);
        class279.method1924((byte) -51);
        class201.method1375((byte) -126);
        class7.method36(-109);
        class241.method1676();
        class6.method33((byte) 9);
        class261.method1802(255);
        class121.method838();
        class60.method379(true);
        class98.method710(-63);
        class182.method1264((byte) -87);
        class206.method1411((byte) -38);
        class79.method599(-1);
        class77.method590((byte) 101);
        class198.method1352(0);
        class160.method1166();
        class226.method1518(-96);
        class197.method1345(-74);
        class202.method1379();
        class214.method1450((byte) -119);
        class181.method1258(false);
        class148.method1015(100);
        class225.method1514();
        class2.method11(1);
        class17.method102(113);
        class55.method350(21482);
        class138.method963(0);
        class72.method446();
        class25.method142(-118);
        class92.method676(-8);
        class49.method316(false);
        class172.method1229(-84);
        class115.method798(false);
        class257.method1771(true);
        class52.method342(-8677);
        class8.method43((byte) -124);
        class110.method778((byte) 115);
        class68.method425(-120);
        class71.method443(2);
        class207.method1412(1);
        class264.method1837((byte) 103);
        class288.method1974((byte) -127);
        class219.method1483(-121);
        class90.method664(0);
        class247.method1718(1389);
        class13.method85(40);
        class244.method1694(110);
        class27.method153((byte) 42);
        class75.method546((byte) -3);
        class223.method1501(0);
        class123.method866((byte) -105);
        class185.method1273((byte) 52);
        class136.method954(!arg0);
        class129.method900(-22760);
        class235.method1582();
        class133.method934((byte) -121);
        class48.method309(1);
        class228.method1527(26513);
        class218.method1476((byte) -71);
        class208.method1418(69);
        class99.method715(true);
        class111.method783(true);
        class243.method1691((byte) -113);
        class236.method1598(111);
        class1.method5(512);
        class199.method1362((byte) -128);
        class23.method131(1023);
        class168.method1218(25180);
        class125.method877(false);
        class158.method1143(32);
        class100.method719(11146);
        class152.method1078((byte) -36);
        class188.method1287((byte) -112);
        class53.method344();
        class40.method236((byte) 108);
        class155.method1096(127);
        class38.method221(true);
        class266.method1851();
        class78.method596(-6127);
        class221.method1492(-7072);
        class67.method416(22050);
        class227.method1523((byte) 49);
        class216.method1460((byte) -23);
        class19.method109((byte) -75);
        class259.method1788(-6580);
        class251.method1742(105);
        class116.method805(-1);
        class250.method1736();
        class175.method1241(1);
        class167.method1216(25548);
        class169.method1221(-1);
        class39.method228((byte) -48);
        class135.method947(-1);
        class240.method1653((byte) 86);
        class9.method55(0);
        class252.method1746(false);
        class287.method1967(97);
        class269.method1875(-8317);
        class159.method1148(!arg0);
        class15.method95(-59);
        class80.method607(true);
        class143.method996((byte) -31);
        class32.method189(-93);
        class277.method1911(-31978);
        class165.method1209(-25229);
        class210.method1431((byte) -117);
        class217.method1468((byte) 58);
        class30.method181(false);
        class249.method1734((byte) 111);
        class10.method57((byte) -1);
        class267.method1853((byte) 106);
        class265.method1842();
        class222.method1494(73);
        class103.method730(0);
        class254.method1752((byte) 47);
        class286.method1963((byte) -81);
        class82.method610(113);
        class173.method1234(0);
        class58.method363();
        class89.method658();
        class93.method682((byte) 113);
        class176.method1245((byte) 84);
        class153.method1079();
        class130.method909();
        class35.method204(true);
        class36.method209((byte) 69);
        class200.method1373(29749);
        class22.method129((byte) -127);
        class139.method967(-107);
        class271.method1884(-30);
        class57.method356(-114);
        class87.method645(-2955);
        class256.method1766((byte) -125);
        class113.method794(67);
        class147.method1009((byte) 26);
        class245.method1708(!arg0);
        class66.method411(255);
        class124.method876((byte) -111);
        class248.method1723((byte) -54);
        class275.method1902(-1);
        class118.method819(-126);
        class193.method1308(0);
        class95.method694(0);
        class246.method1711(-114);
        class145.method1002(false);
        class186.method1280(0);
        class128.method892((byte) 121);
        class237.method1602(7288);
        class54.method346(-96);
        class112.method790((byte) 14);
        class91.method667(2823);
        class183.method1268((byte) -111);
        class191.method1301((byte) 125);
        class97.method706(0);
        class213.method1443(115);
        class96.method699(8);
        class44.method256(-2);
        class62.method392(true);
        class151.method1075(124);
        class285.method1958(123);
        class5.method29(0);
        class141.method989(113);
        class34.method196(-128);
        class101.method722(1030194214);
        class73.method477(-8698);
        class26.method144(2);
        class233.method1572(32154);
        class70.method441(127);
        class253.method1748(-10744);
        class146.method1004(1489062284);
        class102.method724(2048);
        class41.method242(true);
        class14.method90(-1);
        class154.method1095(9000);
        class232.method1566((byte) 118);
        class224.method1504(0);
        class177.method1246(906);
        class109.method770(-17116);
        class156.method1124(126);
        class45.method262(21);
        class283.method1943((byte) -123);
        class83.method617((byte) 75);
        class107.method746(105);
        class104.method734(-1);
        class258.method1779(0);
        class211.method1435(0);
        class94.method688((byte) 62);
        class171.method1228(false);
        class106.method743(31926);
        class84.method624(26675);
        class119.method821((byte) -100);
        class31.method185(!arg0);
        class162.method1193(-122);
        class192.method1307(-111);
        class150.method1073((byte) -101);
        if (class284.field5063) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method1114(int arg0) {
        field2860++;
        if (class107.field1845 == 1000) {
            return;
        }
        class118.field2022++;
        if ((class118.field2022 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class172.field3171 = var2.get(11) * 600 - (-(var2.get(12) * 10) - var2.get(13) / 6);
            class92.field1633.setSeed((long) class172.field3171);
        }
        this.method1119(3524);
        if (class258.field4511 != null) {
            class258.field4511.method939(true);
        }
        class44.method255(10359);
        class279.method1923(64);
        class76.method550(true);
        class271.method1881((byte) 106);
        if (class25.field381 != null) {
            int var3 = class25.field381.method245((byte) -56);
            class180.field3250 = var3;
        }
        if (arg0 < 58) {
            main((String[]) null);
        }
        if (class107.field1845 == 0) {
            this.method1116((byte) 110);
            class182.method1266(28028);
        } else if (class107.field1845 == 5) {
            this.method1116((byte) 76);
            class182.method1266(28028);
        } else if (class107.field1845 == 25 || class107.field1845 == 28) {
            class233.method1570(-30458);
        }
        if (class107.field1845 == 10) {
            this.method1117((byte) 94);
            class218.method1474(-1439);
            class9.method50(125);
            class43.method247(-28426);
        } else if (class107.field1845 == 30) {
            class197.method1347(118);
            return;
        } else if (class107.field1845 == 40) {
            class43.method247(-28426);
            if (class140.field2558 != -3) {
                if (class140.field2558 == 15) {
                    class177.method1247(true);
                    return;
                }
                if (class140.field2558 != 2) {
                    class9.method51(106);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Laj;)Laj;")
    public static final class47 method1115(class47 arg0) {
        int var1 = method1104(arg0).method1181(-30954);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class251.method1741((byte) 110, arg0.field707);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method1116(byte arg0) {
        if (!class15.field219) {
            label233: while (true) {
                do {
                    if (!class149.method1068(false)) {
                        break label233;
                    }
                } while (class264.field4721 != 115 && class264.field4721 != 83);
                class15.field219 = true;
            }
        }
        field2848++;
        if (class7.field76 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class81.method608(19644);
            if (class145.field2617 == 0L) {
                class145.field2617 = var4;
            }
            if (var3 > 16384 && (var4 - class145.field2617) < 5000L) {
                if ((var4 - class252.field4426) > 1000L) {
                    System.gc();
                    class252.field4426 = var4;
                }
                class32.field478 = class180.field3244;
                class171.field3152 = 5;
            } else {
                class32.field478 = class75.field1344;
                class171.field3152 = 5;
                class7.field76 = 10;
            }
        } else if (class7.field76 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class228.field3989[var6] = new class108(104, 104);
            }
            class171.field3152 = 10;
            class32.field478 = class66.field1165;
            class7.field76 = 30;
        } else if (class7.field76 == 30) {
            if (class258.field4511 == null) {
                class258.field4511 = new class134(class271.field4868, class2.field23);
            }
            if (class258.field4511.method941(-5)) {
                class101.field1774 = class231.method1564(false, true, 0, true, 6021);
                class175.field3211 = class231.method1564(false, true, 1, true, 6021);
                class94.field1653 = class231.method1564(true, true, 2, false, 6021);
                class133.field2423 = class231.method1564(false, true, 3, true, 6021);
                class226.field3964 = class231.method1564(false, true, 4, true, 6021);
                class221.field3874 = class231.method1564(true, true, 5, true, 6021);
                class230.field4010 = class231.method1564(true, false, 6, true, 6021);
                class269.field4851 = class231.method1564(false, true, 7, true, 6021);
                class270.field4864 = class231.method1564(false, true, 8, true, 6021);
                class30.field445 = class231.method1564(false, true, 9, true, 6021);
                class164.field3058 = class231.method1564(false, true, 10, true, 6021);
                class74.field1294 = class231.method1564(false, true, 11, true, 6021);
                class162.field3003 = class231.method1564(false, true, 12, true, 6021);
                class158.field2912 = class231.method1564(false, true, 13, true, 6021);
                class36.field537 = class231.method1564(false, false, 14, true, 6021);
                class233.field4107 = class231.method1564(false, true, 15, true, 6021);
                class14.field209 = class231.method1564(false, true, 16, true, 6021);
                class7.field77 = class231.method1564(false, true, 17, true, 6021);
                class189.field3381 = class231.method1564(false, true, 18, true, 6021);
                class40.field623 = class231.method1564(false, true, 19, true, 6021);
                class287.field5093 = class231.method1564(false, true, 20, true, 6021);
                class254.field4443 = class231.method1564(false, true, 21, true, 6021);
                class245.field4309 = class231.method1564(false, true, 22, true, 6021);
                class169.field3133 = class231.method1564(true, true, 23, true, 6021);
                class45.field689 = class231.method1564(false, true, 24, true, 6021);
                class1.field5 = class231.method1564(false, true, 25, true, 6021);
                class193.field3461 = class231.method1564(true, true, 26, true, 6021);
                class206.field3697 = class231.method1564(false, true, 27, true, 6021);
                class7.field76 = 40;
                class32.field478 = class2.field30;
                class171.field3152 = 15;
            } else {
                class171.field3152 = 12;
                class32.field478 = class125.field2198;
            }
        } else if (class7.field76 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 28; var8++) {
                var7 += class25.field378[var8].method1342(0) * class194.field3487[var8] / 100;
            }
            if (var7 == 100) {
                class171.field3152 = 20;
                class32.field478 = class35.field510;
                class79.method597(class270.field4864, 52);
                class276.method1904(81, class270.field4864);
                class285.method1961(class270.field4864, -26442);
                class7.field76 = 45;
            } else {
                if (var7 != 0) {
                    class32.field478 = class237.method1603(new class149[] { class253.field4441, class211.method1434(var7, true), class222.field3901 }, -127);
                }
                class171.field3152 = 20;
            }
        } else if (class7.field76 == 45) {
            class222.method1495(2, 126, class126.field2209, 22050);
            class147.field2655 = new class76();
            class147.field2655.method587(128, 9, 86);
            class116.field1991 = class13.method78(22050, class272.field4900, 0, -9634, class244.field4295);
            class116.field1991.method975(-121, class147.field2655);
            class244.method1698(class147.field2655, class36.field537, false, class233.field4107, class226.field3964);
            class79.field1476 = class13.method78(2048, class272.field4900, 1, -9634, class244.field4295);
            class246.field4318 = new class117();
            class79.field1476.method975(104, class246.field4318);
            class167.field3097 = new class11(22050, class113.field1937);
            class218.field3855 = class230.field4010.method1550((byte) 125, class59.field1018);
            class171.field3152 = 30;
            class32.field478 = class43.field664;
            class7.field76 = 50;
        } else if (class7.field76 == 50) {
            int var9 = class54.method345(class270.field4864, class158.field2912, -119);
            int var10 = class30.method182((byte) -50);
            if (var10 > var9) {
                class32.field478 = class237.method1603(new class149[] { class140.field2559, class211.method1434(var9 * 100 / var10, true), class222.field3901 }, -94);
                class171.field3152 = 35;
            } else {
                class171.field3152 = 35;
                class7.field76 = 60;
                class32.field478 = class231.field4076;
            }
        } else if (class7.field76 == 60) {
            int var11 = class245.method1707(class270.field4864, 123);
            int var12 = class104.method733(100);
            if (var11 < var12) {
                class32.field478 = class237.method1603(new class149[] { class228.field3993, class211.method1434(var11 * 100 / var12, true), class222.field3901 }, -113);
                class171.field3152 = 40;
            } else {
                class32.field478 = class190.field3410;
                class7.field76 = 65;
                class171.field3152 = 40;
            }
        } else if (class7.field76 == 65) {
            class198.method1358((byte) 114, class270.field4864, class158.field2912);
            class32.field478 = class129.field2290;
            class171.field3152 = 45;
            class50.method329(-11461, 5);
            class7.field76 = 70;
        } else if (class7.field76 == 70) {
            class94.field1653.method1549(-2);
            byte var13 = 0;
            int var14 = var13 + class94.field1653.method1553(0);
            class14.field209.method1549(-2);
            int var15 = var14 + class14.field209.method1553(0);
            class7.field77.method1549(-2);
            int var16 = var15 + class7.field77.method1553(0);
            class189.field3381.method1549(-2);
            int var17 = var16 + class189.field3381.method1553(0);
            class40.field623.method1549(-2);
            int var18 = var17 + class40.field623.method1553(0);
            class287.field5093.method1549(-2);
            int var19 = var18 + class287.field5093.method1553(0);
            class254.field4443.method1549(-2);
            int var20 = var19 + class254.field4443.method1553(0);
            class245.field4309.method1549(-2);
            int var21 = var20 + class245.field4309.method1553(0);
            class45.field689.method1549(-2);
            int var22 = var21 + class45.field689.method1553(0);
            class1.field5.method1549(-2);
            int var23 = var22 + class1.field5.method1553(0);
            class206.field3697.method1549(-2);
            int var24 = var23 + class206.field3697.method1553(0);
            if (var24 < 1100) {
                class32.field478 = class237.method1603(new class149[] { class85.field1560, class211.method1434(var24 / 11, true), class222.field3901 }, -115);
                class171.field3152 = 50;
            } else {
                class257.method1773(48, class94.field1653);
                class141.method986(class94.field1653, (byte) -110);
                class104.method737(class94.field1653, -51);
                class149.method1020(class94.field1653, (byte) 69, class269.field4851);
                class223.method1502(class269.field4851, (byte) 58, class14.field209, true);
                class147.method1010(-2, class189.field3381, class269.field4851);
                class155.method1098(class40.field623, -128, true, class226.field3959, class269.field4851);
                class113.method791(0, class94.field1653);
                class137.method957(class287.field5093, class175.field3211, -124, class101.field1774);
                class99.method714(49, class94.field1653);
                class158.method1142(class269.field4851, class254.field4443, true);
                class258.method1778(415013098, class245.field4309);
                class52.method341(class94.field1653, (byte) -20);
                class1.method1(class158.field2912, class270.field4864, true, class269.field4851, class133.field2423);
                class161.method1189(102, class94.field1653);
                class270.method1878(-17017, class7.field77);
                class175.method1240(class1.field5, new class27(), 1, class45.field689);
                class67.method413(class45.field689, class1.field5, (byte) -6);
                class240.method1656(class94.field1653, false);
                class7.method38(-33, class94.field1653, class270.field4864);
                class45.method258(class270.field4864, class94.field1653, (byte) -103);
                class32.field478 = class64.field1147;
                class171.field3152 = 50;
                class211.method1440((byte) -91);
                class7.field76 = 80;
            }
        } else if (class7.field76 == 80) {
            int var25 = class256.method1765(class270.field4864, false);
            int var26 = class193.method1310(true);
            if (var26 > var25) {
                class32.field478 = class237.method1603(new class149[] { class207.field3715, class211.method1434(var25 * 100 / var26, true), class222.field3901 }, -124);
                class171.field3152 = 60;
            } else {
                class173.method1235(class270.field4864, -7058);
                class171.field3152 = 60;
                class7.field76 = 90;
                class32.field478 = class150.field2747;
            }
        } else if (class7.field76 == 90) {
            if (class193.field3461.method1549(-2)) {
                class136 var27 = new class136(class30.field445, class193.field3461, class270.field4864, 20, !class83.field1512);
                class235.method1587(var27);
                if (class140.field2573 == 1) {
                    class235.method1575(0.9F);
                }
                if (class140.field2573 == 2) {
                    class235.method1575(0.8F);
                }
                if (class140.field2573 == 3) {
                    class235.method1575(0.7F);
                }
                if (class140.field2573 == 4) {
                    class235.method1575(0.6F);
                }
                class32.field478 = class64.field1142;
                class7.field76 = 100;
                class171.field3152 = 70;
            } else {
                class32.field478 = class237.method1603(new class149[] { class228.field3994, class211.method1434(class193.field3461.method1553(0), true), class222.field3901 }, -118);
                class171.field3152 = 70;
            }
        } else if (class7.field76 == 100) {
            if (class217.method1465(class270.field4864, 14)) {
                class7.field76 = 110;
            }
        } else if (class7.field76 == 110) {
            class50.field914 = new class184();
            class272.field4900.method175(2, class50.field914, 10);
            class32.field478 = class136.field2475;
            class7.field76 = 120;
            class171.field3152 = 75;
        } else if (class7.field76 == 120) {
            if (class164.field3058.method1545(class171.field3158, 25653, class196.field3513)) {
                class133 var28 = new class133(class164.field3058.method1540(118, class171.field3158, class196.field3513));
                class278.method1920(var28, 122);
                class171.field3152 = 80;
                class32.field478 = class154.field2817;
                class7.field76 = 130;
            } else {
                class32.field478 = class237.method1603(new class149[] { class74.field1287, class47.field854 }, -106);
                class171.field3152 = 80;
            }
        } else if (class7.field76 != 130) {
            if (arg0 < 46) {
                field2851 = null;
            }
            if (class7.field76 == 135) {
                int var29 = class268.method1869(-1);
                if (var29 == -1) {
                    class171.field3152 = 95;
                    class32.field478 = class32.field475;
                } else if (var29 == 7 || var29 == 9) {
                    this.method1946(31439, "worldlistfull");
                    class50.method329(-11461, 1000);
                } else if (class237.field4149) {
                    class7.field76 = 140;
                    class32.field478 = class111.field1917;
                    class171.field3152 = 96;
                } else {
                    this.method1946(31439, "worldlistio_" + var29);
                    class50.method329(-11461, 1000);
                }
            } else if (class7.field76 == 140) {
                class277.field4956 = class133.field2423.method1550((byte) 99, class102.field1797);
                class221.field3874.method1534((byte) 95, true, false);
                class230.field4010.method1534((byte) -85, true, true);
                class270.field4864.method1534((byte) 86, true, true);
                class158.field2912.method1534((byte) 127, true, true);
                class164.field3058.method1534((byte) 105, true, true);
                class133.field2423.method1534((byte) 115, true, true);
                class171.field3152 = 97;
                class7.field76 = 150;
                class32.field478 = class287.field5087;
                class243.field4269 = true;
            } else if (class7.field76 == 150) {
                if (class15.field219) {
                    class99.field1758 = 0;
                    class136.field2496 = 0;
                    class180.field3242 = 0;
                    class169.field3137 = 0;
                }
                class15.field219 = true;
                class83.method620(class272.field4900, (byte) 88);
                class227.method1521(-1, true, class169.field3137, false, -1);
                class32.field478 = class64.field1149;
                class171.field3152 = 100;
                class7.field76 = 160;
            } else if (class7.field76 == 160) {
                class60.method381(8, true);
            }
        } else if (!class133.field2423.method1549(-2)) {
            class32.field478 = class237.method1603(new class149[] { class287.field5084, class211.method1434(class133.field2423.method1553(0) * 3 / 4, true), class222.field3901 }, -104);
            class171.field3152 = 85;
        } else if (!class162.field3003.method1549(-2)) {
            class32.field478 = class237.method1603(new class149[] { class287.field5084, class211.method1434(class162.field3003.method1553(0) / 10 + 75, true), class222.field3901 }, -105);
            class171.field3152 = 85;
        } else if (!class158.field2912.method1549(-2)) {
            class32.field478 = class237.method1603(new class149[] { class287.field5084, class211.method1434(class158.field2912.method1553(0) / 20 + 85, true), class222.field3901 }, -92);
            class171.field3152 = 85;
        } else if (class169.field3133.method1529(256, class217.field3839)) {
            class196.method1331(120, class60.field1081, class169.field3133);
            class171.field3152 = 95;
            class7.field76 = 135;
            class32.field478 = class113.field1942;
        } else {
            class32.field478 = class237.method1603(new class149[] { class287.field5084, class211.method1434(class169.field3133.method1537(class217.field3839, -19579) / 10 + 90, true), class222.field3901 }, -93);
            class171.field3152 = 85;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method1117(byte arg0) {
        class40.field633 = 0;
        field2856++;
        while (class149.method1068(false) && class40.field633 < 128) {
            class248.field4353[class40.field633] = class164.field3053;
            class11.field157[class40.field633] = class264.field4721;
            class40.field633++;
        }
        class149.field2683++;
        if (arg0 != 94) {
            return;
        }
        if (class11.field161 != -1) {
            class133.method935(class240.field4197, 0, class218.field3851, 0, (byte) -24, class11.field161, 0, 0);
        }
        class90.field1606++;
        class76.method548((byte) -81);
        while (true) {
            class1 var2;
            class47 var3;
            class47 var4;
            do {
                var2 = (class1) class17.field253.method1137(true);
                if (var2 == null) {
                    while (true) {
                        class1 var5;
                        class47 var6;
                        class47 var7;
                        do {
                            var5 = (class1) class231.field4045.method1137(true);
                            if (var5 == null) {
                                while (true) {
                                    class1 var8;
                                    class47 var9;
                                    class47 var10;
                                    do {
                                        var8 = (class1) class258.field4506.method1137(true);
                                        if (var8 == null) {
                                            if (class244.field4296 != null) {
                                                class240.method1655((byte) -124);
                                            }
                                            if (class83.field1519 != null && class83.field1519.field3358 == 1) {
                                                if (class83.field1519.field3357 != null) {
                                                    class95.method690(class213.field3774, (byte) 117, field2862);
                                                }
                                                class83.field1519 = null;
                                                field2862 = null;
                                                class213.field3774 = false;
                                            }
                                            if (class118.field2022 % 1500 == 0) {
                                                class69.method432(arg0 - 94);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field13;
                                        if (var9.field799 < 0) {
                                            break;
                                        }
                                        var10 = class251.method1741((byte) 110, var9.field707);
                                    } while (var10 == null || var10.field761 == null || var10.field761.length <= var9.field799 || var10.field761[var9.field799] != var9);
                                    class288.method1973(var8, 93);
                                }
                            }
                            var6 = var5.field13;
                            if (var6.field799 < 0) {
                                break;
                            }
                            var7 = class251.method1741((byte) 110, var6.field707);
                        } while (var7 == null || var7.field761 == null || var6.field799 >= var7.field761.length || var7.field761[var6.field799] != var6);
                        class288.method1973(var5, 125);
                    }
                }
                var3 = var2.field13;
                if (var3.field799 < 0) {
                    break;
                }
                var4 = class251.method1741((byte) 110, var3.field707);
            } while (var4 == null || var4.field761 == null || var3.field799 >= var4.field761.length || var4.field761[var3.field799] != var3);
            class288.method1973(var2, arg0 ^ 0x19);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLaj;I)V")
    public static final void method1118(int arg0, byte arg1, class47 arg2, int arg3) {
        field2861++;
        if (class244.field4296 != null || class32.field481 || arg2 == null || class44.method254(arg2, arg1 ^ 0xC2) == null) {
            return;
        }
        class244.field4296 = arg2;
        class102.field1801 = class44.method254(arg2, arg1 + 194);
        class106.field1831 = arg3;
        class182.field3285 = false;
        class270.field4856 = 0;
        class106.field1839 = arg0;
        if (arg1 != 61) {
            main((String[]) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method1119(int arg0) {
        boolean var2 = class271.field4868.method334(arg0 ^ arg0);
        field2859++;
        if (!var2) {
            this.method1109(false);
        }
    }
}
