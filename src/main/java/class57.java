import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class57 {

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field1264 = -1;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Loa;")
    private static class98 field1265 = class38.method349(255, "Public chat");

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Loa;")
    public static class98 field1263 = class38.method349(255, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Loa;")
    public static class98 field1267 = class38.method349(255, "(Z");

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Loa;")
    public static class98 field1266 = field1265;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field1269 = 0;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Loa;")
    private static class98 field1268 = class38.method349(255, "OFF");

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "Loa;")
    public static class98 field1273 = class38.method349(255, "Freunde");

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Loa;")
    private static class98 field1275 = class38.method349(255, "Unable to connect)3");

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "Loa;")
    public static class98 field1272 = field1275;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "Loa;")
    public static class98 field1259 = field1268;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "Loa;")
    public static class98 field1276 = class38.method349(255, " )2> @cya@");

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "Loa;")
    public static class98 field1271 = field1275;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Lkd;")
    public static class73 field1270;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "[I")
    public static int[] field1261;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)[B")
    public abstract byte[] method459(int arg0);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IJ)V")
    public static final void method460(int arg0, long arg1) {
        field1260++;
        try {
            Thread.sleep(arg1);
            int var3 = 32 % ((38 - arg0) / 46);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
    public static void method461(boolean arg0) {
        field1259 = null;
        field1271 = null;
        field1267 = null;
        field1270 = null;
        field1268 = null;
        field1276 = null;
        field1275 = null;
        field1261 = null;
        field1263 = null;
        field1266 = null;
        field1272 = null;
        if (arg0) {
            field1271 = null;
        }
        field1273 = null;
        field1265 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[B)V")
    public abstract void method462(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static final void method463(byte arg0) {
        field1258++;
        while (class36.field890.method178(1833460135, class88.field2028) >= 11) {
            int var1 = class36.field890.method175(-123, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class33.field832[var1] == null) {
                var2 = true;
                class33.field832[var1] = new class55();
                if (class114.field2578[var1] != null) {
                    class33.field832[var1].method451(arg0 - 1, class114.field2578[var1]);
                }
            }
            class65.field1394[class131.field3082++] = var1;
            class55 var3 = class33.field832[var1];
            var3.field3609 = class119.field2680;
            int var4 = class36.field890.method175(-121, 1);
            if (var4 == 1) {
                class96.field2205[class74.field1603++] = var1;
            }
            int var5 = class36.field890.method175(34, 1);
            int var6 = class36.field890.method175(arg0 + 23, 5);
            int var7 = class10.field210[class36.field890.method175(-126, 3)];
            if (var6 > 15) {
                var6 -= 32;
            }
            if (var2) {
                var3.field3620 = var7;
            }
            int var8 = class36.field890.method175(-122, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1180(128, var5 == 1, class73.field1536.field3603[0] + var6, class73.field1536.field3648[0] - -var8);
        }
        class36.field890.method170(33538048);
        if (arg0 != 1) {
            method463((byte) 93);
        }
    }
}
