import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class47 implements class410 {

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "Lsca;")
    private class50 field537;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "Llr;")
    private class783 field542;

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field543 = new String[] { method372(method371("B?\t'm")), method372(method371("B?\t&m")), method372(method371("B?\t m")), method372(method371("Z%K\b")), method372(method371("O~\tJ8")), method372(method371("B?\tX,Z9SZm")), method372(method371("B?\t%m")), method372(method371("B?\t.m")) };

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "Lvha;")
    public static class713 field540 = new class713(10, 4);

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)V")
    public static void method366(boolean arg0) {
        try {
            field540 = null;
            if (!arg0) {
                field540 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field543[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLjava/lang/String;IILda;I)I")
    private final int method367(byte arg0, String arg1, int arg2, int arg3, class67 arg4, int arg5) {
        try {
            int var7 = -114 % ((arg0 + 44) / 34);
            field541++;
            return arg4.method598(0, 0, this.field542.field11407 - arg3 * 2, this.field542.field11404, this.field542.field11413, (byte) -44, null, this.field542.field11416 - arg3 * 2, arg1, 0, null, arg3 + arg5, 0, null, arg2 + arg3, 0);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field543[6] + arg0 + ',' + (arg1 == null ? field543[3] : field543[4]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field543[3] : field543[4]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZB)V")
    public final void method368(boolean arg0, byte arg1) {
        try {
            field539++;
            int var3 = 21 % ((38 - arg1) / 37);
            class594 var4 = this.field537.method383((byte) -32, this.field542.field11408);
            if (var4 != null) {
                int var5 = this.field542.field11412.method4532(this.field542.field11416, 0, class604.field8861) + this.field542.field11403;
                int var6 = this.field542.field11405.method2339(this.field542.field11407, (byte) -69, class524.field7654) + this.field542.field11406;
                if (this.field542.field11402) {
                    class610.field8913.method527(var5, var6, this.field542.field11416, this.field542.field11407, this.field542.field11414, 0);
                }
                int var7 = var6 + this.method367((byte) -118, var4.field8719, var6, 5, class269.field4100, var5) * 12;
                int var12 = var7 + 8;
                if (this.field542.field11402) {
                    class610.field8913.method532(var5, var12, var5 - (1 - this.field542.field11416), var12, this.field542.field11414, 0);
                }
                var7 = var12 + 1;
                int var8 = var7 + this.method367((byte) 59, var4.field8715, var7, 5, class269.field4100, var5) * 12;
                int var13 = var8 + 5;
                int var10000 = var13 + this.method367((byte) 65, var4.field8717, var13, 5, class269.field4100, var5) * 12;
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field543[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)Z")
    public final boolean method369(int arg0) {
        try {
            if (arg0 == -17976) {
                field538++;
                return this.field537.method381(true);
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field543[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lsca;Llr;)V")
    public class47(class50 arg0, class783 arg1) {
        try {
            this.field537 = arg0;
            this.field542 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field543[5] + (arg0 == null ? field543[3] : field543[4]) + ',' + (arg1 == null ? field543[3] : field543[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
    public final void method370(byte arg0) {
        try {
            field536++;
            if (arg0 >= -98) {
                this.field542 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field543[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method371(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method372(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 52;
                    break;
                case 1:
                    var10005 = 80;
                    break;
                case 2:
                    var10005 = 39;
                    break;
                case 3:
                    var10005 = 100;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
