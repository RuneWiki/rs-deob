import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class25 {

    @OriginalMember(owner = "client!as", name = "g", descriptor = "S")
    public short field350;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "B")
    public byte field349;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "Lpi;")
    public class423 field345;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "B")
    public byte field347;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "Lbv;")
    public static class567 field344 = new class567("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!as", name = "c", descriptor = "Lnn;")
    public static class214 field346 = new class214(12, 14);

    @OriginalMember(owner = "client!as", name = "i", descriptor = "Lfea;")
    public static class47 field352 = new class47();

    @OriginalMember(owner = "client!as", name = "e", descriptor = "Lei;")
    public static class329 field348;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "[Lha;")
    public static class116[] field351;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V", line = 18)
    public static void method242(boolean arg0) {
        if (!arg0) {
            field348 = null;
        }
        field351 = null;
        field348 = null;
        field346 = null;
        field344 = null;
        field352 = null;
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lpi;III)V", line = 37)
    public class25(class423 arg0, int arg1, int arg2, int arg3) {
        this.field350 = (short) arg1;
        this.field349 = (byte) arg2;
        this.field345 = arg0;
        this.field347 = (byte) arg3;
    }
}
