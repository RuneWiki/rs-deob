import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class178 {

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "[I")
    private int[] field56 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "Z")
    public boolean field57 = false;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
    public int field50 = -1;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "[Lwa;")
    public static class229[] field43 = new class229[2048];

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "[Llf;")
    public static class124[] field52 = new class124[100];

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "Loc;")
    private static class151 field44 = class137.method873(2, "Please try again)3");

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "Loc;")
    public static class151 field60 = field44;

    @OriginalMember(owner = "client!aa", name = "cb", descriptor = "I")
    public static int field61 = 0;

    @OriginalMember(owner = "client!aa", name = "kb", descriptor = "Loc;")
    public static class151 field69 = class137.method873(2, ")2");

    @OriginalMember(owner = "client!aa", name = "lb", descriptor = "I")
    public static int field70 = 0;

    @OriginalMember(owner = "client!aa", name = "ab", descriptor = "I")
    public static int field59 = 0;

    @OriginalMember(owner = "client!aa", name = "jb", descriptor = "Loc;")
    public static class151 field68 = class137.method873(2, "<col=ffffff>");

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!aa", name = "db", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!aa", name = "eb", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!aa", name = "gb", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!aa", name = "hb", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!aa", name = "ib", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "[I")
    private int[] field46;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "[S")
    private short[] field47;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "[S")
    private short[] field54;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "[S")
    private short[] field55;

    @OriginalMember(owner = "client!aa", name = "fb", descriptor = "[S")
    private short[] field64;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(B)Z")
    public final boolean method16(byte arg0) {
        field53++;
        boolean var2 = true;
        if (arg0 < 76) {
            method22(111, -67, 2, -95, 42, -101);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field56[var3] != -1 && !class57.field1137.method1187(-1, this.field56[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(B)Lai;")
    public final class10 method17(byte arg0) {
        field63++;
        class10[] var2 = new class10[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field56[var4] != -1) {
                var2[var3++] = class10.method67(class57.field1137, this.field56[var4], 0);
            }
        }
        class10 var5 = new class10(var2, var3);
        if (this.field64 != null) {
            for (int var6 = 0; var6 < this.field64.length; var6++) {
                var5.method76(this.field64[var6], this.field47[var6]);
            }
        }
        if (this.field55 != null) {
            for (int var7 = 0; var7 < this.field55.length; var7++) {
                var5.method66(this.field55[var7], this.field54[var7]);
            }
        }
        if (arg0 != -30) {
            method20(52, (byte) -49, 105, null, -85);
        }
        return var5;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILwa;B)V")
    private final void method18(int arg0, class229 arg1, byte arg2) {
        field65++;
        if (arg2 != 76) {
            field52 = null;
        }
        if (arg0 == 1) {
            this.field50 = arg1.method1475(255);
        } else if (arg0 == 2) {
            int var8 = arg1.method1475(arg2 + 179);
            this.field46 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field46[var9] = arg1.method1490((byte) 73);
            }
        } else if (arg0 == 3) {
            this.field57 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method1475(255);
            this.field64 = new short[var6];
            this.field47 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field64[var7] = (short) arg1.method1490((byte) 73);
                this.field47[var7] = (short) arg1.method1490((byte) 73);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method1475(255);
            this.field54 = new short[var4];
            this.field55 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field55[var5] = (short) arg1.method1490((byte) 73);
                this.field54[var5] = (short) arg1.method1490((byte) 73);
            }
            return;
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field56[arg0 - 60] = arg1.method1490((byte) 73);
            return;
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)Lai;")
    public final class10 method19(int arg0) {
        field58++;
        if (arg0 > -76) {
            field70 = -105;
        }
        if (this.field46 == null) {
            return null;
        }
        class10[] var2 = new class10[this.field46.length];
        for (int var3 = 0; var3 < this.field46.length; var3++) {
            var2[var3] = class10.method67(class57.field1137, this.field46[var3], 0);
        }
        class10 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class10(var2, var2.length);
        }
        if (this.field64 != null) {
            for (int var5 = 0; var5 < this.field64.length; var5++) {
                var4.method76(this.field64[var5], this.field47[var5]);
            }
        }
        if (this.field55 != null) {
            for (int var6 = 0; var6 < this.field55.length; var6++) {
                var4.method66(this.field55[var6], this.field54[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBILwd;I)V")
    public static final void method20(int arg0, byte arg1, int arg2, class232 arg3, int arg4) {
        field62++;
        class16.method131(-11903);
        class221.method1386(arg2, arg4, arg3.field4215 + arg2, arg4 - -arg3.field4216);
        if (client.field693 == 2 || client.field693 == 5) {
            class221.method1377(arg2, arg4, 0, arg3.field4145, arg3.field4218);
        } else {
            int var5 = class94.field1761 + class121.field2178 & 0x7FF;
            int var6 = 464 - class228.field3975.field4029 / 32;
            int var7 = class228.field3975.field3976 / 32 + 48;
            class216.field3775.method548(arg2, arg4, arg3.field4215, arg3.field4216, var7, var6, var5, class151.field2693 + 256, arg3.field4145, arg3.field4218);
            for (int var8 = 0; var8 < class44.field921; var8++) {
                int var41 = class74.field1432[var8] * 4 + 2 - class228.field3975.field3976 / 32;
                int var42 = class206.field3653[var8] * 4 + 2 - class228.field3975.field4029 / 32;
                class93 var43 = class5.method32((byte) 34, class116.field2099[var8]);
                if (var43.field1746 != null) {
                    var43 = var43.method591((byte) -127);
                    if (var43 == null || var43.field1708 == -1) {
                        continue;
                    }
                }
                class138.method887(var42, -100, arg3, arg4, class31.field642[var43.field1708], arg2, var41);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var37 = 0; var37 < 104; var37++) {
                    class218 var38 = class29.field615[class234.field4325][var9][var37];
                    if (var38 != null) {
                        int var39 = var9 * 4 + 2 - class228.field3975.field3976 / 32;
                        int var40 = var37 * 4 + 2 - class228.field3975.field4029 / 32;
                        class138.method887(var40, -74, arg3, arg4, class167.field3039[0], arg2, var39);
                    }
                }
            }
            for (int var10 = 0; var10 < class23.field505; var10++) {
                class203 var33 = class122.field2190[class81.field1553[var10]];
                if (var33 != null && var33.method173(2)) {
                    class67 var34 = var33.field3608;
                    if (var34 != null && var34.field1291 != null) {
                        var34 = var34.method446(arg1 ^ 0x54);
                    }
                    if (var34 != null && var34.field1300 && var34.field1318) {
                        int var35 = var33.field3976 / 32 - class228.field3975.field3976 / 32;
                        int var36 = var33.field4029 / 32 - class228.field3975.field4029 / 32;
                        class138.method887(var36, 126, arg3, arg4, class167.field3039[1], arg2, var35);
                    }
                }
            }
            for (int var11 = 0; var11 < class47.field961; var11++) {
                class20 var25 = class179.field3229[class159.field2866[var11]];
                if (var25 != null && var25.method173(arg1 + 57)) {
                    int var26 = var25.field3976 / 32 - class228.field3975.field3976 / 32;
                    int var27 = var25.field4029 / 32 - class228.field3975.field4029 / 32;
                    long var28 = var25.field416.method981(false);
                    boolean var30 = false;
                    for (int var31 = 0; var31 < class36.field758; var31++) {
                        if (class233.field4290[var31] == var28 && class9.field138[var31] != 0) {
                            var30 = true;
                            break;
                        }
                    }
                    boolean var32 = false;
                    if (class228.field3975.field444 != 0 && var25.field444 != 0 && class228.field3975.field444 == var25.field444) {
                        var32 = true;
                    }
                    if (var30) {
                        class138.method887(var27, 95, arg3, arg4, class167.field3039[3], arg2, var26);
                    } else if (var32) {
                        class138.method887(var27, -90, arg3, arg4, class167.field3039[4], arg2, var26);
                    } else {
                        class138.method887(var27, 66, arg3, arg4, class167.field3039[2], arg2, var26);
                    }
                }
            }
            class109[] var12 = class47.field967;
            for (int var13 = 0; var13 < var12.length; var13++) {
                class109 var16 = var12[var13];
                if (var16 != null && var16.field1935 != 0 && class200.field3541 % 20 < 10) {
                    if (var16.field1935 == 1 && var16.field1922 >= 0 && var16.field1922 < class122.field2190.length) {
                        class203 var17 = class122.field2190[var16.field1922];
                        if (var17 != null) {
                            int var18 = var17.field4029 / 32 - class228.field3975.field4029 / 32;
                            int var19 = var17.field3976 / 32 - class228.field3975.field3976 / 32;
                            class21.method177(var16.field1930, 5238, arg2, arg3, var18, arg4, var19);
                        }
                    }
                    if (var16.field1935 == 2) {
                        int var20 = (var16.field1934 - class232.field4188) * 4 + 2 - class228.field3975.field3976 / 32;
                        int var21 = (var16.field1928 - class64.field1255) * 4 + 2 - class228.field3975.field4029 / 32;
                        class21.method177(var16.field1930, arg1 ^ 0xFFFFEBBF, arg2, arg3, var21, arg4, var20);
                    }
                    if (var16.field1935 == 10 && var16.field1922 >= 0 && var16.field1922 < class179.field3229.length) {
                        class20 var22 = class179.field3229[var16.field1922];
                        if (var22 != null) {
                            int var23 = var22.field3976 / 32 - class228.field3975.field3976 / 32;
                            int var24 = var22.field4029 / 32 - class228.field3975.field4029 / 32;
                            class21.method177(var16.field1930, 5238, arg2, arg3, var24, arg4, var23);
                        }
                    }
                }
            }
            if (class122.field2189 != 0) {
                int var14 = class122.field2189 * 4 + 2 - class228.field3975.field3976 / 32;
                int var15 = class150.field2677 * 4 + 2 - class228.field3975.field4029 / 32;
                class138.method887(var15, arg1 ^ 0x48, arg3, arg4, class227.field3962, arg2, var14);
            }
            class221.method1375(arg3.field4215 / 2 + arg2 - 1, arg4 - -(arg3.field4216 / 2) - 1, 3, 3, 16777215);
        }
        class63.field1234[arg0] = true;
        if (arg1 != -55) {
            field69 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
    public static final void method21(boolean arg0) {
        class94.field1761 &= 0x7FF;
        int var1 = class15.field344 >> 7;
        if (!arg0) {
            method21(true);
        }
        field48++;
        if (class58.field1157 < 128) {
            class58.field1157 = 128;
        }
        int var2 = class22.field492 >> 7;
        if (class58.field1157 > 383) {
            class58.field1157 = 383;
        }
        int var3 = class195.method1225(class15.field344, class234.field4325, class22.field492, (byte) -118);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class234.field4325;
                    if (var7 < 3 && (class122.field2191[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 - class104.field1872[var7][var5][var6];
                    if (var4 < var8) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class148.field2648) {
            class148.field2648 += (var9 - class148.field2648) / 24;
        } else if (var9 < class148.field2648) {
            class148.field2648 += (var9 - class148.field2648) / 80;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIII)V")
    public static final void method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -6) {
            method26((byte) -29);
        }
        field45++;
        int var10001 = arg2 + 124;
        int var8 = arg0 + 1;
        class55.method380(arg1, var10001, class43.field887[arg0], arg4, arg3);
        int var9 = arg5 - 1;
        class55.method380(arg1, 112, class43.field887[arg5], arg4, arg3);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class43.field887[var6];
            var7[arg3] = var7[arg4] = arg1;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B[[I)V")
    public static final void method23(byte arg0, int[][] arg1) {
        if (arg0 >= -72) {
            method26((byte) -87);
        }
        class43.field887 = arg1;
        field51++;
    }

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(B)Z")
    public final boolean method24(byte arg0) {
        field67++;
        if (this.field46 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != -108) {
            field70 = 33;
        }
        for (int var3 = 0; var3 < this.field46.length; var3++) {
            if (!class57.field1137.method1187(-1, this.field46[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILwa;)V")
    public final void method25(int arg0, class229 arg1) {
        if (arg0 != 32) {
            field61 = 3;
        }
        while (true) {
            int var3 = arg1.method1475(255);
            if (var3 == 0) {
                field49++;
                return;
            }
            this.method18(var3, arg1, (byte) 76);
        }
    }

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "(B)V")
    public static void method26(byte arg0) {
        field52 = null;
        field44 = null;
        field60 = null;
        field68 = null;
        if (arg0 != 71) {
            field61 = -117;
        }
        field69 = null;
        field43 = null;
    }
}
