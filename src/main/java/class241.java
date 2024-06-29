import java.awt.Component;
import java.awt.Font;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class241 {

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "Z")
    private boolean field3794 = false;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    private int field3804 = 32;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "J")
    private long field3818 = class62.method472(16);

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "Z")
    private boolean field3822 = true;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "[Lmi;")
    private class88[] field3828 = new class88[8];

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "J")
    private long field3830 = 0L;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
    private int field3829 = 0;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    private int field3823 = 0;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    private int field3824 = 0;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "J")
    private long field3825 = 0L;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "[Lmi;")
    private class88[] field3832 = new class88[8];

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    private int field3833 = 0;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field3800 = -1;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3795 = "Connected to update server";

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "I")
    public static int field3816 = 0;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3801 = null;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    public int field3826;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public int field3827;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    private int field3831;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "Lmi;")
    private class88 field3819;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Ljava/awt/Font;")
    public static Font field3793;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "[I")
    public int[] field3817;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Lrg;")
    public static final class257 method1586(int arg0, int arg1) {
        field3811++;
        class257 var2 = (class257) class233.field3697.method1155((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class279.field4423.method900(arg0, arg1, false);
        class257 var4 = new class257();
        if (var3 != null) {
            var4.method1715(arg0 ^ 0xFFFFFFDE, arg1, new class136(var3));
        }
        class233.field3697.method1161(var4, (byte) -105, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lai;IZ)V")
    public static final void method1587(class196 arg0, int arg1, boolean arg2) {
        Object[] var3 = arg0.field3205;
        field3810++;
        int var4 = (Integer) var3[0];
        class193 var5 = class82.method657(var4, (byte) 11);
        if (var5 == null) {
            return;
        }
        class119.field2020 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field3166;
        int[] var10 = var5.field3158;
        byte var11 = -1;
        try {
            class236.field3728 = new String[var5.field3167];
            class139.field2333 = new int[var5.field3157];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg0.field3211;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg0.field3203;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg0.field3213 == null ? -1 : arg0.field3213.field1789;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg0.field3217;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg0.field3213 == null ? -1 : arg0.field3213.field1916;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg0.field3207 == null ? -1 : arg0.field3207.field1789;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg0.field3207 == null ? -1 : arg0.field3207.field1916;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg0.field3212;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg0.field3206;
                    }
                    class139.field2333[var13++] = var15;
                } else if (var3[var14] instanceof String) {
                    String var16 = (String) var3[var14];
                    if (var16.equals("event_opbase")) {
                        var16 = arg0.field3202;
                    }
                    class236.field3728[var12++] = var16;
                }
            }
            int var17 = 0;
            if (!arg2) {
                field3801 = null;
            }
            label4061: while (true) {
                var17++;
                if (var17 > arg1) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var517 = var10[var8];
                if (var517 < 100) {
                    if (var517 == 0) {
                        class66.field1074[var6++] = var9[var8];
                        continue;
                    }
                    if (var517 == 1) {
                        int var18 = var9[var8];
                        class66.field1074[var6++] = class192.field3138[var18];
                        continue;
                    }
                    if (var517 == 2) {
                        int var19 = var9[var8];
                        var6--;
                        class293.method1967(class66.field1074[var6], var19, 2910);
                        continue;
                    }
                    if (var517 == 3) {
                        class176.field2945[var7++] = var5.field3160[var8];
                        continue;
                    }
                    if (var517 == 6) {
                        var8 += var9[var8];
                        continue;
                    }
                    if (var517 == 7) {
                        var6 -= 2;
                        if (class66.field1074[var6 + 1] != class66.field1074[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var517 == 8) {
                        var6 -= 2;
                        if (class66.field1074[var6 + 1] == class66.field1074[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var517 == 9) {
                        var6 -= 2;
                        if (class66.field1074[var6 + 1] > class66.field1074[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var517 == 10) {
                        var6 -= 2;
                        if (class66.field1074[var6 + 1] < class66.field1074[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var517 == 21) {
                        if (class119.field2020 == 0) {
                            return;
                        }
                        class37 var20 = class18.field258[--class119.field2020];
                        var8 = var20.field631;
                        class139.field2333 = var20.field625;
                        class236.field3728 = var20.field633;
                        var5 = var20.field624;
                        var10 = var5.field3158;
                        var9 = var5.field3166;
                        continue;
                    }
                    if (var517 == 25) {
                        int var21 = var9[var8];
                        class66.field1074[var6++] = class137.method1030(var21, (byte) 78);
                        continue;
                    }
                    if (var517 == 27) {
                        int var22 = var9[var8];
                        var6--;
                        class108.method805(class66.field1074[var6], var22, -2);
                        continue;
                    }
                    if (var517 == 31) {
                        var6 -= 2;
                        if (class66.field1074[var6 + 1] >= class66.field1074[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var517 == 32) {
                        var6 -= 2;
                        if (class66.field1074[var6 + 1] <= class66.field1074[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var517 == 33) {
                        class66.field1074[var6++] = class139.field2333[var9[var8]];
                        continue;
                    }
                    int var10001;
                    if (var517 == 34) {
                        var10001 = var9[var8];
                        var6--;
                        class139.field2333[var10001] = class66.field1074[var6];
                        continue;
                    }
                    if (var517 == 35) {
                        class176.field2945[var7++] = class236.field3728[var9[var8]];
                        continue;
                    }
                    if (var517 == 36) {
                        var10001 = var9[var8];
                        var7--;
                        class236.field3728[var10001] = class176.field2945[var7];
                        continue;
                    }
                    if (var517 == 37) {
                        int var23 = var9[var8];
                        var7 -= var23;
                        String var24 = class104.method775(true, var23, var7, class176.field2945);
                        class176.field2945[var7++] = var24;
                        continue;
                    }
                    if (var517 == 38) {
                        var6--;
                        continue;
                    }
                    if (var517 == 39) {
                        var7--;
                        continue;
                    }
                    if (var517 == 40) {
                        int var25 = var9[var8];
                        class193 var26 = class82.method657(var25, (byte) -13);
                        int[] var27 = new int[var26.field3157];
                        String[] var28 = new String[var26.field3167];
                        for (int var29 = 0; var29 < var26.field3151; var29++) {
                            var27[var29] = class66.field1074[var29 + var6 - var26.field3151];
                        }
                        for (int var30 = 0; var30 < var26.field3169; var30++) {
                            var28[var30] = class176.field2945[var30 + var7 - var26.field3169];
                        }
                        var6 -= var26.field3151;
                        var7 -= var26.field3169;
                        class37 var31 = new class37();
                        var31.field625 = class139.field2333;
                        var31.field631 = var8;
                        var31.field624 = var5;
                        var31.field633 = class236.field3728;
                        if (class18.field258.length <= class119.field2020) {
                            throw new RuntimeException();
                        }
                        var8 = -1;
                        var5 = var26;
                        class18.field258[class119.field2020++] = var31;
                        var9 = var26.field3166;
                        var10 = var26.field3158;
                        class139.field2333 = var27;
                        class236.field3728 = var28;
                        continue;
                    }
                    if (var517 == 42) {
                        class66.field1074[var6++] = class43.field782[var9[var8]];
                        continue;
                    }
                    if (var517 == 43) {
                        int var32 = var9[var8];
                        var6--;
                        class43.field782[var32] = class66.field1074[var6];
                        class218.method1446((byte) -111, var32);
                        continue;
                    }
                    if (var517 == 44) {
                        int var33 = var9[var8] >> 16;
                        int var34 = var9[var8] & 0xFFFF;
                        var6--;
                        int var35 = class66.field1074[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            class12.field163[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label4061;
                                }
                                class194.field3174[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 45) {
                        int var38 = var9[var8];
                        var6--;
                        int var39 = class66.field1074[var6];
                        if (var39 >= 0 && var39 < class12.field163[var38]) {
                            class66.field1074[var6++] = class194.field3174[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 46) {
                        var6 -= 2;
                        int var40 = var9[var8];
                        int var41 = class66.field1074[var6];
                        if (var41 >= 0 && class12.field163[var40] > var41) {
                            class194.field3174[var40][var41] = class66.field1074[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var517 == 47) {
                        String var42 = class91.field1437[var9[var8]];
                        if (var42 == null) {
                            var42 = "null";
                        }
                        class176.field2945[var7++] = var42;
                        continue;
                    }
                    if (var517 == 48) {
                        int var43 = var9[var8];
                        var7--;
                        class91.field1437[var43] = class176.field2945[var7];
                        class222.method1497(var43, (byte) -68);
                        continue;
                    }
                    if (var517 == 51) {
                        class144 var44 = var5.field3163[var9[var8]];
                        var6--;
                        class186 var45 = (class186) var44.method1063((byte) -95, (long) class66.field1074[var6]);
                        if (var45 != null) {
                            var8 += var45.field3051;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var9[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var517 < 300) {
                    if (var517 == 100) {
                        var6 -= 3;
                        int var47 = class66.field1074[var6 + 2];
                        int var48 = class66.field1074[var6 + 1];
                        int var49 = class66.field1074[var6];
                        if (var48 == 0) {
                            throw new RuntimeException();
                        }
                        class114 var50 = class8.method43(var49, (byte) -61);
                        if (var50.field1820 == null) {
                            var50.field1820 = new class114[var47 + 1];
                        }
                        if (var50.field1820.length <= var47) {
                            class114[] var51 = new class114[var47 + 1];
                            for (int var52 = 0; var52 < var50.field1820.length; var52++) {
                                var51[var52] = var50.field1820[var52];
                            }
                            var50.field1820 = var51;
                        }
                        if (var47 > 0 && var50.field1820[var47 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var47 - 1));
                        }
                        class114 var53 = new class114();
                        var53.field1898 = var48;
                        var53.field1916 = var47;
                        var53.field1910 = var53.field1789 = var50.field1789;
                        var53.field1765 = true;
                        var50.field1820[var47] = var53;
                        if (var46) {
                            class247.field3886 = var53;
                        } else {
                            class174.field2926 = var53;
                        }
                        class72.method556(0, var50);
                        continue;
                    }
                    if (var517 == 101) {
                        class114 var54 = var46 ? class247.field3886 : class174.field2926;
                        if (var54.field1916 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class114 var55 = class8.method43(var54.field1789, (byte) 95);
                        var55.field1820[var54.field1916] = null;
                        class72.method556(0, var55);
                        continue;
                    }
                    if (var517 == 102) {
                        var6--;
                        class114 var56 = class8.method43(class66.field1074[var6], (byte) -125);
                        var56.field1820 = null;
                        class72.method556(0, var56);
                        continue;
                    }
                    if (var517 == 200) {
                        var6 -= 2;
                        int var57 = class66.field1074[var6 + 1];
                        int var58 = class66.field1074[var6];
                        class114 var59 = class129.method939(var58, 36, var57);
                        if (var59 != null && var57 != -1) {
                            class66.field1074[var6++] = 1;
                            if (var46) {
                                class247.field3886 = var59;
                            } else {
                                class174.field2926 = var59;
                            }
                            continue;
                        }
                        class66.field1074[var6++] = 0;
                        continue;
                    }
                    if (var517 == 201) {
                        var6--;
                        int var60 = class66.field1074[var6];
                        class114 var61 = class8.method43(var60, (byte) 103);
                        if (var61 == null) {
                            class66.field1074[var6++] = 0;
                        } else {
                            class66.field1074[var6++] = 1;
                            if (var46) {
                                class247.field3886 = var61;
                            } else {
                                class174.field2926 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var517 < 500) {
                    if (var517 == 403) {
                        var6 -= 2;
                        int var505 = class66.field1074[var6];
                        int var506 = class66.field1074[var6 + 1];
                        for (int var507 = 0; var507 < class183.field3024.length; var507++) {
                            if (class183.field3024[var507] == var505) {
                                class48.field878.field3439.method651(var507, var506, -1);
                                continue label4061;
                            }
                        }
                        int var508 = 0;
                        while (true) {
                            if (var508 >= class185.field3046.length) {
                                continue label4061;
                            }
                            if (class185.field3046[var508] == var505) {
                                class48.field878.field3439.method651(var508, var506, -1);
                                continue label4061;
                            }
                            var508++;
                        }
                    }
                    if (var517 == 404) {
                        var6 -= 2;
                        int var509 = class66.field1074[var6 + 1];
                        int var510 = class66.field1074[var6];
                        class48.field878.field3439.method649(var510, true, var509);
                        continue;
                    }
                    if (var517 == 410) {
                        var6--;
                        boolean var511 = class66.field1074[var6] != 0;
                        class48.field878.field3439.method648(-55, var511);
                        continue;
                    }
                } else if (!(var517 < 1000 || var517 >= 1100) || !(var517 < 2000 || var517 >= 2100)) {
                    class114 var499;
                    if (var517 < 2000) {
                        var499 = var46 ? class247.field3886 : class174.field2926;
                    } else {
                        var517 -= 1000;
                        var6--;
                        var499 = class8.method43(class66.field1074[var6], (byte) -63);
                    }
                    if (var517 == 1000) {
                        var6 -= 4;
                        var499.field1810 = class66.field1074[var6];
                        var499.field1830 = class66.field1074[var6 + 1];
                        int var500 = class66.field1074[var6 + 2];
                        int var501 = class66.field1074[var6 + 3];
                        if (var500 < 0) {
                            var500 = 0;
                        } else if (var500 > 5) {
                            var500 = 5;
                        }
                        var499.field1770 = (byte) var500;
                        if (var501 < 0) {
                            var501 = 0;
                        } else if (var501 > 5) {
                            var501 = 5;
                        }
                        var499.field1778 = (byte) var501;
                        class72.method556(0, var499);
                        class69.method537(var499, 0);
                        if (var499.field1916 == -1) {
                            class110.method822(1967, var499.field1789);
                        }
                        continue;
                    }
                    if (var517 == 1001) {
                        var6 -= 4;
                        var499.field1752 = class66.field1074[var6];
                        var499.field1902 = class66.field1074[var6 + 1];
                        var499.field1861 = 0;
                        var499.field1909 = 0;
                        int var502 = class66.field1074[var6 + 2];
                        if (var502 < 0) {
                            var502 = 0;
                        } else if (var502 > 4) {
                            var502 = 4;
                        }
                        int var503 = class66.field1074[var6 + 3];
                        if (var503 < 0) {
                            var503 = 0;
                        } else if (var503 > 4) {
                            var503 = 4;
                        }
                        var499.field1838 = (byte) var503;
                        var499.field1749 = (byte) var502;
                        class72.method556(0, var499);
                        class69.method537(var499, 0);
                        if (var499.field1898 == 0) {
                            class42.method370(false, (byte) -53, var499);
                        }
                        continue;
                    }
                    if (var517 == 1003) {
                        var6--;
                        boolean var504 = class66.field1074[var6] == 1;
                        if (var504 != var499.field1885) {
                            var499.field1885 = var504;
                            class72.method556(0, var499);
                        }
                        if (var499.field1916 == -1) {
                            class254.method1698((byte) 32, var499.field1789);
                        }
                        continue;
                    }
                    if (var517 == 1004) {
                        var6 -= 2;
                        var499.field1851 = class66.field1074[var6];
                        var499.field1769 = class66.field1074[var6 + 1];
                        class72.method556(0, var499);
                        class69.method537(var499, 0);
                        if (var499.field1898 == 0) {
                            class42.method370(false, (byte) -126, var499);
                        }
                        continue;
                    }
                    if (var517 == 1005) {
                        var6--;
                        var499.field1818 = class66.field1074[var6] == 1;
                        continue;
                    }
                } else if (var517 >= 1100 && var517 < 1200 || var517 >= 2100 && var517 < 2200) {
                    class114 var62;
                    if (var517 < 2000) {
                        var62 = var46 ? class247.field3886 : class174.field2926;
                    } else {
                        var6--;
                        var62 = class8.method43(class66.field1074[var6], (byte) -61);
                        var517 -= 1000;
                    }
                    if (var517 == 1100) {
                        var6 -= 2;
                        var62.field1828 = class66.field1074[var6];
                        if (var62.field1915 - var62.field1790 < var62.field1828) {
                            var62.field1828 = var62.field1915 - var62.field1790;
                        }
                        if (var62.field1828 < 0) {
                            var62.field1828 = 0;
                        }
                        var62.field1842 = class66.field1074[var6 + 1];
                        if (var62.field1842 > var62.field1807 - var62.field1919) {
                            var62.field1842 = var62.field1807 - var62.field1919;
                        }
                        if (var62.field1842 < 0) {
                            var62.field1842 = 0;
                        }
                        class72.method556(0, var62);
                        if (var62.field1916 == -1) {
                            class18.method146(12, var62.field1789);
                        }
                        continue;
                    }
                    if (var517 == 1101) {
                        var6--;
                        var62.field1843 = class66.field1074[var6];
                        class72.method556(0, var62);
                        if (var62.field1916 == -1) {
                            class235.method1556(var62.field1789, 6);
                        }
                        continue;
                    }
                    if (var517 == 1102) {
                        var6--;
                        var62.field1764 = class66.field1074[var6] == 1;
                        class72.method556(0, var62);
                        continue;
                    }
                    if (var517 == 1103) {
                        var6--;
                        var62.field1772 = class66.field1074[var6];
                        class72.method556(0, var62);
                        continue;
                    }
                    if (var517 == 1104) {
                        var6--;
                        var62.field1768 = class66.field1074[var6];
                        class72.method556(0, var62);
                        continue;
                    }
                    if (var517 == 1105) {
                        var6--;
                        var62.field1918 = class66.field1074[var6];
                        class72.method556(0, var62);
                        continue;
                    }
                    if (var517 == 1106) {
                        var6--;
                        var62.field1844 = class66.field1074[var6];
                        class72.method556(0, var62);
                        continue;
                    }
                    if (var517 == 1107) {
                        var6--;
                        var62.field1762 = class66.field1074[var6] == 1;
                        class72.method556(0, var62);
                        continue;
                    }
                    if (var517 == 1108) {
                        var62.field1892 = 1;
                        var6--;
                        var62.field1931 = class66.field1074[var6];
                        class72.method556(0, var62);
                        if (var62.field1916 == -1) {
                            class59.method457((byte) 124, var62.field1789);
                        }
                        continue;
                    }
                    if (var517 == 1109) {
                        var6 -= 6;
                        var62.field1858 = class66.field1074[var6];
                        var62.field1899 = class66.field1074[var6 + 1];
                        var62.field1863 = class66.field1074[var6 + 2];
                        var62.field1756 = class66.field1074[var6 + 3];
                        var62.field1823 = class66.field1074[var6 + 4];
                        var62.field1868 = class66.field1074[var6 + 5];
                        class72.method556(0, var62);
                        if (var62.field1916 == -1) {
                            class31.method266(var62.field1789, (byte) -97);
                            class178.method1264((byte) 63, var62.field1789);
                        }
                        continue;
                    }
                    if (var517 == 1110) {
                        var6--;
                        int var63 = class66.field1074[var6];
                        if (var62.field1816 != var63) {
                            var62.field1816 = var63;
                            var62.field1825 = 0;
                            var62.field1819 = 0;
                            var62.field1912 = 1;
                            class72.method556(0, var62);
                        }
                        if (var62.field1916 == -1) {
                            class21.method173((byte) -125, var62.field1789);
                        }
                        continue;
                    }
                    if (var517 == 1111) {
                        var6--;
                        var62.field1798 = class66.field1074[var6] == 1;
                        class72.method556(0, var62);
                        continue;
                    }
                    if (var517 == 1112) {
                        var7--;
                        String var64 = class176.field2945[var7];
                        if (!var64.equals(var62.field1800)) {
                            var62.field1800 = var64;
                            class72.method556(0, var62);
                        }
                        if (var62.field1916 == -1) {
                            class50.method422(var62.field1789, -121);
                        }
                        continue;
                    }
                    if (var517 == 1113) {
                        var6--;
                        var62.field1776 = class66.field1074[var6];
                        class72.method556(0, var62);
                        continue;
                    }
                    if (var517 == 1114) {
                        var6 -= 3;
                        var62.field1905 = class66.field1074[var6];
                        var62.field1904 = class66.field1074[var6 + 1];
                        var62.field1923 = class66.field1074[var6 + 2];
                        class72.method556(0, var62);
                        continue;
                    }
                    if (var517 == 1115) {
                        var6--;
                        var62.field1801 = class66.field1074[var6] == 1;
                        class72.method556(0, var62);
                        continue;
                    }
                    if (var517 == 1116) {
                        var6--;
                        var62.field1754 = class66.field1074[var6];
                        class72.method556(0, var62);
                        continue;
                    }
                    if (var517 == 1117) {
                        var6--;
                        var62.field1815 = class66.field1074[var6];
                        class72.method556(0, var62);
                        continue;
                    }
                    if (var517 == 1118) {
                        var6--;
                        var62.field1917 = class66.field1074[var6] == 1;
                        class72.method556(0, var62);
                        continue;
                    }
                    if (var517 == 1119) {
                        var6--;
                        var62.field1757 = class66.field1074[var6] == 1;
                        class72.method556(0, var62);
                        continue;
                    }
                    if (var517 == 1120) {
                        var6 -= 2;
                        var62.field1915 = class66.field1074[var6];
                        var62.field1807 = class66.field1074[var6 + 1];
                        class72.method556(0, var62);
                        if (var62.field1898 == 0) {
                            class42.method370(false, (byte) -90, var62);
                        }
                        continue;
                    }
                    if (var517 == 1121) {
                        class72.method556(0, var62);
                        var6 -= 2;
                        continue;
                    }
                    if (var517 == 1122) {
                        var6--;
                        var62.field1896 = class66.field1074[var6] == 1;
                        class72.method556(0, var62);
                        continue;
                    }
                    if (var517 == 1123) {
                        var6--;
                        var62.field1868 = class66.field1074[var6];
                        class72.method556(0, var62);
                        if (var62.field1916 == -1) {
                            class31.method266(var62.field1789, (byte) -94);
                        }
                        continue;
                    }
                    if (var517 == 1124) {
                        var6--;
                        int var65 = class66.field1074[var6];
                        var62.field1908 = var65 == 1;
                        class72.method556(0, var62);
                        continue;
                    }
                } else if (var517 >= 1200 && var517 < 1300 || var517 >= 2200 && var517 < 2300) {
                    class114 var495;
                    if (var517 >= 2000) {
                        var6--;
                        var495 = class8.method43(class66.field1074[var6], (byte) 63);
                        var517 -= 1000;
                    } else {
                        var495 = var46 ? class247.field3886 : class174.field2926;
                    }
                    class72.method556(0, var495);
                    if (var517 == 1200 || var517 == 1205 || var517 == 1208 || var517 == 1209) {
                        var6 -= 2;
                        int var496 = class66.field1074[var6];
                        int var497 = class66.field1074[var6 + 1];
                        if (var495.field1916 == -1) {
                            class22.method178(var495.field1789, false);
                            class31.method266(var495.field1789, (byte) -117);
                            class178.method1264((byte) 63, var495.field1789);
                        }
                        if (var496 == -1) {
                            var495.field1920 = -1;
                            var495.field1892 = 1;
                            var495.field1931 = -1;
                            continue;
                        }
                        var495.field1920 = var496;
                        if (var517 == 1208 || var517 == 1209) {
                            var495.field1906 = true;
                        } else {
                            var495.field1906 = false;
                        }
                        var495.field1796 = var497;
                        class67 var498 = class190.method1314(var496, (byte) 68);
                        var495.field1756 = var498.field1124;
                        var495.field1899 = var498.field1133;
                        var495.field1863 = var498.field1123;
                        var495.field1823 = var498.field1091;
                        if (var517 == 1205) {
                            var495.field1806 = false;
                        } else {
                            var495.field1806 = true;
                        }
                        var495.field1868 = var498.field1141;
                        var495.field1858 = var498.field1102;
                        if (var495.field1909 > 0) {
                            var495.field1868 = var495.field1868 * 32 / var495.field1909;
                        } else if (var495.field1752 > 0) {
                            var495.field1868 = var495.field1868 * 32 / var495.field1752;
                        }
                        continue;
                    }
                    if (var517 == 1201) {
                        var495.field1892 = 2;
                        var6--;
                        var495.field1931 = class66.field1074[var6];
                        if (var495.field1916 == -1) {
                            class59.method457((byte) 125, var495.field1789);
                        }
                        continue;
                    }
                    if (var517 == 1202) {
                        var495.field1892 = 3;
                        var495.field1931 = class48.field878.field3439.method654(-6);
                        if (var495.field1916 == -1) {
                            class59.method457((byte) 122, var495.field1789);
                        }
                        continue;
                    }
                    if (var517 == 1203) {
                        var495.field1892 = 6;
                        var6--;
                        var495.field1931 = class66.field1074[var6];
                        if (var495.field1916 == -1) {
                            class59.method457((byte) 122, var495.field1789);
                        }
                        continue;
                    }
                    if (var517 == 1204) {
                        var495.field1892 = 5;
                        var6--;
                        var495.field1931 = class66.field1074[var6];
                        if (var495.field1916 == -1) {
                            class59.method457((byte) 124, var495.field1789);
                        }
                        continue;
                    }
                    if (var517 == 1206) {
                        var6 -= 4;
                        var495.field1855 = class66.field1074[var6];
                        var495.field1880 = class66.field1074[var6 + 1];
                        var495.field1788 = class66.field1074[var6 + 2];
                        var495.field1827 = class66.field1074[var6 + 3];
                        class72.method556(0, var495);
                        continue;
                    }
                    if (var517 == 1207) {
                        var6 -= 2;
                        var495.field1913 = class66.field1074[var6];
                        var495.field1888 = class66.field1074[var6 + 1];
                        class72.method556(0, var495);
                        continue;
                    }
                } else if ((var517 < 1300 || var517 >= 1400) && (var517 < 2300 || var517 >= 2400)) {
                    if (var517 >= 1400 && var517 < 1500 || var517 >= 2400 && var517 < 2500) {
                        class114 var482;
                        if (var517 < 2000) {
                            var482 = var46 ? class247.field3886 : class174.field2926;
                        } else {
                            var6--;
                            var482 = class8.method43(class66.field1074[var6], (byte) 94);
                            var517 -= 1000;
                        }
                        int[] var483 = null;
                        var7--;
                        String var484 = class176.field2945[var7];
                        if (var484.length() > 0 && var484.charAt(var484.length() - 1) == 'Y') {
                            var6--;
                            int var485 = class66.field1074[var6];
                            if (var485 > 0) {
                                var483 = new int[var485];
                                while ((var485--) > 0) {
                                    var6--;
                                    var483[var485] = class66.field1074[var6];
                                }
                            }
                            var484 = var484.substring(0, var484.length() - 1);
                        }
                        Object[] var486 = new Object[var484.length() + 1];
                        for (int var487 = var486.length - 1; var487 >= 1; var487--) {
                            if (var484.charAt(var487 - 1) == 's') {
                                var7--;
                                var486[var487] = class176.field2945[var7];
                            } else {
                                var6--;
                                var486[var487] = Integer.valueOf(class66.field1074[var6]);
                            }
                        }
                        var6--;
                        int var488 = class66.field1074[var6];
                        if (var488 == -1) {
                            var486 = null;
                        } else {
                            var486[0] = Integer.valueOf(var488);
                        }
                        if (var517 == 1400) {
                            var482.field1856 = var486;
                        } else if (var517 == 1401) {
                            var482.field1854 = var486;
                        } else if (var517 == 1402) {
                            var482.field1922 = var486;
                        } else if (var517 == 1403) {
                            var482.field1792 = var486;
                        } else if (var517 == 1404) {
                            var482.field1886 = var486;
                        } else if (var517 == 1405) {
                            var482.field1811 = var486;
                        } else if (var517 == 1406) {
                            var482.field1832 = var486;
                        } else if (var517 == 1407) {
                            var482.field1821 = var486;
                            var482.field1890 = var483;
                        } else if (var517 == 1408) {
                            var482.field1787 = var486;
                        } else if (var517 == 1409) {
                            var482.field1921 = var486;
                        } else if (var517 == 1410) {
                            var482.field1795 = var486;
                        } else if (var517 == 1411) {
                            var482.field1837 = var486;
                        } else if (var517 == 1412) {
                            var482.field1802 = var486;
                        } else if (var517 == 1414) {
                            var482.field1900 = var483;
                            var482.field1766 = var486;
                        } else if (var517 == 1415) {
                            var482.field1817 = var486;
                            var482.field1755 = var483;
                        } else if (var517 == 1416) {
                            var482.field1924 = var486;
                        } else if (var517 == 1417) {
                            var482.field1848 = var486;
                        } else if (var517 == 1418) {
                            var482.field1809 = var486;
                        } else if (var517 == 1419) {
                            var482.field1836 = var486;
                        } else if (var517 == 1420) {
                            var482.field1901 = var486;
                        } else if (var517 == 1421) {
                            var482.field1850 = var486;
                        } else if (var517 == 1422) {
                            var482.field1849 = var486;
                        } else if (var517 == 1423) {
                            var482.field1805 = var486;
                        } else if (var517 == 1424) {
                            var482.field1927 = var486;
                        } else if (var517 == 1425) {
                            var482.field1774 = var486;
                        } else if (var517 == 1426) {
                            var482.field1783 = var486;
                        } else if (var517 == 1427) {
                            var482.field1812 = var486;
                        } else if (var517 == 1428) {
                            var482.field1867 = var483;
                            var482.field1813 = var486;
                        } else if (var517 == 1429) {
                            var482.field1925 = var483;
                            var482.field1871 = var486;
                        }
                        var482.field1879 = true;
                        continue;
                    }
                    if (var517 < 1600) {
                        class114 var481 = var46 ? class247.field3886 : class174.field2926;
                        if (var517 == 1500) {
                            class66.field1074[var6++] = var481.field1779;
                            continue;
                        }
                        if (var517 == 1501) {
                            class66.field1074[var6++] = var481.field1875;
                            continue;
                        }
                        if (var517 == 1502) {
                            class66.field1074[var6++] = var481.field1790;
                            continue;
                        }
                        if (var517 == 1503) {
                            class66.field1074[var6++] = var481.field1919;
                            continue;
                        }
                        if (var517 == 1504) {
                            class66.field1074[var6++] = var481.field1885 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 1505) {
                            class66.field1074[var6++] = var481.field1910;
                            continue;
                        }
                    } else if (var517 < 1700) {
                        class114 var66 = var46 ? class247.field3886 : class174.field2926;
                        if (var517 == 1600) {
                            class66.field1074[var6++] = var66.field1828;
                            continue;
                        }
                        if (var517 == 1601) {
                            class66.field1074[var6++] = var66.field1842;
                            continue;
                        }
                        if (var517 == 1602) {
                            class176.field2945[var7++] = var66.field1800;
                            continue;
                        }
                        if (var517 == 1603) {
                            class66.field1074[var6++] = var66.field1915;
                            continue;
                        }
                        if (var517 == 1604) {
                            class66.field1074[var6++] = var66.field1807;
                            continue;
                        }
                        if (var517 == 1605) {
                            class66.field1074[var6++] = var66.field1868;
                            continue;
                        }
                        if (var517 == 1606) {
                            class66.field1074[var6++] = var66.field1863;
                            continue;
                        }
                        if (var517 == 1607) {
                            class66.field1074[var6++] = var66.field1823;
                            continue;
                        }
                        if (var517 == 1608) {
                            class66.field1074[var6++] = var66.field1756;
                            continue;
                        }
                        if (var517 == 1609) {
                            class66.field1074[var6++] = var66.field1772;
                            continue;
                        }
                        if (var517 == 1610) {
                            class66.field1074[var6++] = var66.field1858;
                            continue;
                        }
                        if (var517 == 1611) {
                            class66.field1074[var6++] = var66.field1899;
                            continue;
                        }
                        if (var517 == 1612) {
                            class66.field1074[var6++] = var66.field1918;
                            continue;
                        }
                    } else if (var517 < 1800) {
                        class114 var480 = var46 ? class247.field3886 : class174.field2926;
                        if (var517 == 1700) {
                            class66.field1074[var6++] = var480.field1920;
                            continue;
                        }
                        if (var517 == 1701) {
                            if (var480.field1920 == -1) {
                                class66.field1074[var6++] = 0;
                            } else {
                                class66.field1074[var6++] = var480.field1796;
                            }
                            continue;
                        }
                        if (var517 == 1702) {
                            class66.field1074[var6++] = var480.field1916;
                            continue;
                        }
                    } else if (var517 < 1900) {
                        class114 var67 = var46 ? class247.field3886 : class174.field2926;
                        if (var517 == 1800) {
                            class66.field1074[var6++] = client.method1916(var67).method1686(69);
                            continue;
                        }
                        if (var517 == 1801) {
                            var6--;
                            int var68 = class66.field1074[var6];
                            int var518 = var68 - 1;
                            if (var67.field1775 != null && var518 < var67.field1775.length && var67.field1775[var518] != null) {
                                class176.field2945[var7++] = var67.field1775[var518];
                                continue;
                            }
                            class176.field2945[var7++] = "";
                            continue;
                        }
                        if (var517 == 1802) {
                            if (var67.field1897 == null) {
                                class176.field2945[var7++] = "";
                            } else {
                                class176.field2945[var7++] = var67.field1897;
                            }
                            continue;
                        }
                    } else if (var517 < 2600) {
                        var6--;
                        class114 var479 = class8.method43(class66.field1074[var6], (byte) 30);
                        if (var517 == 2500) {
                            class66.field1074[var6++] = var479.field1779;
                            continue;
                        }
                        if (var517 == 2501) {
                            class66.field1074[var6++] = var479.field1875;
                            continue;
                        }
                        if (var517 == 2502) {
                            class66.field1074[var6++] = var479.field1790;
                            continue;
                        }
                        if (var517 == 2503) {
                            class66.field1074[var6++] = var479.field1919;
                            continue;
                        }
                        if (var517 == 2504) {
                            class66.field1074[var6++] = var479.field1885 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 2505) {
                            class66.field1074[var6++] = var479.field1910;
                            continue;
                        }
                    } else if (var517 < 2700) {
                        var6--;
                        class114 var478 = class8.method43(class66.field1074[var6], (byte) 69);
                        if (var517 == 2600) {
                            class66.field1074[var6++] = var478.field1828;
                            continue;
                        }
                        if (var517 == 2601) {
                            class66.field1074[var6++] = var478.field1842;
                            continue;
                        }
                        if (var517 == 2602) {
                            class176.field2945[var7++] = var478.field1800;
                            continue;
                        }
                        if (var517 == 2603) {
                            class66.field1074[var6++] = var478.field1915;
                            continue;
                        }
                        if (var517 == 2604) {
                            class66.field1074[var6++] = var478.field1807;
                            continue;
                        }
                        if (var517 == 2605) {
                            class66.field1074[var6++] = var478.field1868;
                            continue;
                        }
                        if (var517 == 2606) {
                            class66.field1074[var6++] = var478.field1863;
                            continue;
                        }
                        if (var517 == 2607) {
                            class66.field1074[var6++] = var478.field1823;
                            continue;
                        }
                        if (var517 == 2608) {
                            class66.field1074[var6++] = var478.field1756;
                            continue;
                        }
                        if (var517 == 2609) {
                            class66.field1074[var6++] = var478.field1772;
                            continue;
                        }
                        if (var517 == 2610) {
                            class66.field1074[var6++] = var478.field1858;
                            continue;
                        }
                        if (var517 == 2611) {
                            class66.field1074[var6++] = var478.field1899;
                            continue;
                        }
                        if (var517 == 2612) {
                            class66.field1074[var6++] = var478.field1918;
                            continue;
                        }
                    } else if (var517 < 2800) {
                        if (var517 == 2700) {
                            var6--;
                            class114 var468 = class8.method43(class66.field1074[var6], (byte) -83);
                            class66.field1074[var6++] = var468.field1920;
                            continue;
                        }
                        if (var517 == 2701) {
                            var6--;
                            class114 var469 = class8.method43(class66.field1074[var6], (byte) 113);
                            if (var469.field1920 == -1) {
                                class66.field1074[var6++] = 0;
                            } else {
                                class66.field1074[var6++] = var469.field1796;
                            }
                            continue;
                        }
                        if (var517 == 2702) {
                            var6--;
                            int var470 = class66.field1074[var6];
                            class167 var471 = (class167) class91.field1434.method1063((byte) -85, (long) var470);
                            if (var471 == null) {
                                class66.field1074[var6++] = 0;
                            } else {
                                class66.field1074[var6++] = 1;
                            }
                            continue;
                        }
                        if (var517 == 2703) {
                            var6--;
                            class114 var472 = class8.method43(class66.field1074[var6], (byte) 106);
                            if (var472.field1820 == null) {
                                class66.field1074[var6++] = 0;
                                continue;
                            }
                            int var473 = var472.field1820.length;
                            for (int var474 = 0; var474 < var472.field1820.length; var474++) {
                                if (var472.field1820[var474] == null) {
                                    var473 = var474;
                                    break;
                                }
                            }
                            class66.field1074[var6++] = var473;
                            continue;
                        }
                        if (var517 == 2704 || var517 == 2705) {
                            var6 -= 2;
                            int var475 = class66.field1074[var6];
                            int var476 = class66.field1074[var6 + 1];
                            class167 var477 = (class167) class91.field1434.method1063((byte) -19, (long) var475);
                            if (var477 != null && var477.field2756 == var476) {
                                class66.field1074[var6++] = 1;
                                continue;
                            }
                            class66.field1074[var6++] = 0;
                            continue;
                        }
                    } else if (var517 < 2900) {
                        var6--;
                        class114 var466 = class8.method43(class66.field1074[var6], (byte) -99);
                        if (var517 == 2800) {
                            class66.field1074[var6++] = client.method1916(var466).method1686(100);
                            continue;
                        }
                        if (var517 == 2801) {
                            var6--;
                            int var467 = class66.field1074[var6];
                            int var519 = var467 - 1;
                            if (var466.field1775 != null && var519 < var466.field1775.length && var466.field1775[var519] != null) {
                                class176.field2945[var7++] = var466.field1775[var519];
                                continue;
                            }
                            class176.field2945[var7++] = "";
                            continue;
                        }
                        if (var517 == 2802) {
                            if (var466.field1897 == null) {
                                class176.field2945[var7++] = "";
                            } else {
                                class176.field2945[var7++] = var466.field1897;
                            }
                            continue;
                        }
                    } else if (var517 < 3200) {
                        if (var517 == 3100) {
                            var7--;
                            String var451 = class176.field2945[var7];
                            class106.method787(var451, "", 0, true);
                            continue;
                        }
                        if (var517 == 3101) {
                            var6 -= 2;
                            class238.method1572((byte) 124, class66.field1074[var6 + 1], class48.field878, class66.field1074[var6]);
                            continue;
                        }
                        if (var517 == 3103) {
                            class137.method1033(89);
                            continue;
                        }
                        if (var517 == 3104) {
                            class2.field24++;
                            var7--;
                            String var452 = class176.field2945[var7];
                            int var453 = 0;
                            if (class196.method1336(false, var452)) {
                                var453 = class185.method1290((byte) 121, var452);
                            }
                            class87.field1405.method607(101, (byte) 76);
                            class87.field1405.method1029(var453, 15430);
                            continue;
                        }
                        if (var517 == 3105) {
                            class236.field3733++;
                            var7--;
                            String var454 = class176.field2945[var7];
                            class87.field1405.method607(188, (byte) 86);
                            class87.field1405.method967((byte) -8, class260.method1739(false, var454));
                            continue;
                        }
                        if (var517 == 3106) {
                            class171.field2871++;
                            var7--;
                            String var455 = class176.field2945[var7];
                            class87.field1405.method607(144, (byte) 62);
                            class87.field1405.method966((byte) 41, var455.length() + 1);
                            class87.field1405.method1028(14630, var455);
                            continue;
                        }
                        if (var517 == 3107) {
                            var6--;
                            int var456 = class66.field1074[var6];
                            var7--;
                            String var457 = class176.field2945[var7];
                            class35.method292(false, var456, var457);
                            continue;
                        }
                        if (var517 == 3108) {
                            var6 -= 3;
                            int var458 = class66.field1074[var6];
                            int var459 = class66.field1074[var6 + 2];
                            int var460 = class66.field1074[var6 + 1];
                            class114 var461 = class8.method43(var459, (byte) 80);
                            class84.method671(var460, var461, var458, -105);
                            continue;
                        }
                        if (var517 == 3109) {
                            var6 -= 2;
                            int var462 = class66.field1074[var6];
                            class114 var463 = var46 ? class247.field3886 : class174.field2926;
                            int var464 = class66.field1074[var6 + 1];
                            class84.method671(var464, var463, var462, -33);
                            continue;
                        }
                        if (var517 == 3110) {
                            class229.field3652++;
                            var6--;
                            int var465 = class66.field1074[var6];
                            class87.field1405.method607(148, (byte) 97);
                            class87.field1405.method971(3792, var465);
                            continue;
                        }
                    } else if (var517 < 3300) {
                        if (var517 == 3200) {
                            var6 -= 3;
                            class106.method788(class66.field1074[var6], class66.field1074[var6 + 2], 255, (byte) -74, class66.field1074[var6 + 1]);
                            continue;
                        }
                        if (var517 == 3201) {
                            var6--;
                            class297.method1987(class66.field1074[var6], 255, -1599927416);
                            continue;
                        }
                        if (var517 == 3202) {
                            var6 -= 2;
                            class294.method1977(class66.field1074[var6], class66.field1074[var6 + 1], 905962088, 255);
                            continue;
                        }
                    } else if (var517 < 3400) {
                        if (var517 == 3300) {
                            class66.field1074[var6++] = class207.field3336;
                            continue;
                        }
                        if (var517 == 3301) {
                            var6 -= 2;
                            int var417 = class66.field1074[var6];
                            int var418 = class66.field1074[var6 + 1];
                            class66.field1074[var6++] = class128.method936(var417, false, var418);
                            continue;
                        }
                        if (var517 == 3302) {
                            var6 -= 2;
                            int var419 = class66.field1074[var6 + 1];
                            int var420 = class66.field1074[var6];
                            class66.field1074[var6++] = class160.method1159((byte) 40, var419, var420);
                            continue;
                        }
                        if (var517 == 3303) {
                            var6 -= 2;
                            int var421 = class66.field1074[var6];
                            int var422 = class66.field1074[var6 + 1];
                            class66.field1074[var6++] = class157.method1134((byte) 79, var422, var421);
                            continue;
                        }
                        if (var517 == 3304) {
                            var6--;
                            int var423 = class66.field1074[var6];
                            class66.field1074[var6++] = class295.method1979(var423, 5).field1501;
                            continue;
                        }
                        if (var517 == 3305) {
                            var6--;
                            int var424 = class66.field1074[var6];
                            class66.field1074[var6++] = class153.field2494[var424];
                            continue;
                        }
                        if (var517 == 3306) {
                            var6--;
                            int var425 = class66.field1074[var6];
                            class66.field1074[var6++] = class242.field3837[var425];
                            continue;
                        }
                        if (var517 == 3307) {
                            var6--;
                            int var426 = class66.field1074[var6];
                            class66.field1074[var6++] = class256.field4076[var426];
                            continue;
                        }
                        if (var517 == 3308) {
                            int var427 = class92.field1448;
                            int var428 = (class48.field878.field2887 >> 7) + class170.field2787;
                            int var429 = (class48.field878.field2849 >> 7) + class256.field4082;
                            class66.field1074[var6++] = (var429 << 14) + ((var427 << 28) + var428);
                            continue;
                        }
                        if (var517 == 3309) {
                            var6--;
                            int var430 = class66.field1074[var6];
                            class66.field1074[var6++] = class64.method498(16383, var430 >> 14);
                            continue;
                        }
                        if (var517 == 3310) {
                            var6--;
                            int var431 = class66.field1074[var6];
                            class66.field1074[var6++] = var431 >> 28;
                            continue;
                        }
                        if (var517 == 3311) {
                            var6--;
                            int var432 = class66.field1074[var6];
                            class66.field1074[var6++] = class64.method498(var432, 16383);
                            continue;
                        }
                        if (var517 == 3312) {
                            class66.field1074[var6++] = class6.field75 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3313) {
                            var6 -= 2;
                            int var433 = class66.field1074[var6] + 32768;
                            int var434 = class66.field1074[var6 + 1];
                            class66.field1074[var6++] = class128.method936(var433, false, var434);
                            continue;
                        }
                        if (var517 == 3314) {
                            var6 -= 2;
                            int var435 = class66.field1074[var6] + 32768;
                            int var436 = class66.field1074[var6 + 1];
                            class66.field1074[var6++] = class160.method1159((byte) 40, var436, var435);
                            continue;
                        }
                        if (var517 == 3315) {
                            var6 -= 2;
                            int var437 = class66.field1074[var6] + 32768;
                            int var438 = class66.field1074[var6 + 1];
                            class66.field1074[var6++] = class157.method1134((byte) 79, var438, var437);
                            continue;
                        }
                        if (var517 == 3316) {
                            if (class58.field1012 < 2) {
                                class66.field1074[var6++] = 0;
                            } else {
                                class66.field1074[var6++] = class58.field1012;
                            }
                            continue;
                        }
                        if (var517 == 3317) {
                            class66.field1074[var6++] = class18.field263;
                            continue;
                        }
                        if (var517 == 3318) {
                            class66.field1074[var6++] = class295.field4680;
                            continue;
                        }
                        if (var517 == 3321) {
                            class66.field1074[var6++] = class142.field2356;
                            continue;
                        }
                        if (var517 == 3322) {
                            class66.field1074[var6++] = class113.field1736;
                            continue;
                        }
                        if (var517 == 3323) {
                            if (class238.field3757 >= 5 && class238.field3757 <= 9) {
                                class66.field1074[var6++] = 1;
                                continue;
                            }
                            class66.field1074[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3324) {
                            if (class238.field3757 >= 5 && class238.field3757 <= 9) {
                                class66.field1074[var6++] = class238.field3757;
                                continue;
                            }
                            class66.field1074[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3325) {
                            class66.field1074[var6++] = class48.field879 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3326) {
                            class66.field1074[var6++] = class48.field878.field3425;
                            continue;
                        }
                        if (var517 == 3327) {
                            class66.field1074[var6++] = class48.field878.field3439.field1347 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3328) {
                            class66.field1074[var6++] = class116.field1945 && !class228.field3642 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3329) {
                            class66.field1074[var6++] = class189.field3090 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3330) {
                            var6--;
                            int var439 = class66.field1074[var6];
                            class66.field1074[var6++] = class195.method1330(var439, 4626);
                            continue;
                        }
                        if (var517 == 3331) {
                            var6 -= 2;
                            int var440 = class66.field1074[var6];
                            int var441 = class66.field1074[var6 + 1];
                            class66.field1074[var6++] = class234.method1554(0, var441, false, var440);
                            continue;
                        }
                        if (var517 == 3332) {
                            var6 -= 2;
                            int var442 = class66.field1074[var6];
                            int var443 = class66.field1074[var6 + 1];
                            class66.field1074[var6++] = class234.method1554(0, var443, true, var442);
                            continue;
                        }
                        if (var517 == 3333) {
                            class66.field1074[var6++] = class155.field2534;
                            continue;
                        }
                        if (var517 == 3335) {
                            class66.field1074[var6++] = class145.field2391;
                            continue;
                        }
                        if (var517 == 3336) {
                            var6 -= 4;
                            int var444 = class66.field1074[var6];
                            int var445 = class66.field1074[var6 + 2];
                            int var446 = class66.field1074[var6 + 1];
                            int var447 = class66.field1074[var6 + 3];
                            int var448 = (var446 << 14) + var444;
                            int var449 = (var445 << 28) + var448;
                            int var450 = var447 + var449;
                            class66.field1074[var6++] = var450;
                            continue;
                        }
                        if (var517 == 3337) {
                            class66.field1074[var6++] = class252.field4019;
                            continue;
                        }
                    } else if (var517 < 3500) {
                        if (var517 == 3400) {
                            var6 -= 2;
                            int var69 = class66.field1074[var6];
                            int var70 = class66.field1074[var6 + 1];
                            class293 var71 = class71.method553(var69, -115);
                            class176.field2945[var7++] = var71.method1954(var70, -97);
                            continue;
                        }
                        if (var517 == 3408) {
                            var6 -= 4;
                            int var72 = class66.field1074[var6 + 1];
                            int var73 = class66.field1074[var6 + 3];
                            int var74 = class66.field1074[var6 + 2];
                            int var75 = class66.field1074[var6];
                            class293 var76 = class71.method553(var74, -120);
                            if (var76.field4643 == var75 && var76.field4659 == var72) {
                                if (var72 == 115) {
                                    class176.field2945[var7++] = var76.method1954(var73, -120);
                                } else {
                                    class66.field1074[var6++] = var76.method1956(-256, var73);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var517 == 3409) {
                            var6 -= 3;
                            int var77 = class66.field1074[var6 + 1];
                            int var78 = class66.field1074[var6];
                            int var79 = class66.field1074[var6 + 2];
                            if (var77 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class293 var80 = class71.method553(var77, -111);
                            if (var80.field4659 != var78) {
                                throw new RuntimeException("C3409-1");
                            }
                            class66.field1074[var6++] = var80.method1970(var79, 78) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3410) {
                            var6--;
                            int var81 = class66.field1074[var6];
                            var7--;
                            String var82 = class176.field2945[var7];
                            if (var81 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class293 var83 = class71.method553(var81, -122);
                            if (var83.field4659 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class66.field1074[var6++] = var83.method1961(-9, var82) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3411) {
                            var6--;
                            int var84 = class66.field1074[var6];
                            class293 var85 = class71.method553(var84, -110);
                            class66.field1074[var6++] = var85.field4644.method1058(false);
                            continue;
                        }
                    } else if (var517 < 3700) {
                        if (var517 == 3600) {
                            if (class200.field3265 == 0) {
                                class66.field1074[var6++] = -2;
                            } else if (class200.field3265 == 1) {
                                class66.field1074[var6++] = -1;
                            } else {
                                class66.field1074[var6++] = class45.field820;
                            }
                            continue;
                        }
                        if (var517 == 3601) {
                            var6--;
                            int var393 = class66.field1074[var6];
                            if (class200.field3265 == 2 && class45.field820 > var393) {
                                class176.field2945[var7++] = class35.field603[var393];
                                continue;
                            }
                            class176.field2945[var7++] = "";
                            continue;
                        }
                        if (var517 == 3602) {
                            var6--;
                            int var394 = class66.field1074[var6];
                            if (class200.field3265 == 2 && class45.field820 > var394) {
                                class66.field1074[var6++] = class200.field3263[var394];
                                continue;
                            }
                            class66.field1074[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3603) {
                            var6--;
                            int var395 = class66.field1074[var6];
                            if (class200.field3265 == 2 && class45.field820 > var395) {
                                class66.field1074[var6++] = class277.field4401[var395];
                                continue;
                            }
                            class66.field1074[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3604) {
                            var7--;
                            String var396 = class176.field2945[var7];
                            var6--;
                            int var397 = class66.field1074[var6];
                            class209.method1394(var396, var397, 201);
                            continue;
                        }
                        if (var517 == 3605) {
                            var7--;
                            String var398 = class176.field2945[var7];
                            class258.method1726(class260.method1739(!arg2, var398), 18145);
                            continue;
                        }
                        if (var517 == 3606) {
                            var7--;
                            String var399 = class176.field2945[var7];
                            class294.method1978(class260.method1739(false, var399), (byte) 61);
                            continue;
                        }
                        if (var517 == 3607) {
                            var7--;
                            String var400 = class176.field2945[var7];
                            class10.method68(0, class260.method1739(false, var400), false);
                            continue;
                        }
                        if (var517 == 3608) {
                            var7--;
                            String var401 = class176.field2945[var7];
                            class118.method867(class260.method1739(!arg2, var401), 126);
                            continue;
                        }
                        if (var517 == 3609) {
                            var7--;
                            String var402 = class176.field2945[var7];
                            if (var402.startsWith("<img=0>") || var402.startsWith("<img=1>")) {
                                var402 = var402.substring(7);
                            }
                            class66.field1074[var6++] = class290.method1947(var402, 0) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3610) {
                            var6--;
                            int var403 = class66.field1074[var6];
                            if (class200.field3265 == 2 && class45.field820 > var403) {
                                class176.field2945[var7++] = class248.field3932[var403];
                                continue;
                            }
                            class176.field2945[var7++] = "";
                            continue;
                        }
                        if (var517 == 3611) {
                            if (class13.field173 == null) {
                                class176.field2945[var7++] = "";
                            } else {
                                class176.field2945[var7++] = class146.method1079(class13.field173, 10446);
                            }
                            continue;
                        }
                        if (var517 == 3612) {
                            if (class13.field173 == null) {
                                class66.field1074[var6++] = 0;
                            } else {
                                class66.field1074[var6++] = class32.field541;
                            }
                            continue;
                        }
                        if (var517 == 3613) {
                            var6--;
                            int var404 = class66.field1074[var6];
                            if (class13.field173 != null && var404 < class32.field541) {
                                class176.field2945[var7++] = class146.method1079(class290.field4618[var404].field1642, 10446);
                                continue;
                            }
                            class176.field2945[var7++] = "";
                            continue;
                        }
                        if (var517 == 3614) {
                            var6--;
                            int var405 = class66.field1074[var6];
                            if (class13.field173 != null && var405 < class32.field541) {
                                class66.field1074[var6++] = class290.field4618[var405].field1645;
                                continue;
                            }
                            class66.field1074[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3615) {
                            var6--;
                            int var406 = class66.field1074[var6];
                            if (class13.field173 != null && class32.field541 > var406) {
                                class66.field1074[var6++] = class290.field4618[var406].field1641;
                                continue;
                            }
                            class66.field1074[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3616) {
                            class66.field1074[var6++] = class77.field1275;
                            continue;
                        }
                        if (var517 == 3617) {
                            var7--;
                            String var407 = class176.field2945[var7];
                            class270.method1842(true, var407);
                            continue;
                        }
                        if (var517 == 3618) {
                            class66.field1074[var6++] = class58.field1006;
                            continue;
                        }
                        if (var517 == 3619) {
                            var7--;
                            String var408 = class176.field2945[var7];
                            class127.method930(-8071, class260.method1739(!arg2, var408));
                            continue;
                        }
                        if (var517 == 3620) {
                            class105.method784(0);
                            continue;
                        }
                        if (var517 == 3621) {
                            if (class200.field3265 == 0) {
                                class66.field1074[var6++] = -1;
                            } else {
                                class66.field1074[var6++] = class286.field4554;
                            }
                            continue;
                        }
                        if (var517 == 3622) {
                            var6--;
                            int var409 = class66.field1074[var6];
                            if (class200.field3265 != 0 && var409 < class286.field4554) {
                                class176.field2945[var7++] = class66.method506((byte) 20, class145.field2390[var409]);
                                continue;
                            }
                            class176.field2945[var7++] = "";
                            continue;
                        }
                        if (var517 == 3623) {
                            var7--;
                            String var410 = class176.field2945[var7];
                            if (var410.startsWith("<img=0>") || var410.startsWith("<img=1>")) {
                                var410 = var410.substring(7);
                            }
                            class66.field1074[var6++] = class187.method1296(var410, (byte) 83) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3624) {
                            var6--;
                            int var411 = class66.field1074[var6];
                            if (class290.field4618 != null && var411 < class32.field541 && class290.field4618[var411].field1642.equalsIgnoreCase(class48.field878.field3445)) {
                                class66.field1074[var6++] = 1;
                                continue;
                            }
                            class66.field1074[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3625) {
                            if (class127.field2103 == null) {
                                class176.field2945[var7++] = "";
                            } else {
                                class176.field2945[var7++] = class146.method1079(class127.field2103, 10446);
                            }
                            continue;
                        }
                        if (var517 == 3626) {
                            var6--;
                            int var412 = class66.field1074[var6];
                            if (class13.field173 != null && var412 < class32.field541) {
                                class176.field2945[var7++] = class290.field4618[var412].field1640;
                                continue;
                            }
                            class176.field2945[var7++] = "";
                            continue;
                        }
                        if (var517 == 3627) {
                            var6--;
                            int var413 = class66.field1074[var6];
                            if (class200.field3265 == 2 && var413 >= 0 && class45.field820 > var413) {
                                class66.field1074[var6++] = class297.field4703[var413] ? 1 : 0;
                                continue;
                            }
                            class66.field1074[var6++] = 0;
                            continue;
                        }
                        if (var517 == 3628) {
                            var7--;
                            String var414 = class176.field2945[var7];
                            if (var414.startsWith("<img=0>") || var414.startsWith("<img=1>")) {
                                var414 = var414.substring(7);
                            }
                            class66.field1074[var6++] = class218.method1449(var414, (byte) 97);
                            continue;
                        }
                        if (var517 == 3629) {
                            class66.field1074[var6++] = class237.field3743;
                            continue;
                        }
                        if (var517 == 3630) {
                            var7--;
                            String var415 = class176.field2945[var7];
                            class10.method68(0, class260.method1739(false, var415), true);
                            continue;
                        }
                        if (var517 == 3631) {
                            var6--;
                            int var416 = class66.field1074[var6];
                            class66.field1074[var6++] = class294.field4666[var416] ? 1 : 0;
                            continue;
                        }
                    } else if (var517 < 4000) {
                        if (var517 == 3903) {
                            var6--;
                            int var379 = class66.field1074[var6];
                            class66.field1074[var6++] = class136.field2285[var379].method511(8);
                            continue;
                        }
                        if (var517 == 3904) {
                            var6--;
                            int var380 = class66.field1074[var6];
                            class66.field1074[var6++] = class136.field2285[var380].field1090;
                            continue;
                        }
                        if (var517 == 3905) {
                            var6--;
                            int var381 = class66.field1074[var6];
                            class66.field1074[var6++] = class136.field2285[var381].field1086;
                            continue;
                        }
                        if (var517 == 3906) {
                            var6--;
                            int var382 = class66.field1074[var6];
                            class66.field1074[var6++] = class136.field2285[var382].field1087;
                            continue;
                        }
                        if (var517 == 3907) {
                            var6--;
                            int var383 = class66.field1074[var6];
                            class66.field1074[var6++] = class136.field2285[var383].field1075;
                            continue;
                        }
                        if (var517 == 3908) {
                            var6--;
                            int var384 = class66.field1074[var6];
                            class66.field1074[var6++] = class136.field2285[var384].field1072;
                            continue;
                        }
                        if (var517 == 3910) {
                            var6--;
                            int var385 = class66.field1074[var6];
                            int var386 = class136.field2285[var385].method508(true);
                            class66.field1074[var6++] = var386 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3911) {
                            var6--;
                            int var387 = class66.field1074[var6];
                            int var388 = class136.field2285[var387].method508(true);
                            class66.field1074[var6++] = var388 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3912) {
                            var6--;
                            int var389 = class66.field1074[var6];
                            int var390 = class136.field2285[var389].method508(true);
                            class66.field1074[var6++] = var390 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 3913) {
                            var6--;
                            int var391 = class66.field1074[var6];
                            int var392 = class136.field2285[var391].method508(arg2);
                            class66.field1074[var6++] = var392 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var517 < 4100) {
                        if (var517 == 4000) {
                            var6 -= 2;
                            int var86 = class66.field1074[var6 + 1];
                            int var87 = class66.field1074[var6];
                            class66.field1074[var6++] = var86 + var87;
                            continue;
                        }
                        if (var517 == 4001) {
                            var6 -= 2;
                            int var88 = class66.field1074[var6];
                            int var89 = class66.field1074[var6 + 1];
                            class66.field1074[var6++] = var88 - var89;
                            continue;
                        }
                        if (var517 == 4002) {
                            var6 -= 2;
                            int var90 = class66.field1074[var6];
                            int var91 = class66.field1074[var6 + 1];
                            class66.field1074[var6++] = var90 * var91;
                            continue;
                        }
                        if (var517 == 4003) {
                            var6 -= 2;
                            int var92 = class66.field1074[var6 + 1];
                            int var93 = class66.field1074[var6];
                            class66.field1074[var6++] = var93 / var92;
                            continue;
                        }
                        if (var517 == 4004) {
                            var6--;
                            int var94 = class66.field1074[var6];
                            class66.field1074[var6++] = (int) ((double) var94 * Math.random());
                            continue;
                        }
                        if (var517 == 4005) {
                            var6--;
                            int var95 = class66.field1074[var6];
                            class66.field1074[var6++] = (int) ((double) (var95 + 1) * Math.random());
                            continue;
                        }
                        if (var517 == 4006) {
                            var6 -= 5;
                            int var96 = class66.field1074[var6];
                            int var97 = class66.field1074[var6 + 1];
                            int var98 = class66.field1074[var6 + 2];
                            int var99 = class66.field1074[var6 + 4];
                            int var100 = class66.field1074[var6 + 3];
                            class66.field1074[var6++] = (var97 - var96) * (var99 - var98) / (var100 - var98) + var96;
                            continue;
                        }
                        if (var517 == 4007) {
                            var6 -= 2;
                            long var101 = (long) class66.field1074[var6];
                            long var103 = (long) class66.field1074[var6 + 1];
                            class66.field1074[var6++] = (int) (var101 * var103 / 100L + var101);
                            continue;
                        }
                        if (var517 == 4008) {
                            var6 -= 2;
                            int var105 = class66.field1074[var6 + 1];
                            int var106 = class66.field1074[var6];
                            class66.field1074[var6++] = class140.method1045(0x1 << var105, var106);
                            continue;
                        }
                        if (var517 == 4009) {
                            var6 -= 2;
                            int var107 = class66.field1074[var6];
                            int var108 = class66.field1074[var6 + 1];
                            class66.field1074[var6++] = class64.method498(-(0x1 << var108) - 1, var107);
                            continue;
                        }
                        if (var517 == 4010) {
                            var6 -= 2;
                            int var109 = class66.field1074[var6];
                            int var110 = class66.field1074[var6 + 1];
                            class66.field1074[var6++] = class64.method498(0x1 << var110, var109) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var517 == 4011) {
                            var6 -= 2;
                            int var111 = class66.field1074[var6];
                            int var112 = class66.field1074[var6 + 1];
                            class66.field1074[var6++] = var111 % var112;
                            continue;
                        }
                        if (var517 == 4012) {
                            var6 -= 2;
                            int var113 = class66.field1074[var6 + 1];
                            int var114 = class66.field1074[var6];
                            if (var114 == 0) {
                                class66.field1074[var6++] = 0;
                            } else {
                                class66.field1074[var6++] = (int) Math.pow((double) var114, (double) var113);
                            }
                            continue;
                        }
                        if (var517 == 4013) {
                            var6 -= 2;
                            int var115 = class66.field1074[var6];
                            int var116 = class66.field1074[var6 + 1];
                            if (var115 == 0) {
                                class66.field1074[var6++] = 0;
                            } else if (var116 == 0) {
                                class66.field1074[var6++] = Integer.MAX_VALUE;
                            } else {
                                class66.field1074[var6++] = (int) Math.pow((double) var115, 1.0D / (double) var116);
                            }
                            continue;
                        }
                        if (var517 == 4014) {
                            var6 -= 2;
                            int var117 = class66.field1074[var6];
                            int var118 = class66.field1074[var6 + 1];
                            class66.field1074[var6++] = class64.method498(var117, var118);
                            continue;
                        }
                        if (var517 == 4015) {
                            var6 -= 2;
                            int var119 = class66.field1074[var6 + 1];
                            int var120 = class66.field1074[var6];
                            class66.field1074[var6++] = class140.method1045(var120, var119);
                            continue;
                        }
                        if (var517 == 4016) {
                            var6 -= 2;
                            int var121 = class66.field1074[var6];
                            int var122 = class66.field1074[var6 + 1];
                            class66.field1074[var6++] = var122 > var121 ? var121 : var122;
                            continue;
                        }
                        if (var517 == 4017) {
                            var6 -= 2;
                            int var123 = class66.field1074[var6 + 1];
                            int var124 = class66.field1074[var6];
                            class66.field1074[var6++] = var123 < var124 ? var124 : var123;
                            continue;
                        }
                        if (var517 == 4018) {
                            var6 -= 3;
                            long var125 = (long) class66.field1074[var6];
                            long var127 = (long) class66.field1074[var6 + 2];
                            long var129 = (long) class66.field1074[var6 + 1];
                            class66.field1074[var6++] = (int) (var125 * var127 / var129);
                            continue;
                        }
                    } else if (var517 < 4200) {
                        if (var517 == 4100) {
                            var7--;
                            String var131 = class176.field2945[var7];
                            var6--;
                            int var132 = class66.field1074[var6];
                            class176.field2945[var7++] = var131 + var132;
                            continue;
                        }
                        if (var517 == 4101) {
                            var7 -= 2;
                            String var133 = class176.field2945[var7];
                            String var134 = class176.field2945[var7 + 1];
                            class176.field2945[var7++] = var133 + var134;
                            continue;
                        }
                        if (var517 == 4102) {
                            var7--;
                            String var135 = class176.field2945[var7];
                            var6--;
                            int var136 = class66.field1074[var6];
                            class176.field2945[var7++] = var135 + class82.method658(true, var136, -123);
                            continue;
                        }
                        if (var517 == 4103) {
                            var7--;
                            String var137 = class176.field2945[var7];
                            class176.field2945[var7++] = var137.toLowerCase();
                            continue;
                        }
                        if (var517 == 4104) {
                            var6--;
                            int var138 = class66.field1074[var6];
                            long var139 = (long) var138 * 86400000L + 1014768000000L;
                            class37.field632.setTime(new Date(var139));
                            int var141 = class37.field632.get(5);
                            int var142 = class37.field632.get(2);
                            int var143 = class37.field632.get(1);
                            class176.field2945[var7++] = var141 + "-" + class124.field2047[var142] + "-" + var143;
                            continue;
                        }
                        if (var517 == 4105) {
                            var7 -= 2;
                            String var144 = class176.field2945[var7];
                            String var145 = class176.field2945[var7 + 1];
                            if (class48.field878.field3439 != null && class48.field878.field3439.field1347) {
                                class176.field2945[var7++] = var145;
                                continue;
                            }
                            class176.field2945[var7++] = var144;
                            continue;
                        }
                        if (var517 == 4106) {
                            var6--;
                            int var146 = class66.field1074[var6];
                            class176.field2945[var7++] = Integer.toString(var146);
                            continue;
                        }
                        if (var517 == 4107) {
                            var7 -= 2;
                            class66.field1074[var6++] = class274.method1855(101, class183.method1278(class176.field2945[var7], (byte) -79, class176.field2945[var7 + 1], class145.field2391));
                            continue;
                        }
                        if (var517 == 4108) {
                            var6 -= 2;
                            int var147 = class66.field1074[var6];
                            var7--;
                            String var148 = class176.field2945[var7];
                            int var149 = class66.field1074[var6 + 1];
                            class66.field1074[var6++] = class255.method1706(var149, false).method575(var148, var147);
                            continue;
                        }
                        if (var517 == 4109) {
                            var6 -= 2;
                            var7--;
                            String var150 = class176.field2945[var7];
                            int var151 = class66.field1074[var6];
                            int var152 = class66.field1074[var6 + 1];
                            class66.field1074[var6++] = class255.method1706(var152, false).method574(var150, var151);
                            continue;
                        }
                        if (var517 == 4110) {
                            var7 -= 2;
                            String var153 = class176.field2945[var7 + 1];
                            String var154 = class176.field2945[var7];
                            var6--;
                            if (class66.field1074[var6] == 1) {
                                class176.field2945[var7++] = var154;
                            } else {
                                class176.field2945[var7++] = var153;
                            }
                            continue;
                        }
                        if (var517 == 4111) {
                            var7--;
                            String var155 = class176.field2945[var7];
                            class176.field2945[var7++] = class73.method566(var155);
                            continue;
                        }
                        if (var517 == 4112) {
                            var7--;
                            String var156 = class176.field2945[var7];
                            var6--;
                            int var157 = class66.field1074[var6];
                            if (var157 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class176.field2945[var7++] = var156 + (char) var157;
                            continue;
                        }
                        if (var517 == 4113) {
                            var6--;
                            int var158 = class66.field1074[var6];
                            class66.field1074[var6++] = class22.method180((char) var158, -21001) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4114) {
                            var6--;
                            int var159 = class66.field1074[var6];
                            class66.field1074[var6++] = class96.method731(-62, (char) var159) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4115) {
                            var6--;
                            int var160 = class66.field1074[var6];
                            class66.field1074[var6++] = class31.method267(arg2, (char) var160) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4116) {
                            var6--;
                            int var161 = class66.field1074[var6];
                            class66.field1074[var6++] = class116.method856((char) var161, -7586) ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4117) {
                            var7--;
                            String var162 = class176.field2945[var7];
                            if (var162 == null) {
                                class66.field1074[var6++] = 0;
                            } else {
                                class66.field1074[var6++] = var162.length();
                            }
                            continue;
                        }
                        if (var517 == 4118) {
                            var6 -= 2;
                            var7--;
                            String var163 = class176.field2945[var7];
                            int var164 = class66.field1074[var6];
                            int var165 = class66.field1074[var6 + 1];
                            class176.field2945[var7++] = var163.substring(var164, var165);
                            continue;
                        }
                        if (var517 == 4119) {
                            var7--;
                            String var166 = class176.field2945[var7];
                            boolean var167 = false;
                            StringBuffer var168 = new StringBuffer(var166.length());
                            for (int var169 = 0; var166.length() > var169; var169++) {
                                char var170 = var166.charAt(var169);
                                if (var170 == '<') {
                                    var167 = true;
                                } else if (var170 == '>') {
                                    var167 = false;
                                } else if (!var167) {
                                    var168.append(var170);
                                }
                            }
                            class176.field2945[var7++] = var168.toString();
                            continue;
                        }
                        if (var517 == 4120) {
                            var6 -= 2;
                            var7--;
                            String var171 = class176.field2945[var7];
                            int var172 = class66.field1074[var6];
                            int var173 = class66.field1074[var6 + 1];
                            class66.field1074[var6++] = var171.indexOf(var172, var173);
                            continue;
                        }
                        if (var517 == 4121) {
                            var7 -= 2;
                            String var174 = class176.field2945[var7];
                            String var175 = class176.field2945[var7 + 1];
                            var6--;
                            int var176 = class66.field1074[var6];
                            class66.field1074[var6++] = var174.indexOf(var175, var176);
                            continue;
                        }
                        if (var517 == 4122) {
                            var6--;
                            int var177 = class66.field1074[var6];
                            class66.field1074[var6++] = Character.toLowerCase((char) var177);
                            continue;
                        }
                        if (var517 == 4123) {
                            var6--;
                            int var178 = class66.field1074[var6];
                            class66.field1074[var6++] = Character.toUpperCase((char) var178);
                            continue;
                        }
                        if (var517 == 4124) {
                            var6--;
                            boolean var179 = class66.field1074[var6] != 0;
                            var6--;
                            int var180 = class66.field1074[var6];
                            class176.field2945[var7++] = class223.method1498(var179, class145.field2391, arg2, (long) var180, 0);
                            continue;
                        }
                    } else if (var517 < 4300) {
                        if (var517 == 4200) {
                            var6--;
                            int var181 = class66.field1074[var6];
                            class176.field2945[var7++] = class190.method1314(var181, (byte) 68).field1155;
                            continue;
                        }
                        if (var517 == 4201) {
                            var6 -= 2;
                            int var182 = class66.field1074[var6];
                            int var183 = class66.field1074[var6 + 1];
                            class67 var184 = class190.method1314(var182, (byte) 68);
                            if (var183 >= 1 && var183 <= 5 && var184.field1092[var183 - 1] != null) {
                                class176.field2945[var7++] = var184.field1092[var183 - 1];
                                continue;
                            }
                            class176.field2945[var7++] = "";
                            continue;
                        }
                        if (var517 == 4202) {
                            var6 -= 2;
                            int var185 = class66.field1074[var6];
                            int var186 = class66.field1074[var6 + 1];
                            class67 var187 = class190.method1314(var185, (byte) 68);
                            if (var186 >= 1 && var186 <= 5 && var187.field1160[var186 - 1] != null) {
                                class176.field2945[var7++] = var187.field1160[var186 - 1];
                                continue;
                            }
                            class176.field2945[var7++] = "";
                            continue;
                        }
                        if (var517 == 4203) {
                            var6--;
                            int var188 = class66.field1074[var6];
                            class66.field1074[var6++] = class190.method1314(var188, (byte) 68).field1098;
                            continue;
                        }
                        if (var517 == 4204) {
                            var6--;
                            int var189 = class66.field1074[var6];
                            class66.field1074[var6++] = class190.method1314(var189, (byte) 68).field1152 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4205) {
                            var6--;
                            int var190 = class66.field1074[var6];
                            class67 var191 = class190.method1314(var190, (byte) 68);
                            if (var191.field1108 == -1 && var191.field1114 >= 0) {
                                class66.field1074[var6++] = var191.field1114;
                                continue;
                            }
                            class66.field1074[var6++] = var190;
                            continue;
                        }
                        if (var517 == 4206) {
                            var6--;
                            int var192 = class66.field1074[var6];
                            class67 var193 = class190.method1314(var192, (byte) 68);
                            if (var193.field1108 >= 0 && var193.field1114 >= 0) {
                                class66.field1074[var6++] = var193.field1114;
                                continue;
                            }
                            class66.field1074[var6++] = var192;
                            continue;
                        }
                        if (var517 == 4207) {
                            var6--;
                            int var194 = class66.field1074[var6];
                            class66.field1074[var6++] = class190.method1314(var194, (byte) 68).field1161 ? 1 : 0;
                            continue;
                        }
                        if (var517 == 4208) {
                            var6 -= 2;
                            int var195 = class66.field1074[var6 + 1];
                            int var196 = class66.field1074[var6];
                            class70 var197 = class57.method455(var195, false);
                            if (var197.method543(0)) {
                                class176.field2945[var7++] = class190.method1314(var196, (byte) 68).method523(var195, true, var197.field1179);
                            } else {
                                class66.field1074[var6++] = class190.method1314(var196, (byte) 68).method524(var197.field1177, var195, 32);
                            }
                            continue;
                        }
                        if (var517 == 4210) {
                            var7--;
                            String var198 = class176.field2945[var7];
                            var6--;
                            int var199 = class66.field1074[var6];
                            class82.method662(var198, 250, var199 == 1);
                            class66.field1074[var6++] = class1.field3;
                            continue;
                        }
                        if (var517 == 4211) {
                            if (class208.field3346 != null && class274.field4387 < class1.field3) {
                                class66.field1074[var6++] = class64.method498(class208.field3346[class274.field4387++], 65535);
                                continue;
                            }
                            class66.field1074[var6++] = -1;
                            continue;
                        }
                        if (var517 == 4212) {
                            class274.field4387 = 0;
                            continue;
                        }
                    } else if (var517 >= 4400) {
                        if (var517 >= 4500) {
                            if (var517 >= 4600) {
                                if (var517 < 5100) {
                                    if (var517 == 5000) {
                                        class66.field1074[var6++] = class187.field3072;
                                        continue;
                                    }
                                    if (var517 == 5001) {
                                        class23.field347++;
                                        var6 -= 3;
                                        class187.field3072 = class66.field1074[var6];
                                        class208.field3345 = class66.field1074[var6 + 1];
                                        class9.field114 = class66.field1074[var6 + 2];
                                        class87.field1405.method607(48, (byte) 112);
                                        class87.field1405.method966((byte) 74, class187.field3072);
                                        class87.field1405.method966((byte) 41, class208.field3345);
                                        class87.field1405.method966((byte) 69, class9.field114);
                                        continue;
                                    }
                                    if (var517 == 5002) {
                                        class276.field4398++;
                                        var7--;
                                        String var305 = class176.field2945[var7];
                                        var6 -= 2;
                                        int var306 = class66.field1074[var6];
                                        int var307 = class66.field1074[var6 + 1];
                                        class87.field1405.method607(198, (byte) 69);
                                        class87.field1405.method967((byte) -8, class260.method1739(false, var305));
                                        class87.field1405.method966((byte) 38, var306 - 1);
                                        class87.field1405.method966((byte) 124, var307);
                                        continue;
                                    }
                                    if (var517 == 5003) {
                                        var6--;
                                        int var308 = class66.field1074[var6];
                                        String var309 = null;
                                        if (var308 < 100) {
                                            var309 = class100.field1526[var308];
                                        }
                                        if (var309 == null) {
                                            var309 = "";
                                        }
                                        class176.field2945[var7++] = var309;
                                        continue;
                                    }
                                    if (var517 == 5004) {
                                        var6--;
                                        int var310 = class66.field1074[var6];
                                        int var311 = -1;
                                        if (var310 < 100 && class100.field1526[var310] != null) {
                                            var311 = class282.field4471[var310];
                                        }
                                        class66.field1074[var6++] = var311;
                                        continue;
                                    }
                                    if (var517 == 5005) {
                                        class66.field1074[var6++] = class208.field3345;
                                        continue;
                                    }
                                    if (var517 == 5008) {
                                        var7--;
                                        String var312 = class176.field2945[var7];
                                        if (var312.startsWith("::")) {
                                            class248.method1657(-1, var312);
                                            continue;
                                        }
                                        if (class58.field1012 == 0 && (class116.field1945 && !class228.field3642 || class189.field3090)) {
                                            continue;
                                        }
                                        class110.field1689++;
                                        String var313 = var312.toLowerCase();
                                        byte var314 = 0;
                                        if (var313.startsWith(class256.field4080)) {
                                            var314 = 0;
                                            var312 = var312.substring(class256.field4080.length());
                                        } else if (var313.startsWith(class238.field3758)) {
                                            var312 = var312.substring(class238.field3758.length());
                                            var314 = 1;
                                        } else if (var313.startsWith(class161.field2637)) {
                                            var312 = var312.substring(class161.field2637.length());
                                            var314 = 2;
                                        } else if (var313.startsWith(class218.field3504)) {
                                            var312 = var312.substring(class218.field3504.length());
                                            var314 = 3;
                                        } else if (var313.startsWith(class258.field4099)) {
                                            var312 = var312.substring(class258.field4099.length());
                                            var314 = 4;
                                        } else if (var313.startsWith(class58.field1005)) {
                                            var312 = var312.substring(class58.field1005.length());
                                            var314 = 5;
                                        } else if (var313.startsWith(class208.field3342)) {
                                            var312 = var312.substring(class208.field3342.length());
                                            var314 = 6;
                                        } else if (var313.startsWith(class187.field3074)) {
                                            var314 = 7;
                                            var312 = var312.substring(class187.field3074.length());
                                        } else if (var313.startsWith(class161.field2632)) {
                                            var314 = 8;
                                            var312 = var312.substring(class161.field2632.length());
                                        } else if (var313.startsWith(class205.field3290)) {
                                            var314 = 9;
                                            var312 = var312.substring(class205.field3290.length());
                                        } else if (var313.startsWith(class160.field2605)) {
                                            var314 = 10;
                                            var312 = var312.substring(class160.field2605.length());
                                        } else if (var313.startsWith(class268.field4288)) {
                                            var312 = var312.substring(class268.field4288.length());
                                            var314 = 11;
                                        } else if (class145.field2391 != 0) {
                                            if (var313.startsWith(class224.field3577)) {
                                                var314 = 0;
                                                var312 = var312.substring(class224.field3577.length());
                                            } else if (var313.startsWith(class223.field3552)) {
                                                var314 = 1;
                                                var312 = var312.substring(class223.field3552.length());
                                            } else if (var313.startsWith(class242.field3834)) {
                                                var312 = var312.substring(class242.field3834.length());
                                                var314 = 2;
                                            } else if (var313.startsWith(class5.field67)) {
                                                var312 = var312.substring(class5.field67.length());
                                                var314 = 3;
                                            } else if (var313.startsWith(class268.field4304)) {
                                                var314 = 4;
                                                var312 = var312.substring(class268.field4304.length());
                                            } else if (var313.startsWith(class296.field4684)) {
                                                var314 = 5;
                                                var312 = var312.substring(class296.field4684.length());
                                            } else if (var313.startsWith(class220.field3527)) {
                                                var314 = 6;
                                                var312 = var312.substring(class220.field3527.length());
                                            } else if (var313.startsWith(class112.field1732)) {
                                                var312 = var312.substring(class112.field1732.length());
                                                var314 = 7;
                                            } else if (var313.startsWith(class256.field4077)) {
                                                var312 = var312.substring(class256.field4077.length());
                                                var314 = 8;
                                            } else if (var313.startsWith(class97.field1508)) {
                                                var312 = var312.substring(class97.field1508.length());
                                                var314 = 9;
                                            } else if (var313.startsWith(class87.field1411)) {
                                                var314 = 10;
                                                var312 = var312.substring(class87.field1411.length());
                                            } else if (var313.startsWith(class262.field4159)) {
                                                var314 = 11;
                                                var312 = var312.substring(class262.field4159.length());
                                            }
                                        }
                                        String var315 = var312.toLowerCase();
                                        byte var316 = 0;
                                        if (var315.startsWith(class76.field1249)) {
                                            var316 = 1;
                                            var312 = var312.substring(class76.field1249.length());
                                        } else if (var315.startsWith(class271.field4343)) {
                                            var312 = var312.substring(class271.field4343.length());
                                            var316 = 2;
                                        } else if (var315.startsWith(class18.field260)) {
                                            var312 = var312.substring(class18.field260.length());
                                            var316 = 3;
                                        } else if (var315.startsWith(class42.field780)) {
                                            var316 = 4;
                                            var312 = var312.substring(class42.field780.length());
                                        } else if (var315.startsWith(class278.field4410)) {
                                            var312 = var312.substring(class278.field4410.length());
                                            var316 = 5;
                                        } else if (class145.field2391 != 0) {
                                            if (var315.startsWith(class265.field4230)) {
                                                var312 = var312.substring(class265.field4230.length());
                                                var316 = 1;
                                            } else if (var315.startsWith(class178.field2964)) {
                                                var312 = var312.substring(class178.field2964.length());
                                                var316 = 2;
                                            } else if (var315.startsWith(class43.field781)) {
                                                var312 = var312.substring(class43.field781.length());
                                                var316 = 3;
                                            } else if (var315.startsWith(class216.field3458)) {
                                                var316 = 4;
                                                var312 = var312.substring(class216.field3458.length());
                                            } else if (var315.startsWith(class161.field2629)) {
                                                var316 = 5;
                                                var312 = var312.substring(class161.field2629.length());
                                            }
                                        }
                                        class87.field1405.method607(85, (byte) 119);
                                        class87.field1405.method966((byte) 75, 0);
                                        int var317 = class87.field1405.field2231;
                                        class87.field1405.method966((byte) 57, var314);
                                        class87.field1405.method966((byte) 55, var316);
                                        class272.method1847(false, class87.field1405, var312);
                                        class87.field1405.method1024(class87.field1405.field2231 - var317, (byte) 9);
                                        continue;
                                    }
                                    if (var517 == 5009) {
                                        var7 -= 2;
                                        String var318 = class176.field2945[var7];
                                        String var319 = class176.field2945[var7 + 1];
                                        if (class58.field1012 != 0 || (!class116.field1945 || class228.field3642) && !class189.field3090) {
                                            class87.field1405.method607(34, (byte) 91);
                                            class169.field2763++;
                                            class87.field1405.method966((byte) 112, 0);
                                            int var320 = class87.field1405.field2231;
                                            class87.field1405.method967((byte) -8, class260.method1739(false, var318));
                                            class272.method1847(!arg2, class87.field1405, var319);
                                            class87.field1405.method1024(class87.field1405.field2231 - var320, (byte) 9);
                                        }
                                        continue;
                                    }
                                    if (var517 == 5010) {
                                        var6--;
                                        int var321 = class66.field1074[var6];
                                        String var322 = null;
                                        if (var321 < 100) {
                                            var322 = class118.field1993[var321];
                                        }
                                        if (var322 == null) {
                                            var322 = "";
                                        }
                                        class176.field2945[var7++] = var322;
                                        continue;
                                    }
                                    if (var517 == 5011) {
                                        var6--;
                                        int var323 = class66.field1074[var6];
                                        String var324 = null;
                                        if (var323 < 100) {
                                            var324 = class239.field3775[var323];
                                        }
                                        if (var324 == null) {
                                            var324 = "";
                                        }
                                        class176.field2945[var7++] = var324;
                                        continue;
                                    }
                                    if (var517 == 5012) {
                                        var6--;
                                        int var325 = class66.field1074[var6];
                                        int var326 = -1;
                                        if (var325 < 100) {
                                            var326 = class172.field2914[var325];
                                        }
                                        class66.field1074[var6++] = var326;
                                        continue;
                                    }
                                    if (var517 == 5015) {
                                        String var327;
                                        if (class48.field878 == null || class48.field878.field3445 == null) {
                                            var327 = class160.field2617;
                                        } else {
                                            var327 = class48.field878.method1414((byte) 112);
                                        }
                                        class176.field2945[var7++] = var327;
                                        continue;
                                    }
                                    if (var517 == 5016) {
                                        class66.field1074[var6++] = class9.field114;
                                        continue;
                                    }
                                    if (var517 == 5017) {
                                        class66.field1074[var6++] = class152.field2477;
                                        continue;
                                    }
                                    if (var517 == 5050) {
                                        var6--;
                                        int var328 = class66.field1074[var6];
                                        class176.field2945[var7++] = class172.method1236(var328, 20).field4111;
                                        continue;
                                    }
                                    if (var517 == 5051) {
                                        var6--;
                                        int var329 = class66.field1074[var6];
                                        class258 var330 = class172.method1236(var329, -125);
                                        if (var330.field4100 == null) {
                                            class66.field1074[var6++] = 0;
                                        } else {
                                            class66.field1074[var6++] = var330.field4100.length;
                                        }
                                        continue;
                                    }
                                    if (var517 == 5052) {
                                        var6 -= 2;
                                        int var331 = class66.field1074[var6 + 1];
                                        int var332 = class66.field1074[var6];
                                        class258 var333 = class172.method1236(var332, -94);
                                        int var334 = var333.field4100[var331];
                                        class66.field1074[var6++] = var334;
                                        continue;
                                    }
                                    if (var517 == 5053) {
                                        var6--;
                                        int var335 = class66.field1074[var6];
                                        class258 var336 = class172.method1236(var335, -112);
                                        if (var336.field4101 == null) {
                                            class66.field1074[var6++] = 0;
                                        } else {
                                            class66.field1074[var6++] = var336.field4101.length;
                                        }
                                        continue;
                                    }
                                    if (var517 == 5054) {
                                        var6 -= 2;
                                        int var337 = class66.field1074[var6];
                                        int var338 = class66.field1074[var6 + 1];
                                        class66.field1074[var6++] = class172.method1236(var337, 104).field4101[var338];
                                        continue;
                                    }
                                    if (var517 == 5055) {
                                        var6--;
                                        int var339 = class66.field1074[var6];
                                        class176.field2945[var7++] = class84.method672(var339, -2).method140(-1);
                                        continue;
                                    }
                                    if (var517 == 5056) {
                                        var6--;
                                        int var340 = class66.field1074[var6];
                                        class18 var341 = class84.method672(var340, -2);
                                        if (var341.field256 == null) {
                                            class66.field1074[var6++] = 0;
                                        } else {
                                            class66.field1074[var6++] = var341.field256.length;
                                        }
                                        continue;
                                    }
                                    if (var517 == 5057) {
                                        var6 -= 2;
                                        int var342 = class66.field1074[var6];
                                        int var343 = class66.field1074[var6 + 1];
                                        class66.field1074[var6++] = class84.method672(var342, -2).field256[var343];
                                        continue;
                                    }
                                    if (var517 == 5058) {
                                        class5.field64 = new class297();
                                        var6--;
                                        class5.field64.field4693 = class66.field1074[var6];
                                        class5.field64.field4702 = class84.method672(class5.field64.field4693, -2);
                                        class5.field64.field4689 = new int[class5.field64.field4702.method136(75)];
                                        continue;
                                    }
                                    if (var517 == 5059) {
                                        class87.field1405.method607(67, (byte) 75);
                                        class222.field3550++;
                                        class87.field1405.method966((byte) 48, 0);
                                        int var344 = class87.field1405.field2231;
                                        class87.field1405.method966((byte) 97, 0);
                                        class87.field1405.method971(3792, class5.field64.field4693);
                                        class5.field64.field4702.method144(-17104, class87.field1405, class5.field64.field4689);
                                        class87.field1405.method1024(class87.field1405.field2231 - var344, (byte) 9);
                                        continue;
                                    }
                                    if (var517 == 5060) {
                                        var7--;
                                        String var345 = class176.field2945[var7];
                                        class87.field1405.method607(104, (byte) 80);
                                        class97.field1503++;
                                        class87.field1405.method966((byte) 45, 0);
                                        int var346 = class87.field1405.field2231;
                                        class87.field1405.method967((byte) -8, class260.method1739(false, var345));
                                        class87.field1405.method971(3792, class5.field64.field4693);
                                        class5.field64.field4702.method144(-17104, class87.field1405, class5.field64.field4689);
                                        class87.field1405.method1024(class87.field1405.field2231 - var346, (byte) 9);
                                        continue;
                                    }
                                    if (var517 == 5061) {
                                        class222.field3550++;
                                        class87.field1405.method607(67, (byte) 93);
                                        class87.field1405.method966((byte) 96, 0);
                                        int var347 = class87.field1405.field2231;
                                        class87.field1405.method966((byte) 38, 1);
                                        class87.field1405.method971(3792, class5.field64.field4693);
                                        class5.field64.field4702.method144(-17104, class87.field1405, class5.field64.field4689);
                                        class87.field1405.method1024(class87.field1405.field2231 - var347, (byte) 9);
                                        continue;
                                    }
                                    if (var517 == 5062) {
                                        var6 -= 2;
                                        int var348 = class66.field1074[var6];
                                        int var349 = class66.field1074[var6 + 1];
                                        class66.field1074[var6++] = class172.method1236(var348, 85).field4102[var349];
                                        continue;
                                    }
                                    if (var517 == 5063) {
                                        var6 -= 2;
                                        int var350 = class66.field1074[var6];
                                        int var351 = class66.field1074[var6 + 1];
                                        class66.field1074[var6++] = class172.method1236(var350, -94).field4103[var351];
                                        continue;
                                    }
                                    if (var517 == 5064) {
                                        var6 -= 2;
                                        int var352 = class66.field1074[var6];
                                        int var353 = class66.field1074[var6 + 1];
                                        if (var353 == -1) {
                                            class66.field1074[var6++] = -1;
                                        } else {
                                            class66.field1074[var6++] = class172.method1236(var352, -115).method1721((byte) -126, (char) var353);
                                        }
                                        continue;
                                    }
                                    if (var517 == 5065) {
                                        var6 -= 2;
                                        int var354 = class66.field1074[var6];
                                        int var355 = class66.field1074[var6 + 1];
                                        if (var355 == -1) {
                                            class66.field1074[var6++] = -1;
                                        } else {
                                            class66.field1074[var6++] = class172.method1236(var354, 93).method1723((char) var355, (byte) -90);
                                        }
                                        continue;
                                    }
                                    if (var517 == 5066) {
                                        var6--;
                                        int var356 = class66.field1074[var6];
                                        class66.field1074[var6++] = class84.method672(var356, -2).method136(115);
                                        continue;
                                    }
                                    if (var517 == 5067) {
                                        var6 -= 2;
                                        int var357 = class66.field1074[var6 + 1];
                                        int var358 = class66.field1074[var6];
                                        int var359 = class84.method672(var358, -2).method138(var357, -1);
                                        class66.field1074[var6++] = var359;
                                        continue;
                                    }
                                    if (var517 == 5068) {
                                        var6 -= 2;
                                        int var360 = class66.field1074[var6 + 1];
                                        int var361 = class66.field1074[var6];
                                        class5.field64.field4689[var361] = var360;
                                        continue;
                                    }
                                    if (var517 == 5069) {
                                        var6 -= 2;
                                        int var362 = class66.field1074[var6];
                                        int var363 = class66.field1074[var6 + 1];
                                        class5.field64.field4689[var362] = var363;
                                        continue;
                                    }
                                    if (var517 == 5070) {
                                        var6 -= 3;
                                        int var364 = class66.field1074[var6 + 1];
                                        int var365 = class66.field1074[var6];
                                        int var366 = class66.field1074[var6 + 2];
                                        class18 var367 = class84.method672(var365, -2);
                                        if (var367.method138(var364, -1) != 0) {
                                            throw new RuntimeException("bad command");
                                        }
                                        class66.field1074[var6++] = var367.method137(var366, -1, var364);
                                        continue;
                                    }
                                    if (var517 == 5071) {
                                        var6--;
                                        boolean var368 = class66.field1074[var6] == 1;
                                        var7--;
                                        String var369 = class176.field2945[var7];
                                        class157.method1131(var369, (byte) -10, var368);
                                        class66.field1074[var6++] = class1.field3;
                                        continue;
                                    }
                                    if (var517 == 5072) {
                                        if (class208.field3346 != null && class1.field3 > class274.field4387) {
                                            class66.field1074[var6++] = class64.method498(65535, class208.field3346[class274.field4387++]);
                                            continue;
                                        }
                                        class66.field1074[var6++] = -1;
                                        continue;
                                    }
                                    if (var517 == 5073) {
                                        class274.field4387 = 0;
                                        continue;
                                    }
                                } else if (var517 < 5200) {
                                    if (var517 == 5100) {
                                        if (class13.field184[86]) {
                                            class66.field1074[var6++] = 1;
                                        } else {
                                            class66.field1074[var6++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var517 == 5101) {
                                        if (class13.field184[82]) {
                                            class66.field1074[var6++] = 1;
                                        } else {
                                            class66.field1074[var6++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var517 == 5102) {
                                        if (class13.field184[81]) {
                                            class66.field1074[var6++] = 1;
                                        } else {
                                            class66.field1074[var6++] = 0;
                                        }
                                        continue;
                                    }
                                } else if (var517 < 5300) {
                                    if (var517 == 5200) {
                                        var6--;
                                        class198.method1347(false, class66.field1074[var6]);
                                        continue;
                                    }
                                    if (var517 == 5201) {
                                        class66.field1074[var6++] = class220.method1454((byte) -64);
                                        continue;
                                    }
                                    if (var517 == 5202) {
                                        var6--;
                                        class242.method1608((byte) -85, class66.field1074[var6]);
                                        continue;
                                    }
                                    if (var517 == 5203) {
                                        var7--;
                                        class238.method1570((byte) -73, class176.field2945[var7]);
                                        continue;
                                    }
                                    if (var517 == 5204) {
                                        class176.field2945[var7 - 1] = class278.method1868(class176.field2945[var7 - 1], (byte) 105);
                                        continue;
                                    }
                                    if (var517 == 5205) {
                                        var6--;
                                        class108.method804(class66.field1074[var6], -1, -1, -94);
                                        continue;
                                    }
                                    if (var517 == 5206) {
                                        var6--;
                                        int var200 = class66.field1074[var6];
                                        class119 var201 = class155.method1122(var200 & 0x3FFF, (var200 & 0xFFFD2AF) >> 14, 124);
                                        if (var201 == null) {
                                            class66.field1074[var6++] = -1;
                                        } else {
                                            class66.field1074[var6++] = var201.field2000;
                                        }
                                        continue;
                                    }
                                    if (var517 == 5207) {
                                        var6--;
                                        class119 var202 = class258.method1728(class66.field1074[var6], true);
                                        if (var202 != null && var202.field2001 != null) {
                                            class176.field2945[var7++] = var202.field2001;
                                            continue;
                                        }
                                        class176.field2945[var7++] = "";
                                        continue;
                                    }
                                    if (var517 == 5208) {
                                        class66.field1074[var6++] = class206.field3311;
                                        class66.field1074[var6++] = class139.field2331;
                                        continue;
                                    }
                                    if (var517 == 5209) {
                                        class66.field1074[var6++] = class94.field1462 + class285.field4524;
                                        class66.field1074[var6++] = class31.field524 + class253.field4030 - class22.field343 - 1;
                                        continue;
                                    }
                                    if (var517 == 5210) {
                                        var6--;
                                        int var203 = class66.field1074[var6];
                                        class119 var204 = class258.method1728(var203, true);
                                        if (var204 == null) {
                                            class66.field1074[var6++] = 0;
                                            class66.field1074[var6++] = 0;
                                        } else {
                                            class66.field1074[var6++] = class64.method498(16383, var204.field2007 >> 14);
                                            class66.field1074[var6++] = class64.method498(16383, var204.field2007);
                                        }
                                        continue;
                                    }
                                    if (var517 == 5211) {
                                        var6--;
                                        int var205 = class66.field1074[var6];
                                        class119 var206 = class258.method1728(var205, true);
                                        if (var206 == null) {
                                            class66.field1074[var6++] = 0;
                                            class66.field1074[var6++] = 0;
                                        } else {
                                            class66.field1074[var6++] = var206.field1998 - var206.field2009;
                                            class66.field1074[var6++] = var206.field1999 - var206.field2005;
                                        }
                                        continue;
                                    }
                                    if (var517 == 5212) {
                                        int var207 = class107.method800((byte) 127);
                                        int var208 = 0;
                                        String var209;
                                        if (var207 == -1) {
                                            var209 = "";
                                        } else {
                                            var209 = class143.field2358.field4057[var207];
                                            var208 = class143.field2358.method1697(false, var207);
                                        }
                                        String var210 = class189.method1303("<br>", " ", (byte) -103, var209);
                                        class176.field2945[var7++] = var210;
                                        class66.field1074[var6++] = var208;
                                        continue;
                                    }
                                    if (var517 == 5213) {
                                        int var211 = class8.method47(!arg2);
                                        int var212 = 0;
                                        String var213;
                                        if (var211 == -1) {
                                            var213 = "";
                                        } else {
                                            var213 = class143.field2358.field4057[var211];
                                            var212 = class143.field2358.method1697(false, var211);
                                        }
                                        String var214 = class189.method1303("<br>", " ", (byte) -121, var213);
                                        class176.field2945[var7++] = var214;
                                        class66.field1074[var6++] = var212;
                                        continue;
                                    }
                                    if (var517 == 5214) {
                                        var6--;
                                        int var215 = class66.field1074[var6];
                                        class119 var216 = class104.method778((byte) 112);
                                        if (var216 != null) {
                                            int[] var217 = var216.method869(var215 & 0x3FFF, (var215 & 0xFFFFD02) >> 14, (var215 & 0x32B5458A) >> 28, (byte) -87);
                                            if (var217 != null) {
                                                class15.method102(var217[2], var217[1], 88);
                                            }
                                        }
                                        continue;
                                    }
                                    if (var517 == 5215) {
                                        var6 -= 2;
                                        int var218 = class66.field1074[var6];
                                        int var219 = class66.field1074[var6 + 1];
                                        class10 var220 = class269.method1830(var218 & 0x3FFF, (var218 & 0xFFFE839) >> 14, (byte) -113);
                                        boolean var221 = false;
                                        for (class119 var222 = (class119) var220.method62(0); var222 != null; var222 = (class119) var220.method66((byte) 100)) {
                                            if (var222.field2000 == var219) {
                                                var221 = true;
                                                break;
                                            }
                                        }
                                        if (var221) {
                                            class66.field1074[var6++] = 1;
                                        } else {
                                            class66.field1074[var6++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var517 == 5216) {
                                        var6--;
                                        int var223 = class66.field1074[var6];
                                        class218.method1448(120, var223);
                                        continue;
                                    }
                                    if (var517 == 5217) {
                                        var6--;
                                        int var224 = class66.field1074[var6];
                                        if (class72.method557((byte) -96, var224)) {
                                            class66.field1074[var6++] = 1;
                                        } else {
                                            class66.field1074[var6++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var517 == 5218) {
                                        var6--;
                                        int var225 = class66.field1074[var6];
                                        class119 var226 = class258.method1728(var225, true);
                                        if (var226 == null) {
                                            class66.field1074[var6++] = -1;
                                        } else {
                                            class66.field1074[var6++] = var226.field1997;
                                        }
                                        continue;
                                    }
                                    if (var517 == 5219) {
                                        var7--;
                                        class287.method1936(-22994, class176.field2945[var7]);
                                        continue;
                                    }
                                    if (var517 == 5220) {
                                        class66.field1074[var6++] = class5.field63 == 100 ? 1 : 0;
                                        continue;
                                    }
                                    if (var517 == 5221) {
                                        var6--;
                                        int var227 = class66.field1074[var6];
                                        class15.method102(var227 & 0x3FFF, var227 >> 14 & 0x3FFF, 74);
                                        continue;
                                    }
                                    if (var517 == 5222) {
                                        class119 var228 = class104.method778((byte) 110);
                                        if (var228 == null) {
                                            class66.field1074[var6++] = -1;
                                            class66.field1074[var6++] = -1;
                                        } else {
                                            int[] var229 = var228.method871(class31.field524 + class253.field4030 - class22.field343 - 1, (byte) -124, class94.field1462 + class285.field4524);
                                            if (var229 == null) {
                                                class66.field1074[var6++] = -1;
                                                class66.field1074[var6++] = -1;
                                            } else {
                                                class66.field1074[var6++] = var229[1];
                                                class66.field1074[var6++] = var229[2];
                                            }
                                        }
                                        continue;
                                    }
                                    if (var517 == 5223) {
                                        var6 -= 2;
                                        int var230 = class66.field1074[var6 + 1];
                                        int var231 = class66.field1074[var6];
                                        class108.method804(var231, var230 >> 14 & 0x3FFF, var230 & 0x3FFF, -127);
                                        continue;
                                    }
                                    if (var517 == 5224) {
                                        var6--;
                                        int var232 = class66.field1074[var6];
                                        class119 var233 = class104.method778((byte) 127);
                                        if (var233 == null) {
                                            class66.field1074[var6++] = -1;
                                            class66.field1074[var6++] = -1;
                                        } else {
                                            int[] var234 = var233.method869(var232 & 0x3FFF, var232 >> 14 & 0x3FFF, (var232 & 0x3BEBD5E6) >> 28, (byte) -87);
                                            if (var234 == null) {
                                                class66.field1074[var6++] = -1;
                                                class66.field1074[var6++] = -1;
                                            } else {
                                                class66.field1074[var6++] = var234[1];
                                                class66.field1074[var6++] = var234[2];
                                            }
                                        }
                                        continue;
                                    }
                                    if (var517 == 5225) {
                                        var6--;
                                        int var235 = class66.field1074[var6];
                                        class119 var236 = class104.method778((byte) 123);
                                        if (var236 == null) {
                                            class66.field1074[var6++] = -1;
                                            class66.field1074[var6++] = -1;
                                        } else {
                                            int[] var237 = var236.method871(var235 & 0x3FFF, (byte) -124, (var235 & 0xFFFE27D) >> 14);
                                            if (var237 == null) {
                                                class66.field1074[var6++] = -1;
                                                class66.field1074[var6++] = -1;
                                            } else {
                                                class66.field1074[var6++] = var237[1];
                                                class66.field1074[var6++] = var237[2];
                                            }
                                        }
                                        continue;
                                    }
                                } else if (var517 < 5400) {
                                    if (var517 == 5300) {
                                        var6 -= 2;
                                        class66.field1074[var6++] = 0;
                                        continue;
                                    }
                                    if (var517 == 5301) {
                                        continue;
                                    }
                                    if (var517 == 5302) {
                                        class66.field1074[var6++] = 0;
                                        continue;
                                    }
                                    if (var517 == 5303) {
                                        var6--;
                                        class66.field1074[var6++] = 0;
                                        class66.field1074[var6++] = 0;
                                        continue;
                                    }
                                    if (var517 == 5305) {
                                        byte var238 = -1;
                                        class66.field1074[var6++] = var238;
                                        continue;
                                    }
                                    if (var517 == 5306) {
                                        class66.field1074[var6++] = class218.method1447(-769845689);
                                        continue;
                                    }
                                    if (var517 == 5307) {
                                        var6--;
                                        int var239 = class66.field1074[var6];
                                        if (var239 < 0 || var239 > 2) {
                                            var239 = 0;
                                        }
                                        class245.method1632(-83, var239, false, -1, -1);
                                        continue;
                                    }
                                    if (var517 == 5308) {
                                        class66.field1074[var6++] = class179.field2990;
                                        continue;
                                    }
                                    if (var517 == 5309) {
                                        var6--;
                                        int var240 = class66.field1074[var6];
                                        if (var240 < 0 || var240 > 2) {
                                            var240 = 0;
                                        }
                                        class179.field2990 = var240;
                                        class112.method829(class205.field3294, 16751);
                                        continue;
                                    }
                                } else if (var517 < 5500) {
                                    if (var517 == 5400) {
                                        var7 -= 2;
                                        String var241 = class176.field2945[var7];
                                        var6--;
                                        int var242 = class66.field1074[var6];
                                        String var243 = class176.field2945[var7 + 1];
                                        class87.field1405.method607(214, (byte) 80);
                                        class194.field3177++;
                                        class87.field1405.method966((byte) 41, class65.method499(124, var241) - (-class65.method499(79, var243) - 1));
                                        class87.field1405.method1028(14630, var241);
                                        class87.field1405.method1028(14630, var243);
                                        class87.field1405.method966((byte) 46, var242);
                                        continue;
                                    }
                                    if (var517 == 5401) {
                                        var6 -= 2;
                                        class42.field779[class66.field1074[var6]] = (short) class102.method755((byte) 125, class66.field1074[var6 + 1]);
                                        class194.method1328(0);
                                        class254.method1701(-18331);
                                        class105.method781(-111);
                                        class44.method380(255);
                                        class161.method1164(true);
                                        continue;
                                    }
                                    if (var517 == 5405) {
                                        var6 -= 2;
                                        int var244 = class66.field1074[var6];
                                        int var245 = class66.field1074[var6 + 1];
                                        if (var244 >= 0 && var244 < 2) {
                                            class297.field4692[var244] = new int[var245 << 1][4];
                                        }
                                        continue;
                                    }
                                    if (var517 == 5406) {
                                        var6 -= 7;
                                        int var246 = class66.field1074[var6];
                                        int var247 = class66.field1074[var6 + 1] << 1;
                                        int var248 = class66.field1074[var6 + 2];
                                        int var249 = class66.field1074[var6 + 3];
                                        int var250 = class66.field1074[var6 + 4];
                                        int var251 = class66.field1074[var6 + 5];
                                        int var252 = class66.field1074[var6 + 6];
                                        if (var246 >= 0 && var246 < 2 && class297.field4692[var246] != null && var247 >= 0 && class297.field4692[var246].length > var247) {
                                            class297.field4692[var246][var247] = new int[] { (class64.method498(var248, 268430430) >> 14) * 128, var249, class64.method498(var248, 16383) * 128, var252 };
                                            class297.field4692[var246][var247 + 1] = new int[] { class64.method498(var250 >> 14, 16383) * 128, var251, class64.method498(16383, var250) * 128 };
                                        }
                                        continue;
                                    }
                                    if (var517 == 5407) {
                                        var6--;
                                        int var253 = class297.field4692[class66.field1074[var6]].length >> 1;
                                        class66.field1074[var6++] = var253;
                                        continue;
                                    }
                                    if (var517 == 5411) {
                                        if (class207.field3327 == null) {
                                            class128.method934(false, class97.method736((byte) 67), (byte) 96);
                                        } else {
                                            System.exit(0);
                                        }
                                        continue;
                                    }
                                    if (var517 == 5419) {
                                        String var254 = "";
                                        if (class185.field3040 != null) {
                                            if (class185.field3040.field1936 == null) {
                                                var254 = class233.method1547(class185.field3040.field1934, (byte) 63);
                                            } else {
                                                var254 = (String) class185.field3040.field1936;
                                            }
                                        }
                                        class176.field2945[var7++] = var254;
                                        continue;
                                    }
                                    if (var517 == 5420) {
                                        class66.field1074[var6++] = class78.field1306 == 3 ? 1 : 0;
                                        continue;
                                    }
                                    if (var517 == 5421) {
                                        var6--;
                                        boolean var255 = class66.field1074[var6] == 1;
                                        var7--;
                                        String var256 = class176.field2945[var7];
                                        String var257 = class97.method736((byte) 67) + var256;
                                        if (class207.field3327 == null && (!var255 || class78.field1306 == 3 || !class78.field1300.startsWith("win") || class217.field3480)) {
                                            class128.method934(var255, var257, (byte) 73);
                                            continue;
                                        }
                                        class206.field3312 = var255;
                                        class176.field2944 = var257;
                                        class160.field2598 = class205.field3294.method632(var257, (byte) -111);
                                        continue;
                                    }
                                    if (var517 == 5422) {
                                        var7 -= 2;
                                        var6--;
                                        int var258 = class66.field1074[var6];
                                        String var259 = class176.field2945[var7];
                                        String var260 = class176.field2945[var7 + 1];
                                        if (var259.length() > 0) {
                                            if (class278.field4407 == null) {
                                                class278.field4407 = new String[class66.field1084[class238.field3752]];
                                            }
                                            class278.field4407[var258] = var259;
                                        }
                                        if (var260.length() > 0) {
                                            if (class87.field1410 == null) {
                                                class87.field1410 = new String[class66.field1084[class238.field3752]];
                                            }
                                            class87.field1410[var258] = var260;
                                        }
                                        continue;
                                    }
                                    if (var517 == 5423) {
                                        var7--;
                                        System.out.println(class176.field2945[var7]);
                                        continue;
                                    }
                                    if (var517 == 5424) {
                                        var6 -= 11;
                                        class278.field4409 = class66.field1074[var6];
                                        class40.field686 = class66.field1074[var6 + 1];
                                        class140.field2336 = class66.field1074[var6 + 2];
                                        class56.field993 = class66.field1074[var6 + 3];
                                        class193.field3152 = class66.field1074[var6 + 4];
                                        class80.field1332 = class66.field1074[var6 + 5];
                                        class287.field4599 = class66.field1074[var6 + 6];
                                        class193.field3156 = class66.field1074[var6 + 7];
                                        class82.field1356 = class66.field1074[var6 + 8];
                                        class237.field3742 = class66.field1074[var6 + 9];
                                        class237.field3741 = class66.field1074[var6 + 10];
                                        class35.field594.method899(class193.field3152, -88);
                                        class35.field594.method899(class80.field1332, -97);
                                        class35.field594.method899(class287.field4599, -110);
                                        class35.field594.method899(class193.field3156, -78);
                                        class35.field594.method899(class82.field1356, -104);
                                        class38.field661 = true;
                                        continue;
                                    }
                                    if (var517 == 5425) {
                                        class283.method1901(false);
                                        class38.field661 = false;
                                        continue;
                                    }
                                    if (var517 == 5426) {
                                        var6--;
                                        class205.field3306 = class66.field1074[var6];
                                        continue;
                                    }
                                    if (var517 == 5427) {
                                        var6 -= 2;
                                        class286.field4556 = class66.field1074[var6];
                                        class107.field1633 = class66.field1074[var6 + 1];
                                        continue;
                                    }
                                    if (var517 == 5428) {
                                        var6 -= 2;
                                        int var261 = class66.field1074[var6];
                                        int var262 = class66.field1074[var6 + 1];
                                        class66.field1074[var6++] = class132.method952(var261, 42, var262) ? 1 : 0;
                                        continue;
                                    }
                                } else if (var517 < 5600) {
                                    if (var517 == 5500) {
                                        var6 -= 4;
                                        int var293 = class66.field1074[var6];
                                        int var294 = class66.field1074[var6 + 3];
                                        int var295 = class66.field1074[var6 + 1];
                                        int var296 = class66.field1074[var6 + 2];
                                        class223.method1501((var293 & 0x3FFF) - class170.field2787, var294, var296, (var293 >> 14 & 0x3FFF) - class256.field4082, var295, false, -101);
                                        continue;
                                    }
                                    if (var517 == 5501) {
                                        var6 -= 4;
                                        int var297 = class66.field1074[var6];
                                        int var298 = class66.field1074[var6 + 1];
                                        int var299 = class66.field1074[var6 + 2];
                                        int var300 = class66.field1074[var6 + 3];
                                        class82.method665(((var297 & 0xFFFEB47) >> 14) - class256.field4082, var300, var299, var298, 12844, (var297 & 0x3FFF) - class170.field2787);
                                        continue;
                                    }
                                    if (var517 == 5502) {
                                        var6 -= 6;
                                        int var301 = class66.field1074[var6];
                                        if (var301 >= 2) {
                                            throw new RuntimeException();
                                        }
                                        class239.field3776 = var301;
                                        int var302 = class66.field1074[var6 + 1];
                                        if ((var302 + 1) >= (class297.field4692[class239.field3776].length >> 1)) {
                                            throw new RuntimeException();
                                        }
                                        class23.field367 = var302;
                                        class100.field1519 = 0;
                                        class38.field675 = class66.field1074[var6 + 2];
                                        class194.field3172 = class66.field1074[var6 + 3];
                                        int var303 = class66.field1074[var6 + 4];
                                        if (var303 >= 2) {
                                            throw new RuntimeException();
                                        }
                                        class22.field334 = var303;
                                        int var304 = class66.field1074[var6 + 5];
                                        if (class297.field4692[class22.field334].length >> 1 <= var304 + 1) {
                                            throw new RuntimeException();
                                        }
                                        class184.field3033 = 3;
                                        class289.field4614 = var304;
                                        continue;
                                    }
                                    if (var517 == 5503) {
                                        class278.method1872((byte) -102);
                                        continue;
                                    }
                                    if (var517 == 5504) {
                                        var6 -= 2;
                                        class106.method789(class66.field1074[var6], (byte) -115, class66.field1074[var6 + 1]);
                                        continue;
                                    }
                                    if (var517 == 5505) {
                                        class66.field1074[var6++] = (int) class161.field2619;
                                        continue;
                                    }
                                    if (var517 == 5506) {
                                        class66.field1074[var6++] = (int) class1.field1;
                                        continue;
                                    }
                                    if (var517 == 5507) {
                                        class210.method1401((byte) 76);
                                        continue;
                                    }
                                    if (var517 == 5508) {
                                        class10.method69(-1111);
                                        continue;
                                    }
                                    if (var517 == 5509) {
                                        class104.method776(-191);
                                        continue;
                                    }
                                    if (var517 == 5510) {
                                        class240.method1584(30);
                                        continue;
                                    }
                                    if (var517 == 5512) {
                                        class5.method26((byte) 74);
                                        continue;
                                    }
                                } else if (var517 < 5700) {
                                    if (var517 == 5600) {
                                        var7 -= 2;
                                        String var289 = class176.field2945[var7 + 1];
                                        String var290 = class176.field2945[var7];
                                        var6--;
                                        int var291 = class66.field1074[var6];
                                        if (class146.field2401 == 10 && class97.field1510 == 0 && class256.field4081 == 0 && class69.field1167 == 0 && class228.field3620 == 0) {
                                            class251.method1669(var289, var290, var291, (byte) 124);
                                        }
                                        continue;
                                    }
                                    if (var517 == 5601) {
                                        class297.method1989(6);
                                        continue;
                                    }
                                    if (var517 == 5602) {
                                        if (class256.field4081 == 0) {
                                            class106.field1615 = -2;
                                        }
                                        continue;
                                    }
                                    if (var517 == 5603) {
                                        var6 -= 4;
                                        if (class146.field2401 == 10 && class97.field1510 == 0 && class256.field4081 == 0 && class69.field1167 == 0 && class228.field3620 == 0) {
                                            class155.method1119(class66.field1074[var6 + 2], class66.field1074[var6 + 1], class66.field1074[var6], class66.field1074[var6 + 3], -64);
                                        }
                                        continue;
                                    }
                                    if (var517 == 5604) {
                                        var7--;
                                        if (class146.field2401 == 10 && class97.field1510 == 0 && class256.field4081 == 0 && class69.field1167 == 0 && class228.field3620 == 0) {
                                            class254.method1699(-109, class260.method1739(false, class176.field2945[var7]));
                                        }
                                        continue;
                                    }
                                    if (var517 == 5605) {
                                        var7 -= 3;
                                        var6 -= 7;
                                        if (class146.field2401 == 10 && class97.field1510 == 0 && class256.field4081 == 0 && class69.field1167 == 0 && class228.field3620 == 0) {
                                            class59.method460(class66.field1074[var6], class66.field1074[var6 + 4] == 1, class66.field1074[var6 + 3], class66.field1074[var6 + 6] == 1, 22439, class176.field2945[var7 + 2], class66.field1074[var6 + 1], class66.field1074[var6 + 5] == 1, class66.field1074[var6 + 2], class260.method1739(!arg2, class176.field2945[var7]), class176.field2945[var7 + 1]);
                                        }
                                        continue;
                                    }
                                    if (var517 == 5606) {
                                        if (class69.field1167 == 0) {
                                            class285.field4532 = -2;
                                        }
                                        continue;
                                    }
                                    if (var517 == 5607) {
                                        class66.field1074[var6++] = class106.field1615;
                                        continue;
                                    }
                                    if (var517 == 5608) {
                                        class66.field1074[var6++] = class217.field3478;
                                        continue;
                                    }
                                    if (var517 == 5609) {
                                        class66.field1074[var6++] = class285.field4532;
                                        continue;
                                    }
                                    if (var517 == 5610) {
                                        for (int var292 = 0; var292 < 5; var292++) {
                                            class176.field2945[var7++] = var292 < class250.field3985.length ? class146.method1079(class250.field3985[var292], 10446) : "";
                                        }
                                        class250.field3985 = null;
                                        continue;
                                    }
                                    if (var517 == 5611) {
                                        class66.field1074[var6++] = class265.field4240;
                                        continue;
                                    }
                                } else if (var517 < 6100) {
                                    if (var517 == 6001) {
                                        var6--;
                                        int var263 = class66.field1074[var6];
                                        if (var263 < 1) {
                                            var263 = 1;
                                        }
                                        if (var263 > 4) {
                                            var263 = 4;
                                        }
                                        class220.field3520 = var263;
                                        if (class220.field3520 == 1) {
                                            class95.method716(0.9F);
                                        }
                                        if (class220.field3520 == 2) {
                                            class95.method716(0.8F);
                                        }
                                        if (class220.field3520 == 3) {
                                            class95.method716(0.7F);
                                        }
                                        if (class220.field3520 == 4) {
                                            class95.method716(0.6F);
                                        }
                                        class254.method1701(-18331);
                                        class112.method829(class205.field3294, 16751);
                                        class251.field3994 = false;
                                        continue;
                                    }
                                    if (var517 == 6002) {
                                        var6--;
                                        class80.method643(class66.field1074[var6] == 1, (byte) -124);
                                        class131.method946(3468);
                                        class240.method1583(-20197);
                                        class114.method836((byte) -109);
                                        class112.method829(class205.field3294, 16751);
                                        class251.field3994 = false;
                                        continue;
                                    }
                                    if (var517 == 6003) {
                                        var6--;
                                        class230.field3660 = class66.field1074[var6] == 1;
                                        class114.method836((byte) -71);
                                        class112.method829(class205.field3294, 16751);
                                        class251.field3994 = false;
                                        continue;
                                    }
                                    if (var517 == 6005) {
                                        var6--;
                                        class151.field2470 = class66.field1074[var6] == 1;
                                        class240.method1583(-20197);
                                        class112.method829(class205.field3294, 16751);
                                        class251.field3994 = false;
                                        continue;
                                    }
                                    if (var517 == 6006) {
                                        var6--;
                                        class112.field1731 = class66.field1074[var6] == 1;
                                        ((class283) class95.field1483).method1904(32227, !class112.field1731);
                                        class112.method829(class205.field3294, 16751);
                                        class251.field3994 = false;
                                        continue;
                                    }
                                    if (var517 == 6007) {
                                        var6--;
                                        class104.field1595 = class66.field1074[var6] == 1;
                                        class112.method829(class205.field3294, 16751);
                                        class251.field3994 = false;
                                        continue;
                                    }
                                    if (var517 == 6008) {
                                        var6--;
                                        class153.field2495 = class66.field1074[var6] == 1;
                                        class112.method829(class205.field3294, 16751);
                                        class251.field3994 = false;
                                        continue;
                                    }
                                    if (var517 == 6009) {
                                        var6--;
                                        class150.field2463 = class66.field1074[var6] == 1;
                                        class112.method829(class205.field3294, 16751);
                                        class251.field3994 = false;
                                        continue;
                                    }
                                    if (var517 == 6010) {
                                        var6--;
                                        class153.field2496 = class66.field1074[var6] == 1;
                                        class112.method829(class205.field3294, 16751);
                                        class251.field3994 = false;
                                        continue;
                                    }
                                    if (var517 == 6011) {
                                        var6--;
                                        int var264 = class66.field1074[var6];
                                        if (var264 < 0 || var264 > 2) {
                                            var264 = 0;
                                        }
                                        class112.field1735 = var264;
                                        class112.method829(class205.field3294, 16751);
                                        class251.field3994 = false;
                                        continue;
                                    }
                                    if (var517 == 6012) {
                                        var6--;
                                        class80.field1324 = class66.field1074[var6] == 1;
                                        if (class220.field3520 == 1) {
                                            class95.method716(0.9F);
                                        }
                                        if (class220.field3520 == 2) {
                                            class95.method716(0.8F);
                                        }
                                        if (class220.field3520 == 3) {
                                            class95.method716(0.7F);
                                        }
                                        if (class220.field3520 == 4) {
                                            class95.method716(0.6F);
                                        }
                                        class240.method1583(-20197);
                                        class112.method829(class205.field3294, 16751);
                                        class251.field3994 = false;
                                        continue;
                                    }
                                    if (var517 == 6014) {
                                        var6--;
                                        class89.field1425 = class66.field1074[var6] == 1;
                                        class112.method829(class205.field3294, 16751);
                                        class251.field3994 = false;
                                        continue;
                                    }
                                    if (var517 == 6015) {
                                        var6--;
                                        class132.field2209 = class66.field1074[var6] == 1;
                                        class112.method829(class205.field3294, 16751);
                                        class251.field3994 = false;
                                        continue;
                                    }
                                    if (var517 == 6016) {
                                        var6--;
                                        int var265 = class66.field1074[var6];
                                        if (var265 < 0 || var265 > 2) {
                                            var265 = 0;
                                        }
                                        class163.field2643 = var265;
                                        continue;
                                    }
                                    if (var517 == 6017) {
                                        var6--;
                                        class179.field2991 = class66.field1074[var6] == 1;
                                        class159.method1148(!arg2);
                                        class112.method829(class205.field3294, 16751);
                                        class251.field3994 = false;
                                        continue;
                                    }
                                    if (var517 == 6018) {
                                        var6--;
                                        int var266 = class66.field1074[var6];
                                        if (var266 < 0) {
                                            var266 = 0;
                                        }
                                        if (var266 > 127) {
                                            var266 = 127;
                                        }
                                        class77.field1287 = var266;
                                        class112.method829(class205.field3294, 16751);
                                        class251.field3994 = false;
                                        continue;
                                    }
                                    if (var517 == 6019) {
                                        var6--;
                                        int var267 = class66.field1074[var6];
                                        if (var267 < 0) {
                                            var267 = 0;
                                        }
                                        if (var267 > 255) {
                                            var267 = 255;
                                        }
                                        if (class274.field4382 != var267) {
                                            if (class274.field4382 == 0 && class235.field3726 != -1) {
                                                class31.method269(class10.field134, 0, var267, class235.field3726, 0, false);
                                                class178.field2968 = false;
                                            } else if (var267 == 0) {
                                                class148.method1090(1);
                                                class178.field2968 = false;
                                            } else {
                                                class40.method331((byte) 100, var267);
                                            }
                                            class274.field4382 = var267;
                                        }
                                        class112.method829(class205.field3294, 16751);
                                        class251.field3994 = false;
                                        continue;
                                    }
                                    if (var517 == 6020) {
                                        var6--;
                                        int var268 = class66.field1074[var6];
                                        if (var268 < 0) {
                                            var268 = 0;
                                        }
                                        if (var268 > 127) {
                                            var268 = 127;
                                        }
                                        class111.field1719 = var268;
                                        class112.method829(class205.field3294, 16751);
                                        class251.field3994 = false;
                                        continue;
                                    }
                                    if (var517 == 6021) {
                                        var6--;
                                        class89.field1418 = class66.field1074[var6] == 1;
                                        class114.method836((byte) -128);
                                        continue;
                                    }
                                    if (var517 == 6023) {
                                        boolean var269 = false;
                                        var6--;
                                        int var270 = class66.field1074[var6];
                                        if (var270 < 0) {
                                            var270 = 0;
                                        }
                                        if (var270 > 2) {
                                            var270 = 2;
                                        }
                                        if (class269.field4324 < 96) {
                                            var269 = true;
                                            var270 = 0;
                                        }
                                        class98.method742(var270);
                                        class112.method829(class205.field3294, 16751);
                                        class251.field3994 = false;
                                        class66.field1074[var6++] = var269 ? 0 : 1;
                                        continue;
                                    }
                                    if (var517 == 6024) {
                                        var6--;
                                        int var271 = class66.field1074[var6];
                                        if (var271 < 0 || var271 > 2) {
                                            var271 = 0;
                                        }
                                        class255.field4071 = var271;
                                        class112.method829(class205.field3294, 16751);
                                        continue;
                                    }
                                    if (var517 == 6027) {
                                        var6--;
                                        continue;
                                    }
                                    if (var517 == 6028) {
                                        var6--;
                                        class137.field2308 = class66.field1074[var6] != 0;
                                        class112.method829(class205.field3294, 16751);
                                        continue;
                                    }
                                } else if (var517 < 6200) {
                                    if (var517 == 6101) {
                                        class66.field1074[var6++] = class220.field3520;
                                        continue;
                                    }
                                    if (var517 == 6102) {
                                        class66.field1074[var6++] = class9.method50(!arg2) ? 1 : 0;
                                        continue;
                                    }
                                    if (var517 == 6103) {
                                        class66.field1074[var6++] = class230.field3660 ? 1 : 0;
                                        continue;
                                    }
                                    if (var517 == 6105) {
                                        class66.field1074[var6++] = class151.field2470 ? 1 : 0;
                                        continue;
                                    }
                                    if (var517 == 6106) {
                                        class66.field1074[var6++] = class112.field1731 ? 1 : 0;
                                        continue;
                                    }
                                    if (var517 == 6107) {
                                        class66.field1074[var6++] = class104.field1595 ? 1 : 0;
                                        continue;
                                    }
                                    if (var517 == 6108) {
                                        class66.field1074[var6++] = class153.field2495 ? 1 : 0;
                                        continue;
                                    }
                                    if (var517 == 6109) {
                                        class66.field1074[var6++] = class150.field2463 ? 1 : 0;
                                        continue;
                                    }
                                    if (var517 == 6110) {
                                        class66.field1074[var6++] = class153.field2496 ? 1 : 0;
                                        continue;
                                    }
                                    if (var517 == 6111) {
                                        class66.field1074[var6++] = class112.field1735;
                                        continue;
                                    }
                                    if (var517 == 6112) {
                                        class66.field1074[var6++] = class80.field1324 ? 1 : 0;
                                        continue;
                                    }
                                    if (var517 == 6114) {
                                        class66.field1074[var6++] = class89.field1425 ? 1 : 0;
                                        continue;
                                    }
                                    if (var517 == 6115) {
                                        class66.field1074[var6++] = class132.field2209 ? 1 : 0;
                                        continue;
                                    }
                                    if (var517 == 6116) {
                                        class66.field1074[var6++] = class163.field2643;
                                        continue;
                                    }
                                    if (var517 == 6117) {
                                        class66.field1074[var6++] = class179.field2991 ? 1 : 0;
                                        continue;
                                    }
                                    if (var517 == 6118) {
                                        class66.field1074[var6++] = class77.field1287;
                                        continue;
                                    }
                                    if (var517 == 6119) {
                                        class66.field1074[var6++] = class274.field4382;
                                        continue;
                                    }
                                    if (var517 == 6120) {
                                        class66.field1074[var6++] = class111.field1719;
                                        continue;
                                    }
                                    if (var517 == 6121) {
                                        class66.field1074[var6++] = 0;
                                        continue;
                                    }
                                    if (var517 == 6123) {
                                        class66.field1074[var6++] = class98.method741();
                                        continue;
                                    }
                                    if (var517 == 6124) {
                                        class66.field1074[var6++] = class255.field4071;
                                        continue;
                                    }
                                    if (var517 == 6126) {
                                        class66.field1074[var6++] = 0;
                                        continue;
                                    }
                                    if (var517 == 6127) {
                                        class66.field1074[var6++] = class171.field2825 ? 1 : 0;
                                        continue;
                                    }
                                    if (var517 == 6128) {
                                        class66.field1074[var6++] = class137.field2308 ? 1 : 0;
                                        continue;
                                    }
                                } else if (var517 < 6300) {
                                    if (var517 == 6200) {
                                        var6 -= 2;
                                        class84.field1386 = (short) class66.field1074[var6];
                                        if (class84.field1386 <= 0) {
                                            class84.field1386 = 256;
                                        }
                                        class225.field3587 = (short) class66.field1074[var6 + 1];
                                        if (class225.field3587 <= 0) {
                                            class225.field3587 = 205;
                                        }
                                        continue;
                                    }
                                    if (var517 == 6201) {
                                        var6 -= 2;
                                        class111.field1721 = (short) class66.field1074[var6];
                                        if (class111.field1721 <= 0) {
                                            class111.field1721 = 256;
                                        }
                                        class282.field4472 = (short) class66.field1074[var6 + 1];
                                        if (class282.field4472 <= 0) {
                                            class282.field4472 = 320;
                                        }
                                        continue;
                                    }
                                    if (var517 == 6202) {
                                        var6 -= 4;
                                        class189.field3081 = (short) class66.field1074[var6];
                                        if (class189.field3081 <= 0) {
                                            class189.field3081 = 1;
                                        }
                                        class22.field341 = (short) class66.field1074[var6 + 1];
                                        if (class22.field341 <= 0) {
                                            class22.field341 = 32767;
                                        } else if (class189.field3081 > class22.field341) {
                                            class22.field341 = class189.field3081;
                                        }
                                        class210.field3369 = (short) class66.field1074[var6 + 2];
                                        if (class210.field3369 <= 0) {
                                            class210.field3369 = 1;
                                        }
                                        class129.field2148 = (short) class66.field1074[var6 + 3];
                                        if (class129.field2148 <= 0) {
                                            class129.field2148 = 32767;
                                        } else if (class210.field3369 > class129.field2148) {
                                            class129.field2148 = class210.field3369;
                                        }
                                        continue;
                                    }
                                    if (var517 == 6203) {
                                        class189.method1300(-37, class181.field3006.field1790, 0, class181.field3006.field1919, false, 0);
                                        class66.field1074[var6++] = class92.field1450;
                                        class66.field1074[var6++] = class57.field1001;
                                        continue;
                                    }
                                    if (var517 == 6204) {
                                        class66.field1074[var6++] = class111.field1721;
                                        class66.field1074[var6++] = class282.field4472;
                                        continue;
                                    }
                                    if (var517 == 6205) {
                                        class66.field1074[var6++] = class84.field1386;
                                        class66.field1074[var6++] = class225.field3587;
                                        continue;
                                    }
                                } else if (var517 < 6400) {
                                    if (var517 == 6300) {
                                        class66.field1074[var6++] = (int) (class62.method472(52) / 60000L);
                                        continue;
                                    }
                                    if (var517 == 6301) {
                                        class66.field1074[var6++] = (int) (class62.method472(88) / 86400000L) - 11745;
                                        continue;
                                    }
                                    if (var517 == 6302) {
                                        var6 -= 3;
                                        int var284 = class66.field1074[var6];
                                        int var285 = class66.field1074[var6 + 1];
                                        int var286 = class66.field1074[var6 + 2];
                                        class37.field632.clear();
                                        class37.field632.set(11, 12);
                                        class37.field632.set(var286, var285, var284);
                                        class66.field1074[var6++] = (int) (class37.field632.getTime().getTime() / 86400000L) - 11745;
                                        continue;
                                    }
                                    if (var517 == 6303) {
                                        class37.field632.clear();
                                        class37.field632.setTime(new Date(class62.method472(118)));
                                        class66.field1074[var6++] = class37.field632.get(1);
                                        continue;
                                    }
                                    if (var517 == 6304) {
                                        boolean var287 = true;
                                        var6--;
                                        int var288 = class66.field1074[var6];
                                        if (var288 < 0) {
                                            var287 = (var288 + 1) % 4 == 0;
                                        } else if (var288 < 1582) {
                                            var287 = var288 % 4 == 0;
                                        } else if ((var288 % 4) != 0) {
                                            var287 = false;
                                        } else if (var288 % 100 != 0) {
                                            var287 = true;
                                        } else if (var288 % 400 != 0) {
                                            var287 = false;
                                        }
                                        class66.field1074[var6++] = var287 ? 1 : 0;
                                        continue;
                                    }
                                } else if (var517 < 6500) {
                                    if (var517 == 6405) {
                                        class66.field1074[var6++] = class179.method1268(-29033) ? 1 : 0;
                                        continue;
                                    }
                                    if (var517 == 6406) {
                                        class66.field1074[var6++] = class61.method471(-61) ? 1 : 0;
                                        continue;
                                    }
                                } else if (var517 < 6600) {
                                    if (var517 == 6500) {
                                        if (class146.field2401 == 10 && class97.field1510 == 0 && class256.field4081 == 0 && class69.field1167 == 0) {
                                            class66.field1074[var6++] = class199.method1353((byte) 67) == -1 ? 0 : 1;
                                            continue;
                                        }
                                        class66.field1074[var6++] = 1;
                                        continue;
                                    }
                                    if (var517 == 6501) {
                                        class80 var272 = class184.method1285(true);
                                        if (var272 == null) {
                                            class66.field1074[var6++] = -1;
                                            class66.field1074[var6++] = 0;
                                            class176.field2945[var7++] = "";
                                            class66.field1074[var6++] = 0;
                                            class176.field2945[var7++] = "";
                                            class66.field1074[var6++] = 0;
                                        } else {
                                            class66.field1074[var6++] = var272.field1322;
                                            class66.field1074[var6++] = var272.field4601;
                                            class176.field2945[var7++] = var272.field1330;
                                            class43 var273 = var272.method645(arg2);
                                            class66.field1074[var6++] = var273.field788;
                                            class176.field2945[var7++] = var273.field789;
                                            class66.field1074[var6++] = var272.field4591;
                                        }
                                        continue;
                                    }
                                    if (var517 == 6502) {
                                        class80 var274 = class226.method1512((byte) 105);
                                        if (var274 == null) {
                                            class66.field1074[var6++] = -1;
                                            class66.field1074[var6++] = 0;
                                            class176.field2945[var7++] = "";
                                            class66.field1074[var6++] = 0;
                                            class176.field2945[var7++] = "";
                                            class66.field1074[var6++] = 0;
                                        } else {
                                            class66.field1074[var6++] = var274.field1322;
                                            class66.field1074[var6++] = var274.field4601;
                                            class176.field2945[var7++] = var274.field1330;
                                            class43 var275 = var274.method645(true);
                                            class66.field1074[var6++] = var275.field788;
                                            class176.field2945[var7++] = var275.field789;
                                            class66.field1074[var6++] = var274.field4591;
                                        }
                                        continue;
                                    }
                                    if (var517 == 6503) {
                                        var6--;
                                        int var276 = class66.field1074[var6];
                                        if (class146.field2401 == 10 && class97.field1510 == 0 && class256.field4081 == 0 && class69.field1167 == 0) {
                                            class66.field1074[var6++] = class189.method1301(69, var276) ? 1 : 0;
                                            continue;
                                        }
                                        class66.field1074[var6++] = 0;
                                        continue;
                                    }
                                    if (var517 == 6504) {
                                        var6--;
                                        class14.field198 = class66.field1074[var6];
                                        class112.method829(class205.field3294, 16751);
                                        continue;
                                    }
                                    if (var517 == 6505) {
                                        class66.field1074[var6++] = class14.field198;
                                        continue;
                                    }
                                    if (var517 == 6506) {
                                        var6--;
                                        int var277 = class66.field1074[var6];
                                        class80 var278 = class105.method785(102, var277);
                                        if (var278 == null) {
                                            class66.field1074[var6++] = -1;
                                            class176.field2945[var7++] = "";
                                            class66.field1074[var6++] = 0;
                                            class176.field2945[var7++] = "";
                                            class66.field1074[var6++] = 0;
                                        } else {
                                            class66.field1074[var6++] = var278.field4601;
                                            class176.field2945[var7++] = var278.field1330;
                                            class43 var279 = var278.method645(arg2);
                                            class66.field1074[var6++] = var279.field788;
                                            class176.field2945[var7++] = var279.field789;
                                            class66.field1074[var6++] = var278.field4591;
                                        }
                                        continue;
                                    }
                                    if (var517 == 6507) {
                                        var6 -= 4;
                                        int var280 = class66.field1074[var6];
                                        boolean var281 = class66.field1074[var6 + 1] == 1;
                                        int var282 = class66.field1074[var6 + 2];
                                        boolean var283 = class66.field1074[var6 + 3] == 1;
                                        class23.method182(var281, var280, var282, (byte) 64, var283);
                                        continue;
                                    }
                                } else if (var517 < 6700) {
                                    if (var517 == 6600) {
                                        var6--;
                                        class256.field4075 = class66.field1074[var6] == 1;
                                        class112.method829(class205.field3294, 16751);
                                        continue;
                                    }
                                    if (var517 == 6601) {
                                        class66.field1074[var6++] = class256.field4075 ? 1 : 0;
                                        continue;
                                    }
                                }
                            } else if (var517 == 4500) {
                                var6 -= 2;
                                int var370 = class66.field1074[var6 + 1];
                                int var371 = class66.field1074[var6];
                                class70 var372 = class57.method455(var370, false);
                                if (var372.method543(0)) {
                                    class176.field2945[var7++] = class235.method1557(var371, (byte) -109).method1765((byte) -19, var372.field1179, var370);
                                } else {
                                    class66.field1074[var6++] = class235.method1557(var371, (byte) -109).method1764(var372.field1177, 29902, var370);
                                }
                                continue;
                            }
                        } else if (var517 == 4400) {
                            var6 -= 2;
                            int var373 = class66.field1074[var6];
                            int var374 = class66.field1074[var6 + 1];
                            class70 var375 = class57.method455(var374, !arg2);
                            if (var375.method543(0)) {
                                class176.field2945[var7++] = class46.method396(var373, (byte) 63).method1645(-76, var374, var375.field1179);
                            } else {
                                class66.field1074[var6++] = class46.method396(var373, (byte) 63).method1660(0, var374, var375.field1177);
                            }
                            continue;
                        }
                    } else if (var517 == 4300) {
                        var6 -= 2;
                        int var376 = class66.field1074[var6];
                        int var377 = class66.field1074[var6 + 1];
                        class70 var378 = class57.method455(var377, false);
                        if (var378.method543(0)) {
                            class176.field2945[var7++] = class128.method932(105, var376).method1192(var377, var378.field1179, (byte) 38);
                        } else {
                            class66.field1074[var6++] = class128.method932(119, var376).method1193(var378.field1177, -26774, var377);
                        }
                        continue;
                    }
                } else {
                    class114 var489;
                    if (var517 >= 2000) {
                        var6--;
                        var489 = class8.method43(class66.field1074[var6], (byte) 91);
                        var517 -= 1000;
                    } else {
                        var489 = var46 ? class247.field3886 : class174.field2926;
                    }
                    if (var517 == 1300) {
                        var6--;
                        int var490 = class66.field1074[var6] - 1;
                        if (var490 >= 0 && var490 <= 9) {
                            var7--;
                            var489.method842(class176.field2945[var7], var490, (byte) 102);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var517 == 1301) {
                        var6 -= 2;
                        int var491 = class66.field1074[var6 + 1];
                        int var492 = class66.field1074[var6];
                        var489.field1889 = class129.method939(var492, 36, var491);
                        continue;
                    }
                    if (var517 == 1302) {
                        var6--;
                        var489.field1771 = class66.field1074[var6] == 1;
                        continue;
                    }
                    if (var517 == 1303) {
                        var6--;
                        var489.field1784 = class66.field1074[var6];
                        continue;
                    }
                    if (var517 == 1304) {
                        var6--;
                        var489.field1893 = class66.field1074[var6];
                        continue;
                    }
                    if (var517 == 1305) {
                        var7--;
                        var489.field1897 = class176.field2945[var7];
                        continue;
                    }
                    if (var517 == 1306) {
                        var7--;
                        var489.field1826 = class176.field2945[var7];
                        continue;
                    }
                    if (var517 == 1307) {
                        var489.field1775 = null;
                        continue;
                    }
                    if (var517 == 1308) {
                        var6--;
                        var489.field1894 = class66.field1074[var6];
                        var6--;
                        var489.field1759 = class66.field1074[var6];
                        continue;
                    }
                    if (var517 == 1309) {
                        var6--;
                        int var493 = class66.field1074[var6];
                        var6--;
                        int var494 = class66.field1074[var6];
                        if (var494 >= 1 && var494 <= 10) {
                            var489.method839(arg2, var493, var494 - 1);
                        }
                        continue;
                    }
                    if (var517 == 1310) {
                        var7--;
                        var489.field1891 = class176.field2945[var7];
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var516) {
            if (var5.field3165 == null) {
                if (class197.field3225 != 0) {
                    class106.method787("Clientscript error - check log for details", "", 0, true);
                }
                class161.method1167(var516, -121, "CS2 - scr:" + var5.field2406 + " op:" + var11);
            } else {
                StringBuffer var513 = new StringBuffer(30);
                var513.append("%0a - in: ").append(var5.field3165);
                for (int var514 = class119.field2020 - 1; var514 >= 0; var514--) {
                    var513.append("%0a - via: ").append(class18.field258[var514].field624.field3165);
                }
                if (var11 == 40) {
                    int var515 = var9[var8];
                    var513.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var515));
                }
                if (class197.field3225 != 0) {
                    class106.method787("Clientscript error in: " + var5.field3165, "", 0, true);
                }
                class161.method1167(var516, -122, "CS2 - scr:" + var5.field2406 + " op:" + var11 + var513.toString());
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZC)C")
    public static final char method1588(boolean arg0, char arg1) {
        field3821++;
        if (arg0) {
            return '\u0017';
        } else if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method1428(Component arg0) throws Exception {
        field3814++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
    public final synchronized void method1589(boolean arg0) {
        field3807++;
        if (this.field3794) {
            return;
        }
        if (!arg0) {
            method1586(46, 76);
        }
        long var2 = class62.method472(46);
        try {
            if (var2 > this.field3818 + 500000L) {
                this.field3818 = var2 - 500000L;
            }
            while (this.field3818 + 5000L < var2) {
                this.method1599(false, 256);
                this.field3818 += (long) (256000 / class23.field359);
            }
        } catch (Exception var7) {
            this.field3818 = var2;
        }
        if (this.field3817 == null) {
            return;
        }
        try {
            if (this.field3830 != 0L) {
                if (this.field3830 > var2) {
                    return;
                }
                this.method1424(this.field3826);
                this.field3822 = true;
                this.field3830 = 0L;
            }
            int var4 = this.method1427();
            if (this.field3833 - var4 > this.field3823) {
                this.field3823 = this.field3833 - var4;
            }
            int var5 = this.field3831 + this.field3827;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field3826) {
                this.field3826 += 1024;
                var4 = 0;
                if (this.field3826 > 16384) {
                    this.field3826 = 16384;
                }
                this.method1426();
                this.method1424(this.field3826);
                if (this.field3826 < (var5 + 256)) {
                    var5 = this.field3826 - 256;
                    this.field3831 = var5 - this.field3827;
                }
                this.field3822 = true;
            }
            while (var4 < var5) {
                var4 += 256;
                this.method1598(this.field3817, 256);
                this.method1425();
            }
            if (this.field3825 < var2) {
                if (this.field3822) {
                    this.field3822 = false;
                } else if (this.field3823 == 0 && this.field3824 == 0) {
                    this.method1426();
                    this.field3830 = var2 + 2000L;
                    return;
                } else {
                    this.field3831 = Math.min(this.field3824, this.field3823);
                    this.field3824 = this.field3823;
                }
                this.field3823 = 0;
                this.field3825 = var2 + 2000L;
            }
            this.field3833 = var4;
        } catch (Exception var6) {
            this.method1426();
            this.field3830 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILjava/lang/String;Lkj;)Ljava/lang/String;")
    public static final String method1590(int arg0, String arg1, class114 arg2) {
        if (arg1.indexOf("%") != -1) {
            label56: while (true) {
                int var3 = arg1.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label56;
                                                        }
                                                        String var9 = "";
                                                        if (class185.field3040 != null) {
                                                            if (class185.field3040.field1936 == null) {
                                                                var9 = class233.method1547(class185.field3040.field1934, (byte) 63);
                                                            } else {
                                                                var9 = (String) class185.field3040.field1936;
                                                            }
                                                        }
                                                        arg1 = arg1.substring(0, var8) + var9 + arg1.substring(var8 + 4);
                                                    }
                                                }
                                                arg1 = arg1.substring(0, var7) + class136.method991(7016, class77.method614(4, 73, arg2)) + arg1.substring(var7 + 2);
                                            }
                                        }
                                        arg1 = arg1.substring(0, var6) + class136.method991(7016, class77.method614(3, 116, arg2)) + arg1.substring(var6 + 2);
                                    }
                                }
                                arg1 = arg1.substring(0, var5) + class136.method991(7016, class77.method614(2, arg0 + 57, arg2)) + arg1.substring(var5 + 2);
                            }
                        }
                        arg1 = arg1.substring(0, var4) + class136.method991(7016, class77.method614(1, 69, arg2)) + arg1.substring(var4 + 2);
                    }
                }
                arg1 = arg1.substring(0, var3) + class136.method991(arg0 + 7015, class77.method614(0, 123, arg2)) + arg1.substring(var3 + 2);
            }
        }
        field3820++;
        if (arg0 != 1) {
            method1588(true, '\u0015');
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()V")
    public void method1425() throws Exception {
        field3808++;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "()I")
    public int method1427() throws Exception {
        field3799++;
        return this.field3826;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public static final void method1591(byte arg0, String arg1, int arg2) {
        field3809++;
        class23 var3 = class91.method694(arg2, 2, 122);
        var3.method190(0);
        if (arg0 >= -22) {
            method1586(76, -80);
        }
        var3.field354 = arg1;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "()V")
    public void method1429() throws Exception {
        field3802++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public final synchronized void method1592(byte arg0) {
        field3798++;
        if (class94.field1463 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class94.field1463.field891[var3] == this) {
                    class94.field1463.field891[var3] = null;
                }
                if (class94.field1463.field891[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class94.field1463.field899 = true;
                while (class94.field1463.field892) {
                    class234.method1550(arg0 - 28771, 50L);
                }
                class94.field1463 = null;
            }
        }
        if (arg0 == -2) {
            this.method1426();
            this.field3794 = true;
            this.field3817 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lmi;B)V")
    public final synchronized void method1593(class88 arg0, byte arg1) {
        if (arg1 == 101) {
            this.field3819 = arg0;
            field3815++;
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "()V")
    public void method1426() {
        field3796++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static final void method1594(int arg0) {
        field3812++;
        if (arg0 != 1) {
            return;
        }
        if (!class9.method50(false) && class92.field1448 != class282.field4485) {
            class206.method1387((byte) 106, class33.field551, class48.field878.field2844[0], false, false, class92.field1448, class111.field1716, class48.field878.field2813[0]);
        } else if (class92.field1448 != class137.field2304 && class100.method751(arg0 ^ 0x25, class92.field1448)) {
            class137.field2304 = class92.field1448;
            class114.method836((byte) -94);
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
    public final synchronized void method1595(byte arg0) {
        field3803++;
        this.field3822 = true;
        try {
            this.method1429();
        } catch (Exception var2) {
            this.method1426();
            this.field3830 = class62.method472(105) + 2000L;
        }
        if (arg0 < 92) {
            method1587((class196) null, -97, true);
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public static void method1596(int arg0) {
        if (arg0 != -5302) {
            method1590(-71, (String) null, (class114) null);
        }
        field3793 = null;
        field3801 = null;
        field3795 = null;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    public void method1424(int arg0) throws Exception {
        field3806++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lmi;BI)V")
    private final void method1597(class88 arg0, byte arg1, int arg2) {
        int var4 = arg2 >> 5;
        field3797++;
        class88 var5 = this.field3832[var4];
        if (var5 == null) {
            this.field3828[var4] = arg0;
        } else {
            var5.field1415 = arg0;
        }
        this.field3832[var4] = arg0;
        arg0.field1412 = arg2;
        int var6 = 5 / ((49 - arg1) / 50);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([II)V")
    private final void method1598(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class116.field1955) {
            var3 = arg1 << 1;
        }
        class68.method535(arg0, 0, var3);
        this.field3829 -= arg1;
        if (this.field3819 != null && this.field3829 <= 0) {
            this.field3829 += class23.field359 >> 4;
            class3.method17(this.field3819, -128);
            this.method1597(this.field3819, (byte) -99, this.field3819.method687());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class88 var10 = null;
                        class88 var11 = this.field3828[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class162 var12 = var11.field1413;
                                if (var12 == null || var12.field2641 <= var8) {
                                    var11.field1414 = true;
                                    int var13 = var11.method208();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2641 += var13;
                                    }
                                    if (var4 >= this.field3804) {
                                        break label107;
                                    }
                                    class88 var14 = var11.method193();
                                    if (var14 != null) {
                                        int var15 = var11.field1412;
                                        while (var14 != null) {
                                            this.method1597(var14, (byte) 122, var15 * var14.method687() >> 8);
                                            var14 = var11.method215();
                                        }
                                    }
                                    class88 var16 = var11.field1415;
                                    var11.field1415 = null;
                                    if (var10 == null) {
                                        this.field3828[var7] = var16;
                                    } else {
                                        var10.field1415 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3832[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1415;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class88 var18 = this.field3828[var17];
                this.field3828[var17] = this.field3832[var17] = null;
                while (var18 != null) {
                    class88 var19 = var18.field1415;
                    var18.field1415 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3829 < 0) {
            this.field3829 = 0;
        }
        if (this.field3819 != null) {
            this.field3819.method205(arg0, 0, arg1);
        }
        this.field3818 = class62.method472(32);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)V")
    private final void method1599(boolean arg0, int arg1) {
        this.field3829 -= arg1;
        if (this.field3829 < 0) {
            this.field3829 = 0;
        }
        if (this.field3819 != null) {
            this.field3819.method211(arg1);
        }
        if (!arg0) {
            field3813++;
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
    public final void method1600(int arg0) {
        if (arg0 != -3624) {
            this.field3823 = -4;
        }
        this.field3822 = true;
        field3805++;
    }
}
