import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class435 {

    @OriginalMember(owner = "client!a", name = "m", descriptor = "Lcu;")
    public static class145 field5969 = new class145(16, 8);

    @OriginalMember(owner = "client!a", name = "u", descriptor = "[I")
    public static int[] field5977 = new int[1];

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    public static int field5980 = -1;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "Lcu;")
    public static class145 field5976 = new class145(52, 6);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public int field5957;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public int field5958;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public int field5959;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public int field5960;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public int field5961;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public int field5962;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public int field5963;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public int field5965;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public int field5966;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public int field5967;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public int field5968;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public int field5970;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public int field5972;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public int field5974;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public int field5975;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "I")
    public int field5978;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "I")
    public int field5979;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public int field5981;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "Lpc;")
    public static class473 field5973;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIBIIIIII)V")
    public static final void method2505(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != -95) {
            return;
        }
        field5971++;
        if (arg5 < 128 || arg0 < 128 || (class12.field251 * 128 - 256) < arg5 || arg0 > (class289.field3782 - 2) * 128) {
            class80.field1181[0] = class80.field1181[1] = -1;
            return;
        }
        int var10 = class210.method1330(arg4, (byte) -79, arg5, arg0) - arg2;
        class130.field1895.method970(arg6, 0, 0);
        class370.field4984.method603(class130.field1895);
        class370.field4984.method526(arg5, var10, arg0, class80.field1181);
        class130.field1895.method970(-arg6, 0, 0);
        class370.field4984.method603(class130.field1895);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method2506(int arg0) {
        field5969 = null;
        if (arg0 == 8) {
            field5973 = null;
            field5977 = null;
            field5976 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lpc;Z)V")
    public static final void method2507(class473 arg0, boolean arg1) {
        class511.field7311 = 0;
        if (!arg1) {
            field5977 = null;
        }
        field5964++;
        class183.field2609 = 0;
        class264.field3485 = new class305();
        class242.field3236 = new class398[1024];
        class215.method1350((byte) 75, arg0);
        class23.method208(arg0, 0);
    }
}
