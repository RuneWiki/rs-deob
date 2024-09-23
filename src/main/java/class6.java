import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CHVNTVHC")
public class class6 {

    @OriginalMember(owner = "CHVNTVHC", name = "a", descriptor = "I")
    private static int field103 = 76;

    @OriginalMember(owner = "CHVNTVHC", name = "c", descriptor = "[C")
    public static char[] field105 = new char[100];

    @OriginalMember(owner = "CHVNTVHC", name = "d", descriptor = "LUAWAYCTK;")
    private static class55 field106 = new class55(741, new byte[100]);

    @OriginalMember(owner = "CHVNTVHC", name = "e", descriptor = "[C")
    private static char[] field107 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "CHVNTVHC", name = "b", descriptor = "I")
    private static int field104;

    @OriginalMember(owner = "CHVNTVHC", name = "a", descriptor = "(LUAWAYCTK;II)Ljava/lang/String;")
    public static String method37(class55 arg0, int arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var9 = arg0.method455();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field105[var3++] = field107[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field105[var3++] = field107[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field105[var3++] = field107[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field105[var3++] = field107[var11];
            } else {
                var4 = var11;
            }
        }
        if (arg1 != 0) {
            field104 = 474;
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field105[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field105[var7] = (char) (field105[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field105, 0, var3);
    }

    @OriginalMember(owner = "CHVNTVHC", name = "a", descriptor = "(Ljava/lang/String;ILUAWAYCTK;)V")
    public static void method38(String arg0, int arg1, class55 arg2) {
        if (arg1 != -16600) {
            field104 = 240;
        }
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field107.length; var8++) {
                if (field107[var8] == var6) {
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
                    arg2.method445(var7);
                }
            } else if (var7 < 13) {
                arg2.method445((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg2.method445((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg2.method445(var4 << 4);
        }
    }

    @OriginalMember(owner = "CHVNTVHC", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method39(int arg0, String arg1) {
        field106.field1456 = 0;
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        method38(arg1, -16600, field106);
        int var3 = field106.field1456;
        field106.field1456 = 0;
        return method37(field106, 0, var3);
    }
}
