import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class281 extends class35 {

    @OriginalMember(owner = "client!il", name = "s", descriptor = "[I")
    public int[] field4324 = new int[] { 0 };

    @OriginalMember(owner = "client!il", name = "v", descriptor = "[I")
    public int[] field4327 = new int[] { -1 };

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public static int field4326 = 0;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4323 = null;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4325 = "flash3:";

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "Lta;")
    public static class286 field4322;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)V", line = 7)
    public static final void method1889(byte arg0, int arg1) {
        class119.field2075 = new int[arg1];
        field4320++;
        class271.field4189 = new int[arg1];
        int var2 = -97 / ((-arg0 - 34) / 59);
        class259.field4031 = new int[arg1];
        class81.field1580 = new int[arg1];
        class15.field281 = new int[arg1];
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIII)Z", line = 22)
    public static final boolean method1890(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4328++;
        long var8 = class14.method104(arg4, arg1 + arg6, arg0 + arg5);
        if (var8 != 0L) {
            int var10 = ((int) var8 & 0x311695) >> 20;
            int var11 = ((int) var8 & 0x7EF70) >> 14;
            int var12 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            class31 var13 = class277.method1864(var12, 0);
            if (var13.field611 == -1) {
                int[] var14 = class270.field4170;
                int var15 = arg3;
                if (var8 > 0L) {
                    var15 = arg2;
                }
                int var16 = (103 - arg5) * 2048 + arg1 * 4 + 24624;
                if (var11 == 0 || var11 == 2) {
                    if (var10 == 0) {
                        var14[var16] = var15;
                        var14[var16 + 512] = var15;
                        var14[var16 + 1024] = var15;
                        var14[var16 + 1536] = var15;
                    } else if (var10 == 1) {
                        var14[var16] = var15;
                        var14[var16 + 1] = var15;
                        var14[var16 + 2] = var15;
                        var14[var16 + 3] = var15;
                    } else if (var10 == 2) {
                        var14[var16 + 3] = var15;
                        var14[var16 + 515] = var15;
                        var14[var16 + 1024 + 3] = var15;
                        var14[var16 + 1539] = var15;
                    } else if (var10 == 3) {
                        var14[var16 + 1536] = var15;
                        var14[var16 + 1 + 1536] = var15;
                        var14[var16 + 1538] = var15;
                        var14[var16 + 1539] = var15;
                    }
                }
                if (var11 == 3) {
                    if (var10 == 0) {
                        var14[var16] = var15;
                    } else if (var10 == 1) {
                        var14[var16 + 3] = var15;
                    } else if (var10 == 2) {
                        var14[var16 + 3 + 1536] = var15;
                    } else if (var10 == 3) {
                        var14[var16 + 1536] = var15;
                    }
                }
                if (var11 == 2) {
                    if (var10 == 3) {
                        var14[var16] = var15;
                        var14[var16 + 512] = var15;
                        var14[var16 + 1024] = var15;
                        var14[var16 + 1536] = var15;
                    } else if (var10 == 0) {
                        var14[var16] = var15;
                        var14[var16 + 1] = var15;
                        var14[var16 + 2] = var15;
                        var14[var16 + 3] = var15;
                    } else if (var10 == 1) {
                        var14[var16 + 3] = var15;
                        var14[var16 + 3 + 512] = var15;
                        var14[var16 + 1027] = var15;
                        var14[var16 + 1536 + 3] = var15;
                    } else if (var10 == 2) {
                        var14[var16 + 1536] = var15;
                        var14[var16 + 1536 + 1] = var15;
                        var14[var16 + 1536 + 2] = var15;
                        var14[var16 + 1536 + 3] = var15;
                    }
                }
            } else if (!class116.method764(var10, arg0, var13, arg1, -18306, arg6, arg5)) {
                return false;
            }
        }
        if (arg7 != -32768) {
            method1893((byte) -97, 3);
        }
        long var17 = class194.method1239(arg4, arg1 + arg6, arg0 + arg5);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x30F60C) >> 20;
            int var20 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            int var21 = ((int) var17 & 0x7D6A2) >> 14;
            class31 var22 = class277.method1864(var20, 0);
            if (var22.field611 == -1) {
                if (var21 == 9) {
                    int var23 = (103 - arg5) * 512 * 4 + arg1 * 4 + 24624;
                    int var24 = 15658734;
                    int[] var25 = class270.field4170;
                    if (var17 > 0L) {
                        var24 = 15597568;
                    }
                    if (var19 == 0 || var19 == 2) {
                        var25[var23 + 1536] = var24;
                        var25[var23 + 1 + 1024] = var24;
                        var25[var23 + 2 + 512] = var24;
                        var25[var23 + 3] = var24;
                    } else {
                        var25[var23] = var24;
                        var25[var23 + 512 + 1] = var24;
                        var25[var23 + 2 + 1024] = var24;
                        var25[var23 + 1539] = var24;
                    }
                }
            } else if (!class116.method764(var19, arg0, var22, arg1, -18306, arg6, arg5)) {
                return false;
            }
        }
        long var26 = class131.method864(arg4, arg1 + arg6, arg5 - -arg0);
        if (var26 != 0L) {
            int var28 = ((int) var26 & 0x358716) >> 20;
            int var29 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class31 var30 = class277.method1864(var29, arg7 + 32768);
            if (var30.field611 != -1 && !class116.method764(var28, arg0, var30, arg1, -18306, arg6, arg5)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(B)V", line = 246)
    public static void method1891(byte arg0) {
        int var1 = -21 / ((-arg0 - 43) / 58);
        field4323 = null;
        field4322 = null;
        field4325 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIILsc;JLsc;Lsc;)V", line = 260)
    public static final void method1892(int arg0, int arg1, int arg2, int arg3, class19 arg4, long arg5, class19 arg6, class19 arg7) {
        class59 var9 = new class59();
        var9.field1155 = arg4;
        var9.field1159 = arg1 * 128 + 64;
        var9.field1158 = arg2 * 128 + 64;
        var9.field1163 = arg3;
        var9.field1161 = arg5;
        var9.field1154 = arg6;
        var9.field1166 = arg7;
        int var10 = 0;
        class47 var11 = class326.field4975[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field969; var12++) {
                class271 var13 = var11.field974[var12];
                if ((var13.field4191 & 0x400000L) == 4194304L) {
                    int var14 = var13.field4182.method39();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1157 = -var10;
        if (class326.field4975[arg0][arg1][arg2] == null) {
            class326.field4975[arg0][arg1][arg2] = new class47(arg0, arg1, arg2);
        }
        class326.field4975[arg0][arg1][arg2].field964 = var9;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(BI)I", line = 303)
    public static final int method1893(byte arg0, int arg1) {
        field4321++;
        class155 var2 = class269.method1795((byte) -111, arg1);
        int var3 = var2.field2524;
        int var4 = var2.field2520;
        int var5 = -72 % ((-arg0 - 10) / 37);
        int var6 = var2.field2528;
        int var7 = class99.field1751[var4 - var3];
        return var7 & class40.field771[var6] >> var3;
    }
}
