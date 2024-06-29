import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class20 extends class430 {

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "Lrb;")
    public static class352 field311 = new class352("", 17);

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    private int field301;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    private int field306;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "[B")
    private byte[] field295;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZBI)V", line = 3)
    public void method121(boolean arg0, byte arg1, int arg2) {
        if (arg0) {
            this.field295[arg2] = arg1;
            field304++;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(IIIIIFFF)V", line = 15)
    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field300 = (int) (arg7 * 4096.0F);
        this.field312 = (int) (arg6 * 4096.0F);
        this.field307 = this.field298 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V", line = 26)
    public static final void method122(int arg0) {
        class232.field3138.method2767((byte) -19);
        field308++;
        class176.field2372 = arg0;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIZIZI)V", line = 36)
    public static final void method123(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        if (arg2 != 28048) {
            method124(121, -11);
        }
        field303++;
        if (arg4 <= arg6) {
            return;
        }
        int var7 = (arg4 + arg6) / 2;
        int var8 = arg6;
        class287 var9 = class315.field4364[var7];
        class315.field4364[var7] = class315.field4364[arg4];
        class315.field4364[arg4] = var9;
        for (int var10 = arg6; var10 < arg4; var10++) {
            if (class238.method1524(arg1, arg5, 1, arg3, arg0, var9, class315.field4364[var10]) <= 0) {
                class287 var11 = class315.field4364[var10];
                class315.field4364[var10] = class315.field4364[var8];
                class315.field4364[var8++] = var11;
            }
        }
        class315.field4364[arg4] = class315.field4364[var8];
        class315.field4364[var8] = var9;
        method123(arg0, arg1, arg2, arg3, var8 - 1, arg5, arg6);
        method123(arg0, arg1, 28048, arg3, arg4, arg5, var8 + 1);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)V", line = 80)
    public static final void method124(int arg0, int arg1) {
        class636.field8756.method4016(arg1, (byte) -73);
        if (arg0 == 4096) {
            field302++;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 97)
    public final void method125(byte arg0) {
        if (arg0 != 58) {
            this.method129(-9, 96, 70);
        }
        this.field301 >>= 0x4;
        this.field307 = this.field298;
        field305++;
        if (this.field301 < 0) {
            this.field301 = 0;
        } else if (this.field301 > 255) {
            this.field301 = 255;
        }
        this.method121(true, (byte) this.field301, this.field297++);
        this.field301 = 0;
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V", line = 118)
    public static void method126(int arg0) {
        if (arg0 != -26913) {
            field299 = 93;
        }
        field311 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILee;I)Ljava/lang/String;", line = 130)
    public static final String method127(int arg0, class675 arg1, int arg2) {
        field310++;
        if (arg0 < 106) {
            return null;
        }
        try {
            int var3 = arg1.method3693(-91);
            if (arg2 < var3) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg1.field9146 += class559.field7848.method3816(arg1.field9154, 0, arg1.field9146, var4, var3, 0);
            return class529.method3081(var4, 0, 63, var3);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V", line = 162)
    public final void method128(int arg0) {
        field313++;
        if (arg0 == 3) {
            this.field301 = 0;
            this.field297 = 0;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V", line = 174)
    public final void method129(int arg0, int arg1, int arg2) {
        if (arg2 != -101) {
            this.field307 = 125;
        }
        field296++;
        if (arg0 == 0) {
            this.field294 = this.field312 - (arg1 >= 0 ? arg1 : -arg1);
            this.field306 = 4096;
            this.field294 = this.field294 * this.field294 >> 12;
            this.field301 = this.field294;
            return;
        }
        this.field306 = this.field300 * this.field294 >> 12;
        if (this.field306 < 0) {
            this.field306 = 0;
        } else if (this.field306 > 4096) {
            this.field306 = 4096;
        }
        this.field294 = this.field312 - (arg1 >= 0 ? arg1 : -arg1);
        this.field294 = this.field294 * this.field294 >> 12;
        this.field294 = this.field306 * this.field294 >> 12;
        this.field301 += this.field307 * this.field294 >> 12;
        this.field307 = this.field307 * this.field298 >> 12;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lfp;B)V", line = 208)
    public static final void method130(class323 arg0, byte arg1) {
        class225.field3038 = arg0;
        if (arg1 != 106) {
            method127(114, null, -11);
        }
        field309++;
    }
}
