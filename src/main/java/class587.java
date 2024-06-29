import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class587 {

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "Liha;")
    private class29 field8511 = new class29(16);

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "Lgda;")
    private class58 field8512;

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8515 = new String[] { method4317(method4316("y0\u0012\u0006")), method4317(method4316("lkPD2")), method4317(method4316("c3PV&y,\nTg")), method4317(method4316("c3P/g")), method4317(method4316("c3P)g")), method4317(method4316("c3P-g")), method4317(method4316("c3P.g")), method4317(method4316("c3P(g")), method4317(method4316("c3P,g")), method4317(method4316("c3P+g")) };

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "I")
    public static int field8503;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "I")
    public static int field8505;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    public static int field8506;

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "I")
    public static int field8507;

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "I")
    public static int field8508;

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
    public static int field8509;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
    public static int field8510;

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "I")
    public static int field8513;

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "I")
    public static int field8514;

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "Ljava/lang/Object;")
    public static Object field8504;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(II)V")
    public static final void method4309(int arg0, int arg1) {
        try {
            field8513++;
            class781.field11393 = arg1;
            if (arg0 != 29) {
                method4310(72);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8515[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
    public static void method4310(int arg0) {
        try {
            field8504 = null;
            if (arg0 >= -95) {
                field8504 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8515[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BI)Laaa;")
    private final class644 method4311(byte arg0, int arg1) {
        try {
            field8508++;
            class29 var3 = this.field8511;
            class644 var4;
            synchronized (this.field8511) {
                var4 = (class644) this.field8511.method302(-100, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field8512;
            byte[] var6;
            synchronized (this.field8512) {
                var6 = this.field8512.method604((byte) 91, arg1, 29);
            }
            class644 var7 = new class644();
            int var8 = -99 / ((arg0 - 66) / 46);
            if (var6 != null) {
                var7.method4661(new class176(var6), -109);
            }
            class29 var9 = this.field8511;
            synchronized (this.field8511) {
                this.field8511.method295(false, (long) arg1, var7);
                return var7;
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field8515[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IB)V")
    public final void method4312(int arg0, byte arg1) {
        try {
            class29 var3 = this.field8511;
            synchronized (this.field8511) {
                this.field8511.method294(arg0, -630);
            }
            if (arg1 >= -55) {
                this.field8511 = null;
            }
            field8509++;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8515[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V")
    public final void method4313(boolean arg0) {
        try {
            if (!arg0) {
                field8504 = null;
            }
            field8507++;
            class29 var2 = this.field8511;
            synchronized (this.field8511) {
                this.field8511.method304(1);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8515[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILhw;IIII)Lin;")
    public final class96 method4314(int arg0, class138 arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field8503++;
            class35[] var7 = null;
            if (arg2 != -17494) {
                method4309(-94, -81);
            }
            class644 var8 = this.method4311((byte) 127, arg0);
            if (var8.field9229 != null) {
                var7 = new class35[var8.field9229.length];
                for (int var9 = 0; var9 < var7.length; var9++) {
                    class307 var10 = arg1.method1283(var8.field9229[var9], (byte) 124);
                    var7[var9] = new class35(var10.field4974, var10.field4969, var10.field4972, var10.field4976, var10.field4977, var10.field4968, var10.field4973, var10.field4979);
                }
            }
            return new class96(var8.field9236, var7, var8.field9228, arg3, arg4, arg5);
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field8515[9] + arg0 + ',' + (arg1 == null ? field8515[0] : field8515[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V")
    public final void method4315(int arg0) {
        try {
            if (arg0 != 16199) {
                this.method4311((byte) -92, 68);
            }
            field8514++;
            class29 var2 = this.field8511;
            synchronized (this.field8511) {
                this.field8511.method298(5);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8515[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lpo;ILgda;)V")
    public class587(class585 arg0, int arg1, class58 arg2) {
        try {
            this.field8512 = arg2;
            this.field8512.method580(68, 29);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8515[2] + (arg0 == null ? field8515[0] : field8515[1]) + ',' + arg1 + ',' + (arg2 == null ? field8515[0] : field8515[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4316(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4317(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 69;
                    break;
                case 2:
                    var10005 = 126;
                    break;
                case 3:
                    var10005 = 106;
                    break;
                default:
                    var10005 = 79;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
