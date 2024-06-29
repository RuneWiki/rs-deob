import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Z")
    public boolean field60 = true;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public int field58 = 128;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    private int field65 = 0;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public int field66 = -1;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "Lmh;")
    public static class62 field56 = class201.method1405(true, ")3");

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Lmh;")
    public static class62 field59 = class201.method1405(true, "::gc");

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field57 = 0;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "Z")
    public static boolean field62 = false;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "[Lna;")
    public static class153[] field50 = new class153[2048];

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Lmh;")
    public static class62 field64 = class201.method1405(true, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Lmh;")
    public static class62 field51 = class201.method1405(true, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public int field48;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public int field49;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public int field61;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public int field63;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lmi;II)V", line = 24)
    public final void method23(class92 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method702(-1);
            if (var4 == 0) {
                if (arg1 <= 21) {
                    this.method23((class92) null, 119, 45);
                }
                field52++;
                return;
            }
            this.method26(var4, arg0, arg2, false);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V", line = 67)
    private final void method24(int arg0, int arg1) {
        field55++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = (double) ((arg0 & 0xFF64) >> 8) / 256.0D;
        double var9 = var3;
        if (var7 < var3) {
            var9 = var7;
        }
        if (var5 < var9) {
            var9 = var5;
        }
        double var11 = var3;
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var7 > var3) {
            var11 = var7;
        }
        if (var5 > var11) {
            var11 = var5;
        }
        double var17 = (var9 + var11) / 2.0D;
        this.field49 = (int) (var17 * 256.0D);
        if (this.field49 < 0) {
            this.field49 = 0;
        } else if (this.field49 > 255) {
            this.field49 = 255;
        }
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var13 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var15 = (var7 - var5) / (var11 - var9);
            } else if (var7 == var11) {
                var15 = (var5 - var3) / (var11 - var9) + 2.0D;
            } else if (var5 == var11) {
                var15 = (var3 - var7) / (var11 - var9) + 4.0D;
            }
        }
        double var19 = var15 / 6.0D;
        if (var17 > 0.5D) {
            this.field61 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field61 = (int) (var13 * var17 * 512.0D);
        }
        if (arg1 != 1261875048) {
            this.method23((class92) null, 67, -128);
        }
        if (this.field61 < 1) {
            this.field61 = 1;
        }
        this.field48 = (int) ((double) this.field61 * var19);
        this.field63 = (int) (var13 * 256.0D);
        if (this.field63 < 0) {
            this.field63 = 0;
        } else if (this.field63 > 255) {
            this.field63 = 255;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 164)
    public static void method25(byte arg0) {
        if (arg0 >= -52) {
            return;
        }
        field59 = null;
        field56 = null;
        field64 = null;
        field51 = null;
        field50 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILmi;IZ)V", line = 179)
    private final void method26(int arg0, class92 arg1, int arg2, boolean arg3) {
        if (arg3) {
            return;
        }
        field53++;
        if (arg0 == 1) {
            this.field65 = arg1.method737(-1);
            this.method24(this.field65, 1261875048);
        } else if (arg0 == 2) {
            this.field66 = arg1.method721(101);
            if (this.field66 == 65535) {
                this.field66 = -1;
            }
        } else if (arg0 == 3) {
            this.field58 = arg1.method721(115);
        } else if (arg0 == 4) {
            this.field60 = false;
        }
    }
}
