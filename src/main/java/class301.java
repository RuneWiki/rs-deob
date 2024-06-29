import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class301 extends class420 {

    @OriginalMember(owner = "client!es", name = "p", descriptor = "I")
    private int field4376 = 0;

    @OriginalMember(owner = "client!es", name = "A", descriptor = "Ldq;")
    private class90 field4387 = new class90(16);

    @OriginalMember(owner = "client!es", name = "M", descriptor = "I")
    private int field4398 = 0;

    @OriginalMember(owner = "client!es", name = "Q", descriptor = "Leb;")
    private class395 field4402 = new class395();

    @OriginalMember(owner = "client!es", name = "S", descriptor = "J")
    private long field4404 = 0L;

    @OriginalMember(owner = "client!es", name = "J", descriptor = "I")
    private int field4395;

    @OriginalMember(owner = "client!es", name = "j", descriptor = "Lcq;")
    private class70 field4370;

    @OriginalMember(owner = "client!es", name = "N", descriptor = "Z")
    private boolean field4399;

    @OriginalMember(owner = "client!es", name = "P", descriptor = "Leb;")
    private class395 field4401;

    @OriginalMember(owner = "client!es", name = "z", descriptor = "I")
    private int field4386;

    @OriginalMember(owner = "client!es", name = "l", descriptor = "Lnb;")
    private class344 field4372;

    @OriginalMember(owner = "client!es", name = "r", descriptor = "Lcq;")
    private class70 field4378;

    @OriginalMember(owner = "client!es", name = "F", descriptor = "I")
    private int field4392;

    @OriginalMember(owner = "client!es", name = "B", descriptor = "Lsp;")
    private class435 field4388;

    @OriginalMember(owner = "client!es", name = "R", descriptor = "Z")
    private boolean field4403;

    @OriginalMember(owner = "client!es", name = "w", descriptor = "Lvl;")
    private class387 field4383;

    @OriginalMember(owner = "client!es", name = "t", descriptor = "[I")
    public static int[] field4380 = new int[1024];

    @OriginalMember(owner = "client!es", name = "E", descriptor = "[I")
    public static int[] field4391 = new int[50];

    @OriginalMember(owner = "client!es", name = "L", descriptor = "I")
    public static int field4397 = 0;

    @OriginalMember(owner = "client!es", name = "k", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!es", name = "m", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!es", name = "n", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!es", name = "o", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!es", name = "q", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!es", name = "s", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!es", name = "u", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!es", name = "x", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!es", name = "y", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!es", name = "C", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!es", name = "D", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!es", name = "H", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!es", name = "I", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!es", name = "K", descriptor = "Lmc;")
    private class326 field4396;

    @OriginalMember(owner = "client!es", name = "O", descriptor = "Z")
    private boolean field4400;

    @OriginalMember(owner = "client!es", name = "v", descriptor = "[B")
    private byte[] field4382;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(B)V")
    public final void method1996(byte arg0) {
        field4384++;
        if (this.field4401 == null || this.method2002((byte) -122) == null) {
            return;
        }
        if (arg0 != 32) {
            this.method2007(-52, false);
        }
        for (class264 var2 = this.field4402.method2478(arg0 + 1571); var2 != null; var2 = this.field4402.method2486((byte) -82)) {
            int var3 = (int) var2.field3907;
            if (var3 < 0 || var3 >= this.field4396.field4794 || this.field4396.field4802[var3] == 0) {
                var2.method1820(-25246);
            } else {
                if (this.field4382[var3] == 0) {
                    this.method2003(1, (byte) 127, var3);
                }
                if (this.field4382[var3] == -1) {
                    this.method2003(2, (byte) 126, var3);
                }
                if (this.field4382[var3] == 1) {
                    var2.method1820(-25246);
                }
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V")
    public final void method1997(int arg0) {
        field4371++;
        if (this.field4370 == null) {
            return;
        }
        int var2 = -4 / ((arg0 - 11) / 36);
        this.field4400 = true;
        if (this.field4401 == null) {
            this.field4401 = new class395();
        }
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(B)I")
    public final int method1998(byte arg0) {
        if (arg0 >= -111) {
            return -10;
        } else {
            field4374++;
            return this.field4396 == null ? 0 : this.field4396.field4806;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BI)V")
    public final void method1999(byte arg0, int arg1) {
        field4379++;
        if (arg0 >= -110 || this.field4370 == null) {
            return;
        }
        for (class264 var3 = this.field4402.method2478(1603); var3 != null; var3 = this.field4402.method2486((byte) -82)) {
            if ((long) arg1 == var3.field3907) {
                return;
            }
        }
        class264 var4 = new class264();
        var4.field3907 = (long) arg1;
        this.field4402.method2484(0, var4);
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(I)V")
    public static void method2000(int arg0) {
        field4380 = null;
        field4391 = null;
        if (arg0 != -2) {
            field4397 = 110;
        }
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "(B)I")
    public final int method2001(byte arg0) {
        field4385++;
        if (arg0 != 48) {
            this.field4372 = null;
        }
        if (this.field4396 == null) {
            return 0;
        } else if (this.field4399) {
            class264 var2 = this.field4401.method2478(arg0 ^ 0x673);
            return var2 == null ? 0 : (int) var2.field3907;
        } else {
            return this.field4396.field4806;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)Lmc;")
    public final class326 method2002(byte arg0) {
        field4393++;
        if (this.field4396 != null) {
            return this.field4396;
        }
        if (this.field4383 == null) {
            if (this.field4388.method2671(28522)) {
                return null;
            }
            this.field4383 = this.field4388.method2681(this.field4395, 255, 0, true, (byte) 0);
        }
        if (this.field4383.field5650) {
            return null;
        }
        byte[] var2 = this.field4383.method430((byte) 54);
        if (this.field4383 instanceof class115) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4396 = new class326(var2, this.field4392);
                if (this.field4396.field4789 != this.field4386) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field4396 = null;
                if (this.field4388.method2671(28522)) {
                    this.field4383 = null;
                } else {
                    this.field4383 = this.field4388.method2681(this.field4395, 255, 0, true, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4396 = new class326(var2, this.field4392);
            } catch (RuntimeException var4) {
                this.field4388.method2678((byte) -36);
                this.field4396 = null;
                if (this.field4388.method2671(28522)) {
                    this.field4383 = null;
                } else {
                    this.field4383 = this.field4388.method2681(this.field4395, 255, 0, true, (byte) 0);
                }
                return null;
            }
            if (this.field4378 != null) {
                this.field4372.method2232(this.field4378, false, var2, this.field4395);
            }
        }
        this.field4383 = null;
        if (arg0 >= -100) {
            this.method2003(-126, (byte) -36, -25);
        }
        if (this.field4370 != null) {
            this.field4382 = new byte[this.field4396.field4794];
            this.field4376 = 0;
        }
        return this.field4396;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IBI)Lvl;")
    private final class387 method2003(int arg0, byte arg1, int arg2) {
        field4390++;
        class387 var4 = (class387) this.field4387.method609((long) arg2, 85);
        if (arg1 <= 125) {
            this.field4403 = false;
        }
        if (var4 != null && arg0 == 0 && !var4.field5654 && var4.field5650) {
            var4.method1820(-25246);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field4370 == null || this.field4382[arg2] == -1) {
                    if (this.field4388.method2671(28522)) {
                        return null;
                    }
                    var4 = this.field4388.method2681(arg2, this.field4395, 0, true, (byte) 2);
                } else {
                    var4 = this.field4372.method2230(this.field4370, -119, arg2);
                }
            } else if (arg0 == 1) {
                if (this.field4370 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4372.method2231(arg2, (byte) 46, this.field4370);
            } else if (arg0 == 2) {
                if (this.field4370 == null) {
                    throw new RuntimeException();
                }
                if (this.field4382[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4388.method2676(-14594)) {
                    return null;
                }
                var4 = this.field4388.method2681(arg2, this.field4395, 0, false, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field4387.method606(1, var4, (long) arg2);
        }
        if (var4.field5650) {
            return null;
        }
        byte[] var5 = var4.method430((byte) 54);
        if (!var4 instanceof class115) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class349.field5115.reset();
                class349.field5115.update(var5, 0, var5.length - 2);
                int var6 = (int) class349.field5115.getValue();
                if (this.field4396.field4797[arg2] != var6) {
                    throw new RuntimeException();
                }
                this.field4388.field6363 = 0;
                this.field4388.field6361 = 0;
            } catch (RuntimeException var12) {
                this.field4388.method2678((byte) -36);
                var4.method1820(-25246);
                if (var4.field5654 && !this.field4388.method2671(28522)) {
                    class57 var7 = this.field4388.method2681(arg2, this.field4395, 0, true, (byte) 2);
                    this.field4387.method606(1, var7, (long) arg2);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4396.field4788[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field4396.field4788[arg2];
            if (this.field4370 != null) {
                this.field4372.method2232(this.field4370, false, var5, arg2);
                if (this.field4382[arg2] != 1) {
                    this.field4376++;
                    this.field4382[arg2] = 1;
                }
            }
            if (!var4.field5654) {
                var4.method1820(-25246);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class349.field5115.reset();
            class349.field5115.update(var5, 0, var5.length - 2);
            int var8 = (int) class349.field5115.getValue();
            if (this.field4396.field4797[arg2] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4396.field4788[arg2] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field4382[arg2] != 1) {
                this.field4376++;
                this.field4382[arg2] = 1;
            }
            if (!var4.field5654) {
                var4.method1820(-25246);
            }
            return var4;
        } catch (Exception var11) {
            this.field4382[arg2] = -1;
            var4.method1820(-25246);
            if (var4.field5654 && !this.field4388.method2671(28522)) {
                class57 var10 = this.field4388.method2681(arg2, this.field4395, 0, true, (byte) 2);
                this.field4387.method606(1, var10, (long) arg2);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "(I)I")
    public final int method2004(int arg0) {
        if (arg0 >= -45) {
            return 112;
        } else {
            field4377++;
            return this.field4376;
        }
    }

    @OriginalMember(owner = "client!es", name = "e", descriptor = "(B)V")
    public final void method2005(byte arg0) {
        field4373++;
        if (arg0 != -112) {
            this.method1996((byte) 9);
        }
        if (this.field4401 != null) {
            if (this.method2002((byte) -116) == null) {
                return;
            }
            if (this.field4399) {
                boolean var2 = true;
                for (class264 var3 = this.field4401.method2478(1603); var3 != null; var3 = this.field4401.method2486((byte) -82)) {
                    int var5 = (int) var3.field3907;
                    if (this.field4382[var5] == 0) {
                        this.method2003(1, (byte) 126, var5);
                    }
                    if (this.field4382[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1820(-25246);
                    }
                }
                while (this.field4396.field4802.length > this.field4398) {
                    if (this.field4396.field4802[this.field4398] == 0) {
                        this.field4398++;
                    } else {
                        if (this.field4372.field5063 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field4382[this.field4398] == 0) {
                            this.method2003(1, (byte) 127, this.field4398);
                        }
                        if (this.field4382[this.field4398] == 0) {
                            class264 var4 = new class264();
                            var4.field3907 = (long) this.field4398;
                            var2 = false;
                            this.field4401.method2484(arg0 ^ 0xFFFFFF90, var4);
                        }
                        this.field4398++;
                    }
                }
                if (var2) {
                    this.field4398 = 0;
                    this.field4399 = false;
                }
            } else if (this.field4400) {
                boolean var6 = true;
                for (class264 var7 = this.field4401.method2478(1603); var7 != null; var7 = this.field4401.method2486((byte) -82)) {
                    int var9 = (int) var7.field3907;
                    if (this.field4382[var9] != 1) {
                        this.method2003(2, (byte) 127, var9);
                    }
                    if (this.field4382[var9] == 1) {
                        var7.method1820(arg0 ^ 0x62F2);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field4398 < this.field4396.field4802.length) {
                    if (this.field4396.field4802[this.field4398] == 0) {
                        this.field4398++;
                    } else {
                        if (this.field4388.method2676(arg0 ^ 0x396E)) {
                            var6 = false;
                            break;
                        }
                        if (this.field4382[this.field4398] != 1) {
                            this.method2003(2, (byte) 126, this.field4398);
                        }
                        if (this.field4382[this.field4398] != 1) {
                            class264 var8 = new class264();
                            var8.field3907 = (long) this.field4398;
                            this.field4401.method2484(0, var8);
                            var6 = false;
                        }
                        this.field4398++;
                    }
                }
                if (var6) {
                    this.field4398 = 0;
                    this.field4400 = false;
                }
            } else {
                this.field4401 = null;
            }
        }
        if (!this.field4403 || class43.method364(-16756) < this.field4404) {
            return;
        }
        for (class387 var10 = (class387) this.field4387.method608((byte) 126); var10 != null; var10 = (class387) this.field4387.method604(-110)) {
            if (!var10.field5650) {
                if (var10.field5649) {
                    if (!var10.field5654) {
                        throw new RuntimeException();
                    }
                    var10.method1820(-25246);
                } else {
                    var10.field5649 = true;
                }
            }
        }
        this.field4404 = class43.method364(-16756) + 1000L;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)I")
    public final int method2006(int arg0, int arg1) {
        field4375++;
        class387 var3 = (class387) this.field4387.method609((long) arg1, 72);
        int var4 = -34 % ((arg0 + 27) / 57);
        return var3 == null ? 0 : var3.method434(100);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)[B")
    public final byte[] method2007(int arg0, boolean arg1) {
        if (!arg1) {
            this.field4388 = null;
        }
        field4381++;
        class387 var3 = this.method2003(0, (byte) 126, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method430((byte) 54);
            var3.method1820(-25246);
            return var4;
        }
    }

    @OriginalMember(owner = "client!es", name = "e", descriptor = "(I)I")
    public final int method2008(int arg0) {
        field4394++;
        if (this.method2002((byte) -113) == null) {
            return this.field4383 == null ? 0 : this.field4383.method434(100);
        } else {
            if (arg0 != 0) {
                this.method2008(94);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(ILcq;Lcq;Lsp;Lnb;IIZ)V")
    public class301(int arg0, class70 arg1, class70 arg2, class435 arg3, class344 arg4, int arg5, int arg6, boolean arg7) {
        this.field4395 = arg0;
        this.field4370 = arg1;
        if (this.field4370 == null) {
            this.field4399 = false;
        } else {
            this.field4399 = true;
            this.field4401 = new class395();
        }
        this.field4386 = arg6;
        this.field4372 = arg4;
        this.field4378 = arg2;
        this.field4392 = arg5;
        this.field4388 = arg3;
        this.field4403 = arg7;
        if (this.field4378 != null) {
            this.field4383 = this.field4372.method2230(this.field4378, -108, this.field4395);
        }
    }
}
