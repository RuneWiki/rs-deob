import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class289 {

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "Z")
    public boolean field4444 = false;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Lkl;")
    public static class68 field4445 = null;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field4448 = 0;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "[I")
    public static int[] field4440 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public int field4441;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public int field4442;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public int field4447;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "J")
    public long field4446;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "Lsc;")
    public class19 field4443;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 9)
    public static void method1948(int arg0) {
        if (arg0 >= -93) {
            field4438 = -53;
        }
        field4445 = null;
        field4440 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V", line = 21)
    public static final void method1949(byte arg0) {
        class248.field3865 = 0;
        field4439++;
        class150.field2457 = 0;
        class38.method298(arg0 ^ 0x2D);
        class128.method847(4);
        if (arg0 != 42) {
            field4448 = 42;
        }
        class278.method1873(32);
        class344.method2383((byte) -68);
        for (int var1 = 0; var1 < class150.field2457; var1++) {
            int var2 = class109.field1870[var1];
            if (class25.field494 != class97.field1715[var2].field1855) {
                if (class97.field1715[var2].field4273 > 0) {
                    class93.method626(50, class97.field1715[var2]);
                }
                class97.field1715[var2] = null;
            }
        }
        if (class250.field3926 != class190.field3082.field3249) {
            throw new RuntimeException("gpp1 pos:" + class190.field3082.field3249 + " psize:" + class250.field3926);
        }
        for (int var3 = 0; var3 < class305.field4623; var3++) {
            if (class97.field1715[class283.field4384[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class305.field4623);
            }
        }
    }
}
