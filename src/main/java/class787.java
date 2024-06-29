import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class787 implements class410 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Lrg;")
    private class668 field11488;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11489 = new String[] { method5698(method5697("\u001ch}m")), method5698(method5697("\u001chum")), method5698(method5697("\u00143S)")), method5698(method5697("\u0001h\u0011kj")), method5698(method5697("\u001ch\u0003,y\u00132\u0001m")), method5698(method5697("\u001ch|m")), method5698(method5697("\u001ch~m")) };

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field11485 = 0;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field11487 = -1;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field11482;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field11483;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field11484;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "Lni;")
    public static class547 field11486;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZB)V", line = 3)
    public final void method368(boolean arg0, byte arg1) {
        try {
            int var3 = -55 / ((38 - arg1) / 37);
            field11483++;
            if (arg0) {
                class610.field8913.method556(0, 0, class179.field2489, class94.field1062, this.field11488.field9709, 0);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field11489[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V", line = 30)
    public static void method5696(byte arg0) {
        try {
            field11486 = null;
            if (arg0 < 49) {
                method5696((byte) 85);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11489[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Z", line = 40)
    public final boolean method369(int arg0) {
        try {
            if (arg0 != -17976) {
                this.method370((byte) -118);
            }
            field11482++;
            return true;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11489[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lrg;)V", line = 51)
    public class787(class668 arg0) {
        try {
            this.field11488 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11489[4] + (arg0 == null ? field11489[2] : field11489[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 59)
    public final void method370(byte arg0) {
        try {
            if (arg0 >= -98) {
                this.method370((byte) 33);
            }
            field11484++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11489[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!f", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5697(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x17);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!f", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5698(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 70;
                    break;
                case 2:
                    var10005 = 63;
                    break;
                case 3:
                    var10005 = 69;
                    break;
                default:
                    var10005 = 23;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
