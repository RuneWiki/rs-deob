import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class751 extends class314 {

    @OriginalMember(owner = "client!gfa", name = "z", descriptor = "Z")
    public static boolean field10414 = false;

    @OriginalMember(owner = "client!gfa", name = "C", descriptor = "Llga;")
    public static class712 field10417 = new class712(9, -1);

    @OriginalMember(owner = "client!gfa", name = "D", descriptor = "Llga;")
    public static class712 field10418 = new class712(44, 3);

    @OriginalMember(owner = "client!gfa", name = "E", descriptor = "I")
    public static int field10419 = 765;

    @OriginalMember(owner = "client!gfa", name = "o", descriptor = "I")
    public static int field10403;

    @OriginalMember(owner = "client!gfa", name = "p", descriptor = "I")
    public static int field10404;

    @OriginalMember(owner = "client!gfa", name = "q", descriptor = "I")
    public int field10405;

    @OriginalMember(owner = "client!gfa", name = "r", descriptor = "I")
    public int field10406;

    @OriginalMember(owner = "client!gfa", name = "s", descriptor = "I")
    public static int field10407;

    @OriginalMember(owner = "client!gfa", name = "t", descriptor = "I")
    public static int field10408;

    @OriginalMember(owner = "client!gfa", name = "u", descriptor = "I")
    public static int field10409;

    @OriginalMember(owner = "client!gfa", name = "v", descriptor = "I")
    public int field10410;

    @OriginalMember(owner = "client!gfa", name = "w", descriptor = "I")
    public static int field10411;

    @OriginalMember(owner = "client!gfa", name = "y", descriptor = "I")
    public static int field10413;

    @OriginalMember(owner = "client!gfa", name = "A", descriptor = "I")
    public static int field10415;

    @OriginalMember(owner = "client!gfa", name = "B", descriptor = "I")
    public int field10416;

    @OriginalMember(owner = "client!gfa", name = "x", descriptor = "J")
    public long field10412;

    @OriginalMember(owner = "client!gfa", name = "F", descriptor = "Lni;")
    public static class522 field10420;

    @OriginalMember(owner = "client!gfa", name = "f", descriptor = "(I)V")
    public static final void method4182(int arg0) {
        if (arg0 >= -115) {
            method4185(14);
        }
        class587.method3267(2, 22050, class11.field68.field5504.method3760((byte) 123) == 1, (byte) 117);
        field10415++;
        class566.field7989 = class256.method1521(22050, 0, (byte) -126, class287.field3823, class725.field10121);
        class561.method3168(class253.method1509(-124, null), true, 28643);
        class188.field2264 = class256.method1521(2048, 1, (byte) -126, class287.field3823, class725.field10121);
        class143.field1851 = new class454();
        class188.field2264.method498(0, class143.field1851);
        class108.field1427 = new class233(22050, class478.field6609);
        class444.method2492((byte) 111);
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Z)J")
    public final long method1878(boolean arg0) {
        if (arg0) {
            field10411++;
            return this.field10412;
        } else {
            return -39L;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)I")
    public final int method1875(int arg0) {
        if (arg0 < 34) {
            return -100;
        } else {
            field10413++;
            return this.field10410;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "e", descriptor = "(I)I")
    public final int method1880(int arg0) {
        if (arg0 != -5) {
            this.field10412 = 50L;
        }
        field10408++;
        return this.field10416;
    }

    @OriginalMember(owner = "client!gfa", name = "g", descriptor = "(I)V")
    public static final void method4183(int arg0) {
        field10407++;
        if (arg0 != -2) {
            return;
        }
        class431.field6076++;
        class103 var1 = class752.method4186(260, class290.field3842, class449.field6285);
        var1.field1379.method3393(class381.method2243((byte) 112), arg0 ^ 0x24);
        var1.field1379.method3423(class546.field7710, arg0 + 1571862890);
        var1.field1379.method3423(class512.field6932, 1571862888);
        var1.field1379.method3393(class11.field68.field5520.method1958((byte) 120), -70);
        class27.method104(false, var1);
    }

    @OriginalMember(owner = "client!gfa", name = "h", descriptor = "(I)V")
    public static void method4184(int arg0) {
        field10417 = null;
        field10418 = null;
        field10420 = null;
        if (arg0 != -15367) {
            field10419 = -111;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "(I)I")
    public final int method1879(int arg0) {
        field10409++;
        int var2 = -3 % ((72 - arg0) / 49);
        return this.field10406;
    }

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)I")
    public final int method1876(int arg0) {
        if (arg0 != 2) {
            this.field10412 = -28L;
        }
        field10403++;
        return this.field10405;
    }

    @OriginalMember(owner = "client!gfa", name = "i", descriptor = "(I)Z")
    public static final boolean method4185(int arg0) {
        if (arg0 <= 38) {
            return true;
        } else {
            field10404++;
            return class43.field470 > 0;
        }
    }
}
