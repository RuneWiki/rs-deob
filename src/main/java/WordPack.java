import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RTHTIIVA")
public class WordPack {

    @OriginalMember(owner = "RTHTIIVA", name = "c", descriptor = "Z")
    private static boolean _flowObfuscator3 = true;

    @OriginalMember(owner = "RTHTIIVA", name = "d", descriptor = "[C")
    public static char[] charBuffer = new char[100];

    @OriginalMember(owner = "RTHTIIVA", name = "e", descriptor = "LMBMGIXGO;")
    private static Packet buffer = new Packet(new byte[100], 891);

    @OriginalMember(owner = "RTHTIIVA", name = "f", descriptor = "[C")
    private static char[] TABLE = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "RTHTIIVA", name = "a", descriptor = "I")
    private static int _flowObfuscator1;

    @OriginalMember(owner = "RTHTIIVA", name = "b", descriptor = "Z")
    private static boolean _flowObfuscator2;

    @OriginalMember(owner = "RTHTIIVA", name = "a", descriptor = "(IZLMBMGIXGO;)Ljava/lang/String;")
    public static String unpack(int arg0, boolean arg1, Packet arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg0; var5++) {
            int var9 = arg2.g1();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                charBuffer[var3++] = TABLE[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                charBuffer[var3++] = TABLE[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                charBuffer[var3++] = TABLE[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                charBuffer[var3++] = TABLE[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = charBuffer[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                charBuffer[var7] = (char) (charBuffer[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        if (!arg1) {
            _flowObfuscator1 = 466;
        }
        return new String(charBuffer, 0, var3);
    }

    @OriginalMember(owner = "RTHTIIVA", name = "a", descriptor = "(Ljava/lang/String;ZLMBMGIXGO;)V")
    public static void pack(String arg0, boolean arg1, Packet arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < TABLE.length; var8++) {
                if (TABLE[var8] == var6) {
                    var7 = var8;
                    break;
                }
            }
            if (var7 > 12) {
                var7 += 195;
            }
            if (var4 == -1) {
                if (var7 < 13) {
                    var4 = var7;
                } else {
                    arg2.p1(var7);
                }
            } else if (var7 < 13) {
                arg2.p1((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg2.p1((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (!arg1) {
            _flowObfuscator1 = -452;
        }
        if (var4 != -1) {
            arg2.p1(var4 << 4);
        }
    }

    @OriginalMember(owner = "RTHTIIVA", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String format(String arg0, int arg1) {
        buffer.pos = 0;
        pack(arg0, _flowObfuscator3, buffer);
        int var2 = buffer.pos;
        buffer.pos = 0;
        if (arg1 != 0) {
            _flowObfuscator2 = !_flowObfuscator2;
        }
        return unpack(var2, true, buffer);
    }
}
