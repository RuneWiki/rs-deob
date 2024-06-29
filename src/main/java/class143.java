import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class143 {

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "Lns;")
    private class408 field2278;

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
    public int field2274;

    @OriginalMember(owner = "client!fea", name = "h", descriptor = "I")
    private int field2280;

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "I")
    public int field2277;

    @OriginalMember(owner = "client!fea", name = "i", descriptor = "Lfea;")
    public static class143 field2281 = new class143(0, 3, class408.field5672);

    @OriginalMember(owner = "client!fea", name = "j", descriptor = "Lfea;")
    public static class143 field2282 = new class143(1, 3, class408.field5672);

    @OriginalMember(owner = "client!fea", name = "k", descriptor = "Lfea;")
    public static class143 field2283 = new class143(2, 4, class408.field5668);

    @OriginalMember(owner = "client!fea", name = "l", descriptor = "Lfea;")
    public static class143 field2284 = new class143(3, 1, class408.field5672);

    @OriginalMember(owner = "client!fea", name = "m", descriptor = "Lfea;")
    public static class143 field2285 = new class143(4, 2, class408.field5672);

    @OriginalMember(owner = "client!fea", name = "n", descriptor = "Lfea;")
    public static class143 field2286 = new class143(5, 3, class408.field5672);

    @OriginalMember(owner = "client!fea", name = "o", descriptor = "Lfea;")
    public static class143 field2287 = new class143(6, 4, class408.field5672);

    @OriginalMember(owner = "client!fea", name = "p", descriptor = "I")
    public static int field2288 = class384.method2276(127, 16);

    @OriginalMember(owner = "client!fea", name = "q", descriptor = "Lhda;")
    public static class752 field2289 = new class752(100, -1);

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!fea", name = "g", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!fea", name = "r", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!fea", name = "s", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!fea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2276++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V")
    public static void method1087(int arg0) {
        if (arg0 < 112) {
            method1089((byte) -27, 71, 91, -53, null);
        }
        field2289 = null;
        field2283 = null;
        field2287 = null;
        field2282 = null;
        field2284 = null;
        field2285 = null;
        field2286 = null;
        field2281 = null;
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(BFIFF)F")
    public static final float method1088(byte arg0, float arg1, int arg2, float arg3, float arg4) {
        if (arg0 >= -51) {
            return 0.6021956F;
        } else {
            field2275++;
            float[] var5 = class580.field7598[arg2];
            return var5[2] * arg4 + var5[0] * arg1 + var5[1] * arg3;
        }
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(IILns;)V")
    private class143(int arg0, int arg1, class408 arg2) {
        this.field2278 = arg2;
        this.field2274 = arg0;
        this.field2280 = arg1;
        this.field2277 = this.field2278.field5665 * this.field2280;
        if (this.field2274 >= 16) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(BIIILfha;)V")
    public static final void method1089(byte arg0, int arg1, int arg2, int arg3, class383 arg4) {
        field2279++;
        int var5 = arg4.field10322[0];
        int var6 = arg4.field10321[0];
        int var7 = 111 % ((15 - arg1) / 38);
        if (var5 < 0 || class719.field10004 <= var5 || var6 < 0 || class107.field1453 <= var6 || arg3 < 0 || class719.field10004 <= arg3 || arg2 < 0 || arg2 >= class107.field1453) {
            return;
        }
        int var8 = class270.method1627(0, var5, class456.field6226[arg4.field3508], var6, arg4.method2256(-1), class142.field2270, true, 0, 0, 28002, arg2, 0, class481.field6585, arg3, -4);
        if (var8 >= 1 && var8 <= 3) {
            for (int var9 = 0; var9 < var8 - 1; var9++) {
                arg4.method2258(arg0, true, class481.field6585[var9], class142.field2270[var9]);
            }
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IB)Lfea;")
    public static final class143 method1090(int arg0, byte arg1) {
        field2273++;
        if (arg0 == 0) {
            return field2281;
        } else if (arg0 == 1) {
            return field2282;
        } else if (arg0 == 2) {
            return field2283;
        } else if (arg0 == 3) {
            return field2284;
        } else if (arg0 == 4) {
            return field2285;
        } else if (arg0 == 5) {
            return field2286;
        } else if (arg0 == 6) {
            return field2287;
        } else {
            if (arg1 < 57) {
                method1087(45);
            }
            return null;
        }
    }
}
