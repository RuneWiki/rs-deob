import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class443 extends class456 {

    @OriginalMember(owner = "client!wm", name = "O", descriptor = "Lo;")
    public static class332 field6255 = new class332("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!wm", name = "S", descriptor = "[I")
    public static int[] field6259 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!wm", name = "J", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!wm", name = "L", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!wm", name = "M", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!wm", name = "N", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!wm", name = "P", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!wm", name = "Q", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!wm", name = "R", descriptor = "Lui;")
    public static class451 field6258;

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
    public class443() {
        super(3, false);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IBLre;)V")
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (~arg0 == -1) {
            super.field6486 = arg2.method2628(49152) == 1;
        }
        ++field6252;
        if (arg1 != 55) {
            field6258 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IBI)V")
    public static final void method2574(int arg0, byte arg1, int arg2) {
        ++field6250;
        if (arg1 <= 33) {
            field6259 = null;
        }
        class186 var3 = class275.method1789(arg0, (byte) 123, 14);
        var3.method1285(0);
        var3.field2829 = arg2;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLjb;[[B)V")
    public static final void method2575(byte arg0, class350 arg1, byte[][] arg2) {
        for (int var3 = 0; var3 < arg1.field698; ++var3) {
            class418.method2483((byte) 55);
            for (int var4 = 0; class379.field5642 >> 3 > var4; ++var4) {
                for (int var5 = 0; class456.field6477 >> 3 > var5; ++var5) {
                    int var6 = class38.field530[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = 3 & var6 >> 24;
                        if (!arg1.field713 || var7 == 0) {
                            int var8 = (var6 & 7) >> 1;
                            int var9 = 1023 & var6 >> 14;
                            int var10 = var6 >> 3 & 2047;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class145.field2052.length; ++var12) {
                                if (~class145.field2052[var12] == ~var11 && arg2[var12] != null) {
                                    arg1.method2161((var10 & 7) * 8, class183.field2717, 118, var7, var3, var8, arg2[var12], class138.field1976, var4 * 8, (var9 & 7) * 8, var5 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        ++field6257;
        if (arg0 <= 36) {
            field6258 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)V")
    public static final void method2576(byte arg0) {
        class144.method987((byte) 29, 25);
        ++field6251;
        class85.method686(false);
        System.gc();
        if (arg0 >= -45) {
            method2577(118, -11, (class446) null, (class153) null);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IILre;Lng;)V")
    public static final void method2577(int arg0, int arg1, class446 arg2, class153 arg3) {
        ++field6254;
        class450 var4 = new class450();
        var4.field6356 = arg2.method2628(49152);
        var4.field6353 = arg2.method2604(arg0 ^ -12915);
        var4.field6361 = new class397[var4.field6356];
        var4.field6354 = new byte[var4.field6356][][];
        var4.field6364 = new int[var4.field6356];
        var4.field6352 = new class397[var4.field6356];
        var4.field6365 = new int[var4.field6356];
        var4.field6357 = new int[var4.field6356];
        if (arg0 != 12806) {
            field6258 = null;
        }
        for (int var5 = 0; var4.field6356 > var5; ++var5) {
            try {
                int var6 = arg2.method2628(49152);
                if (~var6 != -1 && ~var6 != -2 && ~var6 != -3) {
                    if (var6 == 3 || ~var6 == -5) {
                        String var7 = arg2.method2582((byte) -104);
                        String var8 = arg2.method2582((byte) -58);
                        int var9 = arg2.method2628(49152);
                        String[] var10 = new String[var9];
                        for (int var11 = 0; var11 < var9; ++var11) {
                            var10[var11] = arg2.method2582((byte) -119);
                        }
                        byte[][] var12 = new byte[var9][];
                        if (var6 == 3) {
                            for (int var13 = 0; ~var9 < ~var13; ++var13) {
                                int var14 = arg2.method2604(61);
                                var12[var13] = new byte[var14];
                                arg2.method2589(var14, 0, arg0 ^ 12902, var12[var13]);
                            }
                        }
                        var4.field6365[var5] = var6;
                        Class[] var15 = new Class[var9];
                        for (int var16 = 0; var9 > var16; ++var16) {
                            var15[var16] = class69.method606(var10[var16], 1781046507);
                        }
                        var4.field6352[var5] = arg3.method1032(var8, class69.method606(var7, class76.method648(arg0, 1781051117)), var15, true);
                        var4.field6354[var5] = var12;
                    }
                } else {
                    String var17 = arg2.method2582((byte) -52);
                    String var18 = arg2.method2582((byte) -91);
                    int var19 = 0;
                    if (~var6 == -2) {
                        var19 = arg2.method2604(82);
                    }
                    var4.field6365[var5] = var6;
                    var4.field6364[var5] = var19;
                    var4.field6361[var5] = arg3.method1041(class69.method606(var17, class76.method648(arg0, 1781051117)), -88, var18);
                }
            } catch (ClassNotFoundException var20) {
                var4.field6357[var5] = -1;
            } catch (SecurityException var21) {
                var4.field6357[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field6357[var5] = -3;
            } catch (Exception var23) {
                var4.field6357[var5] = -4;
            } catch (Throwable var24) {
                var4.field6357[var5] = -5;
            }
        }
        class324.field4865.method2453((byte) -124, var4);
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(Z)V")
    public static void method2578(boolean arg0) {
        if (arg0) {
            field6259 = null;
            field6255 = null;
            field6258 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)[I")
    public final int[] method33(int arg0, int arg1) {
        ++field6249;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (arg0 != -1) {
            this.method33(10, -63);
        }
        if (super.field6466.field6153) {
            int[] var4 = this.method2707(arg1, -31797, 0);
            int[] var5 = this.method2707(arg1, -31797, 1);
            int[] var6 = this.method2707(arg1, -31797, 2);
            for (int var7 = 0; ~var7 > ~class156.field2169; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)[[I")
    public final int[][] method212(int arg0, int arg1) {
        ++field6253;
        int[][] var3 = super.field6468.method1090(-2, arg1);
        if (arg0 != 0) {
            method2575((byte) -40, (class350) null, (byte[][]) null);
        }
        if (super.field6468.field2227) {
            int[] var4 = this.method2707(arg1, -31797, 2);
            int[][] var5 = this.method2709(false, arg1, 0);
            int[][] var6 = this.method2709(false, arg1, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class156.field2169; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (~var17 == -1) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }
}
