import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class20 {

    @OriginalMember(owner = "client!an", name = "b", descriptor = "Lbl;")
    private class442 field254;

    @OriginalMember(owner = "client!an", name = "g", descriptor = "I")
    public int field259;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "[I")
    public static int[] field255 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!an", name = "d", descriptor = "J")
    public static long field256 = 0L;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "[[[Loh;")
    public static class268[][][] field253;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V")
    public static void method102(byte arg0) {
        if (arg0 <= 12) {
            method103(-6);
        }
        field255 = null;
        field253 = null;
    }

    @OriginalMember(owner = "client!an", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field254.method2632(115, this.field259);
        field258++;
        super.finalize();
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
    public static final void method103(int arg0) {
        field257++;
        if (class117.field1964.length() == 0) {
            return;
        }
        class404.method2396("--> " + class117.field1964, 10);
        class37.method206(class117.field1964, (byte) -61, false);
        class511.field7749 = 0;
        class117.field1964 = "";
        class433.field6357 = 0;
        if (arg0 != 4) {
            field253 = null;
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lbl;II)V")
    public class20(class442 arg0, int arg1, int arg2) {
        this.field254 = arg0;
        this.field259 = arg2;
    }
}
