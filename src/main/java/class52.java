import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class52 {

    @OriginalMember(owner = "client!si", name = "l", descriptor = "Lha;")
    private static class46 field906 = class271.method1828("Loaded config", -46);

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Lha;")
    private static class46 field901 = class271.method1828("Drop", -46);

    @OriginalMember(owner = "client!si", name = "k", descriptor = "[Z")
    public static boolean[] field905 = new boolean[100];

    @OriginalMember(owner = "client!si", name = "a", descriptor = "Lha;")
    public static class46 field895 = field901;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "Lha;")
    public static class46 field912 = field906;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public int field899;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "J")
    public long field910;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "Lj;")
    public class139 field902;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "Lj;")
    public class139 field903;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Lj;")
    public class139 field904;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZZ)V")
    public static final void method378(boolean arg0, boolean arg1) {
        field909++;
        if (!arg1) {
            field905 = null;
        }
        byte[][] var2 = class131.field2398;
        byte var3 = 4;
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class92.field1717[var5] >> 8) * 64 - class29.field567;
            int var12 = (class92.field1717[var5] & 0xFF) * 64 - class77.field1432;
            byte[] var13 = var2[var5];
            if (var13 != null) {
                class267.method1789(117);
                class177.method1268(class97.field1801 * 8 - 48, class38.field669 * 8 - 48, arg0, var11, var12, 64, class183.field3282, var13);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class92.field1717[var6] & 0xFF) * 64 - class77.field1432;
            int var8 = (class92.field1717[var6] >> 8) * 64 - class29.field567;
            byte[] var9 = var2[var6];
            if (var9 == null && class97.field1801 < 800) {
                class267.method1789(50);
                for (int var10 = 0; var10 < var3; var10++) {
                    class227.method1553(64, !arg1, var10, var8, 64, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
    public static final void method379(int arg0, int arg1) {
        if (arg1 != 800) {
            field895 = null;
        }
        field908++;
        class126.method980(arg1 ^ 0xFFFFC173);
        class5.method17((byte) -14);
        int var2 = class6.method24(arg0, (byte) 64).field177;
        if (var2 == 0) {
            return;
        }
        int var3 = class29.field568[arg0];
        if (var2 == 9) {
            class277.field4828 = var3;
        }
        if (var2 == 6) {
            class169.field2996 = var3;
        }
        if (var2 == 5) {
            class257.field4476 = var3;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method380(int arg0) {
        field912 = null;
        int var1 = 108 / ((arg0 - 46) / 47);
        field906 = null;
        field895 = null;
        field905 = null;
        field901 = null;
    }
}
