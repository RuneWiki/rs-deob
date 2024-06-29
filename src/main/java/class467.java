import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class467 extends class593 {

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6821 = new String[] { method3590(method3589("4p\u001f@\u0017")), method3590(method3589("4p\u001fA\u0017")), method3590(method3589(",,\u001f&B")), method3590(method3589("9w]d")), method3590(method3589("4p\u001fO\u0017")), method3590(method3589("4p\u001fK\u0017")), method3590(method3589("4p\u001fM\u0017")), method3590(method3589("4p\u001fN\u0017")), method3590(method3589("4p\u001fJ\u0017")), method3590(method3589("4p\u001fI\u0017")) };

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "[Lee;")
    public static class488[] field6810 = null;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "Lop;")
    public static class574 field6814 = new class574("", 16);

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
    public static int field6819 = -1;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "Lkl;")
    public static class740 field6818 = new class740();

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!cr", name = "s", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!cr", name = "r", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "Lht;")
    public static class792 field6812;

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Ljj;)V", line = 4)
    public class467(class334 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BZ)V", line = 10)
    public final void method460(byte arg0, boolean arg1) {
        try {
            ++field6815;
            if (arg0 != -20) {
                method3588((byte) 47);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6821[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIB)V", line = 23)
    public final void method463(int arg0, int arg1, byte arg2) {
        try {
            ++field6811;
            if (arg2 >= -98) {
                this.method455(93);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6821[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V", line = 33)
    public static final void method3587(byte arg0) {
        try {
            ++field6820;
            class272.field3866 = class49.method544(8, 35, 8, 0.4F, 1, 4, true, 2048);
            if (arg0 != 41) {
                method3588((byte) -77);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6821[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)V", line = 44)
    public final void method455(int arg0) {
        try {
            if (arg0 == -15226) {
                ++field6813;
                super.field8530.method2681(61, false);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6821[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)V", line = 56)
    public static void method3588(byte arg0) {
        try {
            if (arg0 < -25) {
                field6818 = null;
                field6814 = null;
                field6810 = null;
                field6812 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6821[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)Z", line = 69)
    public final boolean method458(int arg0) {
        try {
            if (arg0 < 70) {
                field6810 = null;
            }
            ++field6816;
            return true;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6821[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IZ)V", line = 82)
    public final void method454(int arg0, boolean arg1) {
        try {
            super.field8530.method2681(9, true);
            ++field6817;
            int var3 = 55 % ((-51 - arg0) / 39);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6821[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IBLah;)V", line = 92)
    public final void method452(int arg0, byte arg1, class764 arg2) {
        try {
            ++field6809;
            super.field8530.method2668(24, arg2);
            super.field8530.method2679(2, arg0);
            if (arg1 != -106) {
                method3587((byte) 72);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6821[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6821[2] : field6821[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3589(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 63);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3590(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 87;
                    break;
                case 1:
                    var10005 = 2;
                    break;
                case 2:
                    var10005 = 49;
                    break;
                case 3:
                    var10005 = 8;
                    break;
                default:
                    var10005 = 63;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
