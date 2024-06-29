import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class251 extends class166 {

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "[I")
    public static int[] field4040 = new int[100];

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4039 = "scroll:";

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "[I")
    public static int[] field4046 = new int[8];

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public int field4041;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public int field4045;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "[Ljb;")
    public static class276[] field4047;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)V")
    public static final void method1718(int arg0, int arg1, int arg2, int arg3) {
        class6 var4 = class269.field4298[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class206 var5 = var4.field123;
        if (var5 != null) {
            var5.field3210 = var5.field3210 * arg3 / 16;
            var5.field3221 = var5.field3221 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)I")
    public static final int method1719(boolean arg0, int arg1) {
        field4042++;
        class217 var2 = class164.method1110(-126, arg1);
        int var3 = var2.field3357;
        if (!arg0) {
            method1722(-32);
        }
        int var4 = var2.field3361;
        int var5 = var2.field3359;
        int var6 = class62.field1065[var5 - var3];
        return var6 & class31.field462[var4] >> var3;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)Loj;")
    public static final class160 method1720(int arg0, int arg1) {
        field4043++;
        int var2 = 9 / ((arg1 - 33) / 37);
        if (arg0 == 0) {
            return new class101();
        } else if (arg0 == 1) {
            return new class16();
        } else if (arg0 == 2) {
            return new class97();
        } else if (arg0 == 3) {
            return new class69();
        } else if (arg0 == 4) {
            return new class287();
        } else if (arg0 == 5) {
            return new class205();
        } else if (arg0 == 6) {
            return new class162();
        } else if (arg0 == 7) {
            return new class296();
        } else if (arg0 == 8) {
            return new class264();
        } else if (arg0 == 9) {
            return new class38();
        } else if (arg0 == 10) {
            return new class176();
        } else if (arg0 == 11) {
            return new class210();
        } else if (arg0 == 12) {
            return new class196();
        } else if (arg0 == 13) {
            return new class114();
        } else if (arg0 == 14) {
            return new class50();
        } else if (arg0 == 15) {
            return new class189();
        } else if (arg0 == 16) {
            return new class268();
        } else if (arg0 == 17) {
            return new class106();
        } else if (arg0 == 18) {
            return new class227();
        } else if (arg0 == 19) {
            return new class240();
        } else if (arg0 == 20) {
            return new class102();
        } else if (arg0 == 21) {
            return new class190();
        } else if (arg0 == 22) {
            return new class1();
        } else if (arg0 == 23) {
            return new class129();
        } else if (arg0 == 24) {
            return new class197();
        } else if (arg0 == 25) {
            return new class164();
        } else if (arg0 == 26) {
            return new class142();
        } else if (arg0 == 27) {
            return new class237();
        } else if (arg0 == 28) {
            return new class27();
        } else if (arg0 == 29) {
            return new class222();
        } else if (arg0 == 30) {
            return new class44();
        } else if (arg0 == 31) {
            return new class37();
        } else if (arg0 == 32) {
            return new class26();
        } else if (arg0 == 33) {
            return new class128();
        } else if (arg0 == 34) {
            return new class254();
        } else if (arg0 == 35) {
            return new class20();
        } else if (arg0 == 36) {
            return new class191();
        } else if (arg0 == 37) {
            return new class71();
        } else if (arg0 == 38) {
            return new class122();
        } else if (arg0 == 39) {
            return new class253();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V")
    public static final void method1721(int arg0, int arg1, int arg2) {
        class16.field248 = true;
        class71.field1138 = arg0;
        class112.field1840 = arg1;
        class278.field4420 = arg2;
        class283.field4480 = -1;
        class51.field749 = -1;
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V")
    public static void method1722(int arg0) {
        field4046 = null;
        field4047 = null;
        if (arg0 == -24470) {
            field4040 = null;
            field4039 = null;
        }
    }
}
