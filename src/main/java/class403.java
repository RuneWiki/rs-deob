import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class403 extends class233 implements class9 {

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "Lee;")
    public class404 field5774;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "Z")
    private boolean field5778;

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "S")
    public static short field5779 = 1;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    public static int field5780 = -1;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field5769 = new String[200];

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!fb", name = "Y", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!fb", name = "Z", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!fb", name = "ab", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!fb", name = "bb", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!fb", name = "cb", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!fb", name = "db", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "Lts;")
    public static class315 field5788;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)I")
    public final int method71(byte arg0) {
        ++field5782;
        return arg0 > -36 ? 123 : this.field5774.field5820;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ltq;I)V")
    public static final void method2567(class376 arg0, int arg1) {
        if (arg1 == -24928) {
            class405.field5847 = arg0;
            ++field5784;
            class50.field593 = class405.field5847.method2415(4, (byte) 56);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILae;)V")
    public final void method72(int arg0, class134 arg1) {
        int var3 = -98 / (arg0 / 55);
        this.field5774.method2585(arg1, (byte) -123);
        ++field5783;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lae;I)V")
    public final void method66(class134 arg0, int arg1) {
        ++field5775;
        this.field5774.method2572(2, arg0);
        if (arg1 != 4257) {
            this.method70((class134) null, false, -83);
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)I")
    public final int method68(int arg0) {
        ++field5773;
        return arg0 < 118 ? -26 : this.field5774.field5835;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lae;ZI)Lbk;")
    public final class210 method70(class134 arg0, boolean arg1, int arg2) {
        ++field5790;
        if (!arg1) {
            this.method72(-58, (class134) null);
        }
        return this.field5774.method2576(-12, false, arg2, arg0, 0, false, 0);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)Lsr;")
    public static final class135 method2568(int arg0, byte arg1) {
        ++field5792;
        class237 var2 = class50.field595;
        class135 var3;
        synchronized (class50.field595) {
            var3 = (class135) class50.field595.method1625((long) arg0, 0);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class281.field3980.method2431((byte) 108, class149.method899(-8648, arg0), class255.method1721(127, arg0));
            class135 var5 = new class135();
            var5.field1635 = arg0;
            int var6 = 9 % ((-41 - arg1) / 39);
            if (var4 != null) {
                var5.method844(137, new class236(var4));
            }
            var5.method843(0);
            class237 var7 = class50.field595;
            synchronized (class50.field595) {
                class50.field595.method1622((byte) 13, var5, (long) arg0);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)Z")
    public final boolean method67(int arg0) {
        ++field5781;
        if (arg0 != -3673) {
            field5769 = null;
        }
        return this.field5774.method2587(arg0 ^ -3624);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZBIILna;ILae;)V")
    public final void method60(boolean arg0, byte arg1, int arg2, int arg3, class29 arg4, int arg5, class134 arg6) {
        int var8 = 70 % ((-16 - arg1) / 62);
        ++field5786;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)I")
    public final int method69(int arg0) {
        if (arg0 != -5944) {
            return -99;
        } else {
            ++field5771;
            return this.field5774.field5804;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lae;B)V")
    public final void method64(class134 arg0, byte arg1) {
        ++field5770;
        if (arg1 > -50) {
            this.method68(-77);
        }
        class210 var3 = this.field5774.method2576(-12, true, 131072, arg0, super.field3269, true, super.field3284);
        if (var3 != null) {
            this.field5774.method2577(16287, super.field3267, super.field3275, super.field3271, false, arg0, var3, super.field3268);
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lae;Ljh;IIIIIIIZIIIII)V")
    public class403(class134 arg0, class88 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg1.field1031 == 1, class250.method1698(arg3, 2, arg2));
        this.field5774 = new class404(arg0, arg1, arg2, arg3, super.field3285, arg5, arg6, arg8, arg9, arg14);
        this.field5778 = ~arg1.field998 != -1 && !arg9;
    }

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "(I)V")
    public static final void method2569(int arg0) {
        ++field5772;
        ++class215.field3040;
        class62.field718.method2143(arg0, -2);
        class62.field718.method1583(0, (byte) -96);
    }

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "(I)V")
    public static void method2570(int arg0) {
        field5769 = null;
        if (arg0 < 2) {
            method2568(40, (byte) 55);
        }
        field5788 = null;
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V")
    public final void method51(int arg0) {
        if (arg0 == 6) {
            ++field5789;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "(I)I")
    public final int method61(int arg0) {
        ++field5776;
        return arg0 != 131910471 ? -5 : this.field5774.method2578(-62);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLae;)Ljg;")
    public final class186 method52(byte arg0, class134 arg1) {
        ++field5777;
        class210 var3 = this.field5774.method2576(-12, false, 1024, arg1, super.field3269, true, super.field3284);
        if (var3 == null) {
            return null;
        } else if (arg0 != -120) {
            return null;
        } else {
            class18 var4 = arg1.method649();
            var4.method116(super.field3284, super.field3287, super.field3269);
            class186 var5 = null;
            if (this.field5778) {
                var5 = class348.method2229(1, arg0 + 21654);
            }
            if (this.field5774.field5836 != null) {
                class63 var6 = this.field5774.field5836.method1371();
                arg1.method588(var3, var6, var4, var5 == null ? null : var5.field2704[0], 0);
            } else {
                var3.method1416(var4, var5 == null ? null : var5.field2704[0], 0);
            }
            this.field5774.method2577(16287, super.field3267, super.field3275, super.field3271, true, arg1, var3, super.field3268);
            return var5;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public final void method65(int arg0) {
        if (arg0 != 17184) {
            field5769 = null;
        }
        ++field5791;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)Z")
    public final boolean method54(boolean arg0) {
        ++field5785;
        if (!arg0) {
            this.method61(-10);
        }
        return false;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILae;II)Z")
    public final boolean method56(int arg0, class134 arg1, int arg2, int arg3) {
        if (arg2 != 4835) {
            this.field5778 = false;
        }
        ++field5793;
        class210 var5 = this.field5774.method2576(arg2 ^ -4841, false, 65536, arg1, super.field3269, false, super.field3284);
        if (var5 == null) {
            return false;
        } else {
            class18 var6 = arg1.method649();
            var6.method116(super.field3284, super.field3287, super.field3269);
            return var5.method1382(arg0, arg3, var6, false);
        }
    }

    static {
        new class362("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
    }
}
