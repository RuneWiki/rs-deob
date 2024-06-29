import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class652 extends class204 {

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Z")
    public static boolean field9108 = false;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field9103;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field9105;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field9106;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field9107;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLgs;)V", line = 5)
    public static final void method3731(byte arg0, class432 arg1) {
        int var2 = 93 % ((arg0 - -40) / 32);
        ++field9107;
        arg1.method3003(class564.field7978.method1852(12613), -23061);
        arg1.method3003(class685.field9574.method1852(12613), -23061);
        arg1.method3003(class403.field5684.method1852(12613), -23061);
        arg1.method3003(class132.field1695.method1852(12613), -23061);
        arg1.method3003(class406.field5726.method1852(12613), -23061);
        arg1.method3003(class604.field8480.method1852(12613), -23061);
        arg1.method3003(class456.field6372.method1852(12613), -23061);
        arg1.method3003(class384.field5496.method1852(12613), -23061);
        arg1.method3003(class149.field1968.method1852(12613), -23061);
        arg1.method3003(class115.field1473.method1852(12613), -23061);
        arg1.method3003(class392.field5585.method1852(12613), -23061);
        arg1.method3003(class456.field6376.method1852(12613), -23061);
        arg1.method3003(class540.field7466.method1852(12613), -23061);
        arg1.method3003(class170.field2160.method1852(12613), -23061);
        arg1.method3003(class102.field1184.method1852(12613), -23061);
        arg1.method3003(class269.field3901.method1852(12613), -23061);
        arg1.method3003(class99.field1155.method1852(12613), -23061);
        arg1.method3003(class122.field1617.method1852(12613), -23061);
        arg1.method3003(class605.field8484.method1852(12613), -23061);
        arg1.method3003(class75.field841.method1852(12613), -23061);
        arg1.method3003(class16.field95.method1852(12613), -23061);
        arg1.method3003(class448.field6272.method1852(12613), -23061);
        arg1.method3003(class274.field3962.method1852(12613), -23061);
        arg1.method3003(class539.field7458.method1852(12613), -23061);
        arg1.method3003(class85.field1026.method1852(12613), -23061);
        arg1.method3003(class368.field5290.method1852(12613), -23061);
        arg1.method3003(class35.field359.method1852(12613), -23061);
        arg1.method3003(class679.field9499.method1852(12613), -23061);
        arg1.method3003(class516.field7087.method1852(12613), -23061);
        arg1.method3003(class212.field2925.method1852(12613), -23061);
        arg1.method3003(class356.field5136.method1852(12613), -23061);
        arg1.method3003(class100.field1175.method1852(12613), -23061);
        arg1.method3003(class671.method3830(-93), -23061);
        arg1.method3003(class19.method71(18345), -23061);
        arg1.method3003(class278.field4003.method1852(12613), -23061);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 49)
    public final void method486(int arg0) {
        if (arg0 != -4591) {
            this.method3732((byte) -18);
        }
        ++field9104;
        if (~super.field2852 > -2 || ~super.field2852 < -4) {
            super.field2852 = this.method490((byte) 90);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)I", line = 65)
    public final int method490(byte arg0) {
        if (arg0 <= 83) {
            this.method3732((byte) 113);
        }
        ++field9105;
        return !super.field2853.method3513((byte) 54).method4272(23) ? 2 : 3;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)I", line = 76)
    public final int method3732(byte arg0) {
        if (arg0 != -98) {
            return -54;
        } else {
            ++field9103;
            return super.field2852;
        }
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(II)V", line = 87)
    public final void method488(int arg0, int arg1) {
        ++field9109;
        super.field2852 = arg0;
        if (arg1 >= -105) {
            field9108 = true;
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(ILfs;)V", line = 99)
    public class652(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lfs;)V", line = 102)
    public class652(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)I", line = 105)
    public final int method487(int arg0, int arg1) {
        ++field9106;
        int var3 = -63 / ((-57 - arg1) / 60);
        return 1;
    }
}
