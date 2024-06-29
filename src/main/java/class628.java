import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class628 extends class675 {

    @OriginalMember(owner = "client!go", name = "ab", descriptor = "I")
    private int field8353 = 0;

    @OriginalMember(owner = "client!go", name = "S", descriptor = "I")
    private int field8345 = 0;

    @OriginalMember(owner = "client!go", name = "db", descriptor = "I")
    private int field8356 = 0;

    @OriginalMember(owner = "client!go", name = "V", descriptor = "Z")
    private boolean field8348 = true;

    @OriginalMember(owner = "client!go", name = "Z", descriptor = "I")
    private int field8352 = 0;

    @OriginalMember(owner = "client!go", name = "pb", descriptor = "I")
    private int field8368 = -1;

    @OriginalMember(owner = "client!go", name = "lb", descriptor = "Z")
    public boolean field8364 = false;

    @OriginalMember(owner = "client!go", name = "wb", descriptor = "I")
    private int field8375 = 0;

    @OriginalMember(owner = "client!go", name = "ib", descriptor = "I")
    private int field8361;

    @OriginalMember(owner = "client!go", name = "hb", descriptor = "I")
    public int field8360;

    @OriginalMember(owner = "client!go", name = "sb", descriptor = "Lla;")
    private class456 field8371;

    @OriginalMember(owner = "client!go", name = "Y", descriptor = "[I")
    public static int[] field8351 = new int[1024];

    @OriginalMember(owner = "client!go", name = "cb", descriptor = "Lms;")
    public static class763 field8355 = new class763("runescape", 0);

    @OriginalMember(owner = "client!go", name = "mb", descriptor = "Lqda;")
    public static class105 field8365 = new class105(2);

    @OriginalMember(owner = "client!go", name = "R", descriptor = "I")
    public static int field8344;

    @OriginalMember(owner = "client!go", name = "T", descriptor = "I")
    public static int field8346;

    @OriginalMember(owner = "client!go", name = "U", descriptor = "I")
    public static int field8347;

    @OriginalMember(owner = "client!go", name = "W", descriptor = "I")
    public static int field8349;

    @OriginalMember(owner = "client!go", name = "X", descriptor = "I")
    public static int field8350;

    @OriginalMember(owner = "client!go", name = "bb", descriptor = "I")
    public static int field8354;

    @OriginalMember(owner = "client!go", name = "eb", descriptor = "I")
    public static int field8357;

    @OriginalMember(owner = "client!go", name = "gb", descriptor = "I")
    public static int field8359;

    @OriginalMember(owner = "client!go", name = "jb", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!go", name = "kb", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!go", name = "nb", descriptor = "I")
    public static int field8366;

    @OriginalMember(owner = "client!go", name = "ob", descriptor = "I")
    public static int field8367;

    @OriginalMember(owner = "client!go", name = "qb", descriptor = "I")
    public static int field8369;

    @OriginalMember(owner = "client!go", name = "rb", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!go", name = "tb", descriptor = "I")
    public static int field8372;

    @OriginalMember(owner = "client!go", name = "ub", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!go", name = "vb", descriptor = "I")
    public static int field8374;

    @OriginalMember(owner = "client!go", name = "xb", descriptor = "I")
    public static int field8376;

    @OriginalMember(owner = "client!go", name = "fb", descriptor = "Ll;")
    private class17 field8358;

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 236)
    public class628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field8361 = arg0;
        this.field8356 = arg12;
        this.field8360 = arg2 - -arg1;
        class94 var14 = class226.field3216.method3929(this.field8361, -1);
        int var15 = var14.field1140;
        if (var15 != -1) {
            this.field8371 = class509.field6780.method663((byte) -90, var15);
            this.field8364 = false;
        } else {
            this.field8364 = true;
        }
        if (~this.field8360 == ~arg2) {
            class514.method2871(this.field8371, this.field8345, this, true);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)V", line = 19)
    public final void method3457(byte arg0, int arg1) {
        ++field8350;
        if (!this.field8364) {
            if (arg0 != 0) {
                this.field8356 = 16;
            }
            this.field8375 += arg1;
            while (~this.field8371.field6225[this.field8345] > ~this.field8375) {
                this.field8375 -= this.field8371.field6225[this.field8345];
                ++this.field8345;
                if (this.field8345 >= this.field8371.field6229.length) {
                    this.field8364 = true;
                    break;
                }
            }
            if (!this.field8364) {
                class514.method2871(this.field8371, this.field8345, this, true);
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(ILha;)Lww;", line = 52)
    public final class733 method800(int arg0, class59 arg1) {
        ++field8357;
        class475 var3 = this.method3459((~this.field8356 != arg0 ? 5 : 0) | 2048, arg1, -1, this.field8361);
        if (var3 == null) {
            return null;
        } else {
            if (this.field8356 != 0) {
                var3.method146(this.field8356 * 2048);
            }
            class333 var4 = arg1.method451();
            var4.method1727(super.field3505, super.field3510, super.field3502);
            this.method3460(false, arg1, var4, var3);
            class733 var5 = class397.method2338(false, (byte) 116, 1);
            if (class540.field7159) {
                var3.method160(var4, var5.field10150[0], class100.field1358, 0);
            } else {
                var3.method155(var4, var5.field10150[0], 0);
            }
            if (this.field8358 != null) {
                class388 var6 = this.field8358.method131();
                if (!class540.field7159) {
                    arg1.method508(var6);
                } else {
                    arg1.method407(var6, class100.field1358);
                }
            }
            this.field8348 = var3.method159();
            this.field8353 = var3.method180();
            this.field8352 = var3.method167();
            return var5;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V", line = 99)
    public final void method3458(boolean arg0) {
        ++field8376;
        if (!arg0) {
            if (this.field8358 != null) {
                this.field8358.method123();
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "(I)Z", line = 114)
    public final boolean method798(int arg0) {
        ++field8373;
        int var2 = 1 / ((53 - arg0) / 45);
        return false;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILha;II)Lka;", line = 130)
    private final class475 method3459(int arg0, class59 arg1, int arg2, int arg3) {
        ++field8349;
        class94 var5 = class226.field3216.method3929(arg3, arg2);
        class282 var6 = class113.field1866[super.field3508];
        class282 var7 = ~super.field3515 <= -4 ? null : class113.field1866[super.field3515 + 1];
        return this.field8364 ? var5.method702(super.field3502, var7, arg0, class509.field6780, -1, arg1, var6, -1, 0, super.field3505, super.field3510, true, true) : var5.method702(super.field3502, var7, arg0, class509.field6780, this.field8345, arg1, var6, this.field8368, this.field8375, super.field3505, super.field3510, true, true);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZLha;Lofa;Lka;)V", line = 145)
    private final void method3460(boolean arg0, class59 arg1, class333 arg2, class475 arg3) {
        ++field8354;
        if (arg0) {
            this.field8361 = -96;
        }
        arg3.method200(arg2);
        class730[] var5 = arg3.method150();
        class207[] var6 = arg3.method195();
        if ((this.field8358 == null || this.field8358.field220) && (var5 != null || var6 != null)) {
            this.field8358 = class17.method133(class29.field474, true);
        }
        if (this.field8358 != null) {
            this.field8358.method129(arg1, (long) class29.field474, var5, var6, false);
            this.field8358.method120(super.field3508, super.field9367, super.field9361, super.field9354, super.field9360);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V", line = 169)
    public static void method3461(byte arg0) {
        field8351 = null;
        field8365 = null;
        field8355 = null;
        if (arg0 != 52) {
            method3463(-10, 78, 5, (byte) 74);
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(Z)Z", line = 188)
    public final boolean method801(boolean arg0) {
        ++field8344;
        if (arg0) {
            this.method3459(-29, (class59) null, -28, -38);
        }
        return this.field8348;
    }

    @OriginalMember(owner = "client!go", name = "g", descriptor = "(B)Z", line = 200)
    public final boolean method806(byte arg0) {
        int var2 = -93 % ((14 - arg0) / 57);
        ++field8372;
        return false;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lha;B)V", line = 211)
    public final void method792(class59 arg0, byte arg1) {
        ++field8359;
        class475 var3 = this.method3459(0, arg0, -1, this.field8361);
        if (var3 != null) {
            class333 var4 = arg0.method451();
            var4.method1727(super.field3505, super.field3510, super.field3502);
            this.method3460(false, arg0, var4, var3);
        }
        if (arg1 <= 121) {
            this.field8348 = true;
        }
    }

    @OriginalMember(owner = "client!go", name = "finalize", descriptor = "()V", line = 262)
    protected final void finalize() {
        ++field8366;
        if (this.field8358 != null) {
            this.field8358.method123();
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lkf;Lha;IIIZI)V", line = 273)
    public final void method807(class256 arg0, class59 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg3 >= 109) {
            ++field8347;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(B)I", line = 284)
    public final int method791(byte arg0) {
        ++field8362;
        if (arg0 <= 81) {
            this.field8361 = -36;
        }
        return this.field8352;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lha;IIB)Z", line = 297)
    public final boolean method790(class59 arg0, int arg1, int arg2, byte arg3) {
        ++field8346;
        return arg3 != 103 ? false : false;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(BII)Z", line = 311)
    public static final boolean method3462(byte arg0, int arg1, int arg2) {
        ++field8363;
        if (arg0 >= -24) {
            field8351 = null;
        }
        return ~(34 & arg2) != -1;
    }

    @OriginalMember(owner = "client!go", name = "h", descriptor = "(I)I", line = 333)
    public final int method789(int arg0) {
        ++field8369;
        if (arg0 != -32768) {
            this.field8371 = null;
        }
        return this.field8353;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIB)V", line = 347)
    public static final void method3463(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 50) {
            method3463(82, -1, -64, (byte) 46);
        }
        class184.field2782 = new byte[arg2][arg0][arg1];
        ++field8374;
    }

    @OriginalMember(owner = "client!go", name = "g", descriptor = "(I)V", line = 361)
    public final void method803(int arg0) {
        ++field8370;
        if (arg0 != 131072) {
            this.field8375 = -48;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BLha;)Lck;", line = 372)
    public final class642 method808(byte arg0, class59 arg1) {
        if (arg0 >= -86) {
            return null;
        } else {
            ++field8367;
            return null;
        }
    }
}
