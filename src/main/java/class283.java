import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class283 {

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
    private int field4070 = -1;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "Z")
    private boolean field4055 = false;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "Z")
    private boolean field4060 = false;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    private int field4062 = -32768;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    private int field4078 = -1;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    private int field4056;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public int field4046;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
    private int field4063;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public int field4053;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "B")
    private byte field4061;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public int field4059;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "B")
    private byte field4068;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Z")
    private boolean field4050;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "Lvg;")
    public static class38 field4065 = null;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "Llt;")
    public static class475 field4076 = new class475("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    private int field4047;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    private int field4066;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
    private int field4069;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    private int field4079;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Lc;")
    private class121 field4048;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "Lce;")
    public class201 field4073;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "Lnm;")
    private class329 field4058;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "Lj;")
    private class377 field4057;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "[Z")
    private boolean[] field4045;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static void method1826(int arg0) {
        field4076 = null;
        int var1 = 60 % ((arg0 + 66) / 39);
        field4065 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
    private final void method1827(int arg0, int arg1, int arg2) {
        if (arg0 != -127) {
            this.field4073 = null;
        }
        field4074++;
        label92: while (true) {
            if (this.field4058 == null) {
                if (this.field4055) {
                    return;
                }
                this.method1835(-32768, -1);
                if (this.field4058 == null) {
                    return;
                }
            }
            int var4 = class317.field4559 - this.field4047;
            if (var4 > 100 && this.field4058.field4658 > 0) {
                int var5 = this.field4058.field4670.length - this.field4058.field4658;
                while (this.field4079 < var5 && this.field4058.field4665[this.field4079] < var4) {
                    var4 -= this.field4058.field4665[this.field4079];
                    this.field4079++;
                }
                if (this.field4079 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field4058.field4670.length; var7++) {
                        var6 += this.field4058.field4665[var7];
                    }
                    var4 %= var6;
                }
                this.field4066 = this.field4079 + 1;
                if (this.field4066 >= this.field4058.field4670.length) {
                    this.field4066 -= this.field4058.field4658;
                    if (this.field4066 < 0 || this.field4058.field4670.length <= this.field4066) {
                        this.field4066 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field4058.field4665[this.field4079] >= var4) {
                            this.field4047 = class317.field4559 - var4;
                            this.field4069 = var4;
                            return;
                        }
                        class480.method2856(arg2, arg1, (byte) 78, this.field4068, false, this.field4058, this.field4079);
                        var4 -= this.field4058.field4665[this.field4079];
                        this.field4079++;
                        if (this.field4058.field4670.length <= this.field4079) {
                            this.field4079 -= this.field4058.field4658;
                            if (this.field4079 < 0 || this.field4079 >= this.field4058.field4670.length) {
                                this.field4058 = null;
                                continue label92;
                            }
                        }
                        this.field4066 = this.field4079 + 1;
                    } while (this.field4066 < this.field4058.field4670.length);
                    this.field4066 -= this.field4058.field4658;
                } while (this.field4066 >= 0 && this.field4066 < this.field4058.field4670.length);
                this.field4066 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lqa;B)V")
    public final void method1828(class162 arg0, byte arg1) {
        field4064++;
        this.method1834(true, arg0, 262144, this.field4056, true, (byte) -23, this.field4063);
        if (arg1 != -88) {
            this.field4047 = 72;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lqa;I)V")
    public final void method1829(class162 arg0, int arg1) {
        if (arg1 != 4) {
            return;
        }
        field4052++;
        if (this.field4057 != null) {
            class429.method2564(this.field4057, this.field4061, this.field4063, this.field4056, this.field4045);
            this.field4045 = null;
            this.field4057 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4071++;
        if (this.field4073 != null) {
            this.field4073.method1366();
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBI)I")
    public static final int method1830(int arg0, byte arg1, int arg2) {
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        int var4 = -16 / ((arg1 + 61) / 40);
        field4051++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)I")
    public final int method1831(int arg0) {
        field4075++;
        int var2 = 95 / ((4 - arg0) / 55);
        return this.field4062;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)Z")
    public final boolean method1832(byte arg0) {
        if (arg0 > -80) {
            return true;
        } else {
            field4077++;
            return this.field4050;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZI)V")
    public final void method1833(boolean arg0, int arg1) {
        field4072++;
        this.field4055 = arg0;
        this.method1835(-32768, arg1);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZLqa;IIZBI)Lc;")
    public final class121 method1834(boolean arg0, class162 arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6) {
        field4054++;
        class519 var8 = class252.field3743.method2686(this.field4059, (byte) 102);
        if (var8.field7596 != null) {
            var8 = var8.method3067(class49.field796, -13012);
        }
        if (var8 == null) {
            this.method1829(arg1, 4);
            this.field4078 = this.field4079;
            this.field4070 = -1;
            return null;
        }
        if (!this.field4055 && this.field4070 != var8.field7580) {
            this.field4048 = null;
            this.method1835(-32768, -1);
        }
        this.method1827(-127, arg6, arg3);
        boolean var9 = arg4 & this.field4050 & class426.field6401.method393(class170.field2529, 1) != 0;
        boolean var10 = var9 & (this.field4070 != var8.field7580 || (this.field4079 != this.field4078 || this.field4058 != null && (this.field4058.field4657 || class307.field4418) && this.field4079 != this.field4066) && class426.field6401.method393(class170.field2529, arg5 ^ 0xFFFFFFE8) >= 2);
        if (arg5 != -23) {
            return null;
        } else if (arg0 && !var10) {
            this.field4078 = this.field4079;
            this.field4070 = var8.field7580;
            return null;
        } else {
            if (var10) {
                class429.method2564(this.field4057, this.field4061, this.field4063, this.field4056, this.field4045);
            }
            class35 var11 = class86.field1324[this.field4061];
            class35 var12;
            if (this.field4060) {
                var12 = class307.field4415[0];
            } else {
                var12 = this.field4061 < 3 ? class86.field1324[this.field4061 + 1] : null;
            }
            class121 var13 = null;
            if (this.field4058 != null) {
                if (var10) {
                    arg2 |= 0x40000;
                }
                var13 = var8.method3053(var11.method202(this.field4063, this.field4056), arg2, this.field4056, var11, this.field4069, -99, this.field4058, this.field4066, this.field4046 == 11 ? 10 : this.field4046, this.field4079, var12, arg1, this.field4063, this.field4046 == 11 ? this.field4053 + 4 : this.field4053);
                if (var13 == null) {
                    this.field4062 = 0;
                    this.field4057 = null;
                    this.field4045 = null;
                } else {
                    if (var10) {
                        if (this.field4045 == null) {
                            this.field4045 = new boolean[4];
                        }
                        this.field4057 = var13.method745(this.field4057);
                        class342.method2091(this.field4057, this.field4061, arg6, arg3, this.field4045);
                    }
                    this.field4062 = var13.method709();
                }
                this.field4048 = null;
            } else if (this.field4048 != null && (this.field4048.method738() & arg2) == arg2 && this.field4070 == var8.field7580) {
                var13 = this.field4048;
            } else {
                if (this.field4048 != null) {
                    arg2 |= this.field4048.method738();
                }
                class266 var14 = var8.method3060(this.field4046 == 11 ? 10 : this.field4046, this.field4046 == 11 ? this.field4053 + 4 : this.field4053, this.field4056, var10, arg2, var11, var11.method202(this.field4063, this.field4056), arg1, this.field4063, var12, 106);
                if (var14 == null) {
                    this.field4045 = null;
                    this.field4057 = null;
                    this.field4062 = 0;
                    this.field4048 = null;
                } else {
                    var13 = var14.field3890;
                    this.field4048 = var14.field3890;
                    if (var10) {
                        this.field4045 = null;
                        this.field4057 = var14.field3889;
                        class342.method2091(this.field4057, this.field4061, arg6, arg3, null);
                    }
                    this.field4062 = var13.method709();
                }
            }
            this.field4078 = this.field4079;
            this.field4063 = arg6;
            this.field4070 = var8.field7580;
            this.field4056 = arg3;
            return var13;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
    private final void method1835(int arg0, int arg1) {
        field4067++;
        int var3 = arg1;
        if (arg0 != -32768) {
            this.method1831(44);
        }
        boolean var4 = false;
        if (arg1 == -1) {
            class519 var5 = class252.field3743.method2686(this.field4059, (byte) 101);
            class519 var6 = var5;
            if (var5.field7596 != null) {
                var5 = var5.method3067(class49.field796, -13012);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field7599 != null) {
                if (this.field4058 != null && var5.method3059(this.field4058.field4656, 0)) {
                    return;
                }
                var3 = var5.method3069(-123);
                if (this.field4070 != var5.field7580) {
                    var4 = var5.field7579;
                }
            } else if (var5.field7636 == -1) {
                if (var6 != null && var6.field7599 != null) {
                    if (this.field4058 != null && var6.method3059(this.field4058.field4656, 0)) {
                        return;
                    }
                    var3 = var6.method3069(112);
                    if (this.field4070 != var6.field7580) {
                        var4 = var6.field7579;
                    }
                } else if (var6 != null && var6.field7636 != -1 && this.field4070 != var6.field7580) {
                    var3 = var6.field7636;
                    var4 = var6.field7579;
                }
            } else if (this.field4070 != var5.field7580) {
                var3 = var5.field7636;
                var4 = var5.field7579;
            }
        }
        if (var3 == -1) {
            this.field4058 = null;
            return;
        }
        this.field4048 = null;
        if (this.field4058 == null || this.field4058.field4656 != var3) {
            this.field4058 = class84.field1295.method1182(var3, arg0 + 32776);
        } else if (this.field4058.field4668 == 0) {
            return;
        }
        if (this.field4058.field4670 == null) {
            this.field4058 = null;
            return;
        }
        if (var4) {
            this.field4079 = (int) (Math.random() * (double) this.field4058.field4670.length);
            this.field4069 = (int) ((double) this.field4058.field4665[this.field4079] * Math.random()) + 1;
        } else {
            this.field4079 = 0;
            this.field4069 = 1;
        }
        this.field4066 = this.field4079 + 1;
        if (this.field4066 < 0 || this.field4058.field4670.length <= this.field4066) {
            this.field4066 = -1;
        }
        this.field4047 = class317.field4559 - this.field4069;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIILc;Lqa;IZ)V")
    public final void method1836(int arg0, int arg1, int arg2, int arg3, class121 arg4, class162 arg5, int arg6, boolean arg7) {
        if (arg6 != -4333) {
            return;
        }
        field4049++;
        class52[] var9 = arg4.method747();
        class255[] var10 = arg4.method703();
        if ((this.field4073 == null || this.field4073.field2903) && (var9 != null || var10 != null)) {
            class519 var11 = class252.field3743.method2686(this.field4059, (byte) 119);
            if (var11.field7596 != null) {
                var11 = var11.method3067(class49.field796, -13012);
            }
            if (var11 != null) {
                this.field4073 = new class201(class317.field4559);
            }
        }
        if (this.field4073 == null) {
            return;
        }
        if (arg7) {
            this.field4073.method1367(arg5, (long) class317.field4559, var9, var10, false);
        } else {
            this.field4073.method1362((long) class317.field4559);
        }
        this.field4073.method1371(this.field4068, arg0, arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lqa;Lkn;IIIIIIZI)V")
    public class283(class162 arg0, class519 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field4056 = arg7;
        this.field4046 = arg2;
        this.field4063 = arg6;
        this.field4053 = arg3;
        this.field4061 = (byte) arg5;
        this.field4060 = arg8;
        this.field4059 = arg1.field7580;
        this.field4068 = (byte) arg4;
        this.field4050 = arg0.method1091() && arg1.field7628 && !this.field4060;
        if (arg9 != -1) {
            this.field4055 = true;
        }
        this.method1835(-32768, arg9);
    }
}
