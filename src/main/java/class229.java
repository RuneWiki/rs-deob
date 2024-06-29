import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class229 {

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field3429 = -1;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "[I")
    public static int[] field3440 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public static int field3446 = 1;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public int field3423;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public int field3424;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public int field3425;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public int field3426;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public int field3428;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public int field3430;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public int field3431;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public int field3432;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public int field3433;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public int field3434;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public int field3435;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public int field3436;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public int field3437;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public int field3438;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public int field3439;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public int field3441;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public int field3444;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public int field3445;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILve;)V")
    public static final void method1494(int arg0, class233 arg1) {
        field3442++;
        class204.field2958 = arg1;
        class160.field2317 = class204.field2958.method1525(11672, 16);
        if (arg0 != -20713) {
            field3440 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public static final void method1495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        if (arg1 != -13058) {
            return;
        }
        field3443++;
        class113 var13 = new class113();
        var13.field1625 = arg10;
        var13.field1619 = arg4;
        var13.field1605 = arg8;
        var13.field1618 = arg11;
        var13.field1613 = arg7;
        var13.field1622 = arg9;
        var13.field1609 = arg3;
        var13.field1623 = arg5;
        var13.field1616 = arg6;
        var13.field1624 = arg2;
        var13.field1612 = arg0;
        var13.field1621 = arg12;
        class290.field4580.method652(90, var13);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static final void method1496(int arg0) {
        field3427++;
        class202.field2917.method260(0);
        if (arg0 != -1) {
            method1494(-7, (class233) null);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public static void method1497(byte arg0) {
        if (arg0 > 46) {
            field3440 = null;
        }
    }
}
