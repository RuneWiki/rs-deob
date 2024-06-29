import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class41 extends class346 {

    @OriginalMember(owner = "client!eo", name = "M", descriptor = "I")
    private int field626 = 585;

    @OriginalMember(owner = "client!eo", name = "P", descriptor = "Ljava/lang/String;")
    public static String field629 = "glow1:";

    @OriginalMember(owner = "client!eo", name = "L", descriptor = "Lm;")
    public static class242 field625 = new class242();

    @OriginalMember(owner = "client!eo", name = "H", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!eo", name = "I", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!eo", name = "J", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!eo", name = "K", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!eo", name = "N", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!eo", name = "O", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!eo", name = "Q", descriptor = "Los;")
    public static class129 field630;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BLie;)V", line = 3)
    public static final void method298(byte arg0, class138 arg1) {
        ++field624;
        if (!class165.field2244) {
            if (arg0 != -44) {
                field630 = null;
            }
            arg1.method2632(true);
            --class402.field5874;
        }
    }

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "(II)I", line = 20)
    public static final int method299(int arg0, int arg1) {
        ++field627;
        if (arg0 != 2) {
            field629 = null;
        }
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 - -1;
    }

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "(I)V", line = 38)
    public static void method300(int arg0) {
        int var1 = 119 % ((54 - arg0) / 56);
        field629 = null;
        field625 = null;
        field630 = null;
    }

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "(Z)V", line = 49)
    public static final void method301(boolean arg0) {
        ++field628;
        if (class400.field5864) {
            class400.field5864 = false;
            class295.field4450 = null;
            if (arg0) {
                class321.field4780 = null;
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V", line = 65)
    public class41() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lw;Lbd;Ltj;B)V", line = 69)
    public static final void method302(class170 arg0, class27 arg1, class298 arg2, byte arg3) {
        ++field621;
        class315 var4 = arg0.method1144((byte) -100, arg2);
        if (var4 != null) {
            int var5 = var4.method208();
            if (var4.method202() > var5) {
                var5 = var4.method202();
            }
            byte var6 = 10;
            int var7 = arg1.field459;
            int var8 = arg1.field470;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            if (arg0.field2320 != null) {
                var9 = class276.field4054.method2690((byte) 106, (int[]) null, arg0.field2320, class238.field3334, (class315[]) null);
                for (int var12 = 0; var12 < var9; ++var12) {
                    String var13 = class238.field3334[var12];
                    if (var12 < var9 + -1) {
                        var13 = var13.substring(0, var13.length() - 4);
                    }
                    int var14 = class268.field3965.method2612(var13);
                    if (var14 > var10) {
                        var10 = var14;
                    }
                }
                var11 = class268.field3965.method2615() * var9 - -(class268.field3965.method2611() / 2);
            }
            int var15 = var5 / 2 + arg1.field459;
            if (var7 < class200.field2784 - -var5) {
                var7 = class200.field2784;
                var15 = var5 / 2 + class200.field2784 + var10 / 2 + 5 - -var6;
            } else if (~var7 < ~(-var5 + class200.field2790)) {
                var7 = class200.field2790 - var5;
                var15 = class200.field2790 - 5 + -(var5 / 2) + -var6 + -(var10 / 2);
            }
            int var16 = arg1.field470;
            if (var8 < class200.field2791 - -var5) {
                var16 = var5 / 2 + (class200.field2791 - -var6);
                var8 = class200.field2791;
            } else if (-var5 + class200.field2787 < var8) {
                var8 = -var5 + class200.field2787;
                var16 = -(var5 / 2) + class200.field2787 + -var11 + -var6;
            }
            int var17 = 65535 & (int) (32767.0D * (Math.atan2((double) (-arg1.field459 + var7), (double) (-arg1.field470 + var8)) / 3.141592653589793D));
            var4.method2067((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
            int var18 = -2;
            int var19 = -2;
            int var20 = -2;
            int var21 = -2;
            if (arg0.field2320 != null) {
                var18 = var15 - 5 + -(var10 / 2);
                var19 = var16;
                var20 = var18 + 10 + var10;
                var21 = class268.field3965.method2615() * var9 + (var16 - -3);
                if (arg0.field2306 != 0) {
                    arg2.method2023(-var16 + var21, var18, var16, -11682, -var18 + var20, arg0.field2306);
                }
                if (arg0.field2324 != 0) {
                    arg2.method2014(var16, 0, arg0.field2324, var18, -var18 + var20, -var16 + var21);
                }
                for (int var22 = 0; ~var9 < ~var22; ++var22) {
                    String var23 = class238.field3334[var22];
                    if (~var22 > ~(var9 + -1)) {
                        var23 = var23.substring(0, -4 + var23.length());
                    }
                    class268.field3965.method2616(arg2, var23, var15, var16, arg0.field2298, true);
                    var16 += class268.field3965.method2615();
                }
            }
            int var24 = var5 >> 1;
            if (~class277.field4060 < ~(var7 - var24) && ~(var7 - -var24) < ~class277.field4060 && class217.field3032 > var8 - var24 && class217.field3032 < var8 - -var24 || var18 < class277.field4060 && ~class277.field4060 > ~var20 && ~class217.field3032 < ~var19 && var21 > class217.field3032) {
                if (arg0.field2310[4] != null) {
                    class24.method213(0, arg0.field2310[4], arg0.field2337, -1, (byte) 111, (long) arg1.field462, 0, 1006);
                }
                if (arg0.field2310[3] != null) {
                    class24.method213(0, arg0.field2310[3], arg0.field2337, -1, (byte) 105, (long) arg1.field462, 0, 1004);
                }
                if (arg0.field2310[2] != null) {
                    class24.method213(0, arg0.field2310[2], arg0.field2337, -1, (byte) 108, (long) arg1.field462, 0, 1012);
                }
                if (arg0.field2310[1] != null) {
                    class24.method213(0, arg0.field2310[1], arg0.field2337, -1, (byte) 98, (long) arg1.field462, 0, 1007);
                }
                if (arg0.field2310[0] != null) {
                    class24.method213(0, arg0.field2310[0], arg0.field2337, -1, (byte) 120, (long) arg1.field462, 0, 1001);
                }
            }
            if (arg3 > -63) {
                method301(true);
            }
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lfb;ZI)V", line = 221)
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        if (arg1) {
            method300(-110);
        }
        if (~arg2 == -1) {
            this.field626 = arg0.method2239(-1076227960);
        }
        ++field622;
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(II)[I", line = 248)
    public final int[] method45(int arg0, int arg1) {
        ++field623;
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (arg1 != 3) {
            method298((byte) 127, (class138) null);
        }
        if (super.field5152.field3004) {
            int var4 = class436.field6337[arg0];
            for (int var5 = 0; class134.field1753 > var5; ++var5) {
                int var6 = class361.field5340[var5];
                if (~var6 < ~this.field626 && ~var6 > ~(4096 - this.field626) && ~var4 < ~(-this.field626 + 2048) && var4 < this.field626 + 2048) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field626 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (-this.field626 + 2048 < var6 && ~(this.field626 + 2048) < ~var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field626;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field626);
                } else if (var4 >= this.field626 && ~var4 >= ~(-this.field626 + 4096)) {
                    if (var6 >= this.field626 && ~var6 >= ~(-this.field626 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field626 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field626;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field626 + 2048);
                }
            }
        }
        return var3;
    }
}
