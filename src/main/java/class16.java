import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class16 {

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Ljava/lang/String;")
    public static String field212 = "slide:";

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "[[I")
    public static int[][] field211 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "Lui;")
    public static class98 field206 = new class98(100);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public int field205;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public int field207;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public int field209;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public int field210;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 4)
    public static void method110(int arg0) {
        if (arg0 > -25) {
            method112(-126, (String[]) null);
        }
        field206 = null;
        field212 = null;
        field211 = (int[][]) null;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V", line = 16)
    public static final void method111(int arg0) {
        if (arg0 != 12608) {
            method112(88, (String[]) null);
        }
        field206.method644((byte) -110);
        field204++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 43)
    public static final String[] method112(int arg0, String[] arg1) {
        field208++;
        String[] var2 = new String[5];
        for (int var3 = arg0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }
}
