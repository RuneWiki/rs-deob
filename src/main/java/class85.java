import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class85 extends class22 {

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
    private final int field1354;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    private final int field1349;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    private final int field1353;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    private final int field1346;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public static int field1351 = 0;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    public static int field1358 = 0;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "[I")
    public static int[] field1344 = new int[2];

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public static int field1359 = 0;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "Lhd;")
    public static class214 field1348 = new class214(16);

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "Lo;")
    public static class175 field1361 = null;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "Ljb;")
    public static class11 field1360;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~arg2 == ~arg4 && arg0 == arg3 && arg5 == arg8 && ~arg1 == ~arg7) {
            class86.method581(arg5, arg9, arg4, 14119, arg7, arg0);
        } else {
            int var10 = arg4;
            int var11 = arg0;
            int var12 = arg2 * 3;
            int var13 = arg4 * 3;
            int var14 = arg3 * 3;
            int var15 = arg8 * 3;
            int var16 = arg1 * 3;
            int var17 = -var16 + arg7 + var14 + -arg0;
            int var18 = arg0 * 3;
            int var19 = var13 + var15 + -var12 + -var12;
            int var20 = -var15 + var12 + arg5 + -arg4;
            int var21 = -var14 + var16 + -var14 + var18;
            int var22 = -var13 + var12;
            int var23 = -var18 + var14;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var20 * var26;
                int var28 = var19 * var25;
                int var29 = var17 * var26;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 - -var31 + var28 >> 12) + arg4;
                int var34 = (var29 + var30 + var32 >> 12) + arg0;
                class86.method581(var33, arg9, var10, 14119, var34, var11);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg6 != 837971404) {
            method573(-87, -67, -96, -124, -15, -114, 19, 38, 107, -115);
        }
        ++field1350;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(III)V")
    public final void method202(int arg0, int arg1, int arg2) {
        ++field1356;
        int var4 = this.field1346 * arg0 >> 12;
        if (arg1 == -1) {
            int var5 = this.field1353 * arg0 >> 12;
            int var6 = this.field1349 * arg2 >> 12;
            int var7 = this.field1354 * arg2 >> 12;
            class144.method930(var7, super.field389, var5, arg1 ^ 12857, var6, var4, super.field393);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IBI)V")
    public final void method200(int arg0, byte arg1, int arg2) {
        if (arg1 >= -97) {
            field1348 = null;
        }
        ++field1345;
        int var4 = this.field1353 * arg2 >> 12;
        int var5 = this.field1346 * arg2 >> 12;
        int var6 = this.field1354 * arg0 >> 12;
        int var7 = this.field1349 * arg0 >> 12;
        class253.method1725(var4, var5, var6, -11483, var7, super.field387);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
    public static void method574(byte arg0) {
        field1361 = null;
        field1360 = null;
        field1344 = null;
        if (arg0 >= -83) {
            field1359 = 69;
        }
        field1348 = null;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IIIIIII)V")
    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1354 = arg1;
        this.field1349 = arg3;
        this.field1353 = arg2;
        this.field1346 = arg0;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
    public static final void method575(int arg0) {
        if (class152.field2534 == null || class216.field3712 == null) {
            class152.field2534 = new int[256];
            class216.field3712 = new int[256];
            for (int var1 = 0; ~var1 > -257; ++var1) {
                double var3 = (double) var1 / 255.0D * 6.283185307179586D;
                class152.field2534[var1] = (int) (4096.0D * Math.sin(var3));
                class216.field3712[var1] = (int) (Math.cos(var3) * 4096.0D);
            }
        }
        ++field1357;
        int var2 = 126 / ((arg0 - 67) / 43);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
    public final void method199(int arg0, int arg1, int arg2) {
        ++field1355;
        int var4 = this.field1346 * arg1 >> 12;
        int var5 = this.field1353 * arg1 >> 12;
        if (arg0 != -6474) {
            field1344 = null;
        }
        int var6 = this.field1354 * arg2 >> 12;
        int var7 = this.field1349 * arg2 >> 12;
        class102.method689(super.field393, var7, var5, var6, super.field387, var4, super.field389, arg0 ^ 6472);
    }
}
