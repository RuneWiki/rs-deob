import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class121 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "J")
    private long field1523;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    private int field1528;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1537 = new String[] { method1098(method1097("ZjJa|")), method1098(method1097("T'J\b)")), method1098(method1097("A|\bJ")), method1098(method1097("ZjJn|")), method1098(method1097("ZjJe|")), method1098(method1097("ZjJ\u001a=A`\u0010\u0018|")), method1098(method1097("ZjJc|")), method1098(method1097("ZjJb|")), method1098(method1097("ZjJg|")), method1098(method1097("ZjJd|")), method1098(method1097("ZjJ`|")) };

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Lmq;")
    public static class657 field1529 = new class657();

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field1533 = -2;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Lsb;")
    public static class261 field1531 = new class261(137, 8);

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field1535 = -1;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "[Ltb;")
    public static class392[] field1532;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILtf;IILha;)V")
    public static final void method1089(int arg0, class524 arg1, int arg2, int arg3, class18 arg4) {
        try {
            class304.field4238.method3982(-122);
            field1524++;
            if (!class733.field10457) {
                for (class353 var5 = (class353) arg1.method3977((byte) -46); var5 != null; var5 = (class353) arg1.method3987(0)) {
                    class475 var6 = class534.field7725.method2508(var5.field5108, false);
                    if (method1093(var6, 1)) {
                        boolean var7 = class8.method58(arg2, (byte) -124, arg0, var5, arg4, var6);
                        if (var7) {
                            class536.method4065(var5, -2, arg4, var6);
                        }
                    }
                }
                int var8 = -15 % ((-arg3 - 37) / 34);
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field1537[7] + arg0 + ',' + (arg1 == null ? field1537[2] : field1537[1]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field1537[2] : field1537[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)I")
    public final int method1090(byte arg0) {
        try {
            field1522++;
            if (arg0 != 28) {
                field1532 = null;
            }
            return this.field1528;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1537[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)I")
    private final int method1091(byte arg0, int arg1) {
        try {
            field1526++;
            if (arg0 <= 78) {
                this.field1528 = -60;
            }
            return (int) (this.field1523 >> class212.field3116 * arg1) & 0xF;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1537[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static void method1092(byte arg0) {
        try {
            field1531 = null;
            if (arg0 > -46) {
                method1093(null, -57);
            }
            field1529 = null;
            field1532 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1537[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Luja;I)Z")
    public static final boolean method1093(class475 arg0, int arg1) {
        try {
            field1527++;
            if (arg0 == null) {
                return false;
            } else if (arg1 != 1) {
                return false;
            } else if (!arg0.field6999) {
                return false;
            } else if (!arg0.method3672((byte) -109, class534.field7728)) {
                return false;
            } else if (class15.field193.method3693(false, (long) arg0.field6960) == null) {
                return class103.field1364.method3693(false, (long) arg0.field7003) == null;
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1537[3] + (arg0 == null ? field1537[2] : field1537[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLdd;)V")
    private final void method1094(byte arg0, class212 arg1) {
        try {
            this.field1523 |= (arg1.field3109 << class212.field3116 * this.field1528++);
            if (arg0 != -49) {
                this.method1094((byte) -66, null);
            }
            field1530++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1537[10] + arg0 + ',' + (arg1 == null ? field1537[2] : field1537[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Ldd;")
    public final class212 method1095(int arg0, int arg1) {
        try {
            if (arg0 != -24983) {
                this.method1090((byte) -36);
            }
            field1521++;
            return class212.method1788((byte) 126, this.method1091((byte) 93, arg1));
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1537[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Ldd;)V")
    public class121(class212 arg0) {
        try {
            this.field1523 = arg0.field3109;
            this.field1528 = 1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1537[5] + (arg0 == null ? field1537[2] : field1537[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "([Ldd;)V")
    public class121(class212[] arg0) {
        try {
            for (int var2 = 0; var2 < arg0.length; var2++) {
                this.method1094((byte) -49, arg0[var2]);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1537[5] + (arg0 == null ? field1537[2] : field1537[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BILjava/lang/String;)V")
    public static final void method1096(byte arg0, int arg1, String arg2) {
        try {
            field1525++;
            class150.field1913++;
            class779 var3 = class85.method851(false);
            class274 var4 = class375.method2969((byte) 1, class752.field10741, var3.field11100);
            var4.field3885.method5114(255, class101.method986(arg2, arg0 + 6767) + 1);
            var4.field3885.method5114(255, arg1);
            var4.field3885.method5089(arg2, (byte) -74);
            if (arg0 == -24) {
                var3.method5608(var4, 29867);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1537[8] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1537[2] : field1537[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1097(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x54);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1098(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 47;
                    break;
                case 1:
                    var10005 = 9;
                    break;
                case 2:
                    var10005 = 100;
                    break;
                case 3:
                    var10005 = 38;
                    break;
                default:
                    var10005 = 84;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
