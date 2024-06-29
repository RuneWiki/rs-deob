import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class342 {

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    private int field4417 = 0;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Z")
    public boolean field4418 = false;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    private int field4423 = 128;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public int field4431 = -1;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    private int field4427 = 0;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    private int field4432 = -1;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    private int field4415 = 0;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    private int field4421 = 128;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "B")
    public byte field4435 = 0;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public static int field4436 = -1;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "Lsn;")
    public static class629 field4425 = new class629("LIVE", 0);

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "[[Z")
    public static boolean[][] field4438 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "[F")
    public static float[] field4437 = new float[4];

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "[I")
    public static int[] field4440 = new int[200];

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    private int field4420;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public int field4426;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "Ltw;")
    public class202 field4424;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "[S")
    private short[] field4412;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "[S")
    private short[] field4416;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "[S")
    private short[] field4428;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "[S")
    private short[] field4430;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 6)
    public static void method2029(int arg0) {
        field4438 = null;
        if (arg0 <= 9) {
            method2036((byte) -13);
        }
        field4425 = null;
        field4440 = null;
        field4437 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILig;I)V", line = 39)
    private final void method2030(int arg0, class244 arg1, int arg2) {
        field4422++;
        if (arg0 < 30) {
            this.field4420 = -43;
        }
        if (arg2 == 1) {
            this.field4420 = arg1.method1476(1);
        } else if (arg2 == 2) {
            this.field4431 = arg1.method1476(27);
        } else if (arg2 == 4) {
            this.field4423 = arg1.method1476(105);
        } else if (arg2 == 5) {
            this.field4421 = arg1.method1476(35);
        } else if (arg2 == 6) {
            this.field4427 = arg1.method1476(39);
        } else if (arg2 == 7) {
            this.field4415 = arg1.method1423(-46);
        } else if (arg2 == 8) {
            this.field4417 = arg1.method1423(-12);
        } else if (arg2 == 9) {
            this.field4432 = 8224;
            this.field4435 = 3;
        } else if (arg2 == 10) {
            this.field4418 = true;
        } else if (arg2 == 11) {
            this.field4435 = 1;
        } else if (arg2 == 12) {
            this.field4435 = 4;
        } else if (arg2 == 13) {
            this.field4435 = 5;
        } else if (arg2 == 14) {
            this.field4435 = 2;
            this.field4432 = arg1.method1423(-52) * 256;
        } else if (arg2 == 15) {
            this.field4435 = 3;
            this.field4432 = arg1.method1476(-100);
        } else if (arg2 == 16) {
            this.field4435 = 3;
            this.field4432 = arg1.method1438(116);
        } else if (arg2 == 40) {
            int var4 = arg1.method1423(-77);
            this.field4430 = new short[var4];
            this.field4416 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4430[var5] = (short) arg1.method1476(42);
                this.field4416[var5] = (short) arg1.method1476(14);
            }
            return;
        } else if (arg2 == 41) {
            int var6 = arg1.method1423(-68);
            this.field4428 = new short[var6];
            this.field4412 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4428[var7] = (short) arg1.method1476(-99);
                this.field4412[var7] = (short) arg1.method1476(73);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIILs;ZLs;IBLha;ILne;III)Lka;", line = 162)
    private final class470 method2031(int arg0, int arg1, int arg2, class278 arg3, boolean arg4, class278 arg5, int arg6, byte arg7, class58 arg8, int arg9, class317 arg10, int arg11, int arg12, int arg13) {
        field4414++;
        int var15 = arg0;
        class25 var16 = this.field4431 == -1 || arg11 == -1 ? null : arg10.method1905(110, this.field4431);
        boolean var17 = arg4 & this.field4435 != 0;
        if (var16 != null) {
            var15 = arg0 | var16.method125(false, arg11, arg9 + 65407, arg2);
        }
        if (var17) {
            var15 |= this.field4435 == 3 ? 7 : 2;
        }
        if (this.field4421 != 128) {
            var15 |= 0x2;
        }
        if (this.field4423 != 128 || this.field4427 != 0) {
            var15 |= 0x5;
        }
        class620 var18 = this.field4424.field2396;
        class470 var19;
        synchronized (this.field4424.field2396) {
            var19 = (class470) this.field4424.field2396.method3538((long) (this.field4426 |= arg8.field581 << 29), 0);
        }
        if (var19 == null || arg8.method418(var19.method213(), var15) != 0) {
            if (var19 != null) {
                var15 = arg8.method404(var15, var19.method213());
            }
            int var20 = var15;
            if (this.field4430 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field4428 != null) {
                var20 |= 0x8000;
            }
            class260 var21 = class359.method2109(4763, 0, this.field4424.field2388, this.field4420);
            if (var21 == null) {
                return null;
            }
            if (var21.field3182 < 13) {
                var21.method1568(2, (byte) -17);
            }
            var19 = arg8.method383(var21, var20, this.field4424.field2397, this.field4415 + 64, this.field4417 + 850);
            if (this.field4430 != null) {
                for (int var22 = 0; var22 < this.field4430.length; var22++) {
                    var19.method187(this.field4430[var22], this.field4416[var22]);
                }
            }
            if (this.field4428 != null) {
                for (int var23 = 0; var23 < this.field4428.length; var23++) {
                    var19.method192(this.field4428[var23], this.field4412[var23]);
                }
            }
            var19.method207(var15);
            class620 var24 = this.field4424.field2396;
            synchronized (this.field4424.field2396) {
                this.field4424.field2396.method3537(-97, (long) (this.field4426 |= arg8.field581 << 29), var19);
            }
        }
        class470 var25 = var16 == null ? var19.method237(arg7, var15, true) : var16.method123((byte) 74, arg13, arg7, var15, 0, var19, arg2, arg11);
        if (this.field4423 != arg9 || this.field4421 != 128) {
            var25.method232(this.field4423, this.field4421, this.field4423);
        }
        if (this.field4427 != 0) {
            if (this.field4427 == 90) {
                var25.method211(4096);
            }
            if (this.field4427 == 180) {
                var25.method211(8192);
            }
            if (this.field4427 == 270) {
                var25.method211(12288);
            }
        }
        if (var17) {
            var25.method219(this.field4435, this.field4432, arg3, arg5, arg12, arg6, arg1);
        }
        var25.method207(arg0);
        return var25;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILha;IILne;IB)Lka;", line = 282)
    public final class470 method2032(int arg0, class58 arg1, int arg2, int arg3, class317 arg4, int arg5, byte arg6) {
        if (arg6 <= 102) {
            this.field4427 = 108;
        }
        field4419++;
        return this.method2031(arg0, 0, arg2, null, false, null, 0, (byte) 5, arg1, 128, arg4, arg3, 0, arg5);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lig;B)V", line = 294)
    public final void method2033(class244 arg0, byte arg1) {
        field4434++;
        while (true) {
            int var3 = arg0.method1423(-67);
            if (var3 == 0) {
                if (arg1 <= 86) {
                    method2036((byte) -70);
                    return;
                } else {
                    return;
                }
            }
            this.method2030(70, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IFFF)F", line = 322)
    public static final float method2034(int arg0, float arg1, float arg2, float arg3) {
        field4429++;
        int var4 = -3 % ((-arg0 - 40) / 38);
        return (arg1 - arg3) * arg2 + arg3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ls;Ls;IIIIZLha;IIILne;I)Lka;", line = 332)
    public final class470 method2035(class278 arg0, class278 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, class58 arg7, int arg8, int arg9, int arg10, class317 arg11, int arg12) {
        field4433++;
        if (arg12 != 8705) {
            this.method2031(-83, -22, 105, null, true, null, 108, (byte) 30, null, -124, null, -99, -127, 38);
        }
        return this.method2031(arg2, arg5, arg4, arg0, arg6, arg1, arg3, (byte) 2, arg7, 128, arg11, arg10, arg9, arg8);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)Lfd;", line = 358)
    public static final class526 method2036(byte arg0) {
        if (arg0 <= 36) {
            method2036((byte) 22);
        }
        field4413++;
        return class353.field4536 < class476.field6778.length ? class476.field6778[class353.field4536++] : null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILha;Lne;IIB)Lka;", line = 386)
    public final class470 method2037(int arg0, int arg1, class58 arg2, class317 arg3, int arg4, int arg5, byte arg6) {
        field4411++;
        if (arg6 >= -109) {
            method2034(-12, -1.098173F, 0.43687356F, -0.98327833F);
        }
        return this.method2031(arg1, 0, arg4, null, false, null, 0, (byte) 2, arg2, 128, arg3, arg5, 0, arg0);
    }
}
