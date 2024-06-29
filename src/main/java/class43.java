import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class43 {

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field918 = 1;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static volatile int field922 = 0;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Ldc;")
    public static class37 field919 = class185.method1233((byte) 86, "Sprites geladen)3");

    @OriginalMember(owner = "client!di", name = "g", descriptor = "Ldc;")
    private static class37 field924 = class185.method1233((byte) 86, "Location");

    @OriginalMember(owner = "client!di", name = "c", descriptor = "Ldc;")
    public static class37 field920 = field924;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static void method378(int arg0) {
        field924 = null;
        field920 = null;
        field919 = null;
        if (arg0 != -13488) {
            field924 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([BI)V")
    public static final void method379(byte[] arg0, int arg1) {
        field921++;
        int var2 = class78.field1379 >> 2 << 10;
        if (arg1 != -1) {
            field924 = null;
        }
        int var3 = 0;
        int var4 = class140.field2716 >> 1;
        byte[][] var5 = new byte[class150.field2848][class190.field3528];
        while (true) {
            while (var3 < arg0.length) {
                int var34 = (arg0[var3++] & 0xFF) * 64 - class235.field4272;
                int var35 = (arg0[var3++] & 0xFF) * 64 - class68.field1224;
                if (var34 > 0 && var35 > 0 && var34 + 64 < class150.field2848 && class190.field3528 > var35 + 64) {
                    for (int var36 = 0; var36 < 64; var36++) {
                        int var37 = class190.field3528 - var35 - 1;
                        byte[] var38 = var5[var34 + var36];
                        for (int var39 = -64; var39 < 0; var39++) {
                            var38[var37--] = arg0[var3++];
                        }
                    }
                } else {
                    var3 += 4096;
                }
            }
            int var6 = class150.field2848;
            int var7 = class190.field3528;
            int[] var8 = new int[var7];
            int[] var9 = new int[var7];
            int[] var10 = new int[var7];
            int[] var11 = new int[var7];
            int[] var12 = new int[var7];
            for (int var13 = -5; var13 < var6; var13++) {
                for (int var14 = 0; var14 < var7; var14++) {
                    int var28 = var13 + 5;
                    int var10002;
                    if (var28 < var6) {
                        int var29 = var5[var28][var14] & 0xFF;
                        if (var29 > 0) {
                            class223 var30 = class61.method460(1, var29 - 1);
                            var8[var14] += var30.field4124;
                            var9[var14] += var30.field4131;
                            var10[var14] += var30.field4125;
                            var11[var14] += var30.field4129;
                            var10002 = var12[var14]++;
                        }
                    }
                    int var31 = var13 - 5;
                    if (var31 >= 0) {
                        int var32 = var5[var31][var14] & 0xFF;
                        if (var32 > 0) {
                            class223 var33 = class61.method460(1, var32 - 1);
                            var8[var14] -= var33.field4124;
                            var9[var14] -= var33.field4131;
                            var10[var14] -= var33.field4125;
                            var11[var14] -= var33.field4129;
                            var10002 = var12[var14]--;
                        }
                    }
                }
                if (var13 >= 0) {
                    int[][] var15 = class235.field4283[var13 >> 6];
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < var7; var21++) {
                        int var22 = var21 + 5;
                        if (var22 < var7) {
                            var19 += var11[var22];
                            var16 += var8[var22];
                            var18 += var9[var22];
                            var20 += var12[var22];
                            var17 += var10[var22];
                        }
                        int var23 = var21 - 5;
                        if (var23 >= 0) {
                            var16 -= var8[var23];
                            var18 -= var9[var23];
                            var17 -= var10[var23];
                            var19 -= var11[var23];
                            var20 -= var12[var23];
                        }
                        if (var21 >= 0 && var20 > 0) {
                            int var24 = var21 >> 6;
                            int var25 = var19 == 0 ? 0 : class142.method992((byte) 69, var17 / var20, var16 * 256 / var19, var18 / var20);
                            if (var5[var13][var21] != 0) {
                                if (var15[var24] == null) {
                                    var15[var24] = class235.field4283[var13 >> 6][var24] = new int[4096];
                                }
                                int var26 = (var25 & 0x7F) + var4;
                                if (var26 < 0) {
                                    var26 = 0;
                                } else if (var26 > 127) {
                                    var26 = 127;
                                }
                                int var27 = (var2 + var25 & 0xFC00) + (var25 & 0x380) + var26;
                                var15[var24][class58.method449(var21 << 6, 4032) + class58.method449(63, var13)] = class169.field3222[class35.method298(-56, 96, var27)];
                            } else if (var15[var24] != null) {
                                var15[var24][class58.method449(4032, var21 << 6) + class58.method449(63, var13)] = 0;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)Z")
    public static final boolean method380(int arg0, int arg1, int arg2) {
        int var3 = class212.field3970[arg0][arg1][arg2];
        if (-class164.field3111 == var3) {
            return false;
        } else if (class164.field3111 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class217.method1439(var4 + 1, class39.field808[arg0][arg1][arg2], var5 + 1) && class217.method1439(var4 + 128 - 1, class39.field808[arg0][arg1 + 1][arg2], var5 + 1) && class217.method1439(var4 + 128 - 1, class39.field808[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class217.method1439(var4 + 1, class39.field808[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class212.field3970[arg0][arg1][arg2] = class164.field3111;
                return true;
            } else {
                class212.field3970[arg0][arg1][arg2] = -class164.field3111;
                return false;
            }
        }
    }
}
