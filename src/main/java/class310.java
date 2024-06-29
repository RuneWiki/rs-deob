import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class310 extends class330 {

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    private int field4468 = 2048;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
    private int field4470 = 0;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    private int field4463 = 10;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field4469 = 0;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "[I")
    private int[] field4464;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "[I")
    private int[] field4467;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lgga;IB)V", line = 6)
    public final void method466(class511 arg0, int arg1, byte arg2) {
        ++field4462;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field4470 = arg0.method3013(51);
                }
            } else {
                this.field4468 = arg0.method3002(-1);
            }
        } else {
            this.field4463 = arg0.method3013(37);
        }
        int var5 = 82 / ((-41 - arg2) / 42);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZLib;)V", line = 50)
    public static final void method2003(int arg0, boolean arg1, class723 arg2) {
        ++field4461;
        if (arg0 == 2048) {
            if (class640.field8992 < 400) {
                if (class724.field10031 == arg2) {
                    if (class773.field10644 && ~(16 & class774.field10657) != -1) {
                        ++class432.field6004;
                        class86.method647((long) arg2.field9186, class56.field656, 0, false, 0L, class523.field7205 + " -> <col=ffffff>" + class712.field9890.method3999(class553.field7667, (byte) -43), 6, class50.field602, -1, arg0 ^ 2148, true, 0, false);
                    }
                } else {
                    String var3;
                    if (arg2.field10003 != 0) {
                        if (arg2.field10003 != -1) {
                            var3 = arg2.method4030(true, (byte) 10) + " (" + class712.field9882.method3999(class553.field7667, (byte) -36) + arg2.field10003 + ")";
                        } else {
                            var3 = arg2.method4030(true, (byte) 10);
                        }
                    } else {
                        boolean var4 = true;
                        if (~class724.field10031.field10012 != 0 && ~arg2.field10012 != 0) {
                            int var5 = arg2.field10012 > class724.field10031.field10012 ? class724.field10031.field10012 : arg2.field10012;
                            int var6 = -arg2.field9980 + class724.field10031.field9980;
                            if (~var6 > -1) {
                                var6 = -var6;
                            }
                            if (~var6 < ~var5) {
                                var4 = false;
                            }
                        }
                        String var7 = class389.field5550 != class327.field4603 ? class712.field9881.method3999(class553.field7667, (byte) -57) : class712.field9883.method3999(class553.field7667, (byte) -78);
                        if (arg2.field9980 >= arg2.field10005) {
                            var3 = arg2.method4030(true, (byte) 10) + (!var4 ? "<col=ffffff>" : class641.method3685(arg0 ^ 29291, class724.field10031.field9980, arg2.field9980)) + " (" + var7 + arg2.field9980 + ")";
                        } else {
                            var3 = arg2.method4030(true, (byte) 10) + (!var4 ? "<col=ffffff>" : class641.method3685(31339, class724.field10031.field9980, arg2.field9980)) + " (" + var7 + arg2.field9980 + "+" + (-arg2.field9980 + arg2.field10005) + ")";
                        }
                    }
                    if (class773.field10644 && !arg1 && ~(8 & class774.field10657) != -1) {
                        ++class60.field689;
                        class86.method647((long) arg2.field9186, class56.field656, 0, false, (long) arg2.field9186, class523.field7205 + " -> <col=ffffff>" + var3, 8, class50.field602, -1, arg0 ^ 2125, true, 0, false);
                    }
                    if (arg1) {
                        class86.method647((long) arg2.field9186, "<col=cccccc>" + var3, 0, true, 0L, "", -1, -1, 0, 58, false, 0, false);
                    } else {
                        for (int var8 = 7; ~var8 <= -1; --var8) {
                            if (class349.field5072[var8] != null) {
                                short var10 = 0;
                                if (class692.field9661 == class327.field4603 && class349.field5072[var8].equalsIgnoreCase(class712.field9876.method3999(class553.field7667, (byte) -26))) {
                                    if (class176.field2226 && arg2.field9980 > class724.field10031.field9980) {
                                        var10 = 2000;
                                    }
                                    if (class724.field10031.field9976 != 0 && ~arg2.field9976 != -1) {
                                        if (class724.field10031.field9976 == arg2.field9976) {
                                            var10 = 2000;
                                        } else {
                                            var10 = 0;
                                        }
                                    } else if (arg2.field9996) {
                                        var10 = 2000;
                                    }
                                } else if (class262.field3837[var8]) {
                                    var10 = 2000;
                                }
                                short var11 = (short) (class114.field1386[var8] + var10);
                                int var12 = ~class328.field4605[var8] == 0 ? class233.field3500 : class328.field4605[var8];
                                ++class381.field5460;
                                class86.method647((long) arg2.field9186, class349.field5072[var8], 0, false, (long) arg2.field9186, "<col=ffffff>" + var3, var11, var12, -1, 111, true, 0, false);
                            }
                        }
                    }
                    if (!arg1) {
                        for (class171 var9 = (class171) class646.field9038.method1041(arg0 + 1046784); var9 != null; var9 = (class171) class646.field9038.method1033(-1)) {
                            if (~var9.field2174 == -46) {
                                var9.field2176 = "<col=ffffff>" + var3;
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 203)
    public class310() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(B)V", line = 210)
    public final void method653(byte arg0) {
        int var2 = -56 % ((50 - arg0) / 41);
        ++field4471;
        this.method2004(0);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZ)[I", line = 221)
    public final int[] method464(int arg0, boolean arg1) {
        ++field4466;
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (super.field4630.field5704) {
            int var4 = class300.field4352[arg0];
            if (~this.field4470 != -1) {
                for (int var5 = 0; ~class80.field901 < ~var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class404.field5705[var5];
                    int var9 = this.field4470;
                    if (~var9 != -2) {
                        if (var9 != 2) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var4 + var8 + -4096 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; this.field4463 > var10; ++var10) {
                        if (var6 >= this.field4464[var10] && ~this.field4464[var10 + 1] < ~var6) {
                            if (~var6 > ~this.field4467[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~var12 > ~this.field4463; ++var12) {
                    if (~var4 <= ~this.field4464[var12] && ~this.field4464[var12 + 1] < ~var4) {
                        if (~var4 > ~this.field4467[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class335.method2121(var3, 0, class80.field901, var11);
            }
        }
        return arg1 ? null : var3;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V", line = 340)
    private final void method2004(int arg0) {
        ++field4465;
        int var2 = arg0;
        this.field4467 = new int[this.field4463 + 1];
        this.field4464 = new int[this.field4463 + 1];
        int var3 = 4096 / this.field4463;
        int var4 = this.field4468 * var3 >> 12;
        for (int var5 = 0; ~var5 > ~this.field4463; ++var5) {
            this.field4464[var5] = var2;
            this.field4467[var5] = var2 + var4;
            var2 += var3;
        }
        this.field4464[this.field4463] = 4096;
        this.field4467[this.field4463] = this.field4467[0] + 4096;
    }
}
