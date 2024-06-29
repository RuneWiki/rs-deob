import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class188 extends class264 {

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    public int field2623;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "I")
    public int field2624;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "I")
    public static int field2625 = 0;

    @OriginalMember(owner = "client!in", name = "v", descriptor = "I")
    public static int field2629 = 0;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "I")
    public static int field2631 = 0;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "Lil;")
    public static class274 field2628 = new class274(2, 4);

    @OriginalMember(owner = "client!in", name = "z", descriptor = "Ldq;")
    public static class90 field2633 = new class90(8);

    @OriginalMember(owner = "client!in", name = "s", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V", line = 3)
    public static void method1284(int arg0) {
        field2633 = null;
        field2628 = null;
        if (arg0 > -18) {
            method1287(6, 51, -14, (Class) null);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BZ)V", line = 14)
    public static final void method1285(byte arg0, boolean arg1) {
        if (arg1 && class66.field848 != null) {
            class150.field2028 = class66.field848.field3541;
        } else {
            class150.field2028 = -1;
        }
        field2627++;
        class418.field6031 = null;
        class66.field848 = null;
        class223.field3243 = null;
        class41.field549 = 0;
        class66.method497();
        class66.field857.method2477(-14221);
        if (arg0 < 106) {
            method1284(-89);
        }
        class47.field617 = null;
        class307.field4538 = null;
        class37.field520 = null;
        class66.field859 = null;
        class71.field929 = -1;
        class223.field3296 = null;
        class171.field2235 = null;
        class71.field932 = null;
        class4.field68 = -1;
        class150.field2032 = null;
        class241.field3579 = null;
        class47.field618 = null;
        class454.method2819(-3);
        class282.method1903((byte) 99, 64, 128);
        class404.method2519((byte) 117, 64, 64);
        class69.method508(64, (byte) -13);
        class339.method2189(64, -102);
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)Ljava/lang/String;", line = 52)
    public static final String method1286(byte arg0) {
        int var1 = -88 / ((arg0 + 20) / 49);
        field2632++;
        String var2 = "www";
        if (class373.field5452 != 0) {
            var2 = "www-wtqa";
        }
        String var3 = "";
        if (class180.field2554 != null) {
            var3 = "/p=" + class180.field2554;
        }
        return "http://" + var2 + "." + class408.field5869.field1475 + ".com/l=" + class153.field2073 + "/a=" + class22.field320 + var3 + "/";
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(II)V", line = 77)
    public class188(int arg0, int arg1) {
        this.field2623 = arg0;
        this.field2624 = arg1;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIILjava/lang/Class;)Lbf;", line = 97)
    public static final class336 method1287(int arg0, int arg1, int arg2, Class arg3) {
        class369 var4 = class178.field2530[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class206 var5 = var4.field5345; var5 != null; var5 = var5.field2882) {
            class336 var6 = var5.field2880;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field4961 == arg1 && var6.field4959 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)Z", line = 122)
    public static final boolean method1288(boolean arg0) {
        field2630++;
        if (arg0) {
            return false;
        }
        try {
            return class196.method1371(0);
        } catch (IOException var4) {
            class346.method2239(19858);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class30.field421 == null ? -1 : class30.field421.method249((byte) -125)) + "," + (class444.field6471 == null ? -1 : class444.field6471.method249((byte) -66)) + "," + (class251.field3687 == null ? -1 : class251.field3687.method249((byte) -91)) + " - " + class35.field496 + "," + (class28.field399 + class187.field2619.field793[0]) + "," + (class187.field2619.field784[0] + class134.field1846) + " - ";
            for (int var3 = 0; var3 < class35.field496 && var3 < 50; var3++) {
                var2 = var2 + class22.field306.field3764[var3] + ",";
            }
            class365.method2331(var2, var5, 28692);
            class164.method1086((byte) 43);
            return true;
        }
    }
}
