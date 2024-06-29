import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class363 {

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field5021 = 0;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field5019 = 0;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "J")
    public static long field5017 = 0L;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Lsn;")
    public static final class450 method2284(int arg0) {
        field5022++;
        if (arg0 <= 41) {
            method2285(-122, -70);
        }
        class450 var1 = (class450) class180.field2637.method2234(9700);
        if (var1 != null) {
            var1.method2367(5);
            var1.method1902(32);
            return var1;
        }
        class450 var2;
        do {
            var2 = (class450) class5.field34.method2234(9700);
            if (var2 == null) {
                return null;
            }
            if (var2.method2801(28057) > class108.method902((byte) -93)) {
                return null;
            }
            var2.method2367(5);
            var2.method1902(32);
        } while ((Long.MIN_VALUE & var2.field3984) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V")
    public static final void method2285(int arg0, int arg1) {
        field5023++;
        class22.field406 = arg0;
        class410 var2 = class388.field5462;
        synchronized (class388.field5462) {
            if (arg1 != -12463) {
                method2284(-61);
            }
            class388.field5462.method2533(arg1 + 12463);
        }
        class410 var3 = class68.field1018;
        synchronized (class68.field1018) {
            class68.field1018.method2533(0);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V")
    public static final void method2286(boolean arg0, int arg1) {
        field5024++;
        if (!arg0) {
            class298.field4010.method2534(0, arg1);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lrk;I)I")
    public static final int method2287(class427 arg0, int arg1) {
        field5018++;
        int var2 = arg1;
        if (arg0.method2635(class239.field3316, (byte) -98)) {
            var2 = arg1 + 1;
        }
        if (arg0.method2635(class232.field3200, (byte) 77)) {
            var2++;
        }
        return var2;
    }
}
