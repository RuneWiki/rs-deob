import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class29 {

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public int field467 = -1;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "[I")
    public static int[] field470 = new int[25];

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "Lsq;")
    private class454 field471;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "Ljava/lang/String;")
    private String field461;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "Ljava/lang/String;")
    private String field472;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[I")
    private int[] field458;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
    private int[] field463;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "[I")
    private int[] field464;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "[I")
    private int[] field465;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "[I")
    private int[] field466;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "[I")
    private int[] field468;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "[I")
    private int[] field469;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "[I")
    private int[] field475;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "[Ljava/lang/String;")
    private String[] field456;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "[Ljava/lang/String;")
    private String[] field474;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "[[I")
    private int[][] field459;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "[[I")
    private int[][] field460;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "[[I")
    private int[][] field462;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V", line = 5)
    public static void method235(byte arg0) {
        int var1 = 77 % ((-arg0 - 85) / 35);
        field470 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 26)
    public final void method236(int arg0) {
        field476++;
        if (this.field461 == null) {
            this.field461 = this.field472;
        }
        if (arg0 < 106) {
            this.method238((class425) null, 47, -117);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Llk;B)V", line = 59)
    public final void method237(class425 arg0, byte arg1) {
        if (arg1 != 43) {
            this.field467 = -21;
        }
        field457++;
        while (true) {
            int var3 = arg0.method2503(true);
            if (var3 == 0) {
                return;
            }
            this.method238(arg0, var3, -40);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Llk;II)V", line = 103)
    private final void method238(class425 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field472 = arg0.method2465(false);
        } else if (arg1 == 2) {
            this.field461 = arg0.method2465(false);
        } else if (arg1 == 3) {
            int var4 = arg0.method2503(true);
            this.field460 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field460[var5][0] = arg0.method2508(true);
                this.field460[var5][1] = arg0.method2502((byte) -86);
                this.field460[var5][2] = arg0.method2502((byte) -86);
            }
        } else if (arg1 == 4) {
            int var22 = arg0.method2503(true);
            this.field462 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field462[var23][0] = arg0.method2508(true);
                this.field462[var23][1] = arg0.method2502((byte) -86);
                this.field462[var23][2] = arg0.method2502((byte) -86);
            }
        } else if (arg1 == 5) {
            arg0.method2508(true);
        } else if (arg1 == 6) {
            arg0.method2503(true);
        } else if (arg1 == 7) {
            arg0.method2503(true);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method2503(true);
            } else if (arg1 == 10) {
                int var20 = arg0.method2503(true);
                this.field458 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field458[var21] = arg0.method2502((byte) -86);
                }
            } else if (arg1 == 12) {
                arg0.method2502((byte) -86);
            } else if (arg1 == 13) {
                int var18 = arg0.method2503(true);
                this.field468 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field468[var19] = arg0.method2508(true);
                }
            } else if (arg1 == 14) {
                int var16 = arg0.method2503(true);
                this.field459 = new int[var16][2];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field459[var17][0] = arg0.method2503(true);
                    this.field459[var17][1] = arg0.method2503(true);
                }
            } else if (arg1 == 15) {
                arg0.method2508(true);
            } else if (arg1 == 17) {
                this.field467 = arg0.method2508(true);
            } else if (arg1 == 18) {
                int var14 = arg0.method2503(true);
                this.field475 = new int[var14];
                this.field469 = new int[var14];
                this.field466 = new int[var14];
                this.field474 = new String[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field469[var15] = arg0.method2502((byte) -86);
                    this.field466[var15] = arg0.method2502((byte) -86);
                    this.field475[var15] = arg0.method2502((byte) -86);
                    this.field474[var15] = arg0.method2464(false);
                }
            } else if (arg1 == 19) {
                int var6 = arg0.method2503(true);
                this.field456 = new String[var6];
                this.field464 = new int[var6];
                this.field465 = new int[var6];
                this.field463 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field464[var7] = arg0.method2502((byte) -86);
                    this.field463[var7] = arg0.method2502((byte) -86);
                    this.field465[var7] = arg0.method2502((byte) -86);
                    this.field456[var7] = arg0.method2464(false);
                }
            } else if (arg1 == 249) {
                int var8 = arg0.method2503(true);
                if (this.field471 == null) {
                    int var9 = class406.method2388(var8, -49);
                    this.field471 = new class454(var9);
                }
                for (int var10 = 0; var10 < var8; var10++) {
                    boolean var11 = arg0.method2503(true) == 1;
                    int var12 = arg0.method2498(3);
                    class180 var13;
                    if (var11) {
                        var13 = new class329(arg0.method2464(false));
                    } else {
                        var13 = new class128(arg0.method2502((byte) -86));
                    }
                    this.field471.method2620((long) var12, var13, false);
                }
            }
        }
        field473++;
        if (arg2 >= -6) {
            method235((byte) -104);
        }
    }
}
