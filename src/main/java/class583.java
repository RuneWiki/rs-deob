import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class583 extends class71 {

    @OriginalMember(owner = "client!kaa", name = "l", descriptor = "Lkr;")
    public static class602 field7962 = new class602(14, 6);

    @OriginalMember(owner = "client!kaa", name = "j", descriptor = "I")
    public static int field7960;

    @OriginalMember(owner = "client!kaa", name = "k", descriptor = "I")
    public int field7961;

    @OriginalMember(owner = "client!kaa", name = "n", descriptor = "I")
    public static int field7964;

    @OriginalMember(owner = "client!kaa", name = "o", descriptor = "I")
    public int field7965;

    @OriginalMember(owner = "client!kaa", name = "q", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!kaa", name = "r", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!kaa", name = "p", descriptor = "Lst;")
    public class335 field7966;

    @OriginalMember(owner = "client!kaa", name = "m", descriptor = "Lmfa;")
    public class409 field7963;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V")
    public static void method3381(int arg0) {
        if (arg0 != 1) {
            method3381(-24);
        }
        field7962 = null;
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)V")
    public final void method3382(int arg0) {
        if (arg0 != 1) {
            field7962 = null;
        }
        field7968++;
        if (class489.field6850 < class108.field1461.length) {
            class108.field1461[class489.field6850++] = this;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILmga;)Z")
    public static final boolean method3383(int arg0, class30 arg1) {
        if (arg0 >= -88) {
            field7962 = null;
        }
        field7960++;
        return class573.field7904 == arg1 || class629.field8454 == arg1 || class439.field6122 == arg1 || class239.field3568 == arg1;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ZII)I")
    public static final int method3384(boolean arg0, int arg1, int arg2) {
        field7964++;
        if (arg0) {
            return 68;
        }
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg2 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(BILuv;I)V")
    public static final void method3385(byte arg0, int arg1, class755 arg2, int arg3) {
        class550.field7652 = arg1;
        field7967++;
        if (arg0 > 7) {
            class77.field1117 = arg3;
            class147.field2054 = arg2;
        }
    }
}
