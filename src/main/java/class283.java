import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class283 extends class33 {

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    private int field4321 = 0;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "Lc;")
    private class284 field4309 = new class284(16);

    @OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
    private int field4337 = 0;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "Lbh;")
    private class234 field4334 = new class234();

    @OriginalMember(owner = "client!sh", name = "U", descriptor = "J")
    private long field4340 = 0L;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "Llb;")
    private class105 field4317;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    private int field4305;

    @OriginalMember(owner = "client!sh", name = "Q", descriptor = "Z")
    private boolean field4336;

    @OriginalMember(owner = "client!sh", name = "S", descriptor = "Lbh;")
    private class234 field4338;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
    private int field4329;

    @OriginalMember(owner = "client!sh", name = "T", descriptor = "Z")
    private boolean field4339;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "Ljg;")
    private class158 field4322;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "Lmd;")
    private class120 field4318;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    private int field4327;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "Llb;")
    private class105 field4333;

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "Lmf;")
    private class28 field4331;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "[I")
    public static int[] field4312 = new int[25];

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "Z")
    public static boolean field4308 = true;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "[I")
    public static int[] field4316 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "Lmg;")
    private class294 field4323;

    @OriginalMember(owner = "client!sh", name = "P", descriptor = "Z")
    private boolean field4335;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "[B")
    private byte[] field4306;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Lmg;")
    public final class294 method203(int arg0) {
        field4332++;
        if (this.field4323 != null) {
            return this.field4323;
        }
        if (this.field4331 == null) {
            if (this.field4322.method1057(0)) {
                return null;
            }
            this.field4331 = this.field4322.method1059((byte) 0, true, this.field4305, 255, false);
        }
        if (this.field4331.field338) {
            return null;
        }
        if (arg0 != -1) {
            this.field4333 = null;
        }
        byte[] var2 = this.field4331.method170(-85);
        if (this.field4331 instanceof class247) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4323 = new class294(var2, this.field4329);
                if (this.field4323.field4643 != this.field4327) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field4323 = null;
                if (this.field4322.method1057(0)) {
                    this.field4331 = null;
                } else {
                    this.field4331 = this.field4322.method1059((byte) 0, true, this.field4305, 255, false);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4323 = new class294(var2, this.field4329);
            } catch (RuntimeException var4) {
                this.field4322.method1058((byte) 120);
                this.field4323 = null;
                if (this.field4322.method1057(0)) {
                    this.field4331 = null;
                } else {
                    this.field4331 = this.field4322.method1059((byte) 0, true, this.field4305, 255, false);
                }
                return null;
            }
            if (this.field4333 != null) {
                this.field4318.method784(this.field4333, -128, var2, this.field4305);
            }
        }
        if (this.field4317 != null) {
            this.field4306 = new byte[this.field4323.field4648];
            this.field4321 = 0;
        }
        this.field4331 = null;
        return this.field4323;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(B)I")
    public final int method1877(byte arg0) {
        field4310++;
        int var2 = 77 / ((arg0 + 2) / 51);
        return this.field4323 == null ? 0 : this.field4323.field4652;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
    public final void method1878(int arg0) {
        field4324++;
        if (this.field4317 == null) {
            return;
        }
        this.field4335 = true;
        int var2 = 67 % ((arg0 + 63) / 56);
        if (this.field4338 == null) {
            this.field4338 = new class234();
        }
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(B)I")
    public final int method1879(byte arg0) {
        field4314++;
        if (this.field4323 == null) {
            return 0;
        } else if (this.field4336) {
            class288 var2 = this.field4338.method1532(-94);
            if (var2 == null) {
                return 0;
            } else {
                int var3 = 106 % ((-arg0 - 9) / 40);
                return (int) var2.field4489;
            }
        } else {
            return this.field4323.field4652;
        }
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(B)V")
    public static final void method1880(byte arg0) {
        field4313++;
        int var1 = -3 / ((14 - arg0) / 41);
        class51.field590.method67((byte) 110);
        class54.field623.method67((byte) 71);
        class38.field464.method67((byte) 90);
    }

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "(B)V")
    public static void method1881(byte arg0) {
        field4312 = null;
        int var1 = 88 % ((-arg0 - 42) / 45);
        field4316 = null;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)I")
    public final int method209(int arg0, int arg1) {
        class28 var3 = (class28) this.field4309.method1895((long) arg0, -117);
        field4330++;
        if (var3 == null) {
            return arg1 < 93 ? -61 : 0;
        } else {
            return var3.method169(16);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZI)V")
    public final void method207(boolean arg0, int arg1) {
        field4307++;
        if (this.field4317 == null) {
            return;
        }
        if (arg0) {
            this.method203(-94);
        }
        for (class288 var3 = this.field4334.method1532(-119); var3 != null; var3 = this.field4334.method1523(-108)) {
            if ((long) arg1 == var3.field4489) {
                return;
            }
        }
        class288 var4 = new class288();
        var4.field4489 = (long) arg1;
        this.field4334.method1522(var4, 119);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)Lmf;")
    private final class28 method1882(int arg0, int arg1, int arg2) {
        class28 var4 = (class28) this.field4309.method1895((long) arg1, -114);
        field4319++;
        if (var4 != null && arg2 == 0 && !var4.field339 && var4.field338) {
            var4.method1935(110);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field4317 == null || this.field4306[arg1] == -1) {
                    if (this.field4322.method1057(0)) {
                        return null;
                    }
                    var4 = this.field4322.method1059((byte) 2, true, arg1, this.field4305, false);
                } else {
                    var4 = this.field4318.method788(arg1, this.field4317, (byte) 16);
                }
            } else if (arg2 == 1) {
                if (this.field4317 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4318.method785(this.field4317, 127, arg1);
            } else if (arg2 == 2) {
                if (this.field4317 == null) {
                    throw new RuntimeException();
                }
                if (this.field4306[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4322.method1048(true)) {
                    return null;
                }
                var4 = this.field4322.method1059((byte) 2, false, arg1, this.field4305, false);
            } else {
                throw new RuntimeException();
            }
            this.field4309.method1894(-1, var4, (long) arg1);
        }
        if (var4.field338) {
            return null;
        }
        byte[] var5 = var4.method170(-50);
        if (arg0 <= 27) {
            this.method1884((byte) 122);
        }
        if (!var4 instanceof class247) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class36.field417.reset();
                class36.field417.update(var5, 0, var5.length - 2);
                int var6 = (int) class36.field417.getValue();
                if (this.field4323.field4660[arg1] != var6) {
                    throw new RuntimeException();
                }
                this.field4322.field2298 = 0;
                this.field4322.field2299 = 0;
            } catch (RuntimeException var12) {
                this.field4322.method1058((byte) 120);
                var4.method1935(101);
                if (var4.field339 && !this.field4322.method1057(0)) {
                    class198 var7 = this.field4322.method1059((byte) 2, true, arg1, this.field4305, false);
                    this.field4309.method1894(-1, var7, (long) arg1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4323.field4661[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field4323.field4661[arg1];
            if (this.field4317 != null) {
                this.field4318.method784(this.field4317, -122, var5, arg1);
                if (this.field4306[arg1] != 1) {
                    this.field4321++;
                    this.field4306[arg1] = 1;
                }
            }
            if (!var4.field339) {
                var4.method1935(102);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class36.field417.reset();
            class36.field417.update(var5, 0, var5.length - 2);
            int var8 = (int) class36.field417.getValue();
            if (this.field4323.field4660[arg1] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4323.field4661[arg1] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field4306[arg1] != 1) {
                this.field4321++;
                this.field4306[arg1] = 1;
            }
            if (!var4.field339) {
                var4.method1935(108);
            }
            return var4;
        } catch (Exception var11) {
            this.field4306[arg1] = -1;
            var4.method1935(108);
            if (var4.field339 && !this.field4322.method1057(0)) {
                class198 var10 = this.field4322.method1059((byte) 2, true, arg1, this.field4305, false);
                this.field4309.method1894(-1, var10, (long) arg1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[B")
    public final byte[] method208(int arg0, int arg1) {
        field4326++;
        class28 var3 = this.method1882(arg1 ^ 0xFFFF9209, arg0, 0);
        if (arg1 != -28111) {
            return null;
        } else if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method170(-106);
            var3.method1935(arg1 + 28229);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)I")
    public final int method1883(int arg0) {
        if (arg0 < 15) {
            return 107;
        } else {
            field4311++;
            return this.field4321;
        }
    }

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "(B)V")
    public final void method1884(byte arg0) {
        field4315++;
        if (this.field4338 != null) {
            if (this.method203(-1) == null) {
                return;
            }
            if (this.field4336) {
                boolean var6 = true;
                for (class288 var7 = this.field4338.method1532(-74); var7 != null; var7 = this.field4338.method1523(arg0 ^ 0xFFFFFFE8)) {
                    int var9 = (int) var7.field4489;
                    if (this.field4306[var9] == 0) {
                        this.method1882(62, var9, 1);
                    }
                    if (this.field4306[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method1935(114);
                    }
                }
                while (this.field4323.field4645.length > this.field4337) {
                    if (this.field4323.field4645[this.field4337] == 0) {
                        this.field4337++;
                    } else {
                        if (this.field4318.field1719 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field4306[this.field4337] == 0) {
                            this.method1882(99, this.field4337, 1);
                        }
                        if (this.field4306[this.field4337] == 0) {
                            class288 var8 = new class288();
                            var6 = false;
                            var8.field4489 = (long) this.field4337;
                            this.field4338.method1522(var8, arg0 ^ 0xFFFFFFF0);
                        }
                        this.field4337++;
                    }
                }
                if (var6) {
                    this.field4337 = 0;
                    this.field4336 = false;
                }
            } else if (this.field4335) {
                boolean var2 = true;
                for (class288 var3 = this.field4338.method1532(-103); var3 != null; var3 = this.field4338.method1523(-97)) {
                    int var5 = (int) var3.field4489;
                    if (this.field4306[var5] != 1) {
                        this.method1882(96, var5, 2);
                    }
                    if (this.field4306[var5] == 1) {
                        var3.method1935(121);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field4337 < this.field4323.field4645.length) {
                    if (this.field4323.field4645[this.field4337] == 0) {
                        this.field4337++;
                    } else {
                        if (this.field4322.method1048(true)) {
                            var2 = false;
                            break;
                        }
                        if (this.field4306[this.field4337] != 1) {
                            this.method1882(96, this.field4337, 2);
                        }
                        if (this.field4306[this.field4337] != 1) {
                            var2 = false;
                            class288 var4 = new class288();
                            var4.field4489 = (long) this.field4337;
                            this.field4338.method1522(var4, -47);
                        }
                        this.field4337++;
                    }
                }
                if (var2) {
                    this.field4335 = false;
                    this.field4337 = 0;
                }
            } else {
                this.field4338 = null;
            }
        }
        if (this.field4339 && this.field4340 <= class86.method509(false)) {
            for (class28 var10 = (class28) this.field4309.method1890((byte) 126); var10 != null; var10 = (class28) this.field4309.method1889(false)) {
                if (!var10.field338) {
                    if (var10.field335) {
                        if (!var10.field339) {
                            throw new RuntimeException();
                        }
                        var10.method1935(arg0 + 5);
                    } else {
                        var10.field335 = true;
                    }
                }
            }
            this.field4340 = class86.method509(false) + 1000L;
        }
        if (arg0 != 114) {
            this.field4336 = true;
        }
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)I")
    public final int method1885(int arg0) {
        if (arg0 < 18) {
            this.method1885(24);
        }
        field4328++;
        if (this.method203(-1) == null) {
            return this.field4331 == null ? 0 : this.field4331.method169(16);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "(B)V")
    public final void method1886(byte arg0) {
        field4325++;
        if (this.field4338 == null || this.method203(-1) == null) {
            return;
        }
        if (arg0 >= -68) {
            method1880((byte) -51);
        }
        for (class288 var2 = this.field4334.method1532(-94); var2 != null; var2 = this.field4334.method1523(-90)) {
            int var3 = (int) var2.field4489;
            if (var3 < 0 || this.field4323.field4648 <= var3 || this.field4323.field4645[var3] == 0) {
                var2.method1935(108);
            } else {
                if (this.field4306[var3] == 0) {
                    this.method1882(33, var3, 1);
                }
                if (this.field4306[var3] == -1) {
                    this.method1882(101, var3, 2);
                }
                if (this.field4306[var3] == 1) {
                    var2.method1935(116);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(ILlb;Llb;Ljg;Lmd;IIZ)V")
    public class283(int arg0, class105 arg1, class105 arg2, class158 arg3, class120 arg4, int arg5, int arg6, boolean arg7) {
        this.field4317 = arg1;
        this.field4305 = arg0;
        if (this.field4317 == null) {
            this.field4336 = false;
        } else {
            this.field4336 = true;
            this.field4338 = new class234();
        }
        this.field4329 = arg5;
        this.field4339 = arg7;
        this.field4322 = arg3;
        this.field4318 = arg4;
        this.field4327 = arg6;
        this.field4333 = arg2;
        if (this.field4333 != null) {
            this.field4331 = this.field4318.method788(this.field4305, this.field4333, (byte) 16);
        }
    }
}
