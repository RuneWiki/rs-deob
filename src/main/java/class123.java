import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class123 extends class61 {

    @OriginalMember(owner = "client!q", name = "D", descriptor = "Z")
    public boolean field2147;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "[Lq;")
    public class123[] field2155;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "Leb;")
    public static class230 field2143 = class68.method589(0, "showingVideoAd");

    @OriginalMember(owner = "client!q", name = "J", descriptor = "Leb;")
    public static class230 field2153 = class68.method589(0, ")0");

    @OriginalMember(owner = "client!q", name = "A", descriptor = "Lpk;")
    public static class98 field2144 = new class98();

    @OriginalMember(owner = "client!q", name = "R", descriptor = "Lpk;")
    public static class98 field2161 = new class98();

    @OriginalMember(owner = "client!q", name = "T", descriptor = "Z")
    public static boolean field2163 = true;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "I")
    public static int field2164 = 0;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "Leb;")
    public static class230 field2165 = class68.method589(0, "Cabbage");

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!q", name = "H", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!q", name = "M", descriptor = "I")
    public int field2156;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!q", name = "P", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!q", name = "S", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "Lgb;")
    public class145 field2152;

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "Lve;")
    public class184 field2160;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "Lkk;")
    public static class223 field2166;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "[Lmf;")
    public static class10[] field2141;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lka;II)I")
    public static final int method958(class245 arg0, int arg1, int arg2) {
        field2158++;
        if (arg0.field4225 == null || arg1 >= arg0.field4225.length) {
            return -2;
        }
        try {
            int[] var3 = arg0.field4225[arg1];
            if (arg2 <= 28) {
                field2164 = -128;
            }
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var5;
                }
                if (var7 == 1) {
                    var9 = class49.field870[var3[var4++]];
                }
                if (var7 == 2) {
                    var9 = class203.field3578[var3[var4++]];
                }
                if (var7 == 3) {
                    var9 = class192.field3399[var3[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class245 var12 = class155.method1183(var11, 17);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class214.method1484(var13, -1).field171 || class222.field3805)) {
                        for (int var14 = 0; var14 < var12.field4331.length; var14++) {
                            if (var13 + 1 == var12.field4331[var14]) {
                                var9 += var12.field4215[var14];
                            }
                        }
                    }
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 5) {
                    var9 = class99.field1838[var3[var4++]];
                }
                if (var7 == 6) {
                    var9 = class104.field1898[class203.field3578[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class99.field1838[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class56.field1033.field4602;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class84.field1488[var15]) {
                            var9 += class203.field3578[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class245 var18 = class155.method1183(var17, 17);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class214.method1484(var19, -1).field171 || class222.field3805)) {
                        for (int var20 = 0; var20 < var18.field4331.length; var20++) {
                            if (var19 + 1 == var18.field4331[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class171.field3037;
                }
                if (var7 == 12) {
                    var9 = class107.field1928;
                }
                if (var7 == 13) {
                    int var21 = class99.field1838[var3[var4++]];
                    int var22 = var3[var4++];
                    var9 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var9 = class134.method1044(25, var23);
                }
                if (var7 == 18) {
                    var9 = (class56.field1033.field2274 >> 7) + class272.field4795;
                }
                if (var7 == 19) {
                    var9 = (class56.field1033.field2300 >> 7) + class155.field2759;
                }
                if (var7 == 20) {
                    var9 = var3[var4++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var5 += var9;
                    }
                    if (var6 == 1) {
                        var5 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var5 /= var9;
                    }
                    if (var6 == 3) {
                        var5 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(II)[[I")
    public int[][] method2(int arg0, int arg1) {
        field2157++;
        if (arg1 == 26080) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)[I")
    public int[] method4(int arg0, byte arg1) {
        field2151++;
        int var3 = -35 % ((arg1 + 24) / 57);
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)V")
    public static final void method959(int arg0, boolean arg1) {
        if (arg0 == 1) {
            class251.field4506 = arg1;
            field2145++;
            class159.field2850 = !class179.method1302(-118);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIB)[[I")
    public final int[][] method960(int arg0, int arg1, byte arg2) {
        if (arg2 > -10) {
            this.field2160 = null;
        }
        field2154++;
        if (!this.field2155[arg0].field2147) {
            return this.field2155[arg0].method2(arg1, 26080);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field2155[arg0].method4(arg1, (byte) -85);
        var4[0] = var5;
        var4[2] = var5;
        var4[1] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
    public void method961(boolean arg0) {
        if (!arg0) {
            this.method4(62, (byte) 52);
        }
        field2150++;
        if (this.field2147) {
            this.field2160.method1324(107);
            this.field2160 = null;
        } else {
            this.field2152.method1110((byte) -127);
            this.field2152 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIBIIIIII)V")
    public static final void method962(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg4 != -29) {
            method958((class245) null, -62, -23);
        }
        int var11 = arg0 - arg8;
        int var12 = arg7 - arg1;
        field2140++;
        boolean var13;
        if (class159.field2849 > 0 && class159.field2849 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg6;
        int var15 = 983040 / arg9;
        for (int var16 = -var14; var16 < (var11 + var14); var16++) {
            int var18 = arg6 * var16 + arg10 >> 16;
            int var19 = (var16 + 1) * arg6 + arg10 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var10000 = arg3 + var19;
                int var22 = arg3 + var18;
                int var23 = arg8 + var16 >> 6;
                if (var23 >= 0 && (class151.field2682.length - 1) >= var23) {
                    int[][] var24 = class151.field2682[var23];
                    for (int var25 = -var15; var25 < var12 + var15; var25++) {
                        int var26 = arg9 * var25 + arg2 >> 16;
                        int var27 = arg2 + ((var25 + 1) * arg9) >> 16;
                        int var28 = var27 - var26;
                        if (var28 > 0) {
                            var10000 = arg5 + var27;
                            int var30 = arg5 + var26;
                            int var31 = arg1 + var25 >> 6;
                            if (var31 >= 0 && var31 <= (var24.length - 1) && var24[var31] != null) {
                                int var32 = ((arg1 + var25 & 0x3F) << 6) + (var16 + arg8 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class194 var34 = class251.method1776(var33 - 1, arg4 + 65309);
                                    if (var13 && class96.field1734 == var34.field3447) {
                                        class155 var35 = new class155();
                                        var35.field2766 = var30;
                                        var35.field2763 = var34.field3447;
                                        var35.field2770 = var22;
                                        class47.field828.method843(-5, var35);
                                    }
                                    class95.field1712[var34.field3447].method106(var22 - 7, var30 - 7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class155 var17 = (class155) class47.field828.method839(128); var17 != null; var17 = (class155) class47.field828.method834((byte) 82)) {
            class95.field1712[var17.field2763].method106(var17.field2770 - 7, var17.field2766 + -7);
            class87.method704(var17.field2770, var17.field2766, 15, 16776960, 128);
            class87.method704(var17.field2770, var17.field2766, 7, 16777215, 256);
        }
        class47.field828.method837(arg4 ^ 0x667A);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILfk;I)V")
    public void method6(int arg0, class14 arg1, int arg2) {
        field2139++;
        if (arg2 != 1876195788) {
            field2161 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)I")
    public int method963(int arg0) {
        if (arg0 > -63) {
            this.field2147 = false;
        }
        field2148++;
        return -1;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V")
    public final void method964(int arg0, int arg1, int arg2) {
        int var4 = this.field2156 == 255 ? arg1 : this.field2156;
        if (this.field2147) {
            this.field2160 = new class184(var4, arg1, arg0);
        } else {
            this.field2152 = new class145(var4, arg1, arg0);
        }
        field2162++;
        int var5 = 48 / ((-arg2 - 6) / 35);
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
    public void method257(int arg0) {
        field2159++;
        if (arg0 != 0) {
            this.method961(true);
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(IIB)[I")
    public final int[] method965(int arg0, int arg1, byte arg2) {
        field2146++;
        if (arg2 <= 13) {
            method966(-125);
        }
        return this.field2155[arg0].field2147 ? this.field2155[arg0].method4(arg1, (byte) -124) : this.field2155[arg0].method2(arg1, 26080)[0];
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V")
    public static final void method966(int arg0) {
        if (class92.field1659 != null) {
            class92.field1659.method1078(110);
        }
        field2149++;
        if (class133.field2414 != null) {
            class133.field2414.method1078(122);
        }
        class169.method1245(22050, 2, -459489680, class127.field2228);
        class92.field1659 = class161.method1212(class14.field307, (byte) -112, 0, 22050, class184.field3228);
        class92.field1659.method1079(class164.field2923, -100);
        class133.field2414 = class161.method1212(class14.field307, (byte) 58, 1, arg0, class184.field3228);
        class133.field2414.method1079(class117.field2096, -116);
    }

    @OriginalMember(owner = "client!q", name = "e", descriptor = "(I)V")
    public static void method967(int arg0) {
        field2143 = null;
        field2141 = null;
        field2165 = null;
        field2166 = null;
        field2144 = null;
        field2161 = null;
        if (arg0 != 25) {
            method966(-40);
        }
        field2153 = null;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(IZ)V")
    public class123(int arg0, boolean arg1) {
        this.field2147 = arg1;
        this.field2155 = new class123[arg0];
    }

    @OriginalMember(owner = "client!q", name = "f", descriptor = "(I)I")
    public int method968(int arg0) {
        if (arg0 < 49) {
            method958((class245) null, 16, -48);
        }
        field2142++;
        return -1;
    }
}
