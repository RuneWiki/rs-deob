import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class435 extends class67 {

    @OriginalMember(owner = "client!rba", name = "z", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!rba", name = "A", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!rba", name = "B", descriptor = "I")
    public int field6104;

    @OriginalMember(owner = "client!rba", name = "D", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!rba", name = "E", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!rba", name = "G", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!rba", name = "J", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!rba", name = "F", descriptor = "Lbg;")
    public class465 field6108;

    @OriginalMember(owner = "client!rba", name = "H", descriptor = "[B")
    public byte[] field6110;

    @OriginalMember(owner = "client!rba", name = "C", descriptor = "[[[I")
    public static int[][][] field6105;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(II)I", line = 5)
    public static final int method2469(int arg0, int arg1) {
        ++field6102;
        if (arg1 != -22645) {
            method2472(41, -108);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "(I)V", line = 17)
    public static void method2470(int arg0) {
        if (arg0 >= 100) {
            field6105 = null;
        }
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)I", line = 28)
    public final int method510(int arg0) {
        if (arg0 != 100) {
            return -47;
        } else {
            ++field6111;
            return super.field741 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)I", line = 45)
    public static final int method2471(byte arg0) {
        if (arg0 >= -6) {
            method2469(73, -45);
        }
        ++field6107;
        return class658.field9179;
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(II)Lch;", line = 60)
    public static final class464 method2472(int arg0, int arg1) {
        ++field6109;
        class464 var2 = (class464) class729.field10176.method566((byte) 117, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class511.field6901.method2885(0, arg0, false);
            if (arg1 != 100) {
                method2470(-28);
            }
            if (var3 != null && var3.length > 1) {
                class464 var4;
                try {
                    var4 = class378.method2220(var3, 0);
                } catch (Exception var6) {
                    throw new RuntimeException(var6.getMessage() + " S: " + arg0);
                }
                class729.field10176.method567(26404, var4, (long) arg0);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "(I)[B", line = 91)
    public final byte[] method511(int arg0) {
        ++field6106;
        if (arg0 < 5) {
            this.field6108 = null;
        }
        if (super.field741) {
            throw new RuntimeException();
        } else {
            return this.field6110;
        }
    }
}
