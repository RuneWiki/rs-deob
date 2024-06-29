import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class304 {

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "[C")
    private static char[] field4293 = new char[64];

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!iba", name = "g", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "Loia;")
    public static class52 field4296;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field4293[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field4293[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field4293[var2] = (char) (var2 + 48 - 52);
        }
        field4293[62] = '*';
        field4293[63] = '-';
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIILha;IIII)V", line = 3)
    public static final void method1998(int arg0, int arg1, int arg2, class548 arg3, int arg4, int arg5, int arg6, int arg7) {
        field4298++;
        class496.field6948 = arg3;
        class515.field7152 = class496.field6948.method1495();
        class513.field7094 = class496.field6948.method1495();
        class601.field8132 = class496.field6948.method1495();
        class172.field2389 = 0;
        class494.field6919 = arg4;
        class521.field7260 = 1;
        class319.field4441 = arg0;
        class20.field190 = arg2;
        if (arg5 != 21121) {
            field4296 = null;
        }
        class27.field349 = arg7;
        class517.field7217 = 0;
        class382.field5486 = null;
        class139.method920(arg6, arg1, arg5 ^ 0x5280);
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILuu;ILuu;)V", line = 57)
    public static final void method1999(int arg0, class237 arg1, int arg2, class237 arg3) {
        field4292++;
        class254.field3718 = arg1;
        class240.field3595 = arg3;
        if (arg0 != 48) {
            field4293 = null;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(III)Z", line = 72)
    public static final boolean method2000(int arg0, int arg1, int arg2) {
        field4294++;
        if (arg2 > -114) {
            method2000(-73, -108, 64);
        }
        return class392.method2457(arg1, arg0, (byte) -109) | (arg0 & 0x800) != 0 || class286.method1899((byte) -128, arg1, arg0);
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)I", line = 86)
    public static final int method2001(int arg0) {
        field4295++;
        if (arg0 != -11523) {
            field4293 = null;
        }
        return class501.method3019(arg0 ^ 0xFFFFD2FD, false);
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZI)V", line = 97)
    public static final void method2002(boolean arg0, int arg1) {
        field4297++;
        class328.method2094(class118.field1561, class553.field7716, class544.field7545, arg0, (byte) -115);
        if (arg1 != 24615) {
            field4293 = null;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)V", line = 109)
    public static void method2003(byte arg0) {
        field4296 = null;
        field4293 = null;
        if (arg0 > -31) {
            method1999(29, null, -107, null);
        }
    }
}
