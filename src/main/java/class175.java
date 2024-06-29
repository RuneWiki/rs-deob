import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class class175 {

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field2493 = 0;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field2486 = 0;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public int field2485;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public int field2488;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public int field2492;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public int field2497;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public int field2499;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public int field2501;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "Lve;")
    public static class233 field2496;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "[[[B")
    public static byte[][][] field2500;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IBLja;ZZILja;)I")
    public static final int method1145(int arg0, byte arg1, class55 arg2, boolean arg3, boolean arg4, int arg5, class55 arg6) {
        int var7 = class131.method899(arg0, arg6, arg3, arg2, 0);
        field2495++;
        if (var7 != 0) {
            return arg3 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = -102 / ((arg1 + 57) / 48);
            int var9 = class131.method899(arg5, arg6, arg4, arg2, 0);
            return arg4 ? -var9 : var9;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static void method1146(int arg0) {
        field2496 = null;
        field2500 = null;
        if (arg0 != -1) {
            method1145(59, (byte) -110, (class55) null, false, true, -105, (class55) null);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
    public abstract void method812(int arg0, int arg1);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static final void method1147(byte arg0) {
        if (arg0 > 25) {
            field2489++;
            if (class194.field2782 == 5) {
                class194.field2782 = 6;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLjava/lang/String;ZI)I")
    public static final int method1148(byte arg0, String arg1, boolean arg2, int arg3) {
        field2490++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        int var5 = arg1.length();
        boolean var6 = false;
        if (arg0 != 106) {
            method1148((byte) -82, (String) null, false, -124);
        }
        int var7 = 0;
        for (int var8 = 0; var8 < var5; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg3 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var7 + var11;
            if (var10 / arg3 != var7) {
                throw new NumberFormatException();
            }
            var7 = var10;
            var6 = true;
        }
        if (!var6) {
            throw new NumberFormatException();
        }
        return var7;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
    public abstract void method810(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIILhb;B)V")
    public static final void method1149(int arg0, int arg1, int arg2, int arg3, class30 arg4, byte arg5) {
        field2498++;
        if (arg4.field425 == -1 && arg4.field424 == null) {
            return;
        }
        int var6 = 0;
        if (arg3 > arg4.field418) {
            var6 += arg3 - arg4.field418;
        } else if (arg4.field419 > arg3) {
            var6 += arg4.field419 - arg3;
        }
        if (arg4.field430 < arg1) {
            var6 += arg1 - arg4.field430;
        } else if (arg4.field427 > arg1) {
            var6 += arg4.field427 - arg1;
        }
        if (arg4.field440 == 0 || arg4.field440 < var6 - 64 || class62.field1000 == 0 || arg4.field421 != arg0) {
            if (arg4.field438 != null) {
                class152.field2201.method279(arg4.field438);
                arg4.field438 = null;
            }
            if (arg4.field437 != null) {
                class152.field2201.method279(arg4.field437);
                arg4.field437 = null;
            }
            return;
        }
        var6 -= 64;
        if (arg5 < 9) {
            return;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg4.field440 - var6) * class62.field1000 / arg4.field440;
        if (arg4.field438 != null) {
            arg4.field438.method1696(var7);
        } else if (arg4.field425 >= 0) {
            class238 var8 = class238.method1560(class67.field1040, arg4.field425, 0);
            if (var8 != null) {
                class116 var9 = var8.method1561().method801(class101.field1510);
                class252 var10 = class252.method1697(var9, 100, var7);
                var10.method1673(-1);
                class152.field2201.method275(var10);
                arg4.field438 = var10;
            }
        }
        if (arg4.field437 != null) {
            arg4.field437.method1696(var7);
            if (arg4.field437.method1701(false)) {
                return;
            }
            arg4.field437 = null;
        } else if (arg4.field424 != null && (arg4.field422 -= arg2) <= 0) {
            int var11 = (int) (Math.random() * (double) arg4.field424.length);
            class238 var12 = class238.method1560(class67.field1040, arg4.field424[var11], 0);
            if (var12 != null) {
                class116 var13 = var12.method1561().method801(class101.field1510);
                class252 var14 = class252.method1697(var13, 100, var7);
                var14.method1673(0);
                class152.field2201.method275(var14);
                arg4.field422 = arg4.field436 + ((int) ((double) (arg4.field428 - arg4.field436) * Math.random()));
                arg4.field437 = var14;
                return;
            }
        }
    }
}
