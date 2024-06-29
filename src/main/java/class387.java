import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class387 extends class418 {

    @OriginalMember(owner = "client!we", name = "m", descriptor = "[I")
    public int[] field5658 = new int[] { -1 };

    @OriginalMember(owner = "client!we", name = "l", descriptor = "[I")
    public int[] field5657 = new int[1];

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public static int field5664 = -1;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field5666 = 0;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "[S")
    public static short[] field5667 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public static int field5669 = 0;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5656 = "scroll:";

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)V")
    public static final void method2507(int arg0, int arg1) {
        if (arg1 != 65535) {
            field5668 = -14;
        }
        field5661++;
        class269.field3978.method379(arg0, false);
        class295.field4449.method379(arg0, false);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    public static void method2508(int arg0) {
        field5656 = null;
        if (arg0 == 128) {
            field5667 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILrj;ILtj;ZIIIILmd;)Lqb;")
    public final class257 method2509(int arg0, class436 arg1, int arg2, class298 arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, class233 arg9) {
        field5659++;
        class257 var11 = null;
        int var12 = arg5;
        class290 var13 = null;
        if (arg7 != -1) {
            var13 = class163.method1105(true, arg7);
        }
        int[] var14 = this.field5658;
        if (var13 != null && var13.field4394 != null) {
            var14 = new int[var13.field4394.length];
            for (int var15 = 0; var15 < var13.field4394.length; var15++) {
                int var16 = var13.field4394[var15];
                if (var16 >= 0 && this.field5658.length > var16) {
                    var14[var15] = this.field5658[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        int var20 = -1;
        if (arg2 != -17291) {
            this.method2509(-27, (class436) null, -25, (class298) null, false, -53, 116, -78, 40, (class233) null);
        }
        int var21 = -1;
        int var22 = 0;
        class255 var23 = null;
        class255 var24 = null;
        if (arg9 != null) {
            int var25 = arg9.field3242[arg8];
            var12 = arg5 | 0x20;
            int var26 = var25 >>> 16;
            var23 = class21.method190((byte) -115, var26);
            var20 = var25 & 0xFFFF;
            if (var23 != null) {
                var18 |= var23.method1651(var20, -26945);
                var17 |= var23.method1649(var20, 0);
                var19 |= arg9.field3236;
            }
            if ((arg9.field3237 || class361.field5345) && arg6 != -1 && arg6 < arg9.field3242.length) {
                var22 = arg9.field3248[arg8];
                int var27 = arg9.field3242[arg6];
                int var28 = var27 >>> 16;
                var21 = var27 & 0xFFFF;
                if (var26 == var28) {
                    var24 = var23;
                } else {
                    var24 = class21.method190((byte) -14, var21 >>> 16);
                }
                if (var24 != null) {
                    var18 |= var24.method1651(var21, -26945);
                    var17 |= var24.method1649(var21, 0);
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
        }
        long var29 = this.method2512(arg7, var14, arg1 == null ? null : arg1.field6340, arg4, (byte) 9);
        if (class373.field5499 != null) {
            var11 = (class257) class373.field5499.method378((byte) 28, var29);
        }
        if (var11 == null || arg3.method465(var11.method1690(), var12) != 0) {
            if (var11 != null) {
                var12 = arg3.method436(var12, var11.method1690());
            }
            int var31 = var12;
            boolean var32 = false;
            for (int var33 = 0; var33 < var14.length; var33++) {
                if (var14[var33] != -1 && !class129.method915(126, var14[var33]).method1073(-129, arg4)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class9[] var34 = new class9[var14.length];
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1) {
                    var34[var35] = class129.method915(127, var14[var35]).method1067(-11431, arg4);
                }
            }
            if (var13 != null && var13.field4369 != null) {
                for (int var36 = 0; var36 < var13.field4369.length; var36++) {
                    if (var13.field4369[var36] != null && var34[var36] != null) {
                        int var37 = var13.field4369[var36][0];
                        int var38 = var13.field4369[var36][1];
                        int var39 = var13.field4369[var36][2];
                        int var40 = var13.field4369[var36][3];
                        int var41 = var13.field4369[var36][4];
                        int var42 = var13.field4369[var36][5];
                        if (var40 != 0 || var41 != 0 || var42 != 0) {
                            var34[var36].method68(var42, (byte) 115, var41, var40);
                        }
                        if (var37 != 0 || var38 != 0 || var39 != 0) {
                            var34[var36].method58((byte) 124, var39, var37, var38);
                        }
                    }
                }
            }
            if (arg1 != null) {
                var31 = var12 | 0x2000;
            }
            class9 var43 = new class9(var34, var34.length);
            var11 = arg3.method468(var43, var31, class369.field5460, 64, 850);
            if (arg1 != null) {
                for (int var44 = 0; var44 < 5; var44++) {
                    if (class444.field6408[var44].length > arg1.field6340[var44]) {
                        var11.method1665(class452.field6566[var44], class444.field6408[var44][arg1.field6340[var44]]);
                    }
                    if (class71.field1015[var44].length > arg1.field6340[var44]) {
                        var11.method1665(class230.field3155[var44], class71.field1015[var44][arg1.field6340[var44]]);
                    }
                }
            }
            if (class373.field5499 != null) {
                var11.method1662(var12);
                class373.field5499.method367(var29, var11, true);
            }
        }
        if (arg9 == null || var23 == null) {
            return var11;
        } else {
            class257 var45 = var11.method1676((byte) 1, var12, true);
            var45.method1678(65535, var20, arg0 - 1, 0, var24, arg9.field3236, var21, var23, var22);
            return var45;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I")
    public static final int method2510(int arg0, String arg1, int arg2, String arg3) {
        field5660++;
        int var4 = arg3.length();
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = 0;
        if (arg0 >= -96) {
            field5666 = 127;
        }
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var6 - var8) || var5 > var7 - var9) {
            if ((var6 - var8) >= var4) {
                return -1;
            }
            if ((var7 - var9) >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg1.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class175.method1164(var22, 0);
            var9 = class175.method1164(var24, 0);
            char var26 = class321.method2114(var22, 1705, arg2);
            char var27 = class321.method2114(var24, 1705, arg2);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class122.method875(arg2, -242, var28) - class122.method875(arg2, -242, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var4 - var11 - 1;
                var17 = var5 - var11 - 1;
            } else {
                var17 = var11;
                var16 = var11;
            }
            char var18 = arg3.charAt(var16);
            char var19 = arg1.charAt(var17);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class122.method875(arg2, -242, var20) - class122.method875(arg2, -242, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg1.charAt(var13);
            if (var14 != var15) {
                return class122.method875(arg2, -242, var14) - class122.method875(arg2, -242, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ltj;Lkm;III)V")
    public static final void method2511(class298 arg0, class402 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class108.field1421) {
            class77 var5 = class106.field1405[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field1079 != null && var5.field1079.method107((byte) 124)) {
                arg1.method112(0, arg0, (byte) -69, 0, true, var5.field1079, 128);
            }
        }
        if (arg4 < class108.field1421) {
            class77 var6 = class106.field1405[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field1079 != null && var6.field1079.method107((byte) 122)) {
                arg1.method112(128, arg0, (byte) 120, 0, true, var6.field1079, 0);
            }
        }
        if (arg3 < class108.field1421 && arg4 < class186.field2554) {
            class77 var7 = class106.field1405[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field1079 != null && var7.field1079.method107((byte) 125)) {
                arg1.method112(128, arg0, (byte) -23, 0, true, var7.field1079, 128);
            }
        }
        if (arg3 < class108.field1421 && arg4 > 0) {
            class77 var8 = class106.field1405[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field1079 != null && var8.field1079.method107((byte) 123)) {
                arg1.method112(-128, arg0, (byte) 126, 0, true, var8.field1079, 128);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I[I[IZB)J")
    private final long method2512(int arg0, int[] arg1, int[] arg2, boolean arg3, byte arg4) {
        if (arg4 != 9) {
            this.method2509(-32, (class436) null, 117, (class298) null, false, 67, -3, -7, 16, (class233) null);
        }
        field5662++;
        long[] var6 = class420.field6106;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg0 >> 8) ^ var7) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg0 ^ var9) & 0xFFL)];
        for (int var13 = 0; var13 < arg1.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg1[var13] >> 24)) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) (((long) (arg1[var13] >> 16) ^ var17) & 0xFFL)];
            long var21 = var6[(int) (((long) (arg1[var13] >> 8) ^ var19) & 0xFFL)] ^ var19 >>> 8;
            var11 = var6[(int) ((var21 ^ (long) arg1[var13]) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg2 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg2[var14]) & 0xFFL)];
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg3 ? 1 : 0) ^ var11) & 0xFFL)];
    }
}
