import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class163 extends class297 {

    @OriginalMember(owner = "client!qh", name = "Gb", descriptor = "Luj;")
    public static class156 field2569 = new class156();

    @OriginalMember(owner = "client!qh", name = "Kb", descriptor = "Lck;")
    public static class119 field2573 = class298.method1987((byte) 46, "::qa_op_test");

    @OriginalMember(owner = "client!qh", name = "Hb", descriptor = "Lpi;")
    public static class73 field2570 = new class73(64);

    @OriginalMember(owner = "client!qh", name = "Ob", descriptor = "I")
    public static int field2577 = -1;

    @OriginalMember(owner = "client!qh", name = "Pb", descriptor = "I")
    public static int field2578 = 0;

    @OriginalMember(owner = "client!qh", name = "Fb", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!qh", name = "Ib", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!qh", name = "Jb", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!qh", name = "Lb", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!qh", name = "Nb", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!qh", name = "Mb", descriptor = "Lkk;")
    public class50 field2575;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIIIJ)V", line = 5)
    public final void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2568++;
        if (this.field2575 == null) {
            return;
        }
        class56 var11 = this.field4993 != -1 && this.field4941 == 0 ? class276.method1818(-20682, this.field4993) : null;
        class56 var12 = this.field4948 == -1 || this.field4976 == this.field4948 && var11 != null ? null : class276.method1818(-20682, this.field4948);
        class28 var13 = this.field2575.method375(0, this.field4951, var11, var12, this.field4959);
        if (var13 == null) {
            return;
        }
        this.field4971 = var13.method214();
        class50 var14 = this.field2575;
        if (var14.field826 != null) {
            var14 = var14.method378((byte) -104);
        }
        if (class224.field3598 && var14.field811) {
            class28 var15 = class244.method1588(this.field2575.field806, var13, this.field4981, (byte) 122, this.field2575.field791, var12 == null ? this.field4959 : this.field4951, this.field5001, this.field2575.field814, this.field4991, var12 == null ? var11 : var12, arg0, this.field4949, this.field2575.field796, this.field2575.field782);
            float var16 = class264.method1737();
            float var17 = class264.method1724();
            class264.method1725();
            class264.method1734(var16, var17 - 150.0F);
            var15.method202(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
            class264.method1739();
            class264.method1734(var16, var17);
        }
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        if (this.field2575.field772 != 0 && this.field2575.field773 != 0) {
            int var21 = class284.field4698[arg0];
            short var22 = this.field2575.field772;
            short var23 = this.field2575.field773;
            int var24 = -var22 / 2;
            int var25 = -var23 / 2;
            int var26 = class284.field4699[arg0];
            int var27 = var21 * var25 + var24 * var26 >> 16;
            int var28 = var25 * var26 - (var21 * var24) >> 16;
            int var29 = var22 / 2;
            int var30 = -var23 / 2;
            int var31 = class207.method1304(class10.field189, (byte) 104, this.field4949 + var27, this.field4991 + var28);
            int var32 = var26 * var30 - var21 * var29 >> 16;
            int var33 = var21 * var30 + var26 * var29 >> 16;
            int var34 = class207.method1304(class10.field189, (byte) 88, this.field4949 + var33, this.field4991 + var32);
            int var35 = -var22 / 2;
            int var36 = var23 / 2;
            int var37 = var21 * var36 + var26 * var35 >> 16;
            int var38 = var22 / 2;
            int var39 = var23 / 2;
            int var40 = var26 * var36 - (var21 * var35) >> 16;
            int var41 = var26 * var39 - var21 * var38 >> 16;
            int var42 = var21 * var39 + var26 * var38 >> 16;
            int var43 = var31 < var34 ? var31 : var34;
            int var44 = class207.method1304(class10.field189, (byte) 86, this.field4949 + var37, this.field4991 + var40);
            int var45 = class207.method1304(class10.field189, (byte) 126, this.field4949 + var42, this.field4991 - -var41);
            int var46 = var31 + var45;
            int var47 = var45 <= var34 ? var45 : var34;
            if (var34 + var44 < var46) {
                var46 = var34 + var44;
            }
            int var48 = var44 >= var45 ? var45 : var44;
            var18 = (int) (Math.atan2((double) (var43 - var48), (double) var23) * 325.95D) & 0x7FF;
            if (var18 != 0) {
                var13.method221(var18);
            }
            int var49 = var31 < var44 ? var31 : var44;
            var19 = (int) (Math.atan2((double) (var49 - var47), (double) var22) * 325.95D) & 0x7FF;
            if (var19 != 0) {
                var13.method203(var19);
            }
            var20 = (var46 >> 1) - this.field4981;
            if (var20 != 0) {
                var13.method223(0, var20, 0);
            }
        }
        class28 var50 = null;
        if (this.field4962 != -1 && this.field4965 != -1) {
            class240 var51 = class234.method1511(73, this.field4962);
            var50 = var51.method1564(this.field4965, (byte) 125);
            if (var50 != null) {
                var50.method223(0, -this.field4995, 0);
                if (var51.field3839) {
                    if (var18 != 0) {
                        var50.method221(var18);
                    }
                    if (var19 != 0) {
                        var50.method203(var19);
                    }
                    if (var20 != 0) {
                        var50.method223(0, var20, 0);
                    }
                }
            }
        }
        if (this.field2575.field796 == 1) {
            var13.field412 = true;
        }
        var13.method202(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        if (var50 != null) {
            if (this.field2575.field796 == 1) {
                var50.field412 = true;
            }
            var50.method202(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()I", line = 183)
    public final int method214() {
        field2576++;
        return this.field4971;
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V", line = 196)
    public static void method1036(byte arg0) {
        int var1 = 56 / ((43 - arg0) / 53);
        field2570 = null;
        field2569 = null;
        field2573 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lba;III)V", line = 206)
    public static final void method1037(class292 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field4993 == arg3 && arg3 != -1) {
            class56 var4 = class276.method1818(-20682, arg3);
            int var5 = var4.field909;
            if (var5 == 1) {
                arg0.field4967 = 0;
                arg0.field4975 = 0;
                arg0.field4941 = arg2;
                arg0.field4959 = 0;
                class199.method1269(arg0.field4959, class124.field1917 == arg0, var4, arg0.field4991, -105, arg0.field4949);
            }
            if (var5 == 2) {
                arg0.field4967 = 0;
            }
        } else if (arg3 == -1 || arg0.field4993 == -1 || class276.method1818(-20682, arg3).field907 >= class276.method1818(-20682, arg0.field4993).field907) {
            arg0.field4967 = 0;
            arg0.field4975 = 0;
            arg0.field4959 = 0;
            arg0.field4996 = arg0.field4990;
            arg0.field4941 = arg2;
            arg0.field4993 = arg3;
            if (arg0.field4993 != -1) {
                class199.method1269(arg0.field4959, class124.field1917 == arg0, class276.method1818(-20682, arg0.field4993), arg0.field4991, -79, arg0.field4949);
            }
        }
        field2574++;
        if (arg1 != 0) {
            field2573 = (class119) null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)Z", line = 260)
    public final boolean method1038(byte arg0) {
        if (arg0 > -91) {
            return true;
        } else {
            field2571++;
            return this.field2575 != null;
        }
    }
}
