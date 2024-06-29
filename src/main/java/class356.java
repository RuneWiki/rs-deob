import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class356 {

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Z")
    public static boolean field5013 = false;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Z")
    public static boolean field5017;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "[I")
    public static int[] field5018;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Ltq;")
    public static class376 field5016;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
    public static void method2269(boolean arg0) {
        field5016 = null;
        field5018 = null;
        if (!arg0) {
            method2269(false);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V")
    public static final void method2270(boolean arg0) {
        if (class230.field3255 != null) {
            class230.field3255.method140(255);
        }
        field5014++;
        if (!arg0 && class81.field942 != null) {
            class81.field942.method140(255);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([Lp;BILae;[BZIIIIII)V")
    public static final void method2271(class119[] arg0, byte arg1, int arg2, class134 arg3, byte[] arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field5011++;
        class236 var12 = new class236(arg4);
        if (arg1 < 109) {
            field5018 = null;
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method1601(true);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1594(-107);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method1574(-107);
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg2 == var19 && var18 >= arg9 && (arg9 + 8) > var18 && var17 >= arg6 && arg6 + 8 > var17) {
                    class88 var23 = class374.method2382(var13, false);
                    int var24 = class93.method519(arg7, var23.field1029, var22, 8, var18 & 0x7, var17 & 0x7, var23.field1008) + arg8;
                    int var25 = arg11 + class385.method2471(var18 & 0x7, 1, arg7, var23.field1008, var17 & 0x7, var22, var23.field1029);
                    if (var24 > 0 && var25 > 0 && class176.field2403 - 1 > var24 && class383.field5395 - 1 > var25) {
                        class119 var26 = null;
                        if (!arg5) {
                            int var27 = arg10;
                            if ((class399.field5699[1][var24][var25] & 0x2) == 2) {
                                var27 = arg10 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg0[var27];
                            }
                        }
                        class311.method2052(var21, (byte) 62, var24, true, arg5, var13, var26, arg10, -1, arg10, arg3, var22 + arg7 & 0x3, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)I")
    public static final int method2272(int arg0, byte arg1) {
        field5015++;
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCD) >>> 2);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = 74 % ((arg1 + 34) / 46);
        int var7 = (var5 >>> 16) + var5;
        return var7 & 0xFF;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILrd;ILdg;)V")
    public static final void method2273(int arg0, class185 arg1, int arg2, class236 arg3) {
        field5012++;
        class318 var4 = new class318();
        if (arg0 != 1431655765) {
            return;
        }
        var4.field4520 = arg3.method1574(-80);
        var4.field4521 = arg3.method1597(3641);
        var4.field4517 = new class315[var4.field4520];
        var4.field4519 = new int[var4.field4520];
        var4.field4514 = new int[var4.field4520];
        var4.field4508 = new byte[var4.field4520][][];
        var4.field4510 = new class315[var4.field4520];
        var4.field4507 = new int[var4.field4520];
        for (int var5 = 0; var5 < var4.field4520; var5++) {
            try {
                int var6 = arg3.method1574(-49);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg3.method1562(false);
                    String var8 = arg3.method1562(false);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg3.method1597(arg0 - 1431652124);
                    }
                    var4.field4519[var5] = var6;
                    var4.field4514[var5] = var9;
                    var4.field4510[var5] = arg1.method1255(var8, (byte) 124, class101.method555((byte) -66, var7));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg3.method1562(false);
                    String var11 = arg3.method1562(false);
                    int var12 = arg3.method1574(-49);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg3.method1562(false);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method1597(3641);
                            var15[var16] = new byte[var17];
                            arg3.method1570(var15[var16], var17, 0, -1);
                        }
                    }
                    var4.field4519[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class101.method555((byte) -66, var13[var19]);
                    }
                    var4.field4517[var5] = arg1.method1253(var11, var18, class101.method555((byte) -66, var10), true);
                    var4.field4508[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field4507[var5] = -1;
            } catch (SecurityException var21) {
                var4.field4507[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field4507[var5] = -3;
            } catch (Exception var23) {
                var4.field4507[var5] = -4;
            } catch (Throwable var24) {
                var4.field4507[var5] = -5;
            }
        }
        class402.field5762.method509((byte) 116, var4);
    }

    static {
        new class362((String) null, "bevor du die Option 'Regelverstoß melden' benutzt.", (String) null, (String) null);
        field5017 = false;
        field5018 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
    }
}
