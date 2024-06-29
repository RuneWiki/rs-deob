import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class456 extends class64 {

    @OriginalMember(owner = "client!tp", name = "w", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field6424;

    @OriginalMember(owner = "client!tp", name = "v", descriptor = "Ldm;")
    public static class46 field6423 = new class46();

    @OriginalMember(owner = "client!tp", name = "x", descriptor = "[I")
    public static int[] field6425 = new int[2];

    @OriginalMember(owner = "client!tp", name = "y", descriptor = "Lcba;")
    public static class471 field6426 = new class471(89, -1);

    @OriginalMember(owner = "client!tp", name = "s", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!tp", name = "t", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!tp", name = "u", descriptor = "I")
    public static int field6422;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V")
    public final void method2669(int arg0) {
        field6420++;
        this.field6424.method3287();
        if (arg0 != 89) {
            method2672((char) 65506, -92, null);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lqa;I)V")
    public static final void method2670(class207 arg0, int arg1) {
        field6422++;
        if (class210.field2962 == class645.field9372.field6035 || class356.field4807 == null) {
            return;
        }
        if (arg1 != 0) {
            field6425 = null;
        }
        if (class448.method2646((byte) 121, class645.field9372.field6035, arg0)) {
            class210.field2962 = class645.field9372.field6035;
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)V")
    public static void method2671(byte arg0) {
        field6426 = null;
        field6423 = null;
        field6425 = null;
        if (arg0 > -11) {
            method2670(null, 64);
        }
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(I)V")
    public class456(int arg0) {
        this.field6424 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(CILjava/lang/String;)I")
    public static final int method2672(char arg0, int arg1, String arg2) {
        field6421++;
        int var3 = 0;
        int var4 = arg2.length();
        int var5 = 9 % ((38 - arg1) / 52);
        for (int var6 = 0; var6 < var4; var6++) {
            if (arg0 == arg2.charAt(var6)) {
                var3++;
            }
        }
        return var3;
    }
}
