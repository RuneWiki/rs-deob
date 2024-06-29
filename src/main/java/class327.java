import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class327 {

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4697 = "Ok";

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "Z")
    public static boolean field4699 = false;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "[I")
    public static int[] field4703 = new int[256];

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Lwe;")
    public static class24 field4700 = new class24(2);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Lqj;")
    public static class238 field4704;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Lor;")
    public static class296 field4701;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "[[[B")
    public static byte[][][] field4702;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V", line = 16)
    public static void method2012(byte arg0) {
        field4700 = null;
        field4697 = null;
        field4702 = null;
        field4704 = null;
        field4701 = null;
        field4703 = null;
        if (arg0 <= 6) {
            method2014((byte) 2);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lqj;B)V", line = 43)
    public static final void method2013(class238 arg0, byte arg1) {
        class77.field1058 = arg0;
        field4698++;
        class335.field4948 = class77.field1058.method1476(16, (byte) -72);
        if (arg1 <= 17) {
            method2012((byte) 96);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V", line = 68)
    public static final void method2014(byte arg0) {
        if (arg0 != 121) {
            field4703 = null;
        }
        field4705++;
        if (class138.field1845 != null) {
            class138.field1845.method2761(-31586);
            class138.field1845 = null;
            class45.field673 = null;
        }
    }
}
