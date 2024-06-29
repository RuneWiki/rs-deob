import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class271 {

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public int field3426;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lnb;")
    public static class271 field3424 = new class271(1);

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Lnb;")
    public static class271 field3427 = new class271(2);

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Lnb;")
    public static class271 field3428 = new class271(4);

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Lnb;")
    public static class271 field3429 = new class271(1);

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Lnb;")
    public static class271 field3430 = new class271(2);

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Lnb;")
    public static class271 field3431 = new class271(4);

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Lnb;")
    public static class271 field3432 = new class271(2);

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Lnb;")
    public static class271 field3433 = new class271(4);

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "[I")
    public static int[] field3435;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "[[Lep;")
    public static class382[][] field3434;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method1549(int arg0) {
        field3427 = null;
        field3433 = null;
        field3432 = null;
        field3429 = null;
        field3430 = null;
        field3424 = null;
        field3435 = null;
        field3428 = null;
        if (arg0 != 2) {
            method1549(-39);
        }
        field3431 = null;
        field3434 = null;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I)V")
    private class271(int arg0) {
        this.field3426 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3425++;
        throw new IllegalStateException();
    }
}
