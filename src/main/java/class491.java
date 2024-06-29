import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class491 extends class114 {

    @OriginalMember(owner = "client!baa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7199 = new String[] { method3787(method3786("fq\u000f4-{~6* pv!'")), method3787(method3786("wx\u0001m\u0007=")), method3787(method3786("n7Nm9")), method3787(method3786("wx\u0001m\u0006=")), method3787(method3786("{l\f/")), method3787(method3786("wx\u0001m\u0000=")), method3787(method3786("wx\u0001m\u0005=")), method3787(method3786("wx\u0001m\u0001=")), method3787(method3786("wx\u0001m\u0002=")) };

    @OriginalMember(owner = "client!baa", name = "n", descriptor = "Lmv;")
    public static class125 field7192 = new class125(57, 3);

    @OriginalMember(owner = "client!baa", name = "o", descriptor = "Lu;")
    public static class741 field7197 = new class741(method3787(method3786("BM)")), method3787(method3786("z\u007f\u0006*'p")), method3787(method3786("Jn\u0014*")), 5);

    @OriginalMember(owner = "client!baa", name = "p", descriptor = "B")
    private byte field7191;

    @OriginalMember(owner = "client!baa", name = "t", descriptor = "B")
    private byte field7194;

    @OriginalMember(owner = "client!baa", name = "j", descriptor = "B")
    private byte field7195;

    @OriginalMember(owner = "client!baa", name = "k", descriptor = "B")
    private byte field7198;

    @OriginalMember(owner = "client!baa", name = "l", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!baa", name = "u", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!baa", name = "q", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!baa", name = "s", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!baa", name = "r", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!baa", name = "m", descriptor = "Z")
    private boolean field7189;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(Z)V")
    public static void method3782(boolean arg0) {
        try {
            field7197 = null;
            field7192 = null;
            if (!arg0) {
                field7192 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7199[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILwfa;)V")
    public final void method115(int arg0, class286 arg1) {
        try {
            arg1.field4018 = this.field7191;
            if (arg0 != 95) {
                method3783(-32, null);
            }
            arg1.field4046 = this.field7198;
            arg1.field4032 = this.field7195;
            arg1.field4041 = this.field7194;
            arg1.field4019 = this.field7189;
            field7193++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7199[5] + arg0 + ',' + (arg1 == null ? field7199[4] : field7199[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method3783(int arg0, String arg1) {
        try {
            field7188++;
            int var2 = arg1.length();
            if (var2 == 0) {
                return new byte[0];
            }
            int var3 = -113 / ((arg0 - 22) / 55);
            int var4 = var2 + 3 & 0xFFFFFFFC;
            int var5 = var4 / 4 * 3;
            if (var4 - 2 >= var2 || class430.method3351(arg1.charAt(var4 - 2), 3) == -1) {
                var5 -= 2;
            } else if (var2 <= (var4 - 1) || class430.method3351(arg1.charAt(var4 - 1), 3) == -1) {
                var5--;
            }
            byte[] var6 = new byte[var5];
            class263.method2176(arg1, 0, var6, 0);
            return var6;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field7199[3] + arg0 + ',' + (arg1 == null ? field7199[4] : field7199[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Ljc;I)V")
    public final void method116(class711 arg0, int arg1) {
        try {
            field7187++;
            this.field7189 = arg0.method5128(0) == 1;
            this.field7195 = arg0.method5125((byte) 104);
            this.field7191 = arg0.method5125((byte) -110);
            this.field7194 = arg0.method5125((byte) -35);
            this.field7198 = arg0.method5125((byte) 104);
            if (arg1 != -27800) {
                this.field7189 = false;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7199[6] + (arg0 == null ? field7199[4] : field7199[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(III)V")
    public static final void method3784(int arg0, int arg1, int arg2) {
        try {
            field7190++;
            class652.field9261++;
            class274 var3 = class375.method2969((byte) 1, class445.field6559, class60.field916.field11100);
            var3.field3885.method5121(-121, arg1);
            if (arg0 != 1) {
                method3784(-53, -59, -28);
            }
            var3.field3885.method5143(83, arg2);
            class60.field916.method5608(var3, 29867);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7199[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)Z")
    public static final boolean method3785(int arg0) {
        try {
            field7196++;
            if (arg0 != 28472) {
                field7192 = null;
            }
            if (class104.field1371) {
                try {
                    if ((Boolean) class192.method1601(field7199[0], class290.field4091, 4368)) {
                        return false;
                    }
                    return true;
                } catch (Throwable var2) {
                }
            }
            return true;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7199[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!baa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3786(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x44);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!baa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3787(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 21;
                    break;
                case 1:
                    var10005 = 25;
                    break;
                case 2:
                    var10005 = 96;
                    break;
                case 3:
                    var10005 = 67;
                    break;
                default:
                    var10005 = 68;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
