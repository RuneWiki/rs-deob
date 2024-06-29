import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class595 extends class322 {

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field8368;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field8369;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public static int field8371;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public static int field8372;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field8367;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V", line = 3)
    public static void method3354(int arg0) {
        field8367 = null;
        if (arg0 != 12165) {
            field8367 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(ILch;)V", line = 17)
    public class595(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)I", line = 20)
    public final int method19(int arg0, int arg1) {
        if (arg1 < 10) {
            field8367 = null;
        }
        ++field8368;
        return 1;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)V", line = 36)
    public final void method22(int arg0, int arg1) {
        super.field4451 = arg1;
        ++field8372;
        if (arg0 != 0) {
            this.method23(false);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V", line = 47)
    public final void method23(boolean arg0) {
        ++field8373;
        if (~super.field4451 != -2 && ~super.field4451 != -1) {
            super.field4451 = this.method17((byte) -69);
        }
        if (arg0) {
            field8367 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Z)I", line = 60)
    public final int method3355(boolean arg0) {
        if (arg0) {
            field8367 = null;
        }
        ++field8369;
        return super.field4451;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIII)V", line = 72)
    public static final void method3356(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8371;
        if (arg2 != -1) {
            field8367 = null;
        }
        int var5 = class698.field9628;
        if (~var5 != -1) {
            if (var5 != 1) {
                if (~var5 == -3) {
                    if (~class426.field5987 < ~arg4) {
                        class426.field5987 = arg4;
                    }
                    if (~arg1 < ~class479.field6781) {
                        class479.field6781 = arg1;
                    }
                    if (arg3 < class281.field3998) {
                        class281.field3998 = arg3;
                    }
                    if (~arg0 < ~class53.field606) {
                        class53.field606 = arg0;
                    }
                }
            } else {
                class426.field5987 = arg4;
                class698.field9628 = 2;
                class281.field3998 = arg3;
                class53.field606 = arg0;
                class479.field6781 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)I", line = 132)
    public final int method17(byte arg0) {
        ++field8370;
        int var2 = 92 % ((70 - arg0) / 51);
        return 1;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lch;)V", line = 142)
    public class595(class463 arg0) {
        super(arg0);
    }
}
