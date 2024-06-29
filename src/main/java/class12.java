import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public abstract class class12 {

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Ldp;")
    public static class347 field117 = new class347("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Ldp;")
    public static class347 field118 = new class347("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "[I")
    public static int[] field119 = new int[2];

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Lkk;")
    public static class116 field120;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Lok;")
    public static class74 field122;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[B")
    public abstract byte[] method163(int arg0, int arg1);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method164(byte arg0) {
        field118 = null;
        field119 = null;
        field117 = null;
        field120 = null;
        field122 = null;
        int var1 = -28 / ((arg0 - 52) / 53);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)V")
    public static final void method165(int arg0, byte arg1) {
        class148.field2242 = arg0;
        if (arg1 < 27) {
            method164((byte) 113);
        }
        class509.field7487 = -1;
        class413.field6239 = false;
        class525.field7766 = null;
        class531.field7825 = -1;
        class210.field3032 = 0;
        class274.field4095 = 1;
        field116++;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)I")
    public abstract int method166(byte arg0, int arg1);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)Leq;")
    public abstract class508 method167(int arg0);

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(BI)V")
    public abstract void method168(byte arg0, int arg1);
}
