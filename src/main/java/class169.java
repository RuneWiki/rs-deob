import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class169 {

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2318 = new String[] { method1498(method1497("\u001a\t\u0016\u0013]")), method1498(method1497("\u001a\t\u0016\u0010]")), method1498(method1497("\u001a\t\u0016&\u001a#\u0015J;\u001b\u0017I")) };

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Lel;")
    public static class573 field2317 = new class573(1, -1);

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1495(int arg0, int arg1, byte arg2) {
        try {
            field2315++;
            if (!class216.field3297) {
                return false;
            }
            int var3 = arg1 >> 16;
            int var4 = 107 / ((56 - arg2) / 43);
            int var5 = arg1 & 0xFFFF;
            if (class683.field9897[var3] == null || class683.field9897[var3][var5] == null) {
                return false;
            }
            class541 var6 = class683.field9897[var3][var5];
            if (arg0 == -1 && var6.field8042 == 0) {
                for (class417 var7 = (class417) class728.field10549.method3863((byte) 64); var7 != null; var7 = (class417) class728.field10549.method3862(-353)) {
                    if (var7.field6146 == 17 || var7.field6146 == 1004 || var7.field6146 == 46 || var7.field6146 == 52 || var7.field6146 == 47) {
                        for (class541 var8 = class461.method3513(var7.field6141, 113); var8 != null; var8 = class311.method2624(10616, var8)) {
                            if (var6.field8034 == var8.field8034) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (class417 var9 = (class417) class728.field10549.method3863((byte) 64); var9 != null; var9 = (class417) class728.field10549.method3862(-353)) {
                    if (var9.field6158 == arg0 && var6.field8034 == var9.field6141 && (var9.field6146 == 17 || var9.field6146 == 1004 || var9.field6146 == 46 || var9.field6146 == 52 || var9.field6146 == 47)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field2318[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static void method1496(int arg0) {
        try {
            if (arg0 == 0) {
                field2317 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2318[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field2316++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2318[2] + ')');
        }
    }

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1497(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x75);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1498(char[] arg0) {
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
                    var10005 = 97;
                    break;
                case 2:
                    var10005 = 56;
                    break;
                case 3:
                    var10005 = 82;
                    break;
                default:
                    var10005 = 117;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
