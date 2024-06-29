import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class691 extends class584 implements class393 {

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    private int field9588;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "[Loca;")
    public static class247[] field9583 = new class247[100];

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Ldr;")
    public static class675 field9582 = new class675(55, 3);

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field9579;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field9580;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field9581;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field9584;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field9585;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field9586;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Ljava/lang/String;")
    public static String field9587;

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ljaa;ILjaclib/memory/Buffer;)V")
    public class691(class576 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field9588 = arg1;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III[B)V")
    public final void method2231(int arg0, int arg1, int arg2, byte[] arg3) {
        this.method3242(arg3, arg1);
        if (arg2 != 18449) {
            this.method2231(-99, 90, -62, (byte[]) null);
        }
        ++field9586;
        this.field9588 = arg0;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ljaa;I[BI)V")
    public class691(class576 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field9588 = arg1;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public static void method3820(int arg0) {
        if (arg0 != 30821) {
            method3820(84);
        }
        field9587 = null;
        field9583 = null;
        field9582 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)I")
    public final int method2232(byte arg0) {
        ++field9580;
        int var2 = 29 / ((23 - arg0) / 39);
        return this.field9588;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)I")
    public final int method2233(int arg0) {
        if (arg0 <= 34) {
            return -1;
        } else {
            ++field9581;
            return 0;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)J")
    public final long method2234(byte arg0) {
        ++field9585;
        if (arg0 >= -85) {
            field9582 = null;
        }
        return super.field7848.getAddress();
    }
}
