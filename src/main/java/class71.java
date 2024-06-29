import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class71 extends class5 {

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public int field1398 = -1;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public int field1397 = -1;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public int field1402 = 0;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "Z")
    public boolean field1404 = true;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "Led;")
    public static class43 field1393 = class191.method1219("_", false);

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "Ltd;")
    public static class176 field1399 = new class176(128);

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "[I")
    public static int[] field1405 = new int[100];

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "Led;")
    private static class43 field1408 = class191.method1219("Press (Wchange your password(W on front page)3", false);

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "Led;")
    public static class43 field1406 = field1408;

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLob;)Lob;")
    public static final class129 method435(byte arg0, class129 arg1) {
        int var2 = class97.method609(-118, class193.method1231((byte) -55, arg1));
        field1400++;
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1 = class124.method801((byte) -36, arg1.field2576);
            if (arg1 == null) {
                return null;
            }
        }
        int var4 = 27 % ((-arg0 - 10) / 55);
        return arg1;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[BII)I")
    public static final int method436(int arg0, byte[] arg1, int arg2, int arg3) {
        field1401++;
        int var4 = -1;
        if (arg2 <= 76) {
            return -38;
        } else {
            for (int var5 = arg3; var5 < arg0; var5++) {
                var4 = class198.field3900[(arg1[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
            }
            return ~var4;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static void method437(byte arg0) {
        if (arg0 < 107) {
            method439(null, -49, (byte) -7);
        }
        field1393 = null;
        field1406 = null;
        field1408 = null;
        field1405 = null;
        field1399 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljg;II)V")
    public final void method438(class89 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method436(-20, null, 9, -45);
        }
        field1403++;
        while (true) {
            int var4 = arg0.method538((byte) -114);
            if (var4 == 0) {
                return;
            }
            this.method440(var4, arg0, arg2, (byte) 37);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([BIB)I")
    public static final int method439(byte[] arg0, int arg1, byte arg2) {
        if (arg2 <= 29) {
            field1393 = null;
        }
        field1395++;
        return method436(arg1, arg0, 99, 0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjg;IB)V")
    private final void method440(int arg0, class89 arg1, int arg2, byte arg3) {
        if (arg0 == 1) {
            this.field1402 = this.method441((byte) 124, arg1.method565(3));
        } else if (arg0 == 2) {
            this.field1398 = arg1.method538((byte) 107);
        } else if (arg0 == 3) {
            this.field1398 = arg1.method555(-1113627096);
            if (this.field1398 == 65535) {
                this.field1398 = -1;
            }
        } else if (arg0 == 5) {
            this.field1404 = false;
        } else if (arg0 == 7) {
            this.field1397 = this.method441((byte) -110, arg1.method565(3));
        } else if (arg0 != 8 && arg0 == 9) {
            arg1.method555(-1113627096);
        }
        if (arg3 < 29) {
            field1393 = null;
        }
        field1394++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)I")
    private final int method441(byte arg0, int arg1) {
        field1396++;
        if (arg1 == 16711935) {
            return -1;
        }
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 > var3) {
            var9 = var5;
        }
        double var11 = var3;
        double var13 = 0.0D;
        if (var9 < var7) {
            var9 = var7;
        }
        int var15 = 35 % ((79 - arg0) / 44);
        double var16 = 0.0D;
        if (var3 > var5) {
            var11 = var5;
        }
        if (var11 > var7) {
            var11 = var7;
        }
        double var18 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var3 == var9) {
                var13 = (var5 - var7) / (var9 - var11);
            } else if (var5 == var9) {
                var13 = (var7 - var3) / (-var11 + var9) + 2.0D;
            } else if (var7 == var9) {
                var13 = (var3 - var5) / (-var11 + var9) + 4.0D;
            }
            if (var18 < 0.5D) {
                var16 = (var9 - var11) / (var9 + var11);
            }
            if (var18 >= 0.5D) {
                var16 = (var9 - var11) / (2.0D - var9 + -var11);
            }
        }
        int var20 = (int) (var16 * 256.0D);
        double var21 = var13 / 6.0D;
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        int var23 = (int) (var18 * 256.0D);
        int var24 = (int) (var21 * 256.0D);
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var23 > 243) {
            var20 >>= 0x4;
        } else if (var23 > 217) {
            var20 >>= 0x3;
        } else if (var23 > 192) {
            var20 >>= 0x2;
        } else if (var23 > 179) {
            var20 >>= 0x1;
        }
        return (var23 >> 1) + ((var24 >> 2 << 10) + (var20 >> 5 << 7));
    }
}
