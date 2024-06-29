import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class390 {

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "F")
    public float field5280 = 0.25F;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "F")
    public float field5282 = 1.0F;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "F")
    public float field5291 = 1.0F;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "F")
    public float field5274;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public int field5286;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public int field5289;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public int field5279;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public int field5290;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "F")
    public float field5285;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "F")
    public float field5288;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Llj;")
    public class60 field5276;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public int field5284;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public int field5275;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "[I")
    public static int[] field5273;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lvc;I)Z", line = 8)
    public final boolean method2217(class390 arg0, int arg1) {
        if (arg1 == 7142) {
            field5281++;
            return this.field5279 == arg0.field5279 && this.field5288 == arg0.field5288 && this.field5274 == arg0.field5274 && this.field5285 == arg0.field5285 && this.field5280 == arg0.field5280 && this.field5282 == arg0.field5282 && this.field5291 == arg0.field5291 && this.field5290 == arg0.field5290 && this.field5289 == arg0.field5289 && this.field5276 == arg0.field5276;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZLnp;)V", line = 20)
    public final void method2218(boolean arg0, class115 arg1) {
        this.field5282 = (float) (arg1.method620((byte) 32) * 8) / 255.0F;
        field5278++;
        this.field5280 = (float) (arg1.method620((byte) 44) * 8) / 255.0F;
        this.field5291 = (float) (arg1.method620((byte) -127) * 8) / 255.0F;
        if (!arg0) {
            method2222(true, '\u0016');
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 37)
    public static void method2219(byte arg0) {
        if (arg0 < -49) {
            field5273 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIZ)V", line = 54)
    public static final void method2220(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg3 - arg1 >= class412.field5526 && class72.field740 >= (arg1 + arg3) && (arg0 - arg1) >= class93.field949 && (arg0 + arg1) <= class360.field4834) {
            class302.method1751((byte) -128, arg3, arg1, arg0, arg2);
        } else {
            class625.method3519(arg0, arg3, arg2, arg1, -13377);
        }
        if (!arg4) {
            field5273 = null;
        }
        field5287++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBI)Z", line = 72)
    public static final boolean method2221(int arg0, byte arg1, int arg2) {
        field5272++;
        if (arg1 <= 57) {
            method2219((byte) -40);
        }
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZC)Z", line = 84)
    public static final boolean method2222(boolean arg0, char arg1) {
        field5283++;
        if (arg0) {
            return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V", line = 105)
    public class390() {
        this.field5274 = 0.69921875F;
        this.field5286 = -50;
        this.field5289 = 0;
        this.field5279 = class695.field9739;
        this.field5290 = class71.field696;
        this.field5285 = 1.2F;
        this.field5288 = 1.1523438F;
        this.field5276 = class258.field3245;
        this.field5284 = -60;
        this.field5275 = -50;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lnp;)V", line = 121)
    public class390(class115 arg0) {
        int var2 = arg0.method620((byte) -126);
        if (class639.field9075.method2718(class430.field6109, (byte) 76) && class185.field2107.method953() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field5279 = class695.field9739;
            } else {
                this.field5279 = arg0.method631(false);
            }
            if ((var2 & 0x2) == 0) {
                this.field5288 = 1.1523438F;
            } else {
                this.field5288 = (float) arg0.method643((byte) -77) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field5274 = 0.69921875F;
            } else {
                this.field5274 = (float) arg0.method643((byte) -77) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field5285 = 1.2F;
            } else {
                this.field5285 = (float) arg0.method643((byte) -77) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method631(false);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method643((byte) -77);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method643((byte) -77);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method643((byte) -77);
            }
            this.field5274 = 0.69921875F;
            this.field5285 = 1.2F;
            this.field5279 = class695.field9739;
            this.field5288 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field5284 = -60;
            this.field5275 = -50;
            this.field5286 = -50;
        } else {
            this.field5286 = arg0.method676(-5);
            this.field5284 = arg0.method676(-5);
            this.field5275 = arg0.method676(-5);
        }
        if ((var2 & 0x20) == 0) {
            this.field5290 = class71.field696;
        } else {
            this.field5290 = arg0.method631(false);
        }
        if ((var2 & 0x40) == 0) {
            this.field5289 = 0;
        } else {
            this.field5289 = arg0.method643((byte) -77);
        }
        if ((var2 & 0x80) == 0) {
            this.field5276 = class258.field3245;
        } else {
            int var3 = arg0.method643((byte) -77);
            int var4 = arg0.method643((byte) -77);
            int var5 = arg0.method643((byte) -77);
            int var6 = arg0.method643((byte) -77);
            int var7 = arg0.method643((byte) -77);
            int var8 = arg0.method643((byte) -77);
            this.field5276 = class301.method1746(var3, var5, var7, (byte) -24, var4, var6, var8);
        }
    }
}
