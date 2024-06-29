import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class class447 extends class476 {

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    private int field6562;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public int field6555;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public int field6558;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public int field6561;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    private int field6566;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "F")
    public float field6560;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "Liu;")
    public static class429 field6565 = new class429(0, 0);

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)I", line = 10)
    public final int method2633(int arg0) {
        if (arg0 == 0) {
            field6563++;
            return this.field6558;
        } else {
            return 31;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ll;ILjava/awt/Canvas;I)Lza;", line = 24)
    public static final class295 method2634(class127 arg0, int arg1, Canvas arg2, int arg3) {
        field6557++;
        return arg3 <= 48 ? null : new class82(arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V", line = 36)
    public static void method2635(boolean arg0) {
        field6565 = null;
        if (!arg0) {
            field6565 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)I", line = 48)
    public final int method2636(byte arg0) {
        if (arg0 < 41) {
            this.field6555 = -86;
        }
        field6556++;
        return this.field6562;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)I", line = 59)
    public final int method2637(int arg0) {
        field6559++;
        if (arg0 < 1) {
            this.method2637(-68);
        }
        return this.field6566;
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)I", line = 70)
    public final int method2638(int arg0) {
        field6564++;
        return arg0 == 21981 ? this.field6555 : -84;
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)F", line = 85)
    public final float method2639(int arg0) {
        if (arg0 == 24755) {
            field6568++;
            return this.field6560;
        } else {
            return -0.08507949F;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIIIF)V", line = 95)
    public class447(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field6562 = arg3;
        this.field6555 = arg2;
        this.field6558 = arg0;
        this.field6561 = arg1;
        this.field6566 = arg4;
        this.field6560 = arg5;
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)I", line = 114)
    public final int method2640(int arg0) {
        int var2 = 103 / ((arg0 + 12) / 59);
        field6567++;
        return this.field6561;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)V")
    public abstract void method572(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BF)V")
    public abstract void method574(byte arg0, float arg1);
}
