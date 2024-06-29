import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class43 {

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Lsc;")
    public static class128 field791 = class129.method1017(false, ")4l");

    @OriginalMember(owner = "client!g", name = "j", descriptor = "Lsc;")
    public static class128 field799 = class129.method1017(false, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public static int field806 = 0;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "[Z")
    public static boolean[] field805 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Lsc;")
    public static class128 field797 = class129.method1017(false, "");

    @OriginalMember(owner = "client!g", name = "o", descriptor = "Lrc;")
    public static class121 field804 = new class121();

    @OriginalMember(owner = "client!g", name = "v", descriptor = "Lsc;")
    public static class128 field811 = class129.method1017(false, "<col=c0ff00>");

    @OriginalMember(owner = "client!g", name = "y", descriptor = "Lhe;")
    public static class54 field814 = null;

    @OriginalMember(owner = "client!g", name = "A", descriptor = "Lsc;")
    public static class128 field816 = class129.method1017(false, "T");

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public int field796;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "Lsf;")
    public static class131 field815;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Lb;")
    public static class8 field802;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "[I")
    public static int[] field798;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "[Li;")
    public static class56[] field812;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "[Li;")
    public static class56[] field813;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method304(int arg0) {
        field804 = null;
        field805 = null;
        int var1 = -45 / ((arg0 + 76) / 34);
        field816 = null;
        field813 = null;
        field812 = null;
        field811 = null;
        field798 = null;
        field815 = null;
        field814 = null;
        field799 = null;
        field791 = null;
        field802 = null;
        field797 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lv;")
    public static final class146 method305(int arg0, int arg1) {
        field807++;
        if (arg0 != -2287) {
            return null;
        }
        class146 var2 = (class146) class115.field2582.method917((long) arg1, -1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class84.field1889.method1023(arg1, 4, (byte) -35);
        class146 var4 = new class146();
        if (var3 != null) {
            var4.method1176(arg1, (byte) 106, new class86(var3));
        }
        var4.method1181((byte) 28);
        class115.field2582.method913((long) arg1, var4, (byte) -69);
        return var4;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIIBZIII)Z")
    public static final boolean method306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, boolean arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var37 = 0; var37 < 104; var37++) {
                class70.field1564[var12][var37] = 0;
                class66.field1462[var12][var37] = 99999999;
            }
        }
        class70.field1564[arg10][arg9] = 99;
        int var13 = arg10;
        class66.field1462[arg10][arg9] = 0;
        int var14 = arg9;
        field795++;
        byte var15 = 0;
        class108.field2451[var15] = arg10;
        int var38 = var15 + 1;
        class51.field1025[var15] = arg9;
        int var16 = 0;
        boolean var17 = false;
        int var18 = class108.field2451.length;
        int[][] var19 = class104.field2359[class29.field553].field457;
        while (var38 != var16) {
            var13 = class108.field2451[var16];
            var14 = class51.field1025[var16];
            var16 = (var16 + 1) % var18;
            if (arg0 == var13 && arg5 == var14) {
                var17 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class104.field2359[class29.field553].method200(arg1, arg2 - 1, 0, var14, var13, arg5, arg0)) {
                    var17 = true;
                    break;
                }
                if (arg2 < 10 && class104.field2359[class29.field553].method201((byte) -56, arg5, var13, arg1, arg2 - 1, var14, arg0)) {
                    var17 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg6 != 0 && class104.field2359[class29.field553].method199((byte) 106, arg6, var14, arg3, arg11, arg0, arg5, var13)) {
                var17 = true;
                break;
            }
            int var36 = class66.field1462[var13][var14] + 1;
            if (var13 > 0 && class70.field1564[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                class108.field2451[var38] = var13 - 1;
                class51.field1025[var38] = var14;
                class70.field1564[var13 - 1][var14] = 2;
                var38 = (var38 + 1) % var18;
                class66.field1462[var13 - 1][var14] = var36;
            }
            if (var13 < 103 && class70.field1564[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                class108.field2451[var38] = var13 + 1;
                class51.field1025[var38] = var14;
                var38 = (var38 + 1) % var18;
                class70.field1564[var13 + 1][var14] = 8;
                class66.field1462[var13 + 1][var14] = var36;
            }
            if (var14 > 0 && class70.field1564[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class108.field2451[var38] = var13;
                class51.field1025[var38] = var14 - 1;
                class70.field1564[var13][var14 - 1] = 1;
                var38 = (var38 + 1) % var18;
                class66.field1462[var13][var14 - 1] = var36;
            }
            if (var14 < 103 && class70.field1564[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class108.field2451[var38] = var13;
                class51.field1025[var38] = var14 + 1;
                var38 = (var38 + 1) % var18;
                class70.field1564[var13][var14 + 1] = 4;
                class66.field1462[var13][var14 + 1] = var36;
            }
            if (var13 > 0 && var14 > 0 && class70.field1564[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class108.field2451[var38] = var13 - 1;
                class51.field1025[var38] = var14 - 1;
                var38 = (var38 + 1) % var18;
                class70.field1564[var13 - 1][var14 - 1] = 3;
                class66.field1462[var13 - 1][var14 - 1] = var36;
            }
            if (var13 < 103 && var14 > 0 && class70.field1564[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class108.field2451[var38] = var13 + 1;
                class51.field1025[var38] = var14 - 1;
                class70.field1564[var13 + 1][var14 - 1] = 9;
                var38 = (var38 + 1) % var18;
                class66.field1462[var13 + 1][var14 - 1] = var36;
            }
            if (var13 > 0 && var14 < 103 && class70.field1564[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class108.field2451[var38] = var13 - 1;
                class51.field1025[var38] = var14 + 1;
                class70.field1564[var13 - 1][var14 + 1] = 6;
                var38 = (var38 + 1) % var18;
                class66.field1462[var13 - 1][var14 + 1] = var36;
            }
            if (var13 < 103 && var14 < 103 && class70.field1564[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class108.field2451[var38] = var13 + 1;
                class51.field1025[var38] = var14 + 1;
                class70.field1564[var13 + 1][var14 + 1] = 12;
                var38 = (var38 + 1) % var18;
                class66.field1462[var13 + 1][var14 + 1] = var36;
            }
        }
        class146.field3386 = 0;
        if (!var17) {
            if (!arg8) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg0 - var22; var23 <= arg0 + var22; var23++) {
                for (int var24 = arg5 - var22; var24 <= arg5 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class66.field1462[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg5 > var24) {
                            var25 = arg5 - var24;
                        } else if (arg5 + arg6 - 1 < var24) {
                            var25 = var24 + 1 - arg6 - arg5;
                        }
                        int var26 = 0;
                        if (var23 < arg0) {
                            var26 = arg0 - var23;
                        } else if (arg0 + arg3 - 1 < var23) {
                            var26 = var23 + 1 - arg0 - arg3;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var21 > class66.field1462[var23][var24]) {
                            var20 = var27;
                            var13 = var23;
                            var21 = class66.field1462[var23][var24];
                            var14 = var24;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg10 == var13 && arg9 == var14) {
                return false;
            }
            class146.field3386 = 1;
        }
        int var28 = -68 / ((68 - arg7) / 37);
        byte var29 = 0;
        class108.field2451[var29] = var13;
        int var39 = var29 + 1;
        class51.field1025[var29] = var14;
        int var30;
        int var31 = var30 = class70.field1564[var13][var14];
        while (arg10 != var13 || arg9 != var14) {
            if (var30 != var31) {
                var30 = var31;
                class108.field2451[var39] = var13;
                class51.field1025[var39++] = var14;
            }
            if ((var31 & 0x2) != 0) {
                var13++;
            } else if ((var31 & 0x8) != 0) {
                var13--;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            var31 = class70.field1564[var13][var14];
        }
        if (var39 > 0) {
            int var32 = var39--;
            int var33 = class108.field2451[var39];
            int var34 = class51.field1025[var39];
            if (var32 > 25) {
                var32 = 25;
            }
            if (arg4 == 0) {
                class152.field3502.method507(90, 95);
                class152.field3502.method653(var32 + var32 + 3, 0);
                class135.field3179++;
            }
            if (arg4 == 1) {
                class110.field2477++;
                class152.field3502.method507(50, 156);
                class152.field3502.method653(var32 + var32 + 14 + 3, 0);
            }
            if (arg4 == 2) {
                class152.field3502.method507(-112, 220);
                class152.field3502.method653(var32 + var32 + 3, 0);
                class19.field340++;
            }
            class152.field3502.method631(var33 + class62.field1325, (byte) 122);
            class152.field3502.method656(var34 + class66.field1482, (byte) 33);
            class66.field1490 = class108.field2451[0];
            class18.field312 = class51.field1025[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var39--;
                class152.field3502.method624(class108.field2451[var39] - var33, 255);
                class152.field3502.method661(class51.field1025[var39] - var34, true);
            }
            class152.field3502.method624(class147.field3407[82] ? 1 : 0, 255);
            return true;
        } else if (arg4 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILb;IIII)V")
    public static final void method307(int arg0, class8 arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 6093) {
            method304(71);
        }
        int var6 = arg4 * arg4 + arg5 * arg5;
        field794++;
        if (var6 <= 4225 || var6 >= 90000) {
            class94.method733(arg5, arg0, arg4, arg2, (byte) 53, arg1);
            return;
        }
        int var7 = class94.field2184 + class46.field857 & 0x7FF;
        int var8 = class114.field2564[var7];
        int var9 = var8 * 256 / (class89.field2042 + 256);
        int var10 = class114.field2557[var7];
        int var11 = var10 * 256 / (class89.field2042 + 256);
        int var12 = arg4 * var11 + arg5 * var9 >> 16;
        int var13 = arg5 * var11 - arg4 * var9 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        field802.method59(arg2 + var16 + 94 + 4 - 10, -var17 + arg0 + 83 + -20, 20, 20, 15, 15, var14, 256);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIII)V")
    public static final void method308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field810++;
        if (arg1 != -509) {
            field811 = null;
        }
        int var6 = class154.field3553.method128(arg0, arg5, arg2);
        if (var6 != 0) {
            int var7 = class154.field3553.method102(arg0, arg5, arg2, var6);
            int var8 = var7 & 0x1F;
            int var9 = var7 >> 6 & 0x3;
            int var10 = arg3;
            if (var6 > 0) {
                var10 = arg4;
            }
            int[] var11 = class156.field3581.field127;
            int var12 = (103 - arg2) * 2048 + arg5 * 4 + 24624;
            int var13 = var6 >> 14 & 0x7FFF;
            class94 var14 = class147.method1185(-2, var13);
            if (var14.field2175 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var9 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var9 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var9 == 2) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 1539] = var10;
                    } else if (var9 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1537] = var10;
                        var11[var12 + 1536 + 2] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
                if (var8 == 3) {
                    if (var9 == 0) {
                        var11[var12] = var10;
                    } else if (var9 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var9 == 2) {
                        var11[var12 + 1536 + 3] = var10;
                    } else if (var9 == 3) {
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var8 == 2) {
                    if (var9 == 3) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var9 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var9 == 1) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 512 + 3] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var9 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 2 + 1536] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    }
                }
            } else {
                class56 var15 = class97.field2264[var14.field2175];
                if (var15 != null) {
                    int var16 = (var14.field2195 * 4 - var15.field1234) / 2;
                    int var17 = (var14.field2166 * 4 - var15.field1237) / 2;
                    var15.method430(var17 + arg5 * 4 + 48, (-var14.field2195 + -arg2 + 104) * 4 - -var16 + 48);
                }
            }
        }
        int var18 = class154.field3553.method114(arg0, arg5, arg2);
        if (var18 != 0) {
            int var19 = class154.field3553.method102(arg0, arg5, arg2, var18);
            int var20 = var19 & 0x1F;
            int var21 = var18 >> 14 & 0x7FFF;
            int var22 = var19 >> 6 & 0x3;
            class94 var23 = class147.method1185(arg1 + 507, var21);
            if (var23.field2175 != -1) {
                class56 var27 = class97.field2264[var23.field2175];
                if (var27 != null) {
                    int var28 = (var23.field2166 * 4 - var27.field1237) / 2;
                    int var29 = (var23.field2195 * 4 - var27.field1234) / 2;
                    var27.method430(arg5 * 4 + var28 + 48, 48 - (-((104 - var23.field2195 + -arg2) * 4) + -var29));
                }
            } else if (var20 == 9) {
                int var24 = 15658734;
                if (var18 > 0) {
                    var24 = 15597568;
                }
                int var25 = (52736 - arg2 * 512) * 4 + arg5 * 4 + 24624;
                int[] var26 = class156.field3581.field127;
                if (var22 == 0 || var22 == 2) {
                    var26[var25 + 1536] = var24;
                    var26[var25 + 1025] = var24;
                    var26[var25 + 512 + 2] = var24;
                    var26[var25 + 3] = var24;
                } else {
                    var26[var25] = var24;
                    var26[var25 + 1 + 512] = var24;
                    var26[var25 + 1026] = var24;
                    var26[var25 + 1536 + 3] = var24;
                }
            }
        }
        int var30 = class154.field3553.method143(arg0, arg5, arg2);
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class94 var32 = class147.method1185(-2, var31);
        if (var32.field2175 == -1) {
            return;
        }
        class56 var33 = class97.field2264[var32.field2175];
        if (var33 != null) {
            int var34 = (var32.field2166 * 4 - var33.field1237) / 2;
            int var35 = (var32.field2195 * 4 - var33.field1234) / 2;
            var33.method430(arg5 * 4 + var34 + 48, var35 + 48 - -((104 - var32.field2195 + -arg2) * 4));
            return;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILje;I)V")
    public static final void method309(int arg0, class67 arg1, int arg2) {
        field792++;
        if (arg0 != 956) {
            field804 = null;
        }
        while (true) {
            class100 var3 = (class100) class27.field522.method920((byte) 86);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2304; var5++) {
                if (var3.field2320[var5] != null) {
                    if (var3.field2320[var5].field1320 == 2) {
                        var3.field2311[var5] = -5;
                    }
                    if (var3.field2320[var5].field1320 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2302[var5] != null) {
                    if (var3.field2302[var5].field1320 == 2) {
                        var3.field2311[var5] = -6;
                    }
                    if (var3.field2302[var5].field1320 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method507(-90, arg2);
            arg1.method653(0, 0);
            int var6 = arg1.field1924;
            arg1.method649(-33, var3.field2310);
            for (int var7 = 0; var7 < var3.field2304; var7++) {
                if (var3.field2311[var7] == 0) {
                    try {
                        int var8 = var3.field2317[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2320[var7].field1319;
                            int var10 = var9.getInt(null);
                            arg1.method653(0, arg0 ^ 0x3BC);
                            arg1.method649(-55, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field2320[var7].field1319;
                            var13.setInt(null, var3.field2301[var7]);
                            arg1.method653(0, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field2320[var7].field1319;
                            int var12 = var11.getModifiers();
                            arg1.method653(0, 0);
                            arg1.method649(-45, var12);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field2302[var7].field1319;
                            byte[][] var17 = var3.field2308[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg1.method653(0, 0);
                            } else if (var21 instanceof Number) {
                                arg1.method653(1, 0);
                                arg1.method651(-1070186000, ((Number) var21).longValue());
                            } else if (var21 instanceof class128) {
                                arg1.method653(2, 0);
                                arg1.method644(1965040587, (class128) var21);
                            } else {
                                arg1.method653(4, arg0 - 956);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2302[var7].field1319;
                            int var15 = var14.getModifiers();
                            arg1.method653(0, arg0 ^ 0x3BC);
                            arg1.method649(-34, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method653(-10, arg0 - 956);
                    } catch (InvalidClassException var23) {
                        arg1.method653(-11, arg0 ^ 0x3BC);
                    } catch (StreamCorruptedException var24) {
                        arg1.method653(-12, 0);
                    } catch (OptionalDataException var25) {
                        arg1.method653(-13, 0);
                    } catch (IllegalAccessException var26) {
                        arg1.method653(-14, 0);
                    } catch (IllegalArgumentException var27) {
                        arg1.method653(-15, arg0 ^ 0x3BC);
                    } catch (InvocationTargetException var28) {
                        arg1.method653(-16, 0);
                    } catch (SecurityException var29) {
                        arg1.method653(-17, arg0 ^ 0x3BC);
                    } catch (IOException var30) {
                        arg1.method653(-18, arg0 ^ 0x3BC);
                    } catch (NullPointerException var31) {
                        arg1.method653(-19, 0);
                    } catch (Exception var32) {
                        arg1.method653(-20, 0);
                    } catch (Throwable var33) {
                        arg1.method653(-21, arg0 - 956);
                    }
                } else {
                    arg1.method653(var3.field2311[var7], arg0 - 956);
                }
            }
            arg1.method634(var6, (byte) 115);
            arg1.method647(arg1.field1924 - var6, 121);
            var3.method172(-2658);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IBI)I")
    public static final int method310(int arg0, byte arg1, int arg2) {
        if (arg1 != -101) {
            return -41;
        }
        field790++;
        int var3 = arg0 * 57 + arg2;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
    public static final void method311(int arg0) {
        if (class147.field3407[98]) {
            class65.field1453 += (12 - class65.field1453) / 2;
        } else if (class147.field3407[99]) {
            class65.field1453 += (-class65.field1453 - 12) / 2;
        } else {
            class65.field1453 /= 2;
        }
        field801++;
        if (class147.field3407[96]) {
            class118.field2672 += (-class118.field2672 - 24) / 2;
        } else if (class147.field3407[97]) {
            class118.field2672 += (24 - class118.field2672) / 2;
        } else {
            class118.field2672 /= 2;
        }
        int var1 = class126.field2857 + class151.field3473.field987;
        class94.field2184 = class94.field2184 + class118.field2672 / 2 & 0x7FF;
        int var2 = class146.field3371 + class151.field3473.field975;
        if (class113.field2543 - var2 < -500 || class113.field2543 - var2 > 500 || class82.field1819 - var1 < -500 || class82.field1819 - var1 > 500) {
            class82.field1819 = var1;
            class113.field2543 = var2;
        }
        if (class82.field1819 != var1) {
            class82.field1819 += (var1 - class82.field1819) / 16;
        }
        if (class113.field2543 != var2) {
            class113.field2543 += (var2 - class113.field2543) / 16;
        }
        int var3 = class113.field2543 >> 7;
        class82.field1813 += class65.field1453 / 2;
        int var4 = class82.field1819 >> 7;
        if (arg0 != 26573) {
            method305(36, 113);
        }
        if (class82.field1813 < 128) {
            class82.field1813 = 128;
        }
        if (class82.field1813 > 383) {
            class82.field1813 = 383;
        }
        int var5 = class97.method755(class82.field1819, class29.field553, class113.field2543, 256);
        int var6 = 0;
        if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class29.field553;
                    if (var9 < 3 && (class110.field2485[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var5 - class55.field1229[var9][var7][var8];
                    if (var10 > var6) {
                        var6 = var10;
                    }
                }
            }
        }
        int var11 = var6 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class2.field30 < var11) {
            class2.field30 += (var11 - class2.field30) / 24;
        } else if (class2.field30 > var11) {
            class2.field30 += (var11 - class2.field30) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lhe;B)Z")
    public static final boolean method312(class54 arg0, byte arg1) {
        field803++;
        if (class5.field43) {
            if (class77.method561(47, arg0) != 0) {
                return false;
            }
            if (arg0.field1137 == 0) {
                return false;
            }
        }
        if (arg1 > -58) {
            method308(104, 103, 125, -12, -86, -106);
        }
        return arg0.field1141;
    }
}
