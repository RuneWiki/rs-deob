import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class193 {

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field2852 = 0;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Ldk;")
    public static class326 field2850 = new class326(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Lo;")
    public static class24 field2853 = new class24("WTWIP", 3);

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method1191(int arg0) {
        field2850 = null;
        if (arg0 != 1) {
            field2852 = 45;
        }
        field2853 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(CILjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1192(char arg0, int arg1, String arg2) {
        field2851++;
        int var3 = class171.method1058(arg2, true, arg0);
        String[] var4 = new String[var3 + 1];
        int var5 = arg1;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0 != arg2.charAt(var8); var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }
}
