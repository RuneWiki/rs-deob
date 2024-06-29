import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class130 extends class67 {

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public static int field3139 = 0;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "Lrd;")
    private static class114 field3148 = class84.method656("skill)2", (byte) 114);

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    public static int field3142 = 0;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "Lrd;")
    public static class114 field3143 = field3148;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public static int field3150 = 0;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field3149 = 0;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "Lrd;")
    public static class114 field3140 = class84.method656("Bitte warten Sie)3)3)3", (byte) 118);

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "Lrd;")
    public static class114 field3152 = class84.method656("mapedge", (byte) 116);

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
    public static void method1044(int arg0) {
        field3148 = null;
        field3152 = null;
        if (arg0 == 5) {
            field3143 = null;
            field3140 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V")
    public static final void method1045(int arg0) {
        if (arg0 != 199) {
            return;
        }
        field3144++;
        while (true) {
            label318: do {
                while (class72.method584(1)) {
                    if (class117.field2747 != -1 && class121.field2832 == class117.field2747) {
                        if (class7.field96 == 85 && class72.field1617.method854(-29348) > 0) {
                            class72.field1617 = class72.field1617.method860(class72.field1617.method854(-29348) - 1, arg0 + -23944, 0);
                        }
                        continue label318;
                    }
                    if (class5.field75) {
                        if (class7.field96 == 85 && class72.field1619.method854(arg0 ^ 0xFFFF8D9B) > 0) {
                            class72.field1619 = class72.field1619.method860(class72.field1619.method854(-29348) - 1, arg0 ^ 0xFFFFA3F8, 0);
                            class140.field3335 = true;
                        }
                        if (class69.method548(58, class26.field541) && class72.field1619.method854(-29348) < 80) {
                            class72.field1619 = class72.field1619.method884(class26.field541, -108);
                            class140.field3335 = true;
                        }
                        if (class7.field96 == 84) {
                            class140.field3335 = true;
                            class5.field75 = false;
                            if (class51.field1056 == 1) {
                                long var10 = class72.field1619.method877(arg0 + 29287);
                                class121.method944(-122, var10);
                            }
                            if (class51.field1056 == 2 && class128.field3058 > 0) {
                                long var12 = class72.field1619.method877(29486);
                                class90.method697(var12, true);
                            }
                            if (class51.field1056 == 3 && class72.field1619.method854(-29348) > 0) {
                                class49.field1010++;
                                class61.field1303.method1054(arg0 - 191, 32);
                                class61.field1303.method478((byte) 121, 0);
                                int var14 = class61.field1303.field1227;
                                class61.field1303.method455(class42.field849, 2);
                                class7.method65(class72.field1619, 125, class61.field1303);
                                class61.field1303.method491(-1, class61.field1303.field1227 - var14);
                                if (field3149 == 2) {
                                    field3149 = 1;
                                    class114.field2639++;
                                    class24.field466 = true;
                                    class61.field1303.method1054(8, 4);
                                    class61.field1303.method478((byte) 120, class12.field253);
                                    class61.field1303.method478((byte) 113, field3149);
                                    class61.field1303.method478((byte) 119, class99.field2255);
                                }
                            }
                            if (class51.field1056 == 4 && class89.field1986 < 100) {
                                long var15 = class72.field1619.method877(arg0 + 29287);
                                class66.method530((byte) -128, var15);
                            }
                            if (class51.field1056 == 5 && class89.field1986 > 0) {
                                long var17 = class72.field1619.method877(29486);
                                class56.method417(arg0 ^ 0xC7, var17);
                            }
                        }
                    } else if (class142.field3382 == 1) {
                        if (class7.field96 == 85 && class72.field1612.method854(-29348) > 0) {
                            class72.field1612 = class72.field1612.method860(class72.field1612.method854(-29348) - 1, arg0 + -23944, 0);
                            class140.field3335 = true;
                        }
                        if (class29.method216(true, class26.field541) && class72.field1612.method854(-29348) < 10) {
                            class72.field1612 = class72.field1612.method884(class26.field541, -101);
                            class140.field3335 = true;
                        }
                        if (class7.field96 == 84) {
                            if (class72.field1612.method854(-29348) > 0) {
                                class5.field79++;
                                int var1 = 0;
                                if (class72.field1612.method868(true)) {
                                    var1 = class72.field1612.method876(122);
                                }
                                class61.field1303.method1054(8, 60);
                                class61.field1303.method476(-7155, var1);
                            }
                            class140.field3335 = true;
                            class142.field3382 = 0;
                        }
                    } else if (class142.field3382 == 2) {
                        if (class7.field96 == 85 && class72.field1612.method854(-29348) > 0) {
                            class72.field1612 = class72.field1612.method860(class72.field1612.method854(arg0 ^ -29285) - 1, arg0 ^ 0xFFFFA3F8, 0);
                            class140.field3335 = true;
                        }
                        if ((class90.method693(class26.field541, arg0 - 81) || class26.field541 == 32) && class72.field1612.method854(arg0 ^ 0xFFFF8D9B) < 12) {
                            class72.field1612 = class72.field1612.method884(class26.field541, -103);
                            class140.field3335 = true;
                        }
                        if (class7.field96 == 84) {
                            if (class72.field1612.method854(-29348) > 0) {
                                class110.field2571++;
                                class61.field1303.method1054(8, 194);
                                class61.field1303.method455(class72.field1612.method877(29486), 2);
                            }
                            class140.field3335 = true;
                            class142.field3382 = 0;
                        }
                    } else if (class142.field3382 == 3) {
                        if (class7.field96 == 85 && class72.field1612.method854(arg0 ^ 0xFFFF8D9B) > 0) {
                            class72.field1612 = class72.field1612.method860(class72.field1612.method854(-29348) - 1, -23745, 0);
                            class140.field3335 = true;
                        }
                        if (class69.method548(27, class26.field541) && class72.field1612.method854(-29348) < 40) {
                            class72.field1612 = class72.field1612.method884(class26.field541, -121);
                            class140.field3335 = true;
                        }
                    } else if (class142.field3382 == 4) {
                        if (class7.field96 == 85 && class72.field1612.method854(-29348) > 0) {
                            class72.field1612 = class72.field1612.method860(class72.field1612.method854(-29348) - 1, arg0 + -23944, 0);
                            class140.field3335 = true;
                        }
                        if ((class69.method548(arg0 ^ 0xEC, class26.field541) || class26.field541 == 32) && class72.field1612.method854(-29348) < 80) {
                            class72.field1612 = class72.field1612.method884(class26.field541, -98);
                            class140.field3335 = true;
                        }
                        if (class7.field96 == 84) {
                            if (class72.field1612.method854(-29348) > 0) {
                                class144.field3441++;
                                class61.field1303.method1054(arg0 ^ 0xCF, 10);
                                class61.field1303.method478((byte) -88, class72.field1612.method854(-29348) + 1);
                                class61.field1303.method452(-6595, class72.field1612);
                            }
                            class140.field3335 = true;
                            class142.field3382 = 0;
                        }
                    } else if (class123.field2899 == -1 && class34.field671 == -1) {
                        if (class7.field96 == 85 && class72.field1618.method854(-29348) > 0) {
                            class72.field1618 = class72.field1618.method860(class72.field1618.method854(-29348) - 1, -23745, 0);
                            class140.field3335 = true;
                        }
                        if (class69.method548(48, class26.field541) && class72.field1618.method854(-29348) < 80) {
                            class72.field1618 = class72.field1618.method884(class26.field541, -107);
                            class140.field3335 = true;
                        }
                        if (class7.field96 == 84 && class72.field1618.method854(arg0 ^ 0xFFFF8D9B) > 0) {
                            if (class58.field1205 == 2) {
                                if (class72.field1618.method881(class117.field2749, false)) {
                                    System.gc();
                                }
                                if (class72.field1618.method881(class21.field389, false)) {
                                    class86.method663(32129);
                                }
                                if (class72.field1618.method881(class131.field3179, false)) {
                                    class122.field2850 = true;
                                }
                                if (class72.field1618.method881(class50.field1039, false)) {
                                    class122.field2850 = false;
                                }
                                if (class72.field1618.method881(class82.field1842, false)) {
                                    for (int var2 = 0; var2 < 4; var2++) {
                                        for (int var3 = 1; var3 < 103; var3++) {
                                            for (int var4 = 1; var4 < 103; var4++) {
                                                class90.field2132[var2].field1983[var3][var4] = 0;
                                            }
                                        }
                                    }
                                }
                                if (class72.field1618.method881(class114.field2687, false) && class56.field1176 == 2) {
                                    throw new RuntimeException();
                                }
                                if (class72.field1618.method881(class14.field306, false)) {
                                    class1.field11 = true;
                                }
                            }
                            if (class72.field1618.method864(27, class38.field788)) {
                                class144.field3436++;
                                class61.field1303.method1054(8, 199);
                                class61.field1303.method478((byte) 114, class72.field1618.method854(arg0 - 29547) - 1);
                                class61.field1303.method452(arg0 - 6794, class72.field1618.method866(false, 2));
                            } else {
                                byte var5 = 0;
                                class101.field2328++;
                                byte var6 = 0;
                                class114 var7 = class72.field1618.method888(-34);
                                if (var7.method864(27, class9.field136)) {
                                    var6 = 0;
                                    class72.field1618 = class72.field1618.method866(false, class9.field136.method854(-29348));
                                } else if (var7.method864(arg0 ^ 0xDC, class131.field3180)) {
                                    var6 = 1;
                                    class72.field1618 = class72.field1618.method866(false, class131.field3180.method854(-29348));
                                } else if (var7.method864(27, class3.field29)) {
                                    var6 = 2;
                                    class72.field1618 = class72.field1618.method866(false, class3.field29.method854(-29348));
                                } else if (var7.method864(27, class64.field1382)) {
                                    class72.field1618 = class72.field1618.method866(false, class64.field1382.method854(arg0 - 29547));
                                    var6 = 3;
                                } else if (var7.method864(27, class137.field3310)) {
                                    var6 = 4;
                                    class72.field1618 = class72.field1618.method866(false, class137.field3310.method854(-29348));
                                } else if (var7.method864(27, class89.field1994)) {
                                    class72.field1618 = class72.field1618.method866(false, class89.field1994.method854(arg0 - 29547));
                                    var6 = 5;
                                } else if (var7.method864(27, class64.field1367)) {
                                    class72.field1618 = class72.field1618.method866(false, class64.field1367.method854(arg0 ^ 0xFFFF8D9B));
                                    var6 = 6;
                                } else if (var7.method864(arg0 - 172, class118.field2777)) {
                                    class72.field1618 = class72.field1618.method866(false, class118.field2777.method854(arg0 ^ 0xFFFF8D9B));
                                    var6 = 7;
                                } else if (var7.method864(27, class109.field2518)) {
                                    var6 = 8;
                                    class72.field1618 = class72.field1618.method866(false, class109.field2518.method854(-29348));
                                } else if (var7.method864(27, class99.field2251)) {
                                    class72.field1618 = class72.field1618.method866(false, class99.field2251.method854(arg0 ^ 0xFFFF8D9B));
                                    var6 = 9;
                                } else if (var7.method864(arg0 - 172, class51.field1065)) {
                                    class72.field1618 = class72.field1618.method866(false, class51.field1065.method854(-29348));
                                    var6 = 10;
                                } else if (var7.method864(arg0 - 172, class116.field2695)) {
                                    class72.field1618 = class72.field1618.method866(false, class116.field2695.method854(arg0 - 29547));
                                    var6 = 11;
                                }
                                class114 var8 = class72.field1618.method888(-34);
                                if (var8.method864(arg0 ^ 0xDC, class90.field2128)) {
                                    class72.field1618 = class72.field1618.method866(false, class90.field2128.method854(arg0 - 29547));
                                    var5 = 1;
                                } else if (var8.method864(27, class67.field1454)) {
                                    var5 = 2;
                                    class72.field1618 = class72.field1618.method866(false, class67.field1454.method854(-29348));
                                } else if (var8.method864(27, class48.field999)) {
                                    class72.field1618 = class72.field1618.method866(false, class48.field999.method854(-29348));
                                    var5 = 3;
                                } else if (var8.method864(27, class7.field88)) {
                                    var5 = 4;
                                    class72.field1618 = class72.field1618.method866(false, class7.field88.method854(-29348));
                                } else if (var8.method864(27, class74.field1670)) {
                                    class72.field1618 = class72.field1618.method866(false, class74.field1670.method854(-29348));
                                    var5 = 5;
                                }
                                class61.field1303.method1054(8, 247);
                                class61.field1303.method478((byte) 107, 0);
                                int var9 = class61.field1303.field1227;
                                class61.field1303.method478((byte) 90, var6);
                                class61.field1303.method478((byte) -127, var5);
                                class7.method65(class72.field1618, -65, class61.field1303);
                                class61.field1303.method491(-1, class61.field1303.field1227 - var9);
                                if (class12.field253 == 2) {
                                    class24.field466 = true;
                                    class114.field2639++;
                                    class12.field253 = 3;
                                    class61.field1303.method1054(8, 4);
                                    class61.field1303.method478((byte) -23, class12.field253);
                                    class61.field1303.method478((byte) -84, field3149);
                                    class61.field1303.method478((byte) -52, class99.field2255);
                                }
                            }
                            class140.field3335 = true;
                            class72.field1618 = class72.field1610;
                        }
                    }
                }
                return;
            } while (!class90.method693(class26.field541, arg0 - 81) && class26.field541 != 32);
            if (class72.field1617.method854(arg0 ^ 0xFFFF8D9B) < 12) {
                class72.field1617 = class72.field1617.method884(class26.field541, -97);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIIB)Lrd;")
    public static final class114 method1046(boolean arg0, int arg1, int arg2, byte arg3) {
        if (arg2 < 1 || arg2 > 36) {
            arg2 = 10;
        }
        field3138++;
        int var4 = 1;
        int var5 = arg1 / arg2;
        while (var5 != 0) {
            var5 /= arg2;
            var4++;
        }
        int var6 = var4;
        if (arg1 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        if (arg3 >= -34) {
            field3140 = null;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg1 % arg2;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
            arg1 /= arg2;
        }
        class114 var9 = new class114();
        var9.field2676 = var7;
        var9.field2660 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIILgb;I)V")
    public static final void method1047(int arg0, int arg1, int arg2, class45 arg3, int arg4) {
        field3146++;
        class11.field187.method528(-1926);
        class142.field3389.method722(0, 0);
        arg3.method335(class131.field3173, 55, 28, 16777215, true);
        if (arg2 == 0) {
            arg3.method335(class24.field483, 55, 41, 65280, true);
        }
        if (arg2 == 1) {
            arg3.method335(class34.field684, 55, 41, 16776960, true);
        }
        if (arg2 == 2) {
            arg3.method335(class12.field271, 55, 41, 16711680, true);
        }
        if (arg2 == 3) {
            arg3.method335(class144.field3428, 55, 41, 65535, true);
        }
        arg3.method335(class26.field522, 184, 28, 16777215, true);
        if (arg1 != 41) {
            field3143 = null;
        }
        if (arg0 == 0) {
            arg3.method335(class24.field483, 184, 41, 65280, true);
        }
        if (arg0 == 1) {
            arg3.method335(class34.field684, 184, 41, 16776960, true);
        }
        if (arg0 == 2) {
            arg3.method335(class12.field271, 184, 41, 16711680, true);
        }
        arg3.method335(class104.field2432, 324, 28, 16777215, true);
        if (arg4 == 0) {
            arg3.method335(class24.field483, 324, 41, 65280, true);
        }
        if (arg4 == 1) {
            arg3.method335(class34.field684, 324, 41, 16776960, true);
        }
        if (arg4 == 2) {
            arg3.method335(class12.field271, 324, 41, 16711680, true);
        }
        arg3.method330(class82.field1831, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
        try {
            Graphics var5 = class114.field2678.getGraphics();
            class11.field187.method526(arg1 ^ 0x29, 0, 453, var5);
        } catch (Exception var6) {
            class114.field2678.repaint();
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Lbd;")
    public static final class12 method1048(int arg0, int arg1) {
        field3151++;
        class12 var2 = (class12) class79.field1790.method194((byte) -100, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class127.field3034.method762(6, arg1, (byte) 66);
        class12 var4 = new class12();
        if (arg0 >= -37) {
            field3145 = -88;
        }
        var4.field206 = arg1;
        if (var3 != null) {
            var4.method93(126, new class60(var3));
        }
        var4.method105((byte) -109);
        if (var4.field205) {
            var4.field252 = false;
            var4.field214 = false;
        }
        class79.field1790.method193(-84, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class130() {
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(I)V")
    public class130(int arg0) {
        this.field3147 = arg0;
    }
}
