import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class46 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Ldj;")
    public static class44 field864 = class89.method650(255, "<col=ffff00>*V");

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field868 = 0;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "Ldj;")
    private static class44 field872 = class89.method650(255, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static volatile int field871 = 0;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Ldj;")
    public static class44 field865 = field872;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "Ldj;")
    private static class44 field874 = class89.method650(255, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Ldj;")
    public static class44 field867 = field874;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Lpg;")
    public static class168 field869;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static void method346(int arg0) {
        field872 = null;
        if (arg0 != 0) {
            field869 = null;
        }
        field864 = null;
        field874 = null;
        field865 = null;
        field867 = null;
        field869 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLve;)V")
    public static final void method347(byte arg0, class225 arg1) {
        field870++;
        class122.field2165 = arg1;
        class93.field1728 = class122.field2165.method1473(20756, 16);
        if (arg0 >= -78) {
            method349(85, -41);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    public static final void method348(int arg0) {
        if (arg0 != 930751783) {
            field864 = null;
        }
        class70.field1332.method1179((byte) -120);
        field873++;
        class52.field930.method1179((byte) -92);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
    public static final int method349(int arg0, int arg1) {
        if (arg1 != 930751783) {
            method346(-18);
        }
        field866++;
        return arg0 >>> 7;
    }
}
