import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class370 extends class512 {

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lgda;")
    public class61 field5644;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5646 = new String[] { method2990(method2989(":C7d\r")), method2990(method2989(":C7g\r")), method2990(method2989(" UuJ")), method2990(method2989("5\u000e7\bX")), method2990(method2989(":C7\u001aL Im\u0018\r")) };

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Lwq;")
    public static class178 field5641 = new class178(64);

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lel;")
    public static class573 field5642 = new class573(92, 0);

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)Z")
    public static final boolean method2987(byte arg0) {
        try {
            if (arg0 != -18) {
                method2987((byte) -99);
            }
            field5645++;
            if (class290.field4311 == null) {
                return false;
            } else {
                if (class290.field4311.field6146 >= 2000) {
                    class290.field4311.field6146 -= 2000;
                }
                return class290.field4311.field6146 == 1004;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5646[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
    public static void method2988(byte arg0) {
        try {
            if (arg0 <= -110) {
                field5641 = null;
                field5642 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5646[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lffa;II[B)V")
    public class370(class197 arg0, int arg1, int arg2, byte[] arg3) {
        try {
            this.field5644 = class329.method2784(6406, arg0, arg2, arg1, (byte) 53, arg3, false, 6406);
            this.field5644.method5046(false, (byte) -116, false);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5646[4] + (arg0 == null ? field5646[2] : field5646[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field5646[2] : field5646[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2989(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x25);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2990(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 78;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 25;
                    break;
                case 3:
                    var10005 = 38;
                    break;
                default:
                    var10005 = 37;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
