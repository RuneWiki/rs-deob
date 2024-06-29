import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class90 extends class195 {

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    public static int field1374 = 0;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "Lck;")
    public static class119 field1375 = class298.method1987((byte) 61, "<img=0>");

    @OriginalMember(owner = "client!f", name = "bb", descriptor = "[J")
    public static long[] field1381 = new long[100];

    @OriginalMember(owner = "client!f", name = "Z", descriptor = "I")
    public static int field1379 = 0;

    @OriginalMember(owner = "client!f", name = "cb", descriptor = "I")
    public static int field1382 = 0;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!f", name = "X", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!f", name = "ab", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lfj;II)V", line = 5)
    public final void method13(class3 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3127 = arg0.method64((byte) 86) == 1;
        }
        if (arg1 > -117) {
            this.method11(-107, false);
        }
        field1377++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)[I", line = 28)
    public final int[] method11(int arg0, boolean arg1) {
        field1380++;
        if (arg1) {
            method608(-19);
        }
        int[] var3 = this.field3106.method924(100, arg0);
        if (this.field3106.field2260) {
            int[] var4 = this.method1253(0, 95, arg0);
            int[] var5 = this.method1253(1, 110, arg0);
            int[] var6 = this.method1253(2, 80, arg0);
            for (int var7 = 0; var7 < class157.field2504; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)[[I", line = 83)
    public final int[][] method9(byte arg0, int arg1) {
        if (arg0 != 3) {
            this.method11(84, true);
        }
        field1376++;
        int[][] var3 = this.field3126.method603(arg1, -125);
        if (this.field3126.field1372) {
            int[] var4 = this.method1253(2, 67, arg1);
            int[][] var5 = this.method1256(arg1, 0, -10072);
            int[][] var6 = this.method1256(arg1, 1, -10072);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var5[0];
            int[] var10 = var5[1];
            int[] var11 = var5[2];
            int[] var12 = var3[2];
            int[] var13 = var6[0];
            int[] var14 = var6[2];
            int[] var15 = var6[1];
            for (int var16 = 0; var16 < class157.field2504; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var9[var16];
                    var8[var16] = var10[var16];
                    var12[var16] = var11[var16];
                } else if (var17 == 0) {
                    var7[var16] = var13[var16];
                    var8[var16] = var15[var16];
                    var12[var16] = var14[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var9[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var10[var16] * var17 + var15[var16] * var18 >> 12;
                    var12[var16] = var11[var16] * var17 + (var14[var16] * var18) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V", line = 174)
    public static void method608(int arg0) {
        field1381 = null;
        if (arg0 != 0) {
            field1374 = 39;
        }
        field1375 = null;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V", line = 198)
    public class90() {
        super(3, false);
    }
}
