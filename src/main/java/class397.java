import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class397 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[S")
    public static short[] field5278 = new short[256];

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lam;")
    public static class591 field5279;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V", line = 3)
    public static void method2278(int arg0) {
        field5279 = null;
        field5278 = null;
        if (arg0 != 0) {
            method2279(-37, 5);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V", line = 19)
    public static final void method2279(int arg0, int arg1) {
        field5282++;
        if (class269.method1639(arg0, arg1 ^ arg1)) {
            class128.method984(-1, arg1 ^ 0x4151, class601.field7977[arg0]);
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V", line = 42)
    public static final void method2280(int arg0) {
        field5280++;
        if (arg0 >= -79) {
            method2279(-59, -60);
        }
        class47[] var1 = class521.field6965;
        synchronized (class521.field6965) {
            for (int var2 = 0; var2 < class521.field6965.length; var2++) {
                class521.field6965[var2] = new class47();
                class16.field240[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 65)
    public static final void method2281(byte arg0) {
        if (arg0 < 86) {
            method2281((byte) 36);
        }
        class199.field2892 = class193.field2823.field6833 + class193.field2823.field6828 + 2;
        class287.field4063 = new String[500];
        field5281++;
        class271.field3781 = class665.field9437.field6833 + class665.field9437.field6828 + 2;
        for (int var1 = 0; var1 < class287.field4063.length; var1++) {
            class287.field4063[var1] = "";
        }
    }

    @OriginalMember(owner = "client!q", name = "pa", descriptor = "(IIIIII)V")
    public abstract void method557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "la", descriptor = "(Lq;)V")
    public abstract void method560(class397 arg0);

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "()V")
    public abstract void method580();

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lq;")
    public abstract class397 method587();

    @OriginalMember(owner = "client!q", name = "S", descriptor = "(I)V")
    public abstract void method555(int arg0);

    @OriginalMember(owner = "client!q", name = "R", descriptor = "(III[I)V")
    public abstract void method565(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "G", descriptor = "(III)V")
    public abstract void method571(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "P", descriptor = "(I)V")
    public abstract void method570(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public abstract void method579(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(I)V")
    public abstract void method586(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public abstract void method572(int arg0);

    @OriginalMember(owner = "client!q", name = "ra", descriptor = "(I)V")
    public abstract void method573(int arg0);

    @OriginalMember(owner = "client!q", name = "O", descriptor = "([I)V")
    public abstract void method569(int[] arg0);

    @OriginalMember(owner = "client!q", name = "GA", descriptor = "(III)V")
    public abstract void method576(int arg0, int arg1, int arg2);
}
