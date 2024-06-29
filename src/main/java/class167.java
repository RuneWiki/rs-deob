import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class167 {

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    private int field2689 = 0;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "Lpd;")
    private class3 field2687;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field2691 = 1;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field2695 = 3353893;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "F")
    public static float field2690;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "Lvb;")
    private class60 field2692;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "[[S")
    public static short[][] field2688;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)Lvb;", line = 8)
    public final class60 method1245(boolean arg0) {
        field2693++;
        if (!arg0) {
            return (class60) null;
        } else if (this.field2689 <= 0 || this.field2687.field86[this.field2689 - 1] == this.field2692) {
            class60 var3;
            do {
                if (this.field2689 >= this.field2687.field103) {
                    return null;
                }
                var3 = this.field2687.field86[this.field2689++].field891;
            } while (this.field2687.field86[this.field2689 - 1] == var3);
            this.field2692 = var3.field891;
            return var3;
        } else {
            class60 var2 = this.field2692;
            this.field2692 = var2.field891;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)Lvb;", line = 48)
    public final class60 method1246(int arg0) {
        int var2 = -59 / ((23 - arg0) / 32);
        this.field2689 = 0;
        field2694++;
        return this.method1245(true);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 70)
    public static void method1247(byte arg0) {
        if (arg0 > -56) {
            method1247((byte) -2);
        }
        field2688 = (short[][]) null;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lpd;)V", line = 82)
    public class167(class3 arg0) {
        this.field2687 = arg0;
    }
}
