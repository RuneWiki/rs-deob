import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class642 {

    @OriginalMember(owner = "client!mfa", name = "g", descriptor = "Lwq;")
    private class178 field9304 = new class178(64);

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "Lla;")
    private class476 field9307;

    @OriginalMember(owner = "client!mfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9312 = new String[] { method4707(method4706("^b\"\u000eU\u001b")), method4707(method4706("H*m\u000ek")), method4707(method4706("]q/L")), method4707(method4706("^b\"\u000eW\u001b")), method4707(method4706("^b\"\u000eP\u001b")), method4707(method4706("^b\"\u000e*Zj*T(\u001b")), method4707(method4706("^b\"\u000eT\u001b")), method4707(method4706("^b\"\u000eR\u001b")) };

    @OriginalMember(owner = "client!mfa", name = "i", descriptor = "I")
    public static int field9303;

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "I")
    public static int field9305;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
    public static int field9306;

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
    public static int field9309;

    @OriginalMember(owner = "client!mfa", name = "h", descriptor = "I")
    public static int field9310;

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)V", line = 4)
    public final void method4700(int arg0) {
        try {
            field9306++;
            class178 var2 = this.field9304;
            synchronized (this.field9304) {
                this.field9304.method1569(arg0 ^ 0x2978);
                if (arg0 != 54) {
                    this.field9304 = null;
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9312[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II)Lnba;", line = 17)
    public final class314 method4701(int arg0, int arg1) {
        try {
            field9303++;
            class178 var3 = this.field9304;
            class314 var4;
            synchronized (this.field9304) {
                var4 = (class314) this.field9304.method1558((byte) 96, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            if (arg1 != -26767) {
                this.method4705(false, -8);
            }
            class476 var5 = this.field9307;
            byte[] var6;
            synchronized (this.field9307) {
                var6 = this.field9307.method3632(54, arg0, -125);
            }
            class314 var7 = new class314();
            if (var6 != null) {
                var7.method2646(new class163(var6), 1);
            }
            class178 var8 = this.field9304;
            synchronized (this.field9304) {
                this.field9304.method1556((long) arg0, var7, 1);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field9312[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lbda;I)I", line = 47)
    public static final int method4702(class531 arg0, int arg1) {
        try {
            field9309++;
            if (class206.field3175 == arg0) {
                return 7681;
            } else if (class684.field9909 == arg0) {
                return 8448;
            } else if (class134.field1562 == arg0) {
                return 34165;
            } else if (class362.field5530 == arg0) {
                return 260;
            } else if (class532.field7803 == arg0) {
                return 34023;
            } else if (arg1 == -8491) {
                throw new IllegalArgumentException();
            } else {
                return -121;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9312[3] + (arg0 == null ? field9312[2] : field9312[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(III)V", line = 80)
    public static final void method4703(int arg0, int arg1, int arg2) {
        class96 var3 = class734.field10683[arg0][arg1][arg2];
        if (var3 != null) {
            class645.method4748(var3.field1081);
            if (var3.field1081 != null) {
                var3.field1081 = null;
            }
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Z)V", line = 96)
    public final void method4704(boolean arg0) {
        try {
            field9311++;
            if (!arg0) {
                this.field9307 = null;
            }
            class178 var2 = this.field9304;
            synchronized (this.field9304) {
                this.field9304.method1559(0);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9312[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ZI)V", line = 115)
    public final void method4705(boolean arg0, int arg1) {
        try {
            field9310++;
            class178 var3 = this.field9304;
            synchronized (this.field9304) {
                this.field9304.method1557(arg1, (byte) -127);
            }
            if (arg0) {
                this.field9307 = null;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9312[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Lto;ILla;)V", line = 130)
    public class642(class8 arg0, int arg1, class476 arg2) {
        try {
            this.field9307 = arg2;
            if (this.field9307 != null) {
                this.field9307.method3646(54, (byte) -38);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9312[5] + (arg0 == null ? field9312[2] : field9312[1]) + ',' + arg1 + ',' + (arg2 == null ? field9312[2] : field9312[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!mfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4706(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x16);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4707(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 51;
                    break;
                case 1:
                    var10005 = 4;
                    break;
                case 2:
                    var10005 = 67;
                    break;
                case 3:
                    var10005 = 32;
                    break;
                default:
                    var10005 = 22;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
