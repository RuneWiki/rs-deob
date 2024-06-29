import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class292 extends class273 {

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    private int field4487 = 0;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "Lii;")
    private class250 field4485 = new class250(16);

    @OriginalMember(owner = "client!rg", name = "V", descriptor = "I")
    private int field4516 = 0;

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "La;")
    private class281 field4515 = new class281();

    @OriginalMember(owner = "client!rg", name = "X", descriptor = "J")
    private long field4518 = 0L;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "Lco;")
    private class48 field4507;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    private int field4505;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "Z")
    private boolean field4511;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "La;")
    private class281 field4512;

    @OriginalMember(owner = "client!rg", name = "W", descriptor = "Z")
    private boolean field4517;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "Lig;")
    private class102 field4500;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "Lb;")
    private class144 field4490;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "Lco;")
    private class48 field4501;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    private int field4502;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    private int field4492;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "Lsl;")
    private class205 field4503;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "F")
    public static float field4488;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "Lof;")
    private class283 field4499;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "Ljd;")
    public static class95 field4506;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "Z")
    private boolean field4513;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "[B")
    private byte[] field4494;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)V", line = 5)
    public static void method2010(boolean arg0) {
        if (arg0) {
            method2020(117, 105, -90, 2, true, -68, 114, -84, -15, true);
        }
        field4506 = null;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)Lu;", line = 18)
    public static final class35 method2011(int arg0, int arg1, int arg2) {
        class79 var3 = class213.field3262[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1161;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)I", line = 26)
    public final int method2012(int arg0) {
        field4508++;
        if (arg0 != 2319) {
            this.method1909(76, -81);
        }
        if (this.field4499 == null) {
            return 0;
        } else if (this.field4511) {
            class5 var2 = this.field4512.method1954(-66);
            return var2 == null ? 0 : (int) var2.field69;
        } else {
            return this.field4499.field4419;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)V", line = 51)
    public final void method1906(byte arg0, int arg1) {
        field4486++;
        if (this.field4507 == null) {
            return;
        }
        for (class5 var3 = this.field4515.method1954(arg0 ^ 0x72); var3 != null; var3 = this.field4515.method1950((byte) 102)) {
            if (((long) arg1) == var3.field69) {
                return;
            }
        }
        if (arg0 != -52) {
            this.field4518 = -49L;
        }
        class5 var4 = new class5();
        var4.field69 = (long) arg1;
        this.field4515.method1952(var4, arg0 ^ 0x5E);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)I", line = 81)
    public static final int method2013(int arg0, int arg1) {
        if (arg1 != 65535) {
            field4488 = -1.2607365F;
        }
        field4498++;
        return arg0 == 16711935 ? -1 : class72.method510(-83, arg0);
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)I", line = 97)
    public final int method2014(int arg0) {
        if (arg0 != -4213) {
            this.field4499 = (class283) null;
        }
        field4495++;
        if (this.method1904(true) == null) {
            return this.field4503 == null ? 0 : this.field4503.method1481(false);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 129)
    public static final void method2015(byte arg0) {
        class153.field2311.method752(false);
        if (arg0 > 39) {
            field4491++;
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)I", line = 147)
    public final int method2016(int arg0) {
        field4489++;
        if (arg0 < 10) {
            this.field4502 = -52;
        }
        return this.field4499 == null ? 0 : this.field4499.field4419;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)Lof;", line = 170)
    public final class283 method1904(boolean arg0) {
        field4483++;
        if (this.field4499 != null) {
            return this.field4499;
        }
        if (this.field4503 == null) {
            if (this.field4500.method775(true)) {
                return null;
            }
            this.field4503 = this.field4500.method770(9, (byte) 0, true, this.field4505, 255);
        }
        if (this.field4503.field3139) {
            return null;
        }
        if (!arg0) {
            this.field4500 = (class102) null;
        }
        byte[] var2 = this.field4503.method1477((byte) -9);
        if (this.field4503 instanceof class231) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4499 = new class283(var2, this.field4492);
                if (this.field4499.field4418 != this.field4502) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field4499 = null;
                if (this.field4500.method775(arg0)) {
                    this.field4503 = null;
                } else {
                    this.field4503 = this.field4500.method770(9, (byte) 0, true, this.field4505, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4499 = new class283(var2, this.field4492);
            } catch (RuntimeException var6) {
                this.field4500.method772(114);
                this.field4499 = null;
                if (this.field4500.method775(arg0)) {
                    this.field4503 = null;
                } else {
                    this.field4503 = this.field4500.method770(9, (byte) 0, true, this.field4505, 255);
                }
                return null;
            }
            if (this.field4501 != null) {
                this.field4490.method1094(this.field4505, (byte) 115, this.field4501, var2);
            }
        }
        if (this.field4507 != null) {
            this.field4494 = new byte[this.field4499.field4402];
            this.field4487 = 0;
        }
        this.field4503 = null;
        return this.field4499;
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V", line = 268)
    public final void method2017(int arg0) {
        field4504++;
        if (this.field4512 != null) {
            if (this.method1904(true) == null) {
                return;
            }
            if (this.field4511) {
                boolean var2 = true;
                for (class5 var3 = this.field4512.method1954(-66); var3 != null; var3 = this.field4512.method1950((byte) 88)) {
                    int var4 = (int) var3.field69;
                    if (this.field4494[var4] == 0) {
                        this.method2019(1, var4, (byte) 41);
                    }
                    if (this.field4494[var4] == 0) {
                        var2 = false;
                    } else {
                        var3.method39(10717);
                    }
                }
                while (this.field4499.field4401.length > this.field4516) {
                    if (this.field4499.field4401[this.field4516] == 0) {
                        this.field4516++;
                    } else {
                        if (this.field4490.field2213 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field4494[this.field4516] == 0) {
                            this.method2019(1, this.field4516, (byte) 41);
                        }
                        if (this.field4494[this.field4516] == 0) {
                            var2 = false;
                            class5 var5 = new class5();
                            var5.field69 = (long) this.field4516;
                            this.field4512.method1952(var5, 120);
                        }
                        this.field4516++;
                    }
                }
                if (var2) {
                    this.field4516 = 0;
                    this.field4511 = false;
                }
            } else if (this.field4513) {
                boolean var6 = true;
                for (class5 var7 = this.field4512.method1954(-66); var7 != null; var7 = this.field4512.method1950((byte) 91)) {
                    int var8 = (int) var7.field69;
                    if (this.field4494[var8] != 1) {
                        this.method2019(2, var8, (byte) 41);
                    }
                    if (this.field4494[var8] == 1) {
                        var7.method39(arg0 + 10715);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field4499.field4401.length > this.field4516) {
                    if (this.field4499.field4401[this.field4516] == 0) {
                        this.field4516++;
                    } else {
                        if (this.field4500.method773(arg0 - 117)) {
                            var6 = false;
                            break;
                        }
                        if (this.field4494[this.field4516] != 1) {
                            this.method2019(2, this.field4516, (byte) 41);
                        }
                        if (this.field4494[this.field4516] != 1) {
                            var6 = false;
                            class5 var9 = new class5();
                            var9.field69 = (long) this.field4516;
                            this.field4512.method1952(var9, 20);
                        }
                        this.field4516++;
                    }
                }
                if (var6) {
                    this.field4516 = 0;
                    this.field4513 = false;
                }
            } else {
                this.field4512 = null;
            }
        }
        if (this.field4517 && this.field4518 <= class105.method789((byte) 55)) {
            for (class205 var10 = (class205) this.field4485.method1706(0); var10 != null; var10 = (class205) this.field4485.method1705((byte) 72)) {
                if (!var10.field3139) {
                    if (var10.field3148) {
                        if (!var10.field3149) {
                            throw new RuntimeException();
                        }
                        var10.method39(arg0 + 10715);
                    } else {
                        var10.field3148 = true;
                    }
                }
            }
            this.field4518 = class105.method789((byte) 55) + 1000L;
        }
        if (arg0 != 2) {
            this.field4500 = (class102) null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZILjd;Ljd;)V", line = 449)
    public static final void method2018(boolean arg0, int arg1, class95 arg2, class95 arg3) {
        field4484++;
        class248.field3729 = arg0;
        if (arg1 != 0) {
            method2018(true, 81, (class95) null, (class95) null);
        }
        class65.field942 = arg3;
        class220.field3358 = arg2;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[B", line = 462)
    public final byte[] method1909(int arg0, int arg1) {
        field4514++;
        class205 var3 = this.method2019(arg0, arg1, (byte) 41);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method1477((byte) -9);
            var3.method39(arg0 + 10717);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(ILco;Lco;Lig;Lb;IIZ)V", line = 828)
    public class292(int arg0, class48 arg1, class48 arg2, class102 arg3, class144 arg4, int arg5, int arg6, boolean arg7) {
        this.field4507 = arg1;
        this.field4505 = arg0;
        if (this.field4507 == null) {
            this.field4511 = false;
        } else {
            this.field4511 = true;
            this.field4512 = new class281();
        }
        this.field4517 = arg7;
        this.field4500 = arg3;
        this.field4490 = arg4;
        this.field4501 = arg2;
        this.field4502 = arg6;
        this.field4492 = arg5;
        if (this.field4501 != null) {
            this.field4503 = this.field4490.method1101(this.field4505, 1188076304, this.field4501);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIB)Lsl;", line = 485)
    private final class205 method2019(int arg0, int arg1, byte arg2) {
        class205 var4 = (class205) this.field4485.method1716(-1, (long) arg1);
        field4493++;
        if (var4 != null && arg0 == 0 && !var4.field3149 && var4.field3139) {
            var4.method39(10717);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field4507 == null || this.field4494[arg1] == -1) {
                    if (this.field4500.method775(true)) {
                        return null;
                    }
                    var4 = this.field4500.method770(9, (byte) 2, true, arg1, this.field4505);
                } else {
                    var4 = this.field4490.method1101(arg1, arg2 + 1188076263, this.field4507);
                }
            } else if (arg0 == 1) {
                if (this.field4507 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4490.method1093(arg1, 127, this.field4507);
            } else if (arg0 == 2) {
                if (this.field4507 == null) {
                    throw new RuntimeException();
                }
                if (this.field4494[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4500.method773(-112)) {
                    return null;
                }
                var4 = this.field4500.method770(9, (byte) 2, false, arg1, this.field4505);
            } else {
                throw new RuntimeException();
            }
            this.field4485.method1708((long) arg1, (byte) -79, var4);
        }
        if (var4.field3139) {
            return null;
        }
        byte[] var5 = var4.method1477((byte) -9);
        if (arg2 != 41) {
            method2015((byte) 106);
        }
        if (!var4 instanceof class231) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class144.field2198.reset();
                class144.field2198.update(var5, 0, var5.length - 2);
                int var10 = (int) class144.field2198.getValue();
                if (this.field4499.field4421[arg1] != var10) {
                    throw new RuntimeException();
                }
                this.field4500.field1503 = 0;
                this.field4500.field1504 = 0;
            } catch (RuntimeException var14) {
                this.field4500.method772(101);
                var4.method39(10717);
                if (var4.field3149 && !this.field4500.method775(true)) {
                    class243 var12 = this.field4500.method770(9, (byte) 2, true, arg1, this.field4505);
                    this.field4485.method1708((long) arg1, (byte) -79, var12);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4499.field4411[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field4499.field4411[arg1];
            if (this.field4507 != null) {
                this.field4490.method1094(arg1, (byte) 103, this.field4507, var5);
                if (this.field4494[arg1] != 1) {
                    this.field4487++;
                    this.field4494[arg1] = 1;
                }
            }
            if (!var4.field3149) {
                var4.method39(10717);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class144.field2198.reset();
            class144.field2198.update(var5, 0, var5.length - 2);
            int var6 = (int) class144.field2198.getValue();
            if (this.field4499.field4421[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4499.field4411[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field4494[arg1] != 1) {
                if (this.field4494[arg1] != 0) {
                }
                this.field4487++;
                this.field4494[arg1] = 1;
            }
            if (!var4.field3149) {
                var4.method39(10717);
            }
            return var4;
        } catch (Exception var13) {
            this.field4494[arg1] = -1;
            var4.method39(10717);
            if (var4.field3149 && !this.field4500.method775(true)) {
                class243 var9 = this.field4500.method770(9, (byte) 2, true, arg1, this.field4505);
                this.field4485.method1708((long) arg1, (byte) -79, var9);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIZIIIIZ)V", line = 703)
    public static final void method2020(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        field4509++;
        int var10 = arg5 - arg6;
        int var11 = arg8 - arg0;
        int var12 = (arg2 - arg3 << 16) / var10;
        int var13 = (arg7 - arg1 << 16) / var11;
        class320.method2227(var13, 0, arg6, arg3, arg8, -14145, var12, 0, arg0, arg1, arg4, arg5);
        if (arg9) {
            field4506 = (class95) null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(Z)I", line = 721)
    public final int method2021(boolean arg0) {
        field4510++;
        if (!arg0) {
            method2020(-69, -101, -100, -37, true, -81, -117, 114, -86, true);
        }
        return this.field4487;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(BI)I", line = 732)
    public final int method1908(byte arg0, int arg1) {
        field4497++;
        if (arg0 > -55) {
            return -34;
        } else {
            class205 var3 = (class205) this.field4485.method1716(-1, (long) arg1);
            return var3 == null ? 0 : var3.method1481(false);
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(Z)V", line = 753)
    public final void method2022(boolean arg0) {
        field4481++;
        if (this.field4507 != null) {
            this.field4513 = arg0;
            if (this.field4512 == null) {
                this.field4512 = new class281();
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(Z)V", line = 773)
    public final void method2023(boolean arg0) {
        field4496++;
        if (this.field4512 == null || this.method1904(true) == null || arg0) {
            return;
        }
        for (class5 var2 = this.field4515.method1954(-66); var2 != null; var2 = this.field4515.method1950((byte) 118)) {
            int var3 = (int) var2.field69;
            if (var3 < 0 || var3 >= this.field4499.field4402 || this.field4499.field4401[var3] == 0) {
                var2.method39(10717);
            } else {
                if (this.field4494[var3] == 0) {
                    this.method2019(1, var3, (byte) 41);
                }
                if (this.field4494[var3] == -1) {
                    this.method2019(2, var3, (byte) 41);
                }
                if (this.field4494[var3] == 1) {
                    var2.method39(10717);
                }
            }
        }
    }
}
