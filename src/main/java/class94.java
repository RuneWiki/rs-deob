import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class94 extends class204 {

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field1099 = 0;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Lv;")
    public static class165 field1093;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "[Lnd;")
    public static class138[] field1092;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 4)
    public final void method486(int arg0) {
        if (arg0 != -4591) {
            method678(82);
        }
        ++field1094;
        if (~super.field2852 != -2 && ~super.field2852 != -1) {
            super.field2852 = this.method490((byte) 106);
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lfs;)V", line = 20)
    public class94(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)I", line = 24)
    public final int method677(byte arg0) {
        ++field1100;
        if (arg0 != -98) {
            field1093 = null;
        }
        return super.field2852;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(II)V", line = 35)
    public final void method488(int arg0, int arg1) {
        super.field2852 = arg0;
        ++field1097;
        if (arg1 > -105) {
            this.method677((byte) -28);
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(ILfs;)V", line = 46)
    public class94(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V", line = 49)
    public static void method678(int arg0) {
        field1092 = null;
        int var1 = -27 / ((-9 - arg0) / 34);
        field1093 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I", line = 62)
    public final int method487(int arg0, int arg1) {
        int var3 = -98 % ((-57 - arg1) / 60);
        ++field1098;
        return 1;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lae;IIIIZB)V", line = 72)
    public static final void method679(class283 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte arg6) {
        int var7 = 12 / ((70 - arg6) / 53);
        if (~arg1 >= -1) {
            class707.method3988(arg4, (byte) -98, arg2, arg3, arg5, arg0);
        } else {
            class748.field10330 = arg3;
            class354.field5120 = arg2;
            class194.field2599 = arg5;
            class20.field171 = 1;
            class793.field10868 = arg4;
            class164.field2097 = arg0;
            class574.field8079 = null;
            class565.field7982 = class493.field6796.method603((byte) 116) / arg1;
            if (~class565.field7982 > -2) {
                class565.field7982 = 1;
            }
        }
        ++field1095;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)I", line = 108)
    public final int method490(byte arg0) {
        ++field1096;
        if (arg0 <= 83) {
            this.method486(-64);
        }
        return 1;
    }
}
