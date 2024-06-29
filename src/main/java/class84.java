import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class84 {

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "[F")
    private static float[] field1458 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field1462 = 0;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    private static int field1451;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    private static int field1454;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    private static int field1455;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    private static int field1461;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    private static int field1463;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    private static int field1464;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    private static int field1465;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    private static int field1466;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "[I")
    private static int[] field1459;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "[I")
    private static int[] field1460;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "[Lrg;")
    public static class90[] field1452;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "[Z")
    private static boolean[] field1456;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "[Z")
    private static boolean[] field1457;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "[[[I")
    private static int[][][] field1453;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()V", line = 6)
    public static final void method637() {
        for (int var0 = 0; var0 < 4; var0++) {
            field1459[var0] = -1;
            method645(var0);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIII)V", line = 16)
    public static final void method638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!class1.field8) {
            return;
        }
        if (arg0 == 1 && arg5 > 0) {
            method646(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
        } else if (arg0 == 4 && arg5 < field1451 - 1) {
            method646(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
        } else if (arg0 == 8 && arg6 > 0) {
            method646(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
        } else if (arg0 == 2 && arg6 < field1455 - 1) {
            method646(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
        } else if (arg0 == 16 && arg5 > 0 && arg6 < field1455 - 1) {
            method646(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
        } else if (arg0 == 32 && arg5 < field1451 - 1 && arg6 < field1455 - 1) {
            method646(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
        } else if (arg0 == 128 && arg5 > 0 && arg6 > 0) {
            method646(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
        } else if (arg0 == 64 && arg5 < field1451 - 1 && arg6 > 0) {
            method646(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "()V", line = 71)
    public static final void method639() {
        field1452 = null;
        field1459 = null;
        field1456 = null;
        field1460 = null;
        field1457 = null;
        field1453 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "()V", line = 80)
    public static void method640() {
        field1452 = null;
        field1453 = (int[][][]) null;
        field1459 = null;
        field1456 = null;
        field1458 = null;
        field1460 = null;
        field1457 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II[[[Lue;)V", line = 90)
    public static final void method641(int arg0, int arg1, class14[][][] arg2) {
        if (!class1.field8) {
            return;
        }
        GL var3 = class21.field377;
        class60.method504(0, 0, 20789);
        class21.method144(0);
        class21.method137();
        class21.method140(class21.field381);
        var3.glDepthMask(false);
        class21.method136(false);
        var3.glBlendFunc(774, 1);
        var3.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
        var3.glTexEnvi(8960, 34176, 34166);
        var3.glTexEnvi(8960, 34192, 770);
        label58: for (int var4 = 0; var4 < field1462; var4++) {
            class90 var5 = field1452[var4];
            if (var5.field1639 != null) {
                int var6 = 0;
                int var7 = (var5.field1614 >> 7) - var5.field1628;
                int var8 = (var5.field1614 >> 7) + var5.field1628;
                if (var8 >= class301.field5051) {
                    var8 = class301.field5051 - 1;
                }
                if (var7 < class313.field5294) {
                    var6 += class313.field5294 - var7;
                    var7 = class313.field5294;
                }
                for (int var9 = var7; var9 <= var8; var9++) {
                    short var10 = var5.field1621[var6++];
                    int var11 = (var10 >> 8) + ((var5.field1641 >> 7) - var5.field1628);
                    int var12 = (var10 & 0xFF) + var11 - 1;
                    if (var11 < class42.field797) {
                        var11 = class42.field797;
                    }
                    if (var12 >= class116.field1992) {
                        var12 = class116.field1992 - 1;
                    }
                    for (int var13 = var11; var13 <= var12; var13++) {
                        class14 var14 = arg2[var5.field1634][var13][var9];
                        if (var14 != null && var14.field223) {
                            class21.method133(201.5F - (float) var5.field1634 * 50.0F - 1.5F);
                            var3.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, var5.field1615 }, 0);
                            var5.field1639.method935();
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
        var3.glFogfv(2918, class273.field4529, 0);
        var3.glEnableClientState(32888);
        class21.method157();
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lrg;)V", line = 185)
    public static final void method642(class90 arg0) {
        if (field1462 >= 255) {
            System.out.println("Number of lights added exceeds maximum!");
        } else {
            field1452[field1462++] = arg0;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIII)V", line = 196)
    public static final void method643(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class1.field8 || field1464 == arg3 && field1454 == arg4 && field1463 == arg5 && field1465 == arg6 && field1466 == arg7) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            field1457[var8] = false;
        }
        int var9 = 0;
        int var10 = 0;
        label112: for (int var11 = arg4; var11 <= arg6; var11++) {
            label110: for (int var12 = arg5; var12 <= arg7; var12++) {
                int var13 = field1453[arg3][var11][var12];
                while (true) {
                    while (true) {
                        label96: while (true) {
                            if (var13 == 0) {
                                continue label110;
                            }
                            int var14 = (var13 & 0xFF) - 1;
                            var13 >>>= 0x8;
                            for (int var15 = 0; var15 < var10; var15++) {
                                if (field1460[var15] == var14) {
                                    continue label96;
                                }
                            }
                            for (int var16 = 0; var16 < 4; var16++) {
                                if (field1459[var16] == var14) {
                                    if (!field1457[var16]) {
                                        field1457[var16] = true;
                                        var9++;
                                        if (var9 == 4) {
                                            break label112;
                                        }
                                    }
                                    continue label96;
                                }
                            }
                            field1460[var10++] = var14;
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
                if (!field1457[var18]) {
                    field1459[var18] = field1460[var17];
                    field1457[var18] = true;
                    method644(var18, field1452[field1460[var17]], arg0, arg1, arg2);
                    break;
                }
            }
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (!field1457[var19]) {
                field1459[var19] = -1;
                method645(var19);
            }
        }
        field1464 = arg3;
        field1454 = arg4;
        field1463 = arg5;
        field1465 = arg6;
        field1466 = arg7;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILrg;III)V", line = 326)
    private static final void method644(int arg0, class90 arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 + 16384 + 4;
        GL var6 = class21.field377;
        if (!field1456[arg0]) {
            var6.glEnable(var5);
            field1456[arg0] = true;
        }
        var6.glLightf(var5, 4617, arg1.field1640);
        var6.glLightfv(var5, 4609, arg1.field1637, 0);
        field1458[0] = (float) (arg1.field1641 - arg2);
        field1458[1] = (float) (arg1.field1626 - arg3);
        field1458[2] = (float) (arg1.field1614 - arg4);
        var6.glLightfv(var5, 4611, field1458, 0);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 346)
    private static final void method645(int arg0) {
        if (field1456[arg0]) {
            field1456[arg0] = false;
            int var1 = arg0 + 16384 + 4;
            GL var2 = class21.field377;
            var2.glDisable(var1);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIII)V", line = 357)
    public static final void method646(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class1.field8 || field1464 == arg3 && field1454 == arg4 && field1463 == arg5 && field1465 == arg4 && field1466 == arg5) {
            return;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            field1457[var6] = false;
        }
        int var7 = 0;
        int var8 = field1453[arg3][arg4][arg5];
        while (true) {
            label72: while (var8 != 0) {
                int var9 = (var8 & 0xFF) - 1;
                var8 >>>= 0x8;
                for (int var10 = 0; var10 < 4; var10++) {
                    if (field1459[var10] == var9) {
                        field1457[var10] = true;
                        continue label72;
                    }
                }
                field1460[var7++] = var9;
            }
            for (int var11 = 0; var11 < var7; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    if (!field1457[var12]) {
                        field1459[var12] = field1460[var11];
                        field1457[var12] = true;
                        method644(var12, field1452[field1460[var11]], arg0, arg1, arg2);
                        break;
                    }
                }
            }
            for (int var13 = 0; var13 < 4; var13++) {
                if (!field1457[var13]) {
                    field1459[var13] = -1;
                    method645(var13);
                }
            }
            field1464 = arg3;
            field1454 = arg4;
            field1463 = arg5;
            field1465 = arg4;
            field1466 = arg5;
            return;
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "()V", line = 446)
    public static final void method647() {
        for (int var0 = 0; var0 < field1462; var0++) {
            class90 var1 = field1452[var0];
            int var2 = var1.field1634;
            if (var1.field1617) {
                var2 = 0;
            }
            int var3 = var1.field1634;
            if (var1.field1627) {
                var3 = 3;
            }
            for (int var4 = var2; var4 <= var3; var4++) {
                int var5 = 0;
                int var6 = (var1.field1614 >> 7) - var1.field1628;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = (var1.field1614 >> 7) + var1.field1628;
                if (var7 > field1455 - 1) {
                    var7 = field1455 - 1;
                }
                for (int var8 = var6; var8 <= var7; var8++) {
                    short var9 = var1.field1621[var5++];
                    int var10 = (var9 >> 8) + ((var1.field1641 >> 7) - var1.field1628);
                    int var11 = (var9 & 0xFF) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 > field1451 - 1) {
                        var11 = field1451 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; var12++) {
                        int var13 = field1453[var4][var12][var8];
                        if ((var13 & 0xFF) == 0) {
                            field1453[var4][var12][var8] = var13 | var0 + 1;
                        } else if ((var13 & 0xFF00) == 0) {
                            field1453[var4][var12][var8] = var13 | var0 + 1 << 8;
                        } else if ((var13 & 0xFF0000) == 0) {
                            field1453[var4][var12][var8] = var13 | var0 + 1 << 16;
                        } else if ((var13 & 0xFF000000) == 0) {
                            field1453[var4][var12][var8] = var13 | var0 + 1 << 24;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "()V", line = 534)
    public static final void method648() {
        field1462 = 0;
        for (int var0 = 0; var0 < field1461; var0++) {
            for (int var1 = 0; var1 < field1451; var1++) {
                for (int var2 = 0; var2 < field1455; var2++) {
                    field1453[var0][var1][var2] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)V", line = 572)
    public static final void method649(int arg0, boolean arg1) {
        for (int var2 = 0; var2 < field1462; var2++) {
            field1452[var2].method696(arg1, (byte) 26, arg0);
        }
        field1464 = -1;
        field1454 = -1;
        field1463 = -1;
        field1465 = -1;
        field1466 = -1;
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "()V", line = 587)
    public static final void method650() {
        GL var0 = class21.field377;
        for (int var1 = 0; var1 < 4; var1++) {
            int var2 = var1 + 16388;
            var0.glLightfv(var2, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            var0.glLightf(var2, 4616, 0.0F);
            var0.glLightf(var2, 4615, 0.0F);
        }
        field1452 = new class90[255];
        field1459 = new int[4];
        field1456 = new boolean[4];
        field1460 = new int[4];
        field1457 = new boolean[4];
        field1453 = new int[field1461][field1451][field1455];
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V", line = 610)
    public static final void method651(int arg0, int arg1, int arg2) {
        field1461 = arg0;
        field1451 = arg1;
        field1455 = arg2;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIII)V", line = 615)
    public static final void method652(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!class1.field8) {
            return;
        }
        label43: for (int var5 = 0; var5 < 4; var5++) {
            if (field1459[var5] != -1) {
                int var6 = field1453[arg0][arg1][arg2];
                while (var6 != 0) {
                    int var7 = (var6 & 0xFF) - 1;
                    var6 >>>= 0x8;
                    if (field1459[var5] == var7) {
                        continue label43;
                    }
                }
                int var8 = field1453[arg0][arg3][arg4];
                while (var8 != 0) {
                    int var9 = (var8 & 0xFF) - 1;
                    var8 >>>= 0x8;
                    if (field1459[var5] == var9) {
                        continue label43;
                    }
                }
            }
            field1459[var5] = -1;
            method645(var5);
        }
    }
}
