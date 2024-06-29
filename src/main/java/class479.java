import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class479 extends class426 {

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "Lwo;")
    public static class690 field6719 = new class690(81, 3);

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
    public static int field6726 = -1;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    public int field6717;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
    public int field6718;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
    public int field6721;

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
    public int field6722;

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!cn", name = "x", descriptor = "I")
    public int field6724;

    @OriginalMember(owner = "client!cn", name = "y", descriptor = "I")
    public int field6725;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "Ldba;")
    public static class79 field6715;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "Ljava/lang/String;")
    public String field6720;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 15)
    public static void method2810(int arg0) {
        if (arg0 != -13061) {
            method2812(-6, 13);
        }
        field6715 = null;
        field6719 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 31)
    public static final void method2811(byte arg0) {
        if (class114.field1485 == 3) {
            class245.method1487(4, -21316);
        } else if (class114.field1485 == 7) {
            class245.method1487(8, -21316);
        } else if (class114.field1485 == 10) {
            class245.method1487(11, -21316);
        }
        int var1 = 65 / ((71 - arg0) / 55);
        field6714++;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)Lrc;", line = 51)
    public static final class499 method2812(int arg0, int arg1) {
        field6716++;
        class499 var2 = (class499) class659.field9370.method2766(-122, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class589.field8530.method3800(arg0, 0, (byte) -92);
        class499 var4 = new class499();
        if (var3 != null) {
            var4.method2905(arg0, (byte) 125, new class389(var3));
        }
        if (arg1 != 4) {
            method2810(-48);
        }
        class659.field9370.method2772(var4, true, (long) arg0);
        return var4;
    }
}
