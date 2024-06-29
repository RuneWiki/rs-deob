import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class60 extends class210 {

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    private int field799 = 0;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "I")
    private int field809 = 0;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "I")
    private int field810 = 1;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    public static int field800 = 765;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "Z")
    public static boolean field806 = false;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "Ljn;")
    public static class409 field803 = new class409("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lat;B)Lwq;")
    public static final class35 method454(class256 arg0, byte arg1) {
        if (arg1 != 80) {
            return null;
        } else {
            ++field801;
            return new class35(arg0.method1747((byte) 12), arg0.method1747((byte) 12), arg0.method1747((byte) 12), arg0.method1747((byte) 12), arg0.method1725((byte) 0), arg0.method1725((byte) 0), arg0.method1738((byte) -82));
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIB)V")
    public static final void method455(int arg0, int arg1, int arg2, byte arg3) {
        class241.field3572 = arg1;
        if (arg3 == 0) {
            class136.field1869 = arg0;
            class153.field2064 = arg2;
            ++field805;
        }
    }

    @OriginalMember(owner = "client!f", name = "g", descriptor = "(I)V")
    public static void method456(int arg0) {
        if (arg0 <= 121) {
            field800 = 57;
        }
        field803 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)[I")
    public final int[] method361(int arg0, byte arg1) {
        ++field804;
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (arg1 != -38) {
            return null;
        } else {
            if (super.field2950.field4111) {
                int var4 = class331.field4911[arg0];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; class202.field2852 > var6; ++var6) {
                    int var7 = class430.field6250[var6];
                    int var8 = var7 - 2048 >> 1;
                    int var11;
                    if (this.field799 != 0) {
                        int var9 = var5 * var5 + var8 * var8 >> 12;
                        int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                        var11 = (int) ((double) (this.field810 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (var7 - var4) * this.field810;
                    }
                    int var12 = var11 - (var11 & -4096);
                    if (~this.field809 == -1) {
                        var12 = class92.field1136[var12 >> 4 & 255] - -4096 >> 1;
                    } else if (this.field809 == 2) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!f", name = "h", descriptor = "(I)V")
    public static final void method457(int arg0) {
        if (class182.field2565 != null) {
            class182.field2565.method748(true);
        }
        ++field802;
        if (arg0 != 14597) {
            method455(-50, -13, -43, (byte) 125);
        }
        if (class423.field6115 != null) {
            class423.field6115.method748(true);
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(III)Lhl;")
    public static final class63 method458(int arg0, int arg1, int arg2) {
        class369 var3 = class178.field2530[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class63 var4 = var3.field5341;
            var3.field5341 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILat;)V")
    public final void method56(int arg0, int arg1, class256 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 3) {
                    this.field810 = arg2.method1738((byte) -77);
                }
            } else {
                this.field809 = arg2.method1738((byte) -28);
            }
        } else {
            this.field799 = arg2.method1738((byte) -58);
        }
        if (arg1 != -11941) {
            field806 = false;
        }
        ++field807;
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
    public final void method363(int arg0) {
        ++field808;
        class51.method392(arg0 + arg0);
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
    public class60() {
        super(0, true);
    }

    static {
        new class409("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
    }
}
