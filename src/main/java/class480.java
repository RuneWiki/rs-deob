import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class480 extends class3 implements class421 {

    @OriginalMember(owner = "client!gt", name = "D", descriptor = "Lpj;")
    private class157 field6966;

    @OriginalMember(owner = "client!gt", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field6968 = new String[] { method3665(method3664("ZK7\u000e_")), method3665(method3664("ZK7\u000f_")), method3665(method3664("ZK7x\u001eSVmz_")), method3665(method3664("SJu(")), method3665(method3664("F\u00117j\n")), method3665(method3664("ZK7\n_")), method3665(method3664("ZK7\u0003_")), method3665(method3664("ZK7\u0005_")), method3665(method3664("ZK7\b_")), method3665(method3664("ZK7\t_")) };

    @OriginalMember(owner = "client!gt", name = "B", descriptor = "I")
    public static int field6960;

    @OriginalMember(owner = "client!gt", name = "C", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!gt", name = "E", descriptor = "I")
    public static int field6963;

    @OriginalMember(owner = "client!gt", name = "A", descriptor = "I")
    public static int field6964;

    @OriginalMember(owner = "client!gt", name = "F", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!gt", name = "y", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)I")
    public final int method25(int arg0) {
        try {
            ++field6967;
            if (arg0 != -12502) {
                this.field6966 = null;
            }
            return super.method25(-12502);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6968[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)Z")
    public final boolean method3257(int arg0) {
        try {
            if (arg0 != -3841) {
                this.method24(11, -64);
            }
            ++field6964;
            return super.method18(super.field24.field10094, (byte) 85);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6968[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IB)Ldv;")
    public static final class685 method3663(int arg0, byte arg1) {
        try {
            ++field6965;
            class685[] var2 = class12.method84(19814);
            if (arg1 >= -22) {
                return null;
            } else {
                for (int var3 = 0; var3 < var2.length; ++var3) {
                    if (~var2[var3].field9932 == ~arg0) {
                        return var2[var3];
                    }
                }
                return null;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6968[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lrda;Lpj;Z)V")
    public class480(class690 arg0, class157 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        try {
            this.field6966 = arg1;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6968[2] + (arg0 != null ? field6968[4] : field6968[3]) + ',' + (arg1 != null ? field6968[4] : field6968[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)V")
    public final void method20(boolean arg0) {
        try {
            super.method20(arg0);
            ++field6962;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6968[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    public final Buffer method3256(boolean arg0, byte arg1) {
        try {
            ++field6961;
            if (arg1 > -88) {
                this.method24(23, 15);
            }
            return super.method17((byte) 51, arg0, super.field24.field10094);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6968[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)V")
    public final void method24(int arg0, int arg1) {
        try {
            super.method24(this.field6966.field1946 * arg0, arg1);
            ++field6960;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6968[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)Lpj;")
    public final class157 method3258(int arg0) {
        try {
            ++field6963;
            if (arg0 != -31745) {
                this.field6966 = null;
            }
            return this.field6966;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6968[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3664(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 119);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3665(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 61;
                    break;
                case 1:
                    var10005 = 63;
                    break;
                case 2:
                    var10005 = 25;
                    break;
                case 3:
                    var10005 = 68;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
