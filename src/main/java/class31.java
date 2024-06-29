import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class31 {

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Le;")
    private static class191 field432 = class54.method368("Walk here", 2047);

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field434 = 0;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Le;")
    public static class191 field430 = field432;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Le;")
    public static class191 field435 = class54.method368("VOLL", 2047);

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Lef;")
    public static class175 field431 = new class175();

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field438 = 0;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Le;")
    public static class191 field439 = class54.method368("::noclip", 2047);

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "Le;")
    public static class191 field441 = class54.method368("Spielwelt erstellt)3", 2047);

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "[Lc;")
    public static class60[] field436;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method215(int arg0) {
        field432 = null;
        if (arg0 != 27652) {
            method215(36);
        }
        field430 = null;
        field431 = null;
        field435 = null;
        field441 = null;
        field439 = null;
        field436 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)Lsb;")
    public static final class102 method216(int arg0, byte arg1) {
        class102 var2 = (class102) class235.field4191.method991((long) arg0, -25858);
        field437++;
        if (arg1 <= 116) {
            field441 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class35.field653.method826((byte) 35, class163.method1104(arg0, 0), class45.method312((byte) 48, arg0));
        class102 var4 = new class102();
        var4.field1690 = arg0;
        if (var3 != null) {
            var4.method644((byte) -125, new class225(var3));
        }
        var4.method632((byte) 117);
        if (var4.field1685) {
            var4.field1679 = 0;
            var4.field1641 = false;
        }
        if (!class131.field2181 && var4.field1683) {
            var4.field1651 = null;
        }
        class235.field4191.method987(var4, (long) arg0, -2438);
        return var4;
    }
}
