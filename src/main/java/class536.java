import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class536 extends class339 {

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    private int field7510 = 0;

    @OriginalMember(owner = "client!gu", name = "D", descriptor = "Lsga;")
    private class583 field7530 = new class583(16);

    @OriginalMember(owner = "client!gu", name = "J", descriptor = "I")
    private int field7536 = 0;

    @OriginalMember(owner = "client!gu", name = "L", descriptor = "Lqia;")
    private class547 field7538 = new class547();

    @OriginalMember(owner = "client!gu", name = "O", descriptor = "J")
    private long field7541 = 0L;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    private int field7504;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "Lwea;")
    private class98 field7517;

    @OriginalMember(owner = "client!gu", name = "K", descriptor = "Z")
    private boolean field7537;

    @OriginalMember(owner = "client!gu", name = "M", descriptor = "Lqia;")
    private class547 field7539;

    @OriginalMember(owner = "client!gu", name = "H", descriptor = "Lwea;")
    private class98 field7534;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    private int field7514;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "Ldm;")
    private class733 field7506;

    @OriginalMember(owner = "client!gu", name = "y", descriptor = "[B")
    private byte[] field7525;

    @OriginalMember(owner = "client!gu", name = "N", descriptor = "Z")
    private boolean field7540;

    @OriginalMember(owner = "client!gu", name = "F", descriptor = "I")
    private int field7532;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "Lhe;")
    private class592 field7516;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "Ldq;")
    private class551 field7511;

    @OriginalMember(owner = "client!gu", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field7518 = new String[200];

    @OriginalMember(owner = "client!gu", name = "A", descriptor = "Z")
    public static boolean field7527 = false;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
    public static int field7508;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    public static int field7513;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!gu", name = "s", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!gu", name = "u", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!gu", name = "v", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!gu", name = "w", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!gu", name = "x", descriptor = "I")
    public static int field7524;

    @OriginalMember(owner = "client!gu", name = "z", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!gu", name = "C", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!gu", name = "E", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!gu", name = "G", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!gu", name = "t", descriptor = "Loba;")
    private class347 field7520;

    @OriginalMember(owner = "client!gu", name = "I", descriptor = "Z")
    private boolean field7535;

    @OriginalMember(owner = "client!gu", name = "B", descriptor = "[B")
    private byte[] field7528;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(III)Ldq;", line = 3)
    private final class551 method3050(int arg0, int arg1, int arg2) {
        field7519++;
        class551 var4 = (class551) this.field7530.method3248((long) arg1, 0);
        if (arg0 != 2) {
            this.field7537 = false;
        }
        if (var4 != null && arg2 == 0 && !var4.field7750 && var4.field7751) {
            var4.method3426((byte) -22);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field7517 == null || this.field7528[arg1] == -1) {
                    if (this.field7506.method4098(-126)) {
                        return null;
                    }
                    var4 = this.field7506.method4104(arg1, (byte) 2, true, this.field7504, -115);
                } else {
                    var4 = this.field7516.method3288(arg1, (byte) 9, this.field7517);
                }
            } else if (arg2 == 1) {
                if (this.field7517 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field7516.method3282(arg1, (byte) -56, this.field7517);
            } else if (arg2 == 2) {
                if (this.field7517 == null) {
                    throw new RuntimeException();
                }
                if (this.field7528[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field7506.method4093(-21)) {
                    return null;
                }
                var4 = this.field7506.method4104(arg1, (byte) 2, false, this.field7504, -98);
            } else {
                throw new RuntimeException();
            }
            this.field7530.method3249((long) arg1, var4, (byte) 51);
        }
        if (var4.field7751) {
            return null;
        }
        byte[] var5 = var4.method3138(1);
        if (!(var4 instanceof class622)) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class677.field9201.reset();
                class677.field9201.update(var5, 0, var5.length - 2);
                int var6 = (int) class677.field9201.getValue();
                if (this.field7520.field4499[arg1] != var6) {
                    throw new RuntimeException();
                }
                if (this.field7520.field4504 != null && this.field7520.field4504[arg1] != null) {
                    byte[] var7 = this.field7520.field4504[arg1];
                    byte[] var8 = class436.method2579(0, -1, var5.length - 2, var5);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field7506.field10263 = 0;
                this.field7506.field10265 = 0;
            } catch (RuntimeException var17) {
                this.field7506.method4091(-1);
                var4.method3426((byte) -56);
                if (var4.field7750 && !this.field7506.method4098(-124)) {
                    class717 var10 = this.field7506.method4104(arg1, (byte) 2, true, this.field7504, -104);
                    this.field7530.method3249((long) arg1, var10, (byte) 88);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field7520.field4497[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field7520.field4497[arg1];
            if (this.field7517 != null) {
                this.field7516.method3286(arg1, var5, (byte) 40, this.field7517);
                if (this.field7528[arg1] != 1) {
                    this.field7510++;
                    this.field7528[arg1] = 1;
                }
            }
            if (!var4.field7750) {
                var4.method3426((byte) -104);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class677.field9201.reset();
            class677.field9201.update(var5, 0, var5.length - 2);
            int var11 = (int) class677.field9201.getValue();
            if (this.field7520.field4499[arg1] != var11) {
                throw new RuntimeException();
            }
            if (this.field7520.field4504 != null && this.field7520.field4504[arg1] != null) {
                byte[] var12 = this.field7520.field4504[arg1];
                byte[] var13 = class436.method2579(0, -1, var5.length - 2, var5);
                for (int var14 = 0; var14 < 64; var14++) {
                    if (var12[var14] != var13[var14]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var15 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field7520.field4497[arg1] & 0xFFFF) != var15) {
                throw new RuntimeException();
            }
            if (this.field7528[arg1] != 1) {
                this.field7510++;
                this.field7528[arg1] = 1;
            }
            if (!var4.field7750) {
                var4.method3426((byte) -91);
            }
            return var4;
        } catch (Exception var18) {
            this.field7528[arg1] = -1;
            var4.method3426((byte) -96);
            if (var4.field7750 && !this.field7506.method4098(-122)) {
                class717 var16 = this.field7506.method4104(arg1, (byte) 2, true, this.field7504, 84);
                this.field7530.method3249((long) arg1, var16, (byte) -127);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)I", line = 266)
    public final int method3051(int arg0) {
        field7533++;
        if (arg0 != -2) {
            this.method1985(24, 127);
        }
        return this.field7520 == null ? 0 : this.field7520.field4488;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "([ILkha;ILkha;)V", line = 287)
    public static final void method3052(int[] arg0, class687 arg1, int arg2, class687 arg3) {
        if (arg2 < 64) {
            return;
        }
        field7526++;
        class457.field6396 = arg3;
        if (arg0 != null) {
            class447.field6289 = arg0;
        }
        class88.field1123 = arg1;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V", line = 303)
    public static void method3053(byte arg0) {
        field7518 = null;
        if (arg0 != -40) {
            field7527 = true;
        }
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V", line = 319)
    public final void method3054(int arg0) {
        field7505++;
        if (this.field7539 != null) {
            if (this.method1983(-128) == null) {
                return;
            }
            if (this.field7537) {
                boolean var2 = true;
                for (class627 var3 = this.field7539.method3111(92); var3 != null; var3 = this.field7539.method3116(-107)) {
                    int var5 = (int) var3.field8746;
                    if (this.field7528[var5] == 0) {
                        this.method3050(2, var5, 1);
                    }
                    if (this.field7528[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method3426((byte) -70);
                    }
                }
                while (this.field7536 < this.field7520.field4492.length) {
                    if (this.field7520.field4492[this.field7536] == 0) {
                        this.field7536++;
                    } else {
                        if (this.field7516.field8248 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field7528[this.field7536] == 0) {
                            this.method3050(2, this.field7536, 1);
                        }
                        if (this.field7528[this.field7536] == 0) {
                            class627 var4 = new class627();
                            var4.field8746 = this.field7536;
                            this.field7539.method3110(var4, 1);
                            var2 = false;
                        }
                        this.field7536++;
                    }
                }
                if (var2) {
                    this.field7537 = false;
                    this.field7536 = 0;
                }
            } else if (this.field7535) {
                boolean var6 = true;
                for (class627 var7 = this.field7539.method3111(89); var7 != null; var7 = this.field7539.method3116(arg0 - 36)) {
                    int var9 = (int) var7.field8746;
                    if (this.field7528[var9] != 1) {
                        this.method3050(2, var9, 2);
                    }
                    if (this.field7528[var9] == 1) {
                        var7.method3426((byte) -51);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field7536 < this.field7520.field4492.length) {
                    if (this.field7520.field4492[this.field7536] == 0) {
                        this.field7536++;
                    } else {
                        if (this.field7506.method4093(-21)) {
                            var6 = false;
                            break;
                        }
                        if (this.field7528[this.field7536] != 1) {
                            this.method3050(2, this.field7536, 2);
                        }
                        if (this.field7528[this.field7536] != 1) {
                            class627 var8 = new class627();
                            var8.field8746 = this.field7536;
                            this.field7539.method3110(var8, 1);
                            var6 = false;
                        }
                        this.field7536++;
                    }
                }
                if (var6) {
                    this.field7536 = 0;
                    this.field7535 = false;
                }
            } else {
                this.field7539 = null;
            }
        }
        if (this.field7540 && this.field7541 <= class97.method654((byte) 53)) {
            for (class551 var10 = (class551) this.field7530.method3245(false); var10 != null; var10 = (class551) this.field7530.method3252(12938)) {
                if (!var10.field7751) {
                    if (var10.field7746) {
                        if (!var10.field7750) {
                            throw new RuntimeException();
                        }
                        var10.method3426((byte) -100);
                    } else {
                        var10.field7746 = true;
                    }
                }
            }
            this.field7541 = class97.method654((byte) 98) + 1000L;
        }
        if (arg0 != 0) {
            this.method3051(20);
        }
    }

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)I", line = 496)
    public final int method3055(int arg0) {
        field7509++;
        if (this.field7520 == null) {
            return 0;
        } else if (this.field7537) {
            if (arg0 >= -86) {
                field7503 = 81;
            }
            class627 var2 = this.field7539.method3111(68);
            return var2 == null ? 0 : (int) var2.field8746;
        } else {
            return this.field7520.field4488;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)Loba;", line = 521)
    public final class347 method1983(int arg0) {
        field7522++;
        if (this.field7520 != null) {
            return this.field7520;
        }
        if (this.field7511 == null) {
            if (this.field7506.method4098(-127)) {
                return null;
            }
            this.field7511 = this.field7506.method4104(this.field7504, (byte) 0, true, 255, -117);
        }
        if (this.field7511.field7751) {
            return null;
        }
        if (arg0 >= -97) {
            this.field7536 = 43;
        }
        byte[] var2 = this.field7511.method3138(1);
        if (this.field7511 instanceof class622) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field7520 = new class347(var2, this.field7514, this.field7525);
                if (this.field7520.field4486 != this.field7532) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field7520 = null;
                if (this.field7506.method4098(-126)) {
                    this.field7511 = null;
                } else {
                    this.field7511 = this.field7506.method4104(this.field7504, (byte) 0, true, 255, -102);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field7520 = new class347(var2, this.field7514, this.field7525);
            } catch (RuntimeException var4) {
                this.field7506.method4091(-1);
                this.field7520 = null;
                if (this.field7506.method4098(-128)) {
                    this.field7511 = null;
                } else {
                    this.field7511 = this.field7506.method4104(this.field7504, (byte) 0, true, 255, 42);
                }
                return null;
            }
            if (this.field7534 != null) {
                this.field7516.method3286(this.field7504, var2, (byte) 40, this.field7534);
            }
        }
        if (this.field7517 != null) {
            this.field7528 = new byte[this.field7520.field4505];
            this.field7510 = 0;
        }
        this.field7511 = null;
        return this.field7520;
    }

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "(I)V", line = 620)
    public final void method3056(int arg0) {
        int var2 = -120 % ((arg0 + 55) / 55);
        field7515++;
        if (this.field7517 != null) {
            this.field7535 = true;
            if (this.field7539 == null) {
                this.field7539 = new class547();
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)I", line = 640)
    public final int method3057(byte arg0) {
        field7524++;
        if (this.method1983(-118) == null) {
            return this.field7511 == null ? 0 : this.field7511.method3140((byte) -92);
        } else {
            if (arg0 > -82) {
                this.field7506 = null;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IB)I", line = 669)
    public final int method1986(int arg0, byte arg1) {
        field7529++;
        class551 var3 = (class551) this.field7530.method3248((long) arg0, 0);
        if (var3 == null) {
            if (arg1 < 112) {
                this.field7535 = true;
            }
            return 0;
        } else {
            return var3.method3140((byte) -92);
        }
    }

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "(I)I", line = 687)
    public final int method3058(int arg0) {
        if (arg0 > -102) {
            return -7;
        } else {
            field7513++;
            return this.field7510;
        }
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(IB)Z", line = 709)
    public static final boolean method3059(int arg0, byte arg1) {
        field7521++;
        if (arg1 != 49) {
            method3059(68, (byte) -46);
        }
        return arg0 == 3 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)V", line = 720)
    public final void method1985(int arg0, int arg1) {
        field7523++;
        if (this.field7517 == null || arg0 > -51) {
            return;
        }
        for (class627 var3 = this.field7538.method3111(98); var3 != null; var3 = this.field7538.method3116(-74)) {
            if ((long) arg1 == var3.field8746) {
                return;
            }
        }
        class627 var4 = new class627();
        var4.field8746 = arg1;
        this.field7538.method3110(var4, 1);
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(ILwea;Lwea;Ldm;Lhe;I[BIZ)V", line = 842)
    public class536(int arg0, class98 arg1, class98 arg2, class733 arg3, class592 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field7504 = arg0;
        this.field7517 = arg1;
        if (this.field7517 == null) {
            this.field7537 = false;
        } else {
            this.field7537 = true;
            this.field7539 = new class547();
        }
        this.field7534 = arg2;
        this.field7514 = arg5;
        this.field7506 = arg3;
        this.field7525 = arg6;
        this.field7540 = arg8;
        this.field7532 = arg7;
        this.field7516 = arg4;
        if (this.field7534 != null) {
            this.field7511 = this.field7516.method3288(this.field7504, (byte) 9, this.field7534);
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(IB)[B", line = 762)
    public final byte[] method1987(int arg0, byte arg1) {
        int var3 = 4 / ((arg1 + 29) / 56);
        field7512++;
        class551 var4 = this.method3050(2, arg0, 0);
        if (var4 == null) {
            return null;
        } else {
            byte[] var5 = var4.method3138(1);
            var4.method3426((byte) -79);
            return var5;
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(Z)V", line = 780)
    public final void method3060(boolean arg0) {
        if (arg0) {
            return;
        }
        field7507++;
        if (this.field7539 == null || this.method1983(-111) == null) {
            return;
        }
        for (class627 var2 = this.field7538.method3111(63); var2 != null; var2 = this.field7538.method3116(-66)) {
            int var3 = (int) var2.field8746;
            if (var3 < 0 || var3 >= this.field7520.field4505 || this.field7520.field4492[var3] == 0) {
                var2.method3426((byte) -16);
            } else {
                if (this.field7528[var3] == 0) {
                    this.method3050(2, var3, 1);
                }
                if (this.field7528[var3] == -1) {
                    this.method3050(2, var3, 2);
                }
                if (this.field7528[var3] == 1) {
                    var2.method3426((byte) -85);
                }
            }
        }
    }
}
