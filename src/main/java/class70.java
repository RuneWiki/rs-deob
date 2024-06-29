import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class70 {

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1089 = new String[200];

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Z")
    public static boolean field1091 = false;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1096 = "Select";

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "[I")
    public static int[] field1093 = new int[25];

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "[[I")
    public static int[][] field1095 = new int[5][5000];

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "Lik;")
    public static class225 field1099;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Ljava/lang/String;")
    public String field1094;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)Lfc;")
    public static final class196 method478(int arg0, boolean arg1) {
        field1097++;
        class196 var2 = (class196) class242.field3640.method263((byte) 118, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class37.field542.method1538(class181.method1174(arg0, true), class100.method669(17477, arg0), (byte) 85);
        class196 var4 = new class196();
        var4.field2831 = arg0;
        if (var3 != null) {
            var4.method1250(new class114(var3), 11613);
        }
        var4.method1254(arg1);
        class242.field3640.method255((long) arg0, var4, (byte) -127);
        return var4;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method479(int arg0) {
        field1095 = null;
        field1099 = null;
        field1096 = null;
        if (arg0 > -62) {
            field1089 = null;
        }
        field1089 = null;
        field1093 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1092++;
        int var8 = 2048 - arg4 & 0x7FF;
        if (arg2 != 5639) {
            return;
        }
        int var9 = 2048 - arg1 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg0;
        if (var8 != 0) {
            int var13 = class18.field261[var8];
            var10 = -arg0 * var13 >> 16;
            int var14 = class18.field259[var8];
            var12 = arg0 * var14 >> 16;
        }
        if (var9 != 0) {
            int var15 = class18.field261[var9];
            var11 = var12 * var15 >> 16;
            int var16 = class18.field259[var9];
            var12 = var12 * var16 >> 16;
        }
        class30.field439 = arg1;
        class146.field2097 = arg4;
        class89.field1355 = arg7 - var11;
        class223.field3341 = arg6 - var12;
        class169.field2442 = arg3 - var10;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZLkl;)V")
    public static final void method481(boolean arg0, class114 arg1) {
        if (!arg0) {
            return;
        }
        field1100++;
        while (true) {
            while (arg1.field1673 < arg1.field1629.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method760(false) == 1) {
                    var2 = true;
                    var3 = arg1.method760(false);
                    var4 = arg1.method760(false);
                }
                int var5 = arg1.method760(false);
                int var6 = arg1.method760(false);
                int var7 = var5 * 64 - class212.field3040;
                int var8 = class63.field1009 + class54.field828 - var6 * 64 - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && var7 + 63 < class99.field1482 && class63.field1009 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && var3 * 8 + 8 > var11 && var12 >= (var4 * 8) && var4 * 8 + 8 > var12) {
                                int var13 = arg1.method760(false);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method760(!arg0);
                                        if (class76.field1175[var9][var10] == null) {
                                            class76.field1175[var9][var10] = new byte[4096];
                                        }
                                        class76.field1175[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method779(16711680);
                                        if (class228.field3421[var9][var10] == null) {
                                            class228.field3421[var9][var10] = new int[4096];
                                        }
                                        class228.field3421[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg1.method779(16711680);
                                        if (class234.field3525[var9][var10] == null) {
                                            class234.field3525[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class250 var17 = class91.method618(114, var16);
                                        if (var17.field3817 != null) {
                                            var17 = var17.method1639(-1);
                                            if (var17 == null || var17.field3811 == -1) {
                                                continue;
                                            }
                                        }
                                        class234.field3525[var9][var10][(63 - var12 << 6) + var11] = var17.field3783 + 1;
                                        class45 var18 = new class45();
                                        var18.field643 = var7;
                                        var18.field641 = var17.field3811;
                                        var18.field638 = var8;
                                        class173.field2471.method652(110, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg1.method760(!arg0);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field1673++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field1673 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field1673 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIII)V")
    public static final void method482(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= class93.field1418 && arg3 <= class254.field3857) {
            int var5 = class177.method1152(class93.field1412, class142.field2061, arg2, -47);
            int var6 = class177.method1152(class93.field1412, class142.field2061, arg4, -23);
            class75.method503(var5, var6, arg1, arg3, (byte) 115);
        }
        if (arg0 < -3) {
            field1088++;
        }
    }
}
