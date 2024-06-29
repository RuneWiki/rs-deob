import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class232 {

    @OriginalMember(owner = "client!sda", name = "i", descriptor = "Lhj;")
    public class528 field3615 = null;

    @OriginalMember(owner = "client!sda", name = "g", descriptor = "[Lwn;")
    public class673[] field3613 = null;

    @OriginalMember(owner = "client!sda", name = "m", descriptor = "Lhj;")
    public class528 field3619 = null;

    @OriginalMember(owner = "client!sda", name = "k", descriptor = "[Lwn;")
    public class673[] field3617 = null;

    @OriginalMember(owner = "client!sda", name = "n", descriptor = "Lhj;")
    public class528 field3620 = null;

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "Z")
    public boolean field3609;

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "I")
    public static int field3611 = 104;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!sda", name = "h", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!sda", name = "j", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!sda", name = "l", descriptor = "[[Lrga;")
    public static class215[][] field3618;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (class313 var7 = (class313) class208.field2926.method2417(false); var7 != null; var7 = (class313) class208.field2926.method2414(true)) {
            if (var7.field4629 <= class564.field7962) {
                var7.method3414(0);
            } else {
                class683.method3778((var7.field4625 << 9) + 256, (var7.field4627 << 9) - -256, var7.field4622, arg3 >> 1, arg5 >> 1, arg0, var7.field4624 * 2, true, arg6);
                class26.field391.method2494(0, var7.field4628 | 0xFF000000, class287.field4269[0] + arg4, var7.field4631, -110, class287.field4269[1] + arg2);
            }
        }
        field3608++;
        if (arg1 != 1) {
            field3611 = 62;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V")
    public static void method1595(int arg0) {
        if (arg0 != -25602) {
            method1596(105, -75, 44, null);
        }
        field3618 = null;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IIILuc;)Lmp;")
    public static final class706 method1596(int arg0, int arg1, int arg2, class27 arg3) {
        field3610++;
        int var4 = arg0 << 10 | arg3.field394;
        class706 var5 = (class706) class102.field1605.method1097((long) var4 << 16, (byte) -121);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class518.field7311.method2994(class518.field7311.method2975(94, var4), (byte) 93);
        if (var6 == null) {
            int var8 = arg2 + 65536 << 10 | arg3.field394;
            class706 var9 = (class706) class102.field1605.method1097((long) var8 << 16, (byte) -121);
            if (var9 != null) {
                return var9;
            } else if (arg1 == 2107503184) {
                byte[] var10 = class518.field7311.method2994(class518.field7311.method2975(61, var8), (byte) 93);
                if (var10 == null) {
                    int var12 = arg3.field394 | 0x3FFFC00;
                    class706 var13 = (class706) class102.field1605.method1097((long) var12 << 16, (byte) -121);
                    if (var13 != null) {
                        return var13;
                    }
                    byte[] var14 = class518.field7311.method2994(class518.field7311.method2975(72, var12), (byte) 93);
                    if (var14 == null) {
                        return null;
                    } else if (var14.length <= 1) {
                        return null;
                    } else {
                        class706 var15 = class511.method2927(arg1 - 2107503137, var14);
                        var15.field9935 = arg3;
                        class102.field1605.method1095((long) var12 << 16, (byte) -120, var15);
                        return var15;
                    }
                } else if (var10.length <= 1) {
                    return null;
                } else {
                    class706 var11 = class511.method2927(-121, var10);
                    var11.field9935 = arg3;
                    class102.field1605.method1095((long) var8 << 16, (byte) -110, var11);
                    return var11;
                }
            } else {
                return null;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class706 var7 = class511.method2927(107, var6);
            var7.field9935 = arg3;
            class102.field1605.method1095((long) var4 << 16, (byte) -111, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lpu;Lpu;ILpu;Lpu;)V")
    public static final void method1597(class522 arg0, class522 arg1, int arg2, class522 arg3, class522 arg4) {
        class120.field1826 = arg0;
        class287.field4277 = arg1;
        field3607++;
        class261.field3971 = arg4;
        class181.field2558 = new class49[class261.field3971.method2977((byte) -95)][];
        if (arg2 != -923303222) {
            field3611 = 109;
        }
        class518.field7302 = new boolean[class261.field3971.method2977((byte) -95)];
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IB)Z")
    public static final boolean method1598(int arg0, byte arg1) {
        if (arg1 == 78) {
            field3612++;
            return arg0 != 1 && arg0 != 7;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lok;)V")
    public class232(class228 arg0) {
        this.field3609 = arg0.field3494;
        class385.method2297(arg0, false);
        if (this.field3609) {
            byte[] var6 = class59.method633(false, false, class588.field8244);
            this.field3619 = new class528(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class59.method633(false, false, class334.field4950);
            this.field3620 = new class528(arg0, 6410, 128, 128, 16, var7, 6410);
            class358 var8 = arg0.field3403;
            if (var8.method2184((byte) 109)) {
                byte[] var9 = class59.method633(false, false, class577.field8129);
                this.field3615 = new class528(arg0, 6408, 128, 128, 16);
                class528 var10 = new class528(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method2183(var10, 2.0F, 0, this.field3615)) {
                    this.field3615.method3621(1);
                } else {
                    this.field3615.method3616(2867);
                    this.field3615 = null;
                }
                var10.method3616(2867);
            }
        } else {
            this.field3613 = new class673[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class548.method3102(true, class588.field8244, 32768, var2 * 16384 * 2);
                this.field3613[var2] = new class673(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field3617 = new class673[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class548.method3102(true, class334.field4950, 32768, var3 * 128 * 2 * 128);
                this.field3617[var3] = new class673(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
