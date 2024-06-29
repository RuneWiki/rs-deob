import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class77 extends class261 {

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    private int field1261 = 1;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
    private int field1266 = 1;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public static int field1259 = 5063219;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "Lve;")
    public static class255 field1263 = class87.method607(66, "T");

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
    public static volatile int field1258 = 0;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)[I", line = 18)
    public final int[] method21(byte arg0, int arg1) {
        int var3 = 2 % ((arg0 + 49) / 33);
        int[] var4 = this.field4425.method906(arg1, 8251);
        field1267++;
        if (this.field4425.field2043) {
            int var5 = this.field1266 + this.field1266 + 1;
            int var6 = this.field1261 - (-this.field1261 - 1);
            int var7 = 65536 / var6;
            int var8 = 65536 / var5;
            int[][] var9 = new int[var5][];
            for (int var10 = arg1 - this.field1266; var10 <= this.field1266 + arg1; var10++) {
                int[] var11 = this.method1822(0, 44, class250.field4205 & var10);
                int[] var12 = new int[class92.field1576];
                int var13 = 0;
                for (int var14 = -this.field1261; var14 <= this.field1261; var14++) {
                    var13 += var11[var14 & field1260];
                }
                int var15 = 0;
                while (var15 < class92.field1576) {
                    var12[var15] = var7 * var13 >> 16;
                    int var16 = var13 - var11[var15 - this.field1261 & field1260];
                    var15++;
                    var13 = var11[field1260 & var15 + this.field1261] + var16;
                }
                var9[this.field1266 + var10 - arg1] = var12;
            }
            for (int var17 = 0; var17 < class92.field1576; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var5; var19++) {
                    var18 += var9[var19][var17];
                }
                var4[var17] = var8 * var18 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V", line = 315)
    public class77() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lpb;BI)V", line = 108)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        field1265++;
        if (arg1 >= -115) {
            field1263 = (class255) null;
        }
        if (arg2 == 0) {
            this.field1261 = arg0.method481(0);
        } else if (arg2 == 1) {
            this.field1266 = arg0.method481(0);
        } else if (arg2 == 2) {
            this.field4434 = arg0.method481(0) == 1;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)[[I", line = 161)
    public final int[][] method13(boolean arg0, int arg1) {
        if (!arg0) {
            this.method20((class70) null, (byte) 6, 79);
        }
        int[][] var3 = this.field4418.method35(arg1, 95);
        field1257++;
        if (this.field4418.field94) {
            int var4 = this.field1266 - (-this.field1266 - 1);
            int var5 = 65536 / var4;
            int var6 = this.field1261 + this.field1261 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg1 - this.field1266; var9 <= this.field1266 + arg1; var9++) {
                int[][] var10 = this.method1819(69, 0, var9 & class250.field4205);
                int var11 = 0;
                int[][] var12 = new int[3][class92.field1576];
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var10[0];
                int[] var16 = var10[1];
                int[] var17 = var10[2];
                for (int var18 = -this.field1261; var18 <= this.field1261; var18++) {
                    int var19 = field1260 & var18;
                    var13 += var16[var19];
                    var14 += var17[var19];
                    var11 += var15[var19];
                }
                int[] var20 = var12[0];
                int[] var21 = var12[1];
                int[] var22 = var12[2];
                int var23 = 0;
                while (class92.field1576 > var23) {
                    var20[var23] = var7 * var11 >> 16;
                    var21[var23] = var7 * var13 >> 16;
                    var22[var23] = var7 * var14 >> 16;
                    int var24 = field1260 & var23 - this.field1261;
                    int var25 = var13 - var16[var24];
                    var23++;
                    int var26 = var14 - var17[var24];
                    int var27 = var11 - var15[var24];
                    int var28 = field1260 & var23 + this.field1261;
                    var11 = var15[var28] + var27;
                    var13 = var16[var28] + var25;
                    var14 = var17[var28] + var26;
                }
                var8[this.field1266 + var9 - arg1] = var12;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[1];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class92.field1576; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var8[var36];
                    var34 += var37[1][var32];
                    var35 += var37[2][var32];
                    var33 += var37[0][var32];
                }
                var29[var32] = var5 * var33 >> 16;
                var30[var32] = var5 * var34 >> 16;
                var31[var32] = var5 * var35 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "(B)V", line = 301)
    public static void method540(byte arg0) {
        field1263 = null;
        int var1 = -42 / ((arg0 + 62) / 45);
    }
}
