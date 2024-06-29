import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class13 extends class128 {

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public int field208 = 0;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "[I")
    public static int[] field212 = new int[1000];

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)I")
    public static final int method79(int arg0, int arg1) {
        field210++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 & 0xFF) / 256.0D;
        double var6 = var2;
        double var8 = 0.0D;
        double var10 = var2;
        double var12 = 0.0D;
        double var14 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (var2 < var14) {
            var10 = var14;
        }
        if (var10 < var4) {
            var10 = var4;
        }
        if (var2 > var14) {
            var6 = var14;
        }
        if (var6 > var4) {
            var6 = var4;
        }
        double var16 = (var6 + var10) / 2.0D;
        if (var6 != var10) {
            if (var2 == var10) {
                var8 = (var14 - var4) / (var10 - var6);
            } else if (var10 == var14) {
                var8 = (var4 - var2) / (var10 - var6) + 2.0D;
            } else if (var4 == var10) {
                var8 = (var2 - var14) / (var10 - var6) + 4.0D;
            }
            if (var16 < 0.5D) {
                var12 = (var10 - var6) / (var6 + var10);
            }
            if (var16 >= 0.5D) {
                var12 = (var10 - var6) / (2.0D - var10 - var6);
            }
        }
        double var18 = var8 / 6.0D;
        int var20 = (int) (var16 * 256.0D);
        int var21 = (int) (var18 * 256.0D);
        int var22 = (int) (var12 * 256.0D);
        if (var22 < arg0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        if (var20 > 243) {
            var22 >>= 0x4;
        } else if (var20 > 217) {
            var22 >>= 0x3;
        } else if (var20 > 192) {
            var22 >>= 0x2;
        } else if (var20 > 179) {
            var22 >>= 0x1;
        }
        return (var21 >> 2 << 10) + (var22 >> 5 << 7) + (var20 >> 1);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILnh;Lnh;)V")
    public static final void method80(int arg0, class305 arg1, class305 arg2) {
        class159.field2205 = arg2;
        class150.field2079 = arg1;
        field211++;
        if (arg0 != -17571) {
            method83(-18, -94, -25);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lbj;II)V")
    private final void method81(class215 arg0, int arg1, int arg2) {
        field213++;
        if (arg1 <= -79 && arg2 == 2) {
            this.field208 = arg0.method1379(-118);
        }
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
    public static void method82(int arg0) {
        field212 = null;
        if (arg0 != 32235) {
            field212 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
    public static final void method83(int arg0, int arg1, int arg2) {
        if (arg2 != 20954) {
            method79(92, -28);
        }
        class31.field470[arg1] = arg0;
        class194 var3 = (class194) class107.field1530.method1453(true, (long) arg1);
        if (var3 == null) {
            class194 var4 = new class194(4611686018427387905L);
            class107.field1530.method1452((long) arg1, var4, 0);
        } else if (var3.field2957 != 4611686018427387905L) {
            var3.field2957 = class299.method2006(arg2 ^ 0x74A0) + 500L | 0x4000000000000000L;
        }
        field209++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lbj;I)V")
    public final void method84(class215 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1374((byte) -60);
            if (var3 == 0) {
                if (arg1 != -1) {
                    method80(19, (class305) null, (class305) null);
                }
                field206++;
                return;
            }
            this.method81(arg0, -100, var3);
        }
    }
}
