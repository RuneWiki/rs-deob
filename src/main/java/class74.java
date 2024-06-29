import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class74 extends class56 {

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    private int field1020 = 1;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "I")
    private int field1017 = 1;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
    private int field1019 = 204;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "Llja;")
    public static class744 field1016 = new class744(51, 3);

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(III)Z")
    public static final boolean method692(int arg0, int arg1, int arg2) {
        ++field1015;
        if (arg0 != 0) {
            return false;
        } else {
            return ~(arg1 & 2048) != -1 && (arg2 & 55) != 0;
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
    public static void method693(int arg0) {
        field1016 = null;
        if (arg0 != 2048) {
            field1022 = -59;
        }
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
    public static final void method694(int arg0) {
        ++class357.field4425;
        ++field1014;
        class336 var1 = class512.method3076(class783.field10795, class591.field8030, (byte) 73);
        var1.field4150.method2353(97, class397.method2331(3));
        var1.field4150.method2369(arg0 + -18195, class701.field9880);
        var1.field4150.method2369(-18090, class705.field9921);
        var1.field4150.method2353(arg0 + 10, class118.field1503.field10648.method2427(0));
        if (arg0 != 105) {
            field1022 = -91;
        }
        class578.method3334(4, var1);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        ++field1018;
        int[] var3 = super.field752.method1308(false, arg1);
        if (arg0 != 0) {
            field1016 = null;
        }
        if (super.field752.field2441) {
            for (int var4 = 0; var4 < class642.field8759; ++var4) {
                int var5 = class648.field8837[var4];
                int var6 = class349.field4354[arg1];
                int var7 = this.field1020 * var5 >> 12;
                int var8 = this.field1017 * var6 >> 12;
                int var9 = var5 % (4096 / this.field1020) * this.field1020;
                int var10 = var6 % (4096 / this.field1017) * this.field1017;
                if (~this.field1019 < ~var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field1019 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field1019 > var9) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    public class74() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(CB)C")
    public static final char method695(char arg0, byte arg1) {
        ++field1021;
        if (arg1 != -6) {
            method694(-13);
        }
        if (~arg0 != -33 && arg0 != 160 && arg0 != '_' && ~arg0 != -46) {
            if (~arg0 != -92 && arg0 != ']' && ~arg0 != -36) {
                if (~arg0 != -225 && arg0 != 225 && arg0 != 226 && arg0 != 228 && arg0 != 227 && ~arg0 != -193 && ~arg0 != -194 && arg0 != 194 && arg0 != 196 && arg0 != 195) {
                    if (~arg0 != -233 && arg0 != 233 && ~arg0 != -235 && arg0 != 235 && ~arg0 != -201 && ~arg0 != -202 && ~arg0 != -203 && arg0 != 203) {
                        if (arg0 != 237 && ~arg0 != -239 && ~arg0 != -240 && arg0 != 205 && ~arg0 != -207 && ~arg0 != -208) {
                            if (~arg0 != -243 && ~arg0 != -244 && ~arg0 != -245 && ~arg0 != -247 && arg0 != 245 && ~arg0 != -211 && arg0 != 211 && arg0 != 212 && arg0 != 214 && arg0 != 213) {
                                if (arg0 != 249 && ~arg0 != -251 && ~arg0 != -252 && arg0 != 252 && arg0 != 217 && ~arg0 != -219 && ~arg0 != -220 && arg0 != 220) {
                                    if (arg0 != 231 && arg0 != 199) {
                                        if (~arg0 != -256 && ~arg0 != -377) {
                                            if (~arg0 != -242 && ~arg0 != -210) {
                                                return arg0 == 223 ? 'b' : Character.toLowerCase(arg0);
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

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (arg0 > -44) {
            method695((char) 65513, (byte) -88);
        }
        ++field1013;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field1019 = arg2.method2390((byte) -98);
                }
            } else {
                this.field1017 = arg2.method2396((byte) -102);
            }
        } else {
            this.field1020 = arg2.method2396((byte) -80);
        }
    }

    static {
        new class425("", 73);
    }
}
