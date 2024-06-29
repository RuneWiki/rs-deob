import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class264 extends class270 {

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "[I")
    public static int[] field4158 = new int[4096];

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4164;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "[I")
    public static int[] field4167;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "Ldh;")
    public static class179 field4165;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "[I")
    public static int[] field4159;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "[[[B")
    public static byte[][][] field4163;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4158[var0] = class343.method2371((byte) -51, var0);
        }
        field4164 = "Loading sprites - ";
        field4167 = new int[4096];
        field4165 = new class179(5);
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V", line = 24)
    public static void method1904(int arg0) {
        field4163 = (byte[][][]) null;
        field4159 = null;
        field4164 = null;
        field4158 = null;
        field4165 = null;
        field4167 = null;
        int var1 = -125 / ((arg0 - 65) / 37);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)[F", line = 39)
    public static final float[] method1905(byte arg0) {
        field4161++;
        float var1 = class64.method401() + class64.method400();
        int var2 = class64.method404();
        float var3 = (float) ((var2 & 0xFFAC) >> 8) / 255.0F;
        float var4 = (float) (var2 & 0xFF) / 255.0F;
        class218.field3064[3] = 1.0F;
        float var5 = 0.58823526F;
        class218.field3064[1] = class280.field4351[1] * var3 * var5 * var1;
        class218.field3064[2] = class280.field4351[2] * var4 * var5 * var1;
        float var6 = (float) ((var2 & 0xFF7554) >> 16) / 255.0F;
        if (arg0 != 2) {
            field4165 = (class179) null;
        }
        class218.field3064[0] = class280.field4351[0] * var6 * var5 * var1;
        return class218.field3064;
    }
}
