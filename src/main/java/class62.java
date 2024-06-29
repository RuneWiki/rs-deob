import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class62 {

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Lck;")
    public static class105 field993 = new class105();

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "[Loh;")
    public static class281[] field997 = new class281[14];

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Ljava/lang/String;")
    public static String field995 = "Loading defaults - ";

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Ll;")
    public static class133 field996;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "Ll;")
    public static class133 field999;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 18)
    public static final void method481(int arg0) {
        int var1 = -57 / ((-arg0 - 15) / 62);
        field998++;
        if (class341.field5322) {
            class335.field5251 = null;
            class186.field2785 = null;
            class341.field5322 = false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V", line = 32)
    public static void method482(int arg0) {
        field999 = null;
        if (arg0 == -5689) {
            field996 = null;
            field993 = null;
            field997 = null;
            field995 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)[F", line = 53)
    public static final float[] method483(int arg0) {
        field992++;
        float var1 = class250.method1728() + class250.method1731();
        int var2 = class250.method1729();
        float var3 = (float) (var2 >> 16 & 0xFF) / 255.0F;
        float var4 = 0.58823526F;
        if (arg0 != 8713) {
            return (float[]) null;
        }
        class5.field55[0] = class229.field3645[0] * var3 * var4 * var1;
        float var5 = (float) ((var2 & 0xFFA2) >> 8) / 255.0F;
        float var6 = (float) (var2 & 0xFF) / 255.0F;
        class5.field55[1] = class229.field3645[1] * var5 * var4 * var1;
        class5.field55[3] = 1.0F;
        class5.field55[2] = class229.field3645[2] * var6 * var4 * var1;
        return class5.field55;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IBI)I", line = 93)
    public static final int method484(int arg0, byte arg1, int arg2) {
        field991++;
        int var3 = 1;
        if (arg1 != -64) {
            field996 = (class133) null;
        }
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg2 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg2 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }
}
