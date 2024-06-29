import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class83 extends class171 {

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
    private int field1129;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    private int field1137;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    private int field1133;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "I")
    private int field1123;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    private int field1121;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    private int field1140;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
    public int field1128;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1130;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field1138;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "[[I")
    public static int[][] field1132;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Z")
    public final boolean method515(int arg0, int arg1, int arg2) {
        field1134++;
        int var4 = 44 % ((64 - arg0) / 53);
        return this.field1128 <= arg1 && this.field1125 >= arg1 && this.field1122 <= arg2 && this.field1126 >= arg2;
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)V")
    public static void method516(int arg0) {
        field1138 = null;
        field1132 = null;
        if (arg0 >= 8) {
            field1130 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IBI)Z")
    public final boolean method517(int arg0, byte arg1, int arg2) {
        if (arg1 >= -86) {
            return false;
        } else {
            field1136++;
            return this.field1140 <= arg0 && arg0 <= this.field1123 && this.field1121 <= arg2 && arg2 <= this.field1137;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1124++;
        long var8 = class140.method945(arg2, arg1 + arg4, arg0 + arg7);
        if ((long) arg6 != var8) {
            int var10 = (int) var8 >> 14 & 0x1F;
            int var11 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            int var12 = ((int) var8 & 0x38E3C4) >> 20;
            class111 var13 = class76.method489(var11, arg6 + 102);
            if (var13.field1560 == -1) {
                int var14 = arg3;
                if (var8 > 0L) {
                    var14 = arg5;
                }
                int var15 = (52736 - (arg7 * 512)) * 4 + arg1 * 4 + 24624;
                int[] var16 = class64.field881;
                if (var10 == 0 || var10 == 2) {
                    if (var12 == 0) {
                        var16[var15] = var14;
                        var16[var15 + 512] = var14;
                        var16[var15 + 1024] = var14;
                        var16[var15 + 1536] = var14;
                    } else if (var12 == 1) {
                        var16[var15] = var14;
                        var16[var15 + 1] = var14;
                        var16[var15 + 2] = var14;
                        var16[var15 + 3] = var14;
                    } else if (var12 == 2) {
                        var16[var15 + 3] = var14;
                        var16[var15 + 3 + 512] = var14;
                        var16[var15 + 1024 + 3] = var14;
                        var16[var15 + 3 + 1536] = var14;
                    } else if (var12 == 3) {
                        var16[var15 + 1536] = var14;
                        var16[var15 + 1537] = var14;
                        var16[var15 + 1536 + 2] = var14;
                        var16[var15 + 1536 + 3] = var14;
                    }
                }
                if (var10 == 3) {
                    if (var12 == 0) {
                        var16[var15] = var14;
                    } else if (var12 == 1) {
                        var16[var15 + 3] = var14;
                    } else if (var12 == 2) {
                        var16[var15 + 3 + 1536] = var14;
                    } else if (var12 == 3) {
                        var16[var15 + 1536] = var14;
                    }
                }
                if (var10 == 2) {
                    if (var12 == 3) {
                        var16[var15] = var14;
                        var16[var15 + 512] = var14;
                        var16[var15 + 1024] = var14;
                        var16[var15 + 1536] = var14;
                    } else if (var12 == 0) {
                        var16[var15] = var14;
                        var16[var15 + 1] = var14;
                        var16[var15 + 2] = var14;
                        var16[var15 + 3] = var14;
                    } else if (var12 == 1) {
                        var16[var15 + 3] = var14;
                        var16[var15 + 512 + 3] = var14;
                        var16[var15 + 1024 + 3] = var14;
                        var16[var15 + 3 + 1536] = var14;
                    } else if (var12 == 2) {
                        var16[var15 + 1536] = var14;
                        var16[var15 + 1536 + 1] = var14;
                        var16[var15 + 1538] = var14;
                        var16[var15 + 1536 + 3] = var14;
                    }
                }
            } else if (!class266.method1749(arg7, arg0, var13, arg6 - 10055, var12, arg1, arg4)) {
                return false;
            }
        }
        long var17 = class176.method1156(arg2, arg1 + arg4, arg0 + arg7);
        if (var17 != 0L) {
            int var19 = (int) var17 >> 14 & 0x1F;
            int var20 = (int) var17 >> 20 & 0x3;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            class111 var22 = class76.method489(var21, 55);
            if (var22.field1560 == -1) {
                if (var19 == 9) {
                    int var23 = 15658734;
                    int var24 = (103 - arg7) * 4 * 512 + arg1 * 4 + 24624;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int[] var25 = class64.field881;
                    if (var20 == 0 || var20 == 2) {
                        var25[var24 + 1536] = var23;
                        var25[var24 + 1 + 1024] = var23;
                        var25[var24 + 512 + 2] = var23;
                        var25[var24 + 3] = var23;
                    } else {
                        var25[var24] = var23;
                        var25[var24 + 512 + 1] = var23;
                        var25[var24 + 2 + 1024] = var23;
                        var25[var24 + 1536 + 3] = var23;
                    }
                }
            } else if (!class266.method1749(arg7, arg0, var22, -10055, var20, arg1, arg4)) {
                return false;
            }
        }
        long var26 = class69.method431(arg2, arg1 + arg4, arg0 + arg7);
        if (var26 != 0L) {
            int var28 = (int) (var26 >>> 32) & Integer.MAX_VALUE;
            class111 var29 = class76.method489(var28, 127);
            int var30 = (int) var26 >> 20 & 0x3;
            if (var29.field1560 != -1 && !class266.method1749(arg7, arg0, var29, -10055, var30, arg1, arg4)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IB)I")
    public static final int method519(int arg0, byte arg1) {
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        int var5 = -9 % ((-arg1 - 47) / 55);
        field1135++;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)Z")
    public final boolean method520(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 71 % ((17 - arg1) / 60);
        field1131++;
        return this.field1133 == arg2 && this.field1140 <= arg0 && arg0 <= this.field1123 && arg3 >= this.field1121 && arg3 <= this.field1137;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(III)[I")
    public final int[] method521(int arg0, int arg1, int arg2) {
        field1139++;
        if (arg1 != 8332) {
            this.method521(65, 23, 40);
        }
        return new int[] { this.field1129, arg2 - (this.field1140 - this.field1128), this.field1122 - this.field1121 + arg0 };
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(III)[I")
    public final int[] method522(int arg0, int arg1, int arg2) {
        int var4 = -71 % ((arg2 - 25) / 46);
        field1127++;
        return new int[] { this.field1133, arg0 + this.field1140 - this.field1128, -this.field1122 - -this.field1121 + arg1 };
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1129 = arg1;
        this.field1122 = arg7;
        this.field1137 = arg5;
        this.field1133 = arg0;
        this.field1123 = arg4;
        this.field1126 = arg9;
        this.field1121 = arg3;
        this.field1125 = arg8;
        this.field1140 = arg2;
        this.field1128 = arg6;
    }
}
