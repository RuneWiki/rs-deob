import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class42 {

    @OriginalMember(owner = "client!il", name = "d", descriptor = "[I")
    public int[] field497 = new int[3];

    @OriginalMember(owner = "client!il", name = "e", descriptor = "[Lqk;")
    public class6[] field498 = new class6[8];

    @OriginalMember(owner = "client!il", name = "g", descriptor = "[Lfe;")
    public class133[] field500 = new class133[100];

    @OriginalMember(owner = "client!il", name = "f", descriptor = "[I")
    public int[] field499 = new int[100];

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "[[I")
    public static int[][] field502;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public int field494;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field496;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static void method259(int arg0) {
        if (arg0 > -36) {
            field502 = null;
        }
        field502 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZZI)I")
    public static final int method260(int arg0, boolean arg1, boolean arg2, int arg3) {
        field495++;
        if (arg1) {
            field501 = -6;
        }
        class391 var4 = class70.method415(Integer.MIN_VALUE, arg0, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field5332.length; var6++) {
                if (var4.field5330[var6] == arg3) {
                    var5 += var4.field5332[var6];
                }
            }
            return var5;
        }
    }

    static {
        new class72("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field501 = -1;
        field503 = 0;
        field502 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
    }
}
