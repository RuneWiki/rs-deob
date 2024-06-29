import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class443 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "Lhp;")
    public static class346 field6038;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2639(int arg0, int arg1, byte arg2) {
        if (arg2 >= -118) {
            return true;
        } else {
            field6037++;
            return class537.method3221(arg1, (byte) -65, arg0) & class559.method3305(2048, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static void method2640(byte arg0) {
        field6038 = null;
        if (arg0 != -123) {
            field6038 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLso;)Lvha;")
    public static final class713 method2641(byte arg0, class494 arg1) {
        if (arg0 <= 59) {
            return null;
        } else {
            field6039++;
            int var2 = arg1.method2998(true);
            return new class713(var2);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V")
    public static final void method2642(int arg0, int arg1) {
        field6041++;
        if (class730.field10114 == null || class730.field10114.length < arg0) {
            class730.field10114 = new int[arg0];
        }
        if (arg1 != 9216) {
            field6038 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lad;I)I")
    public static final int method2643(class446 arg0, int arg1) {
        int var2 = 118 / ((arg1 - 67) / 36);
        field6040++;
        if (class269.field3905 == arg0) {
            return 9216;
        } else if (class335.field4713 == arg0) {
            return 34065;
        } else if (class268.field3896 == arg0) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
