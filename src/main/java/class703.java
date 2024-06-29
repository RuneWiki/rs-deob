import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class703 extends class493 {

    @OriginalMember(owner = "client!rw", name = "u", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field9951;

    @OriginalMember(owner = "client!rw", name = "p", descriptor = "I")
    public static int field9946 = 0;

    @OriginalMember(owner = "client!rw", name = "s", descriptor = "I")
    public static int field9949 = 0;

    @OriginalMember(owner = "client!rw", name = "n", descriptor = "I")
    public static int field9944;

    @OriginalMember(owner = "client!rw", name = "o", descriptor = "I")
    public static int field9945;

    @OriginalMember(owner = "client!rw", name = "q", descriptor = "I")
    public static int field9947;

    @OriginalMember(owner = "client!rw", name = "r", descriptor = "I")
    public static int field9948;

    @OriginalMember(owner = "client!rw", name = "v", descriptor = "I")
    public static int field9952;

    @OriginalMember(owner = "client!rw", name = "t", descriptor = "Ljava/lang/Object;")
    public static Object field9950;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 5)
    public static final String[] method3936(int arg0, String[] arg1) {
        field9947++;
        String[] var2 = new String[5];
        if (arg0 != 16672) {
            field9946 = 23;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIII)I", line = 33)
    public static final int method3937(int arg0, int arg1, int arg2, int arg3) {
        field9948++;
        if (arg0 == arg2) {
            return arg0;
        }
        int var4 = 128 - arg3;
        int var5 = (arg0 & 0x7F) * var4 + (arg2 & 0x7F) * arg3 >> 7;
        int var6 = (arg0 & 0x380) * var4 + ((arg2 & 0x380) * arg3) >> 7;
        if (arg1 >= -28) {
            return 111;
        } else {
            int var7 = (arg0 & 0xFC00) * var4 + ((arg2 & 0xFC00) * arg3) >> 7;
            return var5 & 0x7F | var6 & 0x380 | var7 & 0xFC00;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(III)Lmk;", line = 57)
    public static final class51 method3938(int arg0, int arg1, int arg2) {
        if (arg0 != -1989279584) {
            method3937(-82, -110, -43, -57);
        }
        field9944++;
        class51 var3 = (class51) class483.field6636.method970((byte) 89, (long) arg1 | (long) arg2 << 32);
        if (var3 == null) {
            var3 = new class51(arg2, arg1);
            class483.field6636.method968(var3.field5623, var3, -1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V", line = 80)
    public final void method3939(int arg0) {
        field9945++;
        this.field9951.method3472();
        if (arg0 != 0) {
            this.method3939(1);
        }
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(I)V", line = 96)
    public class703(int arg0) {
        this.field9951 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)V", line = 104)
    public static void method3940(int arg0) {
        field9950 = null;
        if (arg0 != 896) {
            method3940(22);
        }
    }
}
