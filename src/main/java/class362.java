import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class362 {

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Lfa;")
    public static class235 field5233 = new class235(11, 0, 1, 2);

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "J")
    public static long field5234 = 20000000L;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field5235 = 0;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)I", line = 3)
    public static final int method2252(int arg0) {
        field5232++;
        if (arg0 != 1) {
            method2253(14);
        }
        return class716.field10074 == null ? 0 : class716.field10074.length * 2;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V", line = 19)
    public static void method2253(int arg0) {
        if (arg0 != 20000000) {
            field5235 = -82;
        }
        field5233 = null;
    }
}
