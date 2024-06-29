import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class66 extends class46 {

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    private int field801;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    private int field799;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    private int field806;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    private int field800;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLee;)Lvea;")
    public static final class273 method547(byte arg0, class675 arg1) {
        if (arg0 != 48) {
            method547((byte) 87, (class675) null);
        }
        ++field805;
        class220 var2 = class283.method1855(arg1, (byte) -128);
        int var3 = arg1.method3703(arg0 + 48);
        int var4 = arg1.method3703(arg0 ^ 91);
        return new class273(var2.field2867, var2.field2876, var2.field2871, var2.field2875, var2.field2873, var2.field2874, var2.field2865, var2.field2864, var2.field2872, var3, var4);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZII)V")
    public final void method301(boolean arg0, int arg1, int arg2) {
        ++field798;
        if (arg0) {
            this.field800 = -88;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lha;IBLjt;)V")
    public static final void method548(class58 arg0, int arg1, byte arg2, class104 arg3) {
        ++field797;
        if (class492.field6938 != null && ~arg1 >= ~arg3.field1241) {
            for (int var4 = 0; ~var4 > ~class492.field6938.length; ++var4) {
                if (class492.field6938[var4] != -1000000 && (~arg3.field1246[0] >= ~class492.field6938[var4] || ~arg3.field1246[1] >= ~class492.field6938[var4] || ~class492.field6938[var4] <= ~arg3.field1246[2] || ~class492.field6938[var4] <= ~arg3.field1246[3]) && (arg3.field1236[0] <= class125.field1517[var4] || ~arg3.field1236[1] >= ~class125.field1517[var4] || ~arg3.field1236[2] >= ~class125.field1517[var4] || class125.field1517[var4] >= arg3.field1236[3]) && (arg3.field1236[0] >= class125.field1520[var4] || ~arg3.field1236[1] <= ~class125.field1520[var4] || ~class125.field1520[var4] >= ~arg3.field1236[2] || arg3.field1236[3] >= class125.field1520[var4]) && (class227.field3057[var4] >= arg3.field1237[0] || ~arg3.field1237[1] >= ~class227.field3057[var4] || class227.field3057[var4] >= arg3.field1237[2] || arg3.field1237[3] <= class227.field3057[var4]) && (~arg3.field1237[0] <= ~class491.field6933[var4] || arg3.field1237[1] >= class491.field6933[var4] || class491.field6933[var4] <= arg3.field1237[2] || arg3.field1237[3] >= class491.field6933[var4])) {
                    return;
                }
            }
        }
        if (arg2 <= 22) {
            method549(-87, -70);
        }
        if (~arg3.field1243 == -2) {
            int var5 = class453.field6405 + arg3.field1235 - class136.field1982;
            if (~var5 <= -1 && ~(class453.field6405 + class453.field6405) <= ~var5) {
                int var6 = arg3.field1248 - class481.field6801 + class453.field6405;
                if (var6 >= 0) {
                    if (~(class453.field6405 + class453.field6405) > ~var6) {
                        return;
                    }
                } else {
                    var6 = 0;
                }
                int var7 = -class481.field6801 + arg3.field1239 + class453.field6405;
                if (class453.field6405 + class453.field6405 < var7) {
                    var7 = class453.field6405 + class453.field6405;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (~var6 >= ~var7) {
                    if (class589.field8299[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (-arg3.field1236[0] + class373.field5241);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!(var9 < (float) class477.field6771)) {
                        if (class344.method2232(0, arg3, (byte) -83)) {
                            if (class344.method2232(1, arg3, (byte) -83)) {
                                if (class344.method2232(2, arg3, (byte) -83)) {
                                    if (class344.method2232(3, arg3, (byte) -83)) {
                                        class686.field9381[class213.field2813++] = arg3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (~arg3.field1243 == -3) {
            int var10 = -class481.field6801 + arg3.field1248 + class453.field6405;
            if (~var10 <= -1 && var10 <= class453.field6405 - -class453.field6405) {
                int var11 = -class136.field1982 + arg3.field1235 - -class453.field6405;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > class453.field6405 + class453.field6405) {
                    return;
                }
                int var12 = class453.field6405 + arg3.field1249 - class136.field1982;
                if (~(class453.field6405 + class453.field6405) > ~var12) {
                    var12 = class453.field6405 + class453.field6405;
                } else if (~var12 > -1) {
                    return;
                }
                boolean var13 = false;
                while (var12 >= var11) {
                    if (class589.field8299[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (-arg3.field1237[0] + class644.field8823);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!(var14 < (float) class477.field6771)) {
                        if (class344.method2232(0, arg3, (byte) -83)) {
                            if (class344.method2232(1, arg3, (byte) -83)) {
                                if (class344.method2232(2, arg3, (byte) -83)) {
                                    if (class344.method2232(3, arg3, (byte) -83)) {
                                        class686.field9381[class213.field2813++] = arg3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (arg3.field1243 != 16 && ~arg3.field1243 != -9) {
            if (~arg3.field1243 == -5) {
                float var15 = (float) (arg3.field1246[0] + -class147.field2112);
                if (!(var15 <= (float) class731.field10217)) {
                    int var16 = -class481.field6801 + arg3.field1248 - -class453.field6405;
                    if (var16 >= 0) {
                        if (~(class453.field6405 + class453.field6405) > ~var16) {
                            return;
                        }
                    } else {
                        var16 = 0;
                    }
                    int var17 = -class481.field6801 + arg3.field1239 - -class453.field6405;
                    if (~var17 >= ~(class453.field6405 + class453.field6405)) {
                        if (~var17 > -1) {
                            return;
                        }
                    } else {
                        var17 = class453.field6405 + class453.field6405;
                    }
                    int var18 = class453.field6405 + arg3.field1235 - class136.field1982;
                    if (~var18 <= -1) {
                        if (class453.field6405 - -class453.field6405 < var18) {
                            return;
                        }
                    } else {
                        var18 = 0;
                    }
                    int var19 = -class136.field1982 + class453.field6405 + arg3.field1249;
                    if (~(class453.field6405 + class453.field6405) > ~var19) {
                        var19 = class453.field6405 + class453.field6405;
                    } else if (var19 < 0) {
                        return;
                    }
                    boolean var20 = false;
                    label296: for (int var21 = var18; ~var21 >= ~var19; ++var21) {
                        for (int var22 = var16; var22 <= var17; ++var22) {
                            if (class589.field8299[var21][var22]) {
                                var20 = true;
                                break label296;
                            }
                        }
                    }
                    if (var20) {
                        if (class344.method2232(0, arg3, (byte) -83)) {
                            if (class344.method2232(1, arg3, (byte) -83)) {
                                if (class344.method2232(2, arg3, (byte) -83)) {
                                    if (class344.method2232(3, arg3, (byte) -83)) {
                                        class686.field9381[class213.field2813++] = arg3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            int var23 = -class136.field1982 + class453.field6405 + arg3.field1235;
            if (~var23 <= -1 && ~var23 >= ~(class453.field6405 + class453.field6405)) {
                int var24 = -class481.field6801 + arg3.field1248 + class453.field6405;
                if (var24 >= 0 && class453.field6405 + class453.field6405 >= var24) {
                    if (class589.field8299[var23][var24]) {
                        float var25 = (float) (-arg3.field1236[0] + class373.field5241);
                        if (var25 < 0.0F) {
                            var25 *= -1.0F;
                        }
                        float var26 = (float) (class644.field8823 - arg3.field1237[0]);
                        if (var26 < 0.0F) {
                            var26 *= -1.0F;
                        }
                        if (!(var25 < (float) class477.field6771) || !((float) class477.field6771 > var26)) {
                            if (class344.method2232(0, arg3, (byte) -83)) {
                                if (class344.method2232(1, arg3, (byte) -83)) {
                                    if (class344.method2232(2, arg3, (byte) -83)) {
                                        if (class344.method2232(3, arg3, (byte) -83)) {
                                            class686.field9381[class213.field2813++] = arg3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
    public static final void method549(int arg0, int arg1) {
        ++field804;
        class307.field4297 = new int[arg0];
        class402.field5702 = new int[arg0];
        class418.field5909 = new int[arg0];
        class394.field5582 = new int[arg0];
        class267.field3817 = new int[arg0];
        if (arg1 == 3721) {
            ;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IIIIII)V")
    public class66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field801 = arg0;
        this.field799 = arg3;
        this.field806 = arg1;
        this.field800 = arg2;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V")
    public final void method300(int arg0, int arg1, int arg2) {
        int var4 = 59 % ((-7 - arg1) / 42);
        ++field803;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(III)V")
    public final void method303(int arg0, int arg1, int arg2) {
        ++field802;
        int var4 = this.field801 * arg2 >> 12;
        if (arg1 == -12939) {
            int var5 = this.field800 * arg2 >> 12;
            int var6 = this.field806 * arg0 >> 12;
            int var7 = this.field799 * arg0 >> 12;
            class99.method723(var4, var5, true, super.field545, var7, var6);
        }
    }
}
