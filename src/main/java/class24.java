import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class24 {

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Lmp;")
    private class758 field304 = new class758(256);

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "Lmp;")
    private class758 field311 = new class758(256);

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "Leq;")
    private class209 field306;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Leq;")
    private class209 field305;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "Lqe;")
    public static class465 field308 = new class465(103, 0);

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "Lqaa;")
    public static class27 field310 = new class27(65, 8);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "Z")
    public static boolean field312;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BII[I)Lcj;")
    private final class690 method143(byte arg0, int arg1, int arg2, int[] arg3) {
        field302++;
        int var5 = (arg2 >>> 12 | (arg2 & 0xA0000FFF) << 4) ^ arg1;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class690 var9 = (class690) this.field311.method4203(true, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class5 var10 = (class5) this.field304.method4203(true, var7);
            if (var10 == null) {
                var10 = class5.method30(this.field305, arg2, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field304.method4211(var10, (byte) 104, var7);
            }
            int var11 = -36 % ((9 - arg0) / 41);
            class690 var12 = var10.method27(arg3);
            if (var12 == null) {
                return null;
            } else {
                var10.method3617(1);
                this.field311.method4211(var12, (byte) 83, var7);
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI[I)Lcj;")
    public final class690 method144(byte arg0, int arg1, int[] arg2) {
        field303++;
        if (this.field306.method1454(-1) == 1) {
            return this.method145(arg2, (byte) -102, arg1, 0);
        } else if (this.field306.method1477(0, arg1) == 1) {
            return this.method145(arg2, (byte) -68, 0, arg1);
        } else if (arg0 == 103) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([IBII)Lcj;")
    private final class690 method145(int[] arg0, byte arg1, int arg2, int arg3) {
        field309++;
        int var5 = arg2 ^ ((arg3 & 0x90000FFF) << 4 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        if (arg1 >= -63) {
            this.method144((byte) -66, -70, null);
        }
        long var7 = (long) var6;
        class690 var9 = (class690) this.field311.method4203(true, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class88 var10 = class88.method829(this.field306, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            class690 var11 = var10.method831();
            this.field311.method4211(var11, (byte) 101, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field9711.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZIILlda;Llda;Z)I")
    public static final int method146(int arg0, boolean arg1, int arg2, int arg3, class483 arg4, class483 arg5, boolean arg6) {
        field307++;
        if (arg0 <= 58) {
            method148((byte) 27);
        }
        int var7 = class14.method77(arg4, arg5, arg3, -5889, arg6);
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var8 = class14.method77(arg4, arg5, arg2, -5889, arg1);
            return arg1 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(BI[I)Lcj;")
    public final class690 method147(byte arg0, int arg1, int[] arg2) {
        field301++;
        if (arg0 != -119) {
            field313 = -127;
        }
        if (this.field305.method1454(-1) == 1) {
            return this.method143((byte) -42, arg1, 0, arg2);
        } else if (this.field305.method1477(0, arg1) == 1) {
            return this.method143((byte) 97, 0, arg1, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static void method148(byte arg0) {
        field310 = null;
        field308 = null;
        if (arg0 >= -70) {
            method148((byte) 100);
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Leq;Leq;)V")
    public class24(class209 arg0, class209 arg1) {
        this.field306 = arg0;
        this.field305 = arg1;
    }
}
