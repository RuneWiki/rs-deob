import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class108 extends class202 {

    @OriginalMember(owner = "client!ev", name = "I", descriptor = "I")
    private int field1545 = 1;

    @OriginalMember(owner = "client!ev", name = "O", descriptor = "I")
    private int field1551 = 1;

    @OriginalMember(owner = "client!ev", name = "J", descriptor = "[C")
    public static char[] field1546 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ev", name = "N", descriptor = "F")
    public static float field1550;

    @OriginalMember(owner = "client!ev", name = "P", descriptor = "Z")
    public static boolean field1552;

    @OriginalMember(owner = "client!ev", name = "Q", descriptor = "Lbi;")
    public static class104 field1553;

    @OriginalMember(owner = "client!ev", name = "K", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!ev", name = "L", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!ev", name = "M", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        int var4 = -9 % ((-46 - arg1) / 50);
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field3071 = arg0.method1445(93) == 1;
                }
            } else {
                this.field1551 = arg0.method1445(56);
            }
        } else {
            this.field1545 = arg0.method1445(118);
        }
        ++field1548;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(II)[[I")
    public final int[][] method44(int arg0, int arg1) {
        if (arg0 != -1) {
            method714(54);
        }
        ++field1549;
        int[][] var3 = super.field3081.method1050(arg1, 114);
        if (super.field3081.field2432) {
            int var4 = this.field1551 + 1 + this.field1551;
            int var5 = 65536 / var4;
            int var6 = this.field1545 - -1 + this.field1545;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field1551 + arg1; var9 <= this.field1551 + arg1; ++var9) {
                int[][] var19 = this.method1382(0, class335.field5237 & var9, -89);
                int[][] var20 = new int[3][class276.field4375];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field1545; var27 <= this.field1545; ++var27) {
                    int var37 = var27 & class538.field7882;
                    var22 += var25[var37];
                    var21 += var24[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class276.field4375 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = var31 - this.field1545 & class538.field7882;
                    int var33 = var22 - var25[var32];
                    int var34 = var21 - var24[var32];
                    int var35 = var23 - var26[var32];
                    ++var31;
                    int var36 = this.field1545 + var31 & class538.field7882;
                    var23 = var26[var36] + var35;
                    var21 = var24[var36] + var34;
                    var22 = var25[var36] + var33;
                }
                var8[this.field1551 + var9 + -arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~var13 > ~class276.field4375; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        if (!arg1) {
            method714(12);
        }
        ++field1547;
        int[] var3 = super.field3064.method2452((byte) 94, arg0);
        if (super.field3064.field5837) {
            int var4 = this.field1551 + this.field1551 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field1545 + this.field1545 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field1551 + arg0; var9 <= this.field1551 + arg0; ++var9) {
                int[] var13 = this.method1376(1046794076, 0, var9 & class335.field5237);
                int[] var14 = new int[class276.field4375];
                int var15 = 0;
                for (int var16 = -this.field1545; ~var16 >= ~this.field1545; ++var16) {
                    var15 += var13[class538.field7882 & var16];
                }
                int var17 = 0;
                while (~var17 > ~class276.field4375) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class538.field7882 & var17 - this.field1545];
                    ++var17;
                    var15 = var13[class538.field7882 & this.field1545 + var17] + var18;
                }
                var8[var9 - -this.field1551 - arg0] = var14;
            }
            for (int var10 = 0; var10 < class276.field4375; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "(I)V")
    public static void method714(int arg0) {
        if (arg0 != 0) {
            field1552 = false;
        }
        field1553 = null;
        field1546 = null;
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "()V")
    public class108() {
        super(1, false);
    }

    static {
        new class213("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field1550 = 0.25F;
        field1552 = false;
        field1553 = new class104(113, 0);
    }
}
