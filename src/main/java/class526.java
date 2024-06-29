import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class526 extends class730 implements class181 {

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    private int field7654;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7666 = new String[] { method4002(method4001("6\u00001k")), method4002(method4001(";\u0018s;P6\u001c)9\u0011")), method4002(method4001("#[s)D")), method4002(method4001(";\u0018sM\u0011")), method4002(method4001(";\u0018sD\u0011")), method4002(method4001(";\u0018s@\u0011")), method4002(method4001(";\u0018sB\u0011")), method4002(method4001(";\u0018sI\u0011")), method4002(method4001(";\u0018sA\u0011")), method4002(method4001(";\u0018sC\u0011")), method4002(method4001(";\u0018sO\u0011")), method4002(method4001(";\u0018sF\u0011")) };

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field7655 = 0;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method3995(byte[] arg0, boolean arg1) {
        try {
            if (arg1) {
                method4000(true);
            }
            ++field7662;
            int var2 = arg0.length;
            byte[] var3 = new byte[var2];
            class569.method4247(arg0, 0, var3, 0, var2);
            return var3;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7666[3] + (arg0 != null ? field7666[2] : field7666[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
    public static final void method3996(int arg0) {
        try {
            class511.field7499.method2043(false);
            if (arg0 < 116) {
                method3998(-83, 85);
            }
            ++field7660;
            class713.field10107.method2043(false);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7666[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III[B)V")
    public final void method1507(int arg0, int arg1, int arg2, byte[] arg3) {
        try {
            ++field7659;
            this.method5321(arg3, arg0);
            if (arg1 != -32534) {
                method3995((byte[]) null, true);
            }
            this.field7654 = arg2;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7666[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7666[2] : field7666[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)I")
    public final int method1505(int arg0) {
        try {
            if (arg0 != 11874) {
                field7655 = -107;
            }
            ++field7658;
            return 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7666[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lml;I[BI)V")
    public class526(class194 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        try {
            this.field7654 = arg1;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7666[1] + (arg0 != null ? field7666[2] : field7666[0]) + ',' + arg1 + ',' + (arg2 != null ? field7666[2] : field7666[0]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILjc;)Lgja;")
    public static final class44 method3997(int arg0, class711 arg1) {
        try {
            if (arg0 != 0) {
                field7656 = -5;
            }
            ++field7663;
            class232 var2 = class432.method3364(arg1, 4);
            int var3 = arg1.method5102(-347036064);
            return new class44(var2.field3350, var2.field3357, var2.field3352, var2.field3353, var2.field3349, var3);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7666[9] + arg0 + ',' + (arg1 != null ? field7666[2] : field7666[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)V")
    public static final void method3998(int arg0, int arg1) {
        try {
            int var2 = -99 / ((arg0 - -44) / 49);
            class762.field10877 = arg1;
            ++field7664;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7666[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(Z)V")
    public static final void method3999(boolean arg0) {
        if (arg0) {
            class608.field8715 = class105.field1377;
            class107.field1413 = class677.field9474;
        } else {
            class608.field8715 = class596.field8568;
            class107.field1413 = class213.field3124;
        }
        class293.field4121 = class608.field8715.length;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)J")
    public final long method1506(byte arg0) {
        try {
            if (arg0 >= -63) {
                this.field7654 = 28;
            }
            ++field7661;
            return super.field10440.getAddress();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7666[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
    public static final void method4000(boolean arg0) {
        try {
            ++field7657;
            if (!arg0) {
                method3998(-114, -63);
            }
            for (int var1 = 0; ~class76.field1089.length < ~var1; ++var1) {
                for (int var2 = 0; ~var2 > ~class76.field1089[0].length; ++var2) {
                    for (int var3 = 0; ~var3 > ~class76.field1089[0][0].length; ++var3) {
                        class76.field1089[var1][var2][var3] = 0;
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7666[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)I")
    public final int method1508(int arg0) {
        try {
            if (arg0 != 25946) {
                this.method1507(-72, 112, -65, (byte[]) null);
            }
            ++field7665;
            return this.field7654;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7666[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4001(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 57);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4002(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 88;
                    break;
                case 1:
                    var10005 = 117;
                    break;
                case 2:
                    var10005 = 93;
                    break;
                case 3:
                    var10005 = 7;
                    break;
                default:
                    var10005 = 57;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
