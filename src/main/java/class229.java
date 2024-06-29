import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class229 extends class301 implements class223 {

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "Z")
    private boolean field3206;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "B")
    private byte field3205;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "Z")
    private boolean field3215;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "B")
    private byte field3213;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "Z")
    private boolean field3221;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "S")
    private short field3210;

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "Z")
    private boolean field3227;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "Lts;")
    private class116 field3212;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "Llb;")
    private class210 field3208;

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "[J")
    public static long[] field3226;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "Z")
    public static boolean field3214;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZILea;I)Z")
    public final boolean method710(boolean arg0, int arg1, class58 arg2, int arg3) {
        if (!arg0) {
            return true;
        } else {
            ++field3198;
            class116 var5 = this.method1498(1, 65536, arg2);
            if (var5 != null) {
                class309 var6 = arg2.method210();
                var6.method1866(super.field4110, super.field4109, super.field4108);
                return var5.method898(arg3, arg1, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(Z)V")
    public static final void method1494(boolean arg0) {
        class399.field5527 = null;
        class136.field2024 = null;
        class19.field264 = null;
        ++field3200;
        class268.field3670 = null;
        class405.field5600 = null;
        class178.field2547 = null;
        class186.field2700 = null;
        if (arg0) {
            field3226 = null;
        }
        class346.field4684 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIBIIIIIII)V")
    public static final void method1495(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field3197;
        class352 var10 = null;
        class352 var11 = (class352) class155.field2207.method1173(0);
        if (arg2 == -53) {
            while (var11 != null) {
                if (~var11.field4731 == ~arg3 && var11.field4739 == arg4 && ~var11.field4738 == ~arg0 && var11.field4730 == arg1) {
                    var10 = var11;
                    break;
                }
                var11 = (class352) class155.field2207.method1165(true);
            }
            if (var10 == null) {
                var10 = new class352();
                var10.field4731 = arg3;
                var10.field4738 = arg0;
                var10.field4739 = arg4;
                var10.field4730 = arg1;
                class301.method1831(false, var10);
                class155.field2207.method1162(112, var10);
            }
            var10.field4725 = arg5;
            var10.field4728 = arg9;
            var10.field4732 = arg6;
            var10.field4726 = arg7;
            var10.field4729 = arg8;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public final void method702(byte arg0) {
        this.field3215 = false;
        if (arg0 == 46) {
            ++field3201;
            if (this.field3212 != null) {
                this.field3212.method897(-32769 & this.field3212.method866());
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lij;Lij;B)V")
    public static final void method1496(class316 arg0, class316 arg1, byte arg2) {
        ++field3225;
        class277.field3782 = arg1;
        class159.field2257 = arg0;
        class277.field3782.method1934((byte) 28, 34);
        if (arg2 > -15) {
            field3226 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lea;Lp;IIIIZIZ)V")
    public class229(class58 arg0, class447 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field6320, arg1.field6306);
        this.field3206 = arg1.field6297 != 0 && !arg6;
        this.field3205 = (byte) arg2;
        this.field3215 = arg8;
        this.field3213 = (byte) arg7;
        super.field4108 = (short) arg5;
        super.field4110 = (short) arg3;
        this.field3221 = arg6;
        this.field3210 = (short) arg1.field6323;
        this.field3227 = arg0.method218() && arg1.field6332 && !this.field3221 && class228.field3188 != 0;
        int var10 = 1024;
        if (this.field3215) {
            var10 |= 32768;
        }
        class274 var11 = this.method1502(var10, (byte) -108, this.field3227, arg0);
        if (var11 != null) {
            this.field3212 = var11.field3748;
            this.field3208 = var11.field3745;
            if (this.field3215) {
                this.field3212 = this.field3212.method907((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
    public static void method1497(byte arg0) {
        int var1 = 48 % ((arg0 - 56) / 33);
        field3226 = null;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)I")
    public final int method709(int arg0) {
        ++field3218;
        if (arg0 != 30030) {
            this.method1498(-12, -128, (class58) null);
        }
        return this.field3213;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILea;)V")
    public final void method704(int arg0, class58 arg1) {
        if (arg0 != -29096) {
            this.method699(122, 117, (class58) null, (class216) null, true, 16, 121);
        }
        ++field3196;
        Object var3 = null;
        class210 var5;
        if (this.field3208 == null && this.field3227) {
            class274 var4 = this.method1502(131072, (byte) -58, true, arg1);
            var5 = var4 != null ? var4.field3745 : null;
        } else {
            var5 = this.field3208;
            this.field3208 = null;
        }
        if (var5 != null) {
            class383.method2369(var5, this.field3205, super.field4110, super.field4108, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lea;BI)Lts;")
    public final class116 method705(class58 arg0, byte arg1, int arg2) {
        ++field3211;
        if (arg1 != -63) {
            this.method699(-123, -65, (class58) null, (class216) null, true, -31, -115);
        }
        return this.method1498(1, arg2, arg0);
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)I")
    public final int method695(int arg0) {
        if (arg0 != 898) {
            this.method705((class58) null, (byte) 71, -96);
        }
        ++field3222;
        return 22;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lea;I)V")
    public final void method707(class58 arg0, int arg1) {
        ++field3219;
        if (arg1 > -99) {
            method1499((class76) null, (Object) null, 44);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILea;)Lts;")
    private final class116 method1498(int arg0, int arg1, class58 arg2) {
        if (arg0 != 1) {
            this.field3215 = false;
        }
        ++field3216;
        if (this.field3212 != null && ~arg2.method187(this.field3212.method866(), arg1) == -1) {
            return this.field3212;
        } else {
            class274 var4 = this.method1502(arg1, (byte) -69, false, arg2);
            return var4 != null ? var4.field3748 : null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)I")
    public final int method711(boolean arg0) {
        ++field3203;
        return !arg0 ? -66 : this.field3210 & 65535;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(ILea;)Lms;")
    public final class450 method696(int arg0, class58 arg1) {
        ++field3199;
        if (this.field3212 == null) {
            return null;
        } else {
            class309 var3 = arg1.method210();
            var3.method1866(super.field4110, super.field4109, super.field4108);
            class450 var4 = null;
            if (this.field3206) {
                var4 = class61.method494(-127, 1);
            }
            this.field3212.method896(var3, var4 != null ? var4.field6451[0] : null, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)Z")
    public final boolean method697(int arg0) {
        if (arg0 < 115) {
            method1497((byte) 107);
        }
        ++field3195;
        return this.field3215;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILea;Lac;ZII)V")
    public final void method699(int arg0, int arg1, class58 arg2, class216 arg3, boolean arg4, int arg5, int arg6) {
        ++field3223;
        if (arg3 instanceof class229) {
            class229 var8 = (class229) arg3;
            if (this.field3212 != null && var8.field3212 != null) {
                this.field3212.method869(var8.field3212, arg1, arg6, arg5, arg4);
            }
        }
        if (arg0 != 22546) {
            method1499((class76) null, (Object) null, -58);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lne;Ljava/lang/Object;I)V")
    public static final void method1499(class76 arg0, Object arg1, int arg2) {
        if (arg2 != 22) {
            method1500(-124, (class185) null, -97, 32, (class185) null, -103, -110, 22, -66, -102);
        }
        ++field3220;
        if (arg0.field1078 != null) {
            for (int var3 = 0; var3 < 50 && arg0.field1078.peekEvent() != null; ++var3) {
                class328.method1999(arg2 ^ 22, 1L);
            }
            if (arg1 != null) {
                arg0.field1078.postEvent(new ActionEvent(arg1, 1001, "dummy"));
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjq;IILjq;IIIII)V")
    public static final void method1500(int arg0, class185 arg1, int arg2, int arg3, class185 arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 != 15294) {
            method1499((class76) null, (Object) null, 31);
        }
        ++field3224;
        int var10 = arg1.method1293(arg5 + -15297);
        if (var10 != -1) {
            Object var11 = null;
            class77 var12 = (class77) class92.field1291.method2529(0, (long) var10);
            if (var12 == null) {
                class96[] var13 = class96.method748(class112.field1726, var10, 0);
                if (var13 == null) {
                    return;
                }
                var12 = class354.field4765.method199(var13[0], true);
                class92.field1291.method2527(arg5 + -15369, (long) var10, var12);
            }
            class193.method1341(arg7, arg3 >> 1, arg6, arg8 >> 1, 97, arg4.field44, 0, arg4.field40, arg4.method1285(arg5 ^ -15338) * 64);
            int var14 = arg0 - -class282.field3840[0] + -18;
            int var15 = class282.field3840[1] + -70 + arg9;
            int var16 = arg2 / 4 * 18 + var14;
            int var17 = arg2 % 4 * 18 + var15;
            var12.method616(var16, var17);
            if (arg1 == arg4) {
                class354.field4765.method460((byte) 48, var16 + -1, -256, 18, 18, var17 + -1);
            }
            class43 var18 = class366.method2282(arg5 ^ -16761922);
            var18.field567 = var17 + 16;
            var18.field565 = arg1;
            var18.field566 = var16 + 16;
            var18.field573 = var16;
            var18.field572 = var17;
            class196.field2838.method2483(var18, 0);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)Z")
    public final boolean method706(boolean arg0) {
        ++field3217;
        if (!arg0) {
            this.field3213 = -92;
        }
        return this.field3227;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public final void method708(int arg0) {
        if (arg0 == 26389) {
            ++field3209;
            if (this.field3212 != null) {
                this.field3212.method901();
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILde;BILea;Lvg;II)V")
    public static final void method1501(int arg0, int arg1, class165 arg2, byte arg3, int arg4, class58 arg5, class108 arg6, int arg7, int arg8) {
        ++field3207;
        int var9 = 2 % ((-12 - arg3) / 53);
        class430 var10 = class204.method1389(arg0, -6);
        if (var10 != null && var10.field5997 && var10.method2650((byte) 40)) {
            if (var10.field6007 != null) {
                int[] var11 = new int[var10.field6007.length];
                for (int var12 = 0; ~(var11.length / 2) < ~var12; ++var12) {
                    int var14;
                    if (class26.field337 == 4) {
                        var14 = (int) class332.field4483 & 16383;
                    } else {
                        var14 = 16383 & (int) class332.field4483 + class19.field249;
                    }
                    int var15 = class136.field2021[var14];
                    int var16 = class136.field2020[var14];
                    if (~class26.field337 != -5) {
                        var16 = var16 * 256 / (class129.field1950 + 256);
                        var15 = var15 * 256 / (class129.field1950 + 256);
                    }
                    var11[var12 * 2] = ((var10.field6007[var12 * 2] * 4 + arg7) * var16 + (var10.field6007[var12 * 2 + 1] * 4 + arg1) * var15 >> 15) + arg6.field1568 / 2 + arg4;
                    var11[var12 * 2 + 1] = arg6.field1577 / 2 + -((var10.field6007[var12 * 2 + 1] * 4 + arg1) * var16 - (var10.field6007[var12 * 2] * 4 + arg7) * var15 >> 15) + arg8;
                }
                class365.method2241(arg5, var11, var10.field6005, arg6.field1570, arg6.field1549);
                for (int var13 = 0; ~var13 > ~(var11.length / 2 + -1); ++var13) {
                    arg5.method246(var11[var13 * 2], var11[var13 * 2 + 1], var11[(var13 + 1) * 2], var11[(var13 + 1) * 2 + 1], var10.field6016, 1, arg2, arg4, arg8);
                }
                arg5.method246(var11[var11.length + -2], var11[var11.length + -1], var11[0], var11[1], var10.field6016, 1, arg2, arg4, arg8);
            }
            class77 var17 = null;
            if (~var10.field5990 != 0) {
                var17 = var10.method2648(false, arg5, -127);
                if (var17 != null) {
                    class4.method20(arg6, (byte) 79, arg7, arg1, var17, arg2, arg4, arg8);
                }
            }
            if (var10.field6018 != null) {
                int var18 = 0;
                if (var17 != null) {
                    var18 = var17.method631();
                }
                class61 var19 = class52.field669;
                class389 var20 = class254.field3521;
                if (~var10.field6030 == -2) {
                    var19 = class31.field432;
                    var20 = class387.field5363;
                }
                if (~var10.field6030 == -3) {
                    var19 = class269.field3685;
                    var20 = class280.field3810;
                }
                class356.method2135(var10.field6018, (byte) -118, arg8, var19, var18, arg6, arg7, var10.field6000, var20, arg2, arg1, arg4);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBZLea;)Lto;")
    private final class274 method1502(int arg0, byte arg1, boolean arg2, class58 arg3) {
        ++field3204;
        if (arg1 >= -56) {
            return null;
        } else {
            class447 var5 = class133.method996((byte) -19, this.field3210 & 65535);
            class323 var6;
            class323 var7;
            if (this.field3221) {
                var6 = class82.field1130[0];
                var7 = class125.field1879[this.field3205];
            } else {
                var7 = class82.field1130[this.field3205];
                if (this.field3205 >= 3) {
                    var6 = null;
                } else {
                    var6 = class82.field1130[this.field3205 - -1];
                }
            }
            return var5.method2761(var7, arg3, this.field3213, -783202211, arg2, 22, super.field4109, arg0, super.field4108, super.field4110, var6);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLea;)V")
    public final void method698(byte arg0, class58 arg1) {
        ++field3202;
        Object var3 = null;
        class210 var5;
        if (this.field3208 == null && this.field3227) {
            class274 var4 = this.method1502(131072, (byte) -123, true, arg1);
            var5 = var4 != null ? var4.field3745 : null;
        } else {
            var5 = this.field3208;
            this.field3208 = null;
        }
        if (var5 != null) {
            class259.method1669(var5, this.field3205, super.field4110, super.field4108, (boolean[]) null);
        }
        int var6 = 107 % ((24 - arg0) / 49);
    }

    static {
        new class368("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        new class368("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field3226 = new long[32];
    }
}
