import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class112 extends class134 {

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public static int field1479 = 0;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "Lsc;")
    public static class351 field1480 = new class351();

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(DI)V", line = 3)
    public static final void method749(double arg0, int arg1) {
        if (class108.field1437 != arg0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class415.field5859[var3] = ~var4 < -256 ? 255 : var4;
            }
            class108.field1437 = arg0;
        }
        if (arg1 == 0) {
            ++field1486;
        }
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(ILkda;)V", line = 30)
    public class112(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(B)I", line = 33)
    public final int method750(byte arg0) {
        if (arg0 <= 119) {
            method753(58);
        }
        ++field1481;
        return super.field1708;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V", line = 44)
    public final void method60(byte arg0) {
        if (arg0 > 118) {
            ++field1482;
            if (super.field1708 < 0 && super.field1708 > 127) {
                super.field1708 = this.method58(0);
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)V", line = 57)
    public static void method751(int arg0) {
        field1480 = null;
        if (arg0 < 83) {
            method751(66);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)V", line = 72)
    public final void method55(int arg0, int arg1) {
        int var3 = 55 / ((arg0 - -26) / 41);
        super.field1708 = arg1;
        ++field1484;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILnq;)V", line = 88)
    public static final void method752(int arg0, class462 arg1) {
        ++field1483;
        if (arg0 != -256) {
            method753(116);
        }
        class78.field1057 = arg1;
    }

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)V", line = 103)
    public static final void method753(int arg0) {
        ++field1485;
        for (int var1 = 0; ~class387.field5458 < ~var1; ++var1) {
            class431.field6085[var1] = null;
        }
        class387.field5458 = 0;
        for (int var2 = 0; ~class307.field4170 < ~var2; ++var2) {
            for (int var42 = 0; ~class68.field743 < ~var42; ++var42) {
                for (int var43 = 0; var43 < class480.field6629; ++var43) {
                    class624 var44 = class77.field947[var2][var43][var42];
                    if (var44 != null) {
                        if (var44.field8732 > 0) {
                            var44.field8732 = (short) (var44.field8732 * -1);
                        }
                        if (var44.field8739 > 0) {
                            var44.field8739 = (short) (var44.field8739 * -1);
                        }
                    }
                }
            }
        }
        int var3 = 0;
        if (arg0 >= -36) {
            field1479 = 62;
        }
        while (class307.field4170 > var3) {
            for (int var4 = 0; ~class68.field743 < ~var4; ++var4) {
                for (int var5 = 0; class480.field6629 > var5; ++var5) {
                    class624 var6 = class77.field947[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class77.field947[0][var5][var4] != null && class77.field947[0][var5][var4].field8734 != null;
                        if (var6.field8739 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var11 = var3;
                            class624 var12 = class77.field947[var3][var5][var4 + -1];
                            int var13 = class86.field1182[var3].method1685(var4, -12639, var5);
                            while (~var8 < -1 && var12 != null && var12.field8739 < 0 && ~var6.field8739 == ~var12.field8739 && ~var6.field8733 == ~var12.field8733 && ~var13 == ~class86.field1182[var3].method1685(var8 + -1, -12639, var5) && (~(var8 - 1) >= -1 || var13 == class86.field1182[var3].method1685(var8 - 2, -12639, var5))) {
                                --var8;
                                var12 = class77.field947[var3][var5][var8 + -1];
                            }
                            for (class624 var14 = class77.field947[var3][var5][var4 - -1]; ~var9 > ~class480.field6629 && var14 != null && ~var14.field8739 > -1 && var6.field8739 == var14.field8739 && ~var6.field8733 == ~var14.field8733 && class86.field1182[var3].method1685(var9 + 1, -12639, var5) == var13 && (~(var9 + 1) <= ~class480.field6629 || ~var13 == ~class86.field1182[var3].method1685(var9 + 2, -12639, var5)); var14 = class77.field947[var3][var5][var9 + 1]) {
                                ++var9;
                            }
                            int var15 = -var3 + var3 + 1;
                            int var16 = class86.field1182[!var7 ? var3 : var3 + 1].method1685(var8, -12639, var5);
                            int var17 = var6.field8739 * var15 + var16;
                            int var18 = class86.field1182[var7 ? var3 - -1 : var3].method1685(var9 + 1, -12639, var5);
                            int var19 = var6.field8739 * var15 + var18;
                            int var20 = var5 << class443.field6172;
                            int var21 = var8 << class443.field6172;
                            int var22 = (var9 << class443.field6172) + class601.field8373;
                            class431.field6085[class387.field5458++] = new class620(1, var3, var20 - -var6.field8733, var6.field8733 + var20, var6.field8733 + var20, var6.field8733 + var20, var16, var18, var19, var17, var21, var22, var22, var21);
                            for (int var23 = var3; ~var23 >= ~var11; ++var23) {
                                for (int var24 = var8; ~var24 >= ~var9; ++var24) {
                                    class77.field947[var23][var5][var24].field8739 = (short) (class77.field947[var23][var5][var24].field8739 * -1);
                                }
                            }
                        }
                        if (~var6.field8732 > -1) {
                            int var25 = var5;
                            int var26 = var5;
                            int var28 = var3;
                            class624 var29 = class77.field947[var3][var5 + -1][var4];
                            int var30 = class86.field1182[var3].method1685(var4, -12639, var5);
                            while (~var25 < -1 && var29 != null && ~var29.field8732 > -1 && var6.field8732 == var29.field8732 && ~var6.field8727 == ~var29.field8727 && var30 == class86.field1182[var3].method1685(var4, -12639, var25 + -1) && (var25 + -1 <= 0 || ~class86.field1182[var3].method1685(var4, -12639, var25 - 2) == ~var30)) {
                                --var25;
                                var29 = class77.field947[var3][var25 - 1][var4];
                            }
                            for (class624 var31 = class77.field947[var3][var5 + 1][var4]; ~var26 > ~class68.field743 && var31 != null && ~var31.field8732 > -1 && ~var6.field8732 == ~var31.field8732 && var6.field8727 == var31.field8727 && class86.field1182[var3].method1685(var4, -12639, var26 + 1) == var30 && (~(var26 + 1) <= ~class68.field743 || ~var30 == ~class86.field1182[var3].method1685(var4, -12639, var26 - -2)); var31 = class77.field947[var3][var26 + 1][var4]) {
                                ++var26;
                            }
                            int var32 = var3 - -1 + -var3;
                            int var33 = class86.field1182[var7 ? var3 + 1 : var3].method1685(var4, -12639, var25);
                            int var34 = var33 - -(var6.field8732 * var32);
                            int var35 = class86.field1182[var7 ? var3 + 1 : var3].method1685(var4, -12639, var26 + 1);
                            int var36 = var6.field8732 * var32 + var35;
                            int var37 = var25 << class443.field6172;
                            int var38 = (var26 << class443.field6172) + class601.field8373;
                            int var39 = var4 << class443.field6172;
                            class431.field6085[class387.field5458++] = new class620(2, var3, var37, var38, var38, var37, var33, var35, var36, var34, var39 - -var6.field8727, var6.field8727 + var39, var6.field8727 + var39, var6.field8727 + var39);
                            for (int var40 = var3; ~var28 <= ~var40; ++var40) {
                                for (int var41 = var25; ~var41 >= ~var26; ++var41) {
                                    class77.field947[var40][var41][var4].field8732 = (short) (class77.field947[var40][var41][var4].field8732 * -1);
                                }
                            }
                        }
                    }
                }
            }
            ++var3;
        }
        class414.field5853 = true;
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lkda;)V", line = 329)
    public class112(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(B)V", line = 332)
    public static final void method754(byte arg0) {
        class414.field5853 = false;
        class501.field6815 = 0;
        class435.field6105 = new int[class307.field4170][class68.field743 + 1][class480.field6629 - -1];
        class282.field3738 = 0;
        class393.field5575 = new class620[1000];
        class431.field6085 = new class620[2000];
        class462.field6395 = new class620[500];
        class389.field5483 = class601.field8373;
        ++field1488;
        class387.field5458 = 0;
        class60.field631 = 0;
        class137.field1746 = class601.field8373;
        class743.field10333 = new class620[500];
        if (class22.field158 instanceof class694) {
            class314.field4236 = false;
        } else {
            class314.field4236 = true;
        }
        if (arg0 != 102) {
            field1479 = 61;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)I", line = 363)
    public final int method58(int arg0) {
        if (arg0 != 0) {
            return -62;
        } else {
            ++field1487;
            return 127;
        }
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(II)I", line = 375)
    public final int method57(int arg0, int arg1) {
        ++field1489;
        return arg1 != 29053 ? 3 : 1;
    }
}
