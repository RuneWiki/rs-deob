import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class660 extends class250 implements class227 {

    @OriginalMember(owner = "client!mia", name = "c", descriptor = "I")
    private int field9307;

    @OriginalMember(owner = "client!mia", name = "f", descriptor = "Lju;")
    public static class102 field9310 = new class102(62, -1);

    @OriginalMember(owner = "client!mia", name = "d", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!mia", name = "e", descriptor = "I")
    public static int field9309;

    @OriginalMember(owner = "client!mia", name = "g", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!mia", name = "h", descriptor = "I")
    public static int field9312;

    @OriginalMember(owner = "client!mia", name = "j", descriptor = "I")
    public static int field9314;

    @OriginalMember(owner = "client!mia", name = "i", descriptor = "Ltp;")
    public static class295 field9313;

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(BII[B)V", line = 3)
    public final void method1471(byte arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 == 100) {
            ++field9312;
            this.method1589(arg3, arg2);
            this.field9307 = arg1;
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)I", line = 19)
    public final int method1470(int arg0) {
        if (arg0 != 10059) {
            field9310 = null;
        }
        ++field9309;
        return 0;
    }

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "(I)I", line = 33)
    public final int method1473(int arg0) {
        if (arg0 != -30695) {
            field9314 = 74;
        }
        ++field9308;
        return this.field9307;
    }

    @OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(Lep;I[BI)V", line = 45)
    public class660(class371 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field9307 = arg1;
    }

    @OriginalMember(owner = "client!mia", name = "c", descriptor = "(I)V", line = 54)
    public static void method3799(int arg0) {
        field9310 = null;
        field9313 = null;
        if (arg0 != -1) {
            method3799(-51);
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(B)J", line = 65)
    public final long method1472(byte arg0) {
        if (arg0 > -75) {
            field9314 = -33;
        }
        ++field9311;
        return super.field3472.getAddress();
    }

    @OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(Lep;ILjaclib/memory/Buffer;)V", line = 76)
    public class660(class371 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field9307 = arg1;
    }
}
