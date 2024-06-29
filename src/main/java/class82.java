import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class82 extends class192 {

    @OriginalMember(owner = "client!wr", name = "I", descriptor = "I")
    private int field1111 = 10;

    @OriginalMember(owner = "client!wr", name = "K", descriptor = "I")
    private int field1113 = 0;

    @OriginalMember(owner = "client!wr", name = "U", descriptor = "I")
    private int field1123 = 2048;

    @OriginalMember(owner = "client!wr", name = "J", descriptor = "I")
    public static int field1112 = -1;

    @OriginalMember(owner = "client!wr", name = "V", descriptor = "I")
    public static int field1124 = 1338;

    @OriginalMember(owner = "client!wr", name = "O", descriptor = "Lpw;")
    public static class89 field1117 = new class89(3);

    @OriginalMember(owner = "client!wr", name = "L", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!wr", name = "M", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!wr", name = "P", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!wr", name = "Q", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!wr", name = "R", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!wr", name = "S", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!wr", name = "W", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!wr", name = "N", descriptor = "[I")
    private int[] field1116;

    @OriginalMember(owner = "client!wr", name = "T", descriptor = "[I")
    private int[] field1122;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(ZI)V")
    public static final void method635(boolean arg0, int arg1) {
        ++field1114;
        class662.field9210 = 0;
        class642.field8933 = 0;
        class584.method3192(-19295);
        class206.method1327(arg0, -16);
        class505.method2720((byte) 89);
        if (arg1 != -127) {
            field1117 = null;
        }
        boolean var2 = false;
        for (int var3 = 0; ~var3 > ~class662.field9210; ++var3) {
            int var5 = class27.field405[var3];
            class234 var6 = (class234) class505.field6640.method39((long) var5, 31750);
            class532 var7 = var6.field3131;
            if (class594.field8025 && class402.method2293((byte) -128, var5)) {
                class345.method1985((byte) 0);
            }
            if (~class424.field5503 != ~var7.field2994) {
                if (var7.field6914.method3822(true)) {
                    class438.method2488(var7, 22299);
                }
                var7.method2830((byte) -75, (class699) null);
                var6.method2438((byte) 13);
                var2 = true;
            }
        }
        if (var2) {
            class480.field6406 = class505.field6640.method43((byte) 63);
            class505.field6640.method48(27731, class93.field1230);
        }
        if (class88.field1169 != class230.field3069.field5367) {
            throw new RuntimeException("gnp1 pos:" + class230.field3069.field5367 + " psize:" + class88.field1169);
        } else {
            for (int var4 = 0; var4 < class248.field3351; ++var4) {
                if (class505.field6640.method39((long) class40.field558[var4], 31750) == null) {
                    throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class248.field3351);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "(B)V")
    public static void method636(byte arg0) {
        int var1 = -69 / ((60 - arg0) / 58);
        field1117 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IB)[I")
    public final int[] method118(int arg0, byte arg1) {
        ++field1119;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (super.field2448.field7266) {
            int var4 = class221.field2895[arg0];
            if (this.field1113 == 0) {
                short var5 = 0;
                for (int var6 = 0; ~this.field1111 < ~var6; ++var6) {
                    if (this.field1122[var6] <= var4 && this.field1122[var6 - -1] > var4) {
                        if (var4 < this.field1116[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class443.method2511(var3, 0, class561.field7319, var5);
            } else {
                for (int var7 = 0; ~var7 > ~class561.field7319; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class183.field2359[var7];
                    int var11 = this.field1113;
                    if (var11 != 1) {
                        if (~var11 != -3) {
                            if (var11 == 3) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (-4096 - -var4 + var10 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; this.field1111 > var12; ++var12) {
                        if (~this.field1122[var12] >= ~var8 && this.field1122[var12 + 1] > var8) {
                            if (~var8 > ~this.field1116[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        if (arg1 >= -123) {
            method635(true, -32);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V")
    public class82() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILfd;I)V")
    public final void method109(int arg0, class418 arg1, int arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field1113 = arg1.method2396(90);
                }
            } else {
                this.field1123 = arg1.method2393(-30727);
            }
        } else {
            this.field1111 = arg1.method2396(-120);
        }
        ++field1115;
        if (arg2 != -12160) {
            this.method118(-115, (byte) 67);
        }
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)V")
    private final void method637(int arg0) {
        if (arg0 <= 30) {
            this.method109(21, (class418) null, 79);
        }
        ++field1125;
        this.field1122 = new int[this.field1111 + 1];
        this.field1116 = new int[this.field1111 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field1111;
        int var4 = this.field1123 * var3 >> 12;
        for (int var5 = 0; var5 < this.field1111; ++var5) {
            this.field1122[var5] = var2;
            this.field1116[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1122[this.field1111] = 4096;
        this.field1116[this.field1111] = this.field1116[0] + 4096;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z[Ljava/lang/String;[S)V")
    public static final void method638(boolean arg0, String[] arg1, short[] arg2) {
        ++field1121;
        if (arg0) {
            method636((byte) -57);
        }
        class662.method3629(arg1.length - 1, arg2, 0, arg1, -14);
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(B)V")
    public final void method618(byte arg0) {
        if (arg0 == 63) {
            this.method637(73);
            ++field1118;
        }
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(III)I")
    public static final int method639(int arg0, int arg1, int arg2) {
        ++field1120;
        int var3 = (127 & arg1) * arg2 >> 7;
        if (arg0 != 3626) {
            method635(true, 42);
        }
        if (var3 >= 2) {
            if (~var3 < -127) {
                var3 = 126;
            }
        } else {
            var3 = 2;
        }
        return (65408 & arg1) + var3;
    }
}
