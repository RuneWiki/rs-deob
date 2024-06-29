import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class269 extends class209 {

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
    private int field4343;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    private int field4337;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    private int field4340;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    private int field4336;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "I")
    private int field4350;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    private int field4342;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
    private int field4345;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    private int field4334;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field4339 = null;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "Z")
    public static boolean field4338 = true;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4341 = "Cancel";

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIB)Ldb;")
    public static final class17 method1865(int arg0, int arg1, int arg2, byte arg3) {
        ++field4349;
        class17 var4 = new class17();
        var4.field191 = arg2;
        var4.field188 = arg1;
        class124.field1806.method1032(false, var4, (long) arg0);
        class92.method725(false, arg2);
        class131 var5 = class122.method891(arg0, (byte) -121);
        if (var5 != null) {
            class274.method1896(var5, arg3 ^ 30);
        }
        if (class211.field3390 != null) {
            class274.method1896(class211.field3390, arg3 ^ 30);
            class211.field3390 = null;
        }
        int var6 = class243.field3890;
        if (arg3 != 20) {
            return null;
        } else {
            for (int var7 = 0; ~var7 > ~var6; ++var7) {
                if (class141.method1009(class207.field3318[var7], -4)) {
                    class25.method180(var7, (byte) -128);
                }
            }
            if (class243.field3890 == 1) {
                class206.field3315 = false;
                class194.method1440(class98.field1440, class116.field1670, class192.field3096, arg3 ^ -37, class101.field1500);
            } else {
                class194.method1440(class98.field1440, class116.field1670, class192.field3096, -47, class101.field1500);
                int var8 = class285.field4511.method1257(class280.field4466);
                for (int var9 = 0; ~class243.field3890 < ~var9; ++var9) {
                    int var10 = class285.field4511.method1257(class188.method1401(2, var9));
                    if (~var10 < ~var8) {
                        var8 = var10;
                    }
                }
                class98.field1440 = (class202.field3232 ? 26 : 22) + class243.field3890 * 15;
                class101.field1500 = var8 + 8;
            }
            if (var5 != null) {
                class289.method1962(var5, false, false);
            }
            class59.method428((byte) 12, arg2);
            if (class211.field3384 != -1) {
                class113.method832((byte) -106, 1, class211.field3384);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
    public static void method1866(byte arg0) {
        field4341 = null;
        int var1 = 32 % ((arg0 - 47) / 43);
        field4339 = null;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(III)V")
    public final void method318(int arg0, int arg1, int arg2) {
        ++field4335;
        int var4 = -18 / ((-72 - arg0) / 54);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)V")
    public static final void method1867(byte arg0) {
        ++field4347;
        if (arg0 >= 69) {
            if (!class194.field3128) {
                class194.field3128 = true;
                class211.field3380 = true;
                if (class113.field1640) {
                    class123.field1799 = (float) (-16 & (int) class123.field1799 - -47);
                } else {
                    class151.field2448 += (12.0F - class151.field2448) / 2.0F;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIB)V")
    public final void method322(int arg0, int arg1, byte arg2) {
        ++field4344;
        int var4 = 100 / ((arg2 - -55) / 60);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Llc;Llc;I)V")
    public static final void method1868(class86 arg0, class86 arg1, int arg2) {
        class43.field625 = arg1;
        ++field4351;
        class224.field3583 = arg0;
        if (arg2 > -30) {
            field4339 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILlc;)I")
    public static final int method1869(int arg0, class86 arg1) {
        ++field4352;
        int var2 = 0;
        if (arg1.method634(class229.field3695, 0)) {
            ++var2;
        }
        if (arg1.method634(class75.field1081, arg0 + -8575)) {
            ++var2;
        }
        if (arg1.method634(class17.field192, 0)) {
            ++var2;
        }
        if (arg1.method634(class243.field3912, 0)) {
            ++var2;
        }
        if (arg1.method634(class229.field3681, 0)) {
            ++var2;
        }
        if (arg1.method634(class253.field4185, 0)) {
            ++var2;
        }
        if (arg1.method634(class174.field2833, 0)) {
            ++var2;
        }
        if (arg1.method634(class135.field2210, 0)) {
            ++var2;
        }
        if (arg1.method634(class145.field2349, 0)) {
            ++var2;
        }
        if (arg1.method634(class196.field3184, 0)) {
            ++var2;
        }
        if (arg1.method634(class16.field177, 0)) {
            ++var2;
        }
        if (arg1.method634(class21.field244, arg0 ^ arg0)) {
            ++var2;
        }
        if (arg1.method634(class124.field1810, 0)) {
            ++var2;
        }
        if (arg1.method634(class256.field4219, 0)) {
            ++var2;
        }
        if (arg1.method634(class29.field362, 0)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(III)V")
    public final void method319(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.field4343 = -55;
        }
        int var4 = this.field4336 * arg2 >> 12;
        ++field4346;
        int var5 = this.field4337 * arg0 >> 12;
        int var6 = this.field4350 * arg2 >> 12;
        int var7 = this.field4340 * arg0 >> 12;
        int var8 = this.field4334 * arg0 >> 12;
        int var9 = this.field4343 * arg2 >> 12;
        int var10 = this.field4342 * arg0 >> 12;
        int var11 = this.field4345 * arg2 >> 12;
        class287.method1952(var4, var5, -110, var9, var8, var6, var7, var10, var11, super.field3349);
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4343 = arg5;
        this.field4337 = arg0;
        this.field4340 = arg4;
        this.field4336 = arg1;
        this.field4350 = arg3;
        this.field4342 = arg6;
        this.field4345 = arg7;
        this.field4334 = arg2;
    }
}
