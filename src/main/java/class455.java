import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class class455 {

    @OriginalMember(owner = "client!or", name = "b", descriptor = "Lak;")
    public static class234 field6628 = new class234("K", "T", "K", "K");

    @OriginalMember(owner = "client!or", name = "a", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "[Z")
    public static boolean[] field6629;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "(I)V")
    public static void method2768(int arg0) {
        field6628 = null;
        if (arg0 >= 93) {
            field6629 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IJII)V")
    public static final void method2769(int arg0, long arg1, int arg2, int arg3) {
        field6627++;
        int var5 = ((int) arg1 & 0x7C260) >> 14;
        int var6 = (int) arg1 >> 20 & 0x3;
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (arg3 <= 95) {
            field6630 = -101;
        }
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class195.method1362(arg0, true, 0, var5, 0, 0, arg2, -1, var6);
            return;
        }
        class69 var8 = class510.field7458.method2973(-126, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field927;
            var10 = var8.field941;
        } else {
            var9 = var8.field941;
            var10 = var8.field927;
        }
        int var11 = var8.field950;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class195.method1362(arg0, true, var9, 0, var10, var11, arg2, -1, 0);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BLya;II)Z")
    public abstract boolean method27(byte arg0, class38 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lya;Z)V")
    public abstract void method25(class38 arg0, boolean arg1);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V")
    public abstract void method21(boolean arg0);

    @OriginalMember(owner = "client!or", name = "f", descriptor = "(I)Z")
    public abstract boolean method17(int arg0);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IILya;ILor;IZ)V")
    public abstract void method23(int arg0, int arg1, class38 arg2, int arg3, class455 arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lya;I)Lag;")
    public abstract class484 method29(class38 arg0, int arg1);

    static {
        new class234("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    }
}
