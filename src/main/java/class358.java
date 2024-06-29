import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class358 extends class422 implements class438 {

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "Z")
    private boolean field5184;

    @OriginalMember(owner = "client!lm", name = "P", descriptor = "Z")
    private boolean field5210;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "B")
    private byte field5191;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "S")
    private short field5189;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "B")
    private byte field5188;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "Z")
    private boolean field5192;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "B")
    private byte field5183;

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "Z")
    private boolean field5198;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "Lbi;")
    public class143 field5190;

    @OriginalMember(owner = "client!lm", name = "Q", descriptor = "Lqh;")
    private class337 field5211;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!lm", name = "R", descriptor = "I")
    public static int field5212;

    static {
        new class409("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)Z", line = 3)
    public final boolean method15(boolean arg0) {
        if (!arg0) {
            this.field5211 = null;
        }
        ++field5202;
        return this.field5198;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lfp;Lgn;IIIIZIIZ)V", line = 14)
    public class358(class9 arg0, class178 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class252.method1663(arg7, arg8, false));
        this.field5184 = arg9;
        super.field6099 = (short) arg5;
        super.field6098 = (short) arg3;
        this.field5210 = arg1.field2479 != 0 && !arg6;
        this.field5191 = (byte) arg7;
        this.field5189 = (short) arg1.field2455;
        this.field5188 = (byte) arg2;
        this.field5192 = arg6;
        this.field5183 = (byte) arg8;
        this.field5198 = arg0.method94() && arg1.field2478 && !this.field5192 && class213.field3010 != 0;
        int var11 = 1024;
        if (this.field5184) {
            var11 |= 32768;
        }
        class441 var12 = this.method2278(this.field5198, var11, (byte) -12, arg0);
        if (var12 != null) {
            this.field5190 = var12.field6414;
            this.field5211 = var12.field6419;
            if (this.field5184) {
                this.field5190 = this.field5190.method966((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lfp;II)Lbi;", line = 50)
    public final class143 method11(class9 arg0, int arg1, int arg2) {
        if (arg2 != -23109) {
            this.field5184 = false;
        }
        ++field5212;
        return this.method2276(arg1, 127, arg0);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILfp;)Lbi;", line = 61)
    private final class143 method2276(int arg0, int arg1, class9 arg2) {
        ++field5208;
        if (this.field5190 != null && ~arg2.method85(this.field5190.method961(), arg0) == -1) {
            return this.field5190;
        } else {
            class441 var4 = this.method2278(false, arg0, (byte) 11, arg2);
            if (arg1 <= 100) {
                field5187 = 95;
            }
            return var4 != null ? var4.field6414 : null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)I", line = 84)
    public final int method9(byte arg0) {
        ++field5185;
        return arg0 < 102 ? -125 : 65535 & this.field5189;
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "(I)Z", line = 95)
    public static final boolean method2277(int arg0) {
        ++field5201;
        if (arg0 != -3497) {
            method2280(7, false);
        }
        class375 var1 = (class375) class138.field1885.field5735.field3908;
        if (var1 != null && class138.field1885.field5735 != var1) {
            if (~var1.field5469 <= -2001) {
                var1.field5469 -= 2000;
            }
            return var1.field5469 == 1004;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)I", line = 123)
    public final int method1(int arg0) {
        ++field5204;
        return arg0 >= -72 ? 77 : this.field5183;
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V", line = 137)
    public final void method33(int arg0) {
        this.field5184 = false;
        if (arg0 >= 109) {
            ++field5209;
            if (this.field5190 != null) {
                this.field5190.method975(this.field5190.method961() & -32769);
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILfp;)Luq;", line = 152)
    public final class241 method2(int arg0, class9 arg1) {
        ++field5195;
        if (this.field5190 == null) {
            return null;
        } else {
            class187 var3 = arg1.method145();
            if (arg0 > -125) {
                this.field5192 = true;
            }
            var3.method831(super.field6098, super.field6100, super.field6099);
            class241 var4 = null;
            if (this.field5210) {
                var4 = class395.method2485(-29083, 1);
            }
            this.field5190.method947(var3, var4 != null ? var4.field3578[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZIBLfp;)Lwk;", line = 178)
    private final class441 method2278(boolean arg0, int arg1, byte arg2, class9 arg3) {
        ++field5205;
        class178 var5 = class450.method2785(this.field5189 & 65535, (byte) 93);
        class378 var6;
        class378 var7;
        if (this.field5192) {
            var6 = class161.field2151[this.field5188];
            var7 = class28.field401[0];
        } else {
            if (this.field5188 < 3) {
                var7 = class28.field401[this.field5188 - -1];
            } else {
                var7 = null;
            }
            var6 = class28.field401[this.field5188];
        }
        int var8 = 15 / ((67 - arg2) / 36);
        return var5.method1238(var7, super.field6099, super.field6098, this.field5191, arg0, super.field6100, arg3, arg1, 102, var6, this.field5183);
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)I", line = 208)
    public final int method6(int arg0) {
        ++field5207;
        if (arg0 != -20839) {
            this.field5190 = null;
        }
        return this.field5191;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(III)I", line = 223)
    public static final int method2279(int arg0, int arg1, int arg2) {
        ++field5193;
        if (arg2 < 72) {
            field5187 = -68;
        }
        return arg1 != 1 && arg1 != 3 ? class100.field1246[3 & arg0] : class139.field1907[arg0 & 3];
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(B)Z", line = 244)
    public final boolean method34(byte arg0) {
        int var2 = 51 / ((arg0 - -19) / 44);
        ++field5199;
        return this.field5184;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)V", line = 257)
    public static final void method2280(int arg0, boolean arg1) {
        ++field5194;
        class369.method2347((byte) 125);
        class393.method2468(21770);
        class209.method1439(arg1, arg0, (byte) -11);
        class85.method575(class74.field942, 0, class385.field5628, class257.field3813);
        class204.method1398(class74.field942, (byte) -51, class257.field3813);
        class5.method39(class115.field1559, -5001);
        class99.method655(117);
        class51.method400(-50);
        if (~class120.field1610 != -11) {
            if (~class120.field1610 == -31) {
                client.method1796(25, 62);
                return;
            }
            if (class120.field1610 == 5) {
                class228.method1562(class257.field3813, -4, class74.field942);
                return;
            }
        } else {
            class227.method1554(false, -112);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lfp;III)Z", line = 284)
    public final boolean method5(class9 arg0, int arg1, int arg2, int arg3) {
        ++field5200;
        class143 var5 = this.method2276(65536, 123, arg0);
        if (var5 != null) {
            class187 var6 = arg0.method145();
            var6.method831(super.field6098, super.field6100, super.field6099);
            return var5.method988(arg3, arg1, var6, false);
        } else {
            if (arg2 != -754) {
                this.field5184 = false;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lfp;Lje;ZIIII)V", line = 308)
    public final void method32(class9 arg0, class309 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5206;
        if (arg1 instanceof class358) {
            class358 var8 = (class358) arg1;
            if (this.field5190 != null && var8.field5190 != null) {
                this.field5190.method963(var8.field5190, arg4, arg3, arg6, arg2);
            }
        } else if (arg1 instanceof class286) {
            class286 var9 = (class286) arg1;
            if (this.field5190 != null && var9.field4207 != null) {
                this.field5190.method963(var9.field4207, arg4, arg3, arg6, arg2);
            }
        }
        if (arg5 > -31) {
            this.field5188 = 45;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(ILfp;)V", line = 340)
    public final void method14(int arg0, class9 arg1) {
        ++field5186;
        if (arg0 != -7561) {
            this.field5192 = true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lfp;Z)V", line = 358)
    public final void method10(class9 arg0, boolean arg1) {
        if (arg1) {
            field5187 = -41;
        }
        ++field5196;
        Object var3 = null;
        class337 var5;
        if (this.field5211 == null && this.field5198) {
            class441 var4 = this.method2278(true, 131072, (byte) 117, arg0);
            var5 = var4 == null ? null : var4.field6419;
        } else {
            var5 = this.field5211;
            this.field5211 = null;
        }
        if (var5 != null) {
            class146.method1013(var5, this.field5188, super.field6098, super.field6099, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lfp;I)V", line = 387)
    public final void method7(class9 arg0, int arg1) {
        ++field5203;
        Object var3 = null;
        class337 var5;
        if (this.field5211 == null && this.field5198) {
            class441 var4 = this.method2278(true, 131072, (byte) -50, arg0);
            var5 = var4 == null ? null : var4.field6419;
        } else {
            var5 = this.field5211;
            this.field5211 = null;
        }
        if (var5 != null) {
            class163.method1079(var5, this.field5188, super.field6098, super.field6099, (boolean[]) null);
        }
        if (arg1 <= 98) {
            this.method1(-31);
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V", line = 415)
    public final void method4(int arg0) {
        if (arg0 != -27030) {
            this.method2278(false, 24, (byte) -73, (class9) null);
        }
        ++field5197;
        if (this.field5190 != null) {
            this.field5190.method948();
        }
    }
}
