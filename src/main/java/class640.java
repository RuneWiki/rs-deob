import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class640 extends class752 {

    @OriginalMember(owner = "client!or", name = "R", descriptor = "I")
    private int field8882 = 0;

    @OriginalMember(owner = "client!or", name = "V", descriptor = "Z")
    private boolean field8886 = true;

    @OriginalMember(owner = "client!or", name = "N", descriptor = "I")
    private int field8878 = 0;

    @OriginalMember(owner = "client!or", name = "ab", descriptor = "I")
    private int field8891 = -1;

    @OriginalMember(owner = "client!or", name = "ob", descriptor = "I")
    private int field8905 = 0;

    @OriginalMember(owner = "client!or", name = "W", descriptor = "Z")
    public boolean field8887 = false;

    @OriginalMember(owner = "client!or", name = "Y", descriptor = "I")
    private int field8889 = 0;

    @OriginalMember(owner = "client!or", name = "Z", descriptor = "I")
    private int field8890 = 0;

    @OriginalMember(owner = "client!or", name = "P", descriptor = "I")
    public int field8880;

    @OriginalMember(owner = "client!or", name = "fb", descriptor = "I")
    private int field8896;

    @OriginalMember(owner = "client!or", name = "rb", descriptor = "Lgaa;")
    private class300 field8908;

    @OriginalMember(owner = "client!or", name = "X", descriptor = "[I")
    public static int[] field8888 = new int[1000];

    @OriginalMember(owner = "client!or", name = "Q", descriptor = "Llga;")
    public static class712 field8881 = new class712(2, -1);

    @OriginalMember(owner = "client!or", name = "qb", descriptor = "Lea;")
    public static class547 field8907 = new class547(55, -1);

    @OriginalMember(owner = "client!or", name = "M", descriptor = "I")
    public static int field8877;

    @OriginalMember(owner = "client!or", name = "O", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!or", name = "T", descriptor = "I")
    public static int field8884;

    @OriginalMember(owner = "client!or", name = "U", descriptor = "I")
    public static int field8885;

    @OriginalMember(owner = "client!or", name = "bb", descriptor = "I")
    public static int field8892;

    @OriginalMember(owner = "client!or", name = "cb", descriptor = "I")
    public static int field8893;

    @OriginalMember(owner = "client!or", name = "db", descriptor = "I")
    public static int field8894;

    @OriginalMember(owner = "client!or", name = "eb", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!or", name = "gb", descriptor = "I")
    public static int field8897;

    @OriginalMember(owner = "client!or", name = "hb", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!or", name = "ib", descriptor = "I")
    public static int field8899;

    @OriginalMember(owner = "client!or", name = "jb", descriptor = "I")
    public static int field8900;

    @OriginalMember(owner = "client!or", name = "kb", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!or", name = "lb", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!or", name = "mb", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!or", name = "nb", descriptor = "I")
    public static int field8904;

    @OriginalMember(owner = "client!or", name = "pb", descriptor = "I")
    public static int field8906;

    @OriginalMember(owner = "client!or", name = "sb", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!or", name = "S", descriptor = "Llba;")
    private class550 field8883;

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field8890 = arg12;
        this.field8880 = arg2 - -arg1;
        this.field8896 = arg0;
        class49 var14 = class303.field4090.method3521(2, this.field8896);
        int var15 = var14.field497;
        if (var15 != -1) {
            this.field8908 = class460.field6365.method1090(var15, 16383);
            this.field8887 = false;
        } else {
            this.field8887 = true;
        }
        if (~this.field8880 == ~arg2) {
            class153.method930((byte) -127, this, this.field8905, this.field8908);
        }
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(B)Z")
    public final boolean method157(byte arg0) {
        if (arg0 >= -70) {
            this.field8890 = -72;
        }
        ++field8903;
        return false;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
    public final void method3599(int arg0) {
        if (this.field8883 != null) {
            this.field8883.method3114();
        }
        if (arg0 <= 71) {
            this.method162((class176) null, (byte) -50, false, 126, (class60) null, 99, 56);
        }
        ++field8904;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lka;Lha;ILhba;)V")
    private final void method3600(class472 arg0, class60 arg1, int arg2, class10 arg3) {
        ++field8906;
        arg0.method217(arg3);
        class653[] var5 = arg0.method218();
        class614[] var6 = arg0.method201();
        if ((this.field8883 == null || this.field8883.field7783) && (var5 != null || var6 != null)) {
            this.field8883 = class550.method3117(class406.field5732, true);
        }
        if (arg2 != -17770) {
            this.method127((class60) null, 84);
        }
        if (this.field8883 != null) {
            this.field8883.method3120(arg1, (long) class406.field5732, var5, var6, false);
            this.field8883.method3123(super.field2175, super.field10422, super.field10426, super.field10421, super.field10425);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lha;III)Lka;")
    private final class472 method3601(class60 arg0, int arg1, int arg2, int arg3) {
        ++field8899;
        class49 var5 = class303.field4090.method3521(2, arg3);
        class281 var6 = class86.field1182[super.field2175];
        class281 var7 = super.field2167 < 3 ? class86.field1182[super.field2167 + 1] : null;
        if (arg2 != -18981) {
            this.method3599(92);
        }
        return this.field8887 ? var5.method286(arg0, class460.field6365, -1, arg1, super.field2170, true, var7, super.field2178, 0, var6, super.field2165, -1, (byte) 2) : var5.method286(arg0, class460.field6365, this.field8905, arg1, super.field2170, true, var7, super.field2178, this.field8889, var6, super.field2165, this.field8891, (byte) 2);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lgg;BZILha;II)V")
    public final void method162(class176 arg0, byte arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6) {
        int var8 = -72 % ((arg1 - 15) / 55);
        ++field8892;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!or", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field8879;
        if (this.field8883 != null) {
            this.field8883.method3114();
        }
    }

    @OriginalMember(owner = "client!or", name = "h", descriptor = "(I)I")
    public final int method132(int arg0) {
        if (arg0 != 0) {
            return -58;
        } else {
            ++field8894;
            return this.field8878;
        }
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
    public static final void method3602(int arg0) {
        ++field8901;
        if (arg0 > -2) {
            field8881 = null;
        }
        class314 var1 = (class314) class171.field2134.method724(32);
        boolean var2 = class72.field774 != null || ~class259.field3393 < -1;
        int var3 = var1.method1879(-115);
        int var4 = var1.method1875(112);
        if (var2) {
            class284.field3756 = 1;
        }
        if (var2) {
            class320.field4305 = class736.field10279;
        } else {
            class436.method2474(var4, (byte) 78, var3, class736.field10279);
        }
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(Lha;I)Lbd;")
    public final class62 method127(class60 arg0, int arg1) {
        ++field8885;
        class472 var3 = this.method3601(arg0, 2048 | (~this.field8890 != -1 ? 5 : 0), -18981, this.field8896);
        if (var3 == null) {
            return null;
        } else {
            if (~this.field8890 != -1) {
                var3.method197(this.field8890 * 2048);
            }
            if (arg1 > -12) {
                this.field8889 = -121;
            }
            class10 var4 = arg0.method410();
            var4.method33(super.field2170, super.field2178, super.field2165);
            this.method3600(var3, arg0, -17770, var4);
            class62 var5 = class413.method2384(1, (byte) -47, false);
            if (class670.field9312) {
                var3.method243(var4, var5.field678[0], class661.field9249, 0);
            } else {
                var3.method230(var4, var5.field678[0], 0);
            }
            if (this.field8883 != null) {
                class583 var6 = this.field8883.method3116();
                if (!class670.field9312) {
                    arg0.method452(var6);
                } else {
                    arg0.method397(var6, class661.field9249);
                }
            }
            this.field8886 = var3.method219();
            this.field8878 = var3.method234();
            this.field8882 = var3.method212();
            return var5;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIII)V")
    public static final void method3603(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == -1) {
            for (int var5 = 0; ~class497.field6763 < ~var5; ++var5) {
                Rectangle var6 = class733.field10219[var5];
                if (arg3 < var6.x + var6.width && ~var6.x > ~(arg2 + arg3) && ~arg4 > ~(var6.y - -var6.height) && arg0 + arg4 > var6.y) {
                    class24.field186[var5] = true;
                }
            }
            ++field8898;
            class207.method1157(arg0 + arg4, arg4, false, arg3, arg2 + arg3);
        }
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(Z)I")
    public final int method128(boolean arg0) {
        if (arg0) {
            this.field8882 = 45;
        }
        ++field8877;
        return this.field8882;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILha;BI)Z")
    public final boolean method131(int arg0, class60 arg1, byte arg2, int arg3) {
        if (arg2 < 59) {
            return true;
        } else {
            ++field8897;
            return false;
        }
    }

    @OriginalMember(owner = "client!or", name = "j", descriptor = "(I)V")
    public static void method3604(int arg0) {
        field8881 = null;
        field8888 = null;
        field8907 = null;
        if (arg0 != 0) {
            field8907 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BI)V")
    public final void method3605(byte arg0, int arg1) {
        ++field8884;
        if (!this.field8887) {
            this.field8889 += arg1;
            while (~this.field8889 < ~this.field8908.field4033[this.field8905]) {
                this.field8889 -= this.field8908.field4033[this.field8905];
                ++this.field8905;
                if (this.field8905 >= this.field8908.field4042.length) {
                    this.field8887 = true;
                    break;
                }
            }
            if (arg0 != 31) {
                field8907 = null;
            }
            if (!this.field8887) {
                class153.method930((byte) -126, this, this.field8905, this.field8908);
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(Lha;I)V")
    public final void method136(class60 arg0, int arg1) {
        ++field8909;
        class472 var3 = this.method3601(arg0, 0, -18981, this.field8896);
        int var4 = -122 % ((53 - arg1) / 46);
        if (var3 != null) {
            class10 var5 = arg0.method410();
            var5.method33(super.field2170, super.field2178, super.field2165);
            this.method3600(var3, arg0, -17770, var5);
        }
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(I)Z")
    public final boolean method123(int arg0) {
        int var2 = -2 / ((arg0 - -76) / 47);
        ++field8893;
        return false;
    }

    @OriginalMember(owner = "client!or", name = "f", descriptor = "(B)V")
    public final void method150(byte arg0) {
        ++field8895;
        if (arg0 == -73) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BLha;)Loia;")
    public final class90 method134(byte arg0, class60 arg1) {
        if (arg0 != -53) {
            field8888 = null;
        }
        ++field8902;
        return null;
    }

    @OriginalMember(owner = "client!or", name = "g", descriptor = "(I)Z")
    public final boolean method126(int arg0) {
        if (arg0 != 6540) {
            field8881 = null;
        }
        ++field8900;
        return this.field8886;
    }
}
