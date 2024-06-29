import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class504 extends class305 {

    @OriginalMember(owner = "client!is", name = "q", descriptor = "Z")
    public static boolean field7168 = true;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!is", name = "n", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!is", name = "p", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!is", name = "o", descriptor = "[Lpga;")
    public static class536[] field7166;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "[[[I")
    public static int[][][] field7161;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(B)V", line = 6)
    public final void method308(byte arg0) {
        ++field7165;
        if (~super.field4320 > -1 || super.field4320 > 4) {
            super.field4320 = this.method305((byte) 68);
        }
        if (arg0 > -40) {
            this.method303(-22, 8);
        }
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(ILhb;)V", line = 19)
    public class504(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lhb;)V", line = 22)
    public class504(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(II)V", line = 25)
    public final void method303(int arg0, int arg1) {
        if (arg0 != -27751) {
            field7168 = true;
        }
        ++field7163;
        super.field4320 = arg1;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)I", line = 38)
    public final int method305(byte arg0) {
        if (arg0 != 68) {
            return 23;
        } else {
            ++field7162;
            return 0;
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)I", line = 50)
    public final int method2991(int arg0) {
        ++field7167;
        if (arg0 != 17503) {
            method2992(-87);
        }
        return super.field4320;
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(I)V", line = 63)
    public static void method2992(int arg0) {
        if (arg0 != 1) {
            field7168 = false;
        }
        field7166 = null;
        field7161 = null;
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(II)I", line = 75)
    public final int method306(int arg0, int arg1) {
        ++field7160;
        return arg0 != 31401 ? 4 : 1;
    }
}
