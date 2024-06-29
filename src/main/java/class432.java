import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class432 extends class210 {

    @OriginalMember(owner = "client!lo", name = "O", descriptor = "I")
    private int field6291 = 4096;

    @OriginalMember(owner = "client!lo", name = "M", descriptor = "I")
    private int field6289 = 0;

    @OriginalMember(owner = "client!lo", name = "N", descriptor = "Lbn;")
    public static class160 field6290 = new class160(69, -1);

    @OriginalMember(owner = "client!lo", name = "R", descriptor = "Lbn;")
    public static class160 field6294;

    @OriginalMember(owner = "client!lo", name = "U", descriptor = "Lvq;")
    public static class24 field6297;

    @OriginalMember(owner = "client!lo", name = "W", descriptor = "Lvq;")
    public static class24 field6299;

    @OriginalMember(owner = "client!lo", name = "X", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!lo", name = "I", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!lo", name = "K", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!lo", name = "L", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!lo", name = "P", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!lo", name = "Q", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!lo", name = "S", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!lo", name = "V", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!lo", name = "T", descriptor = "Lsd;")
    public static class71 field6296;

    static {
        new class409((String) null, "bevor du die Option 'Regelverstoß melden' benutzt.", (String) null, (String) null);
        field6294 = new class160(38, -1);
        new class409("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field6297 = new class24(56, 12);
        field6299 = new class24(44, 6);
        field6300 = 0;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(II)Lfo;", line = 3)
    public static final class234 method2650(int arg0, int arg1) {
        ++field6293;
        class234 var2 = (class234) class160.field2138.method2310((byte) -127, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class446.field6487.method715(arg0, (byte) 112, arg1);
            class234 var4 = new class234();
            if (var3 != null) {
                var4.method1589(arg0, new class256(var3), 26970);
            }
            class160.field2138.method2299(true, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILat;)V", line = 23)
    public final void method56(int arg0, int arg1, class256 arg2) {
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field6291 = arg2.method1767(arg1 + 1930505517);
            }
        } else {
            this.field6289 = arg2.method1767(arg1 ^ -1930481709);
        }
        if (arg1 != -11941) {
            method2654(-72, 123, 115, (class223) null);
        }
        ++field6285;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "([II[ILwc;[I)V", line = 61)
    public static final void method2651(int[] arg0, int arg1, int[] arg2, class380 arg3, int[] arg4) {
        ++field6295;
        if (arg1 <= -3) {
            for (int var5 = 0; ~var5 > ~arg2.length; ++var5) {
                int var6 = arg2[var5];
                int var7 = arg0[var5];
                int var8 = arg4[var5];
                for (int var9 = 0; ~var7 != -1 && arg3.field758.length > var9; ++var9) {
                    if ((1 & var7) != 0) {
                        if (~var6 != 0) {
                            class196 var10 = class83.method556(var6, 76);
                            int var11 = var10.field2769;
                            class69 var12 = arg3.field758[var9];
                            if (var12 != null) {
                                if (var12.field908 == var6) {
                                    if (~var11 == -1) {
                                        var12 = arg3.field758[var9] = null;
                                    } else if (~var11 == -2) {
                                        var12.field909 = var8;
                                        var12.field911 = 0;
                                        var12.field910 = 1;
                                        var12.field913 = 0;
                                        var12.field906 = 0;
                                        class446.method2739(var10, class187.field2619 == arg3, arg3.field4960, 0, -49, arg3.field4954, arg3.field4951);
                                    } else if (var11 == 2) {
                                        var12.field906 = 0;
                                    }
                                } else if (var10.field2775 >= class83.method556(var12.field908, 68).field2775) {
                                    var12 = arg3.field758[var9] = null;
                                }
                            }
                            if (var12 == null) {
                                class69 var13 = arg3.field758[var9] = new class69();
                                var13.field911 = 0;
                                var13.field906 = 0;
                                var13.field909 = var8;
                                var13.field910 = 1;
                                var13.field908 = var6;
                                var13.field913 = 0;
                                class446.method2739(var10, class187.field2619 == arg3, arg3.field4960, 0, -49, arg3.field4954, arg3.field4951);
                            }
                        } else {
                            arg3.field758[var9] = null;
                        }
                    }
                    var7 >>>= 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V", line = 158)
    public class432() {
        super(1, true);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lgk;Lgk;I)V", line = 162)
    public static final void method2652(class264 arg0, class264 arg1, int arg2) {
        ++field6287;
        if (arg0.field3908 != null) {
            arg0.method1820(-25246);
        }
        arg0.field3906 = arg1;
        arg0.field3908 = arg1.field3908;
        arg0.field3908.field3906 = arg0;
        arg0.field3906.field3908 = arg0;
        if (arg2 != 16139) {
            field6297 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "(I)V", line = 197)
    public static void method2653(int arg0) {
        field6297 = null;
        if (arg0 == -24710) {
            field6294 = null;
            field6299 = null;
            field6290 = null;
            field6296 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IB)[I", line = 218)
    public final int[] method361(int arg0, byte arg1) {
        ++field6292;
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (super.field2950.field4111) {
            int[] var4 = this.method1447(arg0, -112, 0);
            for (int var5 = 0; var5 < class202.field2852; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field6289 <= var6 && ~var6 >= ~this.field6291 ? 4096 : 0;
            }
        }
        if (arg1 != -38) {
            this.field6291 = -103;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIILkg;)V", line = 252)
    public static final void method2654(int arg0, int arg1, int arg2, class223 arg3) {
        if (arg1 != 69) {
            field6296 = null;
        }
        ++field6288;
        if (!class147.field1993) {
            for (int var4 = 9; var4 >= 5; --var4) {
                String var8 = class328.method2146(arg3, var4, 2);
                if (var8 != null) {
                    ++class344.field5055;
                    class463.method2862(class195.method1358(94, arg3, var4), arg3.field3223, false, true, var8, (long) (var4 - -1), arg3.field3212, (byte) -115, 1004, arg3.field3270);
                }
            }
            String var5 = class58.method436(arg3, 108);
            if (var5 != null) {
                ++class305.field4465;
                class463.method2862(arg3.field3313, arg3.field3223, false, true, var5, 0L, arg3.field3212, (byte) -111, 57, arg3.field3270);
            }
            for (int var6 = 4; ~var6 <= -1; --var6) {
                String var7 = class328.method2146(arg3, var6, 2);
                if (var7 != null) {
                    ++class344.field5055;
                    class463.method2862(class195.method1358(49, arg3, var6), arg3.field3223, false, true, var7, (long) (var6 - -1), arg3.field3212, (byte) -103, 13, arg3.field3270);
                }
            }
            if (client.method1811(arg3).method2174(3165991)) {
                ++class364.field5262;
                if (arg3.field3266 == null) {
                    class463.method2862(-1, arg3.field3223, false, true, class1.field20.method2543(false, class153.field2073), 0L, "", (byte) -121, 50, arg3.field3270);
                    return;
                }
                class463.method2862(-1, arg3.field3223, false, true, arg3.field3266, 0L, "", (byte) -104, 50, arg3.field3270);
                return;
            }
        } else {
            if (!client.method1811(arg3).method2168((byte) -39) || ~(class433.field6315 & 32) == -1) {
                return;
            }
            ++class301.field4389;
            class463.method2862(class90.field1107, arg3.field3223, false, true, class253.field3723, 0L, class429.field6240 + " -> " + arg3.field3212, (byte) -101, 2, arg3.field3270);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BI)Lkg;", line = 329)
    public static final class223 method2655(byte arg0, int arg1) {
        ++field6286;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 65535;
        if (class444.field6470[var2] == null || class444.field6470[var2][var3] == null) {
            boolean var4 = class103.method695(var2, -117);
            if (!var4) {
                return null;
            }
        }
        return arg0 > -62 ? null : class444.field6470[var2][var3];
    }
}
