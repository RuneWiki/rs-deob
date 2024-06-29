import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class203 extends class236 {

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public int field3622;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "Lsg;")
    public static class30 field3619 = class167.method1221((byte) 33, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!le", name = "u", descriptor = "Lsg;")
    public static class30 field3621 = class167.method1221((byte) 33, "Fertigkeit: ");

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public static volatile int field3626 = 0;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "Lsg;")
    private static class30 field3623 = class167.method1221((byte) 33, "purple:");

    @OriginalMember(owner = "client!le", name = "t", descriptor = "Lsg;")
    public static class30 field3620 = field3623;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "Z")
    public static boolean field3625 = false;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "Lsg;")
    public static class30 field3628 = field3623;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "[I")
    public static int[] field3632 = new int[5];

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIILni;IZJ)Z")
    public static final boolean method1434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class20 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class87.field1790 == class242.field4333;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class209.field3759 || var24 >= class44.field1050) {
                    return false;
                }
                class195 var25 = class71.field1613[arg0][var15][var24];
                if (var25 != null && var25.field3522 >= 5) {
                    return false;
                }
            }
        }
        class35 var16 = new class35();
        var16.field863 = arg11;
        var16.field864 = arg0;
        var16.field847 = arg5;
        var16.field846 = arg6;
        var16.field852 = arg7;
        var16.field857 = arg8;
        var16.field845 = arg9;
        var16.field854 = arg1;
        var16.field856 = arg2;
        var16.field844 = arg1 + arg3 - 1;
        var16.field853 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class71.field1613[var22][var17][var20] == null) {
                        class71.field1613[var22][var17][var20] = new class195(var22, var17, var20);
                    }
                }
                class195 var23 = class71.field1613[arg0][var17][var20];
                var23.field3540[var23.field3522] = var16;
                var23.field3529[var23.field3522] = var21;
                var23.field3528 |= var21;
                var23.field3522++;
                if (var13 && client.field3801[var17][var20] != 0) {
                    var14 = client.field3801[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (client.field3801[var18][var19] == 0) {
                        client.field3801[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class276.field4812[class221.field3984++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIII)V")
    public static final void method1435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var8 = arg0 + 1;
        class194.method1405(true, class121.field2390[arg0], arg3, arg2, arg4);
        int var9 = arg5 - 1;
        class194.method1405(true, class121.field2390[arg5], arg3, arg2, arg4);
        field3624++;
        int var6 = var8;
        if (arg1 != -3256) {
            return;
        }
        while (var9 >= var6) {
            int[] var7 = class121.field2390[var6];
            var7[arg2] = var7[arg3] = arg4;
            var6++;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static void method1436(byte arg0) {
        if (arg0 > -84) {
            return;
        }
        field3628 = null;
        field3632 = null;
        field3621 = null;
        field3620 = null;
        field3623 = null;
        field3619 = null;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II)Z")
    public static final boolean method1437(int arg0, int arg1) {
        field3631++;
        if (arg0 >= -50) {
            field3626 = -68;
        }
        return ((arg1 & 0x5D7627A9) >> 30) != 0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Laa;I)V")
    public static final void method1438(class8 arg0, int arg1) {
        field3630++;
        if (arg1 != 4) {
            method1436((byte) 11);
        }
        while (true) {
            while (arg0.field146 < arg0.field124.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method63((byte) 96) == 1) {
                    var2 = true;
                    var3 = arg0.method63((byte) 72);
                    var4 = arg0.method63((byte) 119);
                }
                int var5 = arg0.method63((byte) 109);
                int var6 = arg0.method63((byte) 65);
                int var7 = var5 * 64 - class61.field1323;
                int var8 = class53.field1179 + class170.field3205 - (var6 * 64) - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && class98.field1979 > (var7 + 63) && class53.field1179 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && var3 * 8 + 8 > var11 && (var4 * 8) <= var12 && var12 < var4 * 8 + 8) {
                                int var13 = arg0.method63((byte) 102);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method63((byte) 44);
                                        if (class14.field272[var9][var10] == null) {
                                            class14.field272[var9][var10] = new byte[4096];
                                        }
                                        class14.field272[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method65((byte) 125);
                                        if (class223.field3996[var9][var10] == null) {
                                            class223.field3996[var9][var10] = new short[4096];
                                        }
                                        class223.field3996[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = ((arg0.method63((byte) 87) & 0xFF) << 16) + (arg0.method63((byte) 126) & 0xFF << 8) + (arg0.method63((byte) 60) & 0xFF);
                                        if (class252.field4444[var9][var10] == null) {
                                            class252.field4444[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class40 var17 = class195.method1415(58, var16);
                                        if (var17.field997 != null) {
                                            var17 = var17.method418((byte) 68);
                                            if (var17 == null || var17.field1000 == -1) {
                                                continue;
                                            }
                                        }
                                        class252.field4444[var9][var10][(63 - var12 << 6) + var11] = var17.field989 + 1;
                                        class239 var18 = new class239();
                                        var18.field4248 = var17.field1000;
                                        var18.field4247 = var8;
                                        var18.field4255 = var7;
                                        class236.field4221.method477(var18, (byte) 6);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg0.method63((byte) 66);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field146++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field146 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field146 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    public class203() {
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I)V")
    public class203(int arg0) {
        this.field3622 = arg0;
    }
}
