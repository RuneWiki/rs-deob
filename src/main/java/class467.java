import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class467 {

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    public int field6865;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
    public int field6860;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
    public int field6861;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public int field6862;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
    public static int field6866 = 1;

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "Z")
    public static boolean field6869;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "Lrl;")
    public static class505 field6868;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "[I")
    public static int[] field6870;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "I")
    public static int field6867;

    @OriginalMember(owner = "client!sv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6864++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lat;IIIII)V")
    public static final void method2782(class255 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field3686 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class371.field5544[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class480 var13 = class242.field3512[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field3686; var14++) {
                            if (arg0.field3682[var14] == var13.field7047) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field3682[arg0.field3686++] = var13.field7047;
                        if (arg0.field3686 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field3686; var15 < 4; var15++) {
            arg0.field3682[var15] = null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
    public static void method2783(int arg0) {
        field6870 = null;
        field6868 = null;
        if (arg0 != 65535) {
            method2782(null, 107, 93, -16, -34, 55);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZLtn;)Ltn;")
    public static final class58 method2784(boolean arg0, class58 arg1) {
        field6867++;
        if (!arg0) {
            field6868 = null;
        }
        class58 var2 = client.method1353(arg1);
        if (var2 == null) {
            var2 = arg1.field970;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(IIII)V")
    public class467(int arg0, int arg1, int arg2, int arg3) {
        this.field6865 = arg0;
        this.field6860 = arg1;
        this.field6861 = arg2;
        this.field6862 = arg3;
    }

    static {
        new class180("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field6869 = true;
        field6868 = new class505();
        field6870 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };
    }
}
