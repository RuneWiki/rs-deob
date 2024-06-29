import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class170 extends class311 {

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "Z")
    public static boolean field2410 = false;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "J")
    public long field2411;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "Lsk;")
    public class170 field2408;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "Lsk;")
    public class170 field2409;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "Lij;")
    public static class316 field2406;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)Z", line = 6)
    public final boolean method1212(int arg0) {
        field2407++;
        if (this.field2408 == null) {
            return false;
        } else {
            if (arg0 <= 71) {
                method1214(79);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V", line = 20)
    public final void method1213(byte arg0) {
        field2412++;
        if (this.field2408 == null) {
            return;
        }
        this.field2408.field2409 = this.field2409;
        this.field2409.field2408 = this.field2408;
        this.field2409 = null;
        if (arg0 != 106) {
            method1214(80);
        }
        this.field2408 = null;
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V", line = 38)
    public static void method1214(int arg0) {
        int var1 = 52 % ((arg0 - 36) / 63);
        field2406 = null;
    }
}
