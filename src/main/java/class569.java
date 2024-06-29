import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class569 {

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lwa;")
    public static class569 field8283 = new class569();

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Lwa;")
    public static class569 field8288 = new class569();

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lwa;")
    public static class569 field8290 = new class569();

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Lwa;")
    public static class569 field8291 = new class569();

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "[I")
    public static int[] field8292 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field8294 = -1;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field8285;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field8286;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field8287;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field8289;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "[Lnk;")
    public static class668[] field8293;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lqh;I)Lfga;")
    public static final class234 method3281(class61 arg0, int arg1) {
        field8285++;
        if (arg1 != -1) {
            return null;
        }
        class320 var2 = class653.method3723(false)[arg0.method732(-559537960)];
        class547 var3 = class641.method3657((byte) -121)[arg0.method732(-559537960)];
        int var4 = arg0.method721(-461515024);
        int var5 = arg0.method721(-461515024);
        int var6 = arg0.method723((byte) -25);
        int var7 = arg0.method723((byte) -25);
        int var8 = arg0.method721(-461515024);
        int var9 = arg0.method730(101);
        int var10 = arg0.method730(-53);
        return new class234(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method3282(int arg0) {
        field8291 = null;
        field8292 = null;
        field8290 = null;
        if (arg0 != -16844) {
            field8292 = null;
        }
        field8288 = null;
        field8283 = null;
        field8293 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZILqu;I)J")
    public static final long method3283(boolean arg0, int arg1, class83 arg2, int arg3) {
        field8286++;
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class56 var8 = class237.field3521.method3515(arg2.method841((byte) 52), 50);
        if (!arg0) {
            field8291 = null;
        }
        long var9 = (long) (arg2.method844((byte) 112) | 0x10000 << 14 | arg1 << 7 | arg3 | arg2.method846((byte) -105) << 20);
        if (var8.field1290 == 0) {
            var9 |= var6;
        }
        if (var8.field1261 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg2.method841((byte) 52) << 32;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[B)I")
    public static final int method3284(int arg0, int arg1, byte[] arg2) {
        int var3 = 84 % ((14 - arg1) / 53);
        field8284++;
        return class593.method3381(arg2, arg0, 0, 5499);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V")
    public static final void method3285(boolean arg0, String arg1, int arg2, String arg3, String arg4, int arg5, String arg6, int arg7, String arg8) {
        field8289++;
        class643 var9 = class588.field8472[99];
        int var10 = 99;
        if (arg0) {
            field8294 = -55;
        }
        while (var10 > 0) {
            class588.field8472[var10] = class588.field8472[var10 - 1];
            var10--;
        }
        if (var9 == null) {
            var9 = new class643(arg7, arg5, arg3, arg1, arg4, arg8, arg2, arg6);
        } else {
            var9.method3660(arg3, (byte) 119, arg8, arg6, arg1, arg2, arg4, arg5, arg7);
        }
        class588.field8472[0] = var9;
        class113.field2037 = class104.field1844;
        class32.field960++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZIII)V")
    public static final void method3286(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -27377) {
            field8288 = null;
        }
        field8282++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class195.field3068 = arg3;
        class238.field3527 = arg0;
        class347.field5166 = arg2;
    }

    @OriginalMember(owner = "client!wa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8287++;
        throw new IllegalStateException();
    }
}
