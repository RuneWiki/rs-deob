import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class75 extends class24 {

    @OriginalMember(owner = "client!kf", name = "Y", descriptor = "I")
    public int field1626 = 0;

    @OriginalMember(owner = "client!kf", name = "cb", descriptor = "I")
    public int field1630 = -1;

    @OriginalMember(owner = "client!kf", name = "ob", descriptor = "I")
    public int field1642 = -1;

    @OriginalMember(owner = "client!kf", name = "qb", descriptor = "Z")
    public boolean field1644 = true;

    @OriginalMember(owner = "client!kf", name = "X", descriptor = "Lqf;")
    private static class117 field1625 = class72.method514(124, "Classic");

    @OriginalMember(owner = "client!kf", name = "ib", descriptor = "Lqf;")
    public static class117 field1636 = class72.method514(118, "null");

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "Z")
    public static boolean field1623 = false;

    @OriginalMember(owner = "client!kf", name = "Z", descriptor = "Lqf;")
    public static class117 field1627 = field1625;

    @OriginalMember(owner = "client!kf", name = "tb", descriptor = "Lqf;")
    public static class117 field1647 = class72.method514(125, "Ausw-=hlen");

    @OriginalMember(owner = "client!kf", name = "sb", descriptor = "I")
    public static int field1646 = 0;

    @OriginalMember(owner = "client!kf", name = "bb", descriptor = "Leb;")
    public static class31 field1629 = new class31(64);

    @OriginalMember(owner = "client!kf", name = "xb", descriptor = "I")
    public static int field1651 = 0;

    @OriginalMember(owner = "client!kf", name = "yb", descriptor = "Z")
    public static boolean field1652 = false;

    @OriginalMember(owner = "client!kf", name = "Ab", descriptor = "Lqf;")
    public static class117 field1654 = class72.method514(116, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!kf", name = "zb", descriptor = "Lqf;")
    public static class117 field1653 = class72.method514(123, "http:)4)4www)3runescape)3com");

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "I")
    public int field1621;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
    public int field1622;

    @OriginalMember(owner = "client!kf", name = "W", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!kf", name = "ab", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!kf", name = "eb", descriptor = "I")
    public int field1632;

    @OriginalMember(owner = "client!kf", name = "fb", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!kf", name = "gb", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!kf", name = "jb", descriptor = "I")
    public int field1637;

    @OriginalMember(owner = "client!kf", name = "kb", descriptor = "I")
    public int field1638;

    @OriginalMember(owner = "client!kf", name = "lb", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!kf", name = "mb", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!kf", name = "nb", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!kf", name = "pb", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!kf", name = "rb", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!kf", name = "ub", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!kf", name = "vb", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!kf", name = "wb", descriptor = "I")
    public int field1650;

    @OriginalMember(owner = "client!kf", name = "db", descriptor = "Ldf;")
    public static class28 field1631;

    @OriginalMember(owner = "client!kf", name = "hb", descriptor = "Lme;")
    public static class88 field1635;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "(I)V")
    public final void method538(int arg0) {
        field1634++;
        if (arg0 != 4) {
            return;
        }
        if (this.field1630 != -1) {
            this.method545(this.field1630, arg0 ^ 0xFFFFFF04);
            this.field1621 = this.field1637;
            this.field1638 = this.field1650;
            this.field1622 = this.field1632;
        }
        this.method545(this.field1626, -256);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
    public static final void method539(byte arg0) {
        field1649++;
        if (class90.field2179 == 0 && !class89.field2160) {
            class135.field3229++;
            class139.method1081(class143.field3504, 33, class141.field3351, class18.field274, class150.field3727, true, 0);
        }
        int var1 = -1;
        int var2 = 0;
        if (arg0 > -31) {
            method539((byte) 17);
        }
        while (var2 < class30.field641) {
            int var3 = class30.field635[var2];
            int var4 = var3 & 0x7F;
            int var5 = var3 >> 7 & 0x7F;
            int var6 = var3 >> 29 & 0x3;
            int var7 = var3 >> 14 & 0x7FFF;
            if (var1 != var3) {
                label274: {
                    var1 = var3;
                    if (var6 == 2 && class19.field311.method848(class140.field3344, var4, var5, var3) >= 0) {
                        class148 var8 = class23.method181((byte) -105, var7);
                        if (var8.field3653 != null) {
                            var8 = var8.method1181(-16431);
                        }
                        if (var8 == null) {
                            break label274;
                        }
                        if (class90.field2179 == 1) {
                            class139.method1081(var4, 14, class73.method530((byte) -83, new class117[] { class146.field3571, class139.field3297, var8.field3671 }), var5, class13.field190, true, var3);
                            class24.field467++;
                        } else if (!class89.field2160) {
                            class117[] var9 = var8.field3617;
                            class32.field681++;
                            if (class141.field3383) {
                                var9 = class34.method268(5, var9);
                            }
                            if (var9 != null) {
                                for (int var10 = 4; var10 >= 0; var10--) {
                                    if (var9[var10] != null) {
                                        class100.field2429++;
                                        short var11 = 0;
                                        if (var10 == 0) {
                                            var11 = 47;
                                        }
                                        if (var10 == 1) {
                                            var11 = 17;
                                        }
                                        if (var10 == 2) {
                                            var11 = 28;
                                        }
                                        if (var10 == 3) {
                                            var11 = 35;
                                        }
                                        if (var10 == 4) {
                                            var11 = 1003;
                                        }
                                        class139.method1081(var4, var11, class73.method530((byte) -83, new class117[] { class141.field3366, var8.field3671 }), var5, var9[var10], true, var3);
                                    }
                                }
                            }
                            class139.method1081(var4, 1005, class73.method530((byte) -83, new class117[] { class141.field3366, var8.field3671 }), var5, class48.field998, true, var8.field3607 << 14);
                        } else if ((class16.field228 & 0x4) == 4) {
                            class139.method1081(var4, 53, class73.method530((byte) -83, new class117[] { class115.field2723, class139.field3297, var8.field3671 }), var5, class90.field2199, true, var3);
                            class85.field1935++;
                        }
                    }
                    if (var6 == 1) {
                        class58 var12 = class72.field1533[var7];
                        if (var12.field1172.field3199 == 1 && (var12.field1998 & 0x7F) == 64 && (var12.field1960 & 0x7F) == 64) {
                            for (int var13 = 0; var13 < class25.field483; var13++) {
                                class58 var16 = class72.field1533[class150.field3724[var13]];
                                if (var16 != null && var12 != var16 && var16.field1172.field3199 == 1 && var12.field1998 == var16.field1998 && var12.field1960 == var16.field1960) {
                                    class152.method1212(var4, var16.field1172, class150.field3724[var13], (byte) -75, var5);
                                }
                            }
                            for (int var14 = 0; var14 < class66.field1387; var14++) {
                                class21 var15 = class149.field3709[class20.field326[var14]];
                                if (var15 != null && var12.field1998 == var15.field1998 && var12.field1960 == var15.field1960) {
                                    class144.method1167(var5, var4, var15, class20.field326[var14], (byte) -43);
                                }
                            }
                        }
                        class152.method1212(var4, var12.field1172, var7, (byte) -43, var5);
                    }
                    if (var6 == 0) {
                        class21 var17 = class149.field3709[var7];
                        if ((var17.field1998 & 0x7F) == 64 && (var17.field1960 & 0x7F) == 64) {
                            for (int var18 = 0; var18 < class25.field483; var18++) {
                                class58 var21 = class72.field1533[class150.field3724[var18]];
                                if (var21 != null && var21.field1172.field3199 == 1 && var17.field1998 == var21.field1998 && var17.field1960 == var21.field1960) {
                                    class152.method1212(var4, var21.field1172, class150.field3724[var18], (byte) -87, var5);
                                }
                            }
                            for (int var19 = 0; var19 < class66.field1387; var19++) {
                                class21 var20 = class149.field3709[class20.field326[var19]];
                                if (var20 != null && var17 != var20 && var17.field1998 == var20.field1998 && var17.field1960 == var20.field1960) {
                                    class144.method1167(var5, var4, var20, class20.field326[var19], (byte) -70);
                                }
                            }
                        }
                        class144.method1167(var5, var4, var17, var7, (byte) -124);
                    }
                    if (var6 == 3) {
                        class5 var22 = class43.field858[class140.field3344][var4][var5];
                        if (var22 != null) {
                            for (class3 var23 = (class3) var22.method29(-68); var23 != null; var23 = (class3) var22.method14(0)) {
                                class72 var24 = class27.method206(var23.field60, (byte) 90);
                                if (class90.field2179 == 1) {
                                    class139.method1081(var4, 18, class73.method530((byte) -83, new class117[] { class146.field3571, class92.field2242, var24.field1544 }), var5, class13.field190, true, var23.field60);
                                    class19.field296++;
                                } else if (!class89.field2160) {
                                    field1639++;
                                    class117[] var25 = var24.field1563;
                                    if (class141.field3383) {
                                        var25 = class34.method268(5, var25);
                                    }
                                    for (int var26 = 4; var26 >= 0; var26--) {
                                        if (var25 != null && var25[var26] != null) {
                                            class95.field2306++;
                                            byte var27 = 0;
                                            if (var26 == 0) {
                                                var27 = 1;
                                            }
                                            if (var26 == 1) {
                                                var27 = 37;
                                            }
                                            if (var26 == 2) {
                                                var27 = 42;
                                            }
                                            if (var26 == 3) {
                                                var27 = 46;
                                            }
                                            if (var26 == 4) {
                                                var27 = 4;
                                            }
                                            class139.method1081(var4, var27, class73.method530((byte) -83, new class117[] { class56.field1148, var24.field1544 }), var5, var25[var26], true, var23.field60);
                                        } else if (var26 == 2) {
                                            class89.field2048++;
                                            class139.method1081(var4, 42, class73.method530((byte) -83, new class117[] { class56.field1148, var24.field1544 }), var5, class16.field253, true, var23.field60);
                                        }
                                    }
                                    class139.method1081(var4, 1004, class73.method530((byte) -83, new class117[] { class56.field1148, var24.field1544 }), var5, class48.field998, true, var23.field60);
                                } else if ((class16.field228 & 0x1) == 1) {
                                    class139.method1081(var4, 48, class73.method530((byte) -83, new class117[] { class115.field2723, class92.field2242, var24.field1544 }), var5, class90.field2199, true, var23.field60);
                                    class90.field2203++;
                                }
                            }
                        }
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "(I)V")
    public static final void method540(int arg0) {
        field1633++;
        class96.field2328.method250((byte) -54);
        int var1 = 52 % ((arg0 - 71) / 41);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljb;BLjb;Ljb;)V")
    public static final void method541(class64 arg0, byte arg1, class64 arg2, class64 arg3) {
        if (arg1 != -59) {
            field1651 = -70;
        }
        field1645++;
        class78.field1779 = arg0;
        class79.field1812 = arg2;
        class77.field1709 = arg3;
        class141.field3426 = new class89[class77.field1709.method439(-94)][];
        class25.field495 = new boolean[class77.field1709.method439(-103)];
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lla;II)V")
    public final void method542(class77 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method570((byte) 123);
            if (var4 == 0) {
                if (arg2 != -11595) {
                    field1627 = null;
                }
                field1643++;
                return;
            }
            this.method544(arg2 + 11578, var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "(I)V")
    public static final void method543(int arg0) {
        Object var1 = class65.field1346;
        synchronized (class65.field1346) {
            if (class116.field2747 == 0) {
                class44.field873.method1066(new class85(), -23553, 5);
            }
            if (arg0 >= -95) {
                field1635 = null;
            }
            class116.field2747 = 600;
        }
        field1640++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIILla;)V")
    private final void method544(int arg0, int arg1, int arg2, class77 arg3) {
        if (arg1 == 1) {
            this.field1626 = arg3.method557((byte) -114);
        } else if (arg1 == 2) {
            this.field1642 = arg3.method570((byte) 123);
        } else if (arg1 == 5) {
            this.field1644 = false;
        } else if (arg1 == 7) {
            this.field1630 = arg3.method557((byte) -114);
        }
        field1628++;
        int var5 = -35 % ((80 - arg0) / 42);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)V")
    private final void method545(int arg0, int arg1) {
        field1641++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var7 < var3) {
            var9 = var7;
        }
        double var11 = var3;
        double var13 = 0.0D;
        if (arg1 != -256) {
            return;
        }
        if (var9 > var5) {
            var9 = var5;
        }
        double var15 = 0.0D;
        if (var3 < var7) {
            var11 = var7;
        }
        if (var11 < var5) {
            var11 = var5;
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var3 == var11) {
                var13 = (var7 - var5) / (-var9 + var11);
            } else if (var7 == var11) {
                var13 = (var5 - var3) / (-var9 + var11) + 2.0D;
            } else if (var5 == var11) {
                var13 = (var3 - var7) / (var11 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 + -var9);
            }
        }
        double var19 = var13 / 6.0D;
        this.field1650 = (int) (var19 * 256.0D);
        this.field1637 = (int) (var15 * 256.0D);
        if (this.field1637 < 0) {
            this.field1637 = 0;
        } else if (this.field1637 > 255) {
            this.field1637 = 255;
        }
        this.field1632 = (int) (var17 * 256.0D);
        if (this.field1632 < 0) {
            this.field1632 = 0;
        } else if (this.field1632 > 255) {
            this.field1632 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "(I)V")
    public static void method546(int arg0) {
        field1635 = null;
        field1629 = null;
        field1654 = null;
        field1647 = null;
        field1627 = null;
        field1636 = null;
        if (arg0 != 0) {
            method543(-72);
        }
        field1653 = null;
        field1625 = null;
        field1631 = null;
    }
}
