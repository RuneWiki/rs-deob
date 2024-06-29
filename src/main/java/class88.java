import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class88 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static final void method773(byte arg0) {
        if (arg0 > -78) {
            method774((byte) 86, 65L);
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class599.field8550[var1] = null;
        }
        field1302++;
        class265.field3732 = 0;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BJ)I")
    public static final int method774(byte arg0, long arg1) {
        int var3 = 41 / ((arg0 + 84) / 34);
        field1301++;
        return (int) (arg1 / 86400000L) - 11745;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
    public static final void method775(int arg0, int arg1) {
        class589.field8465.method2888(arg0, 118);
        field1300++;
        class87.field1292.method2888(arg0, 123);
        if (arg1 != 32127) {
            method774((byte) 61, 31L);
        }
        class367.field5187.method2888(arg0, 122);
        class554.field7684.method2888(arg0, 119);
    }
}
