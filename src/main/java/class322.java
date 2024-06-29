import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class322 {

    @OriginalMember(owner = "client!vw", name = "h", descriptor = "I")
    private int field4388 = 0;

    @OriginalMember(owner = "client!vw", name = "z", descriptor = "Z")
    private boolean field4406 = false;

    @OriginalMember(owner = "client!vw", name = "D", descriptor = "I")
    private int field4410 = 0;

    @OriginalMember(owner = "client!vw", name = "l", descriptor = "I")
    private int field4392 = -1;

    @OriginalMember(owner = "client!vw", name = "J", descriptor = "I")
    private int field4416 = -1;

    @OriginalMember(owner = "client!vw", name = "K", descriptor = "Z")
    private boolean field4417 = false;

    @OriginalMember(owner = "client!vw", name = "u", descriptor = "I")
    private int field4401 = -1;

    @OriginalMember(owner = "client!vw", name = "y", descriptor = "Lcn;")
    private class543 field4405;

    @OriginalMember(owner = "client!vw", name = "p", descriptor = "I")
    public int field4396;

    @OriginalMember(owner = "client!vw", name = "s", descriptor = "B")
    private byte field4399;

    @OriginalMember(owner = "client!vw", name = "m", descriptor = "B")
    private byte field4393;

    @OriginalMember(owner = "client!vw", name = "q", descriptor = "I")
    public int field4397;

    @OriginalMember(owner = "client!vw", name = "L", descriptor = "I")
    public int field4418;

    @OriginalMember(owner = "client!vw", name = "x", descriptor = "Z")
    private boolean field4404;

    @OriginalMember(owner = "client!vw", name = "B", descriptor = "[I")
    public static int[] field4408 = new int[32];

    @OriginalMember(owner = "client!vw", name = "O", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "I")
    private int field4387;

    @OriginalMember(owner = "client!vw", name = "i", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!vw", name = "j", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!vw", name = "n", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!vw", name = "r", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!vw", name = "t", descriptor = "I")
    private int field4400;

    @OriginalMember(owner = "client!vw", name = "v", descriptor = "I")
    private int field4402;

    @OriginalMember(owner = "client!vw", name = "E", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!vw", name = "F", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!vw", name = "G", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!vw", name = "H", descriptor = "I")
    private int field4414;

    @OriginalMember(owner = "client!vw", name = "I", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!vw", name = "M", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!vw", name = "A", descriptor = "Lr;")
    private class196 field4407;

    @OriginalMember(owner = "client!vw", name = "w", descriptor = "Lc;")
    private class200 field4403;

    @OriginalMember(owner = "client!vw", name = "C", descriptor = "Ldja;")
    private class326 field4409;

    @OriginalMember(owner = "client!vw", name = "o", descriptor = "Lka;")
    private class499 field4395;

    @OriginalMember(owner = "client!vw", name = "N", descriptor = "Llu;")
    public static class742 field4420;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "Lf;")
    public class788 field4381;

    @OriginalMember(owner = "client!vw", name = "k", descriptor = "[Z")
    private boolean[] field4391;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4408[var1] = var0 - 1;
            var0 += var0;
        }
        field4421 = -1;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILha;Lka;Lsk;ZIIIZ)V", line = 3)
    public final void method2043(int arg0, class66 arg1, class499 arg2, class650 arg3, boolean arg4, int arg5, int arg6, int arg7, boolean arg8) {
        if (!arg8) {
            this.field4404 = true;
        }
        field4385++;
        class624[] var10 = arg2.method311();
        class72[] var11 = arg2.method322();
        if ((this.field4381 == null || this.field4381.field10807) && (var10 != null || var11 != null)) {
            class445 var12 = class414.field5670.method2319(this.field4396, false);
            if (var12.field6028 != null) {
                var12 = var12.method2580(71, class694.field9613);
            }
            if (var12 != null) {
                this.field4381 = class788.method4295(class440.field5977, true);
            }
        }
        if (this.field4381 == null) {
            return;
        }
        arg2.method312(arg3);
        if (arg4) {
            this.field4381.method4305(arg1, (long) class440.field5977, var10, var11, false);
        } else {
            this.field4381.method4301((long) class440.field5977);
        }
        this.field4381.method4303(this.field4393, arg7, arg0, arg6, arg5);
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(BLha;)V", line = 45)
    public final void method2044(byte arg0, class66 arg1) {
        field4419++;
        if (this.field4407 != null) {
            class622.method3511(this.field4407, this.field4399, this.field4405.field7396, this.field4405.field7398, this.field4391);
            this.field4391 = null;
            this.field4407 = null;
        }
        int var3 = -68 / ((-arg0 - 72) / 54);
    }

    @OriginalMember(owner = "client!vw", name = "finalize", descriptor = "()V", line = 68)
    protected final void finalize() {
        if (this.field4381 != null) {
            this.field4381.method4291();
        }
        field4398++;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILdja;)V", line = 82)
    public final void method2045(int arg0, class326 arg1) {
        this.field4395 = null;
        this.field4409 = arg1;
        if (arg0 != -1) {
            method2050((byte) -11);
        }
        field4411++;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lha;B)V", line = 95)
    public final void method2046(class66 arg0, byte arg1) {
        this.method2053(arg0, true, 2, true, 262144);
        field4412++;
        int var3 = -89 % ((20 - arg1) / 63);
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILcn;)V", line = 106)
    private final void method2047(int arg0, class543 arg1) {
        field4394++;
        int var3 = 85 / ((arg0 + 64) / 33);
        label88: while (true) {
            if (this.field4403 == null) {
                if (this.field4417) {
                    return;
                }
                this.method2054(-1, -1);
                if (this.field4403 == null) {
                    return;
                }
            }
            int var4 = class440.field5977 - this.field4414;
            if (var4 > 100 && this.field4403.field3033 > 0) {
                int var5 = this.field4403.field3040.length - this.field4403.field3033;
                while (var5 > this.field4402 && var4 > this.field4403.field3024[this.field4402]) {
                    var4 -= this.field4403.field3024[this.field4402];
                    this.field4402++;
                }
                if (var5 <= this.field4402) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field4403.field3040.length; var7++) {
                        var6 += this.field4403.field3024[var7];
                    }
                    var4 %= var6;
                }
                this.field4387 = this.field4402 + 1;
                if (this.field4387 >= this.field4403.field3040.length) {
                    this.field4387 -= this.field4403.field3033;
                    if (this.field4387 < 0 || this.field4403.field3040.length <= this.field4387) {
                        this.field4387 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field4403.field3024[this.field4402] >= var4) {
                            this.field4400 = var4;
                            this.field4414 = class440.field5977 - var4;
                            return;
                        }
                        class189.method1394(arg1, 256, this.field4403, this.field4402);
                        var4 -= this.field4403.field3024[this.field4402];
                        this.field4402++;
                        if (this.field4403.field3040.length <= this.field4402) {
                            this.field4402 -= this.field4403.field3033;
                            if (this.field4402 < 0 || this.field4403.field3040.length <= this.field4402) {
                                this.field4403 = null;
                                continue label88;
                            }
                        }
                        this.field4387 = this.field4402 + 1;
                    } while (this.field4387 < this.field4403.field3040.length);
                    this.field4387 -= this.field4403.field3033;
                } while (this.field4387 >= 0 && this.field4387 < this.field4403.field3040.length);
                this.field4387 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Z)I", line = 203)
    public final int method2048(boolean arg0) {
        field4383++;
        if (!arg0) {
            this.field4400 = -127;
        }
        return this.field4410;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)I", line = 216)
    public final int method2049(int arg0) {
        if (arg0 == 3162) {
            field4384++;
            return this.field4388;
        } else {
            return -29;
        }
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lha;Lij;IIIILcn;ZI)V", line = 594)
    public class322(class66 arg0, class445 arg1, int arg2, int arg3, int arg4, int arg5, class543 arg6, boolean arg7, int arg8) {
        this.field4405 = arg6;
        this.field4396 = arg1.field6104;
        this.field4399 = (byte) arg5;
        this.field4393 = (byte) arg4;
        this.field4406 = arg7;
        this.field4397 = arg2;
        this.field4418 = arg3;
        this.field4404 = arg0.method479() && arg1.field6125 && !this.field4406;
        if (arg8 != -1) {
            this.field4417 = true;
        }
        this.method2054(-1, arg8);
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)V", line = 234)
    public static void method2050(byte arg0) {
        field4420 = null;
        field4408 = null;
        if (arg0 >= -21) {
            method2055(null, (byte) -41, null);
        }
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)Z", line = 245)
    public final boolean method2051(int arg0) {
        field4389++;
        if (arg0 > -41) {
            this.method2049(-48);
        }
        return this.field4404;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(BI)V", line = 261)
    public final void method2052(byte arg0, int arg1) {
        field4390++;
        this.field4417 = true;
        this.method2054(-1, arg1);
        int var3 = -44 / ((arg0 + 42) / 52);
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lha;ZIZI)Lka;", line = 279)
    public final class499 method2053(class66 arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        field4413++;
        if (arg2 != 2) {
            this.method2045(60, null);
        }
        class445 var6 = class414.field5670.method2319(this.field4396, false);
        if (var6.field6028 != null) {
            var6 = var6.method2580(25, class694.field9613);
        }
        if (var6 == null) {
            this.method2044((byte) 88, arg0);
            this.field4401 = -1;
            this.field4392 = -1;
            this.field4416 = -1;
            return null;
        }
        if (!this.field4417 && this.field4392 != var6.field6104) {
            this.field4395 = null;
            this.method2054(-1, -1);
        }
        this.method2047(-12, this.field4405);
        if (arg1) {
            boolean var7 = arg1 & this.field4404 & class111.field1911.field6717.method3695((byte) 99) != 0;
            arg1 = var7 & (this.field4401 != var6.field6104 || this.field4403 != null && class111.field1911.field6717.method3695((byte) 119) >= 2 && (this.field4416 != this.field4402 || (this.field4403.field3051 || class499.field6821) && this.field4402 != this.field4387));
        }
        if (arg3 && !arg1) {
            this.field4392 = var6.field6104;
            return null;
        }
        if (arg1) {
            class622.method3511(this.field4407, this.field4399, this.field4405.field7396, this.field4405.field7398, this.field4391);
            this.field4416 = -1;
            this.field4401 = -1;
        }
        class296 var8 = class745.field10286[this.field4399];
        class296 var9;
        if (this.field4406) {
            var9 = class142.field2418[0];
        } else {
            var9 = this.field4399 >= 3 ? null : class745.field10286[this.field4399 + 1];
        }
        class499 var10 = null;
        if (this.field4403 != null) {
            if (arg1) {
                arg4 |= 0x40000;
            }
            var10 = var6.method2578(this.field4409, this.field4402, var9, var8.method1907(this.field4405.field7396, (byte) -65, this.field4405.field7398), this.field4403, arg2 + 7972, var8, this.field4405.field7396, this.field4387, this.field4397 == 11 ? this.field4418 + 4 : this.field4418, this.field4400, this.field4397 == 11 ? 10 : this.field4397, arg4, this.field4405.field7398, arg0);
            if (var10 == null) {
                this.field4410 = 0;
                this.field4391 = null;
                this.field4407 = null;
                this.field4388 = 0;
            } else {
                if (arg1) {
                    if (this.field4391 == null) {
                        this.field4391 = new boolean[4];
                    }
                    this.field4407 = var10.method325(this.field4407);
                    class335.method2099(this.field4407, this.field4399, this.field4405.field7396, this.field4405.field7398, this.field4391);
                    this.field4416 = this.field4402;
                    this.field4401 = var6.field6104;
                }
                this.field4410 = var10.method276();
                this.field4388 = var10.method298();
            }
            this.field4395 = null;
        } else if (this.field4395 != null && arg4 == (arg4 & this.field4395.method300()) && this.field4392 == var6.field6104) {
            var10 = this.field4395;
        } else {
            if (this.field4395 != null) {
                arg4 |= this.field4395.method300();
            }
            class548 var11 = var6.method2579(4, this.field4397 == 11 ? 10 : this.field4397, this.field4405.field7398, arg4, arg1, arg0, var8.method1907(this.field4405.field7396, (byte) -98, this.field4405.field7398), this.field4397 == 11 ? this.field4418 + 4 : this.field4418, var9, var8, this.field4409, this.field4405.field7396);
            if (var11 == null) {
                this.field4410 = 0;
                this.field4388 = 0;
                this.field4391 = null;
                this.field4395 = null;
                this.field4407 = null;
            } else {
                var10 = var11.field7450;
                this.field4395 = var11.field7450;
                if (arg1) {
                    this.field4391 = null;
                    this.field4407 = var11.field7448;
                    class335.method2099(this.field4407, this.field4399, this.field4405.field7396, this.field4405.field7398, null);
                    this.field4416 = -1;
                    this.field4401 = var6.field6104;
                }
                this.field4410 = var10.method276();
                this.field4388 = var10.method298();
            }
        }
        this.field4392 = var6.field6104;
        return var10;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)V", line = 418)
    private final void method2054(int arg0, int arg1) {
        field4386++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class445 var5 = class414.field5670.method2319(this.field4396, false);
            class445 var6 = var5;
            if (var5.field6028 != null) {
                var5 = var5.method2580(44, class694.field9613);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field6054 != null) {
                if (this.field4403 != null && var5.method2594(this.field4403.field3039, 0)) {
                    return;
                }
                var3 = var5.method2588(30813);
                if (this.field4392 != var5.field6104) {
                    var4 = var5.field6079;
                }
            } else if (var5.field6089 == -1) {
                if (var6 != null && var6.field6054 != null) {
                    if (this.field4403 != null && var6.method2594(this.field4403.field3039, ~arg0)) {
                        return;
                    }
                    var3 = var6.method2588(30813);
                    if (this.field4392 != var6.field6104) {
                        var4 = var6.field6079;
                    }
                } else if (var6 != null && var6.field6089 != -1 && this.field4392 != var6.field6104) {
                    var3 = var6.field6089;
                    var4 = var6.field6079;
                }
            } else if (this.field4392 != var5.field6104) {
                var4 = var5.field6079;
                var3 = var5.field6089;
            }
        }
        if (var3 == -1) {
            this.field4403 = null;
            return;
        }
        this.field4395 = null;
        if (this.field4403 == null || this.field4403.field3039 != var3) {
            this.field4403 = class108.field1696.method1279((byte) 92, var3);
        } else if (this.field4403.field3031 == 0) {
            return;
        }
        if (this.field4403.field3040 == null) {
            this.field4403 = null;
            return;
        }
        if (var4) {
            this.field4402 = (int) ((double) this.field4403.field3040.length * Math.random());
            this.field4400 = (int) ((double) this.field4403.field3024[this.field4402] * Math.random()) + 1;
        } else {
            this.field4400 = 1;
            this.field4402 = 0;
        }
        this.field4387 = this.field4402 - arg0;
        if (this.field4387 < 0 || this.field4387 >= this.field4403.field3040.length) {
            this.field4387 = -1;
        }
        this.field4414 = class440.field5977 - this.field4400;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Ld;BLgj;)V", line = 581)
    public static final void method2055(class162 arg0, byte arg1, class662 arg2) {
        class699.field9647 = arg0;
        field4415++;
        int var3 = 66 / ((-arg1 - 49) / 37);
        class588.field8300 = arg2;
    }
}
