import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class118 extends class497 {

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1508 = new String[] { method1078(method1077("&\u0011MD\u001f")), method1078(method1077("&\u0011M@\u001f")), method1078(method1077("&\u0011MB\u001f")), method1078(method1077("&\u0011ME\u001f")), method1078(method1077("&\u0011MO\u001f")), method1078(method1077("&\u0011MN\u001f")), method1078(method1077("&\u0011MA\u001f")), method1078(method1077("&\u0011MC\u001f")), method1078(method1077("&\u0011MG\u001f")) };

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "[I")
    public static int[] field1501 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
    public static int field1504 = 0;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "F")
    public static float field1495;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)I", line = 3)
    public final int method1032(int arg0) {
        try {
            ++field1496;
            return arg0 >= -101 ? -9 : 2;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1508[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(ILpp;)V", line = 20)
    public class118(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BI)I", line = 24)
    public final int method1029(byte arg0, int arg1) {
        try {
            ++field1507;
            if (super.field7293.method4677(53)) {
                return 3;
            } else if (~super.field7293.field9092.method2151(3) == -1) {
                return 3;
            } else {
                if (arg0 != -73) {
                    field1499 = -37;
                }
                return 1;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1508[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)I", line = 42)
    public final int method1072(int arg0) {
        try {
            ++field1497;
            if (arg0 != 3) {
                field1495 = 1.663894F;
            }
            return super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1508[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V", line = 54)
    public final void method1031(byte arg0) {
        try {
            if (super.field7293.method4677(77)) {
                super.field7292 = 0;
            }
            ++field1506;
            if (super.field7293.field9092.method2151(3) == 0) {
                super.field7292 = 0;
            }
            if (super.field7292 < 0 || super.field7292 > 2) {
                super.field7292 = this.method1032(-117);
            }
            if (arg0 >= -70) {
                this.method1031((byte) 41);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1508[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)V", line = 75)
    public static void method1073(int arg0) {
        try {
            if (arg0 != -9722) {
                field1499 = -18;
            }
            field1501 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1508[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIFBZII)[[I", line = 85)
    public static final int[][] method1074(int arg0, int arg1, int arg2, int arg3, float arg4, byte arg5, boolean arg6, int arg7, int arg8) {
        try {
            ++field1503;
            int[][] var9 = new int[arg7][arg1];
            class2 var10 = new class2();
            var10.field30 = (int) (arg4 * 4096.0F);
            var10.field41 = arg2;
            var10.field27 = arg8;
            var10.field26 = arg3;
            if (arg5 < 61) {
                field1501 = null;
            }
            var10.field37 = arg6;
            var10.method12(101);
            class184.method1518(arg1, (byte) -116, arg7);
            for (int var11 = 0; ~var11 > ~arg7; ++var11) {
                var10.method18(var11, (byte) -7, var9[var11]);
            }
            return var9;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field1508[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lpp;)V", line = 117)
    public class118(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)Z", line = 120)
    public final boolean method1075(int arg0) {
        try {
            ++field1505;
            if (super.field7293.method4677(72)) {
                return false;
            } else {
                if (arg0 >= -127) {
                    this.method1032(-104);
                }
                return ~super.field7293.field9092.method2151(3) != -1;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1508[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIB)Z", line = 145)
    public static final boolean method1076(int arg0, int arg1, byte arg2) {
        try {
            if (arg2 >= -93) {
                field1495 = -0.65367985F;
            }
            ++field1500;
            return ~(1024 & arg1) != -1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1508[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V", line = 156)
    public final void method1030(int arg0, int arg1) {
        try {
            super.field7292 = arg1;
            ++field1502;
            if (arg0 != 64) {
                field1499 = -117;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1508[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1077(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 55);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1078(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 68;
                    break;
                case 1:
                    var10005 = 124;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 6;
                    break;
                default:
                    var10005 = 55;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
