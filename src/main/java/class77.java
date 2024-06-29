import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class77 extends class139 {

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    private int field949 = 585;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "Ldk;")
    public static class326 field942 = new class326("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "Ljava/lang/String;")
    public static String field947 = null;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "[[Ldt;")
    public static class145[][] field945;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        ++field946;
        if (arg2 == 0) {
            this.field949 = arg0.method1729(65280);
        }
        if (arg1 != -45) {
            this.field949 = 33;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)V")
    public static final void method446(int arg0, byte arg1) {
        if (arg1 <= 40) {
            field947 = null;
        }
        ++field943;
        class489 var2 = class116.method731(-625541408, 3, arg0);
        var2.method2861(-229012000);
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class77() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        ++field944;
        int[] var3 = super.field1844.method2176(arg0, 0);
        if (arg1 != 27782) {
            method447(-31);
        }
        if (super.field1844.field5045) {
            int var4 = class237.field3559[arg0];
            for (int var5 = 0; ~class356.field5147 < ~var5; ++var5) {
                int var6 = class216.field3245[var5];
                if (~var6 < ~this.field949 && var6 < -this.field949 + 4096 && ~var4 < ~(-this.field949 + 2048) && 2048 - -this.field949 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field949);
                    var3[var5] = -var10 + 4096;
                } else if (-this.field949 + 2048 < var6 && ~var6 > ~(this.field949 + 2048)) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field949;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field949 + 2048);
                } else if (this.field949 <= var4 && ~(-this.field949 + 4096) <= ~var4) {
                    if (~var6 <= ~this.field949 && ~(-this.field949 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field949 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field949;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field949 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
    public static void method447(int arg0) {
        if (arg0 != 0) {
            method446(15, (byte) 16);
        }
        field942 = null;
        field947 = null;
        field945 = null;
    }

    static {
        new class326("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
    }
}
