import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class41 {

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public int field433 = -1;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Ltca;")
    private class184 field423;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Ljava/lang/String;")
    private String field430;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Ljava/lang/String;")
    private String field438;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "[I")
    private int[] field426;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "[I")
    private int[] field429;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "[I")
    private int[] field432;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "[I")
    public static int[] field434;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "[I")
    private int[] field436;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "[I")
    private int[] field440;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "[I")
    private int[] field441;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "[I")
    private int[] field443;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "[I")
    private int[] field445;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "[Liw;")
    public static class334[] field425;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "[Ljava/lang/String;")
    private String[] field437;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "[Ljava/lang/String;")
    private String[] field444;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "[[I")
    private int[][] field428;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "[[I")
    private int[][] field431;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "[[I")
    private int[][] field446;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public final void method232(int arg0) {
        int var2 = 87 % ((arg0 + 45) / 45);
        if (this.field430 == null) {
            this.field430 = this.field438;
        }
        field435++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILdt;I)V")
    private final void method233(int arg0, class254 arg1, int arg2) {
        if (arg2 == 1) {
            this.field438 = arg1.method1705((byte) -91);
        } else if (arg2 == 2) {
            this.field430 = arg1.method1705((byte) 98);
        } else if (arg2 == 3) {
            int var4 = arg1.method1731((byte) 64);
            this.field446 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field446[var5][0] = arg1.method1728((byte) 17);
                this.field446[var5][1] = arg1.method1672(arg0 - 16516);
                this.field446[var5][2] = arg1.method1672(-16516);
            }
        } else if (arg2 == 4) {
            int var6 = arg1.method1731((byte) 64);
            this.field428 = new int[var6][3];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field428[var7][0] = arg1.method1728((byte) 5);
                this.field428[var7][1] = arg1.method1672(class250.method1635(arg0, -16516));
                this.field428[var7][2] = arg1.method1672(-16516);
            }
        } else if (arg2 == 5) {
            arg1.method1728((byte) 15);
        } else if (arg2 == 6) {
            arg1.method1731((byte) 64);
        } else if (arg2 == 7) {
            arg1.method1731((byte) 64);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg1.method1731((byte) 64);
            } else if (arg2 == 10) {
                int var8 = arg1.method1731((byte) 64);
                this.field429 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field429[var9] = arg1.method1672(-16516);
                }
            } else if (arg2 == 12) {
                arg1.method1672(-16516);
            } else if (arg2 == 13) {
                int var22 = arg1.method1731((byte) 64);
                this.field443 = new int[var22];
                for (int var23 = 0; var23 < var22; var23++) {
                    this.field443[var23] = arg1.method1728((byte) 102);
                }
            } else if (arg2 == 14) {
                int var10 = arg1.method1731((byte) 64);
                this.field431 = new int[var10][2];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field431[var11][0] = arg1.method1731((byte) 64);
                    this.field431[var11][1] = arg1.method1731((byte) 64);
                }
            } else if (arg2 == 15) {
                arg1.method1728((byte) 90);
            } else if (arg2 == 17) {
                this.field433 = arg1.method1728((byte) 89);
            } else if (arg2 == 18) {
                int var12 = arg1.method1731((byte) 64);
                this.field426 = new int[var12];
                this.field444 = new String[var12];
                this.field440 = new int[var12];
                this.field441 = new int[var12];
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field440[var13] = arg1.method1672(-16516);
                    this.field441[var13] = arg1.method1672(-16516);
                    this.field426[var13] = arg1.method1672(class250.method1635(arg0, -16516));
                    this.field444[var13] = arg1.method1699(-123);
                }
            } else if (arg2 == 19) {
                int var14 = arg1.method1731((byte) 64);
                this.field437 = new String[var14];
                this.field432 = new int[var14];
                this.field445 = new int[var14];
                this.field436 = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field432[var15] = arg1.method1672(-16516);
                    this.field445[var15] = arg1.method1672(-16516);
                    this.field436[var15] = arg1.method1672(-16516);
                    this.field437[var15] = arg1.method1699(-71);
                }
            } else if (arg2 == 249) {
                int var16 = arg1.method1731((byte) 64);
                if (this.field423 == null) {
                    int var17 = class8.method45(23714, var16);
                    this.field423 = new class184(var17);
                }
                for (int var18 = 0; var18 < var16; var18++) {
                    boolean var19 = arg1.method1731((byte) 64) == 1;
                    int var20 = arg1.method1722(false);
                    class159 var21;
                    if (var19) {
                        var21 = new class553(arg1.method1699(-118));
                    } else {
                        var21 = new class445(arg1.method1672(-16516));
                    }
                    this.field423.method1247(arg0 ^ 0xFE6, (long) var20, var21);
                }
            }
        }
        field439++;
        if (arg0 != 0) {
            method236(false);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILdt;)V")
    public final void method234(int arg0, class254 arg1) {
        if (arg0 != 1) {
            this.method233(55, null, -38);
        }
        while (true) {
            int var3 = arg1.method1731((byte) 64);
            if (var3 == 0) {
                field427++;
                return;
            }
            this.method233(arg0 - 1, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIZ)Lqba;")
    public static final class425 method235(int arg0, int arg1, int arg2, boolean arg3) {
        field424++;
        class194 var4 = class443.field6387[arg1][arg2][arg0];
        if (var4 == null) {
            return null;
        }
        class425 var5 = null;
        int var6 = -1;
        class511 var7 = var4.field2525;
        if (!arg3) {
            method236(false);
        }
        while (var7 != null) {
            class539 var8 = var7.field7126;
            if (var8 instanceof class425) {
                class425 var9 = (class425) var8;
                int var10 = var9.method2563(-12840) * 256 - 4;
                int var11 = var9.field2802 - var10 >> 9;
                int var12 = var9.field2810 - var10 >> 9;
                int var13 = var9.field2802 + var10 >> 9;
                int var14 = var9.field2810 + var10 >> 9;
                if (var11 <= arg2 && arg0 >= var12 && var13 >= arg2 && var14 >= arg0) {
                    int var15 = (var13 + 1 - arg2) * (var14 + 1 - arg0);
                    if (var15 > var6) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
            var7 = var7.field7127;
        }
        return var5;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
    public static void method236(boolean arg0) {
        field434 = null;
        if (!arg0) {
            field425 = null;
        }
        field425 = null;
    }
}
