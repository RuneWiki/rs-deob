import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class448 extends class115 {

    @OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
    private int field6526 = 1024;

    @OriginalMember(owner = "client!lr", name = "U", descriptor = "I")
    private int field6533 = 81;

    @OriginalMember(owner = "client!lr", name = "bb", descriptor = "I")
    private int field6540 = 204;

    @OriginalMember(owner = "client!lr", name = "X", descriptor = "I")
    private int field6536 = 4;

    @OriginalMember(owner = "client!lr", name = "V", descriptor = "I")
    private int field6534 = 0;

    @OriginalMember(owner = "client!lr", name = "R", descriptor = "I")
    private int field6530 = 1024;

    @OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
    private int field6523 = 8;

    @OriginalMember(owner = "client!lr", name = "P", descriptor = "I")
    private int field6528 = 409;

    @OriginalMember(owner = "client!lr", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field6539 = "flash1:";

    @OriginalMember(owner = "client!lr", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field6541 = "Please remove ";

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!lr", name = "N", descriptor = "I")
    private int field6527;

    @OriginalMember(owner = "client!lr", name = "Q", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!lr", name = "S", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!lr", name = "T", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!lr", name = "W", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!lr", name = "Y", descriptor = "I")
    private int field6537;

    @OriginalMember(owner = "client!lr", name = "db", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!lr", name = "eb", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!lr", name = "fb", descriptor = "I")
    private int field6544;

    @OriginalMember(owner = "client!lr", name = "hb", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!lr", name = "gb", descriptor = "[I")
    private int[] field6545;

    @OriginalMember(owner = "client!lr", name = "L", descriptor = "[[I")
    private int[][] field6525;

    @OriginalMember(owner = "client!lr", name = "Z", descriptor = "[[I")
    private int[][] field6538;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIZIIIIII)V", line = 4)
    public static final void method2778(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field6543;
        class219 var10 = null;
        for (class219 var11 = (class219) class327.field4643.method1124(-1); var11 != null; var11 = (class219) class327.field4643.method1119(false)) {
            if (~var11.field2998 == ~arg1 && ~var11.field3005 == ~arg0 && var11.field2995 == arg5 && var11.field3000 == arg6) {
                var10 = var11;
                break;
            }
        }
        if (arg3) {
            method2781(-92, -47);
        }
        if (var10 == null) {
            var10 = new class219();
            var10.field2998 = arg1;
            var10.field3005 = arg0;
            var10.field2995 = arg5;
            var10.field3000 = arg6;
            client.method1070(var10, (byte) 99);
            class327.field4643.method1125(-1, var10);
        }
        var10.field3004 = arg2;
        var10.field2994 = arg7;
        var10.field2996 = arg8;
        var10.field3003 = arg4;
        var10.field3011 = arg9;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V", line = 46)
    private final void method2779(boolean arg0) {
        ++field6532;
        if (arg0) {
            Random var2 = new Random((long) this.field6523);
            this.field6527 = 4096 / this.field6523;
            this.field6537 = 4096 / this.field6536;
            this.field6544 = this.field6533 / 2;
            int var3 = this.field6537 / 2;
            this.field6525 = new int[this.field6523][this.field6536 + 1];
            this.field6538 = new int[this.field6523][this.field6536];
            this.field6545 = new int[this.field6523 - -1];
            int var4 = this.field6527 / 2;
            this.field6545[0] = 0;
            for (int var5 = 0; ~this.field6523 < ~var5; ++var5) {
                if (~var5 < -1) {
                    int var6 = this.field6527;
                    int var7 = (class239.method1529(4096, (byte) -96, var2) - 2048) * this.field6540 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field6545[var5] = this.field6545[var5 + -1] + var8;
                }
                this.field6525[var5][0] = 0;
                for (int var9 = 0; ~this.field6536 < ~var9; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field6537;
                        int var11 = (-2048 + class239.method1529(4096, (byte) -96, var2)) * this.field6528 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field6525[var5][var9] = this.field6525[var5][var9 - 1] + var12;
                    }
                    this.field6538[var5][var9] = this.field6526 <= 0 ? 4096 : -class239.method1529(this.field6526, (byte) -96, var2) + 4096;
                }
                this.field6525[var5][this.field6536] = 4096;
            }
            this.field6545[this.field6523] = 4096;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BLbk;I)V", line = 112)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 != 6) {
                                    if (~arg2 == -8) {
                                        this.field6526 = arg1.method1355(32136);
                                    }
                                } else {
                                    this.field6533 = arg1.method1355(32136);
                                }
                            } else {
                                this.field6534 = arg1.method1355(32136);
                            }
                        } else {
                            this.field6530 = arg1.method1355(32136);
                        }
                    } else {
                        this.field6540 = arg1.method1355(32136);
                    }
                } else {
                    this.field6528 = arg1.method1355(32136);
                }
            } else {
                this.field6523 = arg1.method1342((byte) -128);
            }
        } else {
            this.field6536 = arg1.method1342((byte) -126);
        }
        ++field6531;
        if (arg0 < 83) {
            field6541 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(Z)V", line = 199)
    public static final void method2780(boolean arg0) {
        if (!arg0) {
            field6539 = null;
        }
        class433.field6324 = 0;
        ++field6535;
        class32.field301.method1116((byte) 3);
        class32.field301.method1125(-1, class233.field3142);
        ++class433.field6324;
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(II)V", line = 215)
    public static final void method2781(int arg0, int arg1) {
        ++field6542;
        class379 var2 = class343.field5050;
        synchronized (class343.field5050) {
            if (arg1 == 1) {
                class109.field1254 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V", line = 272)
    public class448() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "(I)V", line = 237)
    public static void method2782(int arg0) {
        field6541 = null;
        field6539 = null;
        if (arg0 < 75) {
            field6539 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V", line = 260)
    public final void method140(int arg0) {
        this.method2779(true);
        ++field6529;
        if (arg0 != 0) {
            method2780(true);
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(II)[I", line = 291)
    public final int[] method57(int arg0, int arg1) {
        ++field6524;
        if (arg1 != 0) {
            this.field6536 = 1;
        }
        int[] var3 = super.field1340.method14(arg1 + 54, arg0);
        if (super.field1340.field35) {
            int var4 = 0;
            int var5;
            for (var5 = class193.field2634[arg0] + this.field6534; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~this.field6523 < ~var4 && ~this.field6545[var4] >= ~var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (var4 & 1) == 0;
            int var8 = this.field6545[var4];
            int var9 = this.field6545[var4 - 1];
            if (~(var9 - -this.field6544) > ~var5 && var8 - this.field6544 > var5) {
                for (int var10 = 0; var10 < class218.field2979; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field6530 : this.field6530;
                    int var13;
                    for (var13 = (this.field6537 * var12 >> 12) + class43.field530[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~this.field6536 < ~var11 && this.field6525[var6][var11] <= var13) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field6525[var6][var14];
                    int var16 = this.field6525[var6][var11];
                    if (this.field6544 + var15 < var13 && ~var13 > ~(-this.field6544 + var16)) {
                        var3[var10] = this.field6538[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class408.method2569(var3, 0, class218.field2979, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(Z)V", line = 397)
    public static final void method2783(boolean arg0) {
        ++field6546;
        int var1 = 0;
        if (arg0) {
            while (var1 < 5) {
                class8.field105[var1] = false;
                ++var1;
            }
            class215.field2924 = class272.field3852;
            class75.field832 = -1;
            class26.field256 = 0;
            class436.field6389 = class314.field4472;
            class180.field2474 = 0;
            class344.field5057 = class221.field3033;
            class50.field574 = class77.field869;
            class66.field742 = class272.field3853;
            class290.field4141 = -1;
            class231.field3128 = 5;
            class7.field84 = class164.field2289;
        }
    }
}
