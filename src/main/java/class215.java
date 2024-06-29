import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class215 extends class513 {

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "Ljava/lang/String;")
    public String field2736;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "Liv;")
    public static class82 field2733 = new class82(8, 3);

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "Lhq;")
    public static class142 field2737;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "Ljn;")
    public static class668 field2734;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "Lf;")
    public static class701 field2735;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)I")
    public static final int method1313(byte arg0, int arg1) {
        field2730++;
        if (arg0 >= -85) {
            field2737 = null;
        }
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else if (arg1 == 6410 || arg1 == 34847) {
            return 6410;
        } else if (arg1 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)Leba;")
    public static final class543 method1314(byte arg0) {
        field2731++;
        if (arg0 != -111) {
            field2734 = null;
        }
        class543 var1 = class527.method3106(arg0 + 111);
        var1.field7875 = null;
        var1.field7878 = 0;
        var1.field7872 = new class5(5000);
        return var1;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)V")
    public static void method1315(byte arg0) {
        field2733 = null;
        int var1 = 63 / ((13 - arg0) / 44);
        field2734 = null;
        field2735 = null;
        field2737 = null;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(III)Z")
    public static final boolean method1316(int arg0, int arg1, int arg2) {
        field2732++;
        return arg1 == 25782 ? (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0 : true;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class215() {
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class215(String arg0, int arg1) {
        this.field2736 = arg0;
    }
}
