import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class244 {

    @OriginalMember(owner = "client!es", name = "c", descriptor = "Leg;")
    public static class366 field3267 = new class366();

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public int field3265;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "I")
    public int field3270;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "I")
    public int field3271;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "Z")
    public boolean field3269;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1525(int arg0) {
        field3266++;
        class384.field4914 = null;
        class635.method3510(0, class196.field2562, arg0, -1, class519.field6796, class461.field6047, 0, (byte) 126, 0);
        if (class384.field4914 != null) {
            class95.method725(class337.field4363, -1412584499, 0, class384.field4914, class461.field6047, 0, class250.field3402, class519.field6796, (byte) -119, class323.field4197.field6351);
            class384.field4914 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V", line = 24)
    public static void method1526(int arg0) {
        field3267 = null;
        if (arg0 != -5883) {
            method1525(-126);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "([BIIIIIII[B)V", line = 37)
    public static final void method1527(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        field3268++;
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        for (int var11 = -arg1; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg0[var10001] = (byte) (arg0[var10001] - arg8[arg7++]);
                int var14 = arg6++;
                arg0[var14] = (byte) (arg0[var14] - arg8[arg7++]);
                int var15 = arg6++;
                arg0[var15] = (byte) (arg0[var15] - arg8[arg7++]);
                int var16 = arg6++;
                arg0[var16] = (byte) (arg0[var16] - arg8[arg7++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg0[var10001] = (byte) (arg0[var10001] - arg8[arg7++]);
            }
            arg7 += arg2;
            arg6 += arg5;
        }
        if (arg4 != -1) {
            field3267 = null;
        }
    }
}
