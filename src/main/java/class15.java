import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class15 {

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Lqv;")
    public static class316 field173 = new class316(15, 2);

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Lbd;")
    public static class44 field177;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Lcm;")
    public static class522 field178;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Lci;")
    public static class320 field174;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Z")
    public static final boolean method85(int arg0, int arg1) {
        field172++;
        if (arg0 == 4 || arg0 == 19 || arg0 == 16 || arg0 == 44 || arg0 == 10) {
            return true;
        } else if (arg0 == 12 || arg0 == 1001) {
            return true;
        } else {
            if (arg1 != -20) {
                method87((byte) 28);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!n", name = "s", descriptor = "(I)V")
    public abstract void method41(int arg0);

    @OriginalMember(owner = "client!n", name = "ba", descriptor = "(I)V")
    public abstract void method39(int arg0);

    @OriginalMember(owner = "client!n", name = "J", descriptor = "(III)V")
    public abstract void method37(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lul;IIILl;Ljava/awt/Canvas;)Lqa;")
    public static final class167 method86(class411 arg0, int arg1, int arg2, int arg3, class16 arg4, Canvas arg5) {
        field175++;
        if (arg3 != 1001) {
            field177 = null;
        }
        return new class33(arg2, arg5, arg4, arg1, arg0);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)Lau;")
    public static final class528 method87(byte arg0) {
        field170++;
        if (class382.field5456 == null || class465.field6749 == null) {
            return null;
        }
        class465.field6749.method1843(class382.field5456, -100);
        class528 var1 = (class528) class465.field6749.method1846(-18451);
        if (var1 == null) {
            return null;
        }
        if (arg0 <= 5) {
            field174 = null;
        }
        class463 var2 = class382.field5447.method1429(var1.field7723, -3708);
        return var2 != null && var2.field6723 && var2.method2743(class382.field5451, (byte) -124) ? var1 : class506.method2950(false);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIIZII)Z")
    public static final boolean method88(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        if (arg4 != 17686) {
            return false;
        }
        field171++;
        int var9 = class364.field5293.field343[0];
        int var10 = class364.field5293.field344[0];
        if (var9 < 0 || var9 >= class69.field1139 || var10 < 0 || class255.field3763 <= var10) {
            return false;
        } else if (arg5 >= 0 && arg5 < class69.field1139 && arg2 >= 0 && class255.field3763 > arg2) {
            int var11 = class121.method899(arg8, arg1, class364.field5293.method135((byte) 72), arg3, true, class206.field3142, arg6, var10, arg7, arg5, class22.field232, var9, arg0, class19.field213[class364.field5293.field6956], arg2);
            if (var11 < 1) {
                return false;
            }
            class17.field186 = class206.field3142[var11 - 1];
            class112.field1651 = class22.field232[var11 - 1];
            class121.field1890 = false;
            class320.method2041(-105);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!n", name = "ya", descriptor = "(Ln;)V")
    public abstract void method45(class15 arg0);

    @OriginalMember(owner = "client!n", name = "CA", descriptor = "(I)V")
    public abstract void method36(int arg0);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()Ln;")
    public abstract class15 method38();

    @OriginalMember(owner = "client!n", name = "M", descriptor = "([I)V")
    public abstract void method40(int[] arg0);

    @OriginalMember(owner = "client!n", name = "IA", descriptor = "(IIIIII)V")
    public abstract void method35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "C", descriptor = "(III)V")
    public abstract void method47(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!n", name = "SA", descriptor = "(I)V")
    public abstract void method44(int arg0);

    @OriginalMember(owner = "client!n", name = "K", descriptor = "()V")
    public abstract void method34();

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III[I)V")
    public abstract void method43(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILsv;)Lpr;")
    public static final class317 method89(int arg0, int arg1, class478 arg2) {
        field176++;
        if (arg0 != 4) {
            field173 = null;
        }
        class317 var3;
        if (class102.field1575 == null) {
            var3 = new class317();
        } else {
            var3 = class102.field1575;
            class102.field1575 = class102.field1575.field4709;
            class297.field4439--;
            var3.field4709 = null;
        }
        var3.field4711 = arg2;
        var3.field4714 = arg1;
        return var3;
    }

    @OriginalMember(owner = "client!n", name = "WA", descriptor = "(I)V")
    public abstract void method46(int arg0);

    @OriginalMember(owner = "client!n", name = "N", descriptor = "(III[I)V")
    public abstract void method42(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V")
    public static void method90(byte arg0) {
        if (arg0 < 1) {
            field173 = null;
        }
        field177 = null;
        field174 = null;
        field173 = null;
    }

    static {
        new class44("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
        field177 = new class44("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");
        field178 = null;
    }
}
