import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class680 {

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Lsga;")
    private class583 field9234 = new class583(256);

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Lsga;")
    private class583 field9242 = new class583(256);

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Lkha;")
    private class687 field9236;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "Lkha;")
    private class687 field9241;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Z")
    public static boolean field9235 = false;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "[F")
    public static float[] field9232 = new float[4];

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "[[I")
    public static int[][] field9228 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field9227;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field9229;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field9230;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field9231;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field9233;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field9237;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field9238;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field9239;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field9240;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([Ljava/lang/Object;Z[I)V", line = 4)
    public static final void method3650(Object[] arg0, boolean arg1, int[] arg2) {
        if (!arg1) {
            class727.method4030(arg2.length - 1, 0, (byte) 93, arg0, arg2);
            field9237++;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III[I)Lma;", line = 15)
    private final class639 method3651(int arg0, int arg1, int arg2, int[] arg3) {
        field9240++;
        int var5 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFF3);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class639 var9 = (class639) this.field9242.method3248(var7, 0);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            if (arg2 != -12080) {
                this.field9236 = null;
            }
            class483 var10 = class483.method2815(this.field9241, arg1, arg0);
            if (var10 == null) {
                return null;
            }
            class639 var11 = var10.method2812();
            this.field9242.method3249(var7, var11, (byte) 84);
            if (arg3 != null) {
                arg3[0] -= var11.field8849.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLlea;)V", line = 55)
    public static final void method3652(boolean arg0, class546 arg1) {
        field9230++;
        if (arg0) {
            return;
        }
        class389 var2 = (class389) class297.field3854.method3248((long) arg1.field354, 0);
        if (var2 == null) {
            return;
        }
        if (var2.field5419 != null) {
            class668.field9148.method664(var2.field5419);
            var2.field5419 = null;
        }
        var2.method3426((byte) -115);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[IZ)Lma;", line = 83)
    public final class639 method3653(int arg0, int[] arg1, boolean arg2) {
        if (arg2) {
            field9235 = false;
        }
        field9227++;
        if (this.field9236.method3816(-126) == 1) {
            return this.method3655(0, arg1, -3317, arg0);
        } else if (this.field9236.method3812(0, arg0) == 1) {
            return this.method3655(arg0, arg1, -3317, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 105)
    public static void method3654(int arg0) {
        field9228 = null;
        if (arg0 != -28511) {
            method3657(3, 0, (byte) 87, -70);
        }
        field9232 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[III)Lma;", line = 118)
    private final class639 method3655(int arg0, int[] arg1, int arg2, int arg3) {
        field9229++;
        int var5 = (arg0 >>> 12 | arg0 << 4 & 0xFFF6) ^ arg3;
        int var6 = var5 | arg0 << 16;
        if (arg2 != -3317) {
            return null;
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class639 var9 = (class639) this.field9242.method3248(var7, arg2 + 3317);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class759 var10 = (class759) this.field9234.method3248(var7, 0);
            if (var10 == null) {
                var10 = class759.method4218(this.field9236, arg0, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field9234.method3249(var7, var10, (byte) 70);
            }
            class639 var11 = var10.method4222(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method3426((byte) -45);
                this.field9242.method3249(var7, var11, (byte) -92);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([Ljava/lang/String;I[S)V", line = 182)
    public static final void method3656(String[] arg0, int arg1, short[] arg2) {
        if (arg1 < 56) {
            field9232 = null;
        }
        class419.method2494(arg0, arg0.length - 1, 4095, arg2, 0);
        field9233++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIBI)Z", line = 194)
    public static final boolean method3657(int arg0, int arg1, byte arg2, int arg3) {
        class716.field10107.method1971(arg0, arg3, arg1, class63.field850);
        field9238++;
        int var4 = class63.field850[2];
        if (var4 < 50) {
            return false;
        }
        class63.field850[2] = var4;
        class63.field850[0] = class63.field850[0] * class458.field6401 / var4 + class302.field3889;
        if (arg2 != -32) {
            method3652(false, null);
        }
        class63.field850[1] = class225.field2974 + (class63.field850[1] * class127.field1538 / var4);
        return true;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[II)Lma;", line = 217)
    public final class639 method3658(int arg0, int[] arg1, int arg2) {
        field9239++;
        if (this.field9241.method3816(arg2 ^ 0xFFFFFF80) == 1) {
            return this.method3651(arg0, 0, -12080, arg1);
        } else if (this.field9241.method3812(arg2 - 1, arg0) == arg2) {
            return this.method3651(0, arg0, -12080, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lkha;Lkha;)V", line = 241)
    public class680(class687 arg0, class687 arg1) {
        this.field9236 = arg1;
        this.field9241 = arg0;
    }
}
