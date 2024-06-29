import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class313 {

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field3892 = 0;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "[Z")
    public static boolean[] field3894 = new boolean[100];

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Lcq;")
    public static class110 field3890 = new class110(22, -2);

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Lfg;")
    public static class174 field3888;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Lwb;")
    public static class182 field3891;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIZII)V")
    public static final void method1796(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (class639.field9075.field6773 != 0 && arg2 != 0 && class309.field3825 < 50 && arg1 != -1) {
            class89.field891[class309.field3825++] = new class340((byte) 1, arg1, arg2, arg4, arg0, arg5);
        }
        field3893++;
        if (arg3) {
            field3890 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static void method1797(int arg0) {
        field3888 = null;
        field3890 = null;
        field3891 = null;
        int var1 = 56 % ((-arg0 - 69) / 48);
        field3894 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)Lcu;")
    public static final class478 method1798(int arg0, boolean arg1) {
        field3889++;
        if (!arg1) {
            method1798(96, true);
        }
        if (arg0 == 0) {
            return new class208();
        } else if (arg0 == 1) {
            return new class181();
        } else if (arg0 == 2) {
            return new class378();
        } else if (arg0 == 3) {
            return new class66();
        } else if (arg0 == 4) {
            return new class206();
        } else if (arg0 == 5) {
            return new class384();
        } else if (arg0 == 6) {
            return new class311();
        } else if (arg0 == 7) {
            return new class505();
        } else if (arg0 == 8) {
            return new class279();
        } else if (arg0 == 9) {
            return new class229();
        } else if (arg0 == 10) {
            return new class100();
        } else if (arg0 == 11) {
            return new class647();
        } else if (arg0 == 12) {
            return new class300();
        } else if (arg0 == 13) {
            return new class157();
        } else if (arg0 == 14) {
            return new class443();
        } else if (arg0 == 15) {
            return new class150();
        } else if (arg0 == 16) {
            return new class304();
        } else if (arg0 == 17) {
            return new class475();
        } else if (arg0 == 18) {
            return new class496();
        } else if (arg0 == 19) {
            return new class316();
        } else if (arg0 == 20) {
            return new class368();
        } else if (arg0 == 21) {
            return new class671();
        } else if (arg0 == 22) {
            return new class663();
        } else if (arg0 == 23) {
            return new class211();
        } else if (arg0 == 24) {
            return new class303();
        } else if (arg0 == 25) {
            return new class471();
        } else if (arg0 == 26) {
            return new class148();
        } else if (arg0 == 27) {
            return new class573();
        } else if (arg0 == 28) {
            return new class530();
        } else if (arg0 == 29) {
            return new class549();
        } else if (arg0 == 30) {
            return new class46();
        } else if (arg0 == 31) {
            return new class175();
        } else if (arg0 == 32) {
            return new class189();
        } else if (arg0 == 33) {
            return new class171();
        } else if (arg0 == 34) {
            return new class36();
        } else if (arg0 == 35) {
            return new class162();
        } else if (arg0 == 36) {
            return new class512();
        } else if (arg0 == 37) {
            return new class4();
        } else if (arg0 == 38) {
            return new class154();
        } else if (arg0 == 39) {
            return new class23();
        } else {
            return null;
        }
    }
}
