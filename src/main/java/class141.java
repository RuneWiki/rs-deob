import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class141 {

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public int field1688;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public int field1694;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public int field1691;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public int field1695;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "J")
    public static long field1689 = -1L;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lpw;")
    public static class661 field1693 = new class661("", 11);

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field1697 = 0;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "F")
    public static float field1698;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!vf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1692++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method887(int arg0) {
        if (arg0 != -1) {
            method887(-57);
        }
        field1693 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIZ)V")
    public static final void method888(int arg0, int arg1, boolean arg2) {
        field1696++;
        if (arg2) {
            method889(27);
        }
        class243 var3 = class546.method2926(arg1, 14, true);
        var3.method1457(84);
        var3.field3132 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIII)V")
    public class141(int arg0, int arg1, int arg2, int arg3) {
        this.field1688 = arg0;
        this.field1694 = arg3;
        this.field1691 = arg2;
        this.field1695 = arg1;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)I")
    public static final int method889(int arg0) {
        field1690++;
        class650 var1 = class309.field3898;
        boolean var2 = false;
        if (class628.field8526 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class650.method3629(null, 14200, null, 0, var3, 0);
        }
        long var4 = class321.method1854(-99);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method457(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = 120 / ((arg0 - 22) / 61);
        int var8 = (int) (class321.method1854(-90) - var4);
        var1.method3630((byte) 34, 100, 0, 0, -16777216, 100);
        if (var2) {
            var1.method3623((byte) -25);
        }
        return var8;
    }
}
