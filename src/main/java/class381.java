import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class381 extends class739 {

    @OriginalMember(owner = "client!ln", name = "I", descriptor = "I")
    private int field4853;

    @OriginalMember(owner = "client!ln", name = "G", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!ln", name = "H", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!ln", name = "J", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!ln", name = "F", descriptor = "[Lrba;")
    public static class435[] field4850;

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
    public class381() {
        this(4096);
    }

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "(I)V")
    public static void method2171(int arg0) {
        field4850 = null;
        if (arg0 != -9666) {
            method2172((byte) -47, 1.6381223F, 0.4587238F, -0.51473933F);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)[I")
    public final int[] method215(int arg0, int arg1) {
        ++field4852;
        if (arg0 != -23347) {
            method2171(37);
        }
        int[] var3 = super.field10311.method2116(arg1, (byte) 45);
        if (super.field10311.field4728) {
            class135.method997(var3, 0, class29.field523, this.field4853);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        ++field4851;
        if (arg2 != -3) {
            field4850 = null;
        }
        if (arg1 == 0) {
            this.field4853 = (arg0.method2600((byte) -126) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(I)V")
    public class381(int arg0) {
        super(0, true);
        this.field4853 = 4096;
        this.field4853 = arg0;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BFFF)I")
    public static final int method2172(byte arg0, float arg1, float arg2, float arg3) {
        ++field4854;
        float var4 = !(arg3 < 0.0F) ? arg3 : -arg3;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (arg0 <= 84) {
            method2172((byte) -99, 0.10214496F, -1.3618326F, 0.038301587F);
        }
        float var6 = !(arg1 < 0.0F) ? arg1 : -arg1;
        if (var4 < var5 && var5 > var6) {
            return !(arg2 > 0.0F) ? 1 : 0;
        } else if (var6 > var4 && var6 > var5) {
            return arg1 > 0.0F ? 2 : 3;
        } else {
            return arg3 > 0.0F ? 4 : 5;
        }
    }
}
