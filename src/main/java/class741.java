import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class741 {

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "Liha;")
    private class29 field10917 = new class29(128);

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "Lgda;")
    private class58 field10911;

    @OriginalMember(owner = "client!mga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10919 = new String[] { method5405(method5404("\u001dVEP\u001bX")), method5405(method5404("\u001dVEP\u0018X")), method5405(method5404("\u001dVEP\u0019X")), method5405(method5404("\u001dVEP\u001eX")), method5405(method5404("\u001dVEPf\u0019_M\ndX")), method5405(method5404("\u000b\u001f\nP'")), method5405(method5404("\u001eDH\u0012")) };

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
    public static int field10913 = 0;

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "[F")
    public static float[] field10915 = new float[16];

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "Lhl;")
    public static class556 field10912 = new class556(37, 4);

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "I")
    public static int field10910;

    @OriginalMember(owner = "client!mga", name = "i", descriptor = "I")
    public static int field10914;

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "I")
    public static int field10916;

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
    public static int field10918;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IB)Lge;", line = 7)
    public final class740 method5400(int arg0, byte arg1) {
        try {
            field10910++;
            class29 var3 = this.field10917;
            class740 var4;
            synchronized (this.field10917) {
                var4 = (class740) this.field10917.method302(-105, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            byte[] var5 = this.field10911.method604((byte) 119, class2.method6(arg0, 33985), class764.method5515(16, arg0));
            if (arg1 >= -51) {
                method5401(80, true, 18, -2, false);
            }
            class740 var6 = new class740();
            if (var5 != null) {
                var6.method5395((byte) -78, new class176(var5));
            }
            class29 var7 = this.field10917;
            synchronized (this.field10917) {
                this.field10917.method295(false, (long) arg0, var6);
                return var6;
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field10919[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IZIIZ)V", line = 42)
    public static final void method5401(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        try {
            if (class623.field8996.field6379.method4132(true) == 0) {
                class21.method137(8, false);
            } else {
                class313.field5122 = class623.field8996.field6379.method4132(true);
                class679.method4942(true, (byte) 57, 0);
            }
            field10918++;
            class496.field7449 = arg2;
            if (arg1) {
                field10913 = 65;
            }
            class76.field1099 = arg4;
            class382.field6136 = arg3;
            class770.method5549(arg0);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field10919[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V", line = 68)
    public static void method5402(int arg0) {
        try {
            field10915 = null;
            if (arg0 == -28721) {
                field10912 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10919[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(III)V", line = 81)
    public static final void method5403(int arg0, int arg1, int arg2) {
        try {
            field10916++;
            if (arg1 == 0) {
                class551 var3 = class380.method3113(-113, (long) arg2, 14);
                var3.method4086(68);
                var3.field8076 = arg0;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10919[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lpo;ILgda;)V", line = 98)
    public class741(class585 arg0, int arg1, class58 arg2) {
        try {
            this.field10911 = arg2;
            if (this.field10911 != null) {
                int var4 = this.field10911.method600(1) - 1;
                this.field10911.method580(86, var4);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field10919[4] + (arg0 == null ? field10919[6] : field10919[5]) + ',' + arg1 + ',' + (arg2 == null ? field10919[6] : field10919[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!mga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5404(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5405(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 112;
                    break;
                case 1:
                    var10005 = 49;
                    break;
                case 2:
                    var10005 = 36;
                    break;
                case 3:
                    var10005 = 126;
                    break;
                default:
                    var10005 = 90;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
