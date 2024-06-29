import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class215 extends class287 {

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "J")
    public long field3789;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "Lmh;")
    public static class128 field3782 = class22.method156(124, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "Lmh;")
    public static class128 field3785 = class22.method156(124, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public static int field3788 = 0;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V", line = 12)
    public static final void method1486(int arg0) {
        class217.method1498((byte) -29, 0, 0);
        int var1 = 113 % ((arg0 + 22) / 61);
        field3781++;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V", line = 28)
    public static final void method1487(byte arg0) {
        class37.field748.method1834(17);
        field3784++;
        if (arg0 >= -98) {
            field3787 = 122;
        }
        class99.field1713.method1834(17);
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V", line = 43)
    public static void method1488(int arg0) {
        field3782 = null;
        field3785 = null;
        if (arg0 != 0) {
            method1488(-53);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "()V", line = 54)
    public static final void method1489() {
        class226.field3955 = 0;
        label194: for (int var0 = 0; var0 < class240.field4094; var0++) {
            class96 var1 = class266.field4612[var0];
            if (class94.field1593 != null) {
                for (int var2 = 0; var2 < class94.field1593.length; var2++) {
                    if (class94.field1593[var2] != -1000000 && (var1.field1623 <= class94.field1593[var2] || var1.field1616 <= class94.field1593[var2]) && (var1.field1618 <= class115.field1933[var2] || var1.field1633 <= class115.field1933[var2]) && (var1.field1618 >= class170.field2979[var2] || var1.field1633 >= class170.field2979[var2]) && (var1.field1619 <= class42.field862[var2] || var1.field1625 <= class42.field862[var2]) && (var1.field1619 >= class194.field3393[var2] || var1.field1625 >= class194.field3393[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field1614 == 1) {
                int var3 = var1.field1622 + class96.field1634 - class145.field2488;
                if (var3 >= 0 && var3 <= class96.field1634 + class96.field1634) {
                    int var4 = var1.field1635 + class96.field1634 - class217.field3813;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field1628 + class96.field1634 - class217.field3813;
                    if (var5 > class96.field1634 + class96.field1634) {
                        var5 = class96.field1634 + class96.field1634;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class183.field3211[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class260.field4501 - var1.field1618;
                        if (var7 > 32) {
                            var1.field1630 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field1630 = 2;
                            var7 = -var7;
                        }
                        var1.field1640 = (var1.field1619 - class156.field2682 << 8) / var7;
                        var1.field1621 = (var1.field1625 - class156.field2682 << 8) / var7;
                        var1.field1624 = (var1.field1623 - class166.field2847 << 8) / var7;
                        var1.field1615 = (var1.field1616 - class166.field2847 << 8) / var7;
                        class144.field2472[class226.field3955++] = var1;
                    }
                }
            } else if (var1.field1614 == 2) {
                int var8 = var1.field1635 + class96.field1634 - class217.field3813;
                if (var8 >= 0 && var8 <= class96.field1634 + class96.field1634) {
                    int var9 = var1.field1622 + class96.field1634 - class145.field2488;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field1620 + class96.field1634 - class145.field2488;
                    if (var10 > class96.field1634 + class96.field1634) {
                        var10 = class96.field1634 + class96.field1634;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class183.field3211[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class156.field2682 - var1.field1619;
                        if (var12 > 32) {
                            var1.field1630 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field1630 = 4;
                            var12 = -var12;
                        }
                        var1.field1636 = (var1.field1618 - class260.field4501 << 8) / var12;
                        var1.field1627 = (var1.field1633 - class260.field4501 << 8) / var12;
                        var1.field1624 = (var1.field1623 - class166.field2847 << 8) / var12;
                        var1.field1615 = (var1.field1616 - class166.field2847 << 8) / var12;
                        class144.field2472[class226.field3955++] = var1;
                    }
                }
            } else if (var1.field1614 == 4) {
                int var13 = var1.field1623 - class166.field2847;
                if (var13 > 128) {
                    int var14 = var1.field1635 + class96.field1634 - class217.field3813;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field1628 + class96.field1634 - class217.field3813;
                    if (var15 > class96.field1634 + class96.field1634) {
                        var15 = class96.field1634 + class96.field1634;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field1622 + class96.field1634 - class145.field2488;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field1620 + class96.field1634 - class145.field2488;
                        if (var17 > class96.field1634 + class96.field1634) {
                            var17 = class96.field1634 + class96.field1634;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class183.field3211[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field1630 = 5;
                            var1.field1636 = (var1.field1618 - class260.field4501 << 8) / var13;
                            var1.field1627 = (var1.field1633 - class260.field4501 << 8) / var13;
                            var1.field1640 = (var1.field1619 - class156.field2682 << 8) / var13;
                            var1.field1621 = (var1.field1625 - class156.field2682 << 8) / var13;
                            class144.field2472[class226.field3955++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)V", line = 283)
    public static final void method1490(byte arg0, int arg1) {
        field3783++;
        class259 var2 = class94.field1591;
        synchronized (class94.field1591) {
            class50.field991 = arg1;
        }
        if (arg0 != 106) {
            method1487((byte) -97);
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 298)
    public class215() {
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(J)V", line = 300)
    public class215(long arg0) {
        this.field3789 = arg0;
    }
}
