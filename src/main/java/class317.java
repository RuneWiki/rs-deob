import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class317 extends class640 {

    @OriginalMember(owner = "client!nb", name = "bb", descriptor = "[Ljava/lang/String;")
    private static final String[] field5181 = new String[] { method2728(method2727("d\u0013\u0011\u007f6")), method2728(method2727("d\u0013\u0011x6")), method2728(method2727("d\u0013\u0011z6")) };

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "I")
    public static int field5177 = 0;

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "I")
    public static volatile int field5175 = -1;

    @OriginalMember(owner = "client!nb", name = "X", descriptor = "Lhl;")
    public static class556 field5170 = new class556(50, -2);

    @OriginalMember(owner = "client!nb", name = "Z", descriptor = "Leu;")
    public static class507 field5178 = new class507();

    @OriginalMember(owner = "client!nb", name = "Y", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!nb", name = "W", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!nb", name = "ab", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!nb", name = "V", descriptor = "J")
    public static long field5180;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "Ljava/lang/Object;")
    public static Object field5179;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "Z")
    public static boolean field5176;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "[B")
    private byte[] field5173;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(IIB)V", line = 4)
    public final void method2724(int arg0, int arg1, byte arg2) {
        try {
            field5172++;
            int var4 = arg1 * 2;
            int var5 = arg2 & 0xFF;
            int var10001 = var4;
            int var9 = var4 + 1;
            this.field5173[var10001] = (byte) (var5 * 3 >> 5);
            int var6 = 99 % ((-arg0 - 21) / 40);
            this.field5173[var9] = (byte) (var5 * 3 >> 5);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field5181[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V", line = 20)
    public class317() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIII)[B", line = 23)
    public final byte[] method2725(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg0 == -1) {
                this.field5173 = new byte[arg1 * arg3 * 2 * arg2];
                field5171++;
                this.method521(arg3, (byte) 125, arg2, arg1);
                return this.field5173;
            } else {
                return null;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5181[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V", line = 43)
    public static void method2726(byte arg0) {
        try {
            field5170 = null;
            field5178 = null;
            field5179 = null;
            if (arg0 != 121) {
                field5180 = -94L;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5181[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2727(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2728(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 113;
                    break;
                case 2:
                    var10005 = 63;
                    break;
                case 3:
                    var10005 = 62;
                    break;
                default:
                    var10005 = 30;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
