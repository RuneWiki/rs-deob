import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class class70 {

    @OriginalMember(owner = "client!he", name = "a", descriptor = "[I")
    public static int[] field1201 = new int[100];

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lai;")
    public static class10 field1203 = class44.method278("(Udns", 116);

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Lai;")
    private static class10 field1207 = class44.method278("Too many connections from your address)3", -120);

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1208 = -1;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lai;")
    public static class10 field1206 = field1207;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field1209 = 0;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Lte;")
    public static class177 field1210;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)[B")
    public abstract byte[] method396(int arg0);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I[B)V")
    public abstract void method397(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static void method448(byte arg0) {
        field1201 = null;
        field1206 = null;
        if (arg0 <= 75) {
            method448((byte) 55);
        }
        field1207 = null;
        field1203 = null;
        field1210 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lai;")
    public static final class10 method449(int arg0, int arg1) {
        if (arg0 != 14766) {
            field1210 = null;
        }
        field1205++;
        return class67.method440(0, new class10[] { class119.method846(arg0 ^ 0x39AE, arg1 >> 24 & 0xFF), class54.field968, class119.method846(0, arg1 >> 16 & 0xFF), class54.field968, class119.method846(arg0 - 14766, arg1 >> 8 & 0xFF), class54.field968, class119.method846(0, arg1 & 0xFF) });
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Lqf;")
    public static final class151 method450(byte arg0) {
        if (class44.field719 == null) {
            class44.field719 = new class151();
        }
        field1204++;
        if (arg0 >= -127) {
            method449(76, -26);
        }
        return class44.field719;
    }
}
