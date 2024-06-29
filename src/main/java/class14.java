import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class14 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Leb;")
    public class651 field141 = null;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lda;")
    public class67 field142 = null;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Z")
    public static boolean field144 = true;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "[[I")
    public static int[][] field145 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field146 = -2;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lda;)V", line = 21)
    public class14(class67 arg0) {
        this.field142 = arg0;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lda;Leb;)V", line = 29)
    public class14(class67 arg0, class651 arg1) {
        this.field141 = arg1;
        this.field142 = arg0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 10)
    public static void method85(int arg0) {
        int var1 = 3 % ((23 - arg0) / 61);
        field145 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(JZII)Ljava/lang/String;", line = 46)
    public static final String method86(long arg0, boolean arg1, int arg2, int arg3) {
        field143++;
        if (arg2 != 14708) {
            return null;
        }
        Calendar var5;
        if (arg1) {
            class120.method858(arg2 - 14707, arg0);
            var5 = class79.field1090;
        } else {
            class215.method1391(false, arg0);
            var5 = class79.field1085;
        }
        int var6 = var5.get(5);
        int var7 = var5.get(2);
        int var8 = var5.get(1);
        int var9 = var5.get(11);
        int var10 = var5.get(12);
        return arg3 == 3 ? class634.method3496(arg0, arg1, -20982, arg3) : Integer.toString(var6 / 10) + var6 % 10 + "-" + class631.field8535[arg3][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
    }
}
