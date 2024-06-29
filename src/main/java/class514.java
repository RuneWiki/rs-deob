import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class514 extends class221 {

    @OriginalMember(owner = "client!on", name = "q", descriptor = "[[I")
    public static int[][] field7628 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!on", name = "p", descriptor = "Lss;")
    public static class213 field7627 = new class213(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!on", name = "t", descriptor = "Lss;")
    public static class213 field7631 = new class213("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    public int field7621;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public int field7622;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public int field7624;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    public static int field7630;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "Lbm;")
    public class484 field7625;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "[Lkk;")
    public class182[] field7629;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V")
    public static void method3095(int arg0) {
        field7627 = null;
        field7631 = null;
        if (arg0 != -25569) {
            field7628 = null;
        }
        field7628 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lza;IBI)Z")
    public final boolean method3096(class497 arg0, int arg1, byte arg2, int arg3) {
        field7630++;
        if (this.field7629 != null) {
            for (int var5 = 0; var5 < this.field7629.length; var5++) {
                if (this.field7629[var5].method1148(arg1, arg3) && this.field7625.method105(arg1, 32689, arg3, arg0)) {
                    return true;
                }
            }
        }
        if (arg2 != -16) {
            this.field7629 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)V")
    public static final void method3097(int arg0, int arg1) {
        field7626++;
        int var2 = -60 % ((4 - arg0) / 52);
        class188.field2742 = arg1;
        class442.field6874.method2189(false);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BIBILgh;)V")
    public static final void method3098(byte arg0, int arg1, byte arg2, int arg3, class350 arg4) {
        field7623++;
        int var5 = arg4.field894[0];
        int var6 = arg4.field899[0];
        if (var5 < 0 || class135.field1839 <= var5 || var6 < 0 || class197.field3038 <= var6 || arg1 < 0 || arg1 >= class135.field1839 || arg3 < 0 || arg3 >= class197.field3038) {
            return;
        }
        int var7 = class161.method982(-4, class5.field59, arg1, 0, 0, var6, class155.field2060, arg4.method415(arg2 ^ 0x76), true, var5, 0, class352.field5488[arg4.field6419], arg3, -124, 0);
        if (var7 < 1) {
            return;
        }
        if (arg2 != -118) {
            field7628 = null;
        }
        if (var7 <= 3) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg4.method2309(class5.field59[var8], arg0, class155.field2060[var8], arg2 + 130);
            }
        }
    }
}
