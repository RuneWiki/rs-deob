import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class695 extends class206 {

    @OriginalMember(owner = "client!gba", name = "j", descriptor = "S")
    public short field10142;

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10145 = new String[] { method5078(method5077("\\8\t[O\u0013")), method5078(method5077("\\8\t[2R4\u0001\u00010\u0013")) };

    @OriginalMember(owner = "client!gba", name = "l", descriptor = "S")
    public static short field10143 = 1;

    @OriginalMember(owner = "client!gba", name = "k", descriptor = "Lvd;")
    public static class42 field10144;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V")
    public static void method5075(int arg0) {
        try {
            if (arg0 != -15503) {
                field10144 = null;
            }
            field10144 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10145[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)I")
    public static final int method5076(int arg0, int arg1) {
        return class574.field8476 == null ? 0 : class574.field8476[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "()V")
    public class695() {
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(S)V")
    public class695(short arg0) {
        try {
            this.field10142 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10145[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5077(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xE);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5078(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 59;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 104;
                    break;
                case 3:
                    var10005 = 117;
                    break;
                default:
                    var10005 = 14;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
