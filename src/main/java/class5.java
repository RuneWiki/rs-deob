import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class24 {

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public int field121 = -1;

    @OriginalMember(owner = "client!ad", name = "eb", descriptor = "I")
    public int field140 = 0;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "Lv;")
    private static class122 field117 = class55.method425(-82, " is already on your ignore list");

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "Lv;")
    public static class122 field125 = class55.method425(-111, "Schrifts\u001c1tze geladen)3");

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "I")
    public static int field132 = 0;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
    public static int field129 = 0;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "Z")
    public static volatile boolean field133 = false;

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
    public static int field134 = -1;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "Lv;")
    public static class122 field116 = field117;

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "Z")
    public static boolean field138 = false;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    public int field118;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    public int field122;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public int field123;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
    public int field130;

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "I")
    public int field131;

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "I")
    public int field136;

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "I")
    public int field137;

    @OriginalMember(owner = "client!ad", name = "db", descriptor = "I")
    public int field139;

    @OriginalMember(owner = "client!ad", name = "fb", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ad", name = "gb", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "Lmb;")
    public static class74 field120;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "Lmb;")
    public static class74 field128;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V", line = 11)
    public static void method68(int arg0) {
        field116 = null;
        field128 = null;
        field125 = null;
        field120 = null;
        if (arg0 != 0) {
            method69(40, false);
        }
        field117 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)Lbc;", line = 27)
    public static final class10 method69(int arg0, boolean arg1) {
        field127++;
        class10 var2 = (class10) class64.field1634.method436(-107, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class56.field1467.method611(0, 10, arg0);
        class10 var4 = new class10();
        var4.field245 = arg0;
        if (var3 != null) {
            var4.method101(new class64(var3), (byte) 108);
        }
        var4.method105(90);
        if (var4.field233 != -1) {
            var4.method99(26075, method69(var4.field263, false), method69(var4.field233, arg1));
        }
        if (arg1) {
            field120 = null;
        }
        if (!class81.field2118 && var4.field249) {
            var4.field222 = class37.field973;
            var4.field257 = null;
            var4.field250 = null;
            var4.field270 = 0;
        }
        class64.field1634.method437((long) arg0, var4, (byte) 69);
        return var4;
    }

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V", line = 95)
    public static final void method70(int arg0) {
        while (true) {
            if (class14.field372.method992(103, class74.field1969) >= 11) {
                int var1 = class14.field372.method994(11, (byte) -82);
                if (var1 != 2047) {
                    if (class125.field3043[var1] == null) {
                        class125.field3043[var1] = new class55();
                        if (class89.field2291[var1] != null) {
                            class125.field3043[var1].method428(class89.field2291[var1], (byte) -125);
                        }
                    }
                    class7.field175[class108.field2671++] = var1;
                    class55 var2 = class125.field3043[var1];
                    var2.field333 = class16.field396;
                    var2.field299 = class25.field682[class14.field372.method994(3, (byte) -93)];
                    int var3 = class14.field372.method994(5, (byte) -109);
                    int var4 = class14.field372.method994(1, (byte) -75);
                    int var5 = class14.field372.method994(1, (byte) -100);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    if (var5 == 1) {
                        class118.field2859[class107.field2661++] = var1;
                    }
                    int var6 = class14.field372.method994(5, (byte) -116);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    var2.method109(class70.field1828.field307[0] + var3, class70.field1828.field287[0] - -var6, (byte) -122, var4 == 1);
                    continue;
                }
            }
            field142++;
            class14.field372.method995(false);
            if (arg0 > -124) {
                method69(-93, false);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lfe;B)Z", line = 167)
    public static final boolean method71(class36 arg0, byte arg1) {
        if (arg1 != 97) {
            return true;
        }
        field141++;
        if (arg0.field916 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field916.length; var2++) {
            int var3 = class119.method906(var2, 1, arg0);
            int var4 = arg0.field925[var2];
            if (arg0.field916[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field916[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field916[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }
}
