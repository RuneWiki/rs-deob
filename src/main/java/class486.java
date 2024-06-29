import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class486 extends class327 implements class381 {

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "Z")
    private boolean field6714;

    @OriginalMember(owner = "client!kr", name = "A", descriptor = "Z")
    private boolean field6720;

    @OriginalMember(owner = "client!kr", name = "N", descriptor = "B")
    private byte field6732;

    @OriginalMember(owner = "client!kr", name = "w", descriptor = "B")
    private byte field6716;

    @OriginalMember(owner = "client!kr", name = "C", descriptor = "B")
    private byte field6722;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "S")
    private short field6711;

    @OriginalMember(owner = "client!kr", name = "y", descriptor = "Z")
    private boolean field6718;

    @OriginalMember(owner = "client!kr", name = "E", descriptor = "Z")
    private boolean field6724;

    @OriginalMember(owner = "client!kr", name = "R", descriptor = "Lgn;")
    public class456 field6736;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "Lkb;")
    private class449 field6712;

    @OriginalMember(owner = "client!kr", name = "H", descriptor = "[I")
    public static int[] field6727 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!kr", name = "x", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!kr", name = "B", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!kr", name = "D", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!kr", name = "G", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!kr", name = "I", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!kr", name = "J", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!kr", name = "L", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!kr", name = "M", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!kr", name = "O", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!kr", name = "P", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!kr", name = "Q", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!kr", name = "S", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!kr", name = "F", descriptor = "Lr;")
    public static class110 field6725;

    static {
        new class206("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V", line = 5)
    public final void method1(int arg0) {
        if (arg0 > -105) {
            this.method15(-3, (class364) null, -42);
        }
        if (this.field6736 != null) {
            this.field6736.method1843();
        }
        ++field6726;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIILwm;ZLhp;Z)V", line = 19)
    public final void method2(int arg0, int arg1, int arg2, class364 arg3, boolean arg4, class197 arg5, boolean arg6) {
        ++field6729;
        if (!(arg5 instanceof class486)) {
            if (arg5 instanceof class476) {
                class476 var8 = (class476) arg5;
                if (this.field6736 != null && var8.field6567 != null) {
                    this.field6736.method1869(var8.field6567, arg0, arg2, arg1, arg4);
                }
            }
        } else {
            class486 var9 = (class486) arg5;
            if (this.field6736 != null && var9.field6736 != null) {
                this.field6736.method1869(var9.field6736, arg0, arg2, arg1, arg4);
            }
        }
        if (!arg6) {
            field6725 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 49)
    public static final void method2819(String arg0, byte arg1) {
        ++field6733;
        if (arg1 <= 117) {
            field6727 = null;
        }
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lwm;I)V", line = 62)
    public final void method16(class364 arg0, int arg1) {
        ++field6719;
        Object var3 = null;
        class449 var5;
        if (this.field6712 == null && this.field6724) {
            class266 var4 = this.method2824(131072, false, arg0, true);
            var5 = var4 == null ? null : var4.field3512;
        } else {
            var5 = this.field6712;
            this.field6712 = null;
        }
        if (arg1 == 31591) {
            if (var5 != null) {
                class318.method1742(var5, this.field6716, super.field4364, super.field4362, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)Z", line = 89)
    public final boolean method7(boolean arg0) {
        ++field6731;
        return arg0 ? false : this.field6724;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 101)
    public static final void method2820(int arg0, int arg1, int arg2, Class arg3) {
        class491 var4 = class289.field3897[arg0][arg1][arg2];
        if (var4 != null) {
            for (class309 var5 = var4.field6845; var5 != null; var5 = var5.field4084) {
                class471 var6 = var5.field4091;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field6500 == arg1 && var6.field6491 == arg2) {
                    class401.method2429(var6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BLwm;)V", line = 127)
    public final void method12(byte arg0, class364 arg1) {
        ++field6734;
        if (arg0 <= 27) {
            this.field6722 = 119;
        }
        Object var3 = null;
        class449 var5;
        if (this.field6712 == null && this.field6724) {
            class266 var4 = this.method2824(131072, false, arg1, true);
            var5 = var4 != null ? var4.field3512 : null;
        } else {
            var5 = this.field6712;
            this.field6712 = null;
        }
        if (var5 != null) {
            class252.method1412(var5, this.field6716, super.field4364, super.field4362, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IILwm;)Lgn;", line = 155)
    private final class456 method2821(int arg0, int arg1, class364 arg2) {
        int var4 = -51 % ((16 - arg1) / 56);
        ++field6737;
        if (this.field6736 != null && ~arg2.method2103(this.field6736.method1863(), arg0) == -1) {
            return this.field6736;
        } else {
            class266 var5 = this.method2824(arg0, false, arg2, false);
            return var5 == null ? null : var5.field3514;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lwm;B)V", line = 176)
    public final void method10(class364 arg0, byte arg1) {
        ++field6728;
        if (arg1 > -48) {
            this.field6724 = true;
        }
    }

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "(I)Z", line = 189)
    public final boolean method17(int arg0) {
        ++field6730;
        if (arg0 != 7) {
            this.field6714 = false;
        }
        return this.field6720;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "([SZII[Ljava/lang/String;)V", line = 200)
    public static final void method2822(short[] arg0, boolean arg1, int arg2, int arg3, String[] arg4) {
        ++field6713;
        if (~arg3 < ~arg2) {
            int var5 = (arg2 - -arg3) / 2;
            int var6 = arg2;
            String var7 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var7;
            short var8 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var8;
            for (int var9 = arg2; ~var9 > ~arg3; ++var9) {
                if (var7 == null || arg4[var9] != null && arg4[var9].compareTo(var7) < (1 & var9)) {
                    String var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg4[arg3] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var8;
            method2822(arg0, true, arg2, var6 + -1, arg4);
            method2822(arg0, arg1, var6 + 1, arg3, arg4);
        }
        if (!arg1) {
            field6727 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIBLwm;)Z", line = 256)
    public final boolean method14(int arg0, int arg1, byte arg2, class364 arg3) {
        if (arg2 > -107) {
            this.field6712 = null;
        }
        ++field6735;
        class456 var5 = this.method2821(65536, -49, arg3);
        if (var5 != null) {
            class203 var6 = arg3.method1960();
            var6.method1029(super.field4364, super.field4361, super.field4362);
            return var5.method1882(arg0, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)I", line = 278)
    public final int method13(int arg0) {
        ++field6721;
        if (arg0 < 51) {
            this.field6736 = null;
        }
        return 65535 & this.field6711;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lwm;Lct;IIIIZIIZ)V", line = 293)
    public class486(class364 arg0, class88 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class152.method899(-101, arg7, arg8));
        this.field6714 = arg1.field1265 != 0 && !arg6;
        this.field6720 = arg9;
        this.field6732 = (byte) arg7;
        super.field4364 = (short) arg3;
        this.field6716 = (byte) arg2;
        this.field6722 = (byte) arg8;
        super.field4362 = (short) arg5;
        this.field6711 = (short) arg1.field1298;
        this.field6718 = arg6;
        this.field6724 = arg0.method2011() && arg1.field1264 && !this.field6718 && class488.field6789.field6682 != 0;
        int var11 = 1024;
        if (this.field6720) {
            var11 |= 32768;
        }
        class266 var12 = this.method2824(var11, false, arg0, this.field6724);
        if (var12 != null) {
            this.field6736 = var12.field3514;
            this.field6712 = var12.field3512;
            if (this.field6720) {
                this.field6736 = this.field6736.method1893((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)I", line = 328)
    public final int method4(int arg0) {
        ++field6708;
        return arg0 != -10666 ? 81 : this.field6732;
    }

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "(I)V", line = 345)
    public final void method8(int arg0) {
        if (arg0 >= -74) {
            this.field6714 = true;
        }
        this.field6720 = false;
        ++field6709;
        if (this.field6736 != null) {
            this.field6736.method1841(this.field6736.method1863() & -32769);
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(Lwm;B)Lnf;", line = 362)
    public final class374 method3(class364 arg0, byte arg1) {
        ++field6710;
        if (this.field6736 == null) {
            return null;
        } else {
            class203 var3 = arg0.method1960();
            var3.method1029(super.field4364, super.field4361, super.field4362);
            class374 var4 = null;
            if (this.field6714) {
                var4 = class358.method2196(1, (byte) 124);
            }
            if (arg1 < 99) {
                this.field6722 = 25;
            }
            this.field6736.method1880(var3, var4 == null ? null : var4.field5156[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V", line = 389)
    public static void method2823(byte arg0) {
        field6727 = null;
        field6725 = null;
        if (arg0 >= -113) {
            method2820(101, -19, 65, (Class) null);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZLwm;Z)Lij;", line = 400)
    private final class266 method2824(int arg0, boolean arg1, class364 arg2, boolean arg3) {
        ++field6715;
        if (arg1) {
            this.field6712 = null;
        }
        class88 var5 = class1.field23.method935(65535 & this.field6711, (byte) 103);
        class177 var6;
        class177 var7;
        if (!this.field6718) {
            var6 = class289.field3896[this.field6716];
            if (~this.field6716 <= -4) {
                var7 = null;
            } else {
                var7 = class289.field3896[this.field6716 - -1];
            }
        } else {
            var7 = class289.field3896[0];
            var6 = class312.field4112[this.field6716];
        }
        return var5.method560(super.field4361, var6, this.field6722, super.field4362, super.field4364, false, arg0, arg3, arg2, var7, this.field6732);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILwm;I)Lgn;", line = 433)
    public final class456 method15(int arg0, class364 arg1, int arg2) {
        if (arg2 != -28045) {
            return null;
        } else {
            ++field6723;
            return this.method2821(arg0, -84, arg1);
        }
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)I", line = 450)
    public final int method9(int arg0) {
        if (arg0 != -769) {
            return -112;
        } else {
            ++field6717;
            return this.field6722;
        }
    }
}
