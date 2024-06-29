import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class226 extends class371 {

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    private int field3325 = -1;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "Lnj;")
    public static class487 field3333 = new class487("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!id", name = "I", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    private int field3328;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    private int field3330;

    @OriginalMember(owner = "client!id", name = "S", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "Lvc;")
    public static class359 field3329;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "[I")
    private int[] field3331;

    @OriginalMember(owner = "client!id", name = "V", descriptor = "[[I")
    public static int[][] field3335;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZII)I")
    public static final int method1477(int arg0, boolean arg1, int arg2, int arg3) {
        ++field3327;
        if (class235.field3455 == null) {
            return 0;
        } else {
            if (!arg1) {
                field3333 = null;
            }
            int var4 = arg2 >> 7;
            int var5 = arg3 >> 7;
            if (var4 >= 0 && var5 >= 0 && ~(class35.field399 + -1) <= ~var4 && var5 <= class382.field5586 + -1) {
                int var6 = arg0;
                if (~arg0 > -4 && (class237.field3473[1][var4][var5] & 2) != 0) {
                    var6 = arg0 + 1;
                }
                return class235.field3455[var6].method1323(arg2, arg3);
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class226() {
        super(0, false);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
    public final void method1478(int arg0, int arg1, int arg2) {
        super.method1478(arg0, 56, arg2);
        ++field3323;
        int var4 = -117 / ((arg1 - -63) / 59);
        if (~this.field3325 <= -1 && class468.field6866 != null) {
            int var5 = class468.field6866.method1762(this.field3325, (byte) 45).field964 ? 64 : 128;
            this.field3331 = class468.field6866.method1759(var5, var5, 1.0F, (byte) 106, this.field3325, false);
            this.field3328 = var5;
            this.field3330 = var5;
        }
    }

    @OriginalMember(owner = "client!id", name = "g", descriptor = "(I)V")
    public static void method1479(int arg0) {
        if (arg0 == -4361) {
            field3329 = null;
            field3333 = null;
            field3335 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
    public final void method1480(int arg0) {
        ++field3334;
        if (arg0 <= 48) {
            field3335 = null;
        }
        super.method1480(106);
        this.field3331 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)I")
    public final int method1481(byte arg0) {
        if (arg0 != 28) {
            this.method1478(-97, 7, 81);
        }
        ++field3324;
        return this.field3325;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)[[I")
    public final int[][] method78(byte arg0, int arg1) {
        ++field3332;
        if (arg0 != 36) {
            this.method1478(-33, 38, 83);
        }
        int[][] var3 = super.field5364.method3064(1, arg1);
        if (super.field5364.field7632) {
            int var4 = this.field3330 * (~class23.field201 == ~this.field3328 ? arg1 : this.field3328 * arg1 / class23.field201);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class41.field455 == ~this.field3330) {
                for (int var8 = 0; var8 < class41.field455; ++var8) {
                    int var9 = this.field3331[var4++];
                    var7[var8] = class637.method3693(var9 << 4, 4080);
                    var6[var8] = class637.method3693(var9 >> 4, 4080);
                    var5[var8] = class637.method3693(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class41.field455; ++var10) {
                    int var11 = this.field3330 * var10 / class41.field455;
                    int var12 = this.field3331[var4 + var11];
                    var7[var10] = class637.method3693(255, var12) << 4;
                    var6[var10] = class637.method3693(65280, var12) >> 4;
                    var5[var10] = class637.method3693(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        int var4 = 125 / ((arg1 - -15) / 39);
        if (~arg0 == -1) {
            this.field3325 = arg2.method2620(117);
        }
        ++field3326;
    }

    static {
        new class487("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
    }
}
