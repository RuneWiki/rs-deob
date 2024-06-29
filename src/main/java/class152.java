import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class152 {

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field2192 = 0;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "Z")
    public static boolean field2194 = false;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)Ldi;", line = 22)
    public static final class227 method1095(int arg0, int arg1) {
        field2193++;
        class227 var2 = (class227) class356.field5456.method461((byte) 120, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class174.field2512.method2520(33, arg1, (byte) -25);
        if (arg0 != 25941) {
            method1096(-51, -71, -39, 25, 103, 54);
        }
        class227 var4 = new class227();
        if (var3 != null) {
            var4.method1693((byte) -1, arg1, new class190(var3));
        }
        class356.field5456.method460(var4, -26089, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIII)Z", line = 45)
    public static final boolean method1096(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class272.field4125[arg0][var8][var9] == -class252.field3742) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class132.field1930[arg0][arg1][arg3] + arg5;
            if (!class175.method1224(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class175.method1224(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class175.method1224(var10, var12, var14)) {
                return false;
            } else if (class175.method1224(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class362.method2547(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class175.method1224(var6 + 1, class132.field1930[arg0][arg1][arg3] + arg5, var7 + 1) && class175.method1224(var6 + 128 - 1, class132.field1930[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class175.method1224(var6 + 128 - 1, class132.field1930[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class175.method1224(var6 + 1, class132.field1930[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V", line = 105)
    public static final void method1097(byte arg0) {
        field2191++;
        if (arg0 > 54) {
            class117.field1661.method458((byte) -73);
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)V", line = 116)
    public static final void method1098(byte arg0) {
        field2195++;
        class263.field4030.method458((byte) 91);
        class357.field5473.method458((byte) -100);
        int var1 = 60 % ((arg0 + 74) / 44);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIII)V", line = 130)
    public static final void method1099(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2190++;
        class30.method211(arg1, (byte) 111);
        int var7 = 0;
        int var8 = arg1;
        int var9 = -arg1;
        int var10 = arg1 - arg2;
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = 80 % ((-arg3 - 50) / 34);
        int var12 = -1;
        int var13 = arg5 - var10;
        int var14 = var10;
        int[] var15 = class274.field4158[arg6];
        int var16 = arg5 + var10;
        int var17 = -var10;
        int var18 = -1;
        class329.method2285(arg5 - arg1, var15, (byte) -67, var13, arg0);
        class329.method2285(var13, var15, (byte) 96, var16, arg4);
        class329.method2285(var16, var15, (byte) -112, arg1 + arg5, arg0);
        while (var8 > var7) {
            var12 += 2;
            var18 += 2;
            var9 += var12;
            var17 += var18;
            if (var17 >= 0 && var14 >= 1) {
                class347.field5364[var14] = var7;
                var14--;
                var17 -= var14 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var8--;
                var9 -= var8 << 1;
                if (var8 >= var10) {
                    int[] var19 = class274.field4158[arg6 + var8];
                    int[] var20 = class274.field4158[arg6 - var8];
                    int var21 = arg5 - var7;
                    int var22 = arg5 + var7;
                    class329.method2285(var21, var19, (byte) 73, var22, arg0);
                    class329.method2285(var21, var20, (byte) -50, var22, arg0);
                } else {
                    int[] var23 = class274.field4158[arg6 - var8];
                    int var24 = class347.field5364[var8];
                    int[] var25 = class274.field4158[arg6 + var8];
                    int var26 = arg5 - var7;
                    int var27 = arg5 + var7;
                    int var28 = arg5 + var24;
                    int var29 = arg5 - var24;
                    class329.method2285(var26, var25, (byte) 116, var29, arg0);
                    class329.method2285(var29, var25, (byte) 104, var28, arg4);
                    class329.method2285(var28, var25, (byte) 72, var27, arg0);
                    class329.method2285(var26, var23, (byte) -78, var29, arg0);
                    class329.method2285(var29, var23, (byte) -51, var28, arg4);
                    class329.method2285(var28, var23, (byte) 102, var27, arg0);
                }
            }
            int[] var30 = class274.field4158[arg6 + var7];
            int[] var31 = class274.field4158[arg6 - var7];
            int var32 = arg5 + var8;
            int var33 = arg5 - var8;
            if (var10 <= var7) {
                class329.method2285(var33, var30, (byte) -127, var32, arg0);
                class329.method2285(var33, var31, (byte) 91, var32, arg0);
            } else {
                int var34 = var7 > var14 ? class347.field5364[var7] : var14;
                int var35 = arg5 + var34;
                int var36 = arg5 - var34;
                class329.method2285(var33, var30, (byte) -103, var36, arg0);
                class329.method2285(var36, var30, (byte) -71, var35, arg4);
                class329.method2285(var35, var30, (byte) 80, var32, arg0);
                class329.method2285(var33, var31, (byte) 81, var36, arg0);
                class329.method2285(var36, var31, (byte) -90, var35, arg4);
                class329.method2285(var35, var31, (byte) -101, var32, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BZIZI)V", line = 264)
    public static final void method1100(byte arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        if (arg0 < -21) {
            field2189++;
            class78.method635(class270.field4099.length - 1, 4, arg1, arg2, 0, arg4, arg3);
        }
    }
}
