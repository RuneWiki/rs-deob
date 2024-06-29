import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class60 {

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "Lpi;")
    public static class342 field1055 = new class342("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "Lef;")
    public static class335 field1057 = new class335(10, 2, 2, 0);

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "Ljava/util/Random;")
    public static Random field1059 = new Random();

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "Lgr;")
    public static class296 field1060 = new class296(10, 15);

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "F")
    public static float field1061;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "Lu;")
    public class52 field1058;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lbu;IZIZII)V")
    public static final void method527(class17 arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class281.field4024 = arg3;
        class102.field1693 = arg1;
        class406.field6095 = arg6;
        class219.field3158 = arg4;
        class431.field6417 = arg5;
        class488.field7226 = arg0;
        if (!arg2) {
            class289.field4118 = 1;
            field1056++;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)V")
    public static final void method528(boolean arg0) {
        field1054++;
        if (class388.field5841) {
            return;
        }
        if (class443.field6623.field601) {
            class526.field7779 = ((int) class526.field7779 + 191 & 0xFFFFFF80);
        } else {
            class174.field2668 += (24.0F - class174.field2668) / 2.0F;
        }
        class157.field2461 = true;
        class388.field5841 = arg0;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
    public static void method529(int arg0) {
        field1059 = null;
        field1060 = null;
        if (arg0 <= 75) {
            field1055 = null;
        }
        field1055 = null;
        field1057 = null;
    }
}
