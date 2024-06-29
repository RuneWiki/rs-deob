import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class124 extends class139 {

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "I")
    private int field2581 = 0;

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "I")
    private int field2584 = 1638;

    @OriginalMember(owner = "client!nc", name = "bb", descriptor = "I")
    private int field2588 = 4;

    @OriginalMember(owner = "client!nc", name = "ab", descriptor = "Z")
    private boolean field2587 = true;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
    private int field2580 = 4;

    @OriginalMember(owner = "client!nc", name = "mb", descriptor = "[I")
    private int[] field2599 = new int[512];

    @OriginalMember(owner = "client!nc", name = "nb", descriptor = "I")
    private int field2600 = 4;

    @OriginalMember(owner = "client!nc", name = "cb", descriptor = "Lrf;")
    public static class163 field2589 = class53.method392(-56, "blinken3:");

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
    public static int field2583 = 0;

    @OriginalMember(owner = "client!nc", name = "eb", descriptor = "I")
    public static int field2591 = 0;

    @OriginalMember(owner = "client!nc", name = "lb", descriptor = "I")
    public static int field2598 = 0;

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!nc", name = "fb", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!nc", name = "gb", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!nc", name = "ib", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!nc", name = "jb", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!nc", name = "kb", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!nc", name = "ob", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!nc", name = "db", descriptor = "[I")
    private int[] field2590;

    @OriginalMember(owner = "client!nc", name = "hb", descriptor = "[I")
    private int[] field2594;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(Z)V")
    private final void method831(boolean arg0) {
        ++field2596;
        Random var2 = new Random((long) this.field2581);
        for (int var3 = 0; ~var3 > -256; ++var3) {
            this.field2599[var3] = -1;
        }
        if (arg0) {
            this.method835(-85, 93, 16, true, -106);
        }
        for (int var4 = 0; var4 < 255; ++var4) {
            int var5;
            do {
                var5 = class170.method1149(!arg0, 255, var2);
            } while (this.field2599[var5] != -1);
            this.field2599[var5 + 255] = this.field2599[var5] = var4;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field2595;
        if (arg1 != 7451) {
            return null;
        } else {
            int[] var3 = super.field2859.method1319(-102, arg0);
            if (super.field2859.field3966) {
                int var4 = this.field2588 << 12;
                int var5 = this.field2600 << 12;
                int var6 = class180.field3607[arg0] * this.field2600;
                for (int var7 = 0; ~class23.field402 < ~var7; ++var7) {
                    int var8 = 0;
                    int var9 = class189.field3772[var7] * this.field2588;
                    for (int var10 = 0; var10 < this.field2580; ++var10) {
                        int var11 = this.field2590[var10];
                        int var12 = this.field2594[var10];
                        int var13 = this.method835(var6 * var11 >> 12, var9 * var11 >> 12, var5 * var11 >> 12, false, var4 * var11 >> 12);
                        var8 += var12 * var13 >> 12;
                    }
                    if (this.field2587) {
                        var8 = (var8 >> 1) + 2048;
                    }
                    var3[var7] = var8;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    public class124() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
    public final void method127(int arg0) {
        ++field2601;
        if (arg0 != 0) {
            this.field2599 = null;
        }
        this.method831(false);
        this.method832(arg0 ^ 76);
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V")
    private final void method832(int arg0) {
        if (arg0 < 33) {
            this.method64(70, -89, (class52) null);
        }
        ++field2582;
        if (~this.field2584 >= -1) {
            if (this.field2594 != null && ~this.field2594.length == ~this.field2580) {
                this.field2590 = new int[this.field2580];
                for (int var2 = 0; this.field2580 > var2; ++var2) {
                    this.field2590[var2] = (int) (4096.0D * Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field2594 = new int[this.field2580];
            this.field2590 = new int[this.field2580];
            for (int var3 = 0; ~this.field2580 < ~var3; ++var3) {
                this.field2594[var3] = (int) (4096.0D * Math.pow((double) (this.field2584 / 4096), (double) var3));
                this.field2590[var3] = (int) (Math.pow(2.0D, (double) var3) * 4096.0D);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lgg;IILfa;)V")
    public static final void method833(class67 arg0, int arg1, int arg2, class52 arg3) {
        ++field2592;
        class116 var4 = new class116();
        var4.field2458 = arg3.method344(arg2 + 255);
        var4.field2460 = arg3.method383(arg2 ^ 60);
        var4.field2453 = new int[var4.field2458];
        var4.field2459 = new class42[var4.field2458];
        var4.field2462 = new class42[var4.field2458];
        var4.field2470 = new int[var4.field2458];
        var4.field2461 = new byte[var4.field2458][][];
        var4.field2469 = new int[var4.field2458];
        for (int var5 = 0; ~var5 > ~var4.field2458; ++var5) {
            try {
                int var6 = arg3.method344(255);
                if (~var6 != -1 && ~var6 != -2 && var6 != 2) {
                    if (~var6 == -4 || ~var6 == -5) {
                        String var7 = new String(arg3.method363(arg2 ^ 19047).method1059(104));
                        String var8 = new String(arg3.method363(19047).method1059(arg2 + 105));
                        int var9 = arg3.method344(255);
                        String[] var10 = new String[var9];
                        for (int var11 = 0; var11 < var9; ++var11) {
                            var10[var11] = new String(arg3.method363(19047).method1059(class70.method502(arg2, 125)));
                        }
                        byte[][] var12 = new byte[var9][];
                        if (var6 == 3) {
                            for (int var13 = 0; var13 < var9; ++var13) {
                                int var14 = arg3.method383(arg2 ^ 109);
                                var12[var13] = new byte[var14];
                                arg3.method351(var12[var13], arg2 ^ 413058320, var14, 0);
                            }
                        }
                        Class[] var15 = new Class[var9];
                        var4.field2469[var5] = var6;
                        for (int var16 = 0; ~var9 < ~var16; ++var16) {
                            var15[var16] = class9.method71(var10[var16], 98);
                        }
                        var4.field2459[var5] = arg0.method476(var15, (byte) 71, class9.method71(var7, class70.method502(arg2, -39)), var8);
                        var4.field2461[var5] = var12;
                    }
                } else {
                    String var17 = new String(arg3.method363(19047).method1059(110));
                    int var18 = 0;
                    String var19 = new String(arg3.method363(arg2 ^ 19047).method1059(121));
                    if (var6 == 1) {
                        var18 = arg3.method383(111);
                    }
                    var4.field2469[var5] = var6;
                    var4.field2453[var5] = var18;
                    var4.field2462[var5] = arg0.method478(class9.method71(var17, -81), var19, false);
                }
            } catch (ClassNotFoundException var20) {
                var4.field2470[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2470[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2470[var5] = -3;
            } catch (Exception var23) {
                var4.field2470[var5] = -4;
            } catch (Throwable var24) {
                var4.field2470[var5] = -5;
            }
        }
        class172.field3490.method51(arg2, var4);
    }

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "(I)V")
    public static void method834(int arg0) {
        if (arg0 != 0) {
            field2583 = -48;
        }
        field2589 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIZI)I")
    private final int method835(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field2585;
        int var6 = -4096 & arg1;
        int var7 = arg1 - var6;
        if (arg3) {
            this.field2590 = null;
        }
        int var8 = var6 >> 12;
        int var9 = -4096 & arg0;
        int var10 = arg4 & -4096;
        int var11 = var8 + 1;
        int var12 = arg2 & -4096;
        if (var11 >= var10 >> 12) {
            var11 = 0;
        }
        int var13 = arg0 - var9;
        int var14 = var11 & 255;
        int var15 = var9 >> 12;
        int var16 = var15 + 1;
        int var17 = var15 & 255;
        int var18 = this.field2599[this.field2599[var17] + var14] % 4;
        if (~var16 <= ~(var12 >> 12)) {
            var16 = 0;
        }
        int var19 = var16 & 255;
        int var20 = this.field2599[this.field2599[var19] + var14] % 4;
        int var21 = var8 & 255;
        int var22 = this.field2599[this.field2599[var17] + var21] % 4;
        int var23 = this.field2599[this.field2599[var19] + var21] % 4;
        int var24 = class133.method885(var13, var7, (byte) 39, class206.field4032[var22]);
        int var25 = class133.method885(var13, var7 + -4096, (byte) 39, class206.field4032[var18]);
        int var26 = class133.method885(var13 + -4096, var7, (byte) 39, class206.field4032[var23]);
        int var27 = class133.method885(var13 + -4096, var7 + -4096, (byte) 39, class206.field4032[var20]);
        int var28 = class115.method799(var7, true);
        int var29 = class115.method799(var13, true);
        int var30 = class139.method915(var28, var25, 53, var24);
        int var31 = class139.method915(var28, var27, 65, var26);
        return class139.method915(var29, var31, 118, var30);
    }

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "(I)V")
    public static final void method836(int arg0) {
        class162.field3264.method399(false);
        if (arg0 == 4096) {
            ++field2593;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        ++field2597;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field2600 = arg2.method344(arg1 ^ 234);
                                }
                            } else {
                                this.field2588 = arg2.method344(255);
                            }
                        } else {
                            this.field2581 = arg2.method344(arg1 ^ 234);
                        }
                    } else {
                        this.field2588 = this.field2600 = arg2.method344(255);
                    }
                } else {
                    this.field2584 = arg2.method389(353);
                    if (this.field2584 < 0) {
                        this.field2594 = new int[this.field2580];
                        for (int var5 = 0; var5 < this.field2580; ++var5) {
                            this.field2594[var5] = arg2.method389(353);
                        }
                    }
                }
            } else {
                this.field2580 = arg2.method344(255);
            }
        } else {
            this.field2587 = arg2.method344(arg1 + 234) == 1;
        }
        if (arg1 != 21) {
            this.method835(-63, 83, -22, true, -69);
        }
    }
}
