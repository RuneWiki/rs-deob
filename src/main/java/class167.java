import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class167 implements class462 {

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public int field2200;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field2197 = 0;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field2204 = 0;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "[I")
    public static int[] field2203 = new int[14];

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "Z")
    public static boolean field2202 = false;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Lvq;")
    public static class24 field2199 = new class24(98, 17);

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field2207 = 0;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "J")
    public static long field2198;

    @OriginalMember(owner = "client!jm", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2205++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class167(String arg0, int arg1) {
        this.field2200 = arg1;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V")
    public static void method1102(byte arg0) {
        field2203 = null;
        if (arg0 != -93) {
            field2203 = null;
        }
        field2199 = null;
    }
}
