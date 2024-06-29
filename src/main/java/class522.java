import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class522 extends class189 {

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "[B")
    public byte[] field7577;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "[I")
    public static int[] field7575 = new int[2048];

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "Ls;")
    public static class186 field7578 = new class186(36, -2);

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field7580 = 0;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "Lwm;")
    public static class399 field7581 = new class399(5);

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "[F")
    public static float[] field7583 = new float[4];

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "Llb;")
    public static class383 field7582;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 8)
    public static void method3088(int arg0) {
        field7582 = null;
        if (arg0 <= 12) {
            method3089((byte) -33, 44);
        }
        field7575 = null;
        field7583 = null;
        field7578 = null;
        field7581 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)I", line = 24)
    public static final int method3089(byte arg0, int arg1) {
        if (arg0 > -113) {
            return -118;
        } else {
            field7576++;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B)V", line = 35)
    public class522(byte[] arg0) {
        this.field7577 = arg0;
    }
}
