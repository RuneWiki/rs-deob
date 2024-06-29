import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class38 {

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Leb;")
    private static class230 field707 = class68.method589(0, "Members object");

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Leb;")
    public static class230 field710 = field707;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Leb;")
    public static class230 field713 = class68.method589(0, ")4p=");

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Leb;")
    public static class230 field714 = class68.method589(0, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III[BII[Lhh;IIIZ)V")
    public static final void method342(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, class116[] arg6, int arg7, int arg8, int arg9, boolean arg10) {
        byte var11;
        if (arg10) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (arg9 > -85) {
            method344(24, (byte) 97);
        }
        if (!arg10) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if ((arg8 + var12) > 0 && (arg8 + var12) < 103 && arg0 + var13 > 0 && arg0 + var13 < 103) {
                        arg6[arg4].field2085[arg8 + var12][arg0 + var13] = class189.method1350(arg6[arg4].field2085[arg8 + var12][arg0 + var13], -16777217);
                    }
                }
            }
        }
        field712++;
        class14 var14 = new class14(arg3);
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg7 == var15 && arg5 <= var16 && arg5 + 8 > var16 && var17 >= arg1 && var17 < (arg1 + 8)) {
                        class114.method914(0, 0, var14, arg4, arg0 + class71.method612(arg2, var17 & 0x7, var16 & 0x7, 23921), (byte) -103, arg10, arg2, arg8 + class249.method1740(var17 & 0x7, var16 & 0x7, arg2, -1));
                    } else {
                        class114.method914(0, 0, var14, 0, -1, (byte) -28, arg10, 0, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static final void method343(int arg0) {
        field708++;
        if (class149.field2671 < 0) {
            class68.field1270 = -1;
            class149.field2671 = 0;
            class160.field2858 = -1;
        }
        if (class237.field4094 < class149.field2671) {
            class68.field1270 = -1;
            class149.field2671 = class237.field4094;
            class160.field2858 = -1;
        }
        if (class79.field1446 < 0) {
            class79.field1446 = 0;
            class160.field2858 = -1;
            class68.field1270 = -1;
        }
        if (class79.field1446 > class249.field4417) {
            class160.field2858 = -1;
            class68.field1270 = -1;
            class79.field1446 = class249.field4417;
        }
        if (arg0 < 109) {
            method342(0, -59, 52, (byte[]) null, 1, -19, (class116[]) null, -9, -101, -50, true);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)I")
    public static final int method344(int arg0, byte arg1) {
        field709++;
        double var2 = (double) (arg0 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var6 = (double) ((arg0 & 0xFF7F) >> 8) / 256.0D;
        double var8 = var4;
        if (var6 < var4) {
            var8 = var6;
        }
        double var10 = var4;
        if (var4 < var6) {
            var10 = var6;
        }
        if (var2 > var10) {
            var10 = var2;
        }
        if (var2 < var8) {
            var8 = var2;
        }
        double var12 = 0.0D;
        if (arg1 != -45) {
            return 15;
        }
        double var14 = (var8 + var10) / 2.0D;
        double var16 = 0.0D;
        if (var8 != var10) {
            if (var14 < 0.5D) {
                var16 = (var10 - var8) / (var8 + var10);
            }
            if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8);
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 2.0D;
            } else if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8) + 4.0D;
            }
            if (var14 >= 0.5D) {
                var16 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        int var18 = (int) (var14 * 256.0D);
        int var19 = (int) (var16 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        double var20 = var12 / 6.0D;
        int var22 = (int) (var20 * 256.0D);
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (var18 > 243) {
            var19 >>= 0x4;
        } else if (var18 > 217) {
            var19 >>= 0x3;
        } else if (var18 > 192) {
            var19 >>= 0x2;
        } else if (var18 > 179) {
            var19 >>= 0x1;
        }
        return (var18 >> 1) + ((var22 >> 2 << 10) + (var19 >> 5 << 7));
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(IB)V")
    public static final void method345(int arg0, byte arg1) {
        if (arg1 < 44) {
            method345(-98, (byte) 48);
        }
        field711++;
        class197 var2 = class164.method1228(1, arg0, -1665874464);
        var2.method1407(-106);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static void method346(byte arg0) {
        field710 = null;
        field713 = null;
        if (arg0 >= -61) {
            field713 = null;
        }
        field714 = null;
        field707 = null;
    }
}
