import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public abstract class class461 implements class682 {

    @OriginalMember(owner = "client!lda", name = "h", descriptor = "Lpe;")
    public class615 field6049;

    @OriginalMember(owner = "client!lda", name = "l", descriptor = "Lpe;")
    private class615 field6053;

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "Lqga;")
    public class41 field6043;

    @OriginalMember(owner = "client!lda", name = "m", descriptor = "[I")
    public static int[] field6054 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!lda", name = "i", descriptor = "Lra;")
    public static class361 field6050 = new class361(94, 12);

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!lda", name = "j", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!lda", name = "k", descriptor = "I")
    private int field6052;

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "J")
    private long field6045;

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "Lta;")
    private class597 field6046;

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(B)I")
    public final int method2586(byte arg0) {
        field6042++;
        int var2 = class412.field5313.method753((byte) -56);
        int var3 = var2 * 100;
        if (this.field6052 == var2 && var2 != 0) {
            int var4 = class412.field5313.method751((byte) -76);
            if (var4 > var2) {
                long var5 = this.field6045 - class412.field5313.method762((byte) -80);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class584.method3191(1) - this.field6045) * 10000L;
                    if (var9 < var7) {
                        var3 = (int) (var9 * 100L * (long) (var4 - var2) / var7 + (long) (var2 * 100));
                    } else {
                        var3 = var4 * 100;
                    }
                }
            }
        } else {
            this.field6052 = var2;
            this.field6045 = class584.method3191(1);
        }
        if (arg0 != 93) {
            this.method552(true, 6, 110, 31);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V")
    public void method449(int arg0) {
        int var2 = -118 / ((arg0 - 65) / 45);
        field6044++;
        class547 var3 = class155.method1116(this.field6053, true, this.field6043.field587);
        this.field6046 = class520.field6799.method405(var3, class506.method2737(this.field6049, this.field6043.field587), true);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZIII)V")
    public abstract void method552(boolean arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IZ)V")
    public final void method448(int arg0, boolean arg1) {
        field6048++;
        int var3 = this.field6043.field579.method3005(class94.field1240, (byte) -127, this.field6043.field584) + this.field6043.field581;
        int var4 = this.field6043.field574.method3059(this.field6043.field585, class535.field6968, -109) + this.field6043.field582;
        this.method553(var4, arg1, var3, (byte) -91);
        if (arg0 != -207) {
            return;
        }
        this.method552(arg1, var4, arg0 + 82, var3);
        String var5 = class412.field5313.method750(arg0 + 165);
        if (class584.method3191(1) - this.field6045 > 10000L) {
            var5 = var5 + " (" + class412.field5313.method761(arg0 + 322).method2595(19) + ")";
        }
        this.field6046.method3249((byte) -128, this.field6043.field586, this.field6043.field585 / 2 + var4 + this.field6043.field575 + 4, var5, var3 + (this.field6043.field584 / 2), -1);
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)V")
    public static void method2587(int arg0) {
        field6054 = null;
        if (arg0 != 0) {
            field6054 = null;
        }
        field6050 = null;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IZIB)V")
    public abstract void method553(int arg0, boolean arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)Z")
    public boolean method444(byte arg0) {
        if (arg0 >= -10) {
            return false;
        }
        field6051++;
        boolean var2 = true;
        if (!this.field6049.method3362(this.field6043.field587, -97)) {
            var2 = false;
        }
        if (!this.field6053.method3362(this.field6043.field587, -114)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lpe;Lpe;Lqga;)V")
    public class461(class615 arg0, class615 arg1, class41 arg2) {
        this.field6049 = arg0;
        this.field6053 = arg1;
        this.field6043 = arg2;
    }
}
