import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public abstract class class73 {

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field1044 = new String[200];

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "Lbj;")
    public static class131 field1045 = new class131(64);

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field1048 = 0;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field1047 = -1;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "Lfc;")
    public static class141 field1042;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V", line = 3)
    public static void method540(boolean arg0) {
        if (arg0) {
            field1047 = 101;
        }
        field1045 = null;
        field1042 = null;
        field1044 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIII)V", line = 17)
    public static final void method541(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class154.field2161 = arg1;
        if (arg2 != 64) {
            field1045 = null;
        }
        field1046++;
        class233.field3350 = arg4;
        class290.field4058 = arg0;
        class442.field6212 = arg3;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)V", line = 34)
    public static final void method543(int arg0, byte arg1) {
        if (arg1 != -124) {
            field1044 = null;
        }
        field1041++;
        class248.field3509.method901(arg0, arg1 ^ 0xFFFFD03B);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V", line = 45)
    public static final void method544(int arg0, int arg1) {
        class131 var2 = class67.field1004;
        synchronized (class67.field1004) {
            if (arg0 != -14767) {
                return;
            }
            class67.field1004.method901(arg1, arg0 ^ 0xFFFFE9EE);
        }
        field1043++;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(Z)Z")
    public abstract boolean method542(boolean arg0);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)J")
    public abstract long method545(int arg0);

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)I")
    public abstract int method546(int arg0);

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)C")
    public abstract char method547(int arg0);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)I")
    public abstract int method548(byte arg0);
}
