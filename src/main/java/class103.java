import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class103 {

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public int field1360;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "[[I")
    public static int[][] field1365 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "Lmr;")
    public static class98 field1364 = new class98();

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Z")
    public static final boolean method707(int arg0) {
        if (arg0 == -3) {
            field1363++;
            return class293.field4292 != class257.field3825 || class208.field3009 >= 2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IJ)V")
    public static final void method708(int arg0, long arg1) {
        field1361++;
        class30.field357.field5665 = arg0;
        class30.field357.method2376((byte) 122, class215.field3111.field7739);
        class30.field357.method2358(arg1, (byte) -48);
        class30.field357.method2376((byte) 122, class149.field1979);
        class269.field3925 = 0;
        class526.field7740 = 0;
        class170.field2473 = 1;
        class319.field4622 = -3;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BILhm;I)V")
    public static final void method709(byte arg0, int arg1, class150 arg2, int arg3) {
        int var4 = -47 % ((arg0 + 50) / 55);
        class353.field5065 = arg1;
        class220.field3180 = arg2;
        field1366++;
        class244.field3542 = arg3;
    }

    @OriginalMember(owner = "client!mg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1362++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)I")
    public final int method710(int arg0) {
        field1359++;
        if (arg0 != -31022) {
            field1364 = null;
        }
        return this.field1360;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class103(String arg0, int arg1) {
        this.field1360 = arg1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static void method711(byte arg0) {
        int var1 = -116 / ((arg0 - 2) / 35);
        field1364 = null;
        field1365 = null;
    }

    static {
        new class530("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
    }
}
