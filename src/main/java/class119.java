import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class119 {

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static volatile int field1998 = 0;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "Lvm;")
    public static class202 field1996 = new class202(50);

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field2001 = 0;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public int field1992;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public int field1993;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public int field1997;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Ldk;")
    public static class267 field1999;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "[[Z")
    public static boolean[][] field2000;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 10)
    public static final void method892(int arg0) {
        class166.field2713.method1414(114);
        field1995++;
        class142.field2298.method1414(126);
        class107.field1806.method1414(89);
        if (arg0 >= -97) {
            field1996 = (class202) null;
        }
        class168.field2756.method1414(104);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)V", line = 38)
    public static final void method893(int arg0, int arg1) {
        class72 var2 = class225.field3705[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class72 var4 = class225.field3705[var3][arg0][arg1] = class225.field3705[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field1218--;
                for (int var5 = 0; var5 < var4.field1211; var5++) {
                    class152 var6 = var4.field1216[var5];
                    if ((var6.field2479 >> 29 & 0x3L) == 2L && var6.field2464 == arg0 && var6.field2468 == arg1) {
                        var6.field2469--;
                    }
                }
            }
        }
        if (class225.field3705[0][arg0][arg1] == null) {
            class225.field3705[0][arg0][arg1] = new class72(0, arg0, arg1);
        }
        class225.field3705[0][arg0][arg1].field1209 = var2;
        class225.field3705[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V", line = 77)
    public static final void method894(byte arg0) {
        field1991++;
        class177.field2918.method712(0);
        class68.field1087.method1530(1);
        class153.field2489.method1530(1);
        if (arg0 <= 1) {
            method892(64);
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V", line = 110)
    public static void method895(byte arg0) {
        if (arg0 != 42) {
            field2001 = 41;
        }
        field1996 = null;
        field2000 = (boolean[][]) null;
        field1999 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZILph;)V", line = 126)
    public static final void method896(boolean arg0, int arg1, class229 arg2) {
        field1994++;
        int var3 = -4 / ((26 - arg1) / 37);
        if (!arg0) {
            try {
                class124.field2085.getAppletContext().showDocument(arg2.method1636(class124.field2085.getCodeBase(), 118), "_top");
            } catch (Exception var8) {
            }
            return;
        }
        if (class99.field1675 && class239.field3958) {
            try {
                class91.method675(126, "openjs", class249.field4143.field1561, new Object[] { arg2.method1636(class124.field2085.getCodeBase(), 116).toString() });
                return;
            } catch (Throwable var9) {
            }
        }
        try {
            class124.field2085.getAppletContext().showDocument(arg2.method1636(class124.field2085.getCodeBase(), 122), "_blank");
        } catch (Exception var7) {
        }
    }
}
