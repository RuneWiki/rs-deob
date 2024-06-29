import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class676 {

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "Z")
    private boolean field9218 = false;

    @OriginalMember(owner = "client!wca", name = "p", descriptor = "I")
    private int field9232 = 0;

    @OriginalMember(owner = "client!wca", name = "x", descriptor = "I")
    private int field9240 = -1;

    @OriginalMember(owner = "client!wca", name = "n", descriptor = "Z")
    private boolean field9230 = false;

    @OriginalMember(owner = "client!wca", name = "B", descriptor = "I")
    private int field9244 = -1;

    @OriginalMember(owner = "client!wca", name = "C", descriptor = "I")
    private int field9245 = -1;

    @OriginalMember(owner = "client!wca", name = "I", descriptor = "I")
    private int field9251 = 0;

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "I")
    public int field9223;

    @OriginalMember(owner = "client!wca", name = "y", descriptor = "B")
    private byte field9241;

    @OriginalMember(owner = "client!wca", name = "l", descriptor = "I")
    public int field9228;

    @OriginalMember(owner = "client!wca", name = "k", descriptor = "I")
    public int field9227;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "Lkba;")
    private class105 field9222;

    @OriginalMember(owner = "client!wca", name = "G", descriptor = "B")
    private byte field9249;

    @OriginalMember(owner = "client!wca", name = "v", descriptor = "Z")
    private boolean field9238;

    @OriginalMember(owner = "client!wca", name = "z", descriptor = "[I")
    public static int[] field9242 = new int[1000];

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    public static int field9217;

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "I")
    private int field9220;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "I")
    public static int field9221;

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "I")
    public static int field9224;

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "I")
    public static int field9225;

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "I")
    public static int field9226;

    @OriginalMember(owner = "client!wca", name = "m", descriptor = "I")
    private int field9229;

    @OriginalMember(owner = "client!wca", name = "q", descriptor = "I")
    public static int field9233;

    @OriginalMember(owner = "client!wca", name = "s", descriptor = "I")
    private int field9235;

    @OriginalMember(owner = "client!wca", name = "t", descriptor = "I")
    public static int field9236;

    @OriginalMember(owner = "client!wca", name = "u", descriptor = "I")
    public static int field9237;

    @OriginalMember(owner = "client!wca", name = "D", descriptor = "I")
    public static int field9246;

    @OriginalMember(owner = "client!wca", name = "E", descriptor = "I")
    public static int field9247;

    @OriginalMember(owner = "client!wca", name = "F", descriptor = "I")
    public static int field9248;

    @OriginalMember(owner = "client!wca", name = "H", descriptor = "I")
    private int field9250;

    @OriginalMember(owner = "client!wca", name = "J", descriptor = "I")
    public static int field9252;

    @OriginalMember(owner = "client!wca", name = "w", descriptor = "Lr;")
    private class180 field9239;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "Lka;")
    private class471 field9219;

    @OriginalMember(owner = "client!wca", name = "o", descriptor = "Lur;")
    public class537 field9231;

    @OriginalMember(owner = "client!wca", name = "A", descriptor = "Lmga;")
    private class709 field9243;

    @OriginalMember(owner = "client!wca", name = "r", descriptor = "[Z")
    private boolean[] field9234;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)Z")
    public final boolean method3758(int arg0) {
        field9217++;
        int var2 = 118 % ((arg0 - 59) / 32);
        return this.field9238;
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)V")
    public static void method3759(int arg0) {
        field9242 = null;
        if (arg0 != 0) {
            field9242 = null;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)I")
    public final int method3760(byte arg0) {
        int var2 = 99 / ((arg0 - 56) / 57);
        field9237++;
        return this.field9232;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IB)V")
    public final void method3761(int arg0, byte arg1) {
        this.field9218 = true;
        field9226++;
        int var3 = 66 % ((arg1 + 61) / 49);
        this.method3767((byte) -113, arg0);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(ILkba;)V")
    private final void method3762(int arg0, class105 arg1) {
        int var3 = -86 % ((arg0 + 72) / 46);
        field9224++;
        label88: while (true) {
            if (this.field9243 == null) {
                if (this.field9218) {
                    return;
                }
                this.method3767((byte) -113, -1);
                if (this.field9243 == null) {
                    return;
                }
            }
            int var4 = class740.field10285 - this.field9229;
            if (var4 > 100 && this.field9243.field9840 > 0) {
                int var5 = this.field9243.field9826.length - this.field9243.field9840;
                while (this.field9250 < var5 && var4 > this.field9243.field9849[this.field9250]) {
                    var4 -= this.field9243.field9849[this.field9250];
                    this.field9250++;
                }
                if (var5 <= this.field9250) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field9243.field9826.length; var7++) {
                        var6 += this.field9243.field9849[var7];
                    }
                    var4 %= var6;
                }
                this.field9220 = this.field9250 + 1;
                if (this.field9220 >= this.field9243.field9826.length) {
                    this.field9220 -= this.field9243.field9840;
                    if (this.field9220 < 0 || this.field9243.field9826.length <= this.field9220) {
                        this.field9220 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field9243.field9849[this.field9250]) {
                            this.field9235 = var4;
                            this.field9229 = class740.field10285 - var4;
                            return;
                        }
                        class346.method2239(-701644944, this.field9250, arg1, this.field9243);
                        var4 -= this.field9243.field9849[this.field9250];
                        this.field9250++;
                        if (this.field9243.field9826.length <= this.field9250) {
                            this.field9250 -= this.field9243.field9840;
                            if (this.field9250 < 0 || this.field9243.field9826.length <= this.field9250) {
                                this.field9243 = null;
                                continue label88;
                            }
                        }
                        this.field9220 = this.field9250 + 1;
                    } while (this.field9220 < this.field9243.field9826.length);
                    this.field9220 -= this.field9243.field9840;
                } while (this.field9220 >= 0 && this.field9220 < this.field9243.field9826.length);
                this.field9220 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(ILha;)V")
    public final void method3763(int arg0, class58 arg1) {
        this.method3765(true, -16386, true, arg1, 262144);
        field9247++;
        if (arg0 != -1) {
            this.field9228 = 91;
        }
    }

    @OriginalMember(owner = "client!wca", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field9252++;
        if (this.field9231 != null) {
            this.field9231.method3115();
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(ILha;)V")
    public final void method3764(int arg0, class58 arg1) {
        if (arg0 != 3) {
            this.field9219 = null;
        }
        field9236++;
        if (this.field9239 != null) {
            class412.method2537(this.field9239, this.field9249, this.field9222.field1264, this.field9222.field1250, this.field9234);
            this.field9234 = null;
            this.field9239 = null;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(ZIZLha;I)Lka;")
    public final class471 method3765(boolean arg0, int arg1, boolean arg2, class58 arg3, int arg4) {
        field9225++;
        class10 var6 = class612.field8588.method558((byte) 109, this.field9228);
        if (var6.field226 != null) {
            var6 = var6.method67(class101.field1201, 0);
        }
        if (var6 == null) {
            this.method3764(3, arg3);
            this.field9240 = -1;
            this.field9245 = -1;
            this.field9244 = -1;
            return null;
        }
        if (!this.field9218 && this.field9244 != var6.field236) {
            this.field9219 = null;
            this.method3767((byte) -113, -1);
        }
        this.method3762(arg1 + 16268, this.field9222);
        if (arg2) {
            boolean var7 = arg2 & this.field9238 & class557.field7812.field6542.method1222(false) != 0;
            arg2 = var7 & (this.field9245 != var6.field236 || this.field9243 != null && class557.field7812.field6542.method1222(false) >= 2 && (this.field9250 != this.field9240 || (this.field9243.field9829 || class411.field5804) && this.field9250 != this.field9220));
        }
        if (arg1 != -16386) {
            method3759(-121);
        }
        if (arg0 && !arg2) {
            this.field9244 = var6.field236;
            return null;
        }
        if (arg2) {
            class412.method2537(this.field9239, this.field9249, this.field9222.field1264, this.field9222.field1250, this.field9234);
            this.field9245 = -1;
            this.field9240 = -1;
        }
        class278 var8 = class459.field6474[this.field9249];
        class278 var9;
        if (this.field9230) {
            var9 = class588.field8292[0];
        } else {
            var9 = this.field9249 >= 3 ? null : class459.field6474[this.field9249 + 1];
        }
        class471 var10 = null;
        if (this.field9243 != null) {
            if (arg2) {
                arg4 |= 0x40000;
            }
            var10 = var6.method75(this.field9235, arg4, arg3, var8.method1815(this.field9222.field1250, this.field9222.field1264, arg1 ^ 0x407C), this.field9222.field1250, var8, this.field9250, 0, this.field9227 == 11 ? this.field9223 + 4 : this.field9223, this.field9220, this.field9243, this.field9227 == 11 ? 10 : this.field9227, var9, this.field9222.field1264);
            if (var10 == null) {
                this.field9234 = null;
                this.field9251 = 0;
                this.field9232 = 0;
                this.field9239 = null;
            } else {
                if (arg2) {
                    if (this.field9234 == null) {
                        this.field9234 = new boolean[4];
                    }
                    this.field9239 = var10.method217(this.field9239);
                    class583.method3312(this.field9239, this.field9249, this.field9222.field1264, this.field9222.field1250, this.field9234);
                    this.field9245 = var6.field236;
                    this.field9240 = this.field9250;
                }
                this.field9232 = var10.method253();
                this.field9251 = var10.method218();
            }
            this.field9219 = null;
        } else if (this.field9219 != null && arg4 == (arg4 & this.field9219.method228()) && this.field9244 == var6.field236) {
            var10 = this.field9219;
        } else {
            if (this.field9219 != null) {
                arg4 |= this.field9219.method228();
            }
            class102 var11 = var6.method71(-109, var8.method1815(this.field9222.field1250, this.field9222.field1264, 125), var8, var9, arg2, this.field9227 == 11 ? this.field9223 + 4 : this.field9223, this.field9222.field1264, this.field9222.field1250, arg3, arg4, this.field9227 == 11 ? 10 : this.field9227);
            if (var11 == null) {
                this.field9239 = null;
                this.field9219 = null;
                this.field9251 = 0;
                this.field9234 = null;
                this.field9232 = 0;
            } else {
                var10 = var11.field1213;
                this.field9219 = var11.field1213;
                if (arg2) {
                    this.field9234 = null;
                    this.field9239 = var11.field1214;
                    class583.method3312(this.field9239, this.field9249, this.field9222.field1264, this.field9222.field1250, null);
                    this.field9245 = var6.field236;
                    this.field9240 = -1;
                }
                this.field9232 = var10.method253();
                this.field9251 = var10.method218();
            }
        }
        this.field9244 = var6.field236;
        return var10;
    }

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "(I)I")
    public final int method3766(int arg0) {
        field9248++;
        if (arg0 >= 0) {
            this.method3768(null, 89, false, null, (byte) 67, null, -55, 57, 60);
        }
        return this.field9251;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(BI)V")
    private final void method3767(byte arg0, int arg1) {
        field9221++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class10 var5 = class612.field8588.method558((byte) 26, this.field9228);
            class10 var6 = var5;
            if (var5.field226 != null) {
                var5 = var5.method67(class101.field1201, 0);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field212 != null) {
                if (this.field9243 != null && var5.method58(this.field9243.field9842, (byte) 88)) {
                    return;
                }
                var3 = var5.method68(arg0 ^ 0xFFFFFFC2);
                if (this.field9244 != var5.field236) {
                    var4 = var5.field193;
                }
            } else if (var5.field231 == -1) {
                if (var6 != null && var6.field212 != null) {
                    if (this.field9243 != null && var6.method58(this.field9243.field9842, (byte) 103)) {
                        return;
                    }
                    var3 = var6.method68(15);
                    if (this.field9244 != var6.field236) {
                        var4 = var6.field193;
                    }
                } else if (var6 != null && var6.field231 != -1 && this.field9244 != var6.field236) {
                    var4 = var6.field193;
                    var3 = var6.field231;
                }
            } else if (this.field9244 != var5.field236) {
                var4 = var5.field193;
                var3 = var5.field231;
            }
        }
        if (var3 == -1) {
            this.field9243 = null;
            return;
        }
        this.field9219 = null;
        if (this.field9243 == null || this.field9243.field9842 != var3) {
            this.field9243 = class343.field4785.method3525(var3, (byte) -119);
        } else if (this.field9243.field9848 == 0) {
            return;
        }
        if (this.field9243.field9826 == null) {
            this.field9243 = null;
            return;
        }
        if (arg0 != -113) {
            this.finalize();
        }
        if (var4) {
            this.field9250 = (int) ((double) this.field9243.field9826.length * Math.random());
            this.field9235 = (int) (Math.random() * (double) this.field9243.field9849[this.field9250]) + 1;
        } else {
            this.field9235 = 1;
            this.field9250 = 0;
        }
        this.field9220 = this.field9250 + 1;
        if (this.field9220 < 0 || this.field9243.field9826.length <= this.field9220) {
            this.field9220 = -1;
        }
        this.field9229 = class740.field10285 - this.field9235;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lka;IZLha;BLnga;III)V")
    public final void method3768(class471 arg0, int arg1, boolean arg2, class58 arg3, byte arg4, class513 arg5, int arg6, int arg7, int arg8) {
        field9246++;
        class531[] var10 = arg0.method227();
        int var11 = 79 % ((arg4 + 65) / 60);
        class253[] var12 = arg0.method241();
        if ((this.field9231 == null || this.field9231.field7529) && (var10 != null || var12 != null)) {
            class10 var13 = class612.field8588.method558((byte) 127, this.field9228);
            if (var13.field226 != null) {
                var13 = var13.method67(class101.field1201, 0);
            }
            if (var13 != null) {
                this.field9231 = class537.method3110(class740.field10285, true);
            }
        }
        if (this.field9231 == null) {
            return;
        }
        arg0.method239(arg5);
        if (arg2) {
            this.field9231.method3120(arg3, (long) class740.field10285, var10, var12, false);
        } else {
            this.field9231.method3112((long) class740.field10285);
        }
        this.field9231.method3114(this.field9241, arg7, arg1, arg8, arg6);
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lha;Lhba;IIIILkba;ZI)V")
    public class676(class58 arg0, class10 arg1, int arg2, int arg3, int arg4, int arg5, class105 arg6, boolean arg7, int arg8) {
        this.field9230 = arg7;
        this.field9223 = arg3;
        this.field9241 = (byte) arg4;
        this.field9228 = arg1.field236;
        this.field9227 = arg2;
        this.field9222 = arg6;
        this.field9249 = (byte) arg5;
        this.field9238 = arg0.method487() && arg1.field177 && !this.field9230;
        if (arg8 != -1) {
            this.field9218 = true;
        }
        this.method3767((byte) -113, arg8);
    }
}
