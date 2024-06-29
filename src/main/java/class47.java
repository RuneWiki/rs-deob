import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class47 {

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Ldj;")
    private static class44 field877 = class89.method650(255, "Location");

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Ldj;")
    public static class44 field876 = field877;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "Z")
    public static boolean field878 = false;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "[[[B")
    public static byte[][][] field875 = new byte[4][104][104];

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)I")
    public static final int method350(int arg0, int arg1) {
        field879++;
        class49 var2 = class45.method343(arg1, (byte) -104);
        if (arg0 <= 92) {
            field875 = null;
        }
        int var3 = var2.field907;
        int var4 = var2.field906;
        int var5 = var2.field916;
        int var6 = class4.field58[var5 - var4];
        return class136.field2435[var3] >> var4 & var6;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
    public static void method351(boolean arg0) {
        field875 = null;
        field877 = null;
        if (arg0) {
            method350(77, -91);
        }
        field876 = null;
    }
}
