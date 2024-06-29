import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class541 extends class130 {

    @OriginalMember(owner = "client!am", name = "z", descriptor = "I")
    public int field7926 = 0;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "I")
    public int field7924 = -1;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "[Lgo;")
    public static class313[] field7915 = new class313[14];

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field7911;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public int field7912;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field7913;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public int field7916;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public int field7917;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    public int field7918;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    public int field7919;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public int field7920;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    public int field7921;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    public int field7923;

    @OriginalMember(owner = "client!am", name = "y", descriptor = "I")
    public int field7925;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "I")
    public int field7927;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "Lhg;")
    public static class372 field7922;

    // $FF: synthetic field
    @OriginalMember(owner = "client!am", name = "B", descriptor = "Ljava/lang/Class;")
    public static Class field7928;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "[Z")
    public static boolean[] field7914;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
    public static void method3176(int arg0) {
        field7915 = null;
        if (arg0 == 1) {
            field7914 = null;
            field7922 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "()V")
    public static final void method3177() {
        for (int var0 = 0; var0 < class16.field172; var0++) {
            if (!class354.field5239[var0]) {
                class181 var1 = class356.field5270[var0];
                class344 var2 = var1.field2775;
                int var3 = var1.field2764;
                int var4 = var2.method2218(921) - class74.field1258;
                int var5 = (var4 * 2 >> class295.field4543) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2214((byte) 124) - var4 >> class295.field4543;
                int var9 = var2.method2216(-1) - var4 >> class295.field4543;
                int var10 = var2.method2216(-1) + var4 >> class295.field4543;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class443.field6603) {
                    var10 = class443.field6603 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field2769[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class474.field6947) {
                        var16 = class474.field6947 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class76 var19 = class35.method217(var3, var17, var11, field7928 == null ? (field7928 = method3180("aa")) : field7928);
                        if (var19 != null && var19.field1273 != 0) {
                            if (var19.field1273 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field2769[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field2769[var6 - 1];
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
                                    short var30 = var1.field2769[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field2769[var6 + 1];
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
                class354.field5239[var0] = true;
                class407.field6024[var3].method60(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIII)I")
    public static final int method3178(int arg0, int arg1, int arg2, int arg3) {
        field7911++;
        if (arg0 <= 75) {
            method3179(-41, (byte) 102, -56);
        }
        if (arg1 > 243) {
            arg2 >>= 0x4;
        } else if (arg1 > 217) {
            arg2 >>= 0x3;
        } else if (arg1 > 192) {
            arg2 >>= 0x2;
        } else if (arg1 > 179) {
            arg2 >>= 0x1;
        }
        return ((arg3 & 0xFF) >> 2 << 10) + (arg2 >> 5 << 7) + (arg1 >> 1);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3179(int arg0, byte arg1, int arg2) {
        if (arg1 >= -12) {
            field7922 = null;
        }
        field7913++;
        return (arg0 & 0x10) != 0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3180(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
