import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class491 {

    @OriginalMember(owner = "client!nba", name = "j", descriptor = "I")
    public int field6903;

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "I")
    public int field6901;

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "Lst;")
    public static class335 field6899 = new class335(28, 4);

    @OriginalMember(owner = "client!nba", name = "l", descriptor = "Lgw;")
    public static class690 field6905 = new class690(3000000, 200);

    @OriginalMember(owner = "client!nba", name = "n", descriptor = "Z")
    public static boolean field6907 = false;

    @OriginalMember(owner = "client!nba", name = "m", descriptor = "Z")
    public static boolean field6906 = false;

    @OriginalMember(owner = "client!nba", name = "p", descriptor = "I")
    public static int field6909 = 0;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "I")
    public int field6894;

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "I")
    public int field6896;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
    public int field6898;

    @OriginalMember(owner = "client!nba", name = "k", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!nba", name = "o", descriptor = "Lju;")
    public static class103 field6908;

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "Lnba;")
    public class491 field6902;

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "Lih;")
    public class744 field6900;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V", line = 7)
    public static void method2979(int arg0) {
        field6905 = null;
        if (arg0 == 28) {
            field6908 = null;
            field6899 = null;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIILka;I)Liha;", line = 19)
    public static final class613 method2980(int arg0, int arg1, int arg2, class284 arg3, int arg4) {
        int var5 = 77 % ((arg1 - 51) / 33);
        field6895++;
        return arg3 == null ? null : new class613(arg4, arg2, arg0, arg3.method1658(), arg3.method1678(), arg3.method1655(), arg3.method1668(), arg3.method1681(), arg3.method1693(), arg3.method1666());
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IB)Lnba;", line = 34)
    public final class491 method2981(int arg0, byte arg1) {
        if (arg1 != -49) {
            this.method2982(19);
        }
        field6897++;
        return new class491(this.field6903, arg0);
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)Lgca;", line = 45)
    public final class209 method2982(int arg0) {
        field6904++;
        if (arg0 != 3000000) {
            field6905 = null;
        }
        return class266.method1814((byte) 119, this.field6903);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "([Luq;II)V", line = 60)
    public static final void method2983(class318[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class318 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field4409;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field4409 < (var7 & 0x1) + var6) {
                class318 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method2983(arg0, arg1, var4 - 1);
        method2983(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(II)V", line = 103)
    public class491(int arg0, int arg1) {
        this.field6903 = arg0;
        this.field6901 = arg1;
    }
}
