import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class6 {

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "[Lw;")
    private class36[] field50;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field46 = 0;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "Ljava/lang/String;")
    public static String field49 = "Close";

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field51 = 0;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "[I")
    public static int[] field52 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Z")
    public static boolean field48 = true;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "[Lpn;")
    public static class170[] field53;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V", line = 8)
    public static void method31(byte arg0) {
        if (arg0 > -20) {
            field51 = 97;
        }
        field49 = null;
        field53 = null;
        field52 = null;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V", line = 20)
    public static final void method32(byte arg0) {
        if (arg0 != 16) {
            field46 = -35;
        }
        class145.field2001.method724(0);
        field47++;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lfj;III)V", line = 44)
    public static final void method33(class241 arg0, int arg1, int arg2, int arg3) {
        field54++;
        if (arg1 != -3478) {
            return;
        }
        if (arg0.field3668 == arg3 && arg3 != -1) {
            class125 var4 = class52.method361(true, arg3);
            int var5 = var4.field1681;
            if (var5 == 1) {
                arg0.field3762 = arg2;
                arg0.field3724 = 1;
                arg0.field3688 = 0;
                arg0.field3684 = 0;
                arg0.field3760 = 0;
                class241.method1651(arg0.field3684, class173.field2356 == arg0, arg0.field3745, var4, arg0.field3679, -62);
            }
            if (var5 == 2) {
                arg0.field3760 = 0;
            }
        } else if (arg3 == -1 || arg0.field3668 == -1 || class52.method361(true, arg3).field1684 >= class52.method361(true, arg0.field3668).field1684) {
            arg0.field3688 = 0;
            arg0.field3760 = 0;
            arg0.field3684 = 0;
            arg0.field3724 = 1;
            arg0.field3727 = arg0.field3743;
            arg0.field3668 = arg3;
            arg0.field3762 = arg2;
            if (arg0.field3668 != -1) {
                class241.method1651(arg0.field3684, class173.field2356 == arg0, arg0.field3745, class52.method361(true, arg0.field3668), arg0.field3679, 105);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)[F", line = 109)
    public static final float[] method34(int arg0) {
        field45++;
        if (arg0 != -18072) {
            return (float[]) null;
        }
        float var1 = class139.method1010() + class139.method1006();
        int var2 = class139.method1011();
        float var3 = (float) (var2 & 0xFF) / 255.0F;
        float var4 = (float) ((var2 & 0xFFE4) >> 8) / 255.0F;
        class292.field4357[3] = 1.0F;
        float var5 = 0.58823526F;
        class292.field4357[2] = class8.field82[2] * var3 * var5 * var1;
        float var6 = (float) ((var2 & 0xFFCAC9) >> 16) / 255.0F;
        class292.field4357[1] = class8.field82[1] * var4 * var5 * var1;
        class292.field4357[0] = class8.field82[0] * var6 * var5 * var1;
        return class292.field4357;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I)V", line = 147)
    public class6(int arg0) {
        this.field50 = new class36[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class36 var3 = this.field50[var2] = new class36();
            var3.field413 = var3;
            var3.field415 = var3;
        }
    }
}
