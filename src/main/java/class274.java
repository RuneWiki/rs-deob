import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class274 extends class504 {

    @OriginalMember(owner = "client!rp", name = "E", descriptor = "Z")
    public static boolean field4089 = false;

    @OriginalMember(owner = "client!rp", name = "H", descriptor = "Ldp;")
    public static class347 field4092 = new class347("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!rp", name = "K", descriptor = "I")
    public static int field4095 = 0;

    @OriginalMember(owner = "client!rp", name = "I", descriptor = "Luv;")
    public static class2 field4093 = new class2(72, 7);

    @OriginalMember(owner = "client!rp", name = "F", descriptor = "B")
    public byte field4090;

    @OriginalMember(owner = "client!rp", name = "y", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!rp", name = "z", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!rp", name = "A", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!rp", name = "G", descriptor = "I")
    public int field4091;

    @OriginalMember(owner = "client!rp", name = "J", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!rp", name = "L", descriptor = "Lga;")
    public static class243 field4096;

    @OriginalMember(owner = "client!rp", name = "B", descriptor = "Lnv;")
    public static class44 field4086;

    @OriginalMember(owner = "client!rp", name = "C", descriptor = "Lgk;")
    public class468 field4087;

    @OriginalMember(owner = "client!rp", name = "D", descriptor = "Lsm;")
    public static class477 field4088;

    @OriginalMember(owner = "client!rp", name = "x", descriptor = "[[[B")
    public static byte[][][] field4082;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)[B")
    public final byte[] method682(int arg0) {
        ++field4084;
        int var2 = -107 / ((-38 - arg0) / 42);
        if (!super.field7421 && ~(this.field4087.field6868.length + -this.field4090) >= ~this.field4087.field6830) {
            return this.field4087.field6868;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "(I)V")
    public static void method1706(int arg0) {
        field4088 = null;
        field4092 = null;
        field4086 = null;
        field4096 = null;
        field4093 = null;
        if (arg0 != 100) {
            field4086 = null;
        }
        field4082 = null;
    }

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "(I)I")
    public final int method680(int arg0) {
        ++field4085;
        int var2 = 2 % ((arg0 - 80) / 42);
        return this.field4087 == null ? 0 : this.field4087.field6830 * 100 / (this.field4087.field6868.length + -this.field4090);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BI)V")
    public static final void method1707(byte arg0, int arg1) {
        ++field4083;
        class506 var2 = class14.method185(-1304589728, arg1, 4);
        var2.method2986(-115);
        if (arg0 >= -68) {
            field4088 = null;
        }
    }
}
