import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class194 {

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "Luf;")
    private static class168 field3149 = class148.method1019(-1720, "OFF");

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "Luf;")
    public static class168 field3152 = class148.method1019(-1720, "null");

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field3153 = 0;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "Luf;")
    public static class168 field3151 = field3149;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "[Llk;")
    public static class179[] field3156 = new class179[6];

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Lej;")
    public static class204 field3147 = new class204(64);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Ldk;")
    public static class241 field3155;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)I", line = 4)
    public static final int method1366(int arg0, byte arg1) {
        field3150++;
        int var2 = -85 % ((-arg1 - 28) / 38);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V", line = 14)
    public static void method1367(byte arg0) {
        field3156 = null;
        if (arg0 != 42) {
            field3152 = (class168) null;
        }
        field3155 = null;
        field3149 = null;
        field3151 = null;
        field3152 = null;
        field3147 = null;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)J", line = 30)
    public static final synchronized long method1368(byte arg0) {
        int var1 = 107 % ((arg0 + 57) / 45);
        long var2 = System.currentTimeMillis();
        if (class218.field3552 > var2) {
            class254.field4342 += class218.field3552 - var2;
        }
        field3148++;
        class218.field3552 = var2;
        return class254.field4342 + var2;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILrh;)V", line = 70)
    public static final void method1369(int arg0, class16 arg1) {
        arg1.field180 = false;
        if (arg1.field182 != null) {
            arg1.field182.field4263 = 0;
        }
        if (arg0 != 0) {
            field3152 = (class168) null;
        }
        for (class16 var2 = arg1.method72(); var2 != null; var2 = arg1.method71()) {
            method1369(0, var2);
        }
        field3157++;
    }
}
