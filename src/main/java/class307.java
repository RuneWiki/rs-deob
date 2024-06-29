import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public abstract class class307 {

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "Lsc;")
    public static class270 field4692 = new class270(8, 0, 4, 1);

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "Lsc;")
    public static class270 field4693 = new class270(14, 0, 4, 1);

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "[I")
    public static int[] field4696 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field4695 = 0;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field4698 = 0;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field4697 = 0;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "Lo;")
    public static class363 field4691;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    public static void method2026(int arg0) {
        field4696 = null;
        field4693 = null;
        if (arg0 == 11) {
            field4692 = null;
            field4691 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lfi;BLza;)V")
    public static final void method2027(class38 arg0, byte arg1, class299 arg2) {
        field4694++;
        if (arg1 < 40) {
            method2027(null, (byte) -79, null);
        }
        boolean var3 = class300.field4608.method2082(arg0.field499, arg0.field496 | 0xFF000000, arg0.field626, arg0.field651 ? class116.field1781.field7460 : null, (byte) -10, arg2, arg0.field544, arg0.field558) == null;
        if (var3) {
            class50.field768.method292((byte) 121, new class8(arg0.field499, arg0.field626, arg0.field544, arg0.field496 | 0xFF000000, arg0.field558, arg0.field651));
            class5.method27(arg0, -208246073);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)I")
    public static int method2028(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
