import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class536 extends class165 {

    @OriginalMember(owner = "client!uca", name = "u", descriptor = "Liv;")
    public static class106 field7555 = null;

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!uca", name = "q", descriptor = "I")
    private int field7551;

    @OriginalMember(owner = "client!uca", name = "s", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!uca", name = "t", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!uca", name = "v", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!uca", name = "r", descriptor = "Ljava/lang/String;")
    private String field7552;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILmia;)V", line = 6)
    public final void method612(int arg0, class69 arg1) {
        arg1.method546(-90, this.field7551, this.field7552);
        if (arg0 > -100) {
            this.field7552 = null;
        }
        field7556++;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "([BI)[B", line = 19)
    public static final byte[] method3101(byte[] arg0, int arg1) {
        field7550++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class42.method288(arg0, arg1, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(BIIIIZLcb;)V", line = 33)
    public static final void method3102(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class544 arg6) {
        field7554++;
        if (arg0 != -56) {
            field7555 = null;
        }
        if (arg4 <= 0) {
            class452.method2719(arg6, arg2, arg5, arg0 + 56, arg1, arg3);
            return;
        }
        class368.field5295 = arg6;
        class246.field3513 = arg1;
        class664.field9319 = arg2;
        class341.field5056 = arg3;
        class420.field5909 = 1;
        class733.field10242 = null;
        class611.field8622 = arg5;
        class763.field10505 = class76.field1020.method739(21288) / arg4;
        if (class763.field10505 < 1) {
            class763.field10505 = 1;
            return;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lrv;I)V", line = 64)
    public final void method614(class120 arg0, int arg1) {
        this.field7551 = arg0.method871(23995);
        field7553++;
        this.field7552 = arg0.method861(true);
        if (arg1 != 1070) {
            field7555 = null;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)V", line = 76)
    public static void method3103(int arg0) {
        field7555 = null;
        if (arg0 != 1) {
            method3101(null, -93);
        }
    }
}
