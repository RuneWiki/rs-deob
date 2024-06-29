import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class237 extends class205 {

    @OriginalMember(owner = "client!rm", name = "I", descriptor = "I")
    private final int field3910;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
    private final int field3897;

    @OriginalMember(owner = "client!rm", name = "J", descriptor = "I")
    private final int field3911;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
    private int field3896;

    @OriginalMember(owner = "client!rm", name = "y", descriptor = "Lqd;")
    public static class40 field3901 = class147.method1106("Lade Sprites )2 ", (byte) -54);

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "[Lqd;")
    public static class40[] field3898 = new class40[200];

    @OriginalMember(owner = "client!rm", name = "G", descriptor = "Lqd;")
    private static class40 field3908 = class147.method1106("flash1:", (byte) -80);

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "[J")
    public static long[] field3900 = new long[256];

    @OriginalMember(owner = "client!rm", name = "M", descriptor = "Lqd;")
    public static class40 field3914 = field3908;

    @OriginalMember(owner = "client!rm", name = "K", descriptor = "Lqd;")
    public static class40 field3912 = field3908;

    @OriginalMember(owner = "client!rm", name = "Q", descriptor = "F")
    public static float field3918;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
    private int field3895;

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!rm", name = "B", descriptor = "I")
    private int field3904;

    @OriginalMember(owner = "client!rm", name = "D", descriptor = "I")
    private int field3905;

    @OriginalMember(owner = "client!rm", name = "E", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!rm", name = "F", descriptor = "I")
    private int field3907;

    @OriginalMember(owner = "client!rm", name = "L", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!rm", name = "N", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!rm", name = "O", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!rm", name = "A", descriptor = "Luj;")
    public static class135 field3903;

    @OriginalMember(owner = "client!rm", name = "P", descriptor = "Lce;")
    public static class239 field3917;

    @OriginalMember(owner = "client!rm", name = "H", descriptor = "[B")
    private byte[] field3909;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "[I")
    public static int[] field3894;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)V", line = 7)
    public void method82(int arg0, byte arg1) {
        this.field3909[arg0] = arg1;
        field3902++;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIII)V", line = 17)
    public static final void method1639(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 760177601) {
            field3903 = (class135) null;
        }
        field3915++;
        if (class294.field4940 == 1) {
            class140.field2366[class233.field3845 / 100].method744(class43.field814 - 8, class274.field4545 + -8);
        }
        if (class294.field4940 == 2) {
            class140.field2366[(class233.field3845 / 100) + 4].method744(class43.field814 - 8, class274.field4545 + -8);
        }
        class189.method1367((byte) -105);
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)V", line = 40)
    public final void method1443(byte arg0) {
        this.field3895 = 0;
        field3913++;
        this.field3905 = 0;
        int var2 = -96 % ((arg0 + 34) / 55);
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V", line = 56)
    public static void method1640(int arg0) {
        field3900 = null;
        if (arg0 != 4096) {
            field3903 = (class135) null;
        }
        field3894 = null;
        field3917 = null;
        field3908 = null;
        field3914 = null;
        field3901 = null;
        field3912 = null;
        field3903 = null;
        field3898 = null;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(IIIIIFFF)V", line = 77)
    public class237(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3910 = (int) (arg7 * 4096.0F);
        this.field3897 = (int) (arg6 * 4096.0F);
        this.field3896 = this.field3911 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(B)V", line = 100)
    public final void method1445(byte arg0) {
        this.field3896 = this.field3911;
        this.field3895 >>= 0x4;
        field3906++;
        if (this.field3895 < 0) {
            this.field3895 = 0;
        } else if (this.field3895 > 255) {
            this.field3895 = 255;
        }
        if (arg0 > -113) {
            field3917 = (class239) null;
        }
        this.method82(this.field3905++, (byte) this.field3895);
        this.field3895 = 0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3900[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lqd;IILqd;)V", line = 148)
    public static final void method1641(class40 arg0, int arg1, int arg2, class40 arg3) {
        class233.field3832 = arg2;
        class264.field4433 = arg0;
        if (arg1 < 47) {
            method1639(92, 95, 37, 113, 11);
        }
        field3899++;
        class264.field4434 = arg3;
        if (class264.field4434.method345(class264.field4421, false) || class264.field4433.method345(class264.field4421, false)) {
            class271.field4501 = 3;
        } else if (class81.field1426 == -1) {
            class92.field1669 = 0;
            class194.field3134 = 1;
            class271.field4501 = -3;
            class204.field3241 = 0;
            class26 var4 = new class26(128);
            var4.method218(10, -19914);
            var4.method209(16711680, (int) (Math.random() * 99999.0D));
            var4.method209(16711680, 521);
            var4.method241(class264.field4434.method362(-25194), 125);
            var4.method239((byte) 113, (int) (Math.random() * 9.9999999E7D));
            var4.method206(class264.field4433, (byte) -76);
            var4.method239((byte) 99, (int) (Math.random() * 9.9999999E7D));
            var4.method240(class91.field1653, class253.field4192, (byte) 69);
            class19.field295.field478 = 0;
            class19.field295.method218(222, -19914);
            class19.field295.method218(var4.field478, -19914);
            class19.field295.method189(0, var4.field478, var4.field472, -107);
        } else {
            class172.method1271(88);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V", line = 197)
    public final void method1447(int arg0, int arg1, int arg2) {
        field3916++;
        if (arg0 <= 42) {
            return;
        }
        if (arg1 == 0) {
            this.field3907 = this.field3897 - (arg2 >= 0 ? arg2 : -arg2);
            this.field3904 = 4096;
            this.field3907 = this.field3907 * this.field3907 >> 12;
            this.field3895 = this.field3907;
            return;
        }
        this.field3904 = this.field3910 * this.field3907 >> 12;
        this.field3907 = this.field3897 - (arg2 >= 0 ? arg2 : -arg2);
        this.field3907 = this.field3907 * this.field3907 >> 12;
        if (this.field3904 < 0) {
            this.field3904 = 0;
        } else if (this.field3904 > 4096) {
            this.field3904 = 4096;
        }
        this.field3907 = this.field3907 * this.field3904 >> 12;
        this.field3895 += this.field3907 * this.field3896 >> 12;
        this.field3896 = this.field3911 * this.field3896 >> 12;
    }
}
