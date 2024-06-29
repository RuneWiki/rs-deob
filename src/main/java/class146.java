import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class146 extends class232 {

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    private int field2615 = 0;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "Ltg;")
    private class277 field2613 = new class277(16);

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "I")
    private int field2643 = 0;

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "Lli;")
    private class191 field2647 = new class191();

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "J")
    private long field2649 = 0L;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    private int field2614;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "Lka;")
    private class164 field2639;

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "Z")
    private boolean field2646;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "Lli;")
    private class191 field2648;

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "Lka;")
    private class164 field2638;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
    private int field2634;

    @OriginalMember(owner = "client!dh", name = "Y", descriptor = "Z")
    private boolean field2650;

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "I")
    private int field2641;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "Loi;")
    private class282 field2617;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "Lfh;")
    private class172 field2623;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "Lja;")
    private class54 field2630;

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "I")
    public static int field2635 = 0;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!dh", name = "Q", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "Loa;")
    private class252 field2616;

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "Z")
    private boolean field2645;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "[B")
    private byte[] field2618;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)I")
    public final int method928(int arg0) {
        field2633++;
        if (this.field2616 == null) {
            return 0;
        } else {
            if (arg0 <= 16) {
                this.field2639 = null;
            }
            return this.field2616.field4535;
        }
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)V")
    public final void method929(int arg0) {
        field2636++;
        if (this.field2648 != null) {
            if (this.method938(-117) == null) {
                return;
            }
            if (this.field2646) {
                boolean var6 = true;
                for (class61 var7 = this.field2648.method1294(false); var7 != null; var7 = this.field2648.method1292((byte) 125)) {
                    int var9 = (int) var7.field1162;
                    if (this.field2618[var9] == 0) {
                        this.method942(var9, 23894, 1);
                    }
                    if (this.field2618[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method349(0);
                    }
                }
                while (this.field2616.field4541.length > this.field2643) {
                    if (this.field2616.field4541[this.field2643] == 0) {
                        this.field2643++;
                    } else {
                        if (this.field2623.field3087 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field2618[this.field2643] == 0) {
                            this.method942(this.field2643, 23894, 1);
                        }
                        if (this.field2618[this.field2643] == 0) {
                            var6 = false;
                            class61 var8 = new class61();
                            var8.field1162 = (long) this.field2643;
                            this.field2648.method1290((byte) -44, var8);
                        }
                        this.field2643++;
                    }
                }
                if (var6) {
                    this.field2646 = false;
                    this.field2643 = 0;
                }
            } else if (this.field2645) {
                boolean var2 = true;
                for (class61 var3 = this.field2648.method1294(false); var3 != null; var3 = this.field2648.method1292((byte) 125)) {
                    int var5 = (int) var3.field1162;
                    if (this.field2618[var5] != 1) {
                        this.method942(var5, 23894, 2);
                    }
                    if (this.field2618[var5] == 1) {
                        var3.method349(0);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field2616.field4541.length > this.field2643) {
                    if (this.field2616.field4541[this.field2643] == 0) {
                        this.field2643++;
                    } else {
                        if (this.field2617.method1865((byte) 86)) {
                            var2 = false;
                            break;
                        }
                        if (this.field2618[this.field2643] != 1) {
                            this.method942(this.field2643, 23894, 2);
                        }
                        if (this.field2618[this.field2643] != 1) {
                            class61 var4 = new class61();
                            var4.field1162 = (long) this.field2643;
                            var2 = false;
                            this.field2648.method1290((byte) -44, var4);
                        }
                        this.field2643++;
                    }
                }
                if (var2) {
                    this.field2645 = false;
                    this.field2643 = 0;
                }
            } else {
                this.field2648 = null;
            }
        }
        if (this.field2650 && class205.method1403(-63) >= this.field2649) {
            for (class54 var10 = (class54) this.field2613.method1818(false); var10 != null; var10 = (class54) this.field2613.method1834((byte) 120)) {
                if (!var10.field1054) {
                    if (var10.field1056) {
                        if (!var10.field1052) {
                            throw new RuntimeException();
                        }
                        var10.method349(0);
                    } else {
                        var10.field1056 = true;
                    }
                }
            }
            this.field2649 = class205.method1403(90) + 1000L;
        }
        if (arg0 < 7) {
            this.method929(-64);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)I")
    public final int method930(int arg0, int arg1) {
        if (arg1 <= 113) {
            this.method931(55);
        }
        class54 var3 = (class54) this.field2613.method1824((long) arg0, 0);
        field2629++;
        return var3 == null ? 0 : var3.method330(112);
    }

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "(I)I")
    public final int method931(int arg0) {
        field2627++;
        if (this.field2616 == null) {
            return 0;
        } else if (!this.field2646) {
            return this.field2616.field4535;
        } else if (arg0 == -20324) {
            class61 var2 = this.field2648.method1294(false);
            return var2 == null ? 0 : (int) var2.field1162;
        } else {
            return 41;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILdc;)V")
    public static final void method932(int arg0, int arg1, class91 arg2) {
        field2619++;
        Object[] var3 = arg2.field1639;
        int var4 = (Integer) var3[0];
        class182 var5 = class174.method1148(var4, (byte) 100);
        if (var5 == null) {
            return;
        }
        class57.field1111 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field3253;
        int[] var10 = var5.field3261;
        byte var11 = -1;
        try {
            int var12 = 13 % ((26 - arg1) / 35);
            class207.field3811 = new class143[var5.field3246];
            int var13 = 0;
            class42.field704 = new int[var5.field3249];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if ((var3[var15] instanceof Integer)) {
                    int var17 = (Integer) var3[var15];
                    if (var17 == -2147483647) {
                        var17 = arg2.field1643;
                    }
                    if (var17 == -2147483646) {
                        var17 = arg2.field1642;
                    }
                    if (var17 == -2147483645) {
                        var17 = arg2.field1641 == null ? -1 : arg2.field1641.field722;
                    }
                    if (var17 == -2147483644) {
                        var17 = arg2.field1636;
                    }
                    if (var17 == -2147483643) {
                        var17 = arg2.field1641 == null ? -1 : arg2.field1641.field719;
                    }
                    if (var17 == -2147483642) {
                        var17 = arg2.field1632 == null ? -1 : arg2.field1632.field722;
                    }
                    if (var17 == -2147483641) {
                        var17 = arg2.field1632 == null ? -1 : arg2.field1632.field719;
                    }
                    if (var17 == -2147483640) {
                        var17 = arg2.field1633;
                    }
                    if (var17 == -2147483639) {
                        var17 = arg2.field1645;
                    }
                    class42.field704[var13++] = var17;
                } else if (var3[var15] instanceof class143) {
                    class143 var16 = (class143) var3[var15];
                    if (var16.method876((byte) -122, class234.field4255)) {
                        var16 = arg2.field1644;
                    }
                    class207.field3811[var14++] = var16;
                }
            }
            int var18 = 0;
            label3734: while (true) {
                var18++;
                if (arg0 < var18) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var488 = var9[var8];
                if (var488 < 100) {
                    if (var488 == 0) {
                        class51.field1010[var6++] = var10[var8];
                        continue;
                    }
                    if (var488 == 1) {
                        int var19 = var10[var8];
                        class51.field1010[var6++] = class148.field2691[var19];
                        continue;
                    }
                    if (var488 == 2) {
                        int var20 = var10[var8];
                        var6--;
                        class203.method1384(1, class51.field1010[var6], var20);
                        continue;
                    }
                    if (var488 == 3) {
                        class170.field3029[var7++] = var5.field3247[var8];
                        continue;
                    }
                    if (var488 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var488 == 7) {
                        var6 -= 2;
                        if (class51.field1010[var6 + 1] != class51.field1010[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var488 == 8) {
                        var6 -= 2;
                        if (class51.field1010[var6 + 1] == class51.field1010[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var488 == 9) {
                        var6 -= 2;
                        if (class51.field1010[var6 + 1] > class51.field1010[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var488 == 10) {
                        var6 -= 2;
                        if (class51.field1010[var6 + 1] < class51.field1010[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var488 == 21) {
                        if (class57.field1111 == 0) {
                            return;
                        }
                        class246 var21 = class188.field3405[--class57.field1111];
                        class207.field3811 = var21.field4424;
                        class42.field704 = var21.field4414;
                        var5 = var21.field4418;
                        var10 = var5.field3261;
                        var9 = var5.field3253;
                        var8 = var21.field4419;
                        continue;
                    }
                    if (var488 == 25) {
                        int var22 = var10[var8];
                        class51.field1010[var6++] = class48.method291((byte) -43, var22);
                        continue;
                    }
                    if (var488 == 27) {
                        int var23 = var10[var8];
                        var6--;
                        class163.method1075(class51.field1010[var6], -6626, var23);
                        continue;
                    }
                    if (var488 == 31) {
                        var6 -= 2;
                        if (class51.field1010[var6] <= class51.field1010[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var488 == 32) {
                        var6 -= 2;
                        if (class51.field1010[var6 + 1] <= class51.field1010[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var488 == 33) {
                        class51.field1010[var6++] = class42.field704[var10[var8]];
                        continue;
                    }
                    int var10001;
                    if (var488 == 34) {
                        var10001 = var10[var8];
                        var6--;
                        class42.field704[var10001] = class51.field1010[var6];
                        continue;
                    }
                    if (var488 == 35) {
                        class170.field3029[var7++] = class207.field3811[var10[var8]];
                        continue;
                    }
                    if (var488 == 36) {
                        var10001 = var10[var8];
                        var7--;
                        class207.field3811[var10001] = class170.field3029[var7];
                        continue;
                    }
                    if (var488 == 37) {
                        int var24 = var10[var8];
                        var7 -= var24;
                        class143 var25 = class18.method133(31887, var7, class170.field3029, var24);
                        class170.field3029[var7++] = var25;
                        continue;
                    }
                    if (var488 == 38) {
                        var6--;
                        continue;
                    }
                    if (var488 == 39) {
                        var7--;
                        continue;
                    }
                    if (var488 == 40) {
                        int var26 = var10[var8];
                        class182 var27 = class174.method1148(var26, (byte) 100);
                        int[] var28 = new int[var27.field3249];
                        class143[] var29 = new class143[var27.field3246];
                        for (int var30 = 0; var30 < var27.field3251; var30++) {
                            var28[var30] = class51.field1010[var6 + var30 - var27.field3251];
                        }
                        for (int var31 = 0; var31 < var27.field3258; var31++) {
                            var29[var31] = class170.field3029[var7 + var31 - var27.field3258];
                        }
                        var7 -= var27.field3258;
                        var6 -= var27.field3251;
                        class246 var32 = new class246();
                        var32.field4414 = class42.field704;
                        var32.field4424 = class207.field3811;
                        var32.field4419 = var8;
                        var32.field4418 = var5;
                        if (class57.field1111 >= class188.field3405.length) {
                            throw new RuntimeException();
                        }
                        class188.field3405[class57.field1111++] = var32;
                        var5 = var27;
                        var8 = -1;
                        var9 = var27.field3253;
                        class207.field3811 = var29;
                        var10 = var27.field3261;
                        class42.field704 = var28;
                        continue;
                    }
                    if (var488 == 42) {
                        class51.field1010[var6++] = class48.field933[var10[var8]];
                        continue;
                    }
                    if (var488 == 43) {
                        int var33 = var10[var8];
                        var6--;
                        class48.field933[var33] = class51.field1010[var6];
                        class208.method1451(var33, (byte) -119);
                        continue;
                    }
                    if (var488 == 44) {
                        int var34 = var10[var8] & 0xFFFF;
                        int var35 = var10[var8] >> 16;
                        var6--;
                        int var36 = class51.field1010[var6];
                        if (var36 >= 0 && var36 <= 5000) {
                            class219.field3995[var35] = var36;
                            byte var37 = -1;
                            if (var34 == 105) {
                                var37 = 0;
                            }
                            int var38 = 0;
                            while (true) {
                                if (var36 <= var38) {
                                    continue label3734;
                                }
                                class134.field2358[var35][var38] = var37;
                                var38++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var488 == 45) {
                        int var39 = var10[var8];
                        var6--;
                        int var40 = class51.field1010[var6];
                        if (var40 >= 0 && var40 < class219.field3995[var39]) {
                            class51.field1010[var6++] = class134.field2358[var39][var40];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var488 == 46) {
                        int var41 = var10[var8];
                        var6 -= 2;
                        int var42 = class51.field1010[var6];
                        if (var42 >= 0 && class219.field3995[var41] > var42) {
                            class134.field2358[var41][var42] = class51.field1010[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var488 == 47) {
                        class143 var43 = class221.field4005[var10[var8]];
                        if (var43 == null) {
                            var43 = class80.field1458;
                        }
                        class170.field3029[var7++] = var43;
                        continue;
                    }
                    if (var488 == 48) {
                        int var44 = var10[var8];
                        var7--;
                        class221.field4005[var44] = class170.field3029[var7];
                        class171.method1122(var44, -27349);
                        continue;
                    }
                    if (var488 == 51) {
                        class277 var45 = var5.field3250[var10[var8]];
                        var6--;
                        class3 var46 = (class3) var45.method1824((long) class51.field1010[var6], 0);
                        if (var46 != null) {
                            var8 += var46.field49;
                        }
                        continue;
                    }
                }
                boolean var47;
                if (var10[var8] == 1) {
                    var47 = true;
                } else {
                    var47 = false;
                }
                if (var488 < 300) {
                    if (var488 == 100) {
                        var6 -= 3;
                        int var467 = class51.field1010[var6 + 1];
                        int var468 = class51.field1010[var6];
                        int var469 = class51.field1010[var6 + 2];
                        if (var467 == 0) {
                            throw new RuntimeException();
                        }
                        class43 var470 = class27.method186(1341, var468);
                        if (var470.field885 == null) {
                            var470.field885 = new class43[var469 + 1];
                        }
                        if (var469 >= var470.field885.length) {
                            class43[] var471 = new class43[var469 + 1];
                            for (int var472 = 0; var472 < var470.field885.length; var472++) {
                                var471[var472] = var470.field885[var472];
                            }
                            var470.field885 = var471;
                        }
                        if (var469 > 0 && var470.field885[var469 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var469 - 1));
                        }
                        class43 var473 = new class43();
                        var473.field769 = var467;
                        var473.field786 = true;
                        var473.field789 = var473.field722 = var470.field722;
                        var473.field719 = var469;
                        var470.field885[var469] = var473;
                        if (var47) {
                            class248.field4458 = var473;
                        } else {
                            class274.field4875 = var473;
                        }
                        class141.method844((byte) -128, var470);
                        continue;
                    }
                    if (var488 == 101) {
                        class43 var474 = var47 ? class248.field4458 : class274.field4875;
                        if (var474.field719 == -1) {
                            if (var47) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class43 var475 = class27.method186(1341, var474.field722);
                        var475.field885[var474.field719] = null;
                        class141.method844((byte) -126, var475);
                        continue;
                    }
                    if (var488 == 102) {
                        var6--;
                        class43 var476 = class27.method186(1341, class51.field1010[var6]);
                        var476.field885 = null;
                        class141.method844((byte) 24, var476);
                        continue;
                    }
                    if (var488 == 200) {
                        var6 -= 2;
                        int var477 = class51.field1010[var6];
                        int var478 = class51.field1010[var6 + 1];
                        class43 var479 = class185.method1211(-87, var477, var478);
                        if (var479 != null && var478 != -1) {
                            class51.field1010[var6++] = 1;
                            if (var47) {
                                class248.field4458 = var479;
                            } else {
                                class274.field4875 = var479;
                            }
                            continue;
                        }
                        class51.field1010[var6++] = 0;
                        continue;
                    }
                    if (var488 == 201) {
                        var6--;
                        int var480 = class51.field1010[var6];
                        class43 var481 = class27.method186(1341, var480);
                        if (var481 == null) {
                            class51.field1010[var6++] = 0;
                        } else {
                            class51.field1010[var6++] = 1;
                            if (var47) {
                                class248.field4458 = var481;
                            } else {
                                class274.field4875 = var481;
                            }
                        }
                        continue;
                    }
                } else if (var488 < 500) {
                    if (var488 == 403) {
                        var6 -= 2;
                        int var462 = class51.field1010[var6];
                        if (var462 >= 7) {
                            var462 -= 7;
                        }
                        int var463 = class51.field1010[var6 + 1];
                        class229.field4195.field516.method686((byte) -15, var462, var463);
                        continue;
                    }
                    if (var488 == 404) {
                        var6 -= 2;
                        int var464 = class51.field1010[var6 + 1];
                        int var465 = class51.field1010[var6];
                        class229.field4195.field516.method694(var465, var464, -87);
                        continue;
                    }
                    if (var488 == 410) {
                        var6--;
                        boolean var466 = class51.field1010[var6] != 0;
                        class229.field4195.field516.method687((byte) -53, var466);
                        continue;
                    }
                } else if (!(var488 < 1000 || var488 >= 1100) || !(var488 < 2000 || var488 >= 2100)) {
                    class43 var456;
                    if (var488 >= 2000) {
                        var488 -= 1000;
                        var6--;
                        var456 = class27.method186(1341, class51.field1010[var6]);
                    } else {
                        var456 = var47 ? class248.field4458 : class274.field4875;
                    }
                    if (var488 == 1000) {
                        var6 -= 4;
                        var456.field832 = class51.field1010[var6];
                        var456.field833 = class51.field1010[var6 + 1];
                        int var457 = class51.field1010[var6 + 3];
                        if (var457 < 0) {
                            var457 = 0;
                        } else if (var457 > 5) {
                            var457 = 5;
                        }
                        int var458 = class51.field1010[var6 + 2];
                        var456.field821 = (byte) var457;
                        if (var458 < 0) {
                            var458 = 0;
                        } else if (var458 > 5) {
                            var458 = 5;
                        }
                        var456.field820 = (byte) var458;
                        class141.method844((byte) 33, var456);
                        class203.method1385(-123, var456);
                        if (var456.field719 == -1) {
                            class130.method786(11, var456.field722);
                        }
                        continue;
                    }
                    if (var488 == 1001) {
                        var6 -= 4;
                        var456.field739 = class51.field1010[var6];
                        var456.field809 = class51.field1010[var6 + 1];
                        var456.field829 = 0;
                        var456.field880 = 0;
                        int var459 = class51.field1010[var6 + 2];
                        int var460 = class51.field1010[var6 + 3];
                        if (var460 < 0) {
                            var460 = 0;
                        } else if (var460 > 4) {
                            var460 = 4;
                        }
                        var456.field741 = (byte) var460;
                        if (var459 < 0) {
                            var459 = 0;
                        } else if (var459 > 4) {
                            var459 = 4;
                        }
                        var456.field717 = (byte) var459;
                        class141.method844((byte) 17, var456);
                        class203.method1385(-115, var456);
                        if (var456.field769 == 0) {
                            class18.method135(var456, 0, false);
                        }
                        continue;
                    }
                    if (var488 == 1003) {
                        var6--;
                        boolean var461 = class51.field1010[var6] == 1;
                        if (var456.field865 != var461) {
                            var456.field865 = var461;
                            class141.method844((byte) -120, var456);
                        }
                        if (var456.field719 == -1) {
                            class4.method16(var456.field722, (byte) -68);
                        }
                        continue;
                    }
                    if (var488 == 1004) {
                        var6 -= 2;
                        var456.field881 = class51.field1010[var6];
                        var456.field824 = class51.field1010[var6 + 1];
                        class141.method844((byte) -125, var456);
                        class203.method1385(-122, var456);
                        if (var456.field769 == 0) {
                            class18.method135(var456, 0, false);
                        }
                        continue;
                    }
                } else if (!(var488 < 1100 || var488 >= 1200) || !(var488 < 2100 || var488 >= 2200)) {
                    class43 var453;
                    if (var488 < 2000) {
                        var453 = var47 ? class248.field4458 : class274.field4875;
                    } else {
                        var488 -= 1000;
                        var6--;
                        var453 = class27.method186(1341, class51.field1010[var6]);
                    }
                    if (var488 == 1100) {
                        var6 -= 2;
                        var453.field879 = class51.field1010[var6];
                        if ((var453.field765 - var453.field735) < var453.field879) {
                            var453.field879 = var453.field765 - var453.field735;
                        }
                        if (var453.field879 < 0) {
                            var453.field879 = 0;
                        }
                        var453.field882 = class51.field1010[var6 + 1];
                        if (var453.field732 - var453.field831 < var453.field882) {
                            var453.field882 = var453.field732 - var453.field831;
                        }
                        if (var453.field882 < 0) {
                            var453.field882 = 0;
                        }
                        class141.method844((byte) -123, var453);
                        if (var453.field719 == -1) {
                            class251.method1665(19550, var453.field722);
                        }
                        continue;
                    }
                    if (var488 == 1101) {
                        var6--;
                        var453.field773 = class51.field1010[var6];
                        class141.method844((byte) 87, var453);
                        if (var453.field719 == -1) {
                            class36.method242(var453.field722, 3084);
                        }
                        continue;
                    }
                    if (var488 == 1102) {
                        var6--;
                        var453.field725 = class51.field1010[var6] == 1;
                        class141.method844((byte) -36, var453);
                        continue;
                    }
                    if (var488 == 1103) {
                        var6--;
                        var453.field818 = class51.field1010[var6];
                        class141.method844((byte) -54, var453);
                        continue;
                    }
                    if (var488 == 1104) {
                        var6--;
                        var453.field793 = class51.field1010[var6];
                        class141.method844((byte) -128, var453);
                        continue;
                    }
                    if (var488 == 1105) {
                        var6--;
                        var453.field746 = class51.field1010[var6];
                        class141.method844((byte) -127, var453);
                        continue;
                    }
                    if (var488 == 1106) {
                        var6--;
                        var453.field734 = class51.field1010[var6];
                        class141.method844((byte) -124, var453);
                        continue;
                    }
                    if (var488 == 1107) {
                        var6--;
                        var453.field749 = class51.field1010[var6] == 1;
                        class141.method844((byte) 117, var453);
                        continue;
                    }
                    if (var488 == 1108) {
                        var453.field785 = 1;
                        var6--;
                        var453.field755 = class51.field1010[var6];
                        class141.method844((byte) -46, var453);
                        if (var453.field719 == -1) {
                            class36.method237(var453.field722, 2020);
                        }
                        continue;
                    }
                    if (var488 == 1109) {
                        var6 -= 6;
                        var453.field808 = class51.field1010[var6];
                        var453.field860 = class51.field1010[var6 + 1];
                        var453.field854 = class51.field1010[var6 + 2];
                        var453.field830 = class51.field1010[var6 + 3];
                        var453.field757 = class51.field1010[var6 + 4];
                        var453.field869 = class51.field1010[var6 + 5];
                        class141.method844((byte) -121, var453);
                        if (var453.field719 == -1) {
                            class277.method1822(var453.field722, 0);
                            class182.method1185(var453.field722, (byte) 28);
                        }
                        continue;
                    }
                    if (var488 == 1110) {
                        var6--;
                        int var454 = class51.field1010[var6];
                        if (var453.field853 != var454) {
                            var453.field780 = 0;
                            var453.field884 = 0;
                            var453.field853 = var454;
                            class141.method844((byte) -124, var453);
                        }
                        if (var453.field719 == -1) {
                            class128.method773(var453.field722, false);
                        }
                        continue;
                    }
                    if (var488 == 1111) {
                        var6--;
                        var453.field843 = class51.field1010[var6] == 1;
                        class141.method844((byte) -120, var453);
                        continue;
                    }
                    if (var488 == 1112) {
                        var7--;
                        class143 var455 = class170.field3029[var7];
                        if (!var455.method876((byte) -122, var453.field723)) {
                            var453.field723 = var455;
                            class141.method844((byte) 56, var453);
                        }
                        if (var453.field719 == -1) {
                            class219.method1498((byte) -36, var453.field722);
                        }
                        continue;
                    }
                    if (var488 == 1113) {
                        var6--;
                        var453.field775 = class51.field1010[var6];
                        class141.method844((byte) -123, var453);
                        continue;
                    }
                    if (var488 == 1114) {
                        var6 -= 3;
                        var453.field753 = class51.field1010[var6];
                        var453.field868 = class51.field1010[var6 + 1];
                        var453.field838 = class51.field1010[var6 + 2];
                        class141.method844((byte) -126, var453);
                        continue;
                    }
                    if (var488 == 1115) {
                        var6--;
                        var453.field814 = class51.field1010[var6] == 1;
                        class141.method844((byte) -125, var453);
                        continue;
                    }
                    if (var488 == 1116) {
                        var6--;
                        var453.field806 = class51.field1010[var6];
                        class141.method844((byte) -51, var453);
                        continue;
                    }
                    if (var488 == 1117) {
                        var6--;
                        var453.field784 = class51.field1010[var6];
                        class141.method844((byte) -120, var453);
                        continue;
                    }
                    if (var488 == 1118) {
                        var6--;
                        var453.field724 = class51.field1010[var6] == 1;
                        class141.method844((byte) 40, var453);
                        continue;
                    }
                    if (var488 == 1119) {
                        var6--;
                        var453.field835 = class51.field1010[var6] == 1;
                        class141.method844((byte) -128, var453);
                        continue;
                    }
                    if (var488 == 1120) {
                        var6 -= 2;
                        var453.field765 = class51.field1010[var6];
                        var453.field732 = class51.field1010[var6 + 1];
                        class141.method844((byte) -121, var453);
                        if (var453.field769 == 0) {
                            class18.method135(var453, 0, false);
                        }
                        continue;
                    }
                    if (var488 == 1121) {
                        var6 -= 2;
                        class141.method844((byte) -121, var453);
                        continue;
                    }
                    if (var488 == 1122) {
                        var6--;
                        var453.field834 = class51.field1010[var6] == 1;
                        class141.method844((byte) -119, var453);
                        continue;
                    }
                    if (var488 == 1123) {
                        var6--;
                        var453.field869 = class51.field1010[var6];
                        class141.method844((byte) -123, var453);
                        if (var453.field719 == -1) {
                            class277.method1822(var453.field722, 0);
                        }
                        continue;
                    }
                } else if (var488 >= 1200 && var488 < 1300 || var488 >= 2200 && var488 < 2300) {
                    class43 var449;
                    if (var488 < 2000) {
                        var449 = var47 ? class248.field4458 : class274.field4875;
                    } else {
                        var6--;
                        var449 = class27.method186(1341, class51.field1010[var6]);
                        var488 -= 1000;
                    }
                    class141.method844((byte) -122, var449);
                    if (var488 == 1200 || var488 == 1205) {
                        var6 -= 2;
                        int var450 = class51.field1010[var6];
                        int var451 = class51.field1010[var6 + 1];
                        if (var449.field719 == -1) {
                            class144.method915((byte) 37, var449.field722);
                            class277.method1822(var449.field722, 0);
                            class182.method1185(var449.field722, (byte) 100);
                        }
                        if (var450 == -1) {
                            var449.field755 = -1;
                            var449.field851 = -1;
                            var449.field785 = 1;
                        } else {
                            var449.field851 = var450;
                            var449.field801 = var451;
                            class148 var452 = class262.method1743(var450, 17366);
                            var449.field869 = var452.field2669;
                            if (var488 == 1205) {
                                var449.field764 = false;
                            } else {
                                var449.field764 = true;
                            }
                            var449.field830 = var452.field2728;
                            var449.field757 = var452.field2665;
                            var449.field860 = var452.field2732;
                            var449.field854 = var452.field2668;
                            var449.field808 = var452.field2676;
                            if (var449.field829 > 0) {
                                var449.field869 = var449.field869 * 32 / var449.field829;
                            } else if (var449.field739 > 0) {
                                var449.field869 = var449.field869 * 32 / var449.field739;
                            }
                        }
                        continue;
                    }
                    if (var488 == 1201) {
                        var449.field785 = 2;
                        var6--;
                        var449.field755 = class51.field1010[var6];
                        if (var449.field719 == -1) {
                            class36.method237(var449.field722, 2020);
                        }
                        continue;
                    }
                    if (var488 == 1202) {
                        var449.field785 = 3;
                        var449.field755 = class229.field4195.field516.method681(true);
                        if (var449.field719 == -1) {
                            class36.method237(var449.field722, 2020);
                        }
                        continue;
                    }
                    if (var488 == 1203) {
                        var449.field785 = 6;
                        var6--;
                        var449.field755 = class51.field1010[var6];
                        if (var449.field719 == -1) {
                            class36.method237(var449.field722, 2020);
                        }
                        continue;
                    }
                    if (var488 == 1204) {
                        var449.field785 = 5;
                        var6--;
                        var449.field755 = class51.field1010[var6];
                        if (var449.field719 == -1) {
                            class36.method237(var449.field722, 2020);
                        }
                        continue;
                    }
                } else if ((var488 < 1300 || var488 >= 1400) && (var488 < 2300 || var488 >= 2400)) {
                    if (var488 >= 1400 && var488 < 1500 || var488 >= 2400 && var488 < 2500) {
                        class43 var52;
                        if (var488 >= 2000) {
                            var488 -= 1000;
                            var6--;
                            var52 = class27.method186(1341, class51.field1010[var6]);
                        } else {
                            var52 = var47 ? class248.field4458 : class274.field4875;
                        }
                        var7--;
                        class143 var53 = class170.field3029[var7];
                        int[] var54 = null;
                        if (var53.method913((byte) 45) > 0 && var53.method897(255, var53.method913((byte) 45) - 1) == 89) {
                            var6--;
                            int var55 = class51.field1010[var6];
                            if (var55 > 0) {
                                var54 = new int[var55];
                                while ((var55--) > 0) {
                                    var6--;
                                    var54[var55] = class51.field1010[var6];
                                }
                            }
                            var53 = var53.method896(var53.method913((byte) 45) - 1, 0, false);
                        }
                        Object[] var56 = new Object[var53.method913((byte) 45) + 1];
                        for (int var57 = var56.length - 1; var57 >= 1; var57--) {
                            if (var53.method897(255, var57 - 1) == 115) {
                                var7--;
                                var56[var57] = class170.field3029[var7];
                            } else {
                                var6--;
                                var56[var57] = Integer.valueOf(class51.field1010[var6]);
                            }
                        }
                        var6--;
                        int var58 = class51.field1010[var6];
                        if (var58 == -1) {
                            var56 = null;
                        } else {
                            var56[0] = Integer.valueOf(var58);
                        }
                        var52.field730 = true;
                        if (var488 == 1400) {
                            var52.field790 = var56;
                        } else if (var488 == 1401) {
                            var52.field825 = var56;
                        } else if (var488 == 1402) {
                            var52.field886 = var56;
                        } else if (var488 == 1403) {
                            var52.field856 = var56;
                        } else if (var488 == 1404) {
                            var52.field795 = var56;
                        } else if (var488 == 1405) {
                            var52.field796 = var56;
                        } else if (var488 == 1406) {
                            var52.field733 = var56;
                        } else if (var488 == 1407) {
                            var52.field867 = var56;
                            var52.field770 = var54;
                        } else if (var488 == 1408) {
                            var52.field836 = var56;
                        } else if (var488 == 1409) {
                            var52.field762 = var56;
                        } else if (var488 == 1410) {
                            var52.field855 = var56;
                        } else if (var488 == 1411) {
                            var52.field792 = var56;
                        } else if (var488 == 1412) {
                            var52.field713 = var56;
                        } else if (var488 == 1414) {
                            var52.field805 = var54;
                            var52.field883 = var56;
                        } else if (var488 == 1415) {
                            var52.field716 = var56;
                            var52.field877 = var54;
                        } else if (var488 == 1416) {
                            var52.field828 = var56;
                        } else if (var488 == 1417) {
                            var52.field720 = var56;
                        } else if (var488 == 1418) {
                            var52.field750 = var56;
                        } else if (var488 == 1419) {
                            var52.field890 = var56;
                        } else if (var488 == 1420) {
                            var52.field783 = var56;
                        } else if (var488 == 1421) {
                            var52.field714 = var56;
                        } else if (var488 == 1422) {
                            var52.field849 = var56;
                        } else if (var488 == 1423) {
                            var52.field760 = var56;
                        } else if (var488 == 1424) {
                            var52.field787 = var56;
                        } else if (var488 == 1425) {
                            var52.field870 = var56;
                        } else if (var488 == 1426) {
                            var52.field772 = var56;
                        } else if (var488 == 1427) {
                            var52.field711 = var56;
                        } else if (var488 == 1428) {
                            var52.field798 = var54;
                            var52.field864 = var56;
                        } else if (var488 == 1429) {
                            var52.field892 = var54;
                            var52.field817 = var56;
                        }
                        continue;
                    }
                    if (var488 < 1600) {
                        class43 var448 = var47 ? class248.field4458 : class274.field4875;
                        if (var488 == 1500) {
                            class51.field1010[var6++] = var448.field873;
                            continue;
                        }
                        if (var488 == 1501) {
                            class51.field1010[var6++] = var448.field748;
                            continue;
                        }
                        if (var488 == 1502) {
                            class51.field1010[var6++] = var448.field735;
                            continue;
                        }
                        if (var488 == 1503) {
                            class51.field1010[var6++] = var448.field831;
                            continue;
                        }
                        if (var488 == 1504) {
                            class51.field1010[var6++] = var448.field865 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 1505) {
                            class51.field1010[var6++] = var448.field789;
                            continue;
                        }
                    } else if (var488 < 1700) {
                        class43 var59 = var47 ? class248.field4458 : class274.field4875;
                        if (var488 == 1600) {
                            class51.field1010[var6++] = var59.field879;
                            continue;
                        }
                        if (var488 == 1601) {
                            class51.field1010[var6++] = var59.field882;
                            continue;
                        }
                        if (var488 == 1602) {
                            class170.field3029[var7++] = var59.field723;
                            continue;
                        }
                        if (var488 == 1603) {
                            class51.field1010[var6++] = var59.field765;
                            continue;
                        }
                        if (var488 == 1604) {
                            class51.field1010[var6++] = var59.field732;
                            continue;
                        }
                        if (var488 == 1605) {
                            class51.field1010[var6++] = var59.field869;
                            continue;
                        }
                        if (var488 == 1606) {
                            class51.field1010[var6++] = var59.field854;
                            continue;
                        }
                        if (var488 == 1607) {
                            class51.field1010[var6++] = var59.field757;
                            continue;
                        }
                        if (var488 == 1608) {
                            class51.field1010[var6++] = var59.field830;
                            continue;
                        }
                        if (var488 == 1609) {
                            class51.field1010[var6++] = var59.field818;
                            continue;
                        }
                        if (var488 == 1610) {
                            class51.field1010[var6++] = var59.field808;
                            continue;
                        }
                        if (var488 == 1611) {
                            class51.field1010[var6++] = var59.field860;
                            continue;
                        }
                    } else if (var488 < 1800) {
                        class43 var60 = var47 ? class248.field4458 : class274.field4875;
                        if (var488 == 1700) {
                            class51.field1010[var6++] = var60.field851;
                            continue;
                        }
                        if (var488 == 1701) {
                            if (var60.field851 == -1) {
                                class51.field1010[var6++] = 0;
                            } else {
                                class51.field1010[var6++] = var60.field801;
                            }
                            continue;
                        }
                        if (var488 == 1702) {
                            class51.field1010[var6++] = var60.field719;
                            continue;
                        }
                    } else if (var488 < 1900) {
                        class43 var446 = var47 ? class248.field4458 : class274.field4875;
                        if (var488 == 1800) {
                            class51.field1010[var6++] = class239.method1603(client.method1514(var446), true);
                            continue;
                        }
                        if (var488 == 1801) {
                            var6--;
                            int var447 = class51.field1010[var6];
                            int var490 = var447 - 1;
                            if (var446.field812 != null && var490 < var446.field812.length && var446.field812[var490] != null) {
                                class170.field3029[var7++] = var446.field812[var490];
                                continue;
                            }
                            class170.field3029[var7++] = class246.field4413;
                            continue;
                        }
                        if (var488 == 1802) {
                            if (var446.field800 == null) {
                                class170.field3029[var7++] = class246.field4413;
                            } else {
                                class170.field3029[var7++] = var446.field800;
                            }
                            continue;
                        }
                    } else if (var488 < 2600) {
                        var6--;
                        class43 var61 = class27.method186(1341, class51.field1010[var6]);
                        if (var488 == 2500) {
                            class51.field1010[var6++] = var61.field873;
                            continue;
                        }
                        if (var488 == 2501) {
                            class51.field1010[var6++] = var61.field748;
                            continue;
                        }
                        if (var488 == 2502) {
                            class51.field1010[var6++] = var61.field735;
                            continue;
                        }
                        if (var488 == 2503) {
                            class51.field1010[var6++] = var61.field831;
                            continue;
                        }
                        if (var488 == 2504) {
                            class51.field1010[var6++] = var61.field865 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 2505) {
                            class51.field1010[var6++] = var61.field789;
                            continue;
                        }
                    } else if (var488 < 2700) {
                        var6--;
                        class43 var445 = class27.method186(1341, class51.field1010[var6]);
                        if (var488 == 2600) {
                            class51.field1010[var6++] = var445.field879;
                            continue;
                        }
                        if (var488 == 2601) {
                            class51.field1010[var6++] = var445.field882;
                            continue;
                        }
                        if (var488 == 2602) {
                            class170.field3029[var7++] = var445.field723;
                            continue;
                        }
                        if (var488 == 2603) {
                            class51.field1010[var6++] = var445.field765;
                            continue;
                        }
                        if (var488 == 2604) {
                            class51.field1010[var6++] = var445.field732;
                            continue;
                        }
                        if (var488 == 2605) {
                            class51.field1010[var6++] = var445.field869;
                            continue;
                        }
                        if (var488 == 2606) {
                            class51.field1010[var6++] = var445.field854;
                            continue;
                        }
                        if (var488 == 2607) {
                            class51.field1010[var6++] = var445.field757;
                            continue;
                        }
                        if (var488 == 2608) {
                            class51.field1010[var6++] = var445.field830;
                            continue;
                        }
                        if (var488 == 2609) {
                            class51.field1010[var6++] = var445.field818;
                            continue;
                        }
                        if (var488 == 2610) {
                            class51.field1010[var6++] = var445.field808;
                            continue;
                        }
                        if (var488 == 2611) {
                            class51.field1010[var6++] = var445.field860;
                            continue;
                        }
                    } else if (var488 < 2800) {
                        if (var488 == 2700) {
                            var6--;
                            class43 var435 = class27.method186(1341, class51.field1010[var6]);
                            class51.field1010[var6++] = var435.field851;
                            continue;
                        }
                        if (var488 == 2701) {
                            var6--;
                            class43 var436 = class27.method186(1341, class51.field1010[var6]);
                            if (var436.field851 == -1) {
                                class51.field1010[var6++] = 0;
                            } else {
                                class51.field1010[var6++] = var436.field801;
                            }
                            continue;
                        }
                        if (var488 == 2702) {
                            var6--;
                            int var437 = class51.field1010[var6];
                            class163 var438 = (class163) class212.field3942.method1824((long) var437, 0);
                            if (var438 == null) {
                                class51.field1010[var6++] = 0;
                            } else {
                                class51.field1010[var6++] = 1;
                            }
                            continue;
                        }
                        if (var488 == 2703) {
                            var6--;
                            class43 var439 = class27.method186(1341, class51.field1010[var6]);
                            if (var439.field885 == null) {
                                class51.field1010[var6++] = 0;
                                continue;
                            }
                            int var440 = var439.field885.length;
                            for (int var441 = 0; var441 < var439.field885.length; var441++) {
                                if (var439.field885[var441] == null) {
                                    var440 = var441;
                                    break;
                                }
                            }
                            class51.field1010[var6++] = var440;
                            continue;
                        }
                        if (var488 == 2704 || var488 == 2705) {
                            var6 -= 2;
                            int var442 = class51.field1010[var6];
                            int var443 = class51.field1010[var6 + 1];
                            class163 var444 = (class163) class212.field3942.method1824((long) var442, 0);
                            if (var444 != null && var444.field2929 == var443) {
                                class51.field1010[var6++] = 1;
                                continue;
                            }
                            class51.field1010[var6++] = 0;
                            continue;
                        }
                    } else if (var488 < 2900) {
                        var6--;
                        class43 var62 = class27.method186(1341, class51.field1010[var6]);
                        if (var488 == 2800) {
                            class51.field1010[var6++] = class239.method1603(client.method1514(var62), true);
                            continue;
                        }
                        if (var488 == 2801) {
                            var6--;
                            int var63 = class51.field1010[var6];
                            int var489 = var63 - 1;
                            if (var62.field812 != null && var62.field812.length > var489 && var62.field812[var489] != null) {
                                class170.field3029[var7++] = var62.field812[var489];
                                continue;
                            }
                            class170.field3029[var7++] = class246.field4413;
                            continue;
                        }
                        if (var488 == 2802) {
                            if (var62.field800 == null) {
                                class170.field3029[var7++] = class246.field4413;
                            } else {
                                class170.field3029[var7++] = var62.field800;
                            }
                            continue;
                        }
                    } else if (var488 < 3200) {
                        if (var488 == 3100) {
                            var7--;
                            class143 var420 = class170.field3029[var7];
                            class170.method1119(class246.field4413, 4096, var420, 0);
                            continue;
                        }
                        if (var488 == 3101) {
                            var6 -= 2;
                            class176.method1160((byte) -91, class51.field1010[var6], class229.field4195, class51.field1010[var6 + 1]);
                            continue;
                        }
                        if (var488 == 3103) {
                            class116.method704((byte) -63);
                            continue;
                        }
                        if (var488 == 3104) {
                            var7--;
                            class143 var421 = class170.field3029[var7];
                            int var422 = 0;
                            class49.field956++;
                            if (var421.method904(-1)) {
                                var422 = var421.method887((byte) 122);
                            }
                            class285.field5010.method799(103, 137);
                            class285.field5010.method1280(-125, var422);
                            continue;
                        }
                        if (var488 == 3105) {
                            var7--;
                            class143 var423 = class170.field3029[var7];
                            class219.field3997++;
                            class285.field5010.method799(103, 225);
                            class285.field5010.method1243(var423.method874(7), 104);
                            continue;
                        }
                        if (var488 == 3106) {
                            class140.field2451++;
                            var7--;
                            class143 var424 = class170.field3029[var7];
                            class285.field5010.method799(103, 30);
                            class285.field5010.method1276(844519173, var424.method913((byte) 45) + 1);
                            class285.field5010.method1255(var424, (byte) 0);
                            continue;
                        }
                        if (var488 == 3107) {
                            var6--;
                            int var425 = class51.field1010[var6];
                            var7--;
                            class143 var426 = class170.field3029[var7];
                            class258.method1707(24534, var426, var425);
                            continue;
                        }
                        if (var488 == 3108) {
                            var6 -= 3;
                            int var427 = class51.field1010[var6];
                            int var428 = class51.field1010[var6 + 2];
                            int var429 = class51.field1010[var6 + 1];
                            class43 var430 = class27.method186(1341, var428);
                            class164.method1085(var429, true, var430, var427);
                            continue;
                        }
                        if (var488 == 3109) {
                            var6 -= 2;
                            int var431 = class51.field1010[var6];
                            int var432 = class51.field1010[var6 + 1];
                            class43 var433 = var47 ? class248.field4458 : class274.field4875;
                            class164.method1085(var432, true, var433, var431);
                            continue;
                        }
                        if (var488 == 3110) {
                            class152.field2757++;
                            var6--;
                            int var434 = class51.field1010[var6];
                            class285.field5010.method799(103, 88);
                            class285.field5010.method1278(var434, (byte) 108);
                            continue;
                        }
                    } else if (var488 < 3300) {
                        if (var488 == 3200) {
                            var6 -= 3;
                            class190.method1273(class51.field1010[var6], (byte) 103, class51.field1010[var6 + 2], class51.field1010[var6 + 1]);
                            continue;
                        }
                        if (var488 == 3201) {
                            var6--;
                            class265.method1768(class51.field1010[var6], -16422);
                            continue;
                        }
                        if (var488 == 3202) {
                            var6 -= 2;
                            class279.method1843(class51.field1010[var6], 0, class51.field1010[var6 + 1]);
                            continue;
                        }
                    } else if (var488 < 3400) {
                        if (var488 == 3300) {
                            class51.field1010[var6++] = field2635;
                            continue;
                        }
                        if (var488 == 3301) {
                            var6 -= 2;
                            int var64 = class51.field1010[var6];
                            int var65 = class51.field1010[var6 + 1];
                            class51.field1010[var6++] = class23.method163(var64, var65, (byte) -122);
                            continue;
                        }
                        if (var488 == 3302) {
                            var6 -= 2;
                            int var66 = class51.field1010[var6 + 1];
                            int var67 = class51.field1010[var6];
                            class51.field1010[var6++] = class124.method748(-8128, var66, var67);
                            continue;
                        }
                        if (var488 == 3303) {
                            var6 -= 2;
                            int var68 = class51.field1010[var6];
                            int var69 = class51.field1010[var6 + 1];
                            class51.field1010[var6++] = class134.method808((byte) -29, var68, var69);
                            continue;
                        }
                        if (var488 == 3304) {
                            var6--;
                            int var70 = class51.field1010[var6];
                            class51.field1010[var6++] = class5.method25(125, var70).field2763;
                            continue;
                        }
                        if (var488 == 3305) {
                            var6--;
                            int var71 = class51.field1010[var6];
                            class51.field1010[var6++] = class224.field4067[var71];
                            continue;
                        }
                        if (var488 == 3306) {
                            var6--;
                            int var72 = class51.field1010[var6];
                            class51.field1010[var6++] = class221.field4002[var72];
                            continue;
                        }
                        if (var488 == 3307) {
                            var6--;
                            int var73 = class51.field1010[var6];
                            class51.field1010[var6++] = class259.field4647[var73];
                            continue;
                        }
                        if (var488 == 3308) {
                            int var74 = class170.field3044;
                            int var75 = (class229.field4195.field4178 >> 7) + class148.field2733;
                            int var76 = (class229.field4195.field4108 >> 7) + class141.field2466;
                            class51.field1010[var6++] = (var74 << 28) + ((var75 << 14) + var76);
                            continue;
                        }
                        if (var488 == 3309) {
                            var6--;
                            int var77 = class51.field1010[var6];
                            class51.field1010[var6++] = class129.method777(var77 >> 14, 16383);
                            continue;
                        }
                        if (var488 == 3310) {
                            var6--;
                            int var78 = class51.field1010[var6];
                            class51.field1010[var6++] = var78 >> 28;
                            continue;
                        }
                        if (var488 == 3311) {
                            var6--;
                            int var79 = class51.field1010[var6];
                            class51.field1010[var6++] = class129.method777(var79, 16383);
                            continue;
                        }
                        if (var488 == 3312) {
                            class51.field1010[var6++] = class110.field1943 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 3313) {
                            var6 -= 2;
                            int var80 = class51.field1010[var6 + 1];
                            int var81 = class51.field1010[var6] + 32768;
                            class51.field1010[var6++] = class23.method163(var81, var80, (byte) -120);
                            continue;
                        }
                        if (var488 == 3314) {
                            var6 -= 2;
                            int var82 = class51.field1010[var6] + 32768;
                            int var83 = class51.field1010[var6 + 1];
                            class51.field1010[var6++] = class124.method748(-8128, var83, var82);
                            continue;
                        }
                        if (var488 == 3315) {
                            var6 -= 2;
                            int var84 = class51.field1010[var6] + 32768;
                            int var85 = class51.field1010[var6 + 1];
                            class51.field1010[var6++] = class134.method808((byte) -29, var84, var85);
                            continue;
                        }
                        if (var488 == 3316) {
                            if (class162.field2914 < 2) {
                                class51.field1010[var6++] = 0;
                            } else {
                                class51.field1010[var6++] = class162.field2914;
                            }
                            continue;
                        }
                        if (var488 == 3317) {
                            class51.field1010[var6++] = class88.field1605;
                            continue;
                        }
                        if (var488 == 3318) {
                            class51.field1010[var6++] = class23.field380;
                            continue;
                        }
                        if (var488 == 3321) {
                            class51.field1010[var6++] = class43.field858;
                            continue;
                        }
                        if (var488 == 3322) {
                            class51.field1010[var6++] = class167.field2980;
                            continue;
                        }
                        if (var488 == 3323) {
                            if (class42.field709 >= 5 && class42.field709 <= 9) {
                                class51.field1010[var6++] = 1;
                                continue;
                            }
                            class51.field1010[var6++] = 0;
                            continue;
                        }
                        if (var488 == 3324) {
                            if (class42.field709 >= 5 && class42.field709 <= 9) {
                                class51.field1010[var6++] = class42.field709;
                                continue;
                            }
                            class51.field1010[var6++] = 0;
                            continue;
                        }
                        if (var488 == 3325) {
                            class51.field1010[var6++] = class168.field2998 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 3326) {
                            class51.field1010[var6++] = class229.field4195.field510;
                            continue;
                        }
                        if (var488 == 3327) {
                            class51.field1010[var6++] = class229.field4195.field516.field1987 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 3328) {
                            class51.field1010[var6++] = class106.field1875 && !class71.field1346 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 3329) {
                            class51.field1010[var6++] = class267.field4789 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 3330) {
                            var6--;
                            int var86 = class51.field1010[var6];
                            class51.field1010[var6++] = class72.method419(var86, 5236);
                            continue;
                        }
                        if (var488 == 3331) {
                            var6 -= 2;
                            int var87 = class51.field1010[var6];
                            int var88 = class51.field1010[var6 + 1];
                            class51.field1010[var6++] = class22.method154(var88, var87, false, 60);
                            continue;
                        }
                        if (var488 == 3332) {
                            var6 -= 2;
                            int var89 = class51.field1010[var6 + 1];
                            int var90 = class51.field1010[var6];
                            class51.field1010[var6++] = class22.method154(var89, var90, true, 60);
                            continue;
                        }
                        if (var488 == 3333) {
                            class51.field1010[var6++] = class273.field4866;
                            continue;
                        }
                        if (var488 == 3335) {
                            class51.field1010[var6++] = class141.field2467;
                            continue;
                        }
                    } else if (var488 < 3500) {
                        if (var488 == 3400) {
                            var6 -= 2;
                            int var91 = class51.field1010[var6];
                            int var92 = class51.field1010[var6 + 1];
                            class9 var93 = class195.method1342(var91, false);
                            class170.field3029[var7++] = var93.method75(var92, (byte) 12);
                            continue;
                        }
                        if (var488 == 3408) {
                            var6 -= 4;
                            int var94 = class51.field1010[var6];
                            int var95 = class51.field1010[var6 + 1];
                            int var96 = class51.field1010[var6 + 2];
                            int var97 = class51.field1010[var6 + 3];
                            class9 var98 = class195.method1342(var96, false);
                            if (var98.field177 == var94 && var98.field180 == var95) {
                                if (var95 == 115) {
                                    class170.field3029[var7++] = var98.method75(var97, (byte) 12);
                                } else {
                                    class51.field1010[var6++] = var98.method77(var97, true);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var488 == 3409) {
                            var6 -= 3;
                            int var99 = class51.field1010[var6];
                            int var100 = class51.field1010[var6 + 1];
                            int var101 = class51.field1010[var6 + 2];
                            if (var100 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class9 var102 = class195.method1342(var100, false);
                            if (var102.field180 != var99) {
                                throw new RuntimeException("C3409-1");
                            }
                            class51.field1010[var6++] = var102.method76(-21266, var101) ? 1 : 0;
                            continue;
                        }
                        if (var488 == 3410) {
                            var7--;
                            class143 var103 = class170.field3029[var7];
                            var6--;
                            int var104 = class51.field1010[var6];
                            if (var104 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class9 var105 = class195.method1342(var104, false);
                            if (var105.field180 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class51.field1010[var6++] = var105.method79(32399, var103) ? 1 : 0;
                            continue;
                        }
                        if (var488 == 3411) {
                            var6--;
                            int var106 = class51.field1010[var6];
                            class9 var107 = class195.method1342(var106, false);
                            class51.field1010[var6++] = var107.field175.method1823((byte) 109);
                            continue;
                        }
                    } else if (var488 < 3700) {
                        if (var488 == 3600) {
                            if (class170.field3023 == 0) {
                                class51.field1010[var6++] = -2;
                            } else if (class170.field3023 == 1) {
                                class51.field1010[var6++] = -1;
                            } else {
                                class51.field1010[var6++] = class25.field421;
                            }
                            continue;
                        }
                        if (var488 == 3601) {
                            var6--;
                            int var398 = class51.field1010[var6];
                            if (class170.field3023 == 2 && var398 < class25.field421) {
                                class170.field3029[var7++] = class237.field4305[var398];
                                continue;
                            }
                            class170.field3029[var7++] = class246.field4413;
                            continue;
                        }
                        if (var488 == 3602) {
                            var6--;
                            int var399 = class51.field1010[var6];
                            if (class170.field3023 == 2 && class25.field421 > var399) {
                                class51.field1010[var6++] = class129.field2291[var399];
                                continue;
                            }
                            class51.field1010[var6++] = 0;
                            continue;
                        }
                        if (var488 == 3603) {
                            var6--;
                            int var400 = class51.field1010[var6];
                            if (class170.field3023 == 2 && var400 < class25.field421) {
                                class51.field1010[var6++] = class188.field3397[var400];
                                continue;
                            }
                            class51.field1010[var6++] = 0;
                            continue;
                        }
                        if (var488 == 3604) {
                            var7--;
                            class143 var401 = class170.field3029[var7];
                            var6--;
                            int var402 = class51.field1010[var6];
                            class86.method502(var401, 168, var402);
                            continue;
                        }
                        if (var488 == 3605) {
                            var7--;
                            class143 var403 = class170.field3029[var7];
                            class51.method314(false, var403.method874(7));
                            continue;
                        }
                        if (var488 == 3606) {
                            var7--;
                            class143 var404 = class170.field3029[var7];
                            class129.method779(var404.method874(7), (byte) 79);
                            continue;
                        }
                        if (var488 == 3607) {
                            var7--;
                            class143 var405 = class170.field3029[var7];
                            class285.method1872((byte) 127, var405.method874(7));
                            continue;
                        }
                        if (var488 == 3608) {
                            var7--;
                            class143 var406 = class170.field3029[var7];
                            class186.method1213(var406.method874(7), 0);
                            continue;
                        }
                        if (var488 == 3609) {
                            var7--;
                            class143 var407 = class170.field3029[var7];
                            if (var407.method903(class276.field4882, 13544) || var407.method903(class111.field1960, 13544)) {
                                var407 = var407.method863(7, -161);
                            }
                            class51.field1010[var6++] = class271.method1788((byte) -120, var407) ? 1 : 0;
                            continue;
                        }
                        if (var488 == 3610) {
                            var6--;
                            int var408 = class51.field1010[var6];
                            if (class170.field3023 == 2 && class25.field421 > var408) {
                                class170.field3029[var7++] = class255.field4594[var408];
                                continue;
                            }
                            class170.field3029[var7++] = class246.field4413;
                            continue;
                        }
                        if (var488 == 3611) {
                            if (class37.field634 == null) {
                                class170.field3029[var7++] = class246.field4413;
                            } else {
                                class170.field3029[var7++] = class37.field634.method878(-28102);
                            }
                            continue;
                        }
                        if (var488 == 3612) {
                            if (class37.field634 == null) {
                                class51.field1010[var6++] = 0;
                            } else {
                                class51.field1010[var6++] = class30.field479;
                            }
                            continue;
                        }
                        if (var488 == 3613) {
                            var6--;
                            int var409 = class51.field1010[var6];
                            if (class37.field634 != null && var409 < class30.field479) {
                                class170.field3029[var7++] = class120.field2113[var409].field423.method878(-28102);
                                continue;
                            }
                            class170.field3029[var7++] = class246.field4413;
                            continue;
                        }
                        if (var488 == 3614) {
                            var6--;
                            int var410 = class51.field1010[var6];
                            if (class37.field634 != null && class30.field479 > var410) {
                                class51.field1010[var6++] = class120.field2113[var410].field424;
                                continue;
                            }
                            class51.field1010[var6++] = 0;
                            continue;
                        }
                        if (var488 == 3615) {
                            var6--;
                            int var411 = class51.field1010[var6];
                            if (class37.field634 != null && var411 < class30.field479) {
                                class51.field1010[var6++] = class120.field2113[var411].field419;
                                continue;
                            }
                            class51.field1010[var6++] = 0;
                            continue;
                        }
                        if (var488 == 3616) {
                            class51.field1010[var6++] = class76.field1407;
                            continue;
                        }
                        if (var488 == 3617) {
                            var7--;
                            class143 var412 = class170.field3029[var7];
                            class4.method14(var412, -100);
                            continue;
                        }
                        if (var488 == 3618) {
                            class51.field1010[var6++] = class44.field897;
                            continue;
                        }
                        if (var488 == 3619) {
                            var7--;
                            class143 var413 = class170.field3029[var7];
                            class18.method136(var413.method874(7), (byte) -86);
                            continue;
                        }
                        if (var488 == 3620) {
                            class195.method1348((byte) -87);
                            continue;
                        }
                        if (var488 == 3621) {
                            if (class170.field3023 == 0) {
                                class51.field1010[var6++] = -1;
                            } else {
                                class51.field1010[var6++] = class184.field3338;
                            }
                            continue;
                        }
                        if (var488 == 3622) {
                            var6--;
                            int var414 = class51.field1010[var6];
                            if (class170.field3023 != 0 && class184.field3338 > var414) {
                                class170.field3029[var7++] = class64.method364((byte) 97, class255.field4585[var414]).method878(-28102);
                                continue;
                            }
                            class170.field3029[var7++] = class246.field4413;
                            continue;
                        }
                        if (var488 == 3623) {
                            var7--;
                            class143 var415 = class170.field3029[var7];
                            if (var415.method903(class276.field4882, 13544) || var415.method903(class111.field1960, 13544)) {
                                var415 = var415.method863(7, -161);
                            }
                            class51.field1010[var6++] = class110.method658(var415, false) ? 1 : 0;
                            continue;
                        }
                        if (var488 == 3624) {
                            var6--;
                            int var416 = class51.field1010[var6];
                            if (class120.field2113 != null && var416 < class30.field479 && class120.field2113[var416].field423.method895((byte) -90, class229.field4195.field518)) {
                                class51.field1010[var6++] = 1;
                                continue;
                            }
                            class51.field1010[var6++] = 0;
                            continue;
                        }
                        if (var488 == 3625) {
                            if (class147.field2662 == null) {
                                class170.field3029[var7++] = class246.field4413;
                            } else {
                                class170.field3029[var7++] = class147.field2662.method878(-28102);
                            }
                            continue;
                        }
                        if (var488 == 3626) {
                            var6--;
                            int var417 = class51.field1010[var6];
                            if (class37.field634 != null && var417 < class30.field479) {
                                class170.field3029[var7++] = class120.field2113[var417].field425;
                                continue;
                            }
                            class170.field3029[var7++] = class246.field4413;
                            continue;
                        }
                        if (var488 == 3627) {
                            var6--;
                            int var418 = class51.field1010[var6];
                            if (class170.field3023 == 2 && var418 >= 0 && class25.field421 > var418) {
                                class51.field1010[var6++] = class269.field4818[var418] ? 1 : 0;
                                continue;
                            }
                            class51.field1010[var6++] = 0;
                            continue;
                        }
                        if (var488 == 3628) {
                            var7--;
                            class143 var419 = class170.field3029[var7];
                            if (var419.method903(class276.field4882, 13544) || var419.method903(class111.field1960, 13544)) {
                                var419 = var419.method863(7, -161);
                            }
                            class51.field1010[var6++] = class39.method257(var419, 96);
                            continue;
                        }
                        if (var488 == 3629) {
                            class51.field1010[var6++] = class267.field4792;
                            continue;
                        }
                    } else if (var488 < 4000) {
                        if (var488 == 3903) {
                            var6--;
                            int var384 = class51.field1010[var6];
                            class51.field1010[var6++] = class34.field594[var384].method1121(4);
                            continue;
                        }
                        if (var488 == 3904) {
                            var6--;
                            int var385 = class51.field1010[var6];
                            class51.field1010[var6++] = class34.field594[var385].field3059;
                            continue;
                        }
                        if (var488 == 3905) {
                            var6--;
                            int var386 = class51.field1010[var6];
                            class51.field1010[var6++] = class34.field594[var386].field3048;
                            continue;
                        }
                        if (var488 == 3906) {
                            var6--;
                            int var387 = class51.field1010[var6];
                            class51.field1010[var6++] = class34.field594[var387].field3058;
                            continue;
                        }
                        if (var488 == 3907) {
                            var6--;
                            int var388 = class51.field1010[var6];
                            class51.field1010[var6++] = class34.field594[var388].field3050;
                            continue;
                        }
                        if (var488 == 3908) {
                            var6--;
                            int var389 = class51.field1010[var6];
                            class51.field1010[var6++] = class34.field594[var389].field3051;
                            continue;
                        }
                        if (var488 == 3910) {
                            var6--;
                            int var390 = class51.field1010[var6];
                            int var391 = class34.field594[var390].method1123(-31317);
                            class51.field1010[var6++] = var391 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 3911) {
                            var6--;
                            int var392 = class51.field1010[var6];
                            int var393 = class34.field594[var392].method1123(-31317);
                            class51.field1010[var6++] = var393 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 3912) {
                            var6--;
                            int var394 = class51.field1010[var6];
                            int var395 = class34.field594[var394].method1123(-31317);
                            class51.field1010[var6++] = var395 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 3913) {
                            var6--;
                            int var396 = class51.field1010[var6];
                            int var397 = class34.field594[var396].method1123(-31317);
                            class51.field1010[var6++] = var397 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var488 < 4100) {
                        if (var488 == 4000) {
                            var6 -= 2;
                            int var108 = class51.field1010[var6];
                            int var109 = class51.field1010[var6 + 1];
                            class51.field1010[var6++] = var108 + var109;
                            continue;
                        }
                        if (var488 == 4001) {
                            var6 -= 2;
                            int var110 = class51.field1010[var6];
                            int var111 = class51.field1010[var6 + 1];
                            class51.field1010[var6++] = var110 - var111;
                            continue;
                        }
                        if (var488 == 4002) {
                            var6 -= 2;
                            int var112 = class51.field1010[var6];
                            int var113 = class51.field1010[var6 + 1];
                            class51.field1010[var6++] = var112 * var113;
                            continue;
                        }
                        if (var488 == 4003) {
                            var6 -= 2;
                            int var114 = class51.field1010[var6 + 1];
                            int var115 = class51.field1010[var6];
                            class51.field1010[var6++] = var115 / var114;
                            continue;
                        }
                        if (var488 == 4004) {
                            var6--;
                            int var116 = class51.field1010[var6];
                            class51.field1010[var6++] = (int) ((double) var116 * Math.random());
                            continue;
                        }
                        if (var488 == 4005) {
                            var6--;
                            int var117 = class51.field1010[var6];
                            class51.field1010[var6++] = (int) ((double) (var117 + 1) * Math.random());
                            continue;
                        }
                        if (var488 == 4006) {
                            var6 -= 5;
                            int var118 = class51.field1010[var6 + 1];
                            int var119 = class51.field1010[var6];
                            int var120 = class51.field1010[var6 + 2];
                            int var121 = class51.field1010[var6 + 3];
                            int var122 = class51.field1010[var6 + 4];
                            class51.field1010[var6++] = (var118 - var119) * (var122 - var120) / (var121 - var120) + var119;
                            continue;
                        }
                        if (var488 == 4007) {
                            var6 -= 2;
                            long var123 = (long) class51.field1010[var6];
                            long var125 = (long) class51.field1010[var6 + 1];
                            class51.field1010[var6++] = (int) (var123 * var125 / 100L + var123);
                            continue;
                        }
                        if (var488 == 4008) {
                            var6 -= 2;
                            int var127 = class51.field1010[var6];
                            int var128 = class51.field1010[var6 + 1];
                            class51.field1010[var6++] = class119.method729(0x1 << var128, var127);
                            continue;
                        }
                        if (var488 == 4009) {
                            var6 -= 2;
                            int var129 = class51.field1010[var6];
                            int var130 = class51.field1010[var6 + 1];
                            class51.field1010[var6++] = class129.method777(-(0x1 << var130) - 1, var129);
                            continue;
                        }
                        if (var488 == 4010) {
                            var6 -= 2;
                            int var131 = class51.field1010[var6];
                            int var132 = class51.field1010[var6 + 1];
                            class51.field1010[var6++] = class129.method777(0x1 << var132, var131) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var488 == 4011) {
                            var6 -= 2;
                            int var133 = class51.field1010[var6];
                            int var134 = class51.field1010[var6 + 1];
                            class51.field1010[var6++] = var133 % var134;
                            continue;
                        }
                        if (var488 == 4012) {
                            var6 -= 2;
                            int var135 = class51.field1010[var6];
                            int var136 = class51.field1010[var6 + 1];
                            if (var135 == 0) {
                                class51.field1010[var6++] = 0;
                            } else {
                                class51.field1010[var6++] = (int) Math.pow((double) var135, (double) var136);
                            }
                            continue;
                        }
                        if (var488 == 4013) {
                            var6 -= 2;
                            int var137 = class51.field1010[var6];
                            int var138 = class51.field1010[var6 + 1];
                            if (var137 == 0) {
                                class51.field1010[var6++] = 0;
                            } else if (var138 == 0) {
                                class51.field1010[var6++] = Integer.MAX_VALUE;
                            } else {
                                class51.field1010[var6++] = (int) Math.pow((double) var137, 1.0D / (double) var138);
                            }
                            continue;
                        }
                        if (var488 == 4014) {
                            var6 -= 2;
                            int var139 = class51.field1010[var6];
                            int var140 = class51.field1010[var6 + 1];
                            class51.field1010[var6++] = class129.method777(var140, var139);
                            continue;
                        }
                        if (var488 == 4015) {
                            var6 -= 2;
                            int var141 = class51.field1010[var6];
                            int var142 = class51.field1010[var6 + 1];
                            class51.field1010[var6++] = class119.method729(var142, var141);
                            continue;
                        }
                        if (var488 == 4016) {
                            var6 -= 2;
                            int var143 = class51.field1010[var6 + 1];
                            int var144 = class51.field1010[var6];
                            class51.field1010[var6++] = var143 <= var144 ? var143 : var144;
                            continue;
                        }
                        if (var488 == 4017) {
                            var6 -= 2;
                            int var145 = class51.field1010[var6];
                            int var146 = class51.field1010[var6 + 1];
                            class51.field1010[var6++] = var146 < var145 ? var145 : var146;
                            continue;
                        }
                        if (var488 == 4018) {
                            var6 -= 3;
                            long var147 = (long) class51.field1010[var6];
                            long var149 = (long) class51.field1010[var6 + 1];
                            long var151 = (long) class51.field1010[var6 + 2];
                            class51.field1010[var6++] = (int) (var147 * var151 / var149);
                            continue;
                        }
                    } else if (var488 < 4200) {
                        if (var488 == 4100) {
                            var7--;
                            class143 var332 = class170.field3029[var7];
                            var6--;
                            int var333 = class51.field1010[var6];
                            class170.field3029[var7++] = class25.method179(0, new class143[] { var332, class274.method1806(var333, true) });
                            continue;
                        }
                        if (var488 == 4101) {
                            var7 -= 2;
                            class143 var334 = class170.field3029[var7];
                            class143 var335 = class170.field3029[var7 + 1];
                            class170.field3029[var7++] = class25.method179(0, new class143[] { var334, var335 });
                            continue;
                        }
                        if (var488 == 4102) {
                            var7--;
                            class143 var336 = class170.field3029[var7];
                            var6--;
                            int var337 = class51.field1010[var6];
                            class170.field3029[var7++] = class25.method179(0, new class143[] { var336, class139.method833(var337, 0, true) });
                            continue;
                        }
                        if (var488 == 4103) {
                            var7--;
                            class143 var338 = class170.field3029[var7];
                            class170.field3029[var7++] = var338.method868(-119);
                            continue;
                        }
                        if (var488 == 4104) {
                            var6--;
                            int var339 = class51.field1010[var6];
                            long var340 = (long) var339 * 86400000L + 1014768000000L;
                            class187.field3389.setTime(new Date(var340));
                            int var342 = class187.field3389.get(5);
                            int var343 = class187.field3389.get(2);
                            int var344 = class187.field3389.get(1);
                            class170.field3029[var7++] = class25.method179(0, new class143[] { class274.method1806(var342, true), class171.field3065, class55.field1070[var343], class171.field3065, class274.method1806(var344, true) });
                            continue;
                        }
                        if (var488 == 4105) {
                            var7 -= 2;
                            class143 var345 = class170.field3029[var7 + 1];
                            class143 var346 = class170.field3029[var7];
                            if (class229.field4195.field516 != null && class229.field4195.field516.field1987) {
                                class170.field3029[var7++] = var345;
                                continue;
                            }
                            class170.field3029[var7++] = var346;
                            continue;
                        }
                        if (var488 == 4106) {
                            var6--;
                            int var347 = class51.field1010[var6];
                            class170.field3029[var7++] = class274.method1806(var347, true);
                            continue;
                        }
                        if (var488 == 4107) {
                            var7 -= 2;
                            class51.field1010[var6++] = class170.field3029[var7].method901(class170.field3029[var7 + 1], (byte) -102);
                            continue;
                        }
                        if (var488 == 4108) {
                            var6 -= 2;
                            var7--;
                            class143 var348 = class170.field3029[var7];
                            int var349 = class51.field1010[var6 + 1];
                            int var350 = class51.field1010[var6];
                            byte[] var351 = class171.field3063.method41(-18328, var349, 0);
                            class213 var352 = new class213(var351);
                            var352.method1314(class9.field171, (int[]) null);
                            class51.field1010[var6++] = var352.method1307(var348, var350);
                            continue;
                        }
                        if (var488 == 4109) {
                            var6 -= 2;
                            var7--;
                            class143 var353 = class170.field3029[var7];
                            int var354 = class51.field1010[var6];
                            int var355 = class51.field1010[var6 + 1];
                            byte[] var356 = class171.field3063.method41(-18328, var355, 0);
                            class213 var357 = new class213(var356);
                            var357.method1314(class9.field171, (int[]) null);
                            class51.field1010[var6++] = var357.method1313(var353, var354);
                            continue;
                        }
                        if (var488 == 4110) {
                            var7 -= 2;
                            class143 var358 = class170.field3029[var7];
                            class143 var359 = class170.field3029[var7 + 1];
                            var6--;
                            if (class51.field1010[var6] == 1) {
                                class170.field3029[var7++] = var358;
                            } else {
                                class170.field3029[var7++] = var359;
                            }
                            continue;
                        }
                        if (var488 == 4111) {
                            var7--;
                            class143 var360 = class170.field3029[var7];
                            class170.field3029[var7++] = class193.method1310(var360);
                            continue;
                        }
                        if (var488 == 4112) {
                            var7--;
                            class143 var361 = class170.field3029[var7];
                            var6--;
                            int var362 = class51.field1010[var6];
                            if (var362 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class170.field3029[var7++] = var361.method866(var362, 8505);
                            continue;
                        }
                        if (var488 == 4113) {
                            var6--;
                            int var363 = class51.field1010[var6];
                            class51.field1010[var6++] = class27.method184((byte) -85, var363) ? 1 : 0;
                            continue;
                        }
                        if (var488 == 4114) {
                            var6--;
                            int var364 = class51.field1010[var6];
                            class51.field1010[var6++] = class276.method1817(true, var364) ? 1 : 0;
                            continue;
                        }
                        if (var488 == 4115) {
                            var6--;
                            int var365 = class51.field1010[var6];
                            class51.field1010[var6++] = class136.method818(var365, 54) ? 1 : 0;
                            continue;
                        }
                        if (var488 == 4116) {
                            var6--;
                            int var366 = class51.field1010[var6];
                            class51.field1010[var6++] = class27.method187(var366, 57) ? 1 : 0;
                            continue;
                        }
                        if (var488 == 4117) {
                            var7--;
                            class143 var367 = class170.field3029[var7];
                            if (var367 == null) {
                                class51.field1010[var6++] = 0;
                            } else {
                                class51.field1010[var6++] = var367.method913((byte) 45);
                            }
                            continue;
                        }
                        if (var488 == 4118) {
                            var6 -= 2;
                            var7--;
                            class143 var368 = class170.field3029[var7];
                            int var369 = class51.field1010[var6 + 1];
                            int var370 = class51.field1010[var6];
                            class170.field3029[var7++] = var368.method896(var369, var370, false);
                            continue;
                        }
                        if (var488 == 4119) {
                            var7--;
                            class143 var371 = class170.field3029[var7];
                            class143 var372 = class170.method1114(var371.method913((byte) 45), false);
                            boolean var373 = false;
                            for (int var374 = 0; var374 < var371.method913((byte) 45); var374++) {
                                int var375 = var371.method897(255, var374);
                                if (var375 == 60) {
                                    var373 = true;
                                } else if (var375 == 62) {
                                    var373 = false;
                                } else if (!var373) {
                                    var372.method898(var375, -15675);
                                }
                            }
                            var372.method908(0);
                            class170.field3029[var7++] = var372;
                            continue;
                        }
                        if (var488 == 4120) {
                            var7--;
                            class143 var376 = class170.field3029[var7];
                            var6 -= 2;
                            int var377 = class51.field1010[var6];
                            int var378 = class51.field1010[var6 + 1];
                            class51.field1010[var6++] = var376.method883(var378, 0, var377);
                            continue;
                        }
                        if (var488 == 4121) {
                            var7 -= 2;
                            var6--;
                            int var379 = class51.field1010[var6];
                            class143 var380 = class170.field3029[var7];
                            class143 var381 = class170.field3029[var7 + 1];
                            class51.field1010[var6++] = var380.method873(var379, var381, (byte) 109);
                            continue;
                        }
                        if (var488 == 4122) {
                            var6--;
                            int var382 = class51.field1010[var6];
                            class51.field1010[var6++] = class278.method1837((byte) -74, var382);
                            continue;
                        }
                        if (var488 == 4123) {
                            var6--;
                            int var383 = class51.field1010[var6];
                            class51.field1010[var6++] = class119.method732(97, var383);
                            continue;
                        }
                    } else if (var488 < 4300) {
                        if (var488 == 4200) {
                            var6--;
                            int var153 = class51.field1010[var6];
                            class170.field3029[var7++] = class262.method1743(var153, 17366).field2681;
                            continue;
                        }
                        if (var488 == 4201) {
                            var6 -= 2;
                            int var154 = class51.field1010[var6];
                            int var155 = class51.field1010[var6 + 1];
                            class148 var156 = class262.method1743(var154, 17366);
                            if (var155 >= 1 && var155 <= 5 && var156.field2700[var155 - 1] != null) {
                                class170.field3029[var7++] = var156.field2700[var155 - 1];
                                continue;
                            }
                            class170.field3029[var7++] = class246.field4413;
                            continue;
                        }
                        if (var488 == 4202) {
                            var6 -= 2;
                            int var157 = class51.field1010[var6];
                            int var158 = class51.field1010[var6 + 1];
                            class148 var159 = class262.method1743(var157, 17366);
                            if (var158 >= 1 && var158 <= 5 && var159.field2673[var158 - 1] != null) {
                                class170.field3029[var7++] = var159.field2673[var158 - 1];
                                continue;
                            }
                            class170.field3029[var7++] = class246.field4413;
                            continue;
                        }
                        if (var488 == 4203) {
                            var6--;
                            int var160 = class51.field1010[var6];
                            class51.field1010[var6++] = class262.method1743(var160, 17366).field2730;
                            continue;
                        }
                        if (var488 == 4204) {
                            var6--;
                            int var161 = class51.field1010[var6];
                            class51.field1010[var6++] = class262.method1743(var161, 17366).field2693 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 4205) {
                            var6--;
                            int var162 = class51.field1010[var6];
                            class148 var163 = class262.method1743(var162, 17366);
                            if (var163.field2713 == -1 && var163.field2715 >= 0) {
                                class51.field1010[var6++] = var163.field2715;
                                continue;
                            }
                            class51.field1010[var6++] = var162;
                            continue;
                        }
                        if (var488 == 4206) {
                            var6--;
                            int var164 = class51.field1010[var6];
                            class148 var165 = class262.method1743(var164, 17366);
                            if (var165.field2713 >= 0 && var165.field2715 >= 0) {
                                class51.field1010[var6++] = var165.field2715;
                                continue;
                            }
                            class51.field1010[var6++] = var164;
                            continue;
                        }
                        if (var488 == 4207) {
                            var6--;
                            int var166 = class51.field1010[var6];
                            class51.field1010[var6++] = class262.method1743(var166, 17366).field2679 ? 1 : 0;
                            continue;
                        }
                        if (var488 == 4208) {
                            var6 -= 2;
                            int var167 = class51.field1010[var6];
                            int var168 = class51.field1010[var6 + 1];
                            class112 var169 = class258.method1709(11, var168);
                            if (var169.method673(-2906)) {
                                class170.field3029[var7++] = class262.method1743(var167, 17366).method956(var168, (byte) -23, var169.field1968);
                            } else {
                                class51.field1010[var6++] = class262.method1743(var167, 17366).method950(-27161, var169.field1973, var168);
                            }
                            continue;
                        }
                        if (var488 == 4210) {
                            var7--;
                            class143 var170 = class170.field3029[var7];
                            var6--;
                            int var171 = class51.field1010[var6];
                            class101.method605(var171 == 1, var170, -1);
                            class51.field1010[var6++] = class30.field472;
                            continue;
                        }
                        if (var488 == 4211) {
                            if (class107.field1892 != null && class30.field472 > class24.field407) {
                                class51.field1010[var6++] = class129.method777(65535, class107.field1892[class24.field407++]);
                                continue;
                            }
                            class51.field1010[var6++] = -1;
                            continue;
                        }
                        if (var488 == 4212) {
                            class24.field407 = 0;
                            continue;
                        }
                    } else if (var488 < 4400) {
                        if (var488 == 4300) {
                            var6 -= 2;
                            int var172 = class51.field1010[var6 + 1];
                            int var173 = class51.field1010[var6];
                            class112 var174 = class258.method1709(11, var172);
                            if (var174.method673(-2906)) {
                                class170.field3029[var7++] = class154.method1018(-107, var173).method492(var174.field1968, 0, var172);
                            } else {
                                class51.field1010[var6++] = class154.method1018(-110, var173).method496(var172, var174.field1973, 3188);
                            }
                            continue;
                        }
                        if (var488 == 4301) {
                            var6--;
                            int var175 = class51.field1010[var6];
                            class51.field1010[var6++] = class154.method1018(104, var175).field1556;
                            continue;
                        }
                        if (var488 == 4302) {
                            var6--;
                            int var176 = class51.field1010[var6];
                            class51.field1010[var6++] = class154.method1018(56, var176).field1528;
                            continue;
                        }
                        if (var488 == 4303) {
                            var6--;
                            int var177 = class51.field1010[var6];
                            class51.field1010[var6++] = class154.method1018(11, var177).field1525;
                            continue;
                        }
                        if (var488 == 4304) {
                            var6--;
                            int var178 = class51.field1010[var6];
                            class51.field1010[var6++] = class154.method1018(98, var178).field1571;
                            continue;
                        }
                        if (var488 == 4305) {
                            var6--;
                            int var179 = class51.field1010[var6];
                            class51.field1010[var6++] = class154.method1018(-111, var179).field1551;
                            continue;
                        }
                        if (var488 == 4306) {
                            var6--;
                            int var180 = class51.field1010[var6];
                            class51.field1010[var6++] = class154.method1018(-126, var180).field1553;
                            continue;
                        }
                        if (var488 == 4307) {
                            var6--;
                            int var181 = class51.field1010[var6];
                            class51.field1010[var6++] = class154.method1018(-123, var181).field1519;
                            continue;
                        }
                    } else if (var488 >= 4500) {
                        if (var488 < 4600) {
                            if (var488 == 4500) {
                                var6 -= 2;
                                int var182 = class51.field1010[var6];
                                int var183 = class51.field1010[var6 + 1];
                                class112 var184 = class258.method1709(11, var183);
                                if (var184.method673(-2906)) {
                                    class170.field3029[var7++] = class14.method111(var182, -1).method1154(8471, var183, var184.field1968);
                                } else {
                                    class51.field1010[var6++] = class14.method111(var182, -1).method1155(var184.field1973, var183, 0);
                                }
                                continue;
                            }
                        } else if (var488 < 5100) {
                            if (var488 == 5000) {
                                class51.field1010[var6++] = class208.field3825;
                                continue;
                            }
                            if (var488 == 5001) {
                                class195.field3619++;
                                var6 -= 3;
                                class208.field3825 = class51.field1010[var6];
                                class66.field1232 = class51.field1010[var6 + 1];
                                class281.field4939 = class51.field1010[var6 + 2];
                                class285.field5010.method799(103, 254);
                                class285.field5010.method1276(844519173, class208.field3825);
                                class285.field5010.method1276(844519173, class66.field1232);
                                class285.field5010.method1276(844519173, class281.field4939);
                                continue;
                            }
                            if (var488 == 5002) {
                                class114.field2011++;
                                var6 -= 2;
                                int var185 = class51.field1010[var6 + 1];
                                var7--;
                                class143 var186 = class170.field3029[var7];
                                int var187 = class51.field1010[var6];
                                class285.field5010.method799(103, 11);
                                class285.field5010.method1243(var186.method874(7), 105);
                                class285.field5010.method1276(844519173, var187 - 1);
                                class285.field5010.method1276(844519173, var185);
                                continue;
                            }
                            if (var488 == 5003) {
                                var6--;
                                int var188 = class51.field1010[var6];
                                class143 var189 = null;
                                if (var188 < 100) {
                                    var189 = class159.field2885[var188];
                                }
                                if (var189 == null) {
                                    var189 = class246.field4413;
                                }
                                class170.field3029[var7++] = var189;
                                continue;
                            }
                            if (var488 == 5004) {
                                var6--;
                                int var190 = class51.field1010[var6];
                                int var191 = -1;
                                if (var190 < 100 && class159.field2885[var190] != null) {
                                    var191 = class208.field3827[var190];
                                }
                                class51.field1010[var6++] = var191;
                                continue;
                            }
                            if (var488 == 5005) {
                                class51.field1010[var6++] = class66.field1232;
                                continue;
                            }
                            if (var488 == 5008) {
                                var7--;
                                class143 var192 = class170.field3029[var7];
                                if (var192.method903(class169.field3011, 13544)) {
                                    class184.method1205((byte) -26, var192);
                                    continue;
                                }
                                if (class162.field2914 == 0 && (class106.field1875 && !class71.field1346 || class267.field4789)) {
                                    continue;
                                }
                                class143 var193 = var192.method868(99);
                                class69.field1317++;
                                byte var194 = 0;
                                byte var195 = 0;
                                if (var193.method903(class38.field664, 13544)) {
                                    var194 = 0;
                                    var192 = var192.method863(class38.field664.method913((byte) 45), -161);
                                } else if (var193.method903(class101.field1795, 13544)) {
                                    var194 = 1;
                                    var192 = var192.method863(class101.field1795.method913((byte) 45), -161);
                                } else if (var193.method903(class40.field688, 13544)) {
                                    var194 = 2;
                                    var192 = var192.method863(class40.field688.method913((byte) 45), -161);
                                } else if (var193.method903(class88.field1603, 13544)) {
                                    var192 = var192.method863(class88.field1603.method913((byte) 45), -161);
                                    var194 = 3;
                                } else if (var193.method903(class111.field1951, 13544)) {
                                    var194 = 4;
                                    var192 = var192.method863(class111.field1951.method913((byte) 45), -161);
                                } else if (var193.method903(class232.field4236, 13544)) {
                                    var194 = 5;
                                    var192 = var192.method863(class232.field4236.method913((byte) 45), -161);
                                } else if (var193.method903(class147.field2653, 13544)) {
                                    var192 = var192.method863(class147.field2653.method913((byte) 45), -161);
                                    var194 = 6;
                                } else if (var193.method903(class58.field1122, 13544)) {
                                    var194 = 7;
                                    var192 = var192.method863(class58.field1122.method913((byte) 45), -161);
                                } else if (var193.method903(class167.field2983, 13544)) {
                                    var194 = 8;
                                    var192 = var192.method863(class167.field2983.method913((byte) 45), -161);
                                } else if (var193.method903(class62.field1177, 13544)) {
                                    var194 = 9;
                                    var192 = var192.method863(class62.field1177.method913((byte) 45), -161);
                                } else if (var193.method903(class104.field1840, 13544)) {
                                    var192 = var192.method863(class104.field1840.method913((byte) 45), -161);
                                    var194 = 10;
                                } else if (var193.method903(class265.field4775, 13544)) {
                                    var192 = var192.method863(class265.field4775.method913((byte) 45), -161);
                                    var194 = 11;
                                } else if (class141.field2467 != 0) {
                                    if (var193.method903(class38.field663, 13544)) {
                                        var192 = var192.method863(class38.field663.method913((byte) 45), -161);
                                        var194 = 0;
                                    } else if (var193.method903(class101.field1804, 13544)) {
                                        var194 = 1;
                                        var192 = var192.method863(class101.field1804.method913((byte) 45), -161);
                                    } else if (var193.method903(class40.field690, 13544)) {
                                        var194 = 2;
                                        var192 = var192.method863(class40.field690.method913((byte) 45), -161);
                                    } else if (var193.method903(class88.field1602, 13544)) {
                                        var192 = var192.method863(class88.field1602.method913((byte) 45), -161);
                                        var194 = 3;
                                    } else if (var193.method903(class111.field1950, 13544)) {
                                        var194 = 4;
                                        var192 = var192.method863(class111.field1950.method913((byte) 45), -161);
                                    } else if (var193.method903(class232.field4233, 13544)) {
                                        var194 = 5;
                                        var192 = var192.method863(class232.field4233.method913((byte) 45), -161);
                                    } else if (var193.method903(class147.field2657, 13544)) {
                                        var192 = var192.method863(class147.field2657.method913((byte) 45), -161);
                                        var194 = 6;
                                    } else if (var193.method903(class58.field1124, 13544)) {
                                        var192 = var192.method863(class58.field1124.method913((byte) 45), -161);
                                        var194 = 7;
                                    } else if (var193.method903(class167.field2989, 13544)) {
                                        var194 = 8;
                                        var192 = var192.method863(class167.field2989.method913((byte) 45), -161);
                                    } else if (var193.method903(class62.field1168, 13544)) {
                                        var194 = 9;
                                        var192 = var192.method863(class62.field1168.method913((byte) 45), -161);
                                    } else if (var193.method903(class104.field1828, 13544)) {
                                        var194 = 10;
                                        var192 = var192.method863(class104.field1828.method913((byte) 45), -161);
                                    } else if (var193.method903(class265.field4770, 13544)) {
                                        var194 = 11;
                                        var192 = var192.method863(class265.field4770.method913((byte) 45), -161);
                                    }
                                }
                                class143 var196 = var192.method868(-59);
                                if (var196.method903(class165.field2965, 13544)) {
                                    var192 = var192.method863(class165.field2965.method913((byte) 45), -161);
                                    var195 = 1;
                                } else if (var196.method903(class231.field4227, 13544)) {
                                    var192 = var192.method863(class231.field4227.method913((byte) 45), -161);
                                    var195 = 2;
                                } else if (var196.method903(class39.field669, 13544)) {
                                    var192 = var192.method863(class39.field669.method913((byte) 45), -161);
                                    var195 = 3;
                                } else if (var196.method903(class264.field4759, 13544)) {
                                    var192 = var192.method863(class264.field4759.method913((byte) 45), -161);
                                    var195 = 4;
                                } else if (var196.method903(class178.field3186, 13544)) {
                                    var192 = var192.method863(class178.field3186.method913((byte) 45), -161);
                                    var195 = 5;
                                } else if (class141.field2467 != 0) {
                                    if (var196.method903(class165.field2961, 13544)) {
                                        var192 = var192.method863(class165.field2961.method913((byte) 45), -161);
                                        var195 = 1;
                                    } else if (var196.method903(class231.field4226, 13544)) {
                                        var192 = var192.method863(class231.field4226.method913((byte) 45), -161);
                                        var195 = 2;
                                    } else if (var196.method903(class39.field665, 13544)) {
                                        var195 = 3;
                                        var192 = var192.method863(class39.field665.method913((byte) 45), -161);
                                    } else if (var196.method903(class264.field4763, 13544)) {
                                        var192 = var192.method863(class264.field4763.method913((byte) 45), -161);
                                        var195 = 4;
                                    } else if (var196.method903(class178.field3191, 13544)) {
                                        var195 = 5;
                                        var192 = var192.method863(class178.field3191.method913((byte) 45), -161);
                                    }
                                }
                                class285.field5010.method799(103, 12);
                                class285.field5010.method1276(844519173, 0);
                                int var197 = class285.field5010.field3487;
                                class285.field5010.method1276(844519173, var194);
                                class285.field5010.method1276(844519173, var195);
                                class69.method401(class285.field5010, var192, -22682);
                                class285.field5010.method1263(0, class285.field5010.field3487 - var197);
                                continue;
                            }
                            if (var488 == 5009) {
                                var7 -= 2;
                                class143 var198 = class170.field3029[var7 + 1];
                                class143 var199 = class170.field3029[var7];
                                if (class162.field2914 != 0 || (!class106.field1875 || class71.field1346) && !class267.field4789) {
                                    class269.field4819++;
                                    class285.field5010.method799(103, 62);
                                    class285.field5010.method1276(844519173, 0);
                                    int var200 = class285.field5010.field3487;
                                    class285.field5010.method1243(var199.method874(7), 102);
                                    class69.method401(class285.field5010, var198, -22682);
                                    class285.field5010.method1263(0, class285.field5010.field3487 - var200);
                                }
                                continue;
                            }
                            if (var488 == 5010) {
                                class143 var201 = null;
                                var6--;
                                int var202 = class51.field1010[var6];
                                if (var202 < 100) {
                                    var201 = class184.field3351[var202];
                                }
                                if (var201 == null) {
                                    var201 = class246.field4413;
                                }
                                class170.field3029[var7++] = var201;
                                continue;
                            }
                            if (var488 == 5011) {
                                var6--;
                                int var203 = class51.field1010[var6];
                                class143 var204 = null;
                                if (var203 < 100) {
                                    var204 = class48.field932[var203];
                                }
                                if (var204 == null) {
                                    var204 = class246.field4413;
                                }
                                class170.field3029[var7++] = var204;
                                continue;
                            }
                            if (var488 == 5012) {
                                var6--;
                                int var205 = class51.field1010[var6];
                                int var206 = -1;
                                if (var205 < 100) {
                                    var206 = class133.field2324[var205];
                                }
                                class51.field1010[var6++] = var206;
                                continue;
                            }
                            if (var488 == 5015) {
                                class143 var207;
                                if (class229.field4195 == null || class229.field4195.field518 == null) {
                                    var207 = class21.field341;
                                } else {
                                    var207 = class229.field4195.method212((byte) 47);
                                }
                                class170.field3029[var7++] = var207;
                                continue;
                            }
                            if (var488 == 5016) {
                                class51.field1010[var6++] = class281.field4939;
                                continue;
                            }
                            if (var488 == 5017) {
                                class51.field1010[var6++] = class214.field3957;
                                continue;
                            }
                            if (var488 == 5050) {
                                var6--;
                                int var208 = class51.field1010[var6];
                                class170.field3029[var7++] = class251.method1668((byte) -101, var208).field1378;
                                continue;
                            }
                            if (var488 == 5051) {
                                var6--;
                                int var209 = class51.field1010[var6];
                                class74 var210 = class251.method1668((byte) -101, var209);
                                if (var210.field1371 == null) {
                                    class51.field1010[var6++] = 0;
                                } else {
                                    class51.field1010[var6++] = var210.field1371.length;
                                }
                                continue;
                            }
                            if (var488 == 5052) {
                                var6 -= 2;
                                int var211 = class51.field1010[var6];
                                int var212 = class51.field1010[var6 + 1];
                                class74 var213 = class251.method1668((byte) -101, var211);
                                int var214 = var213.field1371[var212];
                                class51.field1010[var6++] = var214;
                                continue;
                            }
                            if (var488 == 5053) {
                                var6--;
                                int var215 = class51.field1010[var6];
                                class74 var216 = class251.method1668((byte) -101, var215);
                                if (var216.field1370 == null) {
                                    class51.field1010[var6++] = 0;
                                } else {
                                    class51.field1010[var6++] = var216.field1370.length;
                                }
                                continue;
                            }
                            if (var488 == 5054) {
                                var6 -= 2;
                                int var217 = class51.field1010[var6];
                                int var218 = class51.field1010[var6 + 1];
                                class51.field1010[var6++] = class251.method1668((byte) -101, var217).field1370[var218];
                                continue;
                            }
                            if (var488 == 5055) {
                                var6--;
                                int var219 = class51.field1010[var6];
                                class170.field3029[var7++] = class13.method103(96, var219).method1391((byte) 19);
                                continue;
                            }
                            if (var488 == 5056) {
                                var6--;
                                int var220 = class51.field1010[var6];
                                class204 var221 = class13.method103(35, var220);
                                if (var221.field3710 == null) {
                                    class51.field1010[var6++] = 0;
                                } else {
                                    class51.field1010[var6++] = var221.field3710.length;
                                }
                                continue;
                            }
                            if (var488 == 5057) {
                                var6 -= 2;
                                int var222 = class51.field1010[var6];
                                int var223 = class51.field1010[var6 + 1];
                                class51.field1010[var6++] = class13.method103(92, var222).field3710[var223];
                                continue;
                            }
                            if (var488 == 5058) {
                                class229.field4196 = new class26();
                                var6--;
                                class229.field4196.field430 = class51.field1010[var6];
                                class229.field4196.field442 = class13.method103(89, class229.field4196.field430);
                                class229.field4196.field441 = new int[class229.field4196.field442.method1394(false)];
                                continue;
                            }
                            if (var488 == 5059) {
                                class285.field5010.method799(103, 97);
                                class230.field4205++;
                                class285.field5010.method1276(844519173, 0);
                                int var224 = class285.field5010.field3487;
                                class285.field5010.method1276(844519173, 0);
                                class285.field5010.method1278(class229.field4196.field430, (byte) 85);
                                class229.field4196.field442.method1396((byte) 32, class285.field5010, class229.field4196.field441);
                                class285.field5010.method1263(0, class285.field5010.field3487 - var224);
                                continue;
                            }
                            if (var488 == 5060) {
                                class111.field1957++;
                                var7--;
                                class143 var225 = class170.field3029[var7];
                                class285.field5010.method799(103, 156);
                                class285.field5010.method1276(844519173, 0);
                                int var226 = class285.field5010.field3487;
                                class285.field5010.method1243(var225.method874(7), 124);
                                class285.field5010.method1278(class229.field4196.field430, (byte) 88);
                                class229.field4196.field442.method1396((byte) 33, class285.field5010, class229.field4196.field441);
                                class285.field5010.method1263(0, class285.field5010.field3487 - var226);
                                continue;
                            }
                            if (var488 == 5061) {
                                class230.field4205++;
                                class285.field5010.method799(103, 97);
                                class285.field5010.method1276(844519173, 0);
                                int var227 = class285.field5010.field3487;
                                class285.field5010.method1276(844519173, 1);
                                class285.field5010.method1278(class229.field4196.field430, (byte) 49);
                                class229.field4196.field442.method1396((byte) 57, class285.field5010, class229.field4196.field441);
                                class285.field5010.method1263(0, class285.field5010.field3487 - var227);
                                continue;
                            }
                            if (var488 == 5062) {
                                var6 -= 2;
                                int var228 = class51.field1010[var6];
                                int var229 = class51.field1010[var6 + 1];
                                class51.field1010[var6++] = class251.method1668((byte) -101, var228).field1379[var229];
                                continue;
                            }
                            if (var488 == 5063) {
                                var6 -= 2;
                                int var230 = class51.field1010[var6 + 1];
                                int var231 = class51.field1010[var6];
                                class51.field1010[var6++] = class251.method1668((byte) -101, var231).field1373[var230];
                                continue;
                            }
                            if (var488 == 5064) {
                                var6 -= 2;
                                int var232 = class51.field1010[var6];
                                int var233 = class51.field1010[var6 + 1];
                                if (var233 == -1) {
                                    class51.field1010[var6++] = -1;
                                } else {
                                    class51.field1010[var6++] = class251.method1668((byte) -101, var232).method423(var233, -90);
                                }
                                continue;
                            }
                            if (var488 == 5065) {
                                var6 -= 2;
                                int var234 = class51.field1010[var6];
                                int var235 = class51.field1010[var6 + 1];
                                if (var235 == -1) {
                                    class51.field1010[var6++] = -1;
                                } else {
                                    class51.field1010[var6++] = class251.method1668((byte) -101, var234).method429(-122, var235);
                                }
                                continue;
                            }
                            if (var488 == 5066) {
                                var6--;
                                int var236 = class51.field1010[var6];
                                class51.field1010[var6++] = class13.method103(77, var236).method1394(false);
                                continue;
                            }
                            if (var488 == 5067) {
                                var6 -= 2;
                                int var237 = class51.field1010[var6 + 1];
                                int var238 = class51.field1010[var6];
                                int var239 = class13.method103(58, var238).method1401(var237, -127);
                                class51.field1010[var6++] = var239;
                                continue;
                            }
                            if (var488 == 5068) {
                                var6 -= 2;
                                int var240 = class51.field1010[var6 + 1];
                                int var241 = class51.field1010[var6];
                                class229.field4196.field441[var241] = var240;
                                continue;
                            }
                            if (var488 == 5069) {
                                var6 -= 2;
                                int var242 = class51.field1010[var6];
                                int var243 = class51.field1010[var6 + 1];
                                class229.field4196.field441[var242] = var243;
                                continue;
                            }
                            if (var488 == 5070) {
                                var6 -= 3;
                                int var244 = class51.field1010[var6];
                                int var245 = class51.field1010[var6 + 2];
                                int var246 = class51.field1010[var6 + 1];
                                class204 var247 = class13.method103(98, var244);
                                if (var247.method1401(var246, -121) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class51.field1010[var6++] = var247.method1402(var246, var245, (byte) 93);
                                continue;
                            }
                            if (var488 == 5071) {
                                var7--;
                                class143 var248 = class170.field3029[var7];
                                var6--;
                                boolean var249 = class51.field1010[var6] == 1;
                                class210.method1471(var249, 241, var248);
                                class51.field1010[var6++] = class30.field472;
                                continue;
                            }
                            if (var488 == 5072) {
                                if (class107.field1892 != null && class24.field407 < class30.field472) {
                                    class51.field1010[var6++] = class129.method777(class107.field1892[class24.field407++], 65535);
                                    continue;
                                }
                                class51.field1010[var6++] = -1;
                                continue;
                            }
                            if (var488 == 5073) {
                                class24.field407 = 0;
                                continue;
                            }
                        } else if (var488 < 5200) {
                            if (var488 == 5100) {
                                if (class128.field2264[86]) {
                                    class51.field1010[var6++] = 1;
                                } else {
                                    class51.field1010[var6++] = 0;
                                }
                                continue;
                            }
                            if (var488 == 5101) {
                                if (class128.field2264[82]) {
                                    class51.field1010[var6++] = 1;
                                } else {
                                    class51.field1010[var6++] = 0;
                                }
                                continue;
                            }
                            if (var488 == 5102) {
                                if (class128.field2264[81]) {
                                    class51.field1010[var6++] = 1;
                                } else {
                                    class51.field1010[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var488 < 5300) {
                            if (var488 == 5200) {
                                var6--;
                                class282.method1850(-1, class51.field1010[var6]);
                                continue;
                            }
                            if (var488 == 5201) {
                                class51.field1010[var6++] = class290.method1939(9865);
                                continue;
                            }
                            if (var488 == 5202) {
                                var6--;
                                class290.method1942(class51.field1010[var6], true);
                                continue;
                            }
                            if (var488 == 5203) {
                                var7--;
                                class270.method1787(0, class170.field3029[var7]);
                                continue;
                            }
                            if (var488 == 5204) {
                                class170.field3029[var7 - 1] = class162.method1070((byte) 71, class170.field3029[var7 - 1]);
                                continue;
                            }
                            if (var488 == 5205) {
                                var7--;
                                class71.method413(0, class170.field3029[var7]);
                                continue;
                            }
                            if (var488 == 5206) {
                                var6--;
                                int var315 = class51.field1010[var6];
                                class80 var316 = class266.method1773(var315 & 0x3FFF, (byte) -121, (var315 & 0xFFFFE07) >> 14);
                                if (var316 == null) {
                                    class170.field3029[var7++] = class246.field4413;
                                } else {
                                    class170.field3029[var7++] = var316.field1453;
                                }
                                continue;
                            }
                            if (var488 == 5207) {
                                var7--;
                                class80 var317 = class9.method74(class170.field3029[var7], -104);
                                if (var317 != null && var317.field1461 != null) {
                                    class170.field3029[var7++] = var317.field1461;
                                    continue;
                                }
                                class170.field3029[var7++] = class246.field4413;
                                continue;
                            }
                            if (var488 == 5208) {
                                class51.field1010[var6++] = class52.field1020;
                                class51.field1010[var6++] = class227.field4100;
                                continue;
                            }
                            if (var488 == 5209) {
                                class51.field1010[var6++] = class41.field691 + class245.field4412;
                                class51.field1010[var6++] = class236.field4298 + class25.field426 - class203.field3691 - 1;
                                continue;
                            }
                            if (var488 == 5210) {
                                class80 var318 = class219.method1500(23043);
                                if (var318 == null) {
                                    class51.field1010[var6++] = 0;
                                    class51.field1010[var6++] = 0;
                                } else {
                                    class51.field1010[var6++] = var318.field1447 * 64;
                                    class51.field1010[var6++] = var318.field1457 * 64;
                                }
                                continue;
                            }
                            if (var488 == 5211) {
                                class80 var319 = class219.method1500(23043);
                                if (var319 == null) {
                                    class51.field1010[var6++] = 0;
                                    class51.field1010[var6++] = 0;
                                } else {
                                    class51.field1010[var6++] = var319.field1450 - var319.field1464;
                                    class51.field1010[var6++] = var319.field1454 - var319.field1448;
                                }
                                continue;
                            }
                            if (var488 == 5212) {
                                int var320 = class122.method738((byte) -29);
                                int var321 = 0;
                                class143 var322;
                                if (var320 == -1) {
                                    var322 = class246.field4413;
                                } else {
                                    var322 = class90.field1628.field2375[var320];
                                    var321 = class90.field1628.method810(3, var320);
                                }
                                class143 var323 = var322.method877(-118, class135.field2374, class176.field3163);
                                class170.field3029[var7++] = var323;
                                class51.field1010[var6++] = var321;
                                continue;
                            }
                            if (var488 == 5213) {
                                int var324 = class232.method1577(-32222);
                                int var325 = 0;
                                class143 var326;
                                if (var324 == -1) {
                                    var326 = class246.field4413;
                                } else {
                                    var326 = class90.field1628.field2375[var324];
                                    var325 = class90.field1628.method810(3, var324);
                                }
                                class143 var327 = var326.method877(-63, class135.field2374, class176.field3163);
                                class170.field3029[var7++] = var327;
                                class51.field1010[var6++] = var325;
                                continue;
                            }
                            if (var488 == 5214) {
                                var6--;
                                int var328 = class51.field1010[var6];
                                class116.method705(var328 & 0x3FFF, (byte) 109, (var328 & 0xFFFE4CA) >> 14);
                                continue;
                            }
                        } else if (var488 < 5400) {
                            if (var488 == 5300) {
                                var6 -= 2;
                                class51.field1010[var6++] = 0;
                                continue;
                            }
                            if (var488 == 5301) {
                                continue;
                            }
                            if (var488 == 5302) {
                                class51.field1010[var6++] = 0;
                                continue;
                            }
                            if (var488 == 5303) {
                                var6--;
                                class51.field1010[var6++] = 0;
                                class51.field1010[var6++] = 0;
                                continue;
                            }
                            if (var488 == 5305) {
                                byte var312 = -1;
                                class51.field1010[var6++] = var312;
                                continue;
                            }
                            if (var488 == 5306) {
                                class51.field1010[var6++] = class69.method399(59);
                                continue;
                            }
                            if (var488 == 5307) {
                                var6--;
                                int var313 = class51.field1010[var6];
                                if (var313 < 0 || var313 > 2) {
                                    var313 = 0;
                                }
                                class127.method772(-1, var313, -1, false, 10979);
                                continue;
                            }
                            if (var488 == 5308) {
                                class51.field1010[var6++] = class120.field2126;
                                continue;
                            }
                            if (var488 == 5309) {
                                var6--;
                                int var314 = class51.field1010[var6];
                                if (var314 < 0 || var314 > 2) {
                                    var314 = 0;
                                }
                                class120.field2126 = var314;
                                class290.method1945(class4.field62, (byte) -58);
                                continue;
                            }
                        } else if (var488 < 5500) {
                            if (var488 == 5400) {
                                var7 -= 2;
                                class274.field4879++;
                                class143 var250 = class170.field3029[var7];
                                class143 var251 = class170.field3029[var7 + 1];
                                var6--;
                                int var252 = class51.field1010[var6];
                                class285.field5010.method799(103, 69);
                                class285.field5010.method1276(844519173, class76.method436(52, var250) + class76.method436(118, var251) + 1);
                                class285.field5010.method1255(var250, (byte) 0);
                                class285.field5010.method1255(var251, (byte) 0);
                                class285.field5010.method1276(844519173, var252);
                                continue;
                            }
                            if (var488 == 5401) {
                                var6 -= 2;
                                class130.field2311[class51.field1010[var6]] = (short) class232.method1575(class51.field1010[var6 + 1], 32086);
                                class250.method1661(true);
                                class191.method1288((byte) -95);
                                class173.method1143((byte) -37);
                                class245.method1626((byte) -25);
                                class159.method1041(77);
                                continue;
                            }
                            if (var488 == 5405) {
                                var6 -= 2;
                                int var253 = class51.field1010[var6];
                                int var254 = class51.field1010[var6 + 1];
                                if (var253 >= 0 && var253 < 2) {
                                    class48.field939[var253] = new int[var254 << 1][4];
                                }
                                continue;
                            }
                            if (var488 == 5406) {
                                var6 -= 7;
                                int var255 = class51.field1010[var6 + 1] << 1;
                                int var256 = class51.field1010[var6 + 2];
                                int var257 = class51.field1010[var6];
                                int var258 = class51.field1010[var6 + 4];
                                int var259 = class51.field1010[var6 + 3];
                                int var260 = class51.field1010[var6 + 6];
                                int var261 = class51.field1010[var6 + 5];
                                if (var257 >= 0 && var257 < 2 && class48.field939[var257] != null && var255 >= 0 && var255 < class48.field939[var257].length) {
                                    class48.field939[var257][var255] = new int[] { (class129.method777(268427559, var256) >> 14) * 128, var259, class129.method777(16383, var256) * 128, var260 };
                                    class48.field939[var257][var255 + 1] = new int[] { (class129.method777(268430372, var258) >> 14) * 128, var261, class129.method777(var258, 16383) * 128 };
                                }
                                continue;
                            }
                            if (var488 == 5407) {
                                var6--;
                                int var262 = class48.field939[class51.field1010[var6]].length >> 1;
                                class51.field1010[var6++] = var262;
                                continue;
                            }
                            if (var488 == 5411) {
                                if (class8.field155 == null) {
                                    class62.method355(class133.method797((byte) 123), -65, false);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var488 == 5419) {
                                class143 var263 = class246.field4413;
                                if (class249.field4490 != null) {
                                    var263 = class49.method298(class249.field4490.field3243, -32621);
                                    try {
                                        if (class249.field4490.field3239 != null) {
                                            byte[] var264 = ((String) class249.field4490.field3239).getBytes("ISO-8859-1");
                                            var263 = class224.method1539(0, var264.length, -62, var264);
                                        }
                                    } catch (UnsupportedEncodingException var486) {
                                    }
                                }
                                class170.field3029[var7++] = var263;
                                continue;
                            }
                            if (var488 == 5420) {
                                class51.field1010[var6++] = class81.field1473 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var488 == 5421) {
                                var7--;
                                class143 var265 = class170.field3029[var7];
                                var6--;
                                boolean var266 = class51.field1010[var6] == 1;
                                class143 var267 = class25.method179(0, new class143[] { class133.method797((byte) 121), var265 });
                                if (class8.field155 != null || var266 && class81.field1473 != 3 && class81.field1482.startsWith("win") && !class254.field4561) {
                                    class161.field2910 = var266;
                                    class245.field4393 = var267;
                                    class16.field285 = class4.field62.method462(new String(var267.method889((byte) 6), "ISO-8859-1"), 0);
                                    continue;
                                }
                                class62.method355(var267, -65, var266);
                                continue;
                            }
                            if (var488 == 5422) {
                                var7 -= 2;
                                class143 var268 = class170.field3029[var7];
                                class143 var269 = class170.field3029[var7 + 1];
                                var6--;
                                int var270 = class51.field1010[var6];
                                if (var268.method913((byte) 45) > 0) {
                                    if (class115.field2030 == null) {
                                        class115.field2030 = new class143[class186.field3378[class153.field2764]];
                                    }
                                    class115.field2030[var270] = var268;
                                }
                                if (var269.method913((byte) 45) > 0) {
                                    if (class287.field5045 == null) {
                                        class287.field5045 = new class143[class186.field3378[class153.field2764]];
                                    }
                                    class287.field5045[var270] = var269;
                                }
                                continue;
                            }
                            if (var488 == 5423) {
                                var7--;
                                class170.field3029[var7].method910(117);
                                continue;
                            }
                        } else if (var488 < 5600) {
                            if (var488 == 5500) {
                                var6 -= 4;
                                int var271 = class51.field1010[var6];
                                int var272 = class51.field1010[var6 + 2];
                                int var273 = class51.field1010[var6 + 1];
                                int var274 = class51.field1010[var6 + 3];
                                class189.method1224(((var271 & 0xFFFD83D) >> 14) - class148.field2733, var272, var273, var274, (byte) 124, (var271 & 0x3FFF) - class141.field2466, false);
                                continue;
                            }
                            if (var488 == 5501) {
                                var6 -= 4;
                                int var275 = class51.field1010[var6 + 1];
                                int var276 = class51.field1010[var6];
                                int var277 = class51.field1010[var6 + 2];
                                int var278 = class51.field1010[var6 + 3];
                                class158.method1038(var275, (var276 >> 14 & 0x3FFF) - class148.field2733, (byte) 107, (var276 & 0x3FFF) - class141.field2466, var278, var277);
                                continue;
                            }
                            if (var488 == 5502) {
                                var6 -= 6;
                                int var279 = class51.field1010[var6];
                                if (var279 >= 2) {
                                    throw new RuntimeException();
                                }
                                class254.field4552 = var279;
                                int var280 = class51.field1010[var6 + 1];
                                if ((class48.field939[class254.field4552].length >> 1) <= (var280 + 1)) {
                                    throw new RuntimeException();
                                }
                                class254.field4551 = var280;
                                class176.field3149 = 0;
                                class141.field2461 = class51.field1010[var6 + 2];
                                class226.field4093 = class51.field1010[var6 + 3];
                                int var281 = class51.field1010[var6 + 4];
                                if (var281 >= 2) {
                                    throw new RuntimeException();
                                }
                                class70.field1333 = var281;
                                int var282 = class51.field1010[var6 + 5];
                                if ((class48.field939[class70.field1333].length >> 1) <= (var282 + 1)) {
                                    throw new RuntimeException();
                                }
                                class245.field4397 = var282;
                                class21.field349 = 3;
                                continue;
                            }
                            if (var488 == 5503) {
                                class111.method669((byte) 106);
                                continue;
                            }
                            if (var488 == 5504) {
                                var6 -= 2;
                                class75.field1402 = class51.field1010[var6];
                                class184.field3339 = class51.field1010[var6 + 1];
                                class254.method1677(6620);
                                continue;
                            }
                            if (var488 == 5505) {
                                class51.field1010[var6++] = class75.field1402;
                                continue;
                            }
                            if (var488 == 5506) {
                                class51.field1010[var6++] = class184.field3339;
                                continue;
                            }
                        } else if (var488 < 5700) {
                            if (var488 == 5600) {
                                var7 -= 2;
                                class143 var308 = class170.field3029[var7];
                                class143 var309 = class170.field3029[var7 + 1];
                                var6--;
                                int var310 = class51.field1010[var6];
                                if (class147.field2652 == 10 && class107.field1893 == 0 && class88.field1598 == 0 && class83.field1504 == 0 && class175.field3134 == 0) {
                                    class106.method634(-58, var309, var308, var310);
                                }
                                continue;
                            }
                            if (var488 == 5601) {
                                class236.method1590(-124);
                                continue;
                            }
                            if (var488 == 5602) {
                                if (class88.field1598 == 0) {
                                    class105.field1857 = -2;
                                }
                                continue;
                            }
                            if (var488 == 5603) {
                                var6 -= 4;
                                if (class147.field2652 == 10 && class107.field1893 == 0 && class88.field1598 == 0 && class83.field1504 == 0 && class175.field3134 == 0) {
                                    class139.method832(class51.field1010[var6 + 1], class51.field1010[var6 + 3], class51.field1010[var6], class51.field1010[var6 + 2], 103);
                                }
                                continue;
                            }
                            if (var488 == 5604) {
                                var7--;
                                if (class147.field2652 == 10 && class107.field1893 == 0 && class88.field1598 == 0 && class83.field1504 == 0 && class175.field3134 == 0) {
                                    class88.method506(26335, class170.field3029[var7].method874(7));
                                }
                                continue;
                            }
                            if (var488 == 5605) {
                                var6 -= 4;
                                var7 -= 2;
                                if (class147.field2652 == 10 && class107.field1893 == 0 && class88.field1598 == 0 && class83.field1504 == 0 && class175.field3134 == 0) {
                                    class230.method1565((byte) -4, class51.field1010[var6 + 1], class51.field1010[var6 + 3], class51.field1010[var6], class170.field3029[var7 + 1], class170.field3029[var7].method874(7), class51.field1010[var6 + 2]);
                                }
                                continue;
                            }
                            if (var488 == 5606) {
                                if (class83.field1504 == 0) {
                                    class262.field4678 = -2;
                                }
                                continue;
                            }
                            if (var488 == 5607) {
                                class51.field1010[var6++] = class105.field1857;
                                continue;
                            }
                            if (var488 == 5608) {
                                class51.field1010[var6++] = class223.field4047;
                                continue;
                            }
                            if (var488 == 5609) {
                                class51.field1010[var6++] = class262.field4678;
                                continue;
                            }
                            if (var488 == 5610) {
                                for (int var311 = 0; var311 < 5; var311++) {
                                    class170.field3029[var7++] = var311 >= class85.field1565.length ? class246.field4413 : class85.field1565[var311].method878(-28102);
                                }
                                class85.field1565 = null;
                                continue;
                            }
                            if (var488 == 5611) {
                                class51.field1010[var6++] = class27.field454;
                                continue;
                            }
                        } else if (var488 < 6100) {
                            if (var488 == 6001) {
                                var6--;
                                int var300 = class51.field1010[var6];
                                if (var300 < 1) {
                                    var300 = 1;
                                }
                                if (var300 > 4) {
                                    var300 = 4;
                                }
                                class182.field3257 = var300;
                                if (class182.field3257 == 1) {
                                    class196.method1362(0.9F);
                                }
                                if (class182.field3257 == 2) {
                                    class196.method1362(0.8F);
                                }
                                if (class182.field3257 == 3) {
                                    class196.method1362(0.7F);
                                }
                                if (class182.field3257 == 4) {
                                    class196.method1362(0.6F);
                                }
                                class191.method1288((byte) -119);
                                class290.method1945(class4.field62, (byte) 113);
                                class49.field949 = false;
                                continue;
                            }
                            if (var488 == 6002) {
                                var6--;
                                class235.method1585(class51.field1010[var6] == 1, (byte) 108);
                                class39.method254(127);
                                class12.method95((byte) -23);
                                class114.method689((byte) 114);
                                class290.method1945(class4.field62, (byte) 120);
                                class49.field949 = false;
                                continue;
                            }
                            if (var488 == 6003) {
                                var6--;
                                class285.field5009 = class51.field1010[var6] == 1;
                                class114.method689((byte) -50);
                                class290.method1945(class4.field62, (byte) 101);
                                class49.field949 = false;
                                continue;
                            }
                            if (var488 == 6005) {
                                var6--;
                                class225.field4083 = class51.field1010[var6] == 1;
                                class12.method95((byte) -24);
                                class290.method1945(class4.field62, (byte) -58);
                                class49.field949 = false;
                                continue;
                            }
                            if (var488 == 6006) {
                                var6--;
                                class43.field847 = class51.field1010[var6] == 1;
                                ((class66) class196.field3636).method386((byte) 75, !class43.field847);
                                class290.method1945(class4.field62, (byte) 84);
                                class49.field949 = false;
                                continue;
                            }
                            if (var488 == 6007) {
                                var6--;
                                class240.field4333 = class51.field1010[var6] == 1;
                                class290.method1945(class4.field62, (byte) -84);
                                class49.field949 = false;
                                continue;
                            }
                            if (var488 == 6008) {
                                var6--;
                                class189.field3418 = class51.field1010[var6] == 1;
                                class290.method1945(class4.field62, (byte) 125);
                                class49.field949 = false;
                                continue;
                            }
                            if (var488 == 6009) {
                                var6--;
                                class49.field966 = class51.field1010[var6] == 1;
                                class290.method1945(class4.field62, (byte) -23);
                                class49.field949 = false;
                                continue;
                            }
                            if (var488 == 6010) {
                                var6--;
                                class212.field3944 = class51.field1010[var6] == 1;
                                class290.method1945(class4.field62, (byte) 109);
                                class49.field949 = false;
                                continue;
                            }
                            if (var488 == 6011) {
                                var6--;
                                int var301 = class51.field1010[var6];
                                if (var301 < 0 || var301 > 2) {
                                    var301 = 0;
                                }
                                class32.field551 = var301;
                                class290.method1945(class4.field62, (byte) 125);
                                class49.field949 = false;
                                continue;
                            }
                            if (var488 == 6012) {
                                var6--;
                                class116.field2070 = class51.field1010[var6] == 1;
                                if (class182.field3257 == 1) {
                                    class196.method1362(0.9F);
                                }
                                if (class182.field3257 == 2) {
                                    class196.method1362(0.8F);
                                }
                                if (class182.field3257 == 3) {
                                    class196.method1362(0.7F);
                                }
                                if (class182.field3257 == 4) {
                                    class196.method1362(0.6F);
                                }
                                class12.method95((byte) -42);
                                class290.method1945(class4.field62, (byte) -108);
                                class49.field949 = false;
                                continue;
                            }
                            if (var488 == 6014) {
                                var6--;
                                class283.field4985 = class51.field1010[var6] == 1;
                                class290.method1945(class4.field62, (byte) -109);
                                class49.field949 = false;
                                continue;
                            }
                            if (var488 == 6015) {
                                var6--;
                                class44.field896 = class51.field1010[var6] == 1;
                                class290.method1945(class4.field62, (byte) 110);
                                class49.field949 = false;
                                continue;
                            }
                            if (var488 == 6016) {
                                var6--;
                                int var302 = class51.field1010[var6];
                                if (var302 < 0 || var302 > 2) {
                                    var302 = 0;
                                }
                                class127.field2244 = var302;
                                continue;
                            }
                            if (var488 == 6017) {
                                var6--;
                                class88.field1594 = class51.field1010[var6] == 1;
                                class271.method1789((byte) -48);
                                class290.method1945(class4.field62, (byte) 83);
                                class49.field949 = false;
                                continue;
                            }
                            if (var488 == 6018) {
                                var6--;
                                int var303 = class51.field1010[var6];
                                if (var303 < 0) {
                                    var303 = 0;
                                }
                                if (var303 > 127) {
                                    var303 = 127;
                                }
                                class240.field4332 = var303;
                                class290.method1945(class4.field62, (byte) -7);
                                class49.field949 = false;
                                continue;
                            }
                            if (var488 == 6019) {
                                var6--;
                                int var304 = class51.field1010[var6];
                                if (var304 < 0) {
                                    var304 = 0;
                                }
                                if (var304 > 255) {
                                    var304 = 255;
                                }
                                if (class211.field3926 != var304) {
                                    if (class211.field3926 == 0 && class221.field4001 != -1) {
                                        class129.method778(class278.field4911, class221.field4001, 2627, false, 0, var304);
                                        class175.field3142 = false;
                                    } else if (var304 == 0) {
                                        class282.method1849(1);
                                        class175.field3142 = false;
                                    } else {
                                        class228.method1554(var304, -95);
                                    }
                                    class211.field3926 = var304;
                                }
                                class290.method1945(class4.field62, (byte) 103);
                                class49.field949 = false;
                                continue;
                            }
                            if (var488 == 6020) {
                                var6--;
                                int var305 = class51.field1010[var6];
                                if (var305 < 0) {
                                    var305 = 0;
                                }
                                if (var305 > 127) {
                                    var305 = 127;
                                }
                                class58.field1117 = var305;
                                class290.method1945(class4.field62, (byte) -12);
                                class49.field949 = false;
                                continue;
                            }
                            if (var488 == 6021) {
                                var6--;
                                class120.field2141 = class51.field1010[var6] == 1;
                                class114.method689((byte) -90);
                                continue;
                            }
                            if (var488 == 6023) {
                                var6--;
                                int var306 = class51.field1010[var6];
                                if (var306 < 0) {
                                    var306 = 0;
                                }
                                if (var306 > 2) {
                                    var306 = 2;
                                }
                                class125.method761(var306);
                                class290.method1945(class4.field62, (byte) -127);
                                class49.field949 = false;
                                continue;
                            }
                            if (var488 == 6024) {
                                var6--;
                                int var307 = class51.field1010[var6];
                                if (var307 < 0 || var307 > 2) {
                                    var307 = 0;
                                }
                                class74.field1385 = var307;
                                class290.method1945(class4.field62, (byte) 97);
                                continue;
                            }
                        } else if (var488 < 6200) {
                            if (var488 == 6101) {
                                class51.field1010[var6++] = class182.field3257;
                                continue;
                            }
                            if (var488 == 6102) {
                                class51.field1010[var6++] = class21.method149((byte) -57) ? 1 : 0;
                                continue;
                            }
                            if (var488 == 6103) {
                                class51.field1010[var6++] = class285.field5009 ? 1 : 0;
                                continue;
                            }
                            if (var488 == 6105) {
                                class51.field1010[var6++] = class225.field4083 ? 1 : 0;
                                continue;
                            }
                            if (var488 == 6106) {
                                class51.field1010[var6++] = class43.field847 ? 1 : 0;
                                continue;
                            }
                            if (var488 == 6107) {
                                class51.field1010[var6++] = class240.field4333 ? 1 : 0;
                                continue;
                            }
                            if (var488 == 6108) {
                                class51.field1010[var6++] = class189.field3418 ? 1 : 0;
                                continue;
                            }
                            if (var488 == 6109) {
                                class51.field1010[var6++] = class49.field966 ? 1 : 0;
                                continue;
                            }
                            if (var488 == 6110) {
                                class51.field1010[var6++] = class212.field3944 ? 1 : 0;
                                continue;
                            }
                            if (var488 == 6111) {
                                class51.field1010[var6++] = class32.field551;
                                continue;
                            }
                            if (var488 == 6112) {
                                class51.field1010[var6++] = class116.field2070 ? 1 : 0;
                                continue;
                            }
                            if (var488 == 6114) {
                                class51.field1010[var6++] = class283.field4985 ? 1 : 0;
                                continue;
                            }
                            if (var488 == 6115) {
                                class51.field1010[var6++] = class44.field896 ? 1 : 0;
                                continue;
                            }
                            if (var488 == 6116) {
                                class51.field1010[var6++] = class127.field2244;
                                continue;
                            }
                            if (var488 == 6117) {
                                class51.field1010[var6++] = class88.field1594 ? 1 : 0;
                                continue;
                            }
                            if (var488 == 6118) {
                                class51.field1010[var6++] = class240.field4332;
                                continue;
                            }
                            if (var488 == 6119) {
                                class51.field1010[var6++] = class211.field3926;
                                continue;
                            }
                            if (var488 == 6120) {
                                class51.field1010[var6++] = class58.field1117;
                                continue;
                            }
                            if (var488 == 6121) {
                                class51.field1010[var6++] = 0;
                                continue;
                            }
                            if (var488 == 6123) {
                                class51.field1010[var6++] = class125.method751();
                                continue;
                            }
                            if (var488 == 6124) {
                                class51.field1010[var6++] = class74.field1385;
                                continue;
                            }
                        } else if (var488 < 6300) {
                            if (var488 == 6200) {
                                var6 -= 2;
                                class21.field335 = (short) class51.field1010[var6];
                                if (class21.field335 <= 0) {
                                    class21.field335 = 256;
                                }
                                class6.field85 = (short) class51.field1010[var6 + 1];
                                if (class6.field85 <= 0) {
                                    class6.field85 = 205;
                                }
                                continue;
                            }
                            if (var488 == 6201) {
                                var6 -= 2;
                                class31.field504 = (short) class51.field1010[var6];
                                if (class31.field504 <= 0) {
                                    class31.field504 = 256;
                                }
                                class38.field661 = (short) class51.field1010[var6 + 1];
                                if (class38.field661 <= 0) {
                                    class38.field661 = 320;
                                }
                                continue;
                            }
                            if (var488 == 6202) {
                                var6 -= 4;
                                class234.field4250 = (short) class51.field1010[var6];
                                if (class234.field4250 <= 0) {
                                    class234.field4250 = 1;
                                }
                                class128.field2257 = (short) class51.field1010[var6 + 1];
                                if (class128.field2257 <= 0) {
                                    class128.field2257 = 32767;
                                } else if (class234.field4250 > class128.field2257) {
                                    class128.field2257 = class234.field4250;
                                }
                                class226.field4090 = (short) class51.field1010[var6 + 2];
                                if (class226.field4090 <= 0) {
                                    class226.field4090 = 1;
                                }
                                class91.field1631 = (short) class51.field1010[var6 + 3];
                                if (class91.field1631 <= 0) {
                                    class91.field1631 = 32767;
                                } else if (class226.field4090 > class91.field1631) {
                                    class91.field1631 = class226.field4090;
                                }
                                continue;
                            }
                            if (var488 == 6203) {
                                class278.method1838(class9.field185.field735, 123, 0, 0, false, class9.field185.field831);
                                class51.field1010[var6++] = class270.field4833;
                                class51.field1010[var6++] = class38.field660;
                                continue;
                            }
                            if (var488 == 6204) {
                                class51.field1010[var6++] = class31.field504;
                                class51.field1010[var6++] = class38.field661;
                                continue;
                            }
                            if (var488 == 6205) {
                                class51.field1010[var6++] = class21.field335;
                                class51.field1010[var6++] = class6.field85;
                                continue;
                            }
                        } else if (var488 < 6400) {
                            if (var488 == 6300) {
                                class51.field1010[var6++] = (int) (class205.method1403(-61) / 60000L);
                                continue;
                            }
                            if (var488 == 6301) {
                                class51.field1010[var6++] = (int) (class205.method1403(111) / 86400000L) - 11745;
                                continue;
                            }
                            if (var488 == 6302) {
                                var6 -= 3;
                                int var283 = class51.field1010[var6 + 1];
                                int var284 = class51.field1010[var6];
                                int var285 = class51.field1010[var6 + 2];
                                class187.field3389.clear();
                                class187.field3389.set(11, 12);
                                class187.field3389.set(var285, var283, var284);
                                class51.field1010[var6++] = (int) (class187.field3389.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var488 == 6303) {
                                class187.field3389.clear();
                                class187.field3389.setTime(new Date(class205.method1403(-76)));
                                class51.field1010[var6++] = class187.field3389.get(1);
                                continue;
                            }
                            if (var488 == 6304) {
                                var6--;
                                int var286 = class51.field1010[var6];
                                boolean var287 = true;
                                if (var286 < 0) {
                                    var287 = (var286 + 1) % 4 == 0;
                                } else if (var286 < 1582) {
                                    var287 = var286 % 4 == 0;
                                } else if ((var286 % 4) != 0) {
                                    var287 = false;
                                } else if ((var286 % 100) != 0) {
                                    var287 = true;
                                } else if ((var286 % 400) != 0) {
                                    var287 = false;
                                }
                                class51.field1010[var6++] = var287 ? 1 : 0;
                                continue;
                            }
                        } else if (var488 < 6500) {
                            if (var488 == 6405) {
                                class51.field1010[var6++] = class243.method1617(26293) ? 1 : 0;
                                continue;
                            }
                            if (var488 == 6406) {
                                class51.field1010[var6++] = class201.method1378(-432) ? 1 : 0;
                                continue;
                            }
                        } else if (var488 < 6600) {
                            if (var488 == 6500) {
                                if (class147.field2652 == 10 && class107.field1893 == 0 && class88.field1598 == 0 && class83.field1504 == 0) {
                                    class51.field1010[var6++] = class49.method296(false) == -1 ? 0 : 1;
                                    continue;
                                }
                                class51.field1010[var6++] = 1;
                                continue;
                            }
                            if (var488 == 6501) {
                                class133 var288 = class7.method35(-11560);
                                if (var288 == null) {
                                    class51.field1010[var6++] = -1;
                                    class51.field1010[var6++] = 0;
                                    class170.field3029[var7++] = class246.field4413;
                                    class51.field1010[var6++] = 0;
                                    class170.field3029[var7++] = class246.field4413;
                                    class51.field1010[var6++] = 0;
                                } else {
                                    class51.field1010[var6++] = var288.field2331;
                                    class51.field1010[var6++] = var288.field264;
                                    class170.field3029[var7++] = var288.field2327;
                                    class165 var289 = var288.method793(0);
                                    class51.field1010[var6++] = var289.field2960;
                                    class170.field3029[var7++] = var289.field2963;
                                    class51.field1010[var6++] = var288.field255;
                                }
                                continue;
                            }
                            if (var488 == 6502) {
                                class133 var290 = class245.method1630(true);
                                if (var290 == null) {
                                    class51.field1010[var6++] = -1;
                                    class51.field1010[var6++] = 0;
                                    class170.field3029[var7++] = class246.field4413;
                                    class51.field1010[var6++] = 0;
                                    class170.field3029[var7++] = class246.field4413;
                                    class51.field1010[var6++] = 0;
                                } else {
                                    class51.field1010[var6++] = var290.field2331;
                                    class51.field1010[var6++] = var290.field264;
                                    class170.field3029[var7++] = var290.field2327;
                                    class165 var291 = var290.method793(0);
                                    class51.field1010[var6++] = var291.field2960;
                                    class170.field3029[var7++] = var291.field2963;
                                    class51.field1010[var6++] = var290.field255;
                                }
                                continue;
                            }
                            if (var488 == 6503) {
                                var6--;
                                int var292 = class51.field1010[var6];
                                if (class147.field2652 == 10 && class107.field1893 == 0 && class88.field1598 == 0 && class83.field1504 == 0) {
                                    class51.field1010[var6++] = class225.method1545(91, var292) ? 1 : 0;
                                    continue;
                                }
                                class51.field1010[var6++] = 0;
                                continue;
                            }
                            if (var488 == 6504) {
                                var6--;
                                class35.field615 = class51.field1010[var6];
                                class290.method1945(class4.field62, (byte) -114);
                                continue;
                            }
                            if (var488 == 6505) {
                                class51.field1010[var6++] = class35.field615;
                                continue;
                            }
                            if (var488 == 6506) {
                                var6--;
                                int var293 = class51.field1010[var6];
                                class133 var294 = class207.method1448(-63, var293);
                                if (var294 == null) {
                                    class51.field1010[var6++] = -1;
                                    class170.field3029[var7++] = class246.field4413;
                                    class51.field1010[var6++] = 0;
                                    class170.field3029[var7++] = class246.field4413;
                                    class51.field1010[var6++] = 0;
                                } else {
                                    class51.field1010[var6++] = var294.field264;
                                    class170.field3029[var7++] = var294.field2327;
                                    class165 var295 = var294.method793(0);
                                    class51.field1010[var6++] = var295.field2960;
                                    class170.field3029[var7++] = var295.field2963;
                                    class51.field1010[var6++] = var294.field255;
                                }
                                continue;
                            }
                            if (var488 == 6507) {
                                var6 -= 4;
                                int var296 = class51.field1010[var6];
                                boolean var297 = class51.field1010[var6 + 1] == 1;
                                int var298 = class51.field1010[var6 + 2];
                                boolean var299 = class51.field1010[var6 + 3] == 1;
                                class122.method743(var299, var296, 6795, var298, var297);
                                continue;
                            }
                        } else if (var488 < 6700) {
                            if (var488 == 6600) {
                                var6--;
                                class51.field1019 = class51.field1010[var6] == 1;
                                class290.method1945(class4.field62, (byte) 92);
                                continue;
                            }
                            if (var488 == 6601) {
                                class51.field1010[var6++] = class51.field1019 ? 1 : 0;
                                continue;
                            }
                        }
                    } else if (var488 == 4400) {
                        var6 -= 2;
                        int var329 = class51.field1010[var6 + 1];
                        int var330 = class51.field1010[var6];
                        class112 var331 = class258.method1709(11, var329);
                        if (var331.method673(-2906)) {
                            class170.field3029[var7++] = class34.method232(167, var330).method1464(var331.field1968, var329, -1);
                        } else {
                            class51.field1010[var6++] = class34.method232(167, var330).method1463(-113, var331.field1973, var329);
                        }
                        continue;
                    }
                } else {
                    class43 var48;
                    if (var488 < 2000) {
                        var48 = var47 ? class248.field4458 : class274.field4875;
                    } else {
                        var488 -= 1000;
                        var6--;
                        var48 = class27.method186(1341, class51.field1010[var6]);
                    }
                    if (var488 == 1300) {
                        var6--;
                        int var49 = class51.field1010[var6] - 1;
                        if (var49 >= 0 && var49 <= 9) {
                            var7--;
                            var48.method269(-1, class170.field3029[var7], var49);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var488 == 1301) {
                        var6 -= 2;
                        int var50 = class51.field1010[var6];
                        int var51 = class51.field1010[var6 + 1];
                        var48.field715 = class185.method1211(-80, var50, var51);
                        continue;
                    }
                    if (var488 == 1302) {
                        var6--;
                        var48.field767 = class51.field1010[var6] == 1;
                        continue;
                    }
                    if (var488 == 1303) {
                        var6--;
                        var48.field743 = class51.field1010[var6];
                        continue;
                    }
                    if (var488 == 1304) {
                        var6--;
                        var48.field872 = class51.field1010[var6];
                        continue;
                    }
                    if (var488 == 1305) {
                        var7--;
                        var48.field800 = class170.field3029[var7];
                        continue;
                    }
                    if (var488 == 1306) {
                        var7--;
                        var48.field797 = class170.field3029[var7];
                        continue;
                    }
                    if (var488 == 1307) {
                        var48.field812 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var487) {
            if (var5.field3254 == null) {
                if (class235.field4290 != 0) {
                    class170.method1119(class246.field4413, 4096, class218.field3991, 0);
                }
                class255.method1689(99, "CS2 - scr:" + var5.field1162 + " op:" + var11, var487);
            } else {
                class143 var483 = class170.method1114(30, false);
                var483.method906(0, class191.field3509).method906(0, var5.field3254);
                for (int var484 = class57.field1111 - 1; var484 >= 0; var484--) {
                    var483.method906(0, class114.field1999).method906(0, class188.field3405[var484].field4418.field3254);
                }
                if (var11 == 40) {
                    int var485 = var10[var8];
                    var483.method906(0, class68.field1299).method906(0, class274.method1806(var485, true));
                }
                if (class235.field4290 != 0) {
                    class170.method1119(class246.field4413, 4096, class25.method179(0, new class143[] { class244.field4383, var5.field3254 }), 0);
                }
                class255.method1689(99, "CS2 - scr:" + var5.field1162 + " op:" + var11 + new String(var483.method889((byte) 6)), var487);
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZ)[B")
    public final byte[] method933(int arg0, boolean arg1) {
        class54 var3 = this.method942(arg0, 23894, 0);
        field2640++;
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method326(0);
            var3.method349(0);
            return arg1 ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(II)V")
    public static final void method934(int arg0, int arg1) {
        if (arg1 != 16383) {
            field2642 = -49;
        }
        class171.field3053.method835(arg1 ^ 0x3FFE, arg0);
        class282.field4971.method835(arg1 - 16382, arg0);
        field2625++;
        class24.field411.method835(1, arg0);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIZ)V")
    public static final void method935(int arg0, int arg1, int arg2, boolean arg3) {
        field2637++;
        class143 var4 = class25.method179(0, new class143[] { class134.field2338, class274.method1806(arg1, true), class18.field315, class274.method1806(arg0 >> 6, true), class18.field315, class274.method1806(arg2 >> 6, !arg3), class18.field315, class274.method1806(arg0 & 0x3F, true), class18.field315, class274.method1806(arg2 & 0x3F, true) });
        var4.method910(-68);
        class184.method1205((byte) -26, var4);
        if (arg3) {
            field2642 = -39;
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V")
    public final void method936(byte arg0) {
        field2620++;
        if (arg0 != 26) {
            field2642 = 120;
        }
        if (this.field2639 != null) {
            this.field2645 = true;
            if (this.field2648 == null) {
                this.field2648 = new class191();
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "(I)I")
    public final int method937(int arg0) {
        field2628++;
        if (this.method938(arg0 ^ 0xFFFFF001) == null) {
            return this.field2630 == null ? 0 : this.field2630.method330(-74);
        } else if (arg0 == 4015) {
            return 100;
        } else {
            return 27;
        }
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)Loa;")
    public final class252 method938(int arg0) {
        field2622++;
        if (this.field2616 != null) {
            return this.field2616;
        }
        if (this.field2630 == null) {
            if (this.field2617.method1854(20)) {
                return null;
            }
            this.field2630 = this.field2617.method1863(this.field2614, 255, true, -10618, (byte) 0);
        }
        if (this.field2630.field1054) {
            return null;
        }
        byte[] var2 = this.field2630.method326(0);
        if (this.field2630 instanceof class283) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2616 = new class252(var2, this.field2641);
                if (this.field2616.field4528 != this.field2634) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field2616 = null;
                if (this.field2617.method1854(20)) {
                    this.field2630 = null;
                } else {
                    this.field2630 = this.field2617.method1863(this.field2614, 255, true, -10618, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2616 = new class252(var2, this.field2641);
            } catch (RuntimeException var4) {
                this.field2617.method1864(0);
                this.field2616 = null;
                if (this.field2617.method1854(20)) {
                    this.field2630 = null;
                } else {
                    this.field2630 = this.field2617.method1863(this.field2614, 255, true, -10618, (byte) 0);
                }
                return null;
            }
            if (this.field2638 != null) {
                this.field2623.method1125(this.field2638, -112, var2, this.field2614);
            }
        }
        if (arg0 >= -49) {
            return null;
        }
        this.field2630 = null;
        if (this.field2639 != null) {
            this.field2615 = 0;
            this.field2618 = new byte[this.field2616.field4537];
        }
        return this.field2616;
    }

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "(I)I")
    public final int method939(int arg0) {
        field2644++;
        int var2 = -29 % ((arg0 - 1) / 48);
        return this.field2615;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lgf;I)V")
    public static final void method940(class7 arg0, int arg1) {
        class201.field3673 = arg0;
        if (arg1 != 6118) {
            field2635 = -3;
        }
        field2621++;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(II)V")
    public final void method941(int arg0, int arg1) {
        field2631++;
        if (this.field2639 == null) {
            return;
        }
        for (class61 var3 = this.field2647.method1294(false); var3 != null; var3 = this.field2647.method1292((byte) 108)) {
            if ((long) arg0 == var3.field1162) {
                return;
            }
        }
        class61 var4 = new class61();
        var4.field1162 = (long) arg0;
        int var5 = -33 / (-arg1 / 54);
        this.field2647.method1290((byte) -44, var4);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)Lja;")
    private final class54 method942(int arg0, int arg1, int arg2) {
        class54 var4 = (class54) this.field2613.method1824((long) arg0, 0);
        if (var4 != null && arg2 == 0 && !var4.field1052 && var4.field1054) {
            var4.method349(arg1 ^ 0x5D56);
            var4 = null;
        }
        field2624++;
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field2639 == null || this.field2618[arg0] == -1) {
                    if (this.field2617.method1854(20)) {
                        return null;
                    }
                    var4 = this.field2617.method1863(arg0, this.field2614, true, -10618, (byte) 2);
                } else {
                    var4 = this.field2623.method1133(this.field2639, arg0, (byte) 126);
                }
            } else if (arg2 == 1) {
                if (this.field2639 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2623.method1131(62, this.field2639, arg0);
            } else if (arg2 == 2) {
                if (this.field2639 == null) {
                    throw new RuntimeException();
                }
                if (this.field2618[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2617.method1865((byte) 88)) {
                    return null;
                }
                var4 = this.field2617.method1863(arg0, this.field2614, false, -10618, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field2613.method1825(var4, (byte) 64, (long) arg0);
        }
        if (var4.field1054) {
            return null;
        }
        byte[] var5 = var4.method326(arg1 ^ arg1);
        if (!var4 instanceof class283) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class129.field2284.reset();
                class129.field2284.update(var5, 0, var5.length - 2);
                int var9 = (int) class129.field2284.getValue();
                if (this.field2616.field4543[arg0] != var9) {
                    throw new RuntimeException();
                }
                this.field2617.field4982 = 0;
                this.field2617.field4980 = 0;
            } catch (RuntimeException var12) {
                this.field2617.method1864(0);
                var4.method349(arg1 - 23894);
                if (var4.field1052 && !this.field2617.method1854(20)) {
                    class174 var10 = this.field2617.method1863(arg0, this.field2614, true, -10618, (byte) 2);
                    this.field2613.method1825(var10, (byte) 64, (long) arg0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field2616.field4530[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field2616.field4530[arg0];
            if (this.field2639 != null) {
                this.field2623.method1125(this.field2639, arg1 ^ 0x5D0C, var5, arg0);
                if (this.field2618[arg0] != 1) {
                    this.field2615++;
                    this.field2618[arg0] = 1;
                }
            }
            if (!var4.field1052) {
                var4.method349(0);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class129.field2284.reset();
            class129.field2284.update(var5, 0, var5.length - 2);
            int var6 = (int) class129.field2284.getValue();
            if (this.field2616.field4543[arg0] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field2616.field4530[arg0] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field2618[arg0] != 1) {
                this.field2615++;
                this.field2618[arg0] = 1;
            }
            if (!var4.field1052) {
                var4.method349(arg1 ^ 0x5D56);
            }
            return var4;
        } catch (Exception var11) {
            this.field2618[arg0] = -1;
            var4.method349(0);
            if (var4.field1052 && !this.field2617.method1854(20)) {
                class174 var8 = this.field2617.method1863(arg0, this.field2614, true, arg1 ^ 0xFFFF8BD0, (byte) 2);
                this.field2613.method1825(var8, (byte) 64, (long) arg0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(B)V")
    public final void method943(byte arg0) {
        field2626++;
        if (this.field2648 == null || this.method938(-88) == null) {
            return;
        }
        if (arg0 >= -78) {
            this.field2648 = null;
        }
        for (class61 var2 = this.field2647.method1294(false); var2 != null; var2 = this.field2647.method1292((byte) 73)) {
            int var3 = (int) var2.field1162;
            if (var3 < 0 || this.field2616.field4537 <= var3 || this.field2616.field4541[var3] == 0) {
                var2.method349(0);
            } else {
                if (this.field2618[var3] == 0) {
                    this.method942(var3, 23894, 1);
                }
                if (this.field2618[var3] == -1) {
                    this.method942(var3, 23894, 2);
                }
                if (this.field2618[var3] == 1) {
                    var2.method349(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
    public static final void method944(boolean arg0) {
        class105.field1857 = -3;
        class35.field616 = 0;
        class170.field3030 = arg0;
        class88.field1598 = 1;
        field2612++;
        class27.field454 = -1;
        class116.field2060 = 0;
        class223.field4047 = 0;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(ILka;Lka;Loi;Lfh;IIZ)V")
    public class146(int arg0, class164 arg1, class164 arg2, class282 arg3, class172 arg4, int arg5, int arg6, boolean arg7) {
        this.field2614 = arg0;
        this.field2639 = arg1;
        if (this.field2639 == null) {
            this.field2646 = false;
        } else {
            this.field2646 = true;
            this.field2648 = new class191();
        }
        this.field2638 = arg2;
        this.field2634 = arg6;
        this.field2650 = arg7;
        this.field2641 = arg5;
        this.field2617 = arg3;
        this.field2623 = arg4;
        if (this.field2638 != null) {
            this.field2630 = this.field2623.method1133(this.field2638, this.field2614, (byte) 126);
        }
    }
}
