import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class13 {

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Lod;")
    private class349 field170;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "J")
    public long field168;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field171;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field172;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "[[B")
    public static byte[][] field165;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static void method83(byte arg0) {
        if (arg0 != -74) {
            field165 = null;
        }
        field165 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZI)V")
    public static final void method84(boolean arg0, int arg1) {
        class237.field3495 = -1;
        field169++;
        class197.field2869 = null;
        class23.field239 = arg0;
        class146.field2162 = 0;
        class88.field1343 = arg1;
        class107.field1546 = -1;
        class150.field2232 = 1;
    }

    @OriginalMember(owner = "client!kh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field167++;
        this.field170.method2171((byte) 57, this.field168);
        super.finalize();
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()V")
    public static final void method85() {
        for (int var0 = 0; var0 < class44.field711; var0++) {
            if (!class14.field181[var0]) {
                class419 var1 = class517.field7540[var0];
                class107 var2 = var1.field6301;
                int var3 = var1.field6299;
                int var4 = var2.method661((byte) 97) - class143.field2134;
                int var5 = (var4 * 2 >> class192.field2815) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method654((byte) 31) - var4 >> class192.field2815;
                int var9 = var2.method656(128) - var4 >> class192.field2815;
                int var10 = var2.method656(128) + var4 >> class192.field2815;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class484.field7096) {
                    var10 = class484.field7096 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field6293[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class361.field5554) {
                        var16 = class361.field5554 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class117 var19 = class342.method2093(var3, var17, var11, field172 == null ? (field172 = method88("sq")) : field172);
                        if (var19 != null && var19.field1761 != 0) {
                            if (var19.field1761 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field6293[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field6293[var6 - 1];
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
                                    short var30 = var1.field6293[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field6293[var6 + 1];
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
                class14.field181[var0] = true;
                class86.field1324[var3].method200(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIIIIIBIII)V")
    public static final void method86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, int arg11, int arg12, int arg13) {
        field171++;
        if (class86.field1324 == null) {
            return;
        }
        class129 var15;
        if (arg11 >= 0) {
            int var14 = arg11 - 1;
            var15 = class193.field2821[var14];
        } else {
            int var16 = -arg11 - 1;
            if (class172.field2546 == var16) {
                var15 = class500.field7365;
            } else {
                var15 = class44.field707[var16];
            }
        }
        if (var15 == null) {
            return;
        }
        class519 var17 = class252.field3743.method2686(arg3, (byte) 116);
        int var18;
        int var19;
        if (arg4 == 1 || arg4 == 3) {
            var18 = var17.field7614;
            var19 = var17.field7648;
        } else {
            var18 = var17.field7648;
            var19 = var17.field7614;
        }
        int var20 = (var18 >> 1) + arg2;
        if (arg10 >= -59) {
            method83((byte) 72);
        }
        int var21 = (var18 + 1 >> 1) + arg2;
        int var22 = (var19 >> 1) + arg0;
        int var23 = (var19 + 1 >> 1) + arg0;
        class35 var24 = class86.field1324[arg1];
        int var25 = var24.method201(var20, var22) + var24.method201(var21, var22) + (var24.method201(var20, var23) - -var24.method201(var21, var23)) >> 2;
        class164 var26 = new class164();
        var26.field2404 = arg0;
        var26.field2406 = class317.field4559 + arg5;
        var26.field2418 = arg9;
        if (arg6 > arg12) {
            int var27 = arg6;
            arg6 = arg12;
            arg12 = var27;
        }
        var26.field2408 = var15.field1768;
        var26.field2416 = class317.field4559 + arg13;
        var26.field2409 = arg4;
        var26.field2407 = arg3;
        var26.field2411 = arg2;
        if (arg7 > arg8) {
            int var28 = arg7;
            arg7 = arg8;
            arg8 = var28;
        }
        var26.field2403 = arg2 + arg6;
        var26.field2415 = arg2 + arg12;
        var26.field2410 = arg0 + arg7;
        var26.field2413 = arg0 + arg8;
        var26.field2402 = (var26.field2411 << 7) + (var18 << 6);
        var26.field2421 = (var26.field2404 << 7) + (var19 << 6);
        var26.field2412 = var25;
        class530.field7818.method809(var26, false);
        var15.field1993 = var26;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lod;J[Llv;)V")
    public class13(class349 arg0, long arg1, class307[] arg2) {
        this.field170 = arg0;
        this.field168 = arg1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Z")
    public static final boolean method87(int arg0, int arg1) {
        if (arg1 != -2) {
            method87(40, -63);
        }
        field166++;
        return arg0 >= 12 && arg0 <= 17;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method88(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
