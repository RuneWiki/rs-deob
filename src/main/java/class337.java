import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class337 {

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field5437 = 7759444;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field5438 = 0;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 12)
    public static final void method2384(byte arg0) {
        if (arg0 == -66) {
            field5435++;
            class153.field2480.method644((byte) -45);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZLnm;Lnm;)V", line = 25)
    public static final void method2385(int arg0, boolean arg1, class221 arg2, class221 arg3) {
        field5434++;
        class222.field3434 = arg1;
        class328.field5371 = arg2;
        if (arg0 <= 83) {
            field5438 = -107;
        }
        class291.field4827 = arg3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Lub;", line = 44)
    public static final class13 method2386(int arg0, int arg1) {
        field5433++;
        class13 var2 = (class13) class48.field691.method652((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class251.field4010.method1504(arg0, true, 34);
        class13 var4 = new class13();
        if (arg1 != 25335) {
            field5437 = -31;
        }
        if (var3 != null) {
            var4.method92(new class313(var3), arg0, false);
        }
        class48.field691.method642(var4, (long) arg0, -125);
        return var4;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)V", line = 67)
    public static final void method2387(int arg0, boolean arg1) {
        field5436++;
        if (class297.field4930 == arg1) {
            return;
        }
        if (arg0 != 19248) {
            field5437 = 31;
        }
        class297.field4930 = arg1;
        class268.method1889(-29506);
    }
}
