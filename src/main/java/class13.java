import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class13 {

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "[[I")
    public static int[][] field153 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "Ljava/lang/String;")
    public static String field169 = "glow2:";

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "Ljava/lang/String;")
    public static String field176 = "Hidden";

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "Lob;")
    public static class131 field165 = new class131(5000);

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public int field155;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public int field156;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public int field158;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public int field159;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public int field160;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public int field161;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public int field162;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public int field163;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public int field166;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public int field167;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    public int field170;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public int field171;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
    public int field173;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    public int field174;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
    public int field175;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
    public int field177;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "Ldl;")
    public static class123 field179;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static void method94(int arg0) {
        field165 = null;
        field179 = null;
        if (arg0 != 0) {
            field179 = null;
        }
        field176 = null;
        field169 = null;
        field153 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)V")
    public static final void method95(int arg0, byte arg1) {
        if (arg1 > 108) {
            class6.field90 = 1000 / arg0;
            field157++;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V")
    public static final void method96(int arg0, int arg1) {
        field172++;
        if (!class74.method509(arg0, arg1)) {
            return;
        }
        class214[] var2 = class104.field1608[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class214 var4 = var2[var3];
            if (var4 != null) {
                var4.field3408 = 0;
                var4.field3376 = 0;
                var4.field3498 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)V")
    public static final void method97(int arg0, boolean arg1) {
        class94.field1463 = -1;
        field168++;
        class57.field804 = -1;
        class219.field3563 = arg0;
        class17.method117(13);
        if (!arg1) {
            field179 = null;
        }
    }
}
