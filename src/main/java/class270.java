import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class270 extends class137 {

    @OriginalMember(owner = "client!a", name = "B", descriptor = "I")
    public int field4681 = 12800;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "I")
    public int field4686 = 12800;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "I")
    public int field4691 = -1;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "I")
    public int field4690 = 0;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "Z")
    public boolean field4685 = true;

    @OriginalMember(owner = "client!a", name = "K", descriptor = "I")
    public int field4689 = 0;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "I")
    public int field4687;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "I")
    public int field4694;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "Ltl;")
    public class59 field4684;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "Ltl;")
    public class59 field4692;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "Lkl;")
    public class64 field4688;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "Z")
    public static boolean field4679 = false;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public static int field4678 = -1;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Loh;")
    public static class257 field4675;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V", line = 35)
    public final void method1882(int arg0) {
        this.field4690 = 0;
        this.field4686 = 12800;
        this.field4681 = 12800;
        this.field4689 = 0;
        field4680++;
        if (arg0 != 105) {
            field4678 = 44;
        }
        for (class226 var2 = (class226) this.field4688.method536(arg0 ^ 0x6B); var2 != null; var2 = (class226) this.field4688.method533(24)) {
            if (this.field4686 > var2.field3643) {
                this.field4686 = var2.field3643;
            }
            if (this.field4690 < var2.field3644) {
                this.field4690 = var2.field3644;
            }
            if (var2.field3641 < this.field4681) {
                this.field4681 = var2.field3641;
            }
            if (this.field4689 < var2.field3646) {
                this.field4689 = var2.field3646;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BII)Z", line = 72)
    public final boolean method1883(byte arg0, int arg1, int arg2) {
        field4676++;
        if (arg2 < this.field4681 || arg2 > this.field4689 || this.field4686 > arg1 || this.field4690 < arg1) {
            return false;
        }
        for (class226 var4 = (class226) this.field4688.method536(2); var4 != null; var4 = (class226) this.field4688.method533(24)) {
            if (var4.method1554(arg2, -6181, arg1)) {
                return true;
            }
        }
        int var5 = -30 / ((arg0 - 10) / 49);
        return false;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BZ)V", line = 98)
    public static final void method1884(byte arg0, boolean arg1) {
        class38.field578 = new int[104];
        field4682++;
        class280.field4819 = new int[104];
        if (arg0 != -102) {
            field4675 = (class257) null;
        }
        class138.field2274 = new int[104];
        class198.field3270 = 99;
        class12.field155 = new int[104];
        class195.field3230 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class123.field2027 = new byte[var2][104][104];
        class230.field3780 = new byte[var2][104][104];
        class94.field1467 = new byte[var2][104][104];
        class249.field4145 = new byte[var2][105][105];
        class1.field3 = new int[var2][105][105];
        class78.field1250 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V", line = 128)
    public static void method1885(byte arg0) {
        field4675 = null;
        int var1 = -52 % ((arg0 - 73) / 36);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ltl;Ltl;IIIZ)V", line = 402)
    public class270(class59 arg0, class59 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field4685 = arg5;
        this.field4687 = arg3;
        this.field4694 = arg2;
        this.field4691 = arg4;
        this.field4684 = arg1;
        this.field4692 = arg0;
        this.field4688 = new class64();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V", line = 157)
    public static final void method1886(int arg0, int arg1) {
        if (arg1 == 37) {
            class254.field4211 = 3.0F;
        } else if (arg1 == 50) {
            class254.field4211 = 4.0F;
        } else if (arg1 == 75) {
            class254.field4211 = 6.0F;
        } else {
            class254.field4211 = 8.0F;
        }
        if (arg0 != -10312) {
            field4675 = (class257) null;
        }
        field4693++;
        class69.field1065 = -1;
        class69.field1065 = -1;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIII)V", line = 194)
    public static final void method1887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4677++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg4 - arg5;
        int var12 = arg3 - arg5;
        int var13 = var11 * var11;
        int var14 = arg3 * arg3;
        int var15 = var12 * var12;
        int var16 = var14 << 1;
        int var17 = var15 << 1;
        int var18 = arg4 * arg4;
        int var19 = var18 << 1;
        if (arg1 != -26209) {
            return;
        }
        int var20 = var13 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var18 + var16;
        int var24 = var18 << 2;
        int var25 = var15 - (var22 - 1) * var20;
        int var26 = var14 - (var21 - 1) * var19;
        int var27 = (1 - var22) * var13 + var17;
        int var28 = var15 << 2;
        int var29 = var14 << 2;
        int var30 = var17 * 3;
        int var31 = var13 << 2;
        int var32 = (var21 - 3) * var19;
        int var33 = var29;
        int var34 = var16 * 3;
        int var35 = var28;
        int var36 = (var12 - 1) * var31;
        int var37 = (arg3 - 1) * var24;
        if (arg7 >= class28.field369 && arg7 <= class62.field957) {
            int[] var38 = class163.field2662[arg7];
            int var39 = class262.method1808(arg6 - arg4, class69.field1061, 0, class153.field2504);
            int var40 = class262.method1808(arg4 + arg6, class69.field1061, 0, class153.field2504);
            int var41 = class262.method1808(arg6 - var11, class69.field1061, 0, class153.field2504);
            int var42 = class262.method1808(arg6 + var11, class69.field1061, 0, class153.field2504);
            class174.method1283(7, arg2, var38, var39, var41);
            class174.method1283(7, arg0, var38, var41, var42);
            class174.method1283(7, arg2, var38, var42, var40);
        }
        int var43 = (var22 - 3) * var20;
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var34;
                    var34 += var29;
                    var8++;
                    var26 += var33;
                    var33 += var29;
                }
            }
            boolean var44 = var9 <= var12;
            var9--;
            if (var26 < 0) {
                var26 += var33;
                var23 += var34;
                var34 += var29;
                var8++;
                var33 += var29;
            }
            var26 += -var32;
            if (var44) {
                if (var27 < 0) {
                    while (var27 < 0) {
                        var27 += var30;
                        var25 += var35;
                        var10++;
                        var30 += var28;
                        var35 += var28;
                    }
                }
                if (var25 < 0) {
                    var27 += var30;
                    var25 += var35;
                    var10++;
                    var35 += var28;
                    var30 += var28;
                }
                var25 += -var43;
                var43 -= var31;
                var27 += -var36;
                var36 -= var31;
            }
            var23 += -var37;
            int var45 = arg7 - var9;
            var37 -= var24;
            int var46 = arg7 + var9;
            if (var46 >= class28.field369 && var45 <= class62.field957) {
                int var47 = class262.method1808(arg6 + var8, class69.field1061, 0, class153.field2504);
                int var48 = class262.method1808(arg6 - var8, class69.field1061, 0, class153.field2504);
                if (var44) {
                    int var49 = class262.method1808(arg6 + var10, class69.field1061, 0, class153.field2504);
                    int var50 = class262.method1808(arg6 - var10, class69.field1061, 0, class153.field2504);
                    if (class28.field369 <= var45) {
                        int[] var51 = class163.field2662[var45];
                        class174.method1283(arg1 + 26216, arg2, var51, var48, var50);
                        class174.method1283(arg1 + 26216, arg0, var51, var50, var49);
                        class174.method1283(7, arg2, var51, var49, var47);
                    }
                    if (var46 <= class62.field957) {
                        int[] var52 = class163.field2662[var46];
                        class174.method1283(7, arg2, var52, var48, var50);
                        class174.method1283(arg1 ^ 0xFFFF9998, arg0, var52, var50, var49);
                        class174.method1283(7, arg2, var52, var49, var47);
                    }
                } else {
                    if (var45 >= class28.field369) {
                        class174.method1283(7, arg2, class163.field2662[var45], var48, var47);
                    }
                    if (var46 <= class62.field957) {
                        class174.method1283(7, arg2, class163.field2662[var46], var48, var47);
                    }
                }
            }
            var32 -= var24;
        }
    }
}
