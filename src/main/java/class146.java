import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class146 extends class212 {

    @OriginalMember(owner = "client!ij", name = "Y", descriptor = "I")
    private int field2394 = 3072;

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "I")
    private int field2393 = 1024;

    @OriginalMember(owner = "client!ij", name = "hb", descriptor = "I")
    private int field2403 = 2048;

    @OriginalMember(owner = "client!ij", name = "eb", descriptor = "I")
    public static int field2400 = 0;

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "Ljd;")
    public static class265 field2390 = new class265(5);

    @OriginalMember(owner = "client!ij", name = "jb", descriptor = "Lsc;")
    private static class181 field2405 = class149.method967(255, "Attack");

    @OriginalMember(owner = "client!ij", name = "gb", descriptor = "Lsc;")
    public static class181 field2402 = field2405;

    @OriginalMember(owner = "client!ij", name = "kb", descriptor = "I")
    public static int field2406 = 0;

    @OriginalMember(owner = "client!ij", name = "V", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!ij", name = "Z", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!ij", name = "ab", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!ij", name = "bb", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!ij", name = "cb", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!ij", name = "db", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!ij", name = "fb", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!ij", name = "ib", descriptor = "[S")
    public static short[] field2404;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        ++field2392;
        if (arg1 <= 25) {
            field2404 = null;
        }
        int[] var3 = super.field3640.method737(true, arg0);
        if (super.field3640.field1813) {
            int[] var4 = this.method1405(arg0, 0, 10);
            for (int var5 = 0; ~var5 > ~class26.field452; ++var5) {
                var3[var5] = (var4[var5] * this.field2403 >> 12) + this.field2393;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    public class146() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(Z)V")
    public final void method46(boolean arg0) {
        ++field2395;
        if (!arg0) {
            this.field2403 = 37;
        }
        this.field2403 = -this.field2393 + this.field2394;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)[[I")
    public final int[][] method260(int arg0, int arg1) {
        ++field2398;
        if (arg1 != 16383) {
            this.method46(false);
        }
        int[][] var3 = super.field3645.method1352(arg0, arg1 + -16493);
        if (super.field3645.field3477) {
            int[][] var4 = this.method1410(arg0, 0, (byte) -114);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class26.field452 > var11; ++var11) {
                var8[var11] = this.field2393 - -(var5[var11] * this.field2403 >> 12);
                var9[var11] = (var6[var11] * this.field2403 >> 12) + this.field2393;
                var10[var11] = (var7[var11] * this.field2403 >> 12) + this.field2393;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIIIB)V")
    public static final void method949(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        ++field2396;
        int var9 = -arg5 + arg3;
        int var10 = -arg1 + arg0;
        int var11 = 51 / ((-13 - arg8) / 55);
        int var12 = (-arg4 + arg2 << 16) / var10;
        int var13 = (-arg7 + arg6 << 16) / var9;
        class98.method648(arg0, var13, arg4, arg3, arg1, 0, (byte) 86, arg5, var12, 0, arg7);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            this.method46(false);
        }
        ++field2399;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field3651 = arg0.method1516((byte) 82) == 1;
                }
            } else {
                this.field2394 = arg0.method1535(arg2 + 5);
            }
        } else {
            this.field2393 = arg0.method1535(2);
        }
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(B)V")
    public static void method950(byte arg0) {
        if (arg0 > 4) {
            field2405 = null;
            field2402 = null;
            field2390 = null;
            field2404 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(IB)Z")
    public static final boolean method951(int arg0, byte arg1) {
        ++field2397;
        if (arg1 != -124) {
            return false;
        } else {
            return ~((1055990 & arg0) >> 20) != -1;
        }
    }
}
