import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class176 {

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "Lka;")
    public static class157 field3268 = new class157(16);

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Lsg;")
    public static class30 field3271 = class167.method1221((byte) 33, "cookiehost");

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "Lsg;")
    public static class30 field3272 = class167.method1221((byte) 33, "www");

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Lsg;")
    public static class30 field3275 = class167.method1221((byte) 33, "hitmarks");

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Lsg;")
    public static class30 field3274 = class167.method1221((byte) 33, "::rebuild");

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "[S")
    public static short[] field3270;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([IJII)Lsg;")
    public static final class30 method1290(int[] arg0, long arg1, int arg2, int arg3) {
        field3269++;
        if (class173.field3226 != null) {
            class30 var5 = class173.field3226.method1050(12, arg1, arg0, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg3 == 5) {
            return class197.method1422(arg1, -122).method256(90);
        } else {
            if (arg2 > -83) {
                method1291(-123, 126, -30);
            }
            return class131.method997((byte) 121, arg1);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)J")
    public static final long method1291(int arg0, int arg1, int arg2) {
        class195 var3 = class71.field1613[arg0][arg1][arg2];
        return var3 == null || var3.field3532 == null ? 0L : var3.field3532.field4039;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static void method1292(int arg0) {
        field3275 = null;
        field3274 = null;
        field3272 = null;
        if (arg0 != -4205) {
            field3274 = null;
        }
        field3268 = null;
        field3270 = null;
        field3271 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BLnc;)V")
    public static final void method1293(byte arg0, class119 arg1) {
        class146.field2807 = arg1;
        if (arg0 < 126) {
            method1291(-50, 57, -64);
        }
        field3267++;
    }
}
