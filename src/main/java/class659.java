import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class659 {

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "Lwr;")
    private class459 field9189 = new class459(256);

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "Lwr;")
    private class459 field9199 = new class459(256);

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "Lni;")
    private class522 field9188;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "Lni;")
    private class522 field9187;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "Lgm;")
    public static class125 field9185 = new class125("", 14);

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "Lea;")
    public static class547 field9195 = new class547(96, 10);

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "Lhda;")
    public static class750 field9196 = new class750(7, 2);

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "Lf;")
    public static class756 field9197 = null;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
    public static int field9186;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    public static int field9190;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
    public static int field9191;

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "I")
    public static int field9192;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "I")
    public static int field9193;

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "I")
    public static int field9194;

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "I")
    public static int field9198;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIII)V")
    public static final void method3724(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 << 3;
        field9190++;
        int var5 = arg3 << 3;
        int var6 = arg1 << 3;
        int var7 = -10 / ((29 - arg2) / 53);
        class183.field2237 = var4;
        if (class8.field57 == 2) {
            class74.field801 = var5;
            class710.field9907 = var4;
            field9198 = var6;
        }
        class255.field3307 = var5;
        class132.method831(true);
        class249.field3236 = true;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(III[I)Lib;")
    private final class155 method3725(int arg0, int arg1, int arg2, int[] arg3) {
        field9194++;
        int var5 = (arg1 << 4 & 0xFFF8 | arg1 >>> 12) ^ arg2;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class155 var9 = (class155) this.field9199.method2552(var7, arg0 ^ 0xFFFFAE88);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class57 var10 = (class57) this.field9189.method2552(var7, -1);
            if (var10 == null) {
                var10 = class57.method329(this.field9187, arg1, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field9189.method2558(var10, var7, arg0 - 20856);
            }
            class155 var11 = var10.method321(arg3);
            if (var11 == null) {
                return null;
            }
            var10.method315(98);
            if (arg0 != 20855) {
                method3726(-68);
            }
            this.field9199.method2558(var11, var7, arg0 - 20856);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
    public static void method3726(int arg0) {
        field9196 = null;
        field9185 = null;
        field9197 = null;
        field9195 = null;
        if (arg0 != -746085692) {
            method3726(-1);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II[I)Lib;")
    public final class155 method3727(int arg0, int arg1, int[] arg2) {
        field9191++;
        if (arg0 == ~this.field9188.method2892((byte) -11)) {
            return this.method3728(14913, arg2, arg1, 0);
        } else if (this.field9188.method2901(0, arg1) == 1) {
            return this.method3728(arg0 + 14915, arg2, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I[III)Lib;")
    private final class155 method3728(int arg0, int[] arg1, int arg2, int arg3) {
        field9186++;
        int var5 = arg2 ^ ((arg3 & 0xA0000FFF) << 4 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class155 var9 = (class155) this.field9199.method2552(var7, -1);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class269 var10 = class269.method1609(this.field9188, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            if (arg0 != 14913) {
                this.method3725(96, 36, 96, null);
            }
            class155 var11 = var10.method1611();
            this.field9199.method2558(var11, var7, -1);
            if (arg1 != null) {
                arg1[0] -= var11.field1995.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IZ[I)Lib;")
    public final class155 method3729(int arg0, boolean arg1, int[] arg2) {
        field9192++;
        if (this.field9187.method2892((byte) -11) == 1) {
            return this.method3725(20855, 0, arg0, arg2);
        } else if (this.field9187.method2901(0, arg0) == 1) {
            return this.method3725(20855, arg0, 0, arg2);
        } else if (arg1) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lni;Lni;)V")
    public class659(class522 arg0, class522 arg1) {
        this.field9188 = arg0;
        this.field9187 = arg1;
    }
}
