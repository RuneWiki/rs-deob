import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class208 extends class347 {

    @OriginalMember(owner = "client!jda", name = "t", descriptor = "I")
    public int field3182 = (int) (class525.method3074((byte) -101) / 1000L);

    @OriginalMember(owner = "client!jda", name = "s", descriptor = "Ljava/lang/String;")
    public String field3181;

    @OriginalMember(owner = "client!jda", name = "r", descriptor = "S")
    public short field3180;

    @OriginalMember(owner = "client!jda", name = "q", descriptor = "Lsl;")
    public static class427 field3179 = new class427(64);

    @OriginalMember(owner = "client!jda", name = "o", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!jda", name = "p", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!jda", name = "u", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(FIIIIIZB)[I")
    public static final int[] method1458(float arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, byte arg7) {
        field3177++;
        int[] var8 = new int[arg2];
        class255 var9 = new class255();
        var9.field3784 = arg6;
        var9.field3788 = arg1;
        var9.field3779 = (int) (arg0 * 4096.0F);
        var9.field3772 = arg5;
        var9.field3783 = arg4;
        var9.field3786 = arg3;
        var9.method617(4095);
        if (arg7 <= 74) {
            return null;
        } else {
            class453.method2728(1, arg2, (byte) 109);
            var9.method1695(0, var8, false);
            return var8;
        }
    }

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "(I)V")
    public static void method1459(int arg0) {
        if (arg0 != 64) {
            method1458(0.508327F, 54, 58, 95, -23, 99, true, (byte) -10);
        }
        field3179 = null;
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class208(String arg0, int arg1) {
        this.field3181 = arg0;
        this.field3180 = (short) arg1;
    }
}
