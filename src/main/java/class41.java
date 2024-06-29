import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class41 {

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public int field569 = -1;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Ljava/lang/String;")
    public static String field561 = null;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Lbj;")
    private class159 field559;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Ljava/lang/String;")
    private String field565;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "Ljava/lang/String;")
    private String field572;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "[I")
    private int[] field556;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "[I")
    private int[] field560;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "[I")
    private int[] field563;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "[I")
    private int[] field566;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "[I")
    private int[] field570;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "[I")
    private int[] field574;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "[I")
    private int[] field575;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "[I")
    private int[] field577;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "[Ljava/lang/String;")
    private String[] field568;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "[Ljava/lang/String;")
    private String[] field573;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "[[I")
    private int[][] field555;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "[[I")
    private int[][] field557;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "[[I")
    private int[][] field562;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static void method257(byte arg0) {
        field561 = null;
        if (arg0 != -122) {
            method259(31, 111L);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public final void method258(int arg0) {
        if (this.field565 == null) {
            this.field565 = this.field572;
        }
        field576++;
        if (arg0 != 7) {
            method257((byte) -77);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IJ)V")
    public static final void method259(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field567++;
        if (arg0 != 32580) {
            method259(-123, 26L);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLlh;)V")
    public final void method260(boolean arg0, class365 arg1) {
        while (true) {
            int var3 = arg1.method2099(255);
            if (var3 == 0) {
                if (arg0) {
                    return;
                }
                field558++;
                return;
            }
            this.method261(arg1, 1, var3);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Llh;II)V")
    private final void method261(class365 arg0, int arg1, int arg2) {
        field571++;
        if (arg2 == 1) {
            this.field572 = arg0.method2078((byte) 101);
        } else if (arg2 == 2) {
            this.field565 = arg0.method2078((byte) 26);
        } else if (arg2 == 3) {
            int var22 = arg0.method2099(255);
            this.field555 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field555[var23][0] = arg0.method2062((byte) 14);
                this.field555[var23][1] = arg0.method2056((byte) -62);
                this.field555[var23][2] = arg0.method2056((byte) -27);
            }
        } else if (arg2 == 4) {
            int var20 = arg0.method2099(255);
            this.field562 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field562[var21][0] = arg0.method2062((byte) 14);
                this.field562[var21][1] = arg0.method2056((byte) -6);
                this.field562[var21][2] = arg0.method2056((byte) 81);
            }
        } else if (arg2 == 5) {
            arg0.method2062((byte) 14);
        } else if (arg2 == 6) {
            arg0.method2099(arg1 + 254);
        } else if (arg2 == 7) {
            arg0.method2099(255);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg0.method2099(255);
            } else if (arg2 == 10) {
                int var18 = arg0.method2099(255);
                this.field574 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field574[var19] = arg0.method2056((byte) -25);
                }
            } else if (arg2 == 12) {
                arg0.method2056((byte) 127);
            } else if (arg2 == 13) {
                int var4 = arg0.method2099(255);
                this.field560 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field560[var5] = arg0.method2062((byte) 14);
                }
            } else if (arg2 == 14) {
                int var16 = arg0.method2099(arg1 ^ 0xFE);
                this.field557 = new int[var16][2];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field557[var17][0] = arg0.method2099(255);
                    this.field557[var17][1] = arg0.method2099(255);
                }
            } else if (arg2 == 15) {
                arg0.method2062((byte) 14);
            } else if (arg2 == 17) {
                this.field569 = arg0.method2062((byte) 14);
            } else if (arg2 == 18) {
                int var6 = arg0.method2099(255);
                this.field568 = new String[var6];
                this.field556 = new int[var6];
                this.field566 = new int[var6];
                this.field570 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field570[var7] = arg0.method2056((byte) 93);
                    this.field556[var7] = arg0.method2056((byte) 121);
                    this.field566[var7] = arg0.method2056((byte) 111);
                    this.field568[var7] = arg0.method2106(-1);
                }
            } else if (arg2 == 19) {
                int var8 = arg0.method2099(255);
                this.field563 = new int[var8];
                this.field575 = new int[var8];
                this.field573 = new String[var8];
                this.field577 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field575[var9] = arg0.method2056((byte) 126);
                    this.field577[var9] = arg0.method2056((byte) -105);
                    this.field563[var9] = arg0.method2056((byte) -69);
                    this.field573[var9] = arg0.method2106(arg1 - 2);
                }
            } else if (arg2 == 249) {
                int var10 = arg0.method2099(255);
                if (this.field559 == null) {
                    int var11 = class420.method2513(var10, 0);
                    this.field559 = new class159(var11);
                }
                for (int var12 = 0; var12 < var10; var12++) {
                    boolean var13 = arg0.method2099(255) == 1;
                    int var14 = arg0.method2111(arg1 - 3);
                    class499 var15;
                    if (var13) {
                        var15 = new class48(arg0.method2106(-1));
                    } else {
                        var15 = new class330(arg0.method2056((byte) 80));
                    }
                    this.field559.method990((long) var14, (byte) 64, var15);
                }
            }
        }
        if (arg1 != 1) {
            this.field557 = null;
        }
    }
}
