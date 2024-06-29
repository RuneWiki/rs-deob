import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class433 {

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public int field5859 = -1;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "[I")
    public static int[] field5857 = new int[1];

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "F")
    public static float field5866;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "Lpt;")
    private class451 field5877;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "Ljava/lang/String;")
    private String field5867;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "Ljava/lang/String;")
    private String field5876;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "[I")
    private int[] field5855;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "[I")
    private int[] field5856;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "[I")
    private int[] field5860;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "[I")
    private int[] field5863;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "[I")
    private int[] field5865;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "[I")
    private int[] field5871;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "[I")
    private int[] field5872;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "[I")
    private int[] field5875;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "[Ljava/lang/String;")
    private String[] field5854;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "[Ljava/lang/String;")
    private String[] field5864;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "[[I")
    private int[][] field5858;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "[[I")
    private int[][] field5868;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "[[I")
    private int[][] field5878;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Los;Z)V", line = 3)
    public final void method2502(class374 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field5874++;
        while (true) {
            int var3 = arg0.method2129(-128);
            if (var3 == 0) {
                return;
            }
            this.method2505(6448, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILvv;)V", line = 45)
    public static final void method2503(int arg0, class270 arg1) {
        arg1.field3508 = false;
        field5870++;
        if (arg1.field3505 != null) {
            arg1.field3505.field7037 = 0;
        }
        for (class270 var2 = arg1.method806(); var2 != null; var2 = arg1.method801()) {
            method2503(-94, var2);
        }
        int var3 = -96 % ((-arg0 - 9) / 55);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II[FFIIFIBII)V", line = 72)
    public static final void method2504(int arg0, int arg1, float[] arg2, float arg3, int arg4, int arg5, float arg6, int arg7, byte arg8, int arg9, int arg10) {
        field5869++;
        int var11 = arg9 - arg0;
        int var12 = arg7 - arg4;
        int var13 = arg5 - arg10;
        float var14 = arg2[2] * (float) var12 + arg2[1] * (float) var13 + arg2[0] * (float) var11;
        float var15 = arg2[5] * (float) var12 + arg2[4] * (float) var13 + arg2[3] * (float) var11;
        float var16 = arg2[8] * (float) var12 + arg2[7] * (float) var13 + arg2[6] * (float) var11;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg6 != 1.0F) {
            var17 = arg6 * var17;
        }
        float var18 = var15 + arg3 + 0.5F;
        if (arg8 != -109) {
            field5866 = 0.77850986F;
        }
        if (arg1 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg1 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg1 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class359.field4727 = var17;
        class137.field1676 = var18;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILos;)V", line = 145)
    private final void method2505(int arg0, int arg1, class374 arg2) {
        field5873++;
        if (arg1 == 1) {
            this.field5876 = arg2.method2098(-88);
        } else if (arg1 == 2) {
            this.field5867 = arg2.method2098(-23);
        } else if (arg1 == 3) {
            int var4 = arg2.method2129(-126);
            this.field5878 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5878[var5][0] = arg2.method2136(false);
                this.field5878[var5][1] = arg2.method2123(false);
                this.field5878[var5][2] = arg2.method2123(false);
            }
        } else if (arg1 == 4) {
            int var22 = arg2.method2129(arg0 ^ 0xFFFFE6B9);
            this.field5858 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field5858[var23][0] = arg2.method2136(false);
                this.field5858[var23][1] = arg2.method2123(false);
                this.field5858[var23][2] = arg2.method2123(false);
            }
        } else if (arg1 == 5) {
            arg2.method2136(false);
        } else if (arg1 == 6) {
            arg2.method2129(-122);
        } else if (arg1 == 7) {
            arg2.method2129(-67);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg2.method2129(-111);
            } else if (arg1 == 10) {
                int var6 = arg2.method2129(arg0 ^ 0xFFFFE68F);
                this.field5863 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field5863[var7] = arg2.method2123(false);
                }
            } else if (arg1 == 12) {
                arg2.method2123(false);
            } else if (arg1 == 13) {
                int var8 = arg2.method2129(-78);
                this.field5855 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field5855[var9] = arg2.method2136(false);
                }
            } else if (arg1 == 14) {
                int var20 = arg2.method2129(-100);
                this.field5868 = new int[var20][2];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field5868[var21][0] = arg2.method2129(-106);
                    this.field5868[var21][1] = arg2.method2129(-128);
                }
            } else if (arg1 == 15) {
                arg2.method2136(false);
            } else if (arg1 == 17) {
                this.field5859 = arg2.method2136(false);
            } else if (arg1 == 18) {
                int var10 = arg2.method2129(-90);
                this.field5875 = new int[var10];
                this.field5856 = new int[var10];
                this.field5854 = new String[var10];
                this.field5860 = new int[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field5875[var11] = arg2.method2123(false);
                    this.field5860[var11] = arg2.method2123(false);
                    this.field5856[var11] = arg2.method2123(false);
                    this.field5854[var11] = arg2.method2133(false);
                }
            } else if (arg1 == 19) {
                int var18 = arg2.method2129(arg0 ^ 0xFFFFE6BB);
                this.field5865 = new int[var18];
                this.field5871 = new int[var18];
                this.field5872 = new int[var18];
                this.field5864 = new String[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field5872[var19] = arg2.method2123(false);
                    this.field5871[var19] = arg2.method2123(false);
                    this.field5865[var19] = arg2.method2123(false);
                    this.field5864[var19] = arg2.method2133(false);
                }
            } else if (arg1 == 249) {
                int var12 = arg2.method2129(-103);
                if (this.field5877 == null) {
                    int var13 = class129.method731(var12, -27265);
                    this.field5877 = new class451(var13);
                }
                for (int var14 = 0; var14 < var12; var14++) {
                    boolean var15 = arg2.method2129(-111) == 1;
                    int var16 = arg2.method2128(true);
                    class544 var17;
                    if (var15) {
                        var17 = new class646(arg2.method2133(false));
                    } else {
                        var17 = new class171(arg2.method2123(false));
                    }
                    this.field5877.method2640(1, (long) var16, var17);
                }
            }
        }
        if (arg0 != 6448) {
            this.method2506(23);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 381)
    public final void method2506(int arg0) {
        if (this.field5867 == null) {
            this.field5867 = this.field5876;
        }
        if (arg0 != -7) {
            this.field5878 = null;
        }
        field5861++;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V", line = 399)
    public static void method2507(int arg0) {
        field5857 = null;
        if (arg0 < 70) {
            field5857 = null;
        }
    }
}
