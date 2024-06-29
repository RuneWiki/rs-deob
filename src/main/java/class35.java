import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class35 extends class303 {

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
    private int field582 = 0;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "[S")
    private short[] field586 = new short[257];

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "[I")
    private int[] field584;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "[I")
    private int[] field590;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "[[I")
    private int[][] field587;

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V", line = 6)
    public class35() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(B)Z", line = 13)
    public static final boolean method250(byte arg0) {
        if (arg0 != 118) {
            return true;
        }
        field589++;
        try {
            return class197.method1434(false);
        } catch (IOException var5) {
            class323.method2211(arg0 ^ 0xFFFFFF89);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class51.field813 + "," + class243.field3760 + "," + class312.field4897 + " - " + class45.field779 + "," + (class19.field356.field1386[0] + class177.field2780) + "," + (class19.field356.field1388[0] + class91.field1485) + " - ";
            for (int var4 = 0; class45.field779 > var4 && var4 < 50; var4++) {
                var3 = var3 + class267.field4132.field1661[var4] + ",";
            }
            class134.method1009(arg0 ^ 0xFFFFFF88, var3, var6);
            class31.method218(119);
            return true;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)[I", line = 42)
    public final int[] method67(int arg0, int arg1) {
        field577++;
        if (arg0 != -3) {
            this.field582 = 89;
        }
        int[] var3 = this.field4763.method394(arg0 + 3, arg1);
        if (this.field4763.field863) {
            int[] var4 = this.method2107(arg1, 0, 0);
            for (int var5 = 0; var5 < class70.field1108; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field586[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)V", line = 84)
    private final void method251(int arg0) {
        field580++;
        int var2 = this.field582;
        if (var2 == 2) {
            for (int var20 = 0; var20 < 257; var20++) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field587.length - 1 && this.field587[var22][0] <= var21; var22++) {
                }
                int[] var23 = this.field587[var22 - 1];
                int[] var24 = this.field587[var22];
                int var25 = this.method254(var22 - 2, -8569)[1];
                int var26 = var23[1];
                int var28 = var24[1];
                int var29 = this.method254(var22 + 1, -8569)[1];
                int var30 = var28 - var25;
                int var31 = (var21 - var23[0] << 12) / (var24[0] - var23[0]);
                int var32 = var31 * var31 >> 12;
                int var33 = var30 * var31 >> 12;
                int var34 = var29 + var26 - var25 - var28;
                int var35 = var25 - var34 - var26;
                int var36 = var32 * var35 >> 12;
                int var37 = (var31 * var34 >> 12) * var32 >> 12;
                int var38 = var36 + var37 + var33 + var26;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field586[var20] = (short) var38;
            }
        } else if (var2 == 1) {
            for (int var3 = 0; var3 < 257; var3++) {
                int var4 = var3 << 4;
                int var5;
                for (var5 = 1; this.field587.length - 1 > var5 && this.field587[var5][0] <= var4; var5++) {
                }
                int[] var6 = this.field587[var5];
                int[] var7 = this.field587[var5 - 1];
                int var8 = (var4 - var7[0] << 12) / (var6[0] - var7[0]);
                int var9 = 4096 - class123.field1971[(var8 & 0x1FF8) >> 5] >> 1;
                int var10 = 4096 - var9;
                int var11 = var7[1] * var10 + (var6[1] * var9) >> 12;
                if (var11 <= -32768) {
                    var11 = -32767;
                }
                if (var11 >= 32768) {
                    var11 = 32767;
                }
                this.field586[var3] = (short) var11;
            }
        } else {
            for (int var12 = 0; var12 < 257; var12++) {
                int var13 = var12 << 4;
                int var14;
                for (var14 = 1; var14 < this.field587.length - 1 && var13 >= this.field587[var14][0]; var14++) {
                }
                int[] var15 = this.field587[var14];
                int[] var16 = this.field587[var14 - 1];
                int var17 = (var13 - var16[0] << 12) / (var15[0] - var16[0]);
                int var18 = 4096 - var17;
                int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                if (var19 <= -32768) {
                    var19 = -32767;
                }
                if (var19 >= 32768) {
                    var19 = 32767;
                }
                this.field586[var12] = (short) var19;
            }
        }
        if (arg0 != 30206) {
            this.field587 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILja;)Lgk;", line = 264)
    public static final class7 method252(int arg0, int arg1, int arg2, class64 arg3) {
        field583++;
        int var4 = -42 / ((67 - arg0) / 43);
        return class150.method1152(arg3, arg2, 50, arg1) ? class251.method1773(-1252899700) : null;
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(I)V", line = 279)
    public final void method70(int arg0) {
        if (this.field587 == null) {
            this.field587 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        field578++;
        if (this.field587.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (this.field582 == 2) {
            this.method253((byte) 56);
        }
        class226.method1635(4096);
        this.method251(30206);
        if (arg0 <= 13) {
            this.field590 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(B)V", line = 302)
    private final void method253(byte arg0) {
        field585++;
        int[] var2 = this.field587[0];
        int[] var3 = this.field587[1];
        int[] var4 = this.field587[this.field587.length - 2];
        int[] var5 = this.field587[this.field587.length - 1];
        this.field584 = new int[] { var4[0] + var4[0] - var5[0], -var5[1] - (-var4[1] - var4[1]) };
        this.field590 = new int[] { var2[0] + var2[0] - var3[0], var2[1] + -var3[1] + var2[1] };
        int var6 = 42 / ((arg0 + 22) / 60);
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(II)[I", line = 332)
    private final int[] method254(int arg0, int arg1) {
        field588++;
        if (arg0 < 0) {
            return this.field590;
        } else {
            if (arg1 != -8569) {
                this.field584 = (int[]) null;
            }
            return arg0 >= this.field587.length ? this.field584 : this.field587[arg0];
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILpe;I)V", line = 355)
    public final void method65(int arg0, class101 arg1, int arg2) {
        field579++;
        if (arg2 == 0) {
            this.field582 = arg1.method741(arg0 + 4012);
            this.field587 = new int[arg1.method741(90)][2];
            for (int var4 = 0; var4 < this.field587.length; var4++) {
                this.field587[var4][0] = arg1.method731(false);
                this.field587[var4][1] = arg1.method731(false);
            }
        }
        if (arg0 != -4004) {
            this.field584 = (int[]) null;
        }
    }
}
