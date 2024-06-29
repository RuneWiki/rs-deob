import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class562 extends class307 implements class355 {

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "I")
    private int field7862;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
    public static int field7861;

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "I")
    public static int field7863;

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
    public static int field7864;

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "Lkha;")
    public static class687 field7865;

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Leq;I[BI)V", line = 5)
    public class562(class357 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field7862 = arg1;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)I", line = 14)
    public final int method2112(int arg0) {
        ++field7860;
        if (arg0 <= 79) {
            method3173((byte) 20);
        }
        return 0;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "([BBII)V", line = 25)
    public final void method2109(byte[] arg0, byte arg1, int arg2, int arg3) {
        if (arg1 >= -8) {
            this.field7862 = 92;
        }
        ++field7863;
        this.method1804(arg0, arg2);
        this.field7862 = arg3;
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Leq;ILjaclib/memory/Buffer;)V", line = 40)
    public class562(class357 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field7862 = arg1;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)J", line = 48)
    public final long method2110(boolean arg0) {
        if (!arg0) {
            this.field7862 = 104;
        }
        ++field7861;
        return super.field3939.getAddress();
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(B)V", line = 59)
    public static void method3173(byte arg0) {
        field7865 = null;
        if (arg0 != -125) {
            field7865 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)I", line = 69)
    public final int method2111(byte arg0) {
        if (arg0 != 124) {
            field7865 = null;
        }
        ++field7864;
        return this.field7862;
    }
}
