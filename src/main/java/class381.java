import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class381 extends class13 {

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
    private int field5435 = 0;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
    private int field5439 = 0;

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "I")
    private int field5436 = 0;

    @OriginalMember(owner = "client!gj", name = "V", descriptor = "[Lqa;")
    public static class134[] field5447 = new class134[2048];

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "I")
    public static int field5448 = 2;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
    private int field5431;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
    private int field5432;

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "I")
    private int field5433;

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
    private int field5437;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    private int field5438;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "I")
    private int field5443;

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)Z")
    public static final boolean method2426(int arg0, int arg1) {
        ++field5444;
        class437 var2 = class302.method1949(arg0, (byte) -53);
        if (var2 == null) {
            return false;
        } else if (~class294.field4112 != -4) {
            class366.field5163 = var2.field6150;
            class277.field3883 = var2.field6149;
            if (class203.field2787 != 0) {
                class13.field262 = 40000 - -class277.field3883;
                class412.field5845 = class277.field3883 + 50000;
                class158.field2224 = class13.field262;
            }
            return true;
        } else {
            String var3 = "";
            if (class203.field2787 != 0) {
                var3 = ":" + (var2.field6149 + 7000);
            }
            String var4 = "";
            if (class386.field5539 != null) {
                var4 = "/p=" + class386.field5539;
            }
            if (arg1 != 10869) {
                return true;
            } else {
                String var5 = "http://" + var2.field6150 + var3 + "/l=" + class210.field2935 + "/a=" + class331.field4578 + var4 + "/j" + (!class373.field5238 ? "0" : "1") + ",o" + (!class237.field3376 ? "0" : "1") + ",a2";
                try {
                    class133.field1914.getAppletContext().showDocument(new URL(var5), "_self");
                    return true;
                } catch (Exception var6) {
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V")
    public static final void method2427(int arg0) {
        if (arg0 != -31499) {
            field5447 = null;
        }
        class99.field1368 = 0;
        ++field5441;
        class438.field6171 = 0;
        class377.method2409(4);
        class406.method2550(32);
        class123.method829(662);
        for (int var1 = 0; ~var1 > ~class99.field1368; ++var1) {
            int var3 = class112.field1627[var1];
            if (~class276.field3837 != ~class98.field1358[var3].field5260) {
                if (class98.field1358[var3].field2737.method2102(-4092)) {
                    class285.method1862(1, class98.field1358[var3]);
                }
                class98.field1358[var3].method1290((byte) 114, (class327) null);
                class98.field1358[var3] = null;
            }
        }
        if (~class15.field290 != ~class333.field4591.field191) {
            throw new RuntimeException("gnp1 pos:" + class333.field4591.field191 + " psize:" + class15.field290);
        } else {
            for (int var2 = 0; ~class125.field1758 < ~var2; ++var2) {
                if (class98.field1358[class135.field1967[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class125.field1758);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lkh;BI)V")
    public final void method31(class11 arg0, byte arg1, int arg2) {
        ++field5442;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field5435 = (arg0.method162(-4436) << 12) / 100;
                }
            } else {
                this.field5439 = (arg0.method162(-4436) << 12) / 100;
            }
        } else {
            this.field5436 = arg0.method207(7124);
        }
        if (arg1 <= 50) {
            field5448 = 49;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIII)V")
    private final void method2428(int arg0, int arg1, int arg2, int arg3) {
        ++field5446;
        if (arg1 != 2) {
            method2430(true);
        }
        int var5 = ~arg0 <= ~arg3 ? arg0 : arg3;
        int var6 = arg0 <= arg3 ? arg0 : arg3;
        int var7 = ~arg2 < ~var5 ? arg2 : var5;
        int var8 = var6 > arg2 ? arg2 : var6;
        this.field5431 = (var7 + var8) / 2;
        int var9 = -var8 + var7;
        if (~var9 < -1) {
            int var10 = (-arg3 + var7 << 12) / var9;
            int var11 = (var7 - arg0 << 12) / var9;
            int var12 = (var7 - arg2 << 12) / var9;
            if (~arg3 == ~var7) {
                this.field5432 = ~arg0 != ~var8 ? -var11 + 4096 : var12 + 20480;
            } else if (arg0 != var7) {
                this.field5432 = ~arg3 == ~var8 ? var11 + 12288 : -var10 + 20480;
            } else {
                this.field5432 = arg2 != var8 ? -var12 + 12288 : var10 + 4096;
            }
            this.field5432 /= 6;
        } else {
            this.field5432 = 0;
        }
        if (~this.field5431 < -1 && this.field5431 < 4096) {
            this.field5433 = (var9 << 12) / (~this.field5431 < -2049 ? -(this.field5431 * 2) + 8192 : this.field5431 * 2);
        } else {
            this.field5433 = 0;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)[[I")
    public final int[][] method222(int arg0, int arg1) {
        ++field5445;
        if (arg0 != -27832) {
            method2426(-76, -52);
        }
        int[][] var3 = super.field256.method1930(arg1, (byte) 115);
        if (super.field256.field4154) {
            int[][] var4 = this.method227(false, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class269.field3751; ++var11) {
                this.method2428(var6[var11], 2, var7[var11], var5[var11]);
                this.field5432 += this.field5436;
                this.field5431 += this.field5435;
                this.field5433 += this.field5439;
                while (~this.field5432 > -1) {
                    this.field5432 += 4096;
                }
                while (~this.field5432 < -4097) {
                    this.field5432 -= 4096;
                }
                if (this.field5433 < 0) {
                    this.field5433 = 0;
                }
                if (~this.field5431 > -1) {
                    this.field5431 = 0;
                }
                if (~this.field5433 < -4097) {
                    this.field5433 = 4096;
                }
                if (~this.field5431 < -4097) {
                    this.field5431 = 4096;
                }
                this.method2431(this.field5433, this.field5432, this.field5431, -2);
                var8[var11] = this.field5443;
                var9[var11] = this.field5438;
                var10[var11] = this.field5437;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -33 / ((-56 - arg0) / 58);
        class54.method441(arg3, arg4, arg2, 0, arg7, 15415, arg5, arg1, arg6);
        ++field5440;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
    public static void method2430(boolean arg0) {
        field5447 = null;
        if (arg0) {
            method2430(true);
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
    public class381() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(IIII)V")
    private final void method2431(int arg0, int arg1, int arg2, int arg3) {
        ++field5434;
        int var5 = ~arg2 < -2049 ? -(arg0 * arg2 >> 12) + arg0 + arg2 : (arg0 + 4096) * arg2 >> 12;
        if (arg3 != -2) {
            field5447 = null;
        }
        if (var5 <= 0) {
            this.field5443 = this.field5438 = this.field5437 = arg2;
        } else {
            int var6 = arg1 * 6;
            int var7 = arg2 - var5 + arg2;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 - -var13;
            int var15 = var5 - var13;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (var9 != 2) {
                        if (var9 != 3) {
                            if (var9 != 4) {
                                if (var9 == 5) {
                                    this.field5438 = var7;
                                    this.field5437 = var15;
                                    this.field5443 = var5;
                                }
                            } else {
                                this.field5438 = var7;
                                this.field5443 = var14;
                                this.field5437 = var5;
                            }
                        } else {
                            this.field5438 = var15;
                            this.field5437 = var5;
                            this.field5443 = var7;
                        }
                    } else {
                        this.field5443 = var7;
                        this.field5437 = var14;
                        this.field5438 = var5;
                    }
                } else {
                    this.field5437 = var7;
                    this.field5438 = var5;
                    this.field5443 = var15;
                }
            } else {
                this.field5438 = var14;
                this.field5437 = var7;
                this.field5443 = var5;
            }
        }
    }

    static {
        new class442("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
    }
}
