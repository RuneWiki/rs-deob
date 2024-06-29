import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class201 {

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lub;")
    private class20 field2330;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "Loa;")
    private class650 field2345;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field2346 = 1;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field2350;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ta", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field2351;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/lang/String;)V")
    private final void method1161(byte arg0, String arg1) {
        field2339++;
        int var3 = -55 / ((arg0 + 71) / 47);
        try {
            if (arg1.startsWith("col=")) {
                class531.field6701 = class531.field6701 & 0xFF000000 | class410.method2303(arg1.substring(4), (byte) -103, 16) & 0xFFFFFF;
            } else if (arg1.equals("/col")) {
                class531.field6701 = class531.field6701 & 0xFF000000 | class93.field1187 & 0xFFFFFF;
            }
            if (arg1.startsWith("argb=")) {
                class531.field6701 = class410.method2303(arg1.substring(5), (byte) -103, 16);
            } else if (arg1.equals("/argb")) {
                class531.field6701 = class93.field1187;
            } else if (arg1.startsWith("str=")) {
                class680.field9254 = class531.field6701 & 0xFF000000 | class410.method2303(arg1.substring(4), (byte) -103, 16);
            } else if (arg1.equals("str")) {
                class680.field9254 = class531.field6701 & 0xFF000000 | 0x800000;
            } else if (arg1.equals("/str")) {
                class680.field9254 = -1;
            } else if (arg1.startsWith("u=")) {
                class522.field6581 = class531.field6701 & 0xFF000000 | class410.method2303(arg1.substring(2), (byte) -103, 16);
            } else if (arg1.equals("u")) {
                class522.field6581 = class531.field6701 & 0xFF000000;
            } else if (arg1.equals("/u")) {
                class522.field6581 = -1;
                return;
            } else if (arg1.equalsIgnoreCase("shad=-1")) {
                class313.field3934 = 0;
                return;
            } else if (arg1.startsWith("shad=")) {
                class313.field3934 = class531.field6701 & 0xFF000000 | class410.method2303(arg1.substring(5), (byte) -103, 16);
                return;
            } else if (arg1.equals("shad")) {
                class313.field3934 = class531.field6701 & 0xFF000000;
                return;
            } else if (arg1.equals("/shad")) {
                class313.field3934 = class640.field8666;
                return;
            } else if (arg1.equals("br")) {
                this.method1169(class640.field8666, (byte) -114, class93.field1187);
                return;
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZILjava/lang/String;III)V")
    public final void method1162(boolean arg0, int arg1, String arg2, int arg3, int arg4, int arg5) {
        field2349++;
        if (arg2 == null) {
            return;
        }
        this.method1169(arg4, (byte) -112, arg3);
        this.method1170(null, arg2, 0, 303995976, arg1 - this.field2330.method127(arg2, (byte) -24) / 2, null, arg5, null, 0);
        if (!arg0) {
            this.field2330 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILjava/lang/String;II)V")
    public final void method1163(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
        field2338++;
        if (arg3 != null) {
            this.method1169(arg4, (byte) -116, arg0);
            int var7 = 95 / ((25 - arg1) / 61);
            this.method1170(null, arg3, 0, 303995976, arg5 - this.field2330.method127(arg3, (byte) -67), null, arg2, null, 0);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/lang/String;I)V")
    private final void method1164(byte arg0, String arg1, int arg2) {
        field2333++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; arg1.length() > var6; var6++) {
            char var8 = arg1.charAt(var6);
            if (var8 == '<') {
                var5 = true;
            } else if (var8 == '>') {
                var5 = false;
            } else if (!var5 && var8 == ' ') {
                var4++;
            }
        }
        int var7 = 109 % ((arg0 + 22) / 44);
        if (var4 > 0) {
            class109.field1367 = (arg2 - this.field2330.method127(arg1, (byte) -126) << 8) / var4;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BIIIILjava/lang/String;)V")
    public final void method1165(byte arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        field2340++;
        if (arg5 == null) {
            return;
        }
        this.method1169(arg4, (byte) -90, arg2);
        this.method1170(null, arg5, 0, 303995976, arg3, null, arg1, null, 0);
        if (arg0 != -32) {
            this.method1162(false, -7, null, 68, 25, 116);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIBII)V")
    public static final void method1166(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class660.field8966 = arg4;
        class522.field6611 = arg3;
        int var5 = -29 % ((arg2 + 21) / 57);
        field2334++;
        class270.field3419 = arg1;
        class704.field9857 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
    public final void method1167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, int arg7) {
        field2341++;
        if (arg6 == null) {
            return;
        }
        this.method1169(arg0, (byte) -76, arg1);
        double var9 = 7.0D - (double) arg5 / 8.0D;
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg6.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg3));
        }
        this.method1178(null, null, arg6, var12, arg2 - this.field2330.method127(arg6, (byte) -73) / arg4, arg7, (byte) 89, null);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIILjava/lang/String;IIB)V")
    public final void method1168(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5, byte arg6) {
        field2342++;
        if (arg3 == null) {
            return;
        }
        this.method1169(arg5, (byte) -88, arg4);
        int var8 = arg3.length();
        int[] var9 = new int[var8];
        int[] var10 = new int[var8];
        for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 5.0D) * 5.0D);
            var10[var11] = (int) (Math.sin((double) arg0 / 5.0D + (double) var11 / 3.0D) * 5.0D);
        }
        if (arg6 != 78) {
            field2346 = -114;
        }
        this.method1178(null, var9, arg3, var10, arg2 - this.field2330.method127(arg3, (byte) -85) / 2, arg1, (byte) 89, null);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBI)V")
    private final void method1169(int arg0, byte arg1, int arg2) {
        if (arg0 == -1) {
            arg0 = 0;
        }
        class97.field1257 = 0;
        if (arg1 >= -75) {
            this.field2345 = null;
        }
        class93.field1187 = arg2;
        class531.field6701 = arg2;
        class522.field6581 = -1;
        class109.field1367 = 0;
        class680.field9254 = -1;
        field2331++;
        class640.field8666 = arg0;
        class313.field3934 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lxa;Ljava/lang/String;IIILfa;I[II)V")
    private final void method1170(class468[] arg0, String arg1, int arg2, int arg3, int arg4, class219 arg5, int arg6, int[] arg7, int arg8) {
        int var10 = arg6 - this.field2330.field215;
        field2350++;
        if (arg3 != 303995976) {
            this.field2345 = null;
        }
        int var11 = -1;
        int var12 = -1;
        int var13 = arg1.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class648.method3614(arg1.charAt(var14), (byte) -97) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg1.substring(var11 + 1, var14);
                    var11 = -1;
                    if (var16.equals("lt")) {
                        var15 = '<';
                    } else if (var16.equals("gt")) {
                        var15 = '>';
                    } else if (var16.equals("nbsp")) {
                        var15 = ' ';
                    } else if (var16.equals("shy")) {
                        var15 = '\u00AD';
                    } else if (var16.equals("times")) {
                        var15 = '×';
                    } else if (var16.equals("euro")) {
                        var15 = '€';
                    } else if (var16.equals("copy")) {
                        var15 = '©';
                    } else {
                        if (!var16.equals("reg")) {
                            if (var16.startsWith("img=")) {
                                try {
                                    int var17 = class504.method2750(var16.substring(4), 10);
                                    class468 var18 = arg0[var17];
                                    int var19 = arg7 == null ? var18.method1549() : arg7[var17];
                                    if ((class531.field6701 & 0xFF000000) == -16777216) {
                                        var18.method1543(arg4, this.field2330.field215 + var10 - var19, 1, 0, 1);
                                    } else {
                                        var18.method1543(arg4, var10 + this.field2330.field215 - var19, 0, class531.field6701 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    arg4 += arg0[var17].method1552();
                                    var12 = -1;
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method1161((byte) 85, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg4 += this.field2330.method121(9603, var12, var15);
                    }
                    if (var15 == ' ') {
                        if (class109.field1367 > 0) {
                            class97.field1257 += class109.field1367;
                            arg4 += class97.field1257 >> 8;
                            class97.field1257 &= 0xFF;
                        }
                    } else if (arg5 == null) {
                        if ((class313.field3934 & 0xFF000000) != 0) {
                            this.method53(var15, arg4 + 1, var10 + 1, class313.field3934, true);
                        }
                        this.method53(var15, arg4, var10, class531.field6701, false);
                    } else {
                        if ((class313.field3934 & 0xFF000000) != 0) {
                            this.method55(var15, arg4 + 1, var10 + 1, class313.field3934, true, arg5, arg2, arg8);
                        }
                        this.method55(var15, arg4, var10, class531.field6701, false, arg5, arg2, arg8);
                    }
                    int var20 = this.field2330.method128(var15, 126);
                    if (class680.field9254 != -1) {
                        this.field2345.method3634(class680.field9254, var20, arg4, (int) ((double) this.field2330.field215 * 0.7D) + var10, 45365);
                    }
                    if (class522.field6581 != -1) {
                        this.field2345.method3634(class522.field6581, var20, arg4, var10 + this.field2330.field215 + 1, 45365);
                    }
                    arg4 += var20;
                    var12 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
    public final void method1171(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field2337++;
        if (arg5 == null) {
            return;
        }
        if (arg2 != 5) {
            this.field2345 = null;
        }
        this.method1169(arg3, (byte) -106, arg4);
        int var8 = arg5.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg1 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method1178(null, null, arg5, var9, arg6 - (this.field2330.method127(arg5, (byte) -18) / 2), arg0, (byte) 89, null);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)V")
    public static final void method1172(int arg0, byte arg1) {
        field2348++;
        class687.field9410 = -1;
        class15.field150 = false;
        class76.field1000 = 1;
        if (arg1 > 16) {
            class618.field8381 = -1;
            class334.field4134 = null;
            class662.field8973 = arg0;
            class60.field757 = 0;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(CIIIZLfa;II)V")
    public abstract void method55(char arg0, int arg1, int arg2, int arg3, boolean arg4, class219 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
    public static final void method1173() {
        for (int var0 = 0; var0 < class303.field3838; var0++) {
            if (!class686.field9370[var0]) {
                class660 var1 = class370.field4785[var0];
                class227 var2 = var1.field8960;
                int var3 = var1.field8956;
                int var4 = var2.method1367(-5) - class660.field8949;
                int var5 = (var4 * 2 >> class480.field5972) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method1374((byte) 74) - var4 >> class480.field5972;
                int var9 = var2.method1370((byte) -5) - var4 >> class480.field5972;
                int var10 = var2.method1370((byte) -5) + var4 >> class480.field5972;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class36.field538) {
                    var10 = class36.field538 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field8958[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class546.field6871) {
                        var16 = class546.field6871 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class597 var19 = class513.method2796(var3, var17, var11, field2351 == null ? (field2351 = method1180("wda")) : field2351);
                        if (var19 != null && var19.field8004 != 0) {
                            if (var19.field8004 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field8958[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field8958[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field8958[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field8958[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class686.field9370[var0] = true;
                class299.field3801[var3].method198(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([III[Lxa;III[IIIILjava/util/Random;IILjava/lang/String;)I")
    public final int method1174(int[] arg0, int arg1, int arg2, class468[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10, Random arg11, int arg12, int arg13, String arg14) {
        field2343++;
        if (arg14 == null) {
            return 0;
        }
        arg11.setSeed((long) arg5);
        int var16 = (arg11.nextInt() & 0x1F) + 192;
        this.method1169(arg10 & 0xFFFFFF | var16 << 24, (byte) -114, arg13 & 0xFFFFFF | var16 << 24);
        int var17 = arg14.length();
        int[] var18 = new int[var17];
        int var19 = 0;
        if (arg1 != -16777216) {
            return 105;
        }
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg11.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg4;
        int var22 = this.field2330.field207 + arg8;
        if (arg2 == 1) {
            var22 += (arg6 - this.field2330.field207 - this.field2330.field225) / 2;
        } else if (arg2 == 2) {
            var22 = arg6 + arg8 - this.field2330.field225;
        }
        int var23 = -1;
        if (arg9 == 1) {
            var23 = this.field2330.method127(arg14, (byte) -112) + var19;
            var21 = (arg12 - var23) / 2 + arg4;
        } else if (arg9 == 2) {
            var23 = this.field2330.method127(arg14, (byte) -44) + var19;
            var21 = arg12 + arg4 - var23;
        }
        this.method1178(arg3, var18, arg14, null, var21, var22, (byte) 89, arg0);
        if (arg7 != null) {
            if (var23 == -1) {
                var23 = this.field2330.method127(arg14, (byte) -19) + var19;
            }
            arg7[0] = var21;
            arg7[2] = var23;
            arg7[3] = this.field2330.field225 + this.field2330.field207;
            arg7[1] = var22 - this.field2330.field207;
        }
        return var19;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Loa;Lub;)V")
    public class201(class650 arg0, class20 arg1) {
        this.field2330 = arg1;
        this.field2345 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILjava/lang/String;II[Lxa;BI[IIIIIIILfa;)I")
    public final int method1175(int arg0, int arg1, String arg2, int arg3, int arg4, class468[] arg5, byte arg6, int arg7, int[] arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, class219 arg15) {
        if (arg6 == -34) {
            field2347++;
            return this.method1179(arg14, arg11, arg13, arg5, arg2, arg12, arg3, arg4, arg1, arg0, arg8, arg7, arg15, arg9, arg10, (byte) 24, 0);
        } else {
            return 102;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;III[I[Lxa;I)V")
    public final void method1176(int arg0, String arg1, int arg2, int arg3, int arg4, int[] arg5, class468[] arg6, int arg7) {
        field2329++;
        if (arg1 == null) {
            return;
        }
        if (arg2 >= -92) {
            this.method55('I', 79, 114, 75, true, null, 43, 79);
        }
        this.method1169(arg3, (byte) -97, arg0);
        this.method1170(arg6, arg1, 0, 303995976, arg7, null, arg4, arg5, 0);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[Lxa;ILjava/util/Random;ILjava/lang/String;[IIII)I")
    public final int method1177(int arg0, class468[] arg1, int arg2, Random arg3, int arg4, String arg5, int[] arg6, int arg7, int arg8, int arg9) {
        field2332++;
        if (arg5 == null) {
            return 0;
        }
        arg3.setSeed((long) arg7);
        int var11 = (arg3.nextInt() & 0x1F) + 192;
        this.method1169(var11 << 24 | arg4 & 0xFFFFFF, (byte) -84, var11 << 24 | arg9 & 0xFFFFFF);
        int var12 = arg5.length();
        int[] var13 = new int[var12];
        int var14 = -111 / ((arg2 + 38) / 57);
        int var15 = 0;
        for (int var16 = 0; var16 < var12; var16++) {
            var13[var16] = var15;
            if ((arg3.nextInt() & 0x3) == 0) {
                var15++;
            }
        }
        this.method1178(arg1, var13, arg5, null, arg0, arg8, (byte) 89, arg6);
        return var15;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lxa;[ILjava/lang/String;[IIIB[I)V")
    private final void method1178(class468[] arg0, int[] arg1, String arg2, int[] arg3, int arg4, int arg5, byte arg6, int[] arg7) {
        int var9 = arg5 - this.field2330.field215;
        field2335++;
        if (arg6 != 89) {
            return;
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg2.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class648.method3614(arg2.charAt(var14), (byte) -97) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg2.substring(var10 + 1, var14);
                    var10 = -1;
                    if (var16.equals("lt")) {
                        var15 = '<';
                    } else if (var16.equals("gt")) {
                        var15 = '>';
                    } else if (var16.equals("nbsp")) {
                        var15 = ' ';
                    } else if (var16.equals("shy")) {
                        var15 = '\u00AD';
                    } else if (var16.equals("times")) {
                        var15 = '×';
                    } else if (var16.equals("euro")) {
                        var15 = '€';
                    } else if (var16.equals("copy")) {
                        var15 = '©';
                    } else {
                        if (!var16.equals("reg")) {
                            if (var16.startsWith("img=")) {
                                try {
                                    int var17;
                                    if (arg1 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg1[var12];
                                    }
                                    int var18;
                                    if (arg3 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg3[var12];
                                    }
                                    var12++;
                                    int var19 = class504.method2750(var16.substring(4), arg6 ^ 0x53);
                                    class468 var20 = arg0[var19];
                                    int var21 = arg7 == null ? var20.method1549() : arg7[var19];
                                    var20.method1543(arg4 + var17, -var21 + this.field2330.field215 + var9 + var18, 1, 0, 1);
                                    arg4 += arg0[var19].method1552();
                                    var11 = -1;
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method1161((byte) -123, var16);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg4 += this.field2330.method121(arg6 + 9514, var11, var15);
                    }
                    int var22;
                    if (arg1 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg1[var12];
                    }
                    int var23;
                    if (arg3 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg3[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class313.field3934 & 0xFF000000) != 0) {
                            this.method53(var15, arg4 + var22 + 1, var9 + 1 - -var23, class313.field3934, true);
                        }
                        this.method53(var15, arg4 + var22, var9 + var23, class531.field6701, false);
                    } else if (class109.field1367 > 0) {
                        class97.field1257 += class109.field1367;
                        arg4 += class97.field1257 >> 8;
                        class97.field1257 &= 0xFF;
                    }
                    int var24 = this.field2330.method128(var15, 126);
                    if (class680.field9254 != -1) {
                        this.field2345.method3634(class680.field9254, var24, arg4, (int) ((double) this.field2330.field215 * 0.7D) + var9, 45365);
                    }
                    if (class522.field6581 != -1) {
                        this.field2345.method3634(class522.field6581, var24, arg4, var9 + this.field2330.field215, 45365);
                    }
                    var11 = var15;
                    arg4 += var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "(CIIIZ)V")
    public abstract void method53(char arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III[Lxa;Ljava/lang/String;IIIII[IILfa;IIBI)I")
    public final int method1179(int arg0, int arg1, int arg2, class468[] arg3, String arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, int arg11, class219 arg12, int arg13, int arg14, byte arg15, int arg16) {
        field2344++;
        if (arg4 == null) {
            return 0;
        } else if (arg15 == 24) {
            this.method1169(arg0, (byte) -107, arg9);
            if (arg13 == 0) {
                arg13 = this.field2330.field215;
            }
            int[] var18;
            if (arg6 < this.field2330.field225 + this.field2330.field207 + arg13 && arg6 < (arg13 + arg13)) {
                var18 = null;
            } else {
                var18 = new int[] { arg1 };
            }
            int var19 = this.field2330.method122(arg3, arg4, var18, (byte) -79, class6.field65);
            if (arg16 == -1) {
                arg16 = arg6 / arg13;
                if (arg16 <= 0) {
                    arg16 = 1;
                }
            }
            if (arg16 > 0 && arg16 <= var19) {
                var19 = arg16;
                class6.field65[arg16 - 1] = this.field2330.method125((byte) -128, arg3, arg1, class6.field65[arg16 - 1]);
            }
            if (arg7 == 3 && var19 == 1) {
                arg7 = 1;
            }
            int var20;
            if (arg7 == 0) {
                var20 = arg14 + this.field2330.field207;
            } else if (arg7 == 1) {
                var20 = (arg6 - ((var19 - 1) * arg13) - this.field2330.field225 - this.field2330.field207) / 2 + this.field2330.field207 + arg14;
            } else if (arg7 == 2) {
                var20 = arg6 + arg14 - this.field2330.field225 - ((var19 + -1) * arg13);
            } else {
                int var21 = (arg6 - this.field2330.field207 - (this.field2330.field225 - -((var19 + -1) * arg13))) / (var19 + 1);
                if (var21 < 0) {
                    var21 = 0;
                }
                arg13 += var21;
                var20 = arg14 + var21 + this.field2330.field207;
            }
            for (int var22 = 0; var22 < var19; var22++) {
                if (arg5 == 0) {
                    this.method1170(arg3, class6.field65[var22], arg8, 303995976, arg11, arg12, var20, arg10, arg2);
                } else if (arg5 == 1) {
                    this.method1170(arg3, class6.field65[var22], arg8, 303995976, (arg1 - this.field2330.method127(class6.field65[var22], (byte) -122)) / 2 + arg11, arg12, var20, arg10, arg2);
                } else if (arg5 == 2) {
                    this.method1170(arg3, class6.field65[var22], arg8, 303995976, arg1 + arg11 - this.field2330.method127(class6.field65[var22], (byte) -38), arg12, var20, arg10, arg2);
                } else if (var19 - 1 == var22) {
                    this.method1170(arg3, class6.field65[var22], arg8, 303995976, arg11, arg12, var20, arg10, arg2);
                } else {
                    this.method1164((byte) -75, class6.field65[var22], arg1);
                    this.method1170(arg3, class6.field65[var22], arg8, 303995976, arg11, arg12, var20, arg10, arg2);
                    class109.field1367 = 0;
                }
                var20 += arg13;
            }
            return var19;
        } else {
            return -87;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1180(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
