import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class349 {

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public int field4725 = -1;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "[[I")
    public static int[][] field4726 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Lwa;")
    private class661 field4708;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "Ljava/lang/String;")
    private String field4717;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Ljava/lang/String;")
    private String field4719;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "[I")
    private int[] field4709;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "[I")
    private int[] field4712;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "[I")
    private int[] field4714;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "[I")
    private int[] field4715;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "[I")
    private int[] field4720;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "[I")
    private int[] field4721;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "[I")
    private int[] field4722;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "[I")
    public static int[] field4728;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "[I")
    private int[] field4730;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "[Ljava/lang/String;")
    private String[] field4710;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "[Ljava/lang/String;")
    private String[] field4718;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "[[I")
    private int[][] field4713;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "[[I")
    private int[][] field4716;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "[[I")
    private int[][] field4724;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 26)
    public static void method2070(int arg0) {
        if (arg0 != 4) {
            method2070(-1);
        }
        field4728 = null;
        field4726 = null;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V", line = 39)
    public final void method2071(int arg0) {
        if (this.field4717 == null) {
            this.field4717 = this.field4719;
        }
        field4707++;
        if (arg0 != 17790) {
            this.method2073(null, 35, (byte) 44);
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V", line = 68)
    public static final void method2072(int arg0) {
        field4727++;
        if (class597.field8414 == -1 || class358.field4797 == -1) {
            return;
        }
        int var1 = ((class254.field3182 - class122.field1356) * class268.field3339 >> 16) + class122.field1356;
        class268.field3339 += var1;
        if (class268.field3339 >= 65535) {
            class268.field3339 = 65535;
            if (class700.field9812) {
                class209.field2465 = false;
            } else {
                class209.field2465 = true;
            }
            class700.field9812 = true;
        } else {
            class209.field2465 = false;
            class700.field9812 = false;
        }
        float var2 = (float) class268.field3339 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class147.field1629 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class394.field5342[class597.field8414][var4][var5] * 3;
            int var22 = class394.field5342[class597.field8414][var4 + 1][var5] * 3;
            int var23 = (class394.field5342[class597.field8414][var4 + 2][var5] + class394.field5342[class597.field8414][var4 + 2][var5] - class394.field5342[class597.field8414][var4 + 3][var5]) * 3;
            int var24 = class394.field5342[class597.field8414][var4][var5];
            int var25 = var22 - var21;
            int var26 = var23 + var21 - (var22 * 2);
            int var27 = class394.field5342[class597.field8414][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class516.field7360 = (int) var3[0] - (class26.field245 * 512);
        class689.field9698 = (int) var3[2] - (class231.field2860 * 512);
        class44.field432 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class487.field7048 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class394.field5342[class358.field4797][var7][var8] * 3;
            int var15 = class394.field5342[class358.field4797][var7 + 1][var8] * 3;
            int var16 = (class394.field5342[class358.field4797][var7 + 2][var8] - (class394.field5342[class358.field4797][var7 + 3][var8] - class394.field5342[class358.field4797][var7 + 2][var8])) * 3;
            int var17 = class394.field5342[class358.field4797][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class394.field5342[class358.field4797][var7 + 2][var8] + var15 - var16 - var17;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        if (arg0 != -9319) {
            field4726 = null;
        }
        class485.field6986 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class505.field7273 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class605.field8502 = ((class394.field5342[class597.field8414][var4 + 2][3] - class394.field5342[class597.field8414][var4][3]) * class268.field3339 >> 16) + class394.field5342[class597.field8414][var4][3];
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lnp;IB)V", line = 178)
    private final void method2073(class115 arg0, int arg1, byte arg2) {
        int var4 = 65 / ((arg2 + 33) / 33);
        if (arg1 == 1) {
            this.field4719 = arg0.method655(552922456);
        } else if (arg1 == 2) {
            this.field4717 = arg0.method655(552922456);
        } else if (arg1 == 3) {
            int var23 = arg0.method620((byte) -5);
            this.field4716 = new int[var23][3];
            for (int var24 = 0; var24 < var23; var24++) {
                this.field4716[var24][0] = arg0.method643((byte) -77);
                this.field4716[var24][1] = arg0.method631(false);
                this.field4716[var24][2] = arg0.method631(false);
            }
        } else if (arg1 == 4) {
            int var5 = arg0.method620((byte) 104);
            this.field4724 = new int[var5][3];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field4724[var6][0] = arg0.method643((byte) -77);
                this.field4724[var6][1] = arg0.method631(false);
                this.field4724[var6][2] = arg0.method631(false);
            }
        } else if (arg1 == 5) {
            arg0.method643((byte) -77);
        } else if (arg1 == 6) {
            arg0.method620((byte) -126);
        } else if (arg1 == 7) {
            arg0.method620((byte) -128);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method620((byte) -128);
            } else if (arg1 == 10) {
                int var7 = arg0.method620((byte) 88);
                this.field4721 = new int[var7];
                for (int var8 = 0; var8 < var7; var8++) {
                    this.field4721[var8] = arg0.method631(false);
                }
            } else if (arg1 == 12) {
                arg0.method631(false);
            } else if (arg1 == 13) {
                int var21 = arg0.method620((byte) 62);
                this.field4715 = new int[var21];
                for (int var22 = 0; var22 < var21; var22++) {
                    this.field4715[var22] = arg0.method643((byte) -77);
                }
            } else if (arg1 == 14) {
                int var9 = arg0.method620((byte) -29);
                this.field4713 = new int[var9][2];
                for (int var10 = 0; var10 < var9; var10++) {
                    this.field4713[var10][0] = arg0.method620((byte) -127);
                    this.field4713[var10][1] = arg0.method620((byte) -127);
                }
            } else if (arg1 == 15) {
                arg0.method643((byte) -77);
            } else if (arg1 == 17) {
                this.field4725 = arg0.method643((byte) -77);
            } else if (arg1 == 18) {
                int var19 = arg0.method620((byte) -30);
                this.field4718 = new String[var19];
                this.field4712 = new int[var19];
                this.field4709 = new int[var19];
                this.field4714 = new int[var19];
                for (int var20 = 0; var20 < var19; var20++) {
                    this.field4709[var20] = arg0.method631(false);
                    this.field4714[var20] = arg0.method631(false);
                    this.field4712[var20] = arg0.method631(false);
                    this.field4718[var20] = arg0.method626(73);
                }
            } else if (arg1 == 19) {
                int var11 = arg0.method620((byte) 15);
                this.field4710 = new String[var11];
                this.field4720 = new int[var11];
                this.field4730 = new int[var11];
                this.field4722 = new int[var11];
                for (int var12 = 0; var12 < var11; var12++) {
                    this.field4720[var12] = arg0.method631(false);
                    this.field4730[var12] = arg0.method631(false);
                    this.field4722[var12] = arg0.method631(false);
                    this.field4710[var12] = arg0.method626(127);
                }
            } else if (arg1 == 249) {
                int var13 = arg0.method620((byte) -126);
                if (this.field4708 == null) {
                    int var14 = class553.method3138(1781323777, var13);
                    this.field4708 = new class661(var14);
                }
                for (int var15 = 0; var15 < var13; var15++) {
                    boolean var16 = arg0.method620((byte) 111) == 1;
                    int var17 = arg0.method675(-126);
                    class333 var18;
                    if (var16) {
                        var18 = new class302(arg0.method626(76));
                    } else {
                        var18 = new class22(arg0.method631(false));
                    }
                    this.field4708.method3671(false, var18, (long) var17);
                }
            }
        }
        field4729++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lnp;B)V", line = 415)
    public final void method2074(class115 arg0, byte arg1) {
        field4723++;
        int var3 = 120 % ((arg1 + 62) / 44);
        while (true) {
            int var4 = arg0.method620((byte) -126);
            if (var4 == 0) {
                return;
            }
            this.method2073(arg0, var4, (byte) -94);
        }
    }
}
