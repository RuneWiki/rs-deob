import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class394 {

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "[I")
    private int[] field5535 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public int field5546 = -1;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "Z")
    public boolean field5550 = false;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Lpm;")
    public static class349 field5540 = new class349("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "[I")
    public static int[] field5553 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "[I")
    private int[] field5552;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "[S")
    private short[] field5534;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "[S")
    private short[] field5538;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "[S")
    private short[] field5543;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "[S")
    private short[] field5554;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIBIII)V")
    public static final void method2476(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field5541++;
        int var7 = class209.method1485(class240.field3547, 1667, class245.field3659, arg2);
        int var8 = class209.method1485(class240.field3547, 1667, class245.field3659, arg6);
        int var9 = class209.method1485(class231.field3415, 1667, class408.field5789, arg1);
        int var10 = 14 % ((45 - arg3) / 49);
        int var11 = class209.method1485(class231.field3415, 1667, class408.field5789, arg4);
        int var12 = class209.method1485(class240.field3547, 1667, class245.field3659, arg2 + arg5);
        int var13 = class209.method1485(class240.field3547, 1667, class245.field3659, arg6 - arg5);
        for (int var14 = var7; var14 < var12; var14++) {
            class5.method17(class440.field6288[var14], var11, arg0, (byte) 64, var9);
        }
        for (int var15 = var8; var15 > var13; var15--) {
            class5.method17(class440.field6288[var15], var11, arg0, (byte) 88, var9);
        }
        int var16 = class209.method1485(class231.field3415, 1667, class408.field5789, arg1 + arg5);
        int var17 = class209.method1485(class231.field3415, 1667, class408.field5789, arg4 - arg5);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class440.field6288[var18];
            class5.method17(var19, var16, arg0, (byte) 74, var9);
            class5.method17(var19, var11, arg0, (byte) 90, var17);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)Lqf;")
    public final class406 method2477(byte arg0) {
        field5539++;
        if (this.field5552 == null) {
            return null;
        }
        class406[] var2 = new class406[this.field5552.length];
        class108 var3 = class294.field4249;
        synchronized (class294.field4249) {
            for (int var4 = 0; var4 < this.field5552.length; var4++) {
                var2[var4] = class294.method1986(0, -58, this.field5552[var4], class294.field4249);
            }
            if (arg0 <= 56) {
                this.method2485(59);
            }
        }
        class406 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class406(var2, var2.length);
        }
        if (var5 == null) {
            return null;
        }
        if (this.field5538 != null) {
            for (int var6 = 0; var6 < this.field5538.length; var6++) {
                var5.method2547(this.field5538[var6], -112, this.field5554[var6]);
            }
        }
        if (this.field5543 != null) {
            for (int var7 = 0; var7 < this.field5543.length; var7++) {
                var5.method2542(this.field5543[var7], this.field5534[var7], 0);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
    public static void method2478(byte arg0) {
        field5540 = null;
        field5553 = null;
        if (arg0 != 110) {
            method2478((byte) -6);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)Z")
    public final boolean method2479(int arg0) {
        field5542++;
        boolean var2 = true;
        class108 var3 = class294.field4249;
        synchronized (class294.field4249) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field5535[var4] != -1 && !class294.field4249.method661(this.field5535[var4], false, 0)) {
                    var2 = false;
                }
            }
            if (arg0 != 19) {
                method2481(27, -99);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILlf;B)V")
    private final void method2480(int arg0, class130 arg1, byte arg2) {
        field5537++;
        if (arg2 != -123) {
            return;
        }
        if (arg0 == 1) {
            this.field5546 = arg1.method837(true);
        } else if (arg0 == 2) {
            int var8 = arg1.method837(true);
            this.field5552 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field5552[var9] = arg1.method798(false);
            }
        } else if (arg0 == 3) {
            this.field5550 = true;
        } else if (arg0 == 40) {
            int var4 = arg1.method837(true);
            this.field5554 = new short[var4];
            this.field5538 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5538[var5] = (short) arg1.method798(false);
                this.field5554[var5] = (short) arg1.method798(false);
            }
        } else if (arg0 == 41) {
            int var6 = arg1.method837(true);
            this.field5543 = new short[var6];
            this.field5534 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5543[var7] = (short) arg1.method798(false);
                this.field5534[var7] = (short) arg1.method798(false);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field5535[arg0 - 60] = arg1.method798(false);
            return;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Lme;")
    public static final class106 method2481(int arg0, int arg1) {
        field5545++;
        class106 var2 = (class106) class125.field1671.method1972((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class285.field4145.method643(arg1, arg0, true);
        class106 var4 = new class106();
        if (var3 != null) {
            var4.method621(true, new class130(var3));
        }
        class125.field1671.method1975(var4, (long) arg0, false);
        return var4;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILlf;)V")
    public final void method2482(int arg0, class130 arg1) {
        field5536++;
        if (arg0 != 0) {
            method2481(-8, 9);
        }
        while (true) {
            int var3 = arg1.method837(true);
            if (var3 == 0) {
                return;
            }
            this.method2480(var3, arg1, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)Lqf;")
    public final class406 method2483(int arg0) {
        field5551++;
        class406[] var2 = new class406[5];
        int var3 = 0;
        class108 var4 = class294.field4249;
        synchronized (class294.field4249) {
            for (int var5 = arg0; var5 < 5; var5++) {
                if (this.field5535[var5] != -1) {
                    var2[var3++] = class294.method1986(0, -72, this.field5535[var5], class294.field4249);
                }
            }
        }
        class406 var6 = new class406(var2, var3);
        if (this.field5538 != null) {
            for (int var7 = 0; var7 < this.field5538.length; var7++) {
                var6.method2547(this.field5538[var7], arg0 - 107, this.field5554[var7]);
            }
        }
        if (this.field5543 != null) {
            for (int var8 = 0; var8 < this.field5543.length; var8++) {
                var6.method2542(this.field5543[var8], this.field5534[var8], 0);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)Lvd;")
    public static final class26 method2484(int arg0, int arg1) {
        field5547++;
        class26 var2 = (class26) class317.field4652.method99(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class96.field1225.method643(1, arg0, true);
        class26 var4 = new class26();
        var4.field325 = arg0;
        if (var3 != null) {
            var4.method136(new class130(var3), (byte) 125);
        }
        var4.method139(arg1 - 24111);
        if (arg1 != 24111) {
            field5540 = null;
        }
        if (var4.field340 == 2 && class96.field1214.method1373((long) arg0, -81) == null) {
            class96.field1214.method1376(new class24(class245.field3663), (long) arg0, arg1 ^ 0x5E5A);
            class23.field295[class245.field3663++] = var4;
        }
        class317.field4652.method90(var4, (long) arg0, 0);
        return var4;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)Z")
    public final boolean method2485(int arg0) {
        field5549++;
        if (this.field5552 == null) {
            return true;
        }
        boolean var2 = true;
        class108 var3 = class294.field4249;
        synchronized (class294.field4249) {
            for (int var4 = 0; var4 < this.field5552.length; var4++) {
                if (!class294.field4249.method661(this.field5552[var4], false, 0)) {
                    var2 = false;
                }
            }
            int var5 = 85 % ((-arg0 - 27) / 40);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(II)V")
    public static final void method2486(int arg0, int arg1) {
        class262.method1807(true);
        field5544++;
        int var2 = class293.method1981((byte) -51, arg0).field6006;
        if (~var2 == arg1) {
            return;
        }
        int var3 = class150.field2254[arg0];
        if (var2 == 5) {
            class335.field4856 = var3;
        }
        if (var2 == 6) {
            class8.field115 = var3;
        }
    }
}
