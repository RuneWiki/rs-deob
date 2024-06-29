import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class266 {

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "Lnj;")
    private class162 field3672 = new class162(64);

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "Lmg;")
    private class101 field3674;

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "I")
    public static int field3670 = 0;

    @OriginalMember(owner = "client!fu", name = "o", descriptor = "I")
    public static int field3679 = 0;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "Ldi;")
    public static class83 field3666 = new class83(31, -1);

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!fu", name = "l", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!fu", name = "m", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!fu", name = "n", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "Ljv;")
    public static class56 field3671;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIII)V")
    public static final void method1590(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -1) {
            method1591(-31);
        }
        if (arg2 == 1010) {
            class429.method2540(class169.field2523, arg3, arg0);
        } else if (arg2 == 1008) {
            class429.method2540(class260.field3616, arg3, arg0);
        } else if (arg2 == 1004) {
            class429.method2540(class431.field6327, arg3, arg0);
        } else if (arg2 == 1009) {
            class429.method2540(class58.field710, arg3, arg0);
        } else if (arg2 == 1001) {
            class429.method2540(class113.field1704, arg3, arg0);
        }
        field3668++;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
    public static final void method1591(int arg0) {
        field3677++;
        if (!class20.field269.method1712(class152.field2332, false) && class436.field6379 != class124.field1854) {
            class484.method2848(false, class434.field6363, class38.field474, (byte) 48, false);
            return;
        }
        class78.method633(class269.field3721, -789762964);
        if (arg0 != 1010) {
            method1591(83);
        }
        if (class436.field6379 != class33.field437) {
            class53.method459(1);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IB)V")
    public final void method1592(int arg0, byte arg1) {
        if (arg1 != 13) {
            this.field3674 = null;
        }
        class162 var3 = this.field3672;
        synchronized (this.field3672) {
            this.field3672.method1065((byte) -95, arg0);
        }
        field3669++;
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)V")
    public static final void method1593(int arg0) {
        class370.method2222(0, class110.field1664);
        field3673++;
        class436.field6383++;
        if (class438.field6452 && class493.field7200) {
            int var1 = class518.field7668.method1813(0);
            int var2 = class518.field7668.method1822(126);
            int var3 = var2 - class12.field194;
            int var4 = var1 - class233.field3292;
            if (class241.field3372 > var4) {
                var4 = class241.field3372;
            }
            if ((class110.field1664.field2204 + var4) > (class241.field3372 + class257.field3566.field2204)) {
                var4 = class257.field3566.field2204 + class241.field3372 - class110.field1664.field2204;
            }
            if (var3 < class33.field442) {
                var3 = class33.field442;
            }
            if (arg0 <= -94) {
                if (class33.field442 + class257.field3566.field2322 < class110.field1664.field2322 + var3) {
                    var3 = class257.field3566.field2322 + class33.field442 - class110.field1664.field2322;
                }
                int var5 = var4 + class257.field3566.field2181 - class241.field3372;
                int var6 = class257.field3566.field2173 + var3 - class33.field442;
                if (class518.field7668.method2563(44)) {
                    if (class110.field1664.field2252 < class436.field6383) {
                        int var8 = var4 - class378.field5537;
                        int var9 = var3 - class146.field2093;
                        if (class110.field1664.field2212 < var8 || var8 < -class110.field1664.field2212 || var9 > class110.field1664.field2212 || var9 < -class110.field1664.field2212) {
                            class55.field663 = true;
                        }
                    }
                    if (class110.field1664.field2177 != null && class55.field663) {
                        class437 var10 = new class437();
                        var10.field6387 = var5;
                        var10.field6390 = class110.field1664;
                        var10.field6388 = var6;
                        var10.field6389 = class110.field1664.field2177;
                        class429.method2537(var10);
                    }
                } else {
                    if (class55.field663) {
                        class88.method668((byte) -70);
                        if (class110.field1664.field2182 != null) {
                            class437 var7 = new class437();
                            var7.field6389 = class110.field1664.field2182;
                            var7.field6388 = var6;
                            var7.field6390 = class110.field1664;
                            var7.field6387 = var5;
                            var7.field6391 = class21.field303;
                            class429.method2537(var7);
                        }
                        if (class21.field303 != null && client.method1232(class110.field1664) != null) {
                            class214.method1325((byte) 127, class110.field1664, class21.field303);
                        }
                    } else if ((class70.field990 == 1 || class442.method2634(-89)) && class274.field3764 > 2) {
                        class381.method2261(0, class12.field194 + class146.field2093, class378.field5537 + class233.field3292);
                    } else if (class421.method2508(101)) {
                        class381.method2261(0, class146.field2093 + class12.field194, class378.field5537 + class233.field3292);
                    }
                    class110.field1664 = null;
                }
            }
        } else if (class436.field6383 > 1) {
            class110.field1664 = null;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)V")
    public static void method1594(boolean arg0) {
        field3671 = null;
        if (arg0) {
            field3679 = -23;
        }
        field3666 = null;
    }

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "(I)V")
    public final void method1595(int arg0) {
        class162 var2 = this.field3672;
        synchronized (this.field3672) {
            this.field3672.method1068(0);
            if (arg0 != 7626) {
                this.method1596(-60, 98);
            }
        }
        field3678++;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)Lcw;")
    public final class120 method1596(int arg0, int arg1) {
        field3667++;
        class162 var3 = this.field3672;
        class120 var4;
        synchronized (this.field3672) {
            var4 = (class120) this.field3672.method1073((long) arg1, false);
        }
        if (arg0 != -1) {
            this.field3672 = null;
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3674.method727(arg1, 31, 15);
        class120 var6 = new class120();
        if (var5 != null) {
            var6.method836(new class391(var5), ~arg0);
        }
        class162 var7 = this.field3672;
        synchronized (this.field3672) {
            this.field3672.method1072((long) arg1, var6, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "(I)I")
    public static final int method1597(int arg0) {
        field3676++;
        try {
            if (class86.field1266 == 0) {
                if (class450.field6624 > class246.method1483(5957) - 5000L) {
                    return 0;
                }
                class525.field7757 = class202.field2840.method2952(class140.field1991, false, class267.field3697);
                class383.field5595 = class246.method1483(5957);
                class86.field1266 = 1;
            }
            if ((class383.field5595 + 30000L) < class246.method1483(5957)) {
                return class214.method1328(1000, (byte) -85);
            }
            if (class86.field1266 == 1) {
                if (class525.field7757.field667 == 2) {
                    return class214.method1328(1001, (byte) -115);
                }
                if (class525.field7757.field667 != 1) {
                    return -1;
                }
                class33.field438 = new class483((Socket) class525.field7757.field670, class202.field2840);
                class525.field7757 = null;
                int var1 = 0;
                if (class93.field1367) {
                    var1 = class371.field5421;
                }
                class481.field7027.field5719 = 0;
                class481.field7027.method2302(-4, class141.field2024.field311);
                class481.field7027.method2359(var1, -109);
                class33.field438.method2835((byte) 105, class481.field7027.field5719, class481.field7027.field5678, 0);
                class67.method570(-30266);
                int var2 = class33.field438.method2844(-83);
                class67.method570(-30266);
                if (var2 != 0) {
                    return class214.method1328(var2, (byte) -81);
                }
                class86.field1266 = 2;
            }
            if (class86.field1266 == 2) {
                if (class33.field438.method2842(0) < 2) {
                    return -1;
                }
                class472.field6897 = class33.field438.method2844(-123);
                class472.field6897 <<= 0x8;
                class472.field6897 += class33.field438.method2844(76);
                class86.field1266 = 3;
                class372.field5456 = new byte[class472.field6897];
                class89.field1304 = 0;
            }
            if (class86.field1266 == 3) {
                int var3 = class33.field438.method2842(0);
                if (var3 < 1) {
                    return -1;
                }
                if (class472.field6897 - class89.field1304 < var3) {
                    var3 = class472.field6897 - class89.field1304;
                }
                class33.field438.method2833(class89.field1304, class372.field5456, var3, (byte) -121);
                class89.field1304 += var3;
                if (class472.field6897 > class89.field1304) {
                    return -1;
                }
                if (!class121.method845(class372.field5456, -20307)) {
                    return class214.method1328(1002, (byte) -103);
                }
                class393.field5757 = new class61[class124.field1847];
                int var4 = 0;
                for (int var5 = class90.field1314; var5 <= class413.field6032; var5++) {
                    class61 var6 = class310.method1797(false, var5);
                    if (var6 != null) {
                        class393.field5757[var4++] = var6;
                    }
                }
                class128.field1895 = null;
                class445.field6562 = 0;
                class33.field438.method2839(-20828);
                class33.field438 = null;
                class86.field1266 = 0;
                class372.field5456 = null;
                class270.field3730 = 0;
                class450.field6624 = class246.method1483(arg0 ^ 0xFFFF9A9B);
                return 0;
            }
        } catch (IOException var7) {
            return class214.method1328(1003, (byte) -86);
        }
        if (arg0 != -29218) {
            field3679 = 26;
        }
        return -1;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(III)Z")
    public static final boolean method1598(int arg0, int arg1, int arg2) {
        field3665++;
        if (!class105.method777(arg1, true, arg2)) {
            return false;
        } else if (arg0 >= -84) {
            return false;
        } else if ((arg1 & 0xB000) != 0 | class472.method2778(arg1, arg2, (byte) -104) | class462.method2713((byte) 66, arg2, arg1)) {
            return true;
        } else {
            return (class483.method2834(-124, arg2, arg1) | class234.method1441(arg1, arg2, (byte) 16)) & (arg2 & 0x37) == 0;
        }
    }

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "(I)V")
    public final void method1599(int arg0) {
        if (arg0 <= 58) {
            field3671 = null;
        }
        class162 var2 = this.field3672;
        synchronized (this.field3672) {
            this.field3672.method1066(4080);
        }
        field3675++;
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lal;ILmg;)V")
    public class266(class66 arg0, int arg1, class101 arg2) {
        this.field3674 = arg2;
        this.field3674.method753(31, -95);
    }
}
