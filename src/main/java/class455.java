import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class455 {

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "[[I")
    public static int[][] field6495 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field6492 = 0;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public int field6489;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public int field6491;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public int field6493;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Lom;")
    public static class344 field6494;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "Z")
    public boolean field6490;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)I")
    public static final int method2740(int arg0, int arg1) {
        int var7 = arg1 - 1;
        if (arg0 != -1675135295) {
            return -63;
        }
        field6496++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static void method2741(int arg0) {
        if (arg0 == 3666) {
            field6494 = null;
            field6495 = null;
        }
    }
}
