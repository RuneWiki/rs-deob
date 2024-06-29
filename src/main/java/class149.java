import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class149 extends class644 {

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "Lkq;")
    public static class345 field2065 = new class345();

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "[I")
    public static int[] field2067 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "Laea;")
    public static class261 field2066;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "[B")
    private byte[] field2062;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIB)[B")
    public final byte[] method951(int arg0, int arg1, int arg2, byte arg3) {
        this.field2062 = new byte[arg0 * arg1 * arg2 * 2];
        int var5 = -79 % ((-arg3 - 34) / 55);
        field2063++;
        this.method3139(arg2, arg1, -17059, arg0);
        return this.field2062;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BBI)V")
    public final void method952(byte arg0, byte arg1, int arg2) {
        field2061++;
        int var4 = arg2 * 2;
        int var5 = arg1 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field2062[var10001] = (byte) (var5 * 3 >> 5);
        this.field2062[var6] = (byte) (var5 * 3 >> 5);
        if (arg0 < 76) {
            this.method951(-17, 0, 94, (byte) -46);
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
    public class149() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V")
    public static final void method953(int arg0) {
        field2064++;
        class38.field466++;
        if (arg0 <= 66) {
            field2065 = null;
        }
        class583 var1 = class54.method400(class213.field2800, (byte) 101, class745.field10243);
        var1.field7963.method492(-2, class728.field10110);
        class463.method2838(var1, (byte) 126);
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(B)V")
    public static void method954(byte arg0) {
        field2067 = null;
        field2066 = null;
        if (arg0 <= 0) {
            field2065 = null;
        }
        field2065 = null;
    }
}
