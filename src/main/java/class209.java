import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class209 extends class462 {

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "Lrn;")
    public static class174 field3019 = new class174(71, 3);

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "[J")
    public static long[] field3022 = new long[100];

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "Lbu;")
    public static class17 field3017;

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(IIIIIF)V", line = 3)
    public class209(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(B)Lsp;", line = 6)
    public static final class448 method1409(byte arg0) {
        if (arg0 != 98) {
            field3017 = null;
        }
        ++field3021;
        try {
            return (class448) Class.forName("ud").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)V", line = 24)
    public static void method1410(int arg0) {
        field3022 = null;
        field3019 = null;
        int var1 = -85 % ((arg0 - 69) / 51);
        field3017 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(FZ)V", line = 36)
    public final void method1411(float arg0, boolean arg1) {
        if (!arg1) {
            field3019 = null;
        }
        super.field6916 = arg0;
        ++field3015;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V", line = 55)
    public static final void method1412(int arg0, int arg1) {
        if (arg0 <= 30) {
            method1412(-97, -111);
        }
        ++field3018;
        class54 var2 = class442.method2651(arg1, 4, -13208);
        var2.method476((byte) -44);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBII)V", line = 69)
    public final void method1413(int arg0, byte arg1, int arg2, int arg3) {
        ++field3016;
        if (arg1 <= -5) {
            super.field6910 = arg2;
            super.field6912 = arg3;
            super.field6920 = arg0;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IJ)V", line = 83)
    public static final void method1414(int arg0, long arg1) {
        ++field3020;
        int var3 = class141.field2245;
        if (arg0 != -12619) {
            field3019 = null;
        }
        int var4 = class206.field2980;
        if (~class305.field4654 != ~var3) {
            int var5 = -class305.field4654 + var3;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (~var5 < -1) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (~var6 == -1) {
                var6 = -1;
            } else if (~var5 < ~var6) {
                var6 = var5;
            }
            class305.field4654 += var6;
        }
        if (!class443.field6623.field601) {
            class526.field7779 += (float) arg1 * class174.field2668 / 40.0F * 8.0F;
            class455.field6790 += (float) arg1 * class168.field2614 / 40.0F * 8.0F;
        }
        if (class524.field7771 != var4) {
            int var7 = -class524.field7771 + var4;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (~var7 >= -1) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (~var7 < ~var8) {
                    var8 = var7;
                }
            } else if (~var8 == -1) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class524.field7771 += var8;
        }
        class207.method1403(-19057);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "()V", line = 172)
    public static final void method1415() {
        class261.method1692(1, class190.field2830);
    }
}
