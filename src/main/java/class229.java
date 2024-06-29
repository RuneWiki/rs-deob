import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class229 extends class109 {

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field3470 = 0;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "Lvd;")
    public static class4 field3473 = new class4(16);

    @OriginalMember(owner = "client!re", name = "U", descriptor = "Z")
    public static boolean field3477 = false;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "B")
    public byte field3465;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "I")
    public int field3475;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "Lag;")
    public static class189 field3476;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "Lql;")
    public class224 field3471;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
    public static final void method1511(int arg0, int arg1) {
        class67.field906 = -1;
        if (arg0 != 100) {
            field3473 = null;
        }
        if (~arg1 == -38) {
            class179.field2513 = 3.0F;
        } else if (arg1 != 50) {
            if (~arg1 == -76) {
                class179.field2513 = 6.0F;
            } else if (arg1 != 100) {
                if (~arg1 == -201) {
                    class179.field2513 = 16.0F;
                }
            } else {
                class179.field2513 = 8.0F;
            }
        } else {
            class179.field2513 = 4.0F;
        }
        ++field3469;
        class67.field906 = -1;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method1512(int arg0, String arg1) {
        if (arg0 != -5) {
            field3476 = null;
        }
        ++field3468;
        if (arg1 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < class93.field1300; ++var2) {
                if (arg1.equalsIgnoreCase(class186.field2573[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ld;Lql;ZI)V")
    public static final void method1513(class244 arg0, class224 arg1, boolean arg2, int arg3) {
        ++field3467;
        class49 var4 = new class49();
        var4.field708 = arg1.method1453((byte) -128);
        var4.field718 = arg1.method1483((byte) 46);
        var4.field712 = new byte[var4.field708][][];
        var4.field706 = new class117[var4.field708];
        var4.field705 = new int[var4.field708];
        var4.field707 = new int[var4.field708];
        if (!arg2) {
            var4.field711 = new class117[var4.field708];
            var4.field717 = new int[var4.field708];
            for (int var5 = 0; ~var5 > ~var4.field708; ++var5) {
                try {
                    int var6 = arg1.method1453((byte) -127);
                    if (var6 != 0 && ~var6 != -2 && ~var6 != -3) {
                        if (~var6 == -4 || ~var6 == -5) {
                            String var10 = arg1.method1455(115);
                            String var11 = arg1.method1455(116);
                            int var12 = arg1.method1453((byte) -128);
                            String[] var13 = new String[var12];
                            for (int var14 = 0; ~var12 < ~var14; ++var14) {
                                var13[var14] = arg1.method1455(-80);
                            }
                            byte[][] var15 = new byte[var12][];
                            if (var6 == 3) {
                                for (int var16 = 0; var12 > var16; ++var16) {
                                    int var17 = arg1.method1483((byte) 46);
                                    var15[var16] = new byte[var17];
                                    arg1.method1468(5085, var17, 0, var15[var16]);
                                }
                            }
                            var4.field707[var5] = var6;
                            Class[] var18 = new Class[var12];
                            for (int var19 = 0; ~var19 > ~var12; ++var19) {
                                var18[var19] = class163.method1085(-8213, var13[var19]);
                            }
                            var4.field711[var5] = arg0.method1636(class163.method1085(-8213, var10), (byte) -125, var18, var11);
                            var4.field712[var5] = var15;
                        }
                    } else {
                        int var7 = 0;
                        String var8 = arg1.method1455(104);
                        String var9 = arg1.method1455(108);
                        if (var6 == 1) {
                            var7 = arg1.method1483((byte) 46);
                        }
                        var4.field707[var5] = var6;
                        var4.field705[var5] = var7;
                        var4.field706[var5] = arg0.method1639(class163.method1085(-8213, var8), (byte) -118, var9);
                    }
                } catch (ClassNotFoundException var20) {
                    var4.field717[var5] = -1;
                } catch (SecurityException var21) {
                    var4.field717[var5] = -2;
                } catch (NullPointerException var22) {
                    var4.field717[var5] = -3;
                } catch (Exception var23) {
                    var4.field717[var5] = -4;
                } catch (Throwable var24) {
                    var4.field717[var5] = -5;
                }
            }
            class20.field286.method988(var4, (byte) -77);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIZI)V")
    public static final void method1514(int arg0, int arg1, boolean arg2, int arg3) {
        ++field3474;
        if (arg3 >= ~arg0 && arg0 <= 48000) {
            class286.field4477 = arg2;
            class121.field1690 = arg1;
            class60.field845 = arg0;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!re", name = "i", descriptor = "(I)[B")
    public final byte[] method142(int arg0) {
        if (arg0 < 49) {
            this.field3475 = -85;
        }
        ++field3466;
        if (!super.field1519 && ~this.field3471.field3402 <= ~(this.field3471.field3336.length + -this.field3465)) {
            return this.field3471.field3336;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!re", name = "h", descriptor = "(I)I")
    public final int method143(int arg0) {
        ++field3472;
        if (this.field3471 == null) {
            return 0;
        } else {
            return arg0 != 14 ? -92 : this.field3471.field3402 * 100 / (this.field3471.field3336.length - this.field3465);
        }
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(B)V")
    public static void method1515(byte arg0) {
        field3473 = null;
        if (arg0 != -62) {
            method1515((byte) -110);
        }
        field3476 = null;
    }
}
