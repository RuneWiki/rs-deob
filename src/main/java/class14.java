import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class14 {

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "[[[I")
    public static int[][][] field348 = new int[4][13][13];

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field344 = 0;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "Laf;")
    private static class7 field356 = class48.method406(40, "Loaded textures");

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "Laf;")
    public static class7 field360 = class48.method406(40, "Einloggen");

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Laf;")
    public static class7 field349 = class48.method406(40, "Okay");

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Laf;")
    public static class7 field353 = class48.method406(40, "<)4col>");

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "Laf;")
    public static class7 field354 = field356;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public static int field361 = 0;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public int field351;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public int field352;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public int field358;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Laf;")
    public class7 field345;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Z")
    public boolean field350;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)Loe;")
    public static final class102 method137(boolean arg0, int arg1) {
        class102 var2 = (class102) class148.field3484.method395(126, (long) arg1);
        field346++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class106.field2603.method572(14, false, arg1);
        if (!arg0) {
            return null;
        }
        class102 var4 = new class102();
        if (var3 != null) {
            var4.method834(124, new class122(var3));
        }
        class148.field3484.method388(var4, (long) arg1, 2047);
        return var4;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method138(byte arg0) {
        field354 = null;
        field360 = null;
        field356 = null;
        field348 = null;
        field349 = null;
        field353 = null;
        if (arg0 >= -52) {
            method139((byte) 16);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)[Lfd;")
    public static final class40[] method139(byte arg0) {
        field347++;
        if (arg0 <= 37) {
            method137(true, -123);
        }
        class40[] var1 = new class40[class49.field1177];
        for (int var2 = 0; var2 < class49.field1177; var2++) {
            class40 var3 = var1[var2] = new class40();
            var3.field985 = class136.field3249;
            var3.field990 = class12.field310;
            var3.field986 = class84.field1990[var2];
            var3.field988 = class51.field1234[var2];
            var3.field991 = class127.field3059[var2];
            var3.field987 = class86.field2005[var2];
            int var4 = var3.field991 * var3.field987;
            byte[] var5 = class82.field1879[var2];
            var3.field989 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field989[var6] = class27.field697[class84.method705(var5[var6], 255)];
            }
        }
        class53.method429(-99);
        return var1;
    }
}
