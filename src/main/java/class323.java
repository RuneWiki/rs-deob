import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class323 extends class337 {

    @OriginalMember(owner = "client!nq", name = "H", descriptor = "I")
    private int field4838 = 4;

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
    private int field4832 = 4;

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!nq", name = "E", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!nq", name = "F", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!nq", name = "G", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!nq", name = "I", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "(I)V", line = 8)
    public static final void method2054(int arg0) {
        class128.method936(1);
        ++field4840;
        class39.field531 = null;
        class516.field7505 = null;
        int var1 = 111 % ((52 - arg0) / 59);
        class181.field2717 = null;
        class49.field632 = null;
        class38.field512 = null;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BILhp;)V", line = 23)
    public final void method177(byte arg0, int arg1, class217 arg2) {
        ++field4834;
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field4838 = arg2.method1515((byte) 123);
            }
        } else {
            this.field4832 = arg2.method1515((byte) 125);
        }
        int var5 = -58 % ((arg0 - 82) / 40);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BI)V", line = 57)
    public static final void method2055(byte arg0, int arg1) {
        ++field4835;
        if (arg1 != -1) {
            if (arg0 != -18) {
                method2056(91, true, -117, 65);
            }
            if (class341.field5065[arg1]) {
                class73.field1043.method2562(arg1, (byte) -126);
                class200.field3326[arg1] = null;
                class283.field4301[arg1] = null;
                class341.field5065[arg1] = false;
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)[I", line = 79)
    public final int[] method179(int arg0, byte arg1) {
        ++field4839;
        int[] var3 = super.field5007.method512(arg0, arg1 + 11);
        if (super.field5007.field687) {
            int var4 = class402.field5977 / this.field4832;
            int var5 = class329.field4952 / this.field4838;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method2124(class329.field4952 * var6 / var5, 0, -101);
            } else {
                var7 = this.method2124(0, 0, arg1 + -51);
            }
            for (int var8 = 0; ~class402.field5977 < ~var8; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class402.field5977 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        if (arg1 != -11) {
            this.field4838 = 116;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZII)I", line = 131)
    public static final int method2056(int arg0, boolean arg1, int arg2, int arg3) {
        ++field4837;
        int var4 = arg2 & 3;
        if (!arg1) {
            return -127;
        } else if (var4 == 0) {
            return arg0;
        } else if (~var4 == -2) {
            return arg3;
        } else {
            return var4 == 2 ? -arg0 + 7 : 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V", line = 229)
    public class323() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)[[I", line = 160)
    public final int[][] method673(int arg0, int arg1) {
        ++field4833;
        int[][] var3 = super.field5011.method1410(arg0, 31649);
        int var4 = -12 / ((arg1 - -41) / 49);
        if (super.field5011.field3346) {
            int var5 = class402.field5977 / this.field4832;
            int var6 = class329.field4952 / this.field4838;
            int[][] var8;
            if (~var6 < -1) {
                int var7 = arg0 % var6;
                var8 = this.method2123(class329.field4952 * var7 / var6, 0, -83);
            } else {
                var8 = this.method2123(0, 0, -128);
            }
            int[] var9 = var8[0];
            int[] var10 = var8[1];
            int[] var11 = var8[2];
            int[] var12 = var3[0];
            int[] var13 = var3[1];
            int[] var14 = var3[2];
            for (int var15 = 0; class402.field5977 > var15; ++var15) {
                int var17;
                if (~var5 < -1) {
                    int var16 = var15 % var5;
                    var17 = class402.field5977 * var16 / var5;
                } else {
                    var17 = 0;
                }
                var12[var15] = var9[var17];
                var13[var15] = var10[var17];
                var14[var15] = var11[var17];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BIILkk;IILkk;III)V", line = 232)
    public static final void method2057(byte arg0, int arg1, int arg2, class129 arg3, int arg4, int arg5, class129 arg6, int arg7, int arg8, int arg9) {
        ++field4836;
        int var10 = arg3.method885((byte) -79);
        if (var10 != -1) {
            Object var11 = null;
            class16 var12 = (class16) class485.field6972.method87((long) var10, -2062335807);
            if (arg0 <= 23) {
                method2057((byte) 31, -97, -91, (class129) null, 81, -72, (class129) null, -30, 4, -10);
            }
            if (var12 == null) {
                class84[] var13 = class84.method698(class176.field2627, var10, 0);
                if (var13 == null) {
                    return;
                }
                var12 = class377.field5692.method345(var13[0], true);
                class485.field6972.method84((long) var10, var12, (byte) 27);
            }
            class351.method2180(arg7, arg6.field5833, true, 0, arg6.field5826, arg9 >> 1, arg6.field5837, arg5, arg8 >> 1, 64 * arg6.method953(-77));
            int var14 = arg1 + -18 + class229.field3733[0];
            int var15 = arg4 - 54 + class229.field3733[1] + -16;
            int var16 = arg2 / 4 * 18 + var14;
            int var17 = arg2 % 4 * 18 + var15;
            var12.method132(var16, var17);
            if (arg3 == arg6) {
                class377.field5692.method276(-256, var16 - 1, 1, 18, var17 - 1, 18);
            }
            class112 var18 = class357.method2240(false);
            var18.field1565 = var17;
            var18.field1567 = var16;
            var18.field1570 = var16 + 16;
            var18.field1563 = var17 + 16;
            var18.field1561 = arg3;
            class259.field3974.method1957(-12, var18);
        }
    }
}
