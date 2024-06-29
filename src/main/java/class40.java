import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class40 {

    @OriginalMember(owner = "client!sca", name = "d", descriptor = "Z")
    public boolean field431 = true;

    @OriginalMember(owner = "client!sca", name = "h", descriptor = "I")
    public int field435 = 512;

    @OriginalMember(owner = "client!sca", name = "f", descriptor = "I")
    public int field433 = -1;

    @OriginalMember(owner = "client!sca", name = "n", descriptor = "I")
    private int field441 = 0;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "Lea;")
    public static class474 field428 = new class474("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!sca", name = "j", descriptor = "Lea;")
    public static class474 field437 = new class474("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!sca", name = "m", descriptor = "Lraa;")
    public static class528 field440 = new class528("LOCAL", 4);

    @OriginalMember(owner = "client!sca", name = "o", descriptor = "Lig;")
    public static class206 field442 = new class206(93, 10);

    @OriginalMember(owner = "client!sca", name = "b", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!sca", name = "c", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!sca", name = "e", descriptor = "I")
    public int field432;

    @OriginalMember(owner = "client!sca", name = "g", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!sca", name = "i", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!sca", name = "k", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "client!sca", name = "l", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "client!sca", name = "p", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!sca", name = "q", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lrt;I)V")
    public final void method212(class194 arg0, int arg1) {
        field429++;
        while (true) {
            int var3 = arg0.method1177(255);
            if (var3 == 0) {
                if (arg1 == -4129) {
                    return;
                } else {
                    method214(27);
                    return;
                }
            }
            this.method213(var3, arg0, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(ILrt;B)V")
    private final void method213(int arg0, class194 arg1, byte arg2) {
        if (arg2 < 123) {
            method214(-34);
        }
        if (arg0 == 1) {
            this.field441 = arg1.method1180(-832631516);
            this.method215(this.field441, -1);
        } else if (arg0 == 2) {
            this.field433 = arg1.method1220(-121);
            if (this.field433 == 65535) {
                this.field433 = -1;
            }
        } else if (arg0 == 3) {
            this.field435 = arg1.method1220(120) << 2;
        } else if (arg0 == 4) {
            this.field431 = false;
        }
        field436++;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V")
    public static void method214(int arg0) {
        int var1 = 95 % ((arg0 - 7) / 40);
        field440 = null;
        field437 = null;
        field442 = null;
        field428 = null;
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(II)V")
    private final void method215(int arg0, int arg1) {
        field443++;
        double var3 = (double) ((arg0 & 0xFFA02C) >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
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
        this.field432 = (int) (var15 * 256.0D);
        this.field438 = (int) (var17 * 256.0D);
        if (arg1 < ~this.field432) {
            this.field432 = 0;
        } else if (this.field432 > 255) {
            this.field432 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field444 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field444 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field438 < 0) {
            this.field438 = 0;
        } else if (this.field438 > 255) {
            this.field438 = 255;
        }
        if (this.field444 < 1) {
            this.field444 = 1;
        }
        this.field439 = (int) ((double) this.field444 * var19);
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)V")
    public static final void method216(boolean arg0) {
        class353.method2235(10, 1);
        field434++;
        class163.method946(arg0);
        System.gc();
    }

    @OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIB)Z")
    public static final boolean method217(int arg0, int arg1, byte arg2) {
        if (arg2 > -52) {
            method214(-6);
        }
        field430++;
        return (arg0 & 0x22) != 0;
    }
}
