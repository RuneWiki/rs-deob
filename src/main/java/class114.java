import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class114 extends class273 {

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public int field1616;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "Lwm;")
    public static class152 field1622 = class157.method1048("overlay", 120);

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Lwm;")
    public static class152 field1617 = class157.method1048("<br>", 122);

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field1619 = 0;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "Lwm;")
    public static class152 field1621 = class157.method1048("Ablegen", 108);

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "[I")
    public static int[] field1620;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lwm;I)V", line = 19)
    public static final void method761(class152 arg0, int arg1) {
        if (arg1 != 0) {
            method761((class152) null, 17);
        }
        field1618++;
        for (class311 var2 = (class311) class31.field520.method1221((byte) 68); var2 != null; var2 = (class311) class31.field520.method1223(91)) {
            if (var2.field5328.method992(23292, arg0)) {
                class23.field399 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)V", line = 63)
    public static void method762(int arg0) {
        if (arg0 > -122) {
            method762(-51);
        }
        field1621 = null;
        field1617 = null;
        field1620 = null;
        field1622 = null;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V", line = 74)
    public class114() {
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(I)V", line = 78)
    public class114(int arg0) {
        this.field1616 = arg0;
    }
}
