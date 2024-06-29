import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class474 {

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "Llh;")
    private class364 field6980 = new class364(256);

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "Lqg;")
    private class321 field6985;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "Lm;")
    private class126 field6983;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "[[F")
    public static float[][] field6984;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "Lui;")
    public static class151 field6982;

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "Ljava/lang/Object;")
    public static Object field6989;

    static {
        new class180("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field6984 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };
        new class180("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V", line = 4)
    public final void method2837(int arg0) {
        field6979++;
        this.field6980.method2348(5, 42);
        if (arg0 != 34842) {
            method2840(-63);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)Ljp;", line = 15)
    public final class236 method2838(int arg0, int arg1) {
        field6986++;
        Object var3 = this.field6980.method2339(-74, (long) arg0);
        if (var3 != null) {
            return (class236) var3;
        } else if (!this.field6983.method937((byte) 43, arg0)) {
            return null;
        } else if (arg1 == -16681) {
            class216 var4 = this.field6983.method935(arg0, -8037);
            int var5 = var4.field3112 ? 64 : this.field6985.field4774;
            class236 var7;
            if (var4.field3098 && this.field6985.method529()) {
                float[] var6 = this.field6983.method934(0.7F, (byte) -122, var5, var5, false, arg0);
                var7 = new class236(this.field6985, 3553, 34842, var5, var5, var4.field3108 != 0, var6, 6408);
            } else {
                short var8;
                int[] var9;
                if (var4.field3095 && class394.method2463(var4.field3109, arg1 ^ 0xFFFFF61E)) {
                    var8 = 6407;
                    var9 = this.field6983.method938(arg0, false, 0.7F, (byte) -43, var5, var5);
                } else {
                    var8 = 6408;
                    var9 = this.field6983.method936((byte) -102, false, arg0, var5, var5, 0.7F);
                }
                var7 = new class236(this.field6985, 3553, var8, var5, var5, var4.field3108 != 0, var9, false);
            }
            var7.method1534(var4.field3120, arg1 ^ 0xFFFFBEBC, var4.field3104);
            this.field6980.method2342((long) arg0, var7, -84);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V", line = 71)
    public final void method2839(int arg0) {
        field6987++;
        this.field6980.method2349(0);
        int var2 = 43 / ((8 - arg0) / 47);
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lqg;Lm;)V", line = 93)
    public class474(class321 arg0, class126 arg1) {
        this.field6985 = arg0;
        this.field6983 = arg1;
    }

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "(I)V", line = 103)
    public static void method2840(int arg0) {
        field6982 = null;
        if (arg0 != -1165) {
            method2840(-70);
        }
        field6989 = null;
        field6984 = null;
    }
}
