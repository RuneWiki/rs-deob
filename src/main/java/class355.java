import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class355 implements class656 {

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public int field5202;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public int field5206;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "[F")
    public float[] field5208;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "Z")
    public static boolean field5207 = false;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "[I")
    public static int[] field5209 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "F")
    public static float field5203;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "Laj;")
    public static class333 field5205;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method2239(int arg0, int arg1) {
        if (arg1 != -31175) {
            method2239(-51, 94);
        }
        field5204++;
        return arg0 == 4 || arg0 == 8 || arg0 == 11;
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(II)V", line = 28)
    public class355(int arg0, int arg1) {
        this.field5202 = arg0;
        this.field5206 = arg1;
        this.field5208 = new float[arg0 * arg1];
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V", line = 38)
    public static void method2240(byte arg0) {
        field5205 = null;
        field5209 = null;
        if (arg0 < 84) {
            field5203 = 1.7858179F;
        }
    }
}
