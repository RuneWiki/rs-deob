import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class25 {

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "Lse;")
    public class166 field551 = new class166();

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field539 = 0;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field547 = 0;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Z")
    public static boolean field531 = false;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field549 = 0;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "[I")
    public static int[] field550 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Lsa;")
    public static class162 field545 = new class162(500);

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "Lcd;")
    private static class23 field556 = class54.method414("Click to switch", -1);

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "Lcd;")
    public static class23 field555 = class54.method414(" weitere Optionen", -1);

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "Lcd;")
    public static class23 field554 = field556;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "Lse;")
    private class166 field552;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "[I")
    public static int[] field537;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)V")
    public static final void method180(boolean arg0, int arg1) {
        field540++;
        for (int var2 = 0; var2 < class67.field1583; var2++) {
            class182 var3 = class91.field1944[class8.field161[var2]];
            int var4 = (class8.field161[var2] << 14) + 536870912;
            if (var3 != null && var3.method69(true) && var3.field3595.field66 == arg0 && var3.field3595.method27((byte) -4)) {
                int var5 = var3.field277 >> 7;
                int var6 = var3.field215 >> 7;
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    if (var3.field231 == 1 && (var3.field215 & 0x7F) == 64 && (var3.field277 & 0x7F) == 64) {
                        if (class10.field203[var6][var5] == class129.field2691) {
                            continue;
                        }
                        class10.field203[var6][var5] = class129.field2691;
                    }
                    if (!var3.field3595.field70) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class205.field4041.method811(class59.field1385, var3.field215, var3.field277, class203.method1330((byte) -88, (var3.field231 - 1) * 64 + var3.field277, (var3.field231 + -1) * 64 + var3.field215, class59.field1385), var3.field231 * 64 + 60 - 64, var3, var3.field264, var4, var3.field276);
                }
            }
        }
        if (arg1 < 55) {
            method180(true, -20);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lse;")
    public final class166 method181(int arg0) {
        field536++;
        class166 var2 = this.field552;
        if (arg0 >= -104) {
            this.method185((byte) -105);
        }
        if (this.field551 == var2) {
            this.field552 = null;
            return null;
        } else {
            this.field552 = var2.field3315;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILse;Lse;)V")
    public final void method182(int arg0, class166 arg1, class166 arg2) {
        field543++;
        if (arg2.field3315 != null) {
            arg2.method1018(15789);
        }
        arg2.field3310 = arg1;
        arg2.field3315 = arg1.field3315;
        arg2.field3315.field3310 = arg2;
        arg2.field3310.field3315 = arg2;
        if (arg0 != 1001) {
            method180(true, -45);
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static final void method183(int arg0) {
        if (arg0 != 21740) {
            method183(-29);
        }
        class5 var1 = (class5) class202.field3984.method188((byte) 54);
        field535++;
        while (var1 != null) {
            if (class59.field1385 != var1.field108 || var1.field105) {
                var1.method1018(arg0 - 5951);
            } else if (var1.field87 <= class15.field339) {
                var1.method28(-18109, class138.field2850);
                if (var1.field105) {
                    var1.method1018(arg0 - 5951);
                } else {
                    class205.field4041.method811(var1.field108, var1.field98, var1.field91, var1.field106, 60, var1, 0, -1, false);
                }
            }
            var1 = (class5) class202.field3984.method185((byte) -102);
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)Lse;")
    public final class166 method184(int arg0) {
        field530++;
        class166 var2 = this.field551.field3315;
        if (this.field551 == var2) {
            this.field552 = null;
            return null;
        } else if (arg0 == -1001) {
            this.field552 = var2.field3315;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Lse;")
    public final class166 method185(byte arg0) {
        if (arg0 != -102) {
            field545 = null;
        }
        class166 var2 = this.field552;
        field541++;
        if (this.field551 == var2) {
            this.field552 = null;
            return null;
        } else {
            this.field552 = var2.field3310;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lse;I)V")
    public final void method186(class166 arg0, int arg1) {
        field553++;
        if (arg1 != -26692) {
            this.method181(-43);
        }
        if (arg0.field3315 != null) {
            arg0.method1018(15789);
        }
        arg0.field3310 = this.field551;
        arg0.field3315 = this.field551.field3315;
        arg0.field3315.field3310 = arg0;
        arg0.field3310.field3315 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
    public static void method187(int arg0) {
        field556 = null;
        field537 = null;
        field550 = null;
        field545 = null;
        field555 = null;
        field554 = null;
        if (arg0 >= -39) {
            method193((byte) -39);
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)Lse;")
    public final class166 method188(byte arg0) {
        field546++;
        if (arg0 != 54) {
            return null;
        }
        class166 var2 = this.field551.field3310;
        if (this.field551 == var2) {
            this.field552 = null;
            return null;
        } else {
            this.field552 = var2.field3310;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)Lse;")
    public final class166 method189(byte arg0) {
        class166 var2 = this.field551.field3310;
        if (arg0 != -99) {
            return null;
        }
        field538++;
        if (this.field551 == var2) {
            return null;
        } else {
            var2.method1018(15789);
            return var2;
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(B)V")
    public final void method190(byte arg0) {
        if (arg0 <= 16) {
            this.field551 = null;
        }
        field544++;
        while (true) {
            class166 var2 = this.field551.field3310;
            if (this.field551 == var2) {
                return;
            }
            var2.method1018(15789);
        }
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
    public static final void method191(int arg0) {
        field533++;
        if (class191.field3795 != null || class17.field361 != null) {
            return;
        }
        if (arg0 != 64) {
            method187(77);
        }
        int var1 = class43.field911;
        if (class134.field2786) {
            if (var1 != 1) {
                int var2 = class78.field1724;
                int var3 = class64.field1518;
                if (class134.field2789 - 10 > var2 || class179.field3552 + class134.field2789 + 10 < var2 || class119.field2489 - 10 > var3 || var3 > class189.field3698 + class119.field2489 + 10) {
                    class134.field2786 = false;
                    class109.method709((byte) -30, class134.field2789, class119.field2489, class179.field3552, class189.field3698);
                }
            }
            if (var1 == 1) {
                int var4 = class134.field2789;
                int var5 = class119.field2489;
                int var6 = class179.field3552;
                int var7 = class65.field1535;
                int var8 = class43.field912;
                int var9 = -1;
                for (int var10 = 0; var10 < class49.field1171; var10++) {
                    int var11 = var5 + (class49.field1171 - var10 - 1) * 15 + 31;
                    if (var7 > var4 && var4 + var6 > var7 && var8 > var11 - 13 && var11 + 3 > var8) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class41.method334(arg0 ^ 0x1E, var9);
                }
                class134.field2786 = false;
                class109.method709((byte) -30, class134.field2789, class119.field2489, class179.field3552, class189.field3698);
                return;
            }
            return;
        }
        if (var1 == 1 && class49.field1171 > 0) {
            int var12 = class103.field2201[class49.field1171 - 1];
            if (var12 == 31 || var12 == 20 || var12 == 25 || var12 == 13 || var12 == 4 || var12 == 28 || var12 == 51 || var12 == 14 || var12 == 2 || var12 == 24 || var12 == 12 || var12 == 1001) {
                int var13 = class177.field3524[class49.field1171 - 1];
                int var14 = class202.field3986[class49.field1171 - 1];
                class47 var15 = class113.method725((byte) 102, var13);
                if (class57.method440(class141.method909(var15, -128), arg0 ^ 0xC5ED7DBC) || class129.method832(class141.method909(var15, 126), arg0 ^ 0x31BB949D)) {
                    class168.field3365 = 0;
                    class116.field2418 = false;
                    if (class191.field3795 != null) {
                        class3.method12(class191.field3795, false);
                    }
                    class191.field3795 = class113.method725((byte) 124, var13);
                    class13.field298 = class65.field1535;
                    class91.field1947 = class43.field912;
                    class20.field418 = var14;
                    class3.method12(class191.field3795, false);
                    return;
                }
            }
        }
        if (var1 == 1 && (class146.field2988 == 1 && class49.field1171 > 2 || class157.method966((byte) 57, class49.field1171 - 1))) {
            var1 = 2;
        }
        if (var1 == 1 && class49.field1171 > 0) {
            class41.method334(arg0 ^ 0xC, class49.field1171 - 1);
        }
        if (var1 != 2 || class49.field1171 <= 0) {
            return;
        }
        class8.method45(false);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILse;)V")
    public final void method192(int arg0, class166 arg1) {
        field542++;
        if (arg1.field3315 != null) {
            arg1.method1018(15789);
        }
        arg1.field3310 = this.field551.field3310;
        arg1.field3315 = this.field551;
        if (arg0 != 1) {
            field550 = null;
        }
        arg1.field3315.field3310 = arg1;
        arg1.field3310.field3315 = arg1;
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(B)V")
    public static final void method193(byte arg0) {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var3 = 0; var3 < class49.field1171 - 1; var3++) {
                if (class103.field2201[var3] < 1000 && class103.field2201[var3 + 1] > 1000) {
                    class23 var4 = class81.field1771[var3];
                    class81.field1771[var3] = class81.field1771[var3 + 1];
                    var1 = false;
                    class81.field1771[var3 + 1] = var4;
                    class23 var5 = class88.field1876[var3];
                    class88.field1876[var3] = class88.field1876[var3 + 1];
                    class88.field1876[var3 + 1] = var5;
                    int var6 = class103.field2201[var3];
                    class103.field2201[var3] = class103.field2201[var3 + 1];
                    class103.field2201[var3 + 1] = var6;
                    int var7 = class202.field3986[var3];
                    class202.field3986[var3] = class202.field3986[var3 + 1];
                    class202.field3986[var3 + 1] = var7;
                    int var8 = class177.field3524[var3];
                    class177.field3524[var3] = class177.field3524[var3 + 1];
                    class177.field3524[var3 + 1] = var8;
                    int var9 = class28.field615[var3];
                    class28.field615[var3] = class28.field615[var3 + 1];
                    class28.field615[var3 + 1] = var9;
                }
            }
        }
        field532++;
        int var2 = 62 / ((-arg0 - 57) / 50);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lkh;Lkh;B)V")
    public static final void method194(class97 arg0, class97 arg1, byte arg2) {
        if (arg2 < -48) {
            class114.field2393 = arg0;
            class59.field1377 = arg1;
            field548++;
            class13.field293 = class59.field1377.method660(-105, 3);
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class25() {
        this.field551.field3315 = this.field551;
        this.field551.field3310 = this.field551;
    }
}
