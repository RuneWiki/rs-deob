import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class61 {

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public int field917 = -1;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "Z")
    public static boolean field934 = false;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "Lsi;")
    public static class769 field922 = new class769(8);

    @OriginalMember(owner = "client!mm", name = "C", descriptor = "[I")
    public static int[] field944 = new int[6];

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!mm", name = "A", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "Lhia;")
    public static class49 field943;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "Lsi;")
    private class769 field924;

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "Ljava/lang/String;")
    private String field939;

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "Ljava/lang/String;")
    private String field940;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "[I")
    private int[] field919;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "[I")
    private int[] field926;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "[I")
    private int[] field928;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "[I")
    private int[] field930;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "[I")
    private int[] field931;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "[I")
    private int[] field933;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "[I")
    private int[] field936;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "[I")
    private int[] field937;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "[Ljava/lang/String;")
    private String[] field920;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "[Ljava/lang/String;")
    private String[] field935;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "[[I")
    private int[][] field923;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "[[I")
    private int[][] field927;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "[[I")
    private int[][] field929;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
    public static final void method625(int arg0, int arg1) {
        field921++;
        class371 var2 = class490.method2867((byte) -69, 16, (long) arg0);
        if (arg1 != 25013) {
            field922 = null;
        }
        var2.method2215(4);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lol;II)V")
    private final void method626(class431 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field939 = arg0.method2537((byte) 27);
        } else if (arg1 == 2) {
            this.field940 = arg0.method2537((byte) 27);
        } else if (arg1 == 3) {
            int var22 = arg0.method2557(14929);
            this.field929 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field929[var23][0] = arg0.method2565((byte) -126);
                this.field929[var23][1] = arg0.method2526(17);
                this.field929[var23][2] = arg0.method2526(17);
            }
        } else if (arg1 == 4) {
            int var4 = arg0.method2557(14929);
            this.field923 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field923[var5][0] = arg0.method2565((byte) -108);
                this.field923[var5][1] = arg0.method2526(17);
                this.field923[var5][2] = arg0.method2526(class172.method1269(arg2, 18));
            }
        } else if (arg1 == 5) {
            arg0.method2565((byte) -105);
        } else if (arg1 == 6) {
            arg0.method2557(14929);
        } else if (arg1 == 7) {
            arg0.method2557(14929);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method2557(arg2 + 14926);
            } else if (arg1 == 10) {
                int var6 = arg0.method2557(14929);
                this.field928 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field928[var7] = arg0.method2526(17);
                }
            } else if (arg1 == 12) {
                arg0.method2526(17);
            } else if (arg1 == 13) {
                int var20 = arg0.method2557(14929);
                this.field936 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field936[var21] = arg0.method2565((byte) -111);
                }
            } else if (arg1 == 14) {
                int var18 = arg0.method2557(14929);
                this.field927 = new int[var18][2];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field927[var19][0] = arg0.method2557(14929);
                    this.field927[var19][1] = arg0.method2557(14929);
                }
            } else if (arg1 == 15) {
                arg0.method2565((byte) -110);
            } else if (arg1 == 17) {
                this.field917 = arg0.method2565((byte) -124);
            } else if (arg1 == 18) {
                int var16 = arg0.method2557(14929);
                this.field919 = new int[var16];
                this.field937 = new int[var16];
                this.field920 = new String[var16];
                this.field926 = new int[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field926[var17] = arg0.method2526(17);
                    this.field919[var17] = arg0.method2526(17);
                    this.field937[var17] = arg0.method2526(17);
                    this.field920[var17] = arg0.method2532((byte) -120);
                }
            } else if (arg1 == 19) {
                int var14 = arg0.method2557(arg2 ^ 0x3A52);
                this.field930 = new int[var14];
                this.field933 = new int[var14];
                this.field931 = new int[var14];
                this.field935 = new String[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field933[var15] = arg0.method2526(17);
                    this.field930[var15] = arg0.method2526(17);
                    this.field931[var15] = arg0.method2526(17);
                    this.field935[var15] = arg0.method2532((byte) -125);
                }
            } else if (arg1 == 249) {
                int var8 = arg0.method2557(14929);
                if (this.field924 == null) {
                    int var9 = class661.method3706(var8, true);
                    this.field924 = new class769(var9);
                }
                for (int var10 = 0; var10 < var8; var10++) {
                    boolean var11 = arg0.method2557(arg2 + 14926) == 1;
                    int var12 = arg0.method2515(arg2 ^ 0x3C);
                    class766 var13;
                    if (var11) {
                        var13 = new class662(arg0.method2532((byte) -123));
                    } else {
                        var13 = new class725(arg0.method2526(17));
                    }
                    this.field924.method4252(false, var13, (long) var12);
                }
            }
        }
        if (arg2 == 3) {
            field925++;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public static void method627(int arg0) {
        field922 = null;
        if (arg0 != 21) {
            method625(57, 42);
        }
        field943 = null;
        field944 = null;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)Z")
    public static final boolean method628(int arg0, int arg1) {
        int var2 = 43 / ((-arg0 - 72) / 52);
        field916++;
        if (arg1 == 9 || arg1 == 20 || arg1 == 58 || arg1 == 30 || arg1 == 21) {
            return true;
        } else {
            return arg1 == 17 || arg1 == 1009;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I[SI)[S")
    public static final short[] method629(int arg0, short[] arg1, int arg2) {
        field938++;
        short[] var3 = new short[arg0];
        if (arg2 >= -71) {
            field922 = null;
        }
        class171.method1266(arg1, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
    public final void method630(byte arg0) {
        int var2 = 19 % ((arg0 - 46) / 58);
        field932++;
        if (this.field940 == null) {
            this.field940 = this.field939;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lol;Z)V")
    public final void method631(class431 arg0, boolean arg1) {
        field918++;
        while (true) {
            int var3 = arg0.method2557(14929);
            if (var3 == 0) {
                if (arg1) {
                    this.field939 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method626(arg0, var3, 3);
        }
    }
}
