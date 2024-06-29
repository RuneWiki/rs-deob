import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class184 extends class37 {

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    private int field3775 = 4096;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "Ldd;")
    public static class35 field3774 = class180.method1196((byte) 126, "Freie Welt");

    @OriginalMember(owner = "client!te", name = "U", descriptor = "Ldd;")
    public static class35 field3778 = class180.method1196((byte) 127, "Schlie-8en");

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "I")
    public static int field3783 = 0;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "Ldd;")
    public static class35 field3781 = class180.method1196((byte) 126, "VOLL");

    @OriginalMember(owner = "client!te", name = "T", descriptor = "I")
    public static int field3777 = 0;

    @OriginalMember(owner = "client!te", name = "cb", descriptor = "Ldd;")
    private static class35 field3786 = class180.method1196((byte) -12, "Loading textures )2 ");

    @OriginalMember(owner = "client!te", name = "P", descriptor = "Ldd;")
    public static class35 field3773 = field3786;

    @OriginalMember(owner = "client!te", name = "V", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!te", name = "W", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!te", name = "ab", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!te", name = "bb", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!te", name = "db", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!te", name = "S", descriptor = "Lhb;")
    public static class72 field3776;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(BI)Ldd;")
    public static final class35 method1221(byte arg0, int arg1) {
        ++field3784;
        if (arg0 != -3) {
            field3786 = null;
        }
        return ~arg1 > -1000000000 ? class3.method19(arg1, -29578) : class143.field2998;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        ++field3787;
        if (arg0 == 0) {
            this.field3775 = arg2.method256((byte) -78);
        }
        if (arg1 != 1) {
            method1221((byte) 114, 39);
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class184() {
        super(1, true);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)Ltc;")
    public static final class182 method1222(int arg0, int arg1) {
        ++field3785;
        class182 var2 = (class182) class195.field3891.method817(true, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class58.field1445.method39(9, -1, arg1);
            class182 var4 = new class182();
            var4.field3752 = arg1;
            if (var3 != null) {
                var4.method1215(new class26(var3), -14357);
            }
            var4.method1212(true);
            class195.field3891.method816(var4, (long) arg1, 16);
            if (arg0 != -20643) {
                field3774 = null;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field3782;
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (arg0 != 75) {
            return null;
        } else {
            if (super.field816.field3661) {
                int[] var4 = this.method369(0, arg1 + -1 & class105.field2348, (byte) 124);
                int[] var5 = this.method369(0, arg1, (byte) 122);
                int[] var6 = this.method369(0, class105.field2348 & arg1 - -1, (byte) 123);
                for (int var7 = 0; class72.field1719 > var7; ++var7) {
                    int var8 = (var6[var7] + -var4[var7]) * this.field3775;
                    int var9 = (var5[var7 + 1 & class71.field1691] - var5[class71.field1691 & var7 + -1]) * this.field3775;
                    int var10 = var9 >> 12;
                    int var11 = var8 >> 12;
                    int var12 = var11 * var11 >> 12;
                    int var13 = var10 * var10 >> 12;
                    int var14 = (int) (4096.0D * Math.sqrt((double) ((var13 + 4096 - -var12) / 4096)));
                    int var15 = var14 != 0 ? 16777216 / var14 : 0;
                    var3[var7] = 4096 - var15;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILkd;Z)V")
    public static final void method1223(int arg0, int arg1, class102 arg2, boolean arg3) {
        if ((arg0 & 2) != 0) {
            int var4 = class172.field3441.method252(255);
            int var5 = class172.field3441.method252(255);
            arg2.method561(4, var4, var5, class89.field1988);
            arg2.field1616 = class89.field1988 + 300;
            arg2.field1621 = class172.field3441.method214((byte) -107);
        }
        ++field3780;
        if ((4 & arg0) != 0) {
            int var6 = class172.field3441.method217((byte) 72);
            byte[] var7 = new byte[var6];
            class26 var8 = new class26(var7);
            class172.field3441.method255((byte) -114, 0, var7, var6);
            class148.field3119[arg1] = var8;
            arg2.method762(99, var8);
        }
        if (~(arg0 & 1) != -1) {
            arg2.field1636 = class172.field3441.method256((byte) -78);
            if (~arg2.field1636 == -65536) {
                arg2.field1636 = -1;
            }
        }
        if (~(256 & arg0) != -1) {
            int var9 = class172.field3441.method214((byte) -102);
            int var10 = class172.field3441.method221(-94);
            arg2.method561(4, var9, var10, class89.field1988);
        }
        if (~(64 & arg0) != -1) {
            arg2.field1655 = class172.field3441.method248(!arg3);
            arg2.field1623 = class172.field3441.method250(28198);
        }
        if ((512 & arg0) != 0) {
            arg2.field1662 = class172.field3441.method252(255);
            arg2.field1657 = class172.field3441.method252(255);
            arg2.field1604 = class172.field3441.method214((byte) -112);
            arg2.field1639 = class172.field3441.method221(-124);
            arg2.field1650 = class172.field3441.method248(true) - -class89.field1988;
            arg2.field1634 = class172.field3441.method248(true) + class89.field1988;
            arg2.field1669 = class172.field3441.method221(-76);
            arg2.field1648 = 1;
            arg2.field1632 = 0;
        }
        if ((32 & arg0) != 0) {
            arg2.field1633 = class172.field3441.method236(0);
            if (arg2.field1633.method341(0, -65) == 126) {
                arg2.field1633 = arg2.field1633.method344(1, -26886);
                class190.method1252(arg2.field2254, 0, arg2.field1633, 2);
            } else if (class71.field1704 == arg2) {
                class190.method1252(arg2.field2254, 0, arg2.field1633, 2);
            }
            arg2.field1628 = 0;
            arg2.field1649 = 0;
            arg2.field1652 = 150;
        }
        if (~(1024 & arg0) != -1) {
            arg2.field1671 = class172.field3441.method256((byte) -78);
            int var11 = class172.field3441.method240(8);
            arg2.field1624 = 0;
            arg2.field1615 = (var11 & 65535) + class89.field1988;
            arg2.field1627 = var11 >> 16;
            arg2.field1666 = 0;
            if (~arg2.field1671 == -65536) {
                arg2.field1671 = -1;
            }
            if (~arg2.field1615 < ~class89.field1988) {
                arg2.field1666 = -1;
            }
        }
        if ((arg0 & 16) != 0) {
            int var12 = class172.field3441.method238((byte) 88);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = class172.field3441.method214((byte) -92);
            class109.method804(arg2, !arg3, var13, var12);
        }
        if ((128 & arg0) != 0) {
            int var14 = class172.field3441.method250(28198);
            int var15 = class172.field3441.method217((byte) 50);
            int var16 = class172.field3441.method214((byte) -85);
            int var17 = class172.field3441.field527;
            if (arg2.field2254 != null && arg2.field2281 != null) {
                boolean var18 = false;
                long var19 = arg2.field2254.method321(21830);
                if (var15 <= 1) {
                    for (int var21 = 0; var21 < class136.field2912; ++var21) {
                        if (class5.field82[var21] == var19) {
                            var18 = true;
                            break;
                        }
                    }
                }
                if (!var18 && ~class55.field1283 == -1) {
                    class2.field17.field527 = 0;
                    class172.field3441.method255((byte) -99, 0, class2.field17.field529, var16);
                    class2.field17.field527 = 0;
                    class35 var22 = class199.method1309(class110.method808(class2.field17, 7485).method357((byte) 125));
                    arg2.field1633 = var22.method340(-116);
                    arg2.field1628 = var14 >> 8;
                    arg2.field1652 = 150;
                    arg2.field1649 = 255 & var14;
                    if (~var15 != -3 && var15 != 3) {
                        if (~var15 != -2) {
                            class190.method1252(arg2.field2254, 0, var22, 2);
                        } else {
                            class190.method1252(class63.method529(new class35[] { class46.field985, arg2.field2254 }, (byte) 77), 0, var22, 1);
                        }
                    } else {
                        class190.method1252(class63.method529(new class35[] { class99.field2172, arg2.field2254 }, (byte) 111), 0, var22, 1);
                    }
                }
            }
            class172.field3441.field527 = var16 + var17;
        }
        if (arg3) {
            method1221((byte) -116, -56);
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
    public static void method1224(int arg0) {
        field3781 = null;
        field3778 = null;
        field3786 = null;
        int var1 = -51 % ((arg0 - 18) / 50);
        field3776 = null;
        field3774 = null;
        field3773 = null;
    }
}
