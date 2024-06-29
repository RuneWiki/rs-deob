import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class493 {

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field40;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "Z")
    public static boolean field35 = false;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "Z")
    public static boolean field37 = false;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Z")
    public static volatile boolean field36 = true;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "Lsea;")
    public static class648 field43;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)I", line = 4)
    public static final int method11(int arg0, int arg1, int arg2) {
        field42++;
        int var3 = class34.method309((byte) -120, arg1 - 1, arg2 + -1) + class34.method309((byte) -120, arg1 + 1, arg2 + -1) + class34.method309((byte) -120, arg1 + -1, arg2 + 1) + class34.method309((byte) -120, arg1 + 1, arg2 + 1);
        int var4 = class34.method309((byte) -120, arg1 - 1, arg2) + class34.method309((byte) -120, arg1 + 1, arg2) - (-class34.method309((byte) -120, arg1, arg2 + -1) - class34.method309((byte) -120, arg1, arg2 + 1));
        int var5 = class34.method309((byte) -120, arg1, arg2);
        if (arg0 != 9128) {
            field36 = true;
        }
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V", line = 23)
    public static void method12(byte arg0) {
        int var1 = -82 % ((78 - arg0) / 46);
        field43 = null;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V", line = 32)
    public final void method13(byte arg0) {
        if (arg0 != 72) {
            method12((byte) 126);
        }
        this.field40.method3472();
        field38++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BZZ)V", line = 48)
    public static final void method14(byte arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            class392.field5548--;
            if (class392.field5548 == 0) {
                class78.field1186 = null;
            }
        }
        if (arg0 != -121) {
            return;
        }
        field39++;
        if (!arg1) {
            return;
        }
        class457.field6344--;
        if (class457.field6344 == 0) {
            class244.field3322 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIBII)V", line = 79)
    public static final void method15(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 != 3) {
            field43 = null;
        }
        field41++;
        if ((arg0 - arg1) >= class128.field1831 && (arg0 + arg1) <= class529.field7169 && class469.field6466 <= arg5 - arg1 && class533.field7200 >= (arg1 + arg5)) {
            class396.method2325(-1, arg1, arg6, arg0, arg2, arg5, arg3);
        } else {
            class585.method3330(arg2, arg1, arg3, arg0, -1, arg5, arg6);
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V", line = 101)
    public class5(int arg0) {
        this.field40 = new NativeHeap(arg0);
    }
}
