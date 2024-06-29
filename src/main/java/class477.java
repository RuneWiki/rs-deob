import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class477 implements class590 {

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "Lsm;")
    private class96 field6827;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "Lmv;")
    private class295 field6835;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "Lmv;")
    private class295 field6828;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
    public static int field6836 = 0;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "F")
    public static float field6832;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "Lla;")
    private class393 field6830;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method2739(int arg0, int arg1, int arg2) {
        field6837++;
        if (arg0 == 0) {
            return class338.method2092(125, arg2, arg1) | (arg1 & 0x60000) != 0 || class264.method1587((byte) 95, arg2, arg1) || class329.method2035(true, arg2, arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)[Lcq;", line = 16)
    public static final class273[] method2740(byte arg0) {
        field6833++;
        int var1 = -17 / ((arg0 + 39) / 63);
        return new class273[] { class104.field1553, class206.field2812, class199.field2710, class160.field2276, class606.field8762, class684.field9652, class64.field1004, class618.field8956, class30.field513, class50.field783, class392.field5924, class546.field8058, class665.field9440, class142.field2058 };
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V", line = 26)
    public final void method940(int arg0) {
        field6831++;
        if (arg0 != -32557) {
            field6834 = 37;
        }
        class606 var2 = class40.method230(this.field6835, this.field6827.field1463, arg0 + 32675);
        this.field6830 = class332.field4821.method684(var2, class616.method3518(this.field6828, this.field6827.field1463), true);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)Z", line = 39)
    public final boolean method941(byte arg0) {
        field6826++;
        boolean var2 = true;
        if (!this.field6828.method1818(this.field6827.field1463, 4)) {
            var2 = false;
        }
        if (!this.field6835.method1818(this.field6827.field1463, 4)) {
            var2 = false;
        }
        return arg0 >= -15 ? true : var2;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lmv;Lmv;Lsm;)V", line = 68)
    public class477(class295 arg0, class295 arg1, class96 arg2) {
        this.field6827 = arg2;
        this.field6835 = arg1;
        this.field6828 = arg0;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IZ)V", line = 84)
    public final void method944(int arg0, boolean arg1) {
        if (arg0 != -31764) {
            field6832 = -1.3400967F;
        }
        field6829++;
        if (arg1) {
            int var3 = this.field6827.field1468.method3193(arg0 + 968, class677.field9591, this.field6827.field1464) + this.field6827.field1466;
            int var4 = this.field6827.field1467.method1916((byte) 126, class619.field8966, this.field6827.field1473) + this.field6827.field1469;
            this.field6830.method2435(null, null, this.field6827.field1475, 0, this.field6827.field1464, var3, this.field6827.field1473, this.field6827.field1465, var4, this.field6827.field1474, 0, this.field6827.field1472, this.field6827.field1462, null, this.field6827.field1477, 0);
        }
    }
}
