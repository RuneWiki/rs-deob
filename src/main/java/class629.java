import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class629 extends class54 {

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9208 = new String[] { method4663(method4662("\u000b/W&p")), method4663(method4662("\u000b/W!p")), method4663(method4662("\u000b/W\"p")), method4663(method4662("\u000b/W$p")), method4663(method4662("\u000b/W%p")), method4663(method4662("\u000b/W'p")), method4663(method4662("\u000b/W#p")) };

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
    public static int field9200 = 0;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "I")
    public static int field9201;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public static int field9202;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "I")
    public static int field9204;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
    public static int field9205;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "I")
    public static int field9207;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "Lvt;")
    public static class319 field9198;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "Ljava/applet/Applet;")
    public static Applet field9206;

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(ILhia;)V", line = 3)
    public class629(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BII)V", line = 6)
    public static final void method4659(byte arg0, int arg1, int arg2) {
        try {
            int var3 = 95 % ((arg0 - -54) / 39);
            ++field9203;
            class313 var4 = class196.method1670((long) arg1 << 32 | (long) arg2, 19, 94);
            var4.method2635(true);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9208[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(IB)I", line = 19)
    public final int method109(int arg0, byte arg1) {
        try {
            if (arg1 >= -106) {
                field9198 = null;
            }
            ++field9204;
            return 1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9208[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(Z)I", line = 31)
    public final int method111(boolean arg0) {
        try {
            if (arg0) {
                return -17;
            } else {
                ++field9201;
                return 1;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9208[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lhia;)V", line = 44)
    public class629(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(Z)I", line = 47)
    public final int method4660(boolean arg0) {
        try {
            ++field9202;
            if (arg0) {
                field9205 = 83;
            }
            return super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9208[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)V", line = 59)
    public final void method113(int arg0, int arg1) {
        try {
            ++field9199;
            if (arg0 != 0) {
                this.method111(true);
            }
            super.field593 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9208[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)V", line = 72)
    public final void method115(boolean arg0) {
        try {
            if (~super.field593 != -2 && ~super.field593 != -1) {
                super.field593 = this.method111(false);
            }
            ++field9207;
            if (!arg0) {
                this.method113(81, -102);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9208[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "(I)V", line = 87)
    public static void method4661(int arg0) {
        try {
            field9198 = null;
            field9206 = null;
            if (arg0 != 0) {
                field9200 = -55;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9208[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4662(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 88);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4663(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 92;
                    break;
                case 2:
                    var10005 = 121;
                    break;
                case 3:
                    var10005 = 96;
                    break;
                default:
                    var10005 = 88;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
