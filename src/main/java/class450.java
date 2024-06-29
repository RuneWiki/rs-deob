import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class450 extends class381 {

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    private int field6548 = 0;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Lbr;")
    private class223 field6523 = new class223(16);

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    private int field6556 = 0;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "Ltc;")
    private class196 field6557 = new class196();

    @OriginalMember(owner = "client!f", name = "V", descriptor = "J")
    private long field6563 = 0L;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    private int field6537;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Lrb;")
    private class197 field6527;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "Z")
    private boolean field6560;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "Ltc;")
    private class196 field6558;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    private int field6538;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "Lul;")
    private class341 field6555;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    private int field6522;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Lrb;")
    private class197 field6528;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "Z")
    private boolean field6562;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "Lmr;")
    private class77 field6536;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "Ldn;")
    private class301 field6549;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "[I")
    public static int[] field6533 = new int[32];

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public static int field6542 = -1;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "[Lsb;")
    public static class160[] field6526 = new class160[16];

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public static int field6550 = -11713997;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "Ljava/lang/String;")
    public static String field6559 = "glow2:";

    @OriginalMember(owner = "client!f", name = "i", descriptor = "F")
    public static float field6524;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "F")
    public static float field6531;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "Lmd;")
    private class321 field6539;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "Lmr;")
    public static class77 field6541;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "Z")
    private boolean field6561;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "[B")
    private byte[] field6545;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "[[S")
    public static short[][] field6535;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    public final void method2808(int arg0) {
        field6543++;
        if (this.field6527 == null) {
            return;
        }
        this.field6561 = true;
        if (arg0 != 0) {
            this.method2488(-17, (byte) 118);
        }
        if (this.field6558 == null) {
            this.field6558 = new class196();
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
    public static void method2809(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field6541 = null;
        field6559 = null;
        field6533 = null;
        field6526 = null;
        field6535 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B[S)[S")
    public static final short[] method2810(byte arg0, short[] arg1) {
        if (arg0 <= 1) {
            field6550 = -85;
        }
        field6554++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class150.method1024(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)[B")
    public final byte[] method2488(int arg0, byte arg1) {
        field6546++;
        class301 var3 = this.method2811(0, arg0, (byte) 69);
        if (var3 == null) {
            return null;
        }
        if (arg1 >= -8) {
            this.method2488(27, (byte) 91);
        }
        byte[] var4 = var3.method961(122);
        var3.method2459(198);
        return var4;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIB)Ldn;")
    private final class301 method2811(int arg0, int arg1, byte arg2) {
        field6532++;
        class301 var4 = (class301) this.field6523.method1412((byte) -54, (long) arg1);
        if (var4 != null && arg0 == 0 && !var4.field4174 && var4.field4169) {
            var4.method2459(198);
            var4 = null;
        }
        if (arg2 != 69) {
            this.method2814(-28);
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field6527 == null || this.field6545[arg1] == -1) {
                    if (this.field6555.method2185(16)) {
                        return null;
                    }
                    var4 = this.field6555.method2195(this.field6537, true, arg1, 0, (byte) 2);
                } else {
                    var4 = this.field6536.method558(arg2 ^ 0xD300EB21, this.field6527, arg1);
                }
            } else if (arg0 == 1) {
                if (this.field6527 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field6536.method553(arg2 + 7239, this.field6527, arg1);
            } else if (arg0 == 2) {
                if (this.field6527 == null) {
                    throw new RuntimeException();
                }
                if (this.field6545[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field6555.method2197((byte) 90)) {
                    return null;
                }
                var4 = this.field6555.method2195(this.field6537, false, arg1, 0, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field6523.method1419((long) arg1, 65, var4);
        }
        if (var4.field4169) {
            return null;
        }
        byte[] var5 = var4.method961(126);
        if (!var4 instanceof class366) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class168.field2399.reset();
                class168.field2399.update(var5, 0, var5.length - 2);
                int var9 = (int) class168.field2399.getValue();
                if (this.field6539.field4403[arg1] != var9) {
                    throw new RuntimeException();
                }
                this.field6555.field4781 = 0;
                this.field6555.field4780 = 0;
            } catch (RuntimeException var12) {
                this.field6555.method2183(-1);
                var4.method2459(198);
                if (var4.field4174 && !this.field6555.method2185(arg2 ^ 0x55)) {
                    class141 var10 = this.field6555.method2195(this.field6537, true, arg1, 0, (byte) 2);
                    this.field6523.method1419((long) arg1, 121, var10);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field6539.field4407[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field6539.field4407[arg1];
            if (this.field6527 != null) {
                this.field6536.method555(var5, arg1, -16965, this.field6527);
                if (this.field6545[arg1] != 1) {
                    this.field6548++;
                    this.field6545[arg1] = 1;
                }
            }
            if (!var4.field4174) {
                var4.method2459(198);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class168.field2399.reset();
            class168.field2399.update(var5, 0, var5.length - 2);
            int var6 = (int) class168.field2399.getValue();
            if (this.field6539.field4403[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field6539.field4407[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field6545[arg1] != 1) {
                this.field6548++;
                this.field6545[arg1] = 1;
            }
            if (!var4.field4174) {
                var4.method2459(198);
            }
            return var4;
        } catch (Exception var11) {
            this.field6545[arg1] = -1;
            var4.method2459(198);
            if (var4.field4174 && !this.field6555.method2185(16)) {
                class141 var8 = this.field6555.method2195(this.field6537, true, arg1, 0, (byte) 2);
                this.field6523.method1419((long) arg1, 82, var8);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)I")
    public final int method2812(boolean arg0) {
        field6551++;
        if (this.field6539 == null) {
            return 0;
        }
        if (!arg0) {
            this.method2484(97);
        }
        if (this.field6560) {
            class376 var2 = this.field6558.method1312((byte) 25);
            return var2 == null ? 0 : (int) var2.field5363;
        } else {
            return this.field6539.field4412;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I")
    public final int method2483(int arg0, int arg1) {
        field6534++;
        class301 var3 = (class301) this.field6523.method1412((byte) -54, (long) arg0);
        if (arg1 != 0) {
            field6535 = null;
        }
        return var3 == null ? 0 : var3.method965((byte) -55);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)I")
    public final int method2813(byte arg0) {
        field6525++;
        int var2 = 50 / ((-arg0 - 22) / 41);
        return this.field6539 == null ? 0 : this.field6539.field4412;
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
    public final void method2814(int arg0) {
        field6547++;
        if (this.field6558 == null || this.method2484(6735) == null) {
            return;
        }
        if (arg0 > -12) {
            field6531 = 0.71562797F;
        }
        for (class376 var2 = this.field6557.method1312((byte) 25); var2 != null; var2 = this.field6557.method1304(95)) {
            int var3 = (int) var2.field5363;
            if (var3 < 0 || var3 >= this.field6539.field4404 || this.field6539.field4396[var3] == 0) {
                var2.method2459(198);
            } else {
                if (this.field6545[var3] == 0) {
                    this.method2811(1, var3, (byte) 69);
                }
                if (this.field6545[var3] == -1) {
                    this.method2811(2, var3, (byte) 69);
                }
                if (this.field6545[var3] == 1) {
                    var2.method2459(198);
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
    public final void method2815(int arg0) {
        field6529++;
        if (this.field6558 != null) {
            if (this.method2484(6735) == null) {
                return;
            }
            if (this.field6560) {
                boolean var6 = true;
                for (class376 var7 = this.field6558.method1312((byte) 25); var7 != null; var7 = this.field6558.method1304(93)) {
                    int var9 = (int) var7.field5363;
                    if (this.field6545[var9] == 0) {
                        this.method2811(1, var9, (byte) 69);
                    }
                    if (this.field6545[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method2459(198);
                    }
                }
                while (this.field6539.field4396.length > this.field6556) {
                    if (this.field6539.field4396[this.field6556] == 0) {
                        this.field6556++;
                    } else {
                        if (this.field6536.field1216 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field6545[this.field6556] == 0) {
                            this.method2811(1, this.field6556, (byte) 69);
                        }
                        if (this.field6545[this.field6556] == 0) {
                            class376 var8 = new class376();
                            var8.field5363 = (long) this.field6556;
                            this.field6558.method1301(50, var8);
                            var6 = false;
                        }
                        this.field6556++;
                    }
                }
                if (var6) {
                    this.field6556 = 0;
                    this.field6560 = false;
                }
            } else if (this.field6561) {
                boolean var2 = true;
                for (class376 var3 = this.field6558.method1312((byte) 25); var3 != null; var3 = this.field6558.method1304(-122)) {
                    int var5 = (int) var3.field5363;
                    if (this.field6545[var5] != 1) {
                        this.method2811(2, var5, (byte) 69);
                    }
                    if (this.field6545[var5] == 1) {
                        var3.method2459(198);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field6556 < this.field6539.field4396.length) {
                    if (this.field6539.field4396[this.field6556] == 0) {
                        this.field6556++;
                    } else {
                        if (this.field6555.method2197((byte) 90)) {
                            var2 = false;
                            break;
                        }
                        if (this.field6545[this.field6556] != 1) {
                            this.method2811(2, this.field6556, (byte) 69);
                        }
                        if (this.field6545[this.field6556] != 1) {
                            class376 var4 = new class376();
                            var4.field5363 = (long) this.field6556;
                            this.field6558.method1301(50, var4);
                            var2 = false;
                        }
                        this.field6556++;
                    }
                }
                if (var2) {
                    this.field6556 = 0;
                    this.field6561 = false;
                }
            } else {
                this.field6558 = null;
            }
        }
        if (arg0 != 100) {
            this.method2812(true);
        }
        if (!this.field6562 || this.field6563 > class224.method1425(-26805)) {
            return;
        }
        for (class301 var10 = (class301) this.field6523.method1413(arg0 + 30281); var10 != null; var10 = (class301) this.field6523.method1420((byte) 68)) {
            if (!var10.field4169) {
                if (var10.field4165) {
                    if (!var10.field4174) {
                        throw new RuntimeException();
                    }
                    var10.method2459(198);
                } else {
                    var10.field4165 = true;
                }
            }
        }
        this.field6563 = class224.method1425(-26805) + 1000L;
    }

    @OriginalMember(owner = "client!f", name = "g", descriptor = "(I)I")
    public final int method2816(int arg0) {
        if (arg0 != 255) {
            return -47;
        }
        field6553++;
        if (this.method2484(6735) == null) {
            return this.field6549 == null ? 0 : this.field6549.method965((byte) -55);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)V")
    public final void method2486(byte arg0, int arg1) {
        field6544++;
        if (this.field6527 == null) {
            return;
        }
        for (class376 var3 = this.field6557.method1312((byte) 25); var3 != null; var3 = this.field6557.method1304(-118)) {
            if (((long) arg1) == var3.field5363) {
                return;
            }
        }
        if (arg0 != 115) {
            this.method2812(false);
        }
        class376 var4 = new class376();
        var4.field5363 = (long) arg1;
        this.field6557.method1301(50, var4);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Lmd;")
    public final class321 method2484(int arg0) {
        field6540++;
        if (this.field6539 != null) {
            return this.field6539;
        }
        if (this.field6549 == null) {
            if (this.field6555.method2185(16)) {
                return null;
            }
            this.field6549 = this.field6555.method2195(255, true, this.field6537, 0, (byte) 0);
        }
        if (this.field6549.field4169) {
            return null;
        }
        byte[] var2 = this.field6549.method961(-47);
        if (this.field6549 instanceof class366) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6539 = new class321(var2, this.field6538);
                if (this.field6539.field4413 != this.field6522) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field6539 = null;
                if (this.field6555.method2185(16)) {
                    this.field6549 = null;
                } else {
                    this.field6549 = this.field6555.method2195(255, true, this.field6537, arg0 ^ 0x1A4F, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6539 = new class321(var2, this.field6538);
            } catch (RuntimeException var4) {
                this.field6555.method2183(arg0 - 6736);
                this.field6539 = null;
                if (this.field6555.method2185(16)) {
                    this.field6549 = null;
                } else {
                    this.field6549 = this.field6555.method2195(255, true, this.field6537, 0, (byte) 0);
                }
                return null;
            }
            if (this.field6528 != null) {
                this.field6536.method555(var2, this.field6537, -16965, this.field6528);
            }
        }
        this.field6549 = null;
        if (this.field6527 != null) {
            this.field6545 = new byte[this.field6539.field4404];
            this.field6548 = 0;
        }
        return arg0 == 6735 ? this.field6539 : null;
    }

    @OriginalMember(owner = "client!f", name = "h", descriptor = "(I)I")
    public final int method2817(int arg0) {
        field6552++;
        if (arg0 > -38) {
            method2810((byte) -54, (short[]) null);
        }
        return this.field6548;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(ILrb;Lrb;Lul;Lmr;IIZ)V")
    public class450(int arg0, class197 arg1, class197 arg2, class341 arg3, class77 arg4, int arg5, int arg6, boolean arg7) {
        this.field6537 = arg0;
        this.field6527 = arg1;
        if (this.field6527 == null) {
            this.field6560 = false;
        } else {
            this.field6560 = true;
            this.field6558 = new class196();
        }
        this.field6538 = arg5;
        this.field6555 = arg3;
        this.field6522 = arg6;
        this.field6528 = arg2;
        this.field6562 = arg7;
        this.field6536 = arg4;
        if (this.field6528 != null) {
            this.field6549 = this.field6536.method558(-754914460, this.field6528, this.field6537);
        }
    }
}
