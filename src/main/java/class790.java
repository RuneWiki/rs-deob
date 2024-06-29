import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class790 extends class24 {

    @OriginalMember(owner = "client!eca", name = "A", descriptor = "I")
    private int field10872 = -1;

    @OriginalMember(owner = "client!eca", name = "w", descriptor = "J")
    public static long field10868 = -1L;

    @OriginalMember(owner = "client!eca", name = "x", descriptor = "I")
    public static int field10869;

    @OriginalMember(owner = "client!eca", name = "y", descriptor = "I")
    public static int field10870;

    @OriginalMember(owner = "client!eca", name = "z", descriptor = "I")
    public static int field10871;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(ILjp;)V")
    public final void method191(int arg0, class376 arg1) {
        this.field10872 = arg1.method2359(-1);
        if (arg0 >= -56) {
            field10868 = 31L;
        }
        field10871++;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lke;I)V")
    public final void method190(class625 arg0, int arg1) {
        if (arg1 != 5) {
            field10868 = 30L;
        }
        field10869++;
        arg0.method3430((byte) -105, this.field10872);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lhe;I)Z")
    public static final boolean method4360(class392 arg0, int arg1) {
        field10870++;
        class589 var2 = class350.field5132.method3732((byte) 103, arg0.method31(-23356));
        if (arg1 > -83) {
            method4360(null, -31);
        }
        if (var2.field7855 == -1) {
            return true;
        } else {
            class532 var3 = class159.field2194.method396(var2.field7855, (byte) -104);
            return var3.field7247 == -1 ? true : var3.method3047(0);
        }
    }
}
