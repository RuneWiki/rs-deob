import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class228 {

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "[Lrs;")
    public static class597[] field3265 = new class597[14];

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "[[I")
    public static int[][] field3266 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "[S")
    public static short[] field3264 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "Ldg;")
    public static class377 field3272 = new class377();

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "S")
    public static short field3273 = 32767;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "Lpj;")
    public static class132 field3270;

    @OriginalMember(owner = "client!sr", name = "toString", descriptor = "()Ljava/lang/String;", line = 9)
    public final String toString() {
        field3268++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)Z", line = 18)
    public final boolean method1454(int arg0) {
        field3271++;
        if (arg0 != 1433259682) {
            method1457(4, 111, (byte) -43, 39);
        }
        return class390.field5465 == this | class243.field3465 == this;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIII)V", line = 40)
    public static final void method1455(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3267++;
        for (int var5 = 0; var5 < class150.field2245; var5++) {
            Rectangle var6 = class121.field1678[var5];
            if (var6.x + var6.width > arg2 && var6.x < (arg1 + arg2) && arg0 < var6.y + var6.height && var6.y < (arg0 + arg4)) {
                class183.field2696[var5] = true;
            }
        }
        if (arg3 != -28440) {
            method1457(13, -16, (byte) 87, 95);
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V", line = 64)
    public static void method1456(int arg0) {
        field3272 = null;
        if (arg0 == 6) {
            field3270 = null;
            field3266 = null;
            field3265 = null;
            field3264 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIBI)I", line = 80)
    public static final int method1457(int arg0, int arg1, byte arg2, int arg3) {
        field3269++;
        int var4 = -85 % ((-arg2 - 8) / 54);
        if (arg1 > 243) {
            arg0 >>= 0x4;
        } else if (arg1 > 217) {
            arg0 >>= 0x3;
        } else if (arg1 > 192) {
            arg0 >>= 0x2;
        } else if (arg1 > 179) {
            arg0 >>= 0x1;
        }
        return (arg1 >> 1) + ((arg3 & 0xFF) >> 2 << 10) + (arg0 >> 5 << 7);
    }
}
