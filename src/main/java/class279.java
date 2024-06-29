import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class279 {

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
    public int field3788;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "Lbv;")
    public static class279 field3787 = new class279(1);

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "Lbv;")
    public static class279 field3791 = new class279(2);

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "Lbv;")
    public static class279 field3792 = new class279(4);

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "Lbv;")
    public static class279 field3793 = new class279(1);

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "Lbv;")
    public static class279 field3794 = new class279(2);

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "Lbv;")
    public static class279 field3795 = new class279(4);

    @OriginalMember(owner = "client!bv", name = "k", descriptor = "Lbv;")
    public static class279 field3796 = new class279(2);

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "Lbv;")
    public static class279 field3797 = new class279(4);

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "Lwo;")
    public static class690 field3800 = new class690(40, 12);

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "Ljn;")
    public static class668 field3798;

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field3799;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BILjn;IJZII)V", line = 4)
    public static final void method1679(byte arg0, int arg1, class668 arg2, int arg3, long arg4, boolean arg5, int arg6, int arg7) {
        class160.field1957 = arg1;
        class548.field7959 = null;
        field3790++;
        class74.field1112 = arg2;
        class511.field7473 = arg3;
        class108.field1399 = arg7;
        int var9 = -14 % ((-arg0 - 64) / 39);
        class42.field762 = 10000;
        class505.field7053 = 1;
        class287.field3874 = arg4;
        class190.field2312 = arg5;
        class426.field6123 = arg6;
    }

    @OriginalMember(owner = "client!bv", name = "toString", descriptor = "()Ljava/lang/String;", line = 25)
    public final String toString() {
        field3789++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(I)V", line = 35)
    private class279(int arg0) {
        this.field3788 = arg0;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lub;Z[[[BIB)Z", line = 43)
    public static final boolean method1680(class20 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class266.field3658) {
            return false;
        }
        int var5 = arg0.field530 >> class295.field3981;
        int var6 = arg0.field531 >> class295.field3981;
        if (var5 < class382.field5106 || var5 >= class215.field2738 || var6 < class123.field1588 || var6 >= class633.field9096) {
            return true;
        } else if ((arg2 == null || arg0.field532 < arg3 || arg2[arg0.field532][var5][var6] != arg4) && arg0.method339(121) && !arg0.method335((byte) -83)) {
            return false;
        } else {
            if (!arg1 && var5 >= class591.field8564 - 16 && var5 <= class591.field8564 + 16 && var6 >= class33.field663 - 16 && var6 <= class33.field663 + 16) {
                if (class72.field1090) {
                    class27.field609[class74.field1111++].method533(arg0, (byte) 38);
                    class74.field1111 %= class346.field4551;
                } else {
                    arg0.method162(class298.field4017, false);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V", line = 82)
    public static void method1681(int arg0) {
        field3796 = null;
        if (arg0 < 126) {
            method1681(-6);
        }
        field3793 = null;
        field3792 = null;
        field3799 = null;
        field3798 = null;
        field3800 = null;
        field3794 = null;
        field3791 = null;
        field3797 = null;
        field3795 = null;
        field3787 = null;
    }
}
