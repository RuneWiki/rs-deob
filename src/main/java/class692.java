import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class692 extends class204 {

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "Ljk;")
    public static class788 field9661 = new class788("runescape", 0);

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "[I")
    public static int[] field9665 = new int[5];

    @OriginalMember(owner = "client!ut", name = "s", descriptor = "I")
    public static int field9666 = 1;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
    public static int field9655;

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "I")
    public static int field9656;

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "I")
    public static int field9657;

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
    public static int field9658;

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
    public static int field9659;

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "I")
    public static int field9660;

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
    public static int field9662;

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "I")
    public static int field9663;

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "I")
    public static int field9664;

    @OriginalMember(owner = "client!ut", name = "t", descriptor = "I")
    public static int field9667;

    @OriginalMember(owner = "client!ut", name = "u", descriptor = "I")
    public static int field9668;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BLtja;)Z", line = 4)
    public static final boolean method3921(byte arg0, class491 arg1) {
        ++field9655;
        if (arg0 != -93) {
            return true;
        } else {
            return arg1 == null ? false : class554.method3262(arg1.field6768, -arg1.field6774 + arg1.field6761, -arg1.field6768 + arg1.field6770, arg1.field6774, -10796, arg1.field6765, -arg1.field6765 + arg1.field6762);
        }
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lfs;)V", line = 18)
    public class692(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V", line = 27)
    public final void method486(int arg0) {
        if (arg0 != -4591) {
            field9666 = 71;
        }
        if (super.field2853.field8517.method2602((byte) 80) && !class294.method1939(false, super.field2853.field8517.method2604((byte) -98))) {
            super.field2852 = 0;
        }
        ++field9668;
        if (super.field2852 < 0 || ~super.field2852 < -2) {
            super.field2852 = this.method490((byte) 104);
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(B)V", line = 44)
    public static final void method3922(byte arg0) {
        ++field9659;
        if (arg0 != 28) {
            field9664 = 115;
        }
        for (class498 var1 = (class498) class362.field5218.method1140(-94); var1 != null; var1 = (class498) class362.field5218.method1138(116)) {
            if (~var1.field6833 < -2) {
                var1.field6833 = 0;
                class577.field8108.method305(var1, ((class171) var1.field6826.field2266.field591).field2183, 18320);
                var1.field6826.method1143(-98);
            }
        }
        class367.field5278 = 0;
        class640.field8992 = 0;
        class646.field9038.method1046((byte) -21);
        class775.field10667.method3672(0);
        class362.field5218.method1143(-116);
        class263.field3850 = false;
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(ILfs;)V", line = 77)
    public class692(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "(II)V", line = 80)
    public final void method488(int arg0, int arg1) {
        super.field2852 = arg0;
        if (arg1 >= -105) {
            this.method487(-24, -6);
        }
        ++field9658;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)I", line = 92)
    public final int method487(int arg0, int arg1) {
        ++field9662;
        int var3 = -22 / ((-57 - arg1) / 60);
        return !class294.method1939(false, super.field2853.field8517.method2604((byte) -98)) ? 3 : 1;
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "(I)Z", line = 107)
    public final boolean method3923(int arg0) {
        ++field9656;
        if (!class294.method1939(false, super.field2853.field8517.method2604((byte) -98))) {
            return false;
        } else {
            int var2 = 39 / ((arg0 - -13) / 44);
            return true;
        }
    }

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "(II)V", line = 121)
    public static final void method3924(int arg0, int arg1) {
        if (arg1 <= -37) {
            ++field9660;
            class17 var2 = class245.method1634(1, (long) arg0, 6);
            var2.method69(13);
        }
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "(B)I", line = 135)
    public final int method3925(byte arg0) {
        ++field9663;
        if (arg0 != -98) {
            field9664 = 52;
        }
        return super.field2852;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)I", line = 146)
    public final int method490(byte arg0) {
        ++field9657;
        if (arg0 <= 83) {
            field9661 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "(I)V", line = 164)
    public static void method3926(int arg0) {
        field9665 = null;
        field9661 = null;
        if (arg0 != 0) {
            field9665 = null;
        }
    }
}
