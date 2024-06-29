import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class3 extends class59 {

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "J")
    public long field41;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "Lib;")
    public class3 field37;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "Lib;")
    public class3 field45;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "Lmh;")
    public static class65 field42;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V", line = 12)
    public static final void method9(int arg0) {
        field43++;
        if (class20.field313 != null) {
            class20.field313.method242(0);
        }
        if (class77.field1145 != null) {
            class77.field1145.method242(0);
        }
        class274.method1943(22050, class235.field3760, 2, -58);
        class20.field313 = class266.method1883(113, class283.field4602, class138.field2065, 0, 22050);
        class20.field313.method248(false, class273.field4462);
        class77.field1145 = class266.method1883(112, class283.field4602, class138.field2065, 1, 2048);
        class77.field1145.method248(false, class225.field3596);
        if (arg0 > -43) {
            method9(-101);
        }
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V", line = 50)
    public static void method10(int arg0) {
        field42 = null;
        if (arg0 != 0) {
            field42 = (class65) null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V", line = 67)
    public final void method11(boolean arg0) {
        field38++;
        if (!arg0) {
            field44 = -49;
        }
        if (this.field45 != null) {
            this.field45.field37 = this.field37;
            this.field37.field45 = this.field45;
            this.field37 = null;
            this.field45 = null;
        }
    }
}
