import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class286 {

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lcl;")
    public static class132 field4846 = null;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Lwm;")
    public static class152 field4842 = class157.method1048(" loggt sich ein)3", 96);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lwm;")
    public static class152 field4845 = class157.method1048("Untersuchen", 127);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Lwm;")
    public static class152 field4848 = class157.method1048("; Max)2Age=", 100);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Lwm;")
    public static class152 field4843 = class157.method1048("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 95);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "[I")
    public static int[] field4847 = new int[100];

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lah;B)V", line = 9)
    public static final void method1927(class205 arg0, byte arg1) {
        if (arg1 >= -46) {
            field4843 = (class152) null;
        }
        class55.field861 = arg0;
        field4849++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 36)
    public static final void method1928(byte arg0) {
        if ((class41.field660 < class213.field3484)) {
            class41.field660 = (float) ((double) class41.field660 / 30.0D + (double) class41.field660);
            if (class213.field3484 < class41.field660) {
                class41.field660 = class213.field3484;
            }
            class79.method521((byte) -79);
        } else if (class213.field3484 < class41.field660) {
            class41.field660 = (float) ((double) class41.field660 - (double) class41.field660 / 30.0D);
            if (class213.field3484 > class41.field660) {
                class41.field660 = class213.field3484;
            }
            class79.method521((byte) -121);
        }
        if (arg0 != 25) {
            method1929(false);
        }
        if (class183.field2920 != -1 && class208.field3392 != -1) {
            int var1 = class208.field3392 - class84.field1158;
            int var2 = class183.field2920 - class146.field2244;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class146.field2244 += var2;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            if (var2 == 0 && var1 == 0) {
                class183.field2920 = -1;
                class208.field3392 = -1;
            }
            class84.field1158 -= -var1;
            class79.method521((byte) -94);
        }
        field4844++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 116)
    public static void method1929(boolean arg0) {
        if (arg0) {
            method1928((byte) -91);
        }
        field4843 = null;
        field4845 = null;
        field4847 = null;
        field4848 = null;
        field4842 = null;
    }
}
