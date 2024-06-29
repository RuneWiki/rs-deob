import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class28 extends class117 {

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "J")
    public long field387;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field389 = 0;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "Lth;")
    public static class57 field391 = new class57(64);

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public static int field395 = 0;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "Ltl;")
    public static class64 field396;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V", line = 7)
    public static void method174(int arg0) {
        if (arg0 <= -19) {
            field396 = null;
            field391 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLph;)V", line = 18)
    public static final void method175(byte arg0, class361 arg1) {
        class160.field2321 = arg1;
        if (arg0 != 78) {
            field396 = (class64) null;
        }
        field390++;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V", line = 27)
    public class28() {
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLjava/lang/String;)I", line = 37)
    public static final int method176(byte arg0, String arg1) {
        field392++;
        return arg0 == 28 ? class157.method1137(10, -114, true, arg1) : -30;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 51)
    public static final void method177(String arg0, int arg1) {
        field393++;
        if (arg1 != -19420) {
            method174(21);
        }
        class247.method1814("", arg1 + 19419, "", 0, 0, arg0);
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(J)V", line = 61)
    public class28(long arg0) {
        this.field387 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IC)Z", line = 70)
    public static final boolean method178(int arg0, char arg1) {
        field394++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg0 != 160) {
            method174(-97);
        }
        if (arg1 != '\u0000') {
            char[] var2 = class98.field1382;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }
}
