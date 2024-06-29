import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class84 extends class54 {

    @OriginalMember(owner = "client!qw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field943 = new String[] { method720(method719("\u001e\b\u001deG")), method720(method719("\u001e\b\u001dgG")), method720(method719("\u001e\b\u001d`G")), method720(method719("\u001e\b\u001dbG")), method720(method719("\u001e\b\u001dfG")), method720(method719("\u001e\b\u001daG")), method720(method719("\u001e\b\u001dcG")) };

    @OriginalMember(owner = "client!qw", name = "o", descriptor = "Ltw;")
    public static class214 field936 = new class214(true);

    @OriginalMember(owner = "client!qw", name = "t", descriptor = "I")
    public static int field940 = 0;

    @OriginalMember(owner = "client!qw", name = "s", descriptor = "I")
    public static int field942 = -1;

    @OriginalMember(owner = "client!qw", name = "p", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!qw", name = "n", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!qw", name = "q", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!qw", name = "m", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!qw", name = "u", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!qw", name = "r", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(Z)I", line = 5)
    public final int method111(boolean arg0) {
        try {
            ++field937;
            if (arg0) {
                method716(57, -98, (byte) -98, -62);
            }
            return super.field589.method653(24915) == class243.field3725 && super.field589.method656(true) ? 0 : 1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field943[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIBI)I", line = 21)
    public static final int method716(int arg0, int arg1, byte arg2, int arg3) {
        try {
            int var6 = arg3 & 3;
            ++field941;
            if (arg2 != 35) {
                field942 = -73;
            }
            if (~var6 == -1) {
                return arg0;
            } else if (var6 == 1) {
                return arg1;
            } else {
                return ~var6 == -3 ? -arg0 + 4095 : 4095 - arg1;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field943[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(II)V", line = 45)
    public final void method113(int arg0, int arg1) {
        try {
            ++field934;
            if (arg0 != 0) {
                field942 = -39;
            }
            super.field593 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field943[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Z)V", line = 57)
    public final void method115(boolean arg0) {
        try {
            super.field593 = this.method111(false);
            if (!arg0) {
                this.method717(false);
            }
            ++field938;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field943[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Lhia;)V", line = 68)
    public class84(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(IB)I", line = 71)
    public final int method109(int arg0, byte arg1) {
        try {
            ++field939;
            if (arg1 > -106) {
                this.method113(125, -117);
            }
            return 3;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field943[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "(Z)I", line = 82)
    public final int method717(boolean arg0) {
        try {
            if (arg0) {
                field942 = 96;
            }
            ++field935;
            return super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field943[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(ILhia;)V", line = 93)
    public class84(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "(I)V", line = 100)
    public static void method718(int arg0) {
        try {
            if (arg0 >= 91) {
                field936 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field943[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method719(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 111);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method720(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 111;
                    break;
                case 1:
                    var10005 = 127;
                    break;
                case 2:
                    var10005 = 51;
                    break;
                case 3:
                    var10005 = 36;
                    break;
                default:
                    var10005 = 111;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
