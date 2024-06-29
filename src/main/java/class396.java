import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class396 extends class252 {

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    private int field5265 = 0;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "Ljr;")
    private class357 field5275 = new class357(16);

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    private int field5280 = 0;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "Ltu;")
    private class7 field5283 = new class7();

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "J")
    private long field5286 = 0L;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "Ljb;")
    private class374 field5270;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    private int field5259;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "Z")
    private boolean field5282;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "Ltu;")
    private class7 field5281;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Lau;")
    private class391 field5258;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "Z")
    private boolean field5287;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    private int field5254;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "Lph;")
    private class358 field5274;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    private int field5279;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Ljb;")
    private class374 field5256;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "Lg;")
    private class419 field5255;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "Ljc;")
    private class480 field5272;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Lclient;")
    public static client field5266;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "Z")
    private boolean field5284;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "[B")
    private byte[] field5261;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 11)
    public final void method2357(byte arg0) {
        field5262++;
        if (this.field5281 == null || this.method1574(0) == null || arg0 != 0) {
            return;
        }
        for (class508 var2 = this.field5283.method49(9); var2 != null; var2 = this.field5283.method46((byte) 114)) {
            int var3 = (int) var2.field7456;
            if (var3 < 0 || this.field5272.field6997 <= var3 || this.field5272.field6988[var3] == 0) {
                var2.method3021(arg0 ^ 0x55);
            } else {
                if (this.field5261[var3] == 0) {
                    this.method2365((byte) 2, var3, 1);
                }
                if (this.field5261[var3] == -1) {
                    this.method2365((byte) 2, var3, 2);
                }
                if (this.field5261[var3] == 1) {
                    var2.method3021(43);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)Ljc;", line = 55)
    public final class480 method1574(int arg0) {
        field5257++;
        if (this.field5272 != null) {
            return this.field5272;
        }
        if (this.field5255 == null) {
            if (this.field5274.method2111(arg0 ^ 0x52)) {
                return null;
            }
            this.field5255 = this.field5274.method2106(255, this.field5259, (byte) 0, arg0 + 100, true);
        }
        if (arg0 != 0) {
            this.field5275 = null;
        }
        if (this.field5255.field5569) {
            return null;
        }
        byte[] var2 = this.field5255.method2370((byte) -32);
        if (this.field5255 instanceof class398) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5272 = new class480(var2, this.field5279);
                if (this.field5272.field6998 != this.field5254) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field5272 = null;
                if (this.field5274.method2111(113)) {
                    this.field5255 = null;
                } else {
                    this.field5255 = this.field5274.method2106(255, this.field5259, (byte) 0, 100, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5272 = new class480(var2, this.field5279);
            } catch (RuntimeException var4) {
                this.field5274.method2112(false);
                this.field5272 = null;
                if (this.field5274.method2111(114)) {
                    this.field5255 = null;
                } else {
                    this.field5255 = this.field5274.method2106(255, this.field5259, (byte) 0, 100, true);
                }
                return null;
            }
            if (this.field5256 != null) {
                this.field5258.method2332(var2, this.field5259, (byte) -81, this.field5256);
            }
        }
        if (this.field5270 != null) {
            this.field5265 = 0;
            this.field5261 = new byte[this.field5272.field6997];
        }
        this.field5255 = null;
        return this.field5272;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V", line = 151)
    public final void method2358(boolean arg0) {
        if (arg0) {
            this.field5265 = 9;
        }
        field5264++;
        if (this.field5270 != null) {
            this.field5284 = true;
            if (this.field5281 == null) {
                this.field5281 = new class7();
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)I", line = 170)
    public final int method2359(int arg0) {
        field5278++;
        if (arg0 < 0) {
            this.field5282 = true;
        }
        return this.field5265;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(BI)V", line = 188)
    public final void method1573(byte arg0, int arg1) {
        if (arg0 != 94) {
            return;
        }
        field5269++;
        if (this.field5270 == null) {
            return;
        }
        for (class508 var3 = this.field5283.method49(arg0 ^ 0x20); var3 != null; var3 = this.field5283.method46((byte) 93)) {
            if (((long) arg1) == var3.field7456) {
                return;
            }
        }
        class508 var4 = new class508();
        var4.field7456 = arg1;
        this.field5283.method42(var4, 0);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V", line = 217)
    public final void method2360(byte arg0) {
        int var2 = 113 % ((12 - arg0) / 43);
        field5273++;
        if (this.field5281 != null) {
            if (this.method1574(0) == null) {
                return;
            }
            if (this.field5282) {
                boolean var7 = true;
                for (class508 var8 = this.field5281.method49(24); var8 != null; var8 = this.field5281.method46((byte) 63)) {
                    int var10 = (int) var8.field7456;
                    if (this.field5261[var10] == 0) {
                        this.method2365((byte) 2, var10, 1);
                    }
                    if (this.field5261[var10] == 0) {
                        var7 = false;
                    } else {
                        var8.method3021(112);
                    }
                }
                while (this.field5280 < this.field5272.field6988.length) {
                    if (this.field5272.field6988[this.field5280] == 0) {
                        this.field5280++;
                    } else {
                        if (this.field5258.field5130 >= 250) {
                            var7 = false;
                            break;
                        }
                        if (this.field5261[this.field5280] == 0) {
                            this.method2365((byte) 2, this.field5280, 1);
                        }
                        if (this.field5261[this.field5280] == 0) {
                            class508 var9 = new class508();
                            var9.field7456 = this.field5280;
                            var7 = false;
                            this.field5281.method42(var9, 0);
                        }
                        this.field5280++;
                    }
                }
                if (var7) {
                    this.field5280 = 0;
                    this.field5282 = false;
                }
            } else if (this.field5284) {
                boolean var3 = true;
                for (class508 var4 = this.field5281.method49(-108); var4 != null; var4 = this.field5281.method46((byte) 58)) {
                    int var6 = (int) var4.field7456;
                    if (this.field5261[var6] != 1) {
                        this.method2365((byte) 2, var6, 2);
                    }
                    if (this.field5261[var6] == 1) {
                        var4.method3021(-112);
                    } else {
                        var3 = false;
                    }
                }
                while (this.field5272.field6988.length > this.field5280) {
                    if (this.field5272.field6988[this.field5280] == 0) {
                        this.field5280++;
                    } else {
                        if (this.field5274.method2109((byte) -123)) {
                            var3 = false;
                            break;
                        }
                        if (this.field5261[this.field5280] != 1) {
                            this.method2365((byte) 2, this.field5280, 2);
                        }
                        if (this.field5261[this.field5280] != 1) {
                            class508 var5 = new class508();
                            var5.field7456 = this.field5280;
                            var3 = false;
                            this.field5281.method42(var5, 0);
                        }
                        this.field5280++;
                    }
                }
                if (var3) {
                    this.field5280 = 0;
                    this.field5284 = false;
                }
            } else {
                this.field5281 = null;
            }
        }
        if (!this.field5287 || this.field5286 > class173.method1134(true)) {
            return;
        }
        for (class419 var11 = (class419) this.field5275.method2087(0); var11 != null; var11 = (class419) this.field5275.method2091(-122)) {
            if (!var11.field5569) {
                if (var11.field5572) {
                    if (!var11.field5570) {
                        throw new RuntimeException();
                    }
                    var11.method3021(46);
                } else {
                    var11.field5572 = true;
                }
            }
        }
        this.field5286 = class173.method1134(true) + 1000L;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 403)
    public static void method2361(int arg0) {
        int var1 = 83 / ((-arg0 - 19) / 53);
        field5266 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)I", line = 416)
    public final int method1571(byte arg0, int arg1) {
        if (arg0 != -32) {
            this.method2358(false);
        }
        field5263++;
        class419 var3 = (class419) this.field5275.method2085((long) arg1, -5423);
        return var3 == null ? 0 : var3.method2368(-11948);
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)I", line = 433)
    public final int method2362(int arg0) {
        field5276++;
        if (this.field5272 == null) {
            return 0;
        } else if (this.field5282) {
            class508 var2 = this.field5281.method49(-105);
            if (arg0 <= 30) {
                this.field5286 = 121L;
            }
            return var2 == null ? 0 : (int) var2.field7456;
        } else {
            return this.field5272.field6985;
        }
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)I", line = 462)
    public final int method2363(int arg0) {
        field5267++;
        if (arg0 != 100) {
            this.field5284 = true;
        }
        if (this.method1574(arg0 - 100) == null) {
            return this.field5255 == null ? 0 : this.field5255.method2368(-11948);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)I", line = 484)
    public final int method2364(byte arg0) {
        field5285++;
        int var2 = -61 / ((arg0 + 48) / 42);
        return this.field5272 == null ? 0 : this.field5272.field6985;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BII)Lg;", line = 499)
    private final class419 method2365(byte arg0, int arg1, int arg2) {
        if (arg0 != 2) {
            this.field5283 = null;
        }
        field5277++;
        class419 var4 = (class419) this.field5275.method2085((long) arg1, arg0 ^ 0xFFFFEAD3);
        if (var4 != null && arg2 == 0 && !var4.field5570 && var4.field5569) {
            var4.method3021(-120);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field5270 == null || this.field5261[arg1] == -1) {
                    if (this.field5274.method2111(arg0 ^ 0xFFFFFFA5)) {
                        return null;
                    }
                    var4 = this.field5274.method2106(this.field5259, arg1, (byte) 2, arg0 ^ 0x66, true);
                } else {
                    var4 = this.field5258.method2331(arg1, this.field5270, (byte) -64);
                }
            } else if (arg2 == 1) {
                if (this.field5270 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field5258.method2328(this.field5270, arg1, (byte) 43);
            } else if (arg2 == 2) {
                if (this.field5270 == null) {
                    throw new RuntimeException();
                }
                if (this.field5261[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field5274.method2109((byte) -121)) {
                    return null;
                }
                var4 = this.field5274.method2106(this.field5259, arg1, (byte) 2, 100, false);
            } else {
                throw new RuntimeException();
            }
            this.field5275.method2096((long) arg1, var4, (byte) 76);
        }
        if (var4.field5569) {
            return null;
        }
        byte[] var5 = var4.method2370((byte) -32);
        if (!var4 instanceof class398) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class240.field3099.reset();
                class240.field3099.update(var5, 0, var5.length - 2);
                int var9 = (int) class240.field3099.getValue();
                if (this.field5272.field6987[arg1] != var9) {
                    throw new RuntimeException();
                }
                this.field5274.field4628 = 0;
                this.field5274.field4630 = 0;
            } catch (RuntimeException var12) {
                this.field5274.method2112(false);
                var4.method3021(28);
                if (var4.field5570 && !this.field5274.method2111(-120)) {
                    class503 var10 = this.field5274.method2106(this.field5259, arg1, (byte) 2, arg0 ^ 0x66, true);
                    this.field5275.method2096((long) arg1, var10, (byte) 76);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field5272.field7000[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field5272.field7000[arg1];
            if (this.field5270 != null) {
                this.field5258.method2332(var5, arg1, (byte) -81, this.field5270);
                if (this.field5261[arg1] != 1) {
                    this.field5265++;
                    this.field5261[arg1] = 1;
                }
            }
            if (!var4.field5570) {
                var4.method3021(114);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class240.field3099.reset();
            class240.field3099.update(var5, 0, var5.length - 2);
            int var6 = (int) class240.field3099.getValue();
            if (this.field5272.field6987[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field5272.field7000[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field5261[arg1] != 1) {
                this.field5265++;
                this.field5261[arg1] = 1;
            }
            if (!var4.field5570) {
                var4.method3021(121);
            }
            return var4;
        } catch (Exception var11) {
            this.field5261[arg1] = -1;
            var4.method3021(-125);
            if (var4.field5570 && !this.field5274.method2111(-115)) {
                class503 var8 = this.field5274.method2106(this.field5259, arg1, (byte) 2, 100, true);
                this.field5275.method2096((long) arg1, var8, (byte) 76);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZ)[B", line = 718)
    public final byte[] method1570(int arg0, boolean arg1) {
        field5253++;
        class419 var3 = this.method2365((byte) 2, arg0, 0);
        if (var3 == null) {
            return null;
        }
        if (!arg1) {
            this.method2362(115);
        }
        byte[] var4 = var3.method2370((byte) -32);
        var3.method3021(-127);
        return var4;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(ILjb;Ljb;Lph;Lau;IIZ)V", line = 761)
    public class396(int arg0, class374 arg1, class374 arg2, class358 arg3, class391 arg4, int arg5, int arg6, boolean arg7) {
        this.field5270 = arg1;
        this.field5259 = arg0;
        if (this.field5270 == null) {
            this.field5282 = false;
        } else {
            this.field5282 = true;
            this.field5281 = new class7();
        }
        this.field5258 = arg4;
        this.field5287 = arg7;
        this.field5254 = arg6;
        this.field5274 = arg3;
        this.field5279 = arg5;
        this.field5256 = arg2;
        if (this.field5256 != null) {
            this.field5255 = this.field5258.method2331(this.field5259, this.field5256, (byte) -62);
        }
    }
}
