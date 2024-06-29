import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class73 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "[I")
    public static int[] field1148 = new int[32];

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Leg;")
    public static class37 field1150 = class174.method1167("Continuer", -28);

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field1149 = 0;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Lbf;")
    public static class202 field1151 = new class202(4);

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Leg;")
    public static class37 field1153 = class174.method1167(" )2> <col=00ffff>", -18);

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field1159 = 0;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Leg;")
    public static class37 field1156 = class174.method1167("l", -120);

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "[I")
    public static int[] field1152 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Lpe;")
    public static class237 field1160 = null;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Lol;")
    public static class108 field1158;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "Lqk;")
    public static class7 field1155;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "[S")
    public static short[] field1147;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "[S")
    public static short[] field1157;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static void method493(byte arg0) {
        field1158 = null;
        field1148 = null;
        field1157 = null;
        field1155 = null;
        field1152 = null;
        field1160 = null;
        field1156 = null;
        field1147 = null;
        field1150 = null;
        field1153 = null;
        field1151 = null;
        if (arg0 != 8) {
            method493((byte) 68);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBIII)V")
    public static final void method494(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1154++;
        int var5 = 70 % ((65 - arg1) / 46);
        if (arg0 - arg2 >= class178.field2972 && class217.field3741 >= arg0 + arg2 && class286.field5050 <= (arg3 - arg2) && class96.field1507 >= arg2 + arg3) {
            class246.method1696(arg4, arg3, 126, arg2, arg0);
        } else {
            class196.method1360(arg0, arg3, arg2, (byte) -41, arg4);
        }
    }
}
