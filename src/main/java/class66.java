import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class66 {

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lem;")
    public static class206 field859 = new class206(25, 8);

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Llh;")
    public static class487 field861 = new class487(79, -1);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "[Lf;")
    public static class702[] field862;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIZ)Z", line = 7)
    public static final boolean method559(int arg0, int arg1, boolean arg2) {
        field860++;
        if (class344.method2008((byte) -7, arg0, arg1)) {
            return (arg0 & 0xB000) != 0 | class213.method1373(arg0, arg1, arg2) | class645.method3597(arg0, arg1, false) ? true : (arg1 & 0x37) == 0 & (class91.method662(-2, arg1, arg0) | class330.method1958(114, arg1, arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 23)
    public static void method560(int arg0) {
        int var1 = -29 / ((-arg0 - 17) / 44);
        field861 = null;
        field862 = null;
        field859 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Z", line = 37)
    public static final boolean method561(int arg0, int arg1) {
        field858++;
        if (arg1 == -26019) {
            return arg0 == 3 || arg0 == 5 || arg0 == 6;
        } else {
            return false;
        }
    }
}
