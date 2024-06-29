import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class249 {

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    private int field4285 = 0;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    private int field4287 = 0;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    private int field4289;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    private int field4297;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "[[I")
    public int[][] field4306;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Lmh;")
    private static class128 field4288 = class22.method156(125, "Feb");

    @OriginalMember(owner = "client!id", name = "o", descriptor = "Lmh;")
    private static class128 field4296 = class22.method156(126, "Aug");

    @OriginalMember(owner = "client!id", name = "w", descriptor = "[I")
    public static int[] field4304 = new int[100];

    @OriginalMember(owner = "client!id", name = "E", descriptor = "Lmh;")
    private static class128 field4312 = class22.method156(125, "Dec");

    @OriginalMember(owner = "client!id", name = "A", descriptor = "Lmh;")
    private static class128 field4308 = class22.method156(124, "Apr");

    @OriginalMember(owner = "client!id", name = "B", descriptor = "Lmh;")
    private static class128 field4309 = class22.method156(122, "Jun");

    @OriginalMember(owner = "client!id", name = "H", descriptor = "Lmh;")
    private static class128 field4315 = class22.method156(127, "May");

    @OriginalMember(owner = "client!id", name = "D", descriptor = "Lmh;")
    private static class128 field4311 = class22.method156(127, "Jul");

    @OriginalMember(owner = "client!id", name = "J", descriptor = "Lmh;")
    private static class128 field4317 = class22.method156(124, "Nov");

    @OriginalMember(owner = "client!id", name = "K", descriptor = "Lmh;")
    private static class128 field4318 = class22.method156(127, "Jan");

    @OriginalMember(owner = "client!id", name = "L", descriptor = "Lmh;")
    private static class128 field4319 = class22.method156(123, "Oct");

    @OriginalMember(owner = "client!id", name = "N", descriptor = "Lmh;")
    private static class128 field4321 = class22.method156(126, "Sep");

    @OriginalMember(owner = "client!id", name = "j", descriptor = "Lmh;")
    private static class128 field4291 = class22.method156(126, "Mar");

    @OriginalMember(owner = "client!id", name = "c", descriptor = "[Lmh;")
    public static class128[] field4284 = new class128[] { field4318, field4288, field4291, field4308, field4315, field4309, field4311, field4296, field4321, field4319, field4317, field4312 };

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Lra;")
    public static class308 field4298 = new class308(0, 0);

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    public static int field4324 = 3353893;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V", line = 8)
    public final void method1727(byte arg0) {
        if (arg0 != 59) {
            field4288 = (class128) null;
        }
        for (int var2 = 0; var2 < this.field4297; var2++) {
            for (int var3 = 0; var3 < this.field4289; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field4297 - 5 || this.field4289 - 5 <= var3) {
                    this.field4306[var2][var3] = 16777215;
                } else {
                    this.field4306[var2][var3] = 16777216;
                }
            }
        }
        field4300++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 41)
    public static void method1728(int arg0) {
        field4311 = null;
        field4296 = null;
        field4321 = null;
        field4315 = null;
        field4308 = null;
        field4312 = null;
        field4319 = null;
        field4304 = null;
        field4317 = null;
        field4318 = null;
        field4298 = null;
        field4309 = null;
        field4291 = null;
        field4284 = null;
        if (arg0 == -12806) {
            field4288 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V", line = 78)
    public final void method1729(int arg0, int arg1, int arg2) {
        int var4 = -123 / ((arg2 + 69) / 57);
        field4282++;
        int var5 = arg0 - this.field4285;
        int var6 = arg1 - this.field4287;
        this.field4306[var5][var6] = class238.method1622(this.field4306[var5][var6], -262145);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lcf;I)V", line = 93)
    public static final void method1730(class123 arg0, int arg1) {
        if (arg1 >= -24) {
            field4318 = (class128) null;
        }
        class3 var2 = (class3) class203.field3585.method728(false, arg0.field2079.method819((byte) 113));
        field4322++;
        if (var2 == null) {
            return;
        }
        if (var2.field52 != null) {
            class188.field3260.method393(var2.field52);
            var2.field52 = null;
        }
        var2.method1978((byte) 85);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIZ)V", line = 120)
    public final void method1731(int arg0, int arg1, boolean arg2) {
        int var4 = arg1 - this.field4285;
        if (!arg2) {
            int var5 = arg0 - this.field4287;
            field4299++;
            this.field4306[var4][var5] = class279.method1951(this.field4306[var4][var5], 262144);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIIII)Z", line = 133)
    private final boolean method1732(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != 128) {
            this.method1734(123, false, 43, -4, 7);
        }
        field4316++;
        if ((arg2 + arg4) > arg6 && arg4 < arg6 + arg8) {
            return arg7 < arg3 + arg5 && arg5 < arg0 + arg7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IBII)V", line = 152)
    private final void method1733(int arg0, byte arg1, int arg2, int arg3) {
        this.field4306[arg3][arg0] = class238.method1622(this.field4306[arg3][arg0], ~arg2);
        int var5 = 20 % ((arg1 - 14) / 49);
        field4292++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZIII)Z", line = 162)
    public final boolean method1734(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            this.method1735(87, -5, 15, false, 3, -58);
        }
        field4283++;
        if (arg3 == arg4 && arg0 == arg2) {
            return true;
        }
        int var6 = arg4 - this.field4285;
        int var7 = arg0 - this.field4287;
        if (var6 < 0 || var6 >= this.field4297 || var7 < 0 || var7 >= this.field4289) {
            return false;
        }
        int var8 = arg2 - this.field4287;
        int var9;
        if (var7 > var8) {
            var9 = var7 - var8;
        } else {
            var9 = var8 - var7;
        }
        int var10 = arg3 - this.field4285;
        int var11;
        if (var10 < var6) {
            var11 = var6 - var10;
        } else {
            var11 = var10 - var6;
        }
        if (var9 < var11) {
            int var12 = 32768;
            int var13 = var9 * 65536 / var11;
            while (var6 != var10) {
                if (var6 > var10) {
                    if ((this.field4306[var10][var8] & 0x12C0108) != 0) {
                        return false;
                    }
                    var10++;
                } else if (var6 < var10) {
                    if ((this.field4306[var10][var8] & 0x12C0180) != 0) {
                        return false;
                    }
                    var10--;
                }
                var12 += var13;
                if (var12 >= 65536) {
                    var12 -= 65536;
                    if (var8 < var7) {
                        if ((this.field4306[var10][var8] & 0x12C0102) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var7) {
                        if ((this.field4306[var10][var8] & 0x12C0120) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        } else {
            int var14 = var11 * 65536 / var9;
            int var15 = 32768;
            while (var7 != var8) {
                if (var8 < var7) {
                    if ((this.field4306[var10][var8] & 0x12C0102) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var8 > var7) {
                    if ((this.field4306[var10][var8] & 0x12C0120) != 0) {
                        return false;
                    }
                    var8--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var10 < var6) {
                        if ((this.field4306[var10][var8] & 0x12C0108) != 0) {
                            return false;
                        }
                        var10++;
                    } else if (var6 < var10) {
                        if ((this.field4306[var10][var8] & 0x12C0180) != 0) {
                            return false;
                        }
                        var10--;
                    }
                }
            }
        }
        return (this.field4306[var6][var7] & 0x1240100) == 0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIZII)V", line = 327)
    public final void method1735(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field4285;
        int var8 = arg1 - this.field4287;
        if (arg0 == 0) {
            if (arg4 == 0) {
                this.method1733(var8, (byte) 73, 128, var7);
                this.method1733(var8, (byte) -65, 8, var7 - 1);
            }
            if (arg4 == 1) {
                this.method1733(var8, (byte) 103, 2, var7);
                this.method1733(var8 + 1, (byte) 75, 32, var7);
            }
            if (arg4 == 2) {
                this.method1733(var8, (byte) 78, 8, var7);
                this.method1733(var8, (byte) 99, 128, var7 + 1);
            }
            if (arg4 == 3) {
                this.method1733(var8, (byte) 105, 32, var7);
                this.method1733(var8 - 1, (byte) 80, 2, var7);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg4 == 0) {
                this.method1733(var8, (byte) 83, 1, var7);
                this.method1733(var8 + 1, (byte) 67, 16, var7 - 1);
            }
            if (arg4 == 1) {
                this.method1733(var8, (byte) -53, 4, var7);
                this.method1733(var8 + 1, (byte) 102, 64, var7 + 1);
            }
            if (arg4 == 2) {
                this.method1733(var8, (byte) 75, 16, var7);
                this.method1733(var8 - 1, (byte) 85, 1, var7 + 1);
            }
            if (arg4 == 3) {
                this.method1733(var8, (byte) -87, 64, var7);
                this.method1733(var8 - 1, (byte) 109, 4, var7 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg4 == 0) {
                this.method1733(var8, (byte) 87, 130, var7);
                this.method1733(var8, (byte) -102, 8, var7 - 1);
                this.method1733(var8 + 1, (byte) -66, 32, var7);
            }
            if (arg4 == 1) {
                this.method1733(var8, (byte) -72, 10, var7);
                this.method1733(var8 + 1, (byte) 116, 32, var7);
                this.method1733(var8, (byte) -114, 128, var7 + 1);
            }
            if (arg4 == 2) {
                this.method1733(var8, (byte) 79, 40, var7);
                this.method1733(var8, (byte) -104, 128, var7 + 1);
                this.method1733(var8 - 1, (byte) -100, 2, var7);
            }
            if (arg4 == 3) {
                this.method1733(var8, (byte) 102, 160, var7);
                this.method1733(var8 - 1, (byte) -94, 2, var7);
                this.method1733(var8, (byte) 69, 8, var7 - 1);
            }
        }
        if (arg5 != 130) {
            this.method1744(-2, (byte) 83, -38, 20, 120, -96, 112, 31);
        }
        if (arg3) {
            if (arg0 == 0) {
                if (arg4 == 0) {
                    this.method1733(var8, (byte) -47, 65536, var7);
                    this.method1733(var8, (byte) 72, 4096, var7 - 1);
                }
                if (arg4 == 1) {
                    this.method1733(var8, (byte) 78, 1024, var7);
                    this.method1733(var8 + 1, (byte) 97, 16384, var7);
                }
                if (arg4 == 2) {
                    this.method1733(var8, (byte) -76, 4096, var7);
                    this.method1733(var8, (byte) 117, 65536, var7 + 1);
                }
                if (arg4 == 3) {
                    this.method1733(var8, (byte) -63, 16384, var7);
                    this.method1733(var8 - 1, (byte) 94, 1024, var7);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg4 == 0) {
                    this.method1733(var8, (byte) -128, 512, var7);
                    this.method1733(var8 + 1, (byte) 111, 8192, var7 - 1);
                }
                if (arg4 == 1) {
                    this.method1733(var8, (byte) -50, 2048, var7);
                    this.method1733(var8 + 1, (byte) 63, 32768, var7 + 1);
                }
                if (arg4 == 2) {
                    this.method1733(var8, (byte) 111, 8192, var7);
                    this.method1733(var8 - 1, (byte) -96, 512, var7 + 1);
                }
                if (arg4 == 3) {
                    this.method1733(var8, (byte) -105, 32768, var7);
                    this.method1733(var8 - 1, (byte) 110, 2048, var7 - 1);
                }
            }
            if (arg0 == 2) {
                if (arg4 == 0) {
                    this.method1733(var8, (byte) 95, 66560, var7);
                    this.method1733(var8, (byte) 90, 4096, var7 - 1);
                    this.method1733(var8 + 1, (byte) 113, 16384, var7);
                }
                if (arg4 == 1) {
                    this.method1733(var8, (byte) 80, 5120, var7);
                    this.method1733(var8 + 1, (byte) -41, 16384, var7);
                    this.method1733(var8, (byte) -67, 65536, var7 + 1);
                }
                if (arg4 == 2) {
                    this.method1733(var8, (byte) 75, 20480, var7);
                    this.method1733(var8, (byte) 81, 65536, var7 + 1);
                    this.method1733(var8 - 1, (byte) -98, 1024, var7);
                }
                if (arg4 == 3) {
                    this.method1733(var8, (byte) -101, 81920, var7);
                    this.method1733(var8 - 1, (byte) -86, 1024, var7);
                    this.method1733(var8, (byte) 90, 4096, var7 - 1);
                }
            }
        }
        field4293++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZIIIII)V", line = 535)
    public final void method1736(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg4 - this.field4287;
        int var9 = arg0 - this.field4285;
        int var10 = 256;
        if (arg1) {
            var10 += 131072;
        }
        int var11 = -16 % ((arg2 - 18) / 47);
        field4290++;
        if (arg6 == 1 || arg6 == 3) {
            int var12 = arg5;
            arg5 = arg3;
            arg3 = var12;
        }
        for (int var13 = var9; var13 < (arg5 + var9); var13++) {
            if (var13 >= 0 && this.field4297 > var13) {
                for (int var14 = var8; var14 < (var8 + arg3); var14++) {
                    if (var14 >= 0 && var14 < this.field4289) {
                        this.method1733(var14, (byte) -56, var10, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)[Lqg;", line = 584)
    public static final class231[] method1737(int arg0) {
        field4301++;
        class231[] var1 = new class231[class75.field1405];
        if (arg0 < 42) {
            field4321 = (class128) null;
        }
        for (int var2 = 0; var2 < class75.field1405; var2++) {
            int var3 = class178.field3128[var2] * class125.field2106[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class157.field2690[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class205.field3614[class238.method1622(var5[var6], 255)];
            }
            var1[var2] = new class231(class72.field1327, class132.field2294, class151.field2607[var2], class266.field4603[var2], class125.field2106[var2], class178.field3128[var2], var4);
        }
        class15.method113(107);
        return var1;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIZBI)V", line = 623)
    public final void method1738(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5) {
        field4305++;
        int var7 = arg5 - this.field4285;
        int var8 = arg2 - this.field4287;
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method1746(var8, var7, arg4 ^ 0xFEF5BFC0, 128);
                this.method1746(var8, var7 - 1, 17448960, 8);
            }
            if (arg0 == 1) {
                this.method1746(var8, var7, 17448960, 2);
                this.method1746(var8 + 1, var7, 17448960, 32);
            }
            if (arg0 == 2) {
                this.method1746(var8, var7, 17448960, 8);
                this.method1746(var8, var7 + 1, 17448960, 128);
            }
            if (arg0 == 3) {
                this.method1746(var8, var7, 17448960, 32);
                this.method1746(var8 - 1, var7, arg4 + 17449024, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method1746(var8, var7, arg4 ^ 0xFEF5BFC0, 1);
                this.method1746(var8 + 1, var7 + -1, 17448960, 16);
            }
            if (arg0 == 1) {
                this.method1746(var8, var7, 17448960, 4);
                this.method1746(var8 + 1, var7 - -1, 17448960, 64);
            }
            if (arg0 == 2) {
                this.method1746(var8, var7, arg4 ^ 0xFEF5BFC0, 16);
                this.method1746(var8 - 1, var7 + 1, 17448960, 1);
            }
            if (arg0 == 3) {
                this.method1746(var8, var7, arg4 + 17449024, 64);
                this.method1746(var8 - 1, var7 + -1, 17448960, 4);
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                this.method1746(var8, var7, 17448960, 130);
                this.method1746(var8, var7 - 1, 17448960, 8);
                this.method1746(var8 + 1, var7, 17448960, 32);
            }
            if (arg0 == 1) {
                this.method1746(var8, var7, arg4 ^ 0xFEF5BFC0, 10);
                this.method1746(var8 + 1, var7, 17448960, 32);
                this.method1746(var8, var7 + 1, 17448960, 128);
            }
            if (arg0 == 2) {
                this.method1746(var8, var7, arg4 + 17449024, 40);
                this.method1746(var8, var7 + 1, 17448960, 128);
                this.method1746(var8 - 1, var7, arg4 ^ 0xFEF5BFC0, 2);
            }
            if (arg0 == 3) {
                this.method1746(var8, var7, arg4 ^ 0xFEF5BFC0, 160);
                this.method1746(var8 - 1, var7, 17448960, 2);
                this.method1746(var8, var7 - 1, 17448960, 8);
            }
        }
        if (arg3) {
            if (arg1 == 0) {
                if (arg0 == 0) {
                    this.method1746(var8, var7, 17448960, 65536);
                    this.method1746(var8, var7 - 1, 17448960, 4096);
                }
                if (arg0 == 1) {
                    this.method1746(var8, var7, 17448960, 1024);
                    this.method1746(var8 + 1, var7, 17448960, 16384);
                }
                if (arg0 == 2) {
                    this.method1746(var8, var7, 17448960, 4096);
                    this.method1746(var8, var7 + 1, arg4 ^ 0xFEF5BFC0, 65536);
                }
                if (arg0 == 3) {
                    this.method1746(var8, var7, 17448960, 16384);
                    this.method1746(var8 - 1, var7, 17448960, 1024);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg0 == 0) {
                    this.method1746(var8, var7, 17448960, 512);
                    this.method1746(var8 + 1, var7 + -1, 17448960, 8192);
                }
                if (arg0 == 1) {
                    this.method1746(var8, var7, 17448960, 2048);
                    this.method1746(var8 + 1, var7 + 1, 17448960, 32768);
                }
                if (arg0 == 2) {
                    this.method1746(var8, var7, arg4 ^ 0xFEF5BFC0, 8192);
                    this.method1746(var8 - 1, var7 - -1, 17448960, 512);
                }
                if (arg0 == 3) {
                    this.method1746(var8, var7, 17448960, 32768);
                    this.method1746(var8 - 1, var7 + -1, 17448960, 2048);
                }
            }
            if (arg1 == 2) {
                if (arg0 == 0) {
                    this.method1746(var8, var7, arg4 + 17449024, 66560);
                    this.method1746(var8, var7 - 1, arg4 + 17449024, 4096);
                    this.method1746(var8 + 1, var7, arg4 ^ 0xFEF5BFC0, 16384);
                }
                if (arg0 == 1) {
                    this.method1746(var8, var7, 17448960, 5120);
                    this.method1746(var8 + 1, var7, 17448960, 16384);
                    this.method1746(var8, var7 + 1, 17448960, 65536);
                }
                if (arg0 == 2) {
                    this.method1746(var8, var7, 17448960, 20480);
                    this.method1746(var8, var7 + 1, arg4 + 17449024, 65536);
                    this.method1746(var8 - 1, var7, 17448960, 1024);
                }
                if (arg0 == 3) {
                    this.method1746(var8, var7, 17448960, 81920);
                    this.method1746(var8 - 1, var7, arg4 + 17449024, 1024);
                    this.method1746(var8, var7 - 1, 17448960, 4096);
                }
            }
        }
        if (arg4 != -64) {
            field4321 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ldc;I)V", line = 834)
    public static final void method1739(class102 arg0, int arg1) {
        field4314++;
        class147.method983(arg0, true, 200000);
        if (arg1 != -71) {
            field4315 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZBIIII)V", line = 845)
    public final void method1740(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field4285;
        field4310++;
        int var8 = arg4 - this.field4287;
        int var9 = 256;
        if (arg0) {
            var9 += 131072;
        }
        for (int var10 = var7; var10 < arg3 + var7; var10++) {
            if (var10 >= 0 && var10 < this.field4297) {
                for (int var11 = var8; var11 < var8 + arg2; var11++) {
                    if (var11 >= 0 && this.field4289 > var11) {
                        this.method1746(var11, var10, 17448960, var9);
                    }
                }
            }
        }
        if (arg1 != -51) {
            this.field4297 = 59;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(III)V", line = 889)
    public final void method1741(int arg0, int arg1, int arg2) {
        int var4 = -13 % ((-arg1 - 58) / 36);
        int var5 = arg2 - this.field4287;
        field4286++;
        int var6 = arg0 - this.field4285;
        this.field4306[var6][var5] = class279.method1951(this.field4306[var6][var5], 2097152);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIII)Z", line = 901)
    public final boolean method1742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != -16941) {
            return true;
        }
        field4295++;
        if (arg6 == 1) {
            if (arg4 == arg5 && arg0 == arg3) {
                return true;
            }
        } else if (arg4 >= arg5 && arg4 <= (arg5 + arg6 - 1) && arg3 <= arg3 && arg3 + arg6 - 1 >= arg3) {
            return true;
        }
        int var9 = arg4 - this.field4285;
        int var10 = arg0 - this.field4287;
        int var11 = arg5 - this.field4285;
        int var12 = arg3 - this.field4287;
        if (arg6 == 1) {
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var9 + 1 == var11 && var10 == var12 && (this.field4306[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field4306[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field4306[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field4306[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field4306[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field4306[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 + 1 == var11 && var10 == var12 && (this.field4306[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field4306[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var9 == var11 && var12 + 1 == var10 && (this.field4306[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var12 - 1) == var10 && (this.field4306[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var11 && var10 == var12 && (this.field4306[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var10 == var12 && (this.field4306[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 - (1 - arg6);
            int var14 = var10 + arg6 - 1;
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var9 + 1) == var11 && var12 >= var10 && var14 >= var12 && (this.field4306[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var12 - arg6 == var10 && (this.field4306[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var9 - arg6) == var11 && var10 <= var12 && var12 <= var14 && (this.field4306[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var12 - arg6) == var10 && (this.field4306[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 - arg6 == var11 && var12 >= var10 && var12 <= var14 && (this.field4306[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var12 + 1) == var10 && (this.field4306[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 + 1 == var11 && var12 >= var10 && var14 >= var12 && (this.field4306[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var12 + 1 == var10 && (this.field4306[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var11 <= var9 && var13 >= var9 && var12 + 1 == var10 && (this.field4306[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 >= var11 && var9 <= var13 && var12 - arg6 == var10 && (this.field4306[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if (var9 - arg6 == var11 && var12 >= var10 && var14 >= var12 && (this.field4306[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var10 <= var12 && var14 >= var12 && (this.field4306[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IBIIIIIII)Z", line = 1111)
    public final boolean method1743(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4313++;
        if (arg2 > 1) {
            return this.method1732(arg2, 128, arg8, arg0, arg4, arg3, arg6, arg5, arg2) ? true : this.method1745(arg8, arg2, arg4, arg2, 2, arg0, arg3, arg5, arg7, arg6);
        }
        int var10 = arg4 + arg8 - 1;
        if (arg1 != 109) {
            field4312 = (class128) null;
        }
        int var11 = arg0 + arg3 - 1;
        if (arg6 >= arg4 && var10 >= arg6 && arg3 <= arg5 && var11 >= arg5) {
            return true;
        } else if ((arg4 - 1) == arg6 && arg5 >= arg3 && arg5 <= var11 && (this.field4306[arg6 - this.field4285][arg5 - this.field4287] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg6 && arg3 <= arg5 && arg5 <= var11 && (this.field4306[arg6 - this.field4285][arg5 - this.field4287] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg5 && arg4 <= arg6 && var10 >= arg6 && (this.field4306[arg6 - this.field4285][arg5 - this.field4287] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg5 && arg6 >= arg4 && arg6 <= var10 && (this.field4306[arg6 - this.field4285][arg5 - this.field4287] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IBIIIIII)Z", line = 1166)
    public final boolean method1744(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4323++;
        if (arg7 == 1) {
            if (arg0 == arg2 && arg4 == arg5) {
                return true;
            }
        } else if (arg0 >= arg2 && arg0 <= (arg7 + arg2 - 1) && arg4 >= arg4 && (arg4 + arg7 - 1) >= arg4) {
            return true;
        }
        if (arg1 != -102) {
            return true;
        }
        int var9 = arg5 - this.field4287;
        int var10 = arg2 - this.field4285;
        int var11 = arg0 - this.field4285;
        int var12 = arg4 - this.field4287;
        if (arg7 == 1) {
            if (arg6 == 0) {
                if (arg3 == 0) {
                    if (var11 - 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field4306[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field4306[var10][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field4306[var10][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field4306[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var11 + 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field4306[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field4306[var10][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                    if (var11 - 1 == var10 && var9 == var12 && (this.field4306[var10][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12 && (this.field4306[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg3 == 0) {
                    if (var11 - 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field4306[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field4306[var10][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field4306[var10][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field4306[var10][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field4306[var10][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field4306[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 - 1 == var10 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field4306[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field4306[var10][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var10 == var11 && (var12 + 1) == var9 && (this.field4306[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var9 && (this.field4306[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var10 && var9 == var12 && (this.field4306[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var9 == var12 && (this.field4306[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg7 + var9 - 1;
            int var14 = arg7 + var10 - 1;
            if (arg6 == 0) {
                if (arg3 == 0) {
                    if ((var11 - arg7) == var10 && var12 >= var9 && var12 <= var13) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && var12 + 1 == var9 && (this.field4306[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && var12 - arg7 == var9 && (this.field4306[var11][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var11 >= var10 && var14 >= var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var11 - arg7) == var10 && var12 >= var9 && var12 <= var13 && (this.field4306[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var12 >= var9 && var12 <= var13 && (this.field4306[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var11 + 1) == var10 && var9 <= var12 && var13 >= var12) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var14 && (var12 + 1) == var9 && (this.field4306[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var14 >= var11 && var12 - arg7 == var9 && (this.field4306[var11][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 >= var10 && var11 <= var14 && var12 - arg7 == var9) {
                        return true;
                    }
                    if ((var11 - arg7) == var10 && var9 <= var12 && var13 >= var12 && (this.field4306[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 >= var9 && var13 >= var12 && (this.field4306[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg3 == 0) {
                    if (var11 - arg7 == var10 && var9 <= var12 && var13 >= var12) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 >= var9 && var13 >= var12 && (this.field4306[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var14 && var12 - arg7 == var9 && (this.field4306[var11][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var11 - arg7) == var10 && var12 >= var9 && var12 <= var13 && (this.field4306[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var9 <= var12 && var12 <= var13) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var14 && (var12 - arg7) == var9 && (this.field4306[var11][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var11 - arg7) == var10 && var12 >= var9 && var13 >= var12 && (this.field4306[var14][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var14 >= var11 && var12 + 1 == var9 && (this.field4306[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var10 && var12 >= var9 && var12 <= var13) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && (var12 - arg7) == var9) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 - arg7 == var10 && var9 <= var12 && var13 >= var12) {
                        return true;
                    }
                    if (var11 >= var10 && var14 >= var11 && var12 + 1 == var9 && (this.field4306[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var10 && var9 <= var12 && var13 >= var12 && (this.field4306[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var14 >= var11 && var12 - arg7 == var9) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var11 >= var10 && var11 <= var14 && var12 + 1 == var9 && (this.field4306[var11][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 >= var10 && var11 <= var14 && (var12 - arg7) == var9 && (this.field4306[var11][var13] & 0x12C0102) == 0) {
                    return true;
                }
                if (var11 - arg7 == var10 && var9 <= var12 && var12 <= var13 && (this.field4306[var14][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var9 <= var12 && var13 >= var12 && (this.field4306[var10][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1553)
    private final boolean method1745(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 != 2) {
            return false;
        }
        field4294++;
        int var11 = arg1 + arg7;
        int var12 = arg3 + arg9;
        int var13 = arg0 + arg2;
        int var14 = arg5 + arg6;
        if (arg2 <= arg9 && var13 > arg9) {
            if (arg6 == var11 && (arg8 & 0x4) == 0) {
                int var15 = arg9;
                int var16 = var13 < var12 ? var13 : var12;
                while (var16 > var15) {
                    if ((this.field4306[var15 - this.field4285][var11 - this.field4287 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg7 == var14 && (arg8 & 0x1) == 0) {
                int var17 = arg9;
                int var18 = var13 >= var12 ? var12 : var13;
                while (var17 < var18) {
                    if ((this.field4306[var17 - this.field4285][arg7 - this.field4287] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var12 > arg2 && var12 <= var13) {
            if (arg6 == var11 && (arg8 & 0x4) == 0) {
                for (int var19 = arg2; var19 < var12; var19++) {
                    if ((this.field4306[var19 - this.field4285][var11 - this.field4287 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg7 == var14 && (arg8 & 0x1) == 0) {
                for (int var20 = arg2; var20 < var12; var20++) {
                    if ((this.field4306[var20 - this.field4285][arg7 - this.field4287] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg6 <= arg7 && var14 > arg7) {
            if (arg2 == var12 && (arg8 & 0x8) == 0) {
                int var21 = arg7;
                int var22 = var11 <= var14 ? var11 : var14;
                while (var21 < var22) {
                    if ((this.field4306[var12 - this.field4285 - 1][var21 - this.field4287] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg9 == var13 && (arg8 & 0x2) == 0) {
                int var23 = arg7;
                int var24 = var14 < var11 ? var14 : var11;
                while (var23 < var24) {
                    if ((this.field4306[arg9 - this.field4285][var23 - this.field4287] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (var11 > arg6 && var11 <= var14) {
            if (arg2 == var12 && (arg8 & 0x8) == 0) {
                for (int var25 = arg6; var25 < var11; var25++) {
                    if ((this.field4306[var12 - this.field4285 - 1][var25 - this.field4287] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg9 == var13 && (arg8 & 0x2) == 0) {
                for (int var26 = arg6; var26 < var11; var26++) {
                    if ((this.field4306[arg9 - this.field4285][var26 - this.field4287] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)V", line = 1727)
    private final void method1746(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 17448960) {
            this.field4306[arg1][arg0] = class279.method1951(this.field4306[arg1][arg0], arg3);
            field4320++;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(II)V", line = 1736)
    public class249(int arg0, int arg1) {
        this.field4289 = arg1;
        this.field4297 = arg0;
        this.field4306 = new int[this.field4297][this.field4289];
        this.method1727((byte) 59);
    }
}
