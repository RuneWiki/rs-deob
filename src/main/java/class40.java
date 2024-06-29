import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class40 {

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
    public int field578 = -1;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    private int field584 = 0;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "Z")
    public boolean field583 = true;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public int field586 = 128;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "Lkn;")
    public static class442 field575 = new class442("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public static int field588 = -1;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "Z")
    public static boolean field589 = false;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
    public int field580;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
    public int field585;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILkh;)V", line = 6)
    public final void method371(int arg0, int arg1, class11 arg2) {
        while (true) {
            int var4 = arg2.method172((byte) 52);
            if (var4 == 0) {
                field582++;
                int var5 = -75 % ((arg1 + 10) / 62);
                return;
            }
            this.method373((byte) -104, arg2, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZI)V", line = 37)
    private final void method372(boolean arg0, int arg1) {
        field579++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF2D) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        if (arg0) {
            method375(false);
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
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
        this.field577 = (int) (var15 * 256.0D);
        this.field580 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field577 < 0) {
            this.field577 = 0;
        } else if (this.field577 > 255) {
            this.field577 = 255;
        }
        if (this.field580 < 0) {
            this.field580 = 0;
        } else if (this.field580 > 255) {
            this.field580 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field585 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field585 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field585 < 1) {
            this.field585 = 1;
        }
        this.field576 = (int) ((double) this.field585 * var19);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLkh;II)V", line = 130)
    private final void method373(byte arg0, class11 arg1, int arg2, int arg3) {
        if (arg0 != -104) {
            return;
        }
        if (arg2 == 1) {
            this.field584 = arg1.method208(27308);
            this.method372(false, this.field584);
        } else if (arg2 == 2) {
            this.field578 = arg1.method174(255);
            if (this.field578 == 65535) {
                this.field578 = -1;
            }
        } else if (arg2 == 3) {
            this.field586 = arg1.method174(arg0 + 359);
        } else if (arg2 == 4) {
            this.field583 = false;
        }
        field581++;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBI)V", line = 166)
    public static final void method374(int arg0, byte arg1, int arg2) {
        if (arg1 < -23) {
            field574++;
            class239 var3 = class436.method2740(16, arg2, -323285792);
            var3.method1622(60);
            var3.field3399 = arg0;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V", line = 192)
    public static void method375(boolean arg0) {
        if (!arg0) {
            method374(-34, (byte) 88, -69);
        }
        field575 = null;
    }
}
