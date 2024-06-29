import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class33 extends class150 {

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    private int field475;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    private int field477;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    private int field472;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "[I")
    public static int[] field469 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field480 = -1;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Lck;")
    public static class1 field473 = new class1(64);

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field483 = 0;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Lvh;")
    public static class108 field471;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIBIIII)V")
    public static final void method217(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        class89.method578(arg1, false);
        int var8 = -arg5 + arg1;
        ++field476;
        if (var8 < 0) {
            var8 = 0;
        }
        if (arg2 <= 46) {
            field471 = null;
        }
        int var9 = var8;
        int var10 = arg1;
        int var11 = -var8;
        int var12 = -arg1;
        int var13 = -1;
        int[] var14 = class167.field2735[arg4];
        int var15 = -1;
        int var16 = arg0 - var8;
        class93.method598(-7, var16, -arg1 + arg0, var14, arg3);
        int var17 = arg0 + var8;
        class93.method598(-7, var17, var16, var14, arg6);
        class93.method598(-7, arg0 + arg1, var17, var14, arg3);
        while (~var7 > ~var10) {
            var15 += 2;
            var12 += var15;
            var13 += 2;
            var11 += var13;
            if (var11 >= 0 && ~var9 <= -2) {
                class256.field4178[var9] = var7;
                --var9;
                var11 -= var9 << 1;
            }
            ++var7;
            if (var12 >= 0) {
                --var10;
                if (~var10 > ~var8) {
                    int[] var18 = class167.field2735[arg4 + var10];
                    int[] var19 = class167.field2735[-var10 + arg4];
                    int var20 = class256.field4178[var10];
                    int var21 = arg0 + var7;
                    int var22 = -var7 + arg0;
                    int var23 = -var20 + arg0;
                    class93.method598(-7, var23, var22, var18, arg3);
                    int var24 = arg0 - -var20;
                    class93.method598(-7, var24, var23, var18, arg6);
                    class93.method598(-7, var21, var24, var18, arg3);
                    class93.method598(-7, var23, var22, var19, arg3);
                    class93.method598(-7, var24, var23, var19, arg6);
                    class93.method598(-7, var21, var24, var19, arg3);
                } else {
                    int[] var25 = class167.field2735[arg4 - -var10];
                    int[] var26 = class167.field2735[-var10 + arg4];
                    int var27 = arg0 - -var7;
                    int var28 = -var7 + arg0;
                    class93.method598(-7, var27, var28, var25, arg3);
                    class93.method598(-7, var27, var28, var26, arg3);
                }
                var12 -= var10 << 1;
            }
            int[] var29 = class167.field2735[arg4 + var7];
            int[] var30 = class167.field2735[-var7 + arg4];
            int var31 = arg0 + var10;
            int var32 = -var10 + arg0;
            if (var7 >= var8) {
                class93.method598(-7, var31, var32, var29, arg3);
                class93.method598(-7, var31, var32, var30, arg3);
            } else {
                int var33 = var9 < var7 ? class256.field4178[var7] : var9;
                int var34 = arg0 - -var33;
                int var35 = arg0 - var33;
                class93.method598(-7, var35, var32, var29, arg3);
                class93.method598(-7, var34, var35, var29, arg6);
                class93.method598(-7, var31, var34, var29, arg3);
                class93.method598(-7, var35, var32, var30, arg3);
                class93.method598(-7, var34, var35, var30, arg6);
                class93.method598(-7, var31, var34, var30, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V")
    public final void method218(int arg0, int arg1, int arg2) {
        ++field478;
        int var4 = this.field472 * arg1 >> 12;
        int var5 = this.field470 * arg1 >> 12;
        if (arg0 != 0) {
            this.method220(32, (byte) 49, -49);
        }
        int var6 = this.field475 * arg2 >> 12;
        int var7 = this.field477 * arg2 >> 12;
        class98.method619(var7, var6, super.field2513, super.field2518, var5, 1, super.field2517, var4);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
    public static void method219(boolean arg0) {
        if (!arg0) {
            method219(false);
        }
        field471 = null;
        field473 = null;
        field469 = null;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIIIIII)V")
    public class33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field475 = arg1;
        this.field477 = arg3;
        this.field470 = arg2;
        this.field472 = arg0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBI)V")
    public final void method220(int arg0, byte arg1, int arg2) {
        ++field479;
        int var4 = this.field472 * arg0 >> 12;
        int var5 = this.field470 * arg0 >> 12;
        int var6 = -44 % ((arg1 - 39) / 62);
        int var7 = this.field475 * arg2 >> 12;
        int var8 = this.field477 * arg2 >> 12;
        class155.method1068(var8, var5, 1988751940, var7, var4, super.field2517);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BII)V")
    public final void method221(byte arg0, int arg1, int arg2) {
        ++field481;
        int var4 = 62 % ((arg0 - 7) / 63);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method222(int arg0, int arg1) {
        ++field482;
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else {
            if (arg1 != -12096) {
                method222(-117, 86);
            }
            return arg0 < 10000000 ? "<col=ffffff>" + arg0 / 1000 + class176.field2894 + "</col>" : "<col=00ff80>" + arg0 / 1000000 + class145.field2482 + "</col>";
        }
    }
}
