import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class35 extends class376 {

    @OriginalMember(owner = "client!nr", name = "t", descriptor = "[B")
    public byte[] field548;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    public static int field541 = 0;

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "J")
    public static long field543 = 0L;

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "I")
    public static int field547 = 0;

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "I")
    public static int field545 = -1;

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "Lb;")
    public static class183 field542;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)V")
    public static void method257(int arg0) {
        field542 = null;
        if (arg0 != 3737) {
            field541 = -28;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILeb;)Lpp;")
    public static final class222 method258(int arg0, class371 arg1) {
        field546++;
        if (arg0 != -1) {
            method259(-56);
        }
        return new class222(arg1.method2378(-1), arg1.method2378(-1), arg1.method2378(-1), arg1.method2378(arg0), arg1.method2425(arg0 - 106), arg1.method2429(0));
    }

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "(I)V")
    public static final void method259(int arg0) {
        if (class12.field156 != arg0) {
            class386.method2526(class12.field156, -1, -1, false, 23503);
            class12.field156 = -1;
        }
        field544++;
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "([B)V")
    public class35(byte[] arg0) {
        this.field548 = arg0;
    }
}
