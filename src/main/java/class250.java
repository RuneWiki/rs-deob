import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class250 {

    @OriginalMember(owner = "client!rga", name = "n", descriptor = "I")
    private int field3828;

    @OriginalMember(owner = "client!rga", name = "m", descriptor = "I")
    private int field3832;

    @OriginalMember(owner = "client!rga", name = "g", descriptor = "I")
    private int field3827;

    @OriginalMember(owner = "client!rga", name = "p", descriptor = "I")
    private int field3837;

    @OriginalMember(owner = "client!rga", name = "k", descriptor = "I")
    public int field3825;

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "I")
    public int field3830;

    @OriginalMember(owner = "client!rga", name = "h", descriptor = "I")
    public int field3836;

    @OriginalMember(owner = "client!rga", name = "e", descriptor = "I")
    public int field3838;

    @OriginalMember(owner = "client!rga", name = "l", descriptor = "I")
    public int field3823;

    @OriginalMember(owner = "client!rga", name = "f", descriptor = "I")
    public int field3833;

    @OriginalMember(owner = "client!rga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3839 = new String[] { method2131(method2130("i[S\u000b93")), method2131(method2130("i[S\u000bDrR[QF3")), method2131(method2130("i[S\u000b<3")), method2131(method2130("i[S\u000b;3")), method2131(method2130("uI^I")), method2131(method2130("`\u0012\u001c\u000b\u0005")), method2131(method2130("i[S\u000b:3")) };

    @OriginalMember(owner = "client!rga", name = "i", descriptor = "I")
    public static int field3835 = 0;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!rga", name = "o", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!rga", name = "d", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!rga", name = "j", descriptor = "[Lvu;")
    public static class356[] field3829;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IIIIIIIIIII)V")
    public final void method2126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        try {
            this.field3832 = arg8;
            field3826++;
            this.field3828 = arg7 * arg7;
            this.field3827 = arg0;
            this.field3837 = arg3;
            this.field3825 = this.field3832 + arg2;
            this.field3836 = this.field3837 + arg4;
            this.field3830 = this.field3827 + arg6;
            this.field3823 = this.field3827 + arg5;
            if (arg10 != 0) {
                method2129((byte) 62);
            }
            this.field3838 = this.field3837 + arg1;
            this.field3833 = this.field3832 + arg9;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field3839[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IILwq;)V")
    public static final void method2127(int arg0, int arg1, class176 arg2) {
        try {
            if (arg0 >= 46) {
                field3831++;
                if (class437.field6833 != null) {
                    try {
                        class437.field6833.method1724(8259, 0L);
                        class437.field6833.method1725(arg1, -11999, 24, arg2.field2805);
                    } catch (Exception var4) {
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3839[6] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3839[4] : field3839[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IIIB)Z")
    public final boolean method2128(int arg0, int arg1, int arg2, byte arg3) {
        try {
            int var5 = 105 % ((arg3 - 14) / 48);
            field3834++;
            if (this.field3825 > arg2 || arg2 > this.field3833) {
                return false;
            } else if (this.field3823 > arg0 || this.field3830 < arg0) {
                return false;
            } else if (arg1 >= this.field3836 && arg1 <= this.field3838) {
                int var6 = arg2 - this.field3832;
                int var7 = arg1 - this.field3837;
                return this.field3828 > var6 * var6 + var7 * var7;
            } else {
                return false;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field3839[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(B)V")
    public static void method2129(byte arg0) {
        try {
            if (arg0 >= -36) {
                field3824 = 103;
            }
            field3829 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3839[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            this.field3828 = arg3 * arg3;
            this.field3832 = arg0;
            this.field3827 = arg1;
            this.field3837 = arg2;
            this.field3825 = this.field3832 + arg4;
            this.field3830 = this.field3827 + arg7;
            this.field3836 = this.field3837 + arg8;
            this.field3838 = this.field3837 + arg9;
            this.field3823 = this.field3827 + arg6;
            this.field3833 = this.field3832 + arg5;
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field3839[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!rga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2130(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x78);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2131(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 27;
                    break;
                case 1:
                    var10005 = 60;
                    break;
                case 2:
                    var10005 = 50;
                    break;
                case 3:
                    var10005 = 37;
                    break;
                default:
                    var10005 = 120;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
