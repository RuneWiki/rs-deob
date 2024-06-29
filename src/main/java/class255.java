import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class255 extends class507 {

    @OriginalMember(owner = "client!mv", name = "v", descriptor = "Lop;")
    public class127 field3388;

    @OriginalMember(owner = "client!mv", name = "w", descriptor = "Lkv;")
    public class178 field3389;

    @OriginalMember(owner = "client!mv", name = "E", descriptor = "Lbu;")
    public static class17 field3396;

    @OriginalMember(owner = "client!mv", name = "t", descriptor = "I")
    public int field3386;

    @OriginalMember(owner = "client!mv", name = "u", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!mv", name = "x", descriptor = "I")
    public int field3390;

    @OriginalMember(owner = "client!mv", name = "y", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!mv", name = "z", descriptor = "I")
    public int field3392;

    @OriginalMember(owner = "client!mv", name = "B", descriptor = "I")
    public int field3393;

    @OriginalMember(owner = "client!mv", name = "C", descriptor = "I")
    public int field3394;

    @OriginalMember(owner = "client!mv", name = "G", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!mv", name = "D", descriptor = "Lml;")
    public static class266 field3395;

    static {
        new class305(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
        field3396 = new class17("WTRC", 1);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZZIII)V", line = 11)
    public static final void method1577(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field3387++;
        if (class186.field2421 == null) {
            class343.field4596.method1717(arg4, arg3, arg5, -16777216, -22794, arg0);
        } else if (class96.field1170.field3704 >= 0 && class96.field1170.field3704 < (class308.field4128 * 128) && class96.field1170.field3694 >= 0 && (class426.field6200 * 128) > class96.field1170.field3694) {
            class431.field6268++;
            if (class96.field1170 != null && (class96.field1170.field3704 - ((class96.field1170.method546(24273) - 1) * 64) >> 7) == class234.field3122 && (class96.field1170.field3694 - ((class96.field1170.method546(24273) - 1) * 64) >> 7) == class417.field6028) {
                class417.field6028 = -1;
                class234.field3122 = -1;
                class336.method1959((byte) -91);
            }
            class419.method2589(true);
            if (!arg1) {
                class105.method636((byte) 124);
            }
            class4.method13(100);
            class272.method1658(arg5, true, arg4, arg3, arg0, arg2);
            int var6 = class444.field6461;
            int var7 = class75.field951;
            int var8 = class151.field1970;
            int var9 = class527.field7739;
            if (class47.field491 == 1) {
                int var10 = (int) class199.field2650;
                if (class14.field151 >> 8 > var10) {
                    var10 = class14.field151 >> 8;
                }
                if (class462.field6896[4] && var10 < (class89.field1065[4] + 128)) {
                    var10 = class89.field1065[4] + 128;
                }
                int var11 = (int) class143.field1907 + class321.field4284 & 0x3FFF;
                class161.method951(var10, class412.field5886, class470.method2868(127, class210.field2808, class96.field1170.field3704, class96.field1170.field3694) - 50, (byte) -90, var11, var9, class492.field7214, (var10 >> 3) * 3 + 600 << 0);
            } else if (class47.field491 == 4) {
                int var12 = (int) class199.field2650;
                if ((class14.field151 >> 8) > var12) {
                    var12 = class14.field151 >> 8;
                }
                if (class462.field6896[4] && (class89.field1065[4] + 128) > var12) {
                    var12 = class89.field1065[4] + 128;
                }
                int var13 = (int) class143.field1907 & 0x3FFF;
                class161.method951(var12, class412.field5886, class470.method2868(114, class210.field2808, class200.field2665, class299.field3936) - 50, (byte) -90, var13, var9, class492.field7214, ((var12 >> 3) * 3) + 600 << 0);
            } else if (class47.field491 == 5) {
                class366.method2179(var9, (byte) 60);
            }
            int var14 = class238.field3171;
            int var15 = class267.field3572;
            int var16 = class139.field1857;
            int var17 = class65.field739;
            int var18 = class9.field110;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class462.field6896[var19]) {
                    int var22 = (int) (Math.random() * (double) (class429.field6238[var19] * 2 + 1) + Math.sin((double) class314.field4185[var19] / 100.0D * (double) class380.field5505[var19]) * (double) class89.field1065[var19] - (double) class429.field6238[var19]);
                    if (var19 == 4) {
                        class65.field739 += var22;
                        if (class65.field739 < 1024) {
                            class65.field739 = 1024;
                        } else if (class65.field739 > 3072) {
                            class65.field739 = 3072;
                        }
                    }
                    if (var19 == 0) {
                        class238.field3171 += var22;
                    }
                    if (var19 == 1) {
                        class267.field3572 += var22;
                    }
                    if (var19 == 3) {
                        class9.field110 = class9.field110 + var22 & 0x3FFF;
                    }
                    if (var19 == 2) {
                        class139.field1857 += var22;
                    }
                }
            }
            if (class238.field3171 < 0) {
                class238.field3171 = 0;
            }
            if (class238.field3171 > ((class515.field7487 << 7) - 1)) {
                class238.field3171 = (class515.field7487 << 7) - 1;
            }
            if (class139.field1857 < 0) {
                class139.field1857 = 0;
            }
            if (class139.field1857 > (class114.field1494 << 7) - 1) {
                class139.field1857 = (class114.field1494 << 7) - 1;
            }
            class66.method391((byte) 61);
            class338.method1969((byte) -114);
            class343.field4596.method1182(var7, var8, var6 + var7, var8 + var9);
            class343.field4596.method1188();
            int var20 = class287.field3770;
            if (class155.field2027 == null) {
                class343.field4596.method1145(var20);
            } else {
                class155.field2027.method1767(var8, class65.field739, class139.field1851 << 3, class9.field110, class343.field4596, var6, var9, (byte) -103, var20, var7);
            }
            class466.method2847(!arg2);
            class272.field3633.method752(class238.field3171, class267.field3572, class139.field1857, -class65.field739 & 0x3FFF, -class9.field110 & 0x3FFF, -class230.field3104 & 0x3FFF);
            class343.field4596.method1227(class272.field3633);
            class343.field4596.method1221(var6 / 2 + var7, var9 / 2 + var8, class74.field932 << 1, class74.field932 << 1);
            class94.method525(var6 / 2 + var7, -83, class74.field932 << 1, var9 / 2 + var8, class74.field932 << 1);
            class307.method1831(class139.field1857, class238.field3171, -28617, class267.field3572, -class230.field3104 & 0x3FFF, -class65.field739 & 0x3FFF, -class9.field110 & 0x3FFF);
            byte var21 = class319.field4256.method1736(class20.field183, -59) == 2 ? (byte) class431.field6268 : 1;
            class149.method898(class343.field4596, class532.field7836, class118.field1550, class272.field3633, class238.field3171, class267.field3572, class139.field1857, class33.field339, class113.field1486, class371.field5043, class430.field6256, class225.field3027, class96.field1184, class96.field1170.field3695 + 1, var21, class96.field1170.field3704 >> 7, class96.field1170.field3694 >> 7, !class319.field4256.field4663);
            class466.method2847(false);
            if (class527.field7734 == 9) {
                class174.method1024(61, var6, var9, 256, 256, var8, var7);
                class124.method738(var8, var9, 256, var7, 65535, var6, 256);
                class202.method1296(var9, var6, 256, 256, var8, var7, -28);
                class244.method1520(var7, true, var9, var8, var6);
            }
            class75.method437();
            class9.field110 = var18;
            class65.field739 = var17;
            class238.field3171 = var14;
            class267.field3572 = var15;
            class139.field1857 = var16;
            if (class54.field630 && class162.field2108.method2762((byte) 124) == 0) {
                class54.field630 = false;
            }
            if (class54.field630) {
                class343.field4596.method1717(var6, var7, var9, -16777216, -22794, var8);
                class31.method176(false, class225.field3028, class279.field3703.method1823(class374.field5072, (byte) -88), 77);
            }
        } else {
            class343.field4596.method1717(arg4, arg3, arg5, -16777216, -22794, arg0);
        }
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(Z)V", line = 205)
    public static void method1578(boolean arg0) {
        if (!arg0) {
            field3395 = null;
            field3396 = null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lop;Ldl;)V", line = 215)
    public class255(class127 arg0, class46 arg1) {
        this.field3388 = arg0;
        this.field3389 = this.field3388.method772(-1);
        this.method1579(true);
    }

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "(Z)V", line = 227)
    public final void method1579(boolean arg0) {
        this.field3394 = this.field3388.field1648;
        this.field3393 = this.field3388.field1653;
        field3391++;
        this.field3392 = this.field3388.field1640;
        if (!arg0) {
            this.field3392 = -64;
        }
        if (this.field3388.field1645 != null) {
            this.field3388.field1645.method745(this.field3389.field2304, this.field3389.field2290, this.field3389.field2286, class338.field4471);
        }
        this.field3386 = class338.field4471[2];
        this.field3390 = class338.field4471[0];
    }
}
