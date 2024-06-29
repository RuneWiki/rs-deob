import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class736 extends class497 {

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10495 = new String[] { method5348(method5347("4\b&7/")), method5348(method5347("4\b&6/")), method5348(method5347("4\b&2/")), method5348(method5347("4\b&3/")), method5348(method5347("4\b&5/")), method5348(method5347("4\b&1/")), method5348(method5347("4\b&0/")) };

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field10492 = 0;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "Lsb;")
    public static class261 field10484 = new class261(115, 3);

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "F")
    public static float field10490;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field10486;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public static int field10487;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public static int field10488;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public static int field10489;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    public static int field10491;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    public static int field10493;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field10494;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "Ljava/lang/String;")
    public static String field10485;

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lpp;)V", line = 4)
    public class736(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V", line = 7)
    public final void method1031(byte arg0) {
        try {
            if (super.field7292 != 0 && ~super.field7293.field9101.method2398(3) != -2) {
                super.field7292 = 0;
            }
            ++field10493;
            if (~super.field7292 > -1 || super.field7292 > 1) {
                super.field7292 = this.method1032(-115);
            }
            if (arg0 > -70) {
                this.method1031((byte) -42);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10495[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(ILpp;)V", line = 27)
    public class736(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)I", line = 34)
    public final int method1032(int arg0) {
        try {
            if (arg0 >= -101) {
                return -31;
            } else {
                ++field10491;
                return 1;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10495[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)Z", line = 45)
    public final boolean method5344(int arg0) {
        try {
            ++field10486;
            if (arg0 > -127) {
                field10485 = null;
            }
            return true;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10495[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "(I)I", line = 60)
    public final int method5345(int arg0) {
        try {
            ++field10487;
            if (arg0 != 3) {
                method5346(14);
            }
            return super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10495[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V", line = 76)
    public static void method5346(int arg0) {
        try {
            if (arg0 == -26217) {
                field10485 = null;
                field10484 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10495[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BI)I", line = 87)
    public final int method1029(byte arg0, int arg1) {
        try {
            ++field10494;
            if (arg0 != -73) {
                return 38;
            } else {
                return ~arg1 != -1 && super.field7293.field9101.method2398(3) != 1 ? 2 : 1;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10495[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)V", line = 101)
    public final void method1030(int arg0, int arg1) {
        try {
            ++field10489;
            super.field7292 = arg1;
            if (arg0 != 64) {
                this.method5345(-54);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10495[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5347(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 7);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5348(char[] arg0) {
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
                    var10005 = 102;
                    break;
                case 2:
                    var10005 = 8;
                    break;
                case 3:
                    var10005 = 116;
                    break;
                default:
                    var10005 = 7;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
