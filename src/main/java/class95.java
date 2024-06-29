import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class95 {

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Lqi;")
    public static class301 field1547 = new class301(0, 0);

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Lgn;")
    public static class5 field1548 = new class5(128);

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Lbe;")
    public static class297 field1549 = null;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "[I")
    public static int[] field1550 = new int[2048];

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field1556 = 0;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "Lna;")
    private static class26 field1557 = class69.method505("Walk here", (byte) -119);

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Lna;")
    public static class26 field1555 = class69.method505(" )2> <col=ffffff>", (byte) -117);

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Lna;")
    public static class26 field1554 = field1557;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Lna;")
    public static class26 field1551 = class69.method505("<col=ffff00>", (byte) -128);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "[Lod;")
    public static class25[] field1553;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I", line = 6)
    public static final int method712(int arg0, int arg1) {
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        field1545++;
        double var6 = 0.0D;
        double var8 = (double) (arg1 & 0xFF) / 256.0D;
        double var10 = var2;
        double var12 = (double) arg0;
        double var14 = var2;
        if (var2 > var4) {
            var10 = var4;
        }
        if (var8 < var10) {
            var10 = var8;
        }
        if (var4 > var2) {
            var14 = var4;
        }
        if (var8 > var14) {
            var14 = var8;
        }
        double var16 = (var10 + var14) / 2.0D;
        if (var10 != var14) {
            if (var16 < 0.5D) {
                var12 = (var14 - var10) / (var10 + var14);
            }
            if (var16 >= 0.5D) {
                var12 = (var14 - var10) / (2.0D - var14 - var10);
            }
            if (var2 == var14) {
                var6 = (var4 - var8) / (var14 - var10);
            } else if (var4 == var14) {
                var6 = (var8 - var2) / (var14 - var10) + 2.0D;
            } else if (var8 == var14) {
                var6 = (var2 - var4) / (var14 - var10) + 4.0D;
            }
        }
        int var18 = (int) (var12 * 256.0D);
        int var19 = (int) (var16 * 256.0D);
        double var20 = var6 / 6.0D;
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        int var22 = (int) (var20 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        if (var19 > 243) {
            var18 >>= 0x4;
        } else if (var19 > 217) {
            var18 >>= 0x3;
        } else if (var19 > 192) {
            var18 >>= 0x2;
        } else if (var19 > 179) {
            var18 >>= 0x1;
        }
        return (var22 >> 2 << 10) + (var18 >> 5 << 7) + (var19 >> 1);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 115)
    public static void method713(int arg0) {
        if (arg0 != 30351) {
            method715(-73, -127, -26, 43, 67, 125, 38, 80, (class86) null, -92, true, 27L);
        }
        field1554 = null;
        field1555 = null;
        field1549 = null;
        field1550 = null;
        field1557 = null;
        field1551 = null;
        field1548 = null;
        field1553 = null;
        field1547 = null;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 157)
    public static final void method714(int arg0) {
        class305.field5252 = null;
        class11.field147 = (int[][][]) null;
        class188.field2963 = null;
        class282.field4704 = (byte[][][]) null;
        class163.field2529 = (byte[][][]) null;
        class140.field2133 = (byte[][][]) null;
        class312.field5340 = (byte[][][]) null;
        class264.field4327 = (byte[][][]) null;
        class295.field4919 = null;
        field1546++;
        if (arg0 >= -60) {
            field1554 = (class26) null;
        }
        class271.field4534 = null;
        class174.field2725 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIILth;IZJ)Z", line = 179)
    public static final boolean method715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class86 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class8.field96 == class229.field3635;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class285.field4778 || var16 >= class303.field5221) {
                    return false;
                }
                class55 var17 = class36.field585[arg0][var15][var16];
                if (var17 != null && var17.field879 >= 5) {
                    return false;
                }
            }
        }
        class39 var18 = new class39();
        var18.field656 = arg11;
        var18.field648 = arg0;
        var18.field635 = arg5;
        var18.field639 = arg6;
        var18.field644 = arg7;
        var18.field632 = arg8;
        var18.field653 = arg9;
        var18.field637 = arg1;
        var18.field630 = arg2;
        var18.field652 = arg1 + arg3 - 1;
        var18.field634 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class36.field585[var22][var19][var20] == null) {
                        class36.field585[var22][var19][var20] = new class55(var22, var19, var20);
                    }
                }
                class55 var23 = class36.field585[arg0][var19][var20];
                var23.field877[var23.field879] = var18;
                var23.field893[var23.field879] = var21;
                var23.field884 |= var21;
                var23.field879++;
                if (var13 && class245.field4028[var19][var20] != 0) {
                    var14 = class245.field4028[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class245.field4028[var24][var25] == 0) {
                        class245.field4028[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class249.field4073[class310.field5328++] = var18;
        }
        return true;
    }
}
