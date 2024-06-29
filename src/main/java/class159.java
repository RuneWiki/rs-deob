import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class159 {

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Lqj;")
    public static class196 field2557 = class80.method502("<col=ffb000>", -48);

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Z")
    public static boolean field2556 = true;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Z")
    public static boolean field2561 = false;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field2554 = 2;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "[I")
    public static int[] field2569 = new int[128];

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public int field2563;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public int field2566;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public int field2571;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public int field2572;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "J")
    public long field2570;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Lpe;")
    public class258 field2553;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "Lpe;")
    public class258 field2558;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "Lpe;")
    public class258 field2567;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "[Lub;")
    public static class43[] field2555;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static final void method999(int arg0) {
        field2559++;
        if (!class171.field2883) {
            return;
        }
        class178 var1 = class62.method394(arg0 ^ arg0, class203.field3670, class211.field3798);
        if (var1 != null && var1.field3145 != null) {
            class157 var2 = new class157();
            var2.field2534 = var1.field3145;
            var2.field2526 = var1;
            class88.method550(var2, -110);
        }
        class171.field2883 = false;
        class214.method1472(111, var1);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
    public static final void method1000(int arg0, int arg1, int arg2) {
        int var3 = 116 / ((arg1 + 11) / 63);
        field2562++;
        class172 var4 = class14.method62(-1204912992, 1, arg0);
        var4.method1125(0);
        var4.field2901 = arg2;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static void method1001(byte arg0) {
        field2557 = null;
        field2569 = null;
        field2555 = null;
        int var1 = -120 % ((arg0 + 17) / 35);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILqj;)V")
    public static final void method1002(int arg0, class196 arg1) {
        field2568++;
        class171.field2885 = arg1;
        if (arg0 < 122 || class168.field2844.field3696 == null) {
            return;
        }
        try {
            class196 var2 = class178.field3099.method1309(0, class168.field2844.field3696);
            class196 var3 = class231.field4101.method1309(0, class168.field2844.field3696);
            class196 var4 = class93.method572(-79, new class196[] { var2, class34.field411, arg1, class90.field1323, var3 });
            class196 var5;
            if (arg1.method1299(37) == 0) {
                var5 = class93.method572(-70, new class196[] { var4, class226.field4050 });
            } else {
                var5 = class93.method572(-126, new class196[] { var4, class238.field4222, class92.method567((byte) 0, class183.method1195((byte) 120) + 94608000000L), class126.field1792, class3.method12(94608000L, 10) });
            }
            class93.method572(-89, new class196[] { class86.field1262, var5, class246.field4387 }).method1334(class168.field2844.field3696, -109);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V")
    public static final void method1003(int arg0, boolean arg1) {
        class10.method49(class249.field4407, class61.field815, class9.field103, 70, arg1);
        field2560++;
        int var2 = 50 / ((arg0 + 47) / 53);
    }
}
