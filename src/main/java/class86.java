import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class86 extends class97 {

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public int field2039;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "Lwd;")
    public static class150 field2028 = class2.method9(true, "Wordpack geladen)3");

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field2029 = 0;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
    public static int field2036 = 0;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "Lwd;")
    public static class150 field2035 = class2.method9(true, "au");

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public static volatile int field2037 = -1;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "Lwd;")
    private static class150 field2038 = class2.method9(true, "Loading fonts )2 ");

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "Lwd;")
    public static class150 field2031 = field2038;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "Lv;")
    public static class140 field2030;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V")
    public static final void method616(byte arg0) {
        if (arg0 != -105) {
            return;
        }
        field2034++;
        class41.method294(arg0 ^ 0xA46);
        class11.method72(-32);
        if (class42.field1105 == 2 || class42.field1105 == 5) {
            byte[] var41 = class106.field2403.field2649;
            int[] var42 = class120.field2771;
            int var43 = var41.length;
            for (int var44 = 0; var44 < var43; var44++) {
                if (var41[var44] == 0) {
                    var42[var44] = 0;
                }
            }
            if (class42.field1105 < 3) {
                class142.field3440.method409(0, 0, 33, 33, 25, 25, class147.field3568, 256, class37.field1026, class148.field3595);
            }
            class136.method1013(-51);
            return;
        }
        int var1 = class147.field3568 + class109.field2532 & 0x7FF;
        int var2 = 464 - class46.field1244.field2939 / 32;
        int var3 = class46.field1244.field3000 / 32 + 48;
        class101.field2300.method409(25, 5, 146, 151, var3, var2, var1, class131.field3094 + 256, class95.field2201, class2.field38);
        for (int var4 = 0; var4 < class2.field46; var4++) {
            int var39 = class15.field407[var4] * 4 + 2 - class46.field1244.field2939 / 32;
            int var40 = class17.field458[var4] * 4 + 2 - class46.field1244.field3000 / 32;
            class104.method720(class91.field2116[var4], var39, arg0 ^ 0xFFFFFFB6, var40);
        }
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var35 = 0; var35 < 104; var35++) {
                class103 var36 = class50.field1339[class17.field466][var5][var35];
                if (var36 != null) {
                    int var37 = var5 * 4 + 2 - class46.field1244.field3000 / 32;
                    int var38 = var35 * 4 + 2 - class46.field1244.field2939 / 32;
                    class104.method720(class103.field2338[0], var38, 54, var37);
                }
            }
        }
        for (int var6 = 0; var6 < class133.field3128; var6++) {
            class18 var31 = class37.field1013[class101.field2309[var6]];
            if (var31 != null && var31.method133((byte) -120)) {
                class118 var32 = var31.field478;
                if (var32 != null && var32.field2714 != null) {
                    var32 = var32.method858(69);
                }
                if (var32 != null && var32.field2737 && var32.field2694) {
                    int var33 = var31.field2939 / 32 - class46.field1244.field2939 / 32;
                    int var34 = var31.field3000 / 32 - class46.field1244.field3000 / 32;
                    class104.method720(class103.field2338[1], var33, arg0 ^ 0xFFFFFFC7, var34);
                }
            }
        }
        for (int var7 = 0; var7 < class109.field2533; var7++) {
            class111 var23 = class137.field3217[class61.field1574[var7]];
            if (var23 != null && var23.method133((byte) -114)) {
                int var24 = var23.field2939 / 32 - class46.field1244.field2939 / 32;
                int var25 = var23.field3000 / 32 - class46.field1244.field3000 / 32;
                boolean var26 = false;
                long var27 = var23.field2555.method1198(1);
                for (int var29 = 0; var29 < class50.field1347; var29++) {
                    if (class3.field61[var29] == var27 && class30.field893[var29] != 0) {
                        var26 = true;
                        break;
                    }
                }
                boolean var30 = false;
                if (class46.field1244.field2556 != 0 && var23.field2556 != 0 && class46.field1244.field2556 == var23.field2556) {
                    var30 = true;
                }
                if (var26) {
                    class104.method720(class103.field2338[3], var24, 63, var25);
                } else if (var30) {
                    class104.method720(class103.field2338[4], var24, 59, var25);
                } else {
                    class104.method720(class103.field2338[2], var24, 37, var25);
                }
            }
        }
        if (class101.field2292 != 0 && class11.field280 % 20 < 10) {
            if (class101.field2292 == 1 && class29.field879 >= 0 && class37.field1013.length > class29.field879) {
                class18 var8 = class37.field1013[class29.field879];
                if (var8 != null) {
                    int var9 = var8.field3000 / 32 - class46.field1244.field3000 / 32;
                    int var10 = var8.field2939 / 32 - class46.field1244.field2939 / 32;
                    class69.method528(class22.field639[1], var10, var9, (byte) 106);
                }
            }
            if (class101.field2292 == 2) {
                int var11 = (class131.field3093 - class77.field1905) * 4 + 2 - class46.field1244.field2939 / 32;
                int var12 = (class112.field2595 - class66.field1686) * 4 + 2 - class46.field1244.field3000 / 32;
                class69.method528(class22.field639[1], var11, var12, (byte) 106);
            }
            if (class101.field2292 == 10 && class98.field2249 >= 0 && class98.field2249 < class137.field3217.length) {
                class111 var13 = class137.field3217[class98.field2249];
                if (var13 != null) {
                    int var14 = var13.field2939 / 32 - class46.field1244.field2939 / 32;
                    int var15 = var13.field3000 / 32 - class46.field1244.field3000 / 32;
                    class69.method528(class22.field639[1], var14, var15, (byte) 106);
                }
            }
        }
        if (class142.field3442 != 0) {
            int var16 = class142.field3442 * 4 + 2 - class46.field1244.field3000 / 32;
            int var17 = class2.field47 * 4 + 2 - class46.field1244.field2939 / 32;
            class104.method720(class22.field639[0], var17, 95, var16);
        }
        class120.method872(97, 78, 3, 3, 16777215);
        if (class42.field1105 >= 3) {
            byte[] var18 = class106.field2403.field2649;
            int[] var19 = class120.field2771;
            for (int var20 = 0; var20 <= 33; var20++) {
                int var21 = class106.field2403.field2653 * var20;
                for (int var22 = 0; var22 <= 33; var22++) {
                    if (var18[var21 + var22] == 0) {
                        var19[var21 + var22] = 0;
                    }
                }
            }
        } else {
            class142.field3440.method409(0, 0, 33, 33, 25, 25, class147.field3568, 256, class37.field1026, class148.field3595);
        }
        class136.method1013(-38);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lwd;BLff;Lwd;)Lqd;")
    public static final class114 method617(class150 arg0, byte arg1, class42 arg2, class150 arg3) {
        field2027++;
        int var4 = arg2.method310((byte) 14, arg0);
        if (arg1 >= -78) {
            method618(-77, -48);
        }
        int var5 = arg2.method323((byte) 110, var4, arg3);
        return class38.method282(var4, arg2, -118, var5);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)I")
    public static final int method618(int arg0, int arg1) {
        field2032++;
        class10 var2 = class9.method53(arg1, 1024);
        int var3 = var2.field238;
        int var4 = var2.field240;
        if (arg0 != 10) {
            method619(-100);
        }
        int var5 = var2.field235;
        int var6 = class125.field2885[var5 - var4];
        return var6 & class16.field423[var3] >> var4;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class86() {
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I)V")
    public class86(int arg0) {
        this.field2039 = arg0;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static void method619(int arg0) {
        field2038 = null;
        field2031 = null;
        field2035 = null;
        field2030 = null;
        if (arg0 == 1) {
            field2028 = null;
        }
    }
}
