import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class299 extends class432 {

    @OriginalMember(owner = "client!st", name = "z", descriptor = "I")
    private int field4122;

    @OriginalMember(owner = "client!st", name = "u", descriptor = "I")
    private int field4117;

    @OriginalMember(owner = "client!st", name = "m", descriptor = "I")
    private int field4109;

    @OriginalMember(owner = "client!st", name = "q", descriptor = "I")
    private int field4113;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "I")
    public static int field4106 = -1;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "Ltm;")
    public static class112 field4108 = new class112("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!st", name = "r", descriptor = "I")
    public static int field4114 = 0;

    @OriginalMember(owner = "client!st", name = "s", descriptor = "[I")
    public static int[] field4115 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!st", name = "x", descriptor = "I")
    public static int field4120 = 0;

    @OriginalMember(owner = "client!st", name = "t", descriptor = "I")
    public static int field4116 = 0;

    @OriginalMember(owner = "client!st", name = "y", descriptor = "I")
    public static int field4121 = 0;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!st", name = "o", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!st", name = "p", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!st", name = "v", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!st", name = "w", descriptor = "Ldq;")
    public static class14 field4119;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(B)V", line = 3)
    public static final void method1832(byte arg0) {
        ++field4112;
        class77.field1168 = null;
        class123.field1705 = false;
        class268.field3721 = null;
        class442.field6101 = null;
        class456.field6318 = null;
        if (arg0 <= -116) {
            class347.field4754 = null;
            class480.method2825(9742);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(BII)V", line = 20)
    public final void method1601(byte arg0, int arg1, int arg2) {
        if (arg0 > -60) {
            method1834((byte) 61);
        }
        ++field4107;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZII)V", line = 31)
    public final void method1598(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method1832((byte) 46);
        }
        ++field4118;
        int var4 = this.field4122 * arg1 >> 12;
        int var5 = this.field4109 * arg1 >> 12;
        int var6 = this.field4113 * arg2 >> 12;
        int var7 = this.field4117 * arg2 >> 12;
        class196.method1245(super.field5951, var5, var4, -125, var6, var7);
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(IIIIIII)V", line = 55)
    public class299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4122 = arg0;
        this.field4117 = arg3;
        this.field4109 = arg2;
        this.field4113 = arg1;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILes;)V", line = 66)
    public static final void method1833(int arg0, class75 arg1) {
        if (arg0 != -7406) {
            method1832((byte) -34);
        }
        if (!(arg1 instanceof class196)) {
            if (arg1 instanceof class23) {
                class23 var2 = (class23) arg1;
                class80.method552(class2.field21.field6766 != var2.field6766, (byte) 106, var2);
            }
        } else {
            class196 var3 = (class196) arg1;
            if (var3.field2789 != null) {
                class409.method2395(var3, (byte) 89, ~class2.field21.field6766 != ~var3.field6766);
            }
        }
        ++field4110;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(III)V", line = 104)
    public final void method1597(int arg0, int arg1, int arg2) {
        ++field4111;
        int var4 = this.field4122 * arg1 >> 12;
        int var5 = this.field4109 * arg1 >> 12;
        if (arg2 != -20714) {
            field4108 = null;
        }
        int var6 = this.field4113 * arg0 >> 12;
        int var7 = this.field4117 * arg0 >> 12;
        class350.method2095(super.field5951, super.field5949, var4, var5, arg2 ^ -20669, var7, var6, super.field5950);
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(B)V", line = 125)
    public static void method1834(byte arg0) {
        field4119 = null;
        if (arg0 >= -119) {
            method1832((byte) -85);
        }
        field4108 = null;
        field4115 = null;
    }
}
