import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class20 {

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
    public static int[] field220 = new int[4096];

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field229;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lsc;")
    public class20 field224;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Lsc;")
    public class20 field233;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "Lwi;")
    public static class233 field230;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "[S")
    public static short[] field227;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZI)Z", line = 4)
    public static final boolean method113(boolean arg0, int arg1) {
        field223++;
        if (class354.field5626 == arg1) {
            return false;
        }
        class332.field5270 = new int[104][104];
        if (!arg0) {
            field230 = (class233) null;
        }
        class295.field4752 = new int[104][104];
        class172.field2748 = new int[104][104];
        class308.field4912 = new int[104][104];
        class267.field4476 = new int[4][13][13];
        for (int var2 = 0; var2 < 4; var2++) {
            class32.field459[var2] = new class22(104, 104);
        }
        class211.field3372 = new class327[4][104][104];
        class178.field2856 = new byte[4][104][104];
        class274.field4541 = new byte[4][104][104];
        if (class42.field607) {
            class30.method211(4, 104, 104);
            class249.method1929(104, 104);
            class235.field3904 = new class179[13][13];
        }
        class354.field5626 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V", line = 44)
    public static void method114(boolean arg0) {
        field227 = null;
        field220 = null;
        if (!arg0) {
            field229 = null;
            field230 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 60)
    public static final void method115(int arg0) {
        class173.field2768.method2327(1);
        field219++;
        if (arg0 != 104) {
            field220 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)Lka;", line = 73)
    public static final class106 method116(byte arg0, int arg1) {
        class106 var2 = (class106) class193.field3082.method2329((byte) 107, (long) arg1);
        field225++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class301.field4842.method472(arg1, 124, 32);
        class106 var4 = new class106();
        if (var3 != null) {
            var4.method821(-111, new class227(var3));
        }
        var4.method822((byte) -36);
        int var5 = -124 % ((arg0 + 57) / 56);
        class193.field3082.method2333((long) arg1, 0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([BB)V", line = 97)
    public static final void method117(byte[] arg0, byte arg1) {
        field218++;
        class227 var2 = new class227(arg0);
        var2.field3760 = arg0.length - 2;
        class301.field4845 = var2.method1765(true);
        class221.field3595 = new int[class301.field4845];
        class163.field2578 = new byte[class301.field4845][];
        class189.field3035 = new int[class301.field4845];
        class86.field1462 = new byte[class301.field4845][];
        class322.field5132 = new int[class301.field4845];
        class159.field2540 = new boolean[class301.field4845];
        class19.field211 = new int[class301.field4845];
        var2.field3760 = arg0.length - class301.field4845 * 8 - 7;
        class164.field2595 = var2.method1765(true);
        class318.field5070 = var2.method1765(true);
        int var3 = (var2.method1720((byte) -112) & 0xFF) + 1;
        for (int var4 = 0; var4 < class301.field4845; var4++) {
            class189.field3035[var4] = var2.method1765(true);
        }
        for (int var5 = 0; var5 < class301.field4845; var5++) {
            class19.field211[var5] = var2.method1765(true);
        }
        for (int var6 = 0; var6 < class301.field4845; var6++) {
            class221.field3595[var6] = var2.method1765(true);
        }
        int var7 = 0;
        int var8 = -26 % ((31 - arg1) / 37);
        while (class301.field4845 > var7) {
            class322.field5132[var7] = var2.method1765(true);
            var7++;
        }
        var2.field3760 = arg0.length + 3 - (var3 * 3) - (class301.field4845 * 8) - 7;
        class121.field2026 = new int[var3];
        for (int var9 = 1; var9 < var3; var9++) {
            class121.field2026[var9] = var2.method1736(255);
            if (class121.field2026[var9] == 0) {
                class121.field2026[var9] = 1;
            }
        }
        var2.field3760 = 0;
        for (int var10 = 0; var10 < class301.field4845; var10++) {
            int var11 = class221.field3595[var10];
            boolean var12 = false;
            int var13 = class322.field5132[var10];
            int var14 = var11 * var13;
            byte[] var15 = new byte[var14];
            byte[] var16 = new byte[var14];
            class163.field2578[var10] = var15;
            class86.field1462[var10] = var16;
            int var17 = var2.method1720((byte) -85);
            if ((var17 & 0x1) == 0) {
                for (int var23 = 0; var23 < var14; var23++) {
                    var15[var23] = var2.method1733(0);
                }
                if ((var17 & 0x2) != 0) {
                    for (int var24 = 0; var24 < var14; var24++) {
                        byte var25 = var16[var24] = var2.method1733(0);
                        var12 |= var25 != -1;
                    }
                }
            } else {
                int var18 = 0;
                label89: while (true) {
                    if (var11 <= var18) {
                        if ((var17 & 0x2) == 0) {
                            break;
                        }
                        int var20 = 0;
                        while (true) {
                            if (var11 <= var20) {
                                break label89;
                            }
                            for (int var21 = 0; var21 < var13; var21++) {
                                byte var22 = var16[var20 + (var11 * var21)] = var2.method1733(0);
                                var12 |= var22 != -1;
                            }
                            var20++;
                        }
                    }
                    for (int var19 = 0; var19 < var13; var19++) {
                        var15[var11 * var19 + var18] = var2.method1733(0);
                    }
                    var18++;
                }
            }
            class159.field2540[var10] = var12;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBIIIIIII)V", line = 260)
    public static final void method118(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field221++;
        if (class278.method2058(arg8, (byte) 4)) {
            class104.method800(arg6, -29153, arg5, -1, class163.field2587[arg8], arg2, arg0, arg4, arg3, arg7);
            int var9 = -10 % ((-arg1 - 13) / 55);
        } else if (arg2 == -1) {
            for (int var10 = 0; var10 < 100; var10++) {
                class270.field4498[var10] = true;
            }
        } else {
            class270.field4498[arg2] = true;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZILim;ZILim;B)I", line = 293)
    public static final int method119(boolean arg0, int arg1, class201 arg2, boolean arg3, int arg4, class201 arg5, byte arg6) {
        field222++;
        int var7 = class109.method838(arg2, arg4, arg5, 119, arg0);
        if (var7 != 0) {
            return arg0 ? -var7 : var7;
        } else if (arg6 < 29) {
            return -24;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var8 = class109.method838(arg2, arg1, arg5, 70, arg3);
            return arg3 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V", line = 327)
    public final void method120(int arg0) {
        field226++;
        if (this.field224 == null) {
            return;
        }
        this.field224.field233 = this.field233;
        this.field233.field224 = this.field224;
        this.field233 = null;
        this.field224 = null;
        if (arg0 < 123) {
            field227 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIII)Z", line = 347)
    public static final boolean method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field220[var0] = class92.method726(var0, -95);
        }
        field229 = new String[100];
        field228 = -1;
        field231 = 0;
        field232 = 0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBIIIIII)V", line = 389)
    public static final void method122(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field217++;
        if (arg1 <= 73) {
            method114(false);
        }
        if (class74.field1269 <= arg4 && arg5 <= class355.field5640 && class296.field4758 <= arg3 && arg6 <= class273.field4522) {
            class66.method568(arg2, arg6, arg7, arg3, arg5, arg4, 127, arg0);
        } else {
            class209.method1581(arg5, arg6, arg4, arg2, arg0, true, arg7, arg3);
        }
    }
}
