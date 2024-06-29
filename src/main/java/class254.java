import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class254 extends class394 implements class9 {

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "Lee;")
    public class404 field3661;

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "Z")
    private boolean field3669;

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "Z")
    public static boolean field3656 = true;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "Llg;")
    public static class237 field3653 = new class237(64);

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "Z")
    public static boolean field3664 = false;

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "Lgj;")
    public static class381 field3668;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "[I")
    public static int[] field3657;

    static {
        new class362("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field3670 = 0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZBIILna;ILae;)V", line = 4)
    public final void method60(boolean arg0, byte arg1, int arg2, int arg3, class29 arg4, int arg5, class134 arg6) {
        ++field3644;
        int var8 = 66 % ((-16 - arg1) / 62);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ltq;ZLtq;)V", line = 16)
    public static final void method1713(class376 arg0, boolean arg1, class376 arg2) {
        class420.field6004 = arg2;
        class203.field2919 = arg0;
        ++field3666;
        if (arg1) {
            field3656 = false;
        }
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)V", line = 29)
    public final void method51(int arg0) {
        ++field3645;
        if (arg0 == 6) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)I", line = 40)
    public final int method71(byte arg0) {
        ++field3660;
        return arg0 >= -36 ? -109 : this.field3661.field5820;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lae;B)V", line = 52)
    public final void method64(class134 arg0, byte arg1) {
        ++field3667;
        if (arg1 >= -50) {
            field3668 = null;
        }
        class210 var3 = this.field3661.method2576(-12, true, 131072, arg0, super.field5566, true, super.field5555);
        if (var3 != null) {
            this.field3661.method2577(16287, super.field5566 >> 7, super.field5555 >> 7, super.field5566 >> 7, false, arg0, var3, super.field5555 >> 7);
        }
    }

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "(I)V", line = 68)
    public static void method1714(int arg0) {
        if (arg0 != 8888) {
            method1717(-14, 43, 78, -43);
        }
        field3657 = null;
        field3653 = null;
        field3668 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLae;)Ljg;", line = 80)
    public final class186 method52(byte arg0, class134 arg1) {
        ++field3646;
        class210 var3 = this.field3661.method2576(-12, false, 1024, arg1, super.field5566, true, super.field5555);
        if (arg0 != -120) {
            field3656 = false;
        }
        if (var3 == null) {
            return null;
        } else {
            class18 var4 = arg1.method649();
            var4.method116(super.field5555, super.field5554, super.field5566);
            class186 var5 = null;
            if (this.field3669) {
                var5 = class348.method2229(1, 21534);
            }
            if (this.field3661.field5836 == null) {
                var3.method1416(var4, var5 == null ? null : var5.field2704[0], 0);
            } else {
                class63 var6 = this.field3661.field5836.method1371();
                arg1.method588(var3, var6, var4, var5 != null ? var5.field2704[0] : null, 0);
            }
            this.field3661.method2577(16287, super.field5566 >> 7, super.field5555 >> 7, super.field5566 >> 7, true, arg1, var3, super.field5555 >> 7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILae;)V", line = 118)
    public final void method72(int arg0, class134 arg1) {
        ++field3663;
        int var3 = 52 % (arg0 / 55);
        this.field3661.method2585(arg1, (byte) -112);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIZIILtq;)V", line = 130)
    public static final void method1715(int arg0, int arg1, boolean arg2, int arg3, int arg4, class376 arg5) {
        class362.field5168 = arg5;
        if (arg0 != 0) {
            method1714(-114);
        }
        class295.field4117 = arg2;
        ++field3647;
        class128.field1558 = 10000;
        class383.field5407 = 1;
        class311.field4393 = arg1;
        class367.field5205 = arg4;
        class193.field2793 = arg3;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lae;ZI)Lbk;", line = 154)
    public final class210 method70(class134 arg0, boolean arg1, int arg2) {
        ++field3652;
        if (!arg1) {
            field3656 = false;
        }
        return this.field3661.method2576(-12, false, arg2, arg0, 0, false, 0);
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)I", line = 166)
    public final int method68(int arg0) {
        ++field3648;
        if (arg0 < 118) {
            this.method51(60);
        }
        return this.field3661.field5835;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 177)
    public final void method65(int arg0) {
        ++field3650;
        if (arg0 != 17184) {
            field3656 = false;
        }
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)I", line = 187)
    public final int method69(int arg0) {
        if (arg0 != -5944) {
            this.method69(66);
        }
        ++field3658;
        return this.field3661.field5804;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIII)V", line = 200)
    public static final void method1716(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        if (arg3 <= -96) {
            while (~class421.field6017 < ~var5) {
                Rectangle var6 = class130.field1584[var5];
                if (arg2 < var6.x + var6.width && ~var6.x > ~(arg0 + arg2) && ~arg4 > ~(var6.y + var6.height) && arg4 - -arg1 > var6.y) {
                    class418.field5974[var5] = true;
                }
                ++var5;
            }
            ++field3654;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILae;II)Z", line = 226)
    public final boolean method56(int arg0, class134 arg1, int arg2, int arg3) {
        ++field3659;
        class210 var5 = this.field3661.method2576(-12, false, 65536, arg1, super.field5566, false, super.field5555);
        if (var5 == null) {
            return false;
        } else {
            class18 var6 = arg1.method649();
            var6.method116(super.field5555, super.field5554, super.field5566);
            if (arg2 != 4835) {
                this.method64((class134) null, (byte) 70);
            }
            return var5.method1382(arg0, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lae;I)V", line = 246)
    public final void method66(class134 arg0, int arg1) {
        this.field3661.method2572(2, arg0);
        ++field3649;
        if (arg1 != 4257) {
            this.field3661 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)Z", line = 257)
    public final boolean method54(boolean arg0) {
        if (!arg0) {
            this.method65(115);
        }
        ++field3651;
        return false;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lae;Ljh;IIIIIIIZI)V", line = 279)
    public class254(class134 arg0, class88 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        super(arg6, arg7, arg8, class272.method1795(arg3, -28849, arg2));
        this.field3661 = new class404(arg0, arg1, arg2, arg3, arg4, arg5, super.field5555, super.field5566, arg9, arg10);
        this.field3669 = ~arg1.field998 != -1 && !arg9;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII)V", line = 293)
    public static final void method1717(int arg0, int arg1, int arg2, int arg3) {
        ++field3662;
        if (class250.field3570 != null) {
            long var4 = (long) (arg1 << 14 | arg2 << 28 | arg0);
            class282 var6 = (class282) class330.field4663.method1888(var4, (byte) -30);
            if (var6 == null) {
                class310.method2049(arg2, arg0, arg1);
            } else {
                class89 var7 = (class89) var6.field3989.method506((byte) -128);
                if (var7 == null) {
                    class310.method2049(arg2, arg0, arg1);
                } else {
                    class35 var8 = (class35) class310.method2049(arg2, arg0, arg1);
                    if (var8 != null) {
                        var8.field395 = var8.field394 = -1;
                    } else {
                        var8 = new class35();
                    }
                    var8.field399 = var7.field1084;
                    var8.field398 = var7.field1085;
                    label48: while (true) {
                        class89 var9 = (class89) var6.field3989.method514(true);
                        if (var9 == null) {
                            break;
                        }
                        if (var8.field399 != var9.field1084) {
                            var8.field404 = var9.field1085;
                            var8.field395 = var9.field1084;
                            while (true) {
                                class89 var10 = (class89) var6.field3989.method514(true);
                                if (var10 == null) {
                                    break label48;
                                }
                                if (~var8.field399 != ~var10.field1084 && var8.field395 != var10.field1084) {
                                    var8.field394 = var10.field1084;
                                    var8.field407 = var10.field1085;
                                }
                            }
                        }
                    }
                    if (arg3 != 1) {
                        method1714(-91);
                    }
                    int var11 = class114.method709(arg2, (arg0 << 7) - -64, 0, (arg1 << 7) + 64);
                    class246.method1671(arg2, arg0, arg1, var11, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)Z", line = 368)
    public final boolean method67(int arg0) {
        ++field3655;
        if (arg0 != -3673) {
            field3653 = null;
        }
        return this.field3661.method2587(-114);
    }
}
