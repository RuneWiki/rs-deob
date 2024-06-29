import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class354 {

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "Luc;")
    public static class27 field5074 = new class27(81, -1);

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "[I")
    public static int[] field5077 = new int[14];

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5078;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(III)Z")
    public static final boolean method2100(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method2101(13);
        }
        field5075++;
        return (arg0 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V")
    public static void method2101(int arg0) {
        field5074 = null;
        int var1 = -13 % ((arg0 + 74) / 33);
        field5077 = null;
        field5078 = null;
    }

    @OriginalMember(owner = "client!kda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5073++;
        throw new IllegalStateException();
    }
}
