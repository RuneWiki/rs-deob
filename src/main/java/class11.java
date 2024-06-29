import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class11 extends class285 {

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    private int field135 = 1;

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "I")
    private int field142 = 1;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field136 = 0;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
    public static int field138 = 0;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "[I")
    public static int[] field140 = new int[5];

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "[[S")
    public static short[][] field143;

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V", line = 356)
    public class11() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIII)V", line = 13)
    public static final void method58(int arg0, int arg1, int arg2, int arg3) {
        String var4 = "::tele " + arg0 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
        if (arg3 == -32586) {
            System.out.println(var4);
            class91.method613((byte) 88, var4);
            field144++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "(I)V", line = 30)
    public static void method59(int arg0) {
        field143 = (short[][]) null;
        if (arg0 != 1) {
            method61(93);
        }
        field140 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)[I", line = 48)
    public final int[] method60(boolean arg0, int arg1) {
        int[] var3 = this.field4573.method1116(100, arg1);
        if (!arg0) {
            field143 = (short[][]) ((short[][]) null);
        }
        if (this.field4573.field2420) {
            int var4 = this.field142 + this.field142 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field135 + this.field135 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field142; var9 <= this.field142 + arg1; var9++) {
                int var10 = 0;
                int[] var11 = this.method2048(0, (byte) 125, class32.field432 & var9);
                int[] var12 = new int[class287.field4599];
                for (int var13 = -this.field135; var13 <= this.field135; var13++) {
                    var10 += var11[class112.field1717 & var13];
                }
                int var14 = 0;
                while (var14 < class287.field4599) {
                    var12[var14] = var7 * var10 >> 16;
                    int var15 = var10 - var11[class112.field1717 & var14 - this.field135];
                    var14++;
                    var10 = var11[this.field135 + var14 & class112.field1717] + var15;
                }
                var8[var9 - (arg1 - this.field142)] = var12;
            }
            for (int var16 = 0; var16 < class287.field4599; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        field134++;
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "(I)Z", line = 134)
    public static final boolean method61(int arg0) {
        field145++;
        return class286.field4586 == arg0 ? class211.field3459.method859((byte) 111) : true;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)[[I", line = 159)
    public final int[][] method62(byte arg0, int arg1) {
        int[][] var3 = this.field4564.method1552(arg1, (byte) -69);
        field139++;
        if (arg0 < 121) {
            this.method62((byte) 87, -96);
        }
        if (this.field4564.field3529) {
            int var4 = this.field142 + this.field142 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field135 + this.field135 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg1 - this.field142; var9 <= (this.field142 + arg1); var9++) {
                int[][] var10 = this.method2053((byte) 125, 0, var9 & class32.field432);
                int var11 = 0;
                int[][] var12 = new int[3][class287.field4599];
                int var13 = 0;
                int[] var14 = var10[2];
                int var15 = 0;
                int[] var16 = var10[1];
                int[] var17 = var10[0];
                for (int var18 = -this.field135; var18 <= this.field135; var18++) {
                    int var19 = var18 & class112.field1717;
                    var11 += var17[var19];
                    var15 += var14[var19];
                    var13 += var16[var19];
                }
                int[] var20 = var12[2];
                int[] var21 = var12[0];
                int[] var22 = var12[1];
                int var23 = 0;
                while (class287.field4599 > var23) {
                    var21[var23] = var7 * var11 >> 16;
                    var22[var23] = var7 * var13 >> 16;
                    var20[var23] = var7 * var15 >> 16;
                    int var24 = var23 - this.field135 & class112.field1717;
                    int var25 = var11 - var17[var24];
                    int var26 = var13 - var16[var24];
                    int var27 = var15 - var14[var24];
                    var23++;
                    int var28 = class112.field1717 & this.field135 + var23;
                    var15 = var14[var28] + var27;
                    var13 = var16[var28] + var26;
                    var11 = var17[var28] + var25;
                }
                var8[var9 + this.field142 - arg1] = var12;
            }
            int[] var29 = var3[1];
            int[] var30 = var3[2];
            int[] var31 = var3[0];
            for (int var32 = 0; var32 < class287.field4599; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var8[var36];
                    var35 += var37[2][var32];
                    var34 += var37[1][var32];
                    var33 += var37[0][var32];
                }
                var31[var32] = var5 * var33 >> 16;
                var29[var32] = var5 * var34 >> 16;
                var30[var32] = var5 * var35 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLjj;I)V", line = 297)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        field137++;
        if (!arg0) {
            this.method60(false, -87);
        }
        if (arg2 == 0) {
            this.field135 = arg1.method286((byte) -82);
        } else if (arg2 == 1) {
            this.field142 = arg1.method286((byte) -99);
        } else if (arg2 == 2) {
            this.field4572 = arg1.method286((byte) -79) == 1;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I", line = 342)
    public static final int method64(int arg0, int arg1, int arg2) {
        field141++;
        int var3 = arg2 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return arg0 == -9518 ? (var5 & 0x7FACB4C) >> 19 : -94;
    }
}
