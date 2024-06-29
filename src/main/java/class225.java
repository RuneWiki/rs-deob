import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class225 extends class260 {

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lfca;)V")
    public class225(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(IB)V")
    public final void method9(int arg0, byte arg1) {
        if (arg1 != -107) {
            this.method9(-117, (byte) 74);
        }
        ++field3077;
        super.field3868 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
    public final void method2(boolean arg0) {
        if (super.field3867.method740((byte) -115)) {
            super.field3868 = 2;
        }
        if (arg0) {
            field3082 = -25;
        }
        ++field3084;
        if (~super.field3868 > -1 || super.field3868 > 2) {
            super.field3868 = this.method8((byte) 4);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsia;I)V")
    public static final void method1487(class766 arg0, int arg1) {
        arg0.field10577 = false;
        if (arg1 != 1) {
            field3082 = 107;
        }
        ++field3083;
        if (arg0.field10576 != null) {
            arg0.field10576.field1 = 0;
        }
        for (class766 var2 = arg0.method595(); var2 != null; var2 = arg0.method592()) {
            method1487(var2, arg1);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)I")
    public final int method4(int arg0, byte arg1) {
        ++field3079;
        int var3 = 15 / ((-53 - arg1) / 50);
        return super.field3867.method740((byte) -102) ? 3 : 1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)I")
    public final int method8(byte arg0) {
        ++field3081;
        if (arg0 != 4) {
            field3082 = -75;
        }
        if (!super.field3867.method740((byte) -126)) {
            return super.field3867.field1270.method4291(8192) && class650.method3624(super.field3867.field1270.method4293(98), -1) ? 1 : 0;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)I")
    public final int method1488(int arg0) {
        ++field3076;
        if (arg0 < 3) {
            field3082 = -115;
        }
        return super.field3868;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(ILfca;)V")
    public class225(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)Z")
    public final boolean method1489(int arg0) {
        ++field3080;
        int var2 = 9 / ((56 - arg0) / 53);
        return !super.field3867.method740((byte) -116);
    }
}
