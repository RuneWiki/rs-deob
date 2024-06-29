import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class82 extends class131 {

    @OriginalMember(owner = "client!di", name = "I", descriptor = "Lgf;")
    public static class180 field1357 = new class180("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!di", name = "F", descriptor = "F")
    public static float field1354;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!di", name = "H", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field1358;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZCLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method650(boolean arg0, char arg1, String arg2) {
        ++field1353;
        int var3 = class275.method1750(arg2, (byte) 123, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var3 > var7; ++var7) {
            int var8;
            for (var8 = var6; ~arg1 != ~arg2.charAt(var8); ++var8) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        if (arg0) {
            field1354 = 0.9027545F;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IF)V")
    public final void method651(int arg0, float arg1) {
        super.field2013 = arg1;
        if (arg0 != 6) {
            this.method651(-42, 1.0436378F);
        }
        ++field1356;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(Z)V")
    public static void method652(boolean arg0) {
        field1358 = null;
        if (!arg0) {
            field1357 = null;
        }
        field1357 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII)V")
    public final void method653(int arg0, int arg1, int arg2, int arg3) {
        super.field2019 = arg3;
        super.field2021 = arg0;
        super.field2017 = arg2;
        if (arg1 == 6) {
            ++field1355;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(IIIIIF)V")
    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    static {
        new class180("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    }
}
