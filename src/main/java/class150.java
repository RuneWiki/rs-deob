import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class150 extends class408 {

    @OriginalMember(owner = "client!ho", name = "A", descriptor = "Lada;")
    public static class164 field2337 = new class164();

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!ho", name = "B", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!ho", name = "C", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!ho", name = "D", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!ho", name = "E", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
    public int field2342;

    @OriginalMember(owner = "client!ho", name = "G", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!ho", name = "I", descriptor = "I")
    public int field2345;

    @OriginalMember(owner = "client!ho", name = "J", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!ho", name = "y", descriptor = "Ltj;")
    public static class197 field2335;

    @OriginalMember(owner = "client!ho", name = "H", descriptor = "Ljava/lang/String;")
    public String field2344;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)I", line = 5)
    public final int method1114(int arg0) {
        if (arg0 != -17179) {
            return -117;
        } else {
            ++field2340;
            return (int) (super.field2810 >>> 32 & 255L);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V", line = 19)
    public final void method1115(boolean arg0) {
        ++field2338;
        if (!arg0) {
            this.method1116(-103);
        }
        super.field6154 = Long.MIN_VALUE & super.field6154 | class524.method3075(18) - -500L;
        class132.field1776.method3505(this, 4);
    }

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)V", line = 33)
    public final void method1116(int arg0) {
        super.field6154 |= Long.MIN_VALUE;
        ++field2341;
        if (arg0 <= 18) {
            this.method1116(125);
        }
        if (~this.method1117(255) == -1L) {
            class132.field1781.method3505(this, 4);
        }
    }

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "(I)J", line = 49)
    public final long method1117(int arg0) {
        ++field2336;
        return arg0 != 255 ? 113L : super.field6154 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)I", line = 62)
    public final int method1118(byte arg0) {
        ++field2343;
        if (arg0 > -48) {
            this.method1117(-9);
        }
        return (int) super.field2810;
    }

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "(I)V", line = 73)
    public static void method1119(int arg0) {
        field2335 = null;
        field2337 = null;
        if (arg0 <= 0) {
            field2335 = null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "(I)V", line = 88)
    public static final void method1120(int arg0) {
        class474.field6896.method809(true);
        ++field2339;
        if (arg0 != 21484) {
            method1120(-15);
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(II)V", line = 100)
    public class150(int arg0, int arg1) {
        super.field2810 = (long) arg1 | (long) arg0 << 32;
    }
}
