import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class385 {

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field5643 = 0;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Leda;")
    public static class116 field5640 = new class116(82, -1);

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "[I")
    public static int[] field5644 = new int[14];

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BZ)V")
    public static final void method2353(byte arg0, boolean arg1) {
        if (arg1 && class161.field2607 != null) {
            class683.field9716 = class161.field2607.field5109;
        } else {
            class683.field9716 = -1;
        }
        field5639++;
        class541.field7950 = null;
        class161.field2607 = null;
        class521.field7684 = null;
        class238.field3515 = 0;
        class161.method1225();
        class161.field2621.method3896(3);
        class666.field9367 = null;
        class695.field9870 = null;
        class121.field1980 = null;
        class520.field7676 = null;
        if (arg0 <= 104) {
            return;
        }
        class371.field5147 = -1;
        class34.field480 = -1;
        class423.field6039 = null;
        class222.field3324 = null;
        class161.field2612 = null;
        class565.field8274 = null;
        class334.field4667 = null;
        class127.field2084 = null;
        if (class161.field2609 != null) {
            class161.field2609.method2844((byte) -10);
            class161.field2609.method2840((byte) 93, 64, 128);
        }
        if (class161.field2604 != null) {
            class161.field2604.method1496(64, (byte) 0, 64);
        }
        if (class161.field2603 != null) {
            class161.field2603.method2830(109, 64);
        }
        class56.field781.method3297(64, 17);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBILhw;)V")
    public static final void method2354(int arg0, byte arg1, int arg2, class270 arg3) {
        if (arg1 != -14) {
            field5644 = null;
        }
        field5641++;
        int[] var4 = new int[4];
        class553.method3238(var4, 0, var4.length, arg2);
        class428.method2515(arg3, arg0, 3752, var4);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lek;I)Lfga;")
    public static final class340 method2355(class465 arg0, int arg1) {
        field5642++;
        class567 var2 = class105.method883(1, arg0);
        if (arg1 == 4792) {
            int var3 = arg0.method2691((byte) -67);
            int var4 = arg0.method2691((byte) -67);
            int var5 = arg0.method2755((byte) -116);
            return new class340(var2.field8302, var2.field8299, var2.field8301, var2.field8295, var2.field8300, var2.field8291, var2.field8293, var2.field8294, var2.field8297, var3, var4, var5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static void method2356(int arg0) {
        if (arg0 == 64) {
            field5640 = null;
            field5644 = null;
        }
    }
}
