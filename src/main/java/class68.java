import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class68 extends class222 {

    @OriginalMember(owner = "client!ta", name = "X", descriptor = "Z")
    public static boolean field1083 = false;

    @OriginalMember(owner = "client!ta", name = "W", descriptor = "Z")
    public static boolean field1082 = true;

    @OriginalMember(owner = "client!ta", name = "ab", descriptor = "[I")
    public static int[] field1086 = new int[2000];

    @OriginalMember(owner = "client!ta", name = "bb", descriptor = "I")
    public static int field1087 = 0;

    @OriginalMember(owner = "client!ta", name = "lb", descriptor = "Lsb;")
    public static class98 field1097 = class47.method368("Stufe)2", 0);

    @OriginalMember(owner = "client!ta", name = "cb", descriptor = "I")
    public static int field1088 = 0;

    @OriginalMember(owner = "client!ta", name = "kb", descriptor = "Lsb;")
    public static class98 field1096 = class47.method368("", 0);

    @OriginalMember(owner = "client!ta", name = "nb", descriptor = "I")
    public static int field1099 = 0;

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!ta", name = "Z", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!ta", name = "db", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!ta", name = "eb", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!ta", name = "fb", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!ta", name = "gb", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!ta", name = "hb", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!ta", name = "ib", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!ta", name = "jb", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!ta", name = "mb", descriptor = "[Luc;")
    private class10[] field1098;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([[II)V")
    private final void method472(int[][] arg0, int arg1) {
        ++field1091;
        int var3 = class13.field253;
        int var4 = class20.field373;
        class250.method1734((byte) -114, arg0);
        class229.method1577(class162.field2924, arg1, 0, arg1 ^ 286331153, class191.field3299);
        if (this.field1098 != null) {
            for (int var5 = 0; this.field1098.length > var5; ++var5) {
                class10 var6 = this.field1098[var5];
                int var7 = var6.field216;
                int var8 = var6.field211;
                if (~var7 > -1) {
                    if (var8 >= 0) {
                        var6.method101(var3, true, var4);
                    }
                } else if (var8 < 0) {
                    var6.method94(var3, var4, -1);
                } else {
                    var6.method102(var3, false, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field1090;
        int[] var3 = super.field3844.method22(0, arg1);
        if (super.field3844.field61) {
            this.method472(super.field3844.method17(-12433), 0);
        }
        if (arg0 < 35) {
            field1099 = 43;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(II)[[I")
    public final int[][] method4(int arg0, int arg1) {
        ++field1095;
        int[][] var3 = super.field3834.method627(4103, arg0);
        if (arg1 != 1) {
            return null;
        } else {
            if (super.field3834.field1486) {
                int var4 = class20.field373;
                int var5 = class13.field253;
                int[][][] var6 = super.field3834.method626(-74);
                int[][] var7 = new int[var4][var5];
                this.method472(var7, 0);
                for (int var8 = 0; ~var8 > ~class20.field373; ++var8) {
                    int[] var9 = var7[var8];
                    int[][] var10 = var6[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; ~var14 > ~class13.field253; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class214.method1427(var15 << 4, 4080);
                        var12[var14] = class214.method1427(65280, var15) >> 4;
                        var11[var14] = class214.method1427(4080, var15 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(BI)I")
    public static final int method473(byte arg0, int arg1) {
        ++field1085;
        if (arg0 <= 29) {
            method473((byte) 124, 60);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field1088 = -96;
        }
        ++field1093;
        if (arg2 == 0) {
            this.field1098 = new class10[arg0.method1446(5350)];
            for (int var4 = 0; ~this.field1098.length < ~var4; ++var4) {
                int var5 = arg0.method1446(5350);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field1098[var4] = class60.method434((byte) 76, arg0);
                            }
                        } else {
                            this.field1098[var4] = class227.method1567(arg0, 11777);
                        }
                    } else {
                        this.field1098[var4] = class56.method415(false, arg0);
                    }
                } else {
                    this.field1098[var4] = class12.method110(arg0, 1);
                }
            }
        } else if (arg2 == 1) {
            super.field3842 = ~arg0.method1446(5350) == -2;
        }
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(B)V")
    public static void method474(byte arg0) {
        field1086 = null;
        int var1 = -15 / ((18 - arg0) / 59);
        field1096 = null;
        field1097 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsc;IIIII)V")
    public static final void method475(class119 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; ++var11) {
            if (class228.field3920 != var11) {
                for (int var12 = var7; var12 <= var8; ++var12) {
                    if (var12 >= 0 && var12 < class211.field3610) {
                        for (int var13 = var9; var13 <= var10; ++var13) {
                            if (var13 >= 0 && var13 < class72.field1194 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class71 var14 = class31.field553[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class78.field1393[var11][var12 + 1][var13] + class78.field1393[var11][var12][var13] + class78.field1393[var11][var12][var13 + 1] + class78.field1393[var11][var12 + 1][var13 + 1]) / 4 - (class78.field1393[arg1][arg2 + 1][arg3] + class78.field1393[arg1][arg2][arg3] + class78.field1393[arg1][arg2][arg3 + 1] + class78.field1393[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class225 var16 = var14.field1141;
                                    if (var16 != null) {
                                        if (var16.field3880.method881()) {
                                            arg0.method880(var16.field3880, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3878 != null && var16.field3878.method881()) {
                                            arg0.method880(var16.field3878, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field1149; ++var17) {
                                        class14 var18 = var14.field1140[var17];
                                        if (var18 != null && var18.field273.method881() && (var18.field268 == var12 || var7 == var12) && (var18.field256 == var13 || var9 == var13)) {
                                            int var19 = var18.field255 - var18.field268 + 1;
                                            int var20 = var18.field277 - var18.field256 + 1;
                                            arg0.method880(var18.field273, (var18.field268 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field256 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                --var7;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class68() {
        super(0, true);
    }
}
