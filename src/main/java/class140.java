import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class140 {

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public static int field1683 = 1;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "[[I")
    public static int[][] field1689;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "[[[B")
    public static byte[][][] field1686;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
    public static void method663(int arg0) {
        field1686 = null;
        int var1 = 48 / ((-arg0 - 55) / 37);
        field1689 = null;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IB)Lc;")
    public static final class172 method664(int arg0, byte arg1) {
        field1685++;
        class172 var2 = (class172) class170.field2011.method1163((byte) 102, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class335.field4842.method2768(-20472, arg0, 1);
        class172 var4 = new class172();
        var4.field2063 = arg0;
        if (var3 != null) {
            var4.method853(-5, new class179(var3));
        }
        var4.method849(-1);
        if (var4.field2055 == 2 && class86.field1056.method233(58, (long) arg0) == null) {
            class86.field1056.method234(-106, (long) arg0, new class363(class121.field1506));
            class44.field566[class121.field1506++] = var4;
        }
        class170.field2011.method1172((long) arg0, 1, var4);
        if (arg1 > -107) {
            method663(80);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ss", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1687++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(II)V")
    public class140(int arg0, int arg1) {
    }

    static {
        new class40("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field1689 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
        field1690 = 0;
    }
}
