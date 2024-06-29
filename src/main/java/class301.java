import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class301 {

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "Lri;")
    public static class73 field4262 = new class73(93, 0);

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "Lcv;")
    public static class398 field4264 = new class398("LIVE", 0);

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "Lri;")
    public static class73 field4265 = new class73(13, 0);

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "Lia;")
    public static class414 field4266;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)Lkb;")
    public static final class485 method1899(int arg0, int arg1) {
        field4261++;
        class485 var2 = (class485) class482.field7072.method1536((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class173.field2556.method2945(0, arg1, true);
        class485 var4 = new class485();
        if (var3 != null) {
            var4.method2878((byte) -68, new class209(var3));
        }
        var4.method2880(116);
        class482.field7072.method1542(var4, (byte) 112, (long) arg1);
        return arg0 <= 5 ? null : var4;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
    public static final void method1900(byte arg0) {
        class287.method1853((long) class317.field4559, (byte) 96, class348.field5015);
        field4260++;
        if (class6.field79 != -1) {
            class325.method2011(class6.field79, 120);
        }
        for (int var1 = 0; var1 < class446.field6641; var1++) {
            if (class315.field4503[var1]) {
                class343.field4944[var1] = true;
            }
            class16.field183[var1] = class315.field4503[var1];
            class315.field4503[var1] = false;
        }
        class420.field6327 = class317.field4559;
        if (class348.field5015.method1073()) {
            class57.field879 = true;
        }
        if (class6.field79 != -1) {
            class446.field6641 = 0;
            class197.method1343((byte) 9);
        }
        class348.field5015.method1112();
        class30.method176(false, class202.field2925);
        class500.field7364 = 0;
        if (arg0 != 41) {
            field4266 = null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZ)I")
    public static final int method1901(int arg0, boolean arg1) {
        field4263++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else {
            if (arg1) {
                field4266 = null;
            }
            if (arg0 == 6409 || arg0 == 34846) {
                return 6409;
            } else if (arg0 == 6410 || arg0 == 34847) {
                return 6410;
            } else if (arg0 == 6402) {
                return 6402;
            } else {
                throw new IllegalArgumentException("");
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)V")
    public static void method1902(byte arg0) {
        field4266 = null;
        field4264 = null;
        int var1 = -10 / ((arg0 + 40) / 61);
        field4265 = null;
        field4262 = null;
    }
}
