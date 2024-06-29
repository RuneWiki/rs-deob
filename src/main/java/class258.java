import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public class class258 extends class497 {

    @OriginalMember(owner = "client!aka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3686 = new String[] { method2155(method2154("\t>Fsl@")), method2155(method2154("\t>Fsj@")), method2155(method2154("\t>Fsn@")), method2155(method2154("\t>Fs`@")), method2155(method2154("\t>Fsm@")), method2155(method2154("\t>Fso@")), method2155(method2154("\t>Fsk@")), method2155(method2154("\t>Fsi@")) };

    @OriginalMember(owner = "client!aka", name = "h", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!aka", name = "l", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!aka", name = "f", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!aka", name = "j", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!aka", name = "i", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!aka", name = "k", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!aka", name = "m", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!aka", name = "g", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!aka", name = "b", descriptor = "(B)V", line = 4)
    public static final void method2150(byte arg0) {
        try {
            class476.field7025.method1402(7521);
            ++field3678;
            for (int var1 = 0; var1 < 32; ++var1) {
                class553.field8064[var1] = 0L;
            }
            for (int var2 = 0; ~var2 > -33; ++var2) {
                class790.field11496[var2] = 0L;
            }
            if (arg0 == -32) {
                class117.field1493 = 0;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3686[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(ILpp;)V", line = 32)
    public class258(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(B)V", line = 35)
    public final void method1031(byte arg0) {
        try {
            if (super.field7293.method4684(8) != class378.field5530) {
                super.field7292 = 1;
            } else if (super.field7293.method4677(58)) {
                super.field7292 = 0;
            }
            if (arg0 <= -70) {
                ++field3679;
                if (super.field7292 != 0 && super.field7292 != 1) {
                    super.field7292 = this.method1032(-110);
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3686[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aka", name = "b", descriptor = "(I)I", line = 55)
    public final int method2151(int arg0) {
        try {
            ++field3681;
            return arg0 != 3 ? -58 : super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3686[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(Lpp;)V", line = 66)
    public class258(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!aka", name = "c", descriptor = "(I)V", line = 70)
    public static final void method2152(int arg0) {
        try {
            ++field3685;
            if (arg0 > 60) {
                for (int var1 = 0; class119.field1510 > var1; ++var1) {
                    class601.field8604[var1] = null;
                }
                class119.field1510 = 0;
                for (int var2 = 0; ~var2 > ~class293.field4121; ++var2) {
                    for (int var3 = 0; var3 < class508.field7455; ++var3) {
                        for (int var4 = 0; ~var4 > ~class700.field9795; ++var4) {
                            class621 var5 = class608.field8715[var2][var4][var3];
                            if (var5 != null) {
                                if (~var5.field8853 < -1) {
                                    var5.field8853 = (short) (var5.field8853 * -1);
                                }
                                if (~var5.field8843 < -1) {
                                    var5.field8843 = (short) (var5.field8843 * -1);
                                }
                            }
                        }
                    }
                }
                for (int var6 = 0; ~class293.field4121 < ~var6; ++var6) {
                    for (int var7 = 0; class508.field7455 > var7; ++var7) {
                        for (int var8 = 0; var8 < class700.field9795; ++var8) {
                            class621 var9 = class608.field8715[var6][var8][var7];
                            if (var9 != null) {
                                boolean var10 = class608.field8715[0][var8][var7] != null && class608.field8715[0][var8][var7].field8849 != null;
                                if (var9.field8843 < 0) {
                                    int var11 = var7;
                                    int var12 = var7;
                                    int var14 = var6;
                                    class621 var15 = class608.field8715[var6][var8][var7 + -1];
                                    int var16 = class213.field3124[var6].method5442(var8, var7, 31844);
                                    while (var11 > 0 && var15 != null && var15.field8843 < 0 && var9.field8843 == var15.field8843 && ~var9.field8851 == ~var15.field8851 && ~var16 == ~class213.field3124[var6].method5442(var8, var11 + -1, 31844) && (var11 + -1 <= 0 || ~class213.field3124[var6].method5442(var8, var11 - 2, 31844) == ~var16)) {
                                        --var11;
                                        var15 = class608.field8715[var6][var8][var11 - 1];
                                    }
                                    for (class621 var17 = class608.field8715[var6][var8][var7 + 1]; ~var12 > ~class700.field9795 && var17 != null && ~var17.field8843 > -1 && ~var9.field8843 == ~var17.field8843 && var9.field8851 == var17.field8851 && ~var16 == ~class213.field3124[var6].method5442(var8, var12 - -1, 31844) && (var12 - -1 >= class700.field9795 || class213.field3124[var6].method5442(var8, var12 + 2, 31844) == var16); var17 = class608.field8715[var6][var8][var12 + 1]) {
                                        ++var12;
                                    }
                                    int var18 = var6 + 1 - var6;
                                    int var19 = class213.field3124[var10 ? var6 + 1 : var6].method5442(var8, var11, 31844);
                                    int var20 = var19 - -(var9.field8843 * var18);
                                    int var21 = class213.field3124[var10 ? var6 + 1 : var6].method5442(var8, var12 - -1, 31844);
                                    int var22 = var21 - -(var9.field8843 * var18);
                                    int var23 = var8 << class179.field2328;
                                    int var24 = var11 << class179.field2328;
                                    int var25 = (var12 << class179.field2328) - -class768.field10975;
                                    class601.field8604[class119.field1510++] = new class182(1, var6, var9.field8851 + var23, var9.field8851 + var23, var9.field8851 + var23, var23 - -var9.field8851, var19, var21, var22, var20, var24, var25, var25, var24);
                                    for (int var26 = var6; var26 <= var14; ++var26) {
                                        for (int var27 = var11; ~var27 >= ~var12; ++var27) {
                                            class608.field8715[var26][var8][var27].field8843 = (short) (class608.field8715[var26][var8][var27].field8843 * -1);
                                        }
                                    }
                                }
                                if (~var9.field8853 > -1) {
                                    int var28 = var8;
                                    int var29 = var8;
                                    int var31 = var6;
                                    class621 var32 = class608.field8715[var6][var8 - 1][var7];
                                    int var33 = class213.field3124[var6].method5442(var8, var7, 31844);
                                    while (var28 > 0 && var32 != null && var32.field8853 < 0 && var9.field8853 == var32.field8853 && ~var9.field8854 == ~var32.field8854 && ~class213.field3124[var6].method5442(var28 + -1, var7, 31844) == ~var33 && (~(var28 + -1) >= -1 || class213.field3124[var6].method5442(var28 - 2, var7, 31844) == var33)) {
                                        --var28;
                                        var32 = class608.field8715[var6][var28 + -1][var7];
                                    }
                                    for (class621 var34 = class608.field8715[var6][var8 + 1][var7]; var29 < class508.field7455 && var34 != null && ~var34.field8853 > -1 && var9.field8853 == var34.field8853 && var9.field8854 == var34.field8854 && var33 == class213.field3124[var6].method5442(var29 + 1, var7, 31844) && (class508.field7455 <= var29 + 1 || class213.field3124[var6].method5442(var29 + 2, var7, 31844) == var33); var34 = class608.field8715[var6][var29 + 1][var7]) {
                                        ++var29;
                                    }
                                    int var35 = var6 - var6 - -1;
                                    int var36 = class213.field3124[!var10 ? var6 : var6 + 1].method5442(var28, var7, 31844);
                                    int var37 = var9.field8853 * var35 + var36;
                                    int var38 = class213.field3124[!var10 ? var6 : var6 + 1].method5442(var29 + 1, var7, 31844);
                                    int var39 = var9.field8853 * var35 + var38;
                                    int var40 = var28 << class179.field2328;
                                    int var41 = (var29 << class179.field2328) + class768.field10975;
                                    int var42 = var7 << class179.field2328;
                                    class601.field8604[class119.field1510++] = new class182(2, var6, var40, var41, var41, var40, var36, var38, var39, var37, var9.field8854 + var42, var9.field8854 + var42, var9.field8854 + var42, var9.field8854 + var42);
                                    for (int var43 = var6; var43 <= var31; ++var43) {
                                        for (int var44 = var28; ~var44 >= ~var29; ++var44) {
                                            class608.field8715[var43][var44][var7].field8853 = (short) (class608.field8715[var43][var44][var7].field8853 * -1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class397.field5768 = true;
            }
        } catch (RuntimeException var46) {
            throw class665.method4799(var46, field3686[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(BI)I", line = 295)
    public final int method1029(byte arg0, int arg1) {
        try {
            if (arg0 != -73) {
                return -68;
            } else {
                ++field3680;
                if (super.field7293.method4684(8) == class378.field5530) {
                    if (super.field7293.method4677(arg0 + 143)) {
                        return 3;
                    } else {
                        return arg1 != 0 && super.field7293.field9101.method2398(3) != 1 ? 2 : 1;
                    }
                } else {
                    return 3;
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3686[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aka", name = "d", descriptor = "(I)Z", line = 320)
    public final boolean method2153(int arg0) {
        try {
            ++field3682;
            if (arg0 >= -127) {
                return false;
            } else if (super.field7293.method4684(8) == class378.field5530) {
                return !super.field7293.method4677(70);
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3686[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(II)V", line = 342)
    public final void method1030(int arg0, int arg1) {
        try {
            ++field3683;
            if (arg0 != 64) {
                this.method2151(-91);
            }
            super.field7292 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3686[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(I)I", line = 356)
    public final int method1032(int arg0) {
        try {
            if (arg0 >= -101) {
                return 10;
            } else {
                ++field3684;
                return 1;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3686[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2154(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2155(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 104;
                    break;
                case 1:
                    var10005 = 85;
                    break;
                case 2:
                    var10005 = 39;
                    break;
                case 3:
                    var10005 = 93;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
