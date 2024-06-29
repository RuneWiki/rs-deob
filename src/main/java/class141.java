import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class141 {

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
    public int field2254 = -1;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "I")
    public static int field2245 = 0;

    @OriginalMember(owner = "client!ls", name = "u", descriptor = "Lro;")
    public static class2 field2256 = new class2();

    @OriginalMember(owner = "client!ls", name = "y", descriptor = "Lhda;")
    public static class752 field2260 = new class752(112, 2);

    @OriginalMember(owner = "client!ls", name = "B", descriptor = "I")
    public static int field2263 = -1;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!ls", name = "C", descriptor = "Lon;")
    public static class340 field2264;

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "Ldu;")
    private class360 field2247;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "Ljava/lang/String;")
    private String field2248;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "Ljava/lang/String;")
    private String field2253;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "[I")
    private int[] field2236;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "[I")
    private int[] field2238;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "[I")
    private int[] field2240;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "[I")
    private int[] field2241;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "[I")
    private int[] field2246;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "[I")
    private int[] field2249;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "[I")
    private int[] field2250;

    @OriginalMember(owner = "client!ls", name = "w", descriptor = "[I")
    private int[] field2258;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "[Ljava/lang/String;")
    private String[] field2239;

    @OriginalMember(owner = "client!ls", name = "v", descriptor = "[Ljava/lang/String;")
    private String[] field2257;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "[[I")
    private int[][] field2242;

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "[[I")
    private int[][] field2255;

    @OriginalMember(owner = "client!ls", name = "x", descriptor = "[[I")
    private int[][] field2259;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)[Lkg;")
    public static final class275[] method1079(int arg0) {
        if (arg0 != -25801) {
            field2263 = -122;
        }
        field2237++;
        return new class275[] { class117.field1887, class380.field5288, class252.field3471, class548.field7241, class275.field3835, class85.field1029, class75.field916, class390.field5468, class749.field10401, class1.field9, class496.field6682, class90.field1093, class397.field5538, class349.field4914 };
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V")
    public final void method1080(int arg0) {
        field2251++;
        if (arg0 != 6) {
            method1082(20, 110, 87);
        }
        if (this.field2248 == null) {
            this.field2248 = this.field2253;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLee;I)V")
    private final void method1081(boolean arg0, class677 arg1, int arg2) {
        field2243++;
        if (!arg0) {
            method1082(80, 1, -76);
        }
        if (arg2 == 1) {
            this.field2253 = arg1.method3824(-98);
        } else if (arg2 == 2) {
            this.field2248 = arg1.method3824(-75);
        } else if (arg2 == 3) {
            int var22 = arg1.method3821((byte) 98);
            this.field2255 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field2255[var23][0] = arg1.method3807(-1);
                this.field2255[var23][1] = arg1.method3799(false);
                this.field2255[var23][2] = arg1.method3799(false);
            }
        } else if (arg2 == 4) {
            int var4 = arg1.method3821((byte) -91);
            this.field2259 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2259[var5][0] = arg1.method3807(-1);
                this.field2259[var5][1] = arg1.method3799(!arg0);
                this.field2259[var5][2] = arg1.method3799(!arg0);
            }
        } else if (arg2 == 5) {
            arg1.method3807(-1);
        } else if (arg2 == 6) {
            arg1.method3821((byte) -68);
        } else if (arg2 == 7) {
            arg1.method3821((byte) -21);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg1.method3821((byte) -100);
                return;
            }
            if (arg2 == 10) {
                int var6 = arg1.method3821((byte) -65);
                this.field2246 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field2246[var7] = arg1.method3799(!arg0);
                }
                return;
            }
            if (arg2 == 12) {
                arg1.method3799(!arg0);
                return;
            }
            if (arg2 == 13) {
                int var8 = arg1.method3821((byte) -60);
                this.field2249 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field2249[var9] = arg1.method3807(-1);
                }
                return;
            }
            if (arg2 == 14) {
                int var10 = arg1.method3821((byte) 72);
                this.field2242 = new int[var10][2];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field2242[var11][0] = arg1.method3821((byte) 76);
                    this.field2242[var11][1] = arg1.method3821((byte) 87);
                }
                return;
            }
            if (arg2 == 15) {
                arg1.method3807(-1);
                return;
            }
            if (arg2 == 17) {
                this.field2254 = arg1.method3807(-1);
            } else if (arg2 == 18) {
                int var12 = arg1.method3821((byte) 119);
                this.field2250 = new int[var12];
                this.field2257 = new String[var12];
                this.field2258 = new int[var12];
                this.field2238 = new int[var12];
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field2238[var13] = arg1.method3799(false);
                    this.field2250[var13] = arg1.method3799(false);
                    this.field2258[var13] = arg1.method3799(!arg0);
                    this.field2257[var13] = arg1.method3793(15598);
                }
                return;
            } else if (arg2 == 19) {
                int var14 = arg1.method3821((byte) -73);
                this.field2236 = new int[var14];
                this.field2240 = new int[var14];
                this.field2239 = new String[var14];
                this.field2241 = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field2240[var15] = arg1.method3799(false);
                    this.field2241[var15] = arg1.method3799(false);
                    this.field2236[var15] = arg1.method3799(false);
                    this.field2239[var15] = arg1.method3793(15598);
                }
                return;
            } else if (arg2 == 249) {
                int var16 = arg1.method3821((byte) -68);
                if (this.field2247 == null) {
                    int var17 = class737.method4119(var16, (byte) -128);
                    this.field2247 = new class360(var17);
                }
                for (int var18 = 0; var18 < var16; var18++) {
                    boolean var19 = arg1.method3821((byte) -71) == 1;
                    int var20 = arg1.method3833(255);
                    class656 var21;
                    if (var19) {
                        var21 = new class248(arg1.method3793(15598));
                    } else {
                        var21 = new class651(arg1.method3799(false));
                    }
                    this.field2247.method2143(-1, var21, (long) var20);
                }
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)Z")
    public static final boolean method1082(int arg0, int arg1, int arg2) {
        int var3 = 29 / ((arg0 + 66) / 33);
        field2244++;
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BLee;)V")
    public final void method1083(byte arg0, class677 arg1) {
        field2252++;
        while (true) {
            int var3 = arg1.method3821((byte) 118);
            if (var3 == 0) {
                if (arg0 == 64) {
                    return;
                } else {
                    method1079(17);
                    return;
                }
            }
            this.method1081(true, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V")
    public static void method1084(int arg0) {
        field2264 = null;
        field2256 = null;
        field2260 = null;
        if (arg0 != 33) {
            field2245 = -124;
        }
    }
}
