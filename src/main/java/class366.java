import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class366 extends class115 {

    @OriginalMember(owner = "client!te", name = "N", descriptor = "I")
    private int field5341 = 0;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    private int field5345 = 4096;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public static int field5338 = 0;

    @OriginalMember(owner = "client!te", name = "P", descriptor = "Z")
    public static boolean field5343 = false;

    @OriginalMember(owner = "client!te", name = "O", descriptor = "[I")
    public static int[] field5342 = new int[14];

    @OriginalMember(owner = "client!te", name = "V", descriptor = "[I")
    public static int[] field5349 = new int[2];

    @OriginalMember(owner = "client!te", name = "W", descriptor = "[I")
    public static int[] field5350 = new int[1000];

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "[I")
    public static int[] field5353 = new int[4096];

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!te", name = "S", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!te", name = "T", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!te", name = "U", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "Lgp;")
    public static class31 field5351;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLbk;I)V", line = 7)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field1347 = ~arg1.method1342((byte) -128) == -2;
                }
            } else {
                this.field5345 = arg1.method1355(32136);
            }
        } else {
            this.field5341 = arg1.method1355(32136);
        }
        ++field5352;
        if (arg0 <= 83) {
            method2315(126);
        }
    }

    @OriginalMember(owner = "client!te", name = "h", descriptor = "(I)V", line = 51)
    public static final void method2312(int arg0) {
        class43.method269((byte) 58);
        ++field5348;
        class372.field5439 = null;
        class257.field3504 = null;
        class102.field1152 = null;
        class244.field3291 = null;
        class114.field1321 = null;
        if (arg0 < 1) {
            field5343 = true;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([Ldl;ZILen;I[BZ)V", line = 67)
    public static final void method2313(class39[] arg0, boolean arg1, int arg2, class174 arg3, int arg4, byte[] arg5, boolean arg6) {
        ++field5347;
        class211 var7 = new class211(arg5);
        if (!arg6) {
            int var8 = -1;
            while (true) {
                int var9 = var7.method1347(-1063535536);
                if (~var9 == -1) {
                    return;
                }
                var8 += var9;
                int var10 = 0;
                while (true) {
                    int var11 = var7.method1376(128);
                    if (var11 == 0) {
                        break;
                    }
                    var10 += var11 + -1;
                    int var12 = 63 & var10;
                    int var13 = (4056 & var10) >> 6;
                    int var14 = var10 >> 12;
                    int var15 = var7.method1342((byte) -126);
                    int var16 = var15 >> 2;
                    int var17 = var15 & 3;
                    int var18 = arg4 + var13;
                    int var19 = arg2 + var12;
                    if (~var18 < -1 && var19 > 0 && class279.field3935 + -1 > var18 && class164.field2287 - 1 > var19) {
                        class39 var20 = null;
                        if (!arg1) {
                            int var21 = var14;
                            if (~(2 & class166.field2327[1][var18][var19]) == -3) {
                                var21 = var14 - 1;
                            }
                            if (~var21 <= -1) {
                                var20 = arg0[var21];
                            }
                        }
                        class103.method558(var14, var16, arg3, -1, var20, var14, var8, var19, var17, var18, arg1, true, -115);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V", line = 155)
    public class366() {
        super(1, false);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)[[I", line = 158)
    public final int[][] method144(int arg0, int arg1) {
        ++field5344;
        int var3 = 22 % ((-80 - arg1) / 45);
        int[][] var4 = super.field1342.method2530(arg0, (byte) 96);
        if (super.field1342.field5819) {
            int[][] var5 = this.method639((byte) 34, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; ~var12 > ~class218.field2979; ++var12) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var8[var12];
                if (~var13 <= ~this.field5341) {
                    if (var13 > this.field5345) {
                        var9[var12] = this.field5345;
                    } else {
                        var9[var12] = var13;
                    }
                } else {
                    var9[var12] = this.field5341;
                }
                if (var14 < this.field5341) {
                    var10[var12] = this.field5341;
                } else if (~this.field5345 > ~var14) {
                    var10[var12] = this.field5345;
                } else {
                    var10[var12] = var14;
                }
                if (this.field5341 <= var15) {
                    if (var15 <= this.field5345) {
                        var11[var12] = var15;
                    } else {
                        var11[var12] = this.field5345;
                    }
                } else {
                    var11[var12] = this.field5341;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!te", name = "i", descriptor = "(I)V", line = 236)
    public static final void method2314(int arg0) {
        for (class81 var1 = (class81) class310.field4420.method1124(-1); var1 != null; var1 = (class81) class310.field4420.method1119(false)) {
            if (var1.field920) {
                var1.method451(11);
            }
        }
        ++field5340;
        for (class81 var2 = (class81) class182.field2495.method1124(-1); var2 != null; var2 = (class81) class182.field2495.method1119(false)) {
            if (var2.field920) {
                var2.method451(11);
            }
        }
        if (arg0 < 87) {
            method2312(122);
        }
    }

    @OriginalMember(owner = "client!te", name = "j", descriptor = "(I)V", line = 270)
    public static void method2315(int arg0) {
        field5351 = null;
        int var1 = 100 % ((arg0 - -54) / 46);
        field5353 = null;
        field5349 = null;
        field5350 = null;
        field5342 = null;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)[I", line = 286)
    public final int[] method57(int arg0, int arg1) {
        ++field5339;
        int[] var3 = super.field1340.method14(50, arg0);
        if (arg1 != 0) {
            this.method57(-43, -77);
        }
        if (super.field1340.field35) {
            int[] var4 = this.method631(true, 0, arg0);
            for (int var5 = 0; class218.field2979 > var5; ++var5) {
                int var6 = var4[var5];
                if (var6 >= this.field5341) {
                    if (this.field5345 >= var6) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field5345;
                    }
                } else {
                    var3[var5] = this.field5341;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IBC)C", line = 328)
    public static final char method2316(int arg0, byte arg1, char arg2) {
        int var3 = 119 / ((arg1 - 62) / 42);
        ++field5346;
        if (arg2 >= 192 && arg2 <= 255) {
            if (~arg2 <= -193 && arg2 <= 198) {
                return 'A';
            }
            if (~arg2 == -200) {
                return 'C';
            }
            if (~arg2 <= -201 && ~arg2 >= -204) {
                return 'E';
            }
            if (~arg2 <= -205 && ~arg2 >= -208) {
                return 'I';
            }
            if (~arg2 == -210 && ~arg0 != -1) {
                return 'N';
            }
            if (~arg2 <= -211 && arg2 <= 214) {
                return 'O';
            }
            if (arg2 >= 217 && ~arg2 >= -221) {
                return 'U';
            }
            if (~arg2 == -222) {
                return 'Y';
            }
            if (arg2 == 223) {
                return 's';
            }
            if (arg2 >= 224 && arg2 <= 230) {
                return 'a';
            }
            if (~arg2 == -232) {
                return 'c';
            }
            if (arg2 >= 232 && arg2 <= 235) {
                return 'e';
            }
            if (arg2 >= 236 && arg2 <= 239) {
                return 'i';
            }
            if (arg2 == 241 && ~arg0 != -1) {
                return 'n';
            }
            if (~arg2 <= -243 && ~arg2 >= -247) {
                return 'o';
            }
            if (~arg2 <= -250 && ~arg2 >= -253) {
                return 'u';
            }
            if (~arg2 == -254 || arg2 == 255) {
                return 'y';
            }
        }
        if (~arg2 == -339) {
            return 'O';
        } else if (~arg2 == -340) {
            return 'o';
        } else {
            return arg2 == 376 ? 'Y' : arg2;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjf;)Z", line = 411)
    public static final boolean method2317(int arg0, class119 arg1) {
        ++field5337;
        if (arg1.field1442 == null) {
            return false;
        } else {
            int var2 = 0;
            if (arg0 != 2) {
                field5343 = false;
            }
            while (arg1.field1442.length > var2) {
                int var3 = class206.method1306(arg1, true, var2);
                int var4 = arg1.field1603[var2];
                if (arg1.field1442[var2] != 2) {
                    if (arg1.field1442[var2] != 3) {
                        if (arg1.field1442[var2] != 4) {
                            if (var3 != var4) {
                                return false;
                            }
                        } else if (~var3 == ~var4) {
                            return false;
                        }
                    } else if (~var4 <= ~var3) {
                        return false;
                    }
                } else if (var3 >= var4) {
                    return false;
                }
                ++var2;
            }
            return true;
        }
    }
}
