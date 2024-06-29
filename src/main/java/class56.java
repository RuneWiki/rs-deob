import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class56 extends class128 {

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
    private int field682 = 1;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
    private int field683 = 1;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public static int field678 = 100;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field675 = 0;

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "Ljava/lang/String;")
    public static String field685 = "Starting 3d Library";

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "Llc;")
    public static class175 field677;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)[[I", line = 7)
    public final int[][] method102(int arg0, int arg1) {
        if (arg1 != 5110) {
            field678 = -126;
        }
        field676++;
        int[][] var3 = this.field1755.method875(38, arg0);
        if (this.field1755.field1815) {
            int var4 = this.field683 + this.field683 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field682 + this.field682 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field683; var9 <= (arg0 + this.field683); var9++) {
                int[][] var10 = this.method855(arg1 - 8212, var9 & class237.field3486, 0);
                int[][] var11 = new int[3][class10.field141];
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var10[0];
                int[] var16 = var10[1];
                int[] var17 = var10[2];
                for (int var18 = -this.field682; var18 <= this.field682; var18++) {
                    int var19 = var18 & class244.field3664;
                    var13 += var15[var19];
                    var14 += var17[var19];
                    var12 += var16[var19];
                }
                int[] var20 = var11[2];
                int[] var21 = var11[1];
                int[] var22 = var11[0];
                int var23 = 0;
                while (var23 < class10.field141) {
                    var22[var23] = var7 * var13 >> 16;
                    var21[var23] = var7 * var12 >> 16;
                    var20[var23] = var7 * var14 >> 16;
                    int var24 = var23 - this.field682 & class244.field3664;
                    int var25 = var13 - var15[var24];
                    int var26 = var12 - var16[var24];
                    var23++;
                    int var27 = var14 - var17[var24];
                    int var28 = class244.field3664 & this.field682 + var23;
                    var13 = var15[var28] + var25;
                    var14 = var17[var28] + var27;
                    var12 = var16[var28] + var26;
                }
                var8[var9 + this.field683 - arg0] = var11;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[2];
            int[] var31 = var3[1];
            for (int var32 = 0; var32 < class10.field141; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var8[var36];
                    var35 += var37[2][var32];
                    var33 += var37[0][var32];
                    var34 += var37[1][var32];
                }
                var29[var32] = var5 * var33 >> 16;
                var31[var32] = var5 * var34 >> 16;
                var30[var32] = var5 * var35 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Llc;Llc;I)V", line = 140)
    public static final void method331(class175 arg0, class175 arg1, int arg2) {
        class13.field176 = arg1;
        if (arg2 != 2) {
            field678 = -16;
        }
        field684++;
        class292.field4588 = arg0;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(III)J", line = 152)
    public static final long method332(int arg0, int arg1, int arg2) {
        class225 var3 = class158.field2184[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field3214; var4++) {
            class80 var5 = var3.field3199[var4];
            if ((var5.field1026 >> 29 & 0x3L) == 2L && var5.field1015 == arg1 && var5.field1027 == arg2) {
                return var5.field1026;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 174)
    public static final String method333(int arg0, String arg1, String arg2, String arg3) {
        if (arg0 != 0) {
            field685 = (String) null;
        }
        field680++;
        for (int var4 = arg1.indexOf(arg2); var4 != -1; var4 = arg1.indexOf(arg2, arg3.length() + var4)) {
            arg1 = arg1.substring(0, var4) + arg3 + arg1.substring(var4 + arg2.length());
        }
        return arg1;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V", line = 195)
    public class56() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(BI)[I", line = 201)
    public final int[] method126(byte arg0, int arg1) {
        if (arg0 < 100) {
            field675 = 8;
        }
        field679++;
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            int var4 = this.field683 + this.field683 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field682 + this.field682 + 1;
            int[][] var7 = new int[var4][];
            int var8 = 65536 / var6;
            for (int var9 = arg1 - this.field683; var9 <= this.field683 + arg1; var9++) {
                int[] var10 = this.method851((byte) -81, 0, var9 & class237.field3486);
                int[] var11 = new int[class10.field141];
                int var12 = 0;
                for (int var13 = -this.field682; var13 <= this.field682; var13++) {
                    var12 += var10[var13 & class244.field3664];
                }
                int var14 = 0;
                while (class10.field141 > var14) {
                    var11[var14] = var8 * var12 >> 16;
                    int var15 = var12 - var10[var14 - this.field682 & class244.field3664];
                    var14++;
                    var12 = var10[class244.field3664 & this.field682 + var14] + var15;
                }
                var7[var9 - (arg1 - this.field683)] = var11;
            }
            for (int var16 = 0; var16 < class10.field141; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var7[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lp;II)V", line = 296)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field682 = arg0.method661(-1);
        } else if (arg1 == 1) {
            this.field683 = arg0.method661(-1);
        } else if (arg1 == 2) {
            this.field1753 = arg0.method661(-1) == 1;
        }
        if (arg2 >= -85) {
            field677 = (class175) null;
        }
        field681++;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V", line = 340)
    public static void method334(byte arg0) {
        field685 = null;
        int var1 = -97 % ((-arg0 - 12) / 62);
        field677 = null;
    }
}
