import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class144 extends class128 {

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "Lid;")
    public static class60 field3243 = class11.method72("VOLL", (byte) -50);

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "[I")
    public static int[] field3237 = new int[128];

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3250 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public int field3238;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "I")
    public int field3242;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public int field3244;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    public int field3245;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "I")
    public int field3246;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    public int field3248;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
    public int field3254;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
    public int field3256;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
    public int field3257;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
    public int field3259;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "Lvb;")
    public class148 field3235;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "Lie;")
    public static class61 field3247;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "Llc;")
    public class79 field3236;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "Llc;")
    public class79 field3249;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "Ln;")
    public static class90 field3241;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "Z")
    public static boolean field3258;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "[I")
    public int[] field3251;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
    public final void method1108(int arg0) {
        field3255++;
        int var2 = this.field3259;
        class148 var3 = this.field3235.method1124(-11);
        if (var3 == null) {
            this.field3257 = 0;
            this.field3256 = 0;
            this.field3246 = 0;
            this.field3259 = -1;
            this.field3251 = null;
        } else {
            this.field3251 = var3.field3362;
            this.field3257 = var3.field3319 * 128;
            this.field3256 = var3.field3356;
            this.field3246 = var3.field3335;
            this.field3259 = var3.field3311;
        }
        if (this.field3259 != var2 && this.field3236 != null) {
            class33.field770.method1104(this.field3236);
            this.field3236 = null;
        }
        int var4 = -32 % ((arg0 + 38) / 58);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLef;I)V")
    public static final void method1109(byte arg0, class35 arg1, int arg2) {
        field3253++;
        if (class82.field2065 < arg1.field851) {
            class77.method631(true, arg1);
        } else if (class82.field2065 > arg1.field845) {
            class16.method131(arg1, true);
        } else {
            class135.method1057(28701, arg1);
        }
        if (arg1.field854 < 128 || arg1.field828 < 128 || arg1.field854 >= 13184 || arg1.field828 >= 13184) {
            arg1.field845 = 0;
            arg1.field828 = arg1.field827[0] * 128 + arg1.field872 * 64;
            arg1.field806 = -1;
            arg1.field851 = 0;
            arg1.field854 = arg1.field841[0] * 128 + arg1.field872 * 64;
            arg1.field839 = -1;
            arg1.method263(true);
        }
        if (class107.field2640 == arg1 && (arg1.field854 < 1536 || arg1.field828 < 1536 || arg1.field854 >= 11776 || arg1.field828 >= 11776)) {
            arg1.field806 = -1;
            arg1.field845 = 0;
            arg1.field828 = arg1.field827[0] * 128 + arg1.field872 * 64;
            arg1.field851 = 0;
            arg1.field854 = arg1.field841[0] * 128 + arg1.field872 * 64;
            arg1.field839 = -1;
            arg1.method263(true);
        }
        class133.method1050(-12385, arg1);
        class124.method983(-1, arg1);
        if (arg0 != 41) {
            field3247 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Z")
    public static final boolean method1110(int arg0, int arg1) {
        if (arg1 != -13055) {
            field3240 = -28;
        }
        field3252++;
        return (arg0 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
    public static void method1111(int arg0) {
        field3250 = null;
        field3247 = null;
        field3237 = null;
        field3243 = null;
        if (arg0 != 128) {
            field3240 = 74;
        }
        field3241 = null;
    }
}
