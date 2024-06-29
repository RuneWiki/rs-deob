import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class284 extends class249 {

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "Ljava/lang/Object;")
    private Object field4810;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "I")
    public static int field4809 = 0;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "Z")
    public static boolean field4808 = false;

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "[[I")
    public static int[][] field4812 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "Lad;")
    public static class167 field4806;

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "[S")
    public static short[] field4814;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 13)
    public final Object method146(int arg0) {
        field4805++;
        if (arg0 != 0) {
            this.method147(-14);
        }
        return this.field4810;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)Z", line = 26)
    public final boolean method147(int arg0) {
        if (arg0 != 5) {
            field4809 = -2;
        }
        field4804++;
        return false;
    }

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)V", line = 38)
    public static void method1920(int arg0) {
        field4814 = null;
        field4806 = null;
        int var1 = -19 % ((-arg0 - 51) / 32);
        field4812 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(III)Lkg;", line = 56)
    public static final class107 method1921(int arg0, int arg1, int arg2) {
        class198 var3 = class43.field646[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3162; var4++) {
            class107 var5 = var3.field3166[var4];
            if ((var5.field1590 >> 29 & 0x3L) == 2L && var5.field1597 == arg1 && var5.field1595 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 90)
    public class284(Object arg0) {
        this.field4810 = arg0;
    }
}
