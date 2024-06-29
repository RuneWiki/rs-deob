import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class477 extends class278 {

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
    public static int field6977 = 0;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "Lfg;")
    public static class83 field6978 = new class83("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "[Ljava/lang/String;")
    public static String[] field6984 = new String[100];

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "[I")
    public static int[] field6982;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "[Lue;")
    private class154[] field6981;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)[I", line = 8)
    public final int[] method208(int arg0, int arg1) {
        ++field6979;
        if (arg0 != -9) {
            field6978 = null;
        }
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (super.field3750.field554) {
            this.method2803(true, super.field3750.method253(arg0 + 9));
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V", line = 33)
    public class477() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)[[I", line = 38)
    public final int[][] method324(int arg0, int arg1) {
        ++field6975;
        if (arg0 < 75) {
            this.method208(-58, -64);
        }
        int[][] var3 = super.field3757.method1450(arg1, -1);
        if (super.field3757.field3420) {
            int var4 = class507.field7456;
            int var5 = class307.field4211;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field3757.method1452((byte) 54);
            this.method2803(true, var6);
            for (int var8 = 0; ~var8 > ~class307.field4211; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class507.field7456 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class118.method750(var15, 255) << 4;
                    var12[var14] = class118.method750(4080, var15 >> 4);
                    var11[var14] = class118.method750(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z[[I)V", line = 102)
    private final void method2803(boolean arg0, int[][] arg1) {
        ++field6974;
        int var3 = class507.field7456;
        int var4 = class307.field4211;
        class295.method1691(arg1, 106);
        class33.method214(class40.field549, 0, (byte) 111, class412.field6045, 0);
        if (this.field6981 != null) {
            for (int var5 = 0; var5 < this.field6981.length; ++var5) {
                class154 var6 = this.field6981[var5];
                int var7 = var6.field2213;
                int var8 = var6.field2212;
                if (~var7 <= -1) {
                    if (~var8 > -1) {
                        var6.method296(var3, -104, var4);
                    } else {
                        var6.method295(var4, var3, 14619);
                    }
                } else if (var8 >= 0) {
                    var6.method294(var4, (byte) 21, var3);
                }
            }
        }
        if (!arg0) {
            field6978 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V", line = 152)
    public static void method2804(int arg0) {
        field6982 = null;
        if (arg0 != 0) {
            field6983 = 14;
        }
        field6984 = null;
        field6978 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Llh;II)V", line = 170)
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (arg1 == -30446) {
            ++field6976;
            if (~arg2 == -1) {
                this.field6981 = new class154[arg0.method2099(255)];
                for (int var4 = 0; ~this.field6981.length < ~var4; ++var4) {
                    int var5 = arg0.method2099(arg1 ^ -30227);
                    if (~var5 != -1) {
                        if (~var5 != -2) {
                            if (~var5 != -3) {
                                if (~var5 == -4) {
                                    this.field6981[var4] = class509.method2992(-3003, arg0);
                                }
                            } else {
                                this.field6981[var4] = class308.method1745(arg1 + 63439, arg0);
                            }
                        } else {
                            this.field6981[var4] = class301.method1718(81, arg0);
                        }
                    } else {
                        this.field6981[var4] = class263.method1515((byte) -18, arg0);
                    }
                }
            } else if (arg2 == 1) {
                super.field3754 = ~arg0.method2099(255) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)V", line = 243)
    public static final void method2805(byte arg0) {
        ++field6980;
        class219 var1 = null;
        try {
            class409 var2 = class282.field3804.method2292((byte) 104, "2");
            while (~var2.field5652 == -1) {
                class496.method2931((byte) 122, 1L);
            }
            if (var2.field5652 == 1) {
                var1 = (class219) var2.field5654;
                class365 var3 = new class365(class371.field5212 * 6 + 3);
                var3.method2084(1, false);
                var3.method2070(81954016, class371.field5212);
                for (int var4 = 0; ~var4 > ~class505.field7432.length; ++var4) {
                    if (class326.field4473[var4]) {
                        var3.method2070(81954016, var4);
                        var3.method2074(false, class505.field7432[var4]);
                    }
                }
                var1.method1295(0, var3.field5069, (byte) 26, var3.field5073);
            }
            if (arg0 > -81) {
                method2805((byte) 73);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method1297((byte) -78);
            }
        } catch (Exception var5) {
        }
        class159.field2286 = class333.method1850(-3562);
        class354.field4824 = false;
    }
}
