import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class261 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field4210 = 0;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4214 = " from your friend list first.";

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field4220 = 0;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Ldl;")
    public static class123 field4209;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZI)Lpf;")
    public static final class287 method1786(int arg0, boolean arg1, int arg2) {
        field4222++;
        class287 var3 = (class287) class205.field3215.method665((byte) 116, (long) arg0 | (long) arg2 << 32);
        if (arg1) {
            return null;
        }
        if (var3 == null) {
            var3 = new class287(arg2, arg0);
            class205.field3215.method662(0, var3, var3.field1750);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZIIIIIIIIIII)Z")
    public static final boolean method1787(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field4213++;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class50.field695[var13][var40] = 0;
                class238.field3811[var13][var40] = 99999999;
            }
        }
        class50.field695[arg11][arg8] = 99;
        int var14 = arg11;
        class238.field3811[arg11][arg8] = 0;
        if (arg7 != 100) {
            method1790(true);
        }
        int var15 = arg8;
        byte var16 = 0;
        int var17 = 0;
        class137.field2040[var16] = arg11;
        int var41 = var16 + 1;
        class172.field2697[var16] = arg8;
        boolean var18 = false;
        int[][] var19 = class290.field4574[class276.field4398].field1125;
        label372: while (var41 != var17) {
            var15 = class172.field2697[var17];
            var14 = class137.field2040[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg5 == var14 && arg6 == var15) {
                var18 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class290.field4574[class276.field4398].method538(arg2, arg9 - 1, (byte) -43, arg4, var15, arg5, arg6, var14)) {
                    var18 = true;
                    break;
                }
                if (arg9 < 10 && class290.field4574[class276.field4398].method543(arg2, var15, arg5, arg9 - 1, var14, 1, arg4, arg6)) {
                    var18 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg3 != 0 && class290.field4574[class276.field4398].method549(arg5, arg10, arg4, var14, arg3, arg0, var15, arg6, arg7 - 93)) {
                var18 = true;
                break;
            }
            int var31 = class238.field3811[var14][var15] + 1;
            if (var14 > 0 && class50.field695[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + arg4 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if (arg4 - 1 <= var32) {
                        class137.field2040[var41] = var14 - 1;
                        class172.field2697[var41] = var15;
                        class50.field695[var14 - 1][var15] = 2;
                        class238.field3811[var14 - 1][var15] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && class50.field695[var14 + 1][var15] == 0 && (var19[arg4 + var14][var15] & 0x12C0183) == 0 && (var19[arg4 + var14][var15 + arg4 - 1] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if (arg4 - 1 <= var33) {
                        class137.field2040[var41] = var14 + 1;
                        class172.field2697[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class50.field695[var14 + 1][var15] = 8;
                        class238.field3811[var14 + 1][var15] = var31;
                        break;
                    }
                    if ((var19[arg4 + var14][var15 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var15 > 0 && class50.field695[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + arg4 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if ((arg4 - 1) <= var34) {
                        class137.field2040[var41] = var14;
                        class172.field2697[var41] = var15 - 1;
                        class50.field695[var14][var15 - 1] = 1;
                        var41 = var41 + 1 & 0xFFF;
                        class238.field3811[var14][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var34][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var15 < 102 && class50.field695[var14][var15 + 1] == 0 && (var19[var14][arg4 + var15] & 0x12C0138) == 0 && (var19[arg4 + var14 - 1][arg4 + var15] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if ((arg4 - 1) <= var35) {
                        class137.field2040[var41] = var14;
                        class172.field2697[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class50.field695[var14][var15 + 1] = 4;
                        class238.field3811[var14][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 + var35][arg4 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var14 > 0 && var15 > 0 && class50.field695[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 + arg4 - 1 - 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg4 + var14 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if (arg4 - 1 <= var36) {
                        class137.field2040[var41] = var14 - 1;
                        class172.field2697[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class50.field695[var14 - 1][var15 - 1] = 3;
                        class238.field3811[var14 - 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var36 + var15 - 1] & 0x12C013E) != 0 || (var19[var14 + var36 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 < 102 && var15 > 0 && class50.field695[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg4 + var14][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + arg4][arg4 + var15 - 1 - 1] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if ((arg4 - 1) <= var37) {
                        class137.field2040[var41] = var14 + 1;
                        class172.field2697[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class50.field695[var14 + 1][var15 - 1] = 9;
                        class238.field3811[var14 + 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 + arg4][var15 + var37 - 1] & 0x12C01E3) != 0 || (var19[var14 + var37 + 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 > 0 && var15 < 102 && class50.field695[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][arg4 + var15] & 0x12C0138) == 0 && (var19[var14][arg4 + var15] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if (var38 >= arg4 - 1) {
                        class137.field2040[var41] = var14 - 1;
                        class172.field2697[var41] = var15 + 1;
                        class50.field695[var14 - 1][var15 + 1] = 6;
                        var41 = var41 + 1 & 0xFFF;
                        class238.field3811[var14 - 1][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var38 + 1] & 0x12C013E) != 0 || (var19[var14 + var38 - 1][arg4 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 < 102 && var15 < 102 && class50.field695[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][arg4 + var15] & 0x12C0138) == 0 && (var19[var14 + arg4][var15 + arg4] & 0x12C01E0) == 0 && (var19[var14 + arg4][var15 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < arg4 - 1; var39++) {
                    if ((var19[var14 + var39 + 1][arg4 + var15] & 0x12C01F8) != 0 || (var19[arg4 + var14][var15 + var39 + 1] & 0x12C01E3) != 0) {
                        continue label372;
                    }
                }
                class137.field2040[var41] = var14 + 1;
                class172.field2697[var41] = var15 + 1;
                class50.field695[var14 + 1][var15 + 1] = 12;
                class238.field3811[var14 + 1][var15 + 1] = var31;
                var41 = var41 + 1 & 0xFFF;
            }
        }
        class177.field2768 = 0;
        if (!var18) {
            if (!arg1) {
                return false;
            }
            int var20 = 100;
            int var21 = 1000;
            byte var22 = 10;
            for (int var23 = arg5 - var22; var23 <= arg5 + var22; var23++) {
                for (int var24 = arg6 - var22; var24 <= arg6 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class238.field3811[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg5 > var23) {
                            var25 = arg5 - var23;
                        } else if (var23 > (arg5 + arg0 - 1)) {
                            var25 = var23 - (arg0 + arg5 - 1);
                        }
                        int var26 = 0;
                        if (arg6 > var24) {
                            var26 = arg6 - var24;
                        } else if (var24 > arg3 + arg6 - 1) {
                            var26 = var24 + 1 - arg3 - arg6;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var21 || var21 == var27 && var20 > class238.field3811[var23][var24]) {
                            var14 = var23;
                            var21 = var27;
                            var15 = var24;
                            var20 = class238.field3811[var23][var24];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg11 == var14 && arg8 == var15) {
                return false;
            }
            class177.field2768 = 1;
        }
        byte var28 = 0;
        class137.field2040[var28] = var14;
        int var42 = var28 + 1;
        class172.field2697[var28] = var15;
        int var29;
        int var30 = var29 = class50.field695[var14][var15];
        while (arg11 != var14 || arg8 != var15) {
            if (var29 != var30) {
                class137.field2040[var42] = var14;
                var29 = var30;
                class172.field2697[var42++] = var15;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            var30 = class50.field695[var14][var15];
        }
        if (var42 > 0) {
            class78.method525(arg12, var42, (byte) -15);
            return true;
        } else if (arg12 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static void method1788(byte arg0) {
        field4214 = null;
        field4209 = null;
        if (arg0 != 53) {
            method1793(-28, 33, -34);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[Lef;)V")
    public static final void method1789(int arg0, int arg1, class214[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class214 var5 = arg2[var3];
            if (var5 != null && var5.field3477 == arg0 && (!var5.field3360 || !client.method1041(var5))) {
                if (var5.field3447 == 0) {
                    if (!var5.field3360 && client.method1041(var5) && class56.field787 != var5) {
                        continue;
                    }
                    method1789(var5.field3474, 108, arg2);
                    if (var5.field3357 != null) {
                        method1789(var5.field3474, 71, var5.field3357);
                    }
                    class35 var6 = (class35) class2.field22.method665((byte) 127, (long) var5.field3474);
                    if (var6 != null) {
                        class66.method452(var6.field456, -111);
                    }
                }
                if (var5.field3447 == 6) {
                    if (var5.field3501 != -1 || var5.field3419 != -1) {
                        boolean var7 = class38.method298((byte) -113, var5);
                        int var8;
                        if (var7) {
                            var8 = var5.field3419;
                        } else {
                            var8 = var5.field3501;
                        }
                        if (var8 != -1) {
                            class198 var9 = class104.method688(var8, 30091);
                            if (var9 != null) {
                                var5.field3376 += class80.field1166;
                                while (var9.field3080[var5.field3408] < var5.field3376) {
                                    var5.field3376 -= var9.field3080[var5.field3408];
                                    var5.field3408++;
                                    if (var5.field3408 >= var9.field3107.length) {
                                        var5.field3408 -= var9.field3079;
                                        if (var5.field3408 < 0 || var5.field3408 >= var9.field3107.length) {
                                            var5.field3408 = 0;
                                        }
                                    }
                                    var5.field3498 = var5.field3408 + 1;
                                    if (var5.field3498 >= var9.field3107.length) {
                                        var5.field3498 -= var9.field3079;
                                        if (var5.field3498 < 0 || var5.field3498 >= var9.field3107.length) {
                                            var5.field3498 = -1;
                                        }
                                    }
                                    class55.method397(0, var5);
                                }
                            }
                        }
                    }
                    if (var5.field3437 != 0 && !var5.field3360) {
                        int var10 = var5.field3437 << 16 >> 16;
                        int var11 = var5.field3437 >> 16;
                        int var12 = class80.field1166 * var10;
                        var5.field3442 = var5.field3442 + var12 & 0x7FF;
                        int var13 = class80.field1166 * var11;
                        var5.field3400 = var5.field3400 + var13 & 0x7FF;
                        class55.method397(0, var5);
                    }
                }
            }
        }
        int var4 = -32 / ((-arg1 - 41) / 63);
        field4212++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
    public static final void method1790(boolean arg0) {
        field4211++;
        int var1 = class216.field3533;
        int var2 = class82.field1234;
        int var3 = class19.field223 - var1 - class98.field1510;
        int var4 = class99.field1542 - class135.field1960 - var2;
        if (arg0) {
            field4214 = null;
        }
        if (var2 <= 0 && var4 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class154.field2291 != null) {
                var5 = class154.field2291;
            } else if (class215.field3519 == null) {
                var5 = class2.field23.field237;
            } else {
                var5 = class215.field3519;
            }
            int var6 = 0;
            int var7 = 0;
            if (class215.field3519 == var5) {
                Insets var8 = class215.field3519.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var2 > 0) {
                var9.fillRect(var6, var7, var2, class19.field223);
            }
            if (var1 > 0) {
                var9.fillRect(var6, var7, class99.field1542, var1);
            }
            if (var4 > 0) {
                var9.fillRect(var6 + class99.field1542 - var4, var7, var4, class19.field223);
            }
            if (var3 > 0) {
                var9.fillRect(var6, class19.field223 + var7 - var3, class99.field1542, var3);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)Z")
    public static final boolean method1791(int arg0, int arg1) {
        byte var2 = 0;
        field4216++;
        byte var3 = 0;
        if (class110.field1668 == null) {
            if (class72.field1028 == null) {
                class110.field1668 = new class12(512, 512);
            } else {
                class110.field1668 = (class12) class72.field1028;
            }
            int[] var4 = class110.field1668.field152;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < 104 - var3 - 1; var7++) {
                int var21 = (var3 + 103 - var7) * 2048 + 24628;
                for (int var22 = var2 + 1; var22 < (104 - var2 - 1); var22++) {
                    if ((class35.field449[arg0][var22][var7] & 0x18) == 0) {
                        class31.method248(var4, var21, 512, arg0, var22, var7);
                    }
                    if (arg0 < 3 && (class35.field449[arg0 + 1][var22][var7] & 0x8) != 0) {
                        class31.method248(var4, var21, 512, arg0 + 1, var22, var7);
                    }
                    var21 += 4;
                }
            }
            class194.field3057 = 0;
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var9 = 0; var9 < 104; var9++) {
                    long var10 = class87.method600(class276.field4398, var2 + var8, var3 + var9);
                    if (var10 != 0L) {
                        class181 var12 = class25.method224(Integer.MAX_VALUE & (int) (var10 >>> 32), 0);
                        int var13 = var12.field2847;
                        if (var12.field2803 != null) {
                            for (int var14 = 0; var14 < var12.field2803.length; var14++) {
                                if (var12.field2803[var14] != -1) {
                                    class181 var15 = class25.method224(var12.field2803[var14], 0);
                                    if (var15.field2847 >= 0) {
                                        var13 = var15.field2847;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var13 >= 0) {
                            int var16 = var3 + var9;
                            int var17 = var2 + var8;
                            if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                                int[][] var18 = class290.field4574[class276.field4398].field1125;
                                for (int var19 = 0; var19 < 10; var19++) {
                                    int var20 = (int) (Math.random() * 4.0D);
                                    if (var20 == 0 && var17 > 0 && (var8 - 3) < var17 && (var18[var17 - 1][var16] & 0x12C0108) == 0) {
                                        var17--;
                                    }
                                    if (var20 == 1 && var17 < 103 && var8 + 3 > var17 && (var18[var17 + 1][var16] & 0x12C0180) == 0) {
                                        var17++;
                                    }
                                    if (var20 == 2 && var16 > 0 && var16 > (var9 - 3) && (var18[var17][var16 - 1] & 0x12C0102) == 0) {
                                        var16--;
                                    }
                                    if (var20 == 3 && var16 < 103 && (var9 + 3) > var16 && (var18[var17][var16 + 1] & 0x12C0120) == 0) {
                                        var16++;
                                    }
                                }
                            }
                            class249.field3991[class194.field3057] = var12.field2872;
                            class26.field362[class194.field3057] = var17 - var2;
                            class257.field4152[class194.field3057] = var16 - var3;
                            class194.field3057++;
                        }
                    }
                }
            }
        }
        int var23 = 228 - (-((int) (Math.random() * 20.0D)) - ((238 - (10 - ((int) (Math.random() * 20.0D))) << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16)));
        class110.field1668.method92();
        int var24 = (int) (Math.random() * 20.0D) + 228 << 16;
        if (arg1 <= 25) {
            method1794(29, 114, -30);
        }
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class35.field449[arg0][var2 + var26][var3 + var25] & 0x18) == 0 && !class122.method800(var2, var26, (byte) -77, var23, arg0, var25, var24, var3)) {
                    class26.field369.method513(-3);
                    return false;
                }
                if (arg0 < 3 && (class35.field449[arg0 + 1][var2 + var26][var3 + var25] & 0x8) != 0 && !class122.method800(var2, var26, (byte) -48, var23, arg0 + 1, var25, var24, var3)) {
                    class26.field369.method513(-3);
                    return false;
                }
            }
        }
        class72.field1028 = class110.field1668;
        class26.field369.method513(-3);
        class110.field1668 = null;
        return true;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIILef;)V")
    public static final void method1792(int arg0, int arg1, int arg2, class214 arg3) {
        field4215++;
        if (class245.field3920 < 2 && class66.field921 == 0 && !class45.field572) {
            return;
        }
        if (arg1 != 14471) {
            field4220 = -99;
        }
        String var4 = class125.method852((byte) 52);
        if (arg3 == null) {
            int var6 = class232.field3734.method1326(var4, arg0 + 4, arg2 + 15, 16777215, 0, class131.field1915, class142.field2090);
            class286.method1908(class232.field3734.method1309(var4) + var6, 121, arg2, arg0 + 4, 15);
            return;
        }
        class188 var5 = arg3.method1447(class68.field952, -63);
        if (var5 == null) {
            var5 = class232.field3734;
        }
        var5.method1302(var4, arg0, arg2, arg3.field3473, arg3.field3369, arg3.field3374, arg3.field3443, arg3.field3458, arg3.field3332, class131.field1915, class142.field2090, class167.field2575);
        class286.method1908(class167.field2575[2], 110, class167.field2575[1], class167.field2575[0], class167.field2575[3]);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)I")
    public static final int method1793(int arg0, int arg1, int arg2) {
        if (arg1 < 72) {
            field4217 = 20;
        }
        field4219++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(III)Lca;")
    public static final class264 method1794(int arg0, int arg1, int arg2) {
        class49 var3 = class90.field1382[arg0][arg1][arg2];
        return var3 == null ? null : var3.field631;
    }
}
