import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class607 {

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "Lpca;")
    private class714 field8545 = new class714(64);

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "Lpca;")
    public class714 field8549 = new class714(50);

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "Lds;")
    public class14 field8551 = new class14(250);

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "Lw;")
    private class299 field8552 = new class299();

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "Lfp;")
    private class323 field8542;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Z")
    private boolean field8536;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public int field8548;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "Lfp;")
    public class323 field8538;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "Lfba;")
    private class25 field8556;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public int field8546;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "[Ljava/lang/String;")
    private String[] field8553;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "[Ljava/lang/String;")
    private String[] field8554;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "[I")
    public static int[] field8550 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field8533;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field8534;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field8535;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field8537;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field8539;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field8540;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field8541;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public static int field8543;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field8544;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field8547;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public int field8555;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lha;IIILof;BII)Loia;")
    public final class88 method3414(class58 arg0, int arg1, int arg2, int arg3, class621 arg4, byte arg5, int arg6, int arg7) {
        this.field8552.field4219 = arg7;
        this.field8552.field4208 = arg6;
        this.field8552.field4211 = arg2;
        this.field8552.field4210 = arg4 != null;
        if (arg5 != -100) {
            this.field8554 = null;
        }
        this.field8552.field4220 = arg1;
        this.field8552.field4215 = arg3;
        this.field8552.field4221 = arg0.field700;
        field8537++;
        return (class88) this.field8551.method92(0, this.field8552);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZI)V")
    public final void method3415(boolean arg0, int arg1) {
        field8534++;
        if (arg0 != this.field8536) {
            this.field8536 = arg0;
            if (arg1 == 255) {
                this.method3417(137);
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)V")
    public final void method3416(int arg0, byte arg1) {
        class714 var3 = this.field8545;
        synchronized (this.field8545) {
            this.field8545.method4016(arg0, (byte) -73);
        }
        field8535++;
        class714 var4 = this.field8549;
        synchronized (this.field8549) {
            this.field8549.method4016(arg0, (byte) -73);
        }
        class14 var5 = this.field8551;
        synchronized (this.field8551) {
            if (arg1 != 39) {
                this.method3424(-106, true);
            }
            this.field8551.method93(arg1 ^ 0xFFFFFFA4, arg0);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public final void method3417(int arg0) {
        field8539++;
        class714 var2 = this.field8545;
        synchronized (this.field8545) {
            this.field8545.method4023((byte) 114);
        }
        if (arg0 != 137) {
            return;
        }
        class714 var3 = this.field8549;
        synchronized (this.field8549) {
            this.field8549.method4023((byte) 123);
        }
        class14 var4 = this.field8551;
        synchronized (this.field8551) {
            this.field8551.method91(false);
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V")
    public final void method3418(int arg0) {
        class714 var2 = this.field8545;
        synchronized (this.field8545) {
            this.field8545.method4024(arg0 ^ arg0);
        }
        field8544++;
        class714 var3 = this.field8549;
        synchronized (this.field8549) {
            this.field8549.method4024(arg0 - 10);
        }
        class14 var4 = this.field8551;
        synchronized (this.field8551) {
            this.field8551.method88(arg0 ^ 0xB);
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
    public static void method3419(int arg0) {
        field8550 = null;
        if (arg0 != 155) {
            method3419(80);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIZILha;Lda;Lof;IIZLha;Z)Loia;")
    public final class88 method3420(int arg0, int arg1, boolean arg2, int arg3, class58 arg4, class59 arg5, class621 arg6, int arg7, int arg8, boolean arg9, class58 arg10, boolean arg11) {
        field8533++;
        class88 var13 = this.method3414(arg4, arg3, arg8, arg0, arg6, (byte) -100, arg1, arg7);
        if (var13 != null) {
            return var13;
        }
        class551 var14 = this.method3424(arg7, arg2);
        if (arg1 > 1 && var14.field7747 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg1 >= var14.field7679[var16] && var14.field7679[var16] != 0) {
                    var15 = var14.field7747[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method3424(var15, false);
            }
        }
        int[] var17 = var14.method3191(arg11, arg4, arg8, -1, arg6, arg0, arg10, arg1, arg5, arg3);
        if (var17 == null) {
            return null;
        }
        class88 var18;
        if (arg9) {
            var18 = arg10.method426(36, 32, var17, -1, 36, 0);
        } else {
            var18 = arg4.method426(36, 32, var17, -1, 36, 0);
        }
        if (!arg9) {
            class299 var19 = new class299();
            var19.field4221 = arg4.field700;
            var19.field4210 = arg6 != null;
            var19.field4208 = arg1;
            var19.field4215 = arg0;
            var19.field4220 = arg3;
            var19.field4219 = arg7;
            var19.field4211 = arg8;
            this.field8551.method97(var18, (byte) -126, var19);
        }
        return var18;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
    public final void method3421(boolean arg0) {
        field8541++;
        class714 var2 = this.field8549;
        synchronized (this.field8549) {
            this.field8549.method4023((byte) -127);
        }
        if (arg0) {
            this.field8548 = 121;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(Z)V")
    public final void method3422(boolean arg0) {
        field8540++;
        class14 var2 = this.field8551;
        synchronized (this.field8551) {
            this.field8551.method91(arg0);
            if (arg0) {
                this.field8538 = null;
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BI)V")
    public final void method3423(byte arg0, int arg1) {
        field8543++;
        this.field8555 = arg1;
        class714 var3 = this.field8549;
        synchronized (this.field8549) {
            this.field8549.method4023((byte) 94);
        }
        if (arg0 >= -8) {
            this.method3417(69);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZ)Lnl;")
    public final class551 method3424(int arg0, boolean arg1) {
        field8547++;
        if (arg1) {
            return null;
        }
        class714 var3 = this.field8545;
        class551 var4;
        synchronized (this.field8545) {
            var4 = (class551) this.field8545.method4022((long) arg0, (byte) 83);
        }
        if (var4 != null) {
            return var4;
        }
        class323 var5 = this.field8542;
        byte[] var6;
        synchronized (this.field8542) {
            var6 = this.field8542.method2100(class261.method1707(arg0, -118), (byte) 112, class617.method3449(arg0, (byte) 127));
        }
        class551 var7 = new class551();
        var7.field7706 = this;
        var7.field7680 = arg0;
        var7.field7678 = new String[] { null, null, class71.field903.method588((byte) 122, this.field8548), null, null };
        var7.field7744 = new String[] { null, null, null, null, class71.field904.method588((byte) 125, this.field8548) };
        if (var6 != null) {
            var7.method3186(new class675(var6), false);
        }
        var7.method3185(118);
        if (var7.field7707 != -1) {
            var7.method3199(this.method3424(var7.field7713, arg1), this.method3424(var7.field7707, false), 1);
        }
        if (var7.field7725 != -1) {
            var7.method3183(this.method3424(var7.field7725, false), (byte) 78, this.method3424(var7.field7720, false));
        }
        if (!this.field8536 && var7.field7692) {
            var7.field7677 = class71.field901.method588((byte) 104, this.field8548);
            var7.field7744 = this.field8554;
            var7.field7686 = null;
            var7.field7715 = false;
            var7.field7742 = 0;
            var7.field7678 = this.field8553;
            if (var7.field7716 != null) {
                boolean var8 = false;
                for (class189 var9 = var7.field7716.method1176(24490); var9 != null; var9 = var7.field7716.method1178((byte) 71)) {
                    class82 var10 = this.field8556.method154((int) var9.field2546, (byte) -128);
                    if (var10.field1027) {
                        var9.method1185(-83);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field7716 = null;
                }
            }
        }
        class714 var11 = this.field8545;
        synchronized (this.field8545) {
            this.field8545.method4018((byte) 126, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lsaa;IZLfba;Lfp;Lfp;)V")
    public class607(class326 arg0, int arg1, boolean arg2, class25 arg3, class323 arg4, class323 arg5) {
        this.field8542 = arg4;
        this.field8536 = arg2;
        this.field8548 = arg1;
        this.field8538 = arg5;
        this.field8556 = arg3;
        if (this.field8542 == null) {
            this.field8546 = 0;
        } else {
            int var7 = this.field8542.method2098((byte) 20) - 1;
            this.field8546 = var7 * 256 + this.field8542.method2084(var7, 0);
        }
        this.field8553 = new String[] { null, null, class71.field903.method588((byte) 100, this.field8548), null, null };
        this.field8554 = new String[] { null, null, null, null, class71.field904.method588((byte) 118, this.field8548) };
    }
}
