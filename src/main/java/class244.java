import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class244 {

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public int field4235;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public int field4239;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public int field4241;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public int field4237;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "Lhi;")
    public static class82 field4231 = class95.method664((byte) -37, "::qa_op_test");

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "Z")
    public static boolean field4232 = true;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public static volatile int field4244 = 0;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "Lhi;")
    public static class82 field4243 = class95.method664((byte) -66, "Particles: ");

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "Lqg;")
    public static class196 field4238;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "Lji;")
    public static class268 field4233;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILme;IIIII)V", line = 12)
    public static final void method1749(int arg0, class75 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4234++;
        int var7 = arg0 * arg0 + arg6 * arg6;
        if (var7 > arg5) {
            return;
        }
        int var8 = Math.min(arg1.field1216 / 2, arg1.field1205 / 2);
        if (var7 <= (var8 * var8)) {
            class32.method251(arg6, arg1, arg0, arg4, -15639, class20.field261[arg2], arg3);
            return;
        }
        var8 -= 10;
        int var9 = class62.field970 + class219.field3804 & 0x7FF;
        int var10 = class102.field1813[var9];
        int var11 = var10 * 256 / (class5.field41 + 256);
        int var12 = class102.field1819[var9];
        int var13 = var12 * 256 / (class5.field41 + 256);
        int var14 = arg0 * var13 - (arg6 * var11) >> 16;
        int var15 = arg0 * var11 + arg6 * var13 >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) (Math.sin(var16) * (double) var8);
        int var19 = (int) ((double) var8 * Math.cos(var16));
        if (class147.field2485) {
            ((class210) class68.field1061[arg2]).method1516(240, 240, (arg1.field1216 / 2 + arg4 + var18) * 16, (arg1.field1205 / 2 + arg3 - var19) * 16, (int) (var16 * 10430.378D), 4096);
        } else {
            ((class303) class68.field1061[arg2]).method1037(arg1.field1216 / 2 + (arg4 + var18) - 10, arg1.field1205 / 2 + arg3 + -var19 + -10, 20, 20, 15, 15, var16, 256);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 70)
    public static void method1750(int arg0) {
        field4233 = null;
        if (arg0 != -720864496) {
            field4244 = -86;
        }
        field4231 = null;
        field4243 = null;
        field4238 = null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)V", line = 83)
    public static final void method1751(int arg0, int arg1) {
        field4245++;
        class166.field2899.method2177(arg1, 64);
        if (arg0 == 2) {
            class28.field383.method2177(arg1, 125);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BI)[F", line = 110)
    public static final float[] method1752(byte arg0, int arg1) {
        field4236++;
        float var2 = class85.method598() + class85.method590();
        int var3 = class85.method596();
        float var4 = (float) ((var3 & 0xFF9FE0) >> 16) / 255.0F;
        float var5 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        class235.field4094[3] = 1.0F;
        float var6 = (float) (var3 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class235.field4094[2] = var2 * var6 * ((float) class277.method1935(255, arg1) / 255.0F) * var7;
        if (arg0 <= 5) {
            field4232 = false;
        }
        class235.field4094[1] = (float) (class277.method1935(65474, arg1) >> 8) / 255.0F * var5 * var7 * var2;
        class235.field4094[0] = var7 * (float) class277.method1935(255, arg1 >> 16) / 255.0F * var4 * var2;
        return class235.field4094;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V", line = 148)
    public class244() {
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lwm;)V", line = 151)
    public class244(class244 arg0) {
        this.field4235 = arg0.field4235;
        this.field4239 = arg0.field4239;
        this.field4241 = arg0.field4241;
        this.field4237 = arg0.field4237;
    }
}
