import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class443 {

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "Lap;")
    public static class310 field6294 = new class310(41, 4);

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field6298 = 0;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "Lrc;")
    public static class108 field6297 = new class108(33, 8);

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field6300 = 0;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "S")
    public static short field6299 = 256;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "Lq;")
    public static class102 field6302;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "Lnl;")
    public static class435 field6301;

    static {
        new class151("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V", line = 5)
    public static final void method2690(int arg0, int arg1, int arg2) {
        if (arg2 > -114) {
            field6301 = null;
        }
        field6296++;
        class334 var3 = class352.method2172(arg0, 14, 16711935);
        var3.method2104(0);
        var3.field4648 = arg1;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(II)V", line = 23)
    public class443(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!eo", name = "toString", descriptor = "()Ljava/lang/String;", line = 34)
    public final String toString() {
        field6295++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)V", line = 44)
    public static void method2691(boolean arg0) {
        field6302 = null;
        field6301 = null;
        field6294 = null;
        if (!arg0) {
            method2690(100, -113, 37);
        }
        field6297 = null;
    }
}
