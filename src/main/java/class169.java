import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class169 extends class78 {

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "Z")
    public boolean field2620 = true;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
    public int field2623 = 12800;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    public int field2622 = 0;

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "I")
    public int field2634 = 12800;

    @OriginalMember(owner = "client!eh", name = "cb", descriptor = "I")
    public int field2640 = -1;

    @OriginalMember(owner = "client!eh", name = "ab", descriptor = "I")
    public int field2638 = -1;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "I")
    public int field2632 = 0;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
    public int field2618;

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "Ljava/lang/String;")
    public String field2636;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public int field2619;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "Ljava/lang/String;")
    public String field2624;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "Lea;")
    public class204 field2621;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "I")
    public static int field2625 = 0;

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "I")
    public static int field2633 = 0;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "I")
    public static int field2631 = 0;

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!eh", name = "X", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!eh", name = "bb", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!eh", name = "db", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!eh", name = "eb", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "Lob;")
    public static class292 field2637;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "(I)V", line = 5)
    public static final void method1231(int arg0) {
        if (arg0 != 29307) {
            return;
        }
        class9.field149 = null;
        field2641++;
        class235.field3698 = null;
        class62.field959 = null;
        class280.field4330 = null;
        class118.field1905 = null;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(III)Z", line = 21)
    public final boolean method1232(int arg0, int arg1, int arg2) {
        field2630++;
        if (this.field2623 > arg2 || arg2 > this.field2632 || arg1 < this.field2634 || arg1 > this.field2622) {
            return false;
        }
        for (class168 var4 = (class168) this.field2621.method1490(200); var4 != null; var4 = (class168) this.field2621.method1487((byte) 117)) {
            if (var4.method1230(arg1, arg2, -13323)) {
                return true;
            }
        }
        if (arg0 > -47) {
            this.method1233(-16);
        }
        return false;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIZI)V", line = 374)
    public class169(String arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field2618 = arg2;
        this.field2636 = arg1;
        this.field2619 = arg3;
        this.field2638 = arg6;
        this.field2640 = arg4;
        this.field2620 = arg5;
        this.field2624 = arg0;
        if (this.field2638 == 255) {
            this.field2638 = 0;
        }
        this.field2621 = new class204();
    }

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "(I)V", line = 61)
    public final void method1233(int arg0) {
        this.field2632 = 0;
        this.field2622 = 0;
        this.field2623 = 12800;
        this.field2634 = 12800;
        if (arg0 != 4477) {
            this.field2638 = 9;
        }
        field2639++;
        for (class168 var2 = (class168) this.field2621.method1490(arg0 ^ 0x11B5); var2 != null; var2 = (class168) this.field2621.method1487((byte) 117)) {
            if (this.field2623 > var2.field2610) {
                this.field2623 = var2.field2610;
            }
            if (var2.field2604 > this.field2622) {
                this.field2622 = var2.field2604;
            }
            if (this.field2632 < var2.field2615) {
                this.field2632 = var2.field2615;
            }
            if (this.field2634 > var2.field2609) {
                this.field2634 = var2.field2609;
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIILjh;IIIIILfa;IIIZ)Lfa;", line = 110)
    public static final class199 method1234(int arg0, int arg1, int arg2, class269 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class199 arg9, int arg10, int arg11, int arg12, boolean arg13) {
        field2628++;
        long var14 = ((long) arg10 << 48) + ((long) arg0 << 32) + (long) ((arg4 << 16) + (arg5 - -(arg12 << 24)));
        class199 var16 = (class199) class82.field1225.method1830(var14, (byte) 52);
        if (var16 == null) {
            byte var17;
            if (arg5 == 1) {
                var17 = 9;
            } else if (arg5 == 2) {
                var17 = 12;
            } else if (arg5 == 3) {
                var17 = 15;
            } else if (arg5 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            class130 var19 = new class130(var17 * var18 + 1, var18 * 2 * var17 + -var17, 0);
            int var20 = var19.method966(0, 0, 0);
            int[][] var21 = new int[var18][var17];
            int[] var22 = new int[] { 64, 96, 128 };
            for (int var23 = 0; var23 < var18; var23++) {
                int var24 = var22[var23];
                int var25 = var22[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class174.field2731[var27] * var24 + arg11 >> 16;
                    int var29 = arg8 + (class174.field2732[var27] * var25) >> 16;
                    var21[var23][var26] = var19.method966(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var18; var30++) {
                int var31 = (var30 * 256 + 128) / var18;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg4 * var32 + arg12 * var31 >> 8);
                short var34 = (short) (((arg0 & 0x7F) * var32 + (arg10 & 0x7F) * var31 & 0x7F00) + ((arg0 & 0x380) * var32 + (arg10 & 0x380) * var31 & 0x38000) + ((arg0 & 0xFC00) * var32 + (arg10 & 0xFC00) * var31 & 0xFC0000) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var19.method995(var20, var21[0][(var35 + 1) % var17], var21[0][var35], (byte) 1, var34, var33);
                    } else {
                        var19.method995(var21[var30 - 1][var35], var21[var30 - 1][(var35 + 1) % var17], var21[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var19.method995(var21[var30 - 1][var35], var21[var30][(var35 + 1) % var17], var21[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var19.method976(64, 768, -50, -10, -50);
            class82.field1225.method1831(var14, var16, -13897);
        }
        int var36 = arg5 * 64 - 1;
        int var37 = -var36;
        if (arg1 > -37) {
            method1231(-48);
        }
        int var38 = var36;
        int var39 = var36;
        int var40 = arg9.method1109();
        int var41 = arg9.method1107();
        int var42 = -var36;
        int var43 = arg9.method1102();
        if (arg13) {
            if (arg6 > 1152 && arg6 < 1920) {
                var39 = var36 + 128;
            }
            if (arg6 > 640 && arg6 < 1408) {
                var38 = var36 + 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var42 -= 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var37 -= 128;
            }
        }
        int var44 = arg9.method1117();
        if (var43 < var37) {
            var43 = var37;
        }
        if (var39 < var41) {
            var41 = var39;
        }
        if (var44 > var38) {
            var44 = var38;
        }
        class312 var45 = null;
        if (arg3 != null) {
            int var46 = arg3.field4183[arg2];
            var45 = class240.method1702((byte) -98, var46 >> 16);
            arg2 = var46 & 0xFFFF;
        }
        if (var40 < var42) {
            var40 = var42;
        }
        class199 var47;
        if (var45 == null) {
            var47 = var16.method1103(true, true, true);
            var47.method1106((var41 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method1119((var40 + var41) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method1103(!var45.method2154(arg2, -91), !var45.method2156(arg2, -20), true);
            var47.method1106((var41 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method1119((var40 + var41) / 2, 0, (var43 + var44) / 2);
            var47.method1448(var45, arg2);
        }
        if (arg6 != 0) {
            var47.method1134(arg6);
        }
        if (class265.field4126) {
            class171 var48 = (class171) var47;
            if (arg7 != class48.method374(arg8 + var43, arg11 + var40, 88, class41.field734) || arg7 != class48.method374(arg8 + var44, arg11 + var41, 108, class41.field734)) {
                for (int var49 = 0; var49 < var48.field2666; var49++) {
                    var48.field2676[var49] += class48.method374(var48.field2668[var49] + arg8, var48.field2690[var49] + arg11, 126, class41.field734) - arg7;
                }
                var48.field2662.field2985 = false;
                var48.field2696.field3964 = false;
            }
        } else {
            class146 var50 = (class146) var47;
            if (arg7 != class48.method374(arg8 + var43, arg11 + var40, 94, class41.field734) || class48.method374(arg8 + var44, arg11 - -var41, 122, class41.field734) != arg7) {
                for (int var51 = 0; var51 < var50.field2324; var51++) {
                    var50.field2311[var51] += class48.method374(var50.field2316[var51] + arg8, var50.field2304[var51] + arg11, 110, class41.field734) - arg7;
                }
                var50.field2315 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "(I)V", line = 347)
    public static void method1235(int arg0) {
        field2637 = null;
        if (arg0 < 109) {
            method1234(-117, 27, 101, (class269) null, 114, 53, 71, 76, 39, (class199) null, -117, 81, -40, false);
        }
    }
}
