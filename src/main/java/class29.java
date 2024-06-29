import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class29 {

    @OriginalMember(owner = "client!iha", name = "s", descriptor = "Lwca;")
    private class708 field295;

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "I")
    private int field296;

    @OriginalMember(owner = "client!iha", name = "i", descriptor = "Lqr;")
    private class69 field312;

    @OriginalMember(owner = "client!iha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field315 = new String[] { method307(method306("omz)")), method307(method306("u;xtR4")), method307(method306("g}7tn")), method307(method306("r&u6")), method307(method306("u;xtZ4")), method307(method306("u;xtQ4")), method307(method306("u;xtY4")), method307(method306("u;xtV4")), method307(method306("u;xtW4")), method307(method306("u;xtB4")), method307(method306("u;xtU4")), method307(method306("u;xt/u=p.-4")), method307(method306("u;xt\\4")), method307(method306("}1x")), method307(method306("u;xtC4")), method307(method306("u;xtT4")), method307(method306("u;xt^4")), method307(method306("u;xtP4")), method307(method306("u;xt[4")), method307(method306("u;xt]4")), method307(method306("u;xtX4")) };

    @OriginalMember(owner = "client!iha", name = "n", descriptor = "F")
    public static float field293 = 0.0F;

    @OriginalMember(owner = "client!iha", name = "q", descriptor = "[[Z")
    public static boolean[][] field311 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!iha", name = "l", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!iha", name = "o", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!iha", name = "h", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!iha", name = "m", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!iha", name = "j", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!iha", name = "g", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!iha", name = "u", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!iha", name = "k", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!iha", name = "p", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!iha", name = "e", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!iha", name = "v", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!iha", name = "f", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!iha", name = "r", descriptor = "I")
    public static int field313;

    // $FF: synthetic field
    @OriginalMember(owner = "client!iha", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field314;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "()V")
    public static final void method288() {
        for (int var0 = 0; var0 < class642.field9210; var0++) {
            if (!class537.field7884[var0]) {
                class610 var1 = class782.field11417[var0];
                class731 var2 = var1.field8782;
                int var3 = var1.field8793;
                int var4 = var2.method5295(32) - class316.field5139;
                int var5 = (var4 * 2 >> class165.field2688) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method5300(32) - var4 >> class165.field2688;
                int var9 = var2.method5298(-4) - var4 >> class165.field2688;
                int var10 = var2.method5298(-4) + var4 >> class165.field2688;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class117.field1705) {
                    var10 = class117.field1705 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field8792[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class150.field2096) {
                        var16 = class150.field2096 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class185 var19 = class59.method614(var3, var17, var11, field314 == null ? (field314 = method305(field315[13])) : field314);
                        if (var19 != null && var19.field2937 != 0) {
                            if (var19.field2937 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field8792[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field8792[var6 - 1];
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
                                    short var30 = var1.field8792[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field8792[var6 + 1];
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
                class537.field7884[var0] = true;
                class740.field10902[var3].method713(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(ZILjava/lang/Object;J)V")
    public final void method289(boolean arg0, int arg1, Object arg2, long arg3) {
        try {
            field301++;
            if (this.field296 < arg1) {
                throw new IllegalStateException(field315[0]);
            }
            this.method300(51, arg3);
            this.field307 -= arg1;
            while (this.field307 < 0) {
                class417 var6 = (class417) this.field295.method5149((byte) 52);
                this.method292(var6, false);
            }
            class483 var7 = new class483(arg2, arg1);
            this.field312.method738(var7, arg3, -12002);
            if (!arg0) {
                this.field295.method5142(var7, (byte) -63);
                var7.field7075 = 0L;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field315[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field315[3] : field315[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Z)I")
    public final int method290(boolean arg0) {
        try {
            field298++;
            int var2 = 0;
            if (arg0) {
                return -19;
            }
            for (class417 var3 = (class417) this.field295.method5147((byte) 109); var3 != null; var3 = (class417) this.field295.method5144(256)) {
                if (!var3.method3155(122)) {
                    var2++;
                }
            }
            return var2;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field315[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lrfa;ILsg;Lha;Lvb;IIZI)V")
    public static final void method291(class209 arg0, int arg1, class420 arg2, class63 arg3, class205 arg4, int arg5, int arg6, boolean arg7, int arg8) {
        try {
            field306++;
            int var9 = arg6 - (arg8 / 2) - 5;
            int var10 = arg5 + 2;
            if (arg7) {
                field311 = null;
            }
            if (arg0.field3262 != 0) {
                arg3.method664(var10, arg0.field3262, arg8 + 10, var9, arg4.method1851() * arg1 + arg5 + 1 - var10, !arg7);
            }
            if (arg0.field3295 != 0) {
                arg3.method661(var10, arg0.field3295, arg8 + 10, 59, var9, arg4.method1851() * arg1 + arg5 + 1 - var10);
            }
            int var11 = arg0.field3271;
            if (arg2.field6632 && arg0.field3263 != -1) {
                var11 = arg0.field3263;
            }
            for (int var12 = 0; var12 < arg1; var12++) {
                String var13 = class504.field7552[var12];
                if ((arg1 - 1) > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                arg4.method1850(arg3, var13, arg6, arg5, var11, true);
                arg5 += arg4.method1851();
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field315[16] + (arg0 == null ? field315[3] : field315[2]) + ',' + arg1 + ',' + (arg2 == null ? field315[3] : field315[2]) + ',' + (arg3 == null ? field315[3] : field315[2]) + ',' + (arg4 == null ? field315[3] : field315[2]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lwj;Z)V")
    private final void method292(class417 arg0, boolean arg1) {
        try {
            if (arg1) {
                this.method294(80, 109);
            }
            field313++;
            if (arg0 != null) {
                arg0.method4173(-1);
                arg0.method3558((byte) 65);
                this.field307 += arg0.field6597;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field315[9] + (arg0 == null ? field315[3] : field315[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(B)V")
    public static void method293(byte arg0) {
        try {
            if (arg0 <= -51) {
                field311 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field315[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(II)V")
    public final void method294(int arg0, int arg1) {
        try {
            field300++;
            if (arg1 == -630 && class457.field7057 != null) {
                for (class417 var3 = (class417) this.field295.method5147((byte) 86); var3 != null; var3 = (class417) this.field295.method5144(256)) {
                    if (var3.method3155(126)) {
                        if (var3.method3154(-4850) == null) {
                            var3.method4173(-1);
                            var3.method3558((byte) 63);
                            this.field307 += var3.field6597;
                        }
                    } else if (((long) arg0) < (++var3.field7075)) {
                        class417 var4 = class457.field7057.method4802(false, var3);
                        this.field312.method738(var4, var3.field8252, -12002);
                        class365.method3017((byte) -86, var4, var3);
                        var3.method4173(arg1 + 629);
                        var3.method3558((byte) 119);
                    }
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field315[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(ZJLjava/lang/Object;)V")
    public final void method295(boolean arg0, long arg1, Object arg2) {
        try {
            this.method289(arg0, 1, arg2, arg1);
            field304++;
            if (arg0) {
                field311 = null;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field315[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field315[3] : field315[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(I)V")
    public class29(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)I")
    public final int method296(int arg0) {
        try {
            field302++;
            if (arg0 != 1) {
                this.method295(true, -47L, null);
            }
            return this.field296;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field315[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "f", descriptor = "(I)I")
    public final int method297(int arg0) {
        try {
            if (arg0 < 74) {
                this.field312 = null;
            }
            field309++;
            return this.field307;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field315[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "e", descriptor = "(I)V")
    public final void method298(int arg0) {
        try {
            field299++;
            for (class417 var2 = (class417) this.field295.method5147((byte) 114); var2 != null; var2 = (class417) this.field295.method5144(arg0 ^ 0x105)) {
                if (var2.method3155(127)) {
                    var2.method4173(-1);
                    var2.method3558((byte) 111);
                    this.field307 += var2.field6597;
                }
            }
            if (arg0 != 5) {
                this.field295 = null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field315[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(BI)Z")
    public static final boolean method299(byte arg0, int arg1) {
        try {
            field305++;
            for (class59 var2 = (class59) class439.field6858.method3228(11); var2 != null; var2 = (class59) class439.field6858.method3216(true)) {
                if (class738.method5357(12, var2.field773) && (long) arg1 == var2.field762) {
                    return true;
                }
            }
            if (arg0 <= 101) {
                return true;
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field315[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(IJ)V")
    private final void method300(int arg0, long arg1) {
        try {
            field297++;
            if (arg0 < 47) {
                field293 = -1.2847904F;
            }
            class417 var4 = (class417) this.field312.method737((byte) -39, arg1);
            this.method292(var4, false);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field315[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method301(int arg0) {
        try {
            field303++;
            class417 var2 = (class417) this.field312.method735(0);
            if (arg0 < 17) {
                this.method292(null, false);
            }
            while (var2 != null) {
                Object var3 = var2.method3154(-4850);
                if (var3 != null) {
                    return var3;
                }
                class417 var4 = var2;
                var2 = (class417) this.field312.method734((byte) -50);
                var4.method4173(-1);
                var4.method3558((byte) 98);
                this.field307 += var4.field6597;
            }
            return null;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field315[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(II)V")
    public class29(int arg0, int arg1) {
        this.field295 = new class708();
        try {
            this.field307 = arg0;
            this.field296 = arg0;
            int var3;
            for (var3 = 1; arg0 > (var3 + var3) && var3 < arg1; var3 += var3) {
            }
            this.field312 = new class69(var3);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field315[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method302(int arg0, long arg1) {
        try {
            field294++;
            class417 var4 = (class417) this.field312.method737((byte) -39, arg1);
            if (var4 == null) {
                return null;
            }
            if (arg0 > -74) {
                this.method298(63);
            }
            Object var5 = var4.method3154(-4850);
            if (var5 == null) {
                var4.method4173(-1);
                var4.method3558((byte) 71);
                this.field307 += var4.field6597;
                return null;
            }
            if (var4.method3155(122)) {
                class483 var6 = new class483(var5, var4.field6597);
                this.field312.method738(var6, var4.field8252, -12002);
                this.field295.method5142(var6, (byte) -63);
                var6.field7075 = 0L;
                var4.method4173(-1);
                var4.method3558((byte) 99);
            } else {
                this.field295.method5142(var4, (byte) -63);
                var4.field7075 = 0L;
            }
            return var5;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field315[17] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public final Object method303(int arg0) {
        try {
            if (arg0 < 110) {
                field293 = -1.9391187F;
            }
            field310++;
            class417 var2 = (class417) this.field312.method734((byte) -50);
            while (var2 != null) {
                Object var3 = var2.method3154(-4850);
                if (var3 != null) {
                    return var3;
                }
                class417 var4 = var2;
                var2 = (class417) this.field312.method734((byte) -50);
                var4.method4173(-1);
                var4.method3558((byte) 57);
                this.field307 += var4.field6597;
            }
            return null;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field315[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "(I)V")
    public final void method304(int arg0) {
        try {
            field308++;
            this.field295.method5141(0);
            this.field312.method730(true);
            this.field307 = this.field296;
            if (arg0 != 1) {
                this.method303(-126);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field315[14] + arg0 + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method305(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!iha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method306(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x13);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method307(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 28;
                    break;
                case 1:
                    var10005 = 83;
                    break;
                case 2:
                    var10005 = 25;
                    break;
                case 3:
                    var10005 = 90;
                    break;
                default:
                    var10005 = 19;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
