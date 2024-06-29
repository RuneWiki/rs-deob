import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class105 {

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "Lnc;")
    public static class144 field1977 = new class144(4096);

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "[Lv;")
    public static class224[] field1980 = new class224[4];

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "[I")
    public static int[] field1979;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Leh;III)[Lnb;")
    public static final class143[] method687(class52 arg0, int arg1, int arg2, int arg3) {
        field1976++;
        if (arg1 <= 59) {
            field1979 = null;
        }
        return class77.method495(20480, arg2, arg3, arg0) ? class141.method896((byte) -126) : null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lqe;Lqe;Lqe;B)V")
    public static final void method688(class179 arg0, class179 arg1, class179 arg2, byte arg3) {
        class232.field4289 = arg0;
        if (arg3 == 34) {
            class232.field4277 = arg1;
            field1978++;
            class232.field4287 = arg2;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static void method689(byte arg0) {
        field1980 = null;
        if (arg0 != 95) {
            method687(null, -118, -82, 88);
        }
        field1977 = null;
        field1979 = null;
    }
}
