import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class430 extends class323 implements class438 {

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "Z")
    private boolean field6251;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "S")
    private short field6261;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "B")
    private byte field6258;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "Z")
    private boolean field6274;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "Z")
    private boolean field6246;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "B")
    private byte field6259;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "Z")
    private boolean field6262;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "Lqh;")
    private class337 field6247;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "Lbi;")
    private class143 field6248;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "Lbn;")
    public static class160 field6245 = new class160(10, 7);

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "Ljn;")
    public static class409 field6255 = new class409("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "Ljn;")
    public static class409 field6266 = new class409("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "[Ljava/awt/Color;")
    public static Color[] field6273 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "Lct;")
    public static class104 field6263;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "[I")
    public static int[] field6250;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)V", line = 3)
    public static void method2643(boolean arg0) {
        field6266 = null;
        field6263 = null;
        if (arg0) {
            method2647(100, 45, 66, 50);
        }
        field6245 = null;
        field6273 = null;
        field6250 = null;
        field6255 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)I", line = 21)
    public final int method1(int arg0) {
        if (arg0 > -72) {
            this.method4(20);
        }
        ++field6256;
        return this.field6258;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)I", line = 32)
    public final int method9(byte arg0) {
        ++field6249;
        if (arg0 <= 102) {
            this.field6274 = true;
        }
        return this.field6261 & 65535;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(ILfp;)V", line = 43)
    public final void method14(int arg0, class9 arg1) {
        ++field6271;
        if (arg0 != -7561) {
            method2645((class256) null, false);
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lfp;Lgn;IIIIZIZ)V", line = 55)
    public class430(class9 arg0, class178 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field2467, arg1.field2466);
        this.field6251 = arg6;
        this.field6261 = (short) arg1.field2455;
        super.field4771 = (short) arg3;
        this.field6258 = (byte) arg7;
        this.field6274 = arg8;
        super.field4764 = (short) arg5;
        this.field6246 = ~arg1.field2479 != -1 && !arg6;
        this.field6259 = (byte) arg2;
        this.field6262 = arg0.method94() && arg1.field2478 && !this.field6251 && ~class213.field3010 != -1;
        int var10 = 1024;
        if (this.field6274) {
            var10 |= 32768;
        }
        class441 var11 = this.method2644(false, arg0, var10, this.field6262);
        if (var11 != null) {
            this.field6247 = var11.field6419;
            this.field6248 = var11.field6414;
            if (this.field6274) {
                this.field6248 = this.field6248.method966((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLfp;IZ)Lwk;", line = 90)
    private final class441 method2644(boolean arg0, class9 arg1, int arg2, boolean arg3) {
        ++field6260;
        class178 var5 = class450.method2785(this.field6261 & 65535, (byte) 124);
        if (arg0) {
            return null;
        } else {
            class378 var6;
            class378 var7;
            if (this.field6251) {
                var6 = class161.field2151[this.field6259];
                var7 = class28.field401[0];
            } else {
                var6 = class28.field401[this.field6259];
                if (~this.field6259 <= -4) {
                    var7 = null;
                } else {
                    var7 = class28.field401[this.field6259 - -1];
                }
            }
            return var5.method1238(var7, super.field4764, super.field4771, 22, arg3, super.field4766, arg1, arg2, 84, var6, this.field6258);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lat;Z)V", line = 120)
    public static final void method2645(class256 arg0, boolean arg1) {
        ++field6244;
        int var2 = arg0.method1740(128);
        class296.field4317 = new class153[var2];
        for (int var3 = 0; ~var2 < ~var3; ++var3) {
            class296.field4317[var3] = new class153();
            class296.field4317[var3].field2068 = arg0.method1740(128);
            class296.field4317[var3].field2070 = arg0.method1737((byte) -103);
        }
        class377.field5524 = arg0.method1740(128);
        class323.field4776 = arg0.method1740(128);
        class228.field3434 = arg0.method1740(128);
        class388.field5675 = new class177[class323.field4776 - (class377.field5524 - 1)];
        if (!arg1) {
            for (int var4 = 0; var4 < class228.field3434; ++var4) {
                int var5 = arg0.method1740(128);
                class177 var6 = class388.field5675[var5] = new class177();
                var6.field1835 = arg0.method1738((byte) 58);
                var6.field1845 = arg0.method1746(20972);
                var6.field2445 = var5 - -class377.field5524;
                var6.field2451 = arg0.method1737((byte) -74);
                var6.field2448 = arg0.method1737((byte) -95);
            }
            class92.field1149 = arg0.method1746(20972);
            class296.field4310 = true;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lfp;I)V", line = 167)
    public final void method7(class9 arg0, int arg1) {
        ++field6252;
        if (arg1 < 98) {
            field6263 = null;
        }
        Object var3 = null;
        class337 var5;
        if (this.field6247 == null && this.field6262) {
            class441 var4 = this.method2644(false, arg0, 131072, true);
            var5 = var4 != null ? var4.field6419 : null;
        } else {
            var5 = this.field6247;
            this.field6247 = null;
        }
        if (var5 != null) {
            class163.method1079(var5, this.field6259, super.field4771, super.field4764, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)Z", line = 195)
    public final boolean method15(boolean arg0) {
        ++field6270;
        return !arg0 ? true : this.field6262;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lfp;IB)Lbi;", line = 211)
    private final class143 method2646(class9 arg0, int arg1, byte arg2) {
        if (arg2 >= -64) {
            field6266 = null;
        }
        ++field6254;
        if (this.field6248 != null && arg0.method85(this.field6248.method961(), arg1) == 0) {
            return this.field6248;
        } else {
            class441 var4 = this.method2644(false, arg0, arg1, false);
            return var4 == null ? null : var4.field6414;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lfp;Z)V", line = 231)
    public final void method10(class9 arg0, boolean arg1) {
        if (!arg1) {
            ++field6269;
            Object var3 = null;
            class337 var5;
            if (this.field6247 == null && this.field6262) {
                class441 var4 = this.method2644(false, arg0, 131072, true);
                var5 = var4 != null ? var4.field6419 : null;
            } else {
                var5 = this.field6247;
                this.field6247 = null;
            }
            if (var5 != null) {
                class146.method1013(var5, this.field6259, super.field4771, super.field4764, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)I", line = 259)
    public final int method6(int arg0) {
        ++field6264;
        if (arg0 != -20839) {
            this.method5((class9) null, -92, -58, 53);
        }
        return 22;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V", line = 276)
    public final void method4(int arg0) {
        if (arg0 == -27030) {
            ++field6272;
            if (this.field6248 != null) {
                this.field6248.method948();
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lfp;Lje;ZIIII)V", line = 293)
    public final void method32(class9 arg0, class309 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 instanceof class430) {
            class430 var8 = (class430) arg1;
            if (this.field6248 != null && var8.field6248 != null) {
                this.field6248.method963(var8.field6248, arg4, arg3, arg6, arg2);
            }
        }
        ++field6268;
        if (arg5 >= -31) {
            this.method10((class9) null, true);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lfp;III)Z", line = 314)
    public final boolean method5(class9 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -754) {
            this.method2644(true, (class9) null, -18, false);
        }
        ++field6243;
        class143 var5 = this.method2646(arg0, 65536, (byte) -75);
        if (var5 != null) {
            class187 var6 = arg0.method145();
            var6.method831(super.field4771, super.field4766, super.field4764);
            return var5.method988(arg3, arg1, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lfp;II)Lbi;", line = 335)
    public final class143 method11(class9 arg0, int arg1, int arg2) {
        ++field6257;
        return arg2 != -23109 ? null : this.method2646(arg0, arg1, (byte) -122);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILfp;)Luq;", line = 346)
    public final class241 method2(int arg0, class9 arg1) {
        ++field6267;
        if (arg0 >= -125) {
            field6245 = null;
        }
        if (this.field6248 == null) {
            return null;
        } else {
            class187 var3 = arg1.method145();
            var3.method831(super.field4771, super.field4766, super.field4764);
            class241 var4 = null;
            if (this.field6246) {
                var4 = class395.method2485(-29083, 1);
            }
            this.field6248.method947(var3, var4 == null ? null : var4.field3578[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V", line = 374)
    public final void method33(int arg0) {
        this.field6274 = false;
        if (arg0 >= 109) {
            ++field6253;
            if (this.field6248 != null) {
                this.field6248.method975(this.field6248.method961() & -32769);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)Z", line = 391)
    public final boolean method34(byte arg0) {
        int var2 = -127 % ((arg0 - -19) / 44);
        ++field6265;
        return this.field6274;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)V", line = 414)
    public static final void method2647(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 << 3;
        ++field6275;
        int var5 = arg2 << 3;
        int var6 = arg1 << 3;
        class170.field2220 = (float) var5;
        class1.field19 = (float) var4;
        if (arg3 == -1) {
            if (~class28.field402 == -3) {
                class86.field1067 = var6;
                class136.field1867 = var4;
                class103.field1341 = var5;
            }
            class129.method862(true);
            class373.field5455 = true;
        }
    }
}
