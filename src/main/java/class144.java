import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class144 {

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2628 = 0;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Llg;")
    public static class137 field2627;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lcg;")
    public static class49 field2622;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lcg;")
    public static class49 field2625;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "[[B")
    public static byte[][] field2624;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I", line = 7)
    public static int method1159(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V", line = 16)
    public static void method1160(byte arg0) {
        if (arg0 == 32) {
            field2627 = null;
            field2622 = null;
            field2625 = null;
            field2624 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)V", line = 40)
    public static final void method1161(int arg0, int arg1, int arg2) {
        field2623++;
        class213 var3 = class261.method1801(arg0, 10812);
        int var4 = var3.field3578;
        int var5 = var3.field3583;
        int var6 = class71.field1169[var5 - var4];
        int var7 = var3.field3584;
        if (arg2 > arg1 || arg1 > var6) {
            arg1 = 0;
        }
        int var8 = var6 << var4;
        class116.method995(var7, false, class116.field2006[var7] & ~var8 | arg1 << var4 & var8);
    }
}
