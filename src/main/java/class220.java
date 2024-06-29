import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class220 {

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field3035 = 0;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "Lfi;")
    public static class166 field3041 = new class166();

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "[I")
    public static int[] field3043 = new int[3];

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "[Lcc;")
    public static class338[] field3044 = new class338[2048];

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "B")
    public byte field3045;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public int field3036;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "Lrk;")
    public static class427 field3038;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "Ljava/lang/String;")
    public String field3037;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "Ljava/lang/String;")
    public String field3039;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "Ljava/lang/String;")
    public String field3040;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V", line = 15)
    public static void method1497(int arg0) {
        if (arg0 > -9) {
            method1497(63);
        }
        field3041 = null;
        field3044 = null;
        field3038 = null;
        field3043 = null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V", line = 33)
    public static final void method1498(int arg0, int arg1) {
        field3042++;
        class315.field4283 = arg1;
        if (arg0 != 2048) {
            field3044 = null;
        }
        class156.field2361.method2533(0);
    }
}
