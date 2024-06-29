import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public abstract class class392 extends class45 {

    @OriginalMember(owner = "client!qea", name = "u", descriptor = "F")
    public float field5249;

    @OriginalMember(owner = "client!qea", name = "l", descriptor = "I")
    private int field5240;

    @OriginalMember(owner = "client!qea", name = "i", descriptor = "I")
    public int field5237;

    @OriginalMember(owner = "client!qea", name = "p", descriptor = "I")
    public int field5244;

    @OriginalMember(owner = "client!qea", name = "j", descriptor = "I")
    private int field5238;

    @OriginalMember(owner = "client!qea", name = "r", descriptor = "I")
    public int field5246;

    @OriginalMember(owner = "client!qea", name = "m", descriptor = "I")
    public static int field5241 = 0;

    @OriginalMember(owner = "client!qea", name = "v", descriptor = "Lmo;")
    public static class361 field5250 = new class361("WTQA", 2);

    @OriginalMember(owner = "client!qea", name = "k", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!qea", name = "n", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!qea", name = "q", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!qea", name = "s", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!qea", name = "t", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!qea", name = "w", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!qea", name = "x", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!qea", name = "y", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!qea", name = "o", descriptor = "Lf;")
    public static class532 field5243;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)I")
    public final int method2257(int arg0) {
        field5248++;
        if (arg0 != -17895) {
            this.field5244 = 38;
        }
        return this.field5237;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)I")
    public final int method2258(byte arg0) {
        field5251++;
        return arg0 >= -18 ? -75 : this.field5244;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Z)F")
    public final float method2259(boolean arg0) {
        if (arg0) {
            return 0.09626408F;
        } else {
            field5253++;
            return this.field5249;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IIIB)V")
    public abstract void method211(int arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)I")
    public final int method2260(int arg0) {
        if (arg0 != 2) {
            this.field5249 = -0.8404927F;
        }
        field5245++;
        return this.field5238;
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(B)I")
    public final int method2261(byte arg0) {
        if (arg0 != 37) {
            this.field5249 = -1.7221648F;
        }
        field5242++;
        return this.field5246;
    }

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "(B)V")
    public static void method2262(byte arg0) {
        field5243 = null;
        if (arg0 != 88) {
            method2262((byte) -35);
        }
        field5250 = null;
    }

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "(I)I")
    public final int method2263(int arg0) {
        field5239++;
        if (arg0 != 0) {
            field5241 = 102;
        }
        return this.field5240;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(FI)V")
    public abstract void method212(float arg0, int arg1);

    @OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(IIIIIF)V")
    public class392(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field5249 = arg5;
        this.field5240 = arg4;
        this.field5237 = arg2;
        this.field5244 = arg0;
        this.field5238 = arg3;
        this.field5246 = arg1;
    }
}
