import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class522 {

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public int field7533 = 443;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "Z")
    private boolean field7536 = true;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "Z")
    private boolean field7539 = false;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public int field7537 = 43594;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "Ltm;")
    public static class334 field7532 = new class334(87, -2);

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
    public int field7542;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "Ljava/lang/String;")
    public String field7535;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
    public final void method3108(int arg0) {
        field7534++;
        if (arg0 != 0) {
            return;
        }
        if (!this.field7536) {
            this.field7536 = true;
            this.field7539 = true;
        } else if (this.field7539) {
            this.field7539 = false;
        } else {
            this.field7536 = false;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lfc;I)Leha;")
    public final class162 method3109(class731 arg0, int arg1) {
        field7540++;
        if (arg1 <= 63) {
            this.method3108(125);
        }
        return arg0.method4053(22, this.field7535, this.field7536 ? this.field7533 : this.field7537, this.field7539);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method3110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field7538++;
        if (arg2 != 50) {
            field7532 = null;
        }
        if ((arg6 ? class654.field9289.field5426.method155(3) : class654.field9289.field5439.method155(3)) != 0 && arg5 != 0 && class115.field1790 < 50 && arg4 != -1) {
            class374.field5649[class115.field1790++] = new class625((byte) (arg6 ? 3 : 2), arg4, arg5, arg0, arg3, 0, arg1, null);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLro;)Z")
    public final boolean method3111(byte arg0, class522 arg1) {
        field7541++;
        if (arg0 != 45) {
            this.method3111((byte) -102, null);
        }
        if (arg1 == null) {
            return false;
        } else {
            return this.field7542 == arg1.field7542 && this.field7535.equals(arg1.field7535);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
    public static void method3112(byte arg0) {
        field7532 = null;
        if (arg0 > -99) {
            method3112((byte) 67);
        }
    }
}
