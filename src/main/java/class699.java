import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class699 extends class416 {

    @OriginalMember(owner = "client!sea", name = "x", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field9727;

    @OriginalMember(owner = "client!sea", name = "t", descriptor = "I")
    public static int field9723 = -50;

    @OriginalMember(owner = "client!sea", name = "w", descriptor = "S")
    public static short field9726 = 256;

    @OriginalMember(owner = "client!sea", name = "s", descriptor = "I")
    public static int field9722;

    @OriginalMember(owner = "client!sea", name = "u", descriptor = "I")
    public static int field9724;

    @OriginalMember(owner = "client!sea", name = "v", descriptor = "I")
    public static int field9725;

    @OriginalMember(owner = "client!sea", name = "z", descriptor = "I")
    public static int field9729;

    @OriginalMember(owner = "client!sea", name = "A", descriptor = "I")
    public static int field9730;

    @OriginalMember(owner = "client!sea", name = "B", descriptor = "I")
    public static int field9731;

    @OriginalMember(owner = "client!sea", name = "y", descriptor = "[Llm;")
    public static class502[] field9728;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lvea;I)Ljava/lang/String;")
    public static final String method3929(class277 arg0, int arg1) {
        field9730++;
        if (arg1 != -8669) {
            field9723 = -34;
        }
        if (arg0.field3482 == null || arg0.field3482.length() == 0) {
            return arg0.field3475 == null || arg0.field3475.length() <= 0 ? arg0.field3483 : arg0.field3483 + class454.field6035.method2547(-79, class243.field3143) + arg0.field3475;
        } else if (arg0.field3475 == null || arg0.field3475.length() <= 0) {
            return arg0.field3483 + class454.field6035.method2547(-112, class243.field3143) + arg0.field3482;
        } else {
            return arg0.field3483 + class454.field6035.method2547(-121, class243.field3143) + arg0.field3475 + class454.field6035.method2547(-124, class243.field3143) + arg0.field3482;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIILvda;)V")
    public static final void method3930(int arg0, int arg1, int arg2, class184 arg3) {
        field9724++;
        if (!class14.field276) {
            return;
        }
        int var4 = 0;
        for (class277 var5 = (class277) arg3.field2556.method118(-30553); var5 != null; var5 = (class277) arg3.field2556.method111(22548)) {
            int var10 = class349.method2047((byte) -19, var5);
            if (var4 < var10) {
                var4 = var10;
            }
        }
        var4 += 8;
        class238.field3097 = (class697.field9709 ? 26 : 22) + arg3.field2555 * 16;
        int var6 = arg3.field2555 * 16 + 21;
        int var7 = class91.field1249 + class652.field9070;
        if (var7 + var4 > class356.field4586) {
            var7 = class652.field9070 - var4;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = class697.field9709 ? 33 : 31;
        int var9 = arg2 + 13 - var8;
        if (var6 + var9 > class466.field6263) {
            var9 = class466.field6263 - var6;
        }
        if (var9 < arg1) {
            var9 = 0;
        }
        class175.field2455 = var7;
        class454.field6068 = var9;
        class717.field9982 = arg3;
        class161.field2218 = var4;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)V")
    public final void method3931(byte arg0) {
        this.field9727.method3783();
        field9722++;
        if (arg0 <= 58) {
            field9728 = null;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IZ)V")
    public static final void method3932(int arg0, boolean arg1) {
        field9725++;
        class748.field10451.method4150(class748.field10451.field10421, 0, arg0 ^ 0xFFFFFFFB);
        class748.field10451.method4150(class748.field10451.field10412, 0, -5);
        class748.field10451.method4150(class748.field10451.field10426, 1, -5);
        class748.field10451.method4150(class748.field10451.field10393, 1, -5);
        class748.field10451.method4150(class748.field10451.field10386, arg0, -5);
        class748.field10451.method4150(class748.field10451.field10418, 0, -5);
        class748.field10451.method4150(class748.field10451.field10405, 0, arg0 ^ 0xFFFFFFFB);
        class748.field10451.method4150(class748.field10451.field10392, 0, arg0 - 5);
        class748.field10451.method4150(class748.field10451.field10390, 0, -5);
        class748.field10451.method4150(class748.field10451.field10406, 0, arg0 - 5);
        class748.field10451.method4150(class748.field10451.field10410, 0, arg0 ^ 0xFFFFFFFB);
        class748.field10451.method4150(class748.field10451.field10420, 0, -5);
        class748.field10451.method4150(class748.field10451.field10427, 0, -5);
        class748.field10451.method4150(class748.field10451.field10414, 0, -5);
        class748.field10451.method4150(class748.field10451.field10389, 0, -5);
        class748.field10451.method4150(class748.field10451.field10409, 0, -5);
        class748.field10451.method4150(class748.field10451.field10436, 0, -5);
        class748.field10451.method4150(class748.field10451.field10422, 0, -5);
        class748.field10451.method4150(class748.field10451.field10416, 0, -5);
        class533.method3060(2);
        class748.field10451.method4150(class748.field10451.field10425, 2, -5);
        class748.field10451.method4150(class748.field10451.field10430, 1, -5);
        class421.method2346(true);
        class421.method2347((byte) -47);
        class508.field7164 = true;
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(I)V")
    public class699(int arg0) {
        this.field9727 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(B)V")
    public static void method3933(byte arg0) {
        field9728 = null;
        if (arg0 >= -1) {
            field9726 = 61;
        }
    }
}
