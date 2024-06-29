import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class222 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "J")
    public long field4006;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Lre;")
    public class222 field4005;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Lre;")
    public class222 field4007;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "[I")
    public static int[] field4002;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static void method1541(int arg0) {
        if (arg0 == 3000) {
            field4002 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BZ)V")
    public static final void method1542(byte arg0, boolean arg1) {
        if (arg1) {
            if (class69.field1262 != -1) {
                class7.method29(true, class69.field1262);
            }
            for (class214 var2 = (class214) class255.field4610.method132((byte) 103); var2 != null; var2 = (class214) class255.field4610.method136(97)) {
                class66.method454(arg0 ^ 0xFFFFFFC5, var2, true);
            }
            class69.field1262 = -1;
            class255.field4610 = new class25(8);
            class9.method39(false);
            class69.field1262 = class16.field226;
            class171.method1229(false, arg0 + 170);
            class39.method226(arg0 - 14803);
            class228.method1567(class69.field1262, false);
        }
        field4004++;
        class273.field4859 = -1;
        class273.method1810(class157.field2789, -28940);
        class166.field2927 = new class237();
        class166.field2927.field3868 = 3000;
        class166.field2927.field3784 = 3000;
        class41.method234(class246.field4436, -2093787704);
        class19.method88(10, false);
        if (arg0 != -60) {
            method1541(-78);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)Z")
    public final boolean method1543(byte arg0) {
        field4008++;
        if (this.field4005 == null) {
            return false;
        } else {
            if (arg0 != 41) {
                this.field4005 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
    public final void method1544(byte arg0) {
        if (arg0 >= -22) {
            return;
        }
        field4003++;
        if (this.field4005 != null) {
            this.field4005.field4007 = this.field4007;
            this.field4007.field4005 = this.field4005;
            this.field4007 = null;
            this.field4005 = null;
        }
    }
}
