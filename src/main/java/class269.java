import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class269 {

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Lgl;")
    public class237 field4304 = new class237();

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field4306 = 0;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Z")
    public static boolean field4305 = false;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "Lgl;")
    private class237 field4316;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "[[[B")
    public static byte[][][] field4312;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lgl;")
    public final class237 method1802(int arg0) {
        field4311++;
        class237 var2 = this.field4304.field3914;
        if (this.field4304 == var2) {
            this.field4316 = null;
            return null;
        } else {
            this.field4316 = var2.field3914;
            return arg0 == 43 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lgl;I)V")
    public final void method1803(class237 arg0, int arg1) {
        field4300++;
        if (arg0.field3922 != null) {
            arg0.method1673(arg1 ^ 0xFFFFC751);
        }
        arg0.field3922 = this.field4304.field3922;
        arg0.field3914 = this.field4304;
        if (arg1 != -1) {
            method1809(-6, (class137) null, 65, 118);
        }
        arg0.field3922.field3914 = arg0;
        arg0.field3914.field3922 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1804(String arg0, int arg1) {
        field4313++;
        if (class17.field203 == null) {
            return;
        }
        long var2 = class185.method1296((byte) -103, arg0);
        int var4 = 0;
        if (var2 == 0L) {
            return;
        }
        while (class17.field203.length > var4 && class17.field203[var4].field3923 != var2) {
            var4++;
        }
        if (var4 < class17.field203.length && class17.field203[var4] != null) {
            class4.field57.method1932(false, arg1);
            class4.field57.method590(class17.field203[var4].field3923, 1027669520);
            class252.field4109++;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public final void method1805(int arg0) {
        while (true) {
            class237 var2 = this.field4304.field3914;
            if (this.field4304 == var2) {
                field4303++;
                if (arg0 != -729782270) {
                    return;
                }
                this.field4316 = null;
                return;
            }
            var2.method1673(arg0 + 729796780);
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)Lgl;")
    public final class237 method1806(int arg0) {
        field4301++;
        class237 var2 = this.field4304.field3922;
        if (this.field4304 == var2) {
            this.field4316 = null;
            return null;
        }
        if (arg0 != 1) {
            method1812((byte) 21);
        }
        this.field4316 = var2.field3922;
        return var2;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)Lgl;")
    public final class237 method1807(int arg0) {
        field4310++;
        class237 var2 = this.field4316;
        if (this.field4304 == var2) {
            this.field4316 = null;
            return null;
        } else {
            this.field4316 = var2.field3922;
            return arg0 >= -12 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Lgl;")
    public final class237 method1808(boolean arg0) {
        field4302++;
        class237 var2 = this.field4304.field3914;
        if (this.field4304 == var2) {
            return null;
        } else if (arg0) {
            return null;
        } else {
            var2.method1673(14510);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILeh;II)Lib;")
    public static final class56 method1809(int arg0, class137 arg1, int arg2, int arg3) {
        field4315++;
        if (class111.method714(arg2, arg0, arg1, 56)) {
            return arg3 > -48 ? null : class285.method1909((byte) -122);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lgl;B)V")
    public final void method1810(class237 arg0, byte arg1) {
        field4307++;
        if (arg0.field3922 != null) {
            arg0.method1673(14510);
        }
        arg0.field3914 = this.field4304.field3914;
        arg0.field3922 = this.field4304;
        if (arg1 >= -23) {
            method1813(-8, -35, -78, -66);
        }
        arg0.field3922.field3914 = arg0;
        arg0.field3914.field3922 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
    public static final void method1811(int arg0) {
        if (arg0 != -1886318102) {
            field4305 = true;
        }
        field4309++;
        for (int var1 = 0; var1 < 5; var1++) {
            class272.field4341[var1] = false;
        }
        class182.field2892 = -1;
        class283.field4513 = 1;
        field4299 = 0;
        class292.field4634 = 0;
        class9.field112 = -1;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method1812(byte arg0) {
        if (arg0 <= -113) {
            field4312 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)I")
    public static final int method1813(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 15242) {
            field4299 = -73;
        }
        field4298++;
        if (arg0 > 243) {
            arg1 >>= 0x4;
        } else if (arg0 > 217) {
            arg1 >>= 0x3;
        } else if (arg0 > 192) {
            arg1 >>= 0x2;
        } else if (arg0 > 179) {
            arg1 >>= 0x1;
        }
        return (arg0 >> 1) + (arg1 >> 5 << 7) + (arg2 >> 2 << 10);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V")
    public static final void method1814(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4308++;
        if (arg1 < arg4) {
            class78.method433(arg4, arg1, class14.field186[arg0], arg3, (byte) 123);
        } else {
            class78.method433(arg1, arg4, class14.field186[arg0], arg3, (byte) 123);
        }
        if (arg2 != 18869) {
            method1804((String) null, 10);
        }
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)Lgl;")
    public final class237 method1815(int arg0) {
        field4314++;
        class237 var2 = this.field4316;
        if (arg0 != 0) {
            this.method1806(36);
        }
        if (this.field4304 == var2) {
            this.field4316 = null;
            return null;
        } else {
            this.field4316 = var2.field3914;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class269() {
        this.field4304.field3914 = this.field4304;
        this.field4304.field3922 = this.field4304;
    }
}
