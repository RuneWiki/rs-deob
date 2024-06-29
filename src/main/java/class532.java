import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public abstract class class532 {

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Lada;")
    public static class144 field7935 = new class144(5, 3);

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "Lada;")
    public static class144 field7936;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field7931;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field7932;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field7933;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field7934;

    static {
        new class572("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field7936 = new class144(39, 4);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method3209(boolean arg0) {
        field7934++;
        class324.field4469 = class26.method162(arg0, 2048, 0.4F, 8, arg0, 8, 35, 4);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZI)V", line = 12)
    public static final void method3210(int arg0, boolean arg1, int arg2) {
        class378.field5211 = 3;
        field7931++;
        if (arg2 > -107) {
            return;
        }
        class84.field1208 = arg0;
        class72.method585(96, class560.field8329.field5719, class560.field8329.field5709);
        if (arg1) {
            class263.method1665("", false, -128, "");
        } else {
            class110.method807(false);
            class263.method1665(class20.field200, false, -125, class303.field4171);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)I", line = 34)
    public static final int method3211(int arg0, int arg1) {
        field7933++;
        if (arg1 != -9419) {
            field7936 = null;
        }
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 52)
    public static void method3212(int arg0) {
        if (arg0 >= 57) {
            field7936 = null;
            field7935 = null;
        }
    }
}
