import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class619 extends class82 {

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    public static int field8944;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
    public static int field8945;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
    public static int field8946;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(II)[I")
    public final int[] method201(int arg0, int arg1) {
        ++field8944;
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (super.field990.field3641) {
            class345.method1928(var3, 0, class629.field9033, class85.field1036[arg0]);
        }
        if (arg1 != 12218) {
            this.method201(-88, -37);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
    public class619() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILet;Z)V")
    public static final void method3556(int arg0, class509 arg1, boolean arg2) {
        ++field8946;
        int var3 = ~arg1.field7185 == -1 ? arg1.field7094 : arg1.field7185;
        int var4 = arg1.field7180 != 0 ? arg1.field7180 : arg1.field7059;
        class629.method3604(class459.field6326[arg1.field7045 >> 16], arg1.field7045, arg0 + -10438, arg2, var3, var4);
        if (arg0 == 10438) {
            if (arg1.field7101 != null) {
                class629.method3604(arg1.field7101, arg1.field7045, 0, arg2, var3, var4);
            }
            class565 var5 = (class565) class309.field3937.method2645((long) arg1.field7045, (byte) -123);
            if (var5 != null) {
                class198.method1069(var4, var3, arg2, var5.field8297, (byte) 96);
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZZ)Z")
    public static boolean method3557(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    static {
        new class180("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
    }
}
