import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class185 {

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "Lrg;")
    public static class548 field2236 = new class548(48, -1);

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "J")
    public static long field2241 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "Lvj;")
    public static class373 field2238 = new class373(70, -1);

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "Ldj;")
    public static class287 field2240;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "Ldn;")
    public static class438 field2237;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V", line = 4)
    public static void method1011(int arg0) {
        field2237 = null;
        if (arg0 < -41) {
            field2236 = null;
            field2240 = null;
            field2238 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V", line = 24)
    public static final void method1012(byte arg0) {
        class390.field5159.method1540((byte) -29);
        int var1 = 96 % ((-arg0 - 10) / 37);
        field2234++;
        class578.field8436 = 1;
        class527.field7382 = null;
    }

    @OriginalMember(owner = "client!cu", name = "toString", descriptor = "()Ljava/lang/String;", line = 41)
    public final String toString() {
        field2235++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(II)V", line = 53)
    public class185(int arg0, int arg1) {
    }
}
