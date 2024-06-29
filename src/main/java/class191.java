import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class191 {

    @OriginalMember(owner = "client!dp", name = "p", descriptor = "I")
    private int field2624 = -1;

    @OriginalMember(owner = "client!dp", name = "q", descriptor = "Z")
    private boolean field2625 = true;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "[Llq;")
    private class81[] field2615;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
    private int field2618;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    private int field2610;

    @OriginalMember(owner = "client!dp", name = "r", descriptor = "I")
    private int field2626;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    private int field2616;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "[Llq;")
    private class81[] field2613;

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "Llq;")
    private class81 field2623;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "Z")
    public static boolean field2611 = true;

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "I")
    public static int field2622 = 0;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    private int field2612;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "I")
    private int field2621;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "Lrg;")
    private class395 field2614;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IILoj;)Z", line = 5)
    public final boolean method1041(int arg0, int arg1, class280 arg2) {
        field2619++;
        if (arg1 > -74) {
            this.field2613 = null;
        }
        if (this.field2624 != arg0) {
            this.field2624 = arg0;
            int var4 = class93.method459(-719824240, arg0);
            if (var4 > arg0) {
                var4 = class89.method446(-744346942, arg0);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field2612 != var4) {
                this.field2612 = var4;
                this.field2614 = null;
            }
            if (this.field2615 != null) {
                this.field2621 = 0;
                int[] var5 = new int[this.field2615.length];
                for (int var6 = 0; var6 < this.field2615.length; var6++) {
                    class81 var7 = this.field2615[var6];
                    if (var7.method407(this.field2618, this.field2616, this.field2626, this.field2624)) {
                        var5[this.field2621] = var7.field965;
                        this.field2613[this.field2621++] = var7;
                    }
                }
                class212.method1180(this.field2621 - 1, (byte) -123, this.field2613, 0, var5);
            }
            this.field2625 = true;
        }
        boolean var8 = false;
        if (this.field2625) {
            this.field2625 = false;
            for (int var9 = this.field2621 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field2613[var9].method406(arg2, this.field2623);
                var8 |= var10;
                this.field2625 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIILoj;IIII)V", line = 83)
    public final void method1042(int arg0, int arg1, int arg2, int arg3, int arg4, class280 arg5, int arg6, int arg7, int arg8, int arg9) {
        field2620++;
        int var11 = arg2 + arg7 & 0x3FFF;
        if (this.field2610 == -1) {
            arg5.method1483(arg3, arg9, arg4, arg1, arg6, 0);
        } else {
            class189 var12 = class128.field1585.method577(this.field2610, -122);
            if (this.field2614 == null && class128.field1585.method575(this.field2610, (byte) 117)) {
                int[] var13 = var12.field2582 ? class128.field1585.method578(false, this.field2610, this.field2612, 0.7F, -46, this.field2612) : class128.field1585.method573(false, -97, this.field2610, 0.7F, this.field2612, this.field2612);
                this.field2614 = arg5.method1355(var13, 0, this.field2612, this.field2612, this.field2612);
            }
            if (!var12.field2582) {
                arg5.method1483(arg3, arg9, arg4, arg1, arg6, 0);
            }
            if (this.field2614 != null) {
                int var14 = var12.field2582 ? 0 : 1;
                int var15 = arg0 * arg1 / -4096;
                int var16;
                for (var16 = arg1 * var11 / 4096 + (arg4 - arg1) / 2; var16 > arg1; var16 -= arg1) {
                }
                while (var15 > arg1) {
                    var15 -= arg1;
                }
                while (var16 < 0) {
                    var16 += arg1;
                }
                while (var15 < 0) {
                    var15 += arg1;
                }
                for (int var17 = var16 - arg1; var17 < arg4; var17 += arg1) {
                    for (int var18 = var15 - arg1; var18 < arg1; var18 += arg1) {
                        this.field2614.method225(arg3 + var17, arg9 + var18, arg1, arg1, 0, 0, var14);
                    }
                }
            }
        }
        int var19 = this.field2621 - 1;
        if (arg8 != 0) {
            this.method1042(-46, -17, 72, -36, -8, (class280) null, -28, -6, -22, 95);
        }
        while (var19 >= 0) {
            this.field2613[var19].method405(arg5, arg3, arg9, arg4, arg1, arg0, var11);
            var19--;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V", line = 161)
    public final void method1043(byte arg0) {
        field2609++;
        if (this.field2615 != null) {
            for (int var2 = 0; var2 < this.field2615.length; var2++) {
                this.field2615[var2].method411();
            }
        }
        this.field2614 = null;
        int var3 = 70 % ((arg0 + 1) / 50);
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(I[Llq;IIII)V", line = 210)
    public class191(int arg0, class81[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2615 = arg1;
        this.field2618 = arg3;
        this.field2610 = arg0;
        this.field2626 = arg5;
        this.field2616 = arg4;
        if (arg1 == null) {
            this.field2613 = null;
            this.field2623 = null;
        } else {
            this.field2613 = new class81[arg1.length];
            this.field2623 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
