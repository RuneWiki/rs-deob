import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class245 extends class466 {

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "Lej;")
    public static class104 field3414;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "Lhu;")
    public static class111 field3415;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "Z")
    public static boolean field3416;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "[[S")
    public static short[][] field3413;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)V")
    public static void method1517(int arg0) {
        if (arg0 != -4250) {
            field3415 = null;
        }
        field3415 = null;
        field3414 = null;
        field3413 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;IZI)I")
    public static final int method1518(String arg0, int arg1, boolean arg2, int arg3) {
        field3411++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        if (arg3 != -4977) {
            method1518(null, 42, false, -86);
        }
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg1 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if ((var10 / arg1) != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
    public class245() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        field3412++;
        if (arg1 != 0) {
            field3413 = null;
        }
        return class431.field6129;
    }

    static {
        new class104("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field3414 = new class104("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");
        field3415 = new class111("runescape", 0);
        field3416 = false;
    }
}
