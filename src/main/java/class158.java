import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public abstract class class158 {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "[I")
    public static int[] field2271 = new int[14];

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field2277 = 0;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Z")
    public static boolean field2281 = false;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "[I")
    public static int[] field2274 = new int[2];

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Lnea;")
    public static class664 field2272 = new class664(58, 6);

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)J")
    public abstract long method448(byte arg0);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lde;B)V")
    public static final void method1098(class491 arg0, byte arg1) {
        int var2 = 58 / ((41 - arg1) / 49);
        field2279++;
        class28 var3 = (class28) class423.field6151.method1405((long) arg0.field6216, (byte) -92);
        if (var3 == null) {
            class83.method738(arg0.field6271[0], null, arg0.field3019, arg0.field6262[0], null, -25535, 0, arg0);
        } else {
            var3.method324(0);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIII[B)V")
    public static final void method1099(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field2273++;
        if (arg1 <= arg4) {
            return;
        }
        int var6 = arg0 + arg4;
        int var7 = arg1 - arg4 >> 2;
        if (arg3 > -108) {
            return;
        }
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg1 - arg4 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg5[var6++] = 1;
                }
            }
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public abstract void method450(int arg0);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IJ)I")
    public abstract int method449(int arg0, long arg1);

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public static final void method1100(int arg0) {
        field2280++;
        int var1 = 0;
        int var2 = 59 / ((arg0 - 33) / 52);
        while (var1 < 100) {
            class508.field7177[var1] = true;
            var1++;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(JI)I")
    public final int method1101(long arg0, int arg1) {
        field2276++;
        int var4 = -13 / ((-arg1 - 23) / 51);
        long var5 = this.method448((byte) 123);
        if (var5 > 0L) {
            class561.method3202(var5, (byte) -49);
        }
        return this.method449(-19913, arg0);
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)J")
    public abstract long method451(int arg0);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1102(int arg0, byte arg1, int arg2) {
        field2275++;
        return arg1 >= -17;
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)V")
    public static void method1103(int arg0) {
        field2272 = null;
        field2274 = null;
        field2271 = null;
        if (arg0 != 19998) {
            field2274 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)V")
    public static final void method1104(int arg0) {
        field2278++;
        class97.field1524.method2285((byte) -87);
        if (arg0 >= -120) {
            method1098(null, (byte) 67);
        }
    }
}
