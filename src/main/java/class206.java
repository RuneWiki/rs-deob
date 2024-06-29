import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class206 {

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Lqe;")
    private static class179 field3849 = method1380("Loaded textures", (byte) -127);

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lqe;")
    public static class179 field3846 = method1380("null", (byte) 104);

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "[J")
    public static long[] field3852 = new long[32];

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Lqe;")
    private static class179 field3850 = method1380("Loading textures )2 ", (byte) -126);

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Lqe;")
    public static class179 field3847 = field3850;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "Lqe;")
    public static class179 field3853 = field3849;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Lqe;")
    public static class179 field3845 = method1380("titlebutton", (byte) -126);

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field3848 = 0;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Lqe;")
    public static class179 field3856 = method1380("Konfig geladen)3", (byte) -127);

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Lqe;")
    public static class179 field3857 = method1380("Suche nach Updates )2 ", (byte) -41);

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Leh;")
    public static class52 field3854;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "[Lae;")
    public static class6[] field3843;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method1377(int arg0) {
        field3854 = null;
        field3856 = null;
        field3843 = null;
        field3853 = null;
        field3852 = null;
        field3850 = null;
        field3846 = null;
        field3857 = null;
        field3845 = null;
        field3849 = null;
        if (arg0 > 62) {
            field3847 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public static final void method1378(int arg0) {
        class78.field1510 = new byte[4][104][arg0];
        class70.field1408 = new int[4][105][105];
        class119.field2238 = new int[104];
        field3851++;
        class14.field342 = new byte[4][104][104];
        class195.field3628 = new int[104];
        class28.field619 = new int[104];
        class175.field3135 = new int[104];
        class46.field1010 = 99;
        class143.field2605 = new int[104];
        class66.field1340 = new byte[4][104][104];
        class10.field286 = new byte[4][104][104];
        class128.field2344 = new byte[4][105][105];
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
    public static final void method1379(int arg0) {
        field3855++;
        int var1 = 0;
        int[] var2 = new int[class59.field1266];
        for (int var3 = 0; var3 < class59.field1266; var3++) {
            class15 var5 = class131.method835((byte) -20, var3);
            if (var5.field374 >= 0 || var5.field372 >= 0) {
                var2[var1++] = var3;
            }
        }
        class211.field3937 = new int[var1];
        for (int var4 = arg0; var4 < var1; var4++) {
            class211.field3937[var4] = var2[var4];
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/String;B)Lqe;")
    public static final class179 method1380(String arg0, byte arg1) {
        field3844++;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class179 var4 = new class179();
        int var5 = 0;
        var4.field3256 = new byte[var3];
        int var6 = -92 / ((arg1 + 86) / 40);
        while (var5 < var3) {
            int var7 = var2[var5++] & 0xFF;
            if (var7 <= 45 && var7 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var8 = var2[var5++] & 0xFF;
                var4.field3256[var4.field3277++] = (byte) ((var7 - 40) * 43 + var8 - 48);
            } else if (var7 != 0) {
                var4.field3256[var4.field3277++] = (byte) var7;
            }
        }
        var4.method1150(0);
        return var4.method1171(true);
    }
}
