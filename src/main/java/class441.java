import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class441 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public int field6532 = -1;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "[I")
    public static int[] field6555 = new int[4096];

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Ltn;")
    public static class60 field6536 = new class60();

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "Ls;")
    public static class186 field6556 = new class186(50, 6);

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "Lbj;")
    public static class162 field6557 = new class162(57, 1);

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "Lmn;")
    private class249 field6547;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "Ljava/lang/String;")
    private String field6548;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "Ljava/lang/String;")
    private String field6550;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "[I")
    private int[] field6534;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "[I")
    private int[] field6537;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "[I")
    private int[] field6539;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "[I")
    private int[] field6544;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "[I")
    private int[] field6546;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "[I")
    private int[] field6551;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "[I")
    private int[] field6552;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "[I")
    private int[] field6553;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "[Lgh;")
    public static class388[] field6558;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "[Ljava/lang/String;")
    private String[] field6541;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "[Ljava/lang/String;")
    private String[] field6549;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "[[I")
    private int[][] field6540;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "[[I")
    private int[][] field6543;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "[[I")
    private int[][] field6545;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)I", line = 22)
    public static final int method2625(int arg0, int arg1, int arg2) {
        int var3 = -105 % ((arg0 + 39) / 58);
        field6542++;
        int var4 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var4 = arg2 * var4;
            }
            arg2 *= arg2;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg2 * var4;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZLnn;)V", line = 47)
    public final void method2626(boolean arg0, class289 arg1) {
        field6538++;
        if (arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method1858(-3256);
            if (var3 == 0) {
                return;
            }
            this.method2630(var3, arg1, (byte) 96);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 82)
    public final void method2627(int arg0) {
        field6533++;
        if (arg0 < -13 && this.field6550 == null) {
            this.field6550 = this.field6548;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)I", line = 99)
    public static final int method2628(int arg0, int arg1) {
        int var2 = 33 / ((arg0 + 10) / 51);
        field6535++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V", line = 114)
    public static void method2629(int arg0) {
        field6536 = null;
        field6556 = null;
        if (arg0 != 6) {
            method2629(-58);
        }
        field6558 = null;
        field6555 = null;
        field6557 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILnn;B)V", line = 128)
    private final void method2630(int arg0, class289 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field6548 = arg1.method1838(100);
        } else if (arg0 == 2) {
            this.field6550 = arg1.method1838(68);
        } else if (arg0 == 3) {
            int var22 = arg1.method1858(-3256);
            this.field6540 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field6540[var23][0] = arg1.method1841((byte) 73);
                this.field6540[var23][1] = arg1.method1815((byte) -103);
                this.field6540[var23][2] = arg1.method1815((byte) -74);
            }
        } else if (arg0 == 4) {
            int var4 = arg1.method1858(-3256);
            this.field6543 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6543[var5][0] = arg1.method1841((byte) 60);
                this.field6543[var5][1] = arg1.method1815((byte) -91);
                this.field6543[var5][2] = arg1.method1815((byte) -76);
            }
        } else if (arg0 == 5) {
            arg1.method1841((byte) 43);
        } else if (arg0 == 6) {
            arg1.method1858(-3256);
        } else if (arg0 == 7) {
            arg1.method1858(-3256);
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg1.method1858(-3256);
            } else if (arg0 == 10) {
                int var6 = arg1.method1858(-3256);
                this.field6544 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field6544[var7] = arg1.method1815((byte) -49);
                }
            } else if (arg0 == 12) {
                arg1.method1815((byte) -50);
            } else if (arg0 == 13) {
                int var20 = arg1.method1858(-3256);
                this.field6537 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field6537[var21] = arg1.method1841((byte) 119);
                }
            } else if (arg0 == 14) {
                int var8 = arg1.method1858(-3256);
                this.field6545 = new int[var8][2];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field6545[var9][0] = arg1.method1858(-3256);
                    this.field6545[var9][1] = arg1.method1858(-3256);
                }
            } else if (arg0 == 15) {
                arg1.method1841((byte) 82);
            } else if (arg0 == 17) {
                this.field6532 = arg1.method1841((byte) 43);
            } else if (arg0 == 18) {
                int var10 = arg1.method1858(-3256);
                this.field6552 = new int[var10];
                this.field6546 = new int[var10];
                this.field6534 = new int[var10];
                this.field6541 = new String[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field6552[var11] = arg1.method1815((byte) -51);
                    this.field6534[var11] = arg1.method1815((byte) -74);
                    this.field6546[var11] = arg1.method1815((byte) -108);
                    this.field6541[var11] = arg1.method1834(-17823);
                }
            } else if (arg0 == 19) {
                int var18 = arg1.method1858(-3256);
                this.field6539 = new int[var18];
                this.field6553 = new int[var18];
                this.field6549 = new String[var18];
                this.field6551 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field6539[var19] = arg1.method1815((byte) -57);
                    this.field6553[var19] = arg1.method1815((byte) -72);
                    this.field6551[var19] = arg1.method1815((byte) -62);
                    this.field6549[var19] = arg1.method1834(-17823);
                }
            } else if (arg0 == 249) {
                int var12 = arg1.method1858(-3256);
                if (this.field6547 == null) {
                    int var13 = class184.method1256(var12, (byte) 116);
                    this.field6547 = new class249(var13);
                }
                for (int var14 = 0; var14 < var12; var14++) {
                    boolean var15 = arg1.method1858(-3256) == 1;
                    int var16 = arg1.method1863(-32);
                    class261 var17;
                    if (var15) {
                        var17 = new class268(arg1.method1834(-17823));
                    } else {
                        var17 = new class100(arg1.method1815((byte) -86));
                    }
                    this.field6547.method1618(var17, (long) var16, -1);
                }
            }
        }
        field6554++;
        if (arg2 <= 53) {
            this.field6548 = null;
        }
    }
}
