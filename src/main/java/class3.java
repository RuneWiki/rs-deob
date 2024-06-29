import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public int field36 = 0;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public int field42 = 0;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Lja;")
    public static class63 field43 = new class63(64);

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public static int field49 = 0;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "[[[B")
    public static byte[][][] field50 = new byte[4][104][104];

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "Lec;")
    public static class32 field51 = class73.method594("mapedge", true);

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "Lec;")
    public static class32 field48 = class73.method594("me", true);

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public int field30;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public int field34;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public int field37;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public int field38;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public int field39;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Ldd;")
    public class26 field29;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Ldd;")
    public class26 field32;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Lea;")
    public static class30 field45;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "Lh;")
    public static class49 field46;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "[I")
    public static int[] field44;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "[I")
    public static int[] field47;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)I")
    public static final int method9(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 / arg1;
        int var5 = arg0 / arg1;
        int var6 = arg1 - 1 & arg2;
        field40++;
        int var7 = arg1 - 1 & arg0;
        int var8 = class11.method62(var5, var4, -1);
        int var9 = class11.method62(var5, var4 + 1, -1);
        int var10 = class11.method62(var5 + 1, var4, -1);
        int var11 = class11.method62(var5 + 1, var4 - -1, -1);
        if (arg3 <= 77) {
            field46 = null;
        }
        int var12 = class131.method1007(arg1, var6, var9, 77, var8);
        int var13 = class131.method1007(arg1, var6, var11, 114, var10);
        return class131.method1007(arg1, var7, var13, 86, var12);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method10(int arg0) {
        field45 = null;
        field47 = null;
        field44 = null;
        field50 = null;
        field48 = null;
        field51 = null;
        if (arg0 != 64) {
            method10(55);
        }
        field43 = null;
        field46 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLea;Lea;)V")
    public static final void method11(byte arg0, class30 arg1, class30 arg2) {
        class41.field971 = arg2;
        class158.field3636 = arg1;
        field31++;
        if (arg0 != -73) {
            field50 = null;
        }
    }
}
