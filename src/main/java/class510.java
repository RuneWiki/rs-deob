import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class510 {

    @OriginalMember(owner = "client!lda", name = "h", descriptor = "I")
    public int field7215 = 512;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "Z")
    public boolean field7208 = true;

    @OriginalMember(owner = "client!lda", name = "n", descriptor = "I")
    private int field7221 = 0;

    @OriginalMember(owner = "client!lda", name = "k", descriptor = "I")
    public int field7218 = -1;

    @OriginalMember(owner = "client!lda", name = "q", descriptor = "Z")
    public boolean field7224 = true;

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "Lat;")
    public static class397 field7212;

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "Lat;")
    public static class397 field7211 = field7212 = new class397(false);

    @OriginalMember(owner = "client!lda", name = "r", descriptor = "I")
    public static int field7225 = 0;

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!lda", name = "i", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!lda", name = "j", descriptor = "I")
    public int field7217;

    @OriginalMember(owner = "client!lda", name = "l", descriptor = "I")
    public int field7219;

    @OriginalMember(owner = "client!lda", name = "m", descriptor = "I")
    public int field7220;

    @OriginalMember(owner = "client!lda", name = "o", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!lda", name = "p", descriptor = "I")
    public int field7223;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V")
    public static void method3083(int arg0) {
        field7211 = null;
        if (arg0 != -21084) {
            method3087(false);
        }
        field7212 = null;
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)V")
    public static final void method3084(int arg0) {
        field7214++;
        if (class70.field838) {
            return;
        }
        class70.field838 = true;
        class571.field8063 += (24.0F - class571.field8063) / 2.0F;
        if (arg0 == -4) {
            class532.field7692 = true;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)V")
    private final void method3085(int arg0, int arg1) {
        field7210++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & arg0) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
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
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field7223 = (int) (var15 * 256.0D);
        this.field7220 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field7223 < 0) {
            this.field7223 = 0;
        } else if (this.field7223 > 255) {
            this.field7223 = 255;
        }
        if (var17 > 0.5D) {
            this.field7217 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field7217 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field7220 < 0) {
            this.field7220 = 0;
        } else if (this.field7220 > 255) {
            this.field7220 = 255;
        }
        if (this.field7217 < 1) {
            this.field7217 = 1;
        }
        this.field7219 = (int) ((double) this.field7217 * var19);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IILso;)V")
    private final void method3086(int arg0, int arg1, class494 arg2) {
        if (arg1 != 255) {
            method3083(22);
        }
        if (arg0 == 1) {
            this.field7221 = arg2.method2960((byte) 94);
            this.method3085(255, this.field7221);
        } else if (arg0 == 2) {
            this.field7218 = arg2.method2998(true);
            if (this.field7218 == 65535) {
                this.field7218 = -1;
            }
        } else if (arg0 == 3) {
            this.field7215 = arg2.method2998(true) << 2;
        } else if (arg0 == 4) {
            this.field7208 = false;
        } else if (arg0 == 5) {
            this.field7224 = false;
        }
        field7213++;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Z)V")
    public static final void method3087(boolean arg0) {
        field7222++;
        if (class148.field2135 <= 0) {
            class46.field578 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class353.field4964.length; var2++) {
                if (class353.field4964[var2].indexOf("--> ") != -1) {
                    var1++;
                    if (class148.field2135 == var1) {
                        class46.field578 = class353.field4964[var2].substring(class353.field4964[var2].indexOf(">") + 2);
                        break;
                    }
                }
            }
        }
        if (arg0) {
            field7225 = -122;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lso;I)V")
    public final void method3088(class494 arg0, int arg1) {
        field7209++;
        if (arg1 != -4399) {
            return;
        }
        while (true) {
            int var3 = arg0.method2964((byte) 104);
            if (var3 == 0) {
                return;
            }
            this.method3086(var3, 255, arg0);
        }
    }

    static {
        new BitSet(65536);
    }
}
