import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class386 {

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "Z")
    public boolean field5463 = true;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "Z")
    public boolean field5470 = true;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public int field5473 = -1;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public int field5466 = 512;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    private int field5472 = 0;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field5474 = 0;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public int field5462;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public int field5467;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public int field5468;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public int field5475;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BILac;)V", line = 10)
    private final void method2281(byte arg0, int arg1, class501 arg2) {
        if (arg1 == 1) {
            this.field5472 = arg2.method2819((byte) 72);
            this.method2283(this.field5472, arg0 ^ 0xFFFFFFA1);
        } else if (arg1 == 2) {
            this.field5473 = arg2.method2845(-1);
            if (this.field5473 == 65535) {
                this.field5473 = -1;
            }
        } else if (arg1 == 3) {
            this.field5466 = arg2.method2845(arg0 - 24) << 2;
        } else if (arg1 == 4) {
            this.field5463 = false;
        } else if (arg1 == 5) {
            this.field5470 = false;
        }
        field5471++;
        if (arg0 != 23) {
            this.field5475 = -110;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V", line = 50)
    public static final void method2282(int arg0, Object[] arg1, long[] arg2) {
        field5465++;
        class647.method3615(0, arg2.length - 1, (byte) -121, arg1, arg2);
        if (arg0 != 19107) {
            field5474 = -41;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V", line = 61)
    private final void method2283(int arg0, int arg1) {
        field5469++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF99) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        this.field5462 = (int) (var15 * 256.0D);
        this.field5467 = (int) (var17 * 256.0D);
        int var21 = -23 % ((arg1 + 8) / 42);
        if (var17 > 0.5D) {
            this.field5468 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field5468 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field5462 < 0) {
            this.field5462 = 0;
        } else if (this.field5462 > 255) {
            this.field5462 = 255;
        }
        if (this.field5467 < 0) {
            this.field5467 = 0;
        } else if (this.field5467 > 255) {
            this.field5467 = 255;
        }
        if (this.field5468 < 1) {
            this.field5468 = 1;
        }
        this.field5475 = (int) ((double) this.field5468 * var19);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILac;)V", line = 173)
    public final void method2284(int arg0, class501 arg1) {
        while (true) {
            int var3 = arg1.method2874((byte) -75);
            if (var3 == 0) {
                field5464++;
                int var4 = 2 / ((34 - arg0) / 45);
                return;
            }
            this.method2281((byte) 23, var3, arg1);
        }
    }
}
