import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class440 extends class34 implements class193 {

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "Lbi;")
    public class282 field6199;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "Z")
    private boolean field6197;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "Lbj;")
    public static class131 field6187 = new class131(8);

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "[I")
    public static int[] field6196 = new int[32];

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "Lbj;")
    public static class131 field6202 = new class131(5);

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "Lnq;")
    public static class268 field6203;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILuo;I)Z", line = 5)
    public final boolean method675(int arg0, int arg1, class345 arg2, int arg3) {
        ++field6184;
        class394 var5 = this.field6199.method1848(super.field533, false, 65536, arg2, false, false, super.field525);
        if (var5 == null) {
            return false;
        } else {
            class417 var6 = arg2.method84();
            var6.method702(super.field533, super.field534, super.field525);
            if (arg1 != -20759) {
                method2760(25);
            }
            return var5.method1465(arg3, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Luo;I)V", line = 26)
    public final void method677(class345 arg0, int arg1) {
        ++field6183;
        if (arg1 >= 33) {
            this.field6199.method1849(true, arg0);
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Luo;Lgm;IIIIIIIZI)V", line = 39)
    public class440(class345 arg0, class64 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        super(arg6, arg7, arg8, class243.method1650(arg2, 90, arg3));
        this.field6199 = new class282(arg0, arg1, arg2, arg3, arg4, arg5, super.field533, super.field525, arg9, arg10);
        this.field6197 = ~arg1.field922 != -1 && !arg9;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)Z", line = 49)
    public final boolean method691(byte arg0) {
        ++field6188;
        if (arg0 != -72) {
            field6187 = null;
        }
        return this.field6199.method1840(true);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZLuo;)Laj;", line = 62)
    public final class170 method681(boolean arg0, class345 arg1) {
        ++field6185;
        class394 var3 = this.field6199.method1848(super.field533, arg0, 1024, arg1, false, false, super.field525);
        if (var3 == null) {
            return null;
        } else {
            class417 var4 = arg1.method84();
            var4.method702(super.field533, super.field534, super.field525);
            class170 var5 = null;
            if (this.field6197) {
                var5 = class175.method1152((byte) 72, 1);
            }
            if (this.field6199.field3956 == null) {
                var3.method1416(var4, var5 == null ? null : var5.field2333[0], 0);
            } else {
                class77 var6 = this.field6199.field3956.method2017();
                arg1.method72(var3, var6, var4, var5 == null ? null : var5.field2333[0], 0);
            }
            this.field6199.method1850(true, -125, super.field533 >> 7, super.field525 >> 7, arg1, super.field533 >> 7, super.field525 >> 7, var3);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Luo;I)V", line = 96)
    public final void method678(class345 arg0, int arg1) {
        ++field6194;
        class394 var3 = this.field6199.method1848(super.field533, true, 131072, arg0, false, true, super.field525);
        if (var3 != null) {
            this.field6199.method1850(false, arg1 + 22827, super.field533 >> 7, super.field525 >> 7, arg0, super.field533 >> 7, super.field525 >> 7, var3);
        }
        if (arg1 != -22948) {
            this.field6199 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)Z", line = 112)
    public final boolean method683(byte arg0) {
        int var2 = 124 / ((47 - arg0) / 47);
        ++field6193;
        return false;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V", line = 122)
    public final void method680(int arg0) {
        if (arg0 == -24686) {
            ++field6201;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)I", line = 132)
    public final int method684(int arg0) {
        ++field6186;
        if (arg0 != -13726) {
            this.field6199 = null;
        }
        return this.field6199.field3987;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIB)V", line = 143)
    public static final void method2759(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field6190;
        int var5 = -116 % ((-39 - arg4) / 57);
        if (~arg1 >= ~arg2) {
            for (int var6 = arg1; var6 < arg2; ++var6) {
                class296.field4138[var6][arg0] = arg3;
            }
        } else {
            for (int var7 = arg2; ~arg1 < ~var7; ++var7) {
                class296.field4138[var7][arg0] = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V", line = 178)
    public static void method2760(int arg0) {
        if (arg0 != 27679) {
            method2760(86);
        }
        field6202 = null;
        field6187 = null;
        field6196 = null;
        field6203 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILuo;I)Lmj;", line = 199)
    public final class394 method685(int arg0, class345 arg1, int arg2) {
        if (arg2 != -9380) {
            return null;
        } else {
            ++field6200;
            return this.field6199.method1848(0, false, arg0, arg1, false, false, 0);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBIILrr;Luo;Z)V", line = 215)
    public final void method679(int arg0, byte arg1, int arg2, int arg3, class203 arg4, class345 arg5, boolean arg6) {
        if (arg1 != -126) {
            this.field6197 = true;
        }
        ++field6191;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)Ltq;", line = 226)
    public static final class376 method2761(byte arg0, int arg1) {
        ++field6192;
        class376 var2 = (class376) class131.field1854.method2637((long) arg1, arg0 ^ 18632);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (arg1 < 32768) {
                var3 = field6203.method1745(arg1, (byte) 77, 0);
            } else {
                var3 = class328.field4550.method1745(arg1 & 32767, (byte) 127, 0);
            }
            class376 var4 = new class376();
            if (arg0 != 116) {
                return null;
            } else {
                if (var3 != null) {
                    var4.method2401(new class11(var3), -1);
                }
                if (~arg1 <= -32769) {
                    var4.method2406(-59);
                }
                class131.field1854.method2633((byte) -120, var4, (long) arg1);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)I", line = 258)
    public final int method672(int arg0) {
        ++field6198;
        if (arg0 != 17011) {
            method2761((byte) -61, 70);
        }
        return this.field6199.field3993;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)I", line = 273)
    public final int method689(byte arg0) {
        ++field6189;
        if (arg0 != -83) {
            this.method691((byte) -3);
        }
        return this.field6199.field3962;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILuo;)V", line = 285)
    public final void method676(int arg0, class345 arg1) {
        this.field6199.method1843(-105, arg1);
        ++field6195;
        if (arg0 > -58) {
            field6187 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(B)V", line = 300)
    public final void method674(byte arg0) {
        ++field6182;
        if (arg0 != -1) {
            method2760(-1);
        }
        throw new IllegalStateException();
    }
}
