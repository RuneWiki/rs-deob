import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class78 {

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Llm;")
    public static class150 field1084 = new class150(32);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Z")
    public static boolean field1087 = true;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "[I")
    public static int[] field1092 = new int[100];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Ljb;")
    public static class224 field1090;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Z")
    public static boolean field1085;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "[[[Llh;")
    public static class58[][][] field1088;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBI)V")
    public static final void method501(int arg0, byte arg1, int arg2) {
        int var3 = class51.field716 * arg2 >> 8;
        if (arg1 >= -115) {
            return;
        }
        if (arg0 == -1 && !class137.field1876) {
            class117.method748(-99);
        } else if (arg0 != -1 && (class102.field1457 != arg0 || !class36.method250(6009)) && var3 != 0 && !class137.field1876) {
            class205.method1280(0, false, 2, (byte) -125, var3, arg0, class240.field3737);
        }
        field1091++;
        class102.field1457 = arg0;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V")
    public static final void method502(int arg0, int arg1) {
        field1086++;
        class265.method1718(17086);
        if (arg1 >= -81) {
            return;
        }
        class288.method1924(false);
        int var2 = class4.method17(17887, arg0).field2851;
        if (var2 == 0) {
            return;
        }
        int var3 = class189.field2864[arg0];
        if (var2 == 6) {
            class175.field2475 = var3;
        }
        if (var2 == 5) {
            class60.field835 = var3;
        }
        if (var2 == 9) {
            class58.field812 = var3;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static void method503(int arg0) {
        field1084 = null;
        if (arg0 >= -17) {
            field1084 = null;
        }
        field1090 = null;
        field1092 = null;
        field1088 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLaj;)Laj;")
    public abstract class123 method504(byte arg0, class123 arg1);
}
