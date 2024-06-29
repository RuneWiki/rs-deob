import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class445 {

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "Lwq;")
    private class178 field6531 = new class178(256);

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "Lla;")
    private class476 field6533;

    @OriginalMember(owner = "client!hea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6536 = new String[] { method3423(method3422(":\u007f\u0000C+z")), method3423(method3422(":\u007f\u0000CS;t\b\u0019Qz")), method3423(method3422(")4OC\u0012")), method3423(method3422("<o\r\u0001")), method3423(method3422(":\u007f\u0000C,z")), method3423(method3422(":\u007f\u0000C-z")), method3423(method3422(":\u007f\u0000C.z")) };

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "I")
    public static int field6530 = 0;

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!hea", name = "f", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)V")
    public final void method3418(int arg0, int arg1) {
        try {
            if (arg1 != -13574) {
                this.method3420(false, 103);
            }
            field6535++;
            class178 var3 = this.field6531;
            synchronized (this.field6531) {
                this.field6531.method1557(arg0, (byte) -113);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6536[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V")
    public final void method3419(int arg0) {
        try {
            field6529++;
            class178 var2 = this.field6531;
            synchronized (this.field6531) {
                this.field6531.method1559(0);
                int var3 = -61 / ((arg0 + 19) / 53);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6536[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZI)Llu;")
    public final class740 method3420(boolean arg0, int arg1) {
        try {
            field6532++;
            class178 var3 = this.field6531;
            class740 var4;
            synchronized (this.field6531) {
                var4 = (class740) this.field6531.method1558((byte) 96, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class476 var5 = this.field6533;
            byte[] var6;
            synchronized (this.field6533) {
                if (!arg0) {
                    this.field6533 = null;
                }
                var6 = this.field6533.method3632(26, arg1, 83);
            }
            class740 var7 = new class740();
            if (var6 != null) {
                var7.method5397(0, new class163(var6));
            }
            class178 var8 = this.field6531;
            synchronized (this.field6531) {
                this.field6531.method1556((long) arg1, var7, 1);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field6536[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(I)V")
    public final void method3421(int arg0) {
        try {
            class178 var2 = this.field6531;
            synchronized (this.field6531) {
                if (arg0 != 0) {
                    this.field6533 = null;
                }
                this.field6531.method1569(10574);
            }
            field6534++;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6536[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lto;ILla;)V")
    public class445(class8 arg0, int arg1, class476 arg2) {
        try {
            this.field6533 = arg2;
            this.field6533.method3646(26, (byte) -29);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6536[1] + (arg0 == null ? field6536[3] : field6536[2]) + ',' + arg1 + ',' + (arg2 == null ? field6536[3] : field6536[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!hea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3422(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3423(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 82;
                    break;
                case 1:
                    var10005 = 26;
                    break;
                case 2:
                    var10005 = 97;
                    break;
                case 3:
                    var10005 = 109;
                    break;
                default:
                    var10005 = 111;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
