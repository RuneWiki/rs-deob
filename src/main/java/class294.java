import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public abstract class class294 extends class447 {

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "[I")
    public static int[] field4063 = new int[5];

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "Ljava/lang/String;")
    public static String field4065 = " is already on your friend list.";

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "F")
    public static float field4062;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "[I")
    public static int[] field4059;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(B)V", line = 5)
    public static void method1882(byte arg0) {
        if (arg0 == -42) {
            field4059 = null;
            field4065 = null;
            field4063 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)V", line = 24)
    public static final void method1883(int arg0, byte arg1) {
        class164.field2325 = arg0;
        field4060++;
        class190 var2 = class260.field3555;
        synchronized (class260.field3555) {
            class260.field3555.method1249(1);
        }
        class190 var3 = class184.field2576;
        synchronized (class184.field2576) {
            class184.field2576.method1249(1);
        }
        class190 var4 = class326.field4447;
        synchronized (class326.field4447) {
            class326.field4447.method1249(1);
            if (arg1 != 37) {
                method1883(-51, (byte) 115);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lmo;Lmo;B)V", line = 45)
    public static final void method1884(class447 arg0, class447 arg1, byte arg2) {
        if (arg0.field6443 != null) {
            arg0.method2788((byte) -113);
        }
        field4064++;
        if (arg2 != 92) {
            field4063 = null;
        }
        arg0.field6442 = arg1.field6442;
        arg0.field6443 = arg1;
        arg0.field6443.field6442 = arg0;
        arg0.field6442.field6443 = arg0;
    }
}
