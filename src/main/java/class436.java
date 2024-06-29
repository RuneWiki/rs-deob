import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class436 extends class338 {

    @OriginalMember(owner = "client!km", name = "F", descriptor = "I")
    public int field6387 = 0;

    @OriginalMember(owner = "client!km", name = "H", descriptor = "I")
    public int field6388 = -1;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "Z")
    public static boolean field6375 = false;

    @OriginalMember(owner = "client!km", name = "A", descriptor = "[[I")
    public static int[][] field6382 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!km", name = "s", descriptor = "[J")
    public static long[] field6374 = new long[32];

    @OriginalMember(owner = "client!km", name = "I", descriptor = "I")
    public static int field6389 = 64;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public int field6368;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public int field6370;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    public int field6371;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "I")
    public int field6373;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    public int field6378;

    @OriginalMember(owner = "client!km", name = "x", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!km", name = "y", descriptor = "I")
    public int field6380;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!km", name = "B", descriptor = "I")
    public int field6383;

    @OriginalMember(owner = "client!km", name = "C", descriptor = "I")
    public int field6384;

    @OriginalMember(owner = "client!km", name = "D", descriptor = "I")
    public int field6385;

    @OriginalMember(owner = "client!km", name = "E", descriptor = "I")
    public int field6386;

    @OriginalMember(owner = "client!km", name = "J", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 - arg0 >= class322.field4306 && class310.field4183 >= (arg3 + arg0) && class335.field4462 <= (arg6 - arg0) && class6.field42 >= arg0 + arg6) {
            class328.method1882(arg5, arg1, arg3, arg4, arg0, arg6, arg2 ^ 0xFFFFFFC3);
        } else {
            class272.method1506(arg0, arg2 + 1, arg3, arg1, arg6, arg4, arg5);
        }
        if (arg2 != 0) {
            method2699((byte) 100);
        }
        field6372++;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V")
    public static final void method2696(boolean arg0) {
        field6377++;
        if (arg0) {
            return;
        }
        try {
            if (class252.field3445 == 1) {
                int var1 = class314.field4205.method2346((byte) -125);
                if (var1 > 0 && class314.field4205.method2357(111)) {
                    int var2 = var1 - class412.field5953;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class314.field4205.method2348(var2, (byte) 93);
                } else {
                    class314.field4205.method2344(0);
                    class314.field4205.method2324((byte) -78);
                    if (class266.field3616 == null) {
                        class252.field3445 = 0;
                    } else {
                        class252.field3445 = 2;
                    }
                    class132.field1705 = null;
                    class182.field2291 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class314.field4205.method2344(0);
            class132.field1705 = null;
            class266.field3616 = null;
            class252.field3445 = 0;
            class182.field2291 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
    public static final void method2697(byte arg0) {
        class14.field134.method829(false);
        field6369++;
        for (class405 var1 = (class405) class342.field4577.method814((byte) 90); var1 != null; var1 = (class405) class342.field4577.method827(arg0 - 20)) {
            if (var1.field5892 < 1000) {
                var1.method1967(-1);
                class14.field134.method825(arg0 + 3, var1);
            }
        }
        class14.field134.method826(class342.field4577, -14);
        if (arg0 != -106) {
            method2698(-128, '\u001d');
        }
        if (class123.field1558 != null || class106.field1313 != null || class40.field415 > 0) {
            return;
        }
        int var2 = class128.field1657;
        if (!class452.field6586) {
            if (var2 == 1 && class244.field3323 > 0) {
                int var3 = ((class405) class342.field4577.field1942.field4506).field5892;
                if (var3 == 41 || var3 == 26 || var3 == 35 || var3 == 43 || var3 == 31 || var3 == 15 || var3 == 32 || var3 == 5 || var3 == 13 || var3 == 1 || var3 == 16 || var3 == 1001) {
                    class405 var4 = (class405) class342.field4577.field1942.field4506;
                    class194 var5 = class57.method301(var4.field5894, (byte) 126);
                    class219 var6 = client.method1410(var5);
                    if (var6.method1182((byte) -124)) {
                        class374.field5262 = false;
                        class398.field5743 = 0;
                        if (class123.field1558 != null) {
                            class204.method1107(class123.field1558, (byte) -123);
                        }
                        class123.field1558 = class57.method301(var4.field5894, (byte) 93);
                        class200.field2689 = class96.field1147;
                        class87.field985 = class341.field4568;
                        class192.field2421 = var4.field5897;
                        class204.method1107(class123.field1558, (byte) -97);
                        return;
                    }
                }
            }
            if (var2 <= 0 && class105.field1291 > 0) {
                var2 = class105.field1291;
            }
            class105.field1291 = 0;
            if (var2 == 1 && (class56.field566 == 1 && class244.field3323 > 2 || class279.method1547((byte) 10))) {
                var2 = 2;
            }
            if (var2 == 2 && class244.field3323 > 0) {
                class75.method423(2);
            }
            if (var2 == 1 && class244.field3323 > 0) {
                class319.method1842(arg0 + 210);
                return;
            }
            return;
        }
        if (var2 != 1) {
            int var7 = class337.field4493;
            int var8 = class306.field4146;
            if (class344.field4618 - 10 > var7 || var7 > class344.field4618 + class344.field4620 + 10 || var8 < class18.field179 - 10 || class18.field179 + class229.field3159 + 10 < var8) {
                class452.field6586 = false;
                class136.method735(false, class229.field3159, class344.field4620, class344.field4618, class18.field179);
            }
        }
        if (var2 != 1) {
            return;
        }
        int var9 = class344.field4618;
        int var10 = class18.field179;
        int var11 = class344.field4620;
        int var12 = class96.field1147;
        int var13 = class341.field4568;
        int var14 = -1;
        for (int var15 = 0; var15 < class244.field3323; var15++) {
            if (class338.field4511) {
                int var19 = (class244.field3323 - var15 - 1) * 16 + var10 + 33;
                if (var9 < var12 && var9 + var11 > var12 && var13 > var19 - 13 && var13 < var19 + 3) {
                    var14 = var15;
                }
            } else {
                int var20 = (class244.field3323 - var15 - 1) * 16 + var10 + 31;
                if (var12 > var9 && var9 + var11 > var12 && var13 > (var20 - 13) && var13 < (var20 + 3)) {
                    var14 = var15;
                }
            }
        }
        if (var14 != -1) {
            int var16 = 0;
            class159 var17 = new class159(class342.field4577);
            for (class405 var18 = (class405) var17.method861(42); var18 != null; var18 = (class405) var17.method862((byte) 113)) {
                if (var14 == var16) {
                    class393.method2443(true, var18);
                }
                var16++;
            }
        }
        class452.field6586 = false;
        class136.method735(false, class229.field3159, class344.field4620, class344.field4618, class18.field179);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IC)Z")
    public static final boolean method2698(int arg0, char arg1) {
        field6379++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class97.method532(-19611, arg1)) {
            return true;
        } else {
            char[] var2 = class233.field3215;
            if (arg0 <= 23) {
                method2695(-104, 20, 111, -118, -71, 48, -46);
            }
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class208.field2830;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(B)V")
    public static void method2699(byte arg0) {
        field6382 = null;
        int var1 = 64 / ((37 - arg0) / 58);
        field6374 = null;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(Z)V")
    public static final void method2700(boolean arg0) {
        class129.field1660 = null;
        class165.field2103 = arg0;
        class317.field4226 = null;
        field6390++;
        class106.field1310 = null;
        class327.field4345 = null;
        class317.field4225 = null;
        class84.method458((byte) -104);
    }
}
