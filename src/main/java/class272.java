import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class272 {

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static int field4126 = 0;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "Lph;")
    public static class361 field4124;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "[[[I")
    public static int[][][] field4125;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III)V", line = 10)
    public static final void method1999(int arg0, int arg1, int arg2) {
        field4127++;
        class307.field4594[arg2] = arg0;
        class28 var3 = (class28) class64.field918.method1405((long) arg2, false);
        if (arg1 > -6) {
            method2000(0);
        }
        if (var3 == null) {
            class28 var4 = new class28(4611686018427387905L);
            class64.field918.method1400((long) arg2, 121, var4);
        } else if (var3.field387 != 4611686018427387905L) {
            var3.field387 = class176.method1234(5574) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V", line = 39)
    public static void method2000(int arg0) {
        field4124 = null;
        field4125 = (int[][][]) null;
        if (arg0 != 0) {
            field4123 = 30;
        }
    }
}
