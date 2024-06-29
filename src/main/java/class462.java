import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public abstract class class462 {

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "[I")
    public static int[] field6765 = new int[99];

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "S")
    public static short field6767 = 256;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "[S")
    public static short[] field6766 = new short[256];

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
    public static int field6768 = 503;

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V")
    public static void method2768(byte arg0) {
        field6765 = null;
        field6766 = null;
        if (arg0 >= -94) {
            method2768((byte) 118);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(FFIIIFFII[FI)V")
    public abstract void method1209(float arg0, float arg1, int arg2, int arg3, int arg4, float arg5, float arg6, int arg7, int arg8, float[] arg9, int arg10);

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field6765[var1] = var0 / 4;
        }
    }
}
