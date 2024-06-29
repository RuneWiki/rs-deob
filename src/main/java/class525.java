import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class525 extends class108 {

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
    public int field7304 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public int field7302 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    public int field7305 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public int field7303 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public int field7301 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "I")
    public int field7309 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
    public int field7311 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "I")
    public int field7314 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "Lraa;")
    public class625 field7307;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "Lov;")
    public static class346 field7308;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "[Lha;")
    public static class116[] field7312;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)Z")
    public final boolean method2929(int arg0, int arg1, int arg2) {
        if (arg2 != Integer.MAX_VALUE) {
            this.field7311 = -26;
        }
        field7306++;
        if (this.field7302 <= arg1 && arg1 <= this.field7305 && arg0 >= this.field7309 && arg0 <= this.field7304) {
            return true;
        } else {
            return arg1 >= this.field7301 && this.field7314 >= arg1 && arg0 >= this.field7311 && arg0 <= this.field7303;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
    public static void method2930(int arg0) {
        field7312 = null;
        field7308 = null;
        if (arg0 != -29661) {
            field7310 = -128;
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lraa;)V")
    public class525(class625 arg0) {
        this.field7307 = arg0;
    }
}
