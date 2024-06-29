import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public class class650 extends class155 implements class447 {

    @OriginalMember(owner = "client!ika", name = "q", descriptor = "I")
    private int field8281;

    @OriginalMember(owner = "client!ika", name = "v", descriptor = "Z")
    public static boolean field8286 = true;

    @OriginalMember(owner = "client!ika", name = "o", descriptor = "I")
    public static int field8279;

    @OriginalMember(owner = "client!ika", name = "p", descriptor = "I")
    public static int field8280;

    @OriginalMember(owner = "client!ika", name = "s", descriptor = "I")
    public static int field8283;

    @OriginalMember(owner = "client!ika", name = "t", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!ika", name = "u", descriptor = "I")
    public static int field8285;

    @OriginalMember(owner = "client!ika", name = "w", descriptor = "I")
    public static int field8287;

    @OriginalMember(owner = "client!ika", name = "x", descriptor = "I")
    public static int field8288;

    @OriginalMember(owner = "client!ika", name = "y", descriptor = "I")
    public static int field8289;

    @OriginalMember(owner = "client!ika", name = "z", descriptor = "I")
    public static int field8290;

    @OriginalMember(owner = "client!ika", name = "A", descriptor = "I")
    public static int field8291;

    @OriginalMember(owner = "client!ika", name = "B", descriptor = "I")
    public static int field8292;

    @OriginalMember(owner = "client!ika", name = "r", descriptor = "Lwm;")
    public static class30 field8282;

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(I)I")
    public final int method2562(int arg0) {
        if (arg0 != 13349) {
            field8282 = null;
        }
        ++field8284;
        return this.field8281;
    }

    @OriginalMember(owner = "client!ika", name = "<init>", descriptor = "(Lck;ILjaclib/memory/Buffer;IZ)V")
    public class650(class733 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field8281 = arg1;
    }

    @OriginalMember(owner = "client!ika", name = "b", descriptor = "(B)I")
    public final int method2560(byte arg0) {
        ++field8279;
        int var2 = -18 / ((arg0 - 2) / 56);
        return super.field1971;
    }

    @OriginalMember(owner = "client!ika", name = "b", descriptor = "(I)V")
    public static void method3505(int arg0) {
        field8282 = null;
        if (arg0 != -31795) {
            field8287 = 41;
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(B)J")
    public final long method2559(byte arg0) {
        if (arg0 >= -34) {
            field8282 = null;
        }
        ++field8288;
        return 0L;
    }

    @OriginalMember(owner = "client!ika", name = "<init>", descriptor = "(Lck;I[BIZ)V")
    public class650(class733 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field8281 = arg1;
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(III)Z")
    public static final boolean method3506(int arg0, int arg1, int arg2) {
        ++field8280;
        if (arg0 != 2048) {
            method3507(-17);
        }
        return ~(arg1 & 2048) != -1;
    }

    @OriginalMember(owner = "client!ika", name = "d", descriptor = "(B)V")
    public final void method877(byte arg0) {
        super.field1968.method3958(13, this);
        ++field8283;
        int var2 = 86 % ((arg0 - -43) / 55);
    }

    @OriginalMember(owner = "client!ika", name = "c", descriptor = "(I)I")
    public static final int method3507(int arg0) {
        ++field8292;
        if (arg0 != 16) {
            method3507(-51);
        }
        return 16;
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(IIIZ)I")
    public static final int method3508(int arg0, int arg1, int arg2, boolean arg3) {
        ++field8289;
        if (~(8 & class410.field5439[arg0][arg1][arg2]) != -1) {
            return 0;
        } else if (~arg0 < -1 && (2 & class410.field5439[1][arg1][arg2]) != 0) {
            return arg0 + -1;
        } else {
            if (arg3) {
                field8290 = -77;
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "([BIII)V")
    public final void method2561(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method876((byte) -102, arg0, arg2);
        ++field8285;
        if (arg1 > 0) {
            field8290 = -126;
        }
        this.field8281 = arg3;
    }
}
