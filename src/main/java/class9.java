import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class9 extends class149 {

    @OriginalMember(owner = "client!ah", name = "bb", descriptor = "Lua;")
    public static class181 field243 = new class181(50);

    @OriginalMember(owner = "client!ah", name = "fb", descriptor = "I")
    public static int field247 = 0;

    @OriginalMember(owner = "client!ah", name = "db", descriptor = "I")
    public static volatile int field245 = 0;

    @OriginalMember(owner = "client!ah", name = "cb", descriptor = "[Lsg;")
    public static class169[] field244 = new class169[100];

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "I")
    public int field232;

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "I")
    public int field233;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "I")
    public int field234;

    @OriginalMember(owner = "client!ah", name = "V", descriptor = "I")
    public int field237;

    @OriginalMember(owner = "client!ah", name = "Z", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!ah", name = "ab", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!ah", name = "eb", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!ah", name = "U", descriptor = "Lqf;")
    public static class150 field236;

    @OriginalMember(owner = "client!ah", name = "X", descriptor = "Lsg;")
    public class169 field239;

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "[I")
    public int[] field235;

    @OriginalMember(owner = "client!ah", name = "Y", descriptor = "[I")
    public int[] field240;

    @OriginalMember(owner = "client!ah", name = "W", descriptor = "[Lsg;")
    public class169[] field238;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "(I)I")
    public static final int method49(int arg0) {
        if (arg0 != -26408) {
            method51((byte) 92);
        }
        int var1 = class183.method1215(class7.field159, class61.field1132, class138.field2569, arg0 + 26408);
        field242++;
        return var1 - class182.field3559 >= 800 || (class159.field3040[class61.field1132][class7.field159 >> 7][class138.field2569 >> 7] & 0x4) == 0 ? 3 : class61.field1132;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIII)V")
    public static final void method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 4) {
            return;
        }
        int var6 = class196.field3840.method896(arg5, arg1, arg2);
        field231++;
        if (var6 != 0) {
            int var7 = class196.field3840.method878(arg5, arg1, arg2, var6);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int[] var10 = class87.field1598.field408;
            int var11 = arg3;
            if (var6 > 0) {
                var11 = arg0;
            }
            int var12 = var6 >> 14 & 0x7FFF;
            int var13 = arg1 * 4 + (52736 - arg2 * 512) * 4 + 24624;
            class17 var14 = class138.method925(arg4 + 2, var12);
            if (var14.field385 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var10[var13] = var11;
                        var10[var13 + 512] = var11;
                        var10[var13 + 1024] = var11;
                        var10[var13 + 1536] = var11;
                    } else if (var8 == 1) {
                        var10[var13] = var11;
                        var10[var13 + 1] = var11;
                        var10[var13 + 2] = var11;
                        var10[var13 + 3] = var11;
                    } else if (var8 == 2) {
                        var10[var13 + 3] = var11;
                        var10[var13 + 3 + 512] = var11;
                        var10[var13 + 1024 + 3] = var11;
                        var10[var13 + 1539] = var11;
                    } else if (var8 == 3) {
                        var10[var13 + 1536] = var11;
                        var10[var13 + 1537] = var11;
                        var10[var13 + 1536 + 2] = var11;
                        var10[var13 + 1536 + 3] = var11;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var10[var13] = var11;
                    } else if (var8 == 1) {
                        var10[var13 + 3] = var11;
                    } else if (var8 == 2) {
                        var10[var13 + 1539] = var11;
                    } else if (var8 == 3) {
                        var10[var13 + 1536] = var11;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var10[var13] = var11;
                        var10[var13 + 512] = var11;
                        var10[var13 + 1024] = var11;
                        var10[var13 + 1536] = var11;
                    } else if (var8 == 0) {
                        var10[var13] = var11;
                        var10[var13 + 1] = var11;
                        var10[var13 + 2] = var11;
                        var10[var13 + 3] = var11;
                    } else if (var8 == 1) {
                        var10[var13 + 3] = var11;
                        var10[var13 + 3 + 512] = var11;
                        var10[var13 + 3 + 1024] = var11;
                        var10[var13 + 3 + 1536] = var11;
                    } else if (var8 == 2) {
                        var10[var13 + 1536] = var11;
                        var10[var13 + 1536 + 1] = var11;
                        var10[var13 + 1536 + 2] = var11;
                        var10[var13 + 1536 + 3] = var11;
                    }
                }
            } else {
                class59 var15 = class62.field1144[var14.field385];
                if (var15 != null) {
                    int var16 = (var14.field369 * 4 - var15.field1105) / 2;
                    int var17 = (var14.field400 * 4 - var15.field1103) / 2;
                    var15.method370(arg1 * 4 + var16 + 48, (-var14.field400 + 104 - arg2) * 4 + var17 + 48);
                }
            }
        }
        int var18 = class196.field3840.method882(arg5, arg1, arg2);
        if (var18 != 0) {
            int var19 = class196.field3840.method878(arg5, arg1, arg2, var18);
            int var20 = var19 & 0x1F;
            int var21 = var19 >> 6 & 0x3;
            int var22 = var18 >> 14 & 0x7FFF;
            class17 var23 = class138.method925(6, var22);
            if (var23.field385 != -1) {
                class59 var27 = class62.field1144[var23.field385];
                if (var27 != null) {
                    int var28 = (var23.field369 * 4 - var27.field1105) / 2;
                    int var29 = (var23.field400 * 4 - var27.field1103) / 2;
                    var27.method370(arg1 * 4 + var28 + 48, (-arg2 + 104 + -var23.field400) * 4 + var29 + 48);
                }
            } else if (var20 == 9) {
                int[] var24 = class87.field1598.field408;
                int var25 = 15658734;
                int var26 = (52736 - arg2 * 512) * 4 + arg1 * 4 + 24624;
                if (var18 > 0) {
                    var25 = 15597568;
                }
                if (var21 == 0 || var21 == 2) {
                    var24[var26 + 1536] = var25;
                    var24[var26 + 1 + 1024] = var25;
                    var24[var26 + 514] = var25;
                    var24[var26 + 3] = var25;
                } else {
                    var24[var26] = var25;
                    var24[var26 + 512 + 1] = var25;
                    var24[var26 + 1024 + 2] = var25;
                    var24[var26 + 1539] = var25;
                }
            }
        }
        int var30 = class196.field3840.method891(arg5, arg1, arg2);
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class17 var32 = class138.method925(6, var31);
        if (var32.field385 == -1) {
            return;
        }
        class59 var33 = class62.field1144[var32.field385];
        if (var33 != null) {
            int var34 = (var32.field369 * 4 - var33.field1105) / 2;
            int var35 = (var32.field400 * 4 - var33.field1103) / 2;
            var33.method370(arg1 * 4 + var34 + 48, (-arg2 + 104 - var32.field400) * 4 + 48 + var35);
            return;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V")
    public static void method51(byte arg0) {
        field236 = null;
        int var1 = 121 % ((-arg0 - 52) / 48);
        field243 = null;
        field244 = null;
    }
}
