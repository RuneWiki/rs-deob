import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class334 {

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Z")
    public static boolean field5297 = false;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field5295 = 0;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "[I")
    public static int[] field5302 = new int[2500];

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Lgb;")
    public static class187 field5296;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Z")
    public static boolean field5300;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 7)
    public static void method2309(int arg0) {
        field5302 = null;
        if (arg0 == 0) {
            field5296 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLcg;Lcg;Z)V", line = 18)
    public static final void method2310(byte arg0, class49 arg1, class49 arg2, boolean arg3) {
        field5298++;
        class34.field492 = arg1;
        if (arg0 != 48) {
            field5297 = true;
        }
        class324.field5153 = arg3;
        class39.field588 = arg2;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Lql;", line = 35)
    public static final class20 method2311(int arg0) {
        field5294++;
        if (arg0 != 3963) {
            method2309(-101);
        }
        class84.field1350 = 0;
        return class191.method1448(true);
    }
}
