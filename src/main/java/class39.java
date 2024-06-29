import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class39 {

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "J")
    public long field712 = 0L;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "Lke;")
    public static class256 field704 = class316.method2202("Examiner", 27626);

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field707 = 0;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public int field699;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public int field703;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public int field706;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public int field708;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    public int field715;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "Lng;")
    public static class138 field714;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Lmc;")
    public class51 field700;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "Lmc;")
    public class51 field711;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "[Lrd;")
    public static class135[] field713;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V", line = 13)
    public static final void method297(boolean arg0) {
        class49.field895.method709(2);
        for (int var1 = 0; var1 < 32; var1++) {
            class254.field4353[var1] = 0L;
        }
        if (!arg0) {
            return;
        }
        field701++;
        for (int var2 = 0; var2 < 32; var2++) {
            class229.field3928[var2] = 0L;
        }
        class59.field1067 = 0;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([Lke;B)[Lke;", line = 53)
    public static final class256[] method298(class256[] arg0, byte arg1) {
        field702++;
        class256[] var2 = new class256[5];
        if (arg1 < 38) {
            field707 = -50;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class30.method214(new class256[] { class305.method2125((byte) 86, var3), class104.field1863 }, 29784);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class30.method214(new class256[] { var2[var3], arg0[var3] }, 29784);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(Z)V", line = 81)
    public static final void method299(boolean arg0) {
        if (class199.field3634 != null) {
            class75.method570((byte) 110, class199.field3634);
            class199.field3634 = null;
        }
        field716++;
        if (arg0) {
            method299(true);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V", line = 98)
    public static void method300(byte arg0) {
        if (arg0 == -81) {
            field704 = null;
            field714 = null;
            field713 = null;
        }
    }
}
