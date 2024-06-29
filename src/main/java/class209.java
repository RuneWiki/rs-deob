import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class209 {

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "[F")
    private static float[] field3576 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "[I")
    private static int[] field3577 = new int[4];

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field3580 = 0;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "[Z")
    private static boolean[] field3582 = new boolean[4];

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "[Lsa;")
    public static class102[] field3579 = new class102[255];

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "[Z")
    private static boolean[] field3583 = new boolean[4];

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "[I")
    private static int[] field3584 = new int[4];

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    private static int field3570;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    private static int field3571;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    private static int field3572;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    private static int field3573;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    private static int field3574;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    private static int field3575;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    private static int field3578;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    private static int field3581;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "[[[I")
    private static int[][][] field3569;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lsa;)V", line = 4)
    public static final void method1542(class102 arg0) {
        if (field3580 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field3579[field3580++] = arg0;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()V", line = 16)
    public static final void method1543() {
        field3580 = 0;
        for (int var0 = 0; var0 < field3581; var0++) {
            for (int var1 = 0; var1 < field3571; var1++) {
                for (int var2 = 0; var2 < field3570; var2++) {
                    field3569[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIII)V", line = 45)
    public static final void method1544(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class116.field1970 || field3578 == arg3 && field3574 == arg4 && field3572 == arg5 && field3573 == arg4 && field3575 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field3582[var6] = false;
        }
        int var7 = 0;
        int var8 = field3569[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field3584[var10] == var9) {
                        field3582[var10] = true;
                        continue label72;
                    }
                }
                field3577[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field3582[var12]) {
                        field3584[var12] = field3577[var11];
                        field3582[var12] = true;
                        method1551(var12, field3579[field3577[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field3582[var13]) {
                    field3584[var13] = -1;
                    method1546(var13);
                }
            }
            field3578 = arg3;
            field3574 = arg4;
            field3572 = arg5;
            field3573 = arg4;
            field3575 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "()V", line = 135)
    public static final void method1545() {
        GL var0 = class47.field739;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 151)
    private static final void method1546(int arg0) {
        if (field3583[arg0]) {
            field3583[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class47.field739;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "()V", line = 166)
    public static final void method1547() {
        for (int var0 = 0; var0 < field3580; var0++) {
            class102 var1 = field3579[var0];
            int var2 = var1.field1715;
            if (var1.field1729) {
                var2 = 0;
            }
            int var3 = var1.field1715;
            if (var1.field1727) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field1719 >> 7) - var1.field1717;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field1719 >> 7) + var1.field1717;
                if (var7 > field3570 - 1) {
                    var7 = field3570 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field1726[var5++];
                    int var10 = (var9 >> 8) + ((var1.field1730 >> 7) - var1.field1717);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field3571 - 1) {
                        var11 = field3571 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field3569[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field3569[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field3569[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field3569[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field3569[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)V", line = 256)
    public static final void method1548(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field3580; var2++) {
            field3579[var2].method801((byte) 56, arg1, arg0);
        }
        field3578 = -1;
        field3574 = -1;
        field3572 = -1;
        field3573 = -1;
        field3575 = -1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIII)V", line = 270)
    public static final void method1549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class116.field1970) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method1544(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field3571 - 1) {
            method1544(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method1544(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field3570 - 1) {
            method1544(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field3570 - 1) {
            method1544(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field3571 - 1 && arg6 < field3570 - 1) {
            method1544(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method1544(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field3571 - 1 && arg6 > 0) {
            method1544(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[[[Ltf;)V", line = 324)
    public static final void method1550(int arg0, int arg1, class242[][][] arg2) {
        if (!class116.field1970) {
            return;
        }
        GL var3 = class47.field739;
        class140.method1079(0, (byte) 126, 0);
        class47.method324(0);
        class47.method319();
        class47.method317(class47.field757);
        var3.glDepthMask(false);
        class47.method321(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label58: for (int var4 = 0; var4 < field3580; var4++) {
            class102 var5 = field3579[var4];
            if (var5.field1739 != null) {
                int var6 = 0;
                int var7 = (var5.field1719 >> 7) - var5.field1717;
                int var8 = (var5.field1719 >> 7) + var5.field1717;
                if (var8 >= class260.field4360) {
                    var8 = class260.field4360 - 1;
                }
                if (var7 < class255.field4270) {
                    var6 += class255.field4270 - var7;
                    var7 = class255.field4270;
                }
                for (int var9 = var7; var9 <= var8; var9++) {
                    short var10 = var5.field1726[var6++];
                    int var11 = (var10 >> 8) + ((var5.field1730 >> 7) - var5.field1717);
                    int var12 = (var10 & 0xFF) + var11 - 1;
                    if (var11 < class217.field3710) {
                        var11 = class217.field3710;
                    }
                    if (var12 >= class182.field3039) {
                        var12 = class182.field3039 - 1;
                    }
                    for (int var13 = var11; var13 <= var12; var13++) {
                        class242 var14 = arg2[var5.field1715][var13][var9];
                        if (var14 != null && var14.field4085) {
                            class47.method315(201.5F - (float) var5.field1715 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field1718 }, 0);
                            var5.field1739.method1448();
                            continue label58;
                        }
                    }
                }
            }
        }
        var3.glTexEnvi(8960, 34176, 5890);
        var3.glTexEnvi(8960, 34192, 768);
        var3.glBlendFunc(770, 771);
        var3.glDepthMask(true);
        var3.glFogfv(2918, class239.field4034, 0);
        var3.glEnableClientState(32888);
        class47.method334();
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILsa;III)V", line = 420)
    private static final void method1551(int arg0, class102 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class47.field739;
        if (!field3583[arg0]) {
            var6.glEnable(var5);
            field3583[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field1734);
        var6.glLightfv(var5, 4609, arg1.field1732, 0);
        field3576[0] = (float) (arg1.field1730 - arg2);
        field3576[1] = (float) (arg1.field1736 - arg3);
        field3576[2] = (float) (arg1.field1719 - arg4);
        var6.glLightfv(var5, 4611, field3576, 0);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V", line = 440)
    public static final void method1552(int arg0, int arg1, int arg2) {
        field3581 = arg0;
        field3571 = arg1;
        field3570 = arg2;
        field3569 = new int[field3581][field3571][field3570];
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "()V", line = 446)
    public static void method1553() {
        field3579 = null;
        field3569 = (int[][][]) null;
        field3584 = null;
        field3583 = null;
        field3576 = null;
        field3577 = null;
        field3582 = null;
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "()V", line = 465)
    public static final void method1554() {
        for (int var0 = 0; var0 < 4; var0++) {
            field3584[var0] = -1;
            method1546(var0);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII)V", line = 492)
    public static final void method1555(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class116.field1970) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field3584[var5] != -1) {
                int var6 = field3569[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field3584[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field3569[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field3584[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field3584[var5] = -1;
            method1546(var5);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIII)V", line = 536)
    public static final void method1556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class116.field1970 || field3578 == arg3 && field3574 == arg4 && field3572 == arg5 && field3573 == arg6 && field3575 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field3582[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field3569[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field3577[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field3584[var16] == var14) {
                                    if (!field3582[var16]) {
                                        field3582[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field3577[var10++] = var14;
                            var9++;
                            if (var9 == 4) {
                                break label112;
                            }
                        }
                    }
                }
            }
        }
        for (int var17 = 0; var17 < var10; var17++) {
            for (int var18 = 0; var18 < 4; var18++) {
                if (!field3582[var18]) {
                    field3584[var18] = field3577[var17];
                    field3582[var18] = true;
                    method1551(var18, field3579[field3577[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field3582[var19]) {
                field3584[var19] = -1;
                method1546(var19);
            }
        }
        field3578 = arg3;
        field3574 = arg4;
        field3572 = arg5;
        field3573 = arg6;
        field3575 = arg7;
    }
}
