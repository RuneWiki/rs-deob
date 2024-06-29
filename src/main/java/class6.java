import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class6 extends class69 {

    @OriginalMember(owner = "client!se", name = "l", descriptor = "[B")
    public byte[] field34;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "[S")
    private static short[] field32 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!se", name = "k", descriptor = "[S")
    private static short[] field33 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!se", name = "o", descriptor = "[S")
    private static short[] field37 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!se", name = "p", descriptor = "Z")
    public static boolean field38 = false;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "[[S")
    public static short[][] field35 = new short[][] { field37, field33, field32 };

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 15)
    public static void method15(int arg0) {
        field35 = null;
        field33 = null;
        if (arg0 == 4550) {
            field32 = null;
            field37 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 30)
    public static final String method16(String arg0, int arg1) {
        field36++;
        String var2 = class612.method3539(class234.method1600(arg0, -122), (byte) 60);
        if (var2 == null) {
            var2 = "";
        }
        int var3 = 87 % ((arg1 + 32) / 35);
        return var2;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "([B)V", line = 45)
    public class6(byte[] arg0) {
        this.field34 = arg0;
    }
}
