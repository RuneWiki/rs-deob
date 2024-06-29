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
public class client extends class183 {

    @OriginalMember(owner = "client!client", name = "W", descriptor = "Lvf;")
    public static class265 field3852 = class87.method582(-46, "Cach-B");

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field3854 = 0;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Z")
    public static boolean field3855 = true;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "[I")
    public static int[] field3859 = new int[2];

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
    public static int[] field3858 = new int[100];

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
    public static boolean field3868;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method1237(byte arg0) {
        field3867++;
        if (class246.field4281 == 1000) {
            return;
        }
        if (arg0 < 21) {
            field3854 = -75;
        }
        boolean var2 = class25.method231(true);
        if (var2 && class112.field1964 && class238.field4145 != null) {
            class238.field4145.method670(-120);
        }
        if ((class246.field4281 == 30 || class246.field4281 == 10) && (class44.field969 || class176.field3143 != 0L && class176.field3143 < class136.method950(8954))) {
            class57.method430(class232.method1565((byte) 37), class283.field4990, class44.field969, 0, class10.field341);
        }
        if (class141.field2621 == null) {
            Container var3;
            if (class141.field2621 != null) {
                var3 = class141.field2621;
            } else if (class49.field1044 == null) {
                var3 = class281.field4957.field4024;
            } else {
                var3 = class49.field1044;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class49.field1044 == var3) {
                Insets var6 = class49.field1044.getInsets();
                var4 -= var6.right + var6.left;
                var5 -= var6.top + var6.bottom;
            }
            if (class78.field1489 != var4 || class145.field2700 != var5) {
                if (class226.field4011.startsWith("mac")) {
                    class145.field2700 = var5;
                    class78.field1489 = var4;
                } else {
                    class279.method1901(false);
                }
                class176.field3143 = class136.method950(8954) + 500L;
            }
        }
        boolean var7 = false;
        if (class63.field1239) {
            var7 = true;
            class63.field1239 = false;
        }
        if (var7) {
            class208.method1428(-1);
        }
        if (class246.field4281 == 0) {
            class108.method720(-23741, class281.field4963, class51.field1069, var7, (Color) null);
        } else if (class246.field4281 == 5) {
            class130.method860(-24, false, class205.field3692);
        } else if (class246.field4281 == 10) {
            class182.method1211((byte) -123);
        } else if (class246.field4281 == 25 || class246.field4281 == 28) {
            if (class211.field3792 == 1) {
                if (class19.field499 < class174.field3121) {
                    class19.field499 = class174.field3121;
                }
                int var9 = (class19.field499 - class174.field3121) * 50 / class19.field499;
                class166.method1094(24974, false, class148.method1022(10, new class265[] { class119.field2103, class212.field3806, class241.method1609(true, var9), class28.field728 }));
            } else if (class211.field3792 == 2) {
                if (class65.field1264 < class82.field1542) {
                    class65.field1264 = class82.field1542;
                }
                int var8 = (class65.field1264 - class82.field1542) * 50 / class65.field1264 + 50;
                class166.method1094(24974, false, class148.method1022(10, new class265[] { class119.field2103, class212.field3806, class241.method1609(true, var8), class28.field728 }));
            } else {
                class166.method1094(24974, false, class119.field2103);
            }
        } else if (class246.field4281 == 30) {
            class10.method84(-27);
        } else if (class246.field4281 == 40) {
            class166.method1094(24974, false, class148.method1022(10, new class265[] { class248.field4310, class198.field3546, class238.field4160 }));
        }
        if ((class246.field4281 == 30 || class246.field4281 == 10) && class111.field1952 == 0 && !var7) {
            try {
                Graphics var12 = class125.field2241.getGraphics();
                for (int var13 = 0; var13 < class119.field2104; var13++) {
                    if (class80.field1516[var13]) {
                        class252.field4334.method578(class102.field1811[var13], var12, -101, class124.field2229[var13], field3858[var13], class72.field1390[var13]);
                        class80.field1516[var13] = false;
                    }
                }
            } catch (Exception var14) {
                class125.field2241.repaint();
            }
        } else if (class246.field4281 != 0) {
            try {
                Graphics var10 = class125.field2241.getGraphics();
                class252.field4334.method580(0, 0, var10, true);
                for (int var11 = 0; var11 < class119.field2104; var11++) {
                    class80.field1516[var11] = false;
                }
            } catch (Exception var15) {
                class125.field2241.repaint();
            }
        }
        if (class15.field450) {
            class260.method1730(false);
        }
        if (class100.field1774 && class246.field4281 == 10 && class8.field271 != -1) {
            class100.field1774 = false;
            class7.method53(class281.field4957, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lvf;ILvf;ILvf;I)V")
    public static final void method1468(class265 arg0, int arg1, class265 arg2, int arg3, class265 arg4, int arg5) {
        field3866++;
        for (int var6 = 99; var6 > 0; var6--) {
            class104.field1845[var6] = class104.field1845[var6 - 1];
            class78.field1486[var6] = class78.field1486[var6 - 1];
            class59.field1194[var6] = class59.field1194[var6 - 1];
            class267.field4707[var6] = class267.field4707[var6 - 1];
            class123.field2223[var6] = class123.field2223[var6 - 1];
        }
        class78.field1486[0] = arg0;
        class268.field4783++;
        class104.field1845[0] = arg5;
        int var7 = 68 / ((-arg3 - 40) / 51);
        class63.field1240 = class135.field2455;
        class123.field2223[0] = arg1;
        class59.field1194[0] = arg4;
        class267.field4707[0] = arg2;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public static final void method1469(byte arg0) {
        field3862++;
        if (arg0 != 0) {
            field3852 = null;
        }
        int var1 = class127.method844(arg0 + 2);
        if (var1 == 0) {
            class261.field4570 = null;
            class123.method826(-14010, 0);
        } else if (var1 == 1) {
            class131.method878((byte) 0, (byte) -110);
            class123.method826(-14010, 512);
            class19.method134(arg0 ^ 0xFFFFFDFF);
        } else {
            class131.method878((byte) (class257.field4401 - 4 & 0xFF), (byte) -123);
            class123.method826(-14010, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lgk;IIIIIII)V")
    public static final void method1470(class6[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class6 var9 = arg0[var8];
            if (var9 != null && var9.field142 == arg1 && (!var9.field226 || var9.field187 == 0 || var9.field213 || method1474(var9) != 0 || class273.field4846 == var9 || var9.field146 == 1338) && (!var9.field226 || !method1472(var9))) {
                int var10 = var9.field153 + arg6;
                int var11 = var9.field204 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field187 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field89 + var10;
                    int var17 = var9.field84 + var11;
                    if (var9.field187 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class207.field3722 == var9) {
                    class30.field751 = true;
                    class237.field4143 = var10;
                    class42.field938 = var11;
                }
                if (!var9.field226 || var12 < var14 && var13 < var15) {
                    if (var9.field187 == 0) {
                        if (!var9.field226 && method1472(var9) && class44.field967 != var9) {
                            continue;
                        }
                        if (var9.field130 && class79.field1497 >= var12 && class268.field4722 >= var13 && class79.field1497 < var14 && class268.field4722 < var15) {
                            for (class277 var18 = (class277) class64.field1245.method789((byte) -127); var18 != null; var18 = (class277) class64.field1245.method787((byte) -76)) {
                                if (var18.field4898) {
                                    var18.method97(158);
                                    var18.field4901.field197 = false;
                                }
                            }
                            if (class199.field3563 == 0) {
                                class207.field3722 = null;
                                class273.field4846 = null;
                            }
                            class9.field292 = false;
                        }
                    }
                    if (var9.field226) {
                        boolean var19;
                        if (class79.field1497 >= var12 && class268.field4722 >= var13 && class79.field1497 < var14 && class268.field4722 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class232.field4102 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class141.field2620 == 1 && class122.field2193 >= var12 && class192.field3427 >= var13 && class122.field2193 < var14 && class192.field3427 < var15) {
                            var21 = true;
                        }
                        if (class44.field966 > 0 && var9.field91 != null) {
                            for (int var22 = 0; var22 < var9.field91.length; var22++) {
                                for (int var23 = 0; var23 < class44.field966; var23++) {
                                    int var24 = var9.field91[var22] & 0xFF;
                                    if (class82.field1550[var23] == var24) {
                                        if (var9.field88 != null) {
                                            byte var25 = var9.field88[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class69.field1311[86] || (var25 & 0x1) != 0 && !class69.field1311[82] || (var25 & 0x4) != 0 && !class69.field1311[81])) {
                                                continue;
                                            }
                                        }
                                        class43.method360(class4.field66, var9.field219, var22 + 1, (byte) 123, -1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class31.method258(class192.field3427 - var11, (byte) -77, var9, class122.field2193 - var10);
                        }
                        if (class207.field3722 != null && class207.field3722 != var9 && var19 && class29.method244((byte) 114, method1474(var9))) {
                            class26.field707 = var9;
                        }
                        if (class273.field4846 == var9) {
                            class252.field4341 = true;
                            class45.field1000 = var10;
                            class253.field4352 = var11;
                        }
                        if (var9.field213 || var9.field146 != 0) {
                            if (var19 && class16.field463 != 0 && var9.field106 != null) {
                                class277 var26 = new class277();
                                var26.field4898 = true;
                                var26.field4901 = var9;
                                var26.field4900 = class16.field463;
                                var26.field4883 = var9.field106;
                                class64.field1245.method785(var26, -29);
                            }
                            if (class207.field3722 != null || class218.field3927 != null || class50.field1049 || var9.field146 != 1400 && class9.field292) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field146 != 0) {
                                if (var9.field146 == 1337) {
                                    class278.field4912 = var9;
                                    class176.method1145((byte) 126, var9);
                                    continue;
                                }
                                if (var9.field146 == 1338) {
                                    if (var21) {
                                        class232.field4100 = class122.field2193 - var10;
                                        class89.field1602 = class192.field3427 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field146 == 1400) {
                                    class186.field3365 = var9;
                                    if (var21) {
                                        if (class69.field1311[82] && class30.field773 > 0) {
                                            int var27 = (int) ((double) (class122.field2193 - var10 - var9.field89 / 2) * 2.0D / (double) class101.field1793);
                                            int var28 = (int) ((double) (class192.field3427 - var11 - var9.field84 / 2) * 2.0D / (double) class101.field1793);
                                            int var29 = class278.field4911 + var27;
                                            int var30 = class263.field4590 + var28;
                                            int var31 = class269.field4796 + var29;
                                            int var32 = class155.field2871 + class176.field3141 - var30 - 1;
                                            class107.method715(var31, var32, (byte) -106, 0);
                                            class162.method1074(122);
                                            continue;
                                        }
                                        class9.field292 = true;
                                        class161.field2941 = class79.field1497;
                                        class22.field662 = class268.field4722;
                                        class219.field3947 = class278.field4911;
                                        class259.field4463 = class263.field4590;
                                        continue;
                                    }
                                    if (var20 && class9.field292) {
                                        class197.method1360(26767, (int) ((double) (class161.field2941 - class79.field1497) * 2.0D / (double) class144.field2687) + class219.field3947);
                                        class228.method1545((int) ((double) (class22.field662 - class268.field4722) * 2.0D / (double) class144.field2687) + class259.field4463, -57);
                                        continue;
                                    }
                                    class9.field292 = false;
                                    continue;
                                }
                                if (var9.field146 == 1401) {
                                    if (var20) {
                                        class210.method1443(class268.field4722 - var11, var9.field84, -122, class79.field1497 - var10, var9.field89);
                                    }
                                    continue;
                                }
                                if (var9.field146 == 1402) {
                                    class176.method1145((byte) -29, var9);
                                    continue;
                                }
                            }
                            if (!var9.field116 && var21) {
                                var9.field116 = true;
                                if (var9.field196 != null) {
                                    class277 var33 = new class277();
                                    var33.field4898 = true;
                                    var33.field4901 = var9;
                                    var33.field4896 = class122.field2193 - var10;
                                    var33.field4900 = class192.field3427 - var11;
                                    var33.field4883 = var9.field196;
                                    class64.field1245.method785(var33, -29);
                                }
                            }
                            if (var9.field116 && var20 && var9.field137 != null) {
                                class277 var34 = new class277();
                                var34.field4898 = true;
                                var34.field4901 = var9;
                                var34.field4896 = class79.field1497 - var10;
                                var34.field4900 = class268.field4722 - var11;
                                var34.field4883 = var9.field137;
                                class64.field1245.method785(var34, -29);
                            }
                            if (var9.field116 && !var20) {
                                var9.field116 = false;
                                if (var9.field120 != null) {
                                    class277 var35 = new class277();
                                    var35.field4898 = true;
                                    var35.field4901 = var9;
                                    var35.field4896 = class79.field1497 - var10;
                                    var35.field4900 = class268.field4722 - var11;
                                    var35.field4883 = var9.field120;
                                    class167.field3029.method785(var35, -29);
                                }
                            }
                            if (var20 && var9.field107 != null) {
                                class277 var36 = new class277();
                                var36.field4898 = true;
                                var36.field4901 = var9;
                                var36.field4896 = class79.field1497 - var10;
                                var36.field4900 = class268.field4722 - var11;
                                var36.field4883 = var9.field107;
                                class64.field1245.method785(var36, -29);
                            }
                            if (!var9.field197 && var19) {
                                var9.field197 = true;
                                if (var9.field191 != null) {
                                    class277 var37 = new class277();
                                    var37.field4898 = true;
                                    var37.field4901 = var9;
                                    var37.field4896 = class79.field1497 - var10;
                                    var37.field4900 = class268.field4722 - var11;
                                    var37.field4883 = var9.field191;
                                    class64.field1245.method785(var37, -29);
                                }
                            }
                            if (var9.field197 && var19 && var9.field113 != null) {
                                class277 var38 = new class277();
                                var38.field4898 = true;
                                var38.field4901 = var9;
                                var38.field4896 = class79.field1497 - var10;
                                var38.field4900 = class268.field4722 - var11;
                                var38.field4883 = var9.field113;
                                class64.field1245.method785(var38, -29);
                            }
                            if (var9.field197 && !var19) {
                                var9.field197 = false;
                                if (var9.field82 != null) {
                                    class277 var39 = new class277();
                                    var39.field4898 = true;
                                    var39.field4901 = var9;
                                    var39.field4896 = class79.field1497 - var10;
                                    var39.field4900 = class268.field4722 - var11;
                                    var39.field4883 = var9.field82;
                                    class167.field3029.method785(var39, -29);
                                }
                            }
                            if (var9.field181 != null) {
                                class277 var40 = new class277();
                                var40.field4901 = var9;
                                var40.field4883 = var9.field181;
                                class126.field2249.method785(var40, -29);
                            }
                            if (var9.field134 != null && class171.field3094 > var9.field180) {
                                if (var9.field221 == null || class171.field3094 - var9.field180 > 32) {
                                    class277 var45 = new class277();
                                    var45.field4901 = var9;
                                    var45.field4883 = var9.field134;
                                    class64.field1245.method785(var45, -29);
                                } else {
                                    label546: for (int var41 = var9.field180; var41 < class171.field3094; var41++) {
                                        int var42 = class1.field22[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field221.length; var43++) {
                                            if (var9.field221[var43] == var42) {
                                                class277 var44 = new class277();
                                                var44.field4901 = var9;
                                                var44.field4883 = var9.field134;
                                                class64.field1245.method785(var44, -29);
                                                break label546;
                                            }
                                        }
                                    }
                                }
                                var9.field180 = class171.field3094;
                            }
                            if (var9.field119 != null && class216.field3895 > var9.field243) {
                                if (var9.field169 == null || class216.field3895 - var9.field243 > 32) {
                                    class277 var50 = new class277();
                                    var50.field4901 = var9;
                                    var50.field4883 = var9.field119;
                                    class64.field1245.method785(var50, -29);
                                } else {
                                    label522: for (int var46 = var9.field243; var46 < class216.field3895; var46++) {
                                        int var47 = class182.field3225[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field169.length; var48++) {
                                            if (var9.field169[var48] == var47) {
                                                class277 var49 = new class277();
                                                var49.field4901 = var9;
                                                var49.field4883 = var9.field119;
                                                class64.field1245.method785(var49, -29);
                                                break label522;
                                            }
                                        }
                                    }
                                }
                                var9.field243 = class216.field3895;
                            }
                            if (var9.field112 != null && class280.field4946 > var9.field140) {
                                if (var9.field159 == null || class280.field4946 - var9.field140 > 32) {
                                    class277 var55 = new class277();
                                    var55.field4901 = var9;
                                    var55.field4883 = var9.field112;
                                    class64.field1245.method785(var55, -29);
                                } else {
                                    label498: for (int var51 = var9.field140; var51 < class280.field4946; var51++) {
                                        int var52 = class91.field1637[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field159.length; var53++) {
                                            if (var9.field159[var53] == var52) {
                                                class277 var54 = new class277();
                                                var54.field4901 = var9;
                                                var54.field4883 = var9.field112;
                                                class64.field1245.method785(var54, -29);
                                                break label498;
                                            }
                                        }
                                    }
                                }
                                var9.field140 = class280.field4946;
                            }
                            if (var9.field189 != null && class5.field68 > var9.field86) {
                                if (var9.field186 == null || class5.field68 - var9.field86 > 32) {
                                    class277 var60 = new class277();
                                    var60.field4901 = var9;
                                    var60.field4883 = var9.field189;
                                    class64.field1245.method785(var60, -29);
                                } else {
                                    label474: for (int var56 = var9.field86; var56 < class5.field68; var56++) {
                                        int var57 = class146.field2734[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field186.length; var58++) {
                                            if (var9.field186[var58] == var57) {
                                                class277 var59 = new class277();
                                                var59.field4901 = var9;
                                                var59.field4883 = var9.field189;
                                                class64.field1245.method785(var59, -29);
                                                break label474;
                                            }
                                        }
                                    }
                                }
                                var9.field86 = class5.field68;
                            }
                            if (var9.field209 != null && class70.field1359 > var9.field214) {
                                if (var9.field162 == null || class70.field1359 - var9.field214 > 32) {
                                    class277 var65 = new class277();
                                    var65.field4901 = var9;
                                    var65.field4883 = var9.field209;
                                    class64.field1245.method785(var65, -29);
                                } else {
                                    label450: for (int var61 = var9.field214; var61 < class70.field1359; var61++) {
                                        int var62 = class248.field4303[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field162.length; var63++) {
                                            if (var9.field162[var63] == var62) {
                                                class277 var64 = new class277();
                                                var64.field4901 = var9;
                                                var64.field4883 = var9.field209;
                                                class64.field1245.method785(var64, -29);
                                                break label450;
                                            }
                                        }
                                    }
                                }
                                var9.field214 = class70.field1359;
                            }
                            if (class63.field1240 > var9.field236 && var9.field229 != null) {
                                class277 var66 = new class277();
                                var66.field4901 = var9;
                                var66.field4883 = var9.field229;
                                class64.field1245.method785(var66, -29);
                            }
                            if (class242.field4231 > var9.field236 && var9.field90 != null) {
                                class277 var67 = new class277();
                                var67.field4901 = var9;
                                var67.field4883 = var9.field90;
                                class64.field1245.method785(var67, -29);
                            }
                            if (class275.field4852 > var9.field236 && var9.field108 != null) {
                                class277 var68 = new class277();
                                var68.field4901 = var9;
                                var68.field4883 = var9.field108;
                                class64.field1245.method785(var68, -29);
                            }
                            if (class140.field2574 > var9.field236 && var9.field224 != null) {
                                class277 var69 = new class277();
                                var69.field4901 = var9;
                                var69.field4883 = var9.field224;
                                class64.field1245.method785(var69, -29);
                            }
                            if (class167.field3043 > var9.field236 && var9.field85 != null) {
                                class277 var70 = new class277();
                                var70.field4901 = var9;
                                var70.field4883 = var9.field85;
                                class64.field1245.method785(var70, -29);
                            }
                            var9.field236 = class135.field2455;
                            if (var9.field192 != null) {
                                for (int var71 = 0; var71 < class44.field966; var71++) {
                                    class277 var72 = new class277();
                                    var72.field4901 = var9;
                                    var72.field4887 = class82.field1550[var71];
                                    var72.field4893 = class169.field3060[var71];
                                    var72.field4883 = var9.field192;
                                    class64.field1245.method785(var72, -29);
                                }
                            }
                            if (class68.field1289 && var9.field115 != null) {
                                class277 var73 = new class277();
                                var73.field4901 = var9;
                                var73.field4883 = var9.field115;
                                class64.field1245.method785(var73, -29);
                            }
                        }
                    }
                    if (!var9.field226 && class207.field3722 == null && class218.field3927 == null && !class50.field1049) {
                        if ((var9.field239 >= 0 || var9.field246 != 0) && class79.field1497 >= var12 && class268.field4722 >= var13 && class79.field1497 < var14 && class268.field4722 < var15) {
                            if (var9.field239 >= 0) {
                                class44.field967 = arg0[var9.field239];
                            } else {
                                class44.field967 = var9;
                            }
                        }
                        if (var9.field187 == 8 && class79.field1497 >= var12 && class268.field4722 >= var13 && class79.field1497 < var14 && class268.field4722 < var15) {
                            class232.field4094 = var9;
                        }
                        if (var9.field195 > var9.field84) {
                            class267.method1816(var9, var9.field195, var9.field89 + var10, -31398, var11, class79.field1497, var9.field84, class268.field4722);
                        }
                    }
                    if (var9.field187 == 0) {
                        method1470(arg0, var9.field219, var12, var13, var14, var15, var10 - var9.field109, var11 - var9.field193);
                        if (var9.field160 != null) {
                            method1470(var9.field160, var9.field219, var12, var13, var14, var15, var10 - var9.field109, var11 - var9.field193);
                        }
                        class181 var74 = (class181) class49.field1042.method1842(-1, (long) var9.field219);
                        if (var74 != null) {
                            class260.method1729(-1, var10, var12, var14, var15, var11, var13, var74.field3217);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method1225(boolean arg0) {
        field3863++;
        if (class201.field3600 != null) {
            class201.field3600.field4598 = false;
        }
        class201.field3600 = null;
        if (class197.field3520 != null) {
            class197.field3520.method990(4);
            class197.field3520 = null;
        }
        class15.method109(121, class125.field2241);
        class131.method877(0, class125.field2241);
        if (class263.field4595 != null) {
            class263.field4595.method444(class125.field2241, -29591);
        }
        class223.method1519(-2);
        class258.method1708(-16356);
        class263.field4595 = null;
        if (class238.field4145 != null) {
            class238.field4145.method667(false);
        }
        if (class30.field774 != null) {
            class30.field774.method667(false);
        }
        class130.field2281.method1723(66);
        class233.field4103.method1591(arg0);
        try {
            if (class172.field3108 != null) {
                class172.field3108.method255((byte) 66);
            }
            if (class166.field2992 != null) {
                for (int var2 = 0; var2 < class166.field2992.length; var2++) {
                    if (class166.field2992[var2] != null) {
                        class166.field2992[var2].method255((byte) 66);
                    }
                }
            }
            if (class133.field2403 != null) {
                class133.field2403.method255((byte) 66);
            }
            if (class166.field3011 != null) {
                class166.field3011.method255((byte) 66);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method1471(int arg0, int arg1) {
        class120.field2125 = null;
        field3853++;
        class130.field2281.field4478++;
        class66.field1267 = arg0;
        class130.field2281.field4476 = arg1;
        class231.field4083 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lgk;)Z")
    public static final boolean method1472(class6 arg0) {
        if (class267.field4710) {
            if (method1474(arg0) != 0) {
                return false;
            }
            if (arg0.field187 == 0) {
                return false;
            }
        }
        return arg0.field241;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    public static final void method1473(int arg0, int arg1) {
        field3865++;
        short var2 = 256;
        if (var2 < arg1) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class101.field1794 += arg1 * 128;
        if (class199.field3553.length < class101.field1794) {
            class101.field1794 -= class199.field3553.length;
            int var3 = (int) (Math.random() * 12.0D);
            class45.method377(1, class43.field961[var3]);
        }
        int var4 = arg1 * 128;
        int var5 = 0;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var26 = class51.field1066[var5 + var4] - (class199.field3553[class199.field3553.length - 1 & class101.field1794 + var5] * arg1 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class51.field1066[var5++] = var26;
        }
        for (int var8 = var2 - arg1; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class51.field1066[var24 + var23] = 255;
                } else {
                    class51.field1066[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < var2 - arg1; var9++) {
            class256.field4379[var9] = class256.field4379[arg1 + var9];
        }
        int var10 = var2 - arg1;
        if (arg0 != 25) {
            main((String[]) null);
        }
        while (var2 > var10) {
            class256.field4379[var10] = (int) (Math.sin((double) class53.field1111 / 14.0D) * 16.0D + Math.sin((double) class53.field1111 / 15.0D) * 14.0D + Math.sin((double) class53.field1111 / 16.0D) * 12.0D);
            class53.field1111++;
            var10++;
        }
        class216.field3897 += arg1;
        int var11 = (arg1 + (class93.field1655 & 0x1)) / 2;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class216.field3897; var12++) {
            int var21 = (int) (Math.random() * 124.0D) + 2;
            int var22 = (int) (Math.random() * 128.0D) + 128;
            class51.field1066[(var22 << 7) + var21] = 192;
        }
        class216.field3897 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = 0;
            int var19 = var13 * 128;
            for (int var20 = -var11; var20 < 128; var20++) {
                if ((var11 + var20) < 128) {
                    var18 += class51.field1066[var20 - (-var11 - var19)];
                }
                if ((var20 - (var11 + 1)) >= 0) {
                    var18 -= class51.field1066[var19 + var20 - var11 - 1];
                }
                if (var20 >= 0) {
                    class124.field2226[var19 + var20] = var18 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if (var11 + var16 < var2) {
                    var15 += class124.field2226[var11 * 128 + var17 + var14];
                }
                if ((var16 - var11 - 1) >= 0) {
                    var15 -= class124.field2226[var14 + var17 - (var11 * 128) - 128];
                }
                if (var16 >= 0) {
                    class51.field1066[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method1227(int arg0) {
        field3850++;
        if (class246.field4281 == 1000) {
            return;
        }
        class93.field1655++;
        if ((class93.field1655 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class144.field2689 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class240.field4190.setSeed((long) class144.field2689);
        }
        this.method1478(67);
        if (class81.field1535 != null) {
            class81.field1535.method1372(0);
        }
        class171.method1130(-96);
        class44.method369(true);
        class112.method740((byte) 21);
        if (arg0 != 128) {
            this.method1231(-45);
        }
        class58.method437(-125);
        if (class263.field4595 != null) {
            int var3 = class263.field4595.method443(0);
            class16.field463 = var3;
        }
        if (class246.field4281 == 0) {
            this.method1475(-20763);
            class263.method1757((byte) -64);
        } else if (class246.field4281 == 5) {
            this.method1475(arg0 ^ 0xFFFFAE65);
            class263.method1757((byte) 109);
        } else if (class246.field4281 == 25 || class246.field4281 == 28) {
            class228.method1547((byte) 115);
        }
        if (class246.field4281 == 10) {
            this.method1476(-122);
            class32.method266((byte) 110);
            class269.method1846(-54);
            class197.method1363(1);
        } else if (class246.field4281 == 30) {
            class145.method1000(-1);
            return;
        } else if (class246.field4281 == 40) {
            class197.method1363(1);
            if (class102.field1798 != -3) {
                if (class102.field1798 == 15) {
                    class188.method1287(-28);
                    return;
                }
                if (class102.field1798 != 2) {
                    class270.method1855(arg0 ^ 0xFFFFFF7B);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lgk;)I")
    public static final int method1474(class6 arg0) {
        class203 var1 = (class203) class239.field4173.method1842(-1, ((long) arg0.field219 << 32) + (long) arg0.field233);
        return var1 == null ? arg0.field190 : var1.field3640;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method1231(int arg0) {
        method1480(105);
        field3861++;
        class265.method1800(14678);
        class213.method1452((byte) -94);
        class13.method103(arg0 ^ arg0);
        class145.method999((byte) 118);
        class183.method1226(arg0 ^ 0xFFFFFFFD);
        class123.method825((byte) 97);
        class127.method848(true);
        class264.method1760((byte) 98);
        class244.method1622(-1);
        class135.method899(91);
        class143.method984(-1);
        class259.method1720(19562);
        class238.method1593(-81);
        class199.method1374((byte) -122);
        class10.method83(arg0 - 22468);
        class31.method261((byte) -119);
        class182.method1217((byte) 126);
        class276.method1884(arg0 ^ 0xFFFFFFB6);
        class23.method226((byte) -120);
        class272.method1865((byte) 0);
        class257.method1689(19661184);
        class6.method45(-1);
        class117.method783((byte) -23);
        class108.method721(-126);
        class269.method1849(0);
        class59.method440((byte) 34);
        class113.method748(-72);
        class188.method1285(arg0 - 90);
        class21.method185(128);
        class100.method668(1455624928);
        class38.method318(true);
        class73.method514(-6);
        class216.method1492(-1);
        class140.method969(124);
        class137.method954(-116);
        class142.method977((byte) -101);
        class268.method1830((byte) 106);
        class181.method1209((byte) -53);
        class12.method96((byte) 9);
        class177.method1150(false);
        class208.method1431(-1554809046);
        class281.method1913(false);
        class262.method1754(arg0 ^ 0x14E7);
        class197.method1362(false);
        class164.method1087(false);
        class75.method535((byte) 46);
        class246.method1630(true);
        class51.method406(95);
        class232.method1564(arg0 + 18435);
        class283.method1921((byte) -86);
        class84.method575((byte) -76);
        class196.method1357(200);
        class130.method859(-90);
        class55.method423(arg0 + 65);
        class25.method230((byte) 123);
        class176.method1146(false);
        class20.method155();
        class52.method411(arg0 + 1);
        class261.method1738(26327);
        class185.method1252();
        class190.method1298(121);
        class219.method1504((byte) 69);
        class66.method474(8368);
        class214.method1462(arg0 - 11060);
        class149.method1025(arg0);
        class16.method116((byte) -111);
        class160.method1068(-95);
        class115.method749();
        class104.method697((byte) 70);
        class131.method875(false);
        class41.method353();
        class98.method653(2);
        class221.method1510(arg0 - 16470);
        class92.method635();
        class228.method1548(-26);
        class121.method809((byte) 119);
        class69.method494(112);
        class141.method973(1023);
        class35.method279();
        class133.method885(-1140);
        class148.method1021(arg0 - 31028);
        class223.method1515(124);
        class28.method241((byte) -102);
        class207.method1425(-241816892);
        class110.method724(~arg0);
        class263.method1759(0);
        class65.method467((byte) 105);
        class15.method107(0);
        class169.method1116(false);
        class153.method1044(4);
        class64.method464((byte) -23);
        class209.method1435(-1616312024);
        class206.method1415((byte) -19);
        class48.method393(false);
        class189.method1293((byte) 101);
        class239.method1596(arg0 + 104);
        class36.method310((byte) -123);
        class39.method326(false);
        class217.method1494((byte) -40);
        class195.method1351((byte) -128);
        class82.method563((byte) -12);
        class9.method65(-63);
        class102.method682(71);
        class247.method1646();
        class184.method1238(false);
        class49.method398(82);
        class202.method1385((byte) 0);
        class119.method801(true);
        class229.method1552((byte) -107);
        class230.method1556((byte) 59);
        class237.method1581((byte) 57);
        class72.method507(-6597);
        class116.method782(0);
        class277.method1895(1745368897);
        class179.method1165((byte) -109);
        class146.method1011(75);
        class201.method1381(89);
        class144.method993(false);
        class200.method1378((byte) -104);
        class8.method56(0);
        class212.method1449(true);
        class278.method1899(true);
        class266.method1813();
        class7.method49(-108);
        class54.method421(105);
        class273.method1869(arg0 ^ 0xFFFFFFFE);
        class33.method267((byte) -113);
        class134.method889(103);
        class58.method435((byte) -2);
        class170.method1125(255);
        class178.method1158(255);
        class256.method1680((byte) 68);
        class242.method1616(-109);
        class186.method1276((byte) 91);
        class26.method232((byte) -120);
        class204.method1400(true);
        class152.method1042();
        class81.method559(28555);
        class63.method462(arg0 ^ 0xFFFFFFA7);
        class101.method676(0);
        class205.method1405((byte) -79);
        class198.method1368(true);
        class77.method540(60);
        class203.method1392(0);
        class42.method359(-10382);
        class167.method1102(-1106);
        class150.method1027((byte) -64);
        class248.method1654(1569);
        class93.method638(0);
        class1.method7(true);
        class107.method714(-115);
        class227.method1542(true);
        class80.method556(60);
        class50.method401((byte) -47);
        class163.method1078(21533);
        class211.method1446(25);
        class17.method121(-53);
        class154.method1051(1);
        class225.method1521(arg0 ^ 0xFFFFFFC3);
        class90.method617();
        class70.method499(8000);
        class126.method843(-1563050798);
        class40.method333((byte) 126);
        class245.method1628(0);
        class43.method364(arg0 ^ 0x5BB1);
        class158.method1061(arg0 ^ 0xFFFFFFE7);
        class220.method1509();
        class3.method19();
        class157.method1059();
        class27.method237(72);
        class5.method31(0);
        class151.method1030();
        class74.method529();
        class120.method802(true);
        class56.method427(8380);
        class105.method701(true);
        class168.method1113((byte) 58);
        class83.method572((byte) -99);
        class62.method456((byte) 90);
        class4.method26(2);
        class166.method1097((byte) 110);
        class103.method690(arg0 ^ 0x310F);
        class14.method104(-2042);
        class254.method1676(101);
        class210.method1444(true);
        class267.method1817(1);
        class253.method1673(31957);
        class187.method1280(16);
        class161.method1070(4530);
        class155.method1057(22);
        class2.method14(arg0 + 2);
        class19.method135(arg0 ^ 0xFFFFC4D5);
        class147.method1013((byte) -127);
        class111.method733(false);
        class282.method1915(0);
        class258.method1706(true);
        class162.method1073((byte) -22);
        class231.method1560(-1);
        class193.method1338(-1138);
        class68.method485((byte) -101);
        class94.method639((byte) 102);
        class249.method1658(67);
        class112.method743(arg0 + 4097);
        class236.method1575(1);
        class57.method431((byte) 52);
        class96.method643((byte) 124);
        class22.method220(arg0 + 1);
        class171.method1128(false);
        class67.method477(arg0 ^ 0x67);
        class61.method451(arg0 ^ 0xAC);
        class280.method1910(-126);
        class53.method416((byte) 109);
        class32.method263((byte) 97);
        class30.method250(-56);
        class11.method91(true);
        class91.method626(127);
        class124.method835(arg0 + 2);
        class78.method545(-82);
        class240.method1605(true);
        class44.method367(arg0 - 19126);
        class97.method646(63);
        class18.method127((byte) 102);
        class243.method1618(4096);
        class279.method1905((byte) 81);
        class29.method243(87);
        class95.method641(-22);
        class125.method838(4);
        class218.method1497((byte) -89);
        class275.method1879(6);
        class71.method500(arg0 - 104);
        class139.method959(-17999);
        class106.method706(arg0 - 100);
        class260.method1732((byte) -96);
        class79.method553(-123);
        class87.method581(-73);
        class270.method1854(89);
        class233.method1571((byte) -45);
        class252.method1670(false);
        class89.method610((byte) 81);
        class138.method955(10);
        class174.method1141((byte) 43);
        class118.method795(0);
        class172.method1133(29280);
        class45.method381(true);
        if (class183.field3287) {
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method1475(int arg0) {
        if (!class100.field1774) {
            label233: while (true) {
                do {
                    if (!class91.method624(false)) {
                        break label233;
                    }
                } while (class239.field4172 != 115 && class239.field4172 != 83);
                class100.field1774 = true;
            }
        }
        field3856++;
        if (class219.field3955 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class136.method950(8954);
            if (class179.field3193 == 0L) {
                class179.field3193 = var4;
            }
            if (var3 > 16384 && var4 - class179.field3193 < 5000L) {
                if ((var4 - class227.field4031) > 1000L) {
                    System.gc();
                    class227.field4031 = var4;
                }
                class51.field1069 = 5;
                class281.field4963 = class61.field1211;
            } else {
                class219.field3955 = 10;
                class51.field1069 = 5;
                class281.field4963 = class102.field1822;
            }
        } else if (class219.field3955 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class130.field2279[var6] = new class257(104, 104);
            }
            class51.field1069 = 10;
            class219.field3955 = 30;
            class281.field4963 = class212.field3801;
        } else if (class219.field3955 == 30) {
            if (class81.field1535 == null) {
                class81.field1535 = new class199(class130.field2281, class233.field4103);
            }
            if (class81.field1535.method1376(true)) {
                class81.field1522 = class161.method1071(false, (byte) -103, 0, true, true);
                class118.field2080 = class161.method1071(false, (byte) -127, 1, true, true);
                class91.field1614 = class161.method1071(true, (byte) 102, 2, true, false);
                class228.field4046 = class161.method1071(false, (byte) 125, 3, true, true);
                class213.field3822 = class161.method1071(false, (byte) 77, 4, true, true);
                class30.field757 = class161.method1071(true, (byte) -128, 5, true, true);
                class14.field427 = class161.method1071(true, (byte) 88, 6, false, true);
                class276.field4868 = class161.method1071(false, (byte) 122, 7, true, true);
                class243.field4236 = class161.method1071(false, (byte) -111, 8, true, true);
                class16.field462 = class161.method1071(false, (byte) 111, 9, true, true);
                class58.field1180 = class161.method1071(false, (byte) 2, 10, true, true);
                class147.field2748 = class161.method1071(false, (byte) -59, 11, true, true);
                class116.field2061 = class161.method1071(false, (byte) -60, 12, true, true);
                class73.field1414 = class161.method1071(false, (byte) 77, 13, true, true);
                class208.field3750 = class161.method1071(false, (byte) 119, 14, false, true);
                class58.field1188 = class161.method1071(false, (byte) -19, 15, true, true);
                class38.field878 = class161.method1071(false, (byte) 109, 16, true, true);
                class137.field2500 = class161.method1071(false, (byte) 127, 17, true, true);
                class225.field4003 = class161.method1071(false, (byte) 99, 18, true, true);
                class48.field1033 = class161.method1071(false, (byte) -30, 19, true, true);
                class227.field4037 = class161.method1071(false, (byte) -18, 20, true, true);
                class102.field1821 = class161.method1071(false, (byte) 123, 21, true, true);
                class100.field1746 = class161.method1071(false, (byte) 127, 22, true, true);
                class252.field4340 = class161.method1071(true, (byte) -90, 23, true, true);
                class81.field1525 = class161.method1071(false, (byte) -101, 24, true, true);
                class32.field808 = class161.method1071(false, (byte) -107, 25, true, true);
                class167.field3040 = class161.method1071(true, (byte) -123, 26, true, true);
                class2.field27 = class161.method1071(false, (byte) -110, 27, true, true);
                class51.field1069 = 15;
                class281.field4963 = class142.field2630;
                class219.field3955 = 40;
            } else {
                class281.field4963 = class98.field1721;
                class51.field1069 = 12;
            }
        } else if (class219.field3955 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 28; var8++) {
                var7 += class10.field356[var8].method79(255) * class256.field4388[var8] / 100;
            }
            if (var7 == 100) {
                class51.field1069 = 20;
                class281.field4963 = class232.field4097;
                class217.method1495(0, class243.field4236);
                class80.method555(class243.field4236, arg0 + 20866);
                class240.method1604((byte) 98, class243.field4236);
                class219.field3955 = 45;
            } else {
                if (var7 != 0) {
                    class281.field4963 = class148.method1022(10, new class265[] { class131.field2386, class241.method1609(true, var7), class29.field742 });
                }
                class51.field1069 = 20;
            }
        } else if (class219.field3955 == 45) {
            class70.method496(2, 22050, class127.field2273, 2);
            class51.field1074 = new class21();
            class51.field1074.method189(arg0 ^ 0xFFFFAEE5, 128, 9);
            class238.field4145 = class78.method544(-123, class281.field4957, 22050, 0, class125.field2241);
            class238.field4145.method671(-115, class51.field1074);
            class63.method461(class208.field3750, (byte) -43, class58.field1188, class51.field1074, class213.field3822);
            class30.field774 = class78.method544(-122, class281.field4957, 2048, 1, class125.field2241);
            class49.field1039 = new class250();
            class30.field774.method671(-62, class49.field1039);
            class197.field3515 = new class38(22050, class125.field2242);
            class201.field3584 = class14.field427.method1326((byte) -21, class141.field2616);
            class51.field1069 = 30;
            class219.field3955 = 50;
            class281.field4963 = class189.field3397;
        } else if (class219.field3955 == 50) {
            int var9 = class270.method1853((byte) -118, class73.field1414, class243.field4236);
            int var10 = class240.method1603(20197);
            if (var10 > var9) {
                class281.field4963 = class148.method1022(arg0 ^ 0xFFFFAEEF, new class265[] { class202.field3617, class241.method1609(true, var9 * 100 / var10), class29.field742 });
                class51.field1069 = 35;
            } else {
                class219.field3955 = 60;
                class51.field1069 = 35;
                class281.field4963 = class193.field3469;
            }
        } else if (class219.field3955 == 60) {
            int var11 = class96.method644(-3614, class243.field4236);
            int var12 = class79.method549(true);
            if (var12 > var11) {
                class281.field4963 = class148.method1022(10, new class265[] { class19.field507, class241.method1609(true, var11 * 100 / var12), class29.field742 });
                class51.field1069 = 40;
            } else {
                class51.field1069 = 40;
                class219.field3955 = 65;
                class281.field4963 = class81.field1530;
            }
        } else if (class219.field3955 == 65) {
            class193.method1336(class243.field4236, (byte) 30, class73.field1414);
            class51.field1069 = 45;
            class281.field4963 = class57.field1175;
            class70.method497(arg0 ^ 0xFFFFAEB7, 5);
            class219.field3955 = 70;
        } else if (class219.field3955 == 70) {
            class91.field1614.method1308((byte) 89);
            byte var13 = 0;
            int var14 = var13 + class91.field1614.method1317(arg0 ^ 0xFFFF904D);
            class38.field878.method1308((byte) 87);
            int var15 = var14 + class38.field878.method1317(16040);
            class137.field2500.method1308((byte) 102);
            int var16 = var15 + class137.field2500.method1317(arg0 ^ 0xFFFF904D);
            class225.field4003.method1308((byte) 71);
            int var17 = var16 + class225.field4003.method1317(arg0 + 36803);
            class48.field1033.method1308((byte) 101);
            int var18 = var17 + class48.field1033.method1317(16040);
            class227.field4037.method1308((byte) 82);
            int var19 = var18 + class227.field4037.method1317(16040);
            class102.field1821.method1308((byte) 92);
            int var20 = var19 + class102.field1821.method1317(16040);
            class100.field1746.method1308((byte) 100);
            int var21 = var20 + class100.field1746.method1317(16040);
            class81.field1525.method1308((byte) 71);
            int var22 = var21 + class81.field1525.method1317(arg0 ^ 0xFFFF904D);
            class32.field808.method1308((byte) 95);
            int var23 = var22 + class32.field808.method1317(16040);
            class2.field27.method1308((byte) 93);
            int var24 = var23 + class2.field27.method1317(16040);
            if (var24 < 1100) {
                class281.field4963 = class148.method1022(10, new class265[] { class259.field4467, class241.method1609(true, var24 / 11), class29.field742 });
                class51.field1069 = 50;
            } else {
                class108.method718(arg0 + 20611, class91.field1614);
                class106.method710((byte) 125, class91.field1614);
                class134.method891(class91.field1614, 126);
                class106.method707(true, class91.field1614, class276.field4868);
                class182.method1219(class276.field4868, true, class38.field878, (byte) 29);
                class230.method1557(class276.field4868, true, class225.field4003);
                class199.method1371(true, class42.field935, class48.field1033, class276.field4868, (byte) 8);
                class267.method1815(class91.field1614, (byte) 77);
                class268.method1822(-1, class227.field4037, class118.field2080, class81.field1522);
                class150.method1028(class102.field1821, -231, class276.field4868);
                class164.method1086((byte) -128, class100.field1746);
                class38.method316((byte) -125, class91.field1614);
                class123.method828(class73.field1414, (byte) -120, class276.field4868, class228.field4046, class243.field4236);
                class264.method1761(class91.field1614, arg0 ^ 0xFFFFAEE5);
                class168.method1111((byte) -113, class137.field2500);
                class44.method366(new class217(), 1000000, class81.field1525, class32.field808);
                class18.method131(class81.field1525, class32.field808, 128);
                class160.method1066(class243.field4236, class91.field1614, -125);
                class51.field1069 = 50;
                class281.field4963 = class75.field1440;
                class219.method1502((byte) -121);
                class219.field3955 = 80;
            }
        } else if (class219.field3955 == 80) {
            int var25 = class78.method542(20, class243.field4236);
            int var26 = class73.method520((byte) 122);
            if (var26 > var25) {
                class281.field4963 = class148.method1022(10, new class265[] { class77.field1470, class241.method1609(true, var25 * 100 / var26), class29.field742 });
                class51.field1069 = 60;
            } else {
                class186.method1275(class243.field4236, 18532);
                class219.field3955 = 90;
                class51.field1069 = 60;
                class281.field4963 = class237.field4129;
            }
        } else if (class219.field3955 != 90) {
            if (arg0 != -20763) {
                this.method1225(false);
            }
            if (class219.field3955 == 100) {
                if (class182.method1220(class243.field4236, 2)) {
                    class219.field3955 = 110;
                }
            } else if (class219.field3955 == 110) {
                class201.field3600 = new class264();
                class281.field4957.method1531(10, -101, class201.field3600);
                class51.field1069 = 75;
                class219.field3955 = 120;
                class281.field4963 = class177.field3158;
            } else if (class219.field3955 == 120) {
                if (class58.field1180.method1305((byte) -48, class4.field66, class204.field3652)) {
                    class184 var28 = new class184(class58.field1180.method1320(127, class4.field66, class204.field3652));
                    class112.method738(12170, var28);
                    class219.field3955 = 130;
                    class51.field1069 = 80;
                    class281.field4963 = class39.field893;
                } else {
                    class281.field4963 = class148.method1022(10, new class265[] { class22.field664, class265.field4655 });
                    class51.field1069 = 80;
                }
            } else if (class219.field3955 == 130) {
                if (!class228.field4046.method1308((byte) 122)) {
                    class281.field4963 = class148.method1022(10, new class265[] { class179.field3188, class241.method1609(true, class228.field4046.method1317(16040) * 3 / 4), class29.field742 });
                    class51.field1069 = 85;
                } else if (!class116.field2061.method1308((byte) 72)) {
                    class281.field4963 = class148.method1022(10, new class265[] { class179.field3188, class241.method1609(true, (class116.field2061.method1317(16040) / 10) + 75), class29.field742 });
                    class51.field1069 = 85;
                } else if (!class73.field1414.method1308((byte) 97)) {
                    class281.field4963 = class148.method1022(10, new class265[] { class179.field3188, class241.method1609(true, (class73.field1414.method1317(16040) / 20) + 85), class29.field742 });
                    class51.field1069 = 85;
                } else if (class252.field4340.method1312(class96.field1696, 1)) {
                    class48.method392(class252.field4340, class13.field406, arg0 + 20862, class59.field1196, class5.field71, class258.field4441, class181.field3216);
                    class219.field3955 = 135;
                    class281.field4963 = class123.field2220;
                    class51.field1069 = 95;
                } else {
                    class281.field4963 = class148.method1022(10, new class265[] { class179.field3188, class241.method1609(true, class252.field4340.method1334(class96.field1696, 0) / 10 + 90), class29.field742 });
                    class51.field1069 = 85;
                }
            } else if (class219.field3955 == 135) {
                int var29 = class229.method1553((byte) 111);
                if (var29 == -1) {
                    class51.field1069 = 95;
                    class281.field4963 = class103.field1831;
                } else if (var29 == 7 || var29 == 9) {
                    this.method1236(124, "worldlistfull");
                    class70.method497(104, 1000);
                } else if (class76.field1465) {
                    class51.field1069 = 96;
                    class281.field4963 = class40.field922;
                    class219.field3955 = 140;
                } else {
                    this.method1236(104, "worldlistio_" + var29);
                    class70.method497(126, 1000);
                }
            } else if (class219.field3955 == 140) {
                class120.field2126 = class228.field4046.method1326((byte) -21, class94.field1676);
                class30.field757.method1328(false, (byte) -89, true);
                class14.field427.method1328(true, (byte) -96, true);
                class243.field4236.method1328(true, (byte) -113, true);
                class73.field1414.method1328(true, (byte) -116, true);
                class58.field1180.method1328(true, (byte) -123, true);
                class228.field4046.method1328(true, (byte) -125, true);
                class51.field1069 = 97;
                class219.field3955 = 150;
                class15.field450 = true;
                class281.field4963 = class170.field3071;
            } else if (class219.field3955 == 150) {
                if (class100.field1774) {
                    class221.field3970 = 0;
                    class243.field4246 = 0;
                    class50.field1058 = 0;
                    class54.field1119 = 0;
                }
                class100.field1774 = true;
                class7.method53(class281.field4957, (byte) -127);
                class57.method430(class50.field1058, -1, false, 0, -1);
                class281.field4963 = class130.field2290;
                class219.field3955 = 160;
                class51.field1069 = 100;
            } else if (class219.field3955 == 160) {
                class166.method1096(true, arg0 ^ 0x5163);
            }
        } else if (class167.field3040.method1308((byte) 74)) {
            class9 var27 = new class9(class16.field462, class167.field3040, class243.field4236, 20, !class19.field498);
            class247.method1650(var27);
            if (class124.field2227 == 1) {
                class247.method1647(0.9F);
            }
            if (class124.field2227 == 2) {
                class247.method1647(0.8F);
            }
            if (class124.field2227 == 3) {
                class247.method1647(0.7F);
            }
            if (class124.field2227 == 4) {
                class247.method1647(0.6F);
            }
            class51.field1069 = 70;
            class219.field3955 = 100;
            class281.field4963 = class97.field1712;
        } else {
            class281.field4963 = class148.method1022(10, new class265[] { class1.field18, class241.method1609(true, class167.field3040.method1317(16040)), class29.field742 });
            class51.field1069 = 70;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1476(int arg0) {
        class44.field966 = 0;
        field3851++;
        while (class91.method624(false) && class44.field966 < 128) {
            class82.field1550[class44.field966] = class130.field2344;
            class169.field3060[class44.field966] = class239.field4172;
            class44.field966++;
        }
        class84.field1572++;
        if (class8.field271 != -1) {
            class260.method1729(-1, 0, 0, class26.field706, class50.field1053, 0, 0, class8.field271);
        }
        class135.field2455++;
        if (arg0 > -108) {
            field3858 = null;
        }
        class18.method126(-1);
        while (true) {
            class277 var2;
            class6 var3;
            class6 var4;
            do {
                var2 = (class277) class126.field2249.method793(37);
                if (var2 == null) {
                    while (true) {
                        class277 var5;
                        class6 var6;
                        class6 var7;
                        do {
                            var5 = (class277) class167.field3029.method793(37);
                            if (var5 == null) {
                                while (true) {
                                    class277 var8;
                                    class6 var9;
                                    class6 var10;
                                    do {
                                        var8 = (class277) class64.field1245.method793(37);
                                        if (var8 == null) {
                                            if (class207.field3722 != null) {
                                                class261.method1749(0);
                                            }
                                            if (class119.field2106 != null && class119.field2106.field1996 == 1) {
                                                if (class119.field2106.field1997 != null) {
                                                    class105.method703((byte) -81, class10.field340, class236.field4126);
                                                }
                                                class119.field2106 = null;
                                                class236.field4126 = null;
                                                class10.field340 = false;
                                            }
                                            if (class93.field1655 % 1500 == 0) {
                                                class56.method426(false);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field4901;
                                        if (var9.field233 < 0) {
                                            break;
                                        }
                                        var10 = class21.method204(var9.field142, -16257);
                                    } while (var10 == null || var10.field160 == null || var10.field160.length <= var9.field233 || var10.field160[var9.field233] != var9);
                                    class192.method1318(var8, 200000);
                                }
                            }
                            var6 = var5.field4901;
                            if (var6.field233 < 0) {
                                break;
                            }
                            var7 = class21.method204(var6.field142, -16257);
                        } while (var7 == null || var7.field160 == null || var6.field233 >= var7.field160.length || var7.field160[var6.field233] != var6);
                        class192.method1318(var5, 200000);
                    }
                }
                var3 = var2.field4901;
                if (var3.field233 < 0) {
                    break;
                }
                var4 = class21.method204(var3.field142, -16257);
            } while (var4 == null || var4.field160 == null || var4.field160.length <= var3.field233 || var4.field160[var3.field233] != var3);
            class192.method1318(var2, 200000);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    private final void method1477(byte arg0) {
        field3847++;
        if (class54.field1118 < class130.field2281.field4478) {
            if (class53.field1106 == class177.field3152) {
                class53.field1106 = class40.field910;
            } else {
                class53.field1106 = class177.field3152;
            }
            class73.field1403 = (class130.field2281.field4478 - 1) * 250;
            if (class73.field1403 > 3000) {
                class73.field1403 = 3000;
            }
            if (class130.field2281.field4478 >= 2 && class130.field2281.field4476 == 6) {
                this.method1236(117, "js5connect_outofdate");
                class246.field4281 = 1000;
                return;
            }
            if (class130.field2281.field4478 >= 4 && class130.field2281.field4476 == -1) {
                this.method1236(arg0 ^ 0xFFFFFF81, "js5crc");
                class246.field4281 = 1000;
                return;
            }
            if (class130.field2281.field4478 >= 4 && (class246.field4281 == 0 || class246.field4281 == 5)) {
                if (class130.field2281.field4476 == 7 || class130.field2281.field4476 == 9) {
                    this.method1236(arg0 ^ 0xFFFFFF8E, "js5connect_full");
                } else if (class130.field2281.field4476 <= 0) {
                    this.method1236(102, "js5io");
                } else {
                    this.method1236(127, "js5connect");
                }
                class246.field4281 = 1000;
                return;
            }
        }
        class54.field1118 = class130.field2281.field4478;
        if (class73.field1403 > 0) {
            class73.field1403--;
            return;
        }
        try {
            if (class66.field1267 == 0) {
                class231.field4083 = class281.field4957.method1533(0, class256.field4381, class53.field1106);
                class66.field1267++;
            }
            if (arg0 != -14) {
                field3852 = null;
            }
            if (class66.field1267 == 1) {
                if (class231.field4083.field1996 == 2) {
                    this.method1471(0, 1000);
                    return;
                }
                if (class231.field4083.field1996 == 1) {
                    class66.field1267++;
                }
            }
            if (class66.field1267 == 2) {
                class120.field2125 = new class143((Socket) class231.field4083.field1997, class281.field4957);
                class135 var2 = new class135(5);
                var2.method903((byte) 36, 15);
                var2.method898((byte) 53, 526);
                class120.field2125.method982(0, true, var2.field2483, 5);
                class66.field1267++;
                class50.field1050 = class136.method950(8954);
            }
            if (class66.field1267 == 3) {
                if (class246.field4281 == 0 || class246.field4281 == 5 || class120.field2125.method987((byte) 53) > 0) {
                    int var3 = class120.field2125.method985((byte) 70);
                    if (var3 != 0) {
                        this.method1471(0, var3);
                        return;
                    }
                    class66.field1267++;
                } else if ((class136.method950(8954) - class50.field1050) > 30000L) {
                    this.method1471(arg0 + 14, 1001);
                    return;
                }
            }
            if (class66.field1267 == 4) {
                boolean var4 = class246.field4281 == 5 || class246.field4281 == 10 || class246.field4281 == 28;
                class130.field2281.method1716(class120.field2125, 125, !var4);
                class120.field2125 = null;
                class231.field4083 = null;
                class66.field1267 = 0;
            }
        } catch (IOException var5) {
            this.method1471(0, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field3848++;
        try {
            if (arg0.length != 4) {
                class53.method413("argument count", 3);
            }
            class102.field1809 = Integer.parseInt(arg0[0]);
            int var1 = -1;
            class264.field4601 = 2;
            if (arg0[1].equals("live")) {
                field3854 = 0;
            } else if (arg0[1].equals("rc")) {
                field3854 = 1;
            } else if (arg0[1].equals("wip")) {
                field3854 = 2;
            } else {
                class53.method413("modewhat", 3);
            }
            class264.field4602 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class283.method1922(5143, class7.method51(0, 12047, var2.length, var2));
            } catch (Exception var5) {
            }
            if (var1 != -1) {
                class44.field971 = var1;
            } else if (arg0[2].equals("english")) {
                class44.field971 = 0;
            } else if (arg0[2].equals("german")) {
                class44.field971 = 1;
            } else {
                class53.method413("language", 3);
            }
            class45.method372(-1, class44.field971);
            class202.field3624 = false;
            class153.field2848 = false;
            if (arg0[3].equals("game0")) {
                class229.field4051 = 0;
            } else if (arg0[3].equals("game1")) {
                class229.field4051 = 1;
            } else {
                class53.method413("game", 3);
            }
            class56.field1137 = false;
            class163.field2963 = class4.field66;
            class170.field3075 = 0;
            class23.field675 = 0;
            client var3 = new client();
            class21.field652 = var3;
            var3.method1229(10, 768, 526, false, "runescape", 1024, 28, field3854 + 32);
            class49.field1044.setLocation(40, 40);
        } catch (Exception var6) {
            class4.method28(-100, var6, (String) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1478(int arg0) {
        if (arg0 <= 45) {
            field3855 = false;
        }
        boolean var2 = class130.field2281.method1727(0);
        field3849++;
        if (!var2) {
            this.method1477((byte) -14);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method1224(boolean arg0) {
        field3860++;
        class279.method1901(false);
        class233.field4103 = new class238();
        class130.field2281 = new class259();
        if (field3854 != 0) {
            class49.field1035 = new byte[50][];
        }
        class32.method264(class281.field4957, -22581);
        if (class264.field4601 == 0) {
            class82.field1549 = this.getCodeBase().getHost();
            class126.field2263 = 43594;
            class217.field3914 = 443;
        } else if (class264.field4601 == 1) {
            class82.field1549 = this.getCodeBase().getHost();
            class217.field3914 = class102.field1809 + 50000;
            class126.field2263 = class102.field1809 + 40000;
        } else if (class264.field4601 == 2) {
            class82.field1549 = "127.0.0.1";
            class217.field3914 = class102.field1809 + 50000;
            class126.field2263 = class102.field1809 + 40000;
        }
        class177.field3152 = class126.field2263;
        class40.field910 = class217.field3914;
        class256.field4381 = class82.field1549;
        if (class229.field4051 == 1) {
            class262.field4581 = class52.field1083;
            class4.field61 = true;
            class10.field352 = class91.field1630;
            class70.field1356 = class249.field4323;
            class29.field743 = class101.field1791;
        } else {
            class10.field352 = class77.field1476;
            class29.field743 = class123.field2217;
            class262.field4581 = class257.field4391;
            class70.field1356 = class262.field4578;
        }
        if (class226.field4010 == 3 && class264.field4601 != 2) {
            class206.field3700 = class102.field1809;
        }
        class265.field4610 = class127.field2270 = class84.field1578 = class62.field1226 = new short[256];
        class265.field4613 = class126.field2263;
        class53.field1106 = class265.field4613;
        class30.method245((byte) 90);
        class124.method836(class125.field2241, 83);
        class207.method1420(class125.field2241, 25691);
        class263.field4595 = class56.method424((byte) -10);
        if (!arg0) {
            field3852 = null;
        }
        if (class263.field4595 != null) {
            class263.field4595.method442((byte) 59, class125.field2241);
        }
        class123.field2207 = class226.field4010;
        try {
            if (class281.field4957.field4009 != null) {
                class172.field3108 = new class31(class281.field4957.field4009, 5200, 0);
                for (int var2 = 0; var2 < 28; var2++) {
                    class166.field2992[var2] = new class31(class281.field4957.field4005[var2], 6000, 0);
                }
                class133.field2403 = new class31(class281.field4957.field4008, 6000, 0);
                class51.field1079 = new class182(255, class172.field3108, class133.field2403, 500000);
                class166.field3011 = new class31(class281.field4957.field4016, 24, 0);
                class281.field4957.field4009 = null;
                class281.field4957.field4016 = null;
                class281.field4957.field4008 = null;
                class281.field4957.field4005 = null;
            }
        } catch (IOException var3) {
            class172.field3108 = null;
            class166.field3011 = null;
            class51.field1079 = null;
            class133.field2403 = null;
        }
        if (class264.field4601 != 0) {
            class202.field3626 = true;
        }
        class64.field1246 = class176.field3137;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field3864++;
        if (!this.method1230(-58)) {
            return;
        }
        class102.field1809 = Integer.parseInt(this.getParameter("worldid"));
        class264.field4601 = Integer.parseInt(this.getParameter("modewhere"));
        if (class264.field4601 < 0 || class264.field4601 > 1) {
            class264.field4601 = 0;
        }
        field3854 = Integer.parseInt(this.getParameter("modewhat"));
        if (field3854 < 0 || field3854 > 2) {
            field3854 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class264.field4602 = true;
        } else {
            class264.field4602 = false;
        }
        try {
            class44.field971 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class44.field971 = 0;
        }
        class45.method372(-1, class44.field971);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class202.field3624 = true;
        } else {
            class202.field3624 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class153.field2848 = true;
        } else {
            class153.field2848 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class229.field4051 = 1;
        } else {
            class229.field4051 = 0;
        }
        try {
            class23.field675 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class23.field675 = 0;
        }
        class163.field2963 = class82.field1551.method1803(87, this);
        if (class163.field2963 == null) {
            class163.field2963 = class4.field66;
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class170.field3075 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class170.field3075 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class56.field1137 = true;
        } else {
            class56.field1137 = false;
        }
        class21.field652 = this;
        this.method1222(503, false, 526, 765, field3854 + 32);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static final void method1479(int arg0) {
        field3857++;
        if (arg0 != 2048) {
            field3854 = -96;
        }
        if (class122.field2189 == 5) {
            class122.field2189 = 6;
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static void method1480(int arg0) {
        field3858 = null;
        field3852 = null;
        if (arg0 < 59) {
            field3858 = null;
        }
        field3859 = null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lgk;)Lgk;")
    public static final class6 method1481(class6 arg0) {
        int var1 = class126.method842(32008, method1474(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class21.method204(arg0.field142, -16257);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }
}
