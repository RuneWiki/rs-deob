import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class250 extends class601 {

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "Lmk;")
    public static class54 field3021 = new class54();

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "[F")
    public static float[] field3027 = new float[16];

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(B)I", line = 4)
    public final int method39(byte arg0) {
        if (arg0 != -17) {
            field3021 = null;
        }
        ++field3023;
        return 127;
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(ILgn;)V", line = 15)
    public class250(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(II)I", line = 20)
    public final int method34(int arg0, int arg1) {
        ++field3026;
        if (arg1 != 15706) {
            method1499(false);
        }
        return 1;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IZ)V", line = 31)
    public final void method40(int arg0, boolean arg1) {
        if (!arg1) {
            ++field3022;
            super.field8565 = arg0;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Z)V", line = 42)
    public static void method1499(boolean arg0) {
        field3021 = null;
        field3027 = null;
        if (arg0) {
            field3027 = null;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)I", line = 57)
    public final int method1500(int arg0) {
        int var2 = -22 % ((arg0 - -59) / 61);
        ++field3024;
        return super.field8565;
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lgn;)V", line = 72)
    public class250(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V", line = 77)
    public final void method35(byte arg0) {
        ++field3025;
        if (arg0 >= -37) {
            field3021 = null;
        }
        if (super.field8565 < 0 && super.field8565 > 127) {
            super.field8565 = this.method39((byte) -17);
        }
    }
}
