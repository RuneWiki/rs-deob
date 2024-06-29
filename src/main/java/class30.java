import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!pa")
public class class30 {

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "Ld;")
    public static class7 field442 = class37.method242("Spinning Wheel", 1333943984);

    @OriginalMember(owner = "mapview!pa", name = "d", descriptor = "I")
    public static int field443 = 50;

    @OriginalMember(owner = "mapview!pa", name = "i", descriptor = "Ld;")
    public static class7 field448 = class37.method242("floorcol)3dat", 1333943984);

    @OriginalMember(owner = "mapview!pa", name = "j", descriptor = "Ld;")
    public static class7 field449 = class37.method242("Prev page", 1333943984);

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "Ld;")
    public static class7 field441 = class37.method242("Anvil", 1333943984);

    @OriginalMember(owner = "mapview!pa", name = "k", descriptor = "Ld;")
    public static class7 field450 = class37.method242("Guide", 1333943984);

    @OriginalMember(owner = "mapview!pa", name = "e", descriptor = "J")
    public long field444;

    @OriginalMember(owner = "mapview!pa", name = "g", descriptor = "Lpa;")
    public class30 field446;

    @OriginalMember(owner = "mapview!pa", name = "h", descriptor = "Lpa;")
    public class30 field447;

    @OriginalMember(owner = "mapview!pa", name = "f", descriptor = "[B")
    public static byte[] field445;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "[I")
    public static int[] field440;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Z)V", line = 8)
    public static void method212(boolean arg0) {
        field445 = null;
        field449 = null;
        field450 = null;
        field442 = null;
        field448 = null;
        field440 = null;
        field441 = null;
        if (arg0) {
            field441 = null;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "(Z)V", line = 31)
    public static final void method213(boolean arg0) {
        class22 var1 = class36.field494;
        synchronized (class36.field494) {
            class34.field483 = class31.field454;
            class14.field144 = class20.field195;
            class28.field416 = class16.field172;
            class24.field232 = class20.field193;
            class13.field124 = class25.field245;
            if (!arg0) {
                method212(true);
            }
            class27.field376 = class21.field211;
            class20.field193 = 0;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(I)V", line = 65)
    public final void method214(int arg0) {
        if (this.field447 == null) {
            return;
        }
        this.field447.field446 = this.field446;
        this.field446.field447 = this.field447;
        if (arg0 == 1) {
            this.field446 = null;
            this.field447 = null;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "(I)V", line = 95)
    public static final void method215(int arg0) {
        if (class2.field12[0][class16.field158][class34.field478] == null) {
            class14.field146 = null;
        } else {
            class14.field146 = class2.field12[0][class16.field158][class34.field478];
        }
        if (class2.field12[1][class16.field158][class34.field478] == null) {
            class13.field130 = null;
        } else {
            class13.field130 = class2.field12[1][class16.field158][class34.field478];
        }
        if (class2.field12[2][class16.field158][class34.field478] == null) {
            mapview.field287 = null;
        } else {
            mapview.field287 = class2.field12[2][class16.field158][class34.field478];
        }
        if (arg0 != -10399) {
            method212(false);
        }
        if (class2.field12[3][class16.field158][class34.field478] == null) {
            class28.field393 = null;
        } else {
            class28.field393 = class2.field12[3][class16.field158][class34.field478];
        }
        if (class2.field12[4][class16.field158][class34.field478] == null) {
            class2.field21 = null;
        } else {
            class2.field21 = class2.field12[4][class16.field158][class34.field478];
        }
        if (class36.field497[class16.field158][class34.field478] == null) {
            class4.field52 = null;
        } else {
            class4.field52 = class36.field497[class16.field158][class34.field478];
        }
        if (class21.field203[class16.field158][class34.field478] == null) {
            class35.field488 = null;
        } else {
            class35.field488 = class21.field203[class16.field158][class34.field478];
        }
        if (class32.field468[class16.field158][class34.field478] == null) {
            class4.field55 = null;
        } else {
            class4.field55 = class32.field468[class16.field158][class34.field478];
        }
    }
}
