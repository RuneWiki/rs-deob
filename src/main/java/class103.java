import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class103 {

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public int field2229 = 0;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public int field2241 = 0;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Llc;")
    public static class69 field2222 = class69.method470((byte) -104, "Ok");

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field2224 = 0;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Llc;")
    public static class69 field2226 = class69.method470((byte) -105, "Jan");

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field2228 = 0;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field2225 = new Object();

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "Llc;")
    public static class69 field2234 = class69.method470((byte) -111, "scape main");

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "Llc;")
    public static class69 field2237 = class69.method470((byte) -104, "Cabbage");

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "Llc;")
    public static class69 field2239 = class69.method470((byte) -105, "Earlier today");

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public int field2220;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public int field2221;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public int field2223;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public int field2227;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public int field2233;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "Lt;")
    public static class110 field2236;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Lea;")
    public class26 field2231;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "Lfe;")
    public static class36 field2240;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "Lkc;")
    public static class63 field2238;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static final void method777(int arg0) {
        for (int var1 = arg0; var1 < class27.field585; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class92.field2013[var1];
            }
            class60 var6 = class123.field2682[var5];
            if (var6 != null && var6.field1026 > 0) {
                var6.field1026--;
                if (var6.field1026 == 0) {
                    var6.field1054 = null;
                }
            }
        }
        field2232++;
        for (int var2 = 0; var2 < class62.field1284; var2++) {
            int var3 = class70.field1569[var2];
            class72 var4 = class112.field2434[var3];
            if (var4 != null && var4.field1026 > 0) {
                var4.field1026--;
                if (var4.field1026 == 0) {
                    var4.field1054 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZILjava/awt/Graphics;Lhc;I)V")
    public static final void method778(int arg0, boolean arg1, int arg2, Graphics arg3, class45 arg4, int arg5) {
        class75.field1690.method606(-2);
        field2235++;
        class106.field2311.method80(0, 0);
        arg4.method301(class49.field1012, 55, 28, 16777215, arg1);
        if (arg5 == 0) {
            arg4.method301(class123.field2678, 55, 41, 65280, true);
        }
        if (arg5 == 1) {
            arg4.method301(class55.field1171, 55, 41, 16776960, true);
        }
        if (arg5 == 2) {
            arg4.method301(class46.field971, 55, 41, 16711680, true);
        }
        if (arg5 == 3) {
            arg4.method301(class93.field2043, 55, 41, 65535, true);
        }
        arg4.method301(class22.field466, 184, 28, 16777215, true);
        if (arg0 == 0) {
            arg4.method301(class123.field2678, 184, 41, 65280, true);
        }
        if (arg0 == 1) {
            arg4.method301(class55.field1171, 184, 41, 16776960, true);
        }
        if (arg0 == 2) {
            arg4.method301(class46.field971, 184, 41, 16711680, true);
        }
        arg4.method301(class24.field503, 324, 28, 16777215, true);
        if (arg2 == 0) {
            arg4.method301(class123.field2678, 324, 41, 65280, true);
        }
        if (arg2 == 1) {
            arg4.method301(class55.field1171, 324, 41, 16776960, true);
        }
        if (arg2 == 2) {
            arg4.method301(class46.field971, 324, 41, 16711680, true);
        }
        arg4.method301(class43.field861, 458, 33, 16777215, true);
        class75.field1690.method69(arg3, 453, true, 0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public static void method779(boolean arg0) {
        field2237 = null;
        field2236 = null;
        field2239 = null;
        field2222 = null;
        field2240 = null;
        if (!arg0) {
            field2234 = null;
            field2238 = null;
            field2226 = null;
            field2225 = null;
        }
    }
}
