import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class9 extends class177 {

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "[I")
    public static int[] field123 = new int[256];

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
    public static volatile int field118 = -1;

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "B")
    public byte field114;

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!gf", name = "S", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!gf", name = "V", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!gf", name = "W", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!gf", name = "U", descriptor = "Lp;")
    public class107 field127;

    @OriginalMember(owner = "client!gf", name = "X", descriptor = "Llc;")
    public static class175 field130;

    @OriginalMember(owner = "client!gf", name = "Y", descriptor = "Ltk;")
    public static class265 field131;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(II)I", line = 6)
    public static final int method39(int arg0, int arg1) {
        field119++;
        if (arg1 != 0) {
            method42(61, -64, 44);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILfc;IIII)Z", line = 17)
    public static final boolean method40(int arg0, int arg1, class238 arg2, int arg3, int arg4, int arg5, int arg6) {
        field124++;
        class53 var7 = class293.method2083(arg2.field3545, -127);
        if (var7.field650 == -1) {
            return true;
        }
        int var8;
        if (arg2.field3505) {
            int var9 = arg2.field3524 + arg0;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        class234 var10 = var7.method322((byte) 114, var8, arg2.field3508);
        if (var10 == null) {
            return false;
        } else if (arg5 == 4) {
            int var11 = arg2.field3489;
            int var12 = arg2.field3532;
            int var13 = var10.field4741;
            if ((var8 & 0x1) == 1) {
                var11 = arg2.field3532;
                var12 = arg2.field3489;
            }
            int var14 = var10.field4744;
            if (var7.field643) {
                var14 = var12 * 4;
                var13 = var11 * 4;
            }
            if (var7.field641 == 0) {
                var10.method1648(arg3 * 4 + 48, (-var12 + 104 + -arg1) * 4 + 48, var13, var14);
            } else {
                var10.method1658(arg3 * 4 + 48, (-var12 + 104 + -arg1) * 4 + 48, var13, var14, var7.field641);
            }
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)I", line = 75)
    public final int method41(int arg0) {
        field116++;
        if (this.field127 == null) {
            return 0;
        } else if (arg0 < 86) {
            return 103;
        } else {
            return this.field127.field1400 * 100 / (this.field127.field1388.length - this.field114);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)I", line = 90)
    public static final int method42(int arg0, int arg1, int arg2) {
        field129++;
        int var3 = class76.method455(true, 4, arg0 + 45365, arg1 + 91923) + (class76.method455(true, 2, arg0 + 10294, arg1 + 37821) - 128 >> 1) + (class76.method455(true, 1, arg0, arg1) - 128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return arg2 == -306674912 ? var4 : 8;
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(II)Z", line = 112)
    public static final boolean method43(int arg0, int arg1) {
        field122++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class30.field371[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 1002) {
            return true;
        } else {
            int var3 = -98 / ((40 - arg1) / 54);
            return false;
        }
    }

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "(I)V", line = 137)
    public static final void method44(int arg0) {
        field120++;
        class305.field4734 = null;
        class299.field4669 = null;
        if (arg0 <= 33) {
            field123 = (int[]) null;
        }
        class58.field705 = null;
    }

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)[B", line = 151)
    public final byte[] method45(int arg0) {
        if (arg0 <= 109) {
            field130 = (class175) null;
        }
        field121++;
        if (this.field2578 || this.field127.field1400 < (this.field127.field1388.length - this.field114)) {
            throw new RuntimeException();
        }
        return this.field127.field1388;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V", line = 170)
    public static void method46(byte arg0) {
        field123 = null;
        field130 = null;
        if (arg0 != -77) {
            field130 = (class175) null;
        }
        field131 = null;
    }

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "(I)Lp;", line = 186)
    public static final class107 method47(int arg0) {
        field125++;
        class107 var1 = new class107(34);
        var1.method648(11, (byte) 38);
        var1.method648(class165.field2289, (byte) 38);
        var1.method648(class10.field136 ? 1 : 0, (byte) 38);
        var1.method648(class238.field3539 ? 1 : 0, (byte) 38);
        var1.method648(class90.field1124 ? 1 : 0, (byte) 38);
        if (arg0 != -10294) {
            method44(61);
        }
        var1.method648(class117.field1661 ? 1 : 0, (byte) 38);
        var1.method648(class240.field3616 ? 1 : 0, (byte) 38);
        var1.method648(class321.field4926 ? 1 : 0, (byte) 38);
        var1.method648(class229.field3332 ? 1 : 0, (byte) 38);
        var1.method648(class272.field4269 ? 1 : 0, (byte) 38);
        var1.method648(class345.field5352, (byte) 38);
        var1.method648(class162.field2241 ? 1 : 0, (byte) 38);
        var1.method648(class172.field2481 ? 1 : 0, (byte) 38);
        var1.method648(class177.field2567 ? 1 : 0, (byte) 38);
        var1.method648(class285.field4465, (byte) 38);
        var1.method648(class54.field668 ? 1 : 0, (byte) 38);
        var1.method648(class259.field3934, (byte) 38);
        var1.method648(class225.field3192, (byte) 38);
        var1.method648(class261.field3947, (byte) 38);
        var1.method662(true, class235.field3416);
        var1.method662(true, class154.field2127);
        var1.method648(class274.method1976(), (byte) 38);
        var1.method641(arg0 ^ 0x964F3B92, class337.field5215);
        var1.method648(class191.field2746, (byte) 38);
        var1.method648(class305.field4732 ? 1 : 0, (byte) 38);
        var1.method648(class258.field3925 ? 1 : 0, (byte) 38);
        var1.method648(class163.field2260, (byte) 38);
        var1.method648(class308.field4759 ? 1 : 0, (byte) 38);
        var1.method648(class296.field4614 ? 1 : 0, (byte) 38);
        return var1;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field123[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(BI)V", line = 237)
    public static final void method48(byte arg0, int arg1) {
        if (arg0 == -73) {
            field117++;
            class96 var2 = class141.method935(arg1, 3, 111);
            var2.method582(-1);
        }
    }
}
