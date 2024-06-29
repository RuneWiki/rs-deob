import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class409 {

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "[Ljava/lang/String;")
    private String[] field5878;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "Leb;")
    public static class395 field5883 = new class395();

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5885 = new Rectangle[100];

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "Ljn;")
    public static class409 field5884 = new class409("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "J")
    public static long field5886 = 0L;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "[I")
    public static int[] field5887;

    @OriginalMember(owner = "client!jn", name = "toString", descriptor = "()Ljava/lang/String;", line = 14)
    public final String toString() {
        field5881++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 45)
    public static void method2540(int arg0) {
        field5884 = null;
        field5885 = null;
        field5887 = null;
        field5883 = null;
        int var1 = -84 / ((-arg0 - 22) / 52);
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V", line = 81)
    public static final void method2541(int arg0) {
        field5879++;
        class186.field2608 = 0;
        int var1 = (class187.field2619.field4954 >> 7) + class28.field399;
        int var2 = -89 % ((25 - arg0) / 49);
        int var3 = (class187.field2619.field4951 >> 7) + class134.field1846;
        if (var1 >= 3053 && var1 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            class186.field2608 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            class186.field2608 = 1;
        }
        if (class186.field2608 == 1 && var1 >= 3139 && var1 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            class186.field2608 = 0;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILgt;)[Lmg;", line = 114)
    public static final class429[] method2542(int arg0, class341 arg1) {
        field5882++;
        if (!arg1.method2212(-335)) {
            return new class429[0];
        }
        class350 var2 = arg1.method2195((byte) -81);
        while (var2.field5134 == 0) {
            class418.method2587(false, 10L);
        }
        if (var2.field5134 == 2) {
            return new class429[0];
        }
        int[] var3 = (int[]) var2.field5129;
        class429[] var4 = new class429[var3.length >> 2];
        for (int var5 = arg0; var5 < var4.length; var5++) {
            class429 var6 = new class429();
            var4[var5] = var6;
            var6.field6234 = var3[var5 << 2];
            var6.field6235 = var3[(var5 << 2) + 1];
            var6.field6230 = var3[(var5 << 2) + 2];
            var6.field6236 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 167)
    public class409(String arg0, String arg1, String arg2, String arg3) {
        this.field5878 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZI)Ljava/lang/String;", line = 187)
    public final String method2543(boolean arg0, int arg1) {
        field5880++;
        return arg0 ? null : this.field5878[arg1];
    }
}
