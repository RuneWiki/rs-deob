import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class78 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lok;")
    public static class146 field1246 = class235.method1724(-12908, "jaune:");

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lok;")
    public static class146 field1247 = class235.method1724(-12908, ":");

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Lok;")
    public static class146 field1252 = class235.method1724(-12908, "welle:");

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lok;")
    public static class146 field1254 = class235.method1724(-12908, "Polices charg-Bes");

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lwi;")
    public static class256 field1248;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIIIII)V", line = 4)
    public static final void method561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1251++;
        if (arg1 == arg3 && arg2 == arg6 && arg5 == arg7 && arg8 == arg9) {
            class295.method2102(arg7, arg4, arg1, arg6, -95, arg9);
        } else {
            int var10 = arg1;
            int var11 = arg1 * 3;
            int var12 = arg6;
            int var13 = arg6 * 3;
            int var14 = arg3 * 3;
            int var15 = arg2 * 3;
            int var16 = arg5 * 3;
            int var17 = arg8 * 3;
            int var18 = arg7 + var14 - var16 - arg1;
            int var19 = arg9 + var15 - arg6 - var17;
            int var20 = var11 + var16 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var15 - var13;
            int var23 = var14 - var11;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var20 * var25;
                int var28 = var18 * var26;
                int var29 = var23 * var24;
                int var30 = var22 * var24;
                int var31 = var19 * var26;
                int var32 = var21 * var25;
                int var33 = arg1 + (var27 + var28 + var29 >> 12);
                int var34 = (var31 + var32 + var30 >> 12) + arg6;
                class295.method2102(var33, arg4, var10, var12, 62, var34);
                var10 = var33;
                var12 = var34;
            }
        }
        if (arg0 != 3) {
            method564(-31);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)Lk;", line = 83)
    public static final class228 method562(byte arg0) {
        field1250++;
        class267.field4600 = 0;
        if (arg0 >= -69) {
            method563((byte) -96);
        }
        return class92.method632((byte) 100);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)V", line = 109)
    public static void method563(byte arg0) {
        if (arg0 != -6) {
            method561(13, 8, 39, 33, 101, -44, -29, -119, -73, 52);
        }
        field1254 = null;
        field1248 = null;
        field1246 = null;
        field1252 = null;
        field1247 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 128)
    public static final void method564(int arg0) {
        field1253++;
        if (~class264.field4515 == arg0) {
            class264.field4515 = 6;
        }
    }
}
