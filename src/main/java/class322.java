import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class322 extends class392 implements class404 {

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "I")
    private int field4293;

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZI[BI)V", line = 3)
    public final void method1466(boolean arg0, int arg1, byte[] arg2, int arg3) {
        ++field4291;
        this.method2367(-102, arg1, arg2);
        this.field4293 = arg3;
        if (arg0) {
            this.field4293 = 83;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)I", line = 17)
    public final int method1468(boolean arg0) {
        ++field4288;
        return arg0 ? 36 : super.field5659;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)I", line = 29)
    public final int method1467(int arg0) {
        ++field4289;
        return arg0 <= 74 ? -79 : this.field4293;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lur;I[BIZ)V", line = 43)
    public class322(class377 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field4293 = arg1;
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V", line = 52)
    public final void method1907(int arg0) {
        super.field5657.method2281(this, (byte) 66);
        int var2 = -21 % ((arg0 - -33) / 39);
        ++field4290;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)J", line = 65)
    public final long method1465(byte arg0) {
        ++field4292;
        if (arg0 > -20) {
            this.field4293 = 50;
        }
        return 0L;
    }
}
