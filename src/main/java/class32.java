import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 {

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field527 = 0;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field528 = 0;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Z")
    public static boolean field533 = true;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Lli;")
    public static class185 field525 = null;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Lli;")
    private static class185 field535 = class245.method1649("Use", 125);

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Lli;")
    public static class185 field523 = field535;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field531 = 0;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "[I")
    public static int[] field534;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "[Lli;")
    public static class185[] field524;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIZII)V")
    public static final void method198(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg3 != 1) {
            method198(true, 22, false, -14, 31);
        }
        class43.method264(class121.field2210.length - 1, true, 0, arg4, arg1, arg2, arg0);
        field522++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method199(byte arg0) {
        field535 = null;
        field534 = null;
        field523 = null;
        field524 = null;
        int var1 = 69 % ((arg0 - 50) / 56);
        field525 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([Lp;BI)V")
    public static final void method200(class82[] arg0, byte arg1, int arg2) {
        int var3 = 0;
        int var4 = -7 / ((arg1 + 14) / 49);
        while (arg0.length > var3) {
            class82 var5 = arg0[var3];
            if (var5 != null) {
                if (var5.field1612 == 0) {
                    if (var5.field1536 != null) {
                        method200(var5.field1536, (byte) -95, arg2);
                    }
                    class271 var6 = (class271) class87.field1715.method195(114, (long) var5.field1579);
                    if (var6 != null) {
                        class151.method1071(arg2, true, var6.field4811);
                    }
                }
                if (arg2 == 0 && var5.field1596 != null) {
                    class121 var7 = new class121();
                    var7.field2198 = var5.field1596;
                    var7.field2196 = var5;
                    class274.method1877(var7, (byte) -77);
                }
                if (arg2 == 1 && var5.field1575 != null) {
                    label60: {
                        if (var5.field1637 >= 0) {
                            class82 var8 = class116.method805(1, var5.field1579);
                            if (var8 == null || var8.field1536 == null || var5.field1637 >= var8.field1536.length || var8.field1536[var5.field1637] != var5) {
                                break label60;
                            }
                        }
                        class121 var9 = new class121();
                        var9.field2198 = var5.field1575;
                        var9.field2196 = var5;
                        class274.method1877(var9, (byte) -77);
                    }
                }
            }
            var3++;
        }
        field532++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)J")
    public static final long method201(int arg0, int arg1, int arg2) {
        class198 var3 = class153.field2896[arg0][arg1][arg2];
        return var3 == null || var3.field3631 == null ? 0L : var3.field3631.field4466;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Li;BLi;)V")
    public static final void method202(class181 arg0, byte arg1, class181 arg2) {
        field530++;
        if (arg2.field3322 != null) {
            arg2.method1276((byte) 82);
        }
        arg2.field3320 = arg0.field3320;
        arg2.field3322 = arg0;
        arg2.field3322.field3320 = arg2;
        if (arg1 != -14) {
            method199((byte) 126);
        }
        arg2.field3320.field3322 = arg2;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lli;BZ)V")
    public static final void method203(class185 arg0, byte arg1, boolean arg2) {
        class185 var3 = arg0.method1325(40);
        field529++;
        int var4 = 0;
        short[] var5 = new short[16];
        int var6 = arg2 ? 32768 : 0;
        int var7 = (arg2 ? class66.field1155 : class6.field133) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class106 var12 = class90.method593((byte) -85, var8);
            if (var12.field1907 && var12.method744(true).method1325(40).method1321((byte) 126, var3) != -1) {
                if (var4 >= 50) {
                    class60.field1077 = null;
                    class182.field3347 = -1;
                    return;
                }
                if (var4 >= var5.length) {
                    short[] var13 = new short[var5.length * 2];
                    for (int var14 = 0; var14 < var4; var14++) {
                        var13[var14] = var5[var14];
                    }
                    var5 = var13;
                }
                var5[var4++] = (short) var8;
            }
        }
        class203.field3716 = 0;
        class182.field3347 = var4;
        class185[] var9 = new class185[class182.field3347];
        int var10 = 21 % ((4 - arg1) / 47);
        class60.field1077 = var5;
        for (int var11 = 0; var11 < class182.field3347; var11++) {
            var9[var11] = class90.method593((byte) -109, var5[var11]).method744(true);
        }
        class70.method459(-1, var9, class60.field1077);
    }
}
