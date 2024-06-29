import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class71 {

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public int field962;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
    public int field968;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
    public int field969;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(BIZ)Ljava/lang/String;", line = 7)
    public static final String method569(byte arg0, int arg1, boolean arg2) {
        field961++;
        if (arg0 <= 0) {
            return null;
        } else if (arg2 && arg1 >= 0) {
            return class255.method1609(-127, arg1, arg2, 10);
        } else {
            return Integer.toString(arg1);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I[B)[B", line = 25)
    public static final byte[] method570(int arg0, byte[] arg1) {
        field963++;
        if (arg0 == -1623) {
            int var2 = arg1.length;
            byte[] var3 = new byte[var2];
            class443.method2514(arg1, 0, var3, 0, var2);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IB)I", line = 43)
    public static final int method571(int arg0, byte arg1) {
        field966++;
        if (arg1 < 82) {
            return -79;
        }
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }
}
