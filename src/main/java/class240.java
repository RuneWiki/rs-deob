import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class240 {

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public int field3389;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "Lbv;")
    private class282 field3388;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field3386 = 0;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "Lcm;")
    public static class449 field3391 = new class449(8, 2);

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!vl", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() throws Throwable {
        field3387++;
        this.field3388.method1818(false, this.field3389);
        super.finalize();
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 25)
    public static void method1611(int arg0) {
        field3391 = null;
        if (arg0 != 17266) {
            field3386 = -105;
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V", line = 36)
    public static final void method1612(int arg0) {
        class179.method1287(false, class363.field5621);
        class465.field6791++;
        field3390++;
        class75.field1006.method625(class320.method2074(-32190), false);
        class75.field1006.method600(class7.field112, -12891);
        class75.field1006.method600(class486.field7136, -12891);
        int var1 = 44 / ((59 - arg0) / 62);
        class75.field1006.method625(class96.field1399.field5212, false);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lbw;III)V", line = 55)
    public static final void method1613(class20 arg0, int arg1, int arg2, int arg3) {
        class98.field1415[arg1][arg2] = arg0;
        field3392++;
        if (arg3 != 8) {
            method1611(-95);
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lbv;II)V", line = 65)
    public class240(class282 arg0, int arg1, int arg2) {
        this.field3389 = arg2;
        this.field3388 = arg0;
    }
}
