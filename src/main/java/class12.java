import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class12 {

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public int field109 = -1;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "Llc;")
    public static class435 field128 = new class435(97, -2);

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "Llc;")
    public static class435 field134 = new class435(57, 4);

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "Lqp;")
    private class715 field120;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Ljava/lang/String;")
    private String field111;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "Ljava/lang/String;")
    private String field122;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "[I")
    private int[] field110;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "[I")
    private int[] field116;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "[I")
    private int[] field125;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "[I")
    private int[] field126;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "[I")
    private int[] field127;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "[I")
    private int[] field129;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "[I")
    private int[] field130;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "[I")
    private int[] field133;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "[Ljava/lang/String;")
    private String[] field118;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field132;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "[[I")
    private int[][] field112;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "[[I")
    private int[][] field119;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "[[I")
    private int[][] field121;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)Z", line = 7)
    public static final boolean method58(byte arg0) {
        field114++;
        if (arg0 != -3) {
            method60((byte) -92, -128);
        }
        return class456.field6499 > 0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lsl;I)V", line = 18)
    public final void method59(class479 arg0, int arg1) {
        if (arg1 < 92) {
            method65((byte) 95);
        }
        field113++;
        while (true) {
            int var3 = arg0.method2886(true);
            if (var3 == 0) {
                return;
            }
            this.method62(arg0, var3, -250);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)I", line = 40)
    public static final int method60(byte arg0, int arg1) {
        if (arg0 == 43) {
            field117++;
            return arg1 & 0xFF;
        } else {
            return -107;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 61)
    public static void method61(int arg0) {
        field128 = null;
        field134 = null;
        if (arg0 <= 43) {
            field128 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lsl;II)V", line = 95)
    private final void method62(class479 arg0, int arg1, int arg2) {
        if (arg2 != -250) {
            this.field119 = null;
        }
        if (arg1 == 1) {
            this.field111 = arg0.method2876(arg2 + 249);
        } else if (arg1 == 2) {
            this.field122 = arg0.method2876(-1);
        } else if (arg1 == 3) {
            int var4 = arg0.method2886(true);
            this.field121 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field121[var5][0] = arg0.method2882(-1);
                this.field121[var5][1] = arg0.method2868(-99);
                this.field121[var5][2] = arg0.method2868(-90);
            }
        } else if (arg1 == 4) {
            int var6 = arg0.method2886(true);
            this.field119 = new int[var6][3];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field119[var7][0] = arg0.method2882(arg2 + 249);
                this.field119[var7][1] = arg0.method2868(-95);
                this.field119[var7][2] = arg0.method2868(-57);
            }
        } else if (arg1 == 5) {
            arg0.method2882(-1);
        } else if (arg1 == 6) {
            arg0.method2886(true);
        } else if (arg1 == 7) {
            arg0.method2886(true);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method2886(true);
            } else if (arg1 == 10) {
                int var8 = arg0.method2886(true);
                this.field116 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field116[var9] = arg0.method2868(-125);
                }
            } else if (arg1 == 12) {
                arg0.method2868(-99);
            } else if (arg1 == 13) {
                int var22 = arg0.method2886(true);
                this.field110 = new int[var22];
                for (int var23 = 0; var23 < var22; var23++) {
                    this.field110[var23] = arg0.method2882(-1);
                }
            } else if (arg1 == 14) {
                int var20 = arg0.method2886(true);
                this.field112 = new int[var20][2];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field112[var21][0] = arg0.method2886(true);
                    this.field112[var21][1] = arg0.method2886(true);
                }
            } else if (arg1 == 15) {
                arg0.method2882(-1);
            } else if (arg1 == 17) {
                this.field109 = arg0.method2882(-1);
            } else if (arg1 == 18) {
                int var10 = arg0.method2886(true);
                this.field130 = new int[var10];
                this.field127 = new int[var10];
                this.field133 = new int[var10];
                this.field118 = new String[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field127[var11] = arg0.method2868(-42);
                    this.field133[var11] = arg0.method2868(class639.method3689(arg2, 131));
                    this.field130[var11] = arg0.method2868(-98);
                    this.field118[var11] = arg0.method2894(-13192);
                }
            } else if (arg1 == 19) {
                int var12 = arg0.method2886(true);
                this.field125 = new int[var12];
                this.field126 = new int[var12];
                this.field129 = new int[var12];
                this.field132 = new String[var12];
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field129[var13] = arg0.method2868(-43);
                    this.field126[var13] = arg0.method2868(-36);
                    this.field125[var13] = arg0.method2868(arg2 + 199);
                    this.field132[var13] = arg0.method2894(-13192);
                }
            } else if (arg1 == 249) {
                int var14 = arg0.method2886(true);
                if (this.field120 == null) {
                    int var15 = class68.method609(var14, (byte) -125);
                    this.field120 = new class715(var15);
                }
                for (int var16 = 0; var16 < var14; var16++) {
                    boolean var17 = arg0.method2886(true) == 1;
                    int var18 = arg0.method2865(255);
                    class430 var19;
                    if (var17) {
                        var19 = new class687(arg0.method2894(arg2 ^ 0x337E));
                    } else {
                        var19 = new class177(arg0.method2868(-46));
                    }
                    this.field120.method4022(var19, -91, (long) var18);
                }
            }
        }
        field123++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZLsl;)Lsg;", line = 326)
    public static final class17 method63(boolean arg0, class479 arg1) {
        field131++;
        if (!arg0) {
            field134 = null;
        }
        return new class17(arg1.method2870(-11395), arg1.method2870(-11395), arg1.method2870(-11395), arg1.method2870(-11395), arg1.method2870(-11395), arg1.method2870(-11395), arg1.method2870(-11395), arg1.method2870(-11395), arg1.method2865(255), arg1.method2886(arg0));
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V", line = 338)
    public final void method64(byte arg0) {
        field115++;
        if (this.field122 == null) {
            this.field122 = this.field111;
        }
        if (arg0 != -116) {
            this.method64((byte) -70);
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V", line = 364)
    public static final void method65(byte arg0) {
        class135.method960(0);
        if (arg0 != 125) {
            field128 = null;
        }
        field124++;
        class233.method1630((byte) 79, 22050, 2, class243.field3580.field7987.method1092(false) == 1);
        class375.field5435 = class405.method2460(0, class345.field4749, class95.field1383, (byte) 88, 22050);
        class726.method4056(true, class647.method3738(null, arg0 - 27621), 512);
        class224.field3310 = class405.method2460(1, class345.field4749, class95.field1383, (byte) 63, 2048);
        class224.field3310.method2231((byte) 88, class593.field8429);
    }
}
