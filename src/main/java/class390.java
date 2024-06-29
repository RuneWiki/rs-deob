import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class390 extends class54 {

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Ljava/lang/String;")
    private String field5555 = null;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "J")
    private long field5563 = -1L;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "[I")
    public static int[] field5562 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "B")
    private byte field5554;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    private int field5561;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Lek;")
    public static class514 field5558;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lag;I)V")
    public final void method419(class459 arg0, int arg1) {
        field5557++;
        if (arg1 != -33) {
            method2417(31);
        }
        class74 var3 = new class74();
        var3.field830 = this.field5561;
        var3.field828 = this.field5555;
        var3.field831 = this.field5554;
        arg0.method2765(var3, arg1 ^ 0xFFFFFFA8);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)Z")
    public static final boolean method2415(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method2416(117, 50, -3, 34, 120, -110, -76);
        }
        field5556++;
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class491.method2904((byte) -123, arg5);
        field5553++;
        int var7 = 0;
        int var8 = arg5 - arg1;
        if (var8 < arg4) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (class727.field10060 <= arg3 && class474.field6576 >= arg3) {
            int[] var15 = class705.field9804[arg3];
            int var16 = class436.method2621(arg0 - arg5, class627.field8783, class177.field2236, 512);
            int var17 = class436.method2621(arg0 + arg5, class627.field8783, class177.field2236, 512);
            int var18 = class436.method2621(arg0 - var8, class627.field8783, class177.field2236, 512);
            int var19 = class436.method2621(arg0 + var8, class627.field8783, class177.field2236, 512);
            class128.method883(arg6, var16, var18, var15, 7);
            class128.method883(arg2, var18, var19, var15, 7);
            class128.method883(arg6, var19, var17, var15, 7);
        }
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class126.field1644[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg3 - var9;
                int var21 = arg3 + var9;
                if (class727.field10060 <= var21 && class474.field6576 >= var20) {
                    if (var9 < var8) {
                        int var22 = class126.field1644[var9];
                        int var23 = class436.method2621(arg0 + var7, class627.field8783, class177.field2236, 512);
                        int var24 = class436.method2621(arg0 - var7, class627.field8783, class177.field2236, 512);
                        int var25 = class436.method2621(arg0 + var22, class627.field8783, class177.field2236, 512);
                        int var26 = class436.method2621(arg0 - var22, class627.field8783, class177.field2236, 512);
                        if (var21 <= class474.field6576) {
                            int[] var27 = class705.field9804[var21];
                            class128.method883(arg6, var24, var26, var27, arg4 + 7);
                            class128.method883(arg2, var26, var25, var27, 7);
                            class128.method883(arg6, var25, var23, var27, 7);
                        }
                        if (class727.field10060 <= var20) {
                            int[] var28 = class705.field9804[var20];
                            class128.method883(arg6, var24, var26, var28, 7);
                            class128.method883(arg2, var26, var25, var28, 7);
                            class128.method883(arg6, var25, var23, var28, arg4 + 7);
                        }
                    } else {
                        int var29 = class436.method2621(arg0 + var7, class627.field8783, class177.field2236, 512);
                        int var30 = class436.method2621(arg0 - var7, class627.field8783, class177.field2236, 512);
                        if (class474.field6576 >= var21) {
                            class128.method883(arg6, var30, var29, class705.field9804[var21], 7);
                        }
                        if (class727.field10060 <= var20) {
                            class128.method883(arg6, var30, var29, class705.field9804[var20], arg4 + 7);
                        }
                    }
                }
            }
            int var31 = arg3 - var7;
            int var32 = arg3 + var7;
            if (var32 >= class727.field10060 && var31 <= class474.field6576) {
                int var33 = arg0 + var9;
                int var34 = arg0 - var9;
                if (class177.field2236 <= var33 && class627.field8783 >= var34) {
                    int var35 = class436.method2621(var33, class627.field8783, class177.field2236, 512);
                    int var36 = class436.method2621(var34, class627.field8783, class177.field2236, 512);
                    if (var7 >= var8) {
                        if (class474.field6576 >= var32) {
                            class128.method883(arg6, var36, var35, class705.field9804[var32], 7);
                        }
                        if (class727.field10060 <= var31) {
                            class128.method883(arg6, var36, var35, class705.field9804[var31], arg4 + 7);
                        }
                    } else {
                        int var37 = var7 <= var11 ? var11 : class126.field1644[var7];
                        int var38 = class436.method2621(arg0 + var37, class627.field8783, class177.field2236, 512);
                        int var39 = class436.method2621(arg0 - var37, class627.field8783, class177.field2236, 512);
                        if (var32 <= class474.field6576) {
                            int[] var40 = class705.field9804[var32];
                            class128.method883(arg6, var36, var39, var40, 7);
                            class128.method883(arg2, var39, var38, var40, 7);
                            class128.method883(arg6, var38, var35, var40, 7);
                        }
                        if (class727.field10060 <= var31) {
                            int[] var41 = class705.field9804[var31];
                            class128.method883(arg6, var36, var39, var41, 7);
                            class128.method883(arg2, var39, var38, var41, arg4 + 7);
                            class128.method883(arg6, var38, var35, var41, 7);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
    public static void method2417(int arg0) {
        field5558 = null;
        if (arg0 <= -12) {
            field5562 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lgga;B)V")
    public final void method422(class511 arg0, byte arg1) {
        field5559++;
        if (arg0.method3013(arg1 ^ 0x6E) != 255) {
            arg0.field6962--;
            this.field5563 = arg0.method3020(true);
        }
        this.field5555 = arg0.method2998((byte) -112);
        this.field5561 = arg0.method3002(-1);
        this.field5554 = arg0.method3030(-25984);
        if (arg1 != -21) {
            method2418(56, -42, -5);
        }
        arg0.method3020(true);
        if (class57.field670) {
            System.out.println("memberhash:" + this.field5563 + " membername:" + this.field5555);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(III)V")
    public static final void method2418(int arg0, int arg1, int arg2) {
        field5560++;
        class17 var3 = class245.method1634(1, (long) arg2, 13);
        var3.method66((byte) -118);
        var3.field107 = arg1;
        if (arg0 >= -10) {
            method2417(-110);
        }
    }
}
