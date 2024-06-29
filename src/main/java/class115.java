import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class115 {

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Lkb;")
    public static class93 field2156 = class76.method390("<col=00ff80>", 0);

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Lkb;")
    public static class93 field2158 = class76.method390("::fpson", 0);

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Lkb;")
    public static class93 field2161 = class76.method390("k", 0);

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Lkb;")
    private static class93 field2149 = class76.method390("Loading wordpack )2 ", 0);

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "Lkb;")
    public static class93 field2166 = field2149;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public int field2151;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public int field2155;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public int field2159;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public int field2160;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public int field2163;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "J")
    public static long field2165;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Lac;")
    public class4 field2152;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "Lac;")
    public class4 field2154;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "Lac;")
    public class4 field2168;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "Ljg;")
    public static class89 field2169;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2147;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "[Lob;")
    public static class129[] field2167;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static final void method635(int arg0) {
        if (arg0 >= 87) {
            if (class62.field986 != null) {
                class62.field986.method10(false);
            }
            field2162++;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
    public static void method636(boolean arg0) {
        field2166 = null;
        field2169 = null;
        field2158 = null;
        field2167 = null;
        field2161 = null;
        field2147 = null;
        if (arg0) {
            field2147 = null;
        }
        field2149 = null;
        field2156 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBLjg;)Lob;")
    public static final class129 method637(int arg0, byte arg1, class89 arg2) {
        if (arg1 != -103) {
            field2158 = null;
        }
        field2153++;
        return class188.method1220(arg2, (byte) -48, arg0) ? class23.method131(true) : null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)Z")
    public static final boolean method638(boolean arg0, int arg1) {
        if (!arg0) {
            field2166 = null;
        }
        field2157++;
        return (arg1 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZLme;)V")
    public static final void method639(int arg0, boolean arg1, class114 arg2) {
        field2148++;
        if (class68.field1243 != null) {
            class68.field1243.field3153 = arg0 * 8 + 5;
            int var3 = class68.field1243.method1076(24277);
            int var4 = class68.field1243.method1076(24277);
            arg2.method628(var4, var3, true);
            return;
        }
        class103.method572(0, 255, true, 255, (byte) 0, null, 0);
        class153.field3013[arg0] = arg2;
        if (arg1) {
            method635(24);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZLjg;ILjg;)Leg;")
    public static final class46 method640(int arg0, boolean arg1, class89 arg2, int arg3, class89 arg4) {
        field2150++;
        int[] var5 = arg2.method452(186, arg0);
        boolean var6 = true;
        int var7 = 0;
        if (arg3 > -72) {
            method635(-49);
        }
        while (var7 < var5.length) {
            byte[] var8 = arg2.method457(arg0, var5[var7], (byte) -100);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg1) {
                    var10 = arg4.method457(0, var9, (byte) -121);
                } else {
                    var10 = arg4.method457(var9, 0, (byte) -88);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
            var7++;
        }
        if (!var6) {
            return null;
        }
        try {
            return new class46(arg2, arg4, arg0, arg1);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public static final void method641(int arg0) {
        field2164++;
        if (arg0 != 1) {
            return;
        }
        for (int var1 = -1; var1 < class205.field3966; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class144.field2818[var1];
            }
            class34 var3 = class206.field4035[var2];
            if (var3 != null) {
                class193.method1242(var3, 1, -63);
            }
        }
    }
}
