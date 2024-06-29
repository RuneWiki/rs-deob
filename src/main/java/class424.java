import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public abstract class class424 {

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "Lla;")
    public static class319 field6458 = new class319(52, 1);

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "[[I")
    public static int[][] field6464 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "Llp;")
    public static class272 field6459 = new class272(16);

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
    public static int field6465;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lni;I)V")
    public static final void method2582(class367 arg0, int arg1) {
        field6460++;
        if (arg1 != -1) {
            field6459 = null;
        }
        class538.field7879.method947(82, arg0.method2337(false));
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILqa;ILmk;ILfb;)Z")
    public static final boolean method2583(int arg0, class165 arg1, int arg2, class38 arg3, int arg4, class484 arg5) {
        field6465++;
        int var6 = Integer.MAX_VALUE;
        if (arg2 > -117) {
            field6458 = null;
        }
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg3.field576 != null) {
            var6 = (class12.field242 - class12.field239) * (arg5.field7125 + arg3.field555 - class12.field230) / (class12.field235 - class12.field230) + class12.field239;
            var8 = class12.field229 - ((arg3.field572 - (class12.field231 - arg5.field7130)) * (class12.field229 - class12.field227) / (class12.field228 - class12.field231));
            var7 = (arg3.field534 + arg5.field7125 - class12.field230) * (class12.field242 - class12.field239) / (class12.field235 - class12.field230) + class12.field239;
            var9 = class12.field229 - ((arg3.field568 + arg5.field7130 - class12.field231) * (class12.field229 - class12.field227) / (class12.field228 - class12.field231));
        }
        class341 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg3.field536 != -1) {
            if (arg5.field7131 && arg3.field564 != -1) {
                var10 = arg3.method321(true, -6858, arg1);
            } else {
                var10 = arg3.method321(false, -6858, arg1);
            }
            if (var10 != null) {
                var11 = arg5.field7133 - (var10.method302() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var12 = arg5.field7133 + (var10.method302() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                var13 = arg5.field7126 - (var10.method306() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg5.field7126 + (var10.method306() + 1 >> 1);
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class117 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg3.field550 != null) {
            var15 = class179.method1202(true, arg3.field547);
            if (var15 != null) {
                var16 = class55.field768.method565(null, class306.field4445, arg3.field550, null, (byte) 103);
                int var23 = arg5.field7126;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method718() / 2;
                } else {
                    var17 = var23 - ((var10.method306() >> 1) + var15.method719() * var16);
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class306.field4445[var24];
                    if ((var16 - 1) > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method721(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg5.field7133 + arg4 - (var18 / 2);
                var20 = var18 / 2 + arg4 + arg5.field7133;
                if (var19 < var6) {
                    var6 = var19;
                }
                var21 = var17 + arg0;
                if (var7 < var20) {
                    var7 = var20;
                }
                if (var21 < var8) {
                    var8 = var21;
                }
                var22 = arg0 + var16 * var15.method719() + var17;
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (var7 < class12.field239 || var6 > class12.field242 || var9 < class12.field227 || class12.field229 < var8) {
            return true;
        }
        if (arg3.field576 != null) {
            int[] var27 = new int[arg3.field576.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg3.field576[var28 * 2] + arg5.field7125;
                int var31 = arg3.field576[var28 * 2 + 1] + arg5.field7130;
                var27[var28 * 2] = (class12.field242 - class12.field239) * (var30 - class12.field230) / (class12.field235 - class12.field230) + class12.field239;
                var27[var28 * 2 + 1] = class12.field229 - ((var31 - class12.field231) * (class12.field229 - class12.field227) / (class12.field228 - class12.field231));
            }
            class285.method1834(arg1, var27, arg3.field573);
            for (int var29 = 0; var29 < var27.length / 2 - 1; var29++) {
                arg1.method1123(var27[var29 * 2 + 1], true, var27[var29 * 2], arg3.field542, var27[(var29 + 1) * 2 + 1], var27[var29 * 2 + 2]);
            }
            arg1.method1123(var27[var27.length - 1], true, var27[var27.length - 2], arg3.field542, var27[1], var27[0]);
        }
        if (var10 != null) {
            if (class84.field1223 > 0 && (class439.field6616 != -1 && class439.field6616 == arg5.field7129 || class390.field5956 != -1 && class390.field5956 == arg3.field571)) {
                int var32;
                if (class150.field1970 > 50) {
                    var32 = 200 - class150.field1970 * 2;
                } else {
                    var32 = class150.field1970 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg1.method1126(var10.method296() / 2 + 7, (byte) -63, arg5.field7133, var33, arg5.field7126);
                arg1.method1126(var10.method296() / 2 + 5, (byte) -48, arg5.field7133, var33, arg5.field7126);
                arg1.method1126(var10.method296() / 2 + 3, (byte) -114, arg5.field7133, var33, arg5.field7126);
                arg1.method1126(var10.method296() / 2 + 1, (byte) -43, arg5.field7133, var33, arg5.field7126);
                arg1.method1126(var10.method296() / 2, (byte) -54, arg5.field7133, var33, arg5.field7126);
            }
            var10.method2201(arg5.field7133 - (var10.method302() >> 1), arg5.field7126 - (var10.method306() >> 1));
        }
        if (arg3.field550 != null && var15 != null) {
            class325.method2026(var16, arg3, arg5, arg1, -29982, var15, var17, var18);
        }
        if (arg3.field536 != -1 || arg3.field550 != null) {
            class408 var34 = new class408(arg5);
            var34.field6195 = var19;
            var34.field6191 = var12;
            var34.field6192 = var13;
            var34.field6190 = var11;
            var34.field6196 = var21;
            var34.field6200 = var20;
            var34.field6197 = var22;
            var34.field6189 = var14;
            class372.field5663.method453((byte) 122, var34);
        }
        return false;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
    public abstract void method386(int arg0);

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V")
    public static void method2584(int arg0) {
        field6459 = null;
        field6464 = null;
        if (arg0 != 0) {
            field6464 = null;
        }
        field6458 = null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)J")
    public abstract long method385(byte arg0);

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIII[B)V")
    public static final void method2585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        field6456++;
        if (arg0 > 0 && !class152.method994(arg0, false)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class152.method994(arg2, false)) {
            int var7 = class429.method2623((byte) -43, arg4);
            int var8 = arg1;
            int var9 = arg0 < arg2 ? arg0 : arg2;
            int var10 = arg0 >> 1;
            int var11 = arg2 >> 1;
            byte[] var12 = arg6;
            byte[] var13 = new byte[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Dub(arg5, var8, arg3, arg0, arg2, 0, arg4, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg0 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var15 + var14;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            int var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = (byte) (var27 >> 2);
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                var12 = var16;
                arg0 = var10;
                arg2 = var11;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var8++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZI)Lun;")
    public static final class296 method2586(boolean arg0, int arg1) {
        field6457++;
        class296 var2 = (class296) class194.field2585.method2133((long) arg1, (byte) 30);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class418.field6372.method1281(0, arg1, 85);
        class296 var4 = new class296();
        if (!arg0) {
            method2589((byte) -87, 2, 106);
        }
        if (var3 != null) {
            var4.method1888(new class164(var3), 2);
        }
        var4.method1886(arg0);
        class194.field2585.method2131(var4, (long) arg1, false);
        return var4;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(BZLjava/lang/String;)V")
    public static final void method2587(byte arg0, boolean arg1, String arg2) {
        field6463++;
        if (arg2 == null) {
            return;
        }
        if (class243.field3404 >= 100) {
            class62.method444(119, class286.field4189.method2705((byte) 69, class257.field3556));
            return;
        }
        String var3 = class467.method2808(-1, arg2);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class243.field3404; var4++) {
            String var9 = class467.method2808(-1, class436.field6599[var4]);
            if (var9 != null && var9.equals(var3)) {
                class62.method444(65, arg2 + class455.field6844.method2705((byte) 69, class257.field3556));
                return;
            }
            if (class317.field4608[var4] != null) {
                String var10 = class467.method2808(-1, class317.field4608[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class62.method444(96, arg2 + class455.field6844.method2705((byte) 69, class257.field3556));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class454.field6834; var5++) {
            String var7 = class467.method2808(-1, class466.field6946[var5]);
            if (var7 != null && var7.equals(var3)) {
                class62.method444(82, class433.field6578.method2705((byte) 69, class257.field3556) + arg2 + class292.field4264.method2705((byte) 69, class257.field3556));
                return;
            }
            if (class64.field918[var5] != null) {
                String var8 = class467.method2808(-1, class64.field918[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class62.method444(78, class433.field6578.method2705((byte) 69, class257.field3556) + arg2 + class292.field4264.method2705((byte) 69, class257.field3556));
                    return;
                }
            }
        }
        if (class467.method2808(-1, class56.field800.field1393).equals(var3)) {
            class62.method444(99, class206.field2781.method2705((byte) 69, class257.field3556));
            return;
        }
        class487.field7210++;
        int var6 = -46 % ((arg0 + 17) / 54);
        method2582(class216.field3044, -1);
        class538.field7879.method1072((byte) 102, class436.method2652(arg2, (byte) -107) + 1);
        class538.field7879.method1071(-25643, arg2);
        class538.field7879.method1072((byte) 102, arg1 ? 1 : 0);
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(B)V")
    public static final void method2588(byte arg0) {
        field6461++;
        int var1 = 0;
        for (int var2 = 0; var2 < class398.field6071; var2++) {
            for (int var4 = 0; var4 < class528.field7734; var4++) {
                if (class470.method2820(var1, class443.field6672, var4, var2, true, -14646)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        int var3 = 76 / ((arg0 - 58) / 62);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(BII)Z")
    public static final boolean method2589(byte arg0, int arg1, int arg2) {
        field6462++;
        if (arg0 != -23) {
            field6459 = null;
        }
        return class221.method1491(arg2, arg1, (byte) 122) & class533.method3153(2048, arg2, arg1);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)I")
    public abstract int method383(int arg0, int arg1);

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)I")
    public static final int method2590(int arg0, int arg1) {
        field6455++;
        if (arg0 == 2) {
            int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
            int var3 = arg1 * 6 - 61440;
            int var4 = (arg1 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        } else {
            return 31;
        }
    }
}
