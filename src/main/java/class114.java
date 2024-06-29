import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class114 extends class98 {

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "I")
    private int field1400 = 4096;

    @OriginalMember(owner = "client!ik", name = "V", descriptor = "I")
    private int field1407 = 0;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "[Lfp;")
    public static class176[] field1402 = new class176[128];

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "I")
    public static int field1398 = 0;

    @OriginalMember(owner = "client!ik", name = "X", descriptor = "Liq;")
    public static class362 field1409;

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ik", name = "S", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!ik", name = "T", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!ik", name = "U", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ik", name = "W", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!ik", name = "Y", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)V")
    public static void method708(int arg0) {
        field1402 = null;
        if (arg0 >= -35) {
            field1409 = null;
        }
        field1409 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIII)I")
    public static final int method709(int arg0, int arg1, int arg2, int arg3) {
        ++field1405;
        if (class161.field2122 == null) {
            return 0;
        } else {
            if (arg2 != 0) {
                method708(-20);
            }
            int var4 = arg1 >> 7;
            int var5 = arg3 >> 7;
            if (~var4 <= -1 && var5 >= 0 && ~var4 >= ~(class176.field2403 + -1) && ~var5 >= ~(class383.field5395 + -1)) {
                int var6 = arg0;
                if (~arg0 > -4 && ~(class399.field5699[1][var4][var5] & 2) != -1) {
                    var6 = arg0 + 1;
                }
                return class161.field2122[var6].method342(arg1, arg3);
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BII)I")
    public static final int method710(byte arg0, int arg1, int arg2) {
        if (arg0 != 64) {
            field1398 = -75;
        }
        ++field1408;
        return arg1 != 4 && arg1 != 5 ? 256 : class265.field3769[3 & arg2];
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILdg;I)V")
    public final void method81(int arg0, class236 arg1, int arg2) {
        ++field1410;
        if (arg2 == 0) {
            if (arg0 != 0) {
                if (arg0 == 1) {
                    this.field1400 = arg1.method1617((byte) 48);
                }
            } else {
                this.field1407 = arg1.method1617((byte) 48);
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)[I")
    public final int[] method83(int arg0, int arg1) {
        ++field1399;
        if (arg0 != 0) {
            this.field1407 = -113;
        }
        int[] var3 = super.field1177.method820(arg1, true);
        if (super.field1177.field1610) {
            int[] var4 = this.method539(0, (byte) -81, arg1);
            for (int var5 = 0; var5 < class268.field3811; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field1407 >= ~var6 && var6 <= this.field1400 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
    public class114() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIII)I")
    public static final int method711(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 65) {
            return -38;
        } else {
            if (arg3 > 243) {
                arg2 >>= 4;
            } else if (arg3 > 217) {
                arg2 >>= 3;
            } else if (~arg3 >= -193) {
                if (arg3 > 179) {
                    arg2 >>= 1;
                }
            } else {
                arg2 >>= 2;
            }
            ++field1404;
            return (arg3 >> 1) + (arg2 >> 5 << 7) + ((arg1 >> 2 & 63) << 10);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLon;Lon;)V")
    public static final void method712(byte arg0, class184 arg1, class184 arg2) {
        class62.field718.method2143(251, arg0 + 67);
        ++field1401;
        ++class204.field2930;
        class62.field718.method1603(arg2.field2584, 871);
        class62.field718.method1563(arg0 ^ 69, arg2.field2635);
        class62.field718.method1563(-2, arg1.field2635);
        class62.field718.method1588(128, arg1.field2668);
        class62.field718.method1564(arg1.field2584, arg0 + 187);
        class62.field718.method1563(arg0 ^ 69, arg2.field2668);
        if (arg0 != -69) {
            method708(84);
        }
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)V")
    public static final void method713(int arg0) {
        ++field1397;
        int var1 = 0;
        if (arg0 >= -29) {
            method709(-104, 8, -96, 110);
        }
        while (~class229.field3247 < ~var1) {
            int var10002 = class55.field657[var1]--;
            if (class55.field657[var1] >= -10) {
                label88: {
                    class172 var3 = class225.field3161[var1];
                    if (var3 == null) {
                        var3 = class172.method1146(class263.field3751, class418.field5981[var1], 0);
                        if (var3 == null) {
                            break label88;
                        }
                        class55.field657[var1] += var3.method1149();
                        class225.field3161[var1] = var3;
                    }
                    if (~class55.field657[var1] > -1) {
                        label91: {
                            int var10;
                            if (~class200.field2857[var1] != -1) {
                                int var4 = (class200.field2857[var1] & 255) * 128;
                                int var5 = (16747708 & class200.field2857[var1]) >> 16;
                                int var6 = var5 * 128 - class384.field5422.field3284 + 64;
                                if (~var6 > -1) {
                                    var6 = -var6;
                                }
                                int var7 = (class200.field2857[var1] & 65528) >> 8;
                                int var8 = var7 * 128 + -class384.field5422.field3269 + 64;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var8 + -128 + var6;
                                if (var9 > var4) {
                                    class55.field657[var1] = -100;
                                    break label91;
                                }
                                if (var9 < 0) {
                                    var9 = 0;
                                }
                                var10 = (var4 - var9) * class276.field3916[var1] * class355.field4999 / var4 >> 8;
                            } else {
                                var10 = class276.field3916[var1] * class401.field5730 >> 8;
                            }
                            if (~var10 < -1) {
                                class27 var11 = var3.method1148().method186(class233.field3279);
                                class173 var12 = class173.method1152(var11, 100, var10);
                                var12.method1173(class229.field3234[var1] - 1);
                                class399.field5694.method1139(var12);
                            }
                            class55.field657[var1] = -100;
                        }
                    }
                }
            } else {
                --class229.field3247;
                for (int var2 = var1; class229.field3247 > var2; ++var2) {
                    class418.field5981[var2] = class418.field5981[var2 + 1];
                    class225.field3161[var2] = class225.field3161[var2 + 1];
                    class229.field3234[var2] = class229.field3234[var2 - -1];
                    class55.field657[var2] = class55.field657[var2 - -1];
                    class200.field2857[var2] = class200.field2857[var2 + 1];
                    class276.field3916[var2] = class276.field3916[var2 + 1];
                }
                --var1;
            }
            ++var1;
        }
        if (class215.field3045 && !class246.method1673((byte) 61)) {
            if (~class334.field4729 != -1 && ~class328.field4657 != 0) {
                class254.method1715(0, class334.field4729, false, 0, class328.field4657, class393.field5553);
            }
            class215.field3045 = false;
        } else if (~class334.field4729 != -1 && ~class328.field4657 != 0 && !class246.method1673((byte) 61)) {
            ++class189.field2727;
            class62.field718.method2143(49, -2);
            class62.field718.method1603(class328.field4657, 871);
            class328.field4657 = -1;
        }
    }

    static {
        new class362("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field1409 = new class362("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");
    }
}
