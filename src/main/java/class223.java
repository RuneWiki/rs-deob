import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class223 extends class304 {

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "Lcd;")
    public static class64 field3798 = class44.method335((byte) 71, " GMT");

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "I")
    public static int field3804 = 0;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
    public static int field3803 = 0;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "[I")
    public static int[] field3806 = new int[500];

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "Z")
    public static boolean field3807 = false;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
    public static int field3809 = -1;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "[S")
    public static short[] field3799 = new short[256];

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "Z")
    public static boolean field3808 = false;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "Lcd;")
    private static class64 field3810 = class44.method335((byte) 71, "wave:");

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "Lcd;")
    public static class64 field3805 = field3810;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "Lcd;")
    public static class64 field3802 = field3810;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "[I")
    public static int[] field3811;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)[F", line = 9)
    public static final float[] method1611(int arg0) {
        field3800++;
        float var1 = class52.method389() + class52.method391();
        int var2 = class52.method384();
        float var3 = (float) (var2 & 0xFF) / 255.0F;
        float var4 = (float) ((var2 & 0xFF8E88) >> 16) / 255.0F;
        class11.field218[3] = 1.0F;
        float var5 = (float) (var2 >> 8 & 0xFF) / 255.0F;
        float var6 = 0.58823526F;
        class11.field218[0] = class104.field1918[arg0] * var4 * var6 * var1;
        class11.field218[1] = class104.field1918[1] * var5 * var6 * var1;
        class11.field218[2] = class104.field1918[2] * var3 * var6 * var1;
        return class11.field218;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V", line = 57)
    public static final void method1612(byte arg0) {
        class280.field4824.method1187(0);
        if (arg0 >= 30) {
            field3801++;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V", line = 94)
    public static void method1613(int arg0) {
        field3802 = null;
        field3811 = null;
        field3805 = null;
        field3810 = null;
        field3798 = null;
        field3799 = null;
        field3806 = null;
        if (arg0 != -1) {
            method1611(-98);
        }
    }
}
