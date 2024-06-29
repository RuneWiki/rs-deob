import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class308 extends class174 {

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "Ljava/lang/Object;")
    private Object field4761;

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "I")
    public static int field4760 = -1;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "[I")
    public static int[] field4763 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "[J")
    public static long[] field4766 = new long[100];

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "I")
    public static int field4768 = 0;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 4)
    public class308(Object arg0) {
        this.field4761 = arg0;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIB)V", line = 28)
    public static final void method2199(int arg0, int arg1, byte arg2) {
        field4765++;
        class138 var3 = class149.method1242(arg1, 0, 5);
        var3.method1153((byte) 50);
        var3.field2282 = arg0;
        if (arg2 < 66) {
            field4760 = 112;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIII)V", line = 44)
    public static final void method2200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4764++;
        int var9 = arg5 + 1;
        class283.method2059(arg0, class133.field2235[arg5], (byte) 121, arg4, arg3);
        int var8 = arg2 - 1;
        class283.method2059(arg0, class133.field2235[arg2], (byte) 115, arg4, arg3);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class133.field2235[var6];
            var7[arg3] = var7[arg4] = arg0;
        }
        if (arg1 <= 6) {
            field4763 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "(I)Z", line = 67)
    public final boolean method463(int arg0) {
        if (arg0 == 1) {
            field4762++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 78)
    public final Object method464(byte arg0) {
        if (arg0 != -55) {
            field4768 = 60;
        }
        field4767++;
        return this.field4761;
    }

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "(I)V", line = 94)
    public static void method2201(int arg0) {
        field4766 = null;
        field4763 = null;
        if (arg0 < 51) {
            field4766 = (long[]) null;
        }
    }
}
