import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class151 {

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public int field2277;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public int field2274;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public int field2281;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public int field2279;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "Lnn;")
    public static class214 field2276 = new class214(2, 3);

    @OriginalMember(owner = "client!io", name = "k", descriptor = "[I")
    public static int[] field2284 = new int[1];

    @OriginalMember(owner = "client!io", name = "j", descriptor = "I")
    public static int field2283 = 0;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public static final void method1078(int arg0) {
        class262.field3823 = false;
        class644.field9363 = null;
        field2282++;
        if (arg0 != 1) {
            method1080(103, 125, 17, -72, (byte) 64, -103, -75);
        }
        class530.method2980(arg0 ^ 0xFFFFE514);
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V")
    public static void method1079(int arg0) {
        field2284 = null;
        field2276 = null;
        if (arg0 != 14272) {
            field2283 = 52;
        }
    }

    @OriginalMember(owner = "client!io", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2278++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIBII)Lkk;")
    public static final class149 method1080(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field2275++;
        long var7 = (long) arg5 * 986053L ^ (long) arg3 * 67481L ^ (long) arg0 * 97549L ^ (long) arg1 * 475427L ^ (long) arg2 * 32147369L ^ (long) arg6 * 76724863L;
        if (arg4 != 60) {
            field2283 = -24;
        }
        class149 var9 = (class149) class234.field3444.method2407(false, var7);
        if (var9 == null) {
            class149 var10 = class134.field2161.method515(arg3, arg0, arg1, arg5, arg2, arg6);
            class234.field3444.method2408(var10, var7, arg4 - 183);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(IIII)V")
    public class151(int arg0, int arg1, int arg2, int arg3) {
        this.field2277 = arg2;
        this.field2274 = arg3;
        this.field2281 = arg0;
        this.field2279 = arg1;
    }
}
