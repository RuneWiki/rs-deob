import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class84 extends class355 {

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "Ljava/lang/Object;")
    private Object field1071;

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "Lpm;")
    public static class349 field1073 = new class349("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "Z")
    public static boolean field1077 = true;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "Ltj;")
    public static class108 field1070;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 4)
    public final Object method491(int arg0) {
        int var2 = -48 % ((80 - arg0) / 40);
        field1068++;
        return this.field1071;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V", line = 15)
    public static final void method492(int arg0) {
        class381.field5412 = arg0;
        field1072++;
        class228.field3392.method2755(arg0);
        class359.field5185 = false;
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(B)V", line = 25)
    public static void method493(byte arg0) {
        int var1 = -71 / ((7 - arg0) / 61);
        field1073 = null;
        field1070 = null;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 43)
    public class84(Object arg0) {
        this.field1071 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)Z", line = 54)
    public final boolean method494(byte arg0) {
        int var2 = -12 / ((arg0 - 10) / 47);
        field1076++;
        return false;
    }
}
