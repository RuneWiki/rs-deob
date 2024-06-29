import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class147 extends class263 {

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
    private int field2207 = 0;

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "I")
    private int field2213 = 0;

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
    private int field2209 = 0;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "Luv;")
    public static class2 field2215 = new class2(37, -2);

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "[Z")
    public static boolean[] field2223;

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "Ldp;")
    public static class347 field2221;

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!dj", name = "Z", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "I")
    private int field2204;

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "I")
    private int field2205;

    @OriginalMember(owner = "client!dj", name = "G", descriptor = "I")
    private int field2206;

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "I")
    private int field2217;

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "I")
    private int field2218;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "I")
    private int field2220;

    @OriginalMember(owner = "client!dj", name = "W", descriptor = "[I")
    public static int[] field2222;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII)V")
    private final void method1065(int arg0, int arg1, int arg2, int arg3) {
        ++field2216;
        int var5 = ~arg2 <= ~arg1 ? arg2 : arg1;
        int var6 = ~arg3 >= ~var5 ? var5 : arg3;
        int var7 = ~arg1 <= ~arg2 ? arg2 : arg1;
        if (arg0 != 4096) {
            this.field2209 = -89;
        }
        int var8 = ~var7 >= ~arg3 ? var7 : arg3;
        int var9 = -var8 + var6;
        this.field2220 = (var6 + var8) / 2;
        if (~var9 < -1) {
            int var10 = (-arg1 + var6 << 12) / var9;
            int var11 = (-arg2 + var6 << 12) / var9;
            int var12 = (-arg3 + var6 << 12) / var9;
            if (arg1 == var6) {
                this.field2217 = ~arg2 == ~var8 ? 20480 - -var12 : 4096 - var11;
            } else if (~arg2 == ~var6) {
                this.field2217 = arg3 == var8 ? 4096 - -var10 : -var12 + 12288;
            } else {
                this.field2217 = arg1 != var8 ? 20480 - var10 : var11 + 12288;
            }
            this.field2217 /= 6;
        } else {
            this.field2217 = 0;
        }
        if (this.field2220 > 0 && this.field2220 < 4096) {
            this.field2218 = (var9 << 12) / (this.field2220 <= 2048 ? this.field2220 * 2 : 8192 - this.field2220 * 2);
        } else {
            this.field2218 = 0;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(IB)[[I")
    public final int[][] method34(int arg0, byte arg1) {
        ++field2214;
        if (arg1 > -45) {
            this.method1067(-71, 112, -78, -27);
        }
        int[][] var3 = super.field3912.method2649(arg0, false);
        if (super.field3912.field6681) {
            int[][] var4 = this.method1646(0, 2, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class367.field5597 > var11; ++var11) {
                this.method1065(4096, var5[var11], var6[var11], var7[var11]);
                this.field2217 += this.field2213;
                this.field2218 += this.field2207;
                this.field2220 += this.field2209;
                while (this.field2217 < 0) {
                    this.field2217 += 4096;
                }
                if (~this.field2218 > -1) {
                    this.field2218 = 0;
                }
                while (~this.field2217 < -4097) {
                    this.field2217 -= 4096;
                }
                if (this.field2220 < 0) {
                    this.field2220 = 0;
                }
                if (this.field2218 > 4096) {
                    this.field2218 = 4096;
                }
                if (this.field2220 > 4096) {
                    this.field2220 = 4096;
                }
                this.method1067(this.field2220, this.field2218, 125, this.field2217);
                var8[var11] = this.field2204;
                var9[var11] = this.field2205;
                var10[var11] = this.field2206;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class147() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZLgk;)V")
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        if (!arg1) {
            method1068((byte) -35);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field2209 = (arg2.method2714((byte) -47) << 12) / 100;
                }
            } else {
                this.field2207 = (arg2.method2714((byte) -70) << 12) / 100;
            }
        } else {
            this.field2213 = arg2.method2745(-1);
        }
        ++field2208;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1066(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg5 <= class286.field4290 && class305.field4555 <= arg1) {
            boolean var6;
            if (~class297.field4427 >= ~arg3) {
                if (class102.field1544 < arg3) {
                    var6 = false;
                    arg3 = class102.field1544;
                } else {
                    var6 = true;
                }
            } else {
                var6 = false;
                arg3 = class297.field4427;
            }
            boolean var7;
            if (class297.field4427 > arg2) {
                arg2 = class297.field4427;
                var7 = false;
            } else if (~arg2 < ~class102.field1544) {
                var7 = false;
                arg2 = class102.field1544;
            } else {
                var7 = true;
            }
            if (arg5 >= class305.field4555) {
                class94.method740(class306.field4574[arg5++], arg3, arg2, arg0, false);
            } else {
                arg5 = class305.field4555;
            }
            if (class286.field4290 < arg1) {
                arg1 = class286.field4290;
            } else {
                class94.method740(class306.field4574[arg1--], arg3, arg2, arg0, false);
            }
            if (var6 && var7) {
                for (int var8 = arg5; var8 <= arg1; ++var8) {
                    int[] var9 = class306.field4574[var8];
                    var9[arg3] = var9[arg2] = arg0;
                }
            } else if (var6) {
                for (int var10 = arg5; var10 <= arg1; ++var10) {
                    class306.field4574[var10][arg3] = arg0;
                }
            } else if (var7) {
                for (int var11 = arg5; ~arg1 <= ~var11; ++var11) {
                    class306.field4574[var11][arg2] = arg0;
                }
            }
        }
        if (arg4 >= -64) {
            method1069((byte) 39);
        }
        ++field2212;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(IIII)V")
    private final void method1067(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 117) {
            ++field2211;
            int var5 = arg0 > 2048 ? arg0 + arg1 + -(arg0 * arg1 >> 12) : (arg1 + 4096) * arg0 >> 12;
            if (var5 <= 0) {
                this.field2204 = this.field2205 = this.field2206 = arg0;
            } else {
                int var6 = arg3 * 6;
                int var7 = arg0 + arg0 + -var5;
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 - -var13;
                int var15 = -var13 + var5;
                if (~var9 != -1) {
                    if (var9 != 1) {
                        if (var9 != 2) {
                            if (~var9 != -4) {
                                if (~var9 != -5) {
                                    if (~var9 == -6) {
                                        this.field2204 = var5;
                                        this.field2205 = var7;
                                        this.field2206 = var15;
                                    }
                                } else {
                                    this.field2204 = var14;
                                    this.field2205 = var7;
                                    this.field2206 = var5;
                                }
                            } else {
                                this.field2205 = var15;
                                this.field2204 = var7;
                                this.field2206 = var5;
                            }
                        } else {
                            this.field2205 = var5;
                            this.field2204 = var7;
                            this.field2206 = var14;
                        }
                    } else {
                        this.field2204 = var15;
                        this.field2205 = var5;
                        this.field2206 = var7;
                    }
                } else {
                    this.field2206 = var7;
                    this.field2205 = var14;
                    this.field2204 = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)V")
    public static final void method1068(byte arg0) {
        class59.field813.method3142(-97);
        ++field2210;
        class293.field4386.method2003((byte) -79);
        class239.field3348.method425((byte) 56);
        class119.field1824.method251(-28708);
        class373.field5641.method772(-83);
        class164.field2437.method1750(-29553);
        class510.field7490.method573(false);
        class443.field6509.method2021(-1);
        class41.field539.method2512(122);
        class233.field3279.method217((byte) 79);
        class159.field2391.method380(31);
        class274.field4086.method343((byte) 45);
        class36.field497.method697(-18016);
        class526.field7776.method2481(false);
        class260.field3873.method2680(105);
        class69.field925.method1802((byte) 36);
        class119.field1821.method2872(28666);
        class25.field372.method1410((byte) 62);
        class312.field4844.method1060(66);
        class152.field2317.method1454((byte) 117);
        class300.method1861(111);
        class292.method1810(8);
        class454.method2643(-1);
        if (class52.field674 != class149.field2269) {
            for (int var1 = 0; var1 < class184.field2710.length; ++var1) {
                class184.field2710[var1] = null;
            }
            class101.field1527 = 0;
        }
        class452.method2630((byte) -124);
        class145.method1047(69);
        class232.method1437((byte) -2);
        class402.method2431(18740);
        class76.method559(31260);
        class64.field868.method2293(false);
        class407.field6147.method86();
        class195.field2877.method1778(0);
        class264.method1652((byte) 117);
        class445.field6548.method517((byte) 9);
        class263.field3921.method517((byte) 9);
        class292.field4376.method517((byte) 9);
        class148.field2234.method517((byte) 9);
        class235.field3298.method517((byte) 9);
        class302.field4502.method517((byte) 9);
        class497.field7381.method517((byte) 9);
        class503.field7416.method517((byte) 9);
        class142.field2146.method517((byte) 9);
        class3.field30.method517((byte) 9);
        class180.field2662.method517((byte) 9);
        class71.field964.method517((byte) 9);
        class166.field2469.method517((byte) 9);
        class529.field7795.method517((byte) 9);
        class316.field4882.method517((byte) 9);
        class272.field4054.method517((byte) 9);
        class12.field122.method517((byte) 9);
        class7.field61.method517((byte) 9);
        class36.field499.method517((byte) 9);
        class509.field7486.method517((byte) 9);
        class303.field4519.method517((byte) 9);
        class488.field7279.method517((byte) 9);
        class495.field7353.method517((byte) 9);
        class307.field4602.method517((byte) 9);
        class411.field6205.method517((byte) 9);
        class382.field5743.method517((byte) 9);
        class97.field1504.method517((byte) 9);
        class154.field2333.method517((byte) 9);
        class422.field6304.method517((byte) 9);
        class509.field7485.method517((byte) 9);
        class125.field1877.method2293(false);
        class32.field451.method2293(false);
        if (arg0 > -42) {
            method1068((byte) 16);
        }
        class145.field2185.method2293(false);
        class309.field4635.method2293(false);
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(B)V")
    public static void method1069(byte arg0) {
        field2215 = null;
        if (arg0 < 27) {
            field2221 = null;
        }
        field2222 = null;
        field2221 = null;
        field2223 = null;
    }

    static {
        new class347("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field2219 = 0;
        field2223 = new boolean[100];
        field2221 = new class347("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");
        field2224 = 0;
        field2225 = 1;
    }
}
