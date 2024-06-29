import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class476 extends class237 implements class620 {

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "B")
    private byte field6195;

    @OriginalMember(owner = "client!qn", name = "Q", descriptor = "B")
    private byte field6207;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "Z")
    private boolean field6189;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "S")
    private short field6191;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "B")
    private byte field6197;

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "Z")
    private boolean field6202;

    @OriginalMember(owner = "client!qn", name = "E", descriptor = "Z")
    private boolean field6196;

    @OriginalMember(owner = "client!qn", name = "N", descriptor = "Lba;")
    private class107 field6205;

    @OriginalMember(owner = "client!qn", name = "I", descriptor = "Lw;")
    private class605 field6200;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!qn", name = "L", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!qn", name = "P", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!qn", name = "R", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!qn", name = "S", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!qn", name = "T", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!qn", name = "U", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!qn", name = "V", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!qn", name = "M", descriptor = "Lah;")
    public static class249 field6204;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "Lcd;")
    private class564 field6187;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "Ljava/lang/Thread;")
    public static Thread field6190;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILoa;I)Z", line = 3)
    public final boolean method74(int arg0, int arg1, class43 arg2, int arg3) {
        ++field6201;
        if (arg3 > -98) {
            this.method72((class43) null, 61);
        }
        class107 var5 = this.method2627(arg2, -80, 131072);
        if (var5 != null) {
            class151 var6 = arg2.method402();
            var6.method146(super.field3195, super.field3187, super.field3186);
            return var5.method832(arg1, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)V", line = 26)
    public static void method2626(boolean arg0) {
        if (!arg0) {
            method2626(false);
        }
        field6204 = null;
        field6190 = null;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Loa;II)Lba;", line = 38)
    private final class107 method2627(class43 arg0, int arg1, int arg2) {
        ++field6208;
        if (this.field6205 != null && arg0.method377(this.field6205.method796(), arg2) == 0) {
            return this.field6205;
        } else if (arg1 >= -63) {
            return null;
        } else {
            class390 var4 = this.method2628(false, arg0, 10659, arg2);
            return var4 != null ? var4.field4994 : null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)I", line = 59)
    public final int method76(byte arg0) {
        if (arg0 > -92) {
            this.field6195 = 44;
        }
        ++field6211;
        return this.field6191 & 65535;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZLoa;II)Lid;", line = 70)
    private final class390 method2628(boolean arg0, class43 arg1, int arg2, int arg3) {
        ++field6198;
        if (arg2 != 10659) {
            field6204 = null;
        }
        class698 var5 = class348.field4436.method1900(89, 65535 & this.field6191);
        class88 var6;
        class88 var7;
        if (this.field6189) {
            var6 = class353.field4540[0];
            var7 = class477.field6327[this.field6195];
        } else {
            var7 = class353.field4540[this.field6195];
            if (~this.field6195 > -4) {
                var6 = class353.field4540[this.field6195 + 1];
            } else {
                var6 = null;
            }
        }
        return var5.method3811(arg0, var7, super.field3186, super.field3187, this.field6197, this.field6207, arg1, arg3, var6, arg2 + -10733, super.field3195);
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Loa;I)V", line = 100)
    public final void method65(class43 arg0, int arg1) {
        ++field6185;
        if (arg1 <= -121) {
            Object var3 = null;
            class605 var5;
            if (this.field6200 == null && this.field6196) {
                class390 var4 = this.method2628(true, arg0, 10659, 262144);
                var5 = var4 == null ? null : var4.field4995;
            } else {
                var5 = this.field6200;
                this.field6200 = null;
            }
            if (var5 != null) {
                class567.method3035(var5, this.field6195, super.field3195, super.field3186, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V", line = 129)
    public final void method64(byte arg0) {
        ++field6209;
        int var2 = 52 % ((-71 - arg0) / 39);
        if (this.field6205 != null) {
            this.field6205.method818();
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)I", line = 142)
    public final int method70(boolean arg0) {
        if (!arg0) {
            this.field6202 = true;
        }
        ++field6193;
        return this.field6207;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Loa;II)Lba;", line = 154)
    public final class107 method63(class43 arg0, int arg1, int arg2) {
        ++field6194;
        if (arg2 != 25871) {
            this.field6202 = false;
        }
        return this.method2627(arg0, -114, arg1);
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(Loa;I)Lcd;", line = 174)
    public final class564 method72(class43 arg0, int arg1) {
        ++field6188;
        if (arg1 != 21098) {
            return null;
        } else {
            if (this.field6187 == null) {
                this.field6187 = class240.method1519(super.field3187, this.method2627(arg0, arg1 + -21174, 0), super.field3195, 1, super.field3186);
            }
            return this.field6187;
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Loa;Lsa;IIIIZIIIII)V", line = 200)
    public class476(class43 arg0, class698 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class220.method1401(arg10, arg11, -13185));
        super.field3195 = arg3;
        this.field6195 = (byte) arg2;
        this.field6207 = (byte) arg11;
        this.field6189 = arg6;
        super.field3186 = arg5;
        this.field6191 = (short) arg1.field9625;
        this.field6197 = (byte) arg10;
        this.field6202 = ~arg1.field9660 != -1 && !arg6;
        this.field6196 = arg0.method389() && arg1.field9591 && !this.field6189 && class260.field3509.method733(class364.field4697, (byte) -97) != 0;
        class390 var13 = this.method2628(this.field6196, arg0, 10659, 2048);
        if (var13 != null) {
            this.field6205 = var13.field4994;
            this.field6200 = var13.field4995;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Loa;B)Lpl;", line = 224)
    public final class215 method71(class43 arg0, byte arg1) {
        ++field6210;
        if (this.field6205 == null) {
            return null;
        } else {
            int var3 = 117 / ((12 - arg1) / 41);
            class151 var4 = arg0.method402();
            var4.method146(super.field3195 + super.field3189, super.field3187, super.field3199 + super.field3186);
            class215 var5 = null;
            if (this.field6202) {
                var5 = class207.method1331(true, 1);
            }
            this.field6205.method827(var4, var5 != null ? var5.field2770[0] : null, 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Loa;I)V", line = 248)
    public final void method62(class43 arg0, int arg1) {
        ++field6206;
        if (arg1 == 6526) {
            Object var3 = null;
            class605 var5;
            if (this.field6200 == null && this.field6196) {
                class390 var4 = this.method2628(true, arg0, 10659, 262144);
                var5 = var4 == null ? null : var4.field4995;
            } else {
                var5 = this.field6200;
                this.field6200 = null;
            }
            if (var5 != null) {
                class183.method1230(var5, this.field6195, super.field3195, super.field3186, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)I", line = 278)
    public final int method1497(int arg0) {
        int var2 = -71 / ((33 - arg0) / 53);
        ++field6199;
        return this.field6205 != null ? this.field6205.method816() : 0;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(B)I", line = 288)
    public final int method66(byte arg0) {
        ++field6203;
        if (arg0 != -42) {
            field6190 = null;
        }
        return this.field6197;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)Z", line = 299)
    public final boolean method75(int arg0) {
        ++field6186;
        int var2 = 117 / ((26 - arg0) / 38);
        return this.field6196;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(Loa;I)V", line = 310)
    public final void method67(class43 arg0, int arg1) {
        ++field6192;
        if (arg1 != 2) {
            this.field6200 = null;
        }
    }
}
