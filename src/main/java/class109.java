import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public abstract class class109 {

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "Lbg;")
    public static class324 field1545 = new class324(78, 2);

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "Liv;")
    public static class65 field1546 = new class65(new byte[5000]);

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "Lgk;")
    public static class331 field1548 = new class331("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "[I")
    public static int[] field1551 = new int[13];

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "Lfs;")
    public static class387 field1549;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "Lkb;")
    public static class485 field1547;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V", line = 27)
    public static void method899(int arg0) {
        field1548 = null;
        field1547 = null;
        field1546 = null;
        if (arg0 != 13) {
            field1547 = null;
        }
        field1549 = null;
        field1551 = null;
        field1545 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)[B")
    public abstract byte[] method896(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)[B")
    public abstract byte[] method897(byte arg0);

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I[B)V")
    public abstract void method898(int arg0, byte[] arg1);
}
