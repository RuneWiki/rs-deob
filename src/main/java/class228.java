import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class228 extends class192 {

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "Lpw;")
    public static class89 field3042 = new class89(1);

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "Lnj;")
    public static class415 field3045 = new class415(37, 7);

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "[I")
    public static int[] field3046;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(B)V")
    public static void method1436(byte arg0) {
        field3045 = null;
        field3046 = null;
        if (arg0 != -11) {
            field3045 = null;
        }
        field3042 = null;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
    public class228() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIB)I")
    public static final int method1437(int arg0, int arg1, int arg2, byte arg3) {
        field3044++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 4095 - arg2;
        } else {
            if (arg3 != -117) {
                method1436((byte) -4);
            }
            return 4095 - arg1;
        }
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "(B)Z")
    public static final boolean method1438(byte arg0) {
        if (arg0 >= -123) {
            method1436((byte) -73);
        }
        field3041++;
        return class183.field2350;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)[I")
    public final int[] method118(int arg0, byte arg1) {
        field3043++;
        if (arg1 > -123) {
            this.method118(-81, (byte) 15);
        }
        return class183.field2359;
    }
}
