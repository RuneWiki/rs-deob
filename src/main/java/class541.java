import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class541 implements class121 {

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "Lce;")
    public class278 field7769;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
    public int field7763;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    public int field7767;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public int field7762;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "Lida;")
    public class215 field7764;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "Ljava/lang/String;")
    public String field7761;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public int field7766;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "Lpr;")
    public static class407 field7765 = new class407(107, 3);

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public static int field7768;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V")
    public static void method3074(int arg0) {
        if (arg0 == -14199) {
            field7765 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)Lqv;")
    public final class406 method484(int arg0) {
        field7768++;
        if (arg0 != 16236) {
            this.field7763 = 18;
        }
        return class595.field8451;
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Ljava/lang/String;Lida;Lce;IIII)V")
    public class541(String arg0, class215 arg1, class278 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7769 = arg2;
        this.field7763 = arg6;
        this.field7767 = arg4;
        this.field7762 = arg5;
        this.field7764 = arg1;
        this.field7761 = arg0;
        this.field7766 = arg3;
    }
}
