import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class142 implements class81 {

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public int field2272;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Z")
    public static boolean field2266 = false;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Z")
    public static boolean field2268 = false;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field2265 = 0;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "[I")
    public static int[] field2270 = new int[50];

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Lmha;")
    public final class419 method112(byte arg0) {
        if (arg0 != 62) {
            method1086((byte) 74);
        }
        field2267++;
        return class126.field2080;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static final void method1085(int arg0) {
        if (arg0 <= 5) {
            return;
        }
        if (class83.field1002 == null) {
            class729 var1 = new class729();
            byte[] var2 = var1.method4090(128, (byte) 114, 16, 128);
            class83.field1002 = class166.method1195(false, var2, (byte) 117);
        }
        field2271++;
        if (class298.field4244 == null) {
            class201 var3 = new class201();
            byte[] var4 = var3.method1353(128, 16, 128, 4096);
            class298.field4244 = class166.method1195(false, var4, (byte) 117);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
    public static void method1086(byte arg0) {
        field2270 = null;
        if (arg0 != 94) {
            field2269 = -39;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(I)V")
    public class142(int arg0) {
        this.field2272 = arg0;
    }
}
