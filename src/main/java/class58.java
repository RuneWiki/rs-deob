import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class58 {

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Lap;")
    private class435 field604;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "J")
    public long field606;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field602 = 0;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "Lnba;")
    public static class268 field599;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 6)
    public static void method391(int arg0) {
        int var1 = -126 % ((arg0 + 20) / 33);
        field599 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIZII)V", line = 15)
    public static final void method392(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if ((arg3 ? class601.field8530.field2875 : class601.field8530.field2841) != 0 && arg0 != 0 && class479.field7037 < 50 && arg4 != -1) {
            class259.field3301[class479.field7037++] = new class561((byte) (arg3 ? 3 : 2), arg4, arg0, arg1, arg2, 0);
        }
        field598++;
        if (arg5 != 0) {
            method391(-123);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Loa;B)V", line = 33)
    public static final void method393(class635 arg0, byte arg1) {
        field603++;
        if (class644.field9114 != class377.field4914.field4638 && arg1 == 32 && class97.field1074 != null && class452.method2513(class377.field4914.field4638, 10382, arg0)) {
            class644.field9114 = class377.field4914.field4638;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)Z", line = 63)
    public static final boolean method394(int arg0, int arg1, int arg2) {
        field601++;
        int var3 = -41 / ((13 - arg0) / 60);
        return (arg1 & 0x70000) != 0 | class80.method517(71, arg1, arg2) || class127.method732(arg1, arg2, (byte) -64);
    }

    @OriginalMember(owner = "client!dl", name = "finalize", descriptor = "()V", line = 76)
    protected final void finalize() throws Throwable {
        this.field604.method2326(this.field606, false);
        field605++;
        super.finalize();
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lap;JI)V", line = 85)
    public class58(class435 arg0, long arg1, int arg2) {
        this.field604 = arg0;
        this.field606 = arg1;
    }
}
