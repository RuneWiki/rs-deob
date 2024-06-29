import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class522 {

    @OriginalMember(owner = "client!im", name = "e", descriptor = "Lpca;")
    public static class653 field7475 = new class653(50);

    @OriginalMember(owner = "client!im", name = "i", descriptor = "[I")
    public static int[] field7479 = new int[14];

    @OriginalMember(owner = "client!im", name = "j", descriptor = "Lmfa;")
    public static class562 field7480 = new class562();

    @OriginalMember(owner = "client!im", name = "k", descriptor = "[I")
    public static int[] field7481 = new int[32];

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field7471;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public int field7472;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public int field7474;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public int field7476;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "[Lxa;")
    public static class458[] field7478;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V")
    public static void method2975(boolean arg0) {
        field7479 = null;
        field7480 = null;
        field7478 = null;
        field7481 = null;
        field7475 = null;
        if (arg0) {
            field7480 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljo;Ljo;Ljo;Ljo;I)V")
    public static final void method2976(class303 arg0, class303 arg1, class303 arg2, class303 arg3, int arg4) {
        class238.field3009 = arg3;
        class311.field4025 = arg0;
        class639.field9070 = arg2;
        field7471++;
        class533.field7623 = arg1;
        class271.field3434 = new class382[class238.field3009.method1740((byte) 120)][];
        if (arg4 != 0) {
            method2977((byte) -13, -86);
        }
        class485.field7070 = new boolean[class238.field3009.method1740((byte) 120)];
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BI)Z")
    public static final boolean method2977(byte arg0, int arg1) {
        field7477++;
        int var2 = arg0 & 0xFF;
        if (arg1 <= 122) {
            field7481 = null;
        }
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class689.field9726[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;IZ)V")
    public static final void method2978(int arg0, String arg1, String arg2, int arg3, boolean arg4) {
        if (arg3 != 0) {
            field7480 = null;
        }
        field7473++;
        class397.method2177(true, -1, arg1, arg2, arg4, arg0, 64);
    }
}
