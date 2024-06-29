import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class131 {

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "[I")
    public static int[] field2148 = new int[13];

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public int field2141;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "I")
    private int field2150;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
    public int field2152;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "Lmm;")
    public class255 field2143;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V", line = 9)
    public static final void method1138(int arg0) {
        if (class341.field5519 != null) {
            class298[] var1 = class341.field5519;
            for (int var2 = 0; var2 < var1.length; var2++) {
                class298 var3 = var1[var2];
                var3.method2066(25766);
            }
        }
        if (arg0 != 13) {
            field2148 = null;
        }
        field2149++;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)Lwt;", line = 34)
    public final synchronized class284 method1139(boolean arg0) {
        field2144++;
        class284 var2 = (class284) this.field2143.field4065.method560(arg0, (long) this.field2150);
        if (var2 != null) {
            return var2;
        }
        class284 var3 = class284.method2027(this.field2143.field4060, this.field2150, 0);
        if (var3 != null) {
            this.field2143.field4065.method559(var3, (long) this.field2150, 0);
        }
        if (arg0) {
            this.field2150 = 57;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IILie;)V", line = 56)
    private final void method1140(int arg0, int arg1, class6 arg2) {
        field2147++;
        if (arg0 < 84) {
            this.method1140(-71, 69, null);
        }
        if (arg1 == 1) {
            this.field2150 = arg2.method67(12021);
        } else if (arg1 == 2) {
            this.field2141 = arg2.method70(-9059);
            this.field2152 = arg2.method70(-9059);
            return;
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V", line = 80)
    public static void method1141(int arg0) {
        field2148 = null;
        if (arg0 != 32477) {
            method1141(52);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lie;I)Lcb;", line = 90)
    public static final class481 method1142(class6 arg0, int arg1) {
        if (arg1 == -3) {
            field2142++;
            class682 var2 = class459.method2878(-83, arg0);
            int var3 = arg0.method32((byte) 52);
            return new class481(var2.field9570, var2.field9566, var2.field9572, var2.field9561, var2.field9562, var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lie;B)V", line = 109)
    public final void method1143(class6 arg0, byte arg1) {
        if (arg1 > -51) {
            this.field2143 = null;
        }
        while (true) {
            int var3 = arg0.method70(-9059);
            if (var3 == 0) {
                field2146++;
                return;
            }
            this.method1140(106, var3, arg0);
        }
    }
}
