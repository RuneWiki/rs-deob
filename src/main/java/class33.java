import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class33 {

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "Liha;")
    private class29 field393 = new class29(64);

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "Lgda;")
    private class58 field394;

    @OriginalMember(owner = "client!tfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field399 = new String[] { method344(method343("~'\u001cry")), method344(method343("qoSr8lg[(:-")), method344(method343("k|^0")), method344(method343("qoSrG-")), method344(method343("qoSrE-")), method344(method343("qoSrF-")), method344(method343("qoSr@-")) };

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "[Lip;")
    public static class738[] field395 = new class738[2048];

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "I")
    public static int field397 = 0;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(II)V", line = 3)
    public static final void method339(int arg0, int arg1) {
        try {
            if (arg1 == 64) {
                field392++;
                class551 var2 = class380.method3113(arg1 ^ 0x7A, (long) arg0, 2);
                var2.method4089(63);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field399[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)Llk;", line = 22)
    public final class614 method340(int arg0, int arg1) {
        try {
            field398++;
            if (arg1 < 1) {
                method341(null, 62, true, -123);
            }
            class29 var3 = this.field393;
            class614 var4;
            synchronized (this.field393) {
                var4 = (class614) this.field393.method302(-93, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field394;
            byte[] var6;
            synchronized (this.field394) {
                var6 = this.field394.method604((byte) -121, arg0, 5);
            }
            class614 var7 = new class614();
            if (var6 != null) {
                var7.method4466(0, new class176(var6));
            }
            class29 var8 = this.field393;
            synchronized (this.field393) {
                this.field393.method295(false, (long) arg0, var7);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field399[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lha;IZI)Ljv;", line = 59)
    public static final class85 method341(class63 arg0, int arg1, boolean arg2, int arg3) {
        try {
            field396++;
            if (~arg1 == arg3) {
                return null;
            }
            if (class321.field5230 != null) {
                for (int var4 = 0; var4 < class321.field5230.length; var4++) {
                    if (class321.field5230[var4] == arg1) {
                        return class198.field3146[var4];
                    }
                }
            }
            class85 var5 = (class85) class640.field9178.method302(-119, (long) arg1);
            if (var5 != null) {
                if (arg2 && var5.field1278 == null) {
                    class49 var6 = class570.method4197(class266.field4311, (byte) 86, arg1);
                    if (var6 == null) {
                        return null;
                    }
                    var5.field1278 = var6;
                }
                return var5;
            }
            class174[] var7 = class174.method1603(class453.field7008, arg1);
            if (var7 == null) {
                return null;
            }
            class49 var8 = class570.method4197(class266.field4311, (byte) 40, arg1);
            if (var8 == null) {
                return null;
            }
            class85 var9;
            if (arg2) {
                var9 = new class85(arg0.method184(var8, var7, true), var8);
            } else {
                var9 = new class85(arg0.method184(var8, var7, true));
            }
            class640.field9178.method295(false, (long) arg1, var9);
            return var9;
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field399[5] + (arg0 == null ? field399[2] : field399[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V", line = 131)
    public static void method342(int arg0) {
        try {
            if (arg0 != 2048) {
                method341(null, 77, false, -39);
            }
            field395 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field399[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lpo;ILgda;)V", line = 146)
    public class33(class585 arg0, int arg1, class58 arg2) {
        try {
            this.field394 = arg2;
            this.field394.method580(110, 5);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field399[1] + (arg0 == null ? field399[2] : field399[0]) + ',' + arg1 + ',' + (arg2 == null ? field399[2] : field399[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!tfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method343(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method344(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 5;
                    break;
                case 1:
                    var10005 = 9;
                    break;
                case 2:
                    var10005 = 50;
                    break;
                case 3:
                    var10005 = 92;
                    break;
                default:
                    var10005 = 4;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
