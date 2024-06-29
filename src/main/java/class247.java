import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class247 {

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public int field3993 = 128;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    private int field3992 = 0;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "Z")
    public boolean field4000 = true;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public int field4004 = -1;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "Lck;")
    public static class119 field3991 = class298.method1987((byte) 124, "::fullscreen");

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "[[I")
    public static int[][] field4005 = new int[5][5000];

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public int field3994;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public int field3996;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public int field3998;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public int field4003;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "Lth;")
    public static class275 field4001;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "[Lbe;")
    public static class81[] field4002;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "[[B")
    public static byte[][] field3989;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)V", line = 5)
    private final void method1605(int arg0, int arg1) {
        field3997++;
        double var3 = (double) ((arg0 & 0xFFF8AA) >> 16) / 256.0D;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = (double) ((arg0 & 0xFFE9) >> 8) / 256.0D;
        double var9 = var3;
        if (var7 < var3) {
            var9 = var7;
        }
        if (var9 > var5) {
            var9 = var5;
        }
        double var11 = 0.0D;
        double var13 = 0.0D;
        double var15 = var3;
        if (var7 > var3) {
            var15 = var7;
        }
        if (var15 < var5) {
            var15 = var5;
        }
        double var17 = (var9 + var15) / 2.0D;
        if (var9 != var15) {
            if (var17 < 0.5D) {
                var13 = (var15 - var9) / (var9 + var15);
            }
            if (var3 == var15) {
                var11 = (var7 - var5) / (var15 - var9);
            } else if (var7 == var15) {
                var11 = (var5 - var3) / (var15 - var9) + 2.0D;
            } else if (var5 == var15) {
                var11 = (var3 - var7) / (var15 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var13 = (var15 - var9) / (2.0D - var15 - var9);
            }
        }
        this.field4003 = (int) (var17 * 256.0D);
        if (this.field4003 < 0) {
            this.field4003 = 0;
        } else if (this.field4003 > 255) {
            this.field4003 = 255;
        }
        this.field3994 = (int) ((double) arg1 * var13);
        if (this.field3994 < 0) {
            this.field3994 = 0;
        } else if (this.field3994 > 255) {
            this.field3994 = 255;
        }
        double var19 = var11 / 6.0D;
        if (var17 > 0.5D) {
            this.field3998 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field3998 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field3998 < 1) {
            this.field3998 = 1;
        }
        this.field3996 = (int) ((double) this.field3998 * var19);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lfj;IB)V", line = 92)
    public final void method1606(class3 arg0, int arg1, byte arg2) {
        field3999++;
        while (true) {
            int var4 = arg0.method64((byte) -121);
            if (var4 == 0) {
                if (arg2 != 57) {
                    field3991 = (class119) null;
                }
                return;
            }
            this.method1607(var4, true, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZILfj;)V", line = 118)
    private final void method1607(int arg0, boolean arg1, int arg2, class3 arg3) {
        if (arg0 == 1) {
            this.field3992 = arg3.method48(64);
            this.method1605(this.field3992, 256);
        } else if (arg0 == 2) {
            this.field4004 = arg3.method63((byte) 1);
            if (this.field4004 == 65535) {
                this.field4004 = -1;
            }
        } else if (arg0 == 3) {
            this.field3993 = arg3.method63((byte) 1);
        } else if (arg0 == 4) {
            this.field4000 = false;
        }
        if (!arg1) {
            this.field4003 = -102;
        }
        field3990++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 154)
    public static void method1608(int arg0) {
        field3989 = (byte[][]) null;
        if (arg0 == -10421) {
            field4005 = (int[][]) null;
            field4002 = null;
            field3991 = null;
            field4001 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)Z", line = 214)
    public static final boolean method1609(int arg0, int arg1) {
        field3995++;
        if (class234.field3786[arg1]) {
            return true;
        } else if (class216.field3487.method257(true, arg1)) {
            int var2 = class216.field3487.method263(arg1, 100);
            if (var2 == 0) {
                class234.field3786[arg1] = true;
                return true;
            }
            if (class135.field2189[arg1] == null) {
                class135.field2189[arg1] = new class134[var2];
            }
            if (arg0 != 30881) {
                method1609(-125, -107);
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class135.field2189[arg1][var3] == null) {
                    byte[] var4 = class216.field3487.method261(-1, arg1, var3);
                    if (var4 != null) {
                        class135.field2189[arg1][var3] = new class134();
                        class135.field2189[arg1][var3].field2120 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class135.field2189[arg1][var3].method894(103, new class3(var4));
                        } else {
                            class135.field2189[arg1][var3].method891(new class3(var4), arg0 - 30881);
                        }
                    }
                }
            }
            class234.field3786[arg1] = true;
            return true;
        } else {
            return false;
        }
    }
}
