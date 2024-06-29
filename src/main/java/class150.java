import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class150 extends class328 {

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    private int field2265 = 1;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "I")
    private int field2267 = 1;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    private int field2270 = 204;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([Loh;IB)V")
    public static final void method1075(class549[] arg0, int arg1, byte arg2) {
        if (arg2 != 24) {
            method1076((String) null, 107, 61, (String) null, (String) null, -12, (String) null, 56);
        }
        for (int var3 = 0; var3 < arg0.length; ++var3) {
            class549 var4 = arg0[var3];
            if (var4 != null) {
                if (~var4.field7749 == -1) {
                    if (var4.field7684 != null) {
                        method1075(var4.field7684, arg1, (byte) 24);
                    }
                    class553 var5 = (class553) class639.field9274.method740(arg2 + -24, (long) var4.field7734);
                    if (var5 != null) {
                        class293.method1845(var5.field7827, arg1, 0);
                    }
                }
                if (~arg1 == -1 && var4.field7702 != null) {
                    class526 var6 = new class526();
                    var6.field7314 = var4.field7702;
                    var6.field7315 = var4;
                    class30.method277(var6);
                }
                if (arg1 == 1 && var4.field7713 != null) {
                    if (var4.field7761 >= 0) {
                        class549 var7 = class495.method2822((byte) -100, var4.field7734);
                        if (var7 == null || var7.field7684 == null || var7.field7684.length <= var4.field7761 || var7.field7684[var4.field7761] != var4) {
                            continue;
                        }
                    }
                    class526 var8 = new class526();
                    var8.field7314 = var4.field7713;
                    var8.field7315 = var4;
                    class30.method277(var8);
                }
            }
        }
        ++field2272;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BILco;)V")
    public final void method1(byte arg0, int arg1, class268 arg2) {
        ++field2266;
        if (arg0 < 75) {
            field2268 = 29;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field2270 = arg2.method1745(32132);
                }
            } else {
                this.field2265 = arg2.method1738(255);
            }
        } else {
            this.field2267 = arg2.method1738(255);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
    public static final void method1076(String arg0, int arg1, int arg2, String arg3, String arg4, int arg5, String arg6, int arg7) {
        ++field2273;
        class50 var8 = class555.field7860[99];
        for (int var9 = arg1; var9 > 0; --var9) {
            class555.field7860[var9] = class555.field7860[var9 - 1];
        }
        if (var8 == null) {
            var8 = new class50(arg7, arg2, arg4, arg6, arg3, arg5, arg0);
        } else {
            var8.method437(arg6, arg2, arg7, arg4, (byte) -124, arg3, arg5, arg0);
        }
        class555.field7860[0] = var8;
        class68.field1286 = class498.field6986;
        ++class424.field6208;
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
    public static final void method1077(int arg0) {
        ++field2269;
        class271.field3980 = true;
        int var1 = 11 % ((arg0 - 9) / 58);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class150() {
        super(0, true);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field2271;
        int var3 = -75 / ((arg1 - 48) / 56);
        int[] var4 = super.field4720.method2872(1, arg0);
        if (super.field4720.field7109) {
            for (int var5 = 0; ~class449.field6539 < ~var5; ++var5) {
                int var6 = class206.field2924[var5];
                int var7 = class638.field9258[arg0];
                int var8 = this.field2267 * var6 >> 12;
                int var9 = this.field2265 * var7 >> 12;
                int var10 = var6 % (4096 / this.field2267) * this.field2267;
                int var11 = var7 % (4096 / this.field2265) * this.field2265;
                if (var11 < this.field2270) {
                    for (var8 -= var9; ~var8 > -1; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var4[var5] = 0;
                        continue;
                    }
                    if (var10 < this.field2270) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                if (~var10 > ~this.field2270) {
                    int var12;
                    for (var12 = var8 - var9; var12 < 0; var12 += 4) {
                    }
                    while (var12 > 3) {
                        var12 -= 4;
                    }
                    if (~var12 < -1) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                var4[var5] = 4096;
            }
        }
        return var4;
    }
}
