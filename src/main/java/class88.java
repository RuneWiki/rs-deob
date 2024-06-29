import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class88 {

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field2031 = 0;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Z")
    public static boolean field2034 = true;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "Lec;")
    private static class32 field2032 = class73.method594("Error loading your profile)3", true);

    @OriginalMember(owner = "client!me", name = "p", descriptor = "Lec;")
    public static class32 field2045 = field2032;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Lwd;")
    public static class157 field2040 = new class157();

    @OriginalMember(owner = "client!me", name = "t", descriptor = "[Lga;")
    public static class44[] field2049 = new class44[256];

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public int field2030;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public int field2035;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public int field2036;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public int field2041;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "I")
    public int field2048;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Ldd;")
    public class26 field2039;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Ldd;")
    public class26 field2042;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "Ldd;")
    public class26 field2044;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IILga;Ltb;)V")
    public static final void method671(int arg0, int arg1, class44 arg2, class134 arg3) {
        field2038++;
        byte[] var4 = null;
        class157 var5 = class2.field18;
        synchronized (class2.field18) {
            for (class142 var6 = (class142) class2.field18.method1213(109); var6 != null; var6 = (class142) class2.field18.method1211(-3)) {
                if ((long) arg1 == var6.field3326 && var6.field3247 == arg3 && var6.field3245 == 0) {
                    var4 = var6.field3251;
                    break;
                }
            }
        }
        if (var4 != null) {
            arg2.method341(false, true, var4, arg1, arg3);
            return;
        }
        if (arg0 < 107) {
            method673(53, -99, -98, 52);
        }
        byte[] var7 = arg3.method1026(0, arg1);
        arg2.method341(false, true, var7, arg1, arg3);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static void method672(int arg0) {
        if (arg0 != 1) {
            field2032 = null;
        }
        field2049 = null;
        field2032 = null;
        field2045 = null;
        field2040 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)V")
    public static final void method673(int arg0, int arg1, int arg2, int arg3) {
        field2033++;
        class125.method982(-7);
        class141.method1068(arg1, arg0, class20.field369.field1168 + arg1, arg0 - -class20.field369.field1172);
        if (class4.field72 == 2 || class4.field72 == 5) {
            class141.method1071(arg1 + 25, arg0 + 5, 0, class98.field2275, class2.field27);
        } else {
            int var4 = class27.field493 + class133.field3056 & 0x7FF;
            int var5 = class20.field373.field2749 / 32 + 48;
            int var6 = 464 - class20.field373.field2700 / 32;
            class142.field3254.method367(arg1 + 25, arg0 + 5, 146, 151, var5, var6, var4, class29.field527 + 256, class98.field2275, class2.field27);
            for (int var7 = 0; var7 < class82.field1909; var7++) {
                int var37 = class119.field2852[var7] * 4 + 2 - class20.field373.field2749 / 32;
                int var38 = class83.field1958[var7] * 4 + 2 - class20.field373.field2700 / 32;
                class136.method1034(-2011, arg1, arg0, var38, class158.field3626[var7], var37);
            }
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var33 = 0; var33 < 104; var33++) {
                    class157 var34 = class23.field397[class43.field990][var8][var33];
                    if (var34 != null) {
                        int var35 = var33 * 4 + 2 - class20.field373.field2700 / 32;
                        int var36 = var8 * 4 + 2 - class20.field373.field2749 / 32;
                        class136.method1034(-2011, arg1, arg0, var35, class28.field515[0], var36);
                    }
                }
            }
            for (int var9 = 0; var9 < class102.field2399; var9++) {
                class111 var29 = class14.field230[class15.field313[var9]];
                if (var29 != null && var29.method579(0)) {
                    class97 var30 = var29.field2597;
                    if (var30 != null && var30.field2216 != null) {
                        var30 = var30.method759(-52);
                    }
                    if (var30 != null && var30.field2223 && var30.field2190) {
                        int var31 = var29.field2700 / 32 - class20.field373.field2700 / 32;
                        int var32 = var29.field2749 / 32 - class20.field373.field2749 / 32;
                        class136.method1034(-2011, arg1, arg0, var31, class28.field515[1], var32);
                    }
                }
            }
            for (int var10 = 0; var10 < class62.field1405; var10++) {
                class70 var21 = class52.field1176[class137.field3189[var10]];
                if (var21 != null && var21.method579(0)) {
                    int var22 = var21.field2749 / 32 - class20.field373.field2749 / 32;
                    int var23 = var21.field2700 / 32 - class20.field373.field2700 / 32;
                    long var24 = var21.field1660.method259(0);
                    boolean var26 = false;
                    for (int var27 = 0; var27 < class2.field20; var27++) {
                        if (class33.field695[var27] == var24 && class91.field2096[var27] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (class20.field373.field1638 != 0 && var21.field1638 != 0 && class20.field373.field1638 == var21.field1638) {
                        var28 = true;
                    }
                    if (var26) {
                        class136.method1034(-2011, arg1, arg0, var23, class28.field515[3], var22);
                    } else if (var28) {
                        class136.method1034(-2011, arg1, arg0, var23, class28.field515[4], var22);
                    } else {
                        class136.method1034(-2011, arg1, arg0, var23, class28.field515[2], var22);
                    }
                }
            }
            if (class125.field2913 != 0 && class140.field3219 % 20 < 10) {
                if (class125.field2913 == 1 && class80.field1855 >= 0 && class80.field1855 < class14.field230.length) {
                    class111 var11 = class14.field230[class80.field1855];
                    if (var11 != null) {
                        int var12 = var11.field2749 / 32 - class20.field373.field2749 / 32;
                        int var13 = var11.field2700 / 32 - class20.field373.field2700 / 32;
                        class131.method1006(var12, arg0, arg1, var13, class97.field2235[1], true);
                    }
                }
                if (class125.field2913 == 2) {
                    int var14 = (class145.field3301 - class72.field1701) * 4 + 2 - class20.field373.field2749 / 32;
                    int var15 = (class103.field2405 - class118.field2838) * 4 + 2 - class20.field373.field2700 / 32;
                    class131.method1006(var14, arg0, arg1, var15, class97.field2235[1], true);
                }
                if (class125.field2913 == 10 && class79.field1831 >= 0 && class52.field1176.length > class79.field1831) {
                    class70 var16 = class52.field1176[class79.field1831];
                    if (var16 != null) {
                        int var17 = var16.field2749 / 32 - class20.field373.field2749 / 32;
                        int var18 = var16.field2700 / 32 - class20.field373.field2700 / 32;
                        class131.method1006(var17, arg0, arg1, var18, class97.field2235[1], true);
                    }
                }
            }
            if (class45.field1067 != 0) {
                int var19 = class45.field1067 * 4 + 2 - class20.field373.field2749 / 32;
                int var20 = class31.field615 * 4 + 2 - class20.field373.field2700 / 32;
                class136.method1034(-2011, arg1, arg0, var20, class97.field2235[0], var19);
            }
            class141.method1055(arg1 + 93 + 4, arg0 - -82 + -4, 3, 3, 16777215);
        }
        if (class4.field72 < 3) {
            class3.field46.method367(arg1, arg0, 33, 33, 25, 25, class133.field3056, 256, class36.field855, class132.field3036);
        } else {
            class141.method1071(arg1, arg0, 0, class36.field855, class132.field3036);
        }
        if (class57.field1319[arg2]) {
            class20.field369.method400(arg1, arg0);
        }
        if (arg3 > -62) {
            method671(-128, 100, null, null);
        }
        class81.field1864[arg2] = true;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IBI)V")
    public static final void method674(int arg0, byte arg1, int arg2) {
        field2037++;
        int[] var3 = new int[4];
        int[] var4 = new int[4];
        var4[0] = arg2;
        int var5 = 1;
        var3[0] = arg0;
        int var6 = 0;
        if (arg1 <= 10) {
            method674(78, (byte) -81, -80);
        }
        while (var6 < 4) {
            if (class154.field3512[var6] != arg2) {
                var4[var5] = class154.field3512[var6];
                var3[var5] = class98.field2266[var6];
                var5++;
            }
            var6++;
        }
        class154.field3512 = var4;
        class98.field2266 = var3;
        class50.method395(0, class97.field2237.length - 1, class98.field2266, 104, class154.field3512, class97.field2237);
    }
}
