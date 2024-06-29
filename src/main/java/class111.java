import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class111 {

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public int field1459 = 0;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Lpf;")
    public static class425 field1458 = new class425(24, 12);

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lwl;")
    public static class452 field1460 = new class452(95, 2);

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Z")
    public static boolean field1462 = true;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "F")
    public static float field1461;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lef;II)V")
    private final void method678(class385 arg0, int arg1, int arg2) {
        field1457++;
        if (arg2 == 5) {
            this.field1459 = arg0.method2323(-127);
        }
        int var4 = -13 % ((arg1 - 19) / 47);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILef;)V")
    public final void method679(int arg0, class385 arg1) {
        while (true) {
            int var3 = arg1.method2343(255);
            if (var3 == 0) {
                int var4 = 98 % ((-arg0 - 16) / 46);
                field1456++;
                return;
            }
            this.method678(arg1, -114, var3);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public static void method680(boolean arg0) {
        if (arg0) {
            field1461 = -1.5231469F;
        }
        field1460 = null;
        field1458 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIILfh;)V")
    public static final void method681(int arg0, int arg1, int arg2, class170 arg3) {
        field1455++;
        if (class14.field173 != null || class306.field4628 || arg3 == null || class347.method2108(arg3, (byte) -57) == null) {
            return;
        }
        class14.field173 = arg3;
        class402.field6011 = class347.method2108(arg3, (byte) -57);
        class365.field5368 = false;
        class247.field3703 = arg1;
        class146.field2029 = arg2;
        class314.field4764 = arg0;
    }
}
