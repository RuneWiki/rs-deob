import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class61 extends class146 {

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field1034 = 100;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field1040 = 1;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "Lic;")
    public static class160 field1037 = new class160(4);

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public int field1042;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Luc;")
    public static class115 field1036;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IBI)V")
    public static final void method469(int arg0, byte arg1, int arg2) {
        class238.field3750[arg0] = arg2;
        field1045++;
        class5 var3 = (class5) class116.field1948.method1063((byte) -94, (long) arg0);
        if (var3 == null) {
            class5 var4 = new class5(4611686018427387905L);
            class116.field1948.method1064(var4, (long) arg0, (byte) -122);
        } else if (var3.field66 != 4611686018427387905L) {
            var3.field66 = class62.method472(99) + 500L | 0x4000000000000000L;
        }
        if (arg1 >= 102) {
            ;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public static void method470(int arg0) {
        field1036 = null;
        if (arg0 == 4) {
            field1037 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Z")
    public static final boolean method471(int arg0) {
        if (arg0 > -8) {
            field1036 = null;
        }
        field1044++;
        if (class137.field2309) {
            try {
                if ((Boolean) class120.method877(class205.field3294.field1291, 25718, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }
}
