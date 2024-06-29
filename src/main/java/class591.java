import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class591 extends class435 {

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field8032;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "F")
    public static float field8028 = 1.0F;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "F")
    public static float field8034;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public static int field8026;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public static int field8027;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public static int field8029;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    public static int field8031;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
    public static int field8033;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "Lkl;")
    public static class87 field8030;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lbt;ZIIZII)V", line = 4)
    public static final void method3386(class48 arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class174.field2167 = arg2;
        class8.field138 = arg0;
        class753.field10443 = arg3;
        class558.field7751 = 1;
        class486.field6774 = arg5;
        class677.field9292 = arg6;
        class678.field9298 = arg1;
        class300.field3598 = null;
        field8027++;
        if (!arg4) {
            field8034 = -0.07165992F;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 24)
    public static void method3387(int arg0) {
        field8030 = null;
        if (arg0 <= 44) {
            method3389(82, -98, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IJLha;)V", line = 34)
    public static final void method3388(int arg0, long arg1, class66 arg2) {
        class482.field6732 = arg0;
        field8026++;
        class453.field6386 = class254.field2962;
        class224.field2631 = 0;
        class254.field2962 = 0;
        long var4 = class349.method2069(true);
        for (class766 var6 = (class766) class148.field1836.method2447(-125); var6 != null; var6 = (class766) class148.field1836.method2439(arg0 ^ 0xFFFFFF98)) {
            if (var6.method4249(arg2, arg1)) {
                class224.field2631++;
            }
        }
        if (class52.field710 && arg1 % 100L == 0L) {
            System.out.println("Particle system count: " + class148.field1836.method2443((byte) -73) + ", running: " + class224.field2631);
            System.out.println("Emitters: " + class482.field6732 + " Particles: " + class254.field2962 + ". Time taken: " + (class349.method2069(true) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIB)V", line = 67)
    public static final void method3389(int arg0, int arg1, byte arg2) {
        if (arg2 == -96) {
            field8029++;
            class714 var3 = class350.method2072((long) arg1, 14, (byte) 116);
            var3.method4043(6380);
            var3.field10021 = arg0;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(Z)V", line = 84)
    public final void method3390(boolean arg0) {
        field8031++;
        this.field8032.method3975();
        if (!arg0) {
            this.field8032 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I)V", line = 100)
    public class591(int arg0) {
        this.field8032 = new NativeHeap(arg0);
    }
}
