import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class183 extends class59 {

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
    private final int field2906;

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "I")
    private final int field2908;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    private final int field2896;

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "I")
    private int field2907;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "Lck;")
    public static class119 field2898 = class298.method1987((byte) 4, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "Lck;")
    public static class119 field2899 = class298.method1987((byte) 95, "loc)3dat");

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "Z")
    public static boolean field2903 = false;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    private int field2894;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
    private int field2901;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    private int field2905;

    @OriginalMember(owner = "client!jl", name = "M", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "I")
    private int field2910;

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "[B")
    private byte[] field2904;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V", line = 5)
    public final void method442(int arg0) {
        this.field2901 = 0;
        field2895++;
        if (arg0 < 75) {
            this.method445(103, 42, true);
        }
        this.field2894 = 0;
    }

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "(I)V", line = 18)
    public static void method1165(int arg0) {
        field2898 = null;
        field2899 = null;
        if (arg0 >= -46) {
            method1166(111, (class212) null, (class296) null);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILvh;Lsc;)Lib;", line = 32)
    public static final class145 method1166(int arg0, class212 arg1, class296 arg2) {
        field2900++;
        long var3 = ((long) arg2.field4919 << 32) + ((long) arg2.field4937 << 56) + (long) ((arg2.field4928 - -1 << 16) - -arg2.field4926);
        if (arg0 != 1174619744) {
            field2903 = false;
        }
        class145 var5 = (class145) arg1.method1329((byte) 90, var3);
        if (var5 == null) {
            var5 = new class145(arg2.field4928, (float) arg2.field4926, true, false, arg2.field4919);
            arg1.method1326(var3, (byte) -121, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(IIIIIFFF)V", line = 52)
    public class183(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2906 = (int) (arg6 * 4096.0F);
        this.field2908 = (int) (arg7 * 4096.0F);
        this.field2907 = this.field2896 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)V", line = 73)
    public void method1122(int arg0, byte arg1) {
        field2897++;
        this.field2904[arg0] = arg1;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 96)
    public final void method435(byte arg0) {
        this.field2894 >>= 0x4;
        this.field2907 = this.field2896;
        field2902++;
        if (this.field2894 < 0) {
            this.field2894 = 0;
        } else if (this.field2894 > 255) {
            this.field2894 = 255;
        }
        this.method1122(this.field2901++, (byte) this.field2894);
        if (arg0 != -84) {
            field2898 = (class119) null;
        }
        this.field2894 = 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIZ)V", line = 123)
    public final void method445(int arg0, int arg1, boolean arg2) {
        field2911++;
        if (arg0 == 0) {
            this.field2910 = this.field2906 - (arg1 >= 0 ? arg1 : -arg1);
            this.field2910 = this.field2910 * this.field2910 >> 12;
            this.field2894 = this.field2910;
            this.field2905 = 4096;
        } else {
            this.field2905 = this.field2910 * this.field2908 >> 12;
            if (this.field2905 < 0) {
                this.field2905 = 0;
            } else if (this.field2905 > 4096) {
                this.field2905 = 4096;
            }
            this.field2910 = this.field2906 - (arg1 >= 0 ? arg1 : -arg1);
            this.field2910 = this.field2910 * this.field2910 >> 12;
            this.field2910 = this.field2910 * this.field2905 >> 12;
            this.field2894 += this.field2910 * this.field2907 >> 12;
            this.field2907 = this.field2907 * this.field2896 >> 12;
        }
        if (arg2) {
            this.field2907 = 39;
        }
    }
}
