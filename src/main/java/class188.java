import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class188 {

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Lvh;")
    public static class62 field2830 = new class62(5);

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2838 = "Hidden";

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "Lmk;")
    public static class321 field2839 = new class321();

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "F")
    public static float field2837;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "J")
    public long field2834;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lba;")
    public class188 field2833;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Lba;")
    public class188 field2835;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 6)
    public final void method1290(int arg0) {
        field2836++;
        int var2 = 13 % ((arg0 - 49) / 44);
        if (this.field2833 != null) {
            this.field2833.field2835 = this.field2835;
            this.field2835.field2833 = this.field2833;
            this.field2835 = null;
            this.field2833 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZZZBI)Lnk;", line = 25)
    public static final class16 method1291(boolean arg0, boolean arg1, boolean arg2, byte arg3, int arg4) {
        field2832++;
        class205 var5 = null;
        if (class274.field4336 != null) {
            var5 = new class205(arg4, class274.field4336, class23.field276[arg4], 1000000);
        }
        if (arg3 >= -101) {
            field2837 = -1.1780275F;
        }
        class147.field2337[arg4] = class179.field2685.method1123(class263.field4168, (byte) -113, arg4, var5);
        if (arg2) {
            class147.field2337[arg4].method1469(-2);
        }
        return new class16(class147.field2337[arg4], arg0, arg1);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V", line = 49)
    public static void method1292(int arg0) {
        field2830 = null;
        field2838 = null;
        field2839 = null;
        if (arg0 != -17080) {
            method1291(true, false, true, (byte) 88, 86);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)Z", line = 61)
    public final boolean method1293(byte arg0) {
        if (arg0 != 26) {
            field2839 = (class321) null;
        }
        field2831++;
        return this.field2833 != null;
    }
}
