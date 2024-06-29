import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class23 extends class278 {

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public static volatile int field281 = 0;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "Z")
    public static boolean field284 = false;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "Lj;")
    public static class153 field285;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([II)[I", line = 4)
    public static final int[] method118(int[] arg0, int arg1) {
        field283++;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class185.method1310(arg0, arg1, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V", line = 19)
    public static final void method119(boolean arg0) {
        class103.field1604.method1431((byte) 121);
        if (!arg0) {
            field284 = true;
        }
        field282++;
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(B)V", line = 34)
    public static final void method120(byte arg0) {
        if (class291.field4907 != null) {
            class291.field4907.method998((byte) 97);
        }
        field280++;
        if (class103.field1601 != null) {
            class103.field1601.method998((byte) 97);
        }
        class178.method1280(class53.field653, 22050, 2, (byte) -84);
        if (arg0 != -115) {
            field284 = false;
        }
        class291.field4907 = class54.method302(class189.field3023, 0, class51.field622, 22050, (byte) 105);
        class291.field4907.method996(class299.field5076, 62);
        class103.field1601 = class54.method302(class189.field3023, 1, class51.field622, 2048, (byte) 105);
        class103.field1601.method996(client.field4933, 82);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 69)
    public static void method121(int arg0) {
        field285 = null;
        if (arg0 != 31251) {
            method120((byte) 120);
        }
    }
}
