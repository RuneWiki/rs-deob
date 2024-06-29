import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class431 extends class499 {

    @OriginalMember(owner = "client!ifa", name = "s", descriptor = "F")
    private float field5654 = 0.0F;

    @OriginalMember(owner = "client!ifa", name = "u", descriptor = "Ljga;")
    private class135 field5656;

    @OriginalMember(owner = "client!ifa", name = "q", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!ifa", name = "r", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!ifa", name = "t", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!ifa", name = "v", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!ifa", name = "w", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!ifa", name = "x", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!ifa", name = "y", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILsfa;I)V", line = 7)
    public final void method206(int arg0, class132 arg1, int arg2) {
        super.field6405.method3756(10, arg1);
        ++field5655;
        if (arg2 != 26917) {
            this.field5656 = null;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lgd;Ljga;)V", line = 21)
    public class431(class696 arg0, class135 arg1) {
        super(arg0);
        this.field5656 = arg1;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Z)Z", line = 29)
    public final boolean method200(boolean arg0) {
        if (!arg0) {
            this.method205(-91);
        }
        ++field5653;
        return this.field5656.method781(-1);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZ)V", line = 40)
    public final void method201(int arg0, boolean arg1) {
        super.field6405.method3712(-14720, 1);
        ++field5657;
        super.field6405.method3759(false, class177.field2325, class174.field2285);
        super.field6405.method1205(0, 110, class171.field2262, true, false);
        super.field6405.method3718(0, class13.field134, 1);
        super.field6405.method1157(true, 0);
        super.field6405.method3712(-14720, 0);
        if (arg0 == 91) {
            super.field6405.method3771(-16777216, -9445);
            super.field6405.method3718(0, class324.field4001, 1);
            this.method198((byte) -10);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "(B)V", line = 60)
    public final void method198(byte arg0) {
        ++field5659;
        if (~super.field6405.method3733((byte) 117) == -1) {
            class588 var2 = super.field6405.method3757(-8);
            super.field6405.method3712(-14720, 1);
            class588 var3 = super.field6405.method3763(1);
            var3.method468(var2);
            var3.method3161(0.125F, 1.0F, 0.125F, -7272);
            var3.method3164(this.field5654, 0.0F, 0.0F, 1);
            super.field6405.method3744(83, class514.field6557);
            super.field6405.method3712(-14720, 0);
        }
        int var4 = 109 % ((arg0 - -66) / 36);
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(I)V", line = 87)
    public final void method205(int arg0) {
        super.field6405.method3712(-14720, 1);
        ++field5652;
        super.field6405.method3759(false, class137.field1820, class137.field1820);
        super.field6405.method3736(class171.field2262, arg0, (byte) -88);
        super.field6405.method3718(0, class171.field2262, arg0 + 1);
        super.field6405.method1157(true, 1);
        super.field6405.method3756(10, (class132) null);
        super.field6405.method3712(-14720, 0);
        super.field6405.method3718(0, class171.field2262, 1);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZZ)V", line = 102)
    public final void method202(boolean arg0, boolean arg1) {
        super.field6405.method3759(arg1, class137.field1820, class174.field2285);
        ++field5660;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BII)V", line = 110)
    public final void method204(byte arg0, int arg1, int arg2) {
        super.field6405.method3712(-14720, 1);
        ++field5658;
        if (~(arg2 & 128) == -1) {
            if ((arg1 & 1) == 1) {
                if (!this.field5656.field1786) {
                    int var4 = super.field6405.field9192 % 4000 * 16 / 4000;
                    super.field6405.method3756(10, this.field5656.field1787[var4]);
                } else {
                    this.field5654 = (float) (super.field6405.field9192 % 4000) / 4000.0F;
                    super.field6405.method3756(10, this.field5656.field1785);
                }
            } else if (this.field5656.field1786) {
                super.field6405.method3756(10, this.field5656.field1785);
            } else {
                super.field6405.method3756(10, this.field5656.field1787[0]);
            }
        } else {
            super.field6405.method3756(10, (class132) null);
        }
        if (arg0 < 11) {
            this.field5656 = null;
        }
        super.field6405.method3712(-14720, 0);
    }
}
