import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class495 extends class73 {

    @OriginalMember(owner = "client!iba", name = "t", descriptor = "Lwv;")
    public static class423 field6823 = null;

    @OriginalMember(owner = "client!iba", name = "o", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!iba", name = "p", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!iba", name = "q", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!iba", name = "r", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!iba", name = "s", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!iba", name = "n", descriptor = "Lpm;")
    public static class131 field6817;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public static final void method2822(int arg0, int arg1, String arg2, int arg3, int arg4) {
        ++field6820;
        class423 var5 = class546.method3064(arg4 ^ -31804, arg0, arg1);
        if (var5 != null) {
            if (var5.field5613 != null) {
                class274 var6 = new class274();
                var6.field3648 = arg3;
                var6.field3639 = var5.field5613;
                var6.field3646 = arg2;
                var6.field3644 = var5;
                class656.method3743(var6);
            }
            if (~class576.field7861 == -11) {
                if (client.method3858(var5).method29(arg3 + -1, arg4 ^ -31762)) {
                    if (arg3 == 1) {
                        ++class523.field7267;
                        class229 var7 = class97.method550(class71.field841, false, class635.field8775);
                        class201.method1288(arg1, -127, arg0, var5.field5552, var7);
                        class307.method1805(var7, arg4 + -46572);
                    }
                    if (arg4 == 31868) {
                        if (arg3 == 2) {
                            ++class387.field5166;
                            class229 var8 = class97.method550(class71.field841, false, class678.field9637);
                            class201.method1288(arg1, -128, arg0, var5.field5552, var8);
                            class307.method1805(var8, -14704);
                        }
                        if (~arg3 == -4) {
                            ++class354.field4715;
                            class229 var9 = class97.method550(class71.field841, false, class358.field4764);
                            class201.method1288(arg1, -126, arg0, var5.field5552, var9);
                            class307.method1805(var9, -14704);
                        }
                        if (arg3 == 4) {
                            ++class177.field2494;
                            class229 var10 = class97.method550(class71.field841, false, class560.field7655);
                            class201.method1288(arg1, -127, arg0, var5.field5552, var10);
                            class307.method1805(var10, -14704);
                        }
                        if (arg3 == 5) {
                            ++class420.field5511;
                            class229 var11 = class97.method550(class71.field841, false, class680.field9653);
                            class201.method1288(arg1, arg4 + -31995, arg0, var5.field5552, var11);
                            class307.method1805(var11, arg4 ^ -17684);
                        }
                        if (arg3 == 6) {
                            ++class523.field7256;
                            class229 var12 = class97.method550(class71.field841, false, class61.field758);
                            class201.method1288(arg1, -128, arg0, var5.field5552, var12);
                            class307.method1805(var12, arg4 ^ -17684);
                        }
                        if (~arg3 == -8) {
                            ++class242.field3193;
                            class229 var13 = class97.method550(class71.field841, false, class378.field5009);
                            class201.method1288(arg1, arg4 + -31995, arg0, var5.field5552, var13);
                            class307.method1805(var13, -14704);
                        }
                        if (arg3 == 8) {
                            ++class471.field6581;
                            class229 var14 = class97.method550(class71.field841, false, class254.field3329);
                            class201.method1288(arg1, -127, arg0, var5.field5552, var14);
                            class307.method1805(var14, arg4 ^ -17684);
                        }
                        if (~arg3 == -10) {
                            ++class418.field5500;
                            class229 var15 = class97.method550(class71.field841, false, class34.field471);
                            class201.method1288(arg1, -127, arg0, var5.field5552, var15);
                            class307.method1805(var15, -14704);
                        }
                        if (arg3 == 10) {
                            ++class228.field2960;
                            class229 var16 = class97.method550(class71.field841, false, class286.field3778);
                            class201.method1288(arg1, -126, arg0, var5.field5552, var16);
                            class307.method1805(var16, -14704);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "(I)V")
    public static void method2823(int arg0) {
        field6823 = null;
        if (arg0 <= -97) {
            field6817 = null;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZIBI)V")
    public final void method403(boolean arg0, int arg1, byte arg2, int arg3) {
        if (arg2 <= 93) {
            field6817 = null;
        }
        class146.field1963.method1121(arg1 + -2, arg3, super.field873.field9733 - -4, super.field873.field9743 + 2, ((class421) super.field873).field5528, 0);
        ++field6822;
        class146.field1963.method1121(arg1 - 1, arg3 - -1, super.field873.field9733 - -2, super.field873.field9743, 0, 0);
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lga;Lga;Lob;)V")
    public class495(class332 arg0, class332 arg1, class421 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(BZII)V")
    public final void method401(byte arg0, boolean arg1, int arg2, int arg3) {
        if (arg0 > 14) {
            ++field6819;
            int var5 = this.method400(2) * super.field873.field9733 / 10000;
            class146.field1963.method1113(arg3, arg2 + 2, var5, super.field873.field9743 + -2, ((class421) super.field873).field5529, 0);
            class146.field1963.method1113(arg3 + var5, arg2 + 2, -var5 + super.field873.field9733, super.field873.field9743 - 2, 0, 0);
        }
    }
}
