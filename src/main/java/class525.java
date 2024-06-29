import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public abstract class class525 {

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "[[B")
    public static byte[][] field7745 = new byte[1000][];

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "Lbi;")
    public static class104 field7744 = new class104(107, 3);

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
    public static int field7746;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "Lkr;")
    public static class77 field7743;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
    public static void method3131(int arg0) {
        field7745 = null;
        if (arg0 == 3) {
            field7743 = null;
            field7744 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILmh;)Lmh;")
    public abstract class105 method2386(int arg0, class105 arg1);

    static {
        new class213("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
    }
}
