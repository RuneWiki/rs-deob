import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class80 {

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field1481 = 0;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field1484 = 0;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field1487 = 0;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "Z")
    public static boolean field1489 = true;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Lid;")
    public static class149 field1482 = class60.method382(": ", (byte) 28);

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field1486 = -1;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public static final void method601(int arg0) {
        class19.field289.method1290((byte) -124);
        if (arg0 != 1) {
            method606((byte) -13);
        }
        field1483++;
        class25.field373.method1290((byte) 122);
        class102.field1796.method1290((byte) -117);
        class279.field4981.method1290((byte) 19);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lid;ZI)V")
    public static final void method602(class149 arg0, boolean arg1, int arg2) {
        field1485++;
        if (arg2 != 21105) {
            method606((byte) 71);
        }
        class149 var3 = arg0.method1018(8238);
        int var4 = 0;
        short[] var5 = new short[16];
        for (int var6 = 0; var6 < class44.field678; var6++) {
            class261 var9 = class226.method1516(var6, -28322);
            if ((!arg1 || var9.field4654) && var9.field4607 == -1 && var9.field4621 == -1 && var9.field4609 == 0 && var9.field4604.method1018(arg2 ^ 0x725F).method1036((byte) -128, var3) != -1) {
                if (var4 >= 250) {
                    class151.field2753 = null;
                    class228.field3997 = -1;
                    return;
                }
                if (var4 >= var5.length) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var4; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var4++] = (short) var6;
            }
        }
        class228.field3997 = var4;
        class196.field3516 = 0;
        class149[] var7 = new class149[class228.field3997];
        class151.field2753 = var5;
        for (int var8 = 0; var8 < class228.field3997; var8++) {
            var7[var8] = class226.method1516(var5[var8], -28322).field4604;
        }
        class97.method708(class151.field2753, -4097, var7);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public static final void method603(byte arg0) {
        if (arg0 != 88) {
            field1489 = true;
        }
        while (class11.field150.method164(class68.field1188, 107) >= 11) {
            int var1 = class11.field150.method154((byte) 9, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class107.field1851[var1] == null) {
                var2 = true;
                class107.field1851[var1] = new class127();
                if (class236.field4133[var1] != null) {
                    class107.field1851[var1].method889(class236.field4133[var1], -100);
                }
            }
            class251.field4407[class253.field4432++] = var1;
            class127 var3 = class107.field1851[var1];
            var3.field2403 = class118.field2022;
            int var4 = class11.field150.method154((byte) 9, 1);
            if (var4 == 1) {
                class255.field4462[class162.field3013++] = var1;
            }
            int var5 = class11.field150.method154((byte) 9, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class163.field3023[class11.field150.method154((byte) 9, 3)];
            if (var2) {
                var3.field2335 = var3.field2354 = var6;
            }
            int var7 = class11.field150.method154((byte) 9, 1);
            int var8 = class11.field150.method154((byte) 9, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method888(var7 == 1, class77.field1449.field2400[0] + var8, class77.field1449.field2333[0] + var5, 14508);
        }
        field1491++;
        class11.field150.method159(0);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method604(byte arg0, int arg1) {
        field1490++;
        if (arg1 == 100 && class165.field3068 > 0) {
            byte[] var2 = class174.field3205[--class165.field3068];
            class174.field3205[class165.field3068] = null;
            return var2;
        } else if (arg1 == 5000 && class84.field1540 > 0) {
            byte[] var3 = class271.field4882[--class84.field1540];
            class271.field4882[class84.field1540] = null;
            return var3;
        } else if (arg1 == 30000 && class164.field3045 > 0) {
            byte[] var4 = class207.field3713[--class164.field3045];
            class207.field3713[class164.field3045] = null;
            return var4;
        } else {
            int var5 = -8 % ((-arg0 - 45) / 53);
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V")
    public static final void method605(int arg0, int arg1, int arg2) {
        field1492++;
        class219 var3 = class15.method94(31473, arg2);
        int var4 = var3.field3866;
        int var5 = var3.field3860;
        int var6 = var3.field3865;
        int var7 = class232.field4080[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        if (arg1 < 123) {
            field1487 = -17;
        }
        int var8 = var7 << var5;
        class28.method160(10, var4, class61.field1095[var4] & ~var8 | arg0 << var5 & var8);
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V")
    public static final void method606(byte arg0) {
        int var1 = class228.field3996;
        field1488++;
        int var2 = class240.field4194;
        int var3 = class82.field1499;
        int var4 = 6116423;
        int var5 = client.field2845;
        class72.method459(var2, var1, var3, var5, var4);
        class72.method459(var2 + 1, var1 + 1, var3 - 2, 16, 0);
        class72.method457(var2 + 1, var1 - -18, var3 - 2, var5 - 19, 0);
        class173.field3180.method1168(class198.field3603, var2 + 3, var1 - -14, var4, -1);
        int var6 = class49.field883;
        int var7 = class285.field5068;
        int var8 = 0;
        if (arg0 != -2) {
            return;
        }
        while (var8 < class60.field1092) {
            int var9 = (class60.field1092 - var8 - 1) * 15 + var1 + 31;
            int var10 = 16777215;
            if (var2 < var6 && var6 < (var2 + var3) && (var9 - 13) < var7 && var7 < var9 + 3) {
                var10 = 16776960;
            }
            class173.field3180.method1168(class59.method365(var8, (byte) 100), var2 + 3, var9, var10, 0);
            var8++;
        }
        class44.method257(class228.field3996, client.field2845, class82.field1499, -356, class240.field4194);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
    public static void method607(boolean arg0) {
        field1482 = null;
        if (!arg0) {
            method607(true);
        }
    }
}
