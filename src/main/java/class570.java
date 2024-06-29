import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class570 {

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public int field7570;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public int field7576;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public int field7571;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public int field7573;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "Z")
    public static boolean field7574 = false;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "Lcu;")
    public static class206 field7568 = new class206(71, 11);

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field7575;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "Le;")
    public static class498 field7572;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)Lsg;")
    public static final class369 method3134(byte arg0) {
        field7575++;
        if (arg0 > -12) {
            field7568 = null;
        }
        class369 var1 = (class369) class561.field7435.method329((byte) 77);
        if (var1 == null) {
            return new class369();
        } else {
            class69.field1039--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!lj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7569++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method3135(int arg0) {
        field7568 = null;
        if (arg0 == 71) {
            field7572 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(IIII)V")
    public class570(int arg0, int arg1, int arg2, int arg3) {
        this.field7570 = arg0;
        this.field7576 = arg3;
        this.field7571 = arg2;
        this.field7573 = arg1;
    }
}
