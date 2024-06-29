import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class658 extends class171 implements class283 {

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    private int field9236;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field9235 = 0;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Lnea;")
    public static class664 field9229 = new class664(112, 2);

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field9230;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field9231;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field9232;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field9233;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field9234;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BII[B)V")
    public final void method1143(byte arg0, int arg1, int arg2, byte[] arg3) {
        int var5 = 18 / ((-75 - arg0) / 47);
        ++field9231;
        this.method1170(arg3, arg1);
        this.field9236 = arg2;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V")
    public static void method3623(byte arg0) {
        if (arg0 >= -112) {
            field9235 = -73;
        }
        field9229 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lr;I)V")
    public static final void method3624(class166 arg0, int arg1) {
        ++field9234;
        class351.field5064 = class695.method3864(arg0, class254.field3904, true, -58);
        class597.field8436 = class648.method3596((byte) -97, class254.field3904, arg0);
        class563.field7931 = class695.method3864(arg0, class132.field1956, true, -116);
        class244.field3796 = class648.method3596((byte) -106, class132.field1956, arg0);
        class26.field391 = class695.method3864(arg0, class77.field1335, true, -48);
        if (arg1 != 2) {
            field9229 = null;
        }
        class467.field6721 = class648.method3596((byte) -54, class77.field1335, arg0);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)I")
    public final int method1142(int arg0) {
        if (arg0 != -22806) {
            this.method1143((byte) 114, 90, -64, (byte[]) null);
        }
        ++field9230;
        return 0;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)I")
    public final int method1140(byte arg0) {
        ++field9232;
        int var2 = -94 / ((30 - arg0) / 62);
        return this.field9236;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lok;ILjaclib/memory/Buffer;)V")
    public class658(class228 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field9236 = arg1;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lok;I[BI)V")
    public class658(class228 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field9236 = arg1;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)J")
    public final long method1138(int arg0) {
        if (arg0 != -19664) {
            this.method1143((byte) -109, 94, -85, (byte[]) null);
        }
        ++field9233;
        return super.field2438.getAddress();
    }
}
