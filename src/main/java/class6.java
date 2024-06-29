import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class6 {

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    private int field74 = 0;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "Lbo;")
    private class453 field77;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "J")
    public static long field75 = 0L;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "Ljava/lang/String;")
    public static String field82 = "Loaded wordpack";

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "Lde;")
    public static class364 field78;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "Lob;")
    private class418 field80;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "[[B")
    public static byte[][] field81;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)Lob;", line = 4)
    public final class418 method29(boolean arg0) {
        this.field74 = 0;
        if (arg0) {
            method30(-101);
        }
        field85++;
        return this.method32(-1);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)I", line = 16)
    public static final int method30(int arg0) {
        if (arg0 != -12215) {
            method31(-79, (byte) -89);
        }
        field79++;
        return 2;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)I", line = 34)
    public static final int method31(int arg0, byte arg1) {
        field83++;
        if (arg1 >= -57) {
            method30(50);
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lbo;)V", line = 93)
    public class6(class453 arg0) {
        this.field77 = arg0;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)Lob;", line = 55)
    public final class418 method32(int arg0) {
        field76++;
        if (arg0 != -1) {
            field75 = 52L;
        }
        if (this.field74 > 0 && this.field77.field6583[this.field74 - 1] != this.field80) {
            class418 var2 = this.field80;
            this.field80 = var2.field6094;
            return var2;
        }
        while (this.field74 < this.field77.field6577) {
            class418 var3 = this.field77.field6583[this.field74++].field6094;
            if (this.field77.field6583[this.field74 - 1] != var3) {
                this.field80 = var3.field6094;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(I)V", line = 105)
    public static void method33(int arg0) {
        field78 = null;
        field81 = null;
        if (arg0 < 80) {
            field81 = null;
        }
        field82 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZIII)I", line = 122)
    public static final int method34(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            field81 = null;
        }
        field84++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg3;
        }
    }
}
