import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class184 {

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field2916 = 127;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "[Lck;")
    public static class119[] field2913 = new class119[1000];

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Lvk;")
    public static class67 field2917 = new class67(5);

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "[B")
    public static byte[] field2921 = new byte[520];

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "[S")
    public static short[] field2923 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)V", line = 17)
    public static final void method1167(byte arg0, int arg1) {
        int var2 = 79 % ((-arg0 - 62) / 51);
        field2915++;
        if (class247.method1609(30881, arg1)) {
            class155.method986(class135.field2189[arg1], -1, 13046);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 30)
    public static final void method1168(byte arg0) {
        field2912++;
        if (arg0 > -48) {
            field2917 = (class67) null;
        }
        class117.field1763.method486((byte) 93);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B[S[Lck;)V", line = 44)
    public static final void method1169(byte arg0, short[] arg1, class119[] arg2) {
        field2922++;
        class257.method1645(1, arg1, 0, arg2, arg2.length - 1);
        if (arg0 < 72) {
            field2916 = -35;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lbb;I)V", line = 72)
    public static final void method1170(class1 arg0, int arg1) {
        class20.method154(200000, false, arg0);
        if (arg1 < 81) {
            field2921 = (byte[]) null;
        }
        field2914++;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V", line = 91)
    public static void method1171(byte arg0) {
        if (arg0 >= -32) {
            method1173(68);
        }
        field2917 = null;
        field2923 = null;
        field2913 = null;
        field2921 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 106)
    public static final void method1172(int arg0) {
        class6.field149.method966(arg0 ^ arg0, 33);
        class6.field149.method29(2069, 0L);
        class57.field922++;
        field2920++;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V", line = 120)
    public static final void method1173(int arg0) {
        field2919++;
        class134.field2047.method110(-57);
        for (int var1 = 0; var1 < 32; var1++) {
            class110.field1680[var1] = 0L;
        }
        if (arg0 != 32) {
            field2917 = (class67) null;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class154.field2459[var2] = 0L;
        }
        class243.field3897 = 0;
    }
}
