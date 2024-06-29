import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class172 extends class224 {

    @OriginalMember(owner = "client!hga", name = "y", descriptor = "D")
    public double field2496;

    @OriginalMember(owner = "client!hga", name = "z", descriptor = "[[S")
    public short[][] field2497;

    @OriginalMember(owner = "client!hga", name = "A", descriptor = "I")
    public static int field2498 = 0;

    @OriginalMember(owner = "client!hga", name = "x", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!hga", name = "B", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!hga", name = "C", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)J", line = 6)
    public final long method1259(int arg0) {
        if (arg0 != -761742816) {
            method1260(-39);
        }
        field2499++;
        return (long) (this.field2497[0].length | this.field2497.length << 0);
    }

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "(I)V", line = 23)
    public static final void method1260(int arg0) {
        if (arg0 < 91) {
            return;
        }
        field2495++;
        for (class226 var1 = (class226) class476.field6811.method1522(true); var1 != null; var1 = (class226) class476.field6811.method1527((byte) 102)) {
            if (var1.field3234 > 0) {
                var1.field3234--;
            }
            if (var1.field3234 != 0) {
                if (var1.field3222 > 0) {
                    var1.field3222--;
                }
                if (var1.field3222 == 0 && var1.field3237 >= 1 && var1.field3225 >= 1 && (class174.field2540 - 2) >= var1.field3237 && var1.field3225 <= class716.field9999 - 2 && (var1.field3233 < 0 || class364.method2273(4, var1.field3233, var1.field3236))) {
                    class230.method1582(var1.field3231, -2, var1.field3235, var1.field3225, -1, var1.field3230, var1.field3237, var1.field3233, var1.field3236);
                    var1.field3222 = -1;
                    if (var1.field3233 == var1.field3224 && var1.field3224 == -1) {
                        var1.method3617(1);
                    } else if (var1.field3233 == var1.field3224 && var1.field3231 == var1.field3223 && var1.field3236 == var1.field3228) {
                        var1.method3617(1);
                    }
                }
            } else if (var1.field3224 < 0 || class364.method2273(4, var1.field3224, var1.field3228)) {
                class230.method1582(var1.field3223, -2, var1.field3235, var1.field3225, -1, var1.field3230, var1.field3237, var1.field3224, var1.field3228);
                var1.method3617(1);
            }
        }
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "([[SD)V", line = 79)
    public class172(short[][] arg0, double arg1) {
        this.field2496 = arg1;
        this.field2497 = arg0;
    }
}
