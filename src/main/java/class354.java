import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class354 {

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field5650 = -1;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "[S")
    public static short[] field5654 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "F")
    public static float field5652 = 0.0F;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Lek;")
    public static class206 field5655;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 12)
    public static void method2516(byte arg0) {
        if (arg0 != -125) {
            field5654 = (short[]) null;
        }
        field5654 = null;
        field5655 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(JIII)Z", line = 40)
    public static final boolean method2517(long arg0, int arg1, int arg2, int arg3) {
        field5653++;
        int var5 = ((int) arg0 & 0x7D9FF) >> 14;
        if (arg2 != -17391) {
            return true;
        }
        int var6 = (int) arg0 >> 20 & 0x3;
        int var7 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class238 var8 = class1.method7(var7, 25);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field3890;
                var9 = var8.field3935;
            } else {
                var9 = var8.field3890;
                var10 = var8.field3935;
            }
            int var11 = var8.field3916;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class166.method1186(var10, arg3, true, 0, 0, var9, class96.field1750.field170[0], class96.field1750.field139[0], 13949, arg1, var11);
        } else {
            class166.method1186(0, arg3, true, var5 + 1, var6, 0, class96.field1750.field170[0], class96.field1750.field139[0], 13949, arg1, 0);
        }
        return true;
    }
}
