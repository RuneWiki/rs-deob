import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class569 {

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public int field8069 = -1;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "[I")
    public static int[] field8068 = new int[14];

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Lcl;")
    public static class242 field8067 = new class242(0, 0);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field8065;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field8071;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field8072;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field8082;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public static int field8083;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "Ltq;")
    private class572 field8087;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Ljava/lang/String;")
    private String field8079;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "Ljava/lang/String;")
    private String field8084;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "[I")
    private int[] field8070;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "[I")
    private int[] field8073;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "[I")
    private int[] field8076;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "[I")
    private int[] field8077;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "[I")
    private int[] field8078;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "[I")
    private int[] field8085;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "[I")
    private int[] field8086;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "[I")
    private int[] field8088;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "[Ljava/lang/String;")
    private String[] field8066;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "[Ljava/lang/String;")
    private String[] field8074;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "[[I")
    private int[][] field8075;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "[[I")
    private int[][] field8080;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "[[I")
    private int[][] field8081;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILiaa;)V", line = 3)
    public final void method3216(int arg0, class452 arg1) {
        while (true) {
            int var3 = arg1.method2541(69);
            if (var3 == 0) {
                if (arg0 != -1) {
                    this.method3221(null, 93, 122);
                }
                field8065++;
                return;
            }
            this.method3221(arg1, var3, 19470);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)Z", line = 33)
    public static final boolean method3217(byte arg0, int arg1) {
        field8082++;
        if (arg0 >= -10) {
            method3217((byte) 122, 57);
        }
        return arg1 == 4 || arg1 == 8 || arg1 == 11;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BII)I", line = 74)
    public static final int method3218(byte arg0, int arg1, int arg2) {
        field8071++;
        if (arg0 < 70) {
            return 14;
        } else {
            int var3 = arg2 * 57 + arg1;
            int var4 = var3 ^ var3 << 13;
            int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return var5 >> 19 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 95)
    public final void method3219(int arg0) {
        if (arg0 != 3) {
            this.method3219(-79);
        }
        field8072++;
        if (this.field8079 == null) {
            this.field8079 = this.field8084;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V", line = 113)
    public static void method3220(boolean arg0) {
        field8068 = null;
        field8067 = null;
        if (arg0) {
            method3218((byte) 78, 13, -94);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Liaa;II)V", line = 125)
    private final void method3221(class452 arg0, int arg1, int arg2) {
        field8083++;
        if (arg2 != 19470) {
            this.field8087 = null;
        }
        if (arg1 == 1) {
            this.field8084 = arg0.method2520(4);
        } else if (arg1 == 2) {
            this.field8079 = arg0.method2520(arg2 ^ 0x4C0A);
        } else if (arg1 == 3) {
            int var4 = arg0.method2541(77);
            this.field8081 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8081[var5][0] = arg0.method2574(-1758460248);
                this.field8081[var5][1] = arg0.method2575((byte) -48);
                this.field8081[var5][2] = arg0.method2575((byte) -48);
            }
        } else if (arg1 == 4) {
            int var22 = arg0.method2541(87);
            this.field8075 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field8075[var23][0] = arg0.method2574(arg2 - 1758479718);
                this.field8075[var23][1] = arg0.method2575((byte) -48);
                this.field8075[var23][2] = arg0.method2575((byte) -48);
            }
        } else if (arg1 == 5) {
            arg0.method2574(-1758460248);
        } else if (arg1 == 6) {
            arg0.method2541(120);
        } else if (arg1 == 7) {
            arg0.method2541(69);
            return;
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method2541(95);
                return;
            }
            if (arg1 == 10) {
                int var6 = arg0.method2541(119);
                this.field8078 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field8078[var7] = arg0.method2575((byte) -48);
                }
                return;
            }
            if (arg1 == 12) {
                arg0.method2575((byte) -48);
                return;
            }
            if (arg1 == 13) {
                int var8 = arg0.method2541(93);
                this.field8077 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field8077[var9] = arg0.method2574(-1758460248);
                }
                return;
            }
            if (arg1 == 14) {
                int var10 = arg0.method2541(arg2 - 19395);
                this.field8080 = new int[var10][2];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field8080[var11][0] = arg0.method2541(57);
                    this.field8080[var11][1] = arg0.method2541(arg2 - 19420);
                }
                return;
            }
            if (arg1 == 15) {
                arg0.method2574(-1758460248);
                return;
            }
            if (arg1 == 17) {
                this.field8069 = arg0.method2574(-1758460248);
                return;
            }
            if (arg1 == 18) {
                int var12 = arg0.method2541(84);
                this.field8088 = new int[var12];
                this.field8066 = new String[var12];
                this.field8070 = new int[var12];
                this.field8085 = new int[var12];
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field8088[var13] = arg0.method2575((byte) -48);
                    this.field8085[var13] = arg0.method2575((byte) -48);
                    this.field8070[var13] = arg0.method2575((byte) -48);
                    this.field8066[var13] = arg0.method2516(115);
                }
                return;
            }
            if (arg1 == 19) {
                int var20 = arg0.method2541(arg2 - 19438);
                this.field8076 = new int[var20];
                this.field8086 = new int[var20];
                this.field8073 = new int[var20];
                this.field8074 = new String[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field8076[var21] = arg0.method2575((byte) -48);
                    this.field8073[var21] = arg0.method2575((byte) -48);
                    this.field8086[var21] = arg0.method2575((byte) -48);
                    this.field8074[var21] = arg0.method2516(103);
                }
            } else if (arg1 == 249) {
                int var14 = arg0.method2541(104);
                if (this.field8087 == null) {
                    int var15 = class146.method799(var14, -119);
                    this.field8087 = new class572(var15);
                }
                for (int var16 = 0; var16 < var14; var16++) {
                    boolean var17 = arg0.method2541(126) == 1;
                    int var18 = arg0.method2524(3);
                    class270 var19;
                    if (var17) {
                        var19 = new class210(arg0.method2516(arg2 - 19390));
                    } else {
                        var19 = new class337(arg0.method2575((byte) -48));
                    }
                    this.field8087.method3235((long) var18, -1, var19);
                }
                return;
            }
            return;
        }
    }
}
