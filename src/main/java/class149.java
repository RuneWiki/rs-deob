import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class149 {

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lkh;")
    public static class117 field2709 = class224.method1450((byte) -61, "Die Verbindung konnte");

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Lkh;")
    public static class117 field2717 = class224.method1450((byte) -2, ")3");

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "Lkh;")
    public static class117 field2719 = class224.method1450((byte) -64, "sl_flags");

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "[I")
    public static int[] field2718 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Lkh;")
    public static class117 field2720 = class224.method1450((byte) 113, "cross");

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "[I")
    public static int[] field2715 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "Lai;")
    public static class10 field2716;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Lah;")
    public static class9 field2712;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)V")
    public static final void method1065(byte arg0, int arg1) {
        if (arg0 >= -26) {
            field2719 = null;
        }
        field2713++;
        class156.field2838 = arg1;
        class34.field807 = -1;
        class211.field3837 = -1;
        class145.method1001((byte) 93);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lai;I)V")
    public static final void method1066(class10 arg0, int arg1) {
        if (arg1 != -1) {
            field2712 = null;
        }
        class219.field3978 = arg0;
        field2714++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z[Lkh;)[Lkh;")
    public static final class117[] method1067(boolean arg0, class117[] arg1) {
        class117[] var2 = new class117[5];
        field2721++;
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class36.method316((byte) -34, new class117[] { class42.method358(var3, (byte) 34), class4.field57 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class36.method316((byte) -34, new class117[] { var2[var3], arg1[var3] });
            }
        }
        if (arg0) {
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public static void method1068(byte arg0) {
        field2720 = null;
        int var1 = 71 % ((arg0 + 5) / 37);
        field2718 = null;
        field2712 = null;
        field2715 = null;
        field2709 = null;
        field2716 = null;
        field2717 = null;
        field2719 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
    public static final void method1069(int arg0, int arg1) {
        class185.field3326 = arg0;
        if (arg1 != 5) {
            field2717 = null;
        }
        class243.field4426 = 50;
        field2711++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)J")
    public static final long method1070(int arg0, int arg1, int arg2) {
        class170 var3 = class109.field2063[arg0][arg1][arg2];
        return var3 == null || var3.field3073 == null ? 0L : var3.field3073.field4326;
    }
}
