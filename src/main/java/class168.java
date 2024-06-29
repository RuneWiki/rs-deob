import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class168 extends class18 {

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "[I")
    public static int[] field3237 = new int[5];

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "Lob;")
    private static class141 field3236 = class175.method1195(40, "shake:");

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "Lob;")
    public static class141 field3238 = field3236;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "[Lca;")
    public static class22[] field3239 = new class22[256];

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "Lob;")
    public static class141 field3242 = class175.method1195(40, "(Z");

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "Lob;")
    public static class141 field3243 = field3236;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "[Lcb;")
    public static class23[] field3240 = new class23[4];

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "Lpe;")
    public static class154 field3234;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "Ltg;")
    public static class196 field3235;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
    public static final void method1154(byte arg0) {
        field3233++;
        int[] var1 = new int[class66.field1282];
        if (arg0 <= 103) {
            method1154((byte) -46);
        }
        int var2 = 0;
        for (int var3 = 0; var3 < class66.field1282; var3++) {
            class50 var5 = class96.method645((byte) -61, var3);
            if (var5.field933 >= 0 || var5.field973 >= 0) {
                var1[var2++] = var3;
            }
        }
        class107.field2069 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class107.field2069[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)V")
    public static void method1155(byte arg0) {
        field3238 = null;
        field3240 = null;
        field3236 = null;
        field3237 = null;
        if (arg0 != -48) {
            return;
        }
        field3239 = null;
        field3243 = null;
        field3234 = null;
        field3242 = null;
        field3235 = null;
    }
}
