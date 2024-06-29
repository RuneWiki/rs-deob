import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class34 extends class326 {

    @OriginalMember(owner = "client!na", name = "P", descriptor = "I")
    private int field514 = 4096;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    private int field512 = 4096;

    @OriginalMember(owner = "client!na", name = "W", descriptor = "I")
    private int field521 = 4096;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "I")
    public static int field517 = 0;

    @OriginalMember(owner = "client!na", name = "X", descriptor = "Lgd;")
    public static class206 field522 = new class206("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "[Ljava/lang/String;")
    public static String[] field524;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "Lr;")
    public static class110 field519;

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "Llh;")
    public static class336 field523;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILbt;I)V")
    public final void method33(int arg0, class32 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field514 = arg1.method215((byte) 107);
                }
            } else {
                this.field512 = arg1.method215((byte) 127);
            }
        } else {
            this.field521 = arg1.method215((byte) 96);
        }
        if (arg2 > -3) {
            method259((byte) 120);
        }
        ++field516;
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(I)V")
    public static final void method256(int arg0) {
        int var1 = -77 % ((arg0 - -27) / 47);
        ++field518;
        int var2 = class488.field6789.method2412((byte) -108, class222.field2958);
        if (var2 == 0) {
            class191.field2589 = null;
            class197.method1135(false, 0);
        } else if (~var2 != -2) {
            class276.method1547((byte) (class67.field911 + -4 & 255), -112);
            class197.method1135(false, 2);
        } else {
            class276.method1547((byte) 0, -121);
            class197.method1135(false, 512);
            if (class1.field26 != null) {
                class447.method2631(25050);
            }
        }
        class120.field1766 = class373.field5104;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(II)V")
    public static final void method257(int arg0, int arg1) {
        ++field513;
        class106 var2 = class250.method1400(arg1, arg1 + -82, arg0);
        var2.method659(arg1 ^ -95);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(IB)[[I")
    public final int[][] method48(int arg0, byte arg1) {
        if (arg1 > -52) {
            this.field514 = -126;
        }
        ++field515;
        int[][] var3 = super.field4343.method2356(arg0, 104);
        if (super.field4343.field5336) {
            int[][] var4 = this.method1828(0, true, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class181.field2495 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var8[var11] = this.field521 * var12 >> 12;
                    var9[var11] = this.field512 * var13 >> 12;
                    var10[var11] = this.field514 * var14 >> 12;
                } else {
                    var8[var11] = this.field521;
                    var9[var11] = this.field512;
                    var10[var11] = this.field514;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class34() {
        super(1, false);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([Ljava/lang/Object;[II)V")
    public static final void method258(Object[] arg0, int[] arg1, int arg2) {
        if (arg2 != -16473) {
            field522 = null;
        }
        class233.method1301(arg0, (byte) -97, arg1, 0, arg1.length + -1);
        ++field520;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    public static void method259(byte arg0) {
        field519 = null;
        if (arg0 >= -78) {
            method259((byte) 49);
        }
        field523 = null;
        field522 = null;
        field524 = null;
    }

    static {
        new class206("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field524 = new String[100];
    }
}
