import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class198 {

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Lhi;")
    private static class82 field3383 = class95.method664((byte) -88, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Z")
    public static boolean field3384 = true;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Lhi;")
    private static class82 field3391 = class95.method664((byte) -70, "Attack");

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "[Lhi;")
    public static class82[] field3390 = new class82[200];

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "Lhi;")
    public static class82 field3386 = class95.method664((byte) -107, "Fps:");

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Lhi;")
    public static class82 field3388 = class95.method664((byte) -116, "Sprites geladen)3");

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Lhi;")
    private static class82 field3392 = class95.method664((byte) -121, "Connection lost)3");

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Lhi;")
    public static class82 field3387 = field3383;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "Lhi;")
    public static class82 field3396 = field3391;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Lhi;")
    public static class82 field3382 = field3392;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "[Z")
    public static boolean[] field3389 = new boolean[100];

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "[Lme;")
    public static class75[] field3385;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)V", line = 14)
    public static final void method1383(int arg0, byte arg1) {
        field3393++;
        class303 var2;
        if (class147.field2485 || class54.field870 == null) {
            var2 = new class303(512, 512);
        } else {
            var2 = (class303) class54.field870;
        }
        int[] var3 = var2.field5160;
        int var4 = var3.length;
        if (arg1 < 62) {
            method1385(true);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var7 = (103 - var6) * 512 * 4 + 24628;
            for (int var8 = 1; var8 < 103; var8++) {
                if ((class204.field3567[arg0][var8][var6] & 0x18) == 0) {
                    class140.method949(var3, var7, 512, arg0, var8, var6);
                }
                if (arg0 < 3 && (class204.field3567[arg0 + 1][var8][var6] & 0x8) != 0) {
                    class140.method949(var3, var7, 512, arg0 + 1, var8, var6);
                }
                var7 += 4;
            }
        }
        var2.method2102();
        int var9 = -(-((int) (Math.random() * 20.0D)) + (-(238 - (10 - ((int) (Math.random() * 20.0D))) << 8) - 238)) + ((int) (Math.random() * 20.0D) + -10 + 238 << 16) - 10;
        int var10 = (int) (Math.random() * 20.0D) + 228 << 16;
        for (int var11 = 1; var11 < 103; var11++) {
            for (int var12 = 1; var12 < 103; var12++) {
                if ((class204.field3567[arg0][var12][var11] & 0x18) == 0) {
                    class131.method907(arg0, var10, var11, var9, var12, 24624);
                }
                if (arg0 < 3 && (class204.field3567[arg0 + 1][var12][var11] & 0x8) != 0) {
                    class131.method907(arg0 + 1, var10, var11, var9, var12, 24624);
                }
            }
        }
        class236.field4102 = 0;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                long var15 = class262.method1870(class297.field5058, var13, var14);
                if (var15 != 0L) {
                    class157 var17 = class99.method682((int) (var15 >>> 32) & Integer.MAX_VALUE, (byte) -123);
                    int var18 = var17.field2689;
                    if (var17.field2688 != null) {
                        for (int var19 = 0; var19 < var17.field2688.length; var19++) {
                            if (var17.field2688[var19] != -1) {
                                class157 var20 = class99.method682(var17.field2688[var19], (byte) -81);
                                if (var20.field2689 >= 0) {
                                    var18 = var20.field2689;
                                    break;
                                }
                            }
                        }
                    }
                    if (var18 >= 0) {
                        int var21 = var13;
                        int var22 = var14;
                        if (var18 != 22 && var18 != 29 && var18 != 34 && var18 != 36 && var18 != 46 && var18 != 47 && var18 != 48) {
                            int[][] var23 = class180.field3071[class297.field5058].field3159;
                            for (int var24 = 0; var24 < 10; var24++) {
                                int var25 = (int) (Math.random() * 4.0D);
                                if (var25 == 0 && var21 > 0 && var21 > var13 - 3 && (var23[var21 - 1][var22] & 0x12C0108) == 0) {
                                    var21--;
                                }
                                if (var25 == 1 && var21 < 103 && var21 < (var13 + 3) && (var23[var21 + 1][var22] & 0x12C0180) == 0) {
                                    var21++;
                                }
                                if (var25 == 2 && var22 > 0 && (var14 - 3) < var22 && (var23[var21][var22 - 1] & 0x12C0102) == 0) {
                                    var22--;
                                }
                                if (var25 == 3 && var22 < 103 && var22 < var14 + 3 && (var23[var21][var22 + 1] & 0x12C0120) == 0) {
                                    var22++;
                                }
                            }
                        }
                        class231.field3981[class236.field4102] = var17.field2676;
                        class140.field2397[class236.field4102] = var21;
                        class62.field969[class236.field4102] = var22;
                        class236.field4102++;
                    }
                }
            }
        }
        if (class147.field2485) {
            for (int var26 = 0; var26 < var4; var26++) {
                if (var3[var26] == 0) {
                    var3[var26] = 1;
                }
            }
            class54.field870 = new class210(var2);
        } else {
            class54.field870 = var2;
        }
        if (class147.field2485) {
            class320.field5531 = null;
        } else {
            class321.field5534.method1954(21155);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lbc;IB)Lhi;", line = 228)
    public static final class82 method1384(class153 arg0, int arg1, byte arg2) {
        field3394++;
        try {
            class82 var3 = new class82();
            var3.field1468 = arg0.method1050(-32768);
            if (var3.field1468 > arg1) {
                var3.field1468 = arg1;
            }
            var3.field1419 = new byte[var3.field1468];
            arg0.field2611 += class315.field5424.method458((byte) 99, arg0.field2598, 0, arg0.field2611, var3.field1419, var3.field1468);
            return arg2 == -105 ? var3 : (class82) null;
        } catch (Exception var5) {
            return class106.field1880;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V", line = 276)
    public static void method1385(boolean arg0) {
        field3386 = null;
        field3389 = null;
        field3391 = null;
        field3390 = null;
        field3385 = null;
        field3387 = null;
        field3392 = null;
        if (!arg0) {
            field3382 = (class82) null;
        }
        field3396 = null;
        field3382 = null;
        field3388 = null;
        field3383 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 349)
    public static final void method1386(int arg0) {
        class171.method1211(0, arg0, false);
        field3395++;
    }
}
