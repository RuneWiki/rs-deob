import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class87 {

    @OriginalMember(owner = "client!eda", name = "f", descriptor = "I")
    public int field1632 = 0;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
    public static int field1627 = -1;

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "[I")
    public static int[] field1630 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!eda", name = "e", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)V")
    public static final void method862(int arg0) {
        field1631++;
        if (arg0 != 18848 || class147.field2546) {
            return;
        }
        class147.field2546 = true;
        if (class527.field7429.field2675) {
            class591.field8509 = ((int) class591.field8509 - 65 & 0xFFFFFF80);
        } else {
            class565.field8253 += (-class565.field8253 - 24.0F) / 2.0F;
        }
        class292.field4392 = true;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V")
    public static void method863(byte arg0) {
        field1630 = null;
        if (arg0 != 112) {
            method863((byte) -122);
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZLqh;)V")
    public final void method864(boolean arg0, class61 arg1) {
        field1628++;
        if (arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method732(-559537960);
            if (var3 == 0) {
                return;
            }
            this.method865(-12984, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IILqh;)V")
    private final void method865(int arg0, int arg1, class61 arg2) {
        if (arg1 == 5) {
            this.field1632 = arg2.method723((byte) -25);
        }
        field1629++;
        if (arg0 != -12984) {
            field1627 = 31;
        }
    }
}
