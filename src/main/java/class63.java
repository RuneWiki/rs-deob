import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class63 {

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public int field1084 = -1;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    public static int field1086 = -1;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "[[I")
    public static int[][] field1089 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "Z")
    public static boolean field1091;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "Ldj;")
    public class227 field1088;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "[I")
    public int[] field1083;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "[Ljava/lang/String;")
    public String[] field1087;

    static {
        new class342("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field1091 = false;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BLjava/lang/String;)V", line = 5)
    public static final void method538(byte arg0, String arg1) {
        field1090++;
        if (arg1 == null) {
            return;
        }
        if (!(class184.field2756 < 100 || class110.field1867) || class184.field2756 >= 200) {
            class101.method754(class108.field1794.method2180(client.field2870, 29491), 0);
            return;
        }
        String var2 = class33.method351(arg1, -109);
        if (var2 == null || arg0 >= -45) {
            return;
        }
        for (int var3 = 0; var3 < class184.field2756; var3++) {
            String var7 = class33.method351(class436.field6504[var3], -69);
            if (var7 != null && var7.equals(var2)) {
                class101.method754(arg1 + class527.field7782.method2180(client.field2870, 29491), 0);
                return;
            }
            if (class208.field3014[var3] != null) {
                String var8 = class33.method351(class208.field3014[var3], 45);
                if (var8 != null && var8.equals(var2)) {
                    class101.method754(arg1 + class527.field7782.method2180(client.field2870, 29491), 0);
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class1.field9; var4++) {
            String var5 = class33.method351(class156.field2456[var4], -92);
            if (var5 != null && var5.equals(var2)) {
                class101.method754(class347.field5191.method2180(client.field2870, 29491) + arg1 + class368.field5557.method2180(client.field2870, 29491), 0);
                return;
            }
            if (class441.field6609[var4] != null) {
                String var6 = class33.method351(class441.field6609[var4], 59);
                if (var6 != null && var6.equals(var2)) {
                    class101.method754(class347.field5191.method2180(client.field2870, 29491) + arg1 + class368.field5557.method2180(client.field2870, 29491), 0);
                    return;
                }
            }
        }
        if (class33.method351(class139.field2224.field3684, -63).equals(var2)) {
            class101.method754(class521.field7738.method2180(client.field2870, 29491), 0);
        } else {
            class499.field7372++;
            class28.method321(class74.field1255, -5001);
            class410.field6141.method1109(false, class217.method1444(arg1, -127));
            class410.field6141.method1089((byte) -89, arg1);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I[ILvj;II[I)Lhr;", line = 105)
    public static final class363 method539(int arg0, int[] arg1, class303 arg2, int arg3, int arg4, int[] arg5) {
        field1085++;
        if (arg3 <= 46) {
            method539(96, null, null, 109, 88, null);
        }
        byte[] var6 = new byte[arg0 * arg4];
        for (int var7 = 0; var7 < arg4; var7++) {
            int var8 = arg0 * var7 + arg1[var7];
            for (int var9 = 0; var9 < arg5[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class363(arg2, arg0, arg4, var6);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V", line = 141)
    public static void method540(int arg0) {
        if (arg0 != -2331) {
            field1089 = null;
        }
        field1089 = null;
    }
}
