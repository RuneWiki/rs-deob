import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class239 {

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
    public int field3174 = 0;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
    public int field3178 = 0;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "Z")
    private boolean field3177 = false;

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "Lh;")
    public static class434 field3184 = new class434(76, -1);

    @OriginalMember(owner = "client!bp", name = "w", descriptor = "[I")
    public static int[] field3189 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
    public static int field3187 = 0;

    @OriginalMember(owner = "client!bp", name = "t", descriptor = "F")
    public static float field3186 = 1024.0F;

    @OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
    public static int field3188 = -1;

    @OriginalMember(owner = "client!bp", name = "y", descriptor = "Z")
    public static boolean field3191 = false;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    private int field3167;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public int field3168;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public int field3169;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "I")
    public int field3171;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    public int field3172;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
    public int field3180;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
    public int field3181;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "I")
    public int field3183;

    @OriginalMember(owner = "client!bp", name = "x", descriptor = "I")
    public int field3190;

    @OriginalMember(owner = "client!bp", name = "z", descriptor = "I")
    public int field3192;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "J")
    public long field3182;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "[I")
    public static int[] field3185;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZI)V", line = 3)
    public static final void method1321(boolean arg0, int arg1) {
        field3170++;
        class76 var2 = class142.field2052;
        synchronized (class142.field2052) {
            class142.field2052.method496(arg1, 106);
        }
        class76 var3 = class26.field324;
        synchronized (class26.field324) {
            class26.field324.method496(arg1, 64);
        }
        if (!arg0) {
            field3184 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 19)
    public final void method1322(int arg0) {
        this.field3169 = class364.field4992[this.field3167 << 3];
        field3179++;
        this.field3171 = (int) Math.sqrt((double) (this.field3180 * this.field3180 + this.field3192 * this.field3192 + this.field3172 * this.field3172));
        if (this.field3183 == 0) {
            this.field3183 = 1;
        }
        if (this.field3190 == 0) {
            this.field3182 = 2147483647L;
        } else if (this.field3190 == 1) {
            this.field3182 = (long) (this.field3171 * 8 / this.field3183);
            this.field3182 *= this.field3182;
        } else if (this.field3190 == 2) {
            this.field3182 = (long) (this.field3171 * 8 / this.field3183);
        }
        if (arg0 != -2) {
            method1325(false, (Component) null, 6);
        }
        if (this.field3177) {
            this.field3171 *= -1;
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V", line = 56)
    public static void method1323(int arg0) {
        field3189 = null;
        field3184 = null;
        int var1 = -14 / ((arg0 + 25) / 45);
        field3185 = null;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lbt;ZI)V", line = 73)
    private final void method1324(class32 arg0, boolean arg1, int arg2) {
        if (arg2 == 1) {
            this.field3167 = arg0.method215((byte) 105);
        } else if (arg2 == 2) {
            arg0.method201((byte) -123);
        } else if (arg2 == 3) {
            this.field3192 = arg0.method222(1024);
            this.field3180 = arg0.method222(1024);
            this.field3172 = arg0.method222(1024);
        } else if (arg2 == 4) {
            this.field3190 = arg0.method201((byte) -126);
            this.field3183 = arg0.method222(1024);
        } else if (arg2 == 6) {
            this.field3168 = arg0.method201((byte) -120);
        } else if (arg2 == 8) {
            this.field3174 = 1;
        } else if (arg2 == 9) {
            this.field3178 = 1;
        } else if (arg2 == 10) {
            this.field3177 = true;
        }
        if (arg1) {
            field3176++;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZLjava/awt/Component;I)Llh;", line = 137)
    public static final class336 method1325(boolean arg0, Component arg1, int arg2) {
        if (arg2 <= 58) {
            field3186 = 1.297078F;
        }
        field3175++;
        return new class365(arg1, arg0);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZLbt;)V", line = 166)
    public final void method1326(boolean arg0, class32 arg1) {
        if (arg0) {
            field3184 = null;
        }
        field3173++;
        while (true) {
            int var3 = arg1.method201((byte) -105);
            if (var3 == 0) {
                return;
            }
            this.method1324(arg1, true, var3);
        }
    }
}
