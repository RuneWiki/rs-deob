import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class637 {

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "Lqr;")
    public static class65 field8463 = new class65(4);

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field8464;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field8465;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "Lft;")
    public static class3 field8466;

    @OriginalMember(owner = "client!qt", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field8465++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V", line = 18)
    public static void method3492(int arg0) {
        field8463 = null;
        field8466 = null;
        if (arg0 < 20) {
            field8466 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lpaa;III)J", line = 35)
    public static final long method3493(class624 arg0, int arg1, int arg2, int arg3) {
        field8464++;
        long var4 = 4194304L;
        if (arg2 != 778239700) {
            method3492(22);
        }
        long var6 = Long.MIN_VALUE;
        class100 var8 = class462.field6333.method2008((byte) -43, arg0.method1759((byte) 109));
        long var9 = (long) (arg0.method1757((byte) -112) | 0x10000 << 14 | arg3 | arg1 << 7 | arg0.method1752((byte) -111) << 20);
        if (var8.field1363 == 0) {
            var9 |= var6;
        }
        if (var8.field1290 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg0.method1759((byte) 96) << 32;
    }
}
