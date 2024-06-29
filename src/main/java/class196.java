import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class196 extends class152 {

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field2342 = 0;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Lhj;")
    public static class596 field2340 = new class596(132, 1);

    @OriginalMember(owner = "client!r", name = "z", descriptor = "Lml;")
    public static class408 field2343 = new class408();

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method1285(int arg0) {
        if (arg0 == 0) {
            field2340 = null;
            field2343 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIILqb;)J")
    public static final long method1286(int arg0, int arg1, int arg2, class238 arg3) {
        if (arg2 != 26047) {
            field2343 = null;
        }
        field2339++;
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class174 var8 = class379.field4811.method4192(27324, arg3.method927(arg2 - 50529));
        long var9 = (long) (arg1 << 7 | arg0 | arg3.method929((byte) -45) << 14 | arg3.method928(13272) << 20 | 0x40000000);
        if (var8.field2171 == 0) {
            var9 |= var6;
        }
        if (var8.field2085 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg3.method927(arg2 - 50529) << 32;
    }
}
