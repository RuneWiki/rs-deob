import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class163 extends class204 {

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
    private int field2731;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
    private int field2729;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
    private int field2722;

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
    private int field2732;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "Lfp;")
    public static class297 field2727 = new class297();

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
    public static int field2735 = -1;

    @OriginalMember(owner = "client!sq", name = "C", descriptor = "Laj;")
    public static class287 field2738 = new class287(64);

    @OriginalMember(owner = "client!sq", name = "E", descriptor = "Z")
    public static boolean field2740 = false;

    @OriginalMember(owner = "client!sq", name = "G", descriptor = "F")
    public static float field2742;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
    private int field2723;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
    private int field2724;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
    private int field2728;

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!sq", name = "A", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!sq", name = "B", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!sq", name = "D", descriptor = "I")
    private int field2739;

    @OriginalMember(owner = "client!sq", name = "F", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!sq", name = "H", descriptor = "[B")
    private byte[] field2743;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(Z)V")
    public final void method1243(boolean arg0) {
        field2736++;
        this.field2732 = this.field2722;
        this.field2723 >>= 0x4;
        if (!arg0) {
            method1246((byte) -32);
        }
        if (this.field2723 < 0) {
            this.field2723 = 0;
        } else if (this.field2723 > 255) {
            this.field2723 = 255;
        }
        this.method1151(this.field2739++, (byte) this.field2723, (byte) -100);
        this.field2723 = 0;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)V")
    public static void method1244(byte arg0) {
        field2738 = null;
        field2727 = null;
        int var1 = -33 / ((arg0 + 78) / 48);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IBB)V")
    public void method1151(int arg0, byte arg1, byte arg2) {
        if (arg2 != -100) {
            method1246((byte) -116);
        }
        this.field2743[arg0] = arg1;
        field2726++;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)Lpr;")
    public static final class415 method1245(int arg0, int arg1) {
        field2733++;
        class415[] var2 = class523.method3070(57);
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class415 var4 = var2[var3];
            if (var4.field6014 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(B)V")
    public static final void method1246(byte arg0) {
        field2737++;
        if (arg0 != 76) {
            method1246((byte) 108);
        }
        for (int var1 = 0; var1 < class363.field5389; var1++) {
            int var2 = class367.field5444[var1];
            class436 var3 = (class436) class208.field3179.method2596((long) var2, arg0 + 4);
            if (var3 != null) {
                class22 var4 = var3.field6298;
                class398.method2447(var4.field880.field4978, var4, (byte) -88);
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2730++;
        int var7 = arg1 & 0x3;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg3;
            arg3 = arg5;
            arg5 = var8;
        }
        if (var7 == 0) {
            return arg0;
        } else if (arg2 != 7) {
            return 20;
        } else if (var7 == 1) {
            return 1 + 7 - arg3 - arg6;
        } else if (var7 == 2) {
            return 7 + 1 - arg0 - arg5;
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(III)I")
    public static final int method1248(int arg0, int arg1, int arg2) {
        field2721++;
        int var3 = arg0 - arg2 & arg1 >> 31;
        return ((arg1 >>> 31) + arg1) % arg0 + var3;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)V")
    public final void method1249(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field2728 = this.field2731 - (arg2 >= 0 ? arg2 : -arg2);
            this.field2724 = 4096;
            this.field2728 = this.field2728 * this.field2728 >> 12;
            this.field2723 = this.field2728;
        } else {
            this.field2724 = this.field2729 * this.field2728 >> 12;
            if (this.field2724 < 0) {
                this.field2724 = 0;
            } else if (this.field2724 > 4096) {
                this.field2724 = 4096;
            }
            this.field2728 = this.field2731 - (arg2 >= 0 ? arg2 : -arg2);
            this.field2728 = this.field2728 * this.field2728 >> 12;
            this.field2728 = this.field2728 * this.field2724 >> 12;
            this.field2723 += this.field2732 * this.field2728 >> 12;
            this.field2732 = this.field2732 * this.field2722 >> 12;
        }
        if (arg0 < -121) {
            field2741++;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
    public final void method1250(boolean arg0) {
        this.field2723 = 0;
        field2725++;
        this.field2739 = 0;
        if (!arg0) {
            field2734 = -78;
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class163(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2731 = (int) (arg6 * 4096.0F);
        this.field2729 = (int) (arg7 * 4096.0F);
        this.field2732 = this.field2722 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }
}
