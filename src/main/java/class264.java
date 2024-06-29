import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class264 {

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Lpo;")
    private class375 field3998 = new class375();

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    private int field3996;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    private int field4004;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Lke;")
    private class407 field3994;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Z")
    public static boolean field3986 = false;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "[I")
    public static int[] field3997 = new int[8];

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 4)
    public static void method1602(int arg0) {
        field3997 = null;
        if (arg0 != -6071) {
            method1609(-48, -94, 124);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V", line = 14)
    public final void method1603(int arg0) {
        field3999++;
        int var2 = 88 / ((arg0 - 45) / 53);
        this.field3998.method2257((byte) -101);
        this.field3994.method2412(117);
        this.field3996 = this.field4004;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lah;IBLjava/lang/Object;)V", line = 26)
    private final void method1604(class250 arg0, int arg1, byte arg2, Object arg3) {
        field3992++;
        if (arg1 > this.field4004) {
            throw new IllegalStateException("s>cs");
        }
        this.method1612(868, arg0);
        this.field3996 -= arg1;
        while (this.field3996 < 0) {
            class352 var6 = (class352) this.field3998.method2254((byte) -124);
            this.method1606(var6, (byte) 55);
        }
        if (arg2 <= -18) {
            class405 var5 = new class405(arg0, arg3, arg1);
            this.field3994.method2413(arg0.method1357((byte) 119), -1, var5);
            this.field3998.method2256(var5, 30978);
            var5.field3839 = 0L;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLah;)Ljava/lang/Object;", line = 55)
    public final Object method1605(byte arg0, class250 arg1) {
        field3988++;
        long var3 = arg1.method1357((byte) 119);
        class352 var5 = (class352) this.field3994.method2409(false, var3);
        if (arg0 != -5) {
            this.method1604(null, 82, (byte) -40, null);
        }
        while (var5 != null) {
            if (var5.field5180.method1359((byte) 90, arg1)) {
                Object var6 = var5.method1783((byte) -72);
                if (var6 != null) {
                    if (var5.method1782((byte) 115)) {
                        class405 var7 = new class405(arg1, var6, var5.field5176);
                        this.field3994.method2413(var5.field2798, arg0 + 4, var7);
                        this.field3998.method2256(var7, 30978);
                        var7.field3839 = 0L;
                        var5.method1121(false);
                        var5.method1512((byte) 122);
                    } else {
                        this.field3998.method2256(var5, arg0 ^ 0xFFFF86F9);
                        var5.field3839 = 0L;
                    }
                    return var6;
                }
                var5.method1121(false);
                var5.method1512((byte) 118);
                this.field3996 += var5.field5176;
            }
            var5 = (class352) this.field3994.method2410((byte) 121);
        }
        return null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lhl;B)V", line = 109)
    private final void method1606(class352 arg0, byte arg1) {
        if (arg0 != null) {
            arg0.method1121(false);
            arg0.method1512((byte) 119);
            this.field3996 += arg0.field5176;
        }
        if (arg1 < 47) {
            method1615(null, -69, 90);
        }
        field4001++;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)I", line = 137)
    public final int method1607(int arg0) {
        field4005++;
        if (arg0 > -99) {
            this.method1605((byte) 56, null);
        }
        return this.field3996;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V", line = 148)
    public final void method1608(int arg0, int arg1) {
        if (arg1 != 544) {
            field3986 = true;
        }
        if (class139.field2276 != null) {
            for (class352 var3 = (class352) this.field3998.method2260((byte) 57); var3 != null; var3 = (class352) this.field3998.method2258(arg1 - 544)) {
                if (var3.method1782((byte) -102)) {
                    if (var3.method1783((byte) -72) == null) {
                        var3.method1121(false);
                        var3.method1512((byte) 119);
                        this.field3996 += var3.field5176;
                    }
                } else if (++var3.field3839 > (long) arg0) {
                    class352 var4 = class139.field2276.method296(var3, (byte) -86);
                    this.field3994.method2413(var3.field2798, -1, var4);
                    class46.method324(var4, arg1 - 662, var3);
                    var3.method1121(false);
                    var3.method1512((byte) 123);
                }
            }
        }
        field3990++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Z", line = 198)
    public static final boolean method1609(int arg0, int arg1, int arg2) {
        field4000++;
        return arg0 == 876 ? (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0 : false;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)I", line = 215)
    public final int method1610(int arg0) {
        field4003++;
        return arg0 == 0 ? this.field4004 : -16;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lah;ILjava/lang/Object;)V", line = 230)
    public final void method1611(class250 arg0, int arg1, Object arg2) {
        field3987++;
        this.method1604(arg0, arg1, (byte) -33, arg2);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILah;)V", line = 239)
    private final void method1612(int arg0, class250 arg1) {
        field3991++;
        long var3 = arg1.method1357((byte) 119);
        class352 var5 = (class352) this.field3994.method2409(false, var3);
        if (arg0 != 868) {
            this.method1606(null, (byte) -112);
        }
        while (var5 != null) {
            if (var5.field5180.method1359((byte) -67, arg1)) {
                this.method1606(var5, (byte) 126);
                return;
            }
            var5 = (class352) this.field3994.method2410((byte) 56);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([BB)[B", line = 265)
    public static final byte[] method1613(byte[] arg0, byte arg1) {
        field3993++;
        if (arg0 == null) {
            return null;
        } else {
            int var2 = -25 % ((arg1 - 31) / 46);
            byte[] var3 = new byte[arg0.length];
            class356.method2184(arg0, 0, var3, 0, arg0.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V", line = 282)
    public final void method1614(boolean arg0) {
        field4002++;
        for (class352 var2 = (class352) this.field3998.method2260((byte) 46); var2 != null; var2 = (class352) this.field3998.method2258(0)) {
            if (var2.method1782((byte) 47)) {
                var2.method1121(false);
                var2.method1512((byte) 119);
                this.field3996 += var2.field5176;
            }
        }
        if (arg0) {
            this.method1607(-100);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Llt;II)Ljv;", line = 310)
    public static final class52 method1615(class458 arg0, int arg1, int arg2) {
        field3995++;
        byte[] var3 = arg0.method2734(arg1, (byte) 78);
        if (arg2 != 1) {
            field3989 = 14;
        }
        return var3 == null ? null : new class52(var3);
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(I)V", line = 332)
    public class264(int arg0) {
        this.field3996 = arg0;
        this.field4004 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field3994 = new class407(var2);
    }
}
