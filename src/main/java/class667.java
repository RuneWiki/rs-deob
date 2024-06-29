import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class667 implements class245 {

    @OriginalMember(owner = "client!sca", name = "q", descriptor = "I")
    public int field9404;

    @OriginalMember(owner = "client!sca", name = "s", descriptor = "I")
    public int field9413;

    @OriginalMember(owner = "client!sca", name = "l", descriptor = "I")
    public int field9419;

    @OriginalMember(owner = "client!sca", name = "p", descriptor = "I")
    public int field9408;

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "Lmq;")
    public class657 field9405;

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "I")
    public int field9418;

    @OriginalMember(owner = "client!sca", name = "n", descriptor = "I")
    public int field9402;

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "I")
    public int field9411;

    @OriginalMember(owner = "client!sca", name = "o", descriptor = "I")
    public int field9403;

    @OriginalMember(owner = "client!sca", name = "h", descriptor = "Ljava/lang/String;")
    public String field9407;

    @OriginalMember(owner = "client!sca", name = "t", descriptor = "Lrj;")
    public class252 field9400;

    @OriginalMember(owner = "client!sca", name = "m", descriptor = "I")
    public int field9412;

    @OriginalMember(owner = "client!sca", name = "u", descriptor = "I")
    public int field9415;

    @OriginalMember(owner = "client!sca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9421 = new String[] { method4809(method4808("Y9? ")), method4809(method4808("Lb}bU")), method4809(method4808("D/2bi\u001f")), method4809(method4808("D/2bj\u001f")), method4809(method4808("D$<;~^(6#iS")), method4809(method4808("D/2b\u0014^\":8\u0016\u001f")), method4809(method4808("D/2bk\u001f")), method4809(method4808("D/2bm\u001f")) };

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "Lmv;")
    public static class125 field9410 = new class125(73, 4);

    @OriginalMember(owner = "client!sca", name = "i", descriptor = "Lop;")
    public static class574 field9416 = new class574("", 17);

    @OriginalMember(owner = "client!sca", name = "j", descriptor = "I")
    public static int field9401;

    @OriginalMember(owner = "client!sca", name = "r", descriptor = "I")
    public static int field9406;

    @OriginalMember(owner = "client!sca", name = "g", descriptor = "I")
    public static int field9409;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
    public static int field9420;

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "Lsn;")
    public static class369 field9414;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(B)V")
    public static void method4804(byte arg0) {
        try {
            field9414 = null;
            field9410 = null;
            if (arg0 != 87) {
                method4807(62, -70, null, 111, true);
            }
            field9416 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9421[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(II)I")
    public static final int method4805(int arg0, int arg1) {
        return class787.field11366 == null ? 0 : class787.field11366[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "(B)Z")
    public static final boolean method4806(byte arg0) {
        try {
            if (arg0 != -108) {
                return true;
            }
            field9401++;
            if (class104.field1371) {
                try {
                    class192.method1601(field9421[4], class290.field4091, 4368);
                    return true;
                } catch (Throwable var2) {
                }
            }
            return false;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9421[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IILml;IZ)Lgda;")
    public static final class268 method4807(int arg0, int arg1, class194 arg2, int arg3, boolean arg4) {
        try {
            if (arg4) {
                field9414 = null;
            }
            field9409++;
            if (arg2.field2899 || class357.method2858(arg0, false) && class357.method2858(arg3, false)) {
                return new class268(arg2, 3553, arg1, arg0, arg3);
            } else if (arg2.field2884) {
                return new class268(arg2, 34037, arg1, arg0, arg3);
            } else {
                return new class268(arg2, arg1, arg0, arg3, class788.method5671(1282334120, arg0), class788.method5671(1282334120, arg3));
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9421[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field9421[0] : field9421[1]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)Luu;")
    public final class240 method482(int arg0) {
        try {
            if (arg0 != 0) {
                this.field9407 = null;
            }
            field9406++;
            return class248.field3553;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9421[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Ljava/lang/String;Lrj;Lmq;IIIIIIIIII)V")
    public class667(String arg0, class252 arg1, class657 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        try {
            this.field9404 = arg5;
            this.field9413 = arg7;
            this.field9419 = arg9;
            this.field9408 = arg6;
            this.field9405 = arg2;
            this.field9418 = arg8;
            this.field9402 = arg10;
            this.field9411 = arg4;
            this.field9403 = arg3;
            this.field9407 = arg0;
            this.field9400 = arg1;
            this.field9412 = arg12;
            this.field9415 = arg11;
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field9421[5] + (arg0 == null ? field9421[0] : field9421[1]) + ',' + (arg1 == null ? field9421[0] : field9421[1]) + ',' + (arg2 == null ? field9421[0] : field9421[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!sca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4808(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x28);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4809(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 55;
                    break;
                case 1:
                    var10005 = 76;
                    break;
                case 2:
                    var10005 = 83;
                    break;
                case 3:
                    var10005 = 76;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
