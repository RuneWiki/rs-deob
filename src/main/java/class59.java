import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class59 {

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field771 = -1;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Lqg;")
    public static class256 field775 = new class256();

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field782 = 0;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "Ljava/lang/String;")
    public static String field784 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public int field772;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public int field774;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public int field780;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public int field781;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "J")
    public long field777;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Lh;")
    public class232 field773;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Lh;")
    public class232 field778;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "Lh;")
    public class232 field779;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "Z")
    public static boolean field770;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "[Lug;")
    public static class321[] field783;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZIIIIII)V", line = 8)
    public static final void method412(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class66.method436(arg1, (byte) -104);
        int var7 = 0;
        int var8 = arg1 - arg3;
        field776++;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        int var12 = -1;
        int var13 = -var8;
        int var14 = -1;
        int[] var15 = class310.field4841[arg6];
        int var16 = arg4 - var8;
        class245.method1738(48, var15, var16, arg4 - arg1, arg5);
        int var17 = arg4 + var8;
        class245.method1738(48, var15, var17, var16, arg2);
        class245.method1738(48, var15, arg1 + arg4, var17, arg5);
        if (arg0) {
            field782 = 124;
        }
        while (var7 < var9) {
            var12 += 2;
            var14 += 2;
            var13 += var12;
            if (var13 >= 0 && var11 >= 1) {
                class80.field1224[var11] = var7;
                var11--;
                var13 -= var11 << 1;
            }
            var7++;
            var10 += var14;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 > var9) {
                    int[] var18 = class310.field4841[arg6 - var9];
                    int[] var19 = class310.field4841[arg6 + var9];
                    int var20 = class80.field1224[var9];
                    int var21 = arg4 + var7;
                    int var22 = arg4 - var7;
                    int var23 = arg4 + var20;
                    int var24 = arg4 - var20;
                    class245.method1738(48, var19, var24, var22, arg5);
                    class245.method1738(48, var19, var23, var24, arg2);
                    class245.method1738(48, var19, var21, var23, arg5);
                    class245.method1738(48, var18, var24, var22, arg5);
                    class245.method1738(48, var18, var23, var24, arg2);
                    class245.method1738(48, var18, var21, var23, arg5);
                } else {
                    int[] var25 = class310.field4841[arg6 + var9];
                    int[] var26 = class310.field4841[arg6 - var9];
                    int var27 = arg4 + var7;
                    int var28 = arg4 - var7;
                    class245.method1738(48, var25, var27, var28, arg5);
                    class245.method1738(48, var26, var27, var28, arg5);
                }
            }
            int[] var29 = class310.field4841[arg6 + var7];
            int var30 = arg4 + var9;
            int[] var31 = class310.field4841[arg6 - var7];
            int var32 = arg4 - var9;
            if (var7 < var8) {
                int var33 = var11 >= var7 ? var11 : class80.field1224[var7];
                int var34 = arg4 - var33;
                int var35 = arg4 + var33;
                class245.method1738(48, var29, var34, var32, arg5);
                class245.method1738(48, var29, var35, var34, arg2);
                class245.method1738(48, var29, var30, var35, arg5);
                class245.method1738(48, var31, var34, var32, arg5);
                class245.method1738(48, var31, var35, var34, arg2);
                class245.method1738(48, var31, var30, var35, arg5);
            } else {
                class245.method1738(48, var29, var30, var32, arg5);
                class245.method1738(48, var31, var30, var32, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 138)
    public static void method413(byte arg0) {
        field783 = null;
        int var1 = 7 % ((46 - arg0) / 37);
        field775 = null;
        field784 = null;
    }
}
