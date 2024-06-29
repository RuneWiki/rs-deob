import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class112 extends class259 {

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "[B")
    public byte[] field1862;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1866 = "Continue";

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Llc;")
    public static class270 field1863;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Llc;")
    public static class270 field1864;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "Lkc;")
    public static class49 field1865;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)V")
    public static void method846(int arg0) {
        int var1 = 122 / ((arg0 - 66) / 46);
        field1865 = null;
        field1866 = null;
        field1864 = null;
        field1863 = null;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "([B)V")
    public class112(byte[] arg0) {
        this.field1862 = arg0;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
    public static final void method847(int arg0, int arg1) {
        field1861++;
        class279 var2 = class111.method844(arg1, arg0, arg0 ^ 0x95E49826);
        var2.method1934((byte) -114);
    }
}
