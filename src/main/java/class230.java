import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class230 extends class393 {

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
    private int field3441 = 0;

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "Lqp;")
    private class715 field3432 = new class715(16);

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "I")
    private int field3446 = 0;

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "Lmr;")
    private class611 field3450 = new class611();

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "J")
    private long field3452 = 0L;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    private int field3422;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "Llp;")
    private class247 field3423;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "Z")
    private boolean field3447;

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "Lmr;")
    private class611 field3448;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "Z")
    private boolean field3451;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    private int field3418;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "I")
    private int field3433;

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "Lpt;")
    private class441 field3435;

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "[B")
    private byte[] field3442;

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "Llp;")
    private class247 field3438;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "Loh;")
    private class680 field3430;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "Lgf;")
    private class661 field3431;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "[Ljk;")
    public static class183[] field3424 = new class183[37];

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "Lm;")
    private class475 field3425;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "Z")
    private boolean field3449;

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "[B")
    private byte[] field3445;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "[I")
    public static int[] field3428;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V", line = 5)
    public final void method1591(byte arg0) {
        field3420++;
        if (this.field3448 != null) {
            if (this.method1597(0) == null) {
                return;
            }
            if (this.field3447) {
                boolean var6 = true;
                for (class430 var7 = this.field3448.method3565(-73); var7 != null; var7 = this.field3448.method3561((byte) 59)) {
                    int var9 = (int) var7.field6188;
                    if (this.field3445[var9] == 0) {
                        this.method1592(var9, 1, 120);
                    }
                    if (this.field3445[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method2656((byte) 119);
                    }
                }
                while (this.field3446 < this.field3425.field6751.length) {
                    if (this.field3425.field6751[this.field3446] == 0) {
                        this.field3446++;
                    } else {
                        if (this.field3435.field6288 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field3445[this.field3446] == 0) {
                            this.method1592(this.field3446, 1, 127);
                        }
                        if (this.field3445[this.field3446] == 0) {
                            class430 var8 = new class430();
                            var8.field6188 = this.field3446;
                            var6 = false;
                            this.field3448.method3559(var8, (byte) 12);
                        }
                        this.field3446++;
                    }
                }
                if (var6) {
                    this.field3447 = false;
                    this.field3446 = 0;
                }
            } else if (this.field3449) {
                boolean var2 = true;
                for (class430 var3 = this.field3448.method3565(-40); var3 != null; var3 = this.field3448.method3561((byte) 87)) {
                    int var5 = (int) var3.field6188;
                    if (this.field3445[var5] != 1) {
                        this.method1592(var5, 2, 124);
                    }
                    if (this.field3445[var5] == 1) {
                        var3.method2656((byte) 125);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field3425.field6751.length > this.field3446) {
                    if (this.field3425.field6751[this.field3446] == 0) {
                        this.field3446++;
                    } else {
                        if (this.field3430.method3866(0)) {
                            var2 = false;
                            break;
                        }
                        if (this.field3445[this.field3446] != 1) {
                            this.method1592(this.field3446, 2, 122);
                        }
                        if (this.field3445[this.field3446] != 1) {
                            class430 var4 = new class430();
                            var4.field6188 = this.field3446;
                            var2 = false;
                            this.field3448.method3559(var4, (byte) 12);
                        }
                        this.field3446++;
                    }
                }
                if (var2) {
                    this.field3449 = false;
                    this.field3446 = 0;
                }
            } else {
                this.field3448 = null;
            }
        }
        if (arg0 > -64 || !this.field3451 || this.field3452 > class465.method2818(255)) {
            return;
        }
        for (class661 var10 = (class661) this.field3432.method4023((byte) -62); var10 != null; var10 = (class661) this.field3432.method4021((byte) 80)) {
            if (!var10.field9450) {
                if (var10.field9444) {
                    if (!var10.field9445) {
                        throw new RuntimeException();
                    }
                    var10.method2656((byte) 122);
                } else {
                    var10.field9444 = true;
                }
            }
        }
        this.field3452 = class465.method2818(255) + 1000L;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)Lgf;", line = 187)
    private final class661 method1592(int arg0, int arg1, int arg2) {
        field3436++;
        class661 var4 = (class661) this.field3432.method4020((long) arg0, (byte) -65);
        if (var4 != null && arg1 == 0 && !var4.field9445 && var4.field9450) {
            var4.method2656((byte) 125);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field3423 == null || this.field3445[arg0] == -1) {
                    if (this.field3430.method3871(-98)) {
                        return null;
                    }
                    var4 = this.field3430.method3875((byte) 2, this.field3422, true, arg0, 20);
                } else {
                    var4 = this.field3435.method2702((byte) 51, arg0, this.field3423);
                }
            } else if (arg1 == 1) {
                if (this.field3423 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3435.method2695(this.field3423, arg0, 107);
            } else if (arg1 == 2) {
                if (this.field3423 == null) {
                    throw new RuntimeException();
                }
                if (this.field3445[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3430.method3866(0)) {
                    return null;
                }
                var4 = this.field3430.method3875((byte) 2, this.field3422, false, arg0, 20);
            } else {
                throw new RuntimeException();
            }
            this.field3432.method4022(var4, -102, (long) arg0);
        }
        if (arg2 < 119) {
            field3428 = null;
        }
        if (var4.field9450) {
            return null;
        }
        byte[] var5 = var4.method1304(121);
        if (!(var4 instanceof class641)) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class279.field3905.reset();
                class279.field3905.update(var5, 0, var5.length - 2);
                int var6 = (int) class279.field3905.getValue();
                if (this.field3425.field6752[arg0] != var6) {
                    throw new RuntimeException();
                }
                if (this.field3425.field6763 != null && this.field3425.field6763[arg0] != null) {
                    byte[] var7 = this.field3425.field6763[arg0];
                    byte[] var8 = class616.method3578(var5.length - 2, var5, 0, (byte) 15);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field3430.field9685 = 0;
                this.field3430.field9682 = 0;
            } catch (RuntimeException var17) {
                this.field3430.method3864(-128);
                var4.method2656((byte) 118);
                if (var4.field9445 && !this.field3430.method3871(-74)) {
                    class184 var10 = this.field3430.method3875((byte) 2, this.field3422, true, arg0, 20);
                    this.field3432.method4022(var10, 84, (long) arg0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3425.field6756[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field3425.field6756[arg0];
            if (this.field3423 != null) {
                this.field3435.method2696(var5, true, arg0, this.field3423);
                if (this.field3445[arg0] != 1) {
                    this.field3441++;
                    this.field3445[arg0] = 1;
                }
            }
            if (!var4.field9445) {
                var4.method2656((byte) 126);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class279.field3905.reset();
            class279.field3905.update(var5, 0, var5.length - 2);
            int var11 = (int) class279.field3905.getValue();
            if (this.field3425.field6752[arg0] != var11) {
                throw new RuntimeException();
            }
            if (this.field3425.field6763 != null && this.field3425.field6763[arg0] != null) {
                byte[] var12 = this.field3425.field6763[arg0];
                byte[] var13 = class616.method3578(var5.length - 2, var5, 0, (byte) 23);
                for (int var14 = 0; var14 < 64; var14++) {
                    if (var12[var14] != var13[var14]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var15 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3425.field6756[arg0] & 0xFFFF) != var15) {
                throw new RuntimeException();
            }
            if (this.field3445[arg0] != 1) {
                this.field3441++;
                this.field3445[arg0] = 1;
            }
            if (!var4.field9445) {
                var4.method2656((byte) 127);
            }
            return var4;
        } catch (Exception var18) {
            this.field3445[arg0] = -1;
            var4.method2656((byte) 119);
            if (var4.field9445 && !this.field3430.method3871(-84)) {
                class184 var16 = this.field3430.method3875((byte) 2, this.field3422, true, arg0, 20);
                this.field3432.method4022(var16, -114, (long) arg0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)V", line = 454)
    public final void method1593(byte arg0) {
        if (arg0 < 1) {
            this.field3450 = null;
        }
        field3443++;
        if (this.field3448 == null || this.method1597(0) == null) {
            return;
        }
        for (class430 var2 = this.field3450.method3565(-87); var2 != null; var2 = this.field3450.method3561((byte) 51)) {
            int var3 = (int) var2.field6188;
            if (var3 < 0 || var3 >= this.field3425.field6758 || this.field3425.field6751[var3] == 0) {
                var2.method2656((byte) 121);
            } else {
                if (this.field3445[var3] == 0) {
                    this.method1592(var3, 1, 121);
                }
                if (this.field3445[var3] == -1) {
                    this.method1592(var3, 2, 123);
                }
                if (this.field3445[var3] == 1) {
                    var2.method2656((byte) 126);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)I", line = 498)
    public final int method1594(int arg0) {
        if (arg0 < 52) {
            return 113;
        } else {
            field3437++;
            return this.field3425 == null ? 0 : this.field3425.field6759;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZI)I", line = 513)
    public final int method1595(boolean arg0, int arg1) {
        field3434++;
        class661 var3 = (class661) this.field3432.method4020((long) arg1, (byte) -68);
        if (var3 == null) {
            if (!arg0) {
                method1599(-105);
            }
            return 0;
        } else {
            return var3.method1306(3344);
        }
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)I", line = 532)
    public final int method1596(int arg0) {
        if (arg0 <= 77) {
            field3424 = null;
        }
        field3426++;
        return this.field3441;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)Lm;", line = 543)
    public final class475 method1597(int arg0) {
        field3429++;
        if (this.field3425 != null) {
            return this.field3425;
        }
        if (arg0 != 0) {
            this.method1591((byte) 55);
        }
        if (this.field3431 == null) {
            if (this.field3430.method3871(-58)) {
                return null;
            }
            this.field3431 = this.field3430.method3875((byte) 0, 255, true, this.field3422, 20);
        }
        if (this.field3431.field9450) {
            return null;
        }
        byte[] var2 = this.field3431.method1304(arg0 + 118);
        if (this.field3431 instanceof class641) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3425 = new class475(var2, this.field3418, this.field3442);
                if (this.field3425.field6750 != this.field3433) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field3425 = null;
                if (this.field3430.method3871(-122)) {
                    this.field3431 = null;
                } else {
                    this.field3431 = this.field3430.method3875((byte) 0, 255, true, this.field3422, 20);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3425 = new class475(var2, this.field3418, this.field3442);
            } catch (RuntimeException var4) {
                this.field3430.method3864(-75);
                this.field3425 = null;
                if (this.field3430.method3871(-115)) {
                    this.field3431 = null;
                } else {
                    this.field3431 = this.field3430.method3875((byte) 0, 255, true, this.field3422, 20);
                }
                return null;
            }
            if (this.field3438 != null) {
                this.field3435.method2696(var2, true, this.field3422, this.field3438);
            }
        }
        if (this.field3423 != null) {
            this.field3441 = 0;
            this.field3445 = new byte[this.field3425.field6758];
        }
        this.field3431 = null;
        return this.field3425;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ)V", line = 650)
    public final void method1598(int arg0, boolean arg1) {
        field3440++;
        if (this.field3423 == null || arg1) {
            return;
        }
        for (class430 var3 = this.field3450.method3565(-88); var3 != null; var3 = this.field3450.method3561((byte) 41)) {
            if ((long) arg0 == var3.field6188) {
                return;
            }
        }
        class430 var4 = new class430();
        var4.field6188 = arg0;
        this.field3450.method3559(var4, (byte) 12);
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)V", line = 687)
    public static void method1599(int arg0) {
        field3428 = null;
        field3424 = null;
        if (arg0 != 0) {
            method1599(-44);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)[B", line = 698)
    public final byte[] method1600(int arg0, int arg1) {
        int var3 = -78 % ((arg1 - 36) / 60);
        field3427++;
        class661 var4 = this.method1592(arg0, 0, 122);
        if (var4 == null) {
            return null;
        } else {
            byte[] var5 = var4.method1304(121);
            var4.method2656((byte) 126);
            return var5;
        }
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)I", line = 721)
    public final int method1601(byte arg0) {
        field3444++;
        if (this.method1597(0) == null) {
            return this.field3431 == null ? 0 : this.field3431.method1306(3344);
        } else {
            int var2 = -98 / ((arg0 + 53) / 48);
            return 100;
        }
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(B)I", line = 743)
    public final int method1602(byte arg0) {
        field3439++;
        if (arg0 != 57) {
            this.field3430 = null;
        }
        if (this.field3425 == null) {
            return 0;
        } else if (this.field3447) {
            class430 var2 = this.field3448.method3565(125);
            return var2 == null ? 0 : (int) var2.field6188;
        } else {
            return this.field3425.field6759;
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(ILlp;Llp;Loh;Lpt;I[BIZ)V", line = 811)
    public class230(int arg0, class247 arg1, class247 arg2, class680 arg3, class441 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field3422 = arg0;
        this.field3423 = arg1;
        if (this.field3423 == null) {
            this.field3447 = false;
        } else {
            this.field3447 = true;
            this.field3448 = new class611();
        }
        this.field3451 = arg8;
        this.field3418 = arg5;
        this.field3433 = arg7;
        this.field3435 = arg4;
        this.field3442 = arg6;
        this.field3438 = arg2;
        this.field3430 = arg3;
        if (this.field3438 != null) {
            this.field3431 = this.field3435.method2702((byte) 51, this.field3422, this.field3438);
        }
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(B)V", line = 773)
    public final void method1603(byte arg0) {
        field3421++;
        if (arg0 != 116) {
            this.method1603((byte) 79);
        }
        if (this.field3423 != null) {
            this.field3449 = true;
            if (this.field3448 == null) {
                this.field3448 = new class611();
            }
        }
    }
}
