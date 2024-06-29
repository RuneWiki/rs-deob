import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class162 extends class326 {

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "I")
    private int field2249 = 0;

    @OriginalMember(owner = "client!jl", name = "S", descriptor = "I")
    private int field2252 = 0;

    @OriginalMember(owner = "client!jl", name = "U", descriptor = "I")
    private int field2254 = 1;

    @OriginalMember(owner = "client!jl", name = "W", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!jl", name = "V", descriptor = "Lh;")
    public static class434 field2255;

    @OriginalMember(owner = "client!jl", name = "X", descriptor = "Lnk;")
    public static class464 field2257;

    @OriginalMember(owner = "client!jl", name = "Y", descriptor = "[Ljava/lang/String;")
    public static String[] field2258;

    @OriginalMember(owner = "client!jl", name = "cb", descriptor = "Ls;")
    public static class169 field2262;

    @OriginalMember(owner = "client!jl", name = "db", descriptor = "Lh;")
    public static class434 field2263;

    @OriginalMember(owner = "client!jl", name = "bb", descriptor = "F")
    public static float field2261;

    @OriginalMember(owner = "client!jl", name = "N", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!jl", name = "O", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!jl", name = "Q", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!jl", name = "R", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!jl", name = "T", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!jl", name = "Z", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!jl", name = "ab", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!jl", name = "eb", descriptor = "Lbk;")
    public static class231 field2264;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILbt;I)V")
    public final void method33(int arg0, class32 arg1, int arg2) {
        ++field2253;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -4) {
                    this.field2254 = arg1.method201((byte) -110);
                }
            } else {
                this.field2252 = arg1.method201((byte) -122);
            }
        } else {
            this.field2249 = arg1.method201((byte) -115);
        }
        if (arg2 > -3) {
            this.method30((byte) -113, 121);
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V")
    public final void method65(int arg0) {
        ++field2250;
        class66.method437(false);
        if (arg0 >= -100) {
            method953(112);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V")
    public static void method951(byte arg0) {
        field2263 = null;
        field2255 = null;
        field2258 = null;
        field2257 = null;
        field2262 = null;
        if (arg0 != 79) {
            field2260 = 21;
        }
        field2264 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIILur;Lvi;Lkf;Ljava/lang/String;Lnk;)V")
    public static final void method952(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class345 arg7, class347 arg8, class152 arg9, String arg10, class464 arg11) {
        ++field2248;
        int var12;
        if (~class56.field772 != -5) {
            var12 = 16383 & (int) class270.field3610 + class150.field2119;
        } else {
            var12 = (int) class270.field3610 & 16383;
        }
        int var13 = Math.max(arg11.field6308 / 2, arg11.field6340 / 2) - -10;
        int var14 = arg5 * arg5 - -(arg1 * arg1);
        if (var14 <= var13 * var13) {
            int var15 = class364.field4994[var12];
            int var16 = class364.field4992[var12];
            if (class56.field772 != 4) {
                var16 = var16 * 256 / (class429.field5795 + 256);
                var15 = var15 * 256 / (class429.field5795 + 256);
            }
            int var17 = arg1 * var15 + arg5 * var16 >> 15;
            int var18 = arg1 * var16 - arg5 * var15 >> 15;
            int var19 = arg8.method2143((class139[]) null, arg10, (byte) -48, 100);
            int var20 = var17 - var19 / arg2;
            int var21 = arg8.method2140(0, arg10, (byte) -60, (class139[]) null, 100);
            if (~(-arg11.field6308) >= ~var20 && arg11.field6308 >= var20 && -arg11.field6340 <= var18 && var18 <= arg11.field6340) {
                arg7.method2120(arg0, 0, arg11.field6308 / 2 + (var20 - -arg0), 1, 0, (int[]) null, arg3, arg9, 50, arg10, 1, 0, arg11.field6340 / 2 + (arg3 - arg6) + -var18 + -var21, (class139[]) null, arg4, var19);
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 >= -6) {
            return null;
        } else {
            ++field2247;
            int[] var3 = super.field4344.method130(arg1, -121);
            if (super.field4344.field286) {
                int var4 = class95.field1400[arg1];
                int var5 = var4 - 2048 >> 1;
                for (int var6 = 0; ~class181.field2495 < ~var6; ++var6) {
                    int var7 = class389.field5375[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var9;
                    if (~this.field2249 == -1) {
                        var9 = (-var4 + var7) * this.field2254;
                    } else {
                        int var10 = var5 * var5 + var8 * var8 >> 12;
                        int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                        var9 = (int) ((double) (this.field2254 * var11) * 3.141592653589793D);
                    }
                    int var12 = var9 - (var9 & -4096);
                    if (this.field2252 == 0) {
                        var12 = class7.field90[(4094 & var12) >> 4] + 4096 >> 1;
                    } else if (this.field2252 == 2) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
    public class162() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)V")
    public static final void method953(int arg0) {
        if (arg0 == -31847) {
            ++field2251;
            if (~class318.field4190 != -1) {
                try {
                    if (++class288.field3886 > 1500) {
                        if (class280.field3743 != null) {
                            class280.field3743.method2310(-99);
                            class280.field3743 = null;
                        }
                        if (class73.field1001 >= 1) {
                            class318.field4190 = 0;
                            class297.field3976 = -5;
                            return;
                        }
                        class318.field4190 = 1;
                        if (~class291.field3906 == ~class135.field1966) {
                            class135.field1966 = class17.field237;
                        } else {
                            class135.field1966 = class291.field3906;
                        }
                        ++class73.field1001;
                        class288.field3886 = 0;
                    }
                    if (class318.field4190 == 1) {
                        class268.field3583 = class251.field3359.method1333(class209.field2832, class135.field1966, 1);
                        class318.field4190 = 2;
                    }
                    if (~class318.field4190 == -3) {
                        if (~class268.field3583.field6534 == -3) {
                            throw new IOException();
                        }
                        if (class268.field3583.field6534 != 1) {
                            return;
                        }
                        class280.field3743 = new class375((Socket) class268.field3583.field6529, class251.field3359);
                        class268.field3583 = null;
                        class280.field3743.method2308(false, 0, class203.field2751.field456, class203.field2751.field472);
                        if (class259.field3433 != null) {
                            class259.field3433.method851(arg0 ^ -31855);
                        }
                        if (class98.field1434 != null) {
                            class98.field1434.method851(8);
                        }
                        int var1 = class280.field3743.method2311(1);
                        if (class259.field3433 != null) {
                            class259.field3433.method851(arg0 ^ -31855);
                        }
                        if (class98.field1434 != null) {
                            class98.field1434.method851(8);
                        }
                        if (~var1 != -102) {
                            class297.field3976 = var1;
                            class318.field4190 = 0;
                            class280.field3743.method2310(arg0 + 31752);
                            class280.field3743 = null;
                            return;
                        }
                        class318.field4190 = 3;
                    }
                    if (class318.field4190 == 3) {
                        if (~class280.field3743.method2306(1) <= -3) {
                            int var2 = class280.field3743.method2311(1) << 8 | class280.field3743.method2311(arg0 + 31848);
                            class385.method2358(var2, (byte) -31);
                            if (~class33.field506 == 0) {
                                class318.field4190 = 0;
                                class297.field3976 = 6;
                                class280.field3743.method2310(-88);
                                class280.field3743 = null;
                            } else {
                                class318.field4190 = 0;
                                class280.field3743.method2310(-110);
                                class280.field3743 = null;
                                class191.method1092(116);
                            }
                        }
                    }
                } catch (IOException var3) {
                    if (class280.field3743 != null) {
                        class280.field3743.method2310(-101);
                        class280.field3743 = null;
                    }
                    if (class73.field1001 >= 1) {
                        class318.field4190 = 0;
                        class297.field3976 = -4;
                    } else {
                        class318.field4190 = 1;
                        class288.field3886 = 0;
                        if (~class291.field3906 == ~class135.field1966) {
                            class135.field1966 = class17.field237;
                        } else {
                            class135.field1966 = class291.field3906;
                        }
                        ++class73.field1001;
                    }
                }
            }
        }
    }

    static {
        new class206("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field2256 = 0;
        field2255 = new class434(79, 7);
        field2257 = null;
        field2258 = new String[] { "en", "de", "fr", "pt", "nl" };
        field2262 = new class169(8, 6);
        field2263 = new class434(86, 10);
    }
}
