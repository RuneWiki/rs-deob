import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class class236 {

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lea;")
    public static class547 field3095 = new class547(99, 0);

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "Lea;")
    public static class547 field3096 = new class547(44, 4);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "Lsba;")
    public static class218 field3097;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILni;[ILni;)V", line = 13)
    public static final void method1422(int arg0, class522 arg1, int[] arg2, class522 arg3) {
        if (arg0 != 3) {
            method1422(-54, null, null, null);
        }
        if (arg2 != null) {
            class427.field6031 = arg2;
        }
        field3098++;
        class473.field6550 = arg1;
        class421.field5901 = arg3;
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)V", line = 31)
    public static void method1424(byte arg0) {
        field3095 = null;
        field3096 = null;
        field3097 = null;
        if (arg0 != 72) {
            method1427(67, (byte) -65, 92);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V", line = 43)
    public static final void method1425(int arg0, int arg1) {
        field3099++;
        class252 var2 = class150.method916(arg1, arg0 ^ 0xFFFFFFF2, 14);
        var2.method1497(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBI)I", line = 57)
    public static final int method1427(int arg0, byte arg1, int arg2) {
        field3094++;
        if (arg0 == 1 || arg0 == 3) {
            return class411.field5798[arg2 & 0x3];
        } else if (arg1 == -72) {
            return class291.field3852[arg2 & 0x3];
        } else {
            return -111;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    public abstract void method1420(byte arg0);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
    public abstract void method1421(byte arg0);

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)Ldb;")
    public abstract class326 method1423(byte arg0);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)Z")
    public abstract boolean method1426(int arg0, int arg1);
}
