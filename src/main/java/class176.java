import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class176 {

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Ln;")
    private class125 field3391 = new class125();

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "Ljd;")
    private static class92 field3396 = class202.method1325((byte) 90, "Take");

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "[[I")
    public static int[][] field3398 = new int[104][104];

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Ljd;")
    public static class92 field3397 = field3396;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "Lei;")
    public static class50 field3387;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "[I")
    public static int[] field3389;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZZ)V")
    public static final void method1156(boolean arg0, boolean arg1) {
        if (class15.field423.field246 >> 7 == class4.field262 && class15.field423.field208 >> 7 == class193.field3765) {
            class4.field262 = 0;
        }
        if (!arg0) {
            method1162(true);
        }
        int var2 = class140.field2811;
        field3395++;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class91 var4;
            long var5;
            if (arg1) {
                var4 = class15.field423;
                var5 = 8791798054912L;
            } else {
                var4 = class172.field3347[class190.field3678[var3]];
                var5 = (long) class190.field3678[var3] << 32;
            }
            if (var4 != null && var4.method24(100)) {
                var4.field1778 = false;
                int var7 = var4.field246 >> 7;
                if ((class115.field2339 && class140.field2811 > 50 || class140.field2811 > 200) && !arg1 && var4.field224 == var4.field216) {
                    var4.field1778 = true;
                }
                int var8 = var4.field208 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var4.field1800 == null || class158.field3150 < var4.field1798 || class158.field3150 >= var4.field1790) {
                        if ((var4.field246 & 0x7F) == 64 && (var4.field208 & 0x7F) == 64) {
                            if (class108.field2230[var7][var8] == class126.field2545) {
                                continue;
                            }
                            class108.field2230[var7][var8] = class126.field2545;
                        }
                        var4.field248 = class118.method804(var4.field246, class81.field1639, var4.field208, 0);
                        class113.method762(class81.field1639, var4.field246, var4.field208, var4.field248, 60, var4, var4.field234, var5, var4.field213);
                    } else {
                        var4.field1778 = false;
                        var4.field248 = class118.method804(var4.field246, class81.field1639, var4.field208, 0);
                        class90.method598(class81.field1639, var4.field246, var4.field208, var4.field248, var4, var4.field234, var5, var4.field1802, var4.field1792, var4.field1788, var4.field1784);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZIILjc;)V")
    public static final void method1157(int arg0, boolean arg1, int arg2, int arg3, class91 arg4) {
        field3392++;
        if (class15.field423 == arg4 || class3.field182 >= 400) {
            return;
        }
        class92 var5;
        if (arg4.field1782 == 0) {
            var5 = class77.method529(-3, new class92[] { arg4.field1805, method1159(127, arg4.field1796, class15.field423.field1796), class79.field1618, class132.field2646, class142.method938(arg4.field1796, false), class1.field83 });
        } else {
            var5 = class77.method529(-3, new class92[] { arg4.field1805, class79.field1618, class80.field1624, class142.method938(arg4.field1782, false), class1.field83 });
        }
        if (class59.field1235 == 1) {
            class150.field2972++;
            class44.method275((byte) -110, (short) 15, arg0, (long) arg2, class77.method529(-3, new class92[] { class1.field6, class92.field1852, var5 }), arg3, class25.field581);
        } else if (!class95.field1918) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class90.field1773[var6] != null) {
                    class28.field618++;
                    boolean var7 = false;
                    short var8 = 0;
                    if (class45.field1006 == 0 && class90.field1773[var6].method646(102, class206.field3970)) {
                        if (arg4.field1796 > class15.field423.field1796) {
                            var8 = 2000;
                        }
                        if (class15.field423.field1801 != 0 && arg4.field1801 != 0) {
                            if (class15.field423.field1801 == arg4.field1801) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class51.field1091[var6]) {
                        var8 = 2000;
                    }
                    short var9 = class103.field2132[var6];
                    short var10 = (short) (var8 + var9);
                    class44.method275((byte) -110, var10, arg0, (long) arg2, class77.method529(-3, new class92[] { class49.field1059, var5 }), arg3, class90.field1773[var6]);
                }
            }
        } else if ((class42.field921 & 0x8) == 8) {
            class68.field1364++;
            class44.method275((byte) -110, (short) 21, arg0, (long) arg2, class77.method529(-3, new class92[] { class33.field746, class92.field1852, var5 }), arg3, class124.field2527);
        }
        if (!arg1) {
            method1156(true, true);
        }
        for (int var11 = 0; var11 < class3.field182; var11++) {
            if (class13.field383[var11] == 11) {
                class189.field3604[var11] = class77.method529(-3, new class92[] { class49.field1059, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
    public static void method1158(boolean arg0) {
        field3396 = null;
        field3398 = null;
        if (!arg0) {
            field3397 = null;
        }
        field3387 = null;
        field3397 = null;
        field3389 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Ljd;")
    public static final class92 method1159(int arg0, int arg1, int arg2) {
        field3388++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return class207.field3973;
        } else if (var3 < -6) {
            return class126.field2551;
        } else if (var3 < -3) {
            return class188.field3578;
        } else if (var3 < 0) {
            return class147.field2924;
        } else if (var3 > 9) {
            return class186.field3515;
        } else if (var3 > 6) {
            return class126.field2544;
        } else {
            if (arg0 < 125) {
                field3396 = null;
            }
            if (var3 > 3) {
                return class111.field2264;
            } else if (var3 > 0) {
                return class51.field1092;
            } else {
                return class114.field2311;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILn;)V")
    public final void method1160(int arg0, class125 arg1) {
        if (arg1.field2539 != null) {
            arg1.method838(8163);
        }
        if (arg0 != -1886201657) {
            this.method1163(null, -97);
        }
        arg1.field2539 = this.field3391;
        arg1.field2542 = this.field3391.field2542;
        field3394++;
        arg1.field2539.field2542 = arg1;
        arg1.field2542.field2539 = arg1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)Ln;")
    public final class125 method1161(byte arg0) {
        if (arg0 < 99) {
            return null;
        } else {
            field3399++;
            class125 var2 = this.field3391.field2542;
            return this.field3391 == var2 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)Z")
    public static final boolean method1162(boolean arg0) {
        field3390++;
        try {
            if (class79.field1619 == 2) {
                if (class136.field2712 == null) {
                    class136.field2712 = class112.method759(class156.field3100, class151.field3002, class150.field2980);
                    if (class136.field2712 == null) {
                        return false;
                    }
                }
                if (class210.field4073 == null) {
                    class210.field4073 = new class172(class2.field155, class157.field3117);
                }
                if (class198.field3871.method1248(class210.field4073, (byte) -43, class136.field2712, class162.field3176, 22050)) {
                    class198.field3871.method1226((byte) 87);
                    class198.field3871.method1233(class110.field2245, -15561);
                    class198.field3871.method1221(class136.field2712, 16, class151.field2989);
                    class136.field2712 = null;
                    class79.field1619 = 0;
                    class156.field3100 = null;
                    class210.field4073 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class198.field3871.method1252(false);
            class136.field2712 = null;
            class156.field3100 = null;
            class210.field4073 = null;
            class79.field1619 = 0;
        }
        return arg0 ? false : false;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ln;I)V")
    public final void method1163(class125 arg0, int arg1) {
        if (arg0.field2539 != null) {
            arg0.method838(arg1 + 7963);
        }
        arg0.field2539 = this.field3391.field2539;
        if (arg1 != 200) {
            field3398 = null;
        }
        field3393++;
        arg0.field2542 = this.field3391;
        arg0.field2539.field2542 = arg0;
        arg0.field2542.field2539 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lnh;I)V")
    public static final void method1164(class133 arg0, int arg1) {
        class118.field2400 = arg0;
        field3401++;
        if (arg1 >= -20) {
            field3396 = null;
        }
        class118.field2400.method886(123, 4);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)Ln;")
    public final class125 method1165(int arg0) {
        field3400++;
        class125 var2 = this.field3391.field2542;
        if (this.field3391 == var2) {
            return null;
        } else if (arg0 == 233647623) {
            var2.method838(8163);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class176() {
        this.field3391.field2542 = this.field3391;
        this.field3391.field2539 = this.field3391;
    }
}
