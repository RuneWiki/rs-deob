import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class116 {

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "[I")
    public static int[] field1982 = new int[50];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "[I")
    public static int[] field1980 = new int[1000];

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[I")
    public static int[] field1981;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "[[[I")
    public static int[][][] field1983;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public static void method826(boolean arg0) {
        if (!arg0) {
            field1980 = null;
            field1981 = null;
            field1982 = null;
            field1983 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILjj;Ljj;)V")
    public static final void method827(int arg0, class134 arg1, class134 arg2) {
        class22.field272 = arg2;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        class216.field3472 = arg1;
        field1984++;
        if (arg0 < 31) {
            return;
        }
        int var4 = (int) (Math.random() * 21.0D) - 10;
        class216.field3472.method948((byte) -97, 34);
        int var5 = (int) (Math.random() * 41.0D) - 20;
        class58.field813 = var3 + var5;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class201.field3236 = var5 + var6;
        class274.field4418 = var4 + var5;
    }
}
