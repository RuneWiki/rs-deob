import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class260 {

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Lqh;")
    public static class189 field4539 = new class189(260);

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Ldf;")
    private static class51 field4542 = class46.method233("glow1:", 100);

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Ldf;")
    public static class51 field4543 = class46.method233("headicons_prayer", 100);

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Ldf;")
    public static class51 field4540 = field4542;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "Ldf;")
    public static class51 field4544 = field4542;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field4546 = 0;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)[Ltg;")
    public static final class171[] method1768(byte arg0) {
        field4541++;
        int var1 = -43 / ((arg0 + 6) / 44);
        class171[] var2 = new class171[class190.field3183];
        for (int var3 = 0; var3 < class190.field3183; var3++) {
            byte[] var4 = class67.field1100[var3];
            int var5 = class221.field3837[var3] * class106.field1751[var3];
            int[] var6 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                var6[var7] = class139.field2327[class191.method1366(var4[var7], 255)];
            }
            var2[var3] = new class254(class13.field194, class122.field2078, class96.field1591[var3], class125.field2123[var3], class221.field3837[var3], class106.field1751[var3], var6);
        }
        class111.method804((byte) -14);
        return var2;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)I")
    public static final int method1769(int arg0) {
        if (arg0 == -31761) {
            field4538++;
            return 2;
        } else {
            return -43;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    public static void method1770(int arg0) {
        field4544 = null;
        field4540 = null;
        field4539 = null;
        field4543 = null;
        if (arg0 == 29687) {
            field4542 = null;
        }
    }
}
