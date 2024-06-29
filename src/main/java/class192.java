import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class192 {

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public int field3138;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public int field3136;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public int field3129;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lfi;")
    public class118 field3133;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3131 = "Loading world list data";

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Lad;")
    public static class275 field3135 = new class275(64);

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field3139 = 0;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "[I")
    public static int[] field3142 = new int[64];

    @OriginalMember(owner = "client!k", name = "m", descriptor = "[I")
    public static int[] field3141 = new int[32];

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3140 = "red:";

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI)I")
    public static final int method1343(boolean arg0, int arg1) {
        if (arg1 != -1) {
            return 41;
        }
        field3134++;
        long var2 = class264.method1778(6573);
        for (class199 var4 = arg0 ? (class199) class265.field4318.method379(-21146) : (class199) class265.field4318.method369(true); var4 != null; var4 = (class199) class265.field4318.method369(true)) {
            if ((var4.field3190 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field3190 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2209;
                    class68.field1090[var5] = class310.field5022[var5];
                    var4.method952((byte) 124);
                    return var5;
                }
                var4.method952((byte) 114);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lie;III)V")
    public static final void method1344(class34 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class95.field1504) {
            class116 var4 = class307.field4991[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1765 != null && var4.field1765.field1930.method254()) {
                arg0.method255(var4.field1765.field1930, 128, 0, 0, true);
            }
        }
        if (arg3 < class95.field1504) {
            class116 var5 = class307.field4991[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1765 != null && var5.field1765.field1930.method254()) {
                arg0.method255(var5.field1765.field1930, 0, 0, 128, true);
            }
        }
        if (arg2 < class95.field1504 && arg3 < class200.field3208) {
            class116 var6 = class307.field4991[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1765 != null && var6.field1765.field1930.method254()) {
                arg0.method255(var6.field1765.field1930, 128, 0, 128, true);
            }
        }
        if (arg2 < class95.field1504 && arg3 > 0) {
            class116 var7 = class307.field4991[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1765 != null && var7.field1765.field1930.method254()) {
                arg0.method255(var7.field1765.field1930, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)Z")
    public static final boolean method1345(boolean arg0) {
        field3137++;
        if (arg0) {
            field3135 = null;
        }
        try {
            if (class88.field1378 == 2) {
                if (class121.field1917 == null) {
                    class121.field1917 = class167.method1190(class298.field4859, class249.field4093, class122.field1928);
                    if (class121.field1917 == null) {
                        return false;
                    }
                }
                if (class115.field1753 == null) {
                    class115.field1753 = new class113(class46.field675, class234.field3667);
                }
                if (class91.field1454.method1971(class115.field1753, class310.field5019, class121.field1917, 22050, -1)) {
                    class91.field1454.method1989(-6677);
                    class91.field1454.method1973(class161.field2631, 18);
                    class91.field1454.method1963((byte) 119, class121.field1917, class12.field230);
                    class298.field4859 = null;
                    class88.field1378 = 0;
                    class121.field1917 = null;
                    class115.field1753 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class91.field1454.method1972((byte) -118);
            class88.field1378 = 0;
            class298.field4859 = null;
            class115.field1753 = null;
            class121.field1917 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Led;")
    public static final class195 method1346(Throwable arg0, String arg1) {
        field3132++;
        class195 var2;
        if (arg0 instanceof class195) {
            var2 = (class195) arg0;
            var2.field3159 = var2.field3159 + ' ' + arg1;
        } else {
            var2 = new class195(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method1347(int arg0) {
        field3140 = null;
        field3135 = null;
        field3142 = null;
        if (arg0 == 1) {
            field3131 = null;
            field3141 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
    public static final void method1348(int arg0, int arg1) {
        field3130++;
        class106.field1652.method1880(-63, arg1);
        if (arg0 != 0) {
            method1346((Throwable) null, (String) null);
        }
        class179.field2964.method1880(-117, arg1);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(IIII)V")
    public class192(int arg0, int arg1, int arg2, int arg3) {
        class118 var5 = class249.method1696(arg0, (byte) 59);
        this.field3138 = arg3;
        this.field3136 = arg1;
        this.field3129 = arg2;
        if (var5.field1859 == -1) {
            this.field3133 = var5;
        } else {
            this.field3133 = class249.method1696(var5.field1859, (byte) 59);
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lfi;III)V")
    public class192(class118 arg0, int arg1, int arg2, int arg3) {
        this.field3133 = arg0;
        this.field3136 = arg1;
        this.field3129 = arg2;
        this.field3138 = arg3;
    }
}
