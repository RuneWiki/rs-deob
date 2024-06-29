import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class780 {

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public int field10690 = -1;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "[Z")
    public static boolean[] field10685 = new boolean[100];

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Z")
    public static boolean field10691 = false;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public int field10686;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public int field10687;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public int field10688;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public int field10689;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public int field10692;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public int field10693;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public int field10694;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field10695;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public int field10696;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field10697;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field10698;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILaa;Luf;Lha;IIIBI)V")
    public static final void method4282(int arg0, class88 arg1, class519 arg2, class475 arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field10698++;
        class548 var9 = class451.field6195.method4105(arg6, -127);
        if (var9 != null && var9.field7606 && var9.method3168((byte) -128, class578.field8328)) {
            if (var9.field7592 != null) {
                int[] var10 = new int[var9.field7592.length];
                for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                    int var28;
                    if (class783.field10725 == 4) {
                        var28 = (int) class98.field1423 & 0x3FFF;
                    } else {
                        var28 = (int) class98.field1423 + class654.field9251 & 0x3FFF;
                    }
                    int var29 = class253.field3634[var28];
                    int var30 = class253.field3633[var28];
                    if (class783.field10725 != 4) {
                        var30 = var30 * 256 / (class592.field8487 + 256);
                        var29 = var29 * 256 / (class592.field8487 + 256);
                    }
                    var10[var11 * 2] = ((arg5 + (var9.field7592[var11 * 2 + 1] * 4)) * var29 + ((var9.field7592[var11 * 2] * 4 + arg8) * var30) >> 14) + arg2.field7128 / 2 + arg4;
                    var10[var11 * 2 + 1] = arg2.field7255 / 2 + arg0 - ((var9.field7592[var11 * 2 + 1] * 4 + arg5) * var30 + -((var9.field7592[var11 * 2] * 4 + arg8) * var29) >> 14);
                }
                class52.method415(arg3, var10, var9.field7625, arg2.field7135, arg2.field7259);
                if (var9.field7584 > 0) {
                    for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                        int var20 = var10[var12 * 2];
                        int var21 = var10[var12 * 2 + 1];
                        int var22 = var10[var12 * 2 + 2];
                        int var23 = var10[(var12 + 1) * 2 + 1];
                        if (var22 < var20) {
                            int var25 = var20;
                            int var26 = var21;
                            var20 = var22;
                            var21 = var23;
                            var22 = var25;
                            var23 = var26;
                        } else if (var20 == var22 && var23 < var21) {
                            int var24 = var21;
                            var21 = var23;
                            var23 = var24;
                        }
                        arg3.method501(var20, var21, var22, var23, var9.field7602[var9.field7630[var12] & 0xFF], 1, arg1, arg4, arg0, var9.field7584, var9.field7612, var9.field7620);
                    }
                    int var13 = var10[var10.length - 2];
                    int var14 = var10[var10.length - 1];
                    int var15 = var10[0];
                    int var16 = var10[1];
                    if (var15 < var13) {
                        int var17 = var13;
                        var13 = var15;
                        int var18 = var14;
                        var15 = var17;
                        var14 = var16;
                        var16 = var18;
                    } else if (var13 == var15 && var14 > var16) {
                        int var19 = var14;
                        var14 = var16;
                        var16 = var19;
                    }
                    arg3.method501(var13, var14, var15, var16, var9.field7602[var9.field7630[var9.field7630.length - 1] & 0xFF], 1, arg1, arg4, arg0, var9.field7584, var9.field7612, var9.field7620);
                } else {
                    for (int var27 = 0; var27 < var10.length / 2 - 1; var27++) {
                        arg3.method505(var10[var27 * 2], var10[var27 * 2 + 1], var10[(var27 + 1) * 2], var10[var27 * 2 + 1 + 2], var9.field7602[var9.field7630[var27] & 0xFF], 1, arg1, arg4, arg0);
                    }
                    arg3.method505(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field7602[var9.field7630[var9.field7630.length - 1] & 0xFF], 1, arg1, arg4, arg0);
                }
            }
            class85 var31 = null;
            if (var9.field7590 != -1) {
                var31 = var9.method3170(12, false, arg3);
                if (var31 != null) {
                    class406.method2403(arg2, arg4, (byte) 49, arg1, arg0, arg5, arg8, var31);
                }
            }
            if (var9.field7582 != null) {
                int var32 = 0;
                if (var31 != null) {
                    var32 = var31.method5();
                }
                class443 var33 = class71.field1124;
                class470 var34 = class606.field8600;
                if (var9.field7610 == 1) {
                    var33 = class420.field5827;
                    var34 = class30.field322;
                }
                if (var9.field7610 == 2) {
                    var33 = class670.field9398;
                    var34 = class675.field9477;
                }
                class312.method1905(var9.field7582, arg5, var9.field7615, arg2, var33, arg1, var32, arg0, false, arg8, var34, arg4);
            }
        }
        if (arg7 < 74) {
            field10691 = true;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static void method4283(byte arg0) {
        field10685 = null;
        if (arg0 != 57) {
            field10685 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lm;I)V")
    public static final void method4284(class554 arg0, int arg1) {
        field10697++;
        if (arg1 != 2 || arg0 == null) {
            return;
        }
        class521.field7310.method3728((byte) 125, arg0);
        class624.field8863++;
        Object var2 = null;
        class551 var5;
        if (arg0.field7698 || "".equals(arg0.field7690)) {
            var5 = new class551(arg0.field7690);
            class81.field1197++;
        } else {
            long var3 = arg0.field7680;
            for (var5 = (class551) class6.field76.method4253(var3, -1); var5 != null && !var5.field7652.equals(arg0.field7690); var5 = (class551) class6.field76.method4248(-88)) {
            }
            if (var5 == null) {
                var5 = (class551) class359.field5083.method2882(var3, (byte) -54);
                if (var5 != null && !var5.field7652.equals(arg0.field7690)) {
                    var5 = null;
                }
                if (var5 == null) {
                    var5 = new class551(arg0.field7690);
                }
                class6.field76.method4252(false, var5, var3);
                class81.field1197++;
            }
        }
        if (var5.method3183(arg0, -125)) {
            class27.method226(var5, false);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljg;Lha;Lll;I)V")
    public static final void method4285(class770 arg0, class475 arg1, class548 arg2, int arg3) {
        field10695++;
        class85 var4 = arg2.method3171((byte) 104, arg1);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method16();
        if (var4.method5() > var5) {
            var5 = var4.method5();
        }
        byte var6 = 10;
        int var7 = arg0.field10637;
        int var8 = arg0.field10628;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg2.field7582 != null) {
            var9 = class606.field8600.method2753(class363.field5167, null, arg2.field7582, null, (byte) 34);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class363.field5167[var12];
                if (var12 < var9 - 1) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class284.field4169.method387(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = var9 * class284.field4169.method381() + class284.field4169.method386() / 2;
        }
        int var15 = arg0.field10637 + (var5 / 2);
        if (var7 < (class751.field10447 + var5)) {
            var15 = var10 / 2 + var5 / 2 + class751.field10447 + var6 + 5;
            var7 = class751.field10447;
        } else if ((class751.field10439 - var5) < var7) {
            var7 = class751.field10439 - var5;
            var15 = class751.field10439 - (var10 / 2) - var6 - (var5 / 2) - 5;
        }
        int var16 = arg0.field10628;
        if (class751.field10451 + var5 > var8) {
            var16 = var5 / 2 + class751.field10451 + var6;
            var8 = class751.field10451;
        } else if (var8 > (class751.field10453 - var5)) {
            var8 = class751.field10453 - var5;
            var16 = class751.field10453 - var6 - var11 - (var5 / 2);
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg0.field10637), (double) (var8 - arg0.field10628)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method751((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        int var22 = -32 / ((arg3 - 86) / 32);
        if (arg2.field7582 != null) {
            var18 = var15 - (var10 / 2) - 5;
            var19 = var16;
            var20 = var10 + var18 + 10;
            var21 = var16 + (class284.field4169.method381() * var9 + 3);
            if (arg2.field7585 != 0) {
                arg1.method2765(var16, var21 - var16, 97, arg2.field7585, var18, var20 - var18);
            }
            if (arg2.field7607 != 0) {
                arg1.method2771(var21 - var16, var18, arg2.field7607, 113, var16, var20 - var18);
            }
            for (int var23 = 0; var23 < var9; var23++) {
                String var24 = class363.field5167[var23];
                if (var23 < (var9 - 1)) {
                    var24 = var24.substring(0, var24.length() - 4);
                }
                class284.field4169.method385(arg1, var24, var15, var16, arg2.field7615, true);
                var16 += class284.field4169.method381();
            }
        }
        if (arg2.field7590 == -1 && arg2.field7582 == null) {
            return;
        }
        class343 var25 = new class343(arg0);
        int var26 = var5 >> 1;
        var25.field4872 = var7 + var26;
        var25.field4873 = var18;
        var25.field4869 = var21;
        var25.field4879 = var20;
        var25.field4878 = var8 + var26;
        var25.field4871 = var19;
        var25.field4877 = var8 - var26;
        var25.field4868 = var7 - var26;
        class148.field2381.method3728((byte) 109, var25);
    }
}
