import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class279 {

    @OriginalMember(owner = "client!og", name = "d", descriptor = "[[I")
    public static int[][] field4642 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Lce;")
    public static class126 field4640 = null;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "[I")
    public static int[] field4639 = new int[32768];

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "Lcc;")
    public static class313 field4644;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "[I")
    public static int[] field4643;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "[Lvj;")
    public static class184[] field4645;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)V", line = 11)
    public static final void method1870(int arg0, boolean arg1) {
        field4641++;
        if (!arg1) {
            class78.field1274.method1175(true, arg0);
            class297.field4938.method1175(true, arg0);
            class78.field1275.method1175(true, arg0);
            class291.field4819.method1175(true, arg0);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 35)
    public static void method1871(int arg0) {
        field4644 = null;
        field4639 = null;
        if (arg0 != 128) {
            method1870(-90, true);
        }
        field4640 = null;
        field4642 = (int[][]) null;
        field4645 = null;
        field4643 = null;
    }
}
