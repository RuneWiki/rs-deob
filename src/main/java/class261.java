import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class261 extends class264 {

    @OriginalMember(owner = "client!lc", name = "pb", descriptor = "I")
    private int field4456 = 2048;

    @OriginalMember(owner = "client!lc", name = "sb", descriptor = "I")
    private int field4459 = 0;

    @OriginalMember(owner = "client!lc", name = "zb", descriptor = "I")
    private int field4466 = 10;

    @OriginalMember(owner = "client!lc", name = "kb", descriptor = "Lma;")
    public static class5 field4451 = class12.method119("um", (byte) 110);

    @OriginalMember(owner = "client!lc", name = "gb", descriptor = "Lma;")
    public static class5 field4447 = class12.method119(")4g", (byte) 68);

    @OriginalMember(owner = "client!lc", name = "rb", descriptor = "[I")
    public static int[] field4458 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!lc", name = "xb", descriptor = "I")
    public static int field4464 = 0;

    @OriginalMember(owner = "client!lc", name = "yb", descriptor = "Lma;")
    public static class5 field4465 = class12.method119("<col=40ff00>", (byte) 53);

    @OriginalMember(owner = "client!lc", name = "fb", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!lc", name = "hb", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!lc", name = "ib", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!lc", name = "lb", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!lc", name = "nb", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!lc", name = "ob", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!lc", name = "qb", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!lc", name = "tb", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!lc", name = "vb", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!lc", name = "wb", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!lc", name = "jb", descriptor = "[I")
    private int[] field4450;

    @OriginalMember(owner = "client!lc", name = "mb", descriptor = "[I")
    private int[] field4453;

    @OriginalMember(owner = "client!lc", name = "ub", descriptor = "[S")
    public static short[] field4461;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "(I)V", line = 11)
    public static void method1806(int arg0) {
        if (arg0 != 0) {
            field4464 = 83;
        }
        field4451 = null;
        field4458 = null;
        field4461 = null;
        field4465 = null;
        field4447 = null;
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V", line = 29)
    public final void method111(int arg0) {
        this.method1807(-4574);
        int var2 = 122 / ((66 - arg0) / 44);
        field4449++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILii;)V", line = 40)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg1 > -27) {
            this.field4450 = (int[]) null;
        }
        if (arg0 == 0) {
            this.field4466 = arg2.method1509(true);
        } else if (arg0 == 1) {
            this.field4456 = arg2.method1524((byte) 68);
        } else if (arg0 == 2) {
            this.field4459 = arg2.method1509(true);
        }
        field4446++;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 95)
    public class261() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)[I", line = 112)
    public final int[] method5(int arg0, int arg1) {
        int[] var3 = this.field4501.method1176(arg1, 126);
        if (arg0 > -58) {
            this.field4459 = -9;
        }
        if (this.field4501.field2741) {
            int var4 = class116.field1726[arg1];
            if (this.field4459 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field4466; var12++) {
                    if (var4 >= this.field4450[var12] && this.field4450[var12 + 1] > var4) {
                        if (this.field4453[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class42.method292(var3, 0, class226.field3716, var11);
            } else {
                for (int var5 = 0; var5 < class226.field3716; var5++) {
                    short var6 = 0;
                    int var7 = class251.field4159[var5];
                    int var8 = 0;
                    int var9 = this.field4459;
                    if (var9 == 1) {
                        var8 = var7;
                    } else if (var9 == 2) {
                        var8 = (var4 + var7 - 4096 >> 1) + 2048;
                    } else if (var9 == 3) {
                        var8 = (var7 - var4 >> 1) + 2048;
                    }
                    for (int var10 = 0; var10 < this.field4466; var10++) {
                        if (this.field4450[var10] <= var8 && var8 < this.field4450[var10 + 1]) {
                            if (this.field4453[var10] > var8) {
                                var6 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var6;
                }
            }
        }
        field4460++;
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "(I)V", line = 237)
    private final void method1807(int arg0) {
        this.field4453 = new int[this.field4466 + 1];
        int var2 = 0;
        this.field4450 = new int[this.field4466 + 1];
        int var3 = 4096 / this.field4466;
        field4452++;
        int var4 = this.field4456 * var3 >> 12;
        int var5 = 0;
        if (arg0 != -4574) {
            return;
        }
        while (this.field4466 > var5) {
            this.field4450[var5] = var2;
            this.field4453[var5] = var2 + var4;
            var2 += var3;
            var5++;
        }
        this.field4450[this.field4466] = 4096;
        this.field4453[this.field4466] = this.field4453[0] + 4096;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)V", line = 268)
    public static final void method1808(byte arg0) {
        field4448++;
        while (class200.field3184.method1386(class171.field2625, arg0 + 13389) >= 11) {
            int var1 = class200.field3184.method1387(true, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class267.field4593[var1] == null) {
                var2 = true;
                class267.field4593[var1] = new class91();
                if (class129.field1933[var1] != null) {
                    class267.field4593[var1].method601(11186, class129.field1933[var1]);
                }
            }
            class118.field1785[class175.field2675++] = var1;
            class91 var3 = class267.field4593[var1];
            var3.field217 = class50.field784;
            int var4 = class200.field3184.method1387(true, 5);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class200.field3184.method1387(true, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class200.field3184.method1387(true, 1);
            int var7 = class114.field1699[class200.field3184.method1387(true, 3)];
            if (var2) {
                var3.field215 = var3.field174 = var7;
            }
            int var8 = class200.field3184.method1387(true, 1);
            if (var8 == 1) {
                class156.field2320[class287.field4838++] = var1;
            }
            var3.method121(class151.field2183.field175[0] + var5, var6 == 1, -22763, class151.field2183.field186[0] + var4);
        }
        if (arg0 != -62) {
            method1809((byte) 125, (class221) null);
        }
        class200.field3184.method1391(arg0 + 64);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLii;)V", line = 339)
    public static final void method1809(byte arg0, class221 arg1) {
        field4463++;
        int var2 = 48 % ((-arg0 - 54) / 62);
        while (true) {
            while (arg1.field3617.length > arg1.field3610) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (arg1.method1509(true) == 1) {
                    var3 = true;
                    var4 = arg1.method1509(true);
                    var5 = arg1.method1509(true);
                }
                int var6 = arg1.method1509(true);
                int var7 = arg1.method1509(true);
                int var8 = class289.field4918 + class97.field1460 - (var7 * 64) - 1;
                int var9 = var6 * 64 - class206.field3284;
                if (var9 >= 0 && (var8 - 63) >= 0 && class139.field2066 > var9 + 63 && class97.field1460 > var8) {
                    int var10 = var9 >> 6;
                    int var11 = var8 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var3 || var4 * 8 <= var12 && var12 < var4 * 8 + 8 && var13 >= (var5 * 8) && var5 * 8 + 8 > var13) {
                                byte var14 = arg1.method1543(false);
                                if (var14 != 0) {
                                    if (class170.field2614[var10][var11] == null) {
                                        class170.field2614[var10][var11] = new byte[4096];
                                    }
                                    class170.field2614[var10][var11][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg1.method1543(false);
                                    if (class276.field4707[var10][var11] == null) {
                                        class276.field4707[var10][var11] = new byte[4096];
                                    }
                                    class276.field4707[var10][var11][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var3 ? 64 : 4096); var16++) {
                        byte var17 = arg1.method1543(false);
                        if (var17 != 0) {
                            arg1.field3610++;
                        }
                    }
                }
            }
            return;
        }
    }
}
