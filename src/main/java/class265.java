import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class265 {

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field3744;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Ljh;")
    private class698 field3740;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Ljg;")
    private class25 field3742;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field3749;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "Laf;")
    private class289 field3748;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3751 = new String[] { method2191(method2190("J\u001dv\u0007s")), method2191(method2190("@\r4(")), method2191(method2190("UVvj&")), method2191(method2190("J\u001dvx2@\u0011,zs")), method2191(method2190("J\u001dv\u0000s")), method2191(method2190("J\u001dv\u0001s")), method2191(method2190("J\u001dv\u0005s")), method2191(method2190("J\u001dv\u0006s")) };

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Ljc;")
    private class711 field3747;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "[Ljba;")
    private class492[] field3743;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lnha;BLnha;I)Ljba;", line = 12)
    public final class492 method2185(class335 arg0, byte arg1, class335 arg2, int arg3) {
        try {
            field3746++;
            if (arg1 != -47) {
                method2188(104, -79, 70);
            }
            return this.method2186(true, arg3, arg2, arg0, (byte) -123);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3751[6] + (arg0 == null ? field3751[1] : field3751[2]) + ',' + arg1 + ',' + (arg2 == null ? field3751[1] : field3751[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZILnha;Lnha;B)Ljba;", line = 24)
    private final class492 method2186(boolean arg0, int arg1, class335 arg2, class335 arg3, byte arg4) {
        try {
            field3745++;
            if (this.field3747 == null) {
                throw new RuntimeException();
            } else if (arg1 < 0 || this.field3743.length <= arg1) {
                throw new RuntimeException();
            } else if (this.field3743[arg1] == null) {
                this.field3747.field9945 = arg1 * 72 + 6;
                int var6 = this.field3747.method5113(18443);
                int var7 = this.field3747.method5113(18443);
                byte[] var8 = new byte[64];
                this.field3747.method5117(64, 0, var8, 68);
                class492 var9 = new class492(arg1, arg2, arg3, this.field3740, this.field3742, var6, var8, var7, arg0);
                if (arg4 >= -5) {
                    this.method2185(null, (byte) -67, null, 16);
                }
                this.field3743[arg1] = var9;
                return var9;
            } else {
                return this.field3743[arg1];
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field3751[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3751[1] : field3751[2]) + ',' + (arg3 == null ? field3751[1] : field3751[2]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)Z", line = 67)
    public final boolean method2187(int arg0) {
        try {
            field3737++;
            if (this.field3747 != null) {
                return true;
            }
            if (this.field3748 == null) {
                if (this.field3740.method5028(false)) {
                    return false;
                }
                this.field3748 = this.field3740.method5031((byte) 0, 255, (byte) -5, 255, true);
            }
            if (this.field3748.field4364) {
                return false;
            }
            class711 var2 = new class711(this.field3748.method2023(97));
            var2.field9945 = 5;
            if (arg0 != 23004) {
                this.method2189((byte) -90);
            }
            int var3 = var2.method5128(0);
            var2.field9945 += var3 * 72;
            byte[] var4 = new byte[var2.field9996.length - var2.field9945];
            var2.method5117(var4.length, 0, var4, 109);
            byte[] var7;
            if (this.field3749 == null || this.field3744 == null) {
                var7 = var4;
            } else {
                BigInteger var5 = new BigInteger(var4);
                BigInteger var6 = var5.modPow(this.field3749, this.field3744);
                var7 = var6.toByteArray();
            }
            if (var7.length != 65) {
                throw new RuntimeException();
            }
            byte[] var8 = class204.method1750(var2.field9945 - var4.length - 5, 5, var2.field9996, 17887);
            for (int var9 = 0; var9 < 64; var9++) {
                if (var8[var9] != var7[var9 + 1]) {
                    throw new RuntimeException();
                }
            }
            this.field3743 = new class492[var3];
            this.field3747 = var2;
            return true;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field3751[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)Z", line = 148)
    public static final boolean method2188(int arg0, int arg1, int arg2) {
        try {
            if (arg1 != 384) {
                field3741 = -72;
            }
            field3750++;
            return (arg2 & 0x180) != 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3751[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 160)
    public final void method2189(byte arg0) {
        try {
            field3739++;
            if (this.field3743 != null) {
                for (int var2 = 0; var2 < this.field3743.length; var2++) {
                    if (this.field3743[var2] != null) {
                        this.field3743[var2].method3793(26125);
                    }
                }
                if (arg0 != 110) {
                    this.method2187(-93);
                }
                for (int var3 = 0; var3 < this.field3743.length; var3++) {
                    if (this.field3743[var3] != null) {
                        this.field3743[var3].method3800((byte) -94);
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3751[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Ljh;Ljg;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 196)
    public class265(class698 arg0, class25 arg1, BigInteger arg2, BigInteger arg3) {
        try {
            this.field3744 = arg3;
            this.field3740 = arg0;
            this.field3742 = arg1;
            this.field3749 = arg2;
            if (!this.field3740.method5028(false)) {
                this.field3748 = this.field3740.method5031((byte) 0, 255, (byte) -5, 255, true);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3751[3] + (arg0 == null ? field3751[1] : field3751[2]) + ',' + (arg1 == null ? field3751[1] : field3751[2]) + ',' + (arg2 == null ? field3751[1] : field3751[2]) + ',' + (arg3 == null ? field3751[1] : field3751[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!de", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2190(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!de", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2191(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 46;
                    break;
                case 1:
                    var10005 = 120;
                    break;
                case 2:
                    var10005 = 88;
                    break;
                case 3:
                    var10005 = 68;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
