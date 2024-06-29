import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class677 extends class13 {

    @OriginalMember(owner = "client!rn", name = "B", descriptor = "I")
    private int field9524 = 0;

    @OriginalMember(owner = "client!rn", name = "F", descriptor = "Lsi;")
    private class769 field9528 = new class769(16);

    @OriginalMember(owner = "client!rn", name = "N", descriptor = "I")
    private int field9535 = 0;

    @OriginalMember(owner = "client!rn", name = "M", descriptor = "Low;")
    private class665 field9534 = new class665();

    @OriginalMember(owner = "client!rn", name = "P", descriptor = "J")
    private long field9537 = 0L;

    @OriginalMember(owner = "client!rn", name = "y", descriptor = "I")
    private int field9521;

    @OriginalMember(owner = "client!rn", name = "E", descriptor = "Lce;")
    private class590 field9527;

    @OriginalMember(owner = "client!rn", name = "O", descriptor = "Z")
    private boolean field9536;

    @OriginalMember(owner = "client!rn", name = "K", descriptor = "Low;")
    private class665 field9532;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "Lce;")
    private class590 field9504;

    @OriginalMember(owner = "client!rn", name = "t", descriptor = "I")
    private int field9516;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "[B")
    private byte[] field9503;

    @OriginalMember(owner = "client!rn", name = "r", descriptor = "Lcda;")
    private class595 field9514;

    @OriginalMember(owner = "client!rn", name = "q", descriptor = "I")
    private int field9513;

    @OriginalMember(owner = "client!rn", name = "Q", descriptor = "Z")
    private boolean field9538;

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "Ll;")
    private class291 field9522;

    @OriginalMember(owner = "client!rn", name = "A", descriptor = "Ljl;")
    private class729 field9523;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
    public static int field9512 = 1409;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "S")
    public static short field9526 = 256;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "Laq;")
    public static class494 field9507 = new class494(5);

    @OriginalMember(owner = "client!rn", name = "w", descriptor = "D")
    public static double field9519;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field9502;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public static int field9505;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    public static int field9506;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
    public static int field9508;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public static int field9509;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
    public static int field9510;

    @OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
    public static int field9515;

    @OriginalMember(owner = "client!rn", name = "u", descriptor = "I")
    public static int field9517;

    @OriginalMember(owner = "client!rn", name = "v", descriptor = "I")
    public static int field9518;

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "I")
    public static int field9525;

    @OriginalMember(owner = "client!rn", name = "G", descriptor = "I")
    public static int field9529;

    @OriginalMember(owner = "client!rn", name = "H", descriptor = "I")
    public static int field9530;

    @OriginalMember(owner = "client!rn", name = "J", descriptor = "I")
    public static int field9531;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "Lwu;")
    private class170 field9501;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "Lpa;")
    public static class660 field9511;

    @OriginalMember(owner = "client!rn", name = "L", descriptor = "Z")
    private boolean field9533;

    @OriginalMember(owner = "client!rn", name = "x", descriptor = "[B")
    private byte[] field9520;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)[B")
    public final byte[] method163(int arg0, int arg1) {
        field9529++;
        class729 var3 = this.method3791(arg0, 0, (byte) 54);
        if (var3 == null) {
            return null;
        }
        if (arg1 != -32171) {
            this.method3798(-94);
        }
        byte[] var4 = var3.method713(-49);
        var3.method4237(arg1 ^ 0x7DAA);
        return var4;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V")
    public static void method3790(int arg0) {
        if (arg0 != 8579) {
            field9519 = 1.6411091240013216D;
        }
        field9511 = null;
        field9507 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIB)Ljl;")
    private final class729 method3791(int arg0, int arg1, byte arg2) {
        field9525++;
        class729 var4 = (class729) this.field9528.method4253((long) arg0, -1);
        if (var4 != null && arg1 == 0 && !var4.field10170 && var4.field10169) {
            var4.method4237(arg2 - 55);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field9527 == null || this.field9520[arg0] == -1) {
                    if (this.field9522.method1847((byte) -105)) {
                        return null;
                    }
                    var4 = this.field9522.method1839((byte) 2, arg0, this.field9521, 126, true);
                } else {
                    var4 = this.field9514.method3477(this.field9527, (byte) -97, arg0);
                }
            } else if (arg1 == 1) {
                if (this.field9527 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field9514.method3474(arg0, 126, this.field9527);
            } else if (arg1 == 2) {
                if (this.field9527 == null) {
                    throw new RuntimeException();
                }
                if (this.field9520[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field9522.method1843(arg2 ^ 0xFFFFFFDD)) {
                    return null;
                }
                var4 = this.field9522.method1839((byte) 2, arg0, this.field9521, 105, false);
            } else {
                throw new RuntimeException();
            }
            this.field9528.method4252(false, var4, (long) arg0);
        }
        if (var4.field10169) {
            return null;
        } else if (arg2 == 54) {
            byte[] var5 = var4.method713(arg2 ^ 0x47);
            if (!var4 instanceof class177) {
                try {
                    label159: {
                        if (var5 != null && var5.length > 2) {
                            class229.field3347.reset();
                            class229.field3347.update(var5, 0, var5.length - 2);
                            int var12 = (int) class229.field3347.getValue();
                            if (this.field9501.field2575[arg0] != var12) {
                                throw new RuntimeException();
                            }
                            if (this.field9501.field2570 == null || this.field9501.field2570[arg0] == null) {
                                break label159;
                            }
                            byte[] var13 = this.field9501.field2570[arg0];
                            byte[] var14 = class65.method652(var5, 0, var5.length - 2, (byte) -60);
                            int var15 = 0;
                            while (true) {
                                if (var15 >= 64) {
                                    break label159;
                                }
                                if (var13[var15] != var14[var15]) {
                                    throw new RuntimeException();
                                }
                                var15++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    this.field9522.field4268 = 0;
                    this.field9522.field4266 = 0;
                } catch (RuntimeException var18) {
                    this.field9522.method1837(arg2 ^ 0x37);
                    var4.method4237(arg2 - 55);
                    if (var4.field10170 && !this.field9522.method1847((byte) -111)) {
                        class80 var16 = this.field9522.method1839((byte) 2, arg0, this.field9521, 116, true);
                        this.field9528.method4252(false, var16, (long) arg0);
                    }
                    return null;
                }
                var5[var5.length - 2] = (byte) (this.field9501.field2583[arg0] >>> 8);
                var5[var5.length - 1] = (byte) this.field9501.field2583[arg0];
                if (this.field9527 != null) {
                    this.field9514.method3475((byte) -115, this.field9527, var5, arg0);
                    if (this.field9520[arg0] != 1) {
                        this.field9524++;
                        this.field9520[arg0] = 1;
                    }
                }
                if (!var4.field10170) {
                    var4.method4237(-1);
                }
                return var4;
            }
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class229.field3347.reset();
                class229.field3347.update(var5, 0, var5.length - 2);
                int var6 = (int) class229.field3347.getValue();
                if (this.field9501.field2575[arg0] != var6) {
                    throw new RuntimeException();
                }
                if (this.field9501.field2570 != null && this.field9501.field2570[arg0] != null) {
                    byte[] var7 = this.field9501.field2570[arg0];
                    byte[] var8 = class65.method652(var5, 0, var5.length - 2, (byte) -60);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
                if ((this.field9501.field2583[arg0] & 0xFFFF) != var10) {
                    throw new RuntimeException();
                }
                if (this.field9520[arg0] != 1) {
                    this.field9524++;
                    this.field9520[arg0] = 1;
                }
                if (!var4.field10170) {
                    var4.method4237(-1);
                }
                return var4;
            } catch (Exception var17) {
                this.field9520[arg0] = -1;
                var4.method4237(-1);
                if (var4.field10170 && !this.field9522.method1847((byte) -127)) {
                    class80 var11 = this.field9522.method1839((byte) 2, arg0, this.field9521, 110, true);
                    this.field9528.method4252(false, var11, (long) arg0);
                }
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lol;I)Lhda;")
    public static final class714 method3792(class431 arg0, int arg1) {
        field9510++;
        class565 var2 = class551.method3180(-1)[arg0.method2557(arg1 + 14929)];
        class345 var3 = class91.method777(true)[arg0.method2557(14929)];
        int var4 = arg0.method2528((byte) 89);
        int var5 = arg0.method2528((byte) 89);
        int var6 = arg0.method2565((byte) -104);
        int var7 = arg0.method2565((byte) -100);
        int var8 = arg0.method2528((byte) 89);
        int var9 = arg0.method2526(17);
        if (arg1 != 0) {
            field9512 = 0;
        }
        int var10 = arg0.method2526(17);
        return new class714(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)I")
    public final int method3793(byte arg0) {
        if (arg0 != -118) {
            method3790(7);
        }
        field9502++;
        return this.field9501 == null ? 0 : this.field9501.field2571;
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(B)I")
    public final int method3794(byte arg0) {
        field9531++;
        if (this.field9501 == null) {
            return 0;
        } else if (!this.field9536) {
            return this.field9501.field2571;
        } else if (arg0 == -40) {
            class766 var2 = this.field9532.method3731((byte) -69);
            return var2 == null ? 0 : (int) var2.field10592;
        } else {
            return -77;
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(II)V")
    public final void method165(int arg0, int arg1) {
        field9508++;
        if (this.field9527 == null) {
            return;
        }
        for (class766 var3 = this.field9534.method3731((byte) -125); var3 != null; var3 = this.field9534.method3729((byte) 124)) {
            if (((long) arg1) == var3.field10592) {
                return;
            }
        }
        if (arg0 != 0) {
            method3790(-82);
        }
        class766 var4 = new class766();
        var4.field10592 = arg1;
        this.field9534.method3728((byte) 118, var4);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)Lwu;")
    public final class170 method164(byte arg0) {
        field9517++;
        if (this.field9501 != null) {
            return this.field9501;
        }
        if (this.field9523 == null) {
            if (this.field9522.method1847((byte) -95)) {
                return null;
            }
            this.field9523 = this.field9522.method1839((byte) 0, this.field9521, 255, 116, true);
        }
        if (this.field9523.field10169) {
            return null;
        }
        byte[] var2 = this.field9523.method713(107);
        if (this.field9523 instanceof class177) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field9501 = new class170(var2, this.field9516, this.field9503);
                if (this.field9501.field2586 != this.field9513) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field9501 = null;
                if (this.field9522.method1847((byte) -107)) {
                    this.field9523 = null;
                } else {
                    this.field9523 = this.field9522.method1839((byte) 0, this.field9521, 255, arg0 + 108, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field9501 = new class170(var2, this.field9516, this.field9503);
            } catch (RuntimeException var4) {
                this.field9522.method1837(1);
                this.field9501 = null;
                if (this.field9522.method1847((byte) -125)) {
                    this.field9523 = null;
                } else {
                    this.field9523 = this.field9522.method1839((byte) 0, this.field9521, 255, arg0 ^ 0x69, true);
                }
                return null;
            }
            if (this.field9504 != null) {
                this.field9514.method3475((byte) -117, this.field9504, var2, this.field9521);
            }
        }
        if (this.field9527 != null) {
            this.field9520 = new byte[this.field9501.field2572];
            this.field9524 = 0;
        }
        if (arg0 == 2) {
            this.field9523 = null;
            return this.field9501;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(I)I")
    public final int method3795(int arg0) {
        field9505++;
        return arg0 > -7 ? 65 : this.field9524;
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)I")
    public final int method3796(int arg0) {
        field9515++;
        if (this.method164((byte) 2) == null) {
            return this.field9523 == null ? 0 : this.field9523.method715(0);
        } else {
            if (arg0 != -14963) {
                this.method167((byte) 1, -89);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)I")
    public final int method167(byte arg0, int arg1) {
        field9509++;
        class729 var3 = (class729) this.field9528.method4253((long) arg1, -1);
        if (var3 == null) {
            if (arg0 <= 79) {
                this.method163(-97, 95);
            }
            return 0;
        } else {
            return var3.method715(0);
        }
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(B)V")
    public final void method3797(byte arg0) {
        field9518++;
        if (this.field9532 == null || this.method164((byte) 2) == null || arg0 != 24) {
            return;
        }
        for (class766 var2 = this.field9534.method3731((byte) -119); var2 != null; var2 = this.field9534.method3729((byte) -128)) {
            int var3 = (int) var2.field10592;
            if (var3 < 0 || this.field9501.field2572 <= var3 || this.field9501.field2569[var3] == 0) {
                var2.method4237(-1);
            } else {
                if (this.field9520[var3] == 0) {
                    this.method3791(var3, 1, (byte) 54);
                }
                if (this.field9520[var3] == -1) {
                    this.method3791(var3, 2, (byte) 54);
                }
                if (this.field9520[var3] == 1) {
                    var2.method4237(-1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "(I)V")
    public final void method3798(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field9506++;
        if (this.field9527 != null) {
            this.field9533 = true;
            if (this.field9532 == null) {
                this.field9532 = new class665();
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "(I)V")
    public final void method3799(int arg0) {
        field9530++;
        if (arg0 != -1) {
            return;
        }
        if (this.field9532 != null) {
            if (this.method164((byte) 2) == null) {
                return;
            }
            if (this.field9536) {
                boolean var6 = true;
                for (class766 var7 = this.field9532.method3731((byte) -68); var7 != null; var7 = this.field9532.method3729((byte) -116)) {
                    int var9 = (int) var7.field10592;
                    if (this.field9520[var9] == 0) {
                        this.method3791(var9, 1, (byte) 54);
                    }
                    if (this.field9520[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method4237(-1);
                    }
                }
                while (this.field9501.field2569.length > this.field9535) {
                    if (this.field9501.field2569[this.field9535] == 0) {
                        this.field9535++;
                    } else {
                        if (this.field9514.field8511 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field9520[this.field9535] == 0) {
                            this.method3791(this.field9535, 1, (byte) 54);
                        }
                        if (this.field9520[this.field9535] == 0) {
                            class766 var8 = new class766();
                            var8.field10592 = this.field9535;
                            this.field9532.method3728((byte) 120, var8);
                            var6 = false;
                        }
                        this.field9535++;
                    }
                }
                if (var6) {
                    this.field9536 = false;
                    this.field9535 = 0;
                }
            } else if (this.field9533) {
                boolean var2 = true;
                for (class766 var3 = this.field9532.method3731((byte) -124); var3 != null; var3 = this.field9532.method3729((byte) 19)) {
                    int var5 = (int) var3.field10592;
                    if (this.field9520[var5] != 1) {
                        this.method3791(var5, 2, (byte) 54);
                    }
                    if (this.field9520[var5] == 1) {
                        var3.method4237(arg0);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field9501.field2569.length > this.field9535) {
                    if (this.field9501.field2569[this.field9535] == 0) {
                        this.field9535++;
                    } else {
                        if (this.field9522.method1843(arg0 - 20)) {
                            var2 = false;
                            break;
                        }
                        if (this.field9520[this.field9535] != 1) {
                            this.method3791(this.field9535, 2, (byte) 54);
                        }
                        if (this.field9520[this.field9535] != 1) {
                            class766 var4 = new class766();
                            var4.field10592 = this.field9535;
                            var2 = false;
                            this.field9532.method3728((byte) 105, var4);
                        }
                        this.field9535++;
                    }
                }
                if (var2) {
                    this.field9535 = 0;
                    this.field9533 = false;
                }
            } else {
                this.field9532 = null;
            }
        }
        if (!this.field9538 || class337.method2062(false) < this.field9537) {
            return;
        }
        for (class729 var10 = (class729) this.field9528.method4254((byte) 8); var10 != null; var10 = (class729) this.field9528.method4251(arg0 ^ 0x34)) {
            if (!var10.field10169) {
                if (var10.field10172) {
                    if (!var10.field10170) {
                        throw new RuntimeException();
                    }
                    var10.method4237(-1);
                } else {
                    var10.field10172 = true;
                }
            }
        }
        this.field9537 = class337.method2062(false) + 1000L;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(ILce;Lce;Ll;Lcda;I[BIZ)V")
    public class677(int arg0, class590 arg1, class590 arg2, class291 arg3, class595 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field9521 = arg0;
        this.field9527 = arg1;
        if (this.field9527 == null) {
            this.field9536 = false;
        } else {
            this.field9536 = true;
            this.field9532 = new class665();
        }
        this.field9504 = arg2;
        this.field9516 = arg5;
        this.field9503 = arg6;
        this.field9514 = arg4;
        this.field9513 = arg7;
        this.field9538 = arg8;
        this.field9522 = arg3;
        if (this.field9504 != null) {
            this.field9523 = this.field9514.method3477(this.field9504, (byte) -61, this.field9521);
        }
    }
}
