import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class311 extends class466 {

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    private int field4182 = 585;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "[Lno;")
    public static class601[] field4183 = new class601[6];

    @OriginalMember(owner = "client!he", name = "J", descriptor = "Ldm;")
    public static class46 field4187;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "Lcba;")
    public static class471 field4188;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
    public static void method1945(byte arg0) {
        field4183 = null;
        field4187 = null;
        if (arg0 != 102) {
            field4188 = null;
        }
        field4188 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg1 != -5062) {
            this.method2(-29, 69);
        }
        if (arg2 == 0) {
            this.field4182 = arg0.method93((byte) 98);
        }
        ++field4186;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II)Z")
    public static final boolean method1946(int arg0, int arg1) {
        ++field4185;
        if (arg0 != 19 && ~arg0 != -9 && ~arg0 != -10 && ~arg0 != -49 && ~arg0 != -19) {
            if (arg1 <= 43) {
                field4188 = null;
            }
            return arg0 == 2 || ~arg0 == -1008;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class311() {
        super(0, true);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field4184;
        if (arg1 != 0) {
            return null;
        } else {
            int[] var3 = super.field6557.method565(arg0, -24728);
            if (super.field6557.field1163) {
                int var4 = class63.field1085[arg0];
                for (int var5 = 0; ~var5 > ~class312.field4207; ++var5) {
                    int var6 = class431.field6129[var5];
                    if (~var6 < ~this.field4182 && ~var6 > ~(-this.field4182 + 4096) && ~var4 < ~(2048 - this.field4182) && ~(this.field4182 + 2048) < ~var4) {
                        int var7 = -var6 + 2048;
                        int var8 = ~var7 <= -1 ? var7 : -var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field4182 + 2048);
                        var3[var5] = -var10 + 4096;
                    } else if (~var6 < ~(-this.field4182 + 2048) && ~(this.field4182 + 2048) < ~var6) {
                        int var11 = var4 - 2048;
                        int var12 = var11 >= 0 ? var11 : -var11;
                        int var13 = var12 - this.field4182;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (-this.field4182 + 2048);
                    } else if (~var4 <= ~this.field4182 && ~(-this.field4182 + 4096) <= ~var4) {
                        if (var6 >= this.field4182 && ~(-this.field4182 + 4096) <= ~var6) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = var15 < 0 ? -var15 : var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (-this.field4182 + 2048);
                            var3[var5] = -var18 + 4096;
                        }
                    } else {
                        int var19 = var6 - 2048;
                        int var20 = var19 >= 0 ? var19 : -var19;
                        int var21 = var20 - this.field4182;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (-this.field4182 + 2048);
                    }
                }
            }
            return var3;
        }
    }

    static {
        new class104("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        new class104("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field4187 = new class46();
        field4188 = new class471(81, -2);
    }
}
