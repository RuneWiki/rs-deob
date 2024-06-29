import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class203 {

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "Z")
    public boolean field3131 = true;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public int field3137 = -1;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    private int field3132 = 0;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public int field3141 = 128;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Ll;")
    public static class66 field3133 = new class66(64);

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3147 = "Attack";

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public static int field3148 = 0;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field3150 = 0;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public int field3134;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public int field3136;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "[I")
    public static int[] field3149;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "[Ljg;")
    public static class297[] field3146;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V", line = 5)
    public static void method1515(byte arg0) {
        field3147 = null;
        field3149 = null;
        field3133 = null;
        field3146 = null;
        if (arg0 > -25) {
            field3147 = (String) null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)I", line = 19)
    public static final int method1516(int arg0, int arg1) {
        if (class188.field2950 != null) {
            class188.field2950.method2429(false);
            class188.field2950 = null;
        }
        if (arg1 != -22574) {
            return 71;
        }
        field3144++;
        class123.field1978++;
        if (class123.field1978 > 4) {
            class123.field1978 = 0;
            class111.field1697 = 0;
            return arg0;
        }
        class111.field1697 = 0;
        if (class42.field663 == class147.field2393) {
            class147.field2393 = class258.field3948;
        } else {
            class147.field2393 = class42.field663;
        }
        return -1;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)V", line = 57)
    private final void method1517(int arg0, int arg1) {
        field3143++;
        if (arg1 != -11589) {
            return;
        }
        double var3 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var9 = var7;
        double var11 = 0.0D;
        double var13 = 0.0D;
        if (var3 < var7) {
            var9 = var3;
        }
        if (var5 < var9) {
            var9 = var5;
        }
        double var15 = var7;
        if (var3 > var7) {
            var15 = var3;
        }
        if (var5 > var15) {
            var15 = var5;
        }
        double var17 = (var9 + var15) / 2.0D;
        if (var9 != var15) {
            if (var17 < 0.5D) {
                var11 = (var15 - var9) / (var9 + var15);
            }
            if (var7 == var15) {
                var13 = (var3 - var5) / (var15 - var9);
            } else if (var3 == var15) {
                var13 = (var5 - var7) / (var15 - var9) + 2.0D;
            } else if (var5 == var15) {
                var13 = (var7 - var3) / (var15 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var11 = (var15 - var9) / (2.0D - var15 - var9);
            }
        }
        this.field3142 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field3142 < 0) {
            this.field3142 = 0;
        } else if (this.field3142 > 255) {
            this.field3142 = 255;
        }
        this.field3135 = (int) (var11 * 256.0D);
        if (this.field3135 < 0) {
            this.field3135 = 0;
        } else if (this.field3135 > 255) {
            this.field3135 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field3134 = (int) ((1.0D - var17) * var11 * 512.0D);
        } else {
            this.field3134 = (int) (var11 * var17 * 512.0D);
        }
        if (this.field3134 < 1) {
            this.field3134 = 1;
        }
        this.field3136 = (int) ((double) this.field3134 * var19);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)V", line = 142)
    public static final void method1518(int arg0, int arg1, int arg2, int arg3) {
        class329 var4 = class170.field2689[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class280 var5 = var4.field5065;
        if (var5 != null) {
            var5.field4328 = var5.field4328 * arg3 / 16;
            var5.field4318 = var5.field4318 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IILug;)V", line = 161)
    public final void method1519(int arg0, int arg1, class25 arg2) {
        field3138++;
        while (true) {
            int var4 = arg2.method281(43);
            if (var4 == 0) {
                if (arg1 != -2) {
                    this.field3131 = false;
                }
                return;
            }
            this.method1521(arg2, arg0, arg1 ^ 0x3, var4);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)Ljg;", line = 181)
    public static final class297 method1520(int arg0, int arg1, int arg2) {
        class329 var3 = class170.field2689[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field5063; var4++) {
            class297 var5 = var3.field5070[var4];
            if ((var5.field4611 >> 29 & 0x3L) == 2L && var5.field4616 == arg1 && var5.field4614 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lug;III)V", line = 217)
    private final void method1521(class25 arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field3132 = arg0.method265(true);
            this.method1517(this.field3132, -11589);
        } else if (arg3 == 2) {
            this.field3137 = arg0.method314((byte) 69);
            if (this.field3137 == 65535) {
                this.field3137 = -1;
            }
        } else if (arg3 == 3) {
            this.field3141 = arg0.method314((byte) 118);
        } else if (arg3 == 4) {
            this.field3131 = false;
        }
        if (arg2 != -3) {
            method1520(-40, -87, 67);
        }
        field3145++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BILrn;)Lnj;", line = 262)
    public static final class235 method1522(byte arg0, int arg1, class18 arg2) {
        field3139++;
        byte[] var3 = arg2.method203(arg1, (byte) 47);
        if (arg0 != -44) {
            method1520(105, -14, 101);
        }
        return var3 == null ? null : new class235(var3);
    }
}
