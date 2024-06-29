import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class88 extends class459 {

    @OriginalMember(owner = "client!kca", name = "C", descriptor = "Ljava/lang/String;")
    private static final String field1320 = method872(method871("_1=hN\u001c"));

    @OriginalMember(owner = "client!kca", name = "A", descriptor = "Lhl;")
    public static class556 field1311 = new class556(140, 3);

    @OriginalMember(owner = "client!kca", name = "G", descriptor = "I")
    public int field1306;

    @OriginalMember(owner = "client!kca", name = "F", descriptor = "I")
    public int field1309;

    @OriginalMember(owner = "client!kca", name = "I", descriptor = "I")
    public int field1313;

    @OriginalMember(owner = "client!kca", name = "K", descriptor = "I")
    public int field1314;

    @OriginalMember(owner = "client!kca", name = "w", descriptor = "I")
    public int field1315;

    @OriginalMember(owner = "client!kca", name = "z", descriptor = "I")
    public int field1318;

    @OriginalMember(owner = "client!kca", name = "v", descriptor = "Lnp;")
    public static class518 field1319;

    @OriginalMember(owner = "client!kca", name = "E", descriptor = "Lko;")
    public class532 field1310;

    @OriginalMember(owner = "client!kca", name = "H", descriptor = "Ljava/lang/String;")
    public String field1317;

    @OriginalMember(owner = "client!kca", name = "x", descriptor = "[I")
    public int[] field1308;

    @OriginalMember(owner = "client!kca", name = "y", descriptor = "[I")
    public int[] field1312;

    @OriginalMember(owner = "client!kca", name = "B", descriptor = "[J")
    public long[] field1316;

    @OriginalMember(owner = "client!kca", name = "D", descriptor = "[Lqr;")
    public class69[] field1305;

    @OriginalMember(owner = "client!kca", name = "J", descriptor = "[Ljava/lang/String;")
    public String[] field1307;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(B)V", line = 9)
    public static void method870(byte arg0) {
        try {
            field1319 = null;
            if (arg0 != 60) {
                method870((byte) 81);
            }
            field1311 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1320 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method871(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xF);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method872(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 52;
                    break;
                case 1:
                    var10005 = 82;
                    break;
                case 2:
                    var10005 = 92;
                    break;
                case 3:
                    var10005 = 70;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
