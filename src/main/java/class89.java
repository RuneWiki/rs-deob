import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class89 {

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "[J")
    public static long[] field1254 = new long[200];

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field1253 = 0;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field1252 = 0;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "F")
    public static float field1257 = 0.0F;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "[S")
    public static short[] field1259 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "F")
    public static float field1256;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "Lkm;")
    public static class133 field1258;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)J", line = 16)
    public static final long method684(int arg0, int arg1, int arg2) {
        class202 var3 = class142.field1940[arg0][arg1][arg2];
        return var3 == null || var3.field2879 == null ? 0L : var3.field2879.field3992;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V", line = 34)
    public static void method685(byte arg0) {
        if (arg0 == -115) {
            field1259 = null;
            field1258 = null;
            field1254 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)[F", line = 56)
    public static final float[] method686(int arg0, byte arg1) {
        float var2 = class139.method1010() + class139.method1006();
        int var3 = class139.method1011();
        field1260++;
        float var4 = (float) ((var3 & 0xFF14) >> 8) / 255.0F;
        class292.field4357[3] = 1.0F;
        float var5 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        float var6 = 0.58823526F;
        class292.field4357[1] = var4 * ((float) class47.method303(arg0 >> 8, 255) / 255.0F) * var6 * var2;
        class292.field4357[0] = var2 * var6 * (float) class47.method303(arg0 >> 16, 255) / 255.0F * var5;
        if (arg1 > -116) {
            return (float[]) null;
        } else {
            float var7 = (float) (var3 & 0xFF) / 255.0F;
            class292.field4357[2] = var6 * var7 * ((float) class47.method303(arg0, 255) / 255.0F) * var2;
            return class292.field4357;
        }
    }
}
