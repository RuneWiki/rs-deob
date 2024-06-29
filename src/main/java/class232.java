import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class232 {

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    public int field3156;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public int field3154;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
    public int field3155;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "Z")
    public boolean field3157;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "S")
    public short field3159;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "S")
    public short field3163;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "B")
    public byte field3160;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "S")
    public short field3165;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
    public int field3162;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public int field3158;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "[F")
    public static float[] field3161 = new float[16384];

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "[F")
    public static float[] field3153 = new float[16384];

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "Ljw;")
    public static class581 field3164;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
    public static void method1519(byte arg0) {
        field3164 = null;
        int var1 = -4 / ((arg0 - 48) / 48);
        field3161 = null;
        field3153 = null;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field3156 = arg3;
        this.field3154 = arg0;
        this.field3155 = arg2;
        this.field3157 = arg10;
        this.field3159 = (short) arg6;
        this.field3163 = (short) arg4;
        this.field3160 = (byte) arg8;
        this.field3165 = (short) arg5;
        this.field3162 = arg1;
        this.field3158 = arg11;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field3161[var2] = (float) Math.sin((double) var2 * var0);
            field3153[var2] = (float) Math.cos((double) var2 * var0);
        }
        field3164 = new class581(22, 6);
        field3167 = -1;
    }
}
