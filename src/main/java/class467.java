import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class467 extends class25 {

    @OriginalMember(owner = "client!os", name = "H", descriptor = "I")
    public static int field6528 = 0;

    @OriginalMember(owner = "client!os", name = "M", descriptor = "Lhj;")
    public static class596 field6532 = new class596(24, 8);

    @OriginalMember(owner = "client!os", name = "F", descriptor = "I")
    public int field6526;

    @OriginalMember(owner = "client!os", name = "I", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!os", name = "K", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!os", name = "L", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!os", name = "O", descriptor = "Ltc;")
    public class372 field6534;

    @OriginalMember(owner = "client!os", name = "G", descriptor = "Ljava/lang/Object;")
    public static Object field6527;

    @OriginalMember(owner = "client!os", name = "E", descriptor = "[B")
    public byte[] field6525;

    @OriginalMember(owner = "client!os", name = "N", descriptor = "[I")
    public static int[] field6533;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)[B", line = 4)
    public final byte[] method250(int arg0) {
        ++field6529;
        if (arg0 != -13864) {
            method2797((byte) 63);
        }
        if (super.field374) {
            throw new RuntimeException();
        } else {
            return this.field6525;
        }
    }

    @OriginalMember(owner = "client!os", name = "h", descriptor = "(I)V", line = 25)
    public static final void method2796(int arg0) {
        if (arg0 <= 27) {
            method2797((byte) -128);
        }
        class288 var1 = class692.field9424;
        synchronized (class692.field9424) {
            class692.field9424.method1690(0);
        }
        ++field6530;
        class288 var2 = class462.field6485;
        synchronized (class462.field6485) {
            class462.field6485.method1690(0);
        }
    }

    @OriginalMember(owner = "client!os", name = "g", descriptor = "(I)I", line = 51)
    public final int method253(int arg0) {
        ++field6531;
        if (arg0 != 0) {
            this.field6534 = null;
        }
        return super.field374 ? 0 : 100;
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(B)V", line = 71)
    public static void method2797(byte arg0) {
        field6532 = null;
        if (arg0 != -70) {
            method2797((byte) -87);
        }
        field6533 = null;
        field6527 = null;
    }
}
