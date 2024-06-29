import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends class260 {

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "[S")
    private static short[] field2 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "[S")
    private static short[] field7 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "[S")
    private static short[] field10 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "[[S")
    public static short[][] field6 = new short[][] { field7, field2, field10 };

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "Ld;")
    public static class161 field5;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)I", line = 4)
    public final int method1(int arg0) {
        if (arg0 < 3) {
            method6((byte) 16);
        }
        ++field9;
        return super.field3868;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)V", line = 18)
    public final void method2(boolean arg0) {
        ++field3;
        if (super.field3867.method737(arg0) == class180.field2393) {
            super.field3868 = 2;
        }
        if (super.field3868 < 0 || ~super.field3868 < -3) {
            super.field3868 = this.method8((byte) 4);
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)I", line = 33)
    public static final int method3(int arg0, int arg1) {
        if (arg1 != -531999640) {
            method5(36);
        }
        ++field11;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IB)I", line = 45)
    public final int method4(int arg0, byte arg1) {
        int var3 = 105 / ((arg1 - -53) / 50);
        ++field8;
        return 1;
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)V", line = 55)
    public static void method5(int arg0) {
        if (arg0 != -1) {
            method5(-89);
        }
        field10 = null;
        field2 = null;
        field6 = null;
        field7 = null;
        field5 = null;
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)V", line = 70)
    public static final void method6(byte arg0) {
        if (arg0 < 108) {
            field6 = null;
        }
        ++field12;
        class257.method1711(false);
    }

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "(I)V", line = 85)
    public static final void method7(int arg0) {
        int var1 = 0;
        if (arg0 <= 2) {
            method5(-76);
        }
        while (~var1 > ~class393.field5800) {
            class720 var2 = class729.field10120[var1];
            if (var2.field10041 == 3) {
                if (var2.field10039 != null) {
                    class686.field9647.method590(var2.field10039);
                } else {
                    var2.field10035 = Integer.MIN_VALUE;
                }
            }
            ++var1;
        }
        ++field13;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)I", line = 115)
    public final int method8(byte arg0) {
        if (arg0 != 4) {
            field6 = null;
        }
        ++field14;
        return 1;
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(ILfca;)V", line = 127)
    public class2(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(IB)V", line = 131)
    public final void method9(int arg0, byte arg1) {
        if (arg1 == -107) {
            super.field3868 = arg0;
            ++field4;
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lfca;)V", line = 144)
    public class2(class92 arg0) {
        super(arg0);
    }
}
