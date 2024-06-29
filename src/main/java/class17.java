import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class17 extends class171 {

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "[B")
    public byte[] field348;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "Lok;")
    public static class146 field347 = class235.method1724(-12908, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "[I")
    public static int[] field344 = new int[1000];

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    public static int field350 = -1;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public static int field349 = 0;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "[I")
    public static int[] field342 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "Lok;")
    public static class146 field351 = class235.method1724(-12908, "Chargement des sprites )2 ");

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "Llc;")
    public static class160 field345 = new class160();

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "Lok;")
    public static class146 field352 = class235.method1724(-12908, "Chargement du module texte )2 ");

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "Lok;")
    public static class146 field356 = class235.method1724(-12908, "Schlie-8en");

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "Ljava/lang/String;")
    public static String field343;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "[[B")
    public static byte[][] field353;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLok;)I", line = 12)
    public static final int method131(byte arg0, class146 arg1) {
        field354++;
        if (class135.field2255 == null || arg1.method1094((byte) -12) == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class135.field2255.field4796; var2++) {
            if (class135.field2255.field4805[var2].method1126(-79, class264.field4522, class166.field2811).method1114(arg1, true)) {
                return var2;
            }
        }
        if (arg0 > -24) {
            field352 = (class146) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)V", line = 40)
    public static void method132(int arg0) {
        field344 = null;
        field347 = null;
        field352 = null;
        field342 = null;
        field351 = null;
        field353 = (byte[][]) null;
        field356 = null;
        field343 = null;
        if (arg0 != 8) {
            field345 = (class160) null;
        }
        field345 = null;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "([B)V", line = 61)
    public class17(byte[] arg0) {
        this.field348 = arg0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)I", line = 77)
    public static final int method133(boolean arg0, int arg1) {
        if (arg0) {
            method133(false, -41);
        }
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        field346++;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZIIIIIII)V", line = 106)
    public static final void method134(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field355++;
        int var8 = arg2 + arg4;
        int var9 = arg3 - arg4;
        int var10 = arg4 + arg6;
        int var11 = arg1 - arg4;
        for (int var12 = arg2; var12 < var8; var12++) {
            class40.method281(arg7, arg6, class81.field1297[var12], arg1, 7);
        }
        if (!arg0) {
            return;
        }
        for (int var13 = arg3; var13 > var9; var13--) {
            class40.method281(arg7, arg6, class81.field1297[var13], arg1, 7);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class81.field1297[var14];
            class40.method281(arg7, arg6, var15, var10, 7);
            class40.method281(arg5, var10, var15, var11, 7);
            class40.method281(arg7, var11, var15, arg1, 7);
        }
    }
}
