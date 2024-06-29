import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class270 extends class354 {

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "Lao;")
    public static class188 field3917 = new class188(67, 5);

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "Lvp;")
    public static class123 field3922 = new class123(11, 8);

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "[Luj;")
    public static class259[] field3923 = new class259[5];

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "[I")
    public static int[] field3924;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "[Lvu;")
    private class222[] field3920;

    static {
        for (int var0 = 0; var0 < field3923.length; ++var0) {
            field3923[var0] = new class259();
        }
        field3924 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)J", line = 6)
    public static final long method1733(int arg0) {
        if (arg0 != 1) {
            return -25L;
        } else {
            ++field3919;
            return class44.field674.method1028(arg0 + -1);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILti;I)V", line = 18)
    public final void method206(int arg0, class303 arg1, int arg2) {
        ++field3921;
        if (arg0 != 15180) {
            field3923 = null;
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field5354 = ~arg1.method1918((byte) -105) == -2;
                return;
            }
        } else {
            this.field3920 = new class222[arg1.method1918((byte) -74)];
            for (int var4 = 0; this.field3920.length > var4; ++var4) {
                int var5 = arg1.method1918((byte) 70);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field3920[var4] = class143.method1035(11, arg1);
                            }
                        } else {
                            this.field3920[var4] = class225.method1489(arg1, 15);
                        }
                    } else {
                        this.field3920[var4] = class481.method2876(-75, arg1);
                    }
                } else {
                    this.field3920[var4] = class472.method2824(arg1, 1478637600);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(III)V", line = 92)
    public static final void method1734(int arg0, int arg1, int arg2) {
        ++field3914;
        int var3 = -50 % ((arg2 - -7) / 43);
        if (class91.method738(false, arg0)) {
            class223.method1476(arg1, class416.field6157[arg0], (byte) -80);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)[[I", line = 107)
    public final int[][] method207(byte arg0, int arg1) {
        if (arg0 > -40) {
            return null;
        } else {
            ++field3915;
            int[][] var3 = super.field5351.method2819((byte) -82, arg1);
            if (super.field5351.field6959) {
                int var4 = class404.field5952;
                int var5 = class337.field5146;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field5351.method2820(0);
                this.method1736(19471, var6);
                for (int var8 = 0; ~var8 > ~class337.field5146; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; ~class404.field5952 < ~var14; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class388.method2441(4080, var15 << 4);
                        var12[var14] = class388.method2441(4080, var15 >> 4);
                        var11[var14] = class388.method2441(16711680, var15) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 173)
    public class270() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIZIB)V", line = 179)
    public static final void method1735(int arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        if (~class399.field5865 == -1) {
            class438.method2660(114, false);
        } else {
            class311.field4452 = class399.field5865;
            class470.method2803(0, (byte) -124);
        }
        if (arg4 <= 17) {
            method1734(74, 51, -81);
        }
        ++field3916;
        class448.field6568 = arg3;
        class292.field4181 = arg2;
        class65.field1146 = arg0;
        class2.method18(arg1);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)[I", line = 201)
    public final int[] method253(int arg0, byte arg1) {
        ++field3918;
        if (arg1 != -95) {
            this.method206(-17, (class303) null, -13);
        }
        int[] var3 = super.field5357.method861(true, arg0);
        if (super.field5357.field1869) {
            this.method1736(arg1 ^ -19538, super.field5357.method863(-12364));
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[[I)V", line = 223)
    private final void method1736(int arg0, int[][] arg1) {
        if (arg0 == 19471) {
            ++field3913;
            int var3 = class404.field5952;
            int var4 = class337.field5146;
            class460.method2755(arg1, (byte) 126);
            class25.method210(0, class168.field2527, (byte) 8, class30.field492, 0);
            if (this.field3920 != null) {
                for (int var5 = 0; ~var5 > ~this.field3920.length; ++var5) {
                    class222 var6 = this.field3920[var5];
                    int var7 = var6.field3207;
                    int var8 = var6.field3210;
                    if (var7 >= 0) {
                        if (~var8 > -1) {
                            var6.method44(var4, arg0 + -19471, var3);
                        } else {
                            var6.method51(var3, var4, arg0 + -19589);
                        }
                    } else if (var8 >= 0) {
                        var6.method48(var3, var4, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V", line = 273)
    public static void method1737(byte arg0) {
        field3923 = null;
        field3917 = null;
        if (arg0 >= 89) {
            field3924 = null;
            field3922 = null;
        }
    }
}
