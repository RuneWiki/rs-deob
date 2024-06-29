import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class789 {

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "J")
    public long field11527;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "Lvf;")
    private class159 field11530;

    @OriginalMember(owner = "client!lo", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11532 = new String[] { method5670(method5669("%42$o':p+|,s")), method5670(method5669("%42\u0003.")), method5670(method5669("%42\u0000.")), method5670(method5669("%42\u0001.")), method5670(method5669("%42~o'2h|.")), method5670(method5669("2u2l{")), method5670(method5669("'.p.")) };

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public static int field11525;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public static int field11528;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public static int field11529;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "Lhk;")
    public static class107 field11531;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "Ljava/lang/Thread;")
    public static Thread field11526;

    @OriginalMember(owner = "client!lo", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        try {
            field11528++;
            this.field11530.method1495(this.field11527, true);
            super.finalize();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11532[0] + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIZ)V")
    public static final void method5666(int arg0, int arg1, boolean arg2) {
        try {
            if (arg1 > -116) {
                field11531 = null;
            }
            field11529++;
            class454 var3 = class173.method1596(arg2, 13510, arg0);
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field7018.length; var4++) {
                    var3.field7018[var4] = -1;
                    var3.field7013[var4] = 0;
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field11532[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
    public static void method5667(int arg0) {
        try {
            field11526 = null;
            field11531 = null;
            if (arg0 != -1) {
                field11526 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11532[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BC)Z")
    public static final boolean method5668(byte arg0, char arg1) {
        try {
            field11525++;
            if (arg0 < 67) {
                return true;
            } else {
                return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11532[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lvf;JI)V")
    public class789(class159 arg0, long arg1, int arg2) {
        try {
            this.field11527 = arg1;
            this.field11530 = arg0;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field11532[4] + (arg0 == null ? field11532[6] : field11532[5]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5669(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5670(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 73;
                    break;
                case 1:
                    var10005 = 91;
                    break;
                case 2:
                    var10005 = 28;
                    break;
                case 3:
                    var10005 = 66;
                    break;
                default:
                    var10005 = 6;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
