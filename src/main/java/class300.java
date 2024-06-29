import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class300 {

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "Lica;")
    private class205 field4390 = new class205(256);

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "Lica;")
    private class205 field4400 = new class205(256);

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "Ldda;")
    private class597 field4399;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "Ldda;")
    private class597 field4391;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "Lqp;")
    public static class586 field4395 = new class586(95, 8);

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(III)Z")
    public static final boolean method1855(int arg0, int arg1, int arg2) {
        field4393++;
        if (arg2 == 22753) {
            return (class237.field3473[1][arg0][arg1] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "([IIII)Lmca;")
    private final class5 method1856(int[] arg0, int arg1, int arg2, int arg3) {
        field4396++;
        int var5 = arg2 ^ (arg1 >>> 12 | (arg1 & 0x50000FFF) << 4);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class5 var9 = (class5) this.field4400.method1333(var7, false);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            if (arg3 != -1) {
                this.method1859(-118, null, 12);
            }
            class299 var10 = (class299) this.field4390.method1333(var7, false);
            if (var10 == null) {
                var10 = class299.method1852(this.field4391, arg1, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field4390.method1341(var10, (byte) -125, var7);
            }
            class5 var11 = var10.method1849(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method2997(1);
                this.field4400.method1341(var11, (byte) 58, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
    public static void method1857(byte arg0) {
        field4395 = null;
        if (arg0 != 31) {
            method1860(93, null);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "([III)Lmca;")
    public final class5 method1858(int[] arg0, int arg1, int arg2) {
        field4398++;
        if (this.field4391.method3477(false) == 1) {
            return this.method1856(arg0, 0, arg1, -1);
        } else if (this.field4391.method3462(arg1, 67) == arg2) {
            return this.method1856(arg0, arg1, 0, arg2 ^ 0xFFFFFFFE);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I[II)Lmca;")
    public final class5 method1859(int arg0, int[] arg1, int arg2) {
        field4397++;
        if (arg0 != -22055) {
            this.method1856(null, -100, 38, -10);
        }
        if (this.field4399.method3477(false) == 1) {
            return this.method1861(arg1, (byte) -128, 0, arg2);
        } else if (this.field4399.method3462(arg2, arg0 ^ 0x5653) == 1) {
            return this.method1861(arg1, (byte) -107, arg2, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILmaa;)Z")
    public static final boolean method1860(int arg0, class42 arg1) {
        field4392++;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field510) {
            return false;
        } else if (!arg1.method220((byte) 109, class113.field1422)) {
            return false;
        } else if (arg0 <= 68) {
            return false;
        } else if (class97.field1206.method1333((long) arg1.field509, false) == null) {
            return class163.field2178.method1333((long) arg1.field470, false) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "([IBII)Lmca;")
    private final class5 method1861(int[] arg0, byte arg1, int arg2, int arg3) {
        field4394++;
        int var5 = arg3 ^ (arg2 >>> 12 | arg2 << 4 & 0xFFF9);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class5 var9 = (class5) this.field4400.method1333(var7, false);
        if (arg1 >= -94) {
            field4403 = 41;
        }
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class48 var10 = class48.method248(this.field4399, arg2, arg3);
            if (var10 == null) {
                return null;
            }
            class5 var11 = var10.method246();
            this.field4400.method1341(var11, (byte) 86, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field45.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Ldda;Ldda;)V")
    public class300(class597 arg0, class597 arg1) {
        this.field4399 = arg0;
        this.field4391 = arg1;
    }
}
