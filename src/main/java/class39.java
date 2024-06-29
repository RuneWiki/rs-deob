import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class39 {

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public int field1050 = 0;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public int field1071 = 0;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Lkd;")
    public static class73 field1061 = class126.method1070((byte) -66, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "[I")
    public static int[] field1062 = new int[25];

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field1054 = 0;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "Lkd;")
    public static class73 field1074 = class126.method1070((byte) -66, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "Lkd;")
    public static class73 field1073 = class126.method1070((byte) -66, "m");

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "Lkd;")
    private static class73 field1072 = class126.method1070((byte) -66, "Choose Option");

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lkd;")
    public static class73 field1060 = field1072;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field1068 = 0;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public int field1056;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public int field1058;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public int field1075;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public int field1076;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public int field1077;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "Lcc;")
    public class18 field1063;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "La;")
    public static class1 field1066;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Lde;")
    public static class27 field1064;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Ljava/awt/Image;")
    public static Image field1065;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLq;II)Lgd;")
    public static final class46 method302(byte arg0, class111 arg1, int arg2, int arg3) {
        if (arg0 != 2) {
            method303(-26);
        }
        field1057++;
        return class140.method1142(arg3, arg2, -116, arg1) ? class23.method193(128) : null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static final void method303(int arg0) {
        class142.field3529.method534((byte) 58);
        if (arg0 == 0) {
            field1051++;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public static void method304(int arg0) {
        if (arg0 != 26941) {
            return;
        }
        field1074 = null;
        field1064 = null;
        field1062 = null;
        field1066 = null;
        field1061 = null;
        field1065 = null;
        field1060 = null;
        field1072 = null;
        field1073 = null;
    }
}
