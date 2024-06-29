import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class246 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "[Z")
    public static boolean[] field4124 = new boolean[8];

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "Z")
    public static boolean field4126 = false;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4128 = "Loaded title screen";

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field4129 = -1;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "[S")
    public static short[] field4127;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLab;)Lrd;")
    public static final class218 method1754(byte arg0, class249 arg1) {
        int var2 = 100 / ((-arg0 - 10) / 60);
        field4125++;
        return new class218(arg1.method1762(-1), arg1.method1762(-1), arg1.method1762(-1), arg1.method1762(-1), arg1.method1812((byte) 52), arg1.method1802((byte) -128));
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
    public static final void method1755(int arg0, int arg1, int arg2, String arg3, String arg4, int arg5, String arg6, String arg7) {
        for (int var8 = 99; var8 > 0; var8--) {
            class35.field550[var8] = class35.field550[var8 - 1];
            class126.field2105[var8] = class126.field2105[var8 - 1];
            class51.field866[var8] = class51.field866[var8 - 1];
            class108.field1785[var8] = class108.field1785[var8 - 1];
            class131.field2162[var8] = class131.field2162[var8 - 1];
            class27.field467[var8] = class27.field467[var8 - 1];
            class286.field4740[var8] = class286.field4740[var8 - 1];
        }
        class51.field866[0] = arg6;
        class219.field3700 = class196.field3162;
        class108.field1785[0] = arg4;
        class35.field550[0] = arg5;
        class131.field2162[0] = arg7;
        class126.field2105[0] = arg0;
        class200.field3224++;
        class286.field4740[0] = arg2;
        field4130++;
        if (arg1 != -1) {
            field4128 = null;
        }
        class27.field467[0] = arg3;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static void method1756(byte arg0) {
        field4128 = null;
        field4124 = null;
        if (arg0 < -90) {
            field4127 = null;
        }
    }
}
