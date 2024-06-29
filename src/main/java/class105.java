import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class105 {

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "[I")
    public static int[] field1544 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "S")
    public static short field1545 = 1;

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V", line = 4)
    public static void method856(int arg0) {
        int var1 = -121 % ((-arg0 - 18) / 63);
        field1544 = null;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Z)Lec;", line = 21)
    public static final class99 method857(boolean arg0) {
        field1546++;
        if (!arg0) {
            return null;
        }
        try {
            return (class99) Class.forName("lg").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class557();
        }
    }
}
