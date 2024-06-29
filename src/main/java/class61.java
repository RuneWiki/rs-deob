import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class61 extends class240 {

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "Ljava/lang/String;")
    public String field950;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "[I")
    public static int[] field949 = new int[32];

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field951 = 0;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public static int field954 = 0;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "Ltd;")
    public static class241 field952;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "Lkc;")
    public static class36 field955;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field949[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V", line = 13)
    public class61() {
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIZIFIIII)[[I", line = 19)
    public static final int[][] method444(int arg0, int arg1, boolean arg2, int arg3, float arg4, int arg5, int arg6, int arg7, int arg8) {
        field953++;
        int[][] var9 = new int[arg6][arg3];
        class91 var10 = new class91();
        var10.field1493 = arg8;
        var10.field1491 = (int) ((float) arg1 * arg4);
        var10.field1494 = arg7;
        var10.field1503 = arg2;
        var10.field1497 = arg0;
        var10.method70(41);
        class121.method923(false, arg3, arg6);
        for (int var11 = 0; var11 < arg6; var11++) {
            var10.method656(var11, (byte) -127, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIZIIII)V", line = 52)
    public static final void method445(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field948++;
        class122.field1947 = arg0;
        class190.field3033 = arg1;
        if (arg5 != -64) {
            return;
        }
        class168.field2614 = arg4;
        class311.field4890 = arg3;
        class24.field406 = arg6;
        if (arg2 && class190.field3033 >= 100) {
            class140.field2223 = class168.field2614 * 128 + 64;
            class312.field4904 = class122.field1947 * 128 + 64;
            class48.field801 = class48.method374(class312.field4904, class140.field2223, 86, class41.field734) - class24.field406;
        }
        class62.field960 = 2;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 77)
    public static void method446(byte arg0) {
        field952 = null;
        field955 = null;
        if (arg0 <= 65) {
            field952 = (class241) null;
        }
        field949 = null;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 88)
    public class61(String arg0) {
        this.field950 = arg0;
    }
}
