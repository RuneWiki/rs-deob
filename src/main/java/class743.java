import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public class class743 {

    @OriginalMember(owner = "client!lja", name = "h", descriptor = "Lwq;")
    private class178 field10814 = new class178(128);

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "Lla;")
    private class476 field10812;

    @OriginalMember(owner = "client!lja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10819 = new String[] { method5421(method5420(")3\u001f2(")), method5421(method5420(">wP2i;sXhkz")), method5421(method5420("<h]p")), method5421(method5420(">wP2\u0013z")), method5421(method5420(">wP2\u0016z")), method5421(method5420(">wP2\u0014z")), method5421(method5420(">wP2\u0017z")), method5421(method5420(">wP2\u0010z")), method5421(method5420(">wP2\u0011z")) };

    @OriginalMember(owner = "client!lja", name = "f", descriptor = "Lef;")
    public static class513 field10807 = new class513();

    @OriginalMember(owner = "client!lja", name = "j", descriptor = "Z")
    public static boolean field10816 = true;

    @OriginalMember(owner = "client!lja", name = "c", descriptor = "I")
    public static int field10817 = 1339;

    @OriginalMember(owner = "client!lja", name = "k", descriptor = "I")
    public static int field10808;

    @OriginalMember(owner = "client!lja", name = "e", descriptor = "I")
    public static int field10809;

    @OriginalMember(owner = "client!lja", name = "g", descriptor = "I")
    public static int field10811;

    @OriginalMember(owner = "client!lja", name = "l", descriptor = "I")
    public static int field10813;

    @OriginalMember(owner = "client!lja", name = "b", descriptor = "I")
    public static int field10815;

    @OriginalMember(owner = "client!lja", name = "d", descriptor = "I")
    public static int field10818;

    @OriginalMember(owner = "client!lja", name = "i", descriptor = "Lla;")
    public static class476 field10810;

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(ZII)Z")
    public static final boolean method5414(boolean arg0, int arg1, int arg2) {
        try {
            field10809++;
            if (arg0) {
                return (arg1 & 0x70000) != 0 | class616.method4572(arg2, -1, arg1) || class531.method4018(3, arg2, arg1);
            } else {
                return true;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10819[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(BI)Lpba;")
    public final class350 method5415(byte arg0, int arg1) {
        try {
            field10815++;
            class178 var3 = this.field10814;
            class350 var4;
            synchronized (this.field10814) {
                var4 = (class350) this.field10814.method1558((byte) 96, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class476 var5 = this.field10812;
            byte[] var6;
            synchronized (this.field10812) {
                var6 = this.field10812.method3632(1, arg1, arg0 - 157);
                if (arg0 != 36) {
                    method5419((byte) -109);
                }
            }
            class350 var7 = new class350();
            if (var6 != null) {
                var7.method2872(arg0 - 36, new class163(var6));
            }
            class178 var8 = this.field10814;
            synchronized (this.field10814) {
                this.field10814.method1556((long) arg1, var7, 1);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field10819[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "b", descriptor = "(BI)V")
    public final void method5416(byte arg0, int arg1) {
        try {
            class178 var3 = this.field10814;
            synchronized (this.field10814) {
                this.field10814.method1557(arg1, (byte) -111);
            }
            field10808++;
            if (arg0 <= 108) {
                field10807 = null;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10819[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(I)V")
    public final void method5417(int arg0) {
        try {
            field10811++;
            class178 var2 = this.field10814;
            synchronized (this.field10814) {
                this.field10814.method1559(0);
                if (arg0 < 109) {
                    method5414(false, 77, 29);
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10819[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "b", descriptor = "(I)V")
    public final void method5418(int arg0) {
        try {
            class178 var2 = this.field10814;
            synchronized (this.field10814) {
                if (arg0 != 9733) {
                    this.method5418(80);
                }
                this.field10814.method1569(10574);
            }
            field10813++;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10819[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(Lto;ILla;)V")
    public class743(class8 arg0, int arg1, class476 arg2) {
        try {
            this.field10812 = arg2;
            this.field10812.method3646(1, (byte) -95);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10819[1] + (arg0 == null ? field10819[2] : field10819[0]) + ',' + arg1 + ',' + (arg2 == null ? field10819[2] : field10819[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "a", descriptor = "(B)V")
    public static void method5419(byte arg0) {
        try {
            if (arg0 != -64) {
                field10807 = null;
            }
            field10810 = null;
            field10807 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10819[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5420(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x55);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5421(char[] arg0) {
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
                    var10005 = 29;
                    break;
                case 2:
                    var10005 = 49;
                    break;
                case 3:
                    var10005 = 28;
                    break;
                default:
                    var10005 = 85;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
