import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class163 {

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field2427 = 0;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field2430 = new String[100];

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field2431 = 0;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Luv;")
    public static class2 field2432;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "[I")
    public static int[] field2433;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method1146(int arg0) {
        field2430 = null;
        field2432 = null;
        if (arg0 < 5) {
            method1148(93, -45, 31, 32);
        }
        field2433 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIII)V")
    public static final void method1147(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2428++;
        float var5 = (float) class137.field2049 / (float) class137.field2053;
        int var6 = arg0;
        int var7 = arg2;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg0 * var5);
        } else {
            var6 = (int) ((float) arg2 / var5);
        }
        int var8 = arg4 - (arg0 - var6) / 2;
        int var9 = arg3 - (arg2 - var7) / arg1;
        class9.field87 = -1;
        class473.field6977 = class137.field2049 - class137.field2049 * var9 / var7;
        class170.field2508 = class137.field2053 * var8 / var6;
        class30.field425 = -1;
        class239.method1468((byte) -53);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIII)I")
    public static final int method1148(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -2) {
            method1148(25, -40, -103, 81);
        }
        int var4 = arg2 & 0x3;
        field2429++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg1;
        }
    }

    static {
        new class347("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field2432 = new class2(34, -2);
    }
}
