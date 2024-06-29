import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class397 extends class507 {

    @OriginalMember(owner = "client!pu", name = "y", descriptor = "Llk;")
    public class417 field5790;

    @OriginalMember(owner = "client!pu", name = "w", descriptor = "I")
    public static int field5788 = 10;

    @OriginalMember(owner = "client!pu", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field5787 = new String[100];

    @OriginalMember(owner = "client!pu", name = "x", descriptor = "[S")
    public static short[] field5789 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!pu", name = "u", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!pu", name = "z", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "(I)V", line = 10)
    public static void method2450(int arg0) {
        if (arg0 != 100) {
            method2453(111);
        }
        field5787 = null;
        field5789 = null;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIII)V", line = 22)
    public static final void method2451(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class386.field5620 = arg4;
        class169.field2184 = arg3;
        class91.field1086 = arg0;
        if (arg2 != 0) {
            field5788 = 27;
        }
        class307.field4111 = arg1;
        field5786++;
    }

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "(I)V", line = 36)
    public static final void method2452(int arg0) {
        field5791++;
        int var1 = class319.field4256.method1736(class20.field183, -94);
        if (arg0 == var1) {
            class33.field339 = null;
            class394.method2372(0, 19351);
        } else if (var1 == 1) {
            class257.method1588((byte) 0, 4);
            class394.method2372(512, 19351);
            if (class252.field3358 != null) {
                class534.method3167(-60);
            }
        } else {
            class257.method1588((byte) (class431.field6268 - 4 & 0xFF), 4);
            class394.method2372(2, 19351);
        }
        class340.field4507 = class210.field2808;
    }

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "(I)V", line = 68)
    public static final void method2453(int arg0) {
        int var1 = 74 / ((-arg0 - 65) / 60);
        class220.field2973.method3045(48);
        field5785++;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Llk;)V", line = 85)
    public class397(class417 arg0) {
        this.field5790 = arg0;
    }
}
