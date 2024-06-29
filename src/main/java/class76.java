import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class76 {

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    private int field1029;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public int field1030;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Lsb;")
    private class280 field1034;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public int field1032;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "Lgh;")
    public static class76 field1031 = new class76(0, 3, class280.field3667);

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Lgh;")
    public static class76 field1035 = new class76(1, 3, class280.field3667);

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lgh;")
    public static class76 field1036 = new class76(2, 4, class280.field3663);

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "Lgh;")
    public static class76 field1037 = new class76(3, 1, class280.field3667);

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Lgh;")
    public static class76 field1038 = new class76(4, 2, class280.field3667);

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Lgh;")
    public static class76 field1039 = new class76(5, 3, class280.field3667);

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Lgh;")
    private static class76 field1040 = new class76(6, 4, class280.field3667);

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field1041 = class330.method2080((byte) -96, 16);

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "[[I")
    public static int[][] field1042;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public static final void method437(byte arg0) {
        field1028++;
        class379.field5297 = class489.method2751(-100, 2048, 8, 8, 4, 0.4F, true, 35);
        if (arg0 > -106) {
            method437((byte) 116);
        }
    }

    @OriginalMember(owner = "client!gh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1033++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Z")
    public static final boolean method438(int arg0, int arg1) {
        if (arg1 < 104) {
            method438(87, -115);
        }
        field1027++;
        return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static void method439(int arg0) {
        field1038 = null;
        int var1 = 116 % ((arg0 + 50) / 54);
        field1039 = null;
        field1037 = null;
        field1042 = null;
        field1031 = null;
        field1036 = null;
        field1040 = null;
        field1035 = null;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(IILsb;)V")
    private class76(int arg0, int arg1, class280 arg2) {
        this.field1029 = arg1;
        this.field1030 = arg0;
        this.field1034 = arg2;
        this.field1032 = this.field1034.field3654 * this.field1029;
        if (this.field1030 >= 16) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)[Lgh;")
    public static final class76[] method440(int arg0) {
        field1026++;
        int var1 = -27 % ((-arg0 - 86) / 37);
        return new class76[] { field1031, field1035, field1036, field1037, field1038, field1039, field1040 };
    }

    static {
        new class344("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field1042 = new int[128][128];
    }
}
