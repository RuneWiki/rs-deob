import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class55 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public int field654;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "Llt;")
    public static class581 field657;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "F")
    public static float field648;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Lkda;")
    public static class328 field649;

    static {
        new class572("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field657 = new class581("LIVE", 0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIBII)V", line = 10)
    public static final void method356(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        class106.field1529 = arg1;
        class193.field2860 = arg2;
        class245.field3537 = arg0;
        class491.field6994 = arg6;
        if (arg4 >= 16) {
            class398.field5470 = arg3;
            class396.field5456 = arg5;
            field656++;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)Z", line = 35)
    public static final boolean method357(int arg0) {
        if (arg0 == -1) {
            field653++;
            return class103.field1484 > 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 46)
    public static void method358(byte arg0) {
        field649 = null;
        if (arg0 == -18) {
            field657 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(IIII)V", line = 56)
    public class55(int arg0, int arg1, int arg2, int arg3) {
        this.field646 = arg1;
        this.field647 = arg0;
        this.field654 = arg2;
        this.field651 = arg3;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)Lbd;", line = 67)
    public final class55 method359(byte arg0, int arg1) {
        field652++;
        int var3 = -124 % ((arg0 - 73) / 51);
        return new class55(this.field647, arg1, this.field654, this.field651);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BIIIIZ)V", line = 79)
    public static final void method360(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg4 < 1) {
            arg4 = 1;
        }
        field650++;
        if (arg2 < 1) {
            arg2 = 1;
        }
        int var6 = arg4 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class428.field5752 - class43.field508) * var6 / 100 + class43.field508;
        int var8 = -38 / ((-arg0 - 33) / 47);
        if (class129.field1795 > var7) {
            var7 = class129.field1795;
        } else if (var7 > class247.field3552) {
            var7 = class247.field3552;
        }
        int var9 = var7 * 512 * arg4 / (arg2 * 334);
        if (class205.field3052 > var9) {
            short var10 = class205.field3052;
            var7 = var10 * 334 * arg2 / (arg4 * 512);
            if (var7 > class247.field3552) {
                var7 = class247.field3552;
                int var11 = arg4 * var7 * 512 / (var10 * 334);
                int var12 = (arg2 - var11) / 2;
                if (arg5) {
                    class99.field1445.method479();
                    class99.field1445.method1378(true, arg1, -16777216, var12, arg4, arg3);
                    class99.field1445.method1378(true, arg2 + arg1 - var12, -16777216, var12, arg4, arg3);
                }
                arg1 += var12;
                arg2 -= var12 * 2;
            }
        } else if (var9 > class423.field5718) {
            short var13 = class423.field5718;
            var7 = arg2 * var13 * 334 / (arg4 * 512);
            if (class129.field1795 > var7) {
                var7 = class129.field1795;
                int var14 = arg2 * var13 * 334 / (var7 * 512);
                int var15 = (arg4 - var14) / 2;
                if (arg5) {
                    class99.field1445.method479();
                    class99.field1445.method1378(true, arg1, -16777216, arg2, var15, arg3);
                    class99.field1445.method1378(true, arg1, -16777216, arg2, var15, arg3 + arg4 - var15);
                }
                arg4 -= var15 * 2;
                arg3 += var15;
            }
        }
        class151.field2297 = arg3;
        class549.field8211 = (short) arg4;
        class103.field1496 = arg4 * var7 / 334;
        class595.field8777 = arg1;
        class354.field4828 = (short) arg2;
    }
}
