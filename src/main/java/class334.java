import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class334 {

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "Lwq;")
    private class178 field5225 = new class178(64);

    @OriginalMember(owner = "client!uea", name = "d", descriptor = "Lla;")
    private class476 field5224;

    @OriginalMember(owner = "client!uea", name = "f", descriptor = "I")
    public int field5226;

    @OriginalMember(owner = "client!uea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5228 = new String[] { method2804(method2803("\u0003$\nc\u0005^")), method2804(method2803("\roEc9")), method2804(method2803("\u00184\u0007!")), method2804(method2803("\u0003$\ncx\u001f/\u00029z^")), method2804(method2803("\u001f'Z")), method2804(method2803("\u0003$\nc\u0006^")), method2804(method2803("\u0003$\nc\u0007^")) };

    @OriginalMember(owner = "client!uea", name = "e", descriptor = "[I")
    public static int[] field5223 = new int[2];

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "Lvd;")
    public static class42 field5227;

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(II)Ldq;", line = 6)
    public final class725 method2800(int arg0, int arg1) {
        try {
            field5221++;
            class178 var3 = this.field5225;
            class725 var4;
            synchronized (this.field5225) {
                if (arg0 != 19) {
                    field5223 = null;
                }
                var4 = (class725) this.field5225.method1558((byte) 96, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class476 var5 = this.field5224;
            byte[] var6;
            synchronized (this.field5224) {
                var6 = this.field5224.method3632(19, arg1, -127);
            }
            class725 var7 = new class725();
            if (var6 != null) {
                var7.method5283(new class163(var6), 41);
            }
            class178 var8 = this.field5225;
            synchronized (this.field5225) {
                this.field5225.method1556((long) arg1, var7, 1);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field5228[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(II)Z", line = 42)
    public static final boolean method2801(int arg0, int arg1) {
        try {
            field5222++;
            if (class376.field5722[arg0]) {
                return true;
            } else if (class113.field1322.method3616((byte) -39, arg0)) {
                int var2 = class113.field1322.method3646(arg0, (byte) -109);
                if (var2 == 0) {
                    class376.field5722[arg0] = true;
                    return true;
                }
                if (class683.field9897[arg0] == null) {
                    class683.field9897[arg0] = new class541[var2];
                }
                for (int var3 = arg1; var3 < var2; var3++) {
                    if (class683.field9897[arg0][var3] == null) {
                        byte[] var4 = class113.field1322.method3632(arg0, var3, -128);
                        if (var4 != null) {
                            class541 var5 = class683.field9897[arg0][var3] = new class541();
                            var5.field8034 = (arg0 << 16) + var3;
                            if (var4[0] != -1) {
                                throw new IllegalStateException(field5228[4]);
                            }
                            var5.method4079((byte) 50, new class163(var4));
                        }
                    }
                }
                class376.field5722[arg0] = true;
                return true;
            } else {
                return false;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field5228[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)V", line = 100)
    public static void method2802(byte arg0) {
        try {
            field5223 = null;
            if (arg0 <= -55) {
                field5227 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5228[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lto;ILla;)V", line = 117)
    public class334(class8 arg0, int arg1, class476 arg2) {
        try {
            this.field5224 = arg2;
            this.field5226 = this.field5224.method3646(19, (byte) -18);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5228[3] + (arg0 == null ? field5228[2] : field5228[1]) + ',' + arg1 + ',' + (arg2 == null ? field5228[2] : field5228[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!uea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2803(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x44);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2804(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 118;
                    break;
                case 1:
                    var10005 = 65;
                    break;
                case 2:
                    var10005 = 107;
                    break;
                case 3:
                    var10005 = 77;
                    break;
                default:
                    var10005 = 68;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
