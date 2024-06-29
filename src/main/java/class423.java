import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class423 {

    @OriginalMember(owner = "client!ks", name = "v", descriptor = "I")
    public int field6047 = -1;

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "[S")
    private static short[] field6035 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "[S")
    private static short[] field6029 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "[S")
    private static short[] field6038 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "[[S")
    public static short[][] field6026 = new short[][] { field6038, field6029, field6035 };

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "Llq;")
    public static class292 field6039;

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "Lmo;")
    private class482 field6043;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "Ljava/lang/String;")
    private String field6028;

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "Ljava/lang/String;")
    private String field6036;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "[I")
    private int[] field6030;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "[I")
    private int[] field6032;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "[I")
    private int[] field6033;

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "[I")
    private int[] field6037;

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "[I")
    private int[] field6040;

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "[I")
    private int[] field6042;

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "[I")
    private int[] field6044;

    @OriginalMember(owner = "client!ks", name = "w", descriptor = "[I")
    private int[] field6048;

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "[Ljava/lang/String;")
    private String[] field6041;

    @OriginalMember(owner = "client!ks", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field6049;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "[[I")
    private int[][] field6027;

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "[[I")
    private int[][] field6050;

    @OriginalMember(owner = "client!ks", name = "A", descriptor = "[[I")
    private int[][] field6052;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V", line = 9)
    public static void method2493(byte arg0) {
        field6035 = null;
        if (arg0 != 101) {
            field6026 = null;
        }
        field6039 = null;
        field6029 = null;
        field6038 = null;
        field6026 = null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V", line = 49)
    public final void method2494(int arg0) {
        field6031++;
        if (arg0 != 3) {
            this.method2497(-57, null, (byte) -126);
        }
        if (this.field6036 == null) {
            this.field6036 = this.field6028;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILek;)V", line = 69)
    public final void method2495(int arg0, class465 arg1) {
        field6046++;
        if (arg0 != 23324) {
            this.method2495(-2, null);
        }
        while (true) {
            int var3 = arg1.method2705(arg0 - 23370);
            if (var3 == 0) {
                return;
            }
            this.method2497(var3, arg1, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)I", line = 123)
    public static final int method2496(int arg0) {
        field6034++;
        if (arg0 != -4) {
            return -89;
        } else if ((double) class161.field2614 == 3.0D) {
            return 37;
        } else if ((double) class161.field2614 == 4.0D) {
            return 50;
        } else if ((double) class161.field2614 == 6.0D) {
            return 75;
        } else if ((double) class161.field2614 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILek;B)V", line = 146)
    private final void method2497(int arg0, class465 arg1, byte arg2) {
        if (arg2 <= 81) {
            this.method2497(-76, null, (byte) -109);
        }
        field6045++;
        if (arg0 == 1) {
            this.field6028 = arg1.method2707(3);
        } else if (arg0 == 2) {
            this.field6036 = arg1.method2707(3);
        } else if (arg0 == 3) {
            int var22 = arg1.method2705(-91);
            this.field6050 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field6050[var23][0] = arg1.method2755((byte) -45);
                this.field6050[var23][1] = arg1.method2691((byte) -67);
                this.field6050[var23][2] = arg1.method2691((byte) -67);
            }
        } else if (arg0 == 4) {
            int var4 = arg1.method2705(-97);
            this.field6027 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6027[var5][0] = arg1.method2755((byte) -83);
                this.field6027[var5][1] = arg1.method2691((byte) -67);
                this.field6027[var5][2] = arg1.method2691((byte) -67);
            }
        } else if (arg0 == 5) {
            arg1.method2755((byte) -60);
        } else if (arg0 == 6) {
            arg1.method2705(-73);
        } else if (arg0 == 7) {
            arg1.method2705(-40);
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg1.method2705(-89);
                return;
            }
            if (arg0 != 10) {
                if (arg0 == 12) {
                    arg1.method2691((byte) -67);
                    return;
                }
                if (arg0 == 13) {
                    int var6 = arg1.method2705(-94);
                    this.field6042 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field6042[var7] = arg1.method2755((byte) -70);
                    }
                    return;
                }
                if (arg0 != 14) {
                    if (arg0 == 15) {
                        arg1.method2755((byte) -45);
                        return;
                    }
                    if (arg0 == 17) {
                        this.field6047 = arg1.method2755((byte) -91);
                        return;
                    }
                    if (arg0 == 18) {
                        int var8 = arg1.method2705(-88);
                        this.field6044 = new int[var8];
                        this.field6049 = new String[var8];
                        this.field6037 = new int[var8];
                        this.field6032 = new int[var8];
                        for (int var9 = 0; var9 < var8; var9++) {
                            this.field6032[var9] = arg1.method2691((byte) -67);
                            this.field6044[var9] = arg1.method2691((byte) -67);
                            this.field6037[var9] = arg1.method2691((byte) -67);
                            this.field6049[var9] = arg1.method2717(true);
                        }
                        return;
                    }
                    if (arg0 == 19) {
                        int var16 = arg1.method2705(-35);
                        this.field6041 = new String[var16];
                        this.field6048 = new int[var16];
                        this.field6030 = new int[var16];
                        this.field6040 = new int[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field6040[var17] = arg1.method2691((byte) -67);
                            this.field6030[var17] = arg1.method2691((byte) -67);
                            this.field6048[var17] = arg1.method2691((byte) -67);
                            this.field6041[var17] = arg1.method2717(true);
                        }
                    } else if (arg0 == 249) {
                        int var10 = arg1.method2705(-50);
                        if (this.field6043 == null) {
                            int var11 = class99.method830(var10, false);
                            this.field6043 = new class482(var11);
                        }
                        for (int var12 = 0; var12 < var10; var12++) {
                            boolean var13 = arg1.method2705(-34) == 1;
                            int var14 = arg1.method2714(true);
                            class435 var15;
                            if (var13) {
                                var15 = new class527(arg1.method2717(true));
                            } else {
                                var15 = new class83(arg1.method2691((byte) -67));
                            }
                            this.field6043.method2816(var15, (long) var14, false);
                        }
                        return;
                    }
                    return;
                }
                int var18 = arg1.method2705(-19);
                this.field6052 = new int[var18][2];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field6052[var19][0] = arg1.method2705(-29);
                    this.field6052[var19][1] = arg1.method2705(-48);
                }
                return;
            }
            int var20 = arg1.method2705(-56);
            this.field6033 = new int[var20];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field6033[var21] = arg1.method2691((byte) -67);
            }
            return;
        }
    }
}
