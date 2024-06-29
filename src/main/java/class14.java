import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class14 {

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Lhb;")
    public static class44 field266 = class102.method810(":duelreq:", -28606);

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Lfc;")
    public static class34 field271 = new class34(64);

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Lhb;")
    public static class44 field273 = class102.method810(" )2> @lre@", -28606);

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field275 = 0;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Lfc;")
    public static class34 field274 = new class34(20);

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "[[B")
    public static byte[][] field278 = new byte[250][];

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field277 = 0;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Ltd;")
    public static class116 field272;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Lwa;")
    public static class128 field276;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)V", line = 7)
    public static final synchronized void method93(int arg0, byte arg1) {
        if (class72.field1830 != null) {
            class72.field1830.method24(arg0);
        }
        class88.method713((byte) 125, arg0);
        field263++;
        if (arg1 < 119) {
            field271 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lj;B)V", line = 27)
    public static final synchronized void method94(class54 arg0, byte arg1) {
        if (arg1 != -126) {
            field277 = 62;
        }
        field264++;
        class72.field1830 = arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(J)V", line = 38)
    public void method95(long arg0) {
        field267++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 45)
    public static final void method96(int arg0) {
        field265++;
        if (class102.field2590 == 0 || arg0 != 100) {
            return;
        }
        int var1 = 0;
        class30 var2 = class103.field2631;
        if (class35.field853 != 0) {
            var1 = 1;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            if (class95.field2409[var3] != null) {
                int var4 = class95.field2407[var3];
                class44 var5 = class64.field1624[var3];
                byte var6 = 0;
                if (var5 != null && var5.method400((byte) -62, class5.field122)) {
                    var6 = 1;
                    var5 = var5.method380(5, (byte) 118);
                }
                if (var5 != null && var5.method400((byte) -52, class48.field1190)) {
                    var5 = var5.method380(5, (byte) 125);
                    var6 = 2;
                }
                if ((var4 == 3 || var4 == 7) && (var4 == 7 || class39.field881 == 0 || class39.field881 == 1 && class57.method530(var5, false))) {
                    byte var7 = 4;
                    int var8 = 329 - var1 * 13;
                    var2.method301(class46.field1138, var7, var8, 0);
                    var2.method301(class46.field1138, var7, var8 - 1, 65535);
                    var1++;
                    int var9 = var7 + var2.method297(class46.field1138);
                    int var10 = var9 + var2.method293(32);
                    if (var6 == 1) {
                        class89.field2272[0].method680(var10, var8 - 12);
                        var10 += 14;
                    }
                    if (var6 == 2) {
                        class89.field2272[1].method680(var10, var8 - 12);
                        var10 += 14;
                    }
                    var2.method301(class117.method903(new class44[] { var5, class96.field2433, class95.field2409[var3] }, false), var10, var8, 0);
                    var2.method301(class117.method903(new class44[] { var5, class96.field2433, class95.field2409[var3] }, false), var10, var8 - 1, 65535);
                    if (var1 >= 5) {
                        return;
                    }
                }
                if (var4 == 5 && class39.field881 < 2) {
                    int var11 = 329 - var1 * 13;
                    var2.method301(class95.field2409[var3], 4, var11, 0);
                    var2.method301(class95.field2409[var3], 4, var11 - 1, 65535);
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
                if (var4 == 6 && class39.field881 < 2) {
                    int var12 = 329 - var1 * 13;
                    var2.method301(class117.method903(new class44[] { class88.field2241, class120.field2943, var5, class96.field2433, class95.field2409[var3] }, false), 4, var12, 0);
                    var2.method301(class117.method903(new class44[] { class88.field2241, class120.field2943, var5, class96.field2433, class95.field2409[var3] }, false), 4, var12 - 1, 65535);
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([II)V", line = 168)
    public static final synchronized void method97(int[] arg0, int arg1) {
        int var2 = 0;
        int var3 = arg1 - 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
        }
        var3 += 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
        }
        if (class72.field1830 != null) {
            class72.field1830.method31(arg0, 0, var3);
        }
        class88.method713((byte) -94, var3);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V", line = 194)
    public static void method98(int arg0) {
        field274 = null;
        field272 = null;
        if (arg0 != 3) {
            return;
        }
        field278 = null;
        field266 = null;
        field271 = null;
        field276 = null;
        field273 = null;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(I)V", line = 230)
    public class14(int arg0) {
        class94.field2391 = arg0;
        class109.field2739 = System.currentTimeMillis();
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)I", line = 240)
    public static int method99(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V", line = 254)
    public static final void method100(byte arg0) {
        try {
            Graphics var1 = class22.field483.getGraphics();
            class78.field1956.method143(0, var1, -10166, 4);
            int var2 = -117 % ((arg0 + 11) / 32);
            class62.field1566.method143(0, var1, -10166, 357);
            class101.field2577.method143(722, var1, -10166, 4);
            class102.field2589.method143(743, var1, -10166, 205);
            class44.field1120.method143(0, var1, -10166, 0);
            class97.field2476.method143(516, var1, -10166, 4);
            class117.field2865.method143(516, var1, -10166, 205);
            class98.field2508.method143(496, var1, -10166, 357);
            class18.field357.method143(0, var1, -10166, 338);
        } catch (Exception var3) {
            class22.field483.repaint();
        }
        field269++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()V", line = 283)
    public void method101() {
        field268++;
    }
}
