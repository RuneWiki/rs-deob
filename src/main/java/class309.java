import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class309 {

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    private int field4564 = 128;

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "B")
    public byte field4574 = 0;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public int field4566 = -1;

    @OriginalMember(owner = "client!cs", name = "w", descriptor = "I")
    private int field4585 = 0;

    @OriginalMember(owner = "client!cs", name = "v", descriptor = "Z")
    public boolean field4584 = false;

    @OriginalMember(owner = "client!cs", name = "A", descriptor = "I")
    private int field4589 = 0;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
    private int field4575 = 128;

    @OriginalMember(owner = "client!cs", name = "p", descriptor = "I")
    private int field4578 = -1;

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
    private int field4583 = 0;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    private int field4570;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!cs", name = "o", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!cs", name = "q", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!cs", name = "s", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!cs", name = "x", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "I")
    public int field4588;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "Lkw;")
    public class223 field4569;

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "Lpu;")
    public static class522 field4580;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "[S")
    private short[] field4565;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "[S")
    private short[] field4572;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "[S")
    private short[] field4576;

    @OriginalMember(owner = "client!cs", name = "y", descriptor = "[S")
    private short[] field4587;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IZILvb;Lvb;)I", line = 5)
    public static final int method1963(int arg0, boolean arg1, int arg2, class178 arg3, class178 arg4) {
        field4567++;
        if (arg2 == 1) {
            int var5 = arg4.field2928;
            int var6 = arg3.field2928;
            if (!arg1) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class278.method1816(arg4.method1208(arg0 - 93).field5434, class512.field7203, 12, arg3.method1208(arg0 - 56).field5434);
        } else if (arg2 == 3) {
            if (arg4.field2539.equals("-")) {
                if (arg3.field2539.equals("-")) {
                    return 0;
                } else if (arg1) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field2539.equals("-")) {
                return arg1 ? 1 : -1;
            } else {
                return class278.method1816(arg4.field2539, class512.field7203, 12, arg3.field2539);
            }
        } else if (arg2 == 4) {
            if (arg4.method1378(false)) {
                return arg3.method1378(false) ? 0 : 1;
            } else if (arg3.method1378(false)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 5) {
            if (arg4.method1376((byte) 110)) {
                return arg3.method1376((byte) 117) ? 0 : 1;
            } else if (arg3.method1376((byte) 96)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 != 6) {
            if (arg0 != 0) {
                method1966(10, 56, -73);
            }
            if (arg2 == 7) {
                if (arg4.method1379((byte) 127)) {
                    return arg3.method1379((byte) 114) ? 0 : 1;
                } else if (arg3.method1379((byte) 114)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg2 == 8) {
                int var7 = arg4.field2540;
                int var8 = arg3.field2540;
                if (arg1) {
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                } else {
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg4.field2535 - arg3.field2535;
            }
        } else if (arg4.method1375(-1)) {
            return arg3.method1375(arg0 - 1) ? 0 : 1;
        } else if (arg3.method1375(-1)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILln;BIILr;I)Lda;", line = 109)
    public final class55 method1964(int arg0, class344 arg1, byte arg2, int arg3, int arg4, class166 arg5, int arg6) {
        int var8 = 37 / ((38 - arg2) / 41);
        field4571++;
        return this.method1965(0, arg3, 0, null, null, arg1, arg5, -1, false, arg0, (byte) 5, arg6, 0, arg4);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIILi;Li;Lln;Lr;IZIBIII)Lda;", line = 119)
    private final class55 method1965(int arg0, int arg1, int arg2, class37 arg3, class37 arg4, class344 arg5, class166 arg6, int arg7, boolean arg8, int arg9, byte arg10, int arg11, int arg12, int arg13) {
        field4579++;
        int var15 = arg1;
        class30 var16 = this.field4566 == -1 || arg13 == -1 ? null : arg5.method2140(this.field4566, 125);
        boolean var17 = arg8 & this.field4574 != 0;
        if (var16 != null) {
            var15 = arg1 | var16.method344(false, arg9, -42, arg13);
        }
        if (var17) {
            var15 |= this.field4574 == 3 ? 7 : 2;
        }
        if (this.field4575 != 128) {
            var15 |= 0x2;
        }
        if (this.field4564 != 128 || this.field4589 != 0) {
            var15 |= 0x5;
        }
        class382 var18 = this.field4569.field3148;
        class55 var19;
        synchronized (this.field4569.field3148) {
            var19 = (class55) this.field4569.field3148.method2287(1, (long) (this.field4588 |= arg6.field2374 << 29));
        }
        if (var19 == null || arg6.method172(var19.method517(), var15) != 0) {
            if (var19 != null) {
                var15 = arg6.method160(var15, var19.method517());
            }
            int var20 = var15;
            if (this.field4565 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field4576 != null) {
                var20 |= 0x8000;
            }
            class461 var21 = class24.method284(this.field4570, (byte) 89, 0, this.field4569.field3141);
            if (var21 == null) {
                return null;
            }
            if (var21.field6623 < 13) {
                var21.method2712(arg7 ^ 0xFFFF9F2C, 2);
            }
            var19 = arg6.method171(var21, var20, this.field4569.field3150, this.field4583 + 64, this.field4585 + 850);
            if (this.field4565 != null) {
                for (int var22 = 0; var22 < this.field4565.length; var22++) {
                    var19.method500(this.field4565[var22], this.field4572[var22]);
                }
            }
            if (this.field4576 != null) {
                for (int var23 = 0; var23 < this.field4576.length; var23++) {
                    var19.method527(this.field4576[var23], this.field4587[var23]);
                }
            }
            var19.method536(var15);
            class382 var24 = this.field4569.field3148;
            synchronized (this.field4569.field3148) {
                this.field4569.field3148.method2291(var19, (long) (this.field4588 |= arg6.field2374 << 29), arg7 + 2);
            }
        }
        class55 var25 = var16 == null ? var19.method532(arg10, var15, true) : var16.method342(~arg7, var15, arg13, arg11, 0, arg9, var19, arg10);
        if (this.field4564 != 128 || this.field4575 != 128) {
            var25.method499(this.field4564, this.field4575, this.field4564);
        }
        if (~this.field4589 != arg7) {
            if (this.field4589 == 90) {
                var25.method540(4096);
            }
            if (this.field4589 == 180) {
                var25.method540(8192);
            }
            if (this.field4589 == 270) {
                var25.method540(12288);
            }
        }
        if (var17) {
            var25.method523(this.field4574, this.field4578, arg3, arg4, arg0, arg12, arg2);
        }
        var25.method536(arg1);
        return var25;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)Z", line = 252)
    public static final boolean method1966(int arg0, int arg1, int arg2) {
        field4573++;
        return arg1 == -8614 ? (class683.method3779(arg2, 111, arg0) | class185.method1237(arg2, arg0, 1027) | class633.method3530(arg0, (byte) -76, arg2)) & class203.method1352(arg2, arg0, 0) : false;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILln;ILr;IIB)Lda;", line = 268)
    public final class55 method1967(int arg0, class344 arg1, int arg2, class166 arg3, int arg4, int arg5, byte arg6) {
        field4586++;
        int var8 = 60 % ((arg6 + 34) / 59);
        return this.method1965(0, arg4, 0, null, null, arg1, arg3, -1, false, arg5, (byte) 2, arg0, 0, arg2);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZLmo;I)V", line = 280)
    private final void method1968(boolean arg0, class695 arg1, int arg2) {
        if (arg2 == 1) {
            this.field4570 = arg1.method3847((byte) 118);
        } else if (arg2 == 2) {
            this.field4566 = arg1.method3847((byte) 118);
        } else if (arg2 == 4) {
            this.field4564 = arg1.method3847((byte) 118);
        } else if (arg2 == 5) {
            this.field4575 = arg1.method3847((byte) 118);
        } else if (arg2 == 6) {
            this.field4589 = arg1.method3847((byte) 118);
        } else if (arg2 == 7) {
            this.field4583 = arg1.method3826(false);
        } else if (arg2 == 8) {
            this.field4585 = arg1.method3826(false);
        } else if (arg2 == 9) {
            this.field4574 = 3;
            this.field4578 = 8224;
        } else if (arg2 == 10) {
            this.field4584 = true;
        } else if (arg2 == 11) {
            this.field4574 = 1;
        } else if (arg2 == 12) {
            this.field4574 = 4;
        } else if (arg2 == 13) {
            this.field4574 = 5;
        } else if (arg2 == 14) {
            this.field4574 = 2;
            this.field4578 = arg1.method3826(false) * 256;
        } else if (arg2 == 15) {
            this.field4574 = 3;
            this.field4578 = arg1.method3847((byte) 118);
        } else if (arg2 == 16) {
            this.field4574 = 3;
            this.field4578 = arg1.method3880(8);
        } else if (arg2 == 40) {
            int var4 = arg1.method3826(false);
            this.field4572 = new short[var4];
            this.field4565 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4565[var5] = (short) arg1.method3847((byte) 118);
                this.field4572[var5] = (short) arg1.method3847((byte) 118);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method3826(!arg0);
            this.field4587 = new short[var6];
            this.field4576 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4576[var7] = (short) arg1.method3847((byte) 118);
                this.field4587[var7] = (short) arg1.method3847((byte) 118);
            }
        }
        if (!arg0) {
            method1971(-57);
        }
        field4577++;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIILvq;ILvq;III)V", line = 402)
    public static final void method1969(int arg0, int arg1, int arg2, int arg3, class425 arg4, int arg5, class425 arg6, int arg7, int arg8, int arg9) {
        field4563++;
        int var10 = arg6.method2560(-1);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class702 var12 = (class702) class591.field8282.method2287(1, (long) var10);
        if (var12 == null) {
            class113[] var13 = class113.method884(class703.field9909, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class282.field4228.method138(var13[0], true);
            class591.field8282.method2291(var12, (long) var10, 1);
        }
        class201.method1336(arg2 >> 1, arg4.field3029, arg7 >> 1, 0, arg5, arg9, -513, arg4.field3024, arg4.field3019, arg4.method2553((byte) 96) * 256);
        int var14 = class287.field4269[0] + arg0 - 18;
        int var15 = arg1 / 4 * 18 + var14;
        int var16 = arg3 - (-class287.field4269[1] - -54) - 16;
        if (arg8 >= -49) {
            method1969(-104, -81, -55, -113, null, 39, null, -19, 34, -86);
        }
        int var17 = arg1 % 4 * 18 + var16;
        var12.method3916(var15, var17);
        if (arg4 == arg6) {
            class282.field4228.method1149(18, -4, -256, var17 - 1, 18, var15 - 1);
        }
        class408 var18 = class499.method2884((byte) -66);
        var18.field5962 = var17;
        var18.field5960 = var15 + 16;
        var18.field5959 = arg6;
        var18.field5956 = var15;
        var18.field5957 = var17 + 16;
        class590.field8270.method2413(var18, (byte) 102);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lmo;I)V", line = 454)
    public final void method1970(class695 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3826(false);
            if (var3 == 0) {
                if (arg1 != 0) {
                    this.field4569 = null;
                }
                field4568++;
                return;
            }
            this.method1968(true, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V", line = 482)
    public static void method1971(int arg0) {
        int var1 = -77 / ((arg0 - 50) / 35);
        field4580 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIILi;ILr;ZIBIILi;Lln;)Lda;", line = 491)
    public final class55 method1972(int arg0, int arg1, int arg2, class37 arg3, int arg4, class166 arg5, boolean arg6, int arg7, byte arg8, int arg9, int arg10, class37 arg11, class344 arg12) {
        field4582++;
        return arg8 == -116 ? this.method1965(arg10, arg0, arg9, arg11, arg3, arg12, arg5, -1, arg6, arg2, (byte) 2, arg7, arg1, arg4) : null;
    }
}
