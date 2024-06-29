import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class381 extends class346 {

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
    private int field4845 = 0;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "Ldj;")
    private class362 field4851 = new class362(16);

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    private int field4855 = 0;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "Lifa;")
    private class450 field4852 = new class450();

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "J")
    private long field4857 = 0L;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    private int field4836;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "Ltc;")
    private class372 field4843;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "Z")
    private boolean field4856;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "Lifa;")
    private class450 field4853;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "[B")
    private byte[] field4832;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "Lob;")
    private class769 field4841;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    private int field4846;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "Lrda;")
    private class692 field4837;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "Z")
    private boolean field4858;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    private int field4848;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "Ltc;")
    private class372 field4830;

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "Lan;")
    private class25 field4844;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Loh;")
    public static class425 field4827 = new class425("", 15);

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "Lkd;")
    private class298 field4838;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "Z")
    private boolean field4854;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "[B")
    private byte[] field4829;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public final void method2226(int arg0) {
        field4834++;
        if (this.field4853 != null) {
            if (this.method2058((byte) -41) == null) {
                return;
            }
            if (this.field4856) {
                boolean var6 = true;
                for (class379 var7 = this.field4853.method2725(arg0 ^ 0x25); var7 != null; var7 = this.field4853.method2726(-113)) {
                    int var9 = (int) var7.field4809;
                    if (this.field4829[var9] == 0) {
                        this.method2228(arg0 ^ 0x61, 1, var9);
                    }
                    if (this.field4829[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method2219(arg0 + 13630);
                    }
                }
                while (this.field4855 < this.field4838.field3543.length) {
                    if (this.field4838.field3543[this.field4855] == 0) {
                        this.field4855++;
                    } else {
                        if (this.field4837.field9432 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field4829[this.field4855] == 0) {
                            this.method2228(23, 1, this.field4855);
                        }
                        if (this.field4829[this.field4855] == 0) {
                            class379 var8 = new class379();
                            var8.field4809 = this.field4855;
                            this.field4853.method2732(var8, 21939);
                            var6 = false;
                        }
                        this.field4855++;
                    }
                }
                if (var6) {
                    this.field4856 = false;
                    this.field4855 = 0;
                }
            } else if (this.field4854) {
                boolean var2 = true;
                for (class379 var3 = this.field4853.method2725(37); var3 != null; var3 = this.field4853.method2726(-120)) {
                    int var5 = (int) var3.field4809;
                    if (this.field4829[var5] != 1) {
                        this.method2228(15, 2, var5);
                    }
                    if (this.field4829[var5] == 1) {
                        var3.method2219(13630);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field4855 < this.field4838.field3543.length) {
                    if (this.field4838.field3543[this.field4855] == 0) {
                        this.field4855++;
                    } else {
                        if (this.field4841.method4259(127)) {
                            var2 = false;
                            break;
                        }
                        if (this.field4829[this.field4855] != 1) {
                            this.method2228(100, 2, this.field4855);
                        }
                        if (this.field4829[this.field4855] != 1) {
                            class379 var4 = new class379();
                            var4.field4809 = this.field4855;
                            var2 = false;
                            this.field4853.method2732(var4, 21939);
                        }
                        this.field4855++;
                    }
                }
                if (var2) {
                    this.field4854 = false;
                    this.field4855 = 0;
                }
            } else {
                this.field4853 = null;
            }
        }
        if (this.field4858 && this.field4857 <= class349.method2069(true)) {
            for (class25 var10 = (class25) this.field4851.method2119(-100); var10 != null; var10 = (class25) this.field4851.method2111((byte) 47)) {
                if (!var10.field374) {
                    if (var10.field375) {
                        if (!var10.field378) {
                            throw new RuntimeException();
                        }
                        var10.method2219(13630);
                    } else {
                        var10.field375 = true;
                    }
                }
            }
            this.field4857 = class349.method2069(true) + 1000L;
        }
        if (arg0 != 0) {
            this.field4845 = 33;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Z)V")
    public final void method2227(boolean arg0) {
        field4835++;
        if (this.field4853 == null || this.method2058((byte) -41) == null) {
            return;
        }
        for (class379 var2 = this.field4852.method2725(37); var2 != null; var2 = this.field4852.method2726(-120)) {
            int var3 = (int) var2.field4809;
            if (var3 < 0 || var3 >= this.field4838.field3544 || this.field4838.field3543[var3] == 0) {
                var2.method2219(13630);
            } else {
                if (this.field4829[var3] == 0) {
                    this.method2228(119, 1, var3);
                }
                if (this.field4829[var3] == -1) {
                    this.method2228(65, 2, var3);
                }
                if (this.field4829[var3] == 1) {
                    var2.method2219(13630);
                }
            }
        }
        if (arg0) {
            this.field4854 = true;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Lan;")
    private final class25 method2228(int arg0, int arg1, int arg2) {
        field4826++;
        if (arg0 < 14) {
            return null;
        }
        class25 var4 = (class25) this.field4851.method2121(107, (long) arg2);
        if (var4 != null && arg1 == 0 && !var4.field378 && var4.field374) {
            var4.method2219(13630);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field4843 == null || this.field4829[arg2] == -1) {
                    if (this.field4841.method4261(2)) {
                        return null;
                    }
                    var4 = this.field4841.method4262(arg2, true, (byte) 17, (byte) 2, this.field4836);
                } else {
                    var4 = this.field4837.method3869(this.field4843, arg2, 1);
                }
            } else if (arg1 == 1) {
                if (this.field4843 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4837.method3868(arg2, (byte) 48, this.field4843);
            } else if (arg1 == 2) {
                if (this.field4843 == null) {
                    throw new RuntimeException();
                }
                if (this.field4829[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4841.method4259(127)) {
                    return null;
                }
                var4 = this.field4841.method4262(arg2, false, (byte) 17, (byte) 2, this.field4836);
            } else {
                throw new RuntimeException();
            }
            this.field4851.method2112(var4, (byte) 6, (long) arg2);
        }
        if (var4.field374) {
            return null;
        }
        byte[] var5 = var4.method250(-13864);
        if (!(var4 instanceof class467)) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class176.field2186.reset();
                class176.field2186.update(var5, 0, var5.length - 2);
                int var6 = (int) class176.field2186.getValue();
                if (this.field4838.field3564[arg2] != var6) {
                    throw new RuntimeException();
                }
                if (this.field4838.field3549 != null && this.field4838.field3549[arg2] != null) {
                    byte[] var7 = this.field4838.field3549[arg2];
                    byte[] var8 = class259.method1551(var5, (byte) -106, 0, var5.length - 2);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field4841.field10584 = 0;
                this.field4841.field10585 = 0;
            } catch (RuntimeException var17) {
                this.field4841.method4260(255);
                var4.method2219(13630);
                if (var4.field378 && !this.field4841.method4261(2)) {
                    class145 var10 = this.field4841.method4262(arg2, true, (byte) 17, (byte) 2, this.field4836);
                    this.field4851.method2112(var10, (byte) 6, (long) arg2);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4838.field3553[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field4838.field3553[arg2];
            if (this.field4843 != null) {
                this.field4837.method3867((byte) 31, this.field4843, var5, arg2);
                if (this.field4829[arg2] != 1) {
                    this.field4845++;
                    this.field4829[arg2] = 1;
                }
            }
            if (!var4.field378) {
                var4.method2219(13630);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class176.field2186.reset();
            class176.field2186.update(var5, 0, var5.length - 2);
            int var11 = (int) class176.field2186.getValue();
            if (this.field4838.field3564[arg2] != var11) {
                throw new RuntimeException();
            }
            if (this.field4838.field3549 != null && this.field4838.field3549[arg2] != null) {
                byte[] var12 = this.field4838.field3549[arg2];
                byte[] var13 = class259.method1551(var5, (byte) -17, 0, var5.length - 2);
                for (int var14 = 0; var14 < 64; var14++) {
                    if (var12[var14] != var13[var14]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var15 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4838.field3553[arg2] & 0xFFFF) != var15) {
                throw new RuntimeException();
            }
            if (this.field4829[arg2] != 1) {
                this.field4845++;
                this.field4829[arg2] = 1;
            }
            if (!var4.field378) {
                var4.method2219(13630);
            }
            return var4;
        } catch (Exception var18) {
            this.field4829[arg2] = -1;
            var4.method2219(13630);
            if (var4.field378 && !this.field4841.method4261(2)) {
                class145 var16 = this.field4841.method4262(arg2, true, (byte) 17, (byte) 2, this.field4836);
                this.field4851.method2112(var16, (byte) 6, (long) arg2);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)I")
    public final int method2059(boolean arg0, int arg1) {
        field4839++;
        if (!arg0) {
            this.method2230(true);
        }
        class25 var3 = (class25) this.field4851.method2121(107, (long) arg1);
        return var3 == null ? 0 : var3.method253(0);
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(Z)I")
    public final int method2229(boolean arg0) {
        if (arg0) {
            this.field4853 = null;
        }
        field4825++;
        return this.field4845;
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(Z)V")
    public final void method2230(boolean arg0) {
        field4824++;
        if (this.field4843 != null && !arg0) {
            this.field4854 = true;
            if (this.field4853 == null) {
                this.field4853 = new class450();
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)Lkd;")
    public final class298 method2058(byte arg0) {
        field4840++;
        if (this.field4838 != null) {
            return this.field4838;
        }
        if (this.field4844 == null) {
            if (this.field4841.method4261(2)) {
                return null;
            }
            this.field4844 = this.field4841.method4262(this.field4836, true, (byte) 17, (byte) 0, 255);
        }
        if (this.field4844.field374) {
            return null;
        }
        byte[] var2 = this.field4844.method250(-13864);
        if (this.field4844 instanceof class467) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4838 = new class298(var2, this.field4846, this.field4832);
                if (this.field4838.field3559 != this.field4848) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field4838 = null;
                if (this.field4841.method4261(2)) {
                    this.field4844 = null;
                } else {
                    this.field4844 = this.field4841.method4262(this.field4836, true, (byte) 17, (byte) 0, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4838 = new class298(var2, this.field4846, this.field4832);
            } catch (RuntimeException var4) {
                this.field4841.method4260(255);
                this.field4838 = null;
                if (this.field4841.method4261(2)) {
                    this.field4844 = null;
                } else {
                    this.field4844 = this.field4841.method4262(this.field4836, true, (byte) 17, (byte) 0, 255);
                }
                return null;
            }
            if (this.field4830 != null) {
                this.field4837.method3867((byte) 31, this.field4830, var2, this.field4836);
            }
        }
        if (this.field4843 != null) {
            this.field4829 = new byte[this.field4838.field3544];
            this.field4845 = 0;
        }
        this.field4844 = null;
        if (arg0 != -41) {
            this.method2058((byte) -52);
        }
        return this.field4838;
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(Z)I")
    public final int method2231(boolean arg0) {
        if (!arg0) {
            this.method2226(-18);
        }
        field4849++;
        if (this.field4838 == null) {
            return 0;
        } else if (this.field4856) {
            class379 var2 = this.field4853.method2725(37);
            return var2 == null ? 0 : (int) var2.field4809;
        } else {
            return this.field4838.field3541;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
    public static void method2232(byte arg0) {
        field4827 = null;
        if (arg0 >= -21) {
            method2234(-36, 117);
        }
    }

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "(Z)I")
    public final int method2233(boolean arg0) {
        if (arg0) {
            this.field4851 = null;
        }
        field4847++;
        return this.field4838 == null ? 0 : this.field4838.field3541;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)I")
    public static final int method2234(int arg0, int arg1) {
        field4850++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        if (arg0 > -123) {
            return 53;
        }
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)I")
    public final int method2235(int arg0) {
        if (arg0 != 28317) {
            this.field4854 = true;
        }
        field4833++;
        if (this.method2058((byte) -41) == null) {
            return this.field4844 == null ? 0 : this.field4844.method253(0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)[B")
    public final byte[] method2056(byte arg0, int arg1) {
        field4842++;
        class25 var3 = this.method2228(89, 0, arg1);
        int var4 = -93 % ((35 - arg0) / 41);
        if (var3 == null) {
            return null;
        } else {
            byte[] var5 = var3.method250(-13864);
            var3.method2219(13630);
            return var5;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(ZI)V")
    public final void method2060(boolean arg0, int arg1) {
        field4831++;
        if (this.field4843 == null || arg0) {
            return;
        }
        for (class379 var3 = this.field4852.method2725(37); var3 != null; var3 = this.field4852.method2726(-120)) {
            if ((long) arg1 == var3.field4809) {
                return;
            }
        }
        class379 var4 = new class379();
        var4.field4809 = arg1;
        this.field4852.method2732(var4, 21939);
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(ILtc;Ltc;Lob;Lrda;I[BIZ)V")
    public class381(int arg0, class372 arg1, class372 arg2, class769 arg3, class692 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field4836 = arg0;
        this.field4843 = arg1;
        if (this.field4843 == null) {
            this.field4856 = false;
        } else {
            this.field4856 = true;
            this.field4853 = new class450();
        }
        this.field4832 = arg6;
        this.field4841 = arg3;
        this.field4846 = arg5;
        this.field4837 = arg4;
        this.field4858 = arg8;
        this.field4848 = arg7;
        this.field4830 = arg2;
        if (this.field4830 != null) {
            this.field4844 = this.field4837.method3869(this.field4830, this.field4836, 1);
        }
    }
}
