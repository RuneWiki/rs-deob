import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class84 {

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public int field1136 = -1;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "[[I")
    public static int[][] field1151 = new int[6][];

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Lwt;")
    public static class194 field1138 = new class194("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field1161 = new String[8];

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "J")
    public static long field1159 = 0L;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field1160 = 0;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Lfe;")
    private class384 field1145;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Ljava/lang/String;")
    private String field1147;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "Ljava/lang/String;")
    private String field1155;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "[I")
    private int[] field1139;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "[I")
    private int[] field1140;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "[I")
    private int[] field1144;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "[I")
    private int[] field1148;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "[I")
    private int[] field1149;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "[I")
    private int[] field1153;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "[I")
    private int[] field1157;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "[I")
    private int[] field1158;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "[Ljava/lang/String;")
    private String[] field1137;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "[Ljava/lang/String;")
    private String[] field1154;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "[[I")
    private int[][] field1143;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "[[I")
    private int[][] field1146;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "[[I")
    private int[][] field1152;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 23)
    public final void method527(int arg0) {
        if (arg0 > 100) {
            field1150++;
            if (this.field1155 == null) {
                this.field1155 = this.field1147;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILae;I)V", line = 45)
    private final void method528(int arg0, class156 arg1, int arg2) {
        int var4 = -48 % ((arg2 - 26) / 45);
        if (arg0 == 1) {
            this.field1147 = arg1.method970(97200624);
        } else if (arg0 == 2) {
            this.field1155 = arg1.method970(97200624);
        } else if (arg0 == 3) {
            int var23 = arg1.method941((byte) 123);
            this.field1143 = new int[var23][3];
            for (int var24 = 0; var24 < var23; var24++) {
                this.field1143[var24][0] = arg1.method993((byte) -98);
                this.field1143[var24][1] = arg1.method950(186);
                this.field1143[var24][2] = arg1.method950(186);
            }
        } else if (arg0 == 4) {
            int var21 = arg1.method941((byte) 126);
            this.field1146 = new int[var21][3];
            for (int var22 = 0; var22 < var21; var22++) {
                this.field1146[var22][0] = arg1.method993((byte) -125);
                this.field1146[var22][1] = arg1.method950(186);
                this.field1146[var22][2] = arg1.method950(186);
            }
        } else if (arg0 == 5) {
            arg1.method993((byte) -107);
        } else if (arg0 == 6) {
            arg1.method941((byte) 123);
        } else if (arg0 == 7) {
            arg1.method941((byte) 125);
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg1.method941((byte) 124);
            } else if (arg0 == 10) {
                int var5 = arg1.method941((byte) 126);
                this.field1148 = new int[var5];
                for (int var6 = 0; var6 < var5; var6++) {
                    this.field1148[var6] = arg1.method950(186);
                }
            } else if (arg0 == 12) {
                arg1.method950(186);
            } else if (arg0 == 13) {
                int var7 = arg1.method941((byte) 124);
                this.field1149 = new int[var7];
                for (int var8 = 0; var8 < var7; var8++) {
                    this.field1149[var8] = arg1.method993((byte) -122);
                }
            } else if (arg0 == 14) {
                int var9 = arg1.method941((byte) 123);
                this.field1152 = new int[var9][2];
                for (int var10 = 0; var10 < var9; var10++) {
                    this.field1152[var10][0] = arg1.method941((byte) 127);
                    this.field1152[var10][1] = arg1.method941((byte) 124);
                }
            } else if (arg0 == 15) {
                arg1.method993((byte) -57);
            } else if (arg0 == 17) {
                this.field1136 = arg1.method993((byte) -71);
            } else if (arg0 == 18) {
                int var11 = arg1.method941((byte) 124);
                this.field1158 = new int[var11];
                this.field1139 = new int[var11];
                this.field1140 = new int[var11];
                this.field1137 = new String[var11];
                for (int var12 = 0; var12 < var11; var12++) {
                    this.field1158[var12] = arg1.method950(186);
                    this.field1139[var12] = arg1.method950(186);
                    this.field1140[var12] = arg1.method950(186);
                    this.field1137[var12] = arg1.method981(false);
                }
            } else if (arg0 == 19) {
                int var13 = arg1.method941((byte) 126);
                this.field1154 = new String[var13];
                this.field1157 = new int[var13];
                this.field1153 = new int[var13];
                this.field1144 = new int[var13];
                for (int var14 = 0; var14 < var13; var14++) {
                    this.field1153[var14] = arg1.method950(186);
                    this.field1157[var14] = arg1.method950(186);
                    this.field1144[var14] = arg1.method950(186);
                    this.field1154[var14] = arg1.method981(false);
                }
            } else if (arg0 == 249) {
                int var15 = arg1.method941((byte) 125);
                if (this.field1145 == null) {
                    int var16 = class340.method2064(-110, var15);
                    this.field1145 = new class384(var16);
                }
                for (int var17 = 0; var17 < var15; var17++) {
                    boolean var18 = arg1.method941((byte) 123) == 1;
                    int var19 = arg1.method943(1295851312);
                    class86 var20;
                    if (var18) {
                        var20 = new class149(arg1.method981(false));
                    } else {
                        var20 = new class304(arg1.method950(186));
                    }
                    this.field1145.method2317(-1, (long) var19, var20);
                }
            }
        }
        field1142++;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 283)
    public static void method529(int arg0) {
        if (arg0 != -3) {
            method530(30, 38);
        }
        field1138 = null;
        field1151 = null;
        field1161 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V", line = 303)
    public static final void method530(int arg0, int arg1) {
        field1135++;
        class338 var2 = class380.method2294((byte) 121, arg0, 3);
        if (arg1 > 3) {
            var2.method2048(-2);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZLae;)V", line = 336)
    public final void method531(boolean arg0, class156 arg1) {
        while (true) {
            int var3 = arg1.method941((byte) 125);
            if (var3 == 0) {
                field1141++;
                if (!arg0) {
                    this.method531(true, null);
                    return;
                }
                return;
            }
            this.method528(var3, arg1, 113);
        }
    }
}
