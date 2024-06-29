import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class222 {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field3184 = 0;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "[[I")
    public static int[][] field3206 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Ltn;")
    public static class60 field3188 = new class60(33, 2);

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "B")
    public byte field3191;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "B")
    public byte field3192;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "B")
    public byte field3193;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "B")
    public byte field3195;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "B")
    public byte field3197;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "B")
    public byte field3201;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "B")
    public byte field3207;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public int field3203;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public int field3208;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "S")
    public short field3204;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Z")
    public boolean field3185;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Z")
    public boolean field3186;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Z")
    public boolean field3187;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Z")
    public boolean field3189;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Z")
    public boolean field3190;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Z")
    public boolean field3194;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Z")
    public boolean field3196;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "Z")
    public boolean field3199;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "Z")
    public boolean field3202;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Z")
    public boolean field3205;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIILna;)V")
    public static final void method1368(int arg0, int arg1, int arg2, class35 arg3) {
        class239 var4 = class104.method713(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field3493 = arg3;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lnh;Z)Z")
    public static final boolean method1369(class536 arg0, boolean arg1) {
        field3200++;
        if (arg1) {
            field3184 = 73;
        }
        return class513.field7582 == arg0 || class305.field4449 == arg0 || class369.field5267 == arg0 || class162.field2397 == arg0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static void method1370(byte arg0) {
        field3206 = null;
        field3188 = null;
        int var1 = 69 / ((arg0 + 53) / 50);
    }
}
