import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class391 {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Liha;")
    private class29 field6241 = new class29(64);

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Lgda;")
    private class58 field6234;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Lgj;")
    public class663 field6243;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6244 = new String[] { method3186(method3185("\u0005\u0013\u0018\b5")), method3186(method3185("\u0005\u0013\u0018\f5")), method3186(method3185("\u0005\u0013\u0018\t5")), method3186(method3185("\u0005\u0013\u0018\u000b5")), method3186(method3185("\u0005\u0013\u0018\u000e5")), method3186(method3185("\u0016X\u0018c`")), method3186(method3185("\u0005\u0013\u0018qt\u0003\u001fBs5")), method3186(method3185("\u0003\u0003Z!")), method3186(method3185("\u0005\u0013\u0018\u000f5")) };

    @OriginalMember(owner = "client!he", name = "b", descriptor = "[I")
    public static int[] field6236 = new int[128];

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Leg;")
    public static class114 field6242;

    static {
        for (int var0 = 0; var0 < field6236.length; var0++) {
            field6236[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field6236[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field6236[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field6236[var3] = var3 + 52 - 48;
        }
        field6236[45] = field6236[47] = 63;
        field6236[42] = field6236[43] = 62;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 4)
    public static void method3179(int arg0) {
        try {
            field6242 = null;
            if (arg0 != 6882) {
                field6236 = null;
            }
            field6236 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6244[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V", line = 15)
    public final void method3180(int arg0) {
        try {
            field6239++;
            class29 var2 = this.field6241;
            synchronized (this.field6241) {
                if (arg0 <= 89) {
                    method3181(-13);
                }
                this.field6241.method298(5);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6244[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 28)
    public static final void method3181(int arg0) {
        try {
            if (arg0 == 43) {
                class617.field8910.method237(class711.field10286, class623.field8996.field6375.method3507(true) == 1 ? class241.field3708 + 256 << 2 : -1, 0);
                field6237++;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6244[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lee;", line = 42)
    public final class707 method3182(int arg0, int arg1) {
        try {
            field6240++;
            class29 var3 = this.field6241;
            class707 var4;
            synchronized (this.field6241) {
                var4 = (class707) this.field6241.method302(-124, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            int var5 = 66 % ((arg1 + 33) / 35);
            class58 var6 = this.field6234;
            byte[] var7;
            synchronized (this.field6234) {
                var7 = this.field6234.method604((byte) -120, arg0, 32);
            }
            class707 var8 = new class707();
            var8.field10175 = this;
            if (var7 != null) {
                var8.method5136(new class176(var7), -1);
            }
            class29 var9 = this.field6241;
            synchronized (this.field6241) {
                this.field6241.method295(false, (long) arg0, var8);
                return var8;
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field6244[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 71)
    public final void method3183(byte arg0) {
        try {
            class29 var2 = this.field6241;
            synchronized (this.field6241) {
                if (arg0 < 30) {
                    method3181(6);
                }
                this.field6241.method304(1);
            }
            field6238++;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6244[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II)V", line = 123)
    public final void method3184(int arg0, int arg1) {
        try {
            field6235++;
            class29 var3 = this.field6241;
            synchronized (this.field6241) {
                this.field6241.method294(arg1, -630);
                if (arg0 != -16865) {
                    this.field6243 = null;
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6244[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lpo;ILgda;Lgj;)V", line = 141)
    public class391(class585 arg0, int arg1, class58 arg2, class663 arg3) {
        try {
            this.field6234 = arg2;
            this.field6234.method580(112, 32);
            this.field6243 = arg3;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6244[6] + (arg0 == null ? field6244[7] : field6244[5]) + ',' + arg1 + ',' + (arg2 == null ? field6244[7] : field6244[5]) + ',' + (arg3 == null ? field6244[7] : field6244[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!he", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3185(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!he", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3186(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 109;
                    break;
                case 1:
                    var10005 = 118;
                    break;
                case 2:
                    var10005 = 54;
                    break;
                case 3:
                    var10005 = 77;
                    break;
                default:
                    var10005 = 29;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
