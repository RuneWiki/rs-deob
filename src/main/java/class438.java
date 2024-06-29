import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class438 extends class436 implements class265 {

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "Lth;")
    public class354 field6429;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "Z")
    private boolean field6430;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "Z")
    public static boolean field6421 = false;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    public static int field6424 = -1;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Len;I)V", line = 3)
    public final void method211(class174 arg0, int arg1) {
        ++field6414;
        if (arg1 == 0) {
            class393 var3 = this.field6429.method2261(super.field6391, true, arg0, true, super.field6390, (byte) -124, 131072);
            if (var3 != null) {
                this.field6429.method2258(super.field6390 >> 7, super.field6390 >> 7, super.field6391 >> 7, false, (byte) 125, arg0, super.field6391 >> 7, var3);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILen;)Lir;", line = 19)
    public final class19 method213(int arg0, class174 arg1) {
        ++field6418;
        class393 var3 = this.field6429.method2261(super.field6391, true, arg1, false, super.field6390, (byte) -125, 1024);
        if (var3 == null) {
            return null;
        } else {
            class71 var4 = arg1.method1015();
            var4.method123(super.field6390, super.field6386, super.field6391);
            class19 var5 = null;
            if (this.field6430) {
                var5 = class358.method2286(true, 1);
            }
            if (arg0 > -5) {
                this.field6429 = null;
            }
            if (this.field6429.field5163 != null) {
                class271 var6 = this.field6429.field5163.method2492();
                arg1.method964(var3, var6, var4, var5 != null ? var5.field197[0] : null, 0);
            } else {
                var3.method775(var4, var5 == null ? null : var5.field197[0], 0);
            }
            this.field6429.method2258(super.field6390 >> 7, super.field6390 >> 7, super.field6391 >> 7, true, (byte) 126, arg1, super.field6391 >> 7, var3);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Z", line = 60)
    public final boolean method215(int arg0) {
        ++field6415;
        if (arg0 >= -92) {
            this.method206(56, (class174) null, -20, (byte) 35, (class330) null, -100, true);
        }
        return this.field6429.method2259(58);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIZLen;)Z", line = 74)
    public final boolean method208(int arg0, int arg1, boolean arg2, class174 arg3) {
        if (!arg2) {
            field6423 = 73;
        }
        ++field6416;
        class393 var5 = this.field6429.method2261(super.field6391, false, arg3, false, super.field6390, (byte) -127, 65536);
        if (var5 == null) {
            return false;
        } else {
            class71 var6 = arg3.method1015();
            var6.method123(super.field6390, super.field6386, super.field6391);
            return var5.method724(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V", line = 94)
    public final void method224(int arg0) {
        ++field6422;
        int var2 = -28 / ((52 - arg0) / 46);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLen;)V", line = 106)
    public final void method212(byte arg0, class174 arg1) {
        if (arg0 < -29) {
            ++field6420;
            this.field6429.method2253(false, arg1);
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Len;Lnl;IIIIIIIZI)V", line = 120)
    public class438(class174 arg0, class327 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        super(arg6, arg7, arg8, class19.method135(arg2, arg3, (byte) 127));
        this.field6429 = new class354(arg0, arg1, arg2, arg3, arg4, arg5, super.field6390, super.field6391, arg9, arg10);
        this.field6430 = ~arg1.field4677 != -1;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)I", line = 131)
    public final int method225(int arg0) {
        ++field6417;
        if (arg0 < 66) {
            field6424 = -34;
        }
        return this.field6429.field5180;
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)I", line = 152)
    public final int method210(int arg0) {
        if (arg0 != -23890) {
            this.method212((byte) 113, (class174) null);
        }
        ++field6419;
        return this.field6429.field5178;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V", line = 166)
    public final void method207(byte arg0) {
        ++field6431;
        if (arg0 != 111) {
            field6424 = 114;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILen;IBLfs;IZ)V", line = 176)
    public final void method206(int arg0, class174 arg1, int arg2, byte arg3, class330 arg4, int arg5, boolean arg6) {
        if (arg3 != -42) {
            this.field6430 = true;
        }
        ++field6427;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)I", line = 187)
    public final int method214(int arg0) {
        if (arg0 > -95) {
            field6421 = false;
        }
        ++field6428;
        return this.field6429.field5174;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BILen;)Lmj;", line = 198)
    public final class393 method209(byte arg0, int arg1, class174 arg2) {
        if (arg0 != 58) {
            return null;
        } else {
            ++field6425;
            return this.field6429.method2261(0, false, arg2, false, 0, (byte) -113, arg1);
        }
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)Z", line = 210)
    public final boolean method217(int arg0) {
        int var2 = -127 / ((arg0 - -60) / 37);
        ++field6426;
        return false;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Len;B)V", line = 221)
    public final void method226(class174 arg0, byte arg1) {
        if (arg1 > 88) {
            this.field6429.method2257(arg0, -29617);
            ++field6413;
        }
    }
}
