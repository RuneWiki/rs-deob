import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class11 {

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    public int field125 = -1;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "Lcp;")
    private class470 field121;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "Ljava/lang/String;")
    private String field124;

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "Ljava/lang/String;")
    private String field127;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "[I")
    private int[] field107;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "[I")
    private int[] field109;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "[I")
    private int[] field110;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "[I")
    private int[] field118;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "[I")
    private int[] field119;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "[I")
    private int[] field122;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "[I")
    private int[] field123;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "[I")
    private int[] field129;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "[Ltr;")
    public static class176[] field120;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "[Ljava/lang/String;")
    private String[] field113;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "[Ljava/lang/String;")
    private String[] field115;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "[[I")
    private int[][] field106;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "[[I")
    private int[][] field108;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "[[I")
    private int[][] field116;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static void method40(int arg0) {
        field120 = null;
        if (arg0 != 17687) {
            field120 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lrp;BI)V")
    private final void method41(class276 arg0, byte arg1, int arg2) {
        field112++;
        if (arg2 == 1) {
            this.field124 = arg0.method1754(false);
        } else if (arg2 == 2) {
            this.field127 = arg0.method1754(false);
        } else if (arg2 == 3) {
            int var4 = arg0.method1701(-23121);
            this.field108 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field108[var5][0] = arg0.method1729(65280);
                this.field108[var5][1] = arg0.method1688(20402);
                this.field108[var5][2] = arg0.method1688(20402);
            }
        } else if (arg2 == 4) {
            int var22 = arg0.method1701(-23121);
            this.field106 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field106[var23][0] = arg0.method1729(65280);
                this.field106[var23][1] = arg0.method1688(20402);
                this.field106[var23][2] = arg0.method1688(20402);
            }
        } else if (arg2 == 5) {
            arg0.method1729(65280);
        } else if (arg2 == 6) {
            arg0.method1701(-23121);
        } else if (arg2 == 7) {
            arg0.method1701(-23121);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg0.method1701(-23121);
            } else if (arg2 == 10) {
                int var20 = arg0.method1701(-23121);
                this.field129 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field129[var21] = arg0.method1688(20402);
                }
            } else if (arg2 == 12) {
                arg0.method1688(20402);
            } else if (arg2 == 13) {
                int var6 = arg0.method1701(-23121);
                this.field110 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field110[var7] = arg0.method1729(65280);
                }
            } else if (arg2 == 14) {
                int var8 = arg0.method1701(-23121);
                this.field116 = new int[var8][2];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field116[var9][0] = arg0.method1701(-23121);
                    this.field116[var9][1] = arg0.method1701(-23121);
                }
            } else if (arg2 == 15) {
                arg0.method1729(65280);
            } else if (arg2 == 17) {
                this.field125 = arg0.method1729(65280);
            } else if (arg2 == 18) {
                int var18 = arg0.method1701(-23121);
                this.field107 = new int[var18];
                this.field122 = new int[var18];
                this.field115 = new String[var18];
                this.field118 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field107[var19] = arg0.method1688(20402);
                    this.field122[var19] = arg0.method1688(20402);
                    this.field118[var19] = arg0.method1688(20402);
                    this.field115[var19] = arg0.method1750(-113);
                }
            } else if (arg2 == 19) {
                int var16 = arg0.method1701(-23121);
                this.field119 = new int[var16];
                this.field123 = new int[var16];
                this.field113 = new String[var16];
                this.field109 = new int[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field123[var17] = arg0.method1688(20402);
                    this.field119[var17] = arg0.method1688(20402);
                    this.field109[var17] = arg0.method1688(20402);
                    this.field113[var17] = arg0.method1750(-110);
                }
            } else if (arg2 == 249) {
                int var10 = arg0.method1701(-23121);
                if (this.field121 == null) {
                    int var11 = class276.method1708(1256978000, var10);
                    this.field121 = new class470(var11);
                }
                for (int var12 = 0; var12 < var10; var12++) {
                    boolean var13 = arg0.method1701(-23121) == 1;
                    int var14 = arg0.method1748(false);
                    class238 var15;
                    if (var13) {
                        var15 = new class349(arg0.method1750(127));
                    } else {
                        var15 = new class324(arg0.method1688(20402));
                    }
                    this.field121.method2767(-1, (long) var14, var15);
                }
            }
        }
        if (arg1 > -79) {
            method45((byte) 58);
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
    public final void method42(int arg0) {
        if (arg0 == 0) {
            field111++;
            if (this.field127 == null) {
                this.field127 = this.field124;
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZI[IJ)Ljava/lang/String;")
    public static final String method43(boolean arg0, int arg1, int[] arg2, long arg3) {
        field128++;
        if (class252.field3716 != null) {
            String var5 = class252.field3716.method17(arg2, -22976, arg3, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        if (!arg0) {
            method40(123);
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBIII)V")
    public static final void method44(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = 35 % ((arg1 + 35) / 38);
        class317.field4598 = arg0;
        field114++;
        class353.field5093 = arg2;
        class268.field3922 = arg3;
        class260.field3812 = arg4;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
    public static final void method45(byte arg0) {
        if (class293.field4256 > 0) {
            int var1 = 0;
            for (int var2 = 0; var2 < class118.field1487.length; var2++) {
                if (class118.field1487[var2].startsWith("--> ")) {
                    var1++;
                    if (class293.field4256 == var1) {
                        class224.field3399 = class118.field1487[var2].substring(4);
                        break;
                    }
                }
            }
        } else {
            class224.field3399 = "";
        }
        if (arg0 != 111) {
            field120 = null;
        }
        field126++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILrp;)V")
    public final void method46(int arg0, class276 arg1) {
        int var3 = -122 / ((arg0 + 3) / 55);
        field117++;
        while (true) {
            int var4 = arg1.method1701(-23121);
            if (var4 == 0) {
                return;
            }
            this.method41(arg1, (byte) -124, var4);
        }
    }
}
