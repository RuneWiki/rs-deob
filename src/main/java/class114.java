import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class114 extends class64 {

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
    private int field2389 = 4096;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "[I")
    private int[] field2388 = new int[3];

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
    private int field2391 = 3216;

    @OriginalMember(owner = "client!mg", name = "Z", descriptor = "I")
    private int field2396 = 3216;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "Lcd;")
    public static class23 field2390 = class54.method414("Lade Sprites )2 ", -1);

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!mg", name = "X", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!mg", name = "Y", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!mg", name = "ab", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!mg", name = "bb", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "Lkh;")
    public static class97 field2393;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIBI)V")
    public static final void method727(int arg0, int arg1, byte arg2, int arg3) {
        ++field2395;
        if (arg2 <= -29) {
            for (int var4 = 0; var4 < 8; ++var4) {
                for (int var7 = 0; var7 < 8; ++var7) {
                    class182.field3596[arg3][arg1 - -var4][arg0 + var7] = 0;
                }
            }
            if (arg1 > 0) {
                for (int var5 = 1; ~var5 > -9; ++var5) {
                    class182.field3596[arg3][arg1][arg0 + var5] = class182.field3596[arg3][arg1 + -1][arg0 + var5];
                }
            }
            if (arg0 > 0) {
                for (int var6 = 1; var6 < 8; ++var6) {
                    class182.field3596[arg3][arg1 - -var6][arg0] = class182.field3596[arg3][arg1 + var6][arg0 - 1];
                }
            }
            if (arg1 > 0 && class182.field3596[arg3][arg1 - 1][arg0] != 0) {
                class182.field3596[arg3][arg1][arg0] = class182.field3596[arg3][arg1 - 1][arg0];
            } else if (~arg0 < -1 && class182.field3596[arg3][arg1][arg0 - 1] != 0) {
                class182.field3596[arg3][arg1][arg0] = class182.field3596[arg3][arg1][arg0 + -1];
            } else if (arg1 > 0 && arg0 > 0 && class182.field3596[arg3][arg1 + -1][arg0 - 1] != 0) {
                class182.field3596[arg3][arg1][arg0] = class182.field3596[arg3][arg1 + -1][arg0 + -1];
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        int var4 = 34 % ((arg0 - 7) / 43);
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field2396 = arg2.method1197(-1);
                }
            } else {
                this.field2391 = arg2.method1197(-1);
            }
        } else {
            this.field2389 = arg2.method1197(-1);
        }
        ++field2398;
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V")
    public static void method728(int arg0) {
        field2393 = null;
        field2390 = null;
        if (arg0 != 0) {
            field2390 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)V")
    private final void method729(byte arg0) {
        ++field2387;
        double var2 = Math.cos((double) (this.field2396 / 4096));
        this.field2388[0] = (int) (var2 * Math.sin((double) (this.field2391 / 4096)) * 4096.0D);
        this.field2388[1] = (int) (var2 * Math.cos((double) (this.field2391 / 4096)) * 4096.0D);
        this.field2388[2] = (int) (Math.sin((double) (this.field2396 / 4096)) * 4096.0D);
        int var4 = this.field2388[1] * this.field2388[1] >> 12;
        int var5 = this.field2388[0] * this.field2388[0] >> 12;
        int var6 = this.field2388[2] * this.field2388[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
        int var8 = -38 % ((-65 - arg0) / 57);
        if (~var7 != -1) {
            this.field2388[0] = (this.field2388[0] << 12) / var7;
            this.field2388[1] = (this.field2388[1] << 12) / var7;
            this.field2388[2] = (this.field2388[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
    public final void method44(byte arg0) {
        if (arg0 != -22) {
            this.method44((byte) 93);
        }
        ++field2394;
        this.method729((byte) 77);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lva;Lpc;IB)V")
    public static final void method730(class189 arg0, class137 arg1, int arg2, byte arg3) {
        int var4 = 11 / ((arg3 - -21) / 53);
        class175 var5 = new class175();
        var5.field3495 = arg0.method1202(-55);
        ++field2397;
        var5.field3487 = arg0.method1190(-4);
        var5.field3478 = new class32[var5.field3495];
        var5.field3491 = new int[var5.field3495];
        var5.field3486 = new int[var5.field3495];
        var5.field3496 = new class32[var5.field3495];
        var5.field3483 = new int[var5.field3495];
        var5.field3481 = new byte[var5.field3495][][];
        for (int var6 = 0; var5.field3495 > var6; ++var6) {
            try {
                int var7 = arg0.method1202(-94);
                if (var7 != 0 && var7 != 1 && var7 != 2) {
                    if (~var7 == -4 || var7 == 4) {
                        String var11 = new String(arg0.method1193((byte) -70).method162((byte) 77));
                        String var12 = new String(arg0.method1193((byte) -70).method162((byte) 99));
                        int var13 = arg0.method1202(101);
                        String[] var14 = new String[var13];
                        for (int var15 = 0; ~var13 < ~var15; ++var15) {
                            var14[var15] = new String(arg0.method1193((byte) -70).method162((byte) 123));
                        }
                        byte[][] var16 = new byte[var13][];
                        if (~var7 == -4) {
                            for (int var17 = 0; ~var17 > ~var13; ++var17) {
                                int var18 = arg0.method1190(-4);
                                var16[var17] = new byte[var18];
                                arg0.method1214(var18, -1, 0, var16[var17]);
                            }
                        }
                        var5.field3491[var6] = var7;
                        Class[] var19 = new Class[var13];
                        for (int var20 = 0; var13 > var20; ++var20) {
                            var19[var20] = class5.method30(var14[var20], 0);
                        }
                        var5.field3478[var6] = arg1.method869((byte) 60, var12, class5.method30(var11, 0), var19);
                        var5.field3481[var6] = var16;
                    }
                } else {
                    int var8 = 0;
                    String var9 = new String(arg0.method1193((byte) -70).method162((byte) 86));
                    String var10 = new String(arg0.method1193((byte) -70).method162((byte) 107));
                    if (~var7 == -2) {
                        var8 = arg0.method1190(-4);
                    }
                    var5.field3491[var6] = var7;
                    var5.field3483[var6] = var8;
                    var5.field3496[var6] = arg1.method872(class5.method30(var9, 0), var10, (byte) 42);
                }
            } catch (ClassNotFoundException var21) {
                var5.field3486[var6] = -1;
            } catch (SecurityException var22) {
                var5.field3486[var6] = -2;
            } catch (NullPointerException var23) {
                var5.field3486[var6] = -3;
            } catch (Exception var24) {
                var5.field3486[var6] = -4;
            } catch (Throwable var25) {
                var5.field3486[var6] = -5;
            }
        }
        class10.field210.method186(var5, -26692);
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    public class114() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field2386;
        int[] var3 = super.field1513.method1033(-100, arg0);
        if (super.field1513.field3368) {
            int[] var4 = this.method479(-1, class81.field1760 & arg0 + -1, 0);
            int[] var5 = this.method479(-1, arg0, 0);
            int[] var6 = this.method479(arg1 ^ 9420, class81.field1760 & arg0 - -1, 0);
            for (int var7 = 0; class168.field3367 > var7; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field2389;
                int var9 = (var5[class163.field3266 & var7 + 1] + -var5[var7 + -1 & class163.field3266]) * this.field2389;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((var13 + 4096 + var12) / 4096)));
                int var15;
                int var16;
                int var17;
                if (var14 == 0) {
                    var15 = 0;
                    var16 = 0;
                    var17 = 0;
                } else {
                    var16 = var9 / var14;
                    var17 = 16777216 / var14;
                    var15 = var8 / var14;
                }
                int var18 = this.field2388[0] * var16 >> 12;
                int var19 = this.field2388[2] * var17 >> 12;
                int var20 = this.field2388[1] * var15 >> 12;
                var3[var7] = var18 + var20 - -var19;
            }
        }
        return arg1 != -9421 ? null : var3;
    }
}
