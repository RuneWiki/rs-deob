import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class163 extends class5 implements class223 {

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "B")
    private byte field2303;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "Z")
    private boolean field2311;

    @OriginalMember(owner = "client!tf", name = "X", descriptor = "B")
    private byte field2321;

    @OriginalMember(owner = "client!tf", name = "ab", descriptor = "B")
    private byte field2324;

    @OriginalMember(owner = "client!tf", name = "ib", descriptor = "Z")
    private boolean field2332;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "S")
    private short field2316;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "Z")
    private boolean field2304;

    @OriginalMember(owner = "client!tf", name = "Z", descriptor = "Z")
    private boolean field2323;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "Llb;")
    private class210 field2307;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "Lts;")
    public class116 field2308;

    @OriginalMember(owner = "client!tf", name = "hb", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!tf", name = "U", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!tf", name = "V", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!tf", name = "W", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!tf", name = "Y", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!tf", name = "bb", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!tf", name = "cb", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!tf", name = "db", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!tf", name = "gb", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!tf", name = "jb", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!tf", name = "eb", descriptor = "Lij;")
    public static class316 field2328;

    @OriginalMember(owner = "client!tf", name = "fb", descriptor = "[I")
    public static int[] field2329;

    static {
        new class368("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field2331 = 0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)Z", line = 4)
    public final boolean method706(boolean arg0) {
        ++field2320;
        if (!arg0) {
            this.field2308 = null;
        }
        return this.field2323;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lea;IBZ)Lto;", line = 15)
    private final class274 method1174(class58 arg0, int arg1, byte arg2, boolean arg3) {
        if (arg2 != 113) {
            return null;
        } else {
            ++field2327;
            class447 var5 = class133.method996((byte) -19, 65535 & this.field2316);
            class323 var6;
            class323 var7;
            if (!this.field2304) {
                if (this.field2324 >= 3) {
                    var6 = null;
                } else {
                    var6 = class82.field1130[this.field2324 - -1];
                }
                var7 = class82.field1130[this.field2324];
            } else {
                var6 = class82.field1130[0];
                var7 = class125.field1879[this.field2324];
            }
            return var5.method2761(var7, arg0, ~this.field2321 == -12 ? this.field2303 + 4 : this.field2303, -783202211, arg3, ~this.field2321 == -12 ? 10 : this.field2321, super.field45, arg1, super.field44, super.field40, var6);
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(Z)I", line = 49)
    public final int method711(boolean arg0) {
        if (!arg0) {
            return -89;
        } else {
            ++field2305;
            return this.field2316 & 65535;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lea;I)V", line = 61)
    public final void method707(class58 arg0, int arg1) {
        ++field2315;
        if (arg1 > -99) {
            this.field2332 = false;
        }
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)I", line = 71)
    public final int method23(int arg0) {
        ++field2325;
        if (arg0 >= -84) {
            return -88;
        } else {
            return this.field2308 != null ? this.field2308.method889() : 0;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lea;IILve;III[[[B[I[I[I[I[IIBIIZ)V", line = 83)
    public static final void method1175(class58 arg0, int arg1, int arg2, class309 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class389.field5413 = arg0;
        class118.field1801 = arg1;
        class253.field3512 = arg3;
        class346.field4681 = class389.field5413.method264() > 0;
        class58.field750 = arg4 >> 7;
        class446.field6253 = arg6 >> 7;
        class136.field2023 = arg4;
        class373.field5175 = arg6;
        class416.field5769 = arg5;
        class92.field1293 = class58.field750 - class244.field3440;
        if (class92.field1293 < 0) {
            class5.field56 = -class92.field1293;
            class92.field1293 = 0;
        } else {
            class5.field56 = 0;
        }
        class371.field5146 = class446.field6253 - class244.field3440;
        if (class371.field5146 < 0) {
            class85.field1203 = -class371.field5146;
            class371.field5146 = 0;
        } else {
            class85.field1203 = 0;
        }
        class186.field2698 = class58.field750 + class244.field3440;
        if (class186.field2698 > class284.field3862) {
            class186.field2698 = class284.field3862;
        }
        class218.field3063 = class446.field6253 + class244.field3440;
        if (class218.field3063 > class354.field4768) {
            class218.field3063 = class354.field4768;
        }
        for (int var18 = 0; var18 < class244.field3440 + class244.field3440 + 2; ++var18) {
            for (int var23 = 0; var23 < class244.field3440 + class244.field3440 + 2; ++var23) {
                int var24 = class58.field750 - class244.field3440 + var18;
                int var25 = class446.field6253 - class244.field3440 + var23;
                if (var24 >= 0 && var25 >= 0 && var24 < class284.field3862 && var25 < class354.field4768) {
                    int var26 = var24 << 7;
                    int var27 = var25 << 7;
                    int var28 = class82.field1130[3].method329(var24, var25) - 1000;
                    int var29 = class125.field1879 != null ? class125.field1879[0].method329(var24, var25) + 128 : class82.field1130[0].method329(var24, var25) + 128;
                    class450.field6457[var18][var23] = class389.field5413.method261(var26, var28, var27, var26, var29, var27);
                } else {
                    class450.field6457[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class244.field3440 + class244.field3440 + 1; ++var19) {
            for (int var22 = 0; var22 < class244.field3440 + class244.field3440 + 1; ++var22) {
                class6.field62[var19][var22] = class450.field6457[var19][var22] || class450.field6457[var19 + 1][var22] || class450.field6457[var19][var22 + 1] || class450.field6457[var19 + 1][var22 + 1];
            }
        }
        class348.field4698 = arg8;
        class183.field2570 = arg9;
        class144.field2107 = arg10;
        class24.field310 = arg11;
        class276.field3763 = arg12;
        class395.method2457();
        class375.method2344(11038);
        for (class450 var20 = (class450) class345.field4667.method2480(7904); var20 != null; var20 = (class450) class345.field4667.method2482(50)) {
            var20.method2695(0);
            class72.method571(true, var20);
        }
        if (class346.field4681) {
            for (int var21 = 0; var21 < class406.field5615; ++var21) {
                class122.field1838[var21].method1719(arg1, 0, arg17);
            }
        }
        if (arg2 > 1) {
            class389.field5413.method237(0);
            if (class316.field4283 == null || class316.field4283 instanceof class248) {
                class316.field4283 = new class242();
            }
        } else if (class316.field4283 == null || class316.field4283 instanceof class242) {
            class316.field4283 = new class248();
        }
        class316.field4283.method1571(arg2, false);
        class316.field4283.method1578(38);
        if (class304.field4147 != null) {
            class171.method1227(true);
            class316.field4283.method1574((byte) 40, 22);
            class372.method2331(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class316.field4283.method1578(45);
            class316.field4283.method1574((byte) 2, 23);
            class171.method1227(false);
        }
        class372.method2331(arg2, arg7, arg13, arg14, arg15, arg16);
        class316.field4283.method1578(115);
        class316.field4283.method1579(-22563);
        class316.field4283.method1578(13);
        if (arg2 > 1) {
            class389.field5413.method181(0);
        }
        class389.field5413.method247(0, (class155[]) null);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 243)
    public final void method708(int arg0) {
        ++field2306;
        if (arg0 != 26389) {
            this.field2303 = 44;
        }
        if (this.field2308 != null) {
            this.field2308.method901();
        }
    }

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "(I)I", line = 258)
    public final int method1176(int arg0) {
        ++field2310;
        if (arg0 > -107) {
            this.field2324 = 127;
        }
        return this.field2308 != null ? this.field2308.method871() / 4 : 15;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILea;Lac;ZII)V", line = 269)
    public final void method699(int arg0, int arg1, class58 arg2, class216 arg3, boolean arg4, int arg5, int arg6) {
        ++field2318;
        if (arg3 instanceof class451) {
            class451 var8 = (class451) arg3;
            if (this.field2308 != null && var8.field6473 != null) {
                this.field2308.method869(var8.field6473, arg1, arg6, arg5, arg4);
            }
        } else if (arg3 instanceof class163) {
            class163 var9 = (class163) arg3;
            if (this.field2308 != null && var9.field2308 != null) {
                this.field2308.method869(var9.field2308, arg1, arg6, arg5, arg4);
            }
        }
        if (arg0 != 22546) {
            this.field2303 = 54;
        }
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)Z", line = 300)
    public final boolean method697(int arg0) {
        if (arg0 <= 115) {
            this.method1174((class58) null, 105, (byte) -112, true);
        }
        ++field2309;
        return this.field2332;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)I", line = 313)
    public final int method695(int arg0) {
        ++field2322;
        return arg0 != 898 ? -72 : this.field2321;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLea;)V", line = 324)
    public final void method698(byte arg0, class58 arg1) {
        int var3 = -64 % ((arg0 - 24) / 49);
        ++field2312;
        Object var4 = null;
        class210 var6;
        if (this.field2307 == null && this.field2323) {
            class274 var5 = this.method1174(arg1, 131072, (byte) 113, true);
            var6 = var5 != null ? var5.field3745 : null;
        } else {
            var6 = this.field2307;
            this.field2307 = null;
        }
        if (var6 != null) {
            class259.method1669(var6, this.field2324, super.field40, super.field44, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)I", line = 358)
    public final int method709(int arg0) {
        if (arg0 != 30030) {
            field2328 = null;
        }
        ++field2330;
        return this.field2303;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lea;IB)Lts;", line = 371)
    private final class116 method1177(class58 arg0, int arg1, byte arg2) {
        ++field2326;
        if (this.field2308 != null && ~arg0.method187(this.field2308.method866(), arg1) == -1) {
            return this.field2308;
        } else {
            class274 var4 = this.method1174(arg0, arg1, (byte) 113, false);
            if (arg2 >= -19) {
                field2329 = null;
            }
            return var4 != null ? var4.field3748 : null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lea;Lp;IIIIIZIIIIIIZ)V", line = 401)
    public class163(class58 arg0, class447 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field6308 == 1, class152.method1119(arg12, 0, arg13));
        this.field2303 = (byte) arg13;
        this.field2311 = ~arg1.field6297 != -1 && !arg7;
        this.field2321 = (byte) arg12;
        this.field2324 = (byte) arg3;
        this.field2332 = arg14;
        this.field2316 = (short) arg1.field6323;
        this.field2304 = arg7;
        this.field2323 = arg0.method218() && arg1.field6332 && !this.field2304 && class228.field3188 != 0;
        int var16 = 1024;
        if (this.field2332) {
            var16 |= 32768;
        }
        class274 var17 = this.method1174(arg0, var16, (byte) 113, this.field2323);
        if (var17 != null) {
            this.field2307 = var17.field3745;
            this.field2308 = var17.field3748;
            if (this.field2332) {
                this.field2308 = this.field2308.method907((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lea;BI)Lts;", line = 433)
    public final class116 method705(class58 arg0, byte arg1, int arg2) {
        if (arg1 != -63) {
            this.method698((byte) 32, (class58) null);
        }
        ++field2333;
        return this.method1177(arg0, arg2, (byte) -97);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILea;)V", line = 444)
    public final void method704(int arg0, class58 arg1) {
        if (arg0 == -29096) {
            ++field2317;
            Object var3 = null;
            class210 var5;
            if (this.field2307 == null && this.field2323) {
                class274 var4 = this.method1174(arg1, 131072, (byte) 113, true);
                var5 = var4 == null ? null : var4.field3745;
            } else {
                var5 = this.field2307;
                this.field2307 = null;
            }
            if (var5 != null) {
                class383.method2369(var5, this.field2324, super.field40, super.field44, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)V", line = 471)
    public static void method1178(byte arg0) {
        field2329 = null;
        field2328 = null;
        if (arg0 >= -13) {
            field2328 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(ILea;)Lms;", line = 482)
    public final class450 method696(int arg0, class58 arg1) {
        ++field2319;
        if (this.field2308 == null) {
            return null;
        } else {
            class309 var3 = arg1.method210();
            var3.method1866(super.field40, super.field45, super.field44);
            class450 var4 = null;
            if (this.field2311) {
                var4 = class61.method494(-105, 1);
            }
            this.field2308.method896(var3, var4 != null ? var4.field6451[0] : null, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 512)
    public final void method702(byte arg0) {
        this.field2332 = false;
        if (arg0 != 46) {
            this.method23(-44);
        }
        ++field2313;
        if (this.field2308 != null) {
            this.field2308.method897(this.field2308.method866() & -32769);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZILea;I)Z", line = 527)
    public final boolean method710(boolean arg0, int arg1, class58 arg2, int arg3) {
        ++field2314;
        class116 var5 = this.method1177(arg2, 65536, (byte) -72);
        if (var5 != null) {
            class309 var6 = arg2.method210();
            var6.method1866(super.field40, super.field45, super.field44);
            return var5.method898(arg3, arg1, var6, false);
        } else {
            return !arg0 ? false : false;
        }
    }
}
