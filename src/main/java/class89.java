import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class89 extends class125 {

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
    public int field1750 = 0;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
    public int field1748 = -1;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "Z")
    public boolean field1755 = true;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "I")
    public int field1759 = -1;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "Z")
    public static boolean field1749 = true;

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "Loe;")
    public static class139 field1758 = new class139(64);

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "[[B")
    public static byte[][] field1760 = new byte[1000][];

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "I")
    public static int field1761 = -1;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "J")
    public static long field1754;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lai;")
    public static final class10 method590(int arg0, int arg1) {
        field1752++;
        class10 var2 = (class10) client.field672.method930(57, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class186.field3512.method899((byte) 87, arg0, arg1);
        class10 var4 = new class10();
        if (var3 != null) {
            var4.method71(-1, new class70(var3));
        }
        client.field672.method927(24744, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)I")
    private final int method591(int arg0, int arg1) {
        field1756++;
        if (arg0 == 16711935) {
            return -1;
        }
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var13 = 0.0D;
        double var15 = (var9 + var11) / 2.0D;
        double var17 = 0.0D;
        int var19 = (int) (var15 * 256.0D);
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (var9 != var11) {
            if (var3 == var11) {
                var13 = (var5 - var7) / (-var9 + var11);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (-var9 + var11) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var15 < 0.5D) {
                var17 = (var11 - var9) / (var9 + var11);
            }
            if (var15 >= 0.5D) {
                var17 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        double var20 = var13 / 6.0D;
        int var22 = (int) (var17 * 256.0D);
        int var23 = (int) (var20 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (arg1 > -28) {
            return 33;
        }
        if (var19 > 243) {
            var22 >>= 0x4;
        } else if (var19 > 217) {
            var22 >>= 0x3;
        } else if (var19 > 192) {
            var22 >>= 0x2;
        } else if (var19 > 179) {
            var22 >>= 0x1;
        }
        return (var19 >> 1) + (var22 >> 5 << 7) + (var23 >> 2 << 10);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILh;Z)V")
    public final void method592(int arg0, class70 arg1, boolean arg2) {
        while (true) {
            int var4 = arg1.method443(255);
            if (var4 == 0) {
                field1751++;
                if (!arg2) {
                    this.method594(null, -53, -18, 16);
                    return;
                }
                return;
            }
            this.method594(arg1, arg0, var4, -1);
        }
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
    public static void method593(byte arg0) {
        if (arg0 != 78) {
            field1749 = true;
        }
        field1760 = null;
        field1758 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lh;III)V")
    private final void method594(class70 arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field1750 = this.method591(arg0.method415(112), -127);
        } else if (arg2 == 2) {
            this.field1748 = arg0.method443(255);
        } else if (arg2 == 3) {
            this.field1748 = arg0.method442(arg3 ^ 0x5366);
            if (this.field1748 == 65535) {
                this.field1748 = -1;
            }
        } else if (arg2 == 5) {
            this.field1755 = false;
        } else if (arg2 == 7) {
            this.field1759 = this.method591(arg0.method415(54), -94);
        } else if (arg2 != 8 && arg2 == 9) {
            arg0.method442(-21351);
        }
        if (arg3 == -1) {
            field1747++;
        }
    }
}
