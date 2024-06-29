import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class74 extends class84 {

    @OriginalMember(owner = "client!td", name = "M", descriptor = "Ljava/lang/String;")
    private String field1032 = "null";

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public static int field1033 = 0;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    public static int field1038 = 0;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "[I")
    public static int[] field1041 = new int[1000];

    @OriginalMember(owner = "client!td", name = "J", descriptor = "C")
    public char field1029;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "C")
    public char field1040;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    private int field1035;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "Lvd;")
    private class4 field1027;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "Lvd;")
    public class4 field1028;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method466(byte arg0, String arg1) {
        field1039++;
        if (this.field1028 == null) {
            return false;
        }
        int var3 = -15 / ((arg0 - 79) / 32);
        if (this.field1027 == null) {
            this.method471(-19);
        }
        for (class277 var4 = (class277) this.field1027.method23(216, class252.method1687(arg1, -22253)); var4 != null; var4 = (class277) this.field1027.method26(21061)) {
            if (var4.field4292.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)I")
    public final int method467(int arg0, boolean arg1) {
        field1036++;
        if (this.field1028 == null) {
            return this.field1035;
        } else if (arg1) {
            return -69;
        } else {
            class47 var3 = (class47) this.field1028.method23(216, (long) arg0);
            return var3 == null ? this.field1035 : var3.field689;
        }
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "(I)V")
    private final void method468(int arg0) {
        this.field1027 = new class4(this.field1028.method24(arg0 - 2));
        if (arg0 != 0) {
            this.method470(-66, (class224) null);
        }
        for (class47 var2 = (class47) this.field1028.method21((byte) 67); var2 != null; var2 = (class47) this.field1028.method22(true)) {
            class47 var3 = new class47((int) var2.field2369);
            this.field1027.method20(var3, (long) var2.field689, 0);
        }
        field1025++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILql;I)V")
    private final void method469(int arg0, class224 arg1, int arg2) {
        if (arg0 != 13389) {
            return;
        }
        if (arg2 == 1) {
            this.field1029 = class84.method525(arg1.method1437((byte) -93), 30582);
        } else if (arg2 == 2) {
            this.field1040 = class84.method525(arg1.method1437((byte) -84), arg0 ^ 0x433B);
        } else if (arg2 == 3) {
            this.field1032 = arg1.method1455(arg0 - 13491);
        } else if (arg2 == 4) {
            this.field1035 = arg1.method1483((byte) 46);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method1445(false);
            this.field1028 = new class4(class89.method567(var4, arg0 ^ 0xFFFFCC76));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1483((byte) 46);
                class171 var7;
                if (arg2 == 5) {
                    var7 = new class76(arg1.method1455(95));
                } else {
                    var7 = new class47(arg1.method1483((byte) 46));
                }
                this.field1028.method20(var7, (long) var6, 0);
            }
        }
        field1022++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILql;)V")
    public final void method470(int arg0, class224 arg1) {
        field1037++;
        if (arg0 != 0) {
            this.method470(27, (class224) null);
        }
        while (true) {
            int var3 = arg1.method1453((byte) -128);
            if (var3 == 0) {
                return;
            }
            this.method469(13389, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!td", name = "i", descriptor = "(I)V")
    private final void method471(int arg0) {
        this.field1027 = new class4(this.field1028.method24(-2));
        field1023++;
        for (class76 var2 = (class76) this.field1028.method21((byte) 67); var2 != null; var2 = (class76) this.field1028.method22(true)) {
            class277 var4 = new class277(var2.field1056, (int) var2.field2369);
            this.field1027.method20(var4, class252.method1687(var2.field1056, -22253), 0);
        }
        int var3 = -93 % ((-arg0 - 82) / 42);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BIII)I")
    public static final int method472(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        if (arg0 < 91) {
            field1041 = null;
        }
        field1034++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZLmi;)V")
    public static final void method473(int arg0, boolean arg1, class266 arg2) {
        if (class52.field740 < arg2.field4012) {
            class200.method1276(arg2, -4);
        } else if (arg2.field3996 < class52.field740) {
            class37.method249(arg2, (byte) -6);
        } else {
            class153.method1018(arg2, -120);
        }
        if (arg2.field4019 < 128 || arg2.field4085 < 128 || arg2.field4019 >= 13184 || arg2.field4085 >= 13184) {
            arg2.field4040 = -1;
            arg2.field3996 = 0;
            arg2.field4046 = -1;
            arg2.field4012 = 0;
            arg2.field4019 = arg2.field4076[0] * 128 + (arg2.method561(-1) * 64);
            arg2.field4085 = arg2.field4032[0] * 128 + arg2.method561(-1) * 64;
            arg2.method1748((byte) -107);
        }
        if (class217.field3280 == arg2 && (arg2.field4019 < 1536 || arg2.field4085 < 1536 || arg2.field4019 >= 11776 || arg2.field4085 >= 11776)) {
            arg2.field3996 = 0;
            arg2.field4046 = -1;
            arg2.field4040 = -1;
            arg2.field4012 = 0;
            arg2.field4019 = arg2.field4076[0] * 128 + (arg2.method561(-1) * 64);
            arg2.field4085 = arg2.field4032[0] * 128 + (arg2.method561(-1) * 64);
            arg2.method1748((byte) -108);
        }
        class274.method1833(arg2, 117);
        if (!arg1) {
            field1041 = null;
        }
        field1026++;
        class241.method1612(88, arg2);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
    public static final void method474(int arg0, int arg1) {
        field1024++;
        class280 var2 = class181.method1180(arg0, arg1 ^ arg1, 7);
        var2.method1871((byte) 26);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public final String method475(int arg0, byte arg1) {
        if (arg1 != -68) {
            return null;
        }
        field1031++;
        if (this.field1028 == null) {
            return this.field1032;
        } else {
            class76 var3 = (class76) this.field1028.method23(216, (long) arg0);
            return var3 == null ? this.field1032 : var3.field1056;
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(B)V")
    public static void method476(byte arg0) {
        field1041 = null;
        if (arg0 != -26) {
            method473(-115, true, (class266) null);
        }
    }

    @OriginalMember(owner = "client!td", name = "j", descriptor = "(I)V")
    public static final void method477(int arg0) {
        if (arg0 != 128) {
            return;
        }
        field1030++;
        for (class79 var1 = (class79) class168.field2318.method990(-97); var1 != null; var1 = (class79) class168.field2318.method993(-32)) {
            class286 var2 = var1.field1100;
            if (class295.field4642 != var2.field4506 || class52.field740 > var2.field4500) {
                var1.method1115(arg0 - 163);
            } else if (class52.field740 >= var2.field4478) {
                if (var2.field4514 > 0) {
                    class140 var3 = class119.field1679[var2.field4514 - 1];
                    if (var3 != null && var3.field4019 >= 0 && var3.field4019 < 13312 && var3.field4085 >= 0 && var3.field4085 < 13312) {
                        var2.method1927((byte) 4, var3.field4019, var3.field4085, class52.field740, class275.method1836(var2.field4506, var3.field4085, var3.field4019, -102) - var2.field4516);
                    }
                }
                if (var2.field4514 < 0) {
                    int var4 = -var2.field4514 - 1;
                    class88 var5;
                    if (class35.field550 == var4) {
                        var5 = class217.field3280;
                    } else {
                        var5 = class154.field2133[var4];
                    }
                    if (var5 != null && var5.field4019 >= 0 && var5.field4019 < 13312 && var5.field4085 >= 0 && var5.field4085 < 13312) {
                        var2.method1927((byte) 4, var5.field4019, var5.field4085, class52.field740, class275.method1836(var2.field4506, var5.field4085, var5.field4019, arg0 - 16) - var2.field4516);
                    }
                }
                var2.method1926(false, class225.field3409);
                class254.method1694(class295.field4642, (int) var2.field4487, (int) var2.field4502, (int) var2.field4511, 60, var2, var2.field4492, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(BI)Z")
    public final boolean method478(byte arg0, int arg1) {
        field1021++;
        if (this.field1028 == null) {
            return false;
        }
        if (arg0 <= 37) {
            method474(84, -71);
        }
        if (this.field1027 == null) {
            this.method468(0);
        }
        class47 var3 = (class47) this.field1027.method23(216, (long) arg1);
        return var3 != null;
    }
}
