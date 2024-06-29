import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class359 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "S")
    public static short field5089 = 32767;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "Lig;")
    public static class206 field5093 = new class206(0, 8);

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "Lkea;")
    public static class203 field5094;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method2244(int arg0, byte[] arg1) {
        field5091++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class210.method1330(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
    public static void method2245(int arg0) {
        field5094 = null;
        int var1 = 99 / ((-arg0 - 23) / 48);
        field5093 = null;
    }
}
