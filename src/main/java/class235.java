import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class235 {

    @OriginalMember(owner = "client!dia", name = "e", descriptor = "I")
    private int field3087;

    @OriginalMember(owner = "client!dia", name = "f", descriptor = "J")
    private long field3088;

    @OriginalMember(owner = "client!dia", name = "h", descriptor = "Llga;")
    public static class712 field3090 = new class712(38, 7);

    @OriginalMember(owner = "client!dia", name = "j", descriptor = "I")
    public static int field3092 = 0;

    @OriginalMember(owner = "client!dia", name = "i", descriptor = "[I")
    public static int[] field3091 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!dia", name = "k", descriptor = "F")
    public static float field3093;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!dia", name = "g", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)V")
    public static final void method1414(int arg0) {
        class387.field5466.method728((byte) 47);
        field3085++;
        if (arg0 != -5788) {
            method1414(-89);
        }
        class758.field10572 = 0;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(Llf;I)V")
    private final void method1415(class239 arg0, int arg1) {
        if (arg1 != 13) {
            field3090 = null;
        }
        field3089++;
        this.field3088 |= (arg0.field3126 << class239.field3130 * this.field3087++);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(IB)Llf;")
    public final class239 method1416(int arg0, byte arg1) {
        field3086++;
        if (arg1 >= -73) {
            this.method1418(99, 88);
        }
        return class239.method1445(this.method1418(15, arg0), (byte) 40);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(B)I")
    public final int method1417(byte arg0) {
        if (arg0 >= -7) {
            return 115;
        } else {
            field3083++;
            return this.field3087;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(II)I")
    private final int method1418(int arg0, int arg1) {
        if (arg0 != 15) {
            this.method1418(81, -68);
        }
        field3084++;
        return (int) (this.field3088 >> class239.field3130 * arg1) & 0xF;
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(I)V")
    public static void method1419(int arg0) {
        field3091 = null;
        if (arg0 != 13) {
            method1419(-50);
        }
        field3090 = null;
    }

    @OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(Llf;)V")
    public class235(class239 arg0) {
        this.field3087 = 1;
        this.field3088 = arg0.field3126;
    }

    @OriginalMember(owner = "client!dia", name = "<init>", descriptor = "([Llf;)V")
    public class235(class239[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method1415(arg0[var2], 13);
        }
    }
}
