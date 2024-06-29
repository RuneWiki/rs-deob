import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class200 extends class459 {

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "[I")
    public static int[] field2371 = new int[2];

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "B")
    public byte field2365;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    public int field2362;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "Lig;")
    public class244 field2370;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)[B", line = 3)
    public final byte[] method1206(byte arg0) {
        if (arg0 >= -17) {
            return null;
        } else {
            ++field2368;
            if (!super.field6563 && this.field2370.field2903 >= this.field2370.field2912.length + -this.field2365) {
                return this.field2370.field2912;
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIBII)V", line = 22)
    public static final void method1207(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field2366;
        class308.method1837(arg1, 2);
        int var7 = 0;
        int var8 = -arg2 + arg1;
        if (~var8 > -1) {
            var8 = 0;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class408.field5585[arg0];
        if (arg4 < 76) {
            field2367 = 112;
        }
        int var16 = -var8 + arg6;
        int var17 = arg6 + var8;
        class223.method1297(var15, -7, -arg1 + arg6, arg3, var16);
        class223.method1297(var15, -7, var16, arg5, var17);
        class223.method1297(var15, -7, var17, arg3, arg6 - -arg1);
        while (~var7 > ~var9) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (~var12 <= -1 && ~var11 <= -2) {
                class220.field2541[var11] = var7;
                --var11;
                var12 -= var11 << 1;
            }
            ++var7;
            if (var10 >= 0) {
                --var9;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var18 = class408.field5585[arg0 + var9];
                    int[] var19 = class408.field5585[-var9 + arg0];
                    int var20 = class220.field2541[var9];
                    int var21 = arg6 - -var7;
                    int var22 = -var7 + arg6;
                    int var23 = arg6 + var20;
                    int var24 = arg6 - var20;
                    class223.method1297(var18, -7, var22, arg3, var24);
                    class223.method1297(var18, -7, var24, arg5, var23);
                    class223.method1297(var18, -7, var23, arg3, var21);
                    class223.method1297(var19, -7, var22, arg3, var24);
                    class223.method1297(var19, -7, var24, arg5, var23);
                    class223.method1297(var19, -7, var23, arg3, var21);
                } else {
                    int[] var25 = class408.field5585[arg0 + var9];
                    int[] var26 = class408.field5585[-var9 + arg0];
                    int var27 = arg6 + var7;
                    int var28 = -var7 + arg6;
                    class223.method1297(var25, -7, var28, arg3, var27);
                    class223.method1297(var26, -7, var28, arg3, var27);
                }
            }
            int[] var29 = class408.field5585[arg0 + var7];
            int[] var30 = class408.field5585[-var7 + arg0];
            int var31 = arg6 + var9;
            int var32 = -var9 + arg6;
            if (~var7 > ~var8) {
                int var33 = ~var11 > ~var7 ? class220.field2541[var7] : var11;
                int var34 = arg6 - -var33;
                int var35 = -var33 + arg6;
                class223.method1297(var29, -7, var32, arg3, var35);
                class223.method1297(var29, -7, var35, arg5, var34);
                class223.method1297(var29, -7, var34, arg3, var31);
                class223.method1297(var30, -7, var32, arg3, var35);
                class223.method1297(var30, -7, var35, arg5, var34);
                class223.method1297(var30, -7, var34, arg3, var31);
            } else {
                class223.method1297(var29, -7, var32, arg3, var31);
                class223.method1297(var30, -7, var32, arg3, var31);
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)V", line = 150)
    public static final void method1208(int arg0, int arg1) {
        class513.field7321 = arg1;
        int var2 = -12 % ((arg0 - 5) / 34);
        ++field2363;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)Lsn;", line = 164)
    public static final class629 method1209(int arg0, boolean arg1) {
        ++field2364;
        class629[] var2 = class544.method3196(9571);
        int var3 = 0;
        if (!arg1) {
            method1210(true);
        }
        while (~var2.length < ~var3) {
            class629 var4 = var2[var3];
            if (var4.field9026 == arg0) {
                return var4;
            }
            ++var3;
        }
        return null;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(Z)V", line = 193)
    public static void method1210(boolean arg0) {
        field2371 = null;
        if (arg0) {
            method1207(112, -6, 12, -124, (byte) -4, 19, 82);
        }
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)I", line = 206)
    public final int method1211(int arg0) {
        if (arg0 != 100) {
            return -4;
        } else {
            ++field2369;
            return this.field2370 == null ? 0 : this.field2370.field2903 * 100 / (this.field2370.field2912.length + -this.field2365);
        }
    }
}
