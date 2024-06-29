import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public abstract class class183 extends class78 {

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public int field2355;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public int field2353;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
    public int field2359;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
    public int field2362;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
    public int field2354;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public int field2352;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
    public int field2360;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "Z")
    public static boolean field2351 = true;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "Lpf;")
    public static class485 field2358 = new class485();

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "[S")
    public static short[] field2364 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "Z")
    public static boolean field2365 = false;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "Z")
    public static boolean field2363;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "(I)I")
    public abstract int method126(int arg0);

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(Z)V")
    public static void method994(boolean arg0) {
        field2364 = null;
        if (arg0) {
            field2358 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(I)Z")
    public final boolean method33(int arg0) {
        if (arg0 != 1957) {
            method995((byte) 16, (String) null);
        }
        field2350++;
        return false;
    }

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "(I)V")
    public final void method32(int arg0) {
        if (arg0 == -2) {
            field2356++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIZLa;IBLoj;)V")
    public final void method23(int arg0, int arg1, boolean arg2, class78 arg3, int arg4, byte arg5, class280 arg6) {
        if (arg5 == -65) {
            field2361++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method995(byte arg0, String arg1) {
        if (arg0 != 23) {
            field2365 = false;
        }
        field2357++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(IIIIIII)V")
    public class183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2355 = arg0;
        this.field2353 = arg6;
        this.field2359 = arg5;
        this.field2362 = arg3;
        this.field2354 = arg4;
        this.field2352 = arg1;
        this.field2360 = arg2;
    }
}
