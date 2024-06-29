import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class99 {

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "Z")
    public static boolean field1602 = false;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field1601 = 0;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "[I")
    public static int[] field1607 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field1603 = 0;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "[Lhj;")
    public static class28[] field1604;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILwe;)V", line = 15)
    public static final void method685(int arg0, class47 arg1) {
        field1605++;
        if (arg0 != 256) {
            return;
        }
        int var2 = class238.field3975 >> 2 << 10;
        byte[][] var3 = new byte[class118.field1916][class33.field639];
        int var4 = class170.field2880 >> 1;
        while (arg1.field860.length > arg1.field857) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg1.method368(arg0 - 373) == 1) {
                var5 = true;
                var6 = arg1.method368(80);
                var7 = arg1.method368(-113);
            }
            int var8 = arg1.method368(-111);
            int var9 = arg1.method368(arg0 - 365);
            int var10 = class191.field3152 + (class33.field639 - 1) - (var9 * 64);
            int var11 = var8 * 64 - class277.field4764;
            if (var11 >= 0 && (var10 - 63) >= 0 && (var11 + 63) < class118.field1916 && var10 < class33.field639) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var3[var11 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var12 >= (var6 * 8) && var6 * 8 + 8 > var12 && (var7 * 8) <= var14 && (var7 * 8 + 8) > var14) {
                            var13[var10 - var14] = arg1.method352(arg0 - 1);
                        }
                    }
                }
            } else if (var5) {
                arg1.field857 += 64;
            } else {
                arg1.field857 += 4096;
            }
        }
        int var15 = class118.field1916;
        int var16 = class33.field639;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var15) {
                    int var25 = var3[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class274 var26 = class249.method1823(true, var25 - 1);
                        var17[var23] += var26.field4714;
                        var18[var23] += var26.field4718;
                        var19[var23] += var26.field4715;
                        var20[var23] += var26.field4716;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var3[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class274 var29 = class249.method1823(true, var28 - 1);
                        var17[var23] -= var29.field4714;
                        var18[var23] -= var29.field4718;
                        var19[var23] -= var29.field4715;
                        var20[var23] -= var29.field4716;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class206.field3446[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 + 5;
                    if (var16 > var37) {
                        var33 += var19[var37];
                        var34 += var20[var37];
                        var32 += var18[var37];
                        var31 += var17[var37];
                        var35 += var21[var37];
                    }
                    int var38 = var36 - 5;
                    if (var38 >= 0) {
                        var32 -= var18[var38];
                        var31 -= var17[var38];
                        var35 -= var21[var38];
                        var34 -= var20[var38];
                        var33 -= var19[var38];
                    }
                    if (var36 >= 0 && var35 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var34 == 0 ? 0 : class187.method1458(var31 * 256 / var34, var32 / var35, arg0 - 449, var33 / var35);
                        if (var3[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var4;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var40 + var2 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[class82.method582(var22, 63) + (class82.method582(63, var36) << 6)] = class109.field1746[class138.method1018(var42, -124, 96)];
                        } else if (var39 != null) {
                            var39[class82.method582(var36 << 6, 4032) + class82.method582(var22, 63)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V", line = 246)
    public static final void method686(byte arg0) {
        class292.method2090(5, (byte) -15);
        class174.method1343(5, 123);
        class14.method81(76, 5);
        field1606++;
        class265.method1922(5, (byte) 29);
        class261.method1889(arg0 - 37, 5);
        class85.method596(5, 384);
        class128.method901(5, (byte) -122);
        class207.method1572(5, (byte) 97);
        class258.method1871(true, 5);
        class167.method1294((byte) -125, 5);
        class101.method695(5, (byte) 54);
        class82.method579(arg0 ^ 0xFFFFFFA7, 5);
        class140.method1026(false, 50);
        class267.method1944(5, false);
        class140.method1032(-125, 5);
        if (arg0 == 36) {
            class89.field1421.method794(-17435, 5);
            class281.field4821.method794(arg0 - 17471, 5);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 278)
    public static void method687(int arg0) {
        int var1 = 101 % ((-arg0 - 35) / 50);
        field1604 = null;
        field1607 = null;
    }
}
