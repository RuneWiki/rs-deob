import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class139 {

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field2037 = 2;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "S")
    public static short field2035 = 256;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field2038 = 0;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 20)
    public static final void method1023(byte arg0) {
        field2036++;
        class418.field5783 = 0;
        class453.field6503 = 0;
        class120.method935((byte) -62);
        class120.method933((byte) -56);
        if (arg0 != 107) {
            return;
        }
        class282.method1770(arg0 + 11);
        for (int var1 = 0; var1 < class453.field6503; var1++) {
            int var3 = class405.field5609[var1];
            if (class246.field3467 != class428.field5951[var3].field2575) {
                if (class428.field5951[var3].field5807.method1517((byte) 28)) {
                    class294.method1790(class428.field5951[var3], (byte) -43);
                }
                class428.field5951[var3].method2586((class233) null, -8);
                class428.field5951[var3] = null;
            }
        }
        if (class213.field2982 != class75.field1068.field5048) {
            throw new RuntimeException("gnp1 pos:" + class75.field1068.field5048 + " psize:" + class213.field2982);
        }
        for (int var2 = 0; var2 < class53.field674; var2++) {
            if (class428.field5951[class228.field3187[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class53.field674);
            }
        }
    }
}
