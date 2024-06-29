import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class127 extends class497 {

    @OriginalMember(owner = "client!vt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1599 = new String[] { method1131(method1130("'\u001e\u0010,.")), method1131(method1130("'\u001e\u0010-.")), method1131(method1130("'\u001e\u0010*.")), method1131(method1130("'\u001e\u0010..")), method1131(method1130("'\u001e\u0010/.")), method1131(method1130("'\u001e\u0010(.")), method1131(method1130("'\u001e\u0010!.")), method1131(method1130("'\u001e\u0010+.")) };

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "Lsb;")
    public static class261 field1597 = new class261(114, 0);

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)I")
    public final int method1126(int arg0) {
        try {
            if (arg0 != 3) {
                this.method1029((byte) -39, -80);
            }
            ++field1592;
            return super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1599[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)V")
    public final void method1030(int arg0, int arg1) {
        try {
            if (arg0 != 64) {
                method1127(-104);
            }
            super.field7292 = arg1;
            ++field1591;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1599[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "(I)V")
    public static void method1127(int arg0) {
        try {
            field1597 = null;
            if (arg0 >= -110) {
                field1596 = -80;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1599[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)I")
    public final int method1032(int arg0) {
        try {
            if (arg0 >= -101) {
                return 119;
            } else {
                ++field1593;
                return 1;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1599[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIIII)V")
    public static final void method1128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field1589;
            int var6 = arg0 - arg3;
            int var7 = -arg2 + arg4;
            if (var7 == 0) {
                if (var6 != 0) {
                    class228.method1901(arg5, arg3, arg0, arg2, (byte) 121);
                }
            } else if (~var6 == -1) {
                class318.method2525(arg4, false, arg2, arg5, arg3);
            } else {
                if (~var6 > -1) {
                    var6 = -var6;
                }
                if (var7 < 0) {
                    var7 = -var7;
                }
                boolean var8 = var6 > var7;
                if (var8) {
                    int var9 = arg2;
                    arg2 = arg3;
                    int var10 = arg4;
                    arg3 = var9;
                    arg4 = arg0;
                    arg0 = var10;
                }
                if (~arg4 > ~arg2) {
                    int var11 = arg2;
                    arg2 = arg4;
                    int var12 = arg3;
                    arg3 = arg0;
                    arg4 = var11;
                    arg0 = var12;
                }
                int var13 = arg3;
                int var14 = -arg2 + arg4;
                int var15 = -arg3 + arg0;
                int var16 = -(var14 >> 1);
                int var17 = ~arg0 >= ~arg3 ? -1 : 1;
                if (arg1 < ~var15) {
                    var15 = -var15;
                }
                if (var8) {
                    for (int var18 = arg2; var18 <= arg4; ++var18) {
                        class529.field7682[var18][var13] = arg5;
                        var16 += var15;
                        if (~var16 < -1) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                } else {
                    for (int var19 = arg2; var19 <= arg4; ++var19) {
                        var16 += var15;
                        class529.field7682[var13][var19] = arg5;
                        if (~var16 < -1) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                }
            }
        } catch (RuntimeException var21) {
            throw class665.method4799(var21, field1599[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BI)I")
    public final int method1029(byte arg0, int arg1) {
        try {
            ++field1595;
            return arg0 != -73 ? -90 : 1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1599[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lpp;)V")
    public class127(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(ILpp;)V")
    public class127(int arg0, class640 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BIIIII)V")
    public static final void method1129(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            if (arg0 == 15) {
                ++field1590;
                if (~arg2 == ~arg3) {
                    class248.method2020(arg1, true, arg4, arg3, arg5);
                } else if (-arg3 + arg5 >= class335.field4844 && arg5 - -arg3 <= class507.field7453 && ~class557.field8113 >= ~(-arg2 + arg4) && ~(arg4 - -arg2) >= ~class50.field717) {
                    class712.method5152(arg2, arg5, arg3, arg4, arg0 + -15, arg1);
                } else {
                    class51.method554(arg4, arg3, arg5, (byte) 67, arg2, arg1);
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1599[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
    public final void method1031(byte arg0) {
        try {
            if (arg0 >= -70) {
                field1597 = null;
            }
            if (super.field7292 != 1 && ~super.field7292 != -1) {
                super.field7292 = this.method1032(-109);
            }
            ++field1594;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1599[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1130(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 6);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1131(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 81;
                    break;
                case 1:
                    var10005 = 106;
                    break;
                case 2:
                    var10005 = 62;
                    break;
                case 3:
                    var10005 = 105;
                    break;
                default:
                    var10005 = 6;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
