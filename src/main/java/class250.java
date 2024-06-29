import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class250 {

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "Ljo;")
    public static class351 field3542 = new class351(38, 7);

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
    public static int field3545 = 0;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "[[Z")
    public static boolean[][] field3544;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILsga;Lsga;)V", line = 11)
    public static final void method1668(int arg0, class76 arg1, class76 arg2) {
        field3543++;
        if (arg2.field1023 != null) {
            arg2.method592(2);
        }
        arg2.field1019 = arg1;
        int var3 = -104 % ((-arg0 - 30) / 42);
        arg2.field1023 = arg1.field1023;
        arg2.field1023.field1019 = arg2;
        arg2.field1019.field1023 = arg2;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 29)
    public static final boolean method1669(byte arg0, String arg1) {
        field3539++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 <= 41) {
            field3542 = null;
        }
        for (int var2 = 0; var2 < class155.field2304; var2++) {
            if (arg1.equalsIgnoreCase(class745.field10367[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class182.field2760[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)Z", line = 61)
    public static final boolean method1670(int arg0, int arg1) {
        field3541++;
        if (arg0 != -11052) {
            field3542 = null;
        }
        return arg1 == 3 || arg1 == 7 || arg1 == 10;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V", line = 72)
    public static void method1671(int arg0) {
        if (arg0 != 0) {
            field3545 = 55;
        }
        field3544 = null;
        field3542 = null;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIBIIII)Lag;", line = 87)
    public static final class710 method1672(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field3540++;
        long var7 = (long) arg1 * 32147369L ^ (long) arg4 * 986053L ^ (long) arg6 * 475427L ^ (long) arg5 * 67481L ^ (long) arg3 * 97549L ^ (long) arg0 * 76724863L;
        class710 var9 = (class710) class204.field2988.method2373(var7, 103);
        if (var9 != null) {
            return var9;
        }
        class710 var10 = class731.field10209.method399(arg5, arg3, arg6, arg4, arg1, arg0);
        class204.field2988.method2362(var10, 0, var7);
        if (arg2 < 116) {
            method1669((byte) 86, null);
        }
        return var10;
    }
}
