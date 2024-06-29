import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class53 extends class166 {

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "[I")
    public int[] field800 = new int[] { -1 };

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "[I")
    public int[] field813 = new int[1];

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "[I")
    public static int[] field807 = new int[128];

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public static int field804 = 0;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public static int field806 = 0;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZJ)V")
    public static final void method392(boolean arg0, long arg1) {
        field809++;
        if (arg1 == 0L) {
            return;
        }
        class184.field2849++;
        if (!arg0) {
            field808 = -27;
        }
        client.field2435.method536((byte) -104, 98);
        client.field2435.method638(arg1, !arg0);
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(B)V")
    public static void method393(byte arg0) {
        field807 = null;
        if (arg0 != 50) {
            field808 = 56;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZI)Z")
    public static final boolean method394(boolean arg0, int arg1) {
        field814++;
        if (arg0) {
            return false;
        } else if (class177.field2771[arg1]) {
            return true;
        } else if (class256.field4094.method1609(114, arg1)) {
            int var2 = class256.field4094.method1616(arg1, -12772);
            if (var2 == 0) {
                class177.field2771[arg1] = true;
                return true;
            }
            if (class193.field3052[arg1] == null) {
                class193.field3052[arg1] = new class228[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class193.field3052[arg1][var3] == null) {
                    byte[] var4 = class256.field4094.method1590(var3, (byte) -25, arg1);
                    if (var4 != null) {
                        class228 var5 = class193.field3052[arg1][var3] = new class228();
                        var5.field3480 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1525(new class88(var4), (byte) -127);
                        } else {
                            var5.method1519(91, new class88(var4));
                        }
                    }
                }
            }
            class177.field2771[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIII)V")
    public static final void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field801++;
        int var6 = arg2;
        int var7 = arg0 * arg0;
        int var8 = arg2 * arg2;
        int var9 = var8 << 1;
        int var10 = 0;
        int var11 = var7 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var7 + var9;
        int var14 = var8 - ((var12 - 1) * var11);
        int var15 = var7 << 2;
        int var16 = var8 << 2;
        int var17 = ((arg2 << 1) + arg3) * var11;
        int var18 = (var10 + 1) * var16;
        int var19 = ((var10 << 1) + 3) * var9;
        if (class90.field1568 <= arg4 && class266.field4247 >= arg4) {
            int var20 = class219.method1470(class223.field3423, arg0 + arg5, arg3 + 2, class148.field2338);
            int var21 = class219.method1470(class223.field3423, arg5 - arg0, -1, class148.field2338);
            class166.method1124(true, class154.field2406[arg4], var20, arg1, var21);
        }
        int var22 = (arg2 - 1) * var15;
        while (var6 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var19;
                    var10++;
                    var14 += var18;
                    var18 += var16;
                    var19 += var16;
                }
            }
            var6--;
            if (var14 < 0) {
                var13 += var19;
                var19 += var16;
                var10++;
                var14 += var18;
                var18 += var16;
            }
            int var23 = arg4 - var6;
            var13 += -var22;
            var22 -= var15;
            var14 += -var17;
            int var24 = arg4 + var6;
            if (class90.field1568 <= var24 && class266.field4247 >= var23) {
                int var25 = class219.method1470(class223.field3423, arg5 + var10, arg3 + 2, class148.field2338);
                int var26 = class219.method1470(class223.field3423, arg5 - var10, -1, class148.field2338);
                if (var23 >= class90.field1568) {
                    class166.method1124(true, class154.field2406[var23], var25, arg1, var26);
                }
                if (var24 <= class266.field4247) {
                    class166.method1124(true, class154.field2406[var24], var25, arg1, var26);
                }
            }
            var17 -= var15;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BLnj;)V")
    public static final void method396(byte arg0, class144 arg1) {
        field812++;
        int var2 = arg1.field2276 - class192.field2978;
        if (arg0 != 43) {
            return;
        }
        int var3 = arg1.field2210 * 128 + (arg1.method971(arg0 ^ 0xFFD4) * 64);
        int var4 = arg1.field2231 * 128 + (arg1.method971(65535) * 64);
        arg1.field2267 = 0;
        arg1.field2240 += (var3 - arg1.field2240) / var2;
        arg1.field2278 += (var4 - arg1.field2278) / var2;
        if (arg1.field2218 == 0) {
            arg1.field2257 = 1024;
        }
        if (arg1.field2218 == 1) {
            arg1.field2257 = 1536;
        }
        if (arg1.field2218 == 2) {
            arg1.field2257 = 0;
        }
        if (arg1.field2218 == 3) {
            arg1.field2257 = 512;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILig;IIIII)Lig;")
    public static final class9 method397(int arg0, class9 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field799++;
        long var7 = (long) arg6;
        class9 var9 = (class9) class42.field607.method1887(0, var7);
        if (var9 == null) {
            class234 var10 = class234.method1575(class208.field3246, arg6, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1560(64, 768, -50, -10, -50);
            class42.field607.method1886(-108, var7, var9);
        }
        int var11 = arg1.method80();
        int var12 = arg1.method94();
        int var13 = arg1.method101();
        int var14 = -115 / ((-arg0 - 24) / 47);
        int var15 = arg1.method74();
        class9 var16 = var9.method72(true, true, true);
        if (arg5 != 0) {
            var16.method88(arg5);
        }
        class54 var17 = (class54) var16;
        if (class34.method269(class240.field3892, arg3 + var13, arg2 + var11, 103) != arg4 || arg4 != class34.method269(class240.field3892, arg3 + var15, arg2 - -var12, 103)) {
            for (int var18 = 0; var18 < var17.field831; var18++) {
                var17.field816[var18] += class34.method269(class240.field3892, var17.field855[var18] + arg3, var17.field820[var18] + arg2, 103) - arg4;
            }
            var17.field818 = false;
        }
        return var16;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIB)V")
    public static final void method398(int arg0, int arg1, byte arg2) {
        field810++;
        client.field2435.method536((byte) -104, 84);
        int var3 = -38 % ((45 - arg2) / 39);
        class103.field1724++;
        client.field2435.method635(arg1, -112);
        client.field2435.method640(-122, arg0);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method399(int arg0, String arg1) {
        if (arg0 >= -118) {
            field811 = 80;
        }
        field803++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)Lpl;")
    public static final class293 method400(int arg0, int arg1, int arg2) {
        class6 var3 = class269.field4298[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field125; var4++) {
            class293 var5 = var3.field134[var4];
            if ((var5.field4618 >> 29 & 0x3L) == 2L && var5.field4616 == arg1 && var5.field4612 == arg2) {
                class58.method441(var5);
                return var5;
            }
        }
        return null;
    }
}
