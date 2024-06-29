import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class598 extends class392 {

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public static int field8529;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public static int field8530;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    public static int field8531;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public static int field8532;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "I")
    public static int field8533;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "I")
    public static int field8534;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public static int field8535;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "I")
    public static int field8536;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "I")
    public static int field8537;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)I")
    public final int method3485(int arg0) {
        if (arg0 != 17539) {
            field8529 = 73;
        }
        ++field8535;
        return super.field5452;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILha;)V")
    public static final void method3486(int arg0, class475 arg1) {
        ++field8532;
        if (arg0 <= 88) {
            field8529 = 11;
        }
        if ((~class624.field8863 <= -3 || class295.field4298) && class766.field10586 == null) {
            String var2;
            if (class295.field4298 && class624.field8863 < 2) {
                var2 = class470.field6405 + class563.field7830.method3281(class423.field5892, -1) + class460.field6275 + " ->";
            } else if (class553.field7666 && class681.field9656.method681((byte) 111, 81) && ~class624.field8863 < -3) {
                var2 = class121.method1062((byte) -116, class493.field6765);
            } else {
                class554 var3 = class493.field6765;
                if (var3 == null) {
                    return;
                }
                var2 = class121.method1062((byte) -124, var3);
                int[] var4 = null;
                if (class662.method3711(25, var3.field7682)) {
                    var4 = class422.field5873.method2937((byte) -90, (int) var3.field7693).field548;
                } else if (var3.field7683 == -1) {
                    if (class61.method628(106, var3.field7682)) {
                        class647 var5 = (class647) class486.field6697.method4253((long) ((int) var3.field7693), -1);
                        if (var5 != null) {
                            class506 var6 = var5.field9191;
                            class179 var7 = var6.field6964;
                            if (var7.field2683 != null) {
                                var7 = var7.method1304(class578.field8328, -25917);
                            }
                            if (var7 != null) {
                                var4 = var7.field2704;
                            }
                        }
                    } else if (class506.method2959(var3.field7682, (byte) -119)) {
                        Object var8 = null;
                        class416 var9;
                        if (var3.field7682 == 1006) {
                            var9 = class312.field4418.method369((byte) 124, (int) var3.field7693);
                        } else {
                            var9 = class312.field4418.method369((byte) 125, (int) (var3.field7693 >>> 32 & 2147483647L));
                        }
                        if (var9.field5736 != null) {
                            var9 = var9.method2458(class578.field8328, -1);
                        }
                        if (var9 != null) {
                            var4 = var9.field5702;
                        }
                    }
                } else {
                    var4 = class422.field5873.method2937((byte) -50, var3.field7683).field548;
                }
                if (var4 != null) {
                    var2 = var2 + class722.method4012(var4, 0);
                }
            }
            if (~class624.field8863 < -3) {
                var2 = var2 + "<col=ffffff> / " + (class624.field8863 + -2) + class563.field7823.method3281(class423.field5892, -1);
            }
            if (class119.field2040 != null) {
                class443 var10 = class119.field2040.method3036(2, arg1);
                if (var10 == null) {
                    var10 = class670.field9398;
                }
                var10.method2629(class119.field2040.field7128, (byte) -99, class688.field9721, class119.field2040.field7285, class69.field1122, class119.field2040.field7164, class312.field4420, var2, class119.field2040.field7255, class346.field4930, class254.field3644, class91.field1312, class119.field2040.field7290, class119.field2040.field7157, class430.field5950);
                class515.method3026(class346.field4930[2], (byte) -36, class346.field4930[1], class346.field4930[0], class346.field4930[3]);
            } else if (class741.field10261 != null && class448.field6175 == class113.field1647) {
                int var11 = class670.field9398.method2623(3, class312.field4420, 0, class91.field1312, class424.field5896 + 16, var2, class688.field9721, class430.field5950, 16777215, class402.field5550 + 4);
                class515.method3026(class675.field9477.method2748(var2, 8364) + var11, (byte) -36, class424.field5896, class402.field5550 + 4, 16);
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(III)Z")
    public static final boolean method3487(int arg0, int arg1, int arg2) {
        ++field8530;
        if (arg0 != 0) {
            method3487(101, 93, 23);
        }
        return (arg1 & 16) != 0;
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lw;)V")
    public class598(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(I)Z")
    public final boolean method3488(int arg0) {
        ++field8536;
        if (arg0 != 0) {
            this.method290(21, 20);
        }
        return true;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BI)V")
    public final void method286(byte arg0, int arg1) {
        ++field8531;
        int var3 = -15 % ((-80 - arg0) / 38);
        super.field5452 = arg1;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(II)I")
    public final int method290(int arg0, int arg1) {
        ++field8534;
        if (arg0 != 0 && super.field5454.field9454.method4010(17539) != 1) {
            return arg1 >= -124 ? 7 : 2;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(ILw;)V")
    public class598(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(Z)V")
    public final void method291(boolean arg0) {
        if (super.field5452 != 0 && super.field5454.field9454.method4010(17539) != 1) {
            super.field5452 = 0;
        }
        ++field8533;
        if (arg0) {
            method3486(-105, (class475) null);
        }
        if (~super.field5452 > -1 || super.field5452 > 1) {
            super.field5452 = this.method292(!arg0);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)I")
    public final int method292(boolean arg0) {
        if (!arg0) {
            this.method3485(-42);
        }
        ++field8537;
        return 1;
    }
}
