import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class197 {

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lfk;")
    private class393 field2701 = new class393();

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "Lfk;")
    private class393 field2721 = new class393();

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "Lfk;")
    private class393 field2722 = new class393();

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "Lfk;")
    private class393 field2723 = new class393();

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "Lkh;")
    private class11 field2724 = new class11(4);

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    public volatile int field2729 = 0;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
    public volatile int field2731 = 0;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "B")
    private byte field2730 = 0;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "Lkh;")
    private class11 field2728 = new class11(8);

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Z")
    public static boolean field2705 = false;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field2706 = 0;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field2709 = 0;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    private int field2725;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "J")
    private long field2726;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "Lbg;")
    private class272 field2732;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "Lpf;")
    private class348 field2727;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZIBI)Lbg;")
    public final class272 method1271(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        field2720++;
        long var6 = (long) ((arg4 << 16) + arg0);
        class272 var8 = new class272();
        var8.field2257 = arg1;
        int var9 = 121 % ((-arg2 - 32) / 48);
        var8.field3775 = arg3;
        var8.field6253 = var6;
        if (arg1) {
            if (this.method1278((byte) 104) >= 20) {
                throw new RuntimeException();
            }
            this.field2701.method2478(var8, false);
        } else if (this.method1280((byte) 8) < 20) {
            this.field2722.method2478(var8, false);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public final void method1272(int arg0) {
        if (arg0 != -20053) {
            return;
        }
        field2702++;
        try {
            this.field2727.method2210(-2);
        } catch (Exception var2) {
        }
        this.field2730 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field2729++;
        this.field2731 = -1;
        this.field2727 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Z")
    public final boolean method1273(byte arg0) {
        if (arg0 != -82) {
            this.field2722 = null;
        }
        field2700++;
        return this.method1280((byte) 8) >= 20;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lkh;Ljava/lang/String;I)I")
    public static final int method1274(class11 arg0, String arg1, int arg2) {
        field2715++;
        if (arg2 != -18604) {
            method1274((class11) null, (String) null, -47);
        }
        int var3 = arg0.field191;
        byte[] var4 = class83.method604(arg1, (byte) -100);
        arg0.method164((byte) 106, var4.length);
        arg0.field191 += class47.field660.method401(0, arg0.field230, var4.length, var4, arg0.field191, 119);
        return arg0.field191 - var3;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public final void method1275(int arg0) {
        field2718++;
        if (this.field2727 == null) {
            return;
        }
        try {
            this.field2724.field191 = arg0;
            this.field2724.method173(7, 255);
            this.field2724.method167((byte) -15, 0);
            this.field2727.method2203(this.field2724.field230, 0, 4, -25);
        } catch (IOException var3) {
            try {
                this.field2727.method2210(-2);
            } catch (Exception var2) {
            }
            this.field2729++;
            this.field2731 = -2;
            this.field2727 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)Z")
    public final boolean method1276(byte arg0) {
        if (arg0 != -28) {
            this.method1277((byte) -110);
        }
        field2714++;
        return this.method1278((byte) 116) >= 20;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)V")
    public final void method1277(byte arg0) {
        field2703++;
        if (this.field2727 != null) {
            this.field2727.method2212((byte) 40);
        }
        if (arg0 != 81) {
            this.method1285(13, false, (class348) null);
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)I")
    public final int method1278(byte arg0) {
        field2719++;
        if (arg0 < 89) {
            field2705 = false;
        }
        return this.field2701.method2489(0) + this.field2721.method2489(0);
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)Z")
    public final boolean method1279(int arg0) {
        field2704++;
        if (this.field2727 != null) {
            long var2 = class385.method2442(-6631);
            int var4 = (int) (var2 - this.field2726);
            this.field2726 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field2725 += var4;
            if (this.field2725 > 30000) {
                try {
                    this.field2727.method2210(-2);
                } catch (Exception var27) {
                }
                this.field2727 = null;
            }
        }
        if (this.field2727 == null) {
            return this.method1278((byte) 105) == 0 && this.method1280((byte) 8) == 0;
        }
        try {
            this.field2727.method2206(-25);
            for (class272 var5 = (class272) this.field2701.method2482(-61); var5 != null; var5 = (class272) this.field2701.method2476(1)) {
                this.field2724.field191 = 0;
                this.field2724.method173(1, 255);
                this.field2724.method167((byte) -15, (int) var5.field6253);
                this.field2727.method2203(this.field2724.field230, 0, 4, 114);
                this.field2721.method2478(var5, false);
            }
            if (arg0 < 16) {
                this.method1283((byte) -46);
            }
            for (class272 var6 = (class272) this.field2722.method2482(-77); var6 != null; var6 = (class272) this.field2722.method2476(1)) {
                this.field2724.field191 = 0;
                this.field2724.method173(0, 255);
                this.field2724.method167((byte) -15, (int) var6.field6253);
                this.field2727.method2203(this.field2724.field230, 0, 4, -84);
                this.field2723.method2478(var6, false);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field2727.method2213(108);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field2725 = 0;
                byte var9 = 0;
                if (this.field2732 == null) {
                    var9 = 8;
                } else if (this.field2732.field3769 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field2728.field191;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field2727.method2209(var10, this.field2728.field230, this.field2728.field191, 1509);
                    if (this.field2730 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field2728.field230[this.field2728.field191 + var11] = (byte) class108.method765(this.field2728.field230[this.field2728.field191 + var11], this.field2730);
                        }
                    }
                    this.field2728.field191 += var10;
                    if (this.field2728.field191 >= var9) {
                        if (this.field2732 == null) {
                            this.field2728.field191 = 0;
                            int var12 = this.field2728.method172((byte) 52);
                            int var13 = this.field2728.method174(255);
                            int var14 = this.field2728.method172((byte) 52);
                            int var15 = this.field2728.method185(25239);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class272 var21;
                            if (var17) {
                                for (var21 = (class272) this.field2723.method2482(-31); var21 != null && var21.field6253 != var18; var21 = (class272) this.field2723.method2476(1)) {
                                }
                            } else {
                                for (var21 = (class272) this.field2721.method2482(-46); var21 != null && var21.field6253 != var18; var21 = (class272) this.field2721.method2476(1)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field2732 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field2732.field3773 = new class11(var15 + var22 + this.field2732.field3775);
                            this.field2732.field3773.method173(var16, 255);
                            this.field2732.field3773.method155(15489, var15);
                            this.field2728.field191 = 0;
                            this.field2732.field3769 = 8;
                        } else if (this.field2732.field3769 != 0) {
                            throw new IOException();
                        } else if (this.field2728.field230[0] == -1) {
                            this.field2732.field3769 = 1;
                            this.field2728.field191 = 0;
                        } else {
                            this.field2732 = null;
                        }
                    }
                } else {
                    int var23 = this.field2732.field3773.field230.length - this.field2732.field3775;
                    int var24 = 512 - this.field2732.field3769;
                    if ((var23 - this.field2732.field3773.field191) < var24) {
                        var24 = var23 - this.field2732.field3773.field191;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field2727.method2209(var24, this.field2732.field3773.field230, this.field2732.field3773.field191, 1509);
                    if (this.field2730 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field2732.field3773.field230[this.field2732.field3773.field191 + var25] = (byte) class108.method765(this.field2732.field3773.field230[this.field2732.field3773.field191 + var25], this.field2730);
                        }
                    }
                    this.field2732.field3773.field191 += var24;
                    this.field2732.field3769 += var24;
                    if (this.field2732.field3773.field191 == var23) {
                        this.field2732.method2783((byte) -122);
                        this.field2732.field2254 = false;
                        this.field2732 = null;
                    } else if (this.field2732.field3769 == 512) {
                        this.field2732.field3769 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field2727.method2210(-2);
            } catch (Exception var26) {
            }
            this.field2729++;
            this.field2731 = -2;
            this.field2727 = null;
            return this.method1278((byte) 108) == 0 && this.method1280((byte) 8) == 0;
        }
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(B)I")
    private final int method1280(byte arg0) {
        if (arg0 == 8) {
            field2717++;
            return this.field2722.method2489(0) + this.field2723.method2489(arg0 - 8);
        } else {
            return 122;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIII)V")
    public static final void method1281(int arg0, int arg1, int arg2, int arg3) {
        if (class126.field1782 != null) {
            class126.field1782[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)Z")
    public static final boolean method1282(byte arg0, int arg1) {
        field2707++;
        if (arg1 == 25 || arg1 == 48 || arg1 == 57 || arg1 == 51 || arg1 == 59) {
            return true;
        } else if (arg0 == 33) {
            return arg1 == 60 || arg1 == 1004;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(B)V")
    private final void method1283(byte arg0) {
        field2716++;
        if (this.field2727 == null) {
            return;
        }
        try {
            int var2 = -118 / ((arg0 + 46) / 55);
            this.field2724.field191 = 0;
            this.field2724.method173(6, 255);
            this.field2724.method167((byte) -15, 3);
            this.field2727.method2203(this.field2724.field230, 0, 4, 123);
        } catch (IOException var4) {
            try {
                this.field2727.method2210(-2);
            } catch (Exception var3) {
            }
            this.field2731 = -2;
            this.field2727 = null;
            this.field2729++;
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
    public final void method1284(int arg0) {
        if (this.field2727 != null) {
            this.field2727.method2210(-2);
        }
        field2708++;
        int var2 = -20 / ((arg0 + 79) / 33);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZLpf;)V")
    public final void method1285(int arg0, boolean arg1, class348 arg2) {
        if (this.field2727 != null) {
            try {
                this.field2727.method2210(-2);
            } catch (Exception var8) {
            }
            this.field2727 = null;
        }
        field2712++;
        if (arg0 > -99) {
            return;
        }
        this.field2727 = arg2;
        this.method1283((byte) -112);
        this.method1286(-5716, arg1);
        this.field2728.field191 = 0;
        this.field2732 = null;
        while (true) {
            class272 var4 = (class272) this.field2721.method2481((byte) -78);
            if (var4 == null) {
                while (true) {
                    class272 var5 = (class272) this.field2723.method2481((byte) -78);
                    if (var5 == null) {
                        if (this.field2730 != 0) {
                            try {
                                this.field2724.field191 = 0;
                                this.field2724.method173(4, 255);
                                this.field2724.method173(this.field2730, 255);
                                this.field2724.method191(0, -93);
                                this.field2727.method2203(this.field2724.field230, 0, 4, 116);
                            } catch (IOException var7) {
                                try {
                                    this.field2727.method2210(-2);
                                } catch (Exception var6) {
                                }
                                this.field2729++;
                                this.field2731 = -2;
                                this.field2727 = null;
                            }
                        }
                        this.field2725 = 0;
                        this.field2726 = class385.method2442(-6631);
                        return;
                    }
                    this.field2722.method2478(var5, false);
                }
            }
            this.field2701.method2478(var4, false);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)V")
    public final void method1286(int arg0, boolean arg1) {
        field2710++;
        if (this.field2727 == null) {
            return;
        }
        try {
            this.field2724.field191 = 0;
            this.field2724.method173(arg1 ? 2 : 3, 255);
            this.field2724.method167((byte) -15, 0);
            this.field2727.method2203(this.field2724.field230, 0, 4, -77);
        } catch (IOException var4) {
            try {
                this.field2727.method2210(-2);
            } catch (Exception var3) {
            }
            this.field2731 = -2;
            this.field2727 = null;
            this.field2729++;
        }
        if (arg0 != -5716) {
            this.field2723 = null;
        }
    }
}
