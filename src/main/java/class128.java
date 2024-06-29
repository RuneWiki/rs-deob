import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class128 {

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "Loe;")
    public static class127 field2061 = new class127(109, -2);

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "Loe;")
    public static class127 field2063 = new class127(32, -1);

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "[I")
    public static int[] field2068;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field2067;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "B")
    public byte field2059;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public int field2060;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "Ljf;")
    public static class137 field2070;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "Ljava/lang/String;")
    public String field2058;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "Ljava/lang/String;")
    public String field2062;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "Ljava/lang/String;")
    public String field2064;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "Ljava/lang/String;")
    public String field2069;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)[B")
    public static final byte[] method867(int arg0, int arg1) {
        if (arg1 != -19333) {
            return null;
        }
        field2065++;
        class63 var2 = (class63) class272.field4126.method1666(arg1 + 19205, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class482.method2911((byte) 45, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class63(var3);
            class272.field4126.method1668((byte) 4, (long) arg0, var2);
        }
        return var2.field1049;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public static void method868(int arg0) {
        field2068 = null;
        if (arg0 == 13207) {
            field2067 = null;
            field2061 = null;
            field2063 = null;
            field2070 = null;
        }
    }

    static {
        new class423("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field2068 = new int[1000];
        field2067 = new String[100];
    }
}
