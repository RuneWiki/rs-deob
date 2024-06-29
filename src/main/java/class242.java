import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class242 extends class46 {

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "Ljava/lang/String;")
    public String field3867;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "[I")
    public static int[] field3869 = new int[99];

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3866 = "Loaded input handler";

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "[I")
    public static int[] field3872 = new int[128];

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "Z")
    public static boolean field3876;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "[I")
    public static int[] field3878;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "F")
    public static float field3875;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V", line = 5)
    public static final void method1676(int arg0) {
        int var1 = class308.field4792;
        int var2 = class40.field604;
        field3873++;
        if (arg0 < 114) {
            method1678(82);
        }
        int var3 = class112.field1737 - 3;
        byte var4 = 20;
        int var5 = class131.field2058;
        if (class101.field1582 == null || class88.field1420 == null) {
            if (class186.field2788.method956(class232.field3675, true) && class186.field2788.method956(class131.field2050, true)) {
                class101.field1582 = class61.method480(0, class186.field2788, -10353, class232.field3675);
                class88.field1420 = class61.method480(0, class186.field2788, -10353, class131.field2050);
                if (class94.field1516) {
                    if (class101.field1582 instanceof class262) {
                        class101.field1582 = new class74((class249) class101.field1582);
                    } else {
                        class101.field1582 = new class86((class249) class101.field1582);
                    }
                    if ((class88.field1420 instanceof class262)) {
                        class88.field1420 = new class74((class249) class88.field1420);
                    } else {
                        class88.field1420 = new class86((class249) class88.field1420);
                    }
                }
            } else if (class94.field1516) {
                class167.method1193(var1, var2, var5, var4, class171.field2586, 256 - class325.field5057);
            } else {
                class109.method799(var1, var2, var5, var4, class171.field2586, 256 - class325.field5057);
            }
        }
        if (class101.field1582 != null && class88.field1420 != null) {
            int var6 = (var5 - (class88.field1420.field4202 * 2)) / class101.field1582.field4202;
            for (int var7 = 0; var7 < var6; var7++) {
                class101.field1582.method617(class101.field1582.field4202 * var7 + (var1 + class88.field1420.field4202), var2);
            }
            class88.field1420.method617(var1, var2);
            class88.field1420.method616(var1 + var5 - class88.field1420.field4202, var2);
        }
        class344.field5343.method2245(class174.field2630, var1 + 3, var2 + 14, class120.field1832, -1);
        if (class94.field1516) {
            class167.method1193(var1, var2 + var4, var5, var3 - var4, class171.field2586, 256 - class325.field5057);
        } else {
            class109.method799(var1, var2 + var4, var5, var3 - var4, class171.field2586, 256 - class325.field5057);
        }
        int var8 = class119.field1815;
        int var9 = class253.field3984;
        for (int var10 = 0; var10 < class301.field4706; var10++) {
            int var11 = (class301.field4706 - (var10 + 1)) * 15 + var2 + var4 + 13;
            if (var8 > var1 && var1 + var5 > var8 && var11 - 13 < var9 && (var11 + 3) > var9) {
                if (class94.field1516) {
                    class167.method1193(var1, var11 - 12, var5, 15, class31.field453, 256 - class129.field2029);
                } else {
                    class109.method799(var1, var11 - 12, var5, 15, class31.field453, 256 - class129.field2029);
                }
            }
        }
        if ((class185.field2771 == null || class107.field1661 == null || class233.field3698 == null) && class186.field2788.method956(class240.field3841, true) && class186.field2788.method956(class291.field4528, true) && class186.field2788.method956(class314.field4867, true)) {
            class185.field2771 = class61.method480(0, class186.field2788, -10353, class240.field3841);
            class107.field1661 = class61.method480(0, class186.field2788, -10353, class291.field4528);
            class233.field3698 = class61.method480(0, class186.field2788, -10353, class314.field4867);
            if (class94.field1516) {
                if (class185.field2771 instanceof class262) {
                    class185.field2771 = new class74((class249) class185.field2771);
                } else {
                    class185.field2771 = new class86((class249) class185.field2771);
                }
                if (class107.field1661 instanceof class262) {
                    class107.field1661 = new class74((class249) class107.field1661);
                } else {
                    class107.field1661 = new class86((class249) class107.field1661);
                }
                if ((class233.field3698 instanceof class262)) {
                    class233.field3698 = new class74((class249) class233.field3698);
                } else {
                    class233.field3698 = new class86((class249) class233.field3698);
                }
            }
        }
        if (class185.field2771 != null && class107.field1661 != null && class233.field3698 != null) {
            int var12 = (var5 - class233.field3698.field4202 * 2) / class185.field2771.field4202;
            for (int var13 = 0; var13 < var12; var13++) {
                class185.field2771.method617(class185.field2771.field4202 * var13 + class233.field3698.field4202 + var1, var3 - class185.field2771.field4207 + var2);
            }
            int var14 = (var3 - class233.field3698.field4207 - var4) / class107.field1661.field4207;
            for (int var15 = 0; var15 < var14; var15++) {
                class107.field1661.method617(var1, var2 + var4 + (class107.field1661.field4207 * var15));
                class107.field1661.method616(var1 + var5 - class107.field1661.field4202, var2 - (-(class107.field1661.field4207 * var15) + -var4));
            }
            class233.field3698.method617(var1, var2 + var3 - class233.field3698.field4207);
            class233.field3698.method616(var1 + var5 - class233.field3698.field4202, -class233.field3698.field4207 + var2 + var3);
        }
        for (int var16 = 0; var16 < class301.field4706; var16++) {
            int var17 = (class301.field4706 - var16 - 1) * 15 + (var2 + var4 + 13);
            int var18 = class120.field1832;
            if (var1 < var8 && var8 < (var1 + var5) && var9 > (var17 - 13) && var17 + 3 > var9) {
                var18 = class110.field1714;
            }
            class344.field5343.method2245(class288.method1979(var16, -89), var1 + 3, var17, var18, 0);
        }
        class285.method1978(class112.field1737, class40.field604, 0, class308.field4792, class131.field2058);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([BI)Z", line = 186)
    public static final boolean method1677(byte[] arg0, int arg1) {
        field3871++;
        class166 var2 = new class166(arg0);
        int var3 = var2.method1178(0);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1178(0) == 1;
        if (var4) {
            client.method390(var2, -98);
        }
        if (arg1 == -3) {
            class107.method780(var2, 112);
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)J", line = 211)
    public static final long method1678(int arg0) {
        if (arg0 == 256) {
            field3870++;
            return class192.field2881.method639(40);
        } else {
            return -19L;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field3869[var1] = var0 / 4;
        }
        field3877 = 0;
        field3876 = true;
        field3878 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V", line = 236)
    public static void method1679(int arg0) {
        field3869 = null;
        field3878 = null;
        field3872 = null;
        field3866 = null;
        if (arg0 != -20959) {
            field3866 = (String) null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)V", line = 252)
    public static final void method1680(int arg0, int arg1) {
        class142 var2 = class256.field4013[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class142 var4 = class256.field4013[var3][arg0][arg1] = class256.field4013[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2201--;
                for (int var5 = 0; var5 < var4.field2204; var5++) {
                    class26 var6 = var4.field2197[var5];
                    if ((var6.field402 >> 29 & 0x3L) == 2L && var6.field411 == arg0 && var6.field410 == arg1) {
                        var6.field400--;
                    }
                }
            }
        }
        if (class256.field4013[0][arg0][arg1] == null) {
            class256.field4013[0][arg0][arg1] = new class142(0, arg0, arg1);
        }
        class256.field4013[0][arg0][arg1].field2203 = var2;
        class256.field4013[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V", line = 289)
    public class242() {
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILp;)V", line = 293)
    public static final void method1681(int arg0, class24 arg1) {
        if (arg1.field388 != null) {
            arg1.field388.field4000 = 0;
        }
        arg1.field390 = false;
        if (arg0 == 0) {
            field3868++;
            for (class24 var2 = arg1.method232(); var2 != null; var2 = arg1.method233()) {
                method1681(0, var2);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 316)
    public class242(String arg0, int arg1) {
        this.field3867 = arg0;
    }
}
