import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class168 {

    @OriginalMember(owner = "client!am", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field2669 = new String[100];

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method1334(boolean arg0) {
        class31.field492 = arg0;
        field2674++;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIIB)V", line = 13)
    public static final void method1335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field2670++;
        int var8 = arg3;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg3 * arg3;
        int var12 = arg1 - arg5;
        int var13 = arg1 * arg1;
        int var14 = 23 / ((arg7 + 33) / 62);
        int var15 = var12 * var12;
        int var16 = var11 << 1;
        int var17 = arg3 - arg5;
        int var18 = var17 * var17;
        int var19 = var15 << 1;
        int var20 = var18 << 1;
        int var21 = var13 << 1;
        int var22 = arg3 << 1;
        int var23 = var17 << 1;
        int var24 = (1 - var22) * var13 + var16;
        int var25 = (1 - var23) * var15 + var20;
        int var26 = var11 - ((var22 - 1) * var21);
        int var27 = var18 - ((var23 - 1) * var19);
        int var28 = var13 << 2;
        int var29 = var15 << 2;
        int var30 = var11 << 2;
        int var31 = var18 << 2;
        int var32 = var16 * 3;
        int var33 = (var22 - 3) * var21;
        int var34 = var20 * 3;
        int var35 = (var23 - 3) * var19;
        int var36 = var30;
        int var37 = (arg3 - 1) * var28;
        int var38 = (var17 - 1) * var29;
        int var39 = var31;
        int[] var40 = class133.field2235[arg0];
        class283.method2059(arg6, var40, (byte) 97, arg2 - var12, -arg1 + arg2);
        class283.method2059(arg4, var40, (byte) 89, arg2 + var12, -var12 + arg2);
        class283.method2059(arg6, var40, (byte) 91, arg2 + arg1, arg2 - -var12);
        while (var8 > 0) {
            if (var24 < 0) {
                while (var24 < 0) {
                    var9++;
                    var26 += var36;
                    var36 += var30;
                    var24 += var32;
                    var32 += var30;
                }
            }
            if (var26 < 0) {
                var26 += var36;
                var9++;
                var36 += var30;
                var24 += var32;
                var32 += var30;
            }
            boolean var41 = var8 <= var17;
            var8--;
            int var42 = arg0 + var8;
            if (var41) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var27 += var39;
                        var39 += var31;
                        var25 += var34;
                        var34 += var31;
                        var10++;
                    }
                }
                if (var27 < 0) {
                    var25 += var34;
                    var34 += var31;
                    var27 += var39;
                    var39 += var31;
                    var10++;
                }
                var27 += -var35;
                var35 -= var29;
                var25 += -var38;
                var38 -= var29;
            }
            int var43 = arg2 + var9;
            int var44 = arg2 - var9;
            var24 += -var37;
            var37 -= var28;
            var26 += -var33;
            var33 -= var28;
            int var45 = arg0 - var8;
            if (var41) {
                int var46 = arg2 + var10;
                int var47 = arg2 - var10;
                class283.method2059(arg6, class133.field2235[var45], (byte) 116, var47, var44);
                class283.method2059(arg4, class133.field2235[var45], (byte) 113, var46, var47);
                class283.method2059(arg6, class133.field2235[var45], (byte) 90, var43, var46);
                class283.method2059(arg6, class133.field2235[var42], (byte) 121, var47, var44);
                class283.method2059(arg4, class133.field2235[var42], (byte) 110, var46, var47);
                class283.method2059(arg6, class133.field2235[var42], (byte) 92, var43, var46);
            } else {
                class283.method2059(arg6, class133.field2235[var45], (byte) 123, var43, var44);
                class283.method2059(arg6, class133.field2235[var42], (byte) 88, var43, var44);
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)V", line = 197)
    public static final void method1336(int arg0, int arg1) {
        if (arg1 != 3) {
            return;
        }
        field2672++;
        class133 var2 = (class133) class81.field1169.method370((byte) -120, (long) arg0);
        if (var2 != null) {
            var2.method1357(arg1 ^ 0x387BF221);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 213)
    public static void method1337(int arg0) {
        if (arg0 != 0) {
            method1337(49);
        }
        field2669 = null;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V", line = 225)
    public static final void method1338(int arg0) {
        field2675++;
        if (!class158.method1282(false) && class68.field1046 != class119.field1826) {
            class91.method823(class173.field2746.field1300[0], class119.field1826, class311.field4843, class297.field4602, true, false, class173.field2746.field1290[0], false);
        } else if (arg0 > 124) {
            class167.method1327(-1);
            if (class50.field781 != class119.field1826) {
                class318.method2246((byte) 0);
            }
        }
    }
}
