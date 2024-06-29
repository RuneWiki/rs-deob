import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class68 extends class712 {

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "F")
    private float field1044 = 0.0F;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "Lep;")
    private class374 field1052;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
    public static int field1048 = 0;

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "F")
    public static float field1054;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(III)V")
    public final void method393(int arg0, int arg1, int arg2) {
        super.field9945.method1431(0, 1);
        if (arg2 >= 96) {
            ++field1049;
            if ((arg1 & 128) == 0) {
                if ((1 & arg0) != 1) {
                    if (!this.field1052.field5268) {
                        super.field9945.method1458(399403340, this.field1052.field5262[0]);
                    } else {
                        super.field9945.method1458(399403340, this.field1052.field5259);
                    }
                } else if (!this.field1052.field5268) {
                    int var4 = super.field9945.field3380 % 4000 * 16 / 4000;
                    super.field9945.method1458(399403340, this.field1052.field5262[var4]);
                } else {
                    this.field1044 = (float) (super.field9945.field3380 % 4000) / 4000.0F;
                    super.field9945.method1458(399403340, this.field1052.field5259);
                }
            } else {
                super.field9945.method1458(399403340, (class190) null);
            }
            super.field9945.method1431(0, 0);
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lrl;Lep;)V")
    public class68(class232 arg0, class374 arg1) {
        super(arg0);
        this.field1052 = arg1;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IILhba;)V")
    public final void method391(int arg0, int arg1, class190 arg2) {
        super.field9945.method1458(399403340, arg2);
        if (arg1 == 0) {
            ++field1047;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BLbda;)Z")
    public static final boolean method538(byte arg0, class722 arg1) {
        ++field1055;
        int var2 = 116 / ((arg0 - 45) / 47);
        class220 var3 = class20.field192.method716(6, arg1.method782((byte) 112));
        if (var3.field2897 == -1) {
            return true;
        } else {
            class7 var4 = class71.field1078.method3008(16030, var3.field2897);
            return ~var4.field66 == 0 ? true : var4.method35((byte) -126);
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
    public final void method398(int arg0) {
        ++field1050;
        if (~super.field9945.method1494((byte) -123) == -1) {
            class474 var2 = super.field9945.method1466(1);
            super.field9945.method1431(0, 1);
            class474 var3 = super.field9945.method1410((byte) -115);
            var3.method900(var2);
            var3.method2871((byte) -98, 1.0F, 0.125F, 0.125F);
            var3.method2875(this.field1044, 0.0F, 0.0F, arg0 ^ -10082);
            super.field9945.method1460(class235.field3478, -128);
            super.field9945.method1431(arg0 + -10700, 0);
        }
        if (arg0 != 10700) {
            field1051 = 106;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)V")
    public final void method389(boolean arg0) {
        super.field9945.method1431(0, 1);
        ++field1056;
        super.field9945.method1388(class179.field2467, (byte) 52, class179.field2467);
        super.field9945.method1408(0, 0, class15.field140);
        super.field9945.method1528(class15.field140, arg0, 0);
        super.field9945.method326(1, -9763);
        super.field9945.method1458(399403340, (class190) null);
        super.field9945.method1431(0, 0);
        super.field9945.method1528(class15.field140, arg0, 0);
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(Z)Z")
    public final boolean method396(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field1053;
            return this.field1052.method2350(2);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZB)V")
    public final void method399(boolean arg0, byte arg1) {
        super.field9945.method1431(0, 1);
        if (arg1 >= 44) {
            ++field1045;
            super.field9945.method1388(class87.field1239, (byte) 52, class161.field2237);
            super.field9945.method324(0, true, -9608, class15.field140, false);
            super.field9945.method1528(class231.field3142, false, 0);
            super.field9945.method326(0, -9763);
            super.field9945.method1431(0, 0);
            super.field9945.method1414(-16777216, (byte) -100);
            super.field9945.method1528(class520.field7247, false, 0);
            this.method398(10700);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BZ)V")
    public final void method394(byte arg0, boolean arg1) {
        if (arg0 <= 39) {
            field1054 = -0.8948273F;
        }
        super.field9945.method1388(class87.field1239, (byte) 52, class179.field2467);
        ++field1057;
    }
}
