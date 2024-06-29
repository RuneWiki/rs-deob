import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QKAIVGGT")
public class WordPack {

    @OriginalMember(owner = "client!QKAIVGGT", name = "a", descriptor = "I")
    private static int field1359 = 20411;

    @OriginalMember(owner = "client!QKAIVGGT", name = "b", descriptor = "[C")
    public static char[] field1360 = new char[100];

    @OriginalMember(owner = "client!QKAIVGGT", name = "c", descriptor = "LMFMVIYHT;")
    private static Packet field1361 = new Packet(true, new byte[100]);

    @OriginalMember(owner = "client!QKAIVGGT", name = "d", descriptor = "[C")
    private static char[] field1362 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "client!QKAIVGGT", name = "a", descriptor = "(ILMFMVIYHT;I)Ljava/lang/String;")
    public static String method453(int arg0, Packet arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var9 = arg1.g1();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field1360[var3++] = field1362[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field1360[var3++] = field1362[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field1360[var3++] = field1362[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1360[var3++] = field1362[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field1360[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field1360[var7] = (char) (field1360[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        if (arg0 != 0) {
            field1359 = -409;
        }
        return new String(field1360, 0, var3);
    }

    @OriginalMember(owner = "client!QKAIVGGT", name = "a", descriptor = "(Ljava/lang/String;ILMFMVIYHT;)V")
    public static void method454(String arg0, int arg1, Packet arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        if (arg1 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = -1;
        for (int var6 = 0; var6 < var3.length(); var6++) {
            char var7 = var3.charAt(var6);
            int var8 = 0;
            for (int var9 = 0; var9 < field1362.length; var9++) {
                if (field1362[var9] == var7) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 > 12) {
                var8 += 195;
            }
            if (var5 == -1) {
                if (var8 < 13) {
                    var5 = var8;
                } else {
                    arg2.p1(var8);
                }
            } else if (var8 < 13) {
                arg2.p1((var5 << 4) + var8);
                var5 = -1;
            } else {
                arg2.p1((var5 << 4) + (var8 >> 4));
                var5 = var8 & 0xF;
            }
        }
        if (var5 != -1) {
            arg2.p1(var5 << 4);
        }
    }

    @OriginalMember(owner = "client!QKAIVGGT", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static String method455(byte arg0, String arg1) {
        field1361.pos = 0;
        method454(arg1, 569, field1361);
        int var2 = field1361.pos;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1361.pos = 0;
        return method453(0, field1361, var2);
    }
}
