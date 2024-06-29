import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class592 extends class400 {

    @OriginalMember(owner = "client!ow", name = "q", descriptor = "I")
    public int field8593 = (int) (class60.method371(false) / 1000L);

    @OriginalMember(owner = "client!ow", name = "u", descriptor = "Ljava/lang/String;")
    public String field8597;

    @OriginalMember(owner = "client!ow", name = "r", descriptor = "S")
    public short field8594;

    @OriginalMember(owner = "client!ow", name = "s", descriptor = "S")
    public static short field8595 = 32767;

    @OriginalMember(owner = "client!ow", name = "v", descriptor = "Ltca;")
    public static class545 field8598 = new class545();

    @OriginalMember(owner = "client!ow", name = "y", descriptor = "Lwu;")
    public static class149 field8601 = new class149(1);

    @OriginalMember(owner = "client!ow", name = "t", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!ow", name = "w", descriptor = "I")
    public static int field8599;

    @OriginalMember(owner = "client!ow", name = "x", descriptor = "Lgu;")
    public static class501 field8600;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "([FII)[F", line = 4)
    public static final float[] method3370(float[] arg0, int arg1, int arg2) {
        field8599++;
        float[] var3 = new float[arg2];
        class667.method3741(arg0, 0, var3, arg1, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)V", line = 26)
    public static void method3371(byte arg0) {
        field8598 = null;
        field8601 = null;
        field8600 = null;
        if (arg0 != -54) {
            method3370(null, -61, 0);
        }
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 46)
    public class592(String arg0, int arg1) {
        this.field8597 = arg0;
        this.field8594 = (short) arg1;
    }
}
