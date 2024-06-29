import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class411 extends class115 {

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "[I")
    public int[] field6200 = new int[] { -1 };

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "[I")
    public int[] field6201 = new int[1];

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Lok;")
    public static class74 field6205;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([IZ[III)J")
    private final long method2460(int[] arg0, boolean arg1, int[] arg2, int arg3, int arg4) {
        field6210++;
        long[] var6 = class256.field3476;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg3 >> 8)) & 0xFFL)];
        long var11 = var6[(int) ((var9 ^ (long) arg3) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg2.length; var13++) {
            long var17 = var6[(int) (((long) (arg2[var13] >> 24) ^ var11) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var6[(int) (((long) (arg2[var13] >> 16) ^ var17) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var6[(int) ((var19 ^ (long) (arg2[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var6[(int) ((var21 ^ (long) arg2[var13]) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg0 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg0[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg1 ? 1 : 0) ^ var11) & (long) arg4)];
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)V")
    public static void method2461(byte arg0) {
        field6205 = null;
        if (arg0 != -103) {
            method2462(null, 73);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lsm;I)V")
    public static final void method2462(class477 arg0, int arg1) {
        field6214++;
        if (arg1 != 512) {
            method2466(94, null);
        }
        if (!class495.field7350) {
            arg0.method876((byte) -96);
            class448.field6610--;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2463(int arg0, int arg1, byte arg2) {
        field6216++;
        if (arg2 != 50) {
            method2468(null, 53, null, null);
        }
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Ldc;")
    public static final class16 method2464(int arg0, int arg1) {
        field6202++;
        class16 var2 = (class16) class432.field6402.method2288((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class171.field2517.method541(arg1, 0, (byte) -122);
        class16 var4 = new class16();
        if (var3 != null) {
            var4.method192(0, new class468(var3));
        }
        var4.method196((byte) 52);
        class432.field6402.method2290((long) arg1, var4, 106);
        if (arg0 >= -37) {
            method2468(null, 124, null, null);
        }
        return var4;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
    public static final void method2465(boolean arg0) {
        for (int var1 = 0; var1 < class524.field7736.length; var1++) {
            for (int var2 = 0; var2 < class524.field7736[0].length; var2++) {
                for (int var3 = 0; var3 < class524.field7736[0][0].length; var3++) {
                    class524.field7736[var1][var2][var3] = 0;
                }
            }
        }
        if (!arg0) {
            field6211 = -104;
        }
        field6203++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method2466(int arg0, String[] arg1) {
        field6204++;
        String[] var2 = new String[arg0];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V")
    public static final void method2467(int arg0, int arg1) {
        field6206++;
        class506 var2 = class14.method185(-1304589728, arg0, 7);
        if (arg1 != 65535) {
            method2468(null, 106, null, null);
        }
        var2.method2986(-97);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lcs;ILb;Lya;)V")
    public static final void method2468(class219 arg0, int arg1, class473 arg2, class11 arg3) {
        field6208++;
        class127 var4 = arg2.method2813(-121, arg3);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method470();
        if (var5 < var4.method465()) {
            var5 = var4.method465();
        }
        byte var6 = 10;
        int var7 = arg0.field3130;
        int var8 = arg0.field3139;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg2.field6938 != null) {
            var9 = class269.field3996.method2601(class461.field6716, null, null, arg2.field6938, 0);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class461.field6716[var12];
                if (var9 - 1 > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class146.field2194.method1830(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class146.field2194.method1828() * var9 + (class146.field2194.method1827() / 2);
        }
        int var15 = var5 / 2 + arg0.field3130;
        int var16 = arg0.field3139;
        if ((class137.field2046 + var5) > var7) {
            var7 = class137.field2046;
            var15 = var5 / 2 + var10 / 2 + class137.field2046 + var6 + 5;
        } else if (class137.field2052 - var5 < var7) {
            var7 = class137.field2052 - var5;
            var15 = class137.field2052 - (var5 / 2) - var6 - (var10 / 2) - 5;
        }
        if ((class137.field2040 + var5) > var8) {
            var16 = var6 + (var5 / 2) + class137.field2040;
            var8 = class137.field2040;
        } else if (var8 > class137.field2042 - var5) {
            var16 = class137.field2042 - var11 - var5 / 2 - var6;
            var8 = class137.field2042 - var5;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg0.field3130), (double) (var8 - arg0.field3139)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method935((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        if (arg1 != -12035) {
            return;
        }
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg2.field6938 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var21 = var16 + var9 * class146.field2194.method1828() + 3;
            var20 = var18 - (-var10 - 10);
            if (arg2.field6934 != 0) {
                arg3.method67(126, var20 - var18, arg2.field6934, var18, var21 - var16, var16);
            }
            if (arg2.field6962 != 0) {
                arg3.method123(var16, false, arg2.field6962, var20 - var18, -var16 + var21, var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class461.field6716[var22];
                if (var22 < (var9 - 1)) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class146.field2194.method1829(arg3, var23, var15, var16, arg2.field6940, true);
                var16 += class146.field2194.method1828();
            }
        }
        if (arg2.field6937 == -1 && arg2.field6938 == null) {
            return;
        }
        class174 var24 = new class174(arg0);
        int var25 = var5 >> 1;
        var24.field2544 = var20;
        var24.field2541 = var21;
        var24.field2539 = var7 + var25;
        var24.field2538 = var8 - var25;
        var24.field2542 = var7 - var25;
        var24.field2535 = var19;
        var24.field2547 = var18;
        var24.field2537 = var8 + var25;
        class6.field59.method2958(var24, (byte) 41);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIZILya;Llc;IILfb;)Lt;")
    public final class398 method2469(int arg0, int arg1, int arg2, boolean arg3, int arg4, class11 arg5, class520 arg6, int arg7, int arg8, class36 arg9) {
        field6209++;
        class398 var11 = null;
        int var12 = arg8;
        class192 var13 = null;
        if (arg4 != -1) {
            var13 = class159.field2391.method383(arg4, 32);
        }
        int[] var14 = this.field6200;
        if (var13 != null && var13.field2827 != null) {
            var14 = new int[var13.field2827.length];
            for (int var15 = 0; var15 < var13.field2827.length; var15++) {
                int var16 = var13.field2827[var15];
                if (var16 >= 0 && this.field6200.length > var16) {
                    var14[var15] = this.field6200[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class41 var24 = null;
        class41 var25 = null;
        if (arg6 != null) {
            int var26 = arg6.field7630[arg7];
            var12 = arg8 | 0x20;
            int var27 = var26 >>> 16;
            var24 = class510.field7490.method571(var27, 100);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method324(var21, -1500);
                var17 |= var24.method327((byte) -52, var21);
                var20 |= var24.method326(0, var21);
                var19 |= arg6.field7634;
            }
            if ((arg6.field7647 || class522.field7688) && arg2 != -1 && arg6.field7630.length > arg2) {
                int var28 = arg6.field7630[arg2];
                var23 = arg6.field7645[arg7];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class510.field7490.method571(var22 >>> 16, 100);
                }
                if (var25 != null) {
                    var18 |= var25.method324(var22, -1500);
                    var17 |= var25.method327((byte) 61, var22);
                    var20 |= var25.method326(0, var22);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method2460(arg9 == null ? null : arg9.field477, arg3, var14, arg4, 255);
        if (class403.field6087 != null) {
            var11 = (class398) class403.field6087.method2288(var30, 0);
        }
        if (var11 == null || arg5.method160(var11.method626(), var12) != 0) {
            if (var11 != null) {
                var12 = arg5.method120(var12, var11.method626());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class164.field2437.method1749(var14[var34], -20230).method593(arg3, (byte) -80)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class118[] var35 = new class118[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class164.field2437.method1749(var14[var36], -20230).method590(0, arg3);
                }
            }
            if (var13 != null && var13.field2807 != null) {
                for (int var37 = 0; var37 < var13.field2807.length; var37++) {
                    if (var13.field2807[var37] != null && var35[var37] != null) {
                        int var38 = var13.field2807[var37][0];
                        int var39 = var13.field2807[var37][1];
                        int var40 = var13.field2807[var37][2];
                        int var41 = var13.field2807[var37][3];
                        int var42 = var13.field2807[var37][4];
                        int var43 = var13.field2807[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method892(var42, var43, var41, -102);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method888(var39, var40, var38, (byte) -118);
                        }
                    }
                }
            }
            if (arg9 != null) {
                var32 = var12 | 0x4000;
            }
            class118 var44 = new class118(var35, var35.length);
            var11 = arg5.method150(var44, var32, class164.field2434, 64, 850);
            if (arg9 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (arg9.field477[var45] < class406.field6118[var45].length) {
                        var11.method654(class328.field5124[var45], class406.field6118[var45][arg9.field477[var45]]);
                    }
                    if (class266.field3970[var45].length > arg9.field477[var45]) {
                        var11.method654(class157.field2373[var45], class266.field3970[var45][arg9.field477[var45]]);
                    }
                }
            }
            if (class403.field6087 != null) {
                var11.method602(var12);
                class403.field6087.method2290(var30, var11, 119);
            }
        }
        if (arg6 == null || var24 == null) {
            return var11;
        }
        if (arg1 > -43) {
            field6212 = -98;
        }
        class398 var46 = var11.method610((byte) 1, var12, true);
        var46.method2391(-1, arg6.field7634, var24, 0, var25, arg0 - 1, var21, var22, var23);
        return var46;
    }

    static {
        new class347("Player ", "Spieler ", "Joueur ", "Jogador ");
        field6211 = 0;
        field6213 = 0;
        field6215 = 0;
    }
}
