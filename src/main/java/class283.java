import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class283 extends class232 {

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "Z")
    public static boolean field4852 = true;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "Lok;")
    public static class146 field4845 = class235.method1724(-12908, ":assistreq:");

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "Lok;")
    public static class146 field4856 = class235.method1724(-12908, "Chargement en cours)3)3)3");

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
    public int field4841;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
    public int field4847;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
    public int field4850;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
    public int field4854;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "Lok;")
    public class146 field4848;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "Loh;")
    public static class15 field4843;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "[I")
    public int[] field4840;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "[I")
    public int[] field4844;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "[Lld;")
    public class118[] field4853;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "[Lok;")
    public class146[] field4842;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "[[[B")
    public static byte[][][] field4846;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V", line = 17)
    public static void method2047(boolean arg0) {
        field4846 = (byte[][][]) null;
        if (!arg0) {
            method2048(true);
        }
        field4845 = null;
        field4843 = null;
        field4856 = null;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(Z)V", line = 53)
    public static final void method2048(boolean arg0) {
        field4855++;
        try {
            if (arg0) {
                method2048(false);
            }
            if (class223.field3718 == 1) {
                int var1 = class215.field3560.method874((byte) 85);
                if (var1 > 0 && class215.field3560.method898(83)) {
                    int var2 = var1 - class144.field2404;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class215.field3560.method870((byte) -112, var2);
                    return;
                }
                class215.field3560.method883(arg0);
                class215.field3560.method877((byte) -89);
                class132.field2229 = null;
                class302.field5179 = null;
                if (class86.field1372 == null) {
                    class223.field3718 = 0;
                } else {
                    class223.field3718 = 2;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class215.field3560.method883(false);
            class302.field5179 = null;
            class86.field1372 = null;
            class223.field3718 = 0;
            class132.field2229 = null;
        }
    }
}
