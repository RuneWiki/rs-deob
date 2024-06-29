import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class517 {

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Lbj;")
    public static class162 field7502 = new class162(20, 8);

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Ls;")
    public static class186 field7504 = new class186(107, -2);

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "[I")
    public static int[] field7505 = new int[1000];

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "[I")
    public static int[] field7506 = new int[256];

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public int field7493;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public int field7494;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public int field7497;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public int field7498;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public int field7499;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public int field7500;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public int field7503;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "[B")
    public byte[] field7495;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "[B")
    public byte[] field7496;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static void method3072(byte arg0) {
        field7505 = null;
        field7506 = null;
        field7504 = null;
        field7502 = null;
        if (arg0 != 33) {
            method3072((byte) -17);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public static final boolean method3073(boolean arg0, String arg1) {
        field7501++;
        if (!arg0) {
            method3072((byte) 22);
        }
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class172.field2777; var2++) {
            if (arg1.equalsIgnoreCase(class52.field1118[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class317.field4821[var2])) {
                return true;
            }
        }
        return false;
    }
}
