import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class124 extends class37 {

    @OriginalMember(owner = "client!mh", name = "hb", descriptor = "I")
    private int field2727 = 585;

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "Ldd;")
    private static class35 field2718 = class180.method1196((byte) -81, "flash2:");

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "Ldd;")
    private static class35 field2717 = class180.method1196((byte) 127, "Attack");

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "Ldd;")
    public static class35 field2711 = field2718;

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "Ldd;")
    public static class35 field2719 = class180.method1196((byte) -113, " ");

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "Ldd;")
    private static class35 field2709 = class180.method1196((byte) -44, "Select");

    @OriginalMember(owner = "client!mh", name = "gb", descriptor = "Ldd;")
    public static class35 field2726 = class180.method1196((byte) 127, "<col=00ffff>");

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "Ldd;")
    public static class35 field2712 = field2718;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "Ldd;")
    public static class35 field2710 = field2709;

    @OriginalMember(owner = "client!mh", name = "cb", descriptor = "Ldd;")
    public static class35 field2722 = class180.method1196((byte) -75, "Stufe)2");

    @OriginalMember(owner = "client!mh", name = "db", descriptor = "[Ldd;")
    public static class35[] field2723 = new class35[1000];

    @OriginalMember(owner = "client!mh", name = "bb", descriptor = "Ldd;")
    public static class35 field2721 = field2717;

    @OriginalMember(owner = "client!mh", name = "ib", descriptor = "I")
    public static volatile int field2728 = 0;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!mh", name = "ab", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!mh", name = "eb", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!mh", name = "fb", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLdd;)V")
    public static final void method879(byte arg0, class35 arg1) {
        ++field2715;
        if (class175.field3580 != null) {
            int var2 = 0;
            long var3 = arg1.method321(21830);
            if (var3 != 0L) {
                if (arg0 == 94) {
                    while (var2 < class175.field3580.length && ~class175.field3580[var2].field2416 != ~var3) {
                        ++var2;
                    }
                    if (~class175.field3580.length < ~var2 && class175.field3580[var2] != null) {
                        class1.field11.method659(99, true);
                        ++class195.field3883;
                        class1.field11.method239((byte) 95, class175.field3580[var2].field2416);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V")
    public static final void method880(int arg0) {
        ++field2724;
        class97.field2147.method813(-112);
        if (arg0 < 72) {
            method881(true);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        ++field2713;
        if (arg1 != 1) {
            field2712 = null;
        }
        if (~arg0 == -1) {
            this.field2727 = arg2.method256((byte) -78);
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class124() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)V")
    public static void method881(boolean arg0) {
        field2712 = null;
        field2709 = null;
        field2726 = null;
        field2723 = null;
        field2710 = null;
        field2721 = null;
        field2719 = null;
        field2718 = null;
        field2722 = null;
        field2717 = null;
        if (!arg0) {
            field2722 = null;
        }
        field2711 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIB)V")
    public static final void method882(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = 48 / ((arg3 - -45) / 54);
        ++field2720;
        for (int var5 = 0; var5 < 8; ++var5) {
            for (int var8 = 0; ~var8 > -9; ++var8) {
                class206.field4109[arg0][arg1 + var5][arg2 + var8] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var6 = 1; var6 < 8; ++var6) {
                class206.field4109[arg0][arg1][arg2 + var6] = class206.field4109[arg0][arg1 + -1][arg2 - -var6];
            }
        }
        if (~arg2 < -1) {
            for (int var7 = 1; var7 < 8; ++var7) {
                class206.field4109[arg0][arg1 + var7][arg2] = class206.field4109[arg0][arg1 + var7][arg2 - 1];
            }
        }
        if (arg1 > 0 && ~class206.field4109[arg0][arg1 + -1][arg2] != -1) {
            class206.field4109[arg0][arg1][arg2] = class206.field4109[arg0][arg1 + -1][arg2];
        } else if (~arg2 < -1 && ~class206.field4109[arg0][arg1][arg2 - 1] != -1) {
            class206.field4109[arg0][arg1][arg2] = class206.field4109[arg0][arg1][arg2 + -1];
        } else if (arg1 > 0 && ~arg2 < -1 && class206.field4109[arg0][arg1 - 1][arg2 + -1] != 0) {
            class206.field4109[arg0][arg1][arg2] = class206.field4109[arg0][arg1 - 1][arg2 + -1];
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lag;ILag;)V")
    public static final void method883(class8 arg0, int arg1, class8 arg2) {
        class204.field4056 = arg0;
        ++field2714;
        class146.field3087 = arg2;
        if (arg1 != 7252) {
            method881(true);
        }
        class58.field1442 = class146.field3087.method56((byte) 31, 3);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)V")
    public static final void method884(int arg0, int arg1) {
        if (arg1 > -32) {
            method884(41, 25);
        }
        ++field2716;
        class210 var2 = (class210) class35.field746.method796(true, (long) arg0);
        if (var2 != null) {
            var2.method799(-24265);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field2725;
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (arg0 != 75) {
            this.field2727 = 52;
        }
        if (super.field816.field3661) {
            int var4 = class22.field450[arg1];
            for (int var5 = 0; ~class72.field1719 < ~var5; ++var5) {
                int var6 = class118.field2622[var5];
                if (this.field2727 < var6 && var6 < -this.field2727 + 4096 && -this.field2727 + 2048 < var4 && ~var4 > ~(this.field2727 + 2048)) {
                    int var7 = 2048 - var6;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field2727 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (var6 > 2048 - this.field2727 && ~(2048 - -this.field2727) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field2727;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field2727);
                } else if (~var4 <= ~this.field2727 && ~(4096 - this.field2727) <= ~var4) {
                    if (~this.field2727 >= ~var6 && var6 <= -this.field2727 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field2727 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field2727;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field2727 + 2048);
                }
            }
        }
        return var3;
    }
}
