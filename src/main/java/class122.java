import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class122 extends class502 {

    @OriginalMember(owner = "client!ov", name = "y", descriptor = "[I")
    private int[] field1984 = new int[this.field7400];

    @OriginalMember(owner = "client!ov", name = "x", descriptor = "J")
    public static volatile long field1983 = 0L;

    @OriginalMember(owner = "client!ov", name = "u", descriptor = "Lrn;")
    public static class174 field1980 = new class174(62, 8);

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!ov", name = "r", descriptor = "I")
    private int field1977;

    @OriginalMember(owner = "client!ov", name = "t", descriptor = "I")
    private int field1979;

    @OriginalMember(owner = "client!ov", name = "v", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!ov", name = "w", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!ov", name = "A", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!ov", name = "B", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!ov", name = "C", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!ov", name = "E", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ov", name = "F", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!ov", name = "s", descriptor = "[B")
    private byte[] field1978;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V", line = 7)
    public static void method940(byte arg0) {
        int var1 = 81 / ((arg0 - -37) / 46);
        field1980 = null;
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)V", line = 18)
    public final void method447(int arg0) {
        this.field1979 = 0;
        ++field1988;
        this.field1977 = 0;
        if (arg0 != 4) {
            method944((byte) 38, 6);
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(BII)V", line = 31)
    public void method941(byte arg0, int arg1, int arg2) {
        ++field1987;
        if (arg2 != -29644) {
            this.field1979 = -62;
        }
        this.field1978[this.field1977++] = (byte) (class207.method1405(arg0 >> 1, 127) + 127);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIIIIII)V", line = 43)
    public static final void method942(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1986;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = -arg1 + arg0;
        int var12 = arg2 - arg1;
        int var13 = arg0 * arg0;
        if (arg3 != -6867) {
            method943(true);
        }
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = -((var21 + -1) * var18) + var14;
        int var25 = (-var22 + 1) * var15 - -var19;
        int var26 = var16 - (var22 + -1) * var20;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 + -3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 + -1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (~arg6 <= ~class70.field1213 && ~arg6 >= ~class389.field5859) {
            int[] var39 = class21.field430[arg6];
            int var40 = class9.method50(class315.field4754, -arg0 + arg7, class156.field2455, true);
            int var41 = class9.method50(class315.field4754, arg0 + arg7, class156.field2455, true);
            int var42 = class9.method50(class315.field4754, -var11 + arg7, class156.field2455, true);
            int var43 = class9.method50(class315.field4754, arg7 + var11, class156.field2455, true);
            class179.method1269(var39, arg5, var40, var42, arg3 ^ -29628);
            class179.method1269(var39, arg4, var42, var43, arg3 + 33852);
            class179.method1269(var39, arg5, var43, var41, 26985);
        }
        while (var9 > 0) {
            boolean var44 = ~var9 >= ~var12;
            if (~var23 > -1) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var31 += var28;
                    var35 += var28;
                    ++var8;
                }
            }
            if (var44) {
                if (~var25 > -1) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var37 += var30;
                        ++var10;
                    }
                }
                if (~var26 > -1) {
                    var25 += var33;
                    var26 += var37;
                    ++var10;
                    var33 += var30;
                    var37 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (~var24 > -1) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var31 += var28;
                ++var8;
            }
            var23 += -var36;
            var24 += -var32;
            var32 -= var27;
            var36 -= var27;
            --var9;
            int var45 = -var9 + arg6;
            int var46 = arg6 + var9;
            if (class70.field1213 <= var46 && ~var45 >= ~class389.field5859) {
                int var47 = class9.method50(class315.field4754, arg7 + var8, class156.field2455, true);
                int var48 = class9.method50(class315.field4754, -var8 + arg7, class156.field2455, true);
                if (var44) {
                    int var49 = class9.method50(class315.field4754, arg7 + var10, class156.field2455, true);
                    int var50 = class9.method50(class315.field4754, arg7 - var10, class156.field2455, true);
                    if (~var45 <= ~class70.field1213) {
                        int[] var51 = class21.field430[var45];
                        class179.method1269(var51, arg5, var48, var50, 26985);
                        class179.method1269(var51, arg4, var50, var49, 26985);
                        class179.method1269(var51, arg5, var49, var47, 26985);
                    }
                    if (~var46 >= ~class389.field5859) {
                        int[] var52 = class21.field430[var46];
                        class179.method1269(var52, arg5, var48, var50, arg3 ^ -29628);
                        class179.method1269(var52, arg4, var50, var49, 26985);
                        class179.method1269(var52, arg5, var49, var47, 26985);
                    }
                } else {
                    if (var45 >= class70.field1213) {
                        class179.method1269(class21.field430[var45], arg5, var48, var47, 26985);
                    }
                    if (class389.field5859 >= var46) {
                        class179.method1269(class21.field430[var46], arg5, var48, var47, 26985);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "(I)V", line = 248)
    public final void method450(int arg0) {
        if (arg0 != -1) {
            method942(-59, -7, -82, -107, -83, 27, 51, 72);
        }
        this.field1979 = Math.abs(this.field1979);
        ++field1985;
        if (this.field1979 >= 4096) {
            this.field1979 = 4095;
        }
        this.method941((byte) (this.field1979 >> 4), this.field1977++, -29644);
        this.field1979 = 0;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(III)V", line = 267)
    public final void method444(int arg0, int arg1, int arg2) {
        if (arg2 < 15) {
            this.field1979 = -14;
        }
        this.field1979 += this.field1984[arg0] * arg1 >> 12;
        ++field1981;
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(Z)V", line = 278)
    public static final void method943(boolean arg0) {
        ++field1989;
        if (arg0) {
            field1983 = -47L;
        }
        class22.field438 = new class350[class390.field5913.method138(arg0)][];
        class388.field5835 = new class350[class390.field5913.method138(false)][];
        class373.field5662 = new boolean[class390.field5913.method138(false)];
    }

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(BI)V", line = 292)
    public static final void method944(byte arg0, int arg1) {
        class237.field3433 = arg1;
        ++field1976;
        class283.field4047.method488(-3);
        int var2 = 64 / ((arg0 - -72) / 50);
    }

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(IIIIIF)V", line = 305)
    public class122(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field7400; ++var7) {
            this.field1984[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }
}
