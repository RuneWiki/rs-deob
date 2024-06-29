import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class32 {

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lgg;")
    public static class63 field779 = class116.method911(43, ")1j");

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[B")
    public static byte[] field776 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field785 = 0;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Lgg;")
    private static class63 field783 = class116.method911(43, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Lgg;")
    public static class63 field780 = field783;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "[[[I")
    public static int[][][] field789 = new int[4][13][13];

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Lgg;")
    public static class63 field787 = class116.method911(43, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!db", name = "l", descriptor = "Lgg;")
    public static class63 field786 = class116.method911(43, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field788 = 0;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "La;")
    public static class1 field781;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Z")
    public static boolean field784;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "[I")
    public static int[] field790;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)[Lwb;")
    public static final class200[] method314(byte arg0) {
        field777++;
        class200[] var1 = new class200[class97.field2312];
        if (arg0 > -44) {
            method316(-4);
        }
        for (int var2 = 0; var2 < class97.field2312; var2++) {
            class200 var3 = new class200();
            var3.field3991 = class28.field658;
            var3.field3989 = class153.field3202;
            var3.field3990 = class163.field3366[var2];
            var3.field3993 = class60.field1521[var2];
            var3.field3988 = class190.field3875[var2];
            var3.field3992 = class190.field3868[var2];
            byte[] var4 = class85.field2014[var2];
            int var5 = var3.field3992 * var3.field3988;
            var3.field3994 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field3994[var6] = class110.field2486[class110.method881(var4[var6], 255)];
            }
            var1[var2] = var3;
        }
        class12.method151((byte) -112);
        return var1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method315(int arg0) {
        field781 = null;
        if (arg0 != -21531) {
            field778 = 52;
        }
        field779 = null;
        field780 = null;
        field787 = null;
        field790 = null;
        field786 = null;
        field789 = null;
        field783 = null;
        field776 = null;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public static final void method316(int arg0) {
        field788 = arg0;
        for (int var1 = 0; var1 < class199.field3979; var1++) {
            for (int var2 = 0; var2 < class13.field298; var2++) {
                if (class148.field3117[arg0][var1][var2] == null) {
                    class148.field3117[arg0][var1][var2] = new class96(arg0, var1, var2);
                }
            }
        }
    }
}
