import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class261 {

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Lhe;")
    public static class19 field4614 = new class19(8);

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field4617 = 127;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field4619 = -1;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Lsb;")
    public static class221 field4616 = new class221(50);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "[Z")
    public static boolean[] field4615;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(DZ)V")
    public static final void method1763(double arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field4611++;
        if (class2.field91 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
            class118.field2120[var3] = var4 <= 255 ? var4 : 255;
        }
        class2.field91 = arg0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lmi;IIII)V")
    public static final void method1764(class255 arg0, int arg1, int arg2, int arg3, int arg4) {
        field4608++;
        if (class157.field2745 >= 400) {
            return;
        }
        if (arg0.field4516 != null) {
            arg0 = arg0.method1717(false);
        }
        if (arg0 == null || !arg0.field4466) {
            return;
        }
        class280 var5 = arg0.field4455;
        if (arg0.field4490 != 0) {
            class280 var6 = class283.field4992 == 1 ? class203.field3526 : class268.field4703;
            var5 = class30.method266(new class280[] { var5, class97.method676(81, arg0.field4490, class262.field4631.field2455), class64.field1067, var6, class249.method1685((byte) 121, arg0.field4490), class19.field347 }, (byte) -87);
        }
        if (arg2 != 34) {
            return;
        }
        if (class112.field1836 == 1) {
            class184.method1276(arg4, class182.field3199, arg2 + 6445, (short) 43, class248.field4347, (long) arg1, class30.method266(new class280[] { class48.field791, class276.field4783, var5 }, (byte) -87), arg3);
            class88.field1433++;
        } else if (!class263.field4647) {
            class206.field3572++;
            class280[] var7 = arg0.field4495;
            if (class54.field888) {
                var7 = class234.method1575((byte) -88, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class283.field4992 != 0 || !var7[var8].method1887((byte) 32, class271.field4737))) {
                        class136.field2390++;
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 44;
                        }
                        int var10 = -1;
                        if (arg0.field4461 == var8) {
                            var10 = arg0.field4470;
                        }
                        if (arg0.field4488 == var8) {
                            var10 = arg0.field4457;
                        }
                        if (var8 == 1) {
                            var9 = 6;
                        }
                        if (var8 == 2) {
                            var9 = 35;
                        }
                        if (var8 == 3) {
                            var9 = 34;
                        }
                        if (var8 == 4) {
                            var9 = 36;
                        }
                        class184.method1276(arg4, var7[var8], 6479, var9, var10, (long) arg1, class30.method266(new class280[] { class74.field1228, var5 }, (byte) -87), arg3);
                    }
                }
            }
            if (class283.field4992 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].method1887((byte) 32, class271.field4737)) {
                        class264.field4650++;
                        short var12 = 0;
                        short var13 = 0;
                        if (class262.field4631.field2455 < arg0.field4490) {
                            var12 = 2000;
                        }
                        if (var11 == 0) {
                            var13 = 44;
                        }
                        if (var11 == 1) {
                            var13 = 6;
                        }
                        if (var11 == 2) {
                            var13 = 35;
                        }
                        if (var11 == 3) {
                            var13 = 34;
                        }
                        if (var11 == 4) {
                            var13 = 36;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class184.method1276(arg4, var7[var11], 6479, var13, arg0.field4528, (long) arg1, class30.method266(new class280[] { class74.field1228, var5 }, (byte) -87), arg3);
                    }
                }
            }
            class184.method1276(arg4, class126.field2214, 6479, (short) 1003, class127.field2225, (long) arg1, class30.method266(new class280[] { class74.field1228, var5 }, (byte) -87), arg3);
        } else if ((class167.field2931 & 0x2) == 2) {
            class184.method1276(arg4, class90.field1473, arg2 + 6445, (short) 9, -1, (long) arg1, class30.method266(new class280[] { class268.field4702, class276.field4783, var5 }, (byte) -87), arg3);
            class52.field848++;
            return;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)I")
    public static final int method1765(int arg0, int arg1, int arg2) {
        class201 var3 = (class201) class103.field1708.method150((long) arg0, 95);
        field4618++;
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = 0;
            if (arg1 >= -51) {
                method1767((byte) -24, 5, (class113) null, 11);
            }
            while (var5 < var3.field3520.length) {
                if (var3.field3511[var5] == arg2) {
                    var4 += var3.field3520[var5];
                }
                var5++;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lua;III)V")
    public static final void method1766(class113 arg0, int arg1, int arg2, int arg3) {
        field4609++;
        if (class57.field927 != null || class31.field582 || arg0 == null || class43.method331(arg0, true) == null) {
            return;
        }
        class57.field927 = arg0;
        class264.field4657 = class43.method331(arg0, true);
        class105.field1754 = arg2;
        class108.field1783 = arg3;
        class109.field1797 = arg1;
        class164.field2883 = false;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BILua;I)V")
    public static final void method1767(byte arg0, int arg1, class113 arg2, int arg3) {
        field4610++;
        if (class157.field2745 < 2 && class112.field1836 == 0 && !class263.field4647) {
            return;
        }
        if (arg0 < 96) {
            field4616 = null;
        }
        class280 var4 = class131.method910((byte) -116);
        if (arg2 == null) {
            int var5 = class54.field890.method537(var4, arg3 + 4, arg1 + 15, 16777215, 0, class34.field634, class89.field1436);
            class49.method365(arg1, arg3 + 4, (byte) -65, class54.field890.method528(var4) + var5, 15);
            return;
        }
        class72 var6 = arg2.method803(-98, class108.field1777);
        if (var6 == null) {
            var6 = class54.field890;
        }
        var6.method526(var4, arg3, arg1, arg2.field1869, arg2.field1995, arg2.field1921, arg2.field1966, arg2.field1872, arg2.field1868, class34.field634, class89.field1436, class104.field1736);
        class49.method365(class104.field1736[1], class104.field1736[0], (byte) -65, class104.field1736[2], class104.field1736[3]);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)Z")
    public static final boolean method1768(int arg0) {
        if (arg0 < 37) {
            field4615 = null;
        }
        field4612++;
        if (class255.field4481) {
            try {
                if ((Boolean) class150.field2609.method1875(class118.field2117.field3473, true)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
    public static final void method1769(boolean arg0) {
        if (!arg0) {
            field4613++;
            class193.field3413.method1485((byte) -117);
            class97.field1552.method1485((byte) -88);
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public static void method1770(int arg0) {
        int var1 = 68 % ((arg0 + 4) / 34);
        field4614 = null;
        field4616 = null;
        field4615 = null;
    }
}
