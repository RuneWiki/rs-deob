import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class253 extends class116 implements class503 {

    @OriginalMember(owner = "client!mv", name = "P", descriptor = "Lfr;")
    public class283 field3521;

    @OriginalMember(owner = "client!mv", name = "E", descriptor = "Z")
    private boolean field3512;

    @OriginalMember(owner = "client!mv", name = "u", descriptor = "Ldi;")
    public static class83 field3502 = new class83(35, 4);

    @OriginalMember(owner = "client!mv", name = "G", descriptor = "Ljava/lang/String;")
    public static String field3513 = null;

    @OriginalMember(owner = "client!mv", name = "s", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!mv", name = "t", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!mv", name = "v", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!mv", name = "w", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!mv", name = "x", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!mv", name = "y", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!mv", name = "z", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!mv", name = "A", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!mv", name = "B", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!mv", name = "C", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!mv", name = "D", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!mv", name = "I", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!mv", name = "J", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!mv", name = "K", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!mv", name = "M", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!mv", name = "N", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!mv", name = "O", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!mv", name = "Q", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!mv", name = "R", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!mv", name = "L", descriptor = "Lwh;")
    public static class100 field3517;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)I", line = 3)
    public final int method496(int arg0) {
        int var2 = 31 % ((-4 - arg0) / 61);
        ++field3509;
        return this.field3521.field3872;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZII)I", line = 13)
    public static final int method1517(int arg0, boolean arg1, int arg2, int arg3) {
        ++field3514;
        int var4 = arg0 & 3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else {
            if (arg1) {
                field3517 = null;
            }
            return ~var4 == -3 ? -arg3 + 1023 : arg2;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I[Ll;)V", line = 36)
    public static final void method1518(int arg0, class16[] arg1) {
        class382.field5582 = arg1.length;
        ++field3507;
        class383.field5592 = new int[class382.field5582 - arg0];
        class150.field2264 = new class16[class382.field5582 + 10];
        class91.method679(arg1, 0, class150.field2264, 0, class382.field5582);
        for (int var2 = 0; class382.field5582 > var2; ++var2) {
            class383.field5592[var2] = class150.field2264[var2].method93();
        }
        for (int var3 = class382.field5582; var3 < class150.field2264.length; ++var3) {
            class383.field5592[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILya;)V", line = 61)
    public final void method482(int arg0, class38 arg1) {
        if (arg0 >= -56) {
            field3502 = null;
        }
        this.field3521.method1688((byte) -121, arg1);
        ++field3518;
    }

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "(I)Z", line = 78)
    public final boolean method492(int arg0) {
        if (arg0 != -1) {
            this.method486(38, (class38) null);
        }
        ++field3511;
        return false;
    }

    @OriginalMember(owner = "client!mv", name = "j", descriptor = "(I)V", line = 89)
    public static void method1519(int arg0) {
        field3513 = null;
        if (arg0 != -19585) {
            method1517(-66, true, -72, 18);
        }
        field3502 = null;
        field3517 = null;
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)V", line = 101)
    public final void method485(int arg0) {
        if (arg0 < -92) {
            ++field3500;
        }
    }

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "(I)I", line = 111)
    public final int method499(int arg0) {
        if (arg0 != -15561) {
            field3502 = null;
        }
        ++field3519;
        return this.field3521.field3891;
    }

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "(ILya;)V", line = 124)
    public final void method493(int arg0, class38 arg1) {
        ++field3508;
        if (arg0 >= -114) {
            this.method482(-109, (class38) null);
        }
        class471 var3 = this.field3521.method1687((byte) 56, true, true, super.field1732, super.field1735, arg1, 262144);
        if (var3 != null) {
            this.field3521.method1681(false, super.field1742, arg1, super.field1736, super.field1729, super.field1730, var3, (byte) 72);
        }
    }

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "(I)Z", line = 140)
    public final boolean method489(int arg0) {
        int var2 = -65 % ((arg0 - 23) / 62);
        ++field3504;
        return this.field3521.method1680(-1);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lya;B)Lmf;", line = 155)
    public final class289 method484(class38 arg0, byte arg1) {
        ++field3506;
        class471 var3 = this.field3521.method1687((byte) 56, true, false, super.field1732, super.field1735, arg0, 2048);
        if (var3 == null) {
            return null;
        } else {
            class122 var4 = arg0.method280();
            var4.method182(super.field1732, super.field1734, super.field1735);
            class289 var5 = null;
            if (this.field3512) {
                var5 = class165.method1099(true, 1);
            }
            if (this.field3521.field3874 != null) {
                class523 var6 = this.field3521.field3874.method1193();
                arg0.method312(var3, var6, var4, var5 != null ? var5.field4009[0] : null, 0);
            } else {
                var3.method397(var4, var5 == null ? null : var5.field4009[0], 0);
            }
            this.field3521.method1681(true, super.field1742, arg0, super.field1736, super.field1729, super.field1730, var3, (byte) 72);
            if (arg1 < 111) {
                this.field3521 = null;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BLsk;)V", line = 197)
    public static final void method1520(byte arg0, class438 arg1) {
        if (arg0 >= -25) {
            field3517 = null;
        }
        ++field3522;
        class365 var2 = (class365) class315.field4315.method1492((long) arg1.field1035, 6340);
        if (var2 != null) {
            var2.method2199((byte) 65);
        } else {
            class226.method1401(arg1.field1127[0], (class220) null, arg1.field1117[0], 0, 127, arg1, arg1.field1738, (class502) null);
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lya;IZLij;III)V", line = 216)
    public final void method498(class38 arg0, int arg1, boolean arg2, class291 arg3, int arg4, int arg5, int arg6) {
        ++field3510;
        if (arg6 != -1) {
            field3517 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "(I)V", line = 228)
    public final void method495(int arg0) {
        ++field3515;
        if (arg0 <= -104) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BLya;I)Lt;", line = 245)
    public final class471 method488(byte arg0, class38 arg1, int arg2) {
        if (arg0 != 124) {
            field3523 = 76;
        }
        ++field3505;
        return this.field3521.method1687((byte) 56, false, false, 0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZILya;I)Z", line = 257)
    public final boolean method500(boolean arg0, int arg1, class38 arg2, int arg3) {
        ++field3520;
        class471 var5 = this.field3521.method1687((byte) 56, false, false, super.field1732, super.field1735, arg2, 131072);
        if (var5 == null) {
            return false;
        } else {
            if (!arg0) {
                this.method500(false, -126, (class38) null, -15);
            }
            class122 var6 = arg2.method280();
            var6.method182(super.field1732, super.field1734, super.field1735);
            return var5.method391(arg3, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lya;Ljo;IIIIIZIIIIIII)V", line = 277)
    public class253(class38 arg0, class220 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field3086 == 1, class325.method1879(arg13, true, arg12));
        this.field3521 = new class283(arg0, arg1, arg12, arg13, super.field1738, arg3, arg4, arg6, arg7, arg14);
        this.field3512 = ~arg1.field3119 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(Z)I", line = 288)
    public final int method792(boolean arg0) {
        ++field3516;
        if (!arg0) {
            this.method499(15);
        }
        return this.field3521.method1684(4);
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(ILya;)V", line = 299)
    public final void method486(int arg0, class38 arg1) {
        ++field3501;
        if (arg0 != 9229) {
            this.field3521 = null;
        }
        this.field3521.method1679((byte) -111, arg1);
    }

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)I", line = 312)
    public final int method490(int arg0) {
        if (arg0 != -29679) {
            this.method482(70, (class38) null);
        }
        ++field3503;
        return this.field3521.field3887;
    }
}
