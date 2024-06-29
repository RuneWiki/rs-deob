import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class91 extends class105 {

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "Ldg;")
    public static class276 field1612 = new class276(30);

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "Lvf;")
    private static class265 field1618 = class87.method582(-46, "fr");

    @OriginalMember(owner = "client!sa", name = "gb", descriptor = "Lvf;")
    private static class265 field1626 = class87.method582(-46, "pt");

    @OriginalMember(owner = "client!sa", name = "fb", descriptor = "Lvf;")
    private static class265 field1625 = class87.method582(-46, ")3en");

    @OriginalMember(owner = "client!sa", name = "ib", descriptor = "Lvf;")
    private static class265 field1628 = class87.method582(-46, ")3de");

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "Lvf;")
    private static class265 field1619 = class87.method582(-46, "German");

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "Lvf;")
    private static class265 field1624 = class87.method582(-46, "French");

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "Lvf;")
    private static class265 field1621 = class87.method582(-46, "en");

    @OriginalMember(owner = "client!sa", name = "jb", descriptor = "Lvf;")
    private static class265 field1629 = class87.method582(-46, ")3fr");

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "Lvf;")
    private static class265 field1617 = class87.method582(-46, "de");

    @OriginalMember(owner = "client!sa", name = "kb", descriptor = "[S")
    public static short[] field1630 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!sa", name = "mb", descriptor = "Z")
    public static boolean field1632 = false;

    @OriginalMember(owner = "client!sa", name = "hb", descriptor = "Lvf;")
    private static class265 field1627 = class87.method582(-46, ")3pt");

    @OriginalMember(owner = "client!sa", name = "ob", descriptor = "Lvf;")
    public static class265 field1634 = class87.method582(-46, "headicons_prayer");

    @OriginalMember(owner = "client!sa", name = "lb", descriptor = "Lvf;")
    private static class265 field1631 = class87.method582(-46, "English");

    @OriginalMember(owner = "client!sa", name = "nb", descriptor = "Lvf;")
    public static class265 field1633 = class87.method582(-46, "Versteckt");

    @OriginalMember(owner = "client!sa", name = "rb", descriptor = "[I")
    public static int[] field1637 = new int[32];

    @OriginalMember(owner = "client!sa", name = "qb", descriptor = "Lvf;")
    public static class265 field1636 = class87.method582(-46, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!sa", name = "sb", descriptor = "Lvf;")
    private static class265 field1638 = class87.method582(-46, "Portuguese");

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "[Lvf;")
    private static class265[] field1620 = new class265[] { field1631, field1619, field1624, field1638 };

    @OriginalMember(owner = "client!sa", name = "pb", descriptor = "[Lvf;")
    private static class265[] field1635 = new class265[] { field1625, field1628, field1629, field1627 };

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "[Lvf;")
    public static class265[] field1623 = new class265[] { field1621, field1617, field1618, field1626 };

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "Lfl;")
    public static class192 field1614;

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "[Loe;")
    public static class108[] field1622;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "[Ldf;")
    private class138[] field1607;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([[II)V")
    private final void method621(int[][] arg0, int arg1) {
        if (arg1 >= -19) {
            field1636 = null;
        }
        int var3 = class94.field1668;
        ++field1610;
        int var4 = class102.field1804;
        class138.method956((byte) -84, arg0);
        class21.method202(57, class11.field377, 0, 0, class1.field20);
        if (this.field1607 != null) {
            for (int var5 = 0; this.field1607.length > var5; ++var5) {
                class138 var6 = this.field1607[var5];
                int var7 = var6.field2527;
                int var8 = var6.field2526;
                if (~var8 > -1) {
                    if (~var7 <= -1) {
                        var6.method380(var3, 10, var4);
                    }
                } else if (~var7 > -1) {
                    var6.method378(var4, var3, false);
                } else {
                    var6.method375(var3, (byte) -106, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class91() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (arg0 == 0) {
            this.field1607 = new class138[arg2.method920((byte) 54)];
            for (int var4 = 0; ~this.field1607.length < ~var4; ++var4) {
                int var5 = arg2.method920((byte) 66);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field1607[var4] = class207.method1421((byte) 21, arg2);
                            }
                        } else {
                            this.field1607[var4] = class65.method471(arg2, false);
                        }
                    } else {
                        this.field1607[var4] = class272.method1856(class100.method662(arg1, -256), arg2);
                    }
                } else {
                    this.field1607[var4] = class102.method684(arg2, (byte) 127);
                }
            }
        } else if (arg0 == 1) {
            super.field1853 = ~arg2.method920((byte) 47) == -2;
        }
        ++field1615;
        if (arg1 != 255) {
            field1617 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)I")
    public static final int method622(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)[[I")
    public final int[][] method18(int arg0, byte arg1) {
        ++field1613;
        if (arg1 > -110) {
            return null;
        } else {
            int[][] var3 = super.field1870.method569((byte) -112, arg0);
            if (super.field1870.field1567) {
                int var4 = class94.field1668;
                int var5 = class102.field1804;
                int[][][] var6 = super.field1870.method570((byte) -33);
                int[][] var7 = new int[var5][var4];
                this.method621(var7, -88);
                for (int var8 = 0; ~var8 > ~class102.field1804; ++var8) {
                    int[][] var9 = var6[var8];
                    int[] var10 = var7[var8];
                    int[] var11 = var9[1];
                    int[] var12 = var9[2];
                    int[] var13 = var9[0];
                    for (int var14 = 0; ~var14 > ~class94.field1668; ++var14) {
                        int var15 = var10[var14];
                        var12[var14] = class203.method1395(255, var15) << 4;
                        var11[var14] = class203.method1395(65280, var15) >> 4;
                        var13[var14] = class203.method1395(var15 >> 12, 4080);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(IZ)V")
    public static final void method623(int arg0, boolean arg1) {
        ++field1608;
        int var2 = 82 / ((-51 - arg0) / 58);
        for (int var3 = 0; ~class48.field1027 < ~var3; ++var3) {
            class23 var4 = class4.field67[class93.field1646[var3]];
            long var5 = 536870912L | (long) class93.field1646[var3] << 32;
            if (var4 != null && var4.method227((byte) 110) && var4.field681.field4748 == arg1 && var4.field681.method1824(6146)) {
                int var7 = var4.field2600 >> 7;
                int var8 = var4.field2564 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (~var4.method822(2) == -2 && (127 & var4.field2600) == 64 && ~(127 & var4.field2564) == -65) {
                        if (~class81.field1524[var7][var8] == ~class257.field4401) {
                            continue;
                        }
                        class81.field1524[var7][var8] = class257.field4401;
                    }
                    if (!var4.field681.field4775) {
                        var5 |= Long.MIN_VALUE;
                    }
                    var4.field2560 = class67.method483(var4.field2564, -124, var4.field2600, class216.field3902);
                    class78.method543(class216.field3902, var4.field2600, var4.field2564, var4.field2560, -4 + var4.method822(2) * 64, var4, var4.field2563, var5, var4.field2544);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(Z)Z")
    public static final boolean method624(boolean arg0) {
        ++field1616;
        class190 var1 = class94.field1673;
        synchronized (class94.field1673) {
            if (~class211.field3799 == ~class176.field3138) {
                return false;
            } else {
                class130.field2344 = class195.field3500[class176.field3138];
                class239.field4172 = class75.field1430[class176.field3138];
                if (arg0) {
                    method624(false);
                }
                class176.field3138 = class176.field3138 + 1 & 127;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        if (arg0 != 8055) {
            return null;
        } else {
            ++field1611;
            int[] var3 = super.field1862.method458(arg1, false);
            if (super.field1862.field1236) {
                this.method621(super.field1862.method459(0), arg0 + -8127);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(IB)I")
    public static final int method625(int arg0, byte arg1) {
        ++field1606;
        return arg1 <= 114 ? 33 : arg0 >>> 10;
    }

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)V")
    public static void method626(int arg0) {
        field1622 = null;
        field1634 = null;
        field1612 = null;
        field1627 = null;
        field1619 = null;
        field1618 = null;
        field1614 = null;
        int var1 = -2 / ((arg0 - 45) / 63);
        field1628 = null;
        field1629 = null;
        field1620 = null;
        field1626 = null;
        field1638 = null;
        field1633 = null;
        field1631 = null;
        field1617 = null;
        field1636 = null;
        field1630 = null;
        field1621 = null;
        field1635 = null;
        field1624 = null;
        field1623 = null;
        field1625 = null;
        field1637 = null;
    }
}
