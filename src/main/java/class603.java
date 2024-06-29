import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class603 {

    @OriginalMember(owner = "client!dv", name = "r", descriptor = "I")
    public int field8383 = -1;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "[I")
    public static int[] field8367 = new int[13];

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public static int field8372 = 0;

    @OriginalMember(owner = "client!dv", name = "u", descriptor = "I")
    public static int field8386 = 503;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public static int field8369;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "I")
    public static int field8376;

    @OriginalMember(owner = "client!dv", name = "p", descriptor = "I")
    public static int field8381;

    @OriginalMember(owner = "client!dv", name = "t", descriptor = "I")
    public static int field8385;

    @OriginalMember(owner = "client!dv", name = "x", descriptor = "I")
    public static int field8389;

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "Loj;")
    private class346 field8379;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "Ljava/lang/String;")
    private String field8373;

    @OriginalMember(owner = "client!dv", name = "w", descriptor = "Ljava/lang/String;")
    private String field8388;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "[I")
    private int[] field8368;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "[I")
    private int[] field8374;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "[I")
    private int[] field8378;

    @OriginalMember(owner = "client!dv", name = "o", descriptor = "[I")
    private int[] field8380;

    @OriginalMember(owner = "client!dv", name = "q", descriptor = "[I")
    private int[] field8382;

    @OriginalMember(owner = "client!dv", name = "s", descriptor = "[I")
    private int[] field8384;

    @OriginalMember(owner = "client!dv", name = "v", descriptor = "[I")
    private int[] field8387;

    @OriginalMember(owner = "client!dv", name = "y", descriptor = "[I")
    private int[] field8390;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "[Ljava/lang/String;")
    private String[] field8366;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "[Ljava/lang/String;")
    private String[] field8370;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "[[I")
    private int[][] field8371;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "[[I")
    private int[][] field8375;

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "[[I")
    private int[][] field8377;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
    public static void method3340(int arg0) {
        if (arg0 != -16) {
            method3340(76);
        }
        field8367 = null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILjr;I)V")
    private final void method3341(int arg0, class96 arg1, int arg2) {
        field8389++;
        if (arg2 != 27102) {
            return;
        }
        if (arg0 == 1) {
            this.field8373 = arg1.method698(arg2 ^ 0x69DD);
        } else if (arg0 == 2) {
            this.field8388 = arg1.method698(3);
        } else if (arg0 == 3) {
            int var4 = arg1.method718(-106);
            this.field8375 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8375[var5][0] = arg1.method743((byte) -33);
                this.field8375[var5][1] = arg1.method714(false);
                this.field8375[var5][2] = arg1.method714(false);
            }
        } else if (arg0 == 4) {
            int var22 = arg1.method718(-60);
            this.field8371 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field8371[var23][0] = arg1.method743((byte) -54);
                this.field8371[var23][1] = arg1.method714(false);
                this.field8371[var23][2] = arg1.method714(false);
            }
        } else if (arg0 == 5) {
            arg1.method743((byte) -112);
        } else if (arg0 == 6) {
            arg1.method718(74);
        } else if (arg0 == 7) {
            arg1.method718(-66);
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg1.method718(-101);
                return;
            }
            if (arg0 != 10) {
                if (arg0 == 12) {
                    arg1.method714(false);
                    return;
                }
                if (arg0 != 13) {
                    if (arg0 == 14) {
                        int var6 = arg1.method718(-118);
                        this.field8377 = new int[var6][2];
                        for (int var7 = 0; var7 < var6; var7++) {
                            this.field8377[var7][0] = arg1.method718(-114);
                            this.field8377[var7][1] = arg1.method718(arg2 - 27026);
                        }
                        return;
                    }
                    if (arg0 == 15) {
                        arg1.method743((byte) -98);
                        return;
                    }
                    if (arg0 == 17) {
                        this.field8383 = arg1.method743((byte) -97);
                        return;
                    }
                    if (arg0 != 18) {
                        if (arg0 == 19) {
                            int var14 = arg1.method718(arg2 ^ 0x698C);
                            this.field8368 = new int[var14];
                            this.field8378 = new int[var14];
                            this.field8370 = new String[var14];
                            this.field8390 = new int[var14];
                            for (int var15 = 0; var15 < var14; var15++) {
                                this.field8378[var15] = arg1.method714(false);
                                this.field8390[var15] = arg1.method714(false);
                                this.field8368[var15] = arg1.method714(false);
                                this.field8370[var15] = arg1.method739(arg2 - 27216);
                            }
                        } else if (arg0 == 249) {
                            int var8 = arg1.method718(arg2 - 27167);
                            if (this.field8379 == null) {
                                int var9 = class350.method2082(127, var8);
                                this.field8379 = new class346(var9);
                            }
                            for (int var10 = 0; var10 < var8; var10++) {
                                boolean var11 = arg1.method718(arg2 ^ 0x69A5) == 1;
                                int var12 = arg1.method736(arg2 - 27224);
                                class539 var13;
                                if (var11) {
                                    var13 = new class615(arg1.method739(-89));
                                } else {
                                    var13 = new class108(arg1.method714(false));
                                }
                                this.field8379.method2063((long) var12, arg2 - 27101, var13);
                            }
                            return;
                        }
                        return;
                    }
                    int var16 = arg1.method718(84);
                    this.field8366 = new String[var16];
                    this.field8380 = new int[var16];
                    this.field8382 = new int[var16];
                    this.field8384 = new int[var16];
                    for (int var17 = 0; var17 < var16; var17++) {
                        this.field8384[var17] = arg1.method714(false);
                        this.field8380[var17] = arg1.method714(false);
                        this.field8382[var17] = arg1.method714(false);
                        this.field8366[var17] = arg1.method739(53);
                    }
                    return;
                }
                int var18 = arg1.method718(arg2 - 26983);
                this.field8374 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field8374[var19] = arg1.method743((byte) -94);
                }
                return;
            }
            int var20 = arg1.method718(97);
            this.field8387 = new int[var20];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field8387[var21] = arg1.method714(false);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
    public static final void method3342(int arg0) {
        field8376++;
        class124 var1 = null;
        try {
            if (arg0 != 503) {
                field8372 = -104;
            }
            var1 = class79.method624("2", false);
            class96 var2 = new class96(class268.field3794 * 6 + 3);
            var2.method746((byte) -106, 1);
            var2.method731(-2045573048, class268.field3794);
            for (int var3 = 0; var3 < class614.field8514.length; var3++) {
                if (class385.field5394[var3]) {
                    var2.method731(-2045573048, var3);
                    var2.method741(class614.field8514[var3], (byte) 27);
                }
            }
            var1.method880(var2.field1316, 1, 0, var2.field1301);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method886(true);
            }
        } catch (Exception var4) {
        }
        class51.field741 = class680.method3756(-60);
        class417.field5879 = false;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B[I[Ljava/lang/Object;)V")
    public static final void method3343(byte arg0, int[] arg1, Object[] arg2) {
        field8381++;
        if (arg0 != 104) {
            field8386 = -4;
        }
        class572.method3148(arg0 ^ 0x2A44, arg2, arg1, 0, arg1.length - 1);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILjr;)V")
    public final void method3344(int arg0, class96 arg1) {
        while (true) {
            int var3 = arg1.method718(-105);
            if (var3 == 0) {
                field8385++;
                int var4 = -66 / ((35 - arg0) / 43);
                return;
            }
            this.method3341(var3, arg1, 27102);
        }
    }

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "(I)V")
    public final void method3345(int arg0) {
        if (this.field8388 == null) {
            this.field8388 = this.field8373;
        }
        if (arg0 != 0) {
            this.field8366 = null;
        }
        field8369++;
    }
}
