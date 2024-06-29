import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class223 {

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public int field2983;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "Lria;")
    public static class288 field2979 = null;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "[I")
    public static int[] field2981 = new int[25];

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "Lcg;")
    public static class140 field2980 = new class140();

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "Lfi;")
    public static class558 field2977;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "[[B")
    public static byte[][] field2984;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V", line = 8)
    public static void method1443(boolean arg0) {
        if (!arg0) {
            return;
        }
        field2984 = null;
        field2980 = null;
        field2981 = null;
        field2979 = null;
        field2977 = null;
    }

    @OriginalMember(owner = "client!hm", name = "toString", descriptor = "()Ljava/lang/String;", line = 24)
    public final String toString() {
        field2978++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)Z", line = 40)
    public static final boolean method1444(int arg0, int arg1, int arg2) {
        field2982++;
        if (arg1 != 25) {
            method1443(false);
        }
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(II)V", line = 54)
    public class223(int arg0, int arg1) {
        this.field2983 = arg1;
    }
}
