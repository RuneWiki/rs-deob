import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class115 extends class71 {

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "I")
    public static int field1736 = 0;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    public int field1728;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
    public int field1735;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "Lkb;")
    public static class39 field1732;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method797(int arg0, byte arg1) {
        field1733++;
        class109.method755(class109.field1632, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        if (arg1 == 86) {
            class109.method748(-50.0F, -60.0F, -50.0F);
            class109.method751(class109.field1628, 0, false);
            class109.method753();
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V", line = 21)
    public static final void method798(int arg0, int arg1, int arg2) {
        field1734++;
        if (arg0 != -1) {
            method802((byte) 108);
        }
        class179 var3 = class319.method2220(arg1, (byte) -59, 1);
        var3.method1242((byte) 78);
        var3.field2897 = arg2;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIII)V", line = 36)
    public static final void method799(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if ((arg4 - arg3) >= class224.field3575 && arg3 + arg4 <= class231.field3697 && class233.field3721 <= arg2 - arg3 && class235.field3735 >= arg2 + arg3) {
            class286.method2015(arg4, -3741, arg2, arg0, arg3);
        } else {
            class289.method2029(arg4, arg0, arg3, (byte) 98, arg2);
        }
        if (arg1 != 4) {
            field1729 = 52;
        }
        field1726++;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V", line = 53)
    public static void method800(byte arg0) {
        field1732 = null;
        if (arg0 != -4) {
            method801(-45, (class39) null);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILkb;)V", line = 64)
    public static final void method801(int arg0, class39 arg1) {
        field1731++;
        if (arg0 != 1) {
            method799(-106, 59, 53, -4, 32);
        }
        class146.field2188 = arg1;
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)V", line = 78)
    public static final void method802(byte arg0) {
        field1730++;
        for (int var1 = 0; var1 < class126.field1877; var1++) {
            int var2 = class318.field4946[var1];
            class196 var3 = class297.field4657[var2];
            int var4 = class336.field5213.method1399(-1172389784);
            if ((var4 & 0x1) != 0) {
                var4 += class336.field5213.method1399(-1172389784) << 8;
            }
            if ((var4 & 0x200) != 0) {
                var3.field1964 = class336.field5213.method1394(false);
                var3.field2004 = class336.field5213.method1357(true);
            }
            if ((var4 & 0x2) != 0) {
                int var5 = class336.field5213.method1394(false);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class336.field5213.method1399(-1172389784);
                class66.method433(var6, var5, var3, true);
            }
            if ((var4 & 0x4) != 0) {
                int var7 = class336.field5213.method1393(3);
                int var8 = class336.field5213.method1397((byte) -124);
                var3.method903(-70, var8, var7, class48.field648);
            }
            if ((var4 & 0x100) != 0) {
                int var9 = class336.field5213.method1397((byte) -122);
                int[] var10 = new int[var9];
                int[] var11 = new int[var9];
                int[] var12 = new int[var9];
                for (int var13 = 0; var13 < var9; var13++) {
                    int var14 = class336.field5213.method1357(true);
                    if (var14 == 65535) {
                        var14 = -1;
                    }
                    var10[var13] = var14;
                    var11[var13] = class336.field5213.method1407(true);
                    var12[var13] = class336.field5213.method1357(true);
                }
                class201.method1470(1, var10, var3, var11, var12);
            }
            if ((var4 & 0x80) != 0) {
                boolean var15 = true;
                int var16 = class336.field5213.method1396(-44);
                if (var16 == 65535) {
                    var16 = -1;
                }
                int var17 = class336.field5213.method1354((byte) 64);
                if (var16 != -1 && var3.field2022 != -1 && class37.method236(class264.method1881((byte) 123, var16).field302, 20254).field1197 < class37.method236(class264.method1881((byte) 107, var3.field2022).field302, 20254).field1197) {
                    var15 = false;
                }
                if (var15) {
                    var3.field1993 = 0;
                    var3.field1957 = 0;
                    var3.field2010 = var17 >> 16;
                    var3.field1945 = (var17 & 0xFFFF) + class48.field648;
                    var3.field2022 = var16;
                    if (var3.field1945 > class48.field648) {
                        var3.field1957 = -1;
                    }
                    var3.field2024 = 1;
                    if (var3.field2022 != -1 && class48.field648 == var3.field1945) {
                        int var18 = class264.method1881((byte) 123, var3.field2022).field302;
                        if (var18 != -1) {
                            class80 var19 = class37.method236(var18, 20254);
                            if (var19 != null && var19.field1209 != null) {
                                class253.method1789(19080, var3.field1944, var19, 0, var3.field1980, false);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1949 = class336.field5213.method1355((byte) 68);
                var3.field2028 = 100;
            }
            if ((var4 & 0x20) != 0) {
                int var20 = class336.field5213.method1393(3);
                int var21 = class336.field5213.method1397((byte) -125);
                var3.method903(-70, var21, var20, class48.field648);
                var3.field1992 = class48.field648 + 300;
                var3.field2040 = class336.field5213.method1399(-1172389784);
            }
            if ((var4 & 0x40) != 0) {
                if (var3.field3210.method822(1115)) {
                    class286.method2014(var3, -83);
                }
                var3.method1439((byte) 21, class281.method1993(class336.field5213.method1396(-41), -3));
                var3.method906(var3.field3210.field1808, -126);
                var3.field1956 = var3.field3210.field1806;
                var3.field1989 = var3.field3210.field1803;
                if (var3.field3210.method822(1115)) {
                    class7.method51(var3.field1969[0], -22958, (class320) null, class148.field2209, (class149) null, var3.field2006[0], 0, var3);
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field1976 = class336.field5213.method1384(2104932360);
                if (var3.field1976 == 65535) {
                    var3.field1976 = -1;
                }
            }
        }
        if (arg0 >= -59) {
            method798(-50, 84, -81);
        }
    }
}
