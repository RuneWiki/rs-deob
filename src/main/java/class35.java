import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class35 extends class58 {

    @OriginalMember(owner = "client!bl", name = "Ec", descriptor = "I")
    public static int field435 = 0;

    @OriginalMember(owner = "client!bl", name = "Hc", descriptor = "I")
    public static int field438 = 0;

    @OriginalMember(owner = "client!bl", name = "Nc", descriptor = "Ljava/lang/String;")
    public static String field444 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!bl", name = "Kc", descriptor = "I")
    public static int field441 = -1;

    @OriginalMember(owner = "client!bl", name = "wc", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!bl", name = "xc", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!bl", name = "yc", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!bl", name = "zc", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!bl", name = "Ac", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!bl", name = "Bc", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!bl", name = "Cc", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!bl", name = "Dc", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!bl", name = "Fc", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!bl", name = "Gc", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!bl", name = "Ic", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!bl", name = "Jc", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!bl", name = "Oc", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!bl", name = "Pc", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!bl", name = "Qc", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!bl", name = "Rc", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!bl", name = "Sc", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!bl", name = "Lc", descriptor = "Luh;")
    public class106 field442;

    @OriginalMember(owner = "client!bl", name = "Mc", descriptor = "[Lve;")
    public static class203[] field443;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZIBLfa;II)V")
    public static final void method201(boolean arg0, int arg1, byte arg2, class273 arg3, int arg4, int arg5) {
        class79.field1257 = arg3;
        class124.field1909 = arg1;
        class231.field3705 = arg4;
        class180.field2793 = arg5;
        ++field433;
        class202.field3238 = 1;
        int var6 = -18 % ((65 - arg2) / 44);
        class278.field4621 = arg0;
        class169.field2637 = 10000;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method202(int arg0, String arg1) {
        ++field449;
        if (!arg1.equals("")) {
            ++class179.field2785;
            class276.field4572.method1391(0, 28);
            class276.field4572.method1446((byte) 126, class187.method1270((byte) -86, arg1));
            if (arg0 != 2) {
                field443 = null;
            }
            class276.field4572.method1409(arg1, (byte) 77);
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(IIII)I")
    public static final int method203(int arg0, int arg1, int arg2, int arg3) {
        ++field431;
        int var4 = arg0 & arg1;
        if (~var4 == -1) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else {
            return var4 == 2 ? -arg3 + 7 : arg2;
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)I")
    public final int method204(byte arg0) {
        int var2 = 37 / ((arg0 - -21) / 60);
        ++field436;
        if (this.field442.field1630 != null) {
            class106 var3 = this.field442.method685(-1);
            if (var3 != null && ~var3.field1611 != 0) {
                return var3.field1611;
            }
        }
        return ~this.field442.field1611 != 0 ? this.field442.field1611 : super.method204((byte) -103);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIIIJILgd;)V")
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class77 arg10) {
        ++field430;
        if (this.field442 != null) {
            class200 var13 = super.field853 != -1 && super.field883 == 0 ? class196.method1359(super.field853, (byte) 21) : null;
            class200 var14 = ~super.field857 == 0 || ~super.field857 == ~this.method361(-1).field4282 && var13 != null ? null : class196.method1359(super.field857, (byte) 21);
            class293 var15 = this.field442.method683(super.field838, (byte) -86, super.field867, super.field808, super.field813, var13, super.field873, super.field825, var14, super.field851);
            if (var15 != null) {
                super.field794 = var15.method206();
                class106 var16 = this.field442;
                if (var16.field1630 != null) {
                    var16 = var16.method685(-1);
                }
                if (class180.field2800 && var16.field1623) {
                    class293 var17 = class207.method1470(super.field863, arg0, -101, super.field869, var14 != null ? super.field808 : super.field813, this.field442.field1593, super.field850, var15, this.field442.field1629, this.field442.field1599, var14 == null ? var13 : var14, super.field836, this.field442.field1606, this.field442.field1591);
                    var17.method205(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field833);
                }
                this.method350((byte) -39, var15);
                this.method349(arg0, true, var15);
                class293 var18 = null;
                if (~super.field870 != 0 && super.field829 != -1) {
                    class119 var19 = class278.method1939(super.field870, (byte) -93);
                    var18 = var19.method774((byte) 64, super.field799, super.field830, super.field829);
                    if (var18 != null) {
                        var18.method1315(0, -super.field887, 0);
                        if (var19.field1825) {
                            if (class119.field1830 != 0) {
                                var18.method1304(class119.field1830);
                            }
                            if (class89.field1379 != 0) {
                                var18.method1311(class89.field1379);
                            }
                            if (class127.field1964 != 0) {
                                var18.method1315(0, class127.field1964, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class191) var15).method1301(var18);
                }
                this.method363((byte) 108, var15, var18);
                if (this.field442.field1591 == 1) {
                    var15.field4825 = true;
                }
                var15.method205(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field833);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "()I")
    public final int method206() {
        ++field428;
        return super.field794;
    }

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "(I)V")
    public static final void method207(int arg0) {
        ++field432;
        class278.field4602 = 0;
        int var1 = (class309.field5006.field836 >> 7) - -class101.field1517;
        if (arg0 == 32) {
            int var2 = (class309.field5006.field850 >> 7) - -class254.field4063;
            if (~var1 <= -3054 && var1 <= 3156 && ~var2 <= -3057 && var2 <= 3136) {
                class278.field4602 = 1;
            }
            if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
                class278.field4602 = 1;
            }
            if (class278.field4602 == 1 && var1 >= 3139 && ~var1 >= -3200 && ~var2 <= -3009 && ~var2 >= -3063) {
                class278.field4602 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "(I)V")
    public static void method208(int arg0) {
        field443 = null;
        field444 = null;
        int var1 = -1 % ((-57 - arg0) / 48);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(IIIII)V")
    public final void method209(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field447;
        if (this.field442 != null) {
            if (!super.field810) {
                class200 var6 = super.field853 != -1 && ~super.field883 == -1 ? class196.method1359(super.field853, (byte) 21) : null;
                class200 var7 = super.field857 == -1 || ~super.field857 == ~this.method361(-1).field4282 && var6 != null ? null : class196.method1359(super.field857, (byte) 21);
                class293 var8 = this.field442.method683(super.field838, (byte) -119, super.field867, super.field808, super.field813, var6, super.field873, super.field825, var7, super.field851);
                if (var8 == null) {
                    return;
                }
                this.method363((byte) 117, var8, (class293) null);
            }
            if (super.field833 != null) {
                super.field833.method516(arg0, arg1, arg3, arg2, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field427;
        if (super.field833 != null) {
            super.field833.method511();
        }
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)I")
    public final int method210(int arg0) {
        ++field437;
        if (this.field442.field1630 != null) {
            class106 var2 = this.field442.method685(-1);
            if (var2 != null && ~var2.field1603 != 0) {
                return var2.field1603;
            }
        }
        int var3 = 112 % ((arg0 - -20) / 40);
        return super.field807;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)Z")
    public final boolean method211(int arg0) {
        if (arg0 != 65535) {
            method212((byte) 50);
        }
        ++field439;
        return this.field442 != null;
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(B)I")
    public static final int method212(byte arg0) {
        ++field445;
        int var1 = -42 % ((arg0 - -3) / 54);
        try {
            if (class7.field61 == 0) {
                if (~class241.field3809 < ~(class267.method1841((byte) 127) - 5000L)) {
                    return 0;
                }
                class63.field947 = class259.field4254.method1776(class137.field2129, class178.field2765, (byte) -128);
                class92.field1410 = class267.method1841((byte) 112);
                class7.field61 = 1;
            }
            if (~(class92.field1410 + 30000L) > ~class267.method1841((byte) 119)) {
                return class246.method1722(1000, -30044);
            } else {
                if (class7.field61 == 1) {
                    if (~class63.field947.field725 == -3) {
                        return class246.method1722(1001, -30044);
                    }
                    if (class63.field947.field725 != 1) {
                        return -1;
                    }
                    class103.field1551 = new class189((Socket) class63.field947.field723, class259.field4254);
                    class276.field4572.field3272 = 0;
                    class63.field947 = null;
                    int var2 = 0;
                    if (class261.field4306) {
                        var2 = class166.field2615;
                    }
                    class276.field4572.method1446((byte) 49, 23);
                    class276.field4572.method1425(var2, (byte) -122);
                    class103.field1551.method1275(0, true, class276.field4572.field3272, class276.field4572.field3234);
                    if (class199.field3155 != null) {
                        class199.field3155.method1152((byte) -17);
                    }
                    if (class60.field921 != null) {
                        class60.field921.method1152((byte) -17);
                    }
                    int var3 = class103.field1551.method1276(35);
                    if (class199.field3155 != null) {
                        class199.field3155.method1152((byte) -17);
                    }
                    if (class60.field921 != null) {
                        class60.field921.method1152((byte) -17);
                    }
                    if (var3 != 0) {
                        return class246.method1722(var3, -30044);
                    }
                    class7.field61 = 2;
                }
                if (class7.field61 == 2) {
                    if (class103.field1551.method1283((byte) -68) < 2) {
                        return -1;
                    }
                    class144.field2264 = class103.field1551.method1276(123);
                    class144.field2264 <<= 8;
                    class144.field2264 += class103.field1551.method1276(124);
                    class124.field1892 = 0;
                    class7.field61 = 3;
                    class14.field197 = new byte[class144.field2264];
                }
                if (~class7.field61 == -4) {
                    int var4 = class103.field1551.method1283((byte) -91);
                    if (~var4 > -2) {
                        return -1;
                    } else {
                        if (var4 > -class124.field1892 + class144.field2264) {
                            var4 = -class124.field1892 + class144.field2264;
                        }
                        class103.field1551.method1280(true, var4, class124.field1892, class14.field197);
                        class124.field1892 += var4;
                        if (class124.field1892 < class144.field2264) {
                            return -1;
                        } else if (!class297.method2067(-17864, class14.field197)) {
                            return class246.method1722(1002, -30044);
                        } else {
                            class276.field4576 = new class203[class216.field3438];
                            int var5 = 0;
                            for (int var6 = class1.field2; class40.field495 >= var6; ++var6) {
                                class203 var7 = class138.method920(17514, var6);
                                if (var7 != null) {
                                    class276.field4576[var5++] = var7;
                                }
                            }
                            class103.field1551.method1277(false);
                            class53.field716 = 0;
                            class14.field197 = null;
                            class103.field1551 = null;
                            class7.field61 = 0;
                            class241.field3809 = class267.method1841((byte) 118);
                            return 0;
                        }
                    }
                } else {
                    return -1;
                }
            }
        } catch (IOException var8) {
            return class246.method1722(1003, -30044);
        }
    }

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "(I)I")
    public final int method213(int arg0) {
        if (arg0 != 0) {
            return 3;
        } else {
            ++field440;
            if (this.field442.field1630 != null) {
                class106 var2 = this.field442.method685(-1);
                if (var2 != null && ~var2.field1631 != 0) {
                    return var2.field1631;
                }
            }
            return this.field442.field1631;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Luh;B)V")
    public final void method214(class106 arg0, byte arg1) {
        if (arg1 != -39) {
            field435 = 82;
        }
        this.field442 = arg0;
        if (super.field833 != null) {
            super.field833.method509();
        }
        ++field446;
    }

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "(I)V")
    public static final void method215(int arg0) {
        ++field429;
        try {
            if (arg0 == 0) {
                if (~class202.field3238 == -2) {
                    int var1 = class72.field1040.method1986(-1);
                    if (~var1 < -1 && class72.field1040.method1987((byte) -85)) {
                        int var2 = var1 - class169.field2637;
                        if (var2 < 0) {
                            var2 = 0;
                        }
                        class72.field1040.method1982(4029, var2);
                    } else {
                        class72.field1040.method1979(214094817);
                        class72.field1040.method1963(64);
                        class187.field2892 = null;
                        class87.field1368 = null;
                        if (class79.field1257 == null) {
                            class202.field3238 = 0;
                        } else {
                            class202.field3238 = 2;
                        }
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class72.field1040.method1979(214094817);
            class79.field1257 = null;
            class87.field1368 = null;
            class187.field2892 = null;
            class202.field3238 = 0;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIBLcl;)V")
    public static final void method216(int arg0, int arg1, byte arg2, class208 arg3) {
        int var4 = -3 % ((-80 - arg2) / 37);
        if (~(16 & arg1) != -1) {
            arg3.field814 = class192.field3042.method1454(true);
            if (arg3.field814 == 65535) {
                arg3.field814 = -1;
            }
        }
        if (~(arg1 & 256) != -1) {
            int var5 = class192.field3042.method1432(82);
            int[] var6 = new int[var5];
            int[] var7 = new int[var5];
            int[] var8 = new int[var5];
            for (int var9 = 0; var9 < var5; ++var9) {
                int var10 = class192.field3042.method1454(true);
                if (var10 == 65535) {
                    var10 = -1;
                }
                var6[var9] = var10;
                var8[var9] = class192.field3042.method1405(-126);
                var7[var9] = class192.field3042.method1419(70);
            }
            class80.method535(var8, var6, var7, arg3, 0);
        }
        ++field434;
        if (~(arg1 & 4) != -1) {
            int var11 = class192.field3042.method1454(true);
            if (~var11 == -65536) {
                var11 = -1;
            }
            int var12 = class192.field3042.method1398((byte) 110);
            class266.method1837(var11, var12, arg3, 1);
        }
        if (~(arg1 & 1024) != -1) {
            arg3.field806 = class192.field3042.method1420((byte) 0);
            arg3.field865 = class192.field3042.method1398((byte) 110);
            arg3.field888 = class192.field3042.method1420((byte) 0);
            arg3.field868 = class192.field3042.method1420((byte) 0);
            arg3.field812 = class192.field3042.method1419(114) + class4.field32;
            arg3.field845 = class192.field3042.method1419(94) + class4.field32;
            arg3.field861 = class192.field3042.method1420((byte) 0);
            arg3.field856 = 0;
            arg3.field862 = 1;
        }
        if ((arg1 & 128) != 0) {
            int var13 = class192.field3042.method1450(-73);
            int var14 = class192.field3042.method1420((byte) 0);
            arg3.method352(70, var14, var13, class4.field32);
            arg3.field885 = class4.field32 + 300;
            arg3.field874 = class192.field3042.method1398((byte) 110);
        }
        if ((512 & arg1) != 0) {
            int var15 = class192.field3042.method1419(111);
            int var16 = class192.field3042.method1424(31523);
            boolean var17 = true;
            if (var15 == 65535) {
                var15 = -1;
            }
            if (var15 != -1 && arg3.field870 != -1 && class196.method1359(class278.method1939(var15, (byte) -117).field1810, (byte) 21).field3173 < class196.method1359(class278.method1939(arg3.field870, (byte) -101).field1810, (byte) 21).field3173) {
                var17 = false;
            }
            if (var17) {
                arg3.field827 = (65535 & var16) + class4.field32;
                arg3.field870 = var15;
                arg3.field799 = 1;
                arg3.field829 = 0;
                arg3.field887 = var16 >> 16;
                if (~arg3.field827 < ~class4.field32) {
                    arg3.field829 = -1;
                }
                arg3.field830 = 0;
                if (arg3.field870 != -1 && ~class4.field32 == ~arg3.field827) {
                    int var18 = class278.method1939(arg3.field870, (byte) -91).field1810;
                    if (~var18 != 0) {
                        class200 var19 = class196.method1359(var18, (byte) 21);
                        if (var19 != null && var19.field3167 != null) {
                            class49.method303(false, class309.field5006 == arg3, arg3.field836, 0, var19, arg3.field850);
                        }
                    }
                }
            }
        }
        if (~(2048 & arg1) != -1) {
            int var20 = class192.field3042.method1450(-76);
            int var21 = class192.field3042.method1398((byte) 110);
            arg3.method352(70, var21, var20, class4.field32);
        }
        if (~(64 & arg1) != -1) {
            int var22 = class192.field3042.method1419(124);
            int var23 = class192.field3042.method1405(-125);
            int var24 = class192.field3042.method1432(-128);
            int var25 = class192.field3042.field3272;
            boolean var26 = ~(var22 & 32768) != -1;
            if (arg3.field3329 != null && arg3.field3319 != null) {
                boolean var27 = false;
                if (~var23 >= -2) {
                    if (var26 || (!class45.field625 || class302.field4951) && !class124.field1894) {
                        if (class304.method2086(arg3.field3329, 1)) {
                            var27 = true;
                        }
                    } else {
                        var27 = true;
                    }
                }
                if (!var27 && ~class278.field4602 == -1) {
                    class52.field703.field3272 = 0;
                    class192.field3042.method1402(class52.field703.field3234, var24, 0, (byte) 101);
                    class52.field703.field3272 = 0;
                    int var28 = -1;
                    String var30;
                    if (var26) {
                        var22 &= 32767;
                        class151 var29 = class208.method1472(class52.field703, -864);
                        var28 = var29.field2352;
                        var30 = var29.field2353.method1170(class52.field703, (byte) 124);
                    } else {
                        var30 = class116.method755(class14.method91((byte) 113, class52.method312(class52.field703, 1)));
                    }
                    arg3.field831 = var30.trim();
                    arg3.field852 = 150;
                    int var31;
                    if (~var23 != -2 && var23 != 2) {
                        var31 = var26 ? 17 : 2;
                    } else {
                        var31 = !var26 ? 1 : 17;
                    }
                    arg3.field876 = var22 >> 8;
                    arg3.field840 = 255 & var22;
                    if (var23 == 2) {
                        class74.method481("<img=1>" + arg3.method1477((byte) -21, false), 99, "<img=1>" + arg3.method1477((byte) -60, true), 0, var30, var28, (String) null, var31);
                    } else if (var23 == 1) {
                        class74.method481("<img=0>" + arg3.method1477((byte) 100, false), 99, "<img=0>" + arg3.method1477((byte) 123, true), 0, var30, var28, (String) null, var31);
                    } else {
                        class74.method481(arg3.method1477((byte) -55, false), 99, arg3.method1477((byte) -105, true), 0, var30, var28, (String) null, var31);
                    }
                }
            }
            class192.field3042.field3272 = var24 + var25;
        }
        if ((32 & arg1) != 0) {
            int var32 = class192.field3042.method1405(-121);
            byte[] var33 = new byte[var32];
            class202 var34 = new class202(var33);
            class192.field3042.method1423(61, 0, var33, var32);
            class37.field483[arg0] = var34;
            arg3.method1475((byte) -25, var34, arg0);
        }
        if ((1 & arg1) != 0) {
            arg3.field831 = class192.field3042.method1403(-123);
            if (~arg3.field831.charAt(0) == -127) {
                arg3.field831 = arg3.field831.substring(1);
                class246.method1721(arg3.field831, 0, arg3.method1477((byte) 103, false), (byte) -95, arg3.method1477((byte) 116, true), 2);
            } else if (class309.field5006 == arg3) {
                class246.method1721(arg3.field831, 0, arg3.method1477((byte) 94, false), (byte) -93, arg3.method1477((byte) 102, true), 2);
            }
            arg3.field876 = 0;
            arg3.field852 = 150;
            arg3.field840 = 0;
        }
        if ((arg1 & 8) != 0) {
            arg3.field892 = class192.field3042.method1454(true);
            arg3.field803 = class192.field3042.method1410(true);
        }
    }
}
