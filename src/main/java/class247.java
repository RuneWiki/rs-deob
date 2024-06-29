import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class247 extends class416 {

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field3211;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "Z")
    public static boolean field3206 = false;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field3207 = -1;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "D")
    public static double field3208;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
    public static final void method1480(int arg0, int arg1, int arg2) {
        field3214++;
        if (arg2 == 9767) {
            class252 var3 = class150.method916(arg1, -68, 6);
            var3.method1502((byte) -103);
            var3.field3251 = arg0;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
    public final void method1481(byte arg0) {
        field3215++;
        this.field3211.method3780();
        if (arg0 != 36) {
            method1482(-128, -23, -19);
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(III)Z")
    public static final boolean method1482(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method1483(-45, 78);
        }
        field3213++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(I)V")
    public class247(int arg0) {
        this.field3211 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)Z")
    public static final boolean method1483(int arg0, int arg1) {
        if (arg0 == -11297) {
            field3209++;
            return arg1 == 10 || arg1 == 11 || arg1 == 12;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public static final void method1484(String arg0, int arg1, byte arg2) {
        int var3 = -7 / ((arg2 - 5) / 32);
        class270.method1616((byte) 122, arg1, arg0, 0, "", "", "");
        field3210++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIZIIIIII)V")
    public static final void method1485(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3212++;
        if (arg1 >= class122.field1604 && class165.field2070 >= arg1 && class122.field1604 <= arg0 && arg0 <= class165.field2070 && class122.field1604 <= arg2 && class165.field2070 >= arg2 && arg9 >= class122.field1604 && class165.field2070 >= arg9 && arg8 >= class759.field10576 && arg8 <= class29.field238 && class759.field10576 <= arg5 && arg5 <= class29.field238 && arg4 >= class759.field10576 && class29.field238 >= arg4 && class759.field10576 <= arg6 && class29.field238 >= arg6) {
            class675.method3837(arg8, arg4, arg6, arg0, arg1, arg7, arg2, arg9, arg5, 22024);
        } else {
            class525.method2915(arg1, arg7, arg4, arg0, (byte) -67, arg9, arg2, arg6, arg8, arg5);
        }
        if (!arg3) {
            method1482(87, 47, -5);
        }
    }
}
