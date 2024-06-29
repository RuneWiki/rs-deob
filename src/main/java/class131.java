import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class131 extends class512 {

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "Lnk;")
    public static class326 field2240 = new class326(45, 3);

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public static int field2241 = 0;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "Lvv;")
    public static class313 field2243 = new class313(73, 5);

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "[I")
    public static int[] field2245 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "Lwv;")
    public static class535 field2246;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "Lvv;")
    public static class313 field2247;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "Z")
    public static boolean field2248;

    static {
        new class306(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
        field2246 = new class535("stellardawn", 1);
        field2247 = new class313(43, 0);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)[[I", line = 3)
    public final int[][] method278(int arg0, int arg1) {
        ++field2239;
        int[][] var3 = super.field7496.method2777(arg1, 0);
        int var4 = -106 % ((-40 - arg0) / 47);
        if (super.field7496.field6942) {
            int[] var5 = this.method3013(false, 2, arg1);
            int[][] var6 = this.method3012(arg1, 65, 0);
            int[][] var7 = this.method3012(arg1, 63, 1);
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            int[] var11 = var6[0];
            int[] var12 = var6[1];
            int[] var13 = var6[2];
            int[] var14 = var7[0];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            for (int var17 = 0; var17 < class402.field6113; ++var17) {
                int var18 = var5[var17];
                if (var18 == 4096) {
                    var8[var17] = var11[var17];
                    var9[var17] = var12[var17];
                    var10[var17] = var13[var17];
                } else if (~var18 == -1) {
                    var8[var17] = var14[var17];
                    var9[var17] = var15[var17];
                    var10[var17] = var16[var17];
                } else {
                    int var19 = 4096 - var18;
                    var8[var17] = var11[var17] * var18 + var14[var17] * var19 >> 12;
                    var9[var17] = var12[var17] * var18 + var15[var17] * var19 >> 12;
                    var10[var17] = var13[var17] * var18 - -(var16[var17] * var19) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V", line = 80)
    public static final void method998(byte arg0) {
        for (class219 var1 = (class219) class70.field1209.method564((byte) -76); var1 != null; var1 = (class219) class70.field1209.method564((byte) -76)) {
            class309.method1965(20, var1);
        }
        ++field2244;
        if (arg0 >= -51) {
            method999((byte) 80);
        }
        int var2;
        int var3;
        if (!class510.field7403.method1188(class511.field7485, -118)) {
            var2 = class229.field3994;
            var3 = class229.field3994;
        } else {
            var2 = 3;
            var3 = 0;
        }
        client.method477();
        for (int var4 = var3; ~var2 <= ~var4; ++var4) {
            client.method469();
            client.method462(var4);
            client.method466(var4);
        }
        client.method473();
        client.method458();
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 124)
    public class131() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)[I", line = 128)
    public final int[] method75(int arg0, byte arg1) {
        int var3 = 59 / ((arg1 - 43) / 48);
        ++field2242;
        int[] var4 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            int[] var5 = this.method3013(false, 0, arg0);
            int[] var6 = this.method3013(false, 1, arg0);
            int[] var7 = this.method3013(false, 2, arg0);
            for (int var8 = 0; ~var8 > ~class402.field6113; ++var8) {
                int var9 = var7[var8];
                if (var9 != 4096) {
                    if (~var9 != -1) {
                        var4[var8] = (-var9 + 4096) * var6[var8] + var5[var8] * var9 >> 12;
                    } else {
                        var4[var8] = var6[var8];
                    }
                } else {
                    var4[var8] = var5[var8];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZILia;)V", line = 184)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        if (~arg1 == -1) {
            super.field7491 = ~arg2.method126((byte) -81) == -2;
        }
        ++field2238;
        if (!arg0) {
            method999((byte) -49);
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V", line = 201)
    public static void method999(byte arg0) {
        field2247 = null;
        int var1 = -87 / ((-47 - arg0) / 62);
        field2243 = null;
        field2246 = null;
        field2240 = null;
        field2245 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()V", line = 215)
    public static final void method1000() {
        class387.field5963 = 0;
        label212: for (int var0 = 0; var0 < class244.field4189; ++var0) {
            class194 var1 = class252.field4299[var0];
            if (class512.field7507 != null) {
                for (int var2 = 0; var2 < class512.field7507.length; ++var2) {
                    if (class512.field7507[var2] != -1000000 && (var1.field3038 <= class512.field7507[var2] || var1.field3032 <= class512.field7507[var2]) && (var1.field3018 <= class106.field1899[var2] || var1.field3028 <= class106.field1899[var2]) && (var1.field3018 >= class367.field5703[var2] || var1.field3028 >= class367.field5703[var2]) && (var1.field3030 <= class285.field4674[var2] || var1.field3033 <= class285.field4674[var2]) && (var1.field3030 >= class423.field6383[var2] || var1.field3033 >= class423.field6383[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field3025 == 1) {
                int var3 = var1.field3021 - class205.field3248 + class31.field502;
                if (var3 >= 0 && var3 <= class31.field502 + class31.field502) {
                    int var4 = var1.field3040 - class77.field1351 + class31.field502;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class31.field502 + class31.field502) {
                        continue;
                    }
                    int var5 = var1.field3031 - class77.field1351 + class31.field502;
                    if (var5 > class31.field502 + class31.field502) {
                        var5 = class31.field502 + class31.field502;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class141.field2332[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class335.field5266 - var1.field3018;
                        if (var7 > class117.field2089) {
                            var1.field3022 = 1;
                        } else {
                            if (var7 >= -class117.field2089) {
                                continue;
                            }
                            var1.field3022 = 2;
                            var7 = -var7;
                        }
                        var1.field3026 = (var1.field3030 - class53.field852 << 8) / var7;
                        var1.field3017 = (var1.field3033 - class53.field852 << 8) / var7;
                        var1.field3034 = (var1.field3038 - class389.field5974 << 8) / var7;
                        var1.field3036 = (var1.field3032 - class389.field5974 << 8) / var7;
                        class128.field2200[class387.field5963++] = var1;
                    }
                }
            } else if (var1.field3025 == 2) {
                int var8 = var1.field3040 - class77.field1351 + class31.field502;
                if (var8 >= 0 && var8 <= class31.field502 + class31.field502) {
                    int var9 = var1.field3021 - class205.field3248 + class31.field502;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class31.field502 + class31.field502) {
                        continue;
                    }
                    int var10 = var1.field3019 - class205.field3248 + class31.field502;
                    if (var10 > class31.field502 + class31.field502) {
                        var10 = class31.field502 + class31.field502;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class141.field2332[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class53.field852 - var1.field3030;
                        if (var12 > class117.field2089) {
                            var1.field3022 = 3;
                        } else {
                            if (var12 >= -class117.field2089) {
                                continue;
                            }
                            var1.field3022 = 4;
                            var12 = -var12;
                        }
                        var1.field3035 = (var1.field3018 - class335.field5266 << 8) / var12;
                        var1.field3039 = (var1.field3028 - class335.field5266 << 8) / var12;
                        var1.field3034 = (var1.field3038 - class389.field5974 << 8) / var12;
                        var1.field3036 = (var1.field3032 - class389.field5974 << 8) / var12;
                        class128.field2200[class387.field5963++] = var1;
                    }
                }
            } else if (var1.field3025 == 4) {
                int var13 = var1.field3038 - class389.field5974;
                if (var13 > class194.field3027) {
                    int var14 = var1.field3040 - class77.field1351 + class31.field502;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class31.field502 + class31.field502) {
                        continue;
                    }
                    int var15 = var1.field3031 - class77.field1351 + class31.field502;
                    if (var15 > class31.field502 + class31.field502) {
                        var15 = class31.field502 + class31.field502;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field3021 - class205.field3248 + class31.field502;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class31.field502 + class31.field502) {
                        continue;
                    }
                    int var17 = var1.field3019 - class205.field3248 + class31.field502;
                    if (var17 > class31.field502 + class31.field502) {
                        var17 = class31.field502 + class31.field502;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; ++var19) {
                        for (int var20 = var14; var20 <= var15; ++var20) {
                            if (class141.field2332[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field3022 = 5;
                        var1.field3035 = (var1.field3018 - class335.field5266 << 8) / var13;
                        var1.field3039 = (var1.field3028 - class335.field5266 << 8) / var13;
                        var1.field3026 = (var1.field3030 - class53.field852 << 8) / var13;
                        var1.field3017 = (var1.field3033 - class53.field852 << 8) / var13;
                        class128.field2200[class387.field5963++] = var1;
                    }
                }
            }
        }
    }
}
