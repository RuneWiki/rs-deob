import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class17 extends class141 implements class18 {

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "S")
    private short field234;

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "B")
    private byte field236;

    @OriginalMember(owner = "client!jf", name = "P", descriptor = "Z")
    private boolean field233;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "B")
    private byte field226;

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "Z")
    private boolean field235;

    @OriginalMember(owner = "client!jf", name = "L", descriptor = "B")
    private byte field229;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "Z")
    private boolean field218;

    @OriginalMember(owner = "client!jf", name = "W", descriptor = "Z")
    private boolean field240;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "Lqn;")
    private class380 field220;

    @OriginalMember(owner = "client!jf", name = "db", descriptor = "Lwp;")
    public class292 field247;

    @OriginalMember(owner = "client!jf", name = "N", descriptor = "Ljg;")
    public static class241 field231 = new class241(64);

    @OriginalMember(owner = "client!jf", name = "eb", descriptor = "I")
    public static int field248 = 1403;

    @OriginalMember(owner = "client!jf", name = "U", descriptor = "Lnn;")
    public static class151 field238 = new class151("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!jf", name = "ib", descriptor = "Lnn;")
    public static class151 field252 = new class151("K", "T", "K", "K");

    @OriginalMember(owner = "client!jf", name = "jb", descriptor = "Lrg;")
    public static class406 field253 = new class406("stellardawn", 1);

    @OriginalMember(owner = "client!jf", name = "kb", descriptor = "Lnn;")
    public static class151 field254 = new class151("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!jf", name = "M", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!jf", name = "X", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!jf", name = "Y", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!jf", name = "Z", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!jf", name = "ab", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!jf", name = "bb", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!jf", name = "cb", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!jf", name = "fb", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!jf", name = "gb", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!jf", name = "hb", descriptor = "[[[Ldc;")
    public static class13[][][] field251;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)Z")
    public final boolean method112(boolean arg0) {
        if (!arg0) {
            this.method10((class261) null, 29);
        }
        ++field227;
        return this.field235;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(Z)I")
    public final int method113(boolean arg0) {
        ++field245;
        if (arg0) {
            field252 = null;
        }
        return this.field247 != null ? this.field247.method1306() / 4 : 15;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
    public final void method11(int arg0) {
        if (arg0 != -21910) {
            this.field220 = null;
        }
        if (this.field247 != null) {
            this.field247.method1249();
        }
        ++field249;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(Ldr;I)Lkq;")
    public final class70 method10(class261 arg0, int arg1) {
        ++field222;
        if (this.field247 == null) {
            return null;
        } else {
            if (arg1 != 7) {
                this.method3((byte) -82);
            }
            class361 var3 = arg0.method434();
            var3.method611(super.field1900, super.field1888, super.field1892);
            class70 var4 = null;
            if (this.field233) {
                var4 = class383.method2309(-81, 1);
            }
            this.field247.method1282(var3, var4 != null ? var4.field899[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLdr;)V")
    public final void method2(byte arg0, class261 arg1) {
        ++field243;
        Object var3 = null;
        if (arg0 != 76) {
            this.field234 = 40;
        }
        class380 var5;
        if (this.field220 == null && this.field240) {
            class221 var4 = this.method115((byte) 0, 131072, arg1, true);
            var5 = var4 != null ? var4.field3366 : null;
        } else {
            var5 = this.field220;
            this.field220 = null;
        }
        if (var5 != null) {
            class177.method1080(var5, this.field229, super.field1900, super.field1892, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Z")
    public final boolean method1(int arg0) {
        ++field221;
        int var2 = 57 % ((arg0 - -1) / 46);
        return this.field240;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Ldr;Lfq;IIIIIZIIIIIIZ)V")
    public class17(class261 arg0, class85 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field1181 == -2, class185.method1129(arg12, (byte) -125, arg13));
        this.field234 = (short) arg1.field1156;
        this.field236 = (byte) arg13;
        this.field233 = ~arg1.field1184 != -1 && !arg7;
        this.field226 = (byte) arg12;
        this.field235 = arg14;
        this.field229 = (byte) arg3;
        this.field218 = arg7;
        this.field240 = arg0.method427() && arg1.field1158 && !this.field218 && class97.field1334 != 0;
        int var16 = 1024;
        if (this.field235) {
            var16 |= 32768;
        }
        class221 var17 = this.method115((byte) 0, var16, arg0, this.field240);
        if (var17 != null) {
            this.field220 = var17.field3366;
            this.field247 = var17.field3362;
            if (this.field235) {
                this.field247 = this.field247.method1264((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILdr;I)Lwp;")
    private final class292 method114(int arg0, class261 arg1, int arg2) {
        if (arg2 != 15) {
            return null;
        } else {
            ++field241;
            if (this.field247 != null && arg1.method372(this.field247.method1274(), arg0) == 0) {
                return this.field247;
            } else {
                class221 var4 = this.method115((byte) 0, arg0, arg1, false);
                return var4 == null ? null : var4.field3362;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BILdr;Z)Luq;")
    private final class221 method115(byte arg0, int arg1, class261 arg2, boolean arg3) {
        ++field217;
        class85 var5 = class411.method2575(0, this.field234 & 65535);
        if (arg0 != 0) {
            this.method9(82);
        }
        class143 var6;
        class143 var7;
        if (!this.field218) {
            if (~this.field229 > -4) {
                var6 = class85.field1201[this.field229 + 1];
            } else {
                var6 = null;
            }
            var7 = class85.field1201[this.field229];
        } else {
            var7 = class154.field2118[this.field229];
            var6 = class85.field1201[0];
        }
        return var5.method538(var6, arg0 + -109, super.field1892, this.field226 == 11 ? this.field236 + 4 : this.field236, ~this.field226 != -12 ? this.field226 : 10, var7, arg1, super.field1888, arg2, super.field1900, arg3);
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(Ldr;I)V")
    public final void method15(class261 arg0, int arg1) {
        if (arg1 > 114) {
            ++field237;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ldr;I)V")
    public final void method6(class261 arg0, int arg1) {
        if (arg1 <= -68) {
            ++field228;
            Object var3 = null;
            class380 var5;
            if (this.field220 == null && this.field240) {
                class221 var4 = this.method115((byte) 0, 131072, arg0, true);
                var5 = var4 != null ? var4.field3366 : null;
            } else {
                var5 = this.field220;
                this.field220 = null;
            }
            if (var5 != null) {
                class85.method557(var5, this.field229, super.field1900, super.field1892, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)I")
    public final int method7(boolean arg0) {
        if (!arg0) {
            field231 = null;
        }
        ++field230;
        return 65535 & this.field234;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
    public final void method116(byte arg0) {
        this.field235 = false;
        ++field244;
        if (this.field247 != null) {
            this.field247.method1277(-32769 & this.field247.method1274());
        }
        if (arg0 > -45) {
            this.method116((byte) -104);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZILla;IIILdr;)V")
    public final void method117(boolean arg0, int arg1, class269 arg2, int arg3, int arg4, int arg5, class261 arg6) {
        if (arg2 instanceof class136) {
            class136 var8 = (class136) arg2;
            if (this.field247 != null && var8.field1823 != null) {
                this.field247.method1273(var8.field1823, arg3, arg4, arg5, arg0);
            }
        } else if (arg2 instanceof class17) {
            class17 var9 = (class17) arg2;
            if (this.field247 != null && var9.field247 != null) {
                this.field247.method1273(var9.field247, arg3, arg4, arg5, arg0);
            }
        }
        ++field224;
        if (arg1 != 0) {
            this.field229 = 120;
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(B)V")
    public static void method118(byte arg0) {
        field254 = null;
        field252 = null;
        field231 = null;
        field238 = null;
        field253 = null;
        if (arg0 != 48) {
            field248 = -101;
        }
        field251 = null;
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)V")
    public static final void method119(int arg0) {
        class405.method2543(class14.field173, 127);
        ++field219;
        ++class314.field4764;
        if (class406.field6040 && class72.field956) {
            int var1 = class74.field1004.method505((byte) -127);
            int var2 = class74.field1004.method501(88);
            int var3 = var1 - class247.field3703;
            if (arg0 != -36) {
                method119(10);
            }
            int var4 = var2 - class146.field2029;
            if (~class314.field4764 < ~class14.field173.field2578) {
                int var5 = var3 - class98.field1358;
                int var6 = var4 - class5.field63;
                if (class14.field173.field2516 < var5 || var5 < -class14.field173.field2516 || var6 > class14.field173.field2516 || var6 < -class14.field173.field2516) {
                    class365.field5368 = true;
                }
            }
            if (~var3 > ~class456.field6764) {
                var3 = class456.field6764;
            }
            if (~class446.field6574 < ~var4) {
                var4 = class446.field6574;
            }
            if (~(var3 - -class14.field173.field2561) < ~(class456.field6764 - -class402.field6011.field2561)) {
                var3 = class456.field6764 - -class402.field6011.field2561 + -class14.field173.field2561;
            }
            if (class446.field6574 - -class402.field6011.field2501 < class14.field173.field2501 + var4) {
                var4 = class446.field6574 - (-class402.field6011.field2501 + class14.field173.field2501);
            }
            int var7 = -class456.field6764 + class402.field6011.field2521 + var3;
            int var8 = var4 - class446.field6574 + class402.field6011.field2559;
            if (class14.field173.field2583 != null && class365.field5368) {
                class327 var9 = new class327();
                var9.field4909 = class14.field173;
                var9.field4905 = var7;
                var9.field4908 = class14.field173.field2583;
                var9.field4911 = var8;
                class384.method2316(var9);
            }
            if (!class74.field1004.method499(104)) {
                if (!class365.field5368) {
                    if ((~class412.field6129 == -2 || class328.method2024(false)) && class149.field2067 > 2) {
                        class364.method2183(class98.field1358 + class247.field3703, 2, class146.field2029 - -class5.field63, (byte) 113);
                    } else if (class106.method662((byte) -128)) {
                        class364.method2183(class98.field1358 + class247.field3703, 0, class146.field2029 - -class5.field63, (byte) 124);
                    }
                } else {
                    if (class14.field173.field2515 != null) {
                        class327 var10 = new class327();
                        var10.field4913 = class405.field6031;
                        var10.field4908 = class14.field173.field2515;
                        var10.field4909 = class14.field173;
                        var10.field4911 = var8;
                        var10.field4905 = var7;
                        class384.method2316(var10);
                    }
                    if (class405.field6031 != null && client.method2785(class14.field173) != null) {
                        class132.method782(class405.field6031, -86, class14.field173);
                    }
                }
                class14.field173 = null;
            }
        } else {
            if (class314.field4764 > 1) {
                class14.field173 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)I")
    public final int method3(byte arg0) {
        if (arg0 >= -3) {
            return 27;
        } else {
            ++field239;
            return this.field236;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILdr;I)Z")
    public final boolean method4(int arg0, int arg1, class261 arg2, int arg3) {
        ++field242;
        class292 var5 = this.method114(65536, arg2, 15);
        if (arg3 != 2) {
            return true;
        } else if (var5 != null) {
            class361 var6 = arg2.method434();
            var6.method611(super.field1900, super.field1888, super.field1892);
            return var5.method1297(arg0, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(Z)I")
    public final int method120(boolean arg0) {
        ++field225;
        if (arg0) {
            return 40;
        } else {
            return this.field247 == null ? 0 : this.field247.method1263();
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ldr;IB)Lwp;")
    public final class292 method12(class261 arg0, int arg1, byte arg2) {
        ++field246;
        int var4 = 84 / ((arg2 - 46) / 47);
        return this.method114(arg1, arg0, 15);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)I")
    public final int method9(int arg0) {
        ++field223;
        return arg0 < 26 ? 21 : this.field226;
    }
}
