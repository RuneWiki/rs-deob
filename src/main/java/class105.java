import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class105 {

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public int field1269 = -1;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Z")
    public static boolean field1271 = false;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "[Z")
    public static boolean[] field1283 = new boolean[100];

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field1268 = 0;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "[I")
    public static int[] field1270 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "Lwb;")
    private class45 field1275;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Ljava/lang/String;")
    private String field1266;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "Ljava/lang/String;")
    private String field1287;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "[I")
    private int[] field1267;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "[I")
    private int[] field1273;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "[I")
    private int[] field1279;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "[I")
    private int[] field1280;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "[I")
    private int[] field1281;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "[I")
    private int[] field1282;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "[I")
    private int[] field1284;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "[I")
    private int[] field1286;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "[Ljava/lang/String;")
    private String[] field1272;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "[Ljava/lang/String;")
    private String[] field1285;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "[[I")
    private int[][] field1276;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "[[I")
    private int[][] field1277;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "[[I")
    private int[][] field1278;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "[[[Lqa;")
    public static class263[][][] field1264;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method501(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1289++;
        int var8 = arg7 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class207.field2847 - class223.field3097) * var8 / 100 + class223.field3097;
        int var10 = arg2 * var9 >> 8;
        int var11 = 16384 - arg4 & 0x3FFF;
        int var12 = 16384 - arg6 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class16.field212[var11] * -var10 >> 15;
            var15 = class16.field214[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class16.field212[var12] * var15 >> 15;
            var15 = class16.field214[var12] * var15 >> 15;
        }
        class351.field5047 = arg5 - var15;
        class427.field6145 = arg0 - var14;
        class120.field1490 = arg4;
        if (arg1 != -77) {
            field1268 = -11;
        }
        class401.field5718 = 0;
        class13.field193 = arg6;
        class58.field734 = arg3 - var13;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
    public final void method502(boolean arg0) {
        if (this.field1266 == null) {
            this.field1266 = this.field1287;
        }
        if (arg0) {
            field1274++;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method503(int arg0) {
        field1283 = null;
        field1264 = null;
        field1270 = null;
        if (arg0 != -19) {
            field1283 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILvt;)V")
    private final void method504(int arg0, int arg1, class179 arg2) {
        field1288++;
        if (arg0 > -49) {
            this.field1284 = null;
        }
        if (arg1 == 1) {
            this.field1287 = arg2.method920(0);
        } else if (arg1 == 2) {
            this.field1266 = arg2.method920(0);
        } else if (arg1 == 3) {
            int var22 = arg2.method895((byte) -108);
            this.field1277 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field1277[var23][0] = arg2.method916(21933);
                this.field1277[var23][1] = arg2.method939((byte) -113);
                this.field1277[var23][2] = arg2.method939((byte) -101);
            }
        } else if (arg1 == 4) {
            int var20 = arg2.method895((byte) -106);
            this.field1276 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field1276[var21][0] = arg2.method916(21933);
                this.field1276[var21][1] = arg2.method939((byte) -66);
                this.field1276[var21][2] = arg2.method939((byte) -119);
            }
        } else if (arg1 == 5) {
            arg2.method916(21933);
        } else if (arg1 == 6) {
            arg2.method895((byte) -78);
        } else if (arg1 == 7) {
            arg2.method895((byte) -109);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg2.method895((byte) -72);
                return;
            }
            if (arg1 == 10) {
                int var4 = arg2.method895((byte) -114);
                this.field1282 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1282[var5] = arg2.method939((byte) 63);
                }
                return;
            }
            if (arg1 == 12) {
                arg2.method939((byte) 85);
                return;
            }
            if (arg1 != 13) {
                if (arg1 != 14) {
                    if (arg1 == 15) {
                        arg2.method916(21933);
                    } else if (arg1 == 17) {
                        this.field1269 = arg2.method916(21933);
                        return;
                    } else if (arg1 == 18) {
                        int var6 = arg2.method895((byte) -101);
                        this.field1272 = new String[var6];
                        this.field1286 = new int[var6];
                        this.field1284 = new int[var6];
                        this.field1280 = new int[var6];
                        for (int var7 = 0; var7 < var6; var7++) {
                            this.field1284[var7] = arg2.method939((byte) -99);
                            this.field1286[var7] = arg2.method939((byte) -86);
                            this.field1280[var7] = arg2.method939((byte) -53);
                            this.field1272[var7] = arg2.method907(-27652);
                        }
                        return;
                    } else if (arg1 == 19) {
                        int var8 = arg2.method895((byte) -105);
                        this.field1281 = new int[var8];
                        this.field1273 = new int[var8];
                        this.field1279 = new int[var8];
                        this.field1285 = new String[var8];
                        for (int var9 = 0; var9 < var8; var9++) {
                            this.field1281[var9] = arg2.method939((byte) 55);
                            this.field1279[var9] = arg2.method939((byte) -106);
                            this.field1273[var9] = arg2.method939((byte) 71);
                            this.field1285[var9] = arg2.method907(-27652);
                        }
                        return;
                    } else if (arg1 == 249) {
                        int var10 = arg2.method895((byte) -112);
                        if (this.field1275 == null) {
                            int var11 = class93.method459(-719824240, var10);
                            this.field1275 = new class45(var11);
                        }
                        for (int var12 = 0; var12 < var10; var12++) {
                            boolean var13 = arg2.method895((byte) -109) == 1;
                            int var14 = arg2.method899((byte) -24);
                            class147 var15;
                            if (var13) {
                                var15 = new class373(arg2.method907(-27652));
                            } else {
                                var15 = new class363(arg2.method939((byte) -96));
                            }
                            this.field1275.method234(-55, (long) var14, var15);
                        }
                        return;
                    }
                    return;
                }
                int var16 = arg2.method895((byte) -83);
                this.field1278 = new int[var16][2];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field1278[var17][0] = arg2.method895((byte) -122);
                    this.field1278[var17][1] = arg2.method895((byte) -108);
                }
                return;
            }
            int var18 = arg2.method895((byte) -123);
            this.field1267 = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                this.field1267[var19] = arg2.method916(21933);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lvt;I)V")
    public final void method505(class179 arg0, int arg1) {
        field1265++;
        int var3 = -117 / ((arg1 + 80) / 32);
        while (true) {
            int var4 = arg0.method895((byte) -91);
            if (var4 == 0) {
                return;
            }
            this.method504(-50, var4, arg0);
        }
    }
}
