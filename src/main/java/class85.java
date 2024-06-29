import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class85 extends class182 {

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
    private int field1468 = 409;

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
    private int field1469 = 4096;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
    private int field1472 = 4096;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
    private int field1467 = 4096;

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "[I")
    private int[] field1464 = new int[3];

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "Ll;")
    public static class328 field1465 = new class328(16);

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "[Lt;")
    public static class281[] field1473;

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V", line = 3)
    public class85() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V", line = 17)
    public static final void method648(byte arg0) {
        int var1 = 121 / ((arg0 - 45) / 46);
        class180.field2960 = null;
        field1474++;
        class144.field2423 = -1;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)[[I", line = 36)
    public final int[][] method122(int arg0, int arg1) {
        field1471++;
        if (arg1 != 4944) {
            method648((byte) -30);
        }
        int[][] var3 = this.field3152.method1953(arg0, 122);
        if (this.field3152.field4493) {
            int[][] var4 = this.method1291(arg0, (byte) 77, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class26.field672; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field1464[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field1468 < var13) {
                    var8[var11] = var12;
                    var10[var11] = var6[var11];
                    var9[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field1464[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 <= this.field1468) {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field1464[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 > this.field1468) {
                            var8[var11] = var12;
                            var10[var11] = var14;
                            var9[var11] = var16;
                        } else {
                            var8[var11] = this.field1469 * var12 >> 12;
                            var10[var11] = this.field1472 * var14 >> 12;
                            var9[var11] = this.field1467 * var16 >> 12;
                        }
                    } else {
                        var8[var11] = var12;
                        var10[var11] = var14;
                        var9[var11] = var7[var11];
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Loe;IB)V", line = 129)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        field1470++;
        if (arg1 == 0) {
            this.field1468 = arg0.method989(115);
        } else if (arg1 == 1) {
            this.field1467 = arg0.method989(arg2 ^ 0x6F);
        } else if (arg1 == 2) {
            this.field1472 = arg0.method989(64);
        } else if (arg1 == 3) {
            this.field1469 = arg0.method989(105);
        } else if (arg1 == 4) {
            int var5 = arg0.method1025((byte) -56);
            this.field1464[0] = class83.method613(var5, 16711680) << 4;
            this.field1464[2] = class83.method613(0, var5 >> 12);
            this.field1464[1] = class83.method613(65280, var5) >> 4;
        }
        if (arg2 != 60) {
            method649((class181) null, -87, 108, -111);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lg;III)V", line = 195)
    public static final void method649(class181 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 2) {
            return;
        }
        if (arg0.field3077 == 0) {
            arg0.field3125 = arg0.field3136;
        } else if (arg0.field3077 == 1) {
            arg0.field3125 = (arg2 - arg0.field3024) / 2 + arg0.field3136;
        } else if (arg0.field3077 == 2) {
            arg0.field3125 = arg2 - arg0.field3136 - arg0.field3024;
        } else if (arg0.field3077 == 3) {
            arg0.field3125 = arg0.field3136 * arg2 >> 14;
        } else if (arg0.field3077 == 4) {
            arg0.field3125 = (arg0.field3136 * arg2 >> 14) + (arg2 - arg0.field3024) / 2;
        } else {
            arg0.field3125 = arg2 - (arg0.field3136 * arg2 >> 14) - arg0.field3024;
        }
        if (arg0.field3008 == 0) {
            arg0.field3011 = arg0.field2987;
        } else if (arg0.field3008 == 1) {
            arg0.field3011 = (arg3 - arg0.field2972) / 2 + arg0.field2987;
        } else if (arg0.field3008 == 2) {
            arg0.field3011 = arg3 - arg0.field2972 - arg0.field2987;
        } else if (arg0.field3008 == 3) {
            arg0.field3011 = arg0.field2987 * arg3 >> 14;
        } else if (arg0.field3008 == 4) {
            arg0.field3011 = (arg3 - arg0.field2972) / 2 + (arg0.field2987 * arg3 >> 14);
        } else {
            arg0.field3011 = arg3 - arg0.field2972 - (arg0.field2987 * arg3 >> 14);
        }
        if (class323.field5230 && (client.method1990(arg0).field5380 != 0 || arg0.field3098 == 0)) {
            if (arg0.field3011 < 0) {
                arg0.field3011 = 0;
            } else if (arg3 < arg0.field3011 + arg0.field2972) {
                arg0.field3011 = arg3 - arg0.field2972;
            }
            if (arg0.field3125 < 0) {
                arg0.field3125 = 0;
            } else if (arg0.field3125 + arg0.field3024 > arg2) {
                arg0.field3125 = arg2 - arg0.field3024;
            }
        }
        field1463++;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)V", line = 271)
    public static final void method650(byte arg0) {
        class338.field5355.method889((byte) 75);
        field1466++;
        if (arg0 != -123) {
            method650((byte) 18);
        }
        class191.field3242.method889((byte) -10);
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(B)V", line = 294)
    public static void method651(byte arg0) {
        field1473 = null;
        field1465 = null;
        if (arg0 <= 93) {
            method648((byte) -89);
        }
    }
}
