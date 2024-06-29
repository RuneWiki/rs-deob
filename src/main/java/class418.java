import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class418 extends class698 {

    @OriginalMember(owner = "client!dba", name = "x", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field5947;

    @OriginalMember(owner = "client!dba", name = "s", descriptor = "I")
    public static int field5942 = 0;

    @OriginalMember(owner = "client!dba", name = "w", descriptor = "Ltl;")
    public static class122 field5946 = new class122(0, 0);

    @OriginalMember(owner = "client!dba", name = "A", descriptor = "[S")
    private static short[] field5950 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!dba", name = "B", descriptor = "[S")
    private static short[] field5951 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!dba", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field5954 = new String[200];

    @OriginalMember(owner = "client!dba", name = "C", descriptor = "[S")
    private static short[] field5952 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!dba", name = "D", descriptor = "[S")
    private static short[] field5953 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!dba", name = "F", descriptor = "[[S")
    public static short[][] field5955 = new short[][] { field5952, field5953, field5951, field5950 };

    @OriginalMember(owner = "client!dba", name = "t", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!dba", name = "v", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!dba", name = "y", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!dba", name = "z", descriptor = "Lg;")
    public static class129 field5949;

    @OriginalMember(owner = "client!dba", name = "u", descriptor = "Lvo;")
    public static class345 field5944;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IZ)V")
    public static final void method2476(int arg0, boolean arg1) {
        field5945++;
        if (class476.field6818.length() == 0) {
            return;
        }
        class28.method269(32316, "--> " + class476.field6818);
        class490.method2863(arg1, false, (byte) 80, class476.field6818);
        class476.field6818 = "";
        class149.field2511 = arg0;
        class685.field9735 = 0;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V")
    public static void method2477(int arg0) {
        field5955 = null;
        field5944 = null;
        field5949 = null;
        field5951 = null;
        field5946 = null;
        if (arg0 == -27513) {
            field5950 = null;
            field5954 = null;
            field5953 = null;
            field5952 = null;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
    public static final void method2478(int arg0, String arg1, String arg2, String arg3, int arg4, String arg5, int arg6) {
        field5943++;
        class244.method1573(arg4, arg0, null, arg2, -1, (byte) -87, arg3, arg1, arg5);
        if (arg6 != 0) {
            method2476(-16, true);
        }
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(I)V")
    public final void method2479(int arg0) {
        field5948++;
        if (arg0 != -12483) {
            method2476(56, true);
        }
        this.field5947.method2027();
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(I)V")
    public class418(int arg0) {
        this.field5947 = new NativeHeap(arg0);
    }
}
