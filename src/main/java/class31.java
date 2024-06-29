import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class31 extends class44 {

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "I")
    public static int field469 = 0;

    @OriginalMember(owner = "client!kb", name = "jb", descriptor = "[I")
    public static int[] field479 = new int[5];

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "Lbe;")
    public static class283 field470 = class153.method941(-91, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "client!kb", name = "fb", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!kb", name = "gb", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!kb", name = "hb", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!kb", name = "kb", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!kb", name = "lb", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!kb", name = "ib", descriptor = "Lih;")
    public class30 field478;

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "[B")
    public byte[] field471;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V", line = 5)
    public static void method211(byte arg0) {
        field479 = null;
        field470 = null;
        if (arg0 != 11) {
            field470 = (class283) null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "(I)I", line = 29)
    public final int method212(int arg0) {
        field476++;
        if (arg0 != 512) {
            method214((class172) null, 127);
        }
        return this.field602 ? 0 : 100;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIZII)V", line = 44)
    public static final void method213(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class170.field2872 = arg6;
        class252.field4283 = arg5;
        if (arg0 != 128) {
            return;
        }
        field475++;
        class111.field1883 = arg2;
        class192.field3296 = arg1;
        class57.field788 = arg3;
        if (arg4 && class111.field1883 >= 100) {
            class116.field1976 = class252.field4283 * 128 + 64;
            class135.field2273 = class192.field3296 * 128 + 64;
            class63.field876 = class42.method254(class61.field850, class135.field2273, class116.field1976, -20341) - class57.field788;
        }
        class26.field377 = 2;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lek;I)V", line = 72)
    public static final void method214(class172 arg0, int arg1) {
        class278.field4650 = arg0.method1097(class247.field4227, 0);
        class301.field5077 = arg0.method1097(class296.field5016, 0);
        class286.field4879 = arg0.method1097(class184.field3171, 0);
        field480++;
        class178.field3071 = arg0.method1097(class83.field1413, 0);
        class121.field2020 = arg0.method1097(class42.field592, 0);
        class66.field920 = arg0.method1097(class295.field4986, 0);
        class129.field2172 = arg0.method1097(class262.field4469, 0);
        class280.field4674 = arg0.method1097(class302.field5107, 0);
        if (arg1 >= -105) {
            method211((byte) 43);
        }
        class126.field2092 = arg0.method1097(class213.field3618, 0);
        class160.field2637 = arg0.method1097(class168.field2812, 0);
        class180.field3113 = arg0.method1097(class234.field3941, 0);
        class121.field2023 = arg0.method1097(class278.field4647, 0);
        class243.field4111 = arg0.method1097(class77.field1349, 0);
        class207.field3559 = arg0.method1097(class261.field4441, 0);
        field477 = arg0.method1097(class272.field4567, 0);
        class190.field3248 = arg0.method1097(class69.field1138, 0);
        class160.field2619 = arg0.method1097(class116.field1968, 0);
        class249.field4244 = arg0.method1097(class226.field3805, 0);
        class15.field173 = arg0.method1097(class68.field963, 0);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIIIII)V", line = 103)
    public static final void method215(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field481++;
        int var6 = arg3 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = class249.field4247 + ((class210.field3582 - class249.field4247) * var6 / 100);
        if (var7 < class74.field1298) {
            var7 = class74.field1298;
        } else if (var7 > class255.field4300) {
            var7 = class255.field4300;
        }
        if (arg4 >= -20) {
            method211((byte) 30);
        }
        int var8 = var7 * 512 * arg3 / (arg1 * 334);
        if (class33.field488 > var8) {
            short var9 = class33.field488;
            var7 = var9 * 334 * arg1 / (arg3 * 512);
            if (class255.field4300 < var7) {
                var7 = class255.field4300;
                int var10 = arg3 * var7 * 512 / (var9 * 334);
                int var11 = (arg1 - var10) / 2;
                if (arg0) {
                    class311.method2107();
                    class311.method2116(arg5, arg2, var11, arg3, 0);
                    class311.method2116(arg1 + arg5 - var11, arg2, var11, arg3, 0);
                }
                arg5 += var11;
                arg1 -= var11 * 2;
            }
        } else if (class94.field1588 < var8) {
            short var12 = class94.field1588;
            var7 = arg1 * 334 * var12 / (arg3 * 512);
            if (class74.field1298 > var7) {
                var7 = class74.field1298;
                int var13 = var12 * 334 * arg1 / (var7 * 512);
                int var14 = (arg3 - var13) / 2;
                if (arg0) {
                    class311.method2107();
                    class311.method2116(arg5, arg2, arg1, var14, 0);
                    class311.method2116(arg5, arg2 + arg3 - var14, arg1, var14, 0);
                }
                arg3 -= var14 * 2;
                arg2 += var14;
            }
        }
        class191.field3288 = arg3 * var7 / 334;
        class225.field3775 = arg2;
        class76.field1322 = (short) arg1;
        class140.field2328 = arg5;
        class177.field3055 = (short) arg3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)[B", line = 209)
    public final byte[] method216(boolean arg0) {
        field472++;
        if (arg0) {
            this.field471 = (byte[]) null;
        }
        if (this.field602) {
            throw new RuntimeException();
        }
        return this.field471;
    }
}
