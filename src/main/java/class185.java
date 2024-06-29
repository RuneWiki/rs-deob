import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class185 {

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Z")
    public static boolean field2661 = true;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "B")
    public byte field2654;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "B")
    public byte field2657;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "B")
    public byte field2662;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "B")
    public byte field2665;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "S")
    public short field2659;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Z")
    public boolean field2653;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Z")
    public boolean field2655;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Z")
    public boolean field2663;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "Z")
    public boolean field2664;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "Z")
    public boolean field2667;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIBIIII)V", line = 7)
    public static final void method1285(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field2656++;
        if (arg2 > -122) {
            return;
        }
        if (class355.field5452 <= (arg0 - arg1) && class348.field5378 >= (arg0 + arg1) && class326.field4901 <= (arg3 - arg1) && class261.field3911 >= (arg3 + arg1)) {
            class152.method1099(arg6, arg1, arg4, -96, arg5, arg0, arg3);
        } else {
            class99.method783((byte) -105, arg0, arg4, arg1, arg3, arg5, arg6);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZI)Lfo;", line = 44)
    public static final class309 method1286(boolean arg0, int arg1) {
        class309 var2 = (class309) class326.field4898.method461((byte) 120, (long) arg1);
        field2666++;
        if (var2 != null) {
            return var2;
        }
        if (arg0) {
            method1285(-93, 20, (byte) 89, 111, -91, 28, 104);
        }
        byte[] var3 = class316.field4687.method2520(class326.method2254(64, arg1), class91.method718(-59, arg1), (byte) -25);
        class309 var4 = new class309();
        if (var3 != null) {
            var4.method2177(new class190(var3), (byte) 76);
        }
        class326.field4898.method460(var4, -26089, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIII)V", line = 67)
    public static final void method1287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2658++;
        int var8 = arg1;
        int var9 = 0;
        int var10 = arg7 - arg5;
        int var11 = 0;
        int var12 = arg1 - arg5;
        int var13 = arg7 * arg7;
        int var14 = var10 * var10;
        int var15 = var12 * var12;
        int var16 = var15 << 1;
        int var17 = var13 << 1;
        int var18 = var14 << 1;
        int var19 = arg1 << 1;
        int var20 = arg1 * arg1;
        int var21 = var20 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var19) * var13 + var21;
        int var24 = (1 - var22) * var14 + var16;
        int var25 = var20 - ((var19 - 1) * var17);
        int var26 = var15 - (var22 - 1) * var18;
        int var27 = var13 << 2;
        int var28 = var20 << 2;
        int var29 = var14 << 2;
        int var30 = var15 << 2;
        int var31 = var21 * 3;
        int var32 = (var19 - 3) * var17;
        int var33 = (var22 - 3) * var18;
        int var34 = var16 * 3;
        int var35 = var28;
        int var36 = (arg1 - 1) * var27;
        int var37 = var30;
        int var38 = (arg2 + var12) * var29;
        int[] var39 = class274.field4158[arg4];
        class329.method2285(arg6 - arg7, var39, (byte) 117, arg6 - var10, arg3);
        class329.method2285(arg6 - var10, var39, (byte) 74, arg6 + var10, arg0);
        class329.method2285(arg6 + var10, var39, (byte) 72, arg6 + arg7, arg3);
        while (var8 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var11++;
                    var23 += var31;
                    var31 += var28;
                    var25 += var35;
                    var35 += var28;
                }
            }
            if (var25 < 0) {
                var25 += var35;
                var35 += var28;
                var11++;
                var23 += var31;
                var31 += var28;
            }
            var23 += -var36;
            var25 += -var32;
            var32 -= var27;
            boolean var40 = var8 <= var12;
            var8--;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var24 += var34;
                        var26 += var37;
                        var34 += var30;
                        var9++;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var9++;
                    var24 += var34;
                    var26 += var37;
                    var37 += var30;
                    var34 += var30;
                }
                var24 += -var38;
                var26 += -var33;
                var38 -= var29;
                var33 -= var29;
            }
            var36 -= var27;
            int var41 = arg4 - var8;
            int var42 = arg4 + var8;
            int var43 = arg6 + var11;
            int var44 = arg6 - var11;
            if (var40) {
                int var45 = arg6 + var9;
                int var46 = arg6 - var9;
                class329.method2285(var44, class274.field4158[var41], (byte) -84, var46, arg3);
                class329.method2285(var46, class274.field4158[var41], (byte) 97, var45, arg0);
                class329.method2285(var45, class274.field4158[var41], (byte) 70, var43, arg3);
                class329.method2285(var44, class274.field4158[var42], (byte) 77, var46, arg3);
                class329.method2285(var46, class274.field4158[var42], (byte) -76, var45, arg0);
                class329.method2285(var45, class274.field4158[var42], (byte) 102, var43, arg3);
            } else {
                class329.method2285(var44, class274.field4158[var41], (byte) 77, var43, arg3);
                class329.method2285(var44, class274.field4158[var42], (byte) -74, var43, arg3);
            }
        }
    }
}
