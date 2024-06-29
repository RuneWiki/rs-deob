import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class277 extends class128 implements class29 {

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "Z")
    private boolean field4345 = false;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    private int field4343 = 50;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "Lpk;")
    private class120 field4355;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "Lpk;")
    private class120 field4346;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "Lok;")
    private class160 field4344;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "Lok;")
    private class160 field4351;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    public static int field4332 = 0;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "[I")
    public static int[] field4356 = new int[100];

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "Lwd;")
    public static class88 field4328;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(II)Z", line = 11)
    public final boolean method258(int arg0, int arg1) {
        if (arg1 != 100) {
            this.method254(24, -0.7091826F, 127);
        }
        field4350++;
        return this.method241(arg0, arg1 - 95).field222;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ)V", line = 22)
    public final void method1961(int arg0, boolean arg1) {
        field4347++;
        this.field4345 = arg1;
        if (arg0 <= -105) {
            this.method1963(255);
        }
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(II)[I", line = 34)
    public final int[] method256(int arg0, int arg1) {
        field4338++;
        class292 var3 = this.method1962(arg1, arg0);
        return var3 == null ? null : var3.method2053(this, this.field4346, this.field4345 || this.method241(arg1, 5).field228);
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(II)Z", line = 49)
    public final boolean method255(int arg0, int arg1) {
        field4333++;
        class292 var3 = this.method1962(arg0, 255);
        if (arg1 != 65535) {
            this.field4343 = 85;
        }
        return var3 == null ? false : var3.method2054(this, this.field4346);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IFI)[I", line = 66)
    public final int[] method254(int arg0, float arg1, int arg2) {
        int var4 = 18 / ((30 - arg0) / 62);
        field4327++;
        class292 var5 = this.method1962(arg2, 255);
        if (var5 == null) {
            return null;
        } else {
            var5.field4585 = true;
            return var5.method2049(this, this.field4346, arg1, this.field4345 || this.method241(arg2, 5).field228);
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(BI)Lbe;", line = 81)
    public final class314 method997(byte arg0, int arg1) {
        if (arg0 == 20) {
            field4357++;
            class292 var3 = this.method1962(arg1, arg0 ^ 0xEB);
            return var3 == null ? null : var3.field4582;
        } else {
            return (class314) null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "(II)Luh;", line = 96)
    private final class292 method1962(int arg0, int arg1) {
        field4330++;
        class292 var3 = (class292) this.field4344.method1183((long) arg0, (byte) -128);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field4355.method967(arg0, 0, 65280);
        if (arg1 != 255) {
            return (class292) null;
        } else if (var4 == null) {
            return null;
        } else {
            class292 var5 = new class292(new class1(var4));
            this.field4344.method1182((byte) 60, (long) arg0, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "(II)Z", line = 128)
    public final boolean method264(int arg0, int arg1) {
        int var3 = -84 / ((11 - arg0) / 54);
        field4349++;
        return this.field4345 || this.method241(arg1, 5).field228;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZFIII)Leg;", line = 141)
    public final class317 method252(boolean arg0, float arg1, int arg2, int arg3, int arg4) {
        field4352++;
        class292 var6 = this.method1962(arg4, 255);
        if (arg2 != 12194) {
            this.method254(-32, 0.540127F, 40);
        }
        if (var6 != null && var6.method2054(this, this.field4346)) {
            return arg0 ? var6.field4582.method2223(false, this, arg3, this.field4346, false, arg3, (double) arg1) : var6.field4582.method2209(this.field4346, arg3, (byte) 23, this, arg3, false, (double) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "(II)Z", line = 164)
    public final boolean method262(int arg0, int arg1) {
        if (arg0 <= 23) {
            this.field4355 = (class120) null;
        }
        field4340++;
        return this.method241(arg1, 5).field227;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)I", line = 176)
    public final int method251(boolean arg0, int arg1) {
        if (arg0) {
            this.field4343 = -20;
        }
        field4339++;
        return this.method241(arg1, 5).field233 & 0xFFFF;
    }

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "(II)V", line = 187)
    public final void method259(int arg0, int arg1) {
        if (arg1 != 255) {
            this.field4344 = (class160) null;
        }
        this.method261(arg0, (byte) -12, this.field4345 || this.method241(arg0, 5).field228 ? 64 : 128);
        field4331++;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lpk;Lpk;Lpk;IZ)V", line = 233)
    public class277(class120 arg0, class120 arg1, class120 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field4355 = arg0;
        this.field4343 = arg3;
        this.field4345 = arg4;
        this.field4346 = arg2;
        this.field4344 = new class160(this.field4343);
        if (class162.field2623) {
            this.field4351 = new class160(this.field4343);
        } else {
            this.field4351 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)I", line = 206)
    public final int method250(byte arg0, int arg1) {
        if (arg0 != -115) {
            this.field4344 = (class160) null;
        }
        field4354++;
        return this.method241(arg1, 5).field238 & 0xFF;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 218)
    public final void method1963(int arg0) {
        this.field4344.method1176((byte) -46);
        field4329++;
        if (arg0 != 255) {
            this.method1967(110, (byte) -95);
        }
        if (this.field4351 != null) {
            this.field4351.method1176((byte) -54);
        }
        class292.field4579 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)I", line = 251)
    public final int method260(int arg0, byte arg1) {
        field4337++;
        if (arg1 > -51) {
            this.field4351 = (class160) null;
        }
        return this.method241(arg0, 5).field231 & 0xFF;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(BI)V", line = 268)
    public final void method1964(byte arg0, int arg1) {
        for (class292 var3 = (class292) this.field4344.method1180(-53); var3 != null; var3 = (class292) this.field4344.method1181((byte) 89)) {
            if (var3.field4585) {
                var3.method2051(arg1);
                var3.field4585 = false;
            }
        }
        if (arg0 >= -36) {
            this.method257(27, -118);
        }
        field4341++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lpk;Lpk;I)V", line = 292)
    public static final void method1965(class120 arg0, class120 arg1, int arg2) {
        class178.field2831 = arg1;
        class323.field5058 = arg0;
        field4334++;
        int var3 = 113 % ((-arg2 - 6) / 56);
    }

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "(II)V", line = 303)
    public final void method1966(int arg0, int arg1) {
        field4336++;
        this.field4343 = arg1;
        this.field4344 = new class160(this.field4343);
        if (class162.field2623) {
            this.field4351 = new class160(this.field4343);
        } else {
            this.field4351 = null;
        }
        if (arg0 != 25919) {
            this.field4344 = (class160) null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(IB)Lii;", line = 320)
    private final class228 method1967(int arg0, byte arg1) {
        field4342++;
        if (arg1 > -101) {
            field4356 = (int[]) null;
        }
        class228 var3 = (class228) this.field4351.method1183((long) arg0, (byte) -122);
        if (var3 == null) {
            class228 var4 = new class228(this.method241(arg0, 5).field233 & 0xFFFF);
            this.field4351.method1182((byte) -36, (long) arg0, var4);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(ZI)Z", line = 339)
    public final boolean method263(boolean arg0, int arg1) {
        if (arg0) {
            this.field4346 = (class120) null;
        }
        field4353++;
        return !this.method241(arg1, 5).field232;
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(II)I", line = 352)
    public final int method257(int arg0, int arg1) {
        field4325++;
        if (arg1 != 255) {
            this.field4351 = (class160) null;
        }
        return this.method241(arg0, 5).field236 & 0xFF;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)I", line = 364)
    public final int method253(int arg0, int arg1) {
        field4326++;
        if (arg0 != 255) {
            this.method997((byte) 120, -37);
        }
        return this.method241(arg1, arg0 ^ 0xFA).field223 & 0xFF;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBI)V", line = 382)
    public final void method261(int arg0, byte arg1, int arg2) {
        boolean var4 = false;
        class102.method830(this.method241(arg0, 5).field236 & 0xFF, arg1 ^ 0xFFFFC620, this.method241(arg0, arg1 + 17).field231 & 0xFF);
        class292 var5 = this.method1962(arg0, arg1 ^ 0xFFFFFF0B);
        if (var5 != null) {
            var4 = var5.method2047(this, this.field4346, arg2);
        }
        if (arg1 != -12) {
            this.field4344 = (class160) null;
        }
        if (!var4) {
            class228 var6 = this.method1967(arg0, (byte) -112);
            var6.method1662(true);
        }
        field4348++;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 417)
    public static void method1968(int arg0) {
        field4356 = null;
        field4328 = null;
        if (arg0 != 65535) {
            method1968(-7);
        }
    }
}
