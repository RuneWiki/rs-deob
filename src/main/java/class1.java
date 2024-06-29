import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 {

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Lai;")
    public static class10 field3 = class44.method278("<col=00ff00>", -42);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Lai;")
    private static class10 field1 = class44.method278("Error loading your profile)3", -93);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Lai;")
    public static class10 field4 = field1;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lta;")
    public static class173 field6;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([BIZI)I")
    public static final int method1(byte[] arg0, int arg1, boolean arg2, int arg3) {
        field5++;
        int var4 = -1;
        for (int var5 = arg1; var5 < arg3; var5++) {
            var4 = class146.field2797[(arg0[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return arg2 ? ~var4 : 19;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method2(int arg0) {
        if (arg0 != -1) {
            field3 = null;
        }
        field3 = null;
        field4 = null;
        field6 = null;
        field1 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)Llb;")
    public static final class102 method3(byte arg0) {
        field2++;
        if (arg0 >= -56) {
            field4 = null;
        }
        try {
            return (class102) Class.forName("uf").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
