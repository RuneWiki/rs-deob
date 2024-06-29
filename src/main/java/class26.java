import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!na")
public class class26 {

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "La;")
    public static class1 field362 = class3.method36("overlay)3dat", -120);

    @OriginalMember(owner = "mapview!na", name = "e", descriptor = "I")
    public static int field366 = 0;

    @OriginalMember(owner = "mapview!na", name = "f", descriptor = "La;")
    public static class1 field367 = class3.method36("mapfunction", -128);

    @OriginalMember(owner = "mapview!na", name = "g", descriptor = "La;")
    public static class1 field368 = class3.method36("Saw Mill", -85);

    @OriginalMember(owner = "mapview!na", name = "c", descriptor = "La;")
    public static class1 field364 = class3.method36("Combat Training", -85);

    @OriginalMember(owner = "mapview!na", name = "k", descriptor = "I")
    public static volatile int field372 = -1;

    @OriginalMember(owner = "mapview!na", name = "l", descriptor = "La;")
    public static class1 field373 = class3.method36("Please wait)3)3)3 Rendering Map", -88);

    @OriginalMember(owner = "mapview!na", name = "j", descriptor = "La;")
    public static class1 field371 = class3.method36("world", -93);

    @OriginalMember(owner = "mapview!na", name = "i", descriptor = "La;")
    public static class1 field370 = class3.method36("Cookery Shop", -97);

    @OriginalMember(owner = "mapview!na", name = "d", descriptor = "J")
    public long field365;

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "Lna;")
    public class26 field363;

    @OriginalMember(owner = "mapview!na", name = "h", descriptor = "Lna;")
    public class26 field369;

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "(I)V", line = 10)
    public final void method173(int arg0) {
        if (this.field363 == null) {
            return;
        }
        this.field363.field369 = this.field369;
        this.field369.field363 = this.field363;
        if (arg0 >= 63) {
            this.field363 = null;
            this.field369 = null;
        }
    }

    @OriginalMember(owner = "mapview!na", name = "b", descriptor = "(I)V", line = 69)
    public static void method174(int arg0) {
        field370 = null;
        field373 = null;
        field368 = null;
        field367 = null;
        field362 = null;
        field364 = null;
        if (arg0 != 0) {
            field372 = -36;
        }
        field371 = null;
    }

    @OriginalMember(owner = "mapview!na", name = "a", descriptor = "([BBI)I", line = 114)
    public static final int method175(byte[] arg0, byte arg1, int arg2) {
        if (arg1 != -5) {
            method174(0);
        }
        return class41.method263(arg2, 0, 0, arg0);
    }
}
