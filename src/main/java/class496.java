import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class496 {

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "Lnj;")
    public static class487 field7471 = new class487("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Ljava/lang/String;")
    public static String field7472 = null;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "J")
    public long field7465;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Ljd;")
    public class496 field7466;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Ljd;")
    public class496 field7469;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)Z")
    public final boolean method2994(int arg0) {
        field7470++;
        if (this.field7466 == null) {
            return false;
        } else {
            if (arg0 < 4) {
                field7472 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBI)V")
    public static final void method2995(int arg0, byte arg1, int arg2) {
        if (arg1 == 88) {
            field7467++;
            class621 var3 = class442.method2691(arg0, 1, true);
            var3.method3592((byte) 106);
            var3.field9068 = arg2;
        }
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
    public static void method2996(int arg0) {
        field7471 = null;
        if (arg0 != 1) {
            method2996(71);
        }
        field7472 = null;
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V")
    public final void method2997(int arg0) {
        field7468++;
        if (arg0 != 1) {
            method2995(-30, (byte) 21, -66);
        }
        if (this.field7466 != null) {
            this.field7466.field7469 = this.field7469;
            this.field7469.field7466 = this.field7466;
            this.field7469 = null;
            this.field7466 = null;
        }
    }
}
