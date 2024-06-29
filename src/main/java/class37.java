import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class37 {

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field998 = 255;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Lfc;")
    public static class39 field997 = class90.method774(")2", -78);

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Lfc;")
    private static class39 field1006 = class90.method774("Walk here", -80);

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "[Lca;")
    public static class16[] field1000 = new class16[16];

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field1001 = 0;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field1010 = -1;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field1015 = 0;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field1008 = -1;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "Lfc;")
    public static class39 field1002 = field1006;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "Lfc;")
    public static class39 field1017 = class90.method774("(U", -82);

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "Lfc;")
    public static class39 field1009 = class90.method774("blinken1:", -85);

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field1016 = 0;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public static int field1018 = -1;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "Lge;")
    public static class47 field1014;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Llf;")
    public static class82 field1013;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 7)
    public static final void method420(int arg0) {
        if (arg0 > -99) {
            field1016 = -89;
        }
        field1007++;
        class115.field3008.method927(false);
        class50.field1259.method927(false);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)Lpe;", line = 39)
    public static final class109 method421(boolean arg0, int arg1) {
        field1011++;
        class109 var2 = (class109) class108.field2709.method931(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class114.field2999.method839(5, 10, arg1);
        class109 var4 = new class109();
        var4.field2781 = arg1;
        if (var3 != null) {
            var4.method965((byte) -116, new class25(var3));
        }
        var4.method959(65536);
        if (var4.field2772 != -1) {
            var4.method956(3, method421(true, var4.field2769), method421(true, var4.field2772));
        }
        if (!class42.field1140 && var4.field2739) {
            var4.field2756 = 0;
            var4.field2748 = null;
            var4.field2787 = class108.field2724;
            var4.field2764 = null;
        }
        if (!arg0) {
            method421(false, 26);
        }
        class108.field2709.method934(0, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Loc;ILoc;Loc;)V", line = 79)
    public static final void method422(class100 arg0, int arg1, class100 arg2, class100 arg3) {
        class53.field1338 = arg3;
        field1012++;
        class97.field2295 = arg2;
        class54.field1358 = arg0;
        if (arg1 != 19784) {
            field1002 = null;
        }
        class65.field1571 = new class99[class53.field1338.method837((byte) 125)][];
        class2.field53 = new boolean[class53.field1338.method837((byte) 126)];
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V", line = 109)
    public static void method423(int arg0) {
        field1009 = null;
        field1000 = null;
        field1013 = null;
        if (arg0 != 1) {
            field997 = null;
        }
        field1017 = null;
        field1014 = null;
        field997 = null;
        field1006 = null;
        field1002 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)Lde;", line = 135)
    public static final class27 method424(byte arg0, int arg1) {
        field1005++;
        class27 var2 = (class27) class28.field814.method931(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 < 64) {
            method424((byte) -36, 72);
        }
        byte[] var3 = class28.field818.method839(5, arg1, 0);
        if (var3 == null) {
            return null;
        }
        class27 var4 = new class27();
        int var5 = 0;
        class25 var6 = new class25(var3);
        var6.field710 = var6.field711.length - 12;
        int var7 = var6.method313((byte) 119);
        var4.field775 = var6.method301(-4853);
        var4.field772 = var6.method301(-4853);
        var4.field773 = var6.method301(-4853);
        var4.field774 = var6.method301(-4853);
        var4.field777 = new class39[var7];
        var6.field710 = 0;
        var4.field771 = new int[var7];
        var4.field778 = new int[var7];
        while (var6.field710 < var6.field711.length - 12) {
            int var8 = var6.method301(-4853);
            if (var8 == 3) {
                var4.field777[var5] = var6.method304(-126);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field778[var5] = var6.method322((byte) -50);
            } else {
                var4.field778[var5] = var6.method313((byte) 79);
            }
            var4.field771[var5++] = var8;
        }
        class28.field814.method934(0, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 212)
    public static final void method425(byte arg0) {
        for (class24 var1 = (class24) class83.field1840.method8(-1); var1 != null; var1 = (class24) class83.field1840.method9(1)) {
            if (var1.field672 != null) {
                var1.method276(true);
            }
        }
        if (arg0 <= 110) {
            field1006 = null;
        }
        field1019++;
    }
}
