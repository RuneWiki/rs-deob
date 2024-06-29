import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class244 extends class145 {

    @OriginalMember(owner = "client!oaa", name = "M", descriptor = "I")
    private int field3455 = -1;

    @OriginalMember(owner = "client!oaa", name = "P", descriptor = "Lea;")
    public static class474 field3458 = new class474("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!oaa", name = "R", descriptor = "I")
    public static int field3460 = -1;

    @OriginalMember(owner = "client!oaa", name = "F", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!oaa", name = "G", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!oaa", name = "H", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!oaa", name = "I", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!oaa", name = "J", descriptor = "I")
    private int field3453;

    @OriginalMember(owner = "client!oaa", name = "N", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!oaa", name = "O", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!oaa", name = "Q", descriptor = "I")
    private int field3459;

    @OriginalMember(owner = "client!oaa", name = "L", descriptor = "[I")
    private int[] field3454;

    @OriginalMember(owner = "client!oaa", name = "S", descriptor = "[I")
    public static int[] field3461;

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "(I)I")
    public final int method868(int arg0) {
        ++field3449;
        return arg0 != -1 ? -77 : this.field3455;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BI)[[I")
    public final int[][] method75(byte arg0, int arg1) {
        ++field3450;
        int[][] var3 = super.field1792.method1826(arg1, -16486);
        if (super.field1792.field3917) {
            int var4 = this.field3459 * (class441.field6574 == this.field3453 ? arg1 : this.field3453 * arg1 / class441.field6574);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class647.field9368 != ~this.field3459) {
                for (int var8 = 0; ~class647.field9368 < ~var8; ++var8) {
                    int var9 = this.field3459 * var8 / class647.field9368;
                    int var10 = this.field3454[var4 + var9];
                    var7[var8] = class643.method3659(var10, 255) << 4;
                    var6[var8] = class643.method3659(4080, var10 >> 4);
                    var5[var8] = class643.method3659(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; ~var11 > ~class647.field9368; ++var11) {
                    int var12 = this.field3454[var4++];
                    var7[var11] = class643.method3659(255, var12) << 4;
                    var6[var11] = class643.method3659(var12 >> 4, 4080);
                    var5[var11] = class643.method3659(var12 >> 12, 4080);
                }
            }
        }
        return arg0 > -28 ? null : var3;
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "()V")
    public class244() {
        super(0, false);
    }

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "(I)V")
    public static void method1625(int arg0) {
        field3458 = null;
        if (arg0 < 68) {
            method1625(108);
        }
        field3461 = null;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        ++field3457;
        if (arg1 >= -67) {
            this.method871(41, -91, 69);
        }
        if (arg0 == 0) {
            this.field3455 = arg2.method1220(115);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(III)V")
    public final void method871(int arg0, int arg1, int arg2) {
        ++field3452;
        if (arg0 != -256) {
            this.method28(-67, -68, (class194) null);
        }
        super.method871(arg0, arg1, arg2);
        if (this.field3455 >= 0 && class177.field2184 != null) {
            int var4 = !class177.field2184.method438(arg0 ^ -169, this.field3455).field8944 ? 128 : 64;
            this.field3454 = class177.field2184.method432(var4, 1.0F, this.field3455, var4, -18170, false);
            this.field3459 = var4;
            this.field3453 = var4;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(III)V")
    public static final void method1626(int arg0, int arg1, int arg2) {
        ++field3456;
        if (class227.method1477(arg2, -1)) {
            class571.method3320(arg1 ^ -24561, class297.field4403[arg2], arg0);
            if (arg1 != -24494) {
                field3460 = -39;
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)V")
    public final void method76(int arg0) {
        super.method76(arg0);
        ++field3451;
        this.field3454 = null;
    }
}
