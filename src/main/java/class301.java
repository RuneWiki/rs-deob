import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class301 extends class449 {

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "J")
    public long field4263;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "I")
    public static int field4264 = 0;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "F")
    public static float field4259 = 0.0F;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "[I")
    public static int[] field4262 = new int[3];

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    public static int field4256 = -1;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "[[S")
    public static short[][] field4258;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)V")
    public static void method1936(int arg0) {
        if (arg0 != 11) {
            field4258 = null;
        }
        field4262 = null;
        field4258 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILae;)V")
    public static final void method1937(int arg0, class172 arg1) {
        field4261++;
        if (arg0 > -10 || !class450.field6405) {
            return;
        }
        class204.field2996++;
        class336.method2111(class118.field1633, 95);
        class311.field4403.method1177(arg1.field2543, -122);
        class311.field4403.method1140(class128.field1750, 6293);
        class311.field4403.method1187(arg1.field2527, (byte) -18);
        class311.field4403.method1177(class124.field1679, -72);
        class311.field4403.method1173(arg1.field2483, (byte) 114);
        class311.field4403.method1187(class4.field29, (byte) -18);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V")
    public static final void method1938(int arg0, int arg1) {
        field4257++;
        class334 var2 = class352.method2172(arg1, arg0, arg0 + 16711924);
        var2.method2099(true);
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
    public class301() {
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(J)V")
    public class301(long arg0) {
        this.field4263 = arg0;
    }
}
