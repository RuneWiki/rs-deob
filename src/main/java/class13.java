import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EIBTXPJE")
public class class13 {

    @OriginalMember(owner = "client!EIBTXPJE", name = "a", descriptor = "I")
    private int field638 = -494;

    @OriginalMember(owner = "client!EIBTXPJE", name = "g", descriptor = "I")
    public int field644 = -1;

    @OriginalMember(owner = "client!EIBTXPJE", name = "h", descriptor = "Z")
    public boolean field645 = false;

    @OriginalMember(owner = "client!EIBTXPJE", name = "i", descriptor = "Z")
    public boolean field646 = true;

    @OriginalMember(owner = "client!EIBTXPJE", name = "b", descriptor = "I")
    private int field639;

    @OriginalMember(owner = "client!EIBTXPJE", name = "c", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!EIBTXPJE", name = "f", descriptor = "I")
    public int field643;

    @OriginalMember(owner = "client!EIBTXPJE", name = "j", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "client!EIBTXPJE", name = "k", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "client!EIBTXPJE", name = "l", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "client!EIBTXPJE", name = "m", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "client!EIBTXPJE", name = "n", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!EIBTXPJE", name = "o", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "client!EIBTXPJE", name = "e", descriptor = "Ljava/lang/String;")
    public String field642;

    @OriginalMember(owner = "client!EIBTXPJE", name = "d", descriptor = "[LEIBTXPJE;")
    public static class13[] field641;

    @OriginalMember(owner = "client!EIBTXPJE", name = "a", descriptor = "(LNXFIIFAD;I)V")
    public static void method187(class41 arg0, int arg1) {
        class37 var2 = new class37(arg0.method431("flo.dat", null), -670);
        field640 = var2.method388();
        if (field641 == null) {
            field641 = new class13[field640];
        }
        for (int var3 = 0; var3 < field640; var3++) {
            if (field641[var3] == null) {
                field641[var3] = new class13();
            }
            field641[var3].method188(var2, 0);
        }
        if (arg1 == 24570) {
            ;
        }
    }

    @OriginalMember(owner = "client!EIBTXPJE", name = "a", descriptor = "(LMNKDCXXG;I)V")
    public void method188(class37 arg0, int arg1) {
        if (arg1 != 0) {
            this.field638 = 444;
        }
        while (true) {
            int var3 = arg0.method386();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field643 = arg0.method390();
                this.method189((byte) 5, this.field643);
            } else if (var3 == 2) {
                this.field644 = arg0.method386();
            } else if (var3 == 3) {
                this.field645 = true;
            } else if (var3 == 5) {
                this.field646 = false;
            } else if (var3 == 6) {
                this.field642 = arg0.method393();
            } else if (var3 == 7) {
                int var4 = this.field647;
                int var5 = this.field648;
                int var6 = this.field649;
                int var7 = this.field650;
                int var8 = arg0.method390();
                this.method189((byte) 5, var8);
                this.field647 = var4;
                this.field648 = var5;
                this.field649 = var6;
                this.field650 = var7;
                this.field651 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "client!EIBTXPJE", name = "a", descriptor = "(BI)V")
    private void method189(byte arg0, int arg1) {
        if (arg1 == 16711935) {
            arg1 = 0;
        }
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
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
        this.field647 = (int) (var19 * 256.0D);
        if (arg0 == 5) {
            boolean var21 = false;
        } else {
            this.field639 = -61;
        }
        this.field648 = (int) (var15 * 256.0D);
        this.field649 = (int) (var17 * 256.0D);
        if (this.field648 < 0) {
            this.field648 = 0;
        } else if (this.field648 > 255) {
            this.field648 = 255;
        }
        if (this.field649 < 0) {
            this.field649 = 0;
        } else if (this.field649 > 255) {
            this.field649 = 255;
        }
        if (var17 > 0.5D) {
            this.field651 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field651 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field651 < 1) {
            this.field651 = 1;
        }
        this.field650 = (int) ((double) this.field651 * var19);
        int var22 = this.field647 + (int) (Math.random() * 16.0D) - 8;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field648 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        int var24 = this.field649 + (int) (Math.random() * 48.0D) - 24;
        if (var24 < 0) {
            var24 = 0;
        } else if (var24 > 255) {
            var24 = 255;
        }
        this.field652 = this.method190(var22, var23, var24);
    }

    @OriginalMember(owner = "client!EIBTXPJE", name = "a", descriptor = "(III)I")
    private final int method190(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }
}
