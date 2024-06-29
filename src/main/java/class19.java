import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class19 extends class381 implements class351 {

    @OriginalMember(owner = "client!ko", name = "Q", descriptor = "Z")
    private boolean field331;

    @OriginalMember(owner = "client!ko", name = "y", descriptor = "Z")
    private boolean field313;

    @OriginalMember(owner = "client!ko", name = "Z", descriptor = "B")
    private byte field340;

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "S")
    private short field315;

    @OriginalMember(owner = "client!ko", name = "ab", descriptor = "Z")
    private boolean field341;

    @OriginalMember(owner = "client!ko", name = "H", descriptor = "B")
    private byte field322;

    @OriginalMember(owner = "client!ko", name = "S", descriptor = "Z")
    private boolean field333;

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "Lqc;")
    private class95 field316;

    @OriginalMember(owner = "client!ko", name = "T", descriptor = "Loc;")
    private class93 field334;

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "I")
    public static int field314 = -1;

    @OriginalMember(owner = "client!ko", name = "O", descriptor = "I")
    public static int field329 = 0;

    @OriginalMember(owner = "client!ko", name = "w", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!ko", name = "x", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!ko", name = "F", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!ko", name = "G", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!ko", name = "I", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!ko", name = "J", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!ko", name = "L", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!ko", name = "M", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!ko", name = "N", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!ko", name = "P", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!ko", name = "R", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!ko", name = "U", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!ko", name = "V", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!ko", name = "W", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!ko", name = "X", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!ko", name = "Y", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!ko", name = "bb", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!ko", name = "K", descriptor = "[[Z")
    public static boolean[][] field325;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lnr;II)Lqc;")
    private final class95 method144(class437 arg0, int arg1, int arg2) {
        ++field330;
        if (this.field316 != null && arg0.method2132(this.field316.method594(), arg1) == 0) {
            return this.field316;
        } else {
            int var4 = -110 % ((-52 - arg2) / 59);
            class284 var5 = this.method155(false, arg0, arg1, (byte) -126);
            return var5 != null ? var5.field4144 : null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(Lnr;Z)Lg;")
    public final class433 method145(class437 arg0, boolean arg1) {
        ++field320;
        if (this.field316 == null) {
            return null;
        } else {
            class116 var3 = arg0.method2026();
            var3.method809(super.field5712, super.field5714, super.field5710);
            class433 var4 = null;
            if (arg1) {
                method157('U', 119);
            }
            if (this.field341) {
                var4 = class436.method2758(1, 12300);
            }
            this.field316.method602(var3, var4 == null ? null : var4.field6381[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)Z")
    public final boolean method146(byte arg0) {
        if (arg0 < 102) {
            return true;
        } else {
            ++field332;
            return this.field333;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BILnr;)Lqc;")
    public final class95 method147(byte arg0, int arg1, class437 arg2) {
        int var4 = 29 / ((-32 - arg0) / 61);
        ++field335;
        return this.method144(arg2, arg1, -120);
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)I")
    public final int method148(byte arg0) {
        ++field326;
        if (arg0 != -68) {
            method162(88);
        }
        return this.field340;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lqj;Lfl;B)V")
    public static final void method149(class238 arg0, class386 arg1, byte arg2) {
        class66.field937 = arg0;
        int var3 = -122 % ((-37 - arg2) / 54);
        ++field327;
        class281.field4136 = arg1;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)I")
    public final int method150(byte arg0) {
        if (arg0 > -110) {
            return 123;
        } else {
            ++field312;
            return this.field315 & 65535;
        }
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "(B)Z")
    public final boolean method151(byte arg0) {
        ++field321;
        if (arg0 != -115) {
            this.field334 = null;
        }
        return this.field331;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BI)V")
    public static final void method152(byte arg0, int arg1) {
        ++field311;
        class232.field3271.method215(0, arg1);
        if (arg0 != 34) {
            field314 = -43;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLnr;IIZLcb;I)V")
    public final void method153(byte arg0, class437 arg1, int arg2, int arg3, boolean arg4, class387 arg5, int arg6) {
        if (arg0 <= -116) {
            if (arg5 instanceof class19) {
                class19 var8 = (class19) arg5;
                if (this.field316 != null && var8.field316 != null) {
                    this.field316.method616(var8.field316, arg3, arg6, arg2, arg4);
                }
            }
            ++field323;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILnr;)V")
    public final void method154(int arg0, class437 arg1) {
        ++field318;
        Object var3 = null;
        class93 var5;
        if (this.field334 == null && this.field333) {
            class284 var4 = this.method155(true, arg1, 131072, (byte) -126);
            var5 = var4 != null ? var4.field4143 : null;
        } else {
            var5 = this.field334;
            this.field334 = null;
        }
        if (arg0 != 25510) {
            this.method158((byte) 37);
        }
        if (var5 != null) {
            class8.method61(var5, this.field322, super.field5712, super.field5710, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZLnr;IB)Lbc;")
    private final class284 method155(boolean arg0, class437 arg1, int arg2, byte arg3) {
        if (arg3 != -126) {
            return null;
        } else {
            ++field342;
            class404 var5 = class165.method1020(65535 & this.field315, -88);
            class337 var6;
            class337 var7;
            if (!this.field313) {
                var6 = class198.field2829[this.field322];
                if (~this.field322 <= -4) {
                    var7 = null;
                } else {
                    var7 = class198.field2829[this.field322 - -1];
                }
            } else {
                var6 = class425.field6324[this.field322];
                var7 = class198.field2829[0];
            }
            return var5.method2622(22, arg1, var6, this.field340, super.field5710, super.field5712, super.field5714, arg2, var7, 125, arg0);
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lnr;Lta;IIIIZIZ)V")
    public class19(class437 arg0, class404 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field6024, arg1.field6026);
        this.field331 = arg8;
        this.field313 = arg6;
        this.field340 = (byte) arg7;
        this.field315 = (short) arg1.field6059;
        super.field5710 = (short) arg5;
        this.field341 = ~arg1.field6009 != -1 && !arg6;
        this.field322 = (byte) arg2;
        super.field5712 = (short) arg3;
        this.field333 = arg0.method2086() && arg1.field6081 && !this.field313 && class176.field2300 != 0;
        int var10 = 1024;
        if (this.field331) {
            var10 |= 32768;
        }
        class284 var11 = this.method155(this.field333, arg0, var10, (byte) -126);
        if (var11 != null) {
            this.field316 = var11.field4144;
            this.field334 = var11.field4143;
            if (this.field331) {
                this.field316 = this.field316.method628((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lnr;Z)V")
    public final void method156(class437 arg0, boolean arg1) {
        ++field338;
        Object var3 = null;
        class93 var5;
        if (this.field334 == null && this.field333) {
            class284 var4 = this.method155(true, arg0, 131072, (byte) -126);
            var5 = var4 != null ? var4.field4143 : null;
        } else {
            var5 = this.field334;
            this.field334 = null;
        }
        if (arg1) {
            method162(55);
        }
        if (var5 != null) {
            class132.method897(var5, this.field322, super.field5712, super.field5710, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(CI)C")
    public static final char method157(char arg0, int arg1) {
        ++field339;
        if (arg1 != 376) {
            return 'p';
        } else if (arg0 != ' ' && arg0 != 160 && arg0 != '_' && arg0 != '-') {
            if (arg0 != '[' && arg0 != ']' && arg0 != '#') {
                if (arg0 != 224 && ~arg0 != -226 && ~arg0 != -227 && arg0 != 228 && arg0 != 227 && ~arg0 != -193 && ~arg0 != -194 && ~arg0 != -195 && ~arg0 != -197 && ~arg0 != -196) {
                    if (~arg0 != -233 && arg0 != 233 && arg0 != 234 && ~arg0 != -236 && ~arg0 != -201 && arg0 != 201 && ~arg0 != -203 && ~arg0 != -204) {
                        if (~arg0 != -238 && ~arg0 != -239 && arg0 != 239 && arg0 != 205 && ~arg0 != -207 && ~arg0 != -208) {
                            if (~arg0 != -243 && arg0 != 243 && ~arg0 != -245 && ~arg0 != -247 && arg0 != 245 && arg0 != 210 && ~arg0 != -212 && ~arg0 != -213 && ~arg0 != -215 && ~arg0 != -214) {
                                if (~arg0 != -250 && ~arg0 != -251 && ~arg0 != -252 && ~arg0 != -253 && arg0 != 217 && ~arg0 != -219 && arg0 != 219 && arg0 != 220) {
                                    if (~arg0 != -232 && arg0 != 199) {
                                        if (arg0 != 255 && arg0 != 376) {
                                            if (arg0 != 241 && ~arg0 != -210) {
                                                return ~arg0 == -224 ? 'b' : Character.toLowerCase(arg0);
                                            } else {
                                                return 'n';
                                            }
                                        } else {
                                            return 'y';
                                        }
                                    } else {
                                        return 'c';
                                    }
                                } else {
                                    return 'u';
                                }
                            } else {
                                return 'o';
                            }
                        } else {
                            return 'i';
                        }
                    } else {
                        return 'e';
                    }
                } else {
                    return 'a';
                }
            } else {
                return arg0;
            }
        } else {
            return '_';
        }
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(B)V")
    public final void method158(byte arg0) {
        if (arg0 == 6) {
            if (this.field316 != null) {
                this.field316.method587();
            }
            ++field319;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILnr;II)Z")
    public final boolean method159(int arg0, class437 arg1, int arg2, int arg3) {
        ++field336;
        class95 var5 = this.method144(arg1, 65536, -125);
        if (arg3 <= 12) {
            return true;
        } else if (var5 != null) {
            class116 var6 = arg1.method2026();
            var6.method809(super.field5712, super.field5714, super.field5710);
            return var5.method619(arg2, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)I")
    public final int method160(int arg0) {
        ++field328;
        return arg0 != -22056 ? -106 : 22;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lnr;I)V")
    public final void method161(class437 arg0, int arg1) {
        if (arg1 == 0) {
            ++field337;
        }
    }

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "(I)V")
    public static void method162(int arg0) {
        field325 = null;
        if (arg0 != 4214) {
            method162(-29);
        }
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V")
    public final void method163(int arg0) {
        this.field331 = false;
        ++field317;
        if (arg0 == 0) {
            if (this.field316 != null) {
                this.field316.method589(-32769 & this.field316.method594());
            }
        }
    }
}
