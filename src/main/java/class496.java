import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class class496 {

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "[[Lrga;")
    public static class215[][] field7034;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)I", line = 7)
    public static final int method2868(int arg0, byte arg1) {
        if (arg1 >= -1) {
            return -65;
        }
        field7036++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 24)
    public static final void method2869(int arg0) {
        if (arg0 <= 108) {
            field7034 = null;
        }
        field7035++;
        int var1 = 0;
        if (class287.field4270.method1624(10814, class328.field4859)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class287.field4270.field3724) {
            var1 |= 0x40;
        }
        class88.method765(var1, (byte) 82);
        class101.field1572.method2624(var1, -123);
        class41.field682.method2223(0, var1);
        class393.field5824.method367(50, var1);
        class86.field1411.method1477(var1, -26031);
        class479.method2805(var1, false);
        class305.method1946(-26080, var1);
        class299.method1927(var1, 4);
        class109.method859(-1, var1);
        class705.method3923(4);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V", line = 63)
    public static void method2870(byte arg0) {
        field7034 = null;
        if (arg0 <= 2) {
            method2870((byte) 30);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)[B")
    public abstract byte[] method827(int arg0, int arg1);

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IB)I")
    public abstract int method815(int arg0, byte arg1);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)V")
    public abstract void method824(byte arg0, int arg1);

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)Lar;")
    public abstract class634 method825(byte arg0);
}
