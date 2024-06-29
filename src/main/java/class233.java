import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class233 {

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lta;")
    public class141 field3397 = new class141();

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "[[I")
    public static int[][] field3394 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Lta;")
    private class141 field3399;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)Lta;")
    public final class141 method1531(byte arg0) {
        field3396++;
        if (arg0 != -125) {
            this.field3397 = null;
        }
        class141 var2 = this.field3397.field2236;
        if (this.field3397 == var2) {
            this.field3399 = null;
            return null;
        } else {
            this.field3399 = var2.field2236;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lta;I)V")
    public final void method1532(class141 arg0, int arg1) {
        if (arg0.field2238 != null) {
            arg0.method1047(-2886);
        }
        if (arg1 != 7) {
            field3400 = 126;
        }
        field3391++;
        arg0.field2236 = this.field3397;
        arg0.field2238 = this.field3397.field2238;
        arg0.field2238.field2236 = arg0;
        arg0.field2236.field2238 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)I")
    public final int method1533(int arg0) {
        field3393++;
        int var2 = 0;
        if (arg0 <= 16) {
            this.method1533(-76);
        }
        class141 var3 = this.field3397.field2236;
        while (this.field3397 != var3) {
            var3 = var3.field2236;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)Lta;")
    public final class141 method1534(byte arg0) {
        field3392++;
        if (arg0 != 52) {
            field3394 = null;
        }
        class141 var2 = this.field3399;
        if (this.field3397 == var2) {
            this.field3399 = null;
            return null;
        } else {
            this.field3399 = var2.field2236;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)V")
    public final void method1535(byte arg0) {
        field3398++;
        if (arg0 >= -24) {
            this.method1535((byte) -31);
        }
        while (true) {
            class141 var2 = this.field3397.field2236;
            if (this.field3397 == var2) {
                this.field3399 = null;
                return;
            }
            var2.method1047(-2886);
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class233() {
        this.field3397.field2238 = this.field3397;
        this.field3397.field2236 = this.field3397;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public static void method1536(int arg0) {
        if (arg0 >= 74) {
            field3394 = null;
        }
    }

    static {
        new class342("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
    }
}
