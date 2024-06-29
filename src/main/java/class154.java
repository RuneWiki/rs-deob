import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class154 extends class54 {

    @OriginalMember(owner = "client!mr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1908 = new String[] { method1293(method1292("\u0012WG|\"")), method1293(method1292("\u0012WGr\"")), method1293(method1292("\u001bP\u0004Vs")), method1293(method1292("\u0004\u000bG\u0015w")), method1293(method1292("\u0011P\u0005W")), method1293(method1292("\u0012WGq\"")), method1293(method1292("\u0012WGx\"")), method1293(method1292("\u0012WG~\"")), method1293(method1292("\u0012WGs\"")), method1293(method1292("\u0012WG\u007f\"")), method1293(method1292("\u0012WGy\"")), method1293(method1292("\u0012WGz\"")), method1293(method1292("\u0012WG}\"")) };

    @OriginalMember(owner = "client!mr", name = "s", descriptor = "Lel;")
    public static class573 field1897 = new class573(17, -1);

    @OriginalMember(owner = "client!mr", name = "t", descriptor = "Lel;")
    public static class573 field1907 = new class573(62, -2);

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!mr", name = "w", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!mr", name = "u", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!mr", name = "x", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!mr", name = "v", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)V", line = 3)
    public static void method1286(int arg0) {
        try {
            if (arg0 != 64) {
                method1289(-46, 49, (byte) -3);
            }
            field1897 = null;
            field1907 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1908[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)V", line = 14)
    public final void method113(int arg0, int arg1) {
        try {
            if (arg0 != 0) {
                method1286(-64);
            }
            super.field593 = arg1;
            ++field1901;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1908[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)V", line = 28)
    public static final void method1287(int arg0, int arg1, int arg2) {
        try {
            ++field1896;
            class313 var3 = class196.method1670((long) arg0, 17, -95);
            var3.method2636((byte) 113);
            if (arg1 == -9514) {
                var3.field4951 = arg2;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1908[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V", line = 42)
    public static final void method1288(byte arg0) {
        try {
            ++field1906;
            int var1 = class106.field1223.length;
            if (arg0 >= -112) {
                method1291((byte) -6, (class33) null, (Object) null);
            }
            for (int var2 = 0; ~var1 < ~var2; ++var2) {
                if (class106.field1223[var2] != null) {
                    int var3 = -1;
                    for (int var4 = 0; class771.field11201 > var4; ++var4) {
                        if (class751.field10918[var4] == class752.field10938[var2]) {
                            var3 = var4;
                            break;
                        }
                    }
                    if (~var3 == 0) {
                        class751.field10918[class771.field11201] = class752.field10938[var2];
                        var3 = class771.field11201++;
                    }
                    class163 var5 = new class163(class106.field1223[var2]);
                    int var6 = 0;
                    while (~var5.field2201 > ~class106.field1223[var2].length && ~var6 > -512 && ~class6.field60 > -1024) {
                        int var7 = var6++ << 6 | var3;
                        int var8 = var5.method1445((byte) 115);
                        int var9 = var8 >> 14;
                        int var10 = 63 & var8 >> 7;
                        int var11 = var8 & 63;
                        int var12 = (class752.field10938[var2] >> 8) * 64 + -class494.field7101 + var10;
                        int var13 = (255 & class752.field10938[var2]) * 64 + var11 - class281.field4219;
                        class496 var14 = class262.field4035.method4250(var5.method1445((byte) 120), 2);
                        class383 var15 = (class383) class207.field3184.method977((long) var7, 1);
                        if (var15 == null && ~(1 & var14.field7178) < -1 && class419.field6182 == var9 && var12 >= 0 && ~class648.field9378 < ~(var14.field7159 + var12) && ~var13 <= -1 && class659.field9506 > var14.field7159 + var13) {
                            class612 var16 = new class612();
                            var16.field3780 = var7;
                            class383 var17 = new class383(var16);
                            class207.field3184.method968((byte) -111, (long) var7, var17);
                            class753.field10966[class750.field10912++] = var17;
                            class590.field8680[class6.field60++] = var7;
                            var16.field3840 = class375.field5711;
                            var16.method4519(true, var14);
                            var16.method2095((byte) -80, var16.field8947.field7159);
                            var16.field3810 = var16.field8947.field7180 << 3;
                            var16.method2103(0, var16.field8947.field7117 + 4 << 11 & 14886, true);
                            var16.method4527(var13, 21824, true, var12, var16.method2101(31463), var9);
                        }
                    }
                }
            }
        } catch (RuntimeException var19) {
            throw class759.method5498(var19, field1908[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIB)V", line = 142)
    public static final void method1289(int arg0, int arg1, byte arg2) {
        try {
            class3.field31 = arg1;
            ++field1899;
            class757.field10994 = arg0;
            if (class166.field2283 == 0) {
                class69.field742 = class741.field10765 * 2 + class3.field31;
                class57.field613 = class555.field8287 * 2 + class757.field10994;
            } else if (class166.field2283 != 1) {
                if (class166.field2283 == 2) {
                    class57.field613 = class757.field10994;
                    class69.field742 = class3.field31;
                }
            } else {
                class601.field8825 = class3.field31 / class335.field5236 + 2 - -class759.field11007;
                class187.field2571 = class757.field10994 / class283.field4239 + 2 + class320.field5063;
                class69.field742 = class601.field8825 * class335.field5236;
                class57.field613 = class283.field4239 * class187.field2571;
                class741.field10765 = -class3.field31 + class69.field742 >> 1;
                class555.field8287 = -class757.field10994 + class57.field613 >> 1;
            }
            if (arg2 != 75) {
                field1907 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1908[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(Z)I", line = 178)
    public final int method1290(boolean arg0) {
        try {
            ++field1898;
            return arg0 ? -72 : super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1908[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLmca;Ljava/lang/Object;)V", line = 190)
    public static final void method1291(byte arg0, class33 arg1, Object arg2) {
        try {
            ++field1902;
            if (arg1.field387 != null) {
                if (arg0 < 30) {
                    field1900 = 107;
                }
                for (int var3 = 0; var3 < 50 && arg1.field387.peekEvent() != null; ++var3) {
                    class151.method1269(false, 1L);
                }
                try {
                    if (arg2 != null) {
                        arg1.field387.postEvent(new ActionEvent(arg2, 1001, field1908[2]));
                    }
                } catch (Exception var5) {
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1908[5] + arg0 + ',' + (arg1 != null ? field1908[3] : field1908[4]) + ',' + (arg2 != null ? field1908[3] : field1908[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(IB)I", line = 218)
    public final int method109(int arg0, byte arg1) {
        try {
            ++field1905;
            return arg1 > -106 ? -115 : 1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1908[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(Z)I", line = 230)
    public final int method111(boolean arg0) {
        try {
            ++field1903;
            if (arg0) {
                method1289(42, -105, (byte) -55);
            }
            return 1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1908[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V", line = 245)
    public final void method115(boolean arg0) {
        try {
            ++field1904;
            if (!arg0) {
                field1907 = null;
            }
            if (super.field593 != 1 && ~super.field593 != -1) {
                super.field593 = this.method111(false);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1908[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(ILhia;)V", line = 259)
    public class154(int arg0, class73 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lhia;)V", line = 271)
    public class154(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1292(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 10);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1293(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 127;
                    break;
                case 1:
                    var10005 = 37;
                    break;
                case 2:
                    var10005 = 105;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 10;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
