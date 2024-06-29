import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class134 extends class46 {

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public static int field2514 = -1;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "Lmb;")
    private static class132 field2519 = class166.method1092("Please subscribe)1 or use a different world)3", 125);

    @OriginalMember(owner = "client!md", name = "L", descriptor = "Lmb;")
    public static class132 field2525 = field2519;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "Lmb;")
    private static class132 field2529 = class166.method1092("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 115);

    @OriginalMember(owner = "client!md", name = "R", descriptor = "Lmb;")
    public static class132 field2531 = class166.method1092(" x ", 115);

    @OriginalMember(owner = "client!md", name = "B", descriptor = "Lmb;")
    public static class132 field2516 = field2529;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    public int field2522;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "I")
    public int field2523;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public int field2527;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    public int field2530;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "Lmb;")
    public class132 field2526;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "Lpb;")
    public static class165 field2524;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "Lu;")
    public static class214 field2518;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "[I")
    public int[] field2517;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "[I")
    public int[] field2521;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "[Llc;")
    public class122[] field2532;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "[Lmb;")
    public class132[] field2520;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public static void method915(boolean arg0) {
        field2519 = null;
        if (!arg0) {
            field2528 = -10;
        }
        field2518 = null;
        field2524 = null;
        field2529 = null;
        field2516 = null;
        field2531 = null;
        field2525 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V")
    public static final void method916(int arg0, int arg1, int arg2) {
        class169 var3 = class101.field1900[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field3098 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method917(int arg0, int arg1, byte[] arg2, int arg3) {
        field2515++;
        int var4 = -1;
        class112 var5 = new class112(arg2);
        boolean var6 = true;
        label70: while (true) {
            int var7 = var5.method756(-30606);
            if (var7 == 0) {
                int var18 = -70 % ((-arg1 - 6) / 40);
                return var6;
            }
            var4 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var12;
                class84 var16;
                do {
                    int var13;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method754(4695);
                                        if (var17 == 0) {
                                            continue label70;
                                        }
                                        var5.method716(-1308);
                                    }
                                    int var10 = var5.method754(4695);
                                    if (var10 == 0) {
                                        continue label70;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    var12 = var5.method716(-1308) >> 2;
                                    var13 = arg0 + var11;
                                    int var14 = var8 >> 6 & 0x3F;
                                    var15 = arg3 + var14;
                                } while (var15 <= 0);
                            } while (var13 <= 0);
                        } while (var15 >= 103);
                    } while (var13 >= 103);
                    var16 = class66.method414(0, var4);
                } while (var12 == 22 && class66.field1096 && var16.field1442 == 0 && var16.field1427 != 1 && !var16.field1417);
                if (!var16.method520(-2955)) {
                    var6 = false;
                    class37.field613++;
                }
                var9 = true;
            }
        }
    }
}
