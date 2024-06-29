import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class293 {

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "B")
    public byte field4101;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "Lqj;")
    public static class511 field4085 = new class511(10, 19);

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "Lbda;")
    public class197 field4091;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "Lbda;")
    public class197 field4095;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "Llba;")
    public class198 field4097;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "Lko;")
    public class293 field4098;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "Lvea;")
    public class306 field4090;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "Lvea;")
    public class306 field4093;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "Lsp;")
    public class686 field4084;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "Lkj;")
    public class72 field4089;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ko", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field4102;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "S")
    public short field4087;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "S")
    public short field4088;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "S")
    public short field4096;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "S")
    public short field4099;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1796(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)V", line = 4)
    public final void method1790(boolean arg0) {
        field4100++;
        if (!arg0) {
            return;
        }
        while (this.field4097 != null) {
            class198 var2 = this.field4097.field3078;
            this.field4097.method1393(88);
            this.field4097 = var2;
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(I)V", line = 21)
    public class293(int arg0) {
        this.field4101 = (byte) arg0;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)Z", line = 39)
    public static final boolean method1791(int arg0, int arg1, int arg2) {
        field4092++;
        if (arg1 != -1) {
            return false;
        } else if (class701.method3941(arg2, arg0, 106)) {
            return class337.method2002(-124, arg0, arg2) | (arg0 & 0x9000) != 0 | class510.method3036(arg0, arg2, 256) ? true : (arg2 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | class541.method3184(arg0, (byte) 96, arg2) | class564.method3302(arg0, arg2, arg1 - 127));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V", line = 63)
    public static void method1792(byte arg0) {
        field4085 = null;
        if (arg0 > -91) {
            field4085 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIBIIIII)V", line = 73)
    public static final void method1793(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4083++;
        if (arg2 != -84) {
            field4085 = null;
        }
        if (arg6 < 0 || arg0 < 0 || arg6 >= (class430.field6136 - 1) || (class580.field8504 - 1) <= arg0) {
            return;
        }
        if (class541.field7946 == null) {
            return;
        }
        if (arg4 != 0) {
            if (arg4 == 1) {
                class394 var8 = (class394) class681.method3856(arg7, arg6, arg0);
                if (var8 != null) {
                    if (var8 instanceof class112) {
                        ((class112) var8).field1800.method3764(arg3, false);
                        return;
                    }
                    int var9 = var8.method903(108);
                    if (arg5 != 4 && arg5 != 5) {
                        if (arg5 == 6) {
                            class582.method3368(4, arg6, var9, arg4, arg7, arg1 + 4, (byte) -127, arg0, arg3);
                            return;
                        }
                        if (arg5 == 7) {
                            class582.method3368(4, arg6, var9, arg4, arg7, (arg1 + 2 & 0x3) + 4, (byte) -123, arg0, arg3);
                        } else if (arg5 == 8) {
                            class582.method3368(4, arg6, var9, arg4, arg7, arg1 + 4, (byte) -117, arg0, arg3);
                            class582.method3368(4, arg6, var9, arg4, arg7, (arg1 + 2 & 0x3) + 4, (byte) -127, arg0, arg3);
                            return;
                        }
                        return;
                    }
                    class582.method3368(4, arg6, var9, arg4, arg7, arg1, (byte) -126, arg0, arg3);
                    return;
                }
            } else if (arg4 == 2) {
                class394 var10 = (class394) class31.method286(arg7, arg6, arg0, field4102 == null ? (field4102 = method1796("sw")) : field4102);
                if (var10 != null) {
                    if (arg5 == 11) {
                        arg5 = 10;
                    }
                    if (var10 instanceof class223) {
                        ((class223) var10).field3339.method3764(arg3, false);
                        return;
                    }
                    class582.method3368(arg5, arg6, var10.method903(86), arg4, arg7, arg1, (byte) -125, arg0, arg3);
                    return;
                }
            } else if (arg4 == 3) {
                class394 var11 = (class394) class415.method2469(arg7, arg6, arg0);
                if (var11 == null) {
                    return;
                }
                if (var11 instanceof class583) {
                    ((class583) var11).field8527.method3764(arg3, false);
                    return;
                }
                class582.method3368(arg5, arg6, var11.method903(98), arg4, arg7, arg1, (byte) -120, arg0, arg3);
            } else {
                return;
            }
            return;
        }
        class394 var12 = (class394) class454.method2636(arg7, arg6, arg0);
        class394 var13 = (class394) class548.method3215(arg7, arg6, arg0);
        if (var12 != null && arg5 != 2) {
            if (var12 instanceof class501) {
                ((class501) var12).field7437.method3764(arg3, false);
            } else {
                class582.method3368(arg5, arg6, var12.method903(arg2 ^ 0xFFFFFFF6), arg4, arg7, arg1, (byte) -121, arg0, arg3);
            }
        }
        if (var13 == null) {
            return;
        }
        if (var13 instanceof class501) {
            ((class501) var13).field7437.method3764(arg3, false);
            return;
        }
        class582.method3368(arg5, arg6, var13.method903(112), arg4, arg7, arg1, (byte) -124, arg0, arg3);
        return;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILis;IZI)V", line = 193)
    public static final void method1794(int arg0, class101 arg1, int arg2, boolean arg3, int arg4) {
        field4094++;
        int var5 = arg1.field1604;
        if (arg1.field1542 == 0) {
            arg1.field1604 = arg1.field1560;
        } else if (arg1.field1542 == 1) {
            arg1.field1604 = arg2 - arg1.field1560;
        } else if (arg1.field1542 == 2) {
            arg1.field1604 = arg1.field1560 * arg2 >> 14;
        }
        int var6 = arg1.field1651;
        if (arg1.field1613 == 0) {
            arg1.field1651 = arg1.field1549;
        } else if (arg1.field1613 == 1) {
            arg1.field1651 = arg0 - arg1.field1549;
        } else if (arg1.field1613 == 2) {
            arg1.field1651 = arg1.field1549 * arg0 >> 14;
        }
        if (arg1.field1542 == 4) {
            arg1.field1604 = arg1.field1651 * arg1.field1519 / arg1.field1538;
        }
        if (arg1.field1613 == 4) {
            arg1.field1651 = arg1.field1604 * arg1.field1538 / arg1.field1519;
        }
        if (class88.field1324 && (client.method707(arg1).field4572 != 0 || arg1.field1584 == 0)) {
            if (arg1.field1651 < 5 && arg1.field1604 < 5) {
                arg1.field1604 = 5;
                arg1.field1651 = 5;
            } else {
                if (arg1.field1651 <= 0) {
                    arg1.field1651 = 5;
                }
                if (arg1.field1604 <= 0) {
                    arg1.field1604 = 5;
                }
            }
        }
        if (class608.field8740 == arg1.field1638) {
            class128.field2090 = arg1;
        }
        if (arg3 && arg1.field1626 != null && (arg1.field1604 != var5 || arg1.field1651 != var6)) {
            class400 var7 = new class400();
            var7.field5790 = arg1.field1626;
            var7.field5783 = arg1;
            class286.field4012.method3904(var7, 0);
        }
        if (arg4 > -79) {
            field4085 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)V", line = 277)
    public static final void method1795(byte arg0) {
        class344.field4826.method645(-16);
        field4086++;
        class621.field8844.method1865((byte) -73);
        class235.field3484.method3031((byte) -89);
        class14.field224.method2832(-2276);
        class564.field8259.method3740(1);
        class430.field6132.method41(0);
        if (arg0 >= -62) {
            return;
        }
        class480.field6871.method1418(5);
        class554.field8108.method599((byte) 29);
        class56.field781.method3296(13163);
        class545.field8005.method2891(-25404);
        class625.field8919.method979((byte) 42);
        class624.field8902.method1503(-77);
        class304.field4255.method2844((byte) -10);
        class659.field9287.method2876(110);
        class237.field3504.method1555(11);
        class104.field1715.method3256(3);
        class111.field1777.method509((byte) -102);
        class27.field385.method570(-21500);
        class329.field4559.method2246(false);
        class667.field9380.method3182(-1980356210);
        class680.method3847(0);
        class395.method2392((byte) 12);
        class563.method3295((byte) -109);
        class47.method372((byte) -29);
        if (class554.field8103 != class205.field3174) {
            for (int var1 = 0; var1 < class405.field5810.length; var1++) {
                class405.field5810[var1] = null;
            }
            class598.field8647 = 0;
        }
        class526.method3098(true);
        class188.method1337((byte) 57);
        class576.method3338(1);
        class31.method289(-127);
        class121.method974((byte) -109);
        class362.field5042.method936(-46);
        class637.field9048.method776();
        class265.method1685(5816);
        class440.method2571((byte) -77);
        class26.field371.method2097(-57);
        class137.field2218.method2097(-127);
        class379.field5241.method2097(-60);
        class522.field7698.method2097(-115);
        class233.field3455.method2097(-59);
        class466.field6733.method2097(-35);
        class97.field1451.method2097(-56);
        class205.field3168.method2097(-101);
        class468.field6754.method2097(-39);
        class691.field9792.method2097(-99);
        class177.field2831.method2097(-61);
        class418.field5944.method2097(-63);
        class563.field8216.method2097(-85);
        class399.field5771.method2097(-45);
        class445.field6444.method2097(-36);
        class156.field2569.method2097(-33);
        class240.field3534.method2097(-82);
        class183.field2905.method2097(-32);
        class337.field4697.method2097(-42);
        class400.field5781.method2097(-113);
        class57.field852.method2097(-77);
        class23.field305.method2097(-44);
        class487.field6954.method2097(-125);
        class72.field1152.method2097(-97);
        class580.field8502.method2097(-124);
        class89.field1329.method2097(-62);
        class76.field1183.method2097(-44);
        class386.field5664.method2097(-85);
        class634.field8977.method2097(-120);
        class608.field8739.method2097(-125);
        class425.field6073.method2097(-34);
        class450.field6495.method2097(-71);
        class43.field583.method936(-53);
        class696.field9884.method936(-54);
        class477.field6838.method936(-44);
        class527.field7721.method936(-65);
    }
}
