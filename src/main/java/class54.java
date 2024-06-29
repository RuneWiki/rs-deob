import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class54 extends class130 {

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "Z")
    public boolean field1020 = false;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "Lsd;")
    public static class166 field1013 = class135.method935("Bitte versuchen Sie es in ", 0);

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "[S")
    public static short[] field1016 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "Lsd;")
    public static class166 field1017 = class135.method935("Mem:", 0);

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "Lsd;")
    public static class166 field1014 = class135.method935("rot:", 0);

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
    public static int field1011 = 0;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "Lsd;")
    public static class166 field1012 = class135.method935(")1j", 0);

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "Lsd;")
    public static class166 field1022 = class135.method935("mapscene", 0);

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
    public int field1021;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
    public int field1023;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "Lf;")
    public static class47 field1018;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIII)V")
    public static final void method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1015++;
        int var6 = class131.field2556.method595(arg2, arg1, arg5);
        if (var6 != 0) {
            int var7 = class131.field2556.method576(arg2, arg1, arg5, var6);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg0;
            if (var6 > 0) {
                var10 = arg3;
            }
            int[] var11 = class8.field152.field3014;
            int var12 = arg1 * 4 + (52736 - arg5 * 512) * 4 + 24624;
            int var13 = var6 >> 14 & 0x7FFF;
            class145 var14 = class170.method1185((byte) 107, var13);
            if (var14.field2833 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 512 + 3] = var10;
                        var11[var12 + 1027] = var10;
                        var11[var12 + 1539] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1 + 1536] = var10;
                        var11[var12 + 2 + 1536] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1 + 1536] = var10;
                        var11[var12 + 2 + 1536] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    }
                }
            } else {
                class96 var15 = class193.field3791[var14.field2833];
                if (var15 != null) {
                    int var16 = (var14.field2832 * 4 - var15.field1849) / 2;
                    int var17 = (var14.field2825 * 4 - var15.field1852) / 2;
                    var15.method731(arg1 * 4 + var17 + 48, (-var14.field2832 + -arg5 + 104) * 4 + var16 + 48);
                }
            }
        }
        int var18 = class131.field2556.method620(arg2, arg1, arg5);
        if (var18 != 0) {
            int var19 = class131.field2556.method576(arg2, arg1, arg5, var18);
            int var20 = var19 >> 6 & 0x3;
            int var21 = var19 & 0x1F;
            int var22 = var18 >> 14 & 0x7FFF;
            class145 var23 = class170.method1185((byte) 123, var22);
            if (var23.field2833 != -1) {
                class96 var24 = class193.field3791[var23.field2833];
                if (var24 != null) {
                    int var25 = (var23.field2825 * 4 - var24.field1852) / 2;
                    int var26 = (var23.field2832 * 4 - var24.field1849) / 2;
                    var24.method731(var25 + arg1 * 4 + 48, (-arg5 + 104 - var23.field2832) * 4 + 48 + var26);
                }
            } else if (var21 == 9) {
                int var27 = 15658734;
                if (var18 > 0) {
                    var27 = 15597568;
                }
                int var28 = (52736 - arg5 * 512) * 4 + arg1 * 4 + 24624;
                int[] var29 = class8.field152.field3014;
                if (var20 == 0 || var20 == 2) {
                    var29[var28 + 1536] = var27;
                    var29[var28 + 1 + 1024] = var27;
                    var29[var28 + 512 + 2] = var27;
                    var29[var28 + 3] = var27;
                } else {
                    var29[var28] = var27;
                    var29[var28 + 512 + 1] = var27;
                    var29[var28 + 1024 + 2] = var27;
                    var29[var28 + 1536 + 3] = var27;
                }
            }
        }
        int var30 = class131.field2556.method600(arg2, arg1, arg5);
        if (var30 != 0) {
            int var31 = var30 >> 14 & 0x7FFF;
            class145 var32 = class170.method1185((byte) 73, var31);
            if (var32.field2833 != -1) {
                class96 var33 = class193.field3791[var32.field2833];
                if (var33 != null) {
                    int var34 = (var32.field2825 * 4 - var33.field1852) / 2;
                    int var35 = (var32.field2832 * 4 - var33.field1849) / 2;
                    var33.method731(arg1 * 4 + var34 + 48, (-var32.field2832 + 104 + -arg5) * 4 + var35 + 48);
                }
            }
        }
        if (arg4 <= 84) {
            field1016 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
    public static void method443(int arg0) {
        field1013 = null;
        if (arg0 != -6582) {
            method442(124, -20, -94, -1, -6, -51);
        }
        field1014 = null;
        field1016 = null;
        field1017 = null;
        field1022 = null;
        field1012 = null;
        field1018 = null;
    }
}
