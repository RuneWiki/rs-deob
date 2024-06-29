import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public abstract class class337 extends class269 {

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    public int field5009;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
    public int field5015;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    public int field5010;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    public int field5013;

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
    public int field5017;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
    public int field5012;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
    public int field5014;

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "Lnn;")
    public static class151 field5018 = new class151("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(Z)Z")
    public final boolean method112(boolean arg0) {
        if (arg0) {
            field5016++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZILla;IIILdr;)V")
    public final void method117(boolean arg0, int arg1, class269 arg2, int arg3, int arg4, int arg5, class261 arg6) {
        if (arg1 != 0) {
            this.field5014 = -41;
        }
        field5007++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(B)V")
    public final void method116(byte arg0) {
        if (arg0 < -45) {
            field5011++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(B)I")
    public abstract int method16(byte arg0);

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(IIIIIII)V")
    public class337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5009 = arg3;
        this.field5015 = arg6;
        this.field5010 = arg4;
        this.field5013 = arg2;
        this.field5017 = arg0;
        this.field5012 = arg1;
        this.field5014 = arg5;
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(B)V")
    public static void method2062(byte arg0) {
        if (arg0 > 119) {
            field5018 = null;
        }
    }
}
