import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class266 extends class249 implements class170 {

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    private int field4371 = 50;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "Z")
    private boolean field4369 = false;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "Lfa;")
    private class273 field4374;

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "Lfa;")
    private class273 field4384;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "Lkf;")
    private class193 field4376;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "Lkf;")
    private class193 field4377;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    public static int field4379 = 0;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "Z")
    public static boolean field4381 = false;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "Lfa;")
    public static class273 field4385;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)V")
    public static void method1835(byte arg0) {
        field4385 = null;
        if (arg0 != 67) {
            field4379 = -51;
        }
    }

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(II)Ln;")
    private final class17 method1836(int arg0, int arg1) {
        field4378++;
        class17 var3 = (class17) this.field4376.method1343(63, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field4384.method1877(0, arg0, (byte) 38);
        if (arg1 != 28485) {
            this.field4377 = null;
        }
        if (var4 == null) {
            return null;
        } else {
            class17 var5 = new class17(new class202(var4));
            this.field4376.method1337(var5, (long) arg0, arg1 ^ 0xFFFF90BA);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILcl;I)V")
    public static final void method1837(int arg0, int arg1, class208 arg2, int arg3) {
        if (arg3 != 1) {
            return;
        }
        field4391++;
        if (arg2.field853 == arg0 && arg0 != -1) {
            class200 var4 = class196.method1359(arg0, (byte) 21);
            int var5 = var4.field3171;
            if (var5 == 1) {
                arg2.field813 = 0;
                arg2.field873 = 0;
                arg2.field883 = arg1;
                arg2.field867 = 1;
                arg2.field889 = 0;
                class49.method303(false, class309.field5006 == arg2, arg2.field836, arg2.field813, var4, arg2.field850);
            }
            if (var5 == 2) {
                arg2.field889 = 0;
                return;
            }
        } else if (arg0 == -1 || arg2.field853 == -1 || class196.method1359(arg0, (byte) 21).field3173 >= class196.method1359(arg2.field853, (byte) 21).field3173) {
            arg2.field856 = arg2.field862;
            arg2.field853 = arg0;
            arg2.field813 = 0;
            arg2.field889 = 0;
            arg2.field867 = 1;
            arg2.field883 = arg1;
            arg2.field873 = 0;
            if (arg2.field853 == -1) {
                return;
            }
            class49.method303(false, class309.field5006 == arg2, arg2.field836, arg2.field813, class196.method1359(arg2.field853, (byte) 21), arg2.field850);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIFZI)Lea;")
    public final class38 method1122(int arg0, int arg1, float arg2, boolean arg3, int arg4) {
        if (arg1 != -8933) {
            field4379 = -32;
        }
        field4375++;
        class17 var6 = this.method1836(arg0, 28485);
        if (var6 != null && var6.method109(this, this.field4374)) {
            return arg3 ? var6.field241.method760(this.field4374, false, this, arg4, arg4, (double) arg2, (byte) -125) : var6.field241.method764((double) arg2, 109, false, arg4, this, this.field4374, arg4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IFI)[I")
    public final int[] method1124(int arg0, float arg1, int arg2) {
        field4383++;
        class17 var4 = this.method1836(arg0, 28485);
        if (var4 == null) {
            return null;
        }
        var4.field239 = true;
        if (arg2 != 255) {
            method1835((byte) -55);
        }
        return var4.method107(this, this.field4374, arg1, this.field4369 || this.method378(arg0, (byte) 86).field678);
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(II)Z")
    public final boolean method1125(int arg0, int arg1) {
        field4390++;
        if (arg1 != 64) {
            this.method1839(71, -62);
        }
        return this.method378(arg0, (byte) 86).field671;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(II)Z")
    public final boolean method1123(int arg0, int arg1) {
        field4389++;
        if (this.field4369 || this.method378(arg0, (byte) 86).field678) {
            return true;
        } else {
            if (arg1 <= 24) {
                this.method1122(-127, 68, -1.2229196F, true, -39);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)Lfi;")
    public final class117 method1737(byte arg0, int arg1) {
        if (arg0 > -65) {
            this.method1840(75);
        }
        class17 var3 = this.method1836(arg1, 28485);
        field4372++;
        return var3 == null ? null : var3.field241;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)I")
    public final int method1120(int arg0, int arg1) {
        int var3 = 44 / ((arg1 + 38) / 38);
        field4388++;
        return this.method378(arg0, (byte) 86).field670 & 0xFFFF;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZI)V")
    public final void method1838(boolean arg0, int arg1) {
        this.field4369 = arg0;
        this.method1840(255);
        if (arg1 >= 79) {
            field4386++;
        }
    }

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "(II)V")
    public final void method1839(int arg0, int arg1) {
        class17 var3 = (class17) this.field4376.method1339((byte) -78);
        if (arg1 != 255) {
            this.method1120(-53, -52);
        }
        while (var3 != null) {
            if (var3.field239) {
                var3.method108(arg0);
                var3.field239 = false;
            }
            var3 = (class17) this.field4376.method1340(false);
        }
        field4387++;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)Z")
    public final boolean method1121(int arg0, int arg1) {
        field4380++;
        if (arg0 != 0) {
            this.method1840(-3);
        }
        return !this.method378(arg1, (byte) 86).field675;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lfa;Lfa;Lfa;IZ)V")
    public class266(class273 arg0, class273 arg1, class273 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field4371 = arg3;
        this.field4369 = arg4;
        this.field4374 = arg2;
        this.field4384 = arg0;
        this.field4376 = new class193(this.field4371);
        this.field4377 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public final void method1840(int arg0) {
        if (arg0 != 255) {
            return;
        }
        field4382++;
        this.field4376.method1338(false);
        if (this.field4377 != null) {
            this.field4377.method1338(false);
        }
        class17.field242 = null;
    }
}
