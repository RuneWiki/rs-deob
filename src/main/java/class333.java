import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class333 extends class314 {

    @OriginalMember(owner = "client!uv", name = "L", descriptor = "I")
    private int field5448 = 2048;

    @OriginalMember(owner = "client!uv", name = "U", descriptor = "I")
    private int field5457 = 3072;

    @OriginalMember(owner = "client!uv", name = "Y", descriptor = "I")
    private int field5461 = 1024;

    @OriginalMember(owner = "client!uv", name = "S", descriptor = "[Ljava/lang/String;")
    public static String[] field5455 = new String[100];

    @OriginalMember(owner = "client!uv", name = "M", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!uv", name = "N", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!uv", name = "O", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!uv", name = "P", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!uv", name = "Q", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!uv", name = "R", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!uv", name = "T", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!uv", name = "V", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!uv", name = "W", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!uv", name = "X", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "(I)V")
    public static final void method2305(int arg0) {
        ++field5456;
        for (int var1 = arg0; class275.field4413 > var1; ++var1) {
            class681 var2 = class674.field9494[var1];
            if (~var2.field9548 == -4) {
                if (var2.field9547 != null) {
                    class505.field7381.method1985(var2.field9547);
                } else {
                    var2.field9559 = Integer.MIN_VALUE;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V")
    public class333() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BLqk;)Lqk;")
    public static final class16 method2306(byte arg0, class16 arg1) {
        ++field5458;
        if (arg0 != -105) {
            method2308(-124, 109, (byte) 4);
        }
        class16 var2 = arg1 != null ? new class16(arg1) : new class16();
        var2.method206(128, -52, 9);
        return var2;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        if (arg1 < 109) {
            this.field5448 = -77;
        }
        ++field5449;
        int[] var3 = super.field4928.method534((byte) -49, arg0);
        if (super.field4928.field618) {
            int[] var4 = this.method2140(0, arg0, -123);
            for (int var5 = 0; ~var5 > ~class81.field1009; ++var5) {
                var3[var5] = (var4[var5] * this.field5448 >> 12) + this.field5461;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BLie;I)V")
    public final void method5(byte arg0, class6 arg1, int arg2) {
        if (arg0 <= -1) {
            ++field5452;
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        super.field4936 = ~arg1.method70(-9059) == -2;
                    }
                } else {
                    this.field5457 = arg1.method67(12021);
                }
            } else {
                this.field5461 = arg1.method67(12021);
            }
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lie;I)Lio;")
    public static final class403 method2307(class6 arg0, int arg1) {
        ++field5459;
        String var2 = arg0.method42((byte) -110);
        class254 var3 = class411.method2620(0)[arg0.method70(-9059)];
        class395 var4 = class129.method1125(0)[arg0.method70(-9059)];
        int var5 = 65 % ((23 - arg1) / 43);
        int var6 = arg0.method45(-8652);
        int var7 = arg0.method45(-8652);
        int var8 = arg0.method70(-9059);
        int var9 = arg0.method70(-9059);
        int var10 = arg0.method70(-9059);
        int var11 = arg0.method67(12021);
        int var12 = arg0.method67(12021);
        int var13 = arg0.method72(-88);
        int var14 = arg0.method72(-117);
        int var15 = arg0.method72(-36);
        return new class403(var2, var3, var4, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(IIB)I")
    public static final int method2308(int arg0, int arg1, byte arg2) {
        ++field5453;
        if (~arg1 == 0) {
            return 12345678;
        } else {
            int var3 = (127 & arg1) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (~var3 < -127) {
                var3 = 126;
            }
            return arg2 != -22 ? 23 : (65408 & arg1) + var3;
        }
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(Z)V")
    public static void method2309(boolean arg0) {
        if (!arg0) {
            method2305(-96);
        }
        field5455 = null;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IJ)V")
    public static final void method2310(int arg0, long arg1) {
        if (arg0 == -1) {
            ++field5450;
            int var3 = class664.field9238;
            int var4 = class204.field3333;
            if (~class686.field9621 != ~var3) {
                int var5 = -class686.field9621 + var3;
                int var6 = (int) ((long) var5 * arg1 / 320L);
                if (var5 > 0) {
                    if (var6 != 0) {
                        if (var6 > var5) {
                            var6 = var5;
                        }
                    } else {
                        var6 = 1;
                    }
                } else if (~var6 != -1) {
                    if (~var5 < ~var6) {
                        var6 = var5;
                    }
                } else {
                    var6 = -1;
                }
                class686.field9621 += var6;
            }
            if (!class17.field282.field4878) {
                class162.field2746 += (float) arg1 * class254.field4045 / 40.0F * 8.0F;
                class37.field514 += (float) arg1 * class574.field8188 / 40.0F * 8.0F;
            }
            if (class473.field7001 != var4) {
                int var7 = -class473.field7001 + var4;
                int var8 = (int) ((long) var7 * arg1 / 320L);
                if (~var7 < -1) {
                    if (var8 == 0) {
                        var8 = 1;
                    } else if (~var7 > ~var8) {
                        var8 = var7;
                    }
                } else if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
                class473.field7001 += var8;
            }
            class220.method1634((byte) 28);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        this.field5448 = -this.field5461 + this.field5457;
        ++field5454;
        if (arg0 != -15) {
            method2305(19);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)[[I")
    public final int[][] method4(int arg0, byte arg1) {
        ++field5460;
        if (arg1 <= 68) {
            method2310(-21, -90L);
        }
        int[][] var3 = super.field4931.method1345(arg0, 0);
        if (super.field4931.field2799) {
            int[][] var4 = this.method2143(0, arg0, (byte) -4);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class81.field1009; ++var11) {
                var8[var11] = this.field5461 - -(var5[var11] * this.field5448 >> 12);
                var9[var11] = (var6[var11] * this.field5448 >> 12) + this.field5461;
                var10[var11] = (var7[var11] * this.field5448 >> 12) + this.field5461;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method2311(byte arg0, String arg1) {
        if (arg0 >= -36) {
            method2311((byte) 105, (String) null);
        }
        ++field5451;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || ~var8 == -63) {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; ++var6) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (~var7 != -63) {
                var5.append(var7);
            } else {
                var5.append("<gt>");
            }
        }
        return var5.toString();
    }
}
