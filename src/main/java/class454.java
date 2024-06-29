import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class454 {

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "[I")
    public static int[] field6156 = new int[99];

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "[Z")
    public static boolean[] field6157 = new boolean[200];

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Lcu;")
    public static class145 field6159;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "S")
    public static short field6160;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field6158;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field6156[var1] = var0 / 4;
        }
        field6159 = new class145(19, 8);
        field6160 = 320;
        field6161 = 0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([BIIIII)V", line = 13)
    public static final void method2586(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6155++;
        if (arg2 >= arg1) {
            return;
        }
        if (arg5 != -4907) {
            field6158 = 109;
        }
        int var6 = arg1 - arg2 >> 2;
        int var7 = arg2 + arg4;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg1 - arg2 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg0[var7++] = 1;
                }
            }
            arg0[var7++] = 1;
            arg0[var7++] = 1;
            arg0[var7++] = 1;
            arg0[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 66)
    public static void method2587(int arg0) {
        if (arg0 == -16129) {
            field6157 = null;
            field6156 = null;
            field6159 = null;
        }
    }
}
