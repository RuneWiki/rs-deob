import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class354 {

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public int field4858 = -1;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Z")
    public boolean field4862 = true;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    private int field4867 = 0;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public int field4868 = 128;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field4865 = 0;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "Lrc;")
    public static class108 field4864 = new class108(90, 12);

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Lch;")
    public static class151 field4871 = new class151("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "Lch;")
    public static class151 field4872 = new class151("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public int field4860;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public int field4861;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public int field4869;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public int field4870;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lkk;Z)V", line = 4)
    public final void method2180(class161 arg0, boolean arg1) {
        field4859++;
        while (true) {
            int var3 = arg0.method1172((byte) -119);
            if (var3 == 0) {
                if (arg1) {
                    return;
                } else {
                    this.method2182(113, 77);
                    return;
                }
            }
            this.method2181(var3, 255, arg0);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILkk;)V", line = 28)
    private final void method2181(int arg0, int arg1, class161 arg2) {
        if (arg0 == 1) {
            this.field4867 = arg2.method1178((byte) 63);
            this.method2182(95, this.field4867);
        } else if (arg0 == 2) {
            this.field4858 = arg2.method1134(arg1 ^ 0xFFFFBECF);
            if (this.field4858 == 65535) {
                this.field4858 = -1;
            }
        } else if (arg0 == 3) {
            this.field4868 = arg2.method1134(-16848);
        } else if (arg0 == 4) {
            this.field4862 = false;
        }
        if (arg1 == 255) {
            field4866++;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V", line = 73)
    private final void method2182(int arg0, int arg1) {
        field4863++;
        double var3 = (double) ((arg1 & 0xFFA80E) >> 16) / 256.0D;
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
        this.field4861 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field4870 = (int) (var15 * 256.0D);
        if (this.field4870 < 0) {
            this.field4870 = 0;
        } else if (this.field4870 > 255) {
            this.field4870 = 255;
        }
        if (arg0 <= 14) {
            return;
        }
        if (this.field4861 < 0) {
            this.field4861 = 0;
        } else if (this.field4861 > 255) {
            this.field4861 = 255;
        }
        if (var17 > 0.5D) {
            this.field4860 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field4860 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field4860 < 1) {
            this.field4860 = 1;
        }
        this.field4869 = (int) ((double) this.field4860 * var19);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 186)
    public static void method2183(int arg0) {
        field4864 = null;
        field4871 = null;
        if (arg0 != 324522536) {
            field4864 = null;
        }
        field4872 = null;
    }
}
