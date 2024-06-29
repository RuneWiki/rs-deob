import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class347 {

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "Lmg;")
    public class495 field4410 = new class495();

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "[I")
    public static int[] field4407 = new int[14];

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I[S)[S")
    public static final short[] method1985(int arg0, short[] arg1) {
        field4409++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class34.method241(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z)V")
    public static void method1986(boolean arg0) {
        if (arg0) {
            field4407 = null;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(III)Z")
    public static final boolean method1987(int arg0, int arg1, int arg2) {
        field4408++;
        if (arg2 != 65536) {
            field4407 = null;
        }
        boolean var3 = (arg0 & 0x37) == 0 ? class620.method3631(arg0, 55, arg1) : class412.method2515(arg1, arg0, -111);
        return var3 | class440.method2633(arg1, (byte) -125, arg0) | (arg1 & 0x10000) != 0;
    }
}
