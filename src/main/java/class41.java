import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class41 {

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "[[F")
    public float[][] field643;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "[I")
    public int[] field640;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "[I")
    public int[] field646;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "[I")
    public int[] field645;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "[I")
    public static int[] field644 = new int[4];

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field642;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V", line = 7)
    public static void method280(boolean arg0) {
        if (!arg0) {
            method281(71, -93);
        }
        field644 = null;
        field642 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 24)
    public static final void method281(int arg0, int arg1) {
        field641++;
        if (class713.field9969 == arg1) {
            return;
        }
        class597.field8132 = class628.field8800 = class517.field7062[arg1];
        class560.method3149((byte) -109);
        class249.field3688 = new int[class597.field8132][class628.field8800];
        class72.field1010 = new int[class597.field8132][class628.field8800];
        class590.field7953 = new int[4][class597.field8132 >> 3][class628.field8800 >> 3];
        for (int var2 = 0; var2 < 4; var2++) {
            class514.field7038[var2] = class673.method3745(class597.field8132, (byte) -126, class628.field8800);
        }
        if (arg0 != 598809411) {
            method280(true);
        }
        class625.field8439 = new byte[4][class597.field8132][class628.field8800];
        class237.method1536(4, class628.field8800, class597.field8132, (byte) -84);
        class403.method2510(class597.field8132 >> 3, arg0 - 598809411, class628.field8800 >> 3, class379.field5542);
        class713.field9969 = arg1;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "([I[I[I[[F)V", line = 59)
    public class41(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field643 = arg3;
        this.field640 = arg2;
        this.field646 = arg1;
        this.field645 = arg0;
    }
}
