import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class291 {

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "I")
    public static int field3623 = 1401;

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "[Lf;")
    public static class536[] field3621;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V")
    public static void method1636(int arg0) {
        if (arg0 > -48) {
            method1637(75, 48, -92, 43, 101, (byte) 25, 92, 31, -78, -119);
        }
        field3621 = null;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method1637(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 >= -113) {
            return;
        }
        field3624++;
        if (arg4 == arg8 && arg0 == arg2 && arg6 == arg9 && arg3 == arg7) {
            class138.method790(arg7, arg9, arg0, false, arg1, arg4);
            return;
        }
        int var10 = arg4;
        int var11 = arg0;
        int var12 = arg4 * 3;
        int var13 = arg0 * 3;
        int var14 = arg8 * 3;
        int var15 = arg2 * 3;
        int var16 = arg6 * 3;
        int var17 = arg3 * 3;
        int var18 = arg9 + var14 - var16 - arg4;
        int var19 = var15 + arg7 - var17 - arg0;
        int var20 = var16 + var12 - var14 - var14;
        int var21 = var13 + var17 - var15 - var15;
        int var22 = var14 - var12;
        int var23 = var15 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var21 * var25;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = (var27 - (-var29 - var31) >> 12) + arg4;
            int var34 = arg0 + (var28 + var32 + var30 >> 12);
            class138.method790(var34, var33, var11, false, arg1, var10);
            var11 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3622++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(I)Z")
    public final boolean method1638(int arg0) {
        if (arg0 == 3) {
            field3625++;
            return class657.field9285 == this | class574.field7999 == this;
        } else {
            return false;
        }
    }
}
