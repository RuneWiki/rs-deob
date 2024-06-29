import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class309 {

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "I")
    private int field4287 = 0;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
    private int field4282 = 0;

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "Z")
    private boolean field4291 = false;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
    private int field4280 = -1;

    @OriginalMember(owner = "client!bv", name = "t", descriptor = "Z")
    private boolean field4296 = false;

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "I")
    private int field4283 = -1;

    @OriginalMember(owner = "client!bv", name = "x", descriptor = "I")
    private int field4300 = -1;

    @OriginalMember(owner = "client!bv", name = "D", descriptor = "I")
    public int field4306;

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
    public int field4290;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "Lga;")
    private class404 field4278;

    @OriginalMember(owner = "client!bv", name = "J", descriptor = "B")
    private byte field4312;

    @OriginalMember(owner = "client!bv", name = "r", descriptor = "B")
    private byte field4294;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
    public int field4279;

    @OriginalMember(owner = "client!bv", name = "p", descriptor = "Z")
    private boolean field4292;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "I")
    private int field4281;

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!bv", name = "q", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!bv", name = "u", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!bv", name = "y", descriptor = "I")
    private int field4301;

    @OriginalMember(owner = "client!bv", name = "A", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!bv", name = "B", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!bv", name = "C", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!bv", name = "E", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!bv", name = "G", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!bv", name = "H", descriptor = "I")
    private int field4310;

    @OriginalMember(owner = "client!bv", name = "I", descriptor = "I")
    private int field4311;

    @OriginalMember(owner = "client!bv", name = "K", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!bv", name = "L", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!bv", name = "v", descriptor = "Lr;")
    private class184 field4298;

    @OriginalMember(owner = "client!bv", name = "z", descriptor = "Ll;")
    public static class18 field4302;

    @OriginalMember(owner = "client!bv", name = "F", descriptor = "Luj;")
    public class385 field4308;

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "Lka;")
    private class472 field4286;

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "Lhg;")
    private class691 field4284;

    @OriginalMember(owner = "client!bv", name = "s", descriptor = "[I")
    public static int[] field4295;

    @OriginalMember(owner = "client!bv", name = "w", descriptor = "[Z")
    private boolean[] field4299;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)I")
    public final int method2007(int arg0) {
        if (arg0 < 31) {
            return 48;
        } else {
            field4314++;
            return this.field4287;
        }
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)I")
    public final int method2008(int arg0) {
        if (arg0 > -20) {
            this.finalize();
        }
        field4303++;
        return this.field4282;
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(I)Z")
    public final boolean method2009(int arg0) {
        if (arg0 != 2) {
            this.field4283 = -73;
        }
        field4297++;
        return this.field4292;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BI)V")
    private final void method2010(byte arg0, int arg1) {
        field4304++;
        if (arg0 != 69) {
            this.field4286 = null;
        }
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class99 var5 = class76.field1366.method1680(arg0 ^ 0x45, this.field4290);
            class99 var6 = var5;
            if (var5.field1780 != null) {
                var5 = var5.method925(class390.field5635, (byte) 47);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field1778 != null) {
                if (this.field4284 != null && var5.method926((byte) 73, this.field4284.field9359)) {
                    return;
                }
                var3 = var5.method934(arg0 - 70);
                if (this.field4280 != var5.field1776) {
                    var4 = var5.field1759;
                }
            } else if (var5.field1703 == -1) {
                if (var6 != null && var6.field1778 != null) {
                    if (this.field4284 != null && var6.method926((byte) 105, this.field4284.field9359)) {
                        return;
                    }
                    var3 = var6.method934(arg0 ^ 0xFFFFFFBA);
                    if (this.field4280 != var6.field1776) {
                        var4 = var6.field1759;
                    }
                } else if (var6 != null && var6.field1703 != -1 && this.field4280 != var6.field1776) {
                    var4 = var6.field1759;
                    var3 = var6.field1703;
                }
            } else if (this.field4280 != var5.field1776) {
                var3 = var5.field1703;
                var4 = var5.field1759;
            }
        }
        if (var3 == -1) {
            this.field4284 = null;
            return;
        }
        this.field4286 = null;
        if (this.field4284 == null || this.field4284.field9359 != var3) {
            this.field4284 = class456.field6436.method1021(var3, arg0 - 62);
        } else if (this.field4284.field9338 == 0) {
            return;
        }
        if (this.field4284.field9327 == null) {
            this.field4284 = null;
            return;
        }
        if (var4) {
            this.field4311 = (int) ((double) this.field4284.field9327.length * Math.random());
            this.field4281 = (int) ((double) this.field4284.field9357[this.field4311] * Math.random()) + 1;
        } else {
            this.field4311 = 0;
            this.field4281 = 1;
        }
        this.field4310 = this.field4311 + 1;
        if (this.field4310 < 0 || this.field4284.field9327.length <= this.field4310) {
            this.field4310 = -1;
        }
        this.field4301 = class641.field8810 - this.field4281;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BLha;)V")
    public final void method2011(byte arg0, class59 arg1) {
        field4288++;
        this.method2012(true, true, arg0 - 244, 262144, arg1);
        if (arg0 != 116) {
            this.field4290 = 99;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZZIILha;)Lka;")
    public final class472 method2012(boolean arg0, boolean arg1, int arg2, int arg3, class59 arg4) {
        field4309++;
        class99 var6 = class76.field1366.method1680(0, this.field4290);
        if (var6.field1780 != null) {
            var6 = var6.method925(class390.field5635, (byte) 47);
        }
        if (var6 == null) {
            this.method2018(-1, arg4);
            this.field4300 = -1;
            this.field4283 = -1;
            this.field4280 = -1;
            return null;
        }
        if (!this.field4291 && this.field4280 != var6.field1776) {
            this.field4286 = null;
            this.method2010((byte) 69, -1);
        }
        this.method2016(this.field4278, true);
        if (arg1) {
            boolean var7 = arg1 & this.field4292 & class693.field9368.field4435.method421(-32350) != 0;
            arg1 = var7 & (this.field4283 != var6.field1776 || this.field4284 != null && class693.field9368.field4435.method421(-32350) >= 2 && (this.field4311 != this.field4300 || (this.field4284.field9344 || class133.field2243) && this.field4311 != this.field4310));
        }
        if (arg0 && !arg1) {
            this.field4280 = var6.field1776;
            return null;
        }
        if (arg1) {
            class166.method1249(this.field4298, this.field4294, this.field4278.field5922, this.field4278.field5933, this.field4299);
            this.field4283 = -1;
            this.field4300 = -1;
        }
        if (arg2 > -126) {
            return null;
        }
        class281 var8 = class683.field9250[this.field4294];
        class281 var9;
        if (this.field4296) {
            var9 = class465.field6517[0];
        } else {
            var9 = this.field4294 >= 3 ? null : class683.field9250[this.field4294 + 1];
        }
        class472 var10 = null;
        if (this.field4284 != null) {
            if (arg1) {
                arg3 |= 0x40000;
            }
            var10 = var6.method928(this.field4310, this.field4281, this.field4306 == 11 ? 10 : this.field4306, var8.method1853(this.field4278.field5922, this.field4278.field5933, (byte) -2), arg4, this.field4306 == 11 ? this.field4279 + 4 : this.field4279, arg3, (byte) 76, var9, this.field4278.field5933, this.field4311, this.field4278.field5922, this.field4284, var8);
            if (var10 == null) {
                this.field4282 = 0;
                this.field4299 = null;
                this.field4287 = 0;
                this.field4298 = null;
            } else {
                if (arg1) {
                    if (this.field4299 == null) {
                        this.field4299 = new boolean[4];
                    }
                    this.field4298 = var10.method530(this.field4298);
                    class491.method2900(this.field4298, this.field4294, this.field4278.field5922, this.field4278.field5933, this.field4299);
                    this.field4300 = this.field4311;
                    this.field4283 = var6.field1776;
                }
                this.field4287 = var10.method486();
                this.field4282 = var10.method513();
            }
            this.field4286 = null;
        } else if (this.field4286 != null && arg3 == (arg3 & this.field4286.method527()) && this.field4280 == var6.field1776) {
            var10 = this.field4286;
        } else {
            if (this.field4286 != null) {
                arg3 |= this.field4286.method527();
            }
            class351 var11 = var6.method921(arg4, var9, this.field4306 == 11 ? 10 : this.field4306, arg3, this.field4278.field5922, arg1, var8, var8.method1853(this.field4278.field5922, this.field4278.field5933, (byte) -114), this.field4278.field5933, this.field4306 == 11 ? this.field4279 + 4 : this.field4279, 128);
            if (var11 == null) {
                this.field4282 = 0;
                this.field4299 = null;
                this.field4298 = null;
                this.field4287 = 0;
                this.field4286 = null;
            } else {
                var10 = var11.field4890;
                this.field4286 = var11.field4890;
                if (arg1) {
                    this.field4299 = null;
                    this.field4298 = var11.field4889;
                    class491.method2900(this.field4298, this.field4294, this.field4278.field5922, this.field4278.field5933, null);
                    this.field4300 = -1;
                    this.field4283 = var6.field1776;
                }
                this.field4287 = var10.method486();
                this.field4282 = var10.method513();
            }
        }
        this.field4280 = var6.field1776;
        return var10;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method2013(int arg0, int arg1) {
        if (arg0 != -19918) {
            method2013(75, 33);
        }
        field4293++;
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFFB428) >> 16) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILbca;ILha;ILka;ZBI)V")
    public final void method2014(int arg0, class661 arg1, int arg2, class59 arg3, int arg4, class472 arg5, boolean arg6, byte arg7, int arg8) {
        field4285++;
        if (arg7 != -73) {
            this.field4279 = 62;
        }
        class417[] var10 = arg5.method494();
        class755[] var11 = arg5.method525();
        if ((this.field4308 == null || this.field4308.field5582) && (var10 != null || var11 != null)) {
            class99 var12 = class76.field1366.method1680(0, this.field4290);
            if (var12.field1780 != null) {
                var12 = var12.method925(class390.field5635, (byte) 47);
            }
            if (var12 != null) {
                this.field4308 = class385.method2420(class641.field8810, true);
            }
        }
        if (this.field4308 == null) {
            return;
        }
        arg5.method523(arg1);
        if (arg6) {
            this.field4308.method2430(arg3, (long) class641.field8810, var10, var11, false);
        } else {
            this.field4308.method2434((long) class641.field8810);
        }
        this.field4308.method2427(this.field4312, arg4, arg0, arg8, arg2);
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(II)V")
    public final void method2015(int arg0, int arg1) {
        this.field4291 = true;
        field4305++;
        this.method2010((byte) 69, arg1);
        if (arg0 != 262144) {
            field4302 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4307++;
        if (this.field4308 != null) {
            this.field4308.method2428();
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lga;Z)V")
    private final void method2016(class404 arg0, boolean arg1) {
        if (!arg1) {
            this.method2018(-55, null);
        }
        field4313++;
        label92: while (true) {
            if (this.field4284 == null) {
                if (this.field4291) {
                    return;
                }
                this.method2010((byte) 69, -1);
                if (this.field4284 == null) {
                    return;
                }
            }
            int var3 = class641.field8810 - this.field4301;
            if (var3 > 100 && this.field4284.field9328 > 0) {
                int var4 = this.field4284.field9327.length - this.field4284.field9328;
                while (this.field4311 < var4 && var3 > this.field4284.field9357[this.field4311]) {
                    var3 -= this.field4284.field9357[this.field4311];
                    this.field4311++;
                }
                if (this.field4311 >= var4) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field4284.field9327.length; var6++) {
                        var5 += this.field4284.field9357[var6];
                    }
                    var3 %= var5;
                }
                this.field4310 = this.field4311 + 1;
                if (this.field4310 >= this.field4284.field9327.length) {
                    this.field4310 -= this.field4284.field9328;
                    if (this.field4310 < 0 || this.field4284.field9327.length <= this.field4310) {
                        this.field4310 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var3 <= this.field4284.field9357[this.field4311]) {
                            this.field4281 = var3;
                            this.field4301 = class641.field8810 - var3;
                            return;
                        }
                        class190.method1366(arg0, this.field4311, this.field4284, -99);
                        var3 -= this.field4284.field9357[this.field4311];
                        this.field4311++;
                        if (this.field4284.field9327.length <= this.field4311) {
                            this.field4311 -= this.field4284.field9328;
                            if (this.field4311 < 0 || this.field4284.field9327.length <= this.field4311) {
                                this.field4284 = null;
                                continue label92;
                            }
                        }
                        this.field4310 = this.field4311 + 1;
                    } while (this.field4284.field9327.length > this.field4310);
                    this.field4310 -= this.field4284.field9328;
                } while (this.field4310 >= 0 && this.field4310 < this.field4284.field9327.length);
                this.field4310 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "(I)V")
    public static void method2017(int arg0) {
        field4302 = null;
        field4295 = null;
        if (arg0 >= -19) {
            method2013(-110, -13);
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lha;Liv;IIIILga;ZI)V")
    public class309(class59 arg0, class99 arg1, int arg2, int arg3, int arg4, int arg5, class404 arg6, boolean arg7, int arg8) {
        this.field4306 = arg2;
        this.field4290 = arg1.field1776;
        this.field4278 = arg6;
        this.field4312 = (byte) arg4;
        this.field4294 = (byte) arg5;
        this.field4296 = arg7;
        this.field4279 = arg3;
        this.field4292 = arg0.method263() && arg1.field1729 && !this.field4296;
        if (arg8 != -1) {
            this.field4291 = true;
        }
        this.method2010((byte) 69, arg8);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILha;)V")
    public final void method2018(int arg0, class59 arg1) {
        if (arg0 != -1) {
            this.field4291 = false;
        }
        if (this.field4298 != null) {
            class166.method1249(this.field4298, this.field4294, this.field4278.field5922, this.field4278.field5933, this.field4299);
            this.field4298 = null;
            this.field4299 = null;
        }
        field4277++;
    }
}
