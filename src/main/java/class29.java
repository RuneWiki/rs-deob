import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class29 {

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public int field289 = -1;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "[Llr;")
    public static class531[] field272;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "[F")
    public static float[] field283;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "Lqh;")
    private class50 field287;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Ljava/lang/String;")
    private String field269;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "Ljava/lang/String;")
    private String field285;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "[I")
    private int[] field270;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "[I")
    private int[] field271;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "[I")
    private int[] field273;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "[I")
    private int[] field277;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "[I")
    private int[] field281;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "[I")
    private int[] field284;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "[I")
    private int[] field290;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "[I")
    private int[] field291;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "[Lo;")
    public static class24[] field286;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "[Ljava/lang/String;")
    private String[] field275;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field292;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "[[I")
    private int[][] field276;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "[[I")
    private int[][] field278;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "[[I")
    private int[][] field288;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "[[S")
    public static short[][] field280;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method168(int arg0) {
        field283 = null;
        field286 = null;
        if (arg0 != 3) {
            method168(-77);
        }
        field280 = null;
        field272 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILug;I)V")
    private final void method169(int arg0, class396 arg1, int arg2) {
        if (arg2 <= 61) {
            this.field287 = null;
        }
        field274++;
        if (arg0 == 1) {
            this.field269 = arg1.method2420((byte) -67);
        } else if (arg0 == 2) {
            this.field285 = arg1.method2420((byte) -67);
        } else if (arg0 == 3) {
            int var4 = arg1.method2388((byte) -110);
            this.field278 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field278[var5][0] = arg1.method2386(-23648);
                this.field278[var5][1] = arg1.method2406((byte) -72);
                this.field278[var5][2] = arg1.method2406((byte) -82);
            }
        } else if (arg0 == 4) {
            int var22 = arg1.method2388((byte) -115);
            this.field288 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field288[var23][0] = arg1.method2386(-23648);
                this.field288[var23][1] = arg1.method2406((byte) -84);
                this.field288[var23][2] = arg1.method2406((byte) -77);
            }
        } else if (arg0 == 5) {
            arg1.method2386(-23648);
        } else if (arg0 == 6) {
            arg1.method2388((byte) -114);
        } else if (arg0 == 7) {
            arg1.method2388((byte) -110);
            return;
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg1.method2388((byte) -116);
                return;
            }
            if (arg0 == 10) {
                int var6 = arg1.method2388((byte) -122);
                this.field284 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field284[var7] = arg1.method2406((byte) -95);
                }
                return;
            }
            if (arg0 == 12) {
                arg1.method2406((byte) -71);
                return;
            }
            if (arg0 == 13) {
                int var8 = arg1.method2388((byte) -116);
                this.field270 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field270[var9] = arg1.method2386(-23648);
                }
                return;
            }
            if (arg0 != 14) {
                if (arg0 == 15) {
                    arg1.method2386(-23648);
                    return;
                }
                if (arg0 == 17) {
                    this.field289 = arg1.method2386(-23648);
                    return;
                }
                if (arg0 == 18) {
                    int var10 = arg1.method2388((byte) -123);
                    this.field273 = new int[var10];
                    this.field277 = new int[var10];
                    this.field292 = new String[var10];
                    this.field291 = new int[var10];
                    for (int var11 = 0; var11 < var10; var11++) {
                        this.field273[var11] = arg1.method2406((byte) -110);
                        this.field291[var11] = arg1.method2406((byte) -107);
                        this.field277[var11] = arg1.method2406((byte) -115);
                        this.field292[var11] = arg1.method2432((byte) 125);
                    }
                    return;
                }
                if (arg0 == 19) {
                    int var18 = arg1.method2388((byte) -128);
                    this.field271 = new int[var18];
                    this.field290 = new int[var18];
                    this.field281 = new int[var18];
                    this.field275 = new String[var18];
                    for (int var19 = 0; var19 < var18; var19++) {
                        this.field271[var19] = arg1.method2406((byte) -98);
                        this.field281[var19] = arg1.method2406((byte) -124);
                        this.field290[var19] = arg1.method2406((byte) -122);
                        this.field275[var19] = arg1.method2432((byte) 125);
                    }
                } else if (arg0 == 249) {
                    int var12 = arg1.method2388((byte) -128);
                    if (this.field287 == null) {
                        int var13 = class111.method682(-125, var12);
                        this.field287 = new class50(var13);
                    }
                    for (int var14 = 0; var14 < var12; var14++) {
                        boolean var15 = arg1.method2388((byte) -126) == 1;
                        int var16 = arg1.method2396((byte) -46);
                        class435 var17;
                        if (var15) {
                            var17 = new class53(arg1.method2432((byte) 125));
                        } else {
                            var17 = new class488(arg1.method2406((byte) -90));
                        }
                        this.field287.method291((long) var16, var17, -126);
                    }
                    return;
                }
                return;
            }
            int var20 = arg1.method2388((byte) -126);
            this.field276 = new int[var20][2];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field276[var21][0] = arg1.method2388((byte) -127);
                this.field276[var21][1] = arg1.method2388((byte) -127);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lug;I)V")
    public final void method170(class396 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2388((byte) -125);
            if (var3 == 0) {
                field282++;
                if (arg1 != 0) {
                    field280 = null;
                    return;
                }
                return;
            }
            this.method169(var3, arg0, arg1 ^ 0x42);
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public final void method171(int arg0) {
        if (arg0 != 1) {
            method168(-82);
        }
        field279++;
        if (this.field285 == null) {
            this.field285 = this.field269;
        }
    }

    static {
        new class305("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field272 = new class531[2048];
        field283 = new float[4];
    }
}
