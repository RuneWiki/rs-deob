import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class85 extends class305 {

    @OriginalMember(owner = "client!vp", name = "E", descriptor = "I")
    private int field1383 = 0;

    @OriginalMember(owner = "client!vp", name = "H", descriptor = "I")
    private int field1386 = 1;

    @OriginalMember(owner = "client!vp", name = "J", descriptor = "I")
    private int field1388 = 0;

    @OriginalMember(owner = "client!vp", name = "G", descriptor = "Lhw;")
    public static class396 field1385 = new class396();

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!vp", name = "I", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!vp", name = "K", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V", line = 5)
    public class85() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILfh;B)V", line = 11)
    public final void method14(int arg0, class194 arg1, byte arg2) {
        ++field1389;
        if (arg2 <= 76) {
            this.field1386 = 113;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 3) {
                    this.field1386 = arg1.method1337((byte) -128);
                }
            } else {
                this.field1388 = arg1.method1337((byte) 41);
            }
        } else {
            this.field1383 = arg1.method1337((byte) -122);
        }
    }

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "(B)V", line = 55)
    public static void method761(byte arg0) {
        field1385 = null;
        int var1 = 97 / ((arg0 - 50) / 55);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V", line = 67)
    public final void method17(byte arg0) {
        ++field1384;
        class441.method2728(false);
        if (arg0 != -62) {
            field1385 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)[I", line = 82)
    public final int[] method15(int arg0, int arg1) {
        ++field1387;
        if (arg1 != 4688) {
            this.method17((byte) 73);
        }
        int[] var3 = super.field4677.method2174(arg0, arg1 ^ -4658);
        if (super.field4677.field5040) {
            int var4 = class301.field4614[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; class91.field1471 > var6; ++var6) {
                int var7 = class78.field1298[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (~this.field1383 != -1) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field1386 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field1386;
                }
                int var12 = var11 - (-4096 & var11);
                if (this.field1388 != 0) {
                    if (~this.field1388 == -3) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class417.field6133[255 & var12 >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILpf;III)V", line = 153)
    public static final void method762(int arg0, int arg1, class491 arg2, int arg3, int arg4, int arg5) {
        ++field1382;
        if (arg2.field7172 != -1 || arg2.field7175 != null) {
            int var6 = 0;
            if (~arg2.field7174 <= ~arg5) {
                if (~arg2.field7169 < ~arg5) {
                    var6 += arg2.field7169 - arg5;
                }
            } else {
                var6 += -arg2.field7174 + arg5;
            }
            int var7 = class40.field667.field4222 * arg2.field7178 >> 8;
            if (arg0 <= arg2.field7185) {
                if (arg0 < arg2.field7165) {
                    var6 += -arg0 + arg2.field7165;
                }
            } else {
                var6 += -arg2.field7185 + arg0;
            }
            if (arg2.field7168 != 0 && ~(var6 + -64) >= ~arg2.field7168 && ~class40.field667.field4222 != -1 && ~arg2.field7173 == ~arg1) {
                var6 -= 64;
                if (var6 < 0) {
                    var6 = 0;
                }
                int var8 = (-var6 + arg2.field7168) * var7 / arg2.field7168;
                int var9 = -119 % ((7 - arg3) / 43);
                if (arg2.field7182 != null) {
                    arg2.field7182.method1680(var8);
                } else if (arg2.field7172 >= 0) {
                    class102 var10 = class102.method828(class365.field5379, arg2.field7172, 0);
                    if (var10 != null) {
                        class79 var11 = var10.method825().method706(class411.field6072);
                        class248 var12 = class248.method1672(var11, 100, var8);
                        var12.method1697(-1);
                        class503.field7313.method1807(var12);
                        arg2.field7182 = var12;
                    }
                }
                if (arg2.field7170 == null) {
                    if (arg2.field7175 != null && (arg2.field7176 -= arg4) <= 0) {
                        int var13 = (int) (Math.random() * (double) arg2.field7175.length);
                        class102 var14 = class102.method828(class365.field5379, arg2.field7175[var13], 0);
                        if (var14 != null) {
                            class79 var15 = var14.method825().method706(class411.field6072);
                            class248 var16 = class248.method1672(var15, 100, var8);
                            var16.method1697(0);
                            class503.field7313.method1807(var16);
                            arg2.field7170 = var16;
                            arg2.field7176 = (int) ((double) (-arg2.field7187 + arg2.field7166) * Math.random()) + arg2.field7187;
                            return;
                        }
                    }
                } else {
                    arg2.field7170.method1680(var8);
                    if (arg2.field7170.method949(1767)) {
                        return;
                    }
                    arg2.field7170 = null;
                }
            } else {
                if (arg2.field7182 != null) {
                    class503.field7313.method1802(arg2.field7182);
                    arg2.field7182 = null;
                }
                if (arg2.field7170 != null) {
                    class503.field7313.method1802(arg2.field7170);
                    arg2.field7170 = null;
                }
            }
        }
    }
}
