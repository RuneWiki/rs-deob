import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class490 {

    @OriginalMember(owner = "client!iba", name = "z", descriptor = "I")
    public int field7185 = -1;

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "[B")
    public static byte[] field7163 = new byte[2048];

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "Lqe;")
    public static class433 field7162 = new class433();

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!iba", name = "i", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!iba", name = "j", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!iba", name = "m", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!iba", name = "q", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!iba", name = "v", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!iba", name = "x", descriptor = "I")
    public static int field7183;

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "Lsba;")
    private class200 field7165;

    @OriginalMember(owner = "client!iba", name = "h", descriptor = "Ljava/lang/String;")
    private String field7167;

    @OriginalMember(owner = "client!iba", name = "p", descriptor = "Ljava/lang/String;")
    private String field7175;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "[I")
    private int[] field7160;

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "[I")
    private int[] field7164;

    @OriginalMember(owner = "client!iba", name = "g", descriptor = "[I")
    private int[] field7166;

    @OriginalMember(owner = "client!iba", name = "k", descriptor = "[I")
    private int[] field7170;

    @OriginalMember(owner = "client!iba", name = "n", descriptor = "[I")
    private int[] field7173;

    @OriginalMember(owner = "client!iba", name = "o", descriptor = "[I")
    private int[] field7174;

    @OriginalMember(owner = "client!iba", name = "r", descriptor = "[I")
    private int[] field7177;

    @OriginalMember(owner = "client!iba", name = "t", descriptor = "[I")
    private int[] field7179;

    @OriginalMember(owner = "client!iba", name = "s", descriptor = "[Ljava/lang/String;")
    private String[] field7178;

    @OriginalMember(owner = "client!iba", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field7184;

    @OriginalMember(owner = "client!iba", name = "l", descriptor = "[[I")
    private int[][] field7171;

    @OriginalMember(owner = "client!iba", name = "u", descriptor = "[[I")
    private int[][] field7180;

    @OriginalMember(owner = "client!iba", name = "w", descriptor = "[[I")
    private int[][] field7182;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILie;)V", line = 34)
    public final void method2996(int arg0, class6 arg1) {
        field7172++;
        if (arg0 != 5) {
            method2998(21);
        }
        while (true) {
            int var3 = arg1.method70(-9059);
            if (var3 == 0) {
                return;
            }
            this.method2997(var3, arg1, arg0 - 32173);
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILie;I)V", line = 55)
    private final void method2997(int arg0, class6 arg1, int arg2) {
        field7169++;
        if (arg2 != -32168) {
            this.field7170 = null;
        }
        if (arg0 == 1) {
            this.field7167 = arg1.method53((byte) 40);
        } else if (arg0 == 2) {
            this.field7175 = arg1.method53((byte) 40);
        } else if (arg0 == 3) {
            int var4 = arg1.method70(-9059);
            this.field7180 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7180[var5][0] = arg1.method67(arg2 + 44189);
                this.field7180[var5][1] = arg1.method72(arg2 + 32055);
                this.field7180[var5][2] = arg1.method72(arg2 + 32094);
            }
        } else if (arg0 == 4) {
            int var6 = arg1.method70(-9059);
            this.field7171 = new int[var6][3];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field7171[var7][0] = arg1.method67(12021);
                this.field7171[var7][1] = arg1.method72(arg2 + 32109);
                this.field7171[var7][2] = arg1.method72(class357.method2397(arg2, 32141));
            }
        } else if (arg0 == 5) {
            arg1.method67(arg2 + 44189);
        } else if (arg0 == 6) {
            arg1.method70(-9059);
        } else if (arg0 == 7) {
            arg1.method70(-9059);
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg1.method70(-9059);
            } else if (arg0 == 10) {
                int var8 = arg1.method70(arg2 + 23109);
                this.field7164 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field7164[var9] = arg1.method72(-85);
                }
            } else if (arg0 == 12) {
                arg1.method72(-29);
            } else if (arg0 == 13) {
                int var10 = arg1.method70(-9059);
                this.field7179 = new int[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field7179[var11] = arg1.method67(12021);
                }
            } else if (arg0 == 14) {
                int var12 = arg1.method70(-9059);
                this.field7182 = new int[var12][2];
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field7182[var13][0] = arg1.method70(arg2 + 23109);
                    this.field7182[var13][1] = arg1.method70(-9059);
                }
            } else if (arg0 == 15) {
                arg1.method67(12021);
            } else if (arg0 == 17) {
                this.field7185 = arg1.method67(12021);
            } else if (arg0 == 18) {
                int var14 = arg1.method70(-9059);
                this.field7170 = new int[var14];
                this.field7166 = new int[var14];
                this.field7173 = new int[var14];
                this.field7184 = new String[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field7166[var15] = arg1.method72(-89);
                    this.field7173[var15] = arg1.method72(-88);
                    this.field7170[var15] = arg1.method72(-76);
                    this.field7184[var15] = arg1.method42((byte) -23);
                }
                return;
            } else if (arg0 == 19) {
                int var16 = arg1.method70(-9059);
                this.field7160 = new int[var16];
                this.field7177 = new int[var16];
                this.field7178 = new String[var16];
                this.field7174 = new int[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field7174[var17] = arg1.method72(-58);
                    this.field7160[var17] = arg1.method72(class357.method2397(arg2, 32187));
                    this.field7177[var17] = arg1.method72(-78);
                    this.field7178[var17] = arg1.method42((byte) -87);
                }
                return;
            } else if (arg0 == 249) {
                int var18 = arg1.method70(-9059);
                if (this.field7165 == null) {
                    int var19 = class413.method2636(var18, 127);
                    this.field7165 = new class200(var19);
                }
                for (int var20 = 0; var20 < var18; var20++) {
                    boolean var21 = arg1.method70(-9059) == 1;
                    int var22 = arg1.method86(-25);
                    class66 var23;
                    if (var21) {
                        var23 = new class420(arg1.method42((byte) -124));
                    } else {
                        var23 = new class160(arg1.method72(-39));
                    }
                    this.field7165.method1564((long) var22, var23, (byte) 113);
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V", line = 292)
    public static void method2998(int arg0) {
        if (arg0 != 3) {
            field7163 = null;
        }
        field7163 = null;
        field7162 = null;
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)V", line = 303)
    public final void method2999(int arg0) {
        field7161++;
        int var2 = -61 % ((arg0 + 21) / 44);
        if (this.field7175 == null) {
            this.field7175 = this.field7167;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IZIZI)I", line = 318)
    public static final int method3000(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        if (arg2 != -4016) {
            field7163 = null;
        }
        field7181++;
        class527 var5 = class605.method3523(arg3, (byte) 119, arg4);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field7693.length; var7++) {
            if (var5.field7693[var7] >= 0 && class91.field1083.field6809 > var5.field7693[var7]) {
                class117 var8 = class91.field1083.method2859(var5.field7693[var7], (byte) 123);
                int var9 = var8.method1054(class610.field8680.method3566(arg0, -14724).field8960, -2, arg0);
                if (arg1) {
                    var6 += var5.field7697[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)V", line = 370)
    public static final void method3001(byte arg0) {
        field7176++;
        if (!class145.field2450) {
            return;
        }
        class665 var1 = class626.method3656(28613, class198.field3243, class517.field7498);
        if (arg0 <= 34) {
            method3001((byte) -69);
        }
        if (var1 != null && var1.field9276 != null) {
            class438 var2 = new class438();
            var2.field6677 = var1;
            var2.field6684 = var1.field9276;
            class142.method1201(var2);
        }
        class219.field3577 = -1;
        class145.field2450 = false;
        class250.field4003 = -1;
        if (var1 != null) {
            class362.method2415(-120, var1);
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 405)
    public static final void method3002(boolean arg0, String arg1, int arg2) {
        field7183++;
        class499.method3045(-10256);
        class268.method1900(-29705);
        if (arg0) {
            return;
        }
        class92.method884((byte) 94);
        class224.method1649(arg2, arg1, -108);
        class396.method2555(127);
        class81.method768((byte) 122, class627.field8857);
        class491.method3003(class627.field8857, -11799);
        class160.method1318(class158.field2699, class627.field8857, (byte) -66);
        class487.method2984((byte) 17);
        class395.method2554(class220.field3579, 10);
        class211.method1601(-20030);
        class49.method574(102);
        if (class682.field9564 == 3) {
            class68.method715(4, (byte) -108);
        } else if (class682.field9564 == 7) {
            class68.method715(8, (byte) -85);
        } else if (class682.field9564 == 10) {
            class68.method715(11, (byte) -78);
        } else if (class682.field9564 == 1 || class682.field9564 == 2) {
            class131.method1138(13);
        }
    }
}
