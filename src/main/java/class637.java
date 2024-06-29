import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class637 extends class128 implements class21 {

    @OriginalMember(owner = "client!hda", name = "p", descriptor = "I")
    private int field9151;

    @OriginalMember(owner = "client!hda", name = "o", descriptor = "[Z")
    public static boolean[] field9150 = new boolean[5];

    @OriginalMember(owner = "client!hda", name = "t", descriptor = "[I")
    public static int[] field9155 = new int[5];

    @OriginalMember(owner = "client!hda", name = "l", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!hda", name = "m", descriptor = "I")
    public static int field9148;

    @OriginalMember(owner = "client!hda", name = "n", descriptor = "I")
    public static int field9149;

    @OriginalMember(owner = "client!hda", name = "q", descriptor = "I")
    public static int field9152;

    @OriginalMember(owner = "client!hda", name = "r", descriptor = "I")
    public static int field9153;

    @OriginalMember(owner = "client!hda", name = "s", descriptor = "I")
    public static int field9154;

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lmh;I[BIZ)V")
    public class637(class537 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field9151 = arg1;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Z)V")
    public static void method3653(boolean arg0) {
        if (!arg0) {
            field9150 = null;
        }
        field9150 = null;
        field9155 = null;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)I")
    public final int method134(int arg0) {
        if (arg0 <= 83) {
            field9148 = 15;
        }
        ++field9147;
        return super.field1579;
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(I)J")
    public final long method135(int arg0) {
        ++field9152;
        return arg0 != -29959 ? 106L : 0L;
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(B)V")
    public final void method728(byte arg0) {
        super.field1580.method3057(this, 78);
        ++field9153;
        if (arg0 != 1) {
            field9148 = -123;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)I")
    public final int method137(byte arg0) {
        ++field9154;
        return arg0 < 43 ? -89 : this.field9151;
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lmh;ILjaclib/memory/Buffer;IZ)V")
    public class637(class537 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field9151 = arg1;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I[BZI)V")
    public final void method136(int arg0, byte[] arg1, boolean arg2, int arg3) {
        this.method727(arg0, arg1, 35040);
        ++field9149;
        if (!arg2) {
            this.field9151 = arg3;
        }
    }
}
