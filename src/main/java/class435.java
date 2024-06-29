import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class435 {

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public int field6390 = -1;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field6386 = 0;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "[I")
    public static int[] field6376 = new int[5];

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "Lqu;")
    public static class364 field6382 = new class364(2, 3);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "Lica;")
    private class205 field6396;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "Ljava/lang/String;")
    private String field6374;

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "Ljava/lang/String;")
    private String field6392;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "[I")
    private int[] field6375;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "[I")
    private int[] field6378;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "[I")
    private int[] field6380;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "[I")
    private int[] field6384;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "[I")
    private int[] field6388;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "[I")
    private int[] field6391;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "[I")
    private int[] field6394;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "[I")
    private int[] field6395;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "[Ljava/lang/String;")
    private String[] field6377;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "[Ljava/lang/String;")
    private String[] field6393;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "[[I")
    private int[][] field6383;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "[[I")
    private int[][] field6385;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "[[I")
    private int[][] field6397;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public final void method2652(int arg0) {
        field6379++;
        int var2 = -82 % ((-arg0 - 52) / 42);
        if (this.field6392 == null) {
            this.field6392 = this.field6374;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 != 3) {
            method2653(73, -48, -97, -37, -58, 59, -64, 117, -95);
        }
        class509.method3039(arg7, arg6, arg8, arg3, arg2, arg5, arg4, arg1, 0, true);
        field6381++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lps;B)V")
    public final void method2654(class428 arg0, byte arg1) {
        if (arg1 != 23) {
            this.method2652(-78);
        }
        while (true) {
            int var3 = arg0.method2561((byte) -114);
            if (var3 == 0) {
                field6387++;
                return;
            }
            this.method2655(14, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILps;I)V")
    private final void method2655(int arg0, class428 arg1, int arg2) {
        if (arg2 == 1) {
            this.field6374 = arg1.method2567(true);
        } else if (arg2 == 2) {
            this.field6392 = arg1.method2567(true);
        } else if (arg2 == 3) {
            int var4 = arg1.method2561((byte) 125);
            this.field6383 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6383[var5][0] = arg1.method2620(114);
                this.field6383[var5][1] = arg1.method2589(-11179);
                this.field6383[var5][2] = arg1.method2589(-11179);
            }
        } else if (arg2 == 4) {
            int var6 = arg1.method2561((byte) -75);
            this.field6397 = new int[var6][3];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field6397[var7][0] = arg1.method2620(96);
                this.field6397[var7][1] = arg1.method2589(class342.method2119(arg0, -11173));
                this.field6397[var7][2] = arg1.method2589(-11179);
            }
        } else if (arg2 == 5) {
            arg1.method2620(54);
        } else if (arg2 == 6) {
            arg1.method2561((byte) 109);
        } else if (arg2 == 7) {
            arg1.method2561((byte) 121);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg1.method2561((byte) -43);
            } else if (arg2 == 10) {
                int var8 = arg1.method2561((byte) -89);
                this.field6391 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field6391[var9] = arg1.method2589(class342.method2119(arg0, -11173));
                }
            } else if (arg2 == 12) {
                arg1.method2589(-11179);
            } else if (arg2 == 13) {
                int var22 = arg1.method2561((byte) 124);
                this.field6380 = new int[var22];
                for (int var23 = 0; var23 < var22; var23++) {
                    this.field6380[var23] = arg1.method2620(46);
                }
            } else if (arg2 == 14) {
                int var20 = arg1.method2561((byte) 121);
                this.field6385 = new int[var20][2];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field6385[var21][0] = arg1.method2561((byte) -15);
                    this.field6385[var21][1] = arg1.method2561((byte) 118);
                }
            } else if (arg2 == 15) {
                arg1.method2620(96);
            } else if (arg2 == 17) {
                this.field6390 = arg1.method2620(arg0 ^ 0x33);
            } else if (arg2 == 18) {
                int var18 = arg1.method2561((byte) -20);
                this.field6393 = new String[var18];
                this.field6384 = new int[var18];
                this.field6388 = new int[var18];
                this.field6395 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field6388[var19] = arg1.method2589(arg0 - 11193);
                    this.field6384[var19] = arg1.method2589(arg0 - 11193);
                    this.field6395[var19] = arg1.method2589(class342.method2119(arg0, -11173));
                    this.field6393[var19] = arg1.method2585(arg0 - 110);
                }
            } else if (arg2 == 19) {
                int var16 = arg1.method2561((byte) 112);
                this.field6377 = new String[var16];
                this.field6394 = new int[var16];
                this.field6378 = new int[var16];
                this.field6375 = new int[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field6378[var17] = arg1.method2589(-11179);
                    this.field6375[var17] = arg1.method2589(-11179);
                    this.field6394[var17] = arg1.method2589(class342.method2119(arg0, -11173));
                    this.field6377[var17] = arg1.method2585(arg0 - 54);
                }
            } else if (arg2 == 249) {
                int var10 = arg1.method2561((byte) -94);
                if (this.field6396 == null) {
                    int var11 = class479.method2908((byte) -99, var10);
                    this.field6396 = new class205(var11);
                }
                for (int var12 = 0; var12 < var10; var12++) {
                    boolean var13 = arg1.method2561((byte) -32) == 1;
                    int var14 = arg1.method2601(123);
                    class496 var15;
                    if (var13) {
                        var15 = new class647(arg1.method2585(117));
                    } else {
                        var15 = new class269(arg1.method2589(arg0 ^ 0xFFFFD45B));
                    }
                    this.field6396.method1341(var15, (byte) 79, (long) var14);
                }
            }
        }
        if (arg0 != 14) {
            this.field6394 = null;
        }
        field6373++;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public static void method2656(int arg0) {
        field6382 = null;
        if (arg0 != -20) {
            method2653(-20, -96, 59, -31, 22, 62, 87, -36, -91);
        }
        field6376 = null;
    }
}
