import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class139 extends class371 {

    @OriginalMember(owner = "client!tca", name = "P", descriptor = "I")
    private int field1831;

    @OriginalMember(owner = "client!tca", name = "K", descriptor = "Z")
    public static boolean field1826 = false;

    @OriginalMember(owner = "client!tca", name = "I", descriptor = "I")
    public static int field1824 = 0;

    @OriginalMember(owner = "client!tca", name = "O", descriptor = "[B")
    public static byte[] field1830 = new byte[2048];

    @OriginalMember(owner = "client!tca", name = "J", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!tca", name = "M", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!tca", name = "N", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!tca", name = "Q", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!tca", name = "R", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!tca", name = "L", descriptor = "Lqa;")
    public static class167 field1827;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IJ)V")
    public static final void method844(int arg0, long arg1) {
        class221.field3268.field6221 = 0;
        ++field1825;
        class221.field3268.method2563(arg0 ^ -3363, class538.field7965.field8954);
        if (arg0 != 16382) {
            field1824 = -110;
        }
        class221.field3268.method2583(false, arg1);
        class221.field3268.method2563(-13021, class77.field889);
        class427.field6090 = -3;
        class304.field4433 = 1;
        class567.field8413 = 0;
        class172.field2331 = 0;
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(I)V")
    public class139(int arg0) {
        super(0, true);
        this.field1831 = 4096;
        this.field1831 = arg0;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IB)V")
    public static final void method845(int arg0, byte arg1) {
        ++field1829;
        int var2 = -82 / ((arg1 - 38) / 39);
        class621 var3 = class442.method2691(arg0, 7, true);
        var3.method3598(255);
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "()V")
    public class139() {
        this(4096);
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(B)J")
    public static final long method846(byte arg0) {
        if (arg0 != 53) {
            method845(13, (byte) 124);
        }
        ++field1832;
        return class207.field3082.method391(-24244);
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(BI)[I")
    public final int[] method79(byte arg0, int arg1) {
        ++field1833;
        int[] var3 = super.field5378.method1451(-118, arg1);
        if (arg0 > -80) {
            method845(-107, (byte) -28);
        }
        if (super.field5378.field3254) {
            class473.method2881(var3, 0, class41.field455, this.field1831);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        int var4 = -29 / ((arg1 - -15) / 39);
        ++field1828;
        if (~arg0 == -1) {
            this.field1831 = (arg2.method2561((byte) -41) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "(I)V")
    public static void method847(int arg0) {
        int var1 = 38 / ((arg0 - 4) / 53);
        field1830 = null;
        field1827 = null;
    }
}
