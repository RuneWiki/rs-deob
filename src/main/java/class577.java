import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class577 extends class298 {

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "[I")
    private int[] field8382 = new int[this.field4381];

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "Z")
    public static boolean field8378 = false;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field8375;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    private int field8376;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field8379;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public static int field8380;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field8381;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    private int field8383;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
    public static int field8384;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
    public static int field8385;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "I")
    public static int field8386;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
    public static int field8387;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "[B")
    private byte[] field8377;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZIB)V")
    public void method1508(boolean arg0, int arg1, byte arg2) {
        this.field8377[this.field8383++] = (byte) ((class425.method2563(arg2, 255) >> 1) + 127);
        ++field8385;
        if (!arg0) {
            this.method1857(true);
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(III)Z")
    public static final boolean method3320(int arg0, int arg1, int arg2) {
        ++field8381;
        if (arg2 != 0) {
            method3321(-37, (class540) null);
        }
        return class115.method856(arg1, arg0, (byte) 4) || class138.method978(arg1, arg2 ^ 128, arg0);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
    public final void method1857(boolean arg0) {
        ++field8384;
        if (!arg0) {
            this.field8383 = 0;
            this.field8376 = 0;
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(IIIIIF)V")
    public class577(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field4381 > var7; ++var7) {
            this.field8382[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V")
    public final void method1862(byte arg0) {
        this.field8376 = Math.abs(this.field8376);
        ++field8375;
        if (arg0 < -81) {
            if (this.field8376 >= 4096) {
                this.field8376 = 4095;
            }
            this.method1508(true, this.field8383++, (byte) (this.field8376 >> 4));
            this.field8376 = 0;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)V")
    public final void method1854(int arg0, int arg1, int arg2) {
        int var4 = -23 / ((-81 - arg1) / 43);
        ++field8386;
        this.field8376 += this.field8382[arg0] * arg2 >> 12;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILgk;)Lpv;")
    public static final class167 method3321(int arg0, class540 arg1) {
        ++field8387;
        class545 var2 = class9.method64((byte) -127)[arg1.method3115(29871)];
        class305 var3 = class62.method384(true)[arg1.method3115(arg0 ^ 29776)];
        int var4 = arg1.method3129(71);
        if (arg0 != 255) {
            field8378 = false;
        }
        int var5 = arg1.method3129(110);
        int var6 = arg1.method3169(26488);
        int var7 = arg1.method3169(26488);
        int var8 = arg1.method3129(102);
        int var9 = arg1.method3160(false);
        int var10 = arg1.method3160(false);
        return new class167(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }
}
