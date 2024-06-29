import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class302 {

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "Z")
    public static volatile boolean field4778 = true;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "[I")
    public static int[] field4781 = new int[32];

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "Lwd;")
    public static class148 field4783;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "[Z")
    public static boolean[] field4780;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2027(boolean arg0) {
        if (arg0) {
            method2028((byte) -36, 101, 121, -36, -14);
        }
        field4783 = null;
        field4780 = null;
        field4781 = null;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(BIIII)V", line = 16)
    public static final void method2028(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class99.field1378 = arg1;
        class406.field6033 = arg4;
        class396.field5925 = arg2;
        field4779++;
        class185.field3005 = arg3;
        if (arg0 != 33) {
            field4783 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 31)
    public static final void method2029(int arg0, String arg1, int arg2) {
        if (arg2 == 10026) {
            field4776++;
            class211 var3 = class281.method1921(3, arg0, (byte) -97);
            var3.method1490((byte) 117);
            var3.field3374 = arg1;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)Lis;", line = 49)
    public static final class290 method2030(int arg0, int arg1) {
        field4775++;
        class290 var2 = (class290) class362.field5525.method331((byte) 69, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class134.field2109.method2771(33, arg0, 3);
        class290 var4 = new class290();
        if (arg1 != 25355) {
            field4781 = null;
        }
        if (var3 != null) {
            var4.method1951(arg0, new class186(var3), (byte) 120);
        }
        class362.field5525.method341(114, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIIIIII)V", line = 78)
    public static final void method2031(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 != -17017) {
            return;
        }
        if (arg5 == arg7 && arg1 == arg4 && arg6 == arg9 && arg0 == arg3) {
            class105.method795(2239, arg8, arg6, arg3, arg5, arg1);
        } else {
            int var10 = arg5;
            int var11 = arg1;
            int var12 = arg5 * 3;
            int var13 = arg1 * 3;
            int var14 = arg7 * 3;
            int var15 = arg4 * 3;
            int var16 = arg9 * 3;
            int var17 = arg0 * 3;
            int var18 = var14 + arg6 - var16 - arg5;
            int var19 = var15 + arg3 - var17 - arg1;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
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
                int var33 = arg5 + (var29 + var31 + var27 >> 12);
                int var34 = (var30 + var32 + var28 >> 12) + arg1;
                class105.method795(2239, arg8, var33, var34, var10, var11);
                var11 = var34;
                var10 = var33;
            }
        }
        field4782++;
    }
}
