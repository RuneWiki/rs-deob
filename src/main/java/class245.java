import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class245 extends class70 implements class423 {

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    private int field3541;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field3545 = 0;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "[[[Lbr;")
    public static class184[][][] field3546;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)I")
    public final int method1553(int arg0) {
        int var2 = 62 % ((arg0 - 20) / 40);
        ++field3544;
        return super.field1312;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIII)V")
    public static final void method1554(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3540;
        if (class202.field2854.field7888 != arg1 && arg4 != 0 && class621.field8746 < 50 && arg0 != -1) {
            class313.field4568[class621.field8746++] = new class509((byte) 2, arg0, arg4, arg2, arg3, 0);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)J")
    public final long method1555(int arg0) {
        if (arg0 != -10460) {
            this.field3541 = -3;
        }
        ++field3538;
        return 0L;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Ljj;ILjaclib/memory/Buffer;IZ)V")
    public class245(class66 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field3541 = arg1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I[BBI)V")
    public final void method1556(int arg0, byte[] arg1, byte arg2, int arg3) {
        this.method682(-103, arg1, arg3);
        ++field3542;
        if (arg2 != 88) {
            field3545 = 38;
        }
        this.field3541 = arg0;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
    public final void method684(int arg0) {
        if (arg0 == 58) {
            super.field1314.method520(this, (byte) 86);
            ++field3539;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Ljj;I[BIZ)V")
    public class245(class66 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field3541 = arg1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static void method1557(byte arg0) {
        if (arg0 != 73) {
            method1557((byte) -75);
        }
        field3546 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1558(int arg0, int arg1, byte arg2) {
        if (arg2 != 93) {
            method1558(86, 86, (byte) 108);
        }
        ++field3543;
        return class525.method2958(15123, arg1, arg0) | ~(458752 & arg0) != -1 || class343.method2094(arg0, arg1, (byte) 109);
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)I")
    public final int method1559(int arg0) {
        ++field3537;
        return arg0 != 17449 ? 97 : this.field3541;
    }

    static {
        new class567("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
    }
}
