import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class128 extends class23 {

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "I")
    private int field2202 = 1;

    @OriginalMember(owner = "client!vd", name = "db", descriptor = "I")
    private int field2204 = 1;

    @OriginalMember(owner = "client!vd", name = "fb", descriptor = "Lqd;")
    public static class40 field2206 = class147.method1106("<col=00ff80>", (byte) -90);

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "Lpl;")
    public static class186 field2199 = new class186(64);

    @OriginalMember(owner = "client!vd", name = "hb", descriptor = "I")
    public static int field2208 = 0;

    @OriginalMember(owner = "client!vd", name = "kb", descriptor = "Lqd;")
    private static class40 field2211 = class147.method1106("Loading )2 please wait)3", (byte) -76);

    @OriginalMember(owner = "client!vd", name = "ib", descriptor = "Lqd;")
    public static class40 field2209 = class147.method1106("0(U", (byte) -119);

    @OriginalMember(owner = "client!vd", name = "jb", descriptor = "Lqd;")
    public static class40 field2210 = field2211;

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!vd", name = "cb", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!vd", name = "eb", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!vd", name = "gb", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILsd;)V", line = 8)
    public final void method23(int arg0, int arg1, class26 arg2) {
        field2207++;
        if (arg0 == 0) {
            this.field2204 = arg2.method226(255);
        } else if (arg0 == 1) {
            this.field2202 = arg2.method226(255);
        } else if (arg0 == 2) {
            this.field415 = arg2.method226(255) == 1;
        }
        if (arg1 != 0) {
            this.method32((byte) 100, 11);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[[I", line = 51)
    public final int[][] method17(int arg0, int arg1) {
        field2201++;
        int[][] var3 = this.field417.method1251(arg1, 127);
        if (this.field417.field2751) {
            int var4 = this.field2202 + this.field2202 + 1;
            int var5 = 65536 / var4;
            int[][][] var6 = new int[var4][][];
            int var7 = this.field2204 + this.field2204 + 1;
            int var8 = 65536 / var7;
            for (int var9 = arg1 - this.field2202; var9 <= (this.field2202 + arg1); var9++) {
                int[][] var10 = this.method173(0, class212.field3384 & var9, (byte) -109);
                int[][] var11 = new int[3][class52.field1007];
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var10[0];
                int[] var16 = var10[2];
                int[] var17 = var10[1];
                for (int var18 = -this.field2204; var18 <= this.field2204; var18++) {
                    int var19 = var18 & class6.field92;
                    var14 += var16[var19];
                    var13 += var17[var19];
                    var12 += var15[var19];
                }
                int[] var20 = var11[0];
                int[] var21 = var11[2];
                int[] var22 = var11[1];
                int var23 = 0;
                while (class52.field1007 > var23) {
                    var20[var23] = var8 * var12 >> 16;
                    var22[var23] = var8 * var13 >> 16;
                    var21[var23] = var8 * var14 >> 16;
                    int var24 = var23 - this.field2204 & class6.field92;
                    int var25 = var12 - var15[var24];
                    var23++;
                    int var26 = var13 - var17[var24];
                    int var27 = var14 - var16[var24];
                    int var28 = this.field2204 + var23 & class6.field92;
                    var12 = var15[var28] + var25;
                    var14 = var16[var28] + var27;
                    var13 = var17[var28] + var26;
                }
                var6[this.field2202 + var9 - arg1] = var11;
            }
            int[] var29 = var3[1];
            int[] var30 = var3[0];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class52.field1007; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var6[var36];
                    var34 += var37[1][var32];
                    var35 += var37[2][var32];
                    var33 += var37[0][var32];
                }
                var30[var32] = var5 * var33 >> 16;
                var29[var32] = var5 * var34 >> 16;
                var31[var32] = var5 * var35 >> 16;
            }
        }
        if (arg0 <= 30) {
            this.method32((byte) -10, -128);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBII)V", line = 188)
    public static final void method956(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 <= 57) {
            field2206 = (class40) null;
        }
        field2203++;
        if (class94.field1698 == 0 || arg0 == 0 || class227.field3747 >= 50 || arg3 == -1) {
            return;
        }
        class78.field1324[class227.field3747] = arg3;
        class59.field1129[class227.field3747] = arg0;
        class307.field5146[class227.field3747] = arg2;
        class162.field2693[class227.field3747] = null;
        class116.field1990[class227.field3747] = 0;
        class227.field3747++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)[I", line = 208)
    public final int[] method32(byte arg0, int arg1) {
        field2205++;
        int[] var3 = this.field403.method724((byte) 108, arg1);
        if (this.field403.field1760) {
            int var4 = this.field2202 + this.field2202 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field2204 + this.field2204 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field2202; var9 <= arg1 + this.field2202; var9++) {
                int[] var10 = this.method174(0, 0, class212.field3384 & var9);
                int[] var11 = new int[class52.field1007];
                int var12 = 0;
                for (int var13 = -this.field2204; var13 <= this.field2204; var13++) {
                    var12 += var10[class6.field92 & var13];
                }
                int var14 = 0;
                while (var14 < class52.field1007) {
                    var11[var14] = var7 * var12 >> 16;
                    int var15 = var12 - var10[var14 - this.field2204 & class6.field92];
                    var14++;
                    var12 = var10[class6.field92 & this.field2204 + var14] + var15;
                }
                var8[this.field2202 + var9 - arg1] = var11;
            }
            for (int var16 = 0; var16 < class52.field1007; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        if (arg0 != -94) {
            this.method32((byte) -41, -44);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V", line = 319)
    public class128() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V", line = 302)
    public static void method957(byte arg0) {
        field2209 = null;
        field2206 = null;
        if (arg0 != 2) {
            field2210 = (class40) null;
        }
        field2211 = null;
        field2199 = null;
        field2210 = null;
    }
}
