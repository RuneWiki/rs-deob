import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class81 {

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    private int field1642 = 0;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    private int field1644 = -1;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "Lbg;")
    private class18 field1646 = new class18();

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "Z")
    public boolean field1656 = false;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "[Lf;")
    private class51[] field1647;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "[[[I")
    private int[][][] field1637;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    private int field1648;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    private int field1641;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Ljd;")
    public static class92 field1640 = class202.method1325((byte) 90, "Bitte geben Sie Ihr Passwort ein)3");

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field1645 = 0;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field1633 = -1;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field1632 = -1;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "J")
    public static long field1651 = 0L;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Lrd;")
    public static class165 field1631 = null;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "Lo;")
    public static class134 field1650;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "Lud;")
    public static class192 field1653;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "[[[I")
    public static int[][][] field1643;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method548(byte arg0) {
        field1636++;
        if (arg0 > -55) {
            return null;
        } else if (this.field1648 == this.field1641) {
            for (int var2 = 0; var2 < this.field1648; var2++) {
                this.field1647[var2] = class9.field329;
            }
            return this.field1637;
        } else {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLrd;)V")
    public static final void method549(boolean arg0, class165 arg1) {
        field1634++;
        if (class59.field1230) {
            class188.method1211(arg1, 117);
            return;
        }
        if (class74.field1559 == 1 && class31.field705 >= 715 && field1645 >= 453) {
            class175.field3376 = !class175.field3376;
            if (class175.field3376) {
                class55.method320(-99);
            } else {
                class131.method866(1, false, 255, class73.field1539, field1653, 0);
            }
        }
        if (class159.field3169 == 5) {
            return;
        }
        class115.field2344++;
        if (class159.field3169 != 10) {
            return;
        }
        if (class158.field3137 != 2 && class72.field1532 == 0) {
            if (class74.field1559 == 1) {
                byte var2 = 5;
                byte var3 = 100;
                short var4 = 463;
                byte var5 = 35;
                if (var2 <= class31.field705 && class31.field705 <= var2 + var3 && var4 <= field1645 && var4 + var5 >= field1645) {
                    class48.method298(arg0);
                    return;
                }
            }
            if (class70.field1446 != null) {
                class48.method298(false);
            }
        }
        int var6 = class74.field1559;
        int var7 = class31.field705;
        int var8 = field1645;
        if (class110.field2240 == 0) {
            short var9 = 302;
            short var10 = 291;
            boolean var11 = false;
            if (var6 == 1 && var9 - 75 <= var7 && var9 + 75 >= var7 && var8 >= var10 - 20 && var8 <= var10 + 20) {
                class110.field2240 = 3;
                class29.field646 = 0;
            }
            short var12 = 462;
            if (class98.field1996 != 0) {
                while (class101.method698(-12501)) {
                    if (class34.field764 == 84) {
                        var11 = true;
                        break;
                    }
                }
            }
            if (var11 || var6 == 1 && var7 >= var12 - 75 && var7 <= var12 + 75 && var8 >= var10 - 20 && var10 + 20 >= var8) {
                class3.field171 = class80.field1629;
                class3.field184 = class69.field1413;
                class3.field175 = class69.field1405;
                class29.field646 = 0;
                class110.field2240 = 2;
            }
        } else if (class110.field2240 == 2) {
            short var13 = 302;
            short var14 = 231;
            int var21 = var14 + 30;
            short var15 = 321;
            if (var6 == 1 && var21 - 15 <= var8 && var21 > var8) {
                class29.field646 = 0;
            }
            var21 += 15;
            if (var6 == 1 && var21 - 15 <= var8 && var21 > var8) {
                class29.field646 = 1;
            }
            var21 += 15;
            if (var6 == 1 && var7 >= var13 - 75 && var13 + 75 >= var7 && var15 - 20 <= var8 && var15 + 20 >= var8) {
                class3.field181 = class3.field181.method614(0).method617(1);
                if (class3.field181.method640(!arg0) == 0) {
                    class94.method663(class69.field1411, class69.field1422, (byte) 64, class210.field4069);
                    return;
                }
                if (class3.field169.method640(true) == 0) {
                    class94.method663(class69.field1399, class69.field1401, (byte) 91, class101.field2079);
                    return;
                }
                class94.method663(class69.field1419, class69.field1391, (byte) 76, class15.field435);
                class213.method1385((byte) 70, 20);
                return;
            }
            short var16 = 462;
            if (var6 == 1 && var7 >= var16 - 75 && var16 + 75 >= var7 && var15 - 20 <= var8 && var8 <= var15 + 20) {
                class3.field169 = class3.field172;
                class110.field2240 = 0;
                class3.field181 = class3.field172;
            }
            label232: while (true) {
                boolean var17;
                do {
                    while (true) {
                        if (!class101.method698(-12501)) {
                            break label232;
                        }
                        var17 = false;
                        for (int var18 = 0; var18 < class130.field2618.method640(true); var18++) {
                            if (class120.field2426 == class130.field2618.method635((byte) 30, var18)) {
                                var17 = true;
                                break;
                            }
                        }
                        if (class29.field646 != 0) {
                            break;
                        }
                        if (class34.field764 == 85 && class3.field181.method640(true) > 0) {
                            class3.field181 = class3.field181.method629(class3.field181.method640(true) - 1, 0, 0);
                        }
                        if (class34.field764 == 84 || class34.field764 == 80) {
                            class29.field646 = 1;
                        }
                        if (var17 && class3.field181.method640(!arg0) < 12) {
                            class3.field181 = class3.field181.method618(-58, class120.field2426);
                        }
                    }
                } while (class29.field646 != 1);
                if (class34.field764 == 85 && class3.field169.method640(true) > 0) {
                    class3.field169 = class3.field169.method629(class3.field169.method640(true) - 1, 0, 0);
                }
                if (class34.field764 == 84 || class34.field764 == 80) {
                    class29.field646 = 0;
                }
                if (class98.field1996 != 0 && class34.field764 == 84) {
                    class3.field181 = class3.field181.method614(0).method617(1);
                    if (class3.field181.method640(true) == 0) {
                        class94.method663(class69.field1411, class69.field1422, (byte) 125, class210.field4069);
                        return;
                    }
                    if (class3.field169.method640(!arg0) == 0) {
                        class94.method663(class69.field1399, class69.field1401, (byte) 118, class101.field2079);
                        return;
                    }
                    class94.method663(class69.field1419, class69.field1391, (byte) 119, class15.field435);
                    class213.method1385((byte) 70, 20);
                    return;
                }
                if (var17 && class3.field169.method640(true) < 20) {
                    class3.field169 = class3.field169.method618(-100, class120.field2426);
                }
            }
        } else if (class110.field2240 == 3) {
            short var19 = 321;
            short var20 = 382;
            if (var6 == 1 && var7 >= var20 - 75 && var7 <= var20 + 75 && var19 - 20 <= var8 && var19 + 20 >= var8) {
                class110.field2240 = 0;
            }
        }
        if (arg0) {
            method550(68);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method550(int arg0) {
        field1643 = null;
        field1650 = null;
        field1640 = null;
        field1653 = null;
        if (arg0 != 24704) {
            method549(true, null);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIB)V")
    public static final void method551(int arg0, int arg1, byte arg2) {
        field1638++;
        if (class188.method1210(-18040, arg0)) {
            if (arg2 < 63) {
                field1632 = -115;
            }
            class39.method254(class60.field1256[arg0], arg1, -2);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public final void method552(int arg0) {
        for (int var2 = 0; var2 < this.field1648; var2++) {
            this.field1637[var2][0] = null;
            this.field1637[var2][1] = null;
            this.field1637[var2][2] = null;
            this.field1637[var2] = null;
        }
        this.field1637 = null;
        this.field1647 = null;
        field1635++;
        this.field1646.method109(arg0 + 66);
        this.field1646 = null;
        if (arg0 != -1) {
            this.method552(-121);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)[[I")
    public final int[][] method553(int arg0, int arg1) {
        if (arg1 != 0) {
            method551(28, -86, (byte) 69);
        }
        field1649++;
        if (this.field1648 == this.field1641) {
            this.field1656 = this.field1647[arg0] == null;
            this.field1647[arg0] = class9.field329;
            return this.field1637[arg0];
        } else if (this.field1648 == 1) {
            this.field1656 = this.field1644 != arg0;
            this.field1644 = arg0;
            return this.field1637[0];
        } else {
            class51 var3 = this.field1647[arg0];
            if (this.field1656 = var3 == null) {
                if (this.field1648 <= this.field1642) {
                    class51 var4 = (class51) this.field1646.method104(false);
                    var3 = new class51(arg0, var4.field1095);
                    this.field1647[var4.field1086] = null;
                    var4.method1370(122);
                } else {
                    var3 = new class51(arg0, this.field1642);
                    this.field1642++;
                }
                this.field1647[arg0] = var3;
            }
            this.field1646.method102((byte) 118, var3);
            return this.field1637[var3.field1095];
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(III)V")
    public class81(int arg0, int arg1, int arg2) {
        this.field1647 = new class51[arg1];
        this.field1637 = new int[arg0][3][arg2];
        this.field1648 = arg0;
        this.field1641 = arg1;
    }
}
