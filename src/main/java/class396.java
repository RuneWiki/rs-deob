import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class396 {

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "[Ljava/lang/String;")
    private static String[] field5609 = new String[1000];

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "[[I")
    private static int[][] field5617 = new int[5][5000];

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "[I")
    private static int[] field5608 = new int[5];

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "[I")
    private static int[] field5618 = new int[1000];

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "[Lor;")
    private static class319[] field5614 = new class319[50];

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    private static int field5619 = 0;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Ljava/util/Calendar;")
    private static Calendar field5603 = Calendar.getInstance();

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "[I")
    private static int[] field5625 = new int[3];

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field5626 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "Lco;")
    public static class210 field5624 = new class210(4);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Lab;")
    private static class256 field5610;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "Lab;")
    private static class256 field5611;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Lqj;")
    private static class257 field5613;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "[I")
    private static int[] field5622;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "[Ljava/lang/String;")
    private static String[] field5612;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Llc;II)V")
    public static final void method2369(class135 arg0, int arg1, int arg2) {
        class354 var3 = class375.method2263(arg1, arg2, arg0, -71);
        if (var3 == null) {
            return;
        }
        field5622 = new int[var3.field5073];
        field5612 = new String[var3.field5082];
        if (class326.field4704 == var3.field5084 || class142.field1723 == var3.field5084 || class134.field1621 == var3.field5084) {
            int var4 = 0;
            int var5 = 0;
            if (class289.field4318 != null) {
                var4 = class289.field4318.field3703;
                var5 = class289.field4318.field3576;
            }
            field5622[0] = class278.field3966.method837(-1) - var4;
            field5622[1] = class278.field3966.method838(124) - var5;
        }
        method2372(var3, 200000);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lbk;I)V")
    private static final void method2370(class35 arg0, int arg1) {
        Object[] var2 = arg0.field435;
        int var3 = (Integer) var2[0];
        class354 var4 = class476.method2814((byte) -83, var3);
        if (var4 == null) {
            return;
        }
        field5622 = new int[var4.field5073];
        int var5 = 0;
        field5612 = new String[var4.field5082];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field433;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field430;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field429 == null ? -1 : arg0.field429.field3659;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field419;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field429 == null ? -1 : arg0.field429.field3568;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field424 == null ? -1 : arg0.field424.field3659;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field424 == null ? -1 : arg0.field424.field3568;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field420;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field427;
                }
                field5622[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field425;
                }
                field5612[var6++] = var9;
            }
        }
        method2372(var4, arg1);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lbk;)V")
    public static final void method2371(class35 arg0) {
        method2370(arg0, 200000);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lih;I)V")
    private static final void method2372(class354 arg0, int arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int[] var5 = arg0.field5074;
        int[] var6 = arg0.field5083;
        byte var7 = -1;
        field5619 = 0;
        try {
            int var8 = 0;
            label4494: while (true) {
                var8++;
                if (var8 > arg1) {
                    throw new RuntimeException("slow");
                }
                var4++;
                int var625 = var5[var4];
                if (var625 < 100) {
                    if (var625 == 0) {
                        field5618[var2++] = var6[var4];
                        continue;
                    }
                    if (var625 == 1) {
                        int var9 = var6[var4];
                        field5618[var2++] = class75.field909.field6490[var9];
                        continue;
                    }
                    if (var625 == 2) {
                        int var10 = var6[var4];
                        var2--;
                        class75.field909.method2714(field5618[var2], var10, 113);
                        continue;
                    }
                    if (var625 == 3) {
                        field5609[var3++] = arg0.field5087[var4];
                        continue;
                    }
                    if (var625 == 6) {
                        var4 += var6[var4];
                        continue;
                    }
                    if (var625 == 7) {
                        var2 -= 2;
                        if (field5618[var2 + 1] != field5618[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 8) {
                        var2 -= 2;
                        if (field5618[var2 + 1] == field5618[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 9) {
                        var2 -= 2;
                        if (field5618[var2] < field5618[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 10) {
                        var2 -= 2;
                        if (field5618[var2] > field5618[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 21) {
                        if (field5619 == 0) {
                            return;
                        }
                        class319 var11 = field5614[--field5619];
                        arg0 = var11.field4637;
                        var5 = arg0.field5074;
                        var6 = arg0.field5083;
                        var4 = var11.field4639;
                        field5622 = var11.field4641;
                        field5612 = var11.field4638;
                        continue;
                    }
                    if (var625 == 25) {
                        int var12 = var6[var4];
                        field5618[var2++] = class75.field909.method620(var12, 119);
                        continue;
                    }
                    if (var625 == 27) {
                        int var13 = var6[var4];
                        var2--;
                        class75.field909.method2710(var13, field5618[var2], true);
                        continue;
                    }
                    if (var625 == 31) {
                        var2 -= 2;
                        if (field5618[var2] <= field5618[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 32) {
                        var2 -= 2;
                        if (field5618[var2] >= field5618[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var625 == 33) {
                        field5618[var2++] = field5622[var6[var4]];
                        continue;
                    }
                    int var10001;
                    if (var625 == 34) {
                        var10001 = var6[var4];
                        var2--;
                        field5622[var10001] = field5618[var2];
                        continue;
                    }
                    if (var625 == 35) {
                        field5609[var3++] = field5612[var6[var4]];
                        continue;
                    }
                    if (var625 == 36) {
                        var10001 = var6[var4];
                        var3--;
                        field5612[var10001] = field5609[var3];
                        continue;
                    }
                    if (var625 == 37) {
                        int var14 = var6[var4];
                        var3 -= var14;
                        String var15 = class324.method1975(field5609, var14, var3, 4);
                        field5609[var3++] = var15;
                        continue;
                    }
                    if (var625 == 38) {
                        var2--;
                        continue;
                    }
                    if (var625 == 39) {
                        var3--;
                        continue;
                    }
                    if (var625 == 40) {
                        int var16 = var6[var4];
                        class354 var17 = class476.method2814((byte) -83, var16);
                        if (var17 == null) {
                            throw new RuntimeException();
                        }
                        int[] var18 = new int[var17.field5073];
                        String[] var19 = new String[var17.field5082];
                        for (int var20 = 0; var20 < var17.field5079; var20++) {
                            var18[var20] = field5618[var2 + var20 - var17.field5079];
                        }
                        for (int var21 = 0; var21 < var17.field5080; var21++) {
                            var19[var21] = field5609[var3 + var21 - var17.field5080];
                        }
                        var2 -= var17.field5079;
                        var3 -= var17.field5080;
                        class319 var22 = new class319();
                        var22.field4637 = arg0;
                        var22.field4639 = var4;
                        var22.field4641 = field5622;
                        var22.field4638 = field5612;
                        if (field5619 >= field5614.length) {
                            throw new RuntimeException();
                        }
                        field5614[field5619++] = var22;
                        arg0 = var17;
                        var5 = var17.field5074;
                        var6 = var17.field5083;
                        var4 = -1;
                        field5622 = var18;
                        field5612 = var19;
                        continue;
                    }
                    if (var625 == 42) {
                        field5618[var2++] = class288.field4312[var6[var4]];
                        continue;
                    }
                    if (var625 == 43) {
                        int var23 = var6[var4];
                        var2--;
                        class288.field4312[var23] = field5618[var2];
                        class25.method142((byte) -126, var23);
                        class176.field2130 |= class190.field2599[var23];
                        continue;
                    }
                    if (var625 == 44) {
                        int var24 = var6[var4] >> 16;
                        int var25 = var6[var4] & 0xFFFF;
                        var2--;
                        int var26 = field5618[var2];
                        if (var26 >= 0 && var26 <= 5000) {
                            field5608[var24] = var26;
                            byte var27 = -1;
                            if (var25 == 105) {
                                var27 = 0;
                            }
                            int var28 = 0;
                            while (true) {
                                if (var28 >= var26) {
                                    continue label4494;
                                }
                                field5617[var24][var28] = var27;
                                var28++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var625 == 45) {
                        int var29 = var6[var4];
                        var2--;
                        int var30 = field5618[var2];
                        if (var30 >= 0 && var30 < field5608[var29]) {
                            field5618[var2++] = field5617[var29][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var625 == 46) {
                        int var31 = var6[var4];
                        var2 -= 2;
                        int var32 = field5618[var2];
                        if (var32 >= 0 && var32 < field5608[var31]) {
                            field5617[var31][var32] = field5618[var2 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var625 == 47) {
                        String var33 = class44.field565[var6[var4]];
                        if (var33 == null) {
                            var33 = "null";
                        }
                        field5609[var3++] = var33;
                        continue;
                    }
                    if (var625 == 48) {
                        int var34 = var6[var4];
                        var3--;
                        class44.field565[var34] = field5609[var3];
                        class106.method506((byte) 75, var34);
                        continue;
                    }
                    if (var625 == 51) {
                        class45 var35 = arg0.field5076[var6[var4]];
                        var2--;
                        class363 var36 = (class363) var35.method233(115, (long) field5618[var2]);
                        if (var36 != null) {
                            var4 += var36.field5221;
                        }
                        continue;
                    }
                }
                boolean var37;
                if (var6[var4] == 1) {
                    var37 = true;
                } else {
                    var37 = false;
                }
                if (var625 < 300) {
                    if (var625 == 100) {
                        var2 -= 3;
                        int var38 = field5618[var2];
                        int var39 = field5618[var2 + 1];
                        int var40 = field5618[var2 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class256 var41 = class399.method2387(var38, -1857167024);
                        if (var41.field3643 == null) {
                            var41.field3643 = new class256[var40 + 1];
                        }
                        if (var41.field3643.length <= var40) {
                            class256[] var42 = new class256[var40 + 1];
                            for (int var43 = 0; var43 < var41.field3643.length; var43++) {
                                var42[var43] = var41.field3643[var43];
                            }
                            var41.field3643 = var42;
                        }
                        if (var40 > 0 && var41.field3643[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class256 var44 = new class256();
                        var44.field3654 = var39;
                        var44.field3646 = var44.field3659 = var41.field3659;
                        var44.field3568 = var40;
                        var41.field3643[var40] = var44;
                        if (var37) {
                            field5611 = var44;
                        } else {
                            field5610 = var44;
                        }
                        class398.method2383(var41, 66);
                        continue;
                    }
                    if (var625 == 101) {
                        class256 var45 = var37 ? field5611 : field5610;
                        if (var45.field3568 == -1) {
                            if (var37) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class256 var46 = class399.method2387(var45.field3659, -1857167024);
                        var46.field3643[var45.field3568] = null;
                        class398.method2383(var46, 28);
                        continue;
                    }
                    if (var625 == 102) {
                        var2--;
                        class256 var47 = class399.method2387(field5618[var2], -1857167024);
                        var47.field3643 = null;
                        class398.method2383(var47, 84);
                        continue;
                    }
                    if (var625 == 200) {
                        var2 -= 2;
                        int var48 = field5618[var2];
                        int var49 = field5618[var2 + 1];
                        class256 var50 = class66.method339(var49, 0, var48);
                        if (var50 != null && var49 != -1) {
                            field5618[var2++] = 1;
                            if (var37) {
                                field5611 = var50;
                            } else {
                                field5610 = var50;
                            }
                            continue;
                        }
                        field5618[var2++] = 0;
                        continue;
                    }
                    if (var625 == 201) {
                        var2--;
                        int var51 = field5618[var2];
                        class256 var52 = class399.method2387(var51, -1857167024);
                        if (var52 == null) {
                            field5618[var2++] = 0;
                        } else {
                            field5618[var2++] = 1;
                            if (var37) {
                                field5611 = var52;
                            } else {
                                field5610 = var52;
                            }
                        }
                        continue;
                    }
                } else if (var625 < 500) {
                    if (var625 == 403) {
                        var2 -= 2;
                        int var53 = field5618[var2];
                        int var54 = field5618[var2 + 1];
                        for (int var55 = 0; var55 < class32.field407.length; var55++) {
                            if (class32.field407[var55] == var53) {
                                class19.field258.field2722.method2633(120, var55, var54, class19.field254);
                                continue label4494;
                            }
                        }
                        int var56 = 0;
                        while (true) {
                            if (var56 >= class176.field2127.length) {
                                continue label4494;
                            }
                            if (class176.field2127[var56] == var53) {
                                class19.field258.field2722.method2633(-66, var56, var54, class19.field254);
                                continue label4494;
                            }
                            var56++;
                        }
                    }
                    if (var625 == 404) {
                        var2 -= 2;
                        int var57 = field5618[var2];
                        int var58 = field5618[var2 + 1];
                        class19.field258.field2722.method2634(var57, var58, -268450832);
                        continue;
                    }
                    if (var625 == 410) {
                        var2--;
                        boolean var59 = field5618[var2] != 0;
                        class19.field258.field2722.method2631(var59, false);
                        continue;
                    }
                } else if (var625 >= 1000 && var625 < 1100 || var625 >= 2000 && var625 < 2100) {
                    class256 var60;
                    if (var625 >= 2000) {
                        var625 -= 1000;
                        var2--;
                        var60 = class399.method2387(field5618[var2], -1857167024);
                    } else {
                        var60 = var37 ? field5611 : field5610;
                    }
                    if (var625 == 1000) {
                        var2 -= 4;
                        var60.field3562 = field5618[var2];
                        var60.field3560 = field5618[var2 + 1];
                        int var61 = field5618[var2 + 2];
                        if (var61 < 0) {
                            var61 = 0;
                        } else if (var61 > 5) {
                            var61 = 5;
                        }
                        int var62 = field5618[var2 + 3];
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 5) {
                            var62 = 5;
                        }
                        var60.field3608 = (byte) var61;
                        var60.field3671 = (byte) var62;
                        class398.method2383(var60, 55);
                        class58.method303(var60, (byte) -89);
                        if (var60.field3568 == -1) {
                            class388.method2342((byte) -86, var60.field3659);
                        }
                        continue;
                    }
                    if (var625 == 1001) {
                        var2 -= 4;
                        var60.field3580 = field5618[var2];
                        var60.field3589 = field5618[var2 + 1];
                        var60.field3614 = 0;
                        var60.field3667 = 0;
                        int var63 = field5618[var2 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 4) {
                            var63 = 4;
                        }
                        int var64 = field5618[var2 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 4) {
                            var64 = 4;
                        }
                        var60.field3588 = (byte) var63;
                        var60.field3612 = (byte) var64;
                        class398.method2383(var60, 33);
                        class58.method303(var60, (byte) -89);
                        if (var60.field3654 == 0) {
                            class442.method2608(var60, -124, false);
                        }
                        continue;
                    }
                    if (var625 == 1003) {
                        var2--;
                        boolean var65 = field5618[var2] == 1;
                        if (var60.field3656 != var65) {
                            var60.field3656 = var65;
                            class398.method2383(var60, 127);
                        }
                        if (var60.field3568 == -1) {
                            class237.method1309(-5616, var60.field3659);
                        }
                        continue;
                    }
                    if (var625 == 1004) {
                        var2 -= 2;
                        var60.field3665 = field5618[var2];
                        var60.field3669 = field5618[var2 + 1];
                        class398.method2383(var60, 120);
                        class58.method303(var60, (byte) -89);
                        if (var60.field3654 == 0) {
                            class442.method2608(var60, -77, false);
                        }
                        continue;
                    }
                    if (var625 == 1005) {
                        var2--;
                        var60.field3609 = field5618[var2] == 1;
                        continue;
                    }
                } else if (!(var625 < 1100 || var625 >= 1200) || !(var625 < 2100 || var625 >= 2200)) {
                    class256 var66;
                    if (var625 >= 2000) {
                        var625 -= 1000;
                        var2--;
                        var66 = class399.method2387(field5618[var2], -1857167024);
                    } else {
                        var66 = var37 ? field5611 : field5610;
                    }
                    if (var625 == 1100) {
                        var2 -= 2;
                        var66.field3638 = field5618[var2];
                        if (var66.field3638 > var66.field3628 - var66.field3597) {
                            var66.field3638 = var66.field3628 - var66.field3597;
                        }
                        if (var66.field3638 < 0) {
                            var66.field3638 = 0;
                        }
                        var66.field3658 = field5618[var2 + 1];
                        if (var66.field3658 > var66.field3695 - var66.field3707) {
                            var66.field3658 = var66.field3695 - var66.field3707;
                        }
                        if (var66.field3658 < 0) {
                            var66.field3658 = 0;
                        }
                        class398.method2383(var66, 100);
                        if (var66.field3568 == -1) {
                            class90.method455(var66.field3659, -112);
                        }
                        continue;
                    }
                    if (var625 == 1101) {
                        var2--;
                        var66.field3679 = field5618[var2];
                        class398.method2383(var66, 75);
                        if (var66.field3568 == -1) {
                            class71.method363(var66.field3659, 3);
                        }
                        continue;
                    }
                    if (var625 == 1102) {
                        var2--;
                        var66.field3626 = field5618[var2] == 1;
                        class398.method2383(var66, 38);
                        continue;
                    }
                    if (var625 == 1103) {
                        var2--;
                        var66.field3644 = field5618[var2];
                        class398.method2383(var66, 72);
                        continue;
                    }
                    if (var625 == 1104) {
                        var2--;
                        var66.field3584 = field5618[var2];
                        class398.method2383(var66, 27);
                        continue;
                    }
                    if (var625 == 1105) {
                        var2--;
                        int var67 = field5618[var2];
                        if (var66.field3563 != var67) {
                            var66.field3563 = var67;
                            class398.method2383(var66, 64);
                        }
                        if (var66.field3568 == -1) {
                            class46.method244(var66.field3659, 14);
                        }
                        continue;
                    }
                    if (var625 == 1106) {
                        var2--;
                        var66.field3673 = field5618[var2];
                        class398.method2383(var66, 96);
                        continue;
                    }
                    if (var625 == 1107) {
                        var2--;
                        var66.field3704 = field5618[var2] == 1;
                        class398.method2383(var66, 121);
                        continue;
                    }
                    if (var625 == 1108) {
                        var66.field3596 = 1;
                        var2--;
                        var66.field3674 = field5618[var2];
                        class398.method2383(var66, 48);
                        if (var66.field3568 == -1) {
                            class234.method1294(var66.field3659, 4);
                        }
                        continue;
                    }
                    if (var625 == 1109) {
                        var2 -= 6;
                        var66.field3587 = field5618[var2];
                        var66.field3710 = field5618[var2 + 1];
                        var66.field3567 = field5618[var2 + 2];
                        var66.field3681 = field5618[var2 + 3];
                        var66.field3675 = field5618[var2 + 4];
                        var66.field3607 = field5618[var2 + 5];
                        class398.method2383(var66, 30);
                        if (var66.field3568 == -1) {
                            class283.method1776(false, var66.field3659);
                            class421.method2511((byte) -116, var66.field3659);
                        }
                        continue;
                    }
                    if (var625 == 1110) {
                        var2--;
                        int var68 = field5618[var2];
                        if (var66.field3572 != var68) {
                            var66.field3572 = var68;
                            var66.field3639 = 0;
                            var66.field3637 = 1;
                            var66.field3696 = 0;
                            class398.method2383(var66, 99);
                        }
                        if (var66.field3568 == -1) {
                            class159.method767(var66.field3659, false);
                        }
                        continue;
                    }
                    if (var625 == 1111) {
                        var2--;
                        var66.field3677 = field5618[var2] == 1;
                        class398.method2383(var66, 107);
                        continue;
                    }
                    if (var625 == 1112) {
                        var3--;
                        String var69 = field5609[var3];
                        if (!var69.equals(var66.field3663)) {
                            var66.field3663 = var69;
                            class398.method2383(var66, 75);
                        }
                        if (var66.field3568 == -1) {
                            class428.method2552((byte) 93, var66.field3659);
                        }
                        continue;
                    }
                    if (var625 == 1113) {
                        var2--;
                        var66.field3687 = field5618[var2];
                        class398.method2383(var66, 91);
                        if (var66.field3568 == -1) {
                            class432.method2586(var66.field3659, 25354);
                        }
                        continue;
                    }
                    if (var625 == 1114) {
                        var2 -= 3;
                        var66.field3625 = field5618[var2];
                        var66.field3666 = field5618[var2 + 1];
                        var66.field3564 = field5618[var2 + 2];
                        class398.method2383(var66, 68);
                        continue;
                    }
                    if (var625 == 1115) {
                        var2--;
                        var66.field3618 = field5618[var2] == 1;
                        class398.method2383(var66, 110);
                        continue;
                    }
                    if (var625 == 1116) {
                        var2--;
                        var66.field3694 = field5618[var2];
                        class398.method2383(var66, 94);
                        continue;
                    }
                    if (var625 == 1117) {
                        var2--;
                        var66.field3701 = field5618[var2];
                        class398.method2383(var66, 102);
                        continue;
                    }
                    if (var625 == 1118) {
                        var2--;
                        var66.field3649 = field5618[var2] == 1;
                        class398.method2383(var66, 33);
                        continue;
                    }
                    if (var625 == 1119) {
                        var2--;
                        var66.field3670 = field5618[var2] == 1;
                        class398.method2383(var66, 85);
                        continue;
                    }
                    if (var625 == 1120) {
                        var2 -= 2;
                        var66.field3628 = field5618[var2];
                        var66.field3695 = field5618[var2 + 1];
                        class398.method2383(var66, 63);
                        if (var66.field3654 == 0) {
                            class442.method2608(var66, -47, false);
                        }
                        continue;
                    }
                    if (var625 == 1121) {
                        var2 -= 2;
                        var66.field3693 = (short) field5618[var2];
                        var66.field3651 = (short) field5618[var2 + 1];
                        class398.method2383(var66, 91);
                        continue;
                    }
                    if (var625 == 1122) {
                        var2--;
                        var66.field3582 = field5618[var2] == 1;
                        class398.method2383(var66, 117);
                        continue;
                    }
                    if (var625 == 1123) {
                        var2--;
                        var66.field3607 = field5618[var2];
                        class398.method2383(var66, 50);
                        if (var66.field3568 == -1) {
                            class283.method1776(false, var66.field3659);
                        }
                        continue;
                    }
                    if (var625 == 1124) {
                        var2--;
                        int var70 = field5618[var2];
                        var66.field3668 = var70 == 1;
                        class398.method2383(var66, 70);
                        continue;
                    }
                    if (var625 == 1125) {
                        var2 -= 2;
                        var66.field3647 = field5618[var2];
                        var66.field3691 = field5618[var2 + 1];
                        class398.method2383(var66, 99);
                        continue;
                    }
                } else if (!(var625 < 1200 || var625 >= 1300) || !(var625 < 2200 || var625 >= 2300)) {
                    class256 var71;
                    if (var625 >= 2000) {
                        var625 -= 1000;
                        var2--;
                        var71 = class399.method2387(field5618[var2], -1857167024);
                    } else {
                        var71 = var37 ? field5611 : field5610;
                    }
                    class398.method2383(var71, 98);
                    if (var625 == 1200 || var625 == 1205 || var625 == 1208 || var625 == 1209 || var625 == 1212 || var625 == 1213) {
                        var2 -= 2;
                        int var72 = field5618[var2];
                        int var73 = field5618[var2 + 1];
                        if (var71.field3568 == -1) {
                            class463.method2723(var71.field3659, (byte) -121);
                            class283.method1776(false, var71.field3659);
                            class421.method2511((byte) -123, var71.field3659);
                        }
                        if (var72 == -1) {
                            var71.field3596 = 1;
                            var71.field3674 = -1;
                            var71.field3585 = -1;
                            continue;
                        }
                        var71.field3585 = var72;
                        var71.field3655 = var73;
                        if (var625 == 1208 || var625 == 1209) {
                            var71.field3616 = true;
                        } else {
                            var71.field3616 = false;
                        }
                        class385 var74 = class422.field6096.method121(var72, -1);
                        var71.field3567 = var74.field5465;
                        var71.field3681 = var74.field5526;
                        var71.field3675 = var74.field5500;
                        var71.field3587 = var74.field5495;
                        var71.field3710 = var74.field5522;
                        var71.field3607 = var74.field5525;
                        if (var625 == 1205 || var625 == 1209) {
                            var71.field3615 = 0;
                        } else if (var625 == 1212 || var625 == 1213) {
                            var71.field3615 = 1;
                        } else {
                            var71.field3615 = 2;
                        }
                        if (var71.field3614 > 0) {
                            var71.field3607 = var71.field3607 * 32 / var71.field3614;
                        } else if (var71.field3580 > 0) {
                            var71.field3607 = var71.field3607 * 32 / var71.field3580;
                        }
                        continue;
                    }
                    if (var625 == 1201) {
                        var71.field3596 = 2;
                        var2--;
                        var71.field3674 = field5618[var2];
                        if (var71.field3568 == -1) {
                            class234.method1294(var71.field3659, 4);
                        }
                        continue;
                    }
                    if (var625 == 1202) {
                        var71.field3596 = 3;
                        var71.field3674 = -1;
                        if (var71.field3568 == -1) {
                            class234.method1294(var71.field3659, 4);
                        }
                        continue;
                    }
                    if (var625 == 1203) {
                        var71.field3596 = 6;
                        var2--;
                        var71.field3674 = field5618[var2];
                        if (var71.field3568 == -1) {
                            class234.method1294(var71.field3659, 4);
                        }
                        continue;
                    }
                    if (var625 == 1204) {
                        var71.field3596 = 5;
                        var2--;
                        var71.field3674 = field5618[var2];
                        if (var71.field3568 == -1) {
                            class234.method1294(var71.field3659, 4);
                        }
                        continue;
                    }
                    if (var625 == 1206) {
                        var2 -= 4;
                        var71.field3640 = field5618[var2];
                        var71.field3583 = field5618[var2 + 1];
                        var71.field3578 = field5618[var2 + 2];
                        var71.field3627 = field5618[var2 + 3];
                        class398.method2383(var71, 98);
                        continue;
                    }
                    if (var625 == 1207) {
                        var2 -= 2;
                        var71.field3672 = field5618[var2];
                        var71.field3635 = field5618[var2 + 1];
                        class398.method2383(var71, 98);
                        continue;
                    }
                    if (var625 == 1210) {
                        var2 -= 4;
                        var71.field3674 = field5618[var2];
                        var71.field3610 = field5618[var2 + 1];
                        if (field5618[var2 + 2] == 1) {
                            var71.field3596 = 9;
                        } else {
                            var71.field3596 = 8;
                        }
                        if (field5618[var2 + 3] == 1) {
                            var71.field3616 = true;
                        } else {
                            var71.field3616 = false;
                        }
                        if (var71.field3568 == -1) {
                            class234.method1294(var71.field3659, 4);
                        }
                        continue;
                    }
                    if (var625 == 1211) {
                        var71.field3596 = 5;
                        var71.field3674 = class61.field760;
                        var71.field3610 = 0;
                        if (var71.field3568 == -1) {
                            class234.method1294(var71.field3659, 4);
                        }
                        continue;
                    }
                } else if (var625 >= 1300 && var625 < 1400 || var625 >= 2300 && var625 < 2400) {
                    class256 var75;
                    if (var625 >= 2000) {
                        var625 -= 1000;
                        var2--;
                        var75 = class399.method2387(field5618[var2], -1857167024);
                    } else {
                        var75 = var37 ? field5611 : field5610;
                    }
                    if (var625 == 1300) {
                        var2--;
                        int var76 = field5618[var2] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var3--;
                            var75.method1578(field5609[var3], -124, var76);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var625 == 1301) {
                        var2 -= 2;
                        int var77 = field5618[var2];
                        int var78 = field5618[var2 + 1];
                        var75.field3657 = class66.method339(var78, 0, var77);
                        continue;
                    }
                    if (var625 == 1302) {
                        var2--;
                        int var79 = field5618[var2];
                        if (class44.field567 == var79 || class148.field1804 == var79 || class110.field1316 == var79) {
                            var75.field3581 = var79;
                        }
                        continue;
                    }
                    if (var625 == 1303) {
                        var2--;
                        var75.field3629 = field5618[var2];
                        continue;
                    }
                    if (var625 == 1304) {
                        var2--;
                        var75.field3682 = field5618[var2];
                        continue;
                    }
                    if (var625 == 1305) {
                        var3--;
                        var75.field3700 = field5609[var3];
                        continue;
                    }
                    if (var625 == 1306) {
                        var3--;
                        var75.field3593 = field5609[var3];
                        continue;
                    }
                    if (var625 == 1307) {
                        var75.field3565 = null;
                        continue;
                    }
                    if (var625 == 1308) {
                        var2--;
                        var75.field3621 = field5618[var2];
                        var2--;
                        var75.field3558 = field5618[var2];
                        continue;
                    }
                    if (var625 == 1309) {
                        var2--;
                        int var80 = field5618[var2];
                        var2--;
                        int var81 = field5618[var2];
                        if (var81 >= 1 && var81 <= 10) {
                            var75.method1574(var81 - 1, (byte) 110, var80);
                        }
                        continue;
                    }
                    if (var625 == 1310) {
                        var3--;
                        var75.field3636 = field5609[var3];
                        continue;
                    }
                    if (var625 == 1311) {
                        var2--;
                        var75.field3557 = field5618[var2];
                        continue;
                    }
                } else {
                    if (var625 >= 1400 && var625 < 1500 || var625 >= 2400 && var625 < 2500) {
                        class256 var82;
                        if (var625 >= 2000) {
                            var625 -= 1000;
                            var2--;
                            var82 = class399.method2387(field5618[var2], -1857167024);
                        } else {
                            var82 = var37 ? field5611 : field5610;
                        }
                        var3--;
                        String var83 = field5609[var3];
                        int[] var84 = null;
                        if (var83.length() > 0 && var83.charAt(var83.length() - 1) == 'Y') {
                            var2--;
                            int var85 = field5618[var2];
                            if (var85 > 0) {
                                var84 = new int[var85];
                                while (var85-- > 0) {
                                    var2--;
                                    var84[var85] = field5618[var2];
                                }
                            }
                            var83 = var83.substring(0, var83.length() - 1);
                        }
                        Object[] var86 = new Object[var83.length() + 1];
                        for (int var87 = var86.length - 1; var87 >= 1; var87--) {
                            if (var83.charAt(var87 - 1) == 's') {
                                var3--;
                                var86[var87] = field5609[var3];
                            } else {
                                var2--;
                                var86[var87] = Integer.valueOf(field5618[var2]);
                            }
                        }
                        var2--;
                        int var88 = field5618[var2];
                        if (var88 == -1) {
                            var86 = null;
                        } else {
                            var86[0] = Integer.valueOf(var88);
                        }
                        if (var625 == 1400) {
                            var82.field3702 = var86;
                        } else if (var625 == 1401) {
                            var82.field3662 = var86;
                        } else if (var625 == 1402) {
                            var82.field3697 = var86;
                        } else if (var625 == 1403) {
                            var82.field3676 = var86;
                        } else if (var625 == 1404) {
                            var82.field3660 = var86;
                        } else if (var625 == 1405) {
                            var82.field3566 = var86;
                        } else if (var625 == 1406) {
                            var82.field3708 = var86;
                        } else if (var625 == 1407) {
                            var82.field3624 = var86;
                            var82.field3569 = var84;
                        } else if (var625 == 1408) {
                            var82.field3590 = var86;
                        } else if (var625 == 1409) {
                            var82.field3631 = var86;
                        } else if (var625 == 1410) {
                            var82.field3709 = var86;
                        } else if (var625 == 1411) {
                            var82.field3586 = var86;
                        } else if (var625 == 1412) {
                            var82.field3698 = var86;
                        } else if (var625 == 1414) {
                            var82.field3600 = var86;
                            var82.field3664 = var84;
                        } else if (var625 == 1415) {
                            var82.field3642 = var86;
                            var82.field3690 = var84;
                        } else if (var625 == 1416) {
                            var82.field3605 = var86;
                        } else if (var625 == 1417) {
                            var82.field3653 = var86;
                        } else if (var625 == 1418) {
                            var82.field3577 = var86;
                        } else if (var625 == 1419) {
                            var82.field3606 = var86;
                        } else if (var625 == 1420) {
                            var82.field3579 = var86;
                        } else if (var625 == 1421) {
                            var82.field3601 = var86;
                        } else if (var625 == 1422) {
                            var82.field3661 = var86;
                        } else if (var625 == 1423) {
                            var82.field3678 = var86;
                        } else if (var625 == 1424) {
                            var82.field3683 = var86;
                        } else if (var625 == 1425) {
                            var82.field3561 = var86;
                        } else if (var625 == 1426) {
                            var82.field3617 = var86;
                        } else if (var625 == 1427) {
                            var82.field3632 = var86;
                        } else if (var625 == 1428) {
                            var82.field3652 = var86;
                            var82.field3574 = var84;
                        } else if (var625 == 1429) {
                            var82.field3684 = var86;
                            var82.field3692 = var84;
                        }
                        var82.field3598 = true;
                        continue;
                    }
                    if (var625 < 1600) {
                        class256 var89 = var37 ? field5611 : field5610;
                        if (var625 == 1500) {
                            field5618[var2++] = var89.field3703;
                            continue;
                        }
                        if (var625 == 1501) {
                            field5618[var2++] = var89.field3576;
                            continue;
                        }
                        if (var625 == 1502) {
                            field5618[var2++] = var89.field3597;
                            continue;
                        }
                        if (var625 == 1503) {
                            field5618[var2++] = var89.field3707;
                            continue;
                        }
                        if (var625 == 1504) {
                            field5618[var2++] = var89.field3656 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 1505) {
                            field5618[var2++] = var89.field3646;
                            continue;
                        }
                    } else if (var625 < 1700) {
                        class256 var90 = var37 ? field5611 : field5610;
                        if (var625 == 1600) {
                            field5618[var2++] = var90.field3638;
                            continue;
                        }
                        if (var625 == 1601) {
                            field5618[var2++] = var90.field3658;
                            continue;
                        }
                        if (var625 == 1602) {
                            field5609[var3++] = var90.field3663;
                            continue;
                        }
                        if (var625 == 1603) {
                            field5618[var2++] = var90.field3628;
                            continue;
                        }
                        if (var625 == 1604) {
                            field5618[var2++] = var90.field3695;
                            continue;
                        }
                        if (var625 == 1605) {
                            field5618[var2++] = var90.field3607;
                            continue;
                        }
                        if (var625 == 1606) {
                            field5618[var2++] = var90.field3567;
                            continue;
                        }
                        if (var625 == 1607) {
                            field5618[var2++] = var90.field3675;
                            continue;
                        }
                        if (var625 == 1608) {
                            field5618[var2++] = var90.field3681;
                            continue;
                        }
                        if (var625 == 1609) {
                            field5618[var2++] = var90.field3644;
                            continue;
                        }
                        if (var625 == 1610) {
                            field5618[var2++] = var90.field3587;
                            continue;
                        }
                        if (var625 == 1611) {
                            field5618[var2++] = var90.field3710;
                            continue;
                        }
                        if (var625 == 1612) {
                            field5618[var2++] = var90.field3563;
                            continue;
                        }
                    } else if (var625 < 1800) {
                        class256 var91 = var37 ? field5611 : field5610;
                        if (var625 == 1700) {
                            field5618[var2++] = var91.field3585;
                            continue;
                        }
                        if (var625 == 1701) {
                            if (var91.field3585 == -1) {
                                field5618[var2++] = 0;
                            } else {
                                field5618[var2++] = var91.field3655;
                            }
                            continue;
                        }
                        if (var625 == 1702) {
                            field5618[var2++] = var91.field3568;
                            continue;
                        }
                    } else if (var625 < 1900) {
                        class256 var92 = var37 ? field5611 : field5610;
                        if (var625 == 1800) {
                            field5618[var2++] = client.method1660(var92).method1768(-30065);
                            continue;
                        }
                        if (var625 == 1801) {
                            var2--;
                            int var93 = field5618[var2];
                            int var626 = var93 - 1;
                            if (var92.field3565 != null && var626 < var92.field3565.length && var92.field3565[var626] != null) {
                                field5609[var3++] = var92.field3565[var626];
                                continue;
                            }
                            field5609[var3++] = "";
                            continue;
                        }
                        if (var625 == 1802) {
                            if (var92.field3700 == null) {
                                field5609[var3++] = "";
                            } else {
                                field5609[var3++] = var92.field3700;
                            }
                            continue;
                        }
                    } else if (var625 < 2600) {
                        var2--;
                        class256 var94 = class399.method2387(field5618[var2], -1857167024);
                        if (var625 == 2500) {
                            field5618[var2++] = var94.field3703;
                            continue;
                        }
                        if (var625 == 2501) {
                            field5618[var2++] = var94.field3576;
                            continue;
                        }
                        if (var625 == 2502) {
                            field5618[var2++] = var94.field3597;
                            continue;
                        }
                        if (var625 == 2503) {
                            field5618[var2++] = var94.field3707;
                            continue;
                        }
                        if (var625 == 2504) {
                            field5618[var2++] = var94.field3656 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 2505) {
                            field5618[var2++] = var94.field3646;
                            continue;
                        }
                    } else if (var625 < 2700) {
                        var2--;
                        class256 var95 = class399.method2387(field5618[var2], -1857167024);
                        if (var625 == 2600) {
                            field5618[var2++] = var95.field3638;
                            continue;
                        }
                        if (var625 == 2601) {
                            field5618[var2++] = var95.field3658;
                            continue;
                        }
                        if (var625 == 2602) {
                            field5609[var3++] = var95.field3663;
                            continue;
                        }
                        if (var625 == 2603) {
                            field5618[var2++] = var95.field3628;
                            continue;
                        }
                        if (var625 == 2604) {
                            field5618[var2++] = var95.field3695;
                            continue;
                        }
                        if (var625 == 2605) {
                            field5618[var2++] = var95.field3607;
                            continue;
                        }
                        if (var625 == 2606) {
                            field5618[var2++] = var95.field3567;
                            continue;
                        }
                        if (var625 == 2607) {
                            field5618[var2++] = var95.field3675;
                            continue;
                        }
                        if (var625 == 2608) {
                            field5618[var2++] = var95.field3681;
                            continue;
                        }
                        if (var625 == 2609) {
                            field5618[var2++] = var95.field3644;
                            continue;
                        }
                        if (var625 == 2610) {
                            field5618[var2++] = var95.field3587;
                            continue;
                        }
                        if (var625 == 2611) {
                            field5618[var2++] = var95.field3710;
                            continue;
                        }
                        if (var625 == 2612) {
                            field5618[var2++] = var95.field3563;
                            continue;
                        }
                    } else if (var625 < 2800) {
                        if (var625 == 2700) {
                            var2--;
                            class256 var96 = class399.method2387(field5618[var2], -1857167024);
                            field5618[var2++] = var96.field3585;
                            continue;
                        }
                        if (var625 == 2701) {
                            var2--;
                            class256 var97 = class399.method2387(field5618[var2], -1857167024);
                            if (var97.field3585 == -1) {
                                field5618[var2++] = 0;
                            } else {
                                field5618[var2++] = var97.field3655;
                            }
                            continue;
                        }
                        if (var625 == 2702) {
                            var2--;
                            int var98 = field5618[var2];
                            class68 var99 = (class68) class369.field5270.method233(-108, (long) var98);
                            if (var99 == null) {
                                field5618[var2++] = 0;
                            } else {
                                field5618[var2++] = 1;
                            }
                            continue;
                        }
                        if (var625 == 2703) {
                            var2--;
                            class256 var100 = class399.method2387(field5618[var2], -1857167024);
                            if (var100.field3643 == null) {
                                field5618[var2++] = 0;
                                continue;
                            }
                            int var101 = var100.field3643.length;
                            for (int var102 = 0; var102 < var100.field3643.length; var102++) {
                                if (var100.field3643[var102] == null) {
                                    var101 = var102;
                                    break;
                                }
                            }
                            field5618[var2++] = var101;
                            continue;
                        }
                        if (var625 == 2704 || var625 == 2705) {
                            var2 -= 2;
                            int var103 = field5618[var2];
                            int var104 = field5618[var2 + 1];
                            class68 var105 = (class68) class369.field5270.method233(-109, (long) var103);
                            if (var105 != null && var105.field850 == var104) {
                                field5618[var2++] = 1;
                                continue;
                            }
                            field5618[var2++] = 0;
                            continue;
                        }
                    } else if (var625 < 2900) {
                        var2--;
                        class256 var106 = class399.method2387(field5618[var2], -1857167024);
                        if (var625 == 2800) {
                            field5618[var2++] = client.method1660(var106).method1768(-30065);
                            continue;
                        }
                        if (var625 == 2801) {
                            var2--;
                            int var107 = field5618[var2];
                            int var627 = var107 - 1;
                            if (var106.field3565 != null && var627 < var106.field3565.length && var106.field3565[var627] != null) {
                                field5609[var3++] = var106.field3565[var627];
                                continue;
                            }
                            field5609[var3++] = "";
                            continue;
                        }
                        if (var625 == 2802) {
                            if (var106.field3700 == null) {
                                field5609[var3++] = "";
                            } else {
                                field5609[var3++] = var106.field3700;
                            }
                            continue;
                        }
                    } else if (var625 < 3200) {
                        if (var625 == 3100) {
                            var3--;
                            String var108 = field5609[var3];
                            class104.method499(var108, (byte) -10);
                            continue;
                        }
                        if (var625 == 3101) {
                            var2 -= 2;
                            class244.method1329(field5618[var2], 0, class19.field258, field5618[var2 + 1]);
                            continue;
                        }
                        if (var625 == 3103) {
                            class456.method2689(true, 127);
                            continue;
                        }
                        if (var625 == 3104) {
                            var3--;
                            String var109 = field5609[var3];
                            int var110 = 0;
                            if (class80.method401(false, var109)) {
                                var110 = class184.method997(var109, false);
                            }
                            field5607++;
                            class244.method1332((byte) 124, class90.field1126);
                            class230.field3185.method897(var110, -117);
                            continue;
                        }
                        if (var625 == 3105) {
                            var3--;
                            String var111 = field5609[var3];
                            field5602++;
                            class244.method1332((byte) -42, class297.field4414);
                            class230.field3185.method909(var111.length() + 1, -1);
                            class230.field3185.method935(var111, 41);
                            continue;
                        }
                        if (var625 == 3106) {
                            var3--;
                            String var112 = field5609[var3];
                            field5615++;
                            class244.method1332((byte) -120, class179.field2226);
                            class230.field3185.method909(var112.length() + 1, -1);
                            class230.field3185.method935(var112, 79);
                            continue;
                        }
                        if (var625 == 3107) {
                            var2--;
                            int var113 = field5618[var2];
                            var3--;
                            String var114 = field5609[var3];
                            class442.method2610(var114, true, var113);
                            continue;
                        }
                        if (var625 == 3108) {
                            var2 -= 3;
                            int var115 = field5618[var2];
                            int var116 = field5618[var2 + 1];
                            int var117 = field5618[var2 + 2];
                            class256 var118 = class399.method2387(var117, -1857167024);
                            class337.method2043(var116, var115, (byte) -17, var118);
                            continue;
                        }
                        if (var625 == 3109) {
                            var2 -= 2;
                            int var119 = field5618[var2];
                            int var120 = field5618[var2 + 1];
                            class256 var121 = var37 ? field5611 : field5610;
                            class337.method2043(var120, var119, (byte) -17, var121);
                            continue;
                        }
                        if (var625 == 3110) {
                            var2--;
                            int var122 = field5618[var2];
                            field5601++;
                            class244.method1332((byte) 124, class67.field842);
                            class230.field3185.method884(var122, true);
                            continue;
                        }
                        if (var625 == 3111) {
                            var2 -= 2;
                            int var123 = field5618[var2];
                            int var124 = field5618[var2 + 1];
                            class68 var125 = (class68) class369.field5270.method233(-65, (long) var123);
                            if (var125 != null) {
                                class259.method1590(var125, true, -364, var125.field850 != var124);
                            }
                            class375.method2261(var124, true, var123, 3, 65536);
                            continue;
                        }
                        if (var625 == 3112) {
                            var2--;
                            int var126 = field5618[var2];
                            class68 var127 = (class68) class369.field5270.method233(76, (long) var126);
                            if (var127 != null && var127.field844 == 3) {
                                class259.method1590(var127, true, -364, true);
                            }
                            continue;
                        }
                    } else if (var625 < 3300) {
                        if (var625 == 3200) {
                            var2 -= 3;
                            class291.method1831(field5618[var2 + 2], field5618[var2], field5618[var2 + 1], 126, 255);
                            continue;
                        }
                        if (var625 == 3201) {
                            var2--;
                            class12.method91(field5618[var2], 255, -80);
                            continue;
                        }
                        if (var625 == 3202) {
                            var2 -= 2;
                            class398.method2381(field5618[var2 + 1], 255, -27247, field5618[var2]);
                            continue;
                        }
                    } else if (var625 < 3400) {
                        if (var625 == 3300) {
                            field5618[var2++] = class204.field2796;
                            continue;
                        }
                        if (var625 == 3301) {
                            var2 -= 2;
                            int var128 = field5618[var2];
                            int var129 = field5618[var2 + 1];
                            field5618[var2++] = class345.method2092(124, var128, var129, false);
                            continue;
                        }
                        if (var625 == 3302) {
                            var2 -= 2;
                            int var130 = field5618[var2];
                            int var131 = field5618[var2 + 1];
                            field5618[var2++] = class162.method785(false, var130, (byte) 106, var131);
                            continue;
                        }
                        if (var625 == 3303) {
                            var2 -= 2;
                            int var132 = field5618[var2];
                            int var133 = field5618[var2 + 1];
                            field5618[var2++] = class301.method1890(var133, false, var132, -44);
                            continue;
                        }
                        if (var625 == 3304) {
                            var2--;
                            int var134 = field5618[var2];
                            field5618[var2++] = class420.field6055.method2346(117, var134).field5200;
                            continue;
                        }
                        if (var625 == 3305) {
                            var2--;
                            int var135 = field5618[var2];
                            field5618[var2++] = class297.field4434[var135];
                            continue;
                        }
                        if (var625 == 3306) {
                            var2--;
                            int var136 = field5618[var2];
                            field5618[var2++] = class88.field1092[var136];
                            continue;
                        }
                        if (var625 == 3307) {
                            var2--;
                            int var137 = field5618[var2];
                            field5618[var2++] = class207.field2859[var137];
                            continue;
                        }
                        if (var625 == 3308) {
                            byte var138 = class19.field258.field994;
                            int var139 = (class19.field258.field1008 >> 7) + class93.field1163;
                            int var140 = (class19.field258.field1005 >> 7) + class349.field5023;
                            field5618[var2++] = (var138 << 28) + (var139 << 14) + var140;
                            continue;
                        }
                        if (var625 == 3309) {
                            var2--;
                            int var141 = field5618[var2];
                            field5618[var2++] = var141 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var625 == 3310) {
                            var2--;
                            int var142 = field5618[var2];
                            field5618[var2++] = var142 >> 28;
                            continue;
                        }
                        if (var625 == 3311) {
                            var2--;
                            int var143 = field5618[var2];
                            field5618[var2++] = var143 & 0x3FFF;
                            continue;
                        }
                        if (var625 == 3312) {
                            field5618[var2++] = class101.field1234 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3313) {
                            var2 -= 2;
                            int var144 = field5618[var2];
                            int var145 = field5618[var2 + 1];
                            field5618[var2++] = class345.method2092(-64, var144, var145, true);
                            continue;
                        }
                        if (var625 == 3314) {
                            var2 -= 2;
                            int var146 = field5618[var2];
                            int var147 = field5618[var2 + 1];
                            field5618[var2++] = class162.method785(true, var146, (byte) -57, var147);
                            continue;
                        }
                        if (var625 == 3315) {
                            var2 -= 2;
                            int var148 = field5618[var2];
                            int var149 = field5618[var2 + 1];
                            field5618[var2++] = class301.method1890(var149, true, var148, -101);
                            continue;
                        }
                        if (var625 == 3316) {
                            if (class369.field5285 >= 2) {
                                field5618[var2++] = class369.field5285;
                            } else {
                                field5618[var2++] = 0;
                            }
                            continue;
                        }
                        if (var625 == 3317) {
                            field5618[var2++] = class28.field366;
                            continue;
                        }
                        if (var625 == 3318) {
                            field5618[var2++] = class232.field3220;
                            continue;
                        }
                        if (var625 == 3321) {
                            field5618[var2++] = class255.field3551;
                            continue;
                        }
                        if (var625 == 3322) {
                            field5618[var2++] = class42.field514;
                            continue;
                        }
                        if (var625 == 3323) {
                            if (class58.field728 >= 5 && class58.field728 <= 9) {
                                field5618[var2++] = 1;
                                continue;
                            }
                            field5618[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3324) {
                            if (class58.field728 >= 5 && class58.field728 <= 9) {
                                field5618[var2++] = class58.field728;
                                continue;
                            }
                            field5618[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3325) {
                            field5618[var2++] = class18.field238 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3326) {
                            field5618[var2++] = class19.field258.field2726;
                            continue;
                        }
                        if (var625 == 3327) {
                            field5618[var2++] = class19.field258.field2722.field6352 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3328) {
                            field5618[var2++] = class456.field6432 && !class10.field133 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3329) {
                            field5618[var2++] = class392.field5586 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3330) {
                            var2--;
                            int var150 = field5618[var2];
                            field5618[var2++] = class305.method1908(var150, 23924, false);
                            continue;
                        }
                        if (var625 == 3331) {
                            var2 -= 2;
                            int var151 = field5618[var2];
                            int var152 = field5618[var2 + 1];
                            field5618[var2++] = class427.method2546(false, var151, (byte) 85, var152, false);
                            continue;
                        }
                        if (var625 == 3332) {
                            var2 -= 2;
                            int var153 = field5618[var2];
                            int var154 = field5618[var2 + 1];
                            field5618[var2++] = class427.method2546(false, var153, (byte) 85, var154, true);
                            continue;
                        }
                        if (var625 == 3333) {
                            field5618[var2++] = class35.field438;
                            continue;
                        }
                        if (var625 == 3335) {
                            field5618[var2++] = class68.field849;
                            continue;
                        }
                        if (var625 == 3336) {
                            var2 -= 4;
                            int var155 = field5618[var2];
                            int var156 = field5618[var2 + 1];
                            int var157 = field5618[var2 + 2];
                            int var158 = field5618[var2 + 3];
                            int var159 = (var156 << 14) + var155;
                            int var160 = (var157 << 28) + var159;
                            int var161 = var158 + var160;
                            field5618[var2++] = var161;
                            continue;
                        }
                        if (var625 == 3337) {
                            field5618[var2++] = class62.field772;
                            continue;
                        }
                        if (var625 == 3338) {
                            field5618[var2++] = class121.method585(-121);
                            continue;
                        }
                    } else if (var625 < 3500) {
                        if (var625 == 3400) {
                            var2 -= 2;
                            int var162 = field5618[var2];
                            int var163 = field5618[var2 + 1];
                            class64 var164 = class327.field4708.method1889(var162, -121);
                            field5609[var3++] = var164.method335(120, var163);
                            continue;
                        }
                        if (var625 == 3408) {
                            var2 -= 4;
                            int var165 = field5618[var2];
                            int var166 = field5618[var2 + 1];
                            int var167 = field5618[var2 + 2];
                            int var168 = field5618[var2 + 3];
                            class64 var169 = class327.field4708.method1889(var167, -73);
                            if (var169.field810 == var165 && var169.field797 == var166) {
                                if (var166 == 115) {
                                    field5609[var3++] = var169.method335(125, var168);
                                } else {
                                    field5618[var2++] = var169.method332(var168, (byte) -92);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var625 == 3409) {
                            var2 -= 3;
                            int var170 = field5618[var2];
                            int var171 = field5618[var2 + 1];
                            int var172 = field5618[var2 + 2];
                            if (var171 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class64 var173 = class327.field4708.method1889(var171, -42);
                            if (var173.field797 != var170) {
                                throw new RuntimeException("C3409-1");
                            }
                            field5618[var2++] = var173.method333(var172, 6) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3410) {
                            var2--;
                            int var174 = field5618[var2];
                            var3--;
                            String var175 = field5609[var3];
                            if (var174 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class64 var176 = class327.field4708.method1889(var174, -25);
                            if (var176.field797 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            field5618[var2++] = var176.method331(var175, -37) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3411) {
                            var2--;
                            int var177 = field5618[var2];
                            class64 var178 = class327.field4708.method1889(var177, -121);
                            field5618[var2++] = var178.field812.method230(0);
                            continue;
                        }
                    } else if (var625 < 3700) {
                        if (var625 == 3600) {
                            if (class300.field4465 == 0) {
                                field5618[var2++] = -2;
                            } else if (class300.field4465 == 1) {
                                field5618[var2++] = -1;
                            } else {
                                field5618[var2++] = class3.field25;
                            }
                            continue;
                        }
                        if (var625 == 3601) {
                            var2--;
                            int var179 = field5618[var2];
                            if (class300.field4465 == 2 && var179 < class3.field25) {
                                field5609[var3++] = class150.field1823[var179];
                                if (class373.field5335[var179] == null) {
                                    field5609[var3++] = "";
                                } else {
                                    field5609[var3++] = class373.field5335[var179];
                                }
                                continue;
                            }
                            field5609[var3++] = "";
                            field5609[var3++] = "";
                            continue;
                        }
                        if (var625 == 3602) {
                            var2--;
                            int var180 = field5618[var2];
                            if (class300.field4465 == 2 && var180 < class3.field25) {
                                field5618[var2++] = class148.field1800[var180];
                                continue;
                            }
                            field5618[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3603) {
                            var2--;
                            int var181 = field5618[var2];
                            if (class300.field4465 == 2 && var181 < class3.field25) {
                                field5618[var2++] = class388.field5546[var181];
                                continue;
                            }
                            field5618[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3604) {
                            var3--;
                            String var182 = field5609[var3];
                            var2--;
                            int var183 = field5618[var2];
                            class147.method704(var183, var182, (byte) -77);
                            continue;
                        }
                        if (var625 == 3605) {
                            var3--;
                            String var184 = field5609[var3];
                            class10.method69(0, var184);
                            continue;
                        }
                        if (var625 == 3606) {
                            var3--;
                            String var185 = field5609[var3];
                            class337.method2049(var185, -1);
                            continue;
                        }
                        if (var625 == 3607) {
                            var3--;
                            String var186 = field5609[var3];
                            class115.method562(var186, false, (byte) 117);
                            continue;
                        }
                        if (var625 == 3608) {
                            var3--;
                            String var187 = field5609[var3];
                            class275.method1652(var187, (byte) -128);
                            continue;
                        }
                        if (var625 == 3609) {
                            var3--;
                            String var188 = field5609[var3];
                            if (var188.startsWith("<img=0>") || var188.startsWith("<img=1>")) {
                                var188 = var188.substring(7);
                            }
                            field5618[var2++] = class208.method1152(0, var188) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3610) {
                            var2--;
                            int var189 = field5618[var2];
                            if (class300.field4465 == 2 && var189 < class3.field25) {
                                field5609[var3++] = class346.field4939[var189];
                                continue;
                            }
                            field5609[var3++] = "";
                            continue;
                        }
                        if (var625 == 3611) {
                            if (class241.field3315 == null) {
                                field5609[var3++] = "";
                            } else {
                                field5609[var3++] = class73.method377(class241.field3315, -4941);
                            }
                            continue;
                        }
                        if (var625 == 3612) {
                            if (class241.field3315 == null) {
                                field5618[var2++] = 0;
                            } else {
                                field5618[var2++] = class13.field187;
                            }
                            continue;
                        }
                        if (var625 == 3613) {
                            var2--;
                            int var190 = field5618[var2];
                            if (class241.field3315 != null && var190 < class13.field187) {
                                field5609[var3++] = class372.field5331[var190].field3497;
                                continue;
                            }
                            field5609[var3++] = "";
                            continue;
                        }
                        if (var625 == 3614) {
                            var2--;
                            int var191 = field5618[var2];
                            if (class241.field3315 != null && var191 < class13.field187) {
                                field5618[var2++] = class372.field5331[var191].field3495;
                                continue;
                            }
                            field5618[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3615) {
                            var2--;
                            int var192 = field5618[var2];
                            if (class241.field3315 != null && var192 < class13.field187) {
                                field5618[var2++] = class372.field5331[var192].field3494;
                                continue;
                            }
                            field5618[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3616) {
                            field5618[var2++] = class237.field3272;
                            continue;
                        }
                        if (var625 == 3617) {
                            var3--;
                            String var193 = field5609[var3];
                            class415.method2463(var193, (byte) 27);
                            continue;
                        }
                        if (var625 == 3618) {
                            field5618[var2++] = class468.field6580;
                            continue;
                        }
                        if (var625 == 3619) {
                            var3--;
                            String var194 = field5609[var3];
                            class358.method2189((byte) 92, var194);
                            continue;
                        }
                        if (var625 == 3620) {
                            class48.method252(0);
                            continue;
                        }
                        if (var625 == 3621) {
                            if (class300.field4465 == 0) {
                                field5618[var2++] = -1;
                            } else {
                                field5618[var2++] = class414.field5907;
                            }
                            continue;
                        }
                        if (var625 == 3622) {
                            var2--;
                            int var195 = field5618[var2];
                            if (class300.field4465 != 0 && var195 < class414.field5907) {
                                field5609[var3++] = class293.field4361[var195];
                                if (class66.field824[var195] == null) {
                                    field5609[var3++] = "";
                                } else {
                                    field5609[var3++] = class66.field824[var195];
                                }
                                continue;
                            }
                            field5609[var3++] = "";
                            field5609[var3++] = "";
                            continue;
                        }
                        if (var625 == 3623) {
                            var3--;
                            String var196 = field5609[var3];
                            if (var196.startsWith("<img=0>") || var196.startsWith("<img=1>")) {
                                var196 = var196.substring(7);
                            }
                            field5618[var2++] = class127.method603(var196, true) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3624) {
                            var2--;
                            int var197 = field5618[var2];
                            if (class372.field5331 != null && var197 < class13.field187 && class372.field5331[var197].field3500.equalsIgnoreCase(class19.field258.field2736)) {
                                field5618[var2++] = 1;
                                continue;
                            }
                            field5618[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3625) {
                            if (class381.field5399 == null) {
                                field5609[var3++] = "";
                            } else {
                                field5609[var3++] = class381.field5399;
                            }
                            continue;
                        }
                        if (var625 == 3626) {
                            var2--;
                            int var198 = field5618[var2];
                            if (class241.field3315 != null && var198 < class13.field187) {
                                field5609[var3++] = class372.field5331[var198].field3496;
                                continue;
                            }
                            field5609[var3++] = "";
                            continue;
                        }
                        if (var625 == 3627) {
                            var2--;
                            int var199 = field5618[var2];
                            if (class300.field4465 == 2 && var199 >= 0 && var199 < class3.field25) {
                                field5618[var2++] = class311.field4556[var199] ? 1 : 0;
                                continue;
                            }
                            field5618[var2++] = 0;
                            continue;
                        }
                        if (var625 == 3628) {
                            var3--;
                            String var200 = field5609[var3];
                            if (var200.startsWith("<img=0>") || var200.startsWith("<img=1>")) {
                                var200 = var200.substring(7);
                            }
                            field5618[var2++] = class247.method1502(var200, true);
                            continue;
                        }
                        if (var625 == 3629) {
                            field5618[var2++] = class344.field4926;
                            continue;
                        }
                        if (var625 == 3630) {
                            var3--;
                            String var201 = field5609[var3];
                            class115.method562(var201, true, (byte) 118);
                            continue;
                        }
                        if (var625 == 3631) {
                            var2--;
                            int var202 = field5618[var2];
                            field5618[var2++] = class105.field1283[var202] ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3632) {
                            var2--;
                            int var203 = field5618[var2];
                            if (class241.field3315 != null && var203 < class13.field187) {
                                field5609[var3++] = class372.field5331[var203].field3500;
                                continue;
                            }
                            field5609[var3++] = "";
                            continue;
                        }
                        if (var625 == 3633) {
                            var2--;
                            int var204 = field5618[var2];
                            if (class300.field4465 != 0 && var204 < class414.field5907) {
                                field5609[var3++] = class283.field4121[var204];
                                continue;
                            }
                            field5609[var3++] = "";
                            continue;
                        }
                    } else if (var625 < 4000) {
                        if (var625 == 3903) {
                            var2--;
                            int var205 = field5618[var2];
                            field5618[var2++] = class16.field211[var205].method2000(true);
                            continue;
                        }
                        if (var625 == 3904) {
                            var2--;
                            int var206 = field5618[var2];
                            field5618[var2++] = class16.field211[var206].field4737;
                            continue;
                        }
                        if (var625 == 3905) {
                            var2--;
                            int var207 = field5618[var2];
                            field5618[var2++] = class16.field211[var207].field4741;
                            continue;
                        }
                        if (var625 == 3906) {
                            var2--;
                            int var208 = field5618[var2];
                            field5618[var2++] = class16.field211[var208].field4736;
                            continue;
                        }
                        if (var625 == 3907) {
                            var2--;
                            int var209 = field5618[var2];
                            field5618[var2++] = class16.field211[var209].field4746;
                            continue;
                        }
                        if (var625 == 3908) {
                            var2--;
                            int var210 = field5618[var2];
                            field5618[var2++] = class16.field211[var210].field4747;
                            continue;
                        }
                        if (var625 == 3910) {
                            var2--;
                            int var211 = field5618[var2];
                            int var212 = class16.field211[var211].method1996(0);
                            field5618[var2++] = var212 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3911) {
                            var2--;
                            int var213 = field5618[var2];
                            int var214 = class16.field211[var213].method1996(0);
                            field5618[var2++] = var214 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3912) {
                            var2--;
                            int var215 = field5618[var2];
                            int var216 = class16.field211[var215].method1996(0);
                            field5618[var2++] = var216 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 3913) {
                            var2--;
                            int var217 = field5618[var2];
                            int var218 = class16.field211[var217].method1996(0);
                            field5618[var2++] = var218 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var625 < 4100) {
                        if (var625 == 4000) {
                            var2 -= 2;
                            int var219 = field5618[var2];
                            int var220 = field5618[var2 + 1];
                            field5618[var2++] = var219 + var220;
                            continue;
                        }
                        if (var625 == 4001) {
                            var2 -= 2;
                            int var221 = field5618[var2];
                            int var222 = field5618[var2 + 1];
                            field5618[var2++] = var221 - var222;
                            continue;
                        }
                        if (var625 == 4002) {
                            var2 -= 2;
                            int var223 = field5618[var2];
                            int var224 = field5618[var2 + 1];
                            field5618[var2++] = var223 * var224;
                            continue;
                        }
                        if (var625 == 4003) {
                            var2 -= 2;
                            int var225 = field5618[var2];
                            int var226 = field5618[var2 + 1];
                            field5618[var2++] = var225 / var226;
                            continue;
                        }
                        if (var625 == 4004) {
                            var2--;
                            int var227 = field5618[var2];
                            field5618[var2++] = (int) (Math.random() * (double) var227);
                            continue;
                        }
                        if (var625 == 4005) {
                            var2--;
                            int var228 = field5618[var2];
                            field5618[var2++] = (int) (Math.random() * (double) (var228 + 1));
                            continue;
                        }
                        if (var625 == 4006) {
                            var2 -= 5;
                            int var229 = field5618[var2];
                            int var230 = field5618[var2 + 1];
                            int var231 = field5618[var2 + 2];
                            int var232 = field5618[var2 + 3];
                            int var233 = field5618[var2 + 4];
                            field5618[var2++] = (var230 - var229) * (var233 - var231) / (var232 - var231) + var229;
                            continue;
                        }
                        if (var625 == 4007) {
                            var2 -= 2;
                            long var234 = (long) field5618[var2];
                            long var236 = (long) field5618[var2 + 1];
                            field5618[var2++] = (int) (var234 * var236 / 100L + var234);
                            continue;
                        }
                        if (var625 == 4008) {
                            var2 -= 2;
                            int var238 = field5618[var2];
                            int var239 = field5618[var2 + 1];
                            field5618[var2++] = var238 | 0x1 << var239;
                            continue;
                        }
                        if (var625 == 4009) {
                            var2 -= 2;
                            int var240 = field5618[var2];
                            int var241 = field5618[var2 + 1];
                            field5618[var2++] = var240 & -(0x1 << var241) - 1;
                            continue;
                        }
                        if (var625 == 4010) {
                            var2 -= 2;
                            int var242 = field5618[var2];
                            int var243 = field5618[var2 + 1];
                            field5618[var2++] = (var242 & 0x1 << var243) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var625 == 4011) {
                            var2 -= 2;
                            int var244 = field5618[var2];
                            int var245 = field5618[var2 + 1];
                            field5618[var2++] = var244 % var245;
                            continue;
                        }
                        if (var625 == 4012) {
                            var2 -= 2;
                            int var246 = field5618[var2];
                            int var247 = field5618[var2 + 1];
                            if (var246 == 0) {
                                field5618[var2++] = 0;
                            } else {
                                field5618[var2++] = (int) Math.pow((double) var246, (double) var247);
                            }
                            continue;
                        }
                        if (var625 == 4013) {
                            var2 -= 2;
                            int var248 = field5618[var2];
                            int var249 = field5618[var2 + 1];
                            if (var248 == 0) {
                                field5618[var2++] = 0;
                            } else if (var249 == 0) {
                                field5618[var2++] = Integer.MAX_VALUE;
                            } else {
                                field5618[var2++] = (int) Math.pow((double) var248, 1.0D / (double) var249);
                            }
                            continue;
                        }
                        if (var625 == 4014) {
                            var2 -= 2;
                            int var250 = field5618[var2];
                            int var251 = field5618[var2 + 1];
                            field5618[var2++] = var250 & var251;
                            continue;
                        }
                        if (var625 == 4015) {
                            var2 -= 2;
                            int var252 = field5618[var2];
                            int var253 = field5618[var2 + 1];
                            field5618[var2++] = var252 | var253;
                            continue;
                        }
                        if (var625 == 4016) {
                            var2 -= 2;
                            int var254 = field5618[var2];
                            int var255 = field5618[var2 + 1];
                            field5618[var2++] = var254 < var255 ? var254 : var255;
                            continue;
                        }
                        if (var625 == 4017) {
                            var2 -= 2;
                            int var256 = field5618[var2];
                            int var257 = field5618[var2 + 1];
                            field5618[var2++] = var256 > var257 ? var256 : var257;
                            continue;
                        }
                        if (var625 == 4018) {
                            var2 -= 3;
                            long var258 = (long) field5618[var2];
                            long var260 = (long) field5618[var2 + 1];
                            long var262 = (long) field5618[var2 + 2];
                            field5618[var2++] = (int) (var258 * var262 / var260);
                            continue;
                        }
                    } else if (var625 < 4200) {
                        if (var625 == 4100) {
                            var3--;
                            String var264 = field5609[var3];
                            var2--;
                            int var265 = field5618[var2];
                            field5609[var3++] = var264 + var265;
                            continue;
                        }
                        if (var625 == 4101) {
                            var3 -= 2;
                            String var266 = field5609[var3];
                            String var267 = field5609[var3 + 1];
                            field5609[var3++] = var266 + var267;
                            continue;
                        }
                        if (var625 == 4102) {
                            var3--;
                            String var268 = field5609[var3];
                            var2--;
                            int var269 = field5618[var2];
                            field5609[var3++] = var268 + class84.method425(var269, true, -20347);
                            continue;
                        }
                        if (var625 == 4103) {
                            var3--;
                            String var270 = field5609[var3];
                            field5609[var3++] = var270.toLowerCase();
                            continue;
                        }
                        if (var625 == 4104) {
                            var2--;
                            int var271 = field5618[var2];
                            long var272 = ((long) var271 + 11745L) * 86400000L;
                            field5603.setTime(new Date(var272));
                            int var274 = field5603.get(5);
                            int var275 = field5603.get(2);
                            int var276 = field5603.get(1);
                            field5609[var3++] = var274 + "-" + field5626[var275] + "-" + var276;
                            continue;
                        }
                        if (var625 == 4105) {
                            var3 -= 2;
                            String var277 = field5609[var3];
                            String var278 = field5609[var3 + 1];
                            if (class19.field258.field2722 != null && class19.field258.field2722.field6352) {
                                field5609[var3++] = var278;
                                continue;
                            }
                            field5609[var3++] = var277;
                            continue;
                        }
                        if (var625 == 4106) {
                            var2--;
                            int var279 = field5618[var2];
                            field5609[var3++] = Integer.toString(var279);
                            continue;
                        }
                        if (var625 == 4107) {
                            var3 -= 2;
                            field5618[var2++] = class371.method2243(class68.field849, field5609[var3 + 1], (byte) -92, field5609[var3]);
                            continue;
                        }
                        if (var625 == 4108) {
                            var3--;
                            String var280 = field5609[var3];
                            var2 -= 2;
                            int var281 = field5618[var2];
                            int var282 = field5618[var2 + 1];
                            class406 var283 = class144.method681(0, (byte) -69, var282, class39.field470);
                            field5618[var2++] = var283.method2418(class83.field1014, var280, var281, -1);
                            continue;
                        }
                        if (var625 == 4109) {
                            var3--;
                            String var284 = field5609[var3];
                            var2 -= 2;
                            int var285 = field5618[var2];
                            int var286 = field5618[var2 + 1];
                            class406 var287 = class144.method681(0, (byte) -128, var286, class39.field470);
                            field5618[var2++] = var287.method2425((byte) 93, var285, class83.field1014, var284);
                            continue;
                        }
                        if (var625 == 4110) {
                            var3 -= 2;
                            String var288 = field5609[var3];
                            String var289 = field5609[var3 + 1];
                            var2--;
                            if (field5618[var2] == 1) {
                                field5609[var3++] = var288;
                            } else {
                                field5609[var3++] = var289;
                            }
                            continue;
                        }
                        if (var625 == 4111) {
                            var3--;
                            String var290 = field5609[var3];
                            field5609[var3++] = class131.method623(60, var290);
                            continue;
                        }
                        if (var625 == 4112) {
                            var3--;
                            String var291 = field5609[var3];
                            var2--;
                            int var292 = field5618[var2];
                            if (var292 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field5609[var3++] = var291 + (char) var292;
                            continue;
                        }
                        if (var625 == 4113) {
                            var2--;
                            int var293 = field5618[var2];
                            field5618[var2++] = class35.method180((char) var293, (byte) 0) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4114) {
                            var2--;
                            int var294 = field5618[var2];
                            field5618[var2++] = class168.method822((char) var294, 65) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4115) {
                            var2--;
                            int var295 = field5618[var2];
                            field5618[var2++] = class34.method173((byte) -2, (char) var295) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4116) {
                            var2--;
                            int var296 = field5618[var2];
                            field5618[var2++] = class486.method2873(119, (char) var296) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4117) {
                            var3--;
                            String var297 = field5609[var3];
                            if (var297 == null) {
                                field5618[var2++] = 0;
                            } else {
                                field5618[var2++] = var297.length();
                            }
                            continue;
                        }
                        if (var625 == 4118) {
                            var3--;
                            String var298 = field5609[var3];
                            var2 -= 2;
                            int var299 = field5618[var2];
                            int var300 = field5618[var2 + 1];
                            field5609[var3++] = var298.substring(var299, var300);
                            continue;
                        }
                        if (var625 == 4119) {
                            var3--;
                            String var301 = field5609[var3];
                            StringBuffer var302 = new StringBuffer(var301.length());
                            boolean var303 = false;
                            for (int var304 = 0; var304 < var301.length(); var304++) {
                                char var305 = var301.charAt(var304);
                                if (var305 == '<') {
                                    var303 = true;
                                } else if (var305 == '>') {
                                    var303 = false;
                                } else if (!var303) {
                                    var302.append(var305);
                                }
                            }
                            field5609[var3++] = var302.toString();
                            continue;
                        }
                        if (var625 == 4120) {
                            var3--;
                            String var306 = field5609[var3];
                            var2 -= 2;
                            int var307 = field5618[var2];
                            int var308 = field5618[var2 + 1];
                            field5618[var2++] = var306.indexOf(var307, var308);
                            continue;
                        }
                        if (var625 == 4121) {
                            var3 -= 2;
                            String var309 = field5609[var3];
                            String var310 = field5609[var3 + 1];
                            var2--;
                            int var311 = field5618[var2];
                            field5618[var2++] = var309.indexOf(var310, var311);
                            continue;
                        }
                        if (var625 == 4122) {
                            var2--;
                            int var312 = field5618[var2];
                            field5618[var2++] = Character.toLowerCase((char) var312);
                            continue;
                        }
                        if (var625 == 4123) {
                            var2--;
                            int var313 = field5618[var2];
                            field5618[var2++] = Character.toUpperCase((char) var313);
                            continue;
                        }
                        if (var625 == 4124) {
                            var2--;
                            boolean var314 = field5618[var2] != 0;
                            var2--;
                            int var315 = field5618[var2];
                            field5609[var3++] = class328.method1991(false, (long) var315, 0, var314, class68.field849);
                            continue;
                        }
                        if (var625 == 4125) {
                            var3--;
                            String var316 = field5609[var3];
                            var2--;
                            int var317 = field5618[var2];
                            class406 var318 = class144.method681(0, (byte) -89, var317, class39.field470);
                            field5618[var2++] = var318.method2423(class83.field1014, true, var316);
                            continue;
                        }
                    } else if (var625 < 4300) {
                        if (var625 == 4200) {
                            var2--;
                            int var319 = field5618[var2];
                            field5609[var3++] = class422.field6096.method121(var319, -1).field5469;
                            continue;
                        }
                        if (var625 == 4201) {
                            var2 -= 2;
                            int var320 = field5618[var2];
                            int var321 = field5618[var2 + 1];
                            class385 var322 = class422.field6096.method121(var320, -1);
                            if (var321 >= 1 && var321 <= 5 && var322.field5472[var321 - 1] != null) {
                                field5609[var3++] = var322.field5472[var321 - 1];
                                continue;
                            }
                            field5609[var3++] = "";
                            continue;
                        }
                        if (var625 == 4202) {
                            var2 -= 2;
                            int var323 = field5618[var2];
                            int var324 = field5618[var2 + 1];
                            class385 var325 = class422.field6096.method121(var323, -1);
                            if (var324 >= 1 && var324 <= 5 && var325.field5502[var324 - 1] != null) {
                                field5609[var3++] = var325.field5502[var324 - 1];
                                continue;
                            }
                            field5609[var3++] = "";
                            continue;
                        }
                        if (var625 == 4203) {
                            var2--;
                            int var326 = field5618[var2];
                            field5618[var2++] = class422.field6096.method121(var326, -1).field5499;
                            continue;
                        }
                        if (var625 == 4204) {
                            var2--;
                            int var327 = field5618[var2];
                            field5618[var2++] = class422.field6096.method121(var327, -1).field5536 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4205) {
                            var2--;
                            int var328 = field5618[var2];
                            class385 var329 = class422.field6096.method121(var328, -1);
                            if (var329.field5473 == -1 && var329.field5509 >= 0) {
                                field5618[var2++] = var329.field5509;
                                continue;
                            }
                            field5618[var2++] = var328;
                            continue;
                        }
                        if (var625 == 4206) {
                            var2--;
                            int var330 = field5618[var2];
                            class385 var331 = class422.field6096.method121(var330, -1);
                            if (var331.field5473 >= 0 && var331.field5509 >= 0) {
                                field5618[var2++] = var331.field5509;
                                continue;
                            }
                            field5618[var2++] = var330;
                            continue;
                        }
                        if (var625 == 4207) {
                            var2--;
                            int var332 = field5618[var2];
                            field5618[var2++] = class422.field6096.method121(var332, -1).field5462 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 4208) {
                            var2 -= 2;
                            int var333 = field5618[var2];
                            int var334 = field5618[var2 + 1];
                            class307 var335 = class422.field6084.method2076((byte) -122, var334);
                            if (var335.method1915(115)) {
                                field5609[var3++] = class422.field6096.method121(var333, -1).method2320(-1, var334, var335.field4520);
                            } else {
                                field5618[var2++] = class422.field6096.method121(var333, -1).method2327(var334, 83, var335.field4519);
                            }
                            continue;
                        }
                        if (var625 == 4209) {
                            var2 -= 2;
                            int var336 = field5618[var2];
                            int var337 = field5618[var2 + 1] - 1;
                            class385 var338 = class422.field6096.method121(var336, -1);
                            if (var338.field5489 == var337) {
                                field5618[var2++] = var338.field5513;
                            } else if (var338.field5485 == var337) {
                                field5618[var2++] = var338.field5482;
                            } else {
                                field5618[var2++] = -1;
                            }
                            continue;
                        }
                        if (var625 == 4210) {
                            var3--;
                            String var339 = field5609[var3];
                            var2--;
                            int var340 = field5618[var2];
                            class470.method2783(var340 == 1, (byte) 40, var339);
                            field5618[var2++] = class324.field4675;
                            continue;
                        }
                        if (var625 == 4211) {
                            if (class31.field386 != null && class62.field770 < class324.field4675) {
                                field5618[var2++] = class31.field386[class62.field770++] & 0xFFFF;
                                continue;
                            }
                            field5618[var2++] = -1;
                            continue;
                        }
                        if (var625 == 4212) {
                            class62.field770 = 0;
                            continue;
                        }
                    } else if (var625 < 4400) {
                        if (var625 == 4300) {
                            var2 -= 2;
                            int var341 = field5618[var2];
                            int var342 = field5618[var2 + 1];
                            class307 var343 = class422.field6084.method2076((byte) -122, var342);
                            if (var343.method1915(115)) {
                                field5609[var3++] = class390.field5575.method2507((byte) 118, var341).method2823(var342, var343.field4520, 99);
                            } else {
                                field5618[var2++] = class390.field5575.method2507((byte) 52, var341).method2810(var342, var343.field4519, -114);
                            }
                            continue;
                        }
                    } else if (var625 < 4500) {
                        if (var625 == 4400) {
                            var2 -= 2;
                            int var344 = field5618[var2];
                            int var345 = field5618[var2 + 1];
                            class307 var346 = class422.field6084.method2076((byte) -122, var345);
                            if (var346.method1915(115)) {
                                field5609[var3++] = class173.field2084.method2297(50, var344).method2476(var345, var346.field4520, -114);
                            } else {
                                field5618[var2++] = class173.field2084.method2297(50, var344).method2461(var346.field4519, -26795, var345);
                            }
                            continue;
                        }
                    } else if (var625 < 4600) {
                        if (var625 == 4500) {
                            var2 -= 2;
                            int var347 = field5618[var2];
                            int var348 = field5618[var2 + 1];
                            class307 var349 = class422.field6084.method2076((byte) -122, var348);
                            if (var349.method1915(115)) {
                                field5609[var3++] = class64.field811.method661(var347, 26).method1970(var348, (byte) 20, var349.field4520);
                            } else {
                                field5618[var2++] = class64.field811.method661(var347, 26).method1969((byte) 115, var348, var349.field4519);
                            }
                            continue;
                        }
                    } else if (var625 < 4700) {
                        if (var625 == 4600) {
                            var2--;
                            int var350 = field5618[var2];
                            class349 var351 = class415.field6001.method1930(982820868, var350);
                            if (var351.field4984 != null && var351.field4984.length > 0) {
                                int var352 = 0;
                                int var353 = var351.field4980[0];
                                for (int var354 = 1; var354 < var351.field4984.length; var354++) {
                                    if (var351.field4980[var354] > var353) {
                                        var352 = var354;
                                        var353 = var351.field4980[var354];
                                    }
                                }
                                field5618[var2++] = var351.field4984[var352];
                                continue;
                            }
                            field5618[var2++] = var351.field4969;
                            continue;
                        }
                    } else if (var625 < 5100) {
                        if (var625 == 5000) {
                            field5618[var2++] = class148.field1794;
                            continue;
                        }
                        if (var625 == 5001) {
                            var2 -= 3;
                            class148.field1794 = field5618[var2];
                            class39.field468 = field5618[var2 + 1];
                            class382.field5413 = field5618[var2 + 2];
                            field5616++;
                            class244.method1332((byte) -100, class35.field421);
                            class230.field3185.method909(class148.field1794, -1);
                            class230.field3185.method909(class39.field468, -1);
                            class230.field3185.method909(class382.field5413, -1);
                            continue;
                        }
                        if (var625 == 5002) {
                            var3 -= 2;
                            String var355 = field5609[var3];
                            String var356 = field5609[var3 + 1];
                            var2 -= 2;
                            int var357 = field5618[var2];
                            int var358 = field5618[var2 + 1];
                            if (var356 == null) {
                                var356 = "";
                            }
                            if (var356.length() > 80) {
                                var356 = var356.substring(0, 80);
                            }
                            field5605++;
                            class244.method1332((byte) -121, class68.field847);
                            class230.field3185.method909(class183.method995((byte) 23, var355) + class183.method995((byte) 23, var356) + 2, -1);
                            class230.field3185.method935(var355, -90);
                            class230.field3185.method909(var357 - 1, -1);
                            class230.field3185.method909(var358, -1);
                            class230.field3185.method935(var356, 57);
                            continue;
                        }
                        if (var625 == 5003) {
                            var2--;
                            int var359 = field5618[var2];
                            String var360 = null;
                            if (var359 < 100) {
                                var360 = class24.field319[var359];
                            }
                            if (var360 == null) {
                                var360 = "";
                            }
                            field5609[var3++] = var360;
                            continue;
                        }
                        if (var625 == 5004) {
                            var2--;
                            int var361 = field5618[var2];
                            int var362 = -1;
                            if (var361 < 100 && class24.field319[var361] != null) {
                                var362 = class346.field4948[var361];
                            }
                            field5618[var2++] = var362;
                            continue;
                        }
                        if (var625 == 5005) {
                            field5618[var2++] = class39.field468;
                            continue;
                        }
                        if (var625 == 5008) {
                            var3--;
                            String var363 = field5609[var3];
                            if (class369.field5285 == 0 && (class456.field6432 && !class10.field133 || class392.field5586)) {
                                continue;
                            }
                            String var364 = var363.toLowerCase();
                            byte var365 = 0;
                            if (var364.startsWith(class485.field6871.method205((byte) 102, 0))) {
                                var365 = 0;
                                var363 = var363.substring(class485.field6871.method205((byte) 115, 0).length());
                            } else if (var364.startsWith(class463.field6527.method205((byte) 106, 0))) {
                                var365 = 1;
                                var363 = var363.substring(class463.field6527.method205((byte) 112, 0).length());
                            } else if (var364.startsWith(class106.field1294.method205((byte) 99, 0))) {
                                var365 = 2;
                                var363 = var363.substring(class106.field1294.method205((byte) 119, 0).length());
                            } else if (var364.startsWith(class239.field3290.method205((byte) 127, 0))) {
                                var365 = 3;
                                var363 = var363.substring(class239.field3290.method205((byte) 110, 0).length());
                            } else if (var364.startsWith(class237.field3276.method205((byte) 116, 0))) {
                                var365 = 4;
                                var363 = var363.substring(class237.field3276.method205((byte) 124, 0).length());
                            } else if (var364.startsWith(class215.field2962.method205((byte) 118, 0))) {
                                var365 = 5;
                                var363 = var363.substring(class215.field2962.method205((byte) 127, 0).length());
                            } else if (var364.startsWith(class450.field6371.method205((byte) 122, 0))) {
                                var365 = 6;
                                var363 = var363.substring(class450.field6371.method205((byte) 103, 0).length());
                            } else if (var364.startsWith(class60.field752.method205((byte) 119, 0))) {
                                var365 = 7;
                                var363 = var363.substring(class60.field752.method205((byte) 120, 0).length());
                            } else if (var364.startsWith(class471.field6641.method205((byte) 107, 0))) {
                                var365 = 8;
                                var363 = var363.substring(class471.field6641.method205((byte) 113, 0).length());
                            } else if (var364.startsWith(class335.field4835.method205((byte) 106, 0))) {
                                var365 = 9;
                                var363 = var363.substring(class335.field4835.method205((byte) 122, 0).length());
                            } else if (var364.startsWith(class241.field3312.method205((byte) 118, 0))) {
                                var365 = 10;
                                var363 = var363.substring(class241.field3312.method205((byte) 103, 0).length());
                            } else if (var364.startsWith(class150.field1812.method205((byte) 114, 0))) {
                                var365 = 11;
                                var363 = var363.substring(class150.field1812.method205((byte) 126, 0).length());
                            } else if (class68.field849 != 0) {
                                if (var364.startsWith(class485.field6871.method205((byte) 106, class68.field849))) {
                                    var365 = 0;
                                    var363 = var363.substring(class485.field6871.method205((byte) 108, class68.field849).length());
                                } else if (var364.startsWith(class463.field6527.method205((byte) 106, class68.field849))) {
                                    var365 = 1;
                                    var363 = var363.substring(class463.field6527.method205((byte) 112, class68.field849).length());
                                } else if (var364.startsWith(class106.field1294.method205((byte) 119, class68.field849))) {
                                    var365 = 2;
                                    var363 = var363.substring(class106.field1294.method205((byte) 110, class68.field849).length());
                                } else if (var364.startsWith(class239.field3290.method205((byte) 121, class68.field849))) {
                                    var365 = 3;
                                    var363 = var363.substring(class239.field3290.method205((byte) 115, class68.field849).length());
                                } else if (var364.startsWith(class237.field3276.method205((byte) 104, class68.field849))) {
                                    var365 = 4;
                                    var363 = var363.substring(class237.field3276.method205((byte) 126, class68.field849).length());
                                } else if (var364.startsWith(class215.field2962.method205((byte) 99, class68.field849))) {
                                    var365 = 5;
                                    var363 = var363.substring(class215.field2962.method205((byte) 112, class68.field849).length());
                                } else if (var364.startsWith(class450.field6371.method205((byte) 109, class68.field849))) {
                                    var365 = 6;
                                    var363 = var363.substring(class450.field6371.method205((byte) 123, class68.field849).length());
                                } else if (var364.startsWith(class60.field752.method205((byte) 103, class68.field849))) {
                                    var365 = 7;
                                    var363 = var363.substring(class60.field752.method205((byte) 115, class68.field849).length());
                                } else if (var364.startsWith(class471.field6641.method205((byte) 107, class68.field849))) {
                                    var365 = 8;
                                    var363 = var363.substring(class471.field6641.method205((byte) 114, class68.field849).length());
                                } else if (var364.startsWith(class335.field4835.method205((byte) 117, class68.field849))) {
                                    var365 = 9;
                                    var363 = var363.substring(class335.field4835.method205((byte) 102, class68.field849).length());
                                } else if (var364.startsWith(class241.field3312.method205((byte) 120, class68.field849))) {
                                    var365 = 10;
                                    var363 = var363.substring(class241.field3312.method205((byte) 119, class68.field849).length());
                                } else if (var364.startsWith(class150.field1812.method205((byte) 124, class68.field849))) {
                                    var365 = 11;
                                    var363 = var363.substring(class150.field1812.method205((byte) 114, class68.field849).length());
                                }
                            }
                            String var366 = var363.toLowerCase();
                            byte var367 = 0;
                            if (var366.startsWith(class129.field1591.method205((byte) 125, 0))) {
                                var367 = 1;
                                var363 = var363.substring(class129.field1591.method205((byte) 108, 0).length());
                            } else if (var366.startsWith(class196.field2708.method205((byte) 108, 0))) {
                                var367 = 2;
                                var363 = var363.substring(class196.field2708.method205((byte) 123, 0).length());
                            } else if (var366.startsWith(class385.field5459.method205((byte) 111, 0))) {
                                var367 = 3;
                                var363 = var363.substring(class385.field5459.method205((byte) 111, 0).length());
                            } else if (var366.startsWith(class315.field4600.method205((byte) 119, 0))) {
                                var367 = 4;
                                var363 = var363.substring(class315.field4600.method205((byte) 113, 0).length());
                            } else if (var366.startsWith(class363.field5222.method205((byte) 126, 0))) {
                                var367 = 5;
                                var363 = var363.substring(class363.field5222.method205((byte) 119, 0).length());
                            } else if (class68.field849 != 0) {
                                if (var366.startsWith(class129.field1591.method205((byte) 116, class68.field849))) {
                                    var367 = 1;
                                    var363 = var363.substring(class129.field1591.method205((byte) 126, class68.field849).length());
                                } else if (var366.startsWith(class196.field2708.method205((byte) 108, class68.field849))) {
                                    var367 = 2;
                                    var363 = var363.substring(class196.field2708.method205((byte) 117, class68.field849).length());
                                } else if (var366.startsWith(class385.field5459.method205((byte) 124, class68.field849))) {
                                    var367 = 3;
                                    var363 = var363.substring(class385.field5459.method205((byte) 105, class68.field849).length());
                                } else if (var366.startsWith(class315.field4600.method205((byte) 114, class68.field849))) {
                                    var367 = 4;
                                    var363 = var363.substring(class315.field4600.method205((byte) 102, class68.field849).length());
                                } else if (var366.startsWith(class363.field5222.method205((byte) 123, class68.field849))) {
                                    var367 = 5;
                                    var363 = var363.substring(class363.field5222.method205((byte) 101, class68.field849).length());
                                }
                            }
                            field5621++;
                            class244.method1332((byte) -78, class314.field4573);
                            class230.field3185.method909(0, -1);
                            int var368 = class230.field3185.field2206;
                            class230.field3185.method909(var365, -1);
                            class230.field3185.method909(var367, -1);
                            class487.method2878(class230.field3185, 0, var363);
                            class230.field3185.method890(class230.field3185.field2206 - var368, -37);
                            continue;
                        }
                        if (var625 == 5009) {
                            var3 -= 2;
                            String var369 = field5609[var3];
                            String var370 = field5609[var3 + 1];
                            if (class369.field5285 != 0 || (!class456.field6432 || class10.field133) && !class392.field5586) {
                                field5604++;
                                class244.method1332((byte) -40, class156.field1866);
                                class230.field3185.method909(0, -1);
                                int var371 = class230.field3185.field2206;
                                class230.field3185.method935(var369, -88);
                                class487.method2878(class230.field3185, 0, var370);
                                class230.field3185.method890(class230.field3185.field2206 - var371, -118);
                            }
                            continue;
                        }
                        if (var625 == 5010) {
                            var2--;
                            int var372 = field5618[var2];
                            String var373 = null;
                            if (var372 < 100) {
                                var373 = class86.field1062[var372];
                            }
                            if (var373 == null) {
                                var373 = "";
                            }
                            field5609[var3++] = var373;
                            continue;
                        }
                        if (var625 == 5011) {
                            var2--;
                            int var374 = field5618[var2];
                            String var375 = null;
                            if (var374 < 100) {
                                var375 = class257.field3720[var374];
                            }
                            if (var375 == null) {
                                var375 = "";
                            }
                            field5609[var3++] = var375;
                            continue;
                        }
                        if (var625 == 5012) {
                            var2--;
                            int var376 = field5618[var2];
                            int var377 = -1;
                            if (var376 < 100) {
                                var377 = class314.field4587[var376];
                            }
                            field5618[var2++] = var377;
                            continue;
                        }
                        if (var625 == 5015) {
                            String var378;
                            if (class19.field258 == null || class19.field258.field2730 == null) {
                                var378 = class85.field1050;
                            } else {
                                var378 = class19.field258.method1084(true, 26);
                            }
                            field5609[var3++] = var378;
                            continue;
                        }
                        if (var625 == 5016) {
                            field5618[var2++] = class382.field5413;
                            continue;
                        }
                        if (var625 == 5017) {
                            field5618[var2++] = class154.field1859;
                            continue;
                        }
                        if (var625 == 5018) {
                            var2--;
                            int var379 = field5618[var2];
                            int var380 = 0;
                            if (var379 < 100 && class24.field319[var379] != null) {
                                var380 = class346.field4948[var379];
                            }
                            field5618[var2++] = var380;
                            continue;
                        }
                        if (var625 == 5019) {
                            var2--;
                            int var381 = field5618[var2];
                            String var382 = null;
                            if (var381 < 100) {
                                var382 = class397.field5649[var381];
                            }
                            if (var382 == null) {
                                var382 = "";
                            }
                            field5609[var3++] = var382;
                            continue;
                        }
                        if (var625 == 5020) {
                            String var383;
                            if (class19.field258 == null || class19.field258.field2730 == null) {
                                var383 = class85.field1050;
                            } else {
                                var383 = class19.field258.method1085(-104, false);
                            }
                            field5609[var3++] = var383;
                            continue;
                        }
                        if (var625 == 5050) {
                            var2--;
                            int var384 = field5618[var2];
                            field5609[var3++] = class16.method106((byte) -38, var384).field456;
                            continue;
                        }
                        if (var625 == 5051) {
                            var2--;
                            int var385 = field5618[var2];
                            class37 var386 = class16.method106((byte) -38, var385);
                            if (var386.field452 == null) {
                                field5618[var2++] = 0;
                            } else {
                                field5618[var2++] = var386.field452.length;
                            }
                            continue;
                        }
                        if (var625 == 5052) {
                            var2 -= 2;
                            int var387 = field5618[var2];
                            int var388 = field5618[var2 + 1];
                            class37 var389 = class16.method106((byte) -38, var387);
                            int var390 = var389.field452[var388];
                            field5618[var2++] = var390;
                            continue;
                        }
                        if (var625 == 5053) {
                            var2--;
                            int var391 = field5618[var2];
                            class37 var392 = class16.method106((byte) -38, var391);
                            if (var392.field457 == null) {
                                field5618[var2++] = 0;
                            } else {
                                field5618[var2++] = var392.field457.length;
                            }
                            continue;
                        }
                        if (var625 == 5054) {
                            var2 -= 2;
                            int var393 = field5618[var2];
                            int var394 = field5618[var2 + 1];
                            field5618[var2++] = class16.method106((byte) -38, var393).field457[var394];
                            continue;
                        }
                        if (var625 == 5055) {
                            var2--;
                            int var395 = field5618[var2];
                            field5609[var3++] = class276.method1683(21010, var395).method164(false);
                            continue;
                        }
                        if (var625 == 5056) {
                            var2--;
                            int var396 = field5618[var2];
                            class32 var397 = class276.method1683(21010, var396);
                            if (var397.field397 == null) {
                                field5618[var2++] = 0;
                            } else {
                                field5618[var2++] = var397.field397.length;
                            }
                            continue;
                        }
                        if (var625 == 5057) {
                            var2 -= 2;
                            int var398 = field5618[var2];
                            int var399 = field5618[var2 + 1];
                            field5618[var2++] = class276.method1683(21010, var398).field397[var399];
                            continue;
                        }
                        if (var625 == 5058) {
                            field5613 = new class257();
                            var2--;
                            field5613.field3713 = field5618[var2];
                            field5613.field3717 = class276.method1683(21010, field5613.field3713);
                            field5613.field3712 = new int[field5613.field3717.method168(0)];
                            continue;
                        }
                        if (var625 == 5059) {
                            field5620++;
                            class244.method1332((byte) 126, class99.field1215);
                            class230.field3185.method909(0, -1);
                            int var400 = class230.field3185.field2206;
                            class230.field3185.method909(0, -1);
                            class230.field3185.method884(field5613.field3713, true);
                            field5613.field3717.method161(true, field5613.field3712, class230.field3185);
                            class230.field3185.method890(class230.field3185.field2206 - var400, 105);
                            continue;
                        }
                        if (var625 == 5060) {
                            var3--;
                            String var401 = field5609[var3];
                            field5606++;
                            class244.method1332((byte) -76, class476.field6717);
                            class230.field3185.method909(0, -1);
                            int var402 = class230.field3185.field2206;
                            class230.field3185.method935(var401, 58);
                            class230.field3185.method884(field5613.field3713, true);
                            field5613.field3717.method161(true, field5613.field3712, class230.field3185);
                            class230.field3185.method890(class230.field3185.field2206 - var402, 127);
                            continue;
                        }
                        if (var625 == 5061) {
                            field5620++;
                            class244.method1332((byte) -127, class99.field1215);
                            class230.field3185.method909(0, -1);
                            int var403 = class230.field3185.field2206;
                            class230.field3185.method909(1, -1);
                            class230.field3185.method884(field5613.field3713, true);
                            field5613.field3717.method161(true, field5613.field3712, class230.field3185);
                            class230.field3185.method890(class230.field3185.field2206 - var403, 126);
                            continue;
                        }
                        if (var625 == 5062) {
                            var2 -= 2;
                            int var404 = field5618[var2];
                            int var405 = field5618[var2 + 1];
                            field5618[var2++] = class16.method106((byte) -38, var404).field453[var405];
                            continue;
                        }
                        if (var625 == 5063) {
                            var2 -= 2;
                            int var406 = field5618[var2];
                            int var407 = field5618[var2 + 1];
                            field5618[var2++] = class16.method106((byte) -38, var406).field455[var407];
                            continue;
                        }
                        if (var625 == 5064) {
                            var2 -= 2;
                            int var408 = field5618[var2];
                            int var409 = field5618[var2 + 1];
                            if (var409 == -1) {
                                field5618[var2++] = -1;
                            } else {
                                field5618[var2++] = class16.method106((byte) -38, var408).method195((byte) -90, (char) var409);
                            }
                            continue;
                        }
                        if (var625 == 5065) {
                            var2 -= 2;
                            int var410 = field5618[var2];
                            int var411 = field5618[var2 + 1];
                            if (var411 == -1) {
                                field5618[var2++] = -1;
                            } else {
                                field5618[var2++] = class16.method106((byte) -38, var410).method191((byte) -128, (char) var411);
                            }
                            continue;
                        }
                        if (var625 == 5066) {
                            var2--;
                            int var412 = field5618[var2];
                            field5618[var2++] = class276.method1683(21010, var412).method168(0);
                            continue;
                        }
                        if (var625 == 5067) {
                            var2 -= 2;
                            int var413 = field5618[var2];
                            int var414 = field5618[var2 + 1];
                            int var415 = class276.method1683(21010, var413).method165(7789, var414);
                            field5618[var2++] = var415;
                            continue;
                        }
                        if (var625 == 5068) {
                            var2 -= 2;
                            int var416 = field5618[var2];
                            int var417 = field5618[var2 + 1];
                            field5613.field3712[var416] = var417;
                            continue;
                        }
                        if (var625 == 5069) {
                            var2 -= 2;
                            int var418 = field5618[var2];
                            int var419 = field5618[var2 + 1];
                            field5613.field3712[var418] = var419;
                            continue;
                        }
                        if (var625 == 5070) {
                            var2 -= 3;
                            int var420 = field5618[var2];
                            int var421 = field5618[var2 + 1];
                            int var422 = field5618[var2 + 2];
                            class32 var423 = class276.method1683(21010, var420);
                            if (var423.method165(7789, var421) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            field5618[var2++] = var423.method167(0, var421, var422);
                            continue;
                        }
                        if (var625 == 5071) {
                            var3--;
                            String var424 = field5609[var3];
                            var2--;
                            boolean var425 = field5618[var2] == 1;
                            class86.method438(var424, -12, var425);
                            field5618[var2++] = class324.field4675;
                            continue;
                        }
                        if (var625 == 5072) {
                            if (class31.field386 != null && class62.field770 < class324.field4675) {
                                field5618[var2++] = class31.field386[class62.field770++] & 0xFFFF;
                                continue;
                            }
                            field5618[var2++] = -1;
                            continue;
                        }
                        if (var625 == 5073) {
                            class62.field770 = 0;
                            continue;
                        }
                    } else if (var625 < 5200) {
                        if (var625 == 5100) {
                            if (class308.field4529.method1689((byte) -118, 86)) {
                                field5618[var2++] = 1;
                            } else {
                                field5618[var2++] = 0;
                            }
                            continue;
                        }
                        if (var625 == 5101) {
                            if (class308.field4529.method1689((byte) -118, 82)) {
                                field5618[var2++] = 1;
                            } else {
                                field5618[var2++] = 0;
                            }
                            continue;
                        }
                        if (var625 == 5102) {
                            if (class308.field4529.method1689((byte) -118, 81)) {
                                field5618[var2++] = 1;
                            } else {
                                field5618[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var625 < 5300) {
                        if (var625 == 5200) {
                            var2--;
                            class61.method313((byte) -107, field5618[var2]);
                            continue;
                        }
                        if (var625 == 5201) {
                            field5618[var2++] = class482.method2846(96);
                            continue;
                        }
                        if (var625 == 5205) {
                            var2--;
                            class281.method1770(field5618[var2], -1, -1, (byte) 18, false);
                            continue;
                        }
                        if (var625 == 5206) {
                            var2--;
                            int var426 = field5618[var2];
                            class227 var427 = class429.method2570(var426 >> 14 & 0x3FFF, var426 & 0x3FFF);
                            if (var427 == null) {
                                field5618[var2++] = -1;
                            } else {
                                field5618[var2++] = var427.field3155;
                            }
                            continue;
                        }
                        if (var625 == 5207) {
                            var2--;
                            class227 var428 = class429.method2561(field5618[var2]);
                            if (var428 != null && var428.field3156 != null) {
                                field5609[var3++] = var428.field3156;
                                continue;
                            }
                            field5609[var3++] = "";
                            continue;
                        }
                        if (var625 == 5208) {
                            field5618[var2++] = class247.field3481;
                            field5618[var2++] = class158.field1892;
                            continue;
                        }
                        if (var625 == 5209) {
                            field5618[var2++] = class486.field6898 + class429.field6205;
                            field5618[var2++] = class429.field6210 + class17.field218;
                            continue;
                        }
                        if (var625 == 5210) {
                            var2--;
                            int var429 = field5618[var2];
                            class227 var430 = class429.method2561(var429);
                            if (var430 == null) {
                                field5618[var2++] = 0;
                                field5618[var2++] = 0;
                            } else {
                                field5618[var2++] = var430.field3151 >> 14 & 0x3FFF;
                                field5618[var2++] = var430.field3151 & 0x3FFF;
                            }
                            continue;
                        }
                        if (var625 == 5211) {
                            var2--;
                            int var431 = field5618[var2];
                            class227 var432 = class429.method2561(var431);
                            if (var432 == null) {
                                field5618[var2++] = 0;
                                field5618[var2++] = 0;
                            } else {
                                field5618[var2++] = var432.field3152 - var432.field3149;
                                field5618[var2++] = var432.field3157 - var432.field3150;
                            }
                            continue;
                        }
                        if (var625 == 5212) {
                            class21 var433 = class366.method2215(-1);
                            if (var433 == null) {
                                field5618[var2++] = -1;
                                field5618[var2++] = -1;
                            } else {
                                field5618[var2++] = var433.field295;
                                int var434 = var433.field288 << 28 | class429.field6205 + var433.field296 << 14 | class429.field6210 + var433.field289;
                                field5618[var2++] = var434;
                            }
                            continue;
                        }
                        if (var625 == 5213) {
                            class21 var435 = class299.method1883((byte) 88);
                            if (var435 == null) {
                                field5618[var2++] = -1;
                                field5618[var2++] = -1;
                            } else {
                                field5618[var2++] = var435.field295;
                                int var436 = var435.field288 << 28 | class429.field6205 + var435.field296 << 14 | class429.field6210 + var435.field289;
                                field5618[var2++] = var436;
                            }
                            continue;
                        }
                        if (var625 == 5214) {
                            var2--;
                            int var437 = field5618[var2];
                            class227 var438 = class113.method546((byte) -15);
                            if (var438 != null) {
                                boolean var439 = var438.method1251(27513, var437 & 0x3FFF, field5625, var437 >> 14 & 0x3FFF, var437 >> 28 & 0x3);
                                if (var439) {
                                    class283.method1778(14943, field5625[2], field5625[1]);
                                }
                            }
                            continue;
                        }
                        if (var625 == 5215) {
                            var2 -= 2;
                            int var440 = field5618[var2];
                            int var441 = field5618[var2 + 1];
                            class485 var442 = class429.method2574(var440 >> 14 & 0x3FFF, var440 & 0x3FFF);
                            boolean var443 = false;
                            for (class227 var444 = (class227) var442.method2862(2); var444 != null; var444 = (class227) var442.method2869(true)) {
                                if (var444.field3155 == var441) {
                                    var443 = true;
                                    break;
                                }
                            }
                            if (var443) {
                                field5618[var2++] = 1;
                            } else {
                                field5618[var2++] = 0;
                            }
                            continue;
                        }
                        if (var625 == 5218) {
                            var2--;
                            int var445 = field5618[var2];
                            class227 var446 = class429.method2561(var445);
                            if (var446 == null) {
                                field5618[var2++] = -1;
                            } else {
                                field5618[var2++] = var446.field3148;
                            }
                            continue;
                        }
                        if (var625 == 5220) {
                            field5618[var2++] = class403.field5733 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 5221) {
                            var2--;
                            int var447 = field5618[var2];
                            class283.method1778(14943, var447 & 0x3FFF, var447 >> 14 & 0x3FFF);
                            continue;
                        }
                        if (var625 == 5222) {
                            class227 var448 = class113.method546((byte) -84);
                            if (var448 == null) {
                                field5618[var2++] = -1;
                                field5618[var2++] = -1;
                            } else {
                                boolean var449 = var448.method1255(field5625, class429.field6210 + class17.field218, -102, class486.field6898 + class429.field6205);
                                if (var449) {
                                    field5618[var2++] = field5625[1];
                                    field5618[var2++] = field5625[2];
                                } else {
                                    field5618[var2++] = -1;
                                    field5618[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var625 == 5223) {
                            var2 -= 2;
                            int var450 = field5618[var2];
                            int var451 = field5618[var2 + 1];
                            class281.method1770(var450, var451 >> 14 & 0x3FFF, var451 & 0x3FFF, (byte) 18, false);
                            continue;
                        }
                        if (var625 == 5224) {
                            var2--;
                            int var452 = field5618[var2];
                            class227 var453 = class113.method546((byte) -8);
                            if (var453 == null) {
                                field5618[var2++] = -1;
                                field5618[var2++] = -1;
                            } else {
                                boolean var454 = var453.method1251(27513, var452 & 0x3FFF, field5625, var452 >> 14 & 0x3FFF, var452 >> 28 & 0x3);
                                if (var454) {
                                    field5618[var2++] = field5625[1];
                                    field5618[var2++] = field5625[2];
                                } else {
                                    field5618[var2++] = -1;
                                    field5618[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var625 == 5225) {
                            var2--;
                            int var455 = field5618[var2];
                            class227 var456 = class113.method546((byte) 125);
                            if (var456 == null) {
                                field5618[var2++] = -1;
                                field5618[var2++] = -1;
                            } else {
                                boolean var457 = var456.method1255(field5625, var455 & 0x3FFF, -102, var455 >> 14 & 0x3FFF);
                                if (var457) {
                                    field5618[var2++] = field5625[1];
                                    field5618[var2++] = field5625[2];
                                } else {
                                    field5618[var2++] = -1;
                                    field5618[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var625 == 5226) {
                            var2--;
                            class470.method2771(field5618[var2], (byte) -26);
                            continue;
                        }
                        if (var625 == 5227) {
                            var2 -= 2;
                            int var458 = field5618[var2];
                            int var459 = field5618[var2 + 1];
                            class281.method1770(var458, var459 >> 14 & 0x3FFF, var459 & 0x3FFF, (byte) 18, true);
                            continue;
                        }
                        if (var625 == 5228) {
                            var2--;
                            class187.field2525 = field5618[var2] == 1;
                            continue;
                        }
                        if (var625 == 5229) {
                            field5618[var2++] = class187.field2525 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 5230) {
                            var2--;
                            int var460 = field5618[var2];
                            class216.method1211(var460, (byte) 126);
                            continue;
                        }
                        if (var625 == 5231) {
                            var2 -= 2;
                            int var461 = field5618[var2];
                            boolean var462 = field5618[var2 + 1] == 1;
                            if (class414.field5910 == null) {
                                continue;
                            }
                            class147 var463 = class414.field5910.method233(75, (long) var461);
                            if (var463 != null && !var462) {
                                var463.method702((byte) -114);
                                continue;
                            }
                            if (var463 == null && var462) {
                                class147 var464 = new class147();
                                class414.field5910.method234(-73, (long) var461, var464);
                            }
                            continue;
                        }
                        if (var625 == 5232) {
                            var2--;
                            int var465 = field5618[var2];
                            if (class414.field5910 == null) {
                                field5618[var2++] = 0;
                            } else {
                                class147 var466 = class414.field5910.method233(-80, (long) var465);
                                field5618[var2++] = var466 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var625 == 5233) {
                            var2 -= 2;
                            int var467 = field5618[var2];
                            boolean var468 = field5618[var2 + 1] == 1;
                            if (class282.field4112 == null) {
                                continue;
                            }
                            class147 var469 = class282.field4112.method233(-61, (long) var467);
                            if (var469 != null && !var468) {
                                var469.method702((byte) -114);
                                continue;
                            }
                            if (var469 == null && var468) {
                                class147 var470 = new class147();
                                class282.field4112.method234(-76, (long) var467, var470);
                            }
                            continue;
                        }
                        if (var625 == 5234) {
                            var2--;
                            int var471 = field5618[var2];
                            if (class282.field4112 == null) {
                                field5618[var2++] = 0;
                            } else {
                                class147 var472 = class282.field4112.method233(93, (long) var471);
                                field5618[var2++] = var472 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var625 == 5235) {
                            field5618[var2++] = class429.field6185 == null ? -1 : class429.field6185.field3155;
                            continue;
                        }
                    } else if (var625 < 5400) {
                        if (var625 == 5300) {
                            var2 -= 2;
                            int var473 = field5618[var2];
                            int var474 = field5618[var2 + 1];
                            class445.method2620(var473, 3, false, -4, var474);
                            field5618[var2++] = class348.field4961 == null ? 0 : 1;
                            continue;
                        }
                        if (var625 == 5301) {
                            if (class348.field4961 != null) {
                                class445.method2620(-1, class262.field3766, false, -4, -1);
                            }
                            continue;
                        }
                        if (var625 == 5302) {
                            class159[] var475 = class110.method527(4576);
                            field5618[var2++] = var475.length;
                            continue;
                        }
                        if (var625 == 5303) {
                            var2--;
                            int var476 = field5618[var2];
                            class159[] var477 = class110.method527(4576);
                            field5618[var2++] = var477[var476].field1902;
                            field5618[var2++] = var477[var476].field1905;
                            continue;
                        }
                        if (var625 == 5305) {
                            int var478 = class282.field4111;
                            int var479 = class92.field1143;
                            int var480 = -1;
                            class159[] var481 = class110.method527(4576);
                            for (int var482 = 0; var482 < var481.length; var482++) {
                                class159 var483 = var481[var482];
                                if (var483.field1902 == var478 && var483.field1905 == var479) {
                                    var480 = var482;
                                    break;
                                }
                            }
                            field5618[var2++] = var480;
                            continue;
                        }
                        if (var625 == 5306) {
                            field5618[var2++] = class71.method366(103);
                            continue;
                        }
                        if (var625 == 5307) {
                            var2--;
                            int var484 = field5618[var2];
                            if (var484 >= 1 && var484 <= 2) {
                                class445.method2620(-1, var484, false, -4, -1);
                            }
                            continue;
                        }
                        if (var625 == 5308) {
                            field5618[var2++] = class262.field3766;
                            continue;
                        }
                        if (var625 == 5309) {
                            var2--;
                            int var485 = field5618[var2];
                            if (var485 >= 1 && var485 <= 2) {
                                class262.field3766 = var485;
                                class120.method582(-2, class42.field512);
                            }
                            continue;
                        }
                    } else if (var625 < 5500) {
                        if (var625 == 5400) {
                            var3 -= 2;
                            String var486 = field5609[var3];
                            String var487 = field5609[var3 + 1];
                            var2--;
                            int var488 = field5618[var2];
                            field5623++;
                            class244.method1332((byte) -7, class196.field2683);
                            class230.field3185.method909(class183.method995((byte) 23, var486) + class183.method995((byte) 23, var487) + 1, -1);
                            class230.field3185.method935(var486, 39);
                            class230.field3185.method935(var487, 112);
                            class230.field3185.method909(var488, -1);
                            continue;
                        }
                        if (var625 == 5401) {
                            var2 -= 2;
                            class210.field2903[field5618[var2]] = (short) class154.method746(field5618[var2 + 1], (byte) -127);
                            class422.field6096.method119((byte) -128);
                            class422.field6096.method117(0);
                            class390.field5575.method2499(1631);
                            class415.method2469((byte) 121);
                            continue;
                        }
                        if (var625 == 5405) {
                            var2 -= 2;
                            int var489 = field5618[var2];
                            int var490 = field5618[var2 + 1];
                            if (var489 >= 0 && var489 < 2) {
                                class490.field6929[var489] = new int[var490 << 1][4];
                            }
                            continue;
                        }
                        if (var625 == 5406) {
                            var2 -= 7;
                            int var491 = field5618[var2];
                            int var492 = field5618[var2 + 1] << 1;
                            int var493 = field5618[var2 + 2];
                            int var494 = field5618[var2 + 3];
                            int var495 = field5618[var2 + 4];
                            int var496 = field5618[var2 + 5];
                            int var497 = field5618[var2 + 6];
                            if (var491 >= 0 && var491 < 2 && class490.field6929[var491] != null && var492 >= 0 && var492 < class490.field6929[var491].length) {
                                class490.field6929[var491][var492] = new int[] { (var493 >> 14 & 0x3FFF) * 128, var494, (var493 & 0x3FFF) * 128, var497 };
                                class490.field6929[var491][var492 + 1] = new int[] { (var495 >> 14 & 0x3FFF) * 128, var496, (var495 & 0x3FFF) * 128 };
                            }
                            continue;
                        }
                        if (var625 == 5407) {
                            var2--;
                            int var498 = class490.field6929[field5618[var2]].length >> 1;
                            field5618[var2++] = var498;
                            continue;
                        }
                        if (var625 == 5411) {
                            if (class348.field4961 != null) {
                                class445.method2620(-1, class262.field3766, false, -4, -1);
                            }
                            if (class41.field500 == null) {
                                String var499 = class89.field1117 == null ? class157.method755((byte) -34) : class89.field1117;
                                class290.method1827(class375.field5347 == 1, var499, 1, class42.field512, false);
                            } else {
                                class451.method2641((byte) 41);
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var625 == 5419) {
                            String var500 = "";
                            if (class169.field2005 != null) {
                                if (class169.field2005.field5755 == null) {
                                    var500 = class10.method79(77, class169.field2005.field5757);
                                } else {
                                    var500 = (String) class169.field2005.field5755;
                                }
                            }
                            field5609[var3++] = var500;
                            continue;
                        }
                        if (var625 == 5420) {
                            field5618[var2++] = class355.field5092 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 5421) {
                            if (class348.field4961 != null) {
                                class445.method2620(-1, class262.field3766, false, -4, -1);
                            }
                            var3--;
                            String var501 = field5609[var3];
                            var2--;
                            boolean var502 = field5618[var2] == 1;
                            String var503 = class157.method755((byte) -34) + var501;
                            class290.method1827(class375.field5347 == 1, var503, 1, class42.field512, var502);
                            continue;
                        }
                        if (var625 == 5422) {
                            var3 -= 2;
                            String var504 = field5609[var3];
                            String var505 = field5609[var3 + 1];
                            var2--;
                            int var506 = field5618[var2];
                            if (var504.length() > 0) {
                                if (class40.field473 == null) {
                                    class40.field473 = new String[class120.field1493[class289.field4317.field6073]];
                                }
                                class40.field473[var506] = var504;
                            }
                            if (var505.length() > 0) {
                                if (class231.field3197 == null) {
                                    class231.field3197 = new String[class120.field1493[class289.field4317.field6073]];
                                }
                                class231.field3197[var506] = var505;
                            }
                            continue;
                        }
                        if (var625 == 5423) {
                            var3--;
                            System.out.println(field5609[var3]);
                            continue;
                        }
                        if (var625 == 5424) {
                            var2 -= 11;
                            class464.field6531 = field5618[var2];
                            class227.field3162 = field5618[var2 + 1];
                            class63.field784 = field5618[var2 + 2];
                            class236.field3265 = field5618[var2 + 3];
                            class168.field1996 = field5618[var2 + 4];
                            class141.field1695 = field5618[var2 + 5];
                            class147.field1784 = field5618[var2 + 6];
                            class381.field5410 = field5618[var2 + 7];
                            class348.field4957 = field5618[var2 + 8];
                            class93.field1151 = field5618[var2 + 9];
                            class25.field342 = field5618[var2 + 10];
                            class171.field2022.method2758(class168.field1996, -1);
                            class171.field2022.method2758(class141.field1695, -1);
                            class171.field2022.method2758(class147.field1784, -1);
                            class171.field2022.method2758(class381.field5410, -1);
                            class171.field2022.method2758(class348.field4957, -1);
                            client.field3922 = null;
                            class307.field4514 = null;
                            class361.field5207 = null;
                            class349.field5000 = null;
                            class89.field1114 = null;
                            class230.field3182 = null;
                            class240.field3305 = null;
                            class190.field2597 = null;
                            class371.field5311 = true;
                            continue;
                        }
                        if (var625 == 5425) {
                            class35.method178(true);
                            class371.field5311 = false;
                            continue;
                        }
                        if (var625 == 5426) {
                            var2 -= 2;
                            class84.field1019 = field5618[var2];
                            class66.field835 = field5618[var2 + 1];
                            continue;
                        }
                        if (var625 == 5427) {
                            var2 -= 2;
                            class351.field5044 = field5618[var2 + 1];
                            continue;
                        }
                        if (var625 == 5428) {
                            var2 -= 2;
                            int var507 = field5618[var2];
                            int var508 = field5618[var2 + 1];
                            field5618[var2++] = class15.method103(-1, var508, var507) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 5429) {
                            var3--;
                            class172.method848(field5609[var3], (byte) 1, false);
                            continue;
                        }
                    } else if (var625 < 5600) {
                        if (var625 == 5500) {
                            var2 -= 4;
                            int var509 = field5618[var2];
                            int var510 = field5618[var2 + 1];
                            int var511 = field5618[var2 + 2];
                            int var512 = field5618[var2 + 3];
                            class479.method2834(var512, false, false, var511, (var509 >> 14 & 0x3FFF) - class93.field1163, var510, (var509 & 0x3FFF) - class349.field5023);
                            continue;
                        }
                        if (var625 == 5501) {
                            var2 -= 4;
                            int var513 = field5618[var2];
                            int var514 = field5618[var2 + 1];
                            int var515 = field5618[var2 + 2];
                            int var516 = field5618[var2 + 3];
                            class234.method1290(var514, var516, 1024, var515, (var513 >> 14 & 0x3FFF) - class93.field1163, (var513 & 0x3FFF) - class349.field5023);
                            continue;
                        }
                        if (var625 == 5502) {
                            var2 -= 6;
                            int var517 = field5618[var2];
                            if (var517 >= 2) {
                                throw new RuntimeException();
                            }
                            class69.field855 = var517;
                            int var518 = field5618[var2 + 1];
                            if (var518 + 1 >= class490.field6929[class69.field855].length >> 1) {
                                throw new RuntimeException();
                            }
                            class118.field1456 = var518;
                            class361.field5206 = 0;
                            class92.field1145 = field5618[var2 + 2];
                            class408.field5782 = field5618[var2 + 3];
                            int var519 = field5618[var2 + 4];
                            if (var519 >= 2) {
                                throw new RuntimeException();
                            }
                            class356.field5115 = var519;
                            int var520 = field5618[var2 + 5];
                            if (var520 + 1 >= class490.field6929[class356.field5115].length >> 1) {
                                throw new RuntimeException();
                            }
                            class42.field511 = var520;
                            class358.field5167 = 3;
                            continue;
                        }
                        if (var625 == 5503) {
                            class347.method2103(-9721);
                            continue;
                        }
                        if (var625 == 5504) {
                            var2 -= 2;
                            class148.method707(field5618[var2], field5618[var2 + 1], 0, 2752);
                            continue;
                        }
                        if (var625 == 5505) {
                            field5618[var2++] = (int) class31.field389 >> 3;
                            continue;
                        }
                        if (var625 == 5506) {
                            field5618[var2++] = (int) class349.field5021 >> 3;
                            continue;
                        }
                        if (var625 == 5507) {
                            class180.method942(1132233672);
                            continue;
                        }
                        if (var625 == 5508) {
                            class36.method185(false);
                            continue;
                        }
                        if (var625 == 5509) {
                            class376.method2267((byte) -72);
                            continue;
                        }
                        if (var625 == 5510) {
                            class210.method1170((byte) 116);
                            continue;
                        }
                        if (var625 == 5511) {
                            var2--;
                            int var521 = field5618[var2];
                            int var522 = var521 >> 14 & 0x3FFF;
                            int var523 = var521 & 0x3FFF;
                            int var524 = var522 - class93.field1163;
                            if (var524 < 0) {
                                var524 = 0;
                            } else if (var524 >= class159.field1895) {
                                var524 = class159.field1895;
                            }
                            int var525 = var523 - class349.field5023;
                            if (var525 < 0) {
                                var525 = 0;
                            } else if (var525 >= class289.field4316) {
                                var525 = class289.field4316;
                            }
                            class255.field3554 = var524 * 128 + 64;
                            class369.field5280 = var525 * 128 + 64;
                            class358.field5167 = 4;
                            continue;
                        }
                        if (var625 == 5512) {
                            class159.method766(16707);
                            continue;
                        }
                    } else if (var625 < 5700) {
                        if (var625 == 5600) {
                            var3 -= 2;
                            String var526 = field5609[var3];
                            String var527 = field5609[var3 + 1];
                            var2--;
                            int var528 = field5618[var2];
                            if (class453.field6415 == 10 && class487.field6911 == 0 && class354.field5089 == 0 && class56.field714 == 0 && class112.field1379 == 0) {
                                class78.method394(var528, var527, var526, 10);
                            }
                            continue;
                        }
                        if (var625 == 5601) {
                            class353.method2143(true);
                            continue;
                        }
                        if (var625 == 5602) {
                            if (class354.field5089 == 0) {
                                class224.field3107 = -2;
                            }
                            continue;
                        }
                        if (var625 == 5603) {
                            var2 -= 4;
                            if (class453.field6415 == 10 && class487.field6911 == 0 && class354.field5089 == 0 && class56.field714 == 0 && class112.field1379 == 0) {
                                class335.method2037(field5618[var2 + 2], (byte) 39, field5618[var2 + 3], field5618[var2 + 1], field5618[var2]);
                            }
                            continue;
                        }
                        if (var625 == 5604) {
                            var3--;
                            if (class453.field6415 == 10 && class487.field6911 == 0 && class354.field5089 == 0 && class56.field714 == 0 && class112.field1379 == 0) {
                                class58.method301(class41.method207(0, field5609[var3]), (byte) 124);
                            }
                            continue;
                        }
                        if (var625 == 5605) {
                            var3 -= 3;
                            var2 -= 7;
                            if (class453.field6415 == 10 && class487.field6911 == 0 && class354.field5089 == 0 && class56.field714 == 0 && class112.field1379 == 0) {
                                class148.method717(true, field5618[var2], field5609[var3 + 2], class41.method207(0, field5609[var3]), field5618[var2 + 6] == 1, field5618[var2 + 2], field5618[var2 + 5] == 1, field5618[var2 + 1], field5618[var2 + 3], field5609[var3 + 1], field5618[var2 + 4] == 1);
                            }
                            continue;
                        }
                        if (var625 == 5606) {
                            if (class56.field714 == 0) {
                                class468.field6575 = -2;
                            }
                            continue;
                        }
                        if (var625 == 5607) {
                            field5618[var2++] = class224.field3107;
                            continue;
                        }
                        if (var625 == 5608) {
                            field5618[var2++] = class105.field1268;
                            continue;
                        }
                        if (var625 == 5609) {
                            field5618[var2++] = class468.field6575;
                            continue;
                        }
                        if (var625 == 5610) {
                            for (int var529 = 0; var529 < 5; var529++) {
                                field5609[var3++] = class330.field4750.length > var529 ? class73.method377(class330.field4750[var529], -4941) : "";
                            }
                            class330.field4750 = null;
                            continue;
                        }
                        if (var625 == 5611) {
                            field5618[var2++] = class110.field1354;
                            continue;
                        }
                    } else if (var625 < 6100) {
                        if (var625 == 6001) {
                            var2--;
                            int var530 = field5618[var2];
                            if (var530 < 1) {
                                var530 = 1;
                            }
                            if (var530 > 4) {
                                var530 = 4;
                            }
                            class283.field4124 = var530;
                            class153.method735(true);
                            class120.method582(-2, class42.field512);
                            class231.field3211 = false;
                            continue;
                        }
                        if (var625 == 6002) {
                            var2--;
                            class437.method2599(field5618[var2] == 1, 103);
                            class153.method735(true);
                            class62.method317((byte) 0);
                            class120.method582(-2, class42.field512);
                            class231.field3211 = false;
                            continue;
                        }
                        if (var625 == 6003) {
                            var2--;
                            class445.field6337 = field5618[var2] == 1;
                            class62.method317((byte) 0);
                            class120.method582(-2, class42.field512);
                            class231.field3211 = false;
                            continue;
                        }
                        if (var625 == 6005) {
                            var2--;
                            class119.field1484 = field5618[var2] == 1;
                            class153.method735(true);
                            class120.method582(-2, class42.field512);
                            class231.field3211 = false;
                            continue;
                        }
                        if (var625 == 6006) {
                            var2--;
                            class265.field3817 = field5618[var2] == 1;
                            class231.field3205.method1342(!class265.field3817);
                            class120.method582(-2, class42.field512);
                            class231.field3211 = false;
                            continue;
                        }
                        if (var625 == 6007) {
                            var2--;
                            class346.field4943 = field5618[var2];
                            class120.method582(-2, class42.field512);
                            class231.field3211 = false;
                            continue;
                        }
                        if (var625 == 6008) {
                            var2--;
                            class191.field2611 = field5618[var2] == 1;
                            class120.method582(-2, class42.field512);
                            class231.field3211 = false;
                            continue;
                        }
                        if (var625 == 6009) {
                            var2--;
                            class304.field4496 = field5618[var2] == 1;
                            class153.method735(true);
                            class120.method582(-2, class42.field512);
                            class231.field3211 = false;
                            continue;
                        }
                        if (var625 == 6010) {
                            var2--;
                            class22.field305 = field5618[var2] == 1;
                            class120.method582(-2, class42.field512);
                            class231.field3211 = false;
                            continue;
                        }
                        if (var625 == 6011) {
                            var2--;
                            int var531 = field5618[var2];
                            if (var531 < 0 || var531 > 2) {
                                var531 = 0;
                            }
                            class427.field6166 = var531;
                            class153.method735(true);
                            class120.method582(-2, class42.field512);
                            class231.field3211 = false;
                            continue;
                        }
                        if (var625 == 6012) {
                            var2--;
                            class27.field359 = field5618[var2] == 1;
                            class244.method1330((byte) -54);
                            class120.method582(-2, class42.field512);
                            class231.field3211 = false;
                            continue;
                        }
                        if (var625 == 6014) {
                            var2--;
                            class342.field4899 = field5618[var2] == 1;
                            class153.method735(true);
                            class120.method582(-2, class42.field512);
                            class231.field3211 = false;
                            continue;
                        }
                        if (var625 == 6015) {
                            var2--;
                            class304.field4495 = field5618[var2] == 1;
                            class153.method735(true);
                            class120.method582(-2, class42.field512);
                            class231.field3211 = false;
                            continue;
                        }
                        if (var625 == 6016) {
                            var2--;
                            int var532 = field5618[var2];
                            if (var532 < 0 || var532 > 2) {
                                var532 = 0;
                            }
                            class154.field1855 = var532;
                            class348.method2107(125);
                            class120.method582(-2, class42.field512);
                            continue;
                        }
                        if (var625 == 6017) {
                            var2--;
                            class364.field5231 = field5618[var2] == 1;
                            class346.method2098((byte) -100);
                            class120.method582(-2, class42.field512);
                            class231.field3211 = false;
                            continue;
                        }
                        if (var625 == 6018) {
                            var2--;
                            int var533 = field5618[var2];
                            if (var533 < 0) {
                                var533 = 0;
                            }
                            if (var533 > 127) {
                                var533 = 127;
                            }
                            class304.field4494 = var533;
                            class120.method582(-2, class42.field512);
                            class231.field3211 = false;
                            continue;
                        }
                        if (var625 == 6019) {
                            var2--;
                            int var534 = field5618[var2];
                            if (var534 < 0) {
                                var534 = 0;
                            }
                            if (var534 > 255) {
                                var534 = 255;
                            }
                            if (class224.field3102 != var534) {
                                if (class224.field3102 == 0 && class46.field593 != -1) {
                                    class53.method286(class93.field1162, var534, class46.field593, (byte) 91, false, 0);
                                    class60.field756 = false;
                                } else if (var534 == 0) {
                                    class134.method637(1);
                                    class60.field756 = false;
                                } else {
                                    class150.method720((byte) 97, var534);
                                }
                                class224.field3102 = var534;
                            }
                            class120.method582(-2, class42.field512);
                            class231.field3211 = false;
                            continue;
                        }
                        if (var625 == 6020) {
                            var2--;
                            int var535 = field5618[var2];
                            if (var535 < 0) {
                                var535 = 0;
                            }
                            if (var535 > 127) {
                                var535 = 127;
                            }
                            class376.field5363 = var535;
                            class120.method582(-2, class42.field512);
                            class231.field3211 = false;
                            continue;
                        }
                        if (var625 == 6021) {
                            var2--;
                            class479.field6773 = field5618[var2] == 1;
                            class62.method317((byte) 0);
                            continue;
                        }
                        if (var625 == 6023) {
                            var2--;
                            int var536 = field5618[var2];
                            boolean var537 = false;
                            if (var536 < 0) {
                                var536 = 0;
                            }
                            if (var536 > 2) {
                                var536 = 2;
                            }
                            if (class275.field3918 < 96) {
                                var536 = 0;
                                var537 = true;
                            }
                            class115.method563((byte) 77, var536);
                            class120.method582(-2, class42.field512);
                            class231.field3211 = false;
                            field5618[var2++] = var537 ? 0 : 1;
                            continue;
                        }
                        if (var625 == 6024) {
                            var2--;
                            int var538 = field5618[var2];
                            if (var538 < 0 || var538 > 2) {
                                var538 = 0;
                            }
                            class401.field5719 = var538;
                            class120.method582(-2, class42.field512);
                            continue;
                        }
                        if (var625 == 6025) {
                            var2--;
                            int var539 = field5618[var2];
                            if (var539 < 0 || var539 > class96.method470(255, class275.field3918)) {
                                var539 = 0;
                            }
                            class46.field597 = var539;
                            class120.method582(-2, class42.field512);
                            class231.field3211 = false;
                            continue;
                        }
                        if (var625 == 6027) {
                            var2--;
                            int var540 = field5618[var2];
                            if (var540 < 0 || var540 > 1) {
                                var540 = 0;
                            }
                            class16.method108(var540 == 1, -21811);
                            continue;
                        }
                        if (var625 == 6028) {
                            var2--;
                            class82.field992 = field5618[var2] != 0;
                            class120.method582(-2, class42.field512);
                            continue;
                        }
                        if (var625 == 6029) {
                            var2--;
                            class346.field4943 = field5618[var2];
                            class120.method582(-2, class42.field512);
                            continue;
                        }
                        if (var625 == 6030) {
                            var2--;
                            class346.field4949 = field5618[var2] != 0;
                            class120.method582(-2, class42.field512);
                            class153.method735(true);
                            continue;
                        }
                        if (var625 == 6031) {
                            var2--;
                            int var541 = field5618[var2];
                            if (var541 < 0 || var541 > 3) {
                                var541 = 2;
                            }
                            class331.method2015((byte) -128, var541);
                            continue;
                        }
                        if (var625 == 6032) {
                            var2--;
                            int var542 = field5618[var2];
                            if (var542 < 0 || var542 > 3) {
                                var542 = 2;
                            }
                            class300.field4466 = var542;
                            class120.method582(-2, class42.field512);
                            class231.field3211 = false;
                            continue;
                        }
                        if (var625 == 6033) {
                            var2--;
                            int var543 = field5618[var2];
                            if (var543 < 0 || var543 > 4) {
                                var543 = 2;
                            }
                            class217.field3010 = var543;
                            class120.method582(-2, class42.field512);
                            continue;
                        }
                    } else if (var625 < 6200) {
                        if (var625 == 6101) {
                            field5618[var2++] = class283.field4124;
                            continue;
                        }
                        if (var625 == 6102) {
                            field5618[var2++] = class420.method2503((byte) -84) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6103) {
                            field5618[var2++] = class445.field6337 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6105) {
                            field5618[var2++] = class119.field1484 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6106) {
                            field5618[var2++] = class265.field3817 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6107) {
                            field5618[var2++] = class346.field4943;
                            continue;
                        }
                        if (var625 == 6108) {
                            field5618[var2++] = class191.field2611 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6109) {
                            field5618[var2++] = class304.field4496 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6110) {
                            field5618[var2++] = class22.field305 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6111) {
                            field5618[var2++] = class427.field6166;
                            continue;
                        }
                        if (var625 == 6112) {
                            field5618[var2++] = class27.field359 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6114) {
                            field5618[var2++] = class342.field4899 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6115) {
                            field5618[var2++] = class304.field4495 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6116) {
                            field5618[var2++] = class154.field1855;
                            continue;
                        }
                        if (var625 == 6117) {
                            field5618[var2++] = class364.field5231 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6118) {
                            field5618[var2++] = class304.field4494;
                            continue;
                        }
                        if (var625 == 6119) {
                            field5618[var2++] = class224.field3102;
                            continue;
                        }
                        if (var625 == 6120) {
                            field5618[var2++] = class376.field5363;
                            continue;
                        }
                        if (var625 == 6121) {
                            field5618[var2++] = class231.field3205.method1394() ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6123) {
                            field5618[var2++] = class175.method861(82);
                            continue;
                        }
                        if (var625 == 6124) {
                            field5618[var2++] = class401.field5719;
                            continue;
                        }
                        if (var625 == 6125) {
                            field5618[var2++] = class46.field597;
                            continue;
                        }
                        if (var625 == 6126) {
                            field5618[var2++] = class231.field3205.method1476() ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6127) {
                            field5618[var2++] = class487.field6914 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6128) {
                            field5618[var2++] = class82.field992 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6129) {
                            field5618[var2++] = class346.field4943;
                            continue;
                        }
                        if (var625 == 6130) {
                            field5618[var2++] = class346.field4949 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6131) {
                            field5618[var2++] = class375.field5347;
                            continue;
                        }
                        if (var625 == 6132) {
                            field5618[var2++] = class300.field4466;
                            continue;
                        }
                        if (var625 == 6133) {
                            field5618[var2++] = class355.field5092 == 1 || class355.field5092 == 4 ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6134) {
                            field5618[var2++] = class96.method470(255, class275.field3918);
                            continue;
                        }
                        if (var625 == 6135) {
                            field5618[var2++] = class217.field3010;
                            continue;
                        }
                    } else if (var625 < 6300) {
                        if (var625 == 6200) {
                            var2 -= 2;
                            class349.field5017 = (short) field5618[var2];
                            if (class349.field5017 <= 0) {
                                class349.field5017 = 256;
                            }
                            class94.field1174 = (short) field5618[var2 + 1];
                            if (class94.field1174 <= 0) {
                                class94.field1174 = 205;
                            }
                            continue;
                        }
                        if (var625 == 6201) {
                            var2 -= 2;
                            class223.field3097 = (short) field5618[var2];
                            if (class223.field3097 <= 0) {
                                class223.field3097 = 256;
                            }
                            class207.field2847 = (short) field5618[var2 + 1];
                            if (class207.field2847 <= 0) {
                                class207.field2847 = 320;
                            }
                            continue;
                        }
                        if (var625 == 6202) {
                            var2 -= 4;
                            class438.field6285 = (short) field5618[var2];
                            if (class438.field6285 <= 0) {
                                class438.field6285 = 1;
                            }
                            class172.field2078 = (short) field5618[var2 + 1];
                            if (class172.field2078 <= 0) {
                                class172.field2078 = 32767;
                            } else if (class172.field2078 < class438.field6285) {
                                class172.field2078 = class438.field6285;
                            }
                            class337.field4852 = (short) field5618[var2 + 2];
                            if (class337.field4852 <= 0) {
                                class337.field4852 = 1;
                            }
                            class406.field5778 = (short) field5618[var2 + 3];
                            if (class406.field5778 <= 0) {
                                class406.field5778 = 32767;
                            } else if (class406.field5778 < class337.field4852) {
                                class406.field5778 = class337.field4852;
                            }
                            continue;
                        }
                        if (var625 == 6203) {
                            class225.method1244(false, 0, class187.field2526.field3597, class187.field2526.field3707, 5172, 0);
                            field5618[var2++] = class61.field766;
                            field5618[var2++] = class118.field1460;
                            continue;
                        }
                        if (var625 == 6204) {
                            field5618[var2++] = class223.field3097;
                            field5618[var2++] = class207.field2847;
                            continue;
                        }
                        if (var625 == 6205) {
                            field5618[var2++] = class349.field5017;
                            field5618[var2++] = class94.field1174;
                            continue;
                        }
                    } else if (var625 < 6400) {
                        if (var625 == 6300) {
                            field5618[var2++] = (int) (class434.method2591(-19310) / 60000L);
                            continue;
                        }
                        if (var625 == 6301) {
                            field5618[var2++] = (int) (class434.method2591(-19310) / 86400000L) - 11745;
                            continue;
                        }
                        if (var625 == 6302) {
                            var2 -= 3;
                            int var544 = field5618[var2];
                            int var545 = field5618[var2 + 1];
                            int var546 = field5618[var2 + 2];
                            field5603.clear();
                            field5603.set(11, 12);
                            field5603.set(var546, var545, var544);
                            field5618[var2++] = (int) (field5603.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var625 == 6303) {
                            field5603.clear();
                            field5603.setTime(new Date(class434.method2591(-19310)));
                            field5618[var2++] = field5603.get(1);
                            continue;
                        }
                        if (var625 == 6304) {
                            var2--;
                            int var547 = field5618[var2];
                            boolean var548 = true;
                            if (var547 < 0) {
                                var548 = (var547 + 1) % 4 == 0;
                            } else if (var547 < 1582) {
                                var548 = var547 % 4 == 0;
                            } else if (var547 % 4 != 0) {
                                var548 = false;
                            } else if (var547 % 100 != 0) {
                                var548 = true;
                            } else if (var547 % 400 != 0) {
                                var548 = false;
                            }
                            field5618[var2++] = var548 ? 1 : 0;
                            continue;
                        }
                    } else if (var625 < 6500) {
                        if (var625 == 6405) {
                            field5618[var2++] = class156.method752(2707) ? 1 : 0;
                            continue;
                        }
                        if (var625 == 6406) {
                            field5618[var2++] = class37.method188(0) ? 1 : 0;
                            continue;
                        }
                    } else if (var625 < 6600) {
                        if (var625 == 6500) {
                            if (class453.field6415 == 10 && class487.field6911 == 0 && class354.field5089 == 0 && class56.field714 == 0) {
                                field5618[var2++] = class462.method2720((byte) -123) == -1 ? 0 : 1;
                                continue;
                            }
                            field5618[var2++] = 1;
                            continue;
                        }
                        if (var625 == 6501) {
                            class239 var549 = class459.method2708(0);
                            if (var549 == null) {
                                field5618[var2++] = -1;
                                field5618[var2++] = 0;
                                field5609[var3++] = "";
                                field5618[var2++] = 0;
                                field5609[var3++] = "";
                                field5618[var2++] = 0;
                                field5618[var2++] = 0;
                            } else {
                                field5618[var2++] = var549.field3299;
                                field5618[var2++] = var549.field5327;
                                field5609[var3++] = var549.field3291;
                                class69 var550 = var549.method1315((byte) 114);
                                field5618[var2++] = var550.field853;
                                field5609[var3++] = var550.field852;
                                field5618[var2++] = var549.field5325;
                                field5618[var2++] = var549.field3292;
                            }
                            continue;
                        }
                        if (var625 == 6502) {
                            class239 var551 = class438.method2601(1);
                            if (var551 == null) {
                                field5618[var2++] = -1;
                                field5618[var2++] = 0;
                                field5609[var3++] = "";
                                field5618[var2++] = 0;
                                field5609[var3++] = "";
                                field5618[var2++] = 0;
                                field5618[var2++] = 0;
                            } else {
                                field5618[var2++] = var551.field3299;
                                field5618[var2++] = var551.field5327;
                                field5609[var3++] = var551.field3291;
                                class69 var552 = var551.method1315((byte) 124);
                                field5618[var2++] = var552.field853;
                                field5609[var3++] = var552.field852;
                                field5618[var2++] = var551.field5325;
                                field5618[var2++] = var551.field3292;
                            }
                            continue;
                        }
                        if (var625 == 6503) {
                            var2--;
                            int var553 = field5618[var2];
                            if (class453.field6415 == 10 && class487.field6911 == 0 && class354.field5089 == 0 && class56.field714 == 0) {
                                field5618[var2++] = class207.method1144(6990, var553) ? 1 : 0;
                                continue;
                            }
                            field5618[var2++] = 0;
                            continue;
                        }
                        if (var625 == 6504) {
                            var2--;
                            class50.field657 = field5618[var2];
                            class120.method582(-2, class42.field512);
                            continue;
                        }
                        if (var625 == 6505) {
                            field5618[var2++] = class50.field657;
                            continue;
                        }
                        if (var625 == 6506) {
                            var2--;
                            int var554 = field5618[var2];
                            class239 var555 = class199.method1090(128, var554);
                            if (var555 == null) {
                                field5618[var2++] = -1;
                                field5609[var3++] = "";
                                field5618[var2++] = 0;
                                field5609[var3++] = "";
                                field5618[var2++] = 0;
                                field5618[var2++] = 0;
                            } else {
                                field5618[var2++] = var555.field5327;
                                field5609[var3++] = var555.field3291;
                                class69 var556 = var555.method1315((byte) 96);
                                field5618[var2++] = var556.field853;
                                field5609[var3++] = var556.field852;
                                field5618[var2++] = var555.field5325;
                                field5618[var2++] = var555.field3292;
                            }
                            continue;
                        }
                        if (var625 == 6507) {
                            var2 -= 4;
                            int var557 = field5618[var2];
                            boolean var558 = field5618[var2 + 1] == 1;
                            int var559 = field5618[var2 + 2];
                            boolean var560 = field5618[var2 + 3] == 1;
                            class190.method1039((byte) 120, var558, var557, var560, var559);
                            continue;
                        }
                        if (var625 == 6508) {
                            class129.method619((byte) 114);
                            continue;
                        }
                        if (var625 == 6509) {
                            if (class453.field6415 == 10) {
                                var2--;
                                class230.field3183 = field5618[var2] == 1;
                            }
                            continue;
                        }
                    } else if (var625 < 6700) {
                        if (var625 == 6600) {
                            var2--;
                            class92.field1146 = field5618[var2] == 1;
                            class120.method582(-2, class42.field512);
                            continue;
                        }
                        if (var625 == 6601) {
                            field5618[var2++] = class92.field1146 ? 1 : 0;
                            continue;
                        }
                    } else if (var625 < 6800 && class41.field494 == class158.field1891) {
                        if (var625 == 6700) {
                            int var561 = class369.field5270.method230(0);
                            if (class57.field725 != -1) {
                                var561++;
                            }
                            field5618[var2++] = var561;
                            continue;
                        }
                        if (var625 == 6701) {
                            var2--;
                            int var562 = field5618[var2];
                            if (class57.field725 != -1) {
                                if (var562 == 0) {
                                    field5618[var2++] = class57.field725;
                                    continue;
                                }
                                var562--;
                            }
                            class68 var563 = (class68) class369.field5270.method241(0);
                            while (var562-- > 0) {
                                var563 = (class68) class369.field5270.method239(0);
                            }
                            field5618[var2++] = var563.field850;
                            continue;
                        }
                        if (var625 == 6702) {
                            var2--;
                            int var564 = field5618[var2];
                            if (class284.field4130[var564] == null) {
                                field5609[var3++] = "";
                            } else {
                                String var565 = class284.field4130[var564][0].field3603;
                                if (var565 == null) {
                                    field5609[var3++] = "";
                                } else {
                                    field5609[var3++] = var565.substring(0, var565.indexOf(58));
                                }
                            }
                            continue;
                        }
                        if (var625 == 6703) {
                            var2--;
                            int var566 = field5618[var2];
                            if (class284.field4130[var566] == null) {
                                field5618[var2++] = 0;
                            } else {
                                field5618[var2++] = class284.field4130[var566].length;
                            }
                            continue;
                        }
                        if (var625 == 6704) {
                            var2 -= 2;
                            int var567 = field5618[var2];
                            int var568 = field5618[var2 + 1];
                            if (class284.field4130[var567] == null) {
                                field5609[var3++] = "";
                            } else {
                                String var569 = class284.field4130[var567][var568].field3603;
                                if (var569 == null) {
                                    field5609[var3++] = "";
                                } else {
                                    field5609[var3++] = var569;
                                }
                            }
                            continue;
                        }
                        if (var625 == 6705) {
                            var2 -= 2;
                            int var570 = field5618[var2];
                            int var571 = field5618[var2 + 1];
                            if (class284.field4130[var570] == null) {
                                field5618[var2++] = 0;
                            } else {
                                field5618[var2++] = class284.field4130[var570][var571].field3599;
                            }
                            continue;
                        }
                        if (var625 == 6706) {
                            continue;
                        }
                        if (var625 == 6707) {
                            var2 -= 3;
                            int var572 = field5618[var2];
                            int var573 = field5618[var2 + 1];
                            int var574 = field5618[var2 + 2];
                            class36.method187(1, var572 << 16 | var573, 89, "", var574);
                            continue;
                        }
                        if (var625 == 6708) {
                            var2 -= 3;
                            int var575 = field5618[var2];
                            int var576 = field5618[var2 + 1];
                            int var577 = field5618[var2 + 2];
                            class36.method187(2, var575 << 16 | var576, 94, "", var577);
                            continue;
                        }
                        if (var625 == 6709) {
                            var2 -= 3;
                            int var578 = field5618[var2];
                            int var579 = field5618[var2 + 1];
                            int var580 = field5618[var2 + 2];
                            class36.method187(3, var578 << 16 | var579, 99, "", var580);
                            continue;
                        }
                        if (var625 == 6710) {
                            var2 -= 3;
                            int var581 = field5618[var2];
                            int var582 = field5618[var2 + 1];
                            int var583 = field5618[var2 + 2];
                            class36.method187(4, var581 << 16 | var582, 54, "", var583);
                            continue;
                        }
                        if (var625 == 6711) {
                            var2 -= 3;
                            int var584 = field5618[var2];
                            int var585 = field5618[var2 + 1];
                            int var586 = field5618[var2 + 2];
                            class36.method187(5, var584 << 16 | var585, 121, "", var586);
                            continue;
                        }
                        if (var625 == 6712) {
                            var2 -= 3;
                            int var587 = field5618[var2];
                            int var588 = field5618[var2 + 1];
                            int var589 = field5618[var2 + 2];
                            class36.method187(6, var587 << 16 | var588, 125, "", var589);
                            continue;
                        }
                        if (var625 == 6713) {
                            var2 -= 3;
                            int var590 = field5618[var2];
                            int var591 = field5618[var2 + 1];
                            int var592 = field5618[var2 + 2];
                            class36.method187(7, var590 << 16 | var591, 62, "", var592);
                            continue;
                        }
                        if (var625 == 6714) {
                            var2 -= 3;
                            int var593 = field5618[var2];
                            int var594 = field5618[var2 + 1];
                            int var595 = field5618[var2 + 2];
                            class36.method187(8, var593 << 16 | var594, 116, "", var595);
                            continue;
                        }
                        if (var625 == 6715) {
                            var2 -= 3;
                            int var596 = field5618[var2];
                            int var597 = field5618[var2 + 1];
                            int var598 = field5618[var2 + 2];
                            class36.method187(9, var596 << 16 | var597, 64, "", var598);
                            continue;
                        }
                        if (var625 == 6716) {
                            var2 -= 3;
                            int var599 = field5618[var2];
                            int var600 = field5618[var2 + 1];
                            int var601 = field5618[var2 + 2];
                            class36.method187(10, var599 << 16 | var600, 86, "", var601);
                            continue;
                        }
                        if (var625 == 6717) {
                            var2 -= 3;
                            int var602 = field5618[var2];
                            int var603 = field5618[var2 + 1];
                            int var604 = field5618[var2 + 2];
                            class256 var605 = class66.method339(var604, 0, var602 << 16 | var603);
                            class379.method2270((byte) -37);
                            class281 var606 = client.method1660(var605);
                            class419.method2495((byte) 75, var605.field3621, var605.field3558, var606.method1768(-30065), var604, var602 << 16 | var603, var606.field4094);
                            continue;
                        }
                    } else if (var625 < 6900) {
                        if (var625 == 6800) {
                            var2--;
                            int var607 = field5618[var2];
                            class334 var608 = class47.field611.method1898(36, var607);
                            if (var608.field4822 == null) {
                                field5609[var3++] = "";
                            } else {
                                field5609[var3++] = var608.field4822;
                            }
                            continue;
                        }
                        if (var625 == 6801) {
                            var2--;
                            int var609 = field5618[var2];
                            class334 var610 = class47.field611.method1898(36, var609);
                            field5618[var2++] = var610.field4809;
                            continue;
                        }
                        if (var625 == 6802) {
                            var2--;
                            int var611 = field5618[var2];
                            class334 var612 = class47.field611.method1898(36, var611);
                            field5618[var2++] = var612.field4808;
                            continue;
                        }
                        if (var625 == 6803) {
                            var2--;
                            int var613 = field5618[var2];
                            class334 var614 = class47.field611.method1898(36, var613);
                            field5618[var2++] = var614.field4795;
                            continue;
                        }
                        if (var625 == 6804) {
                            var2 -= 2;
                            int var615 = field5618[var2];
                            int var616 = field5618[var2 + 1];
                            class307 var617 = class422.field6084.method2076((byte) -122, var616);
                            if (var617.method1915(115)) {
                                field5609[var3++] = class47.field611.method1898(36, var615).method2023((byte) 126, var617.field4520, var616);
                            } else {
                                field5618[var2++] = class47.field611.method1898(36, var615).method2029(-1, var616, var617.field4519);
                            }
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var624) {
            if (arg0.field5075 == null) {
                StringBuffer var622 = new StringBuffer(30);
                var622.append("CS2: ").append(arg0.field1776).append(" ");
                for (int var623 = field5619 - 1; var623 >= 0; var623--) {
                    var622.append("v: ").append(field5614[var623].field4637.field1776).append(" ");
                }
                var622.append("op: ").append(var7);
                class144.method678(var624, true, var622.toString());
            } else {
                class104.method499("Clientscript error in: " + arg0.field5075, (byte) -10);
                StringBuffer var619 = new StringBuffer(30);
                var619.append("Clientscript error in: ").append(arg0.field5075).append("\n");
                for (int var620 = field5619 - 1; var620 >= 0; var620--) {
                    var619.append("via: ").append(field5614[var620].field4637.field5075).append("\n");
                }
                var619.append("Op: ").append(var7).append("\n");
                String var621 = var624.getMessage();
                if (var621 != null && var621.length() > 0) {
                    var619.append("Message: ").append(var621).append("\n");
                }
                class144.method678(var624, true, var619.toString());
                class486.method2871(true, var619.toString());
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static final void method2373(int arg0) {
        if (arg0 == -1 || !class480.method2837((byte) 53, arg0)) {
            return;
        }
        class256[] var1 = class284.field4130[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class256 var3 = var1[var2];
            if (var3.field3711 != null) {
                class35 var4 = new class35();
                var4.field429 = var3;
                var4.field435 = var3.field3711;
                method2370(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "()V")
    public static void method2374() {
        field5622 = null;
        field5612 = null;
        field5608 = null;
        field5617 = null;
        field5618 = null;
        field5609 = null;
        field5614 = null;
        field5610 = null;
        field5611 = null;
        field5613 = null;
        field5603 = null;
        field5626 = null;
        field5625 = null;
        field5624 = null;
    }
}
