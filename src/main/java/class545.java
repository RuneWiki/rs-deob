import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class545 {

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Ldr;")
    private class721 field7199 = new class721();

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    private int field7215;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    private int field7198;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "Ldu;")
    private class360 field7202;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public final void method3044(int arg0) {
        field7206++;
        if (arg0 != -28524) {
            this.method3055(-60, 51, null, null);
        }
        for (class437 var2 = (class437) this.field7199.method4051(896); var2 != null; var2 = (class437) this.field7199.method4049(true)) {
            if (var2.method2172((byte) -106)) {
                var2.method3564(true);
                var2.method2414((byte) -26);
                this.field7198 += var2.field6025;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZLjava/lang/String;IB)V")
    public static final void method3045(boolean arg0, String arg1, int arg2, byte arg3) {
        class395.method2329(-787);
        field7210++;
        if (arg2 == 0) {
            class341.field4807 = class313.method1918(0, 0, class411.field5711.field3912.method74(true) * 2, class252.field3474, class361.field5087, class295.field4217);
            if (arg1 != null) {
                class341.field4807.method392(0);
                class539 var13 = class313.method1919(0, -127, class511.field6790, class275.field3836);
                class60 var14 = class341.field4807.method425(var13, class720.method4047(class84.field1023, class511.field6790, 0), true);
                class565.method3123(false);
                class88.method675(var13, var14, class341.field4807, (byte) -27, true, arg1);
            }
        } else {
            class59 var4 = null;
            if (arg1 != null) {
                var4 = class313.method1918(0, 0, 0, class252.field3474, class361.field5087, class295.field4217);
                var4.method392(0);
                class539 var5 = class313.method1919(0, -127, class511.field6790, class275.field3836);
                class60 var6 = var4.method425(var5, class720.method4047(class84.field1023, class511.field6790, 0), true);
                class565.method3123(false);
                class88.method675(var5, var6, var4, (byte) -27, true, arg1);
            }
            boolean var24 = false;
            label224: {
                try {
                    var24 = true;
                    class341.field4807 = class313.method1918(arg2, 0, class411.field5711.field3912.method74(true) * 2, class252.field3474, class361.field5087, class295.field4217);
                    if (arg1 != null) {
                        var4.method392(0);
                        class539 var7 = class313.method1919(0, -128, class511.field6790, class275.field3836);
                        class60 var8 = var4.method425(var7, class720.method4047(class84.field1023, class511.field6790, 0), true);
                        class565.method3123(false);
                        class88.method675(var7, var8, var4, (byte) -27, true, arg1);
                    }
                    if (class341.field4807.method442()) {
                        boolean var9 = true;
                        try {
                            var9 = class136.field2170.field8620 > 256;
                        } catch (Throwable var28) {
                        }
                        class418 var10;
                        if (var9) {
                            var10 = class341.field4807.method408(146800640);
                        } else {
                            var10 = class341.field4807.method408(104857600);
                        }
                        class341.field4807.method457(var10);
                        var24 = false;
                    } else {
                        var24 = false;
                    }
                    break label224;
                } catch (Throwable var29) {
                    int var11 = class411.field5711.field3913.method3282(true);
                    if (var11 == 2) {
                        class421.field5801 = true;
                    }
                    class411.field5711.method1677(class411.field5711.field3913, (byte) -71, 0);
                    method3045(arg0, arg1, var11, (byte) -112);
                    Object var10000 = null;
                    var24 = false;
                } finally {
                    if (var24) {
                        Object var17 = null;
                        if (var4 != null) {
                            try {
                                var4.method487(95);
                            } catch (Throwable var25) {
                            }
                        }
                    }
                }
                if (var4 != null) {
                    try {
                        var4.method487(95);
                    } catch (Throwable var26) {
                    }
                }
                return;
            }
            Object var16 = null;
            if (var4 != null) {
                try {
                    var4.method487(95);
                } catch (Throwable var27) {
                }
            }
        }
        class411.field5711.field3913.method3284(!arg0, 0);
        class411.field5711.method1677(class411.field5711.field3913, (byte) -71, arg2);
        class704.method3962(0);
        class341.field4807.method492(10000);
        class341.field4807.method479(32);
        class512.field6795 = class341.field4807.method421();
        class178.field2679 = class341.field4807.method421();
        class1.method2((byte) -118);
        class341.field4807.method496(class411.field5711.field3892.method2979(true) == 1);
        if (class341.field4807.method390()) {
            class438.method2519(105, class411.field5711.field3876.method2974(true) == 1);
        }
        class507.method2849(class107.field1453 >> 3, class341.field4807, 5, class719.field10004 >> 3);
        class320.method1940(1);
        class676.field9384 = null;
        class41.field548 = false;
        class50.field641 = true;
        if (arg3 > -111) {
            method3051(-122, 14, -53);
        }
        class596.method3236((byte) -114);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public final void method3046(byte arg0) {
        field7214++;
        this.field7199.method4055((byte) -74);
        this.field7202.method2138(-1);
        int var2 = 43 / ((-arg0 - 77) / 48);
        this.field7198 = this.field7215;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)V")
    public final void method3047(int arg0, int arg1) {
        if (arg1 != 8192) {
            return;
        }
        field7200++;
        if (class265.field3696 == null) {
            return;
        }
        for (class437 var3 = (class437) this.field7199.method4051(896); var3 != null; var3 = (class437) this.field7199.method4049(true)) {
            if (var3.method2172((byte) -90)) {
                if (var3.method2173(-1) == null) {
                    var3.method3564(true);
                    var3.method2414((byte) -26);
                    this.field7198 += var3.field6025;
                }
            } else if ((++var3.field5747) > ((long) arg0)) {
                class437 var4 = class265.field3696.method1458(var3, arg1 - 8193);
                this.field7202.method2143(-1, var4, var3.field8680);
                class548.method3064(var3, var4, (byte) -92);
                var3.method3564(true);
                var3.method2414((byte) -26);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIZ)V")
    public static final void method3048(int arg0, int arg1, int arg2, boolean arg3) {
        field7204++;
        class224 var4 = class131.field2147[arg0][arg1];
        if (!arg3) {
            class388.method2300(var4 == null ? class29.field463 : var4, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLek;)V")
    private final void method3049(byte arg0, class510 arg1) {
        field7212++;
        long var3 = arg1.method765((byte) -92);
        if (arg0 != 110) {
            this.field7215 = 66;
        }
        for (class437 var5 = (class437) this.field7202.method2135(var3, (byte) 31); var5 != null; var5 = (class437) this.field7202.method2141((byte) -78)) {
            if (var5.field6027.method764(arg1, true)) {
                this.method3050(var5, (byte) 74);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lrba;B)V")
    private final void method3050(class437 arg0, byte arg1) {
        if (arg0 != null) {
            arg0.method3564(true);
            arg0.method2414((byte) -26);
            this.field7198 += arg0.field6025;
        }
        field7207++;
        if (arg1 <= 35) {
            this.method3052(118);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Z")
    public static final boolean method3051(int arg0, int arg1, int arg2) {
        field7209++;
        return arg2 == 0 ? ((arg1 & 0x2000) != 0 | class549.method3069(91, arg0, arg1) | class185.method1283(arg0, true, arg1)) & class327.method1980(arg1, arg0, false) : false;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)I")
    public final int method3052(int arg0) {
        if (arg0 < 27) {
            method3048(-28, -22, -28, false);
        }
        field7203++;
        return this.field7215;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(BLek;)Ljava/lang/Object;")
    public final Object method3053(byte arg0, class510 arg1) {
        field7208++;
        long var3 = arg1.method765((byte) 24);
        for (class437 var5 = (class437) this.field7202.method2135(var3, (byte) 31); var5 != null; var5 = (class437) this.field7202.method2141((byte) 120)) {
            if (var5.field6027.method764(arg1, true)) {
                Object var6 = var5.method2173(-1);
                if (var6 != null) {
                    if (var5.method2172((byte) -119)) {
                        class747 var7 = new class747(arg1, var6, var5.field6025);
                        this.field7202.method2143(-1, var7, var5.field8680);
                        this.field7199.method4050(var7, -111);
                        var7.field5747 = 0L;
                        var5.method3564(true);
                        var5.method2414((byte) -26);
                    } else {
                        this.field7199.method4050(var5, -120);
                        var5.field5747 = 0L;
                    }
                    return var6;
                }
                var5.method3564(true);
                var5.method2414((byte) -26);
                this.field7198 += var5.field6025;
            }
        }
        if (arg0 != 5) {
            this.method3049((byte) -69, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)I")
    public final int method3054(int arg0) {
        field7201++;
        return arg0 == 2 ? this.field7198 : 7;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILjava/lang/Object;Lek;)V")
    private final void method3055(int arg0, int arg1, Object arg2, class510 arg3) {
        field7205++;
        if (arg1 > this.field7215) {
            throw new IllegalStateException("s>cs");
        }
        this.method3049((byte) 110, arg3);
        this.field7198 -= arg1;
        while (this.field7198 < 0) {
            class437 var6 = (class437) this.field7199.method4056(896);
            this.method3050(var6, (byte) 46);
        }
        class747 var5 = new class747(arg3, arg2, arg1);
        if (arg0 != 4296) {
            this.method3046((byte) 102);
        }
        this.field7202.method2143(-1, var5, arg3.method765((byte) -94));
        this.field7199.method4050(var5, -124);
        var5.field5747 = 0L;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLjava/lang/Object;Lek;)V")
    public final void method3056(byte arg0, Object arg1, class510 arg2) {
        this.method3055(4296, 1, arg1, arg2);
        field7213++;
        if (arg0 != 3) {
            method3045(true, null, 80, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(I)V")
    public class545(int arg0) {
        this.field7215 = arg0;
        this.field7198 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field7202 = new class360(var2);
    }
}
