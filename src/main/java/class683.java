import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class683 extends class176 {

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "Lpd;")
    public static class259 field9458 = new class259(2);

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field9459;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field9460;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public static int field9461;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V", line = 6)
    public static void method3903(boolean arg0) {
        field9458 = null;
        if (arg0) {
            field9458 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIZ)V", line = 21)
    public final void method1248(int arg0, int arg1, int arg2, boolean arg3) {
        ++field9461;
        int var5 = this.method1250((byte) -25) * super.field2722.field10371 / 10000;
        class736.field10316.method516(arg0, arg2 + 2, var5, super.field2722.field10364 - arg1, ((class107) super.field2722).field1499, 0);
        class736.field10316.method516(arg0 - -var5, arg2 + 2, -var5 + super.field2722.field10371, super.field2722.field10364 - 2, 0, 0);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZBI)V", line = 32)
    public final void method1254(int arg0, boolean arg1, byte arg2, int arg3) {
        class736.field10316.method525(arg0 + -2, arg3, super.field2722.field10371 + 4, super.field2722.field10364 + 2, ((class107) super.field2722).field1495, 0);
        ++field9459;
        if (arg2 == 82) {
            class736.field10316.method525(arg0 - 1, arg3 + 1, super.field2722.field10371 + 2, super.field2722.field10364, 0, 0);
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lvd;Lvd;Lkba;)V", line = 44)
    public class683(class39 arg0, class39 arg1, class107 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZI)V", line = 47)
    public static final void method3904(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            ++field9460;
            class150 var3 = class676.method3885(1000, 12, arg0);
            var3.method1116(76);
            var3.field2346 = arg2;
        }
    }
}
