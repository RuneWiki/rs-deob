import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class236 extends class641 {

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    private int field3320 = 0;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
    private int field3334 = -32768;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    private int field3337 = 0;

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "I")
    private int field3344 = -1;

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "I")
    private int field3343 = 0;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "Z")
    public boolean field3346 = false;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
    private int field3329;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "I")
    private int field3341;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public int field3316;

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "Ldv;")
    private class616 field3326;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field3318 = new String[100];

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
    public static int field3324 = 1;

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
    public static int field3340 = 0;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "Lhv;")
    private class485 field3335;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "[[I")
    public static int[][] field3325;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Loa;Z)V", line = 3)
    public final void method147(class651 arg0, boolean arg1) {
        if (!arg1) {
            method1471(-52L, (byte) -28);
        }
        ++field3339;
        class358 var3 = this.method1472(arg0, 0, 31211, this.field3329);
        if (var3 != null) {
            class397 var4 = arg0.method455();
            var4.method576(super.field8620, super.field8616, super.field8612);
            this.method1467(arg0, var4, -4659, var3);
        }
    }

    @OriginalMember(owner = "client!ok", name = "finalize", descriptor = "()V", line = 32)
    protected final void finalize() {
        ++field3331;
        if (this.field3335 != null) {
            this.field3335.method2714();
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 358)
    public class236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field3337 = arg12;
        this.field3329 = arg0;
        this.field3341 = arg4;
        this.field3316 = arg1 + arg2;
        class580 var14 = class120.field2028.method3725(this.field3329, (byte) 35);
        int var15 = var14.field7723;
        if (~var15 == 0) {
            this.field3346 = true;
        } else {
            this.field3326 = class636.field8570.method231(var15, -11764);
            this.field3346 = false;
        }
        if (this.field3316 == arg2) {
            class373.method2199(super.field8609, super.field8620, (byte) 116, super.field8612, this.field3343, this.field3326, false);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Z", line = 55)
    public final boolean method139(int arg0) {
        ++field3342;
        if (arg0 != 2) {
            field3324 = 20;
        }
        return false;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Loa;Lq;ILba;)V", line = 66)
    private final void method1467(class651 arg0, class397 arg1, int arg2, class358 arg3) {
        if (arg2 != -4659) {
            method1468(-61);
        }
        arg3.method1949(arg1);
        ++field3319;
        class93[] var5 = arg3.method1920();
        class171[] var6 = arg3.method1917();
        if ((this.field3335 == null || this.field3335.field6558) && (var5 != null || var6 != null)) {
            this.field3335 = class485.method2713(class642.field8626, true);
        }
        if (this.field3335 != null) {
            this.field3335.method2712(arg0, (long) class642.field8626, var5, var6, false);
            this.field3335.method2706(super.field8609, super.field8611, super.field8622, super.field8618, super.field8610);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILoa;)Ldd;", line = 99)
    public final class660 method143(int arg0, class651 arg1) {
        if (arg0 != 31358) {
            return null;
        } else {
            ++field3338;
            return null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BILoa;I)Z", line = 114)
    public final boolean method149(byte arg0, int arg1, class651 arg2, int arg3) {
        ++field3327;
        int var5 = -8 % ((arg0 - -26) / 38);
        return false;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V", line = 124)
    public static void method1468(int arg0) {
        field3325 = null;
        field3318 = null;
        if (arg0 > -61) {
            method1468(70);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZI)V", line = 136)
    public final void method1469(boolean arg0, int arg1) {
        ++field3328;
        if (!this.field3346) {
            this.field3320 += arg1;
            while (~this.field3326.field8163[this.field3343] > ~this.field3320) {
                this.field3320 -= this.field3326.field8163[this.field3343];
                ++this.field3343;
                if (~this.field3326.field8160.length >= ~this.field3343) {
                    this.field3346 = true;
                    break;
                }
            }
            if (!this.field3346) {
                class373.method2199(super.field8609, super.field8620, (byte) 99, super.field8612, this.field3343, this.field3326, false);
            }
            if (!arg0) {
                this.method1470((byte) 109);
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V", line = 174)
    public final void method1470(byte arg0) {
        ++field3323;
        if (this.field3335 != null) {
            this.field3335.method2714();
        }
        if (arg0 > -106) {
            this.field3329 = 23;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 188)
    public static final String method1471(long arg0, byte arg1) {
        ++field3321;
        if (arg0 > 0L && arg0 < 6582952005840035281L) {
            if (~(arg0 % 37L) == -1L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg0;
                while (var4 != 0L) {
                    var4 /= 37L;
                    ++var3;
                }
                if (arg1 != -46) {
                    method1468(95);
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (arg0 != 0L) {
                    long var7 = arg0;
                    arg0 /= 37L;
                    char var9 = class59.field912[(int) (-(arg0 * 37L) + var7)];
                    if (var9 == '_') {
                        int var10 = -1 + var6.length();
                        var9 = 160;
                        var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    }
                    var6.append(var9);
                }
                var6.reverse();
                var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                return var6.toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(Z)I", line = 238)
    public final int method729(boolean arg0) {
        if (arg0) {
            this.method142((byte) 14);
        }
        ++field3322;
        return this.field3334;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLoa;)Lpe;", line = 250)
    public final class571 method145(byte arg0, class651 arg1) {
        if (arg0 != 124) {
            this.field3337 = 113;
        }
        ++field3332;
        class358 var3 = this.method1472(arg1, (this.field3337 != 0 ? 5 : 0) | 2048, arg0 + 31087, this.field3329);
        if (var3 == null) {
            return null;
        } else {
            if (this.field3337 != 0) {
                var3.method1898(this.field3337 * 2048);
            }
            class397 var4 = arg1.method455();
            var4.method576(super.field8620, super.field8616, super.field8612);
            this.method1467(arg1, var4, -4659, var3);
            if (this.field3335 == null) {
                var3.method1947(var4, (class552) null, 0);
            } else {
                class174 var5 = this.field3335.method2711();
                arg1.method392(var3, var5, var4, (class552) null, 0);
            }
            this.field3334 = var3.method1939();
            return null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Loa;III)Lba;", line = 283)
    private final class358 method1472(class651 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 31211) {
            this.field3326 = null;
        }
        ++field3345;
        class580 var5 = class120.field2028.method3725(arg3, (byte) 87);
        class139 var6 = class684.field9625[super.field8609];
        class139 var7 = this.field3341 >= 3 ? null : class684.field9625[this.field3341 - -1];
        return !this.field3346 ? var5.method3180(true, arg0, var6, (byte) 72, arg1, super.field8612, var7, this.field3343, class636.field8570, this.field3344, super.field8620, super.field8616, this.field3320) : var5.method3180(true, arg0, var6, (byte) 118, arg1, super.field8612, var7, -1, class636.field8570, -1, super.field8620, super.field8616, 0);
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V", line = 303)
    public final void method142(byte arg0) {
        if (arg0 != -77) {
            this.field3329 = 1;
        }
        ++field3333;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLeh;)V", line = 319)
    public static final void method1473(byte arg0, class335 arg1) {
        if (arg0 == -8) {
            ++field3336;
            for (int var2 = 0; class708.field9929 > var2; ++var2) {
                int var3 = arg1.method1997(-129);
                int var4 = arg1.method2001((byte) -83);
                if (var4 == 65535) {
                    var4 = -1;
                }
                if (class18.field294[var3] != null) {
                    class18.field294[var3].field697 = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILoa;ILni;ZZI)V", line = 387)
    public final void method141(int arg0, class651 arg1, int arg2, class487 arg3, boolean arg4, boolean arg5, int arg6) {
        ++field3317;
        if (arg5) {
            throw new IllegalStateException();
        }
    }
}
