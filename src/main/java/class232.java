import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class232 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public int field3517;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "[I")
    public static int[] field3520 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Lsk;")
    public static class423 field3519 = new class423("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "Lsk;")
    public static class423 field3526 = new class423("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "Z")
    public static volatile boolean field3527 = false;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "[I")
    public static int[] field3528 = new int[25];

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Llt;")
    public static class458 field3524;

    @OriginalMember(owner = "client!vh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3518++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method1390(int arg0) {
        field3524 = null;
        field3519 = null;
        if (arg0 == -1008) {
            field3528 = null;
            field3526 = null;
            field3520 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z[FI)[F")
    public static final float[] method1391(boolean arg0, float[] arg1, int arg2) {
        if (!arg0) {
            field3519 = null;
        }
        field3521++;
        float[] var3 = new float[arg2];
        class356.method2185(arg1, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)Z")
    public static final boolean method1392(int arg0) {
        int var1 = 120 % ((arg0 + 15) / 39);
        field3523++;
        return class330.field4948 > 0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)Z")
    public static final boolean method1393(int arg0, int arg1, int arg2) {
        field3522++;
        if (!class381.field5555) {
            return false;
        }
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class409.field5933[var3] == null || class409.field5933[var3][var4] == null) {
            return false;
        }
        class427 var5 = class409.field5933[var3][var4];
        if (arg2 != -1008) {
            method1392(-115);
        }
        if (arg1 == -1 && var5.field6197 == 0) {
            for (class2 var6 = (class2) class329.field4932.method8((byte) -98); var6 != null; var6 = (class2) class329.field4932.method17((byte) 97)) {
                if (var6.field17 == 48 || var6.field17 == 1007 || var6.field17 == 15 || var6.field17 == 18 || var6.field17 == 3) {
                    for (class427 var7 = class413.method2435(160291920, var6.field20); var7 != null; var7 = class188.method1164(var7, (byte) 127)) {
                        if (var5.field6157 == var7.field6157) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class2 var8 = (class2) class329.field4932.method8((byte) -98); var8 != null; var8 = (class2) class329.field4932.method17((byte) 114)) {
                if (var8.field10 == arg1 && var5.field6157 == var8.field20 && (var8.field17 == 48 || var8.field17 == 1007 || var8.field17 == 15 || var8.field17 == 18 || var8.field17 == 3)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(I)V")
    public class232(int arg0) {
        this.field3517 = arg0;
    }
}
