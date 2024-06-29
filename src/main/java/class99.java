import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class99 {

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Ltj;")
    public static class73 field1478 = new class73(64);

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field1480 = 0;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "Lma;")
    public static class5 field1483 = class12.method119("::rect_debug", (byte) 127);

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Lma;")
    public static class5 field1481 = class12.method119("loc", (byte) 104);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Lii;")
    public static class221 field1482;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lqe;I)V", line = 5)
    public static final void method634(class186 arg0, int arg1) {
        field1479++;
        long var2 = 0L;
        if (arg0.field2929 == 0) {
            var2 = class223.method1576(arg0.field2920, arg0.field2923, arg0.field2918);
        }
        int var4 = -1;
        int var5 = 0;
        if (arg0.field2929 == 1) {
            var2 = class14.method134(arg0.field2920, arg0.field2923, arg0.field2918);
        }
        if (arg0.field2929 == 2) {
            var2 = class158.method1013(arg0.field2920, arg0.field2923, arg0.field2918);
        }
        if (arg0.field2929 == 3) {
            var2 = class157.method1008(arg0.field2920, arg0.field2923, arg0.field2918);
        }
        if (arg1 != -1550739730) {
            field1483 = (class5) null;
        }
        int var6 = 0;
        if (var2 != 0L) {
            var5 = (int) var2 >> 20 & 0x3;
            var6 = (int) var2 >> 14 & 0x1F;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
        }
        arg0.field2915 = var4;
        arg0.field2925 = var5;
        arg0.field2922 = var6;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 55)
    public static void method635(byte arg0) {
        field1481 = null;
        field1483 = null;
        if (arg0 == 101) {
            field1482 = null;
            field1478 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V", line = 75)
    public static final void method636(int arg0, int arg1) {
        field1477++;
        if (arg0 == 0) {
            class255 var2 = (class255) class300.field5062.method1372(false, (long) arg1);
            if (var2 != null) {
                var2.method1997(-27381);
            }
        }
    }
}
