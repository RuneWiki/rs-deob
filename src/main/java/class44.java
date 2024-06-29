import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class44 {

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "J")
    public long field502 = 0L;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field492 = 0;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "S")
    public static short field500 = 256;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field506 = 0;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static volatile int field493 = -1;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public int field495;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public int field496;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public int field499;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public int field504;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public int field509;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "Lti;")
    public static class248 field508;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Lio;")
    public class294 field494;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V", line = 8)
    public static void method272(boolean arg0) {
        if (!arg0) {
            method273(61);
        }
        field508 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 27)
    public static final void method273(int arg0) {
        class161.field2477 = null;
        if (arg0 != -22132) {
            field508 = (class248) null;
        }
        class13.field127 = null;
        class290.field4572 = null;
        class105.field1448 = null;
        class344.field5463 = null;
        field491++;
        class74.field920 = null;
        class41.field446 = null;
        class213.field3238 = null;
        class256.field4057 = null;
        class55.field647 = null;
        class241.field3702 = null;
        class189.field2848 = null;
        class161.field2478 = null;
        class149.field2364 = null;
        class93.field1233 = null;
        class310.field4872 = null;
        class306.field4767 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)I", line = 67)
    public static final int method274(int arg0, int arg1, int arg2, int arg3) {
        field505++;
        if (arg2 == arg3) {
            return arg2;
        }
        int var4 = 128 - arg1;
        int var5 = ((arg2 & 0xFF00FF00) >>> 7) * var4 + (arg3 >>> 7 & 0x1FE01FE) * arg1 & 0xFF00FF00;
        int var6 = (arg2 & 0xFF00FF) * var4 + (arg3 & 0xFF00FF) * arg1 & 0xFF00FF00;
        if (arg0 != -13109) {
            field500 = 6;
        }
        return var5 + (var6 >> 7);
    }
}
