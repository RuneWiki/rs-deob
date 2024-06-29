import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class455 implements class653 {

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
    public int field6530;

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "I")
    public int field6537;

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "Lut;")
    public class109 field6534;

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "Lgi;")
    public class630 field6535;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    public int field6529;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "[I")
    public static int[] field6532 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "I")
    public static int field6531 = 0;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
    public static void method2683(int arg0) {
        field6532 = null;
        if (arg0 != 0) {
            method2685(true, -34, -10);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)Lrw;")
    public class703 method351(byte arg0) {
        if (arg0 < 73) {
            method2684((byte) 4);
        }
        field6536++;
        return class56.field1092;
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(B)V")
    public static final void method2684(byte arg0) {
        field6527++;
        if (arg0 != 12) {
            method2685(false, 63, 35);
        }
        class356.field5109++;
        class135 var1 = class688.method3794(class545.field7674, class583.field8198, (byte) 38);
        var1.field1978.method3852(false, class467.field6717);
        class19.method223(var1, arg0 ^ 0xC);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZII)Z")
    public static final boolean method2685(boolean arg0, int arg1, int arg2) {
        field6528++;
        if (arg0) {
            return true;
        } else {
            return class230.method1588(arg2, (byte) 4, arg1) | (arg1 & 0x60000) != 0 || class352.method2161(arg1, !arg0, arg2) || class349.method2153(arg2, arg1, -274);
        }
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(ILut;Lgi;II)V")
    public class455(int arg0, class109 arg1, class630 arg2, int arg3, int arg4) {
        this.field6530 = arg3;
        this.field6537 = arg0;
        this.field6534 = arg1;
        this.field6535 = arg2;
        this.field6529 = arg4;
    }
}
