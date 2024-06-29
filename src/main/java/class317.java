import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class317 extends class233 implements class438 {

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "S")
    private short field4648;

    @OriginalMember(owner = "client!ve", name = "S", descriptor = "B")
    private byte field4659;

    @OriginalMember(owner = "client!ve", name = "O", descriptor = "Z")
    private boolean field4655;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "B")
    private byte field4634;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "Z")
    private boolean field4641;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "B")
    private byte field4646;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "Z")
    private boolean field4643;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "Lqh;")
    private class337 field4638;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "Lbi;")
    private class143 field4639;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field4635 = 0;

    @OriginalMember(owner = "client!ve", name = "P", descriptor = "F")
    public static float field4656;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!ve", name = "N", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!ve", name = "Q", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!ve", name = "R", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!ve", name = "T", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!ve", name = "U", descriptor = "I")
    public static int field4661;

    static {
        new class409("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lfp;I)V", line = 3)
    public final void method7(class9 arg0, int arg1) {
        ++field4650;
        if (arg1 <= 98) {
            this.method2093(false, (class9) null, (byte) 51, 92);
        }
        Object var3 = null;
        class337 var5;
        if (this.field4638 == null && this.field4643) {
            class441 var4 = this.method2093(true, arg0, (byte) 99, 131072);
            var5 = var4 == null ? null : var4.field6419;
        } else {
            var5 = this.field4638;
            this.field4638 = null;
        }
        if (var5 != null) {
            class163.method1079(var5, this.field4634, super.field3497, super.field3494, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V", line = 32)
    public final void method4(int arg0) {
        ++field4658;
        if (arg0 == -27030) {
            if (this.field4639 != null) {
                this.field4639.method948();
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(B)I", line = 50)
    public final int method16(byte arg0) {
        ++field4660;
        int var2 = -27 % ((21 - arg0) / 54);
        return this.field4639 != null ? this.field4639.method950() : 0;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(ILfp;)V", line = 61)
    public static final void method2091(int arg0, class9 arg1) {
        ++field4657;
        int var2 = class427.field6215;
        int var3 = class441.field6420;
        int var4 = class466.field6860;
        int var5 = class130.field1732 + -3;
        byte var6 = 20;
        if (class429.field6239 == null || class83.field1022 == null) {
            if (class257.field3813.method708(field4652, (byte) -124) && class257.field3813.method708(class294.field4269, (byte) -89)) {
                class429.field6239 = arg1.method100(class144.method991(class257.field3813, field4652, 0), true);
                class144 var7 = class144.method991(class257.field3813, class294.field4269, 0);
                class83.field1022 = arg1.method100(var7, true);
                var7.method996();
                class104.field1387 = arg1.method100(var7, true);
            } else {
                arg1.method164(var2, var3, var4, var6, 255 - class311.field4588 << 24 | class225.field3370, 1);
            }
        }
        if (class429.field6239 != null && class83.field1022 != null) {
            int var8 = (var4 - class83.field1022.method1868() * 2) / class429.field6239.method1868();
            for (int var9 = 0; var9 < var8; ++var9) {
                class429.field6239.method1915(class83.field1022.method1868() + var2 + class429.field6239.method1868() * var9, var3);
            }
            class83.field1022.method1915(var2, var3);
            class104.field1387.method1915(-class104.field1387.method1868() + var2 + var4, var3);
        }
        class111.field1540.method565(-1, 9865, var3 - -14, class42.field565.method2543(false, class153.field2073), class304.field4448 | -16777216, var2 + 3);
        arg1.method164(var2, var3 + var6, var4, -var6 + var5, -class311.field4588 + 255 << 24 | class225.field3370, 1);
        int var10 = class223.field3295.method411(0);
        int var11 = class223.field3295.method415(-102);
        int var12 = 0;
        for (class375 var13 = (class375) class138.field1885.method2478(1603); var13 != null; var13 = (class375) class138.field1885.method2486((byte) -82)) {
            int var30 = (class237.field3532 + -1 + -var12) * 16 + var3 + var6 + 13;
            if (var2 < var10 && var10 < var2 - -var4 && ~var11 < ~(var30 + -13) && ~(var30 + 4) < ~var11 && var13.field5478) {
                arg1.method164(var2, var30 - 12, var4, 16, -class281.field4129 + 255 << 24 | class141.field1915, 1);
            }
            ++var12;
        }
        if ((class452.field6676 == null || class148.field2016 == null || class386.field5644 == null) && class257.field3813.method708(class214.field3027, (byte) -89) && class257.field3813.method708(class186.field2609, (byte) -111) && class257.field3813.method708(class1.field17, (byte) -113)) {
            class144 var14 = class144.method991(class257.field3813, class186.field2609, 0);
            class148.field2016 = arg1.method100(var14, true);
            var14.method996();
            class22.field311 = arg1.method100(var14, true);
            class452.field6676 = arg1.method100(class144.method991(class257.field3813, class214.field3027, 0), true);
            class144 var15 = class144.method991(class257.field3813, class1.field17, 0);
            class386.field5644 = arg1.method100(var15, true);
            var15.method996();
            class336.field4966 = arg1.method100(var15, true);
        }
        int var16 = 0;
        if (class452.field6676 != null && class148.field2016 != null && class386.field5644 != null) {
            int var17 = (-(2 * class386.field5644.method1868()) + var4) / class452.field6676.method1868();
            for (int var18 = 0; var18 < var17; ++var18) {
                class452.field6676.method1915(class386.field5644.method1868() + (var2 - -(class452.field6676.method1868() * var18)), -class452.field6676.method1862() + var3 - -var5);
            }
            int var19 = (var5 + (-var6 - class386.field5644.method1862())) / class148.field2016.method1862();
            for (int var20 = 0; var19 > var20; ++var20) {
                class148.field2016.method1915(var2, var3 - (-var6 + -(var20 * class148.field2016.method1862())));
                class22.field311.method1915(var2 - -var4 - class22.field311.method1868(), var6 + (var3 - -(class148.field2016.method1862() * var20)));
            }
            class386.field5644.method1915(var2, var3 + var5 + -class386.field5644.method1862());
            class336.field4966.method1915(var2 - -var4 - class386.field5644.method1868(), var3 + var5 - class386.field5644.method1862());
        }
        class375 var21 = (class375) class138.field1885.method2478(1603);
        if (arg0 != 3) {
            method2091(91, (class9) null);
        }
        while (var21 != null) {
            int var22 = var3 + 13 - -var6 - -((-var16 + -1 + class237.field3532) * 16);
            int var23 = class304.field4448 | -16777216;
            if (var2 < var10 && ~(var2 + var4) < ~var10 && ~(var22 + -13) > ~var11 && ~var11 > ~(var22 + 4) && var21.field5478) {
                var23 = -16777216 | class199.field2817;
            }
            int[] var24 = null;
            if (!class411.method2553(arg0 ^ 2662, var21.field5469)) {
                if (!class275.method1878(4, var21.field5469)) {
                    if (class29.method295(arg0 + 16562, var21.field5469)) {
                        Object var25 = null;
                        class178 var26;
                        if (var21.field5469 != 1006) {
                            var26 = class450.method2785((int) (var21.field5480 >>> 32 & 2147483647L), (byte) 116);
                        } else {
                            var26 = class450.method2785((int) var21.field5480, (byte) 115);
                        }
                        if (var26.field2489 != null) {
                            var26 = var26.method1240((byte) -116);
                        }
                        if (var26 != null) {
                            var24 = var26.field2509;
                        }
                    }
                } else {
                    class26 var27 = class364.field5260[(int) var21.field5480];
                    if (var27 != null) {
                        class327 var28 = var27.field369;
                        if (var28.field4871 != null) {
                            var28 = var28.method2139(true);
                        }
                        if (var28 != null) {
                            var24 = var28.field4815;
                        }
                    }
                }
            } else {
                var24 = class157.field2119.method176((byte) -41, (int) var21.field5480).field6203;
            }
            String var29 = class265.method1827(var21, true);
            if (var24 != null) {
                var29 = var29 + class447.method2750((byte) -72, var24);
            }
            class111.field1540.method573(var22, var29, class214.field3022, var2 + 3, -128, 0, class77.field979, var23);
            ++var16;
            if (var21.field5470) {
                class226.field3383.method1915(5 + (var2 - -class233.field3502.method2333(110, var29)), var22 + -12);
            }
            var21 = (class375) class138.field1885.method2486((byte) -82);
        }
        class436.method2685(class441.field6420, 13435, class427.field6215, class466.field6860, class130.field1732);
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)I", line = 266)
    public final int method6(int arg0) {
        ++field4645;
        if (arg0 != -20839) {
            this.method11((class9) null, 126, -101);
        }
        return this.field4646;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lfp;Lgn;IIIIZIIIII)V", line = 277)
    public class317(class9 arg0, class178 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class332.method2167(false, arg11, arg10));
        super.field3497 = (short) arg3;
        this.field4648 = (short) arg1.field2455;
        this.field4659 = (byte) arg11;
        super.field3494 = (short) arg5;
        this.field4655 = arg6;
        this.field4634 = (byte) arg2;
        this.field4641 = arg1.field2479 != 0 && !arg6;
        this.field4646 = (byte) arg10;
        this.field4643 = arg0.method94() && arg1.field2478 && !this.field4655 && ~class213.field3010 != -1;
        class441 var13 = this.method2093(this.field4643, arg0, (byte) 123, 1024);
        if (var13 != null) {
            this.field4638 = var13.field6419;
            this.field4639 = var13.field6414;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lfp;III)Z", line = 304)
    public final boolean method5(class9 arg0, int arg1, int arg2, int arg3) {
        ++field4654;
        class143 var5 = this.method2092(65536, arg0, (byte) -126);
        if (var5 != null) {
            class187 var6 = arg0.method145();
            var6.method831(super.field3497, super.field3490, super.field3494);
            return var5.method988(arg3, arg1, var6, false);
        } else {
            if (arg2 != -754) {
                this.method4(-88);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)Z", line = 325)
    public final boolean method15(boolean arg0) {
        ++field4661;
        return !arg0 ? true : this.field4643;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILfp;B)Lbi;", line = 336)
    private final class143 method2092(int arg0, class9 arg1, byte arg2) {
        ++field4637;
        if (this.field4639 != null && arg1.method85(this.field4639.method961(), arg0) == 0) {
            return this.field4639;
        } else {
            if (arg2 >= -120) {
                this.method7((class9) null, -4);
            }
            class441 var4 = this.method2093(false, arg1, (byte) 103, arg0);
            return var4 == null ? null : var4.field6414;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)I", line = 358)
    public final int method9(byte arg0) {
        ++field4647;
        return arg0 <= 102 ? 118 : 65535 & this.field4648;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I", line = 371)
    public final int method1(int arg0) {
        ++field4636;
        if (arg0 >= -72) {
            this.field4648 = 80;
        }
        return this.field4659;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lfp;Z)V", line = 385)
    public final void method10(class9 arg0, boolean arg1) {
        ++field4642;
        Object var3 = null;
        if (arg1) {
            this.method14(-117, (class9) null);
        }
        class337 var5;
        if (this.field4638 == null && this.field4643) {
            class441 var4 = this.method2093(true, arg0, (byte) 90, 131072);
            var5 = var4 == null ? null : var4.field6419;
        } else {
            var5 = this.field4638;
            this.field4638 = null;
        }
        if (var5 != null) {
            class146.method1013(var5, this.field4634, super.field3497, super.field3494, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLfp;BI)Lwk;", line = 420)
    private final class441 method2093(boolean arg0, class9 arg1, byte arg2, int arg3) {
        ++field4644;
        class178 var5 = class450.method2785(65535 & this.field4648, (byte) 92);
        if (arg2 <= 41) {
            this.method6(-44);
        }
        class378 var6;
        class378 var7;
        if (this.field4655) {
            var6 = class161.field2151[this.field4634];
            var7 = class28.field401[0];
        } else {
            var6 = class28.field401[this.field4634];
            if (this.field4634 < 3) {
                var7 = class28.field401[this.field4634 + 1];
            } else {
                var7 = null;
            }
        }
        return var5.method1238(var7, super.field3494, super.field3497, this.field4646, arg0, super.field3490, arg1, arg3, 103, var6, this.field4659);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lfp;II)Lbi;", line = 450)
    public final class143 method11(class9 arg0, int arg1, int arg2) {
        ++field4640;
        if (arg2 != -23109) {
            field4651 = -100;
        }
        return this.method2092(arg1, arg0, (byte) -126);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILfp;)Luq;", line = 465)
    public final class241 method2(int arg0, class9 arg1) {
        ++field4649;
        if (this.field4639 == null) {
            return null;
        } else {
            class187 var3 = arg1.method145();
            var3.method831(super.field3497 - -super.field3491, super.field3490, super.field3495 + super.field3494);
            class241 var4 = null;
            if (this.field4641) {
                var4 = class395.method2485(-29083, 1);
            }
            this.field4639.method947(var3, var4 == null ? null : var4.field3578[0], 0);
            return arg0 > -125 ? null : var4;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(ILfp;)V", line = 492)
    public final void method14(int arg0, class9 arg1) {
        ++field4653;
        if (arg0 != -7561) {
            this.field4659 = 115;
        }
    }
}
