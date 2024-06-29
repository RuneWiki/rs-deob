import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class165 extends class381 {

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public volatile int field2321 = -1;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Ljava/lang/String;")
    public volatile String field2319;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Liba;")
    public static class211 field2317 = new class211(30, 7);

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Lae;")
    public static class254 field2318;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lmb;")
    public static class383 field2320;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLmv;)V")
    public static final void method1161(byte arg0, class295 arg1) {
        field2316++;
        class627.field9101 = arg1.method1819("p11_full", (byte) 127);
        if (arg0 != -22) {
            method1161((byte) -77, null);
        }
        class410.field6111 = arg1.method1819("p12_full", (byte) 57);
        class63.field1003 = arg1.method1819("b12_full", (byte) 122);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static void method1162(byte arg0) {
        field2318 = null;
        int var1 = -119 % ((27 - arg0) / 41);
        field2320 = null;
        field2317 = null;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class165(String arg0) {
        this.field2319 = arg0;
    }
}
