import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class215 {

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public int field3229 = -1;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "Z")
    public boolean field3231 = false;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public int field3227 = 5;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public int field3216 = 99;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "Z")
    public boolean field3237 = false;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "Z")
    public boolean field3236 = false;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public int field3218 = -1;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public int field3220 = 2;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public int field3228 = -1;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "Z")
    public boolean field3241 = false;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
    public int field3246 = -1;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    public int field3242 = -1;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "S")
    public static short field3234 = 256;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field3243 = new String[1000];

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "Z")
    public static boolean field3248 = false;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public int field3230;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Z")
    public static boolean field3217;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "[I")
    public int[] field3215;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "[I")
    public int[] field3219;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "[I")
    private int[] field3239;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "[Z")
    public boolean[] field3221;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "[[I")
    public int[][] field3240;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lfl;I)V")
    public static final void method1374(class248 arg0, int arg1) {
        field3225++;
        int var2 = arg0.method1563((byte) 3);
        class285.field4271 = new class49[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class285.field4271[var3] = new class49();
            class285.field4271[var3].field783 = arg0.method1563((byte) 3);
            class285.field4271[var3].field788 = arg0.method1620(66);
        }
        if (arg1 != -14376) {
            field3224 = 47;
        }
        class81.field1304 = arg0.method1563((byte) 3);
        class22.field267 = arg0.method1563((byte) 3);
        class158.field2425 = arg0.method1563((byte) 3);
        class91.field1433 = new class266[class22.field267 + 1 - class81.field1304];
        for (int var4 = 0; var4 < class158.field2425; var4++) {
            int var5 = arg0.method1563((byte) 3);
            class266 var6 = class91.field1433[var5] = new class266();
            var6.field337 = arg0.method1593((byte) 27);
            var6.field338 = arg0.method1576(arg1 - 3296);
            var6.field4013 = class81.field1304 + var5;
            var6.field4009 = arg0.method1620(34);
            var6.field4007 = arg0.method1620(88);
        }
        class141.field2062 = arg0.method1576(arg1 - 3296);
        class253.field3838 = true;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method1375(int arg0, boolean arg1, int arg2) {
        field3222++;
        if (arg0 != -32205) {
            field3217 = false;
        }
        return arg1 && arg2 >= 0 ? class97.method628(arg1, 10, arg2, arg0 + 61060) : Integer.toString(arg2);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILfk;III)Lfk;")
    public final class14 method1376(int arg0, class14 arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field3219[arg3];
        field3226++;
        int var7 = this.field3215[arg3];
        class247 var8 = class92.method587(-1, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg1.method107(true, true, true);
        }
        class247 var10 = null;
        if ((this.field3241 || class258.field3932) && arg0 != -1 && arg0 < this.field3215.length) {
            int var11 = this.field3215[arg0];
            var10 = class92.method587(-1, var11 >> 16);
            arg0 = var11 & 0xFFFF;
        }
        class247 var12 = null;
        int var13 = 0;
        class247 var14 = null;
        if (arg2 <= 126) {
            this.field3231 = true;
        }
        int var15 = 0;
        if (this.field3239 != null) {
            if (arg3 < this.field3239.length) {
                var13 = this.field3239[arg3];
                if (var13 != 65535) {
                    var12 = class92.method587(-1, var13 >> 16);
                    var13 &= 0xFFFF;
                }
            }
            if ((this.field3241 || class258.field3932) && arg0 != -1 && this.field3239.length > arg0) {
                var15 = this.field3239[arg0];
                if (var15 != 65535) {
                    var14 = class92.method587(-1, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method1557(var9, 127);
        boolean var17 = !var8.method1553(var9, 10);
        if (var12 != null) {
            var16 &= !var12.method1557(var13, 117);
            var17 &= !var12.method1553(var13, 10);
        }
        if (var10 != null) {
            var16 &= !var10.method1557(arg0, 119);
            var17 &= !var10.method1553(arg0, 10);
        }
        if (var14 != null) {
            var16 &= !var14.method1557(var15, 120);
            var17 &= !var14.method1553(var15, 10);
        }
        class14 var18 = arg1.method107(var16, var17, !this.field3237);
        var18.method105(var8, var9, var10, arg0, arg4 - 1, var6, this.field3237);
        if (var12 != null) {
            var18.method105(var12, var13, var14, var15, arg4 - 1, var6, this.field3237);
        }
        return var18;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public final void method1377(int arg0) {
        field3244++;
        if (this.field3242 == arg0) {
            if (this.field3221 == null) {
                this.field3242 = 0;
            } else {
                this.field3242 = 2;
            }
        }
        if (this.field3228 != -1) {
            return;
        }
        if (this.field3221 == null) {
            this.field3228 = 0;
        } else {
            this.field3228 = 2;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public static void method1378(int arg0) {
        if (arg0 == -1) {
            field3243 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(ILfk;III)Lfk;")
    public final class14 method1379(int arg0, class14 arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field3219[arg0];
        int var7 = this.field3215[arg0];
        class247 var8 = class92.method587(-1, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        field3232++;
        if (var8 == null) {
            return arg1.method83(true, true, true);
        }
        class247 var10 = null;
        if (arg2 != -12764) {
            return null;
        }
        if ((this.field3241 || class258.field3932) && arg4 != -1 && arg4 < this.field3215.length) {
            int var11 = this.field3215[arg4];
            var10 = class92.method587(arg2 + 12763, var11 >> 16);
            arg4 = var11 & 0xFFFF;
        }
        class14 var12;
        if (var10 == null) {
            var12 = arg1.method83(!var8.method1557(var9, 119), !var8.method1553(var9, 10), !this.field3237);
        } else {
            var12 = arg1.method83(!var8.method1557(var9, 114) & !var10.method1557(arg4, 127), !var8.method1553(var9, arg2 ^ 0xFFFFCE2E) & !var10.method1553(arg4, 10), !this.field3237);
        }
        var12.method105(var8, var9, var10, arg4, arg3 - 1, var6, this.field3237);
        return var12;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3233++;
        int var7 = class86.method565(class243.field3635, arg4, class118.field1782, 8142);
        int var8 = class86.method565(class243.field3635, arg5, class118.field1782, 8142);
        int var9 = class86.method565(class248.field3765, arg3, class163.field2505, 8142);
        int var10 = class86.method565(class248.field3765, arg1, class163.field2505, 8142);
        int var11 = class86.method565(class243.field3635, arg4 + arg0, class118.field1782, 8142);
        int var12 = class86.method565(class243.field3635, arg5 - arg0, class118.field1782, 8142);
        if (arg6 >= -76) {
            method1380(116, 39, -42, 30, -90, 40, -89);
        }
        for (int var13 = var7; var13 < var11; var13++) {
            class64.method429(class23.field284[var13], var9, (byte) 79, arg2, var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class64.method429(class23.field284[var14], var9, (byte) 115, arg2, var10);
        }
        int var15 = class86.method565(class248.field3765, arg0 + arg3, class163.field2505, 8142);
        int var16 = class86.method565(class248.field3765, arg1 - arg0, class163.field2505, 8142);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class23.field284[var17];
            class64.method429(var18, var9, (byte) 112, arg2, var15);
            class64.method429(var18, var16, (byte) 118, arg2, var10);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILfl;)V")
    private final void method1381(int arg0, int arg1, class248 arg2) {
        field3245++;
        if (arg0 == 1) {
            int var13 = arg2.method1575(false);
            this.field3219 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3219[var14] = arg2.method1575(false);
            }
            this.field3215 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field3215[var15] = arg2.method1575(false);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field3215[var16] = (arg2.method1575(false) << 16) + this.field3215[var16];
            }
        } else if (arg0 == 2) {
            this.field3218 = arg2.method1575(false);
        } else if (arg0 == 3) {
            this.field3221 = new boolean[256];
            int var11 = arg2.method1593((byte) 27);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3221[arg2.method1593((byte) 27)] = true;
            }
        } else if (arg0 == 4) {
            this.field3236 = true;
        } else if (arg0 == 5) {
            this.field3227 = arg2.method1593((byte) 27);
        } else if (arg0 == 6) {
            this.field3246 = arg2.method1575(false);
        } else if (arg0 == 7) {
            this.field3229 = arg2.method1575(false);
        } else if (arg0 == 8) {
            this.field3216 = arg2.method1593((byte) 27);
        } else if (arg0 == 9) {
            this.field3242 = arg2.method1593((byte) 27);
        } else if (arg0 == 10) {
            this.field3228 = arg2.method1593((byte) 27);
        } else if (arg0 == 11) {
            this.field3220 = arg2.method1593((byte) 27);
        } else if (arg0 == 12) {
            int var4 = arg2.method1593((byte) 27);
            this.field3239 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3239[var5] = arg2.method1575(false);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3239[var6] += arg2.method1575(false) << 16;
            }
        } else if (arg0 == 13) {
            int var7 = arg2.method1575(false);
            this.field3240 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg2.method1593((byte) 27);
                if (var9 > 0) {
                    this.field3240[var8] = new int[var9];
                    this.field3240[var8][0] = arg2.method1587(class127.method799(arg1, -117));
                    for (int var10 = 1; var10 < var9; var10++) {
                        this.field3240[var8][var10] = arg2.method1575(false);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field3237 = true;
        } else if (arg0 == 15) {
            this.field3241 = true;
        } else if (arg0 == 16) {
            this.field3231 = true;
        }
        if (arg1 != 11) {
            this.field3246 = -21;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIILfk;II)Lfk;")
    public final class14 method1382(int arg0, int arg1, int arg2, class14 arg3, int arg4, int arg5) {
        if (arg0 != 0) {
            field3247 = 32;
        }
        field3238++;
        int var7 = this.field3219[arg2];
        int var8 = this.field3215[arg2];
        class247 var9 = class92.method587(-1, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method94(true, true, true);
        }
        class247 var11 = null;
        int var12 = arg1 & 0x3;
        if ((this.field3241 || class258.field3932) && arg4 != -1 && arg4 < this.field3215.length) {
            int var13 = this.field3215[arg4];
            var11 = class92.method587(-1, var13 >> 16);
            arg4 = var13 & 0xFFFF;
        }
        class14 var14;
        if (var11 == null) {
            var14 = arg3.method94(!var9.method1557(var10, 114), !var9.method1553(var10, 10), !this.field3237);
        } else {
            var14 = arg3.method94(!var9.method1557(var10, arg0 + 127) & !var11.method1557(arg4, 116), !var9.method1553(var10, 10) & !var11.method1553(arg4, 10), !this.field3237);
        }
        if (var12 == 1) {
            var14.method101();
        } else if (var12 == 2) {
            var14.method85();
        } else if (var12 == 3) {
            var14.method97();
        }
        var14.method105(var9, var10, var11, arg4, arg5 - 1, var7, this.field3237);
        if (var12 == 1) {
            var14.method97();
        } else if (var12 == 2) {
            var14.method85();
        } else if (var12 == 3) {
            var14.method101();
        }
        return var14;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILfl;)V")
    public final void method1383(int arg0, class248 arg1) {
        while (true) {
            int var3 = arg1.method1593((byte) 27);
            if (var3 == 0) {
                if (arg0 != 24484) {
                    this.method1383(116, (class248) null);
                }
                field3223++;
                return;
            }
            this.method1381(var3, 11, arg1);
        }
    }
}
