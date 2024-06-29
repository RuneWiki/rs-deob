import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class44 {

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field775 = -1;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "F")
    public static float field777;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
    public static final void method354(int arg0, int arg1) {
        field773++;
        class105 var2 = class9.method72(12, -1, arg1);
        var2.method764((byte) -118);
        if (arg0 < 10) {
            field775 = -17;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIBII)V")
    public static final void method355(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field774++;
        if (class112.field1719 != 0 && arg1 != 0 && class284.field4353 < 50 && arg0 != -1) {
            class49.field810[class284.field4353] = arg0;
            class60.field987[class284.field4353] = arg1;
            class173.field2539[class284.field4353] = arg3;
            class295.field4492[class284.field4353] = null;
            class163.field2364[class284.field4353] = 0;
            class10.field155[class284.field4353] = arg4;
            class284.field4353++;
        }
        int var5 = -85 % ((78 - arg2) / 32);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILpk;)V")
    public static final void method356(int arg0, class237 arg1) {
        class170.field2501 = arg1;
        if (arg0 != 0) {
            method355(86, 73, (byte) 34, -88, 63);
        }
        field778++;
    }
}
