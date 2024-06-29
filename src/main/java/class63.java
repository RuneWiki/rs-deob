import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class63 {

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Lpj;")
    public class78 field725 = new class78();

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "Z")
    public boolean field728 = false;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "Z")
    public static boolean field724 = false;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "[I")
    public static int[] field729;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public int field726;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public int field727;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)V")
    public static final void method359(byte arg0, int arg1) {
        if (arg1 == 37) {
            class308.field4351 = 3.0F;
        } else if (arg1 == 50) {
            class308.field4351 = 4.0F;
        } else if (arg1 == 75) {
            class308.field4351 = 6.0F;
        } else if (arg1 == 100) {
            class308.field4351 = 8.0F;
        } else if (arg1 == 200) {
            class308.field4351 = 16.0F;
        }
        if (arg0 < 72) {
            field724 = false;
        }
        field723++;
        class113.field1395 = -1;
        class113.field1395 = -1;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lol;IIIII)V")
    public static final void method360(class156 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field1911 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field1910[var6] != null) {
                arg0.field1911++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field1911; var7++) {
            int var8 = class229.field3232[arg1][arg2][arg3];
            while (var8 != 0) {
                class12 var12 = class266.field3800[(var8 & 0xFF) - 1];
                var8 >>>= 0x8;
                if (arg0.field1910[var7] == var12) {
                    continue label50;
                }
            }
            int var9 = class229.field3232[arg1][arg4][arg5];
            while (var9 != 0) {
                class12 var11 = class266.field3800[(var9 & 0xFF) - 1];
                var9 >>>= 0x8;
                if (arg0.field1910[var7] == var11) {
                    continue label50;
                }
            }
            for (int var10 = var7; var10 < arg0.field1911 - 1; var10++) {
                arg0.field1910[var10] = arg0.field1910[var10 + 1];
            }
            arg0.field1911--;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
    public static void method361(byte arg0) {
        field729 = null;
        if (arg0 != -104) {
            field729 = null;
        }
    }

    static {
        new class362("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field729 = new int[100];
    }
}
