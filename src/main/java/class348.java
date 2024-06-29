import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class348 {

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
    public int field4623;

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "Lfha;")
    public static class382 field4628 = new class382(0, 5);

    @OriginalMember(owner = "client!afa", name = "i", descriptor = "[I")
    public static int[] field4631 = new int[1000];

    @OriginalMember(owner = "client!afa", name = "h", descriptor = "[I")
    public static int[] field4630 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!afa", name = "g", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
    public static void method2029(int arg0) {
        field4631 = null;
        if (arg0 != 2566) {
            method2029(-105);
        }
        field4630 = null;
        field4628 = null;
    }

    @OriginalMember(owner = "client!afa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4626++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)[Lmu;")
    public static final class303[] method2030(int arg0) {
        if (arg0 < 1) {
            return null;
        } else {
            field4625++;
            return new class303[] { class61.field673, class472.field6539, class83.field1165, class522.field7046, class287.field3824, class684.field9510 };
        }
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class348(String arg0, int arg1) {
        this.field4623 = arg1;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)V")
    public static final void method2031(byte arg0) throws class353 {
        if (class392.field5553 == 1) {
            class603.field8409.method373(class435.field6103, class99.field1312);
        } else {
            class603.field8409.method373(0, 0);
        }
        field4629++;
        if (arg0 != 10) {
            method2029(-82);
        }
    }

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "(I)I")
    public final int method2032(int arg0) {
        field4624++;
        if (arg0 > -37) {
            this.method2032(121);
        }
        return this.field4623;
    }
}
