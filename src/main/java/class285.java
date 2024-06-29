import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class285 {

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field4547 = 0;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field4549 = 0;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "[B")
    public static byte[] field4548;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public static void method1912(byte arg0) {
        if (arg0 >= -67) {
            method1914(55);
        }
        field4548 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIBLeb;)V")
    public static final void method1913(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, class103 arg7) {
        if (class80.field1118) {
            class95.field1417 = 32;
        } else {
            class95.field1417 = 0;
        }
        field4551++;
        class80.field1118 = false;
        if (class205.field3293 != 0) {
            if (arg3 >= arg1 && arg3 < (arg1 + 16) && arg0 <= arg4 && arg0 + 16 > arg4) {
                arg7.field1639 -= 4;
                class45.method346((byte) 59, arg7);
            } else if (arg3 >= arg1 && (arg1 + 16) > arg3 && arg5 + arg0 - 16 <= arg4 && arg4 < (arg0 + arg5)) {
                arg7.field1639 += 4;
                class45.method346((byte) 80, arg7);
            } else if (arg3 >= (arg1 - class95.field1417) && (arg1 + class95.field1417 + 16) > arg3 && arg4 >= (arg0 + 16) && arg4 < arg5 + arg0 - 16) {
                int var8 = (arg5 - 32) * arg5 / arg2;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg4 - (var8 / 2) - arg0 - 16;
                int var10 = arg5 - var8 - 32;
                arg7.field1639 = (arg2 - arg5) * var9 / var10;
                class45.method346((byte) 111, arg7);
                class80.field1118 = true;
            }
        }
        if (class203.field3269 != 0) {
            int var11 = arg7.field1691;
            if (arg3 >= arg1 - var11 && arg4 >= arg0 && arg3 < arg1 + 16 && arg0 + arg5 >= arg4) {
                arg7.field1639 += class203.field3269 * 45;
                class45.method346((byte) 121, arg7);
            }
        }
        if (arg6 != -94) {
            field4547 = 34;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static final void method1914(int arg0) {
        field4552++;
        class207.field3335.method1831(-101);
        class7.field105.method1831(-106);
        if (arg0 == -23988) {
            class111.field1908.method1831(arg0 ^ 0x5DC8);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
    public static final void method1915(byte arg0) {
        for (int var1 = 0; var1 < class61.field834; var1++) {
            int var3 = class28.field335[var1];
            class275 var4 = class198.field3193[var3];
            int var5 = class166.field2709.method1779(-59);
            if ((var5 & 0x20) != 0) {
                var5 += class166.field2709.method1779(-115) << 8;
            }
            if ((var5 & 0x40) != 0) {
                int var6 = class166.field2709.method1779(-102);
                int var7 = class166.field2709.method1774(115);
                var4.method382(0, var7, var6, class9.field141);
            }
            if ((var5 & 0x1) != 0) {
                if (var4.field4439.method1803(-1)) {
                    class87.method616(4096, var4);
                }
                var4.method1857(class104.method741((byte) -66, class166.field2709.method1749((byte) -26)), 7324);
                var4.method389(var4.field4439.field4262, (byte) 98);
                var4.field631 = var4.field4439.field4250;
                var4.field611 = var4.field4439.field4290;
                if (var4.field4439.method1803(-1)) {
                    class142.method963(var4.field610[0], var4.field692[0], (class94) null, 0, class28.field336, var4, 128, (class235) null);
                }
            }
            if ((var5 & 0x10) != 0) {
                int var8 = class166.field2709.method1777(-82);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class166.field2709.method1766((byte) -59);
                boolean var10 = true;
                if (var8 != -1 && var4.field634 != -1 && class267.method1812((byte) 89, class271.method1826(var8, (byte) 101).field929).field257 < class267.method1812((byte) 89, class271.method1826(var4.field634, (byte) 122).field929).field257) {
                    var10 = false;
                }
                if (var10) {
                    var4.field686 = 0;
                    var4.field615 = 1;
                    var4.field661 = var9 >> 16;
                    var4.field640 = (var9 & 0xFFFF) + class9.field141;
                    var4.field634 = var8;
                    var4.field694 = 0;
                    if (class9.field141 < var4.field640) {
                        var4.field694 = -1;
                    }
                    if (var4.field634 != -1 && class9.field141 == var4.field640) {
                        int var11 = class271.method1826(var4.field634, (byte) 126).field929;
                        if (var11 != -1) {
                            class21 var12 = class267.method1812((byte) 89, var11);
                            if (var12 != null && var12.field237 != null) {
                                class150.method1022(var12, (byte) 127, 0, var4.field613, false, var4.field614);
                            }
                        }
                    }
                }
            }
            if ((var5 & 0x4) != 0) {
                int var13 = class166.field2709.method1774(116);
                int var14 = class166.field2709.method1743((byte) 21);
                var4.method382(0, var14, var13, class9.field141);
                var4.field704 = class9.field141 + 300;
                var4.field619 = class166.field2709.method1743((byte) 21);
            }
            if ((var5 & 0x200) != 0) {
                int var15 = class166.field2709.method1774(123);
                int[] var16 = new int[var15];
                int[] var17 = new int[var15];
                int[] var18 = new int[var15];
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = class166.field2709.method1777(-88);
                    if (var20 == 65535) {
                        var20 = -1;
                    }
                    var18[var19] = var20;
                    var16[var19] = class166.field2709.method1731(-107);
                    var17[var19] = class166.field2709.method1777(-50);
                }
                class110.method797(var4, true, var17, var18, var16);
            }
            if ((var5 & 0x8) != 0) {
                var4.field695 = class166.field2709.method1750((byte) -128);
                var4.field612 = 100;
            }
            if ((var5 & 0x2) != 0) {
                int var21 = class166.field2709.method1730((byte) -101);
                int var22 = class166.field2709.method1743((byte) 21);
                if (var21 == 65535) {
                    var21 = -1;
                }
                class199.method1344(var21, (byte) 46, var22, var4);
            }
            if ((var5 & 0x100) != 0) {
                var4.field620 = class166.field2709.method1730((byte) -121);
                var4.field636 = class166.field2709.method1777(-82);
            }
            if ((var5 & 0x80) != 0) {
                var4.field603 = class166.field2709.method1777(-85);
                if (var4.field603 == 65535) {
                    var4.field603 = -1;
                }
            }
        }
        field4550++;
        int var2 = -31 % ((arg0 - 67) / 56);
    }
}
