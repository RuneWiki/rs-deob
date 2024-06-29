import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class321 extends class184 {

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
    private int field4072 = 0;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
    private int field4071 = 2048;

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
    private int field4074 = 10;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
    public static int field4067 = 0;

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "I")
    public static int field4078 = 0;

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "I")
    public static int field4077 = 0;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "[I")
    private int[] field4068;

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "[I")
    private int[] field4076;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V")
    private final void method1886(byte arg0) {
        ++field4070;
        this.field4076 = new int[this.field4074 + 1];
        int var2 = 0;
        this.field4068 = new int[this.field4074 + 1];
        if (arg0 > -80) {
            this.method7((byte) -73, 119, (class463) null);
        }
        int var3 = 4096 / this.field4074;
        int var4 = this.field4071 * var3 >> 12;
        for (int var5 = 0; ~var5 > ~this.field4074; ++var5) {
            this.field4076[var5] = var2;
            this.field4068[var5] = var2 + var4;
            var2 += var3;
        }
        this.field4076[this.field4074] = 4096;
        this.field4068[this.field4074] = this.field4068[0] + 4096;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BILfh;)V")
    public final void method7(byte arg0, int arg1, class463 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field4072 = arg2.method2737(false);
                }
            } else {
                this.field4071 = arg2.method2758((byte) 87);
            }
        } else {
            this.field4074 = arg2.method2737(false);
        }
        int var5 = 116 % ((arg0 - -13) / 51);
        ++field4075;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        if (arg1 != 578) {
            this.method6(25, -80);
        }
        ++field4079;
        int[] var3 = super.field2409.method248(arg0, 16776960);
        if (super.field2409.field436) {
            int var4 = class334.field4218[arg0];
            if (~this.field4072 == -1) {
                short var5 = 0;
                for (int var6 = 0; ~this.field4074 < ~var6; ++var6) {
                    if (~this.field4076[var6] >= ~var4 && ~var4 > ~this.field4076[var6 + 1]) {
                        if (~this.field4068[var6] < ~var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class318.method1876(var3, 0, class245.field3167, var5);
            } else {
                for (int var7 = 0; ~class245.field3167 < ~var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class347.field4461[var7];
                    int var11 = this.field4072;
                    if (~var11 != -2) {
                        if (~var11 != -3) {
                            if (~var11 == -4) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var10 - (-var4 + 4096) >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; var12 < this.field4074; ++var12) {
                        if (var8 >= this.field4076[var12] && ~var8 > ~this.field4076[var12 + 1]) {
                            if (this.field4068[var12] > var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public static final void method1887(int arg0, String arg1, int arg2, int arg3, int arg4) {
        ++field4073;
        class523 var5 = class202.method1268(arg0, arg2, 0);
        if (var5 != null) {
            if (var5.field7578 != null) {
                class170 var6 = new class170();
                var6.field2178 = var5.field7578;
                var6.field2174 = arg3;
                var6.field2179 = var5;
                var6.field2173 = arg1;
                class239.method1444(var6);
            }
            if (class483.field7059 == 9) {
                boolean var7 = true;
                if (~var5.field7650 != -1) {
                    var7 = class197.method1217(var5, 250);
                }
                if (var7) {
                    if (client.method1226(var5).method642(1, arg3 - 1)) {
                        if (arg3 == 1) {
                            ++class316.field4032;
                            class282.method1669(class379.field4996, false);
                            class362.method2078(arg0, 64, arg2, var5.field7567);
                        }
                        if (~arg3 == -3) {
                            ++class215.field2759;
                            class282.method1669(class214.field2751, false);
                            class362.method2078(arg0, 64, arg2, var5.field7567);
                        }
                        if (~arg3 == -4) {
                            ++class414.field5897;
                            class282.method1669(class384.field5056, false);
                            class362.method2078(arg0, 64, arg2, var5.field7567);
                        }
                        if (~arg3 == -5) {
                            class282.method1669(class218.field2780, false);
                            ++class431.field6118;
                            class362.method2078(arg0, 64, arg2, var5.field7567);
                        }
                        if (~arg3 == -6) {
                            class282.method1669(class254.field3239, false);
                            ++class227.field2893;
                            class362.method2078(arg0, 64, arg2, var5.field7567);
                        }
                        if (arg3 == 6) {
                            ++class462.field6610;
                            class282.method1669(class335.field4233, false);
                            class362.method2078(arg0, 64, arg2, var5.field7567);
                        }
                        if (arg3 == 7) {
                            ++class115.field1548;
                            class282.method1669(class78.field1019, false);
                            class362.method2078(arg0, 64, arg2, var5.field7567);
                        }
                        if (arg4 < 5) {
                            method1887(61, (String) null, -20, 53, 53);
                        }
                        if (~arg3 == -9) {
                            class282.method1669(class283.field3603, false);
                            ++class450.field6437;
                            class362.method2078(arg0, 64, arg2, var5.field7567);
                        }
                        if (~arg3 == -10) {
                            class282.method1669(class281.field3583, false);
                            ++class372.field4823;
                            class362.method2078(arg0, 64, arg2, var5.field7567);
                        }
                        if (arg3 == 10) {
                            class282.method1669(class6.field57, false);
                            ++class262.field3319;
                            class362.method2078(arg0, 64, arg2, var5.field7567);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    public class321() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(Z)V")
    public final void method109(boolean arg0) {
        ++field4069;
        if (arg0) {
            this.field4072 = 32;
        }
        this.method1886((byte) -105);
    }
}
