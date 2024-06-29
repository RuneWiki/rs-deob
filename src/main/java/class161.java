import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class161 extends class95 implements class170 {

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    private int field2507;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "D")
    public static double field2509;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "Lla;")
    public static class422 field2511;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
    public static void method1199(int arg0) {
        field2511 = null;
        if (arg0 != 0) {
            method1199(-17);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)I")
    public final int method849(int arg0) {
        ++field2505;
        if (arg0 != 8479) {
            this.field2507 = 119;
        }
        return this.field2507;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)J")
    public final long method850(byte arg0) {
        ++field2508;
        if (arg0 != 98) {
            field2509 = 1.8108806455785316D;
        }
        return super.field1415.getAddress();
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lrs;ILjaclib/memory/Buffer;)V")
    public class161(class166 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field2507 = arg1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)I")
    public final int method848(boolean arg0) {
        if (!arg0) {
            return 62;
        } else {
            ++field2510;
            return 0;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([BBII)V")
    public final void method846(byte[] arg0, byte arg1, int arg2, int arg3) {
        ++field2506;
        this.method788(arg0, arg3);
        int var5 = 36 % ((39 - arg1) / 38);
        this.field2507 = arg2;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lrs;I[BI)V")
    public class161(class166 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field2507 = arg1;
    }
}
