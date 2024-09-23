import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("zb")
public class WordPack {

    @OriginalMember(owner = "zb", name = "a", descriptor = "I")
    private static int field879 = 991;

    @OriginalMember(owner = "zb", name = "d", descriptor = "[C")
    public static char[] field882 = new char[100];

    @OriginalMember(owner = "zb", name = "e", descriptor = "Llb;")
    private static Packet field883 = new Packet(new byte[100], 15787);

    @OriginalMember(owner = "zb", name = "f", descriptor = "[C")
    private static char[] field884 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "zb", name = "b", descriptor = "I")
    private static int field880;

    @OriginalMember(owner = "zb", name = "c", descriptor = "I")
    private static int field881;

    @OriginalMember(owner = "zb", name = "a", descriptor = "(BLlb;I)Ljava/lang/String;")
    public static String method304(byte arg0, Packet arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var9 = arg1.method227();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field882[var3++] = field884[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field882[var3++] = field884[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field882[var3++] = field884[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field882[var3++] = field884[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        if (arg0 != -94) {
            field881 = -316;
        }
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field882[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field882[var7] = (char) (field882[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field882, 0, var3);
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Ljava/lang/String;Llb;I)V")
    public static void method305(String arg0, Packet arg1, int arg2) {
        if (arg2 <= 0) {
            return;
        }
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field884.length; var8++) {
                if (field884[var8] == var6) {
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
                    arg1.method217(var7);
                }
            } else if (var7 < 13) {
                arg1.method217((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg1.method217((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg1.method217(var4 << 4);
        }
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method306(String arg0, int arg1) {
        field883.field710 = 0;
        method305(arg0, field883, 991);
        int var2 = field883.field710;
        if (arg1 != 0) {
            field880 = -64;
        }
        field883.field710 = 0;
        return method304((byte) -94, field883, var2);
    }
}
