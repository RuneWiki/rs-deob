import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class2 extends class240 {

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public int field5;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "[I")
    public int[] field10;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "[I")
    public int[] field9;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "[[I")
    public int[][] field6;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "[Z")
    public boolean[] field4;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field7;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "[[B")
    public static byte[][] field2;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V", line = 10)
    public static void method2(int arg0) {
        field2 = (byte[][]) null;
        if (arg0 == 8) {
            field7 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILja;Lja;)V", line = 21)
    public static final void method3(int arg0, class64 arg1, class64 arg2) {
        if (arg0 < 95) {
            method2(-85);
        }
        class320.field4996 = arg2;
        field11++;
        class120.field1930 = arg1;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)Z", line = 41)
    public static final boolean method4(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class294.field4638; var3++) {
            class94 var4 = class236.field3716[var3];
            if (var4.field1551 == 1) {
                int var5 = var4.field1548 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1545 * var5 >> 8) + var4.field1547;
                    int var7 = (var4.field1546 * var5 >> 8) + var4.field1537;
                    int var8 = (var4.field1543 * var5 >> 8) + var4.field1540;
                    int var9 = (var4.field1539 * var5 >> 8) + var4.field1550;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1551 == 2) {
                int var10 = arg0 - var4.field1548;
                if (var10 > 0) {
                    int var11 = (var4.field1545 * var10 >> 8) + var4.field1547;
                    int var12 = (var4.field1546 * var10 >> 8) + var4.field1537;
                    int var13 = (var4.field1543 * var10 >> 8) + var4.field1540;
                    int var14 = (var4.field1539 * var10 >> 8) + var4.field1550;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1551 == 3) {
                int var15 = var4.field1547 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1534 * var15 >> 8) + var4.field1548;
                    int var17 = (var4.field1554 * var15 >> 8) + var4.field1549;
                    int var18 = (var4.field1543 * var15 >> 8) + var4.field1540;
                    int var19 = (var4.field1539 * var15 >> 8) + var4.field1550;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1551 == 4) {
                int var20 = arg2 - var4.field1547;
                if (var20 > 0) {
                    int var21 = (var4.field1534 * var20 >> 8) + var4.field1548;
                    int var22 = (var4.field1554 * var20 >> 8) + var4.field1549;
                    int var23 = (var4.field1543 * var20 >> 8) + var4.field1540;
                    int var24 = (var4.field1539 * var20 >> 8) + var4.field1550;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1551 == 5) {
                int var25 = arg1 - var4.field1540;
                if (var25 > 0) {
                    int var26 = (var4.field1534 * var25 >> 8) + var4.field1548;
                    int var27 = (var4.field1554 * var25 >> 8) + var4.field1549;
                    int var28 = (var4.field1545 * var25 >> 8) + var4.field1547;
                    int var29 = (var4.field1546 * var25 >> 8) + var4.field1537;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(I[B)V", line = 166)
    public class2(int arg0, byte[] arg1) {
        this.field5 = arg0;
        class101 var3 = new class101(arg1);
        this.field8 = var3.method741(109);
        this.field10 = new int[this.field8];
        this.field9 = new int[this.field8];
        this.field6 = new int[this.field8][];
        this.field4 = new boolean[this.field8];
        for (int var4 = 0; var4 < this.field8; var4++) {
            this.field10[var4] = var3.method741(47);
        }
        for (int var5 = 0; var5 < this.field8; var5++) {
            this.field4[var5] = var3.method741(25) == 1;
        }
        for (int var6 = 0; var6 < this.field8; var6++) {
            this.field9[var6] = var3.method731(false);
        }
        for (int var7 = 0; var7 < this.field8; var7++) {
            this.field6[var7] = new int[var3.method741(109)];
        }
        for (int var8 = 0; var8 < this.field8; var8++) {
            for (int var9 = 0; var9 < this.field6[var8].length; var9++) {
                this.field6[var8][var9] = var3.method741(76);
            }
        }
    }
}
