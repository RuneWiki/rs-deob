import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class347 {

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field5092 = 1;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "[I")
    public static int[] field5088;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "[[I")
    public static int[][] field5087;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
    public static final void method2196(int arg0) {
        field5089++;
        if (class444.field6323 != null) {
            return;
        }
        class444.field6323 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        int var3 = 20 / (-arg0 / 45);
        for (int var4 = 0; var4 < 65536; var4++) {
            double var5 = (double) (var4 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var7 = (double) (var4 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var9 = (double) (var4 & 0x7F) / 128.0D;
            double var11 = var9;
            double var13 = var9;
            double var15 = var9;
            if (var7 != 0.0D) {
                double var17;
                if ((var9 < 0.5D)) {
                    var17 = (var7 + 1.0D) * var9;
                } else {
                    var17 = var7 + var9 - (var7 * var9);
                }
                double var19 = var9 * 2.0D - var17;
                double var21 = var5 + 0.3333333333333333D;
                if (var21 > 1.0D) {
                    var21--;
                }
                double var25 = var5 - 0.3333333333333333D;
                if (var25 < 0.0D) {
                    var25++;
                }
                if ((var21 * 6.0D < 1.0D)) {
                    var11 = (var17 - var19) * 6.0D * var21 + var19;
                } else if (var21 * 2.0D < 1.0D) {
                    var11 = var17;
                } else if (var21 * 3.0D < 2.0D) {
                    var11 = (var17 - var19) * (0.6666666666666666D - var21) * 6.0D + var19;
                } else {
                    var11 = var19;
                }
                if ((var5 * 6.0D < 1.0D)) {
                    var13 = (var17 - var19) * 6.0D * var5 + var19;
                } else if ((var5 * 2.0D < 1.0D)) {
                    var13 = var17;
                } else if (var5 * 3.0D < 2.0D) {
                    var13 = (var17 - var19) * (0.6666666666666666D - var5) * 6.0D + var19;
                } else {
                    var13 = var19;
                }
                if (var25 * 6.0D < 1.0D) {
                    var15 = (var17 - var19) * 6.0D * var25 + var19;
                } else if (var25 * 2.0D < 1.0D) {
                    var15 = var17;
                } else if ((var25 * 3.0D < 2.0D)) {
                    var15 = (0.6666666666666666D - var25) * (var17 - var19) * 6.0D + var19;
                } else {
                    var15 = var19;
                }
            }
            double var27 = Math.pow(var11, var1);
            double var29 = Math.pow(var13, var1);
            double var31 = Math.pow(var15, var1);
            int var33 = (int) (var27 * 256.0D);
            int var34 = (int) (var29 * 256.0D);
            int var35 = (int) (var31 * 256.0D);
            int var36 = (var33 << 16) + (var34 << 8) + var35;
            class444.field6323[var4] = var36;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method2197(boolean arg0, String arg1) {
        field5091++;
        if (!arg0) {
            field5092 = 111;
        }
        System.out.println("Error: " + class225.method1555(arg1, "\n", 0, "%0a"));
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lha;Lcb;I)V")
    public static final void method2198(class66 arg0, class544 arg1, int arg2) {
        field5090++;
        class625[] var3 = class625.method3579(arg1, class698.field9857, 0);
        class684.field9713 = new class112[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class684.field9713[var4] = arg0.method482(var3[var4], true);
        }
        class625[] var5 = class625.method3579(arg1, class573.field8113, 0);
        class644.field9064 = new class112[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class644.field9064[var6] = arg0.method482(var5[var6], true);
        }
        class625[] var7 = class625.method3579(arg1, class14.field259, 0);
        class711.field10007 = new class112[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class711.field10007[var8] = arg0.method482(var7[var8], true);
        }
        class625[] var9 = class625.method3579(arg1, class269.field3780, 0);
        class223.field3206 = new class112[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class223.field3206[var10] = arg0.method482(var9[var10], true);
        }
        class625[] var11 = class625.method3579(arg1, class237.field3414, 0);
        class485.field6880 = new class112[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class485.field6880[var12] = arg0.method482(var11[var12], true);
        }
        class625[] var13 = class625.method3579(arg1, class264.field3728, 0);
        class351.field5119 = new class112[var13.length];
        for (int var14 = arg2; var14 < var13.length; var14++) {
            class351.field5119[var14] = arg0.method482(var13[var14], true);
        }
        class625[] var15 = class625.method3579(arg1, class305.field4565, 0);
        class170.field2440 = new class112[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class170.field2440[var16] = arg0.method482(var15[var16], true);
        }
        class625[] var17 = class625.method3579(arg1, class631.field8904, 0);
        class573.field8107 = new class112[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class573.field8107[var18] = arg0.method482(var17[var18], true);
        }
        class625[] var19 = class625.method3579(arg1, class631.field8913, 0);
        class140.field1798 = new class112[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class140.field1798[var20] = arg0.method482(var19[var20], true);
        }
        class625[] var21 = class625.method3579(arg1, class37.field523, 0);
        class151.field2055 = new class112[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class151.field2055[var22] = arg0.method482(var21[var22], true);
        }
        class625[] var23 = class625.method3579(arg1, class325.field4870, 0);
        class234.field3387 = new class112[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class234.field3387[var24] = arg0.method482(var23[var24], true);
        }
        class625[] var25 = class625.method3579(arg1, class181.field2757, 0);
        class541.field7591 = new class112[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class541.field7591[var26] = arg0.method482(var25[var26], true);
        }
        class351.field5116 = arg0.method482(class625.method3580(arg1, class688.field9746, 0), true);
        class74.field993 = arg0.method482(class625.method3580(arg1, class75.field1003, 0), true);
        class625[] var27 = class625.method3579(arg1, class645.field9083, 0);
        class300.field4518 = new class112[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class300.field4518[var28] = arg0.method482(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
    public static void method2199(int arg0) {
        field5088 = null;
        int var1 = 123 % ((arg0 - 19) / 40);
        field5087 = null;
    }
}
