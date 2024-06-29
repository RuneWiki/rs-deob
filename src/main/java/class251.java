import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class251 extends class179 {

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "J")
    public long field3839;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "Lbp;")
    public class251 field3837;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "Lbp;")
    public class251 field3842;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "Liq;")
    public static class414 field3835;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "[I")
    public static int[] field3841;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "[[B")
    public static byte[][] field3838;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "(I)V", line = 3)
    public static void method1509(int arg0) {
        field3841 = null;
        field3838 = null;
        field3835 = null;
        if (arg0 != 29469) {
            method1509(-40);
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)Z", line = 16)
    public final boolean method1510(byte arg0) {
        int var2 = 79 / ((-arg0 - 24) / 54);
        field3844++;
        return this.field3837 != null;
    }

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "(I)V", line = 32)
    public static final void method1511(int arg0) {
        if (arg0 == -1690) {
            field3843++;
            class74.field1321.method2412(115);
            class265.field4019.method2412(120);
        }
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(B)V", line = 48)
    public final void method1512(byte arg0) {
        field3836++;
        if (this.field3837 == null) {
            return;
        }
        this.field3837.field3842 = this.field3842;
        this.field3842.field3837 = this.field3837;
        if (arg0 <= 115) {
            this.field3842 = null;
        }
        this.field3842 = null;
        this.field3837 = null;
    }
}
