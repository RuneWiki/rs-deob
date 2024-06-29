import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class97 {

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "Lpn;")
    public static class49 field1520 = new class49(73, -1);

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "Z")
    public static boolean field1523 = false;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
    public static void method809(int arg0) {
        if (arg0 != 0) {
            field1520 = null;
        }
        field1520 = null;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "([[BLks;I)V")
    public static final void method810(byte[][] arg0, class23 arg1, int arg2) {
        if (arg2 != -14617) {
            return;
        }
        field1521++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg1.field3545; var4++) {
            class425.method2644(27576);
            for (int var5 = 0; var5 < (class338.field5076 >> 3); var5++) {
                for (int var6 = 0; var6 < (class250.field4077 >> 3); var6++) {
                    int var7 = class349.field5201[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3CEC951) >> 24;
                        if (!arg1.field3522 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = (var7 & 0x3FFE) >> 3;
                            int var12 = (var10 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class277.field4348.length; var13++) {
                                if (class277.field4348[var13] == var12 && arg0[var13] != null) {
                                    class194 var14 = new class194(arg0[var13]);
                                    arg1.method1600(var11, var8, 14729, var6 * 8, var5 * 8, class463.field6857, var14, var10, var9, var4);
                                    arg1.method149(var5 * 8, var8, var3[0] == -1 ? var3 : null, var9, var10, class376.field5542, var6 * 8, (byte) -123, var4, var11, var14);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class114.field1751 = class335.field5044.method1976(class436.field6496, var3[3], var3[1], (byte) -111, var3[2], var3[0]);
            class319.field4842 = var3[4];
        }
    }
}
