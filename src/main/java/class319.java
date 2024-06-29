import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class319 {

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public int field4639 = -1;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public static int field4640 = 0;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "Lco;")
    public static class210 field4636 = new class210(8);

    @OriginalMember(owner = "client!or", name = "i", descriptor = "[I")
    public static int[] field4644 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "Leo;")
    public static class291 field4642;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "Lih;")
    public class354 field4637;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "[I")
    public int[] field4641;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "[Ljava/lang/String;")
    public String[] field4638;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(III)V", line = 4)
    public static final void method1956(int arg0, int arg1, int arg2) {
        field4643++;
        class89 var3 = class146.method695(5, arg2, (byte) -56);
        if (arg0 <= 30) {
            method1957(18);
        }
        var3.method449(true);
        var3.field1106 = arg1;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V", line = 19)
    public static void method1957(int arg0) {
        if (arg0 != 64) {
            field4640 = -22;
        }
        field4642 = null;
        field4636 = null;
        field4644 = null;
    }
}
