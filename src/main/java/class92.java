import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class92 extends class191 {

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public int field2038 = -1;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public int field2040 = -1;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "Z")
    public boolean field2046 = true;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "I")
    public int field2047 = 0;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "[Ldd;")
    public static class35[] field2037 = new class35[100];

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "Z")
    public static boolean field2049 = true;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "[[[B")
    public static byte[][][] field2050;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)I")
    private final int method671(int arg0, int arg1) {
        field2048++;
        if (arg0 == 16711935) {
            return -1;
        } else if (arg1 == -22803) {
            double var3 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
            double var5 = (double) (arg0 & 0xFF) / 256.0D;
            double var7 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
            double var9 = var7;
            double var11 = 0.0D;
            if (var3 > var7) {
                var9 = var3;
            }
            double var13 = 0.0D;
            if (var5 > var9) {
                var9 = var5;
            }
            double var15 = var7;
            if (var7 > var3) {
                var15 = var3;
            }
            if (var15 > var5) {
                var15 = var5;
            }
            double var17 = (var9 + var15) / 2.0D;
            if (var9 != var15) {
                if (var17 < 0.5D) {
                    var13 = (var9 - var15) / (var9 + var15);
                }
                if (var17 >= 0.5D) {
                    var13 = (var9 - var15) / (2.0D - var9 + -var15);
                }
                if (var7 == var9) {
                    var11 = (var3 - var5) / (var9 - var15);
                } else if (var3 == var9) {
                    var11 = (var5 - var7) / (-var15 + var9) + 2.0D;
                } else if (var5 == var9) {
                    var11 = (var7 - var3) / (-var15 + var9) + 4.0D;
                }
            }
            int var19 = (int) (var13 * 256.0D);
            double var20 = var11 / 6.0D;
            int var22 = (int) (var20 * 256.0D);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var23 = (int) (var17 * 256.0D);
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > 255) {
                var23 = 255;
            }
            if (var23 > 243) {
                var19 >>= 0x4;
            } else if (var23 > 217) {
                var19 >>= 0x3;
            } else if (var23 > 192) {
                var19 >>= 0x2;
            } else if (var23 > 179) {
                var19 >>= 0x1;
            }
            return (var22 >> 2 << 10) + (var23 >> 1) + (var19 >> 5 << 7);
        } else {
            return -89;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)Z")
    public static final boolean method672(int arg0, byte arg1) {
        field2043++;
        if (arg1 >= -99) {
            method672(-38, (byte) 8);
        }
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lag;Lag;B)I")
    public static final int method673(class8 arg0, class8 arg1, byte arg2) {
        field2039++;
        int var3 = 0;
        if (arg0.method40(-12065, class62.field1507)) {
            var3++;
        }
        if (arg1.method40(arg2 ^ 0xFFFFD09E, class107.field2394)) {
            var3++;
        }
        if (arg1.method40(arg2 - 12130, class205.field4098)) {
            var3++;
        }
        if (arg1.method40(-12065, class130.field2803)) {
            var3++;
        }
        if (arg1.method40(-12065, class161.field3277)) {
            var3++;
        }
        if (arg1.method40(arg2 ^ 0xFFFFD09E, class178.field3663)) {
            var3++;
        }
        arg1.method40(-12065, class133.field2847);
        arg1.method40(-12065, class108.field2402);
        arg1.method40(-12065, class176.field3600);
        if (arg2 != 65) {
            method673(null, null, (byte) 98);
        }
        arg1.method40(arg2 ^ 0xFFFFD09E, class210.field4162);
        arg1.method40(arg2 - 12130, class110.field2425);
        return var3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILce;Z)V")
    public final void method674(int arg0, class26 arg1, boolean arg2) {
        while (true) {
            int var4 = arg1.method221(-112);
            if (var4 == 0) {
                field2044++;
                if (!arg2) {
                    this.field2046 = true;
                    return;
                }
                return;
            }
            this.method675(var4, arg0, arg1, -92);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILce;I)V")
    private final void method675(int arg0, int arg1, class26 arg2, int arg3) {
        field2042++;
        if (arg0 == 1) {
            this.field2047 = this.method671(arg2.method232(45), -22803);
        } else if (arg0 == 2) {
            this.field2040 = arg2.method221(-76);
        } else if (arg0 == 3) {
            this.field2040 = arg2.method256((byte) -78);
            if (this.field2040 == 65535) {
                this.field2040 = -1;
            }
        } else if (arg0 == 5) {
            this.field2046 = false;
        } else if (arg0 == 7) {
            this.field2038 = this.method671(arg2.method232(87), -22803);
        } else if (arg0 != 8 && arg0 == 9) {
            arg2.method256((byte) -78);
        }
        int var5 = 34 / ((arg3 - 36) / 38);
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)V")
    public static void method676(byte arg0) {
        field2050 = null;
        field2037 = null;
        int var1 = -88 % ((arg0 + 11) / 54);
    }
}
