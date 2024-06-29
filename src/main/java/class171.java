import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class171 extends class167 {

    @OriginalMember(owner = "client!pg", name = "Z", descriptor = "I")
    private int field3086 = 2048;

    @OriginalMember(owner = "client!pg", name = "bb", descriptor = "I")
    private int field3088 = 10;

    @OriginalMember(owner = "client!pg", name = "db", descriptor = "I")
    private int field3090 = 0;

    @OriginalMember(owner = "client!pg", name = "cb", descriptor = "J")
    public static long field3089 = 0L;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "[I")
    public static int[] field3083 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!pg", name = "ab", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!pg", name = "eb", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!pg", name = "fb", descriptor = "Lvb;")
    public static class232 field3092;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "[I")
    private int[] field3081;

    @OriginalMember(owner = "client!pg", name = "gb", descriptor = "[I")
    private int[] field3093;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
    private final void method1199(boolean arg0) {
        if (arg0) {
            method1201((byte) -76, -84);
        }
        int var2 = 0;
        int var3 = 4096 / this.field3088;
        this.field3081 = new int[this.field3088 + 1];
        int var4 = this.field3086 * var3 >> 12;
        ++field3085;
        this.field3093 = new int[this.field3088 - -1];
        for (int var5 = 0; ~this.field3088 < ~var5; ++var5) {
            this.field3093[var5] = var2;
            this.field3081[var5] = var2 + var4;
            var2 += var3;
        }
        this.field3093[this.field3088] = 4096;
        this.field3081[this.field3088] = this.field3081[0] + 4096;
    }

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
    public static void method1200(int arg0) {
        if (arg0 != 32271) {
            field3092 = null;
        }
        field3092 = null;
        field3083 = null;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class171() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -96) {
            return null;
        } else {
            int[] var3 = super.field3013.method1463((byte) -115, arg1);
            if (super.field3013.field4085) {
                int var4 = class143.field2583[arg1];
                if (~this.field3090 != -1) {
                    for (int var5 = 0; class115.field2146 > var5; ++var5) {
                        int var6 = 0;
                        short var7 = 0;
                        int var8 = class70.field1350[var5];
                        int var9 = this.field3090;
                        if (var9 != 1) {
                            if (~var9 != -3) {
                                if (var9 == 3) {
                                    var6 = 2048 - -(var8 - var4 >> 1);
                                }
                            } else {
                                var6 = (var8 + -4096 + var4 >> 1) + 2048;
                            }
                        } else {
                            var6 = var8;
                        }
                        for (int var10 = 0; this.field3088 > var10; ++var10) {
                            if (~this.field3093[var10] >= ~var6 && this.field3093[var10 + 1] > var6) {
                                if (var6 < this.field3081[var10]) {
                                    var7 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var7;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; ~this.field3088 < ~var12; ++var12) {
                        if (~this.field3093[var12] >= ~var4 && ~this.field3093[var12 + 1] < ~var4) {
                            if (this.field3081[var12] > var4) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class2.method8(var3, 0, class115.field2146, var11);
                }
            }
            ++field3087;
            return var3;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        ++field3082;
        if (arg1) {
            this.field3088 = 67;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field3090 = arg0.method998(74);
                }
            } else {
                this.field3086 = arg0.method1049((byte) 105);
            }
        } else {
            this.field3088 = arg0.method998(117);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(BI)Z")
    public static final boolean method1201(byte arg0, int arg1) {
        int var2 = 62 % ((arg0 - -62) / 47);
        ++field3080;
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = class194.field3462[arg1];
            if (~var3 <= -2001) {
                var3 -= 2000;
            }
            return var3 == 1001;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)V")
    public static final void method1202(int arg0, boolean arg1) {
        ++field3091;
        if (arg0 <= 31) {
            field3083 = null;
        }
        if (class229.field4122 != null) {
            try {
                class145 var2 = new class145(4);
                var2.method1002(false, !arg1 ? 3 : 2);
                var2.method1032(255, 0);
                class229.field4122.method750(0, var2.field2613, -7115, 4);
            } catch (IOException var4) {
                try {
                    class229.field4122.method748((byte) -84);
                } catch (Exception var3) {
                }
                class229.field4122 = null;
                ++class5.field85;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
    public final void method262(int arg0) {
        ++field3084;
        int var2 = -47 / ((-18 - arg0) / 59);
        this.method1199(false);
    }
}
