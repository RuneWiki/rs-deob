import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class168 {

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Lad;")
    public static class275 field2765 = new class275(200);

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[Lr;")
    public static class43[] field2768 = new class43[8];

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V")
    public static final void method1192(boolean arg0, int arg1) {
        field2766++;
        class16.field305 = -1;
        class45.field667 = arg1;
        if (!arg0) {
            field2762 = 77;
        }
        class16.field305 = -1;
        class66.method441(-97);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
    public static final void method1193(int arg0, int arg1) {
        field2764++;
        class16.field305 = -1;
        class208.field3314 = arg1;
        class249.field4095 = arg0;
        class66.method441(-73);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1194(int arg0, String arg1, int arg2) {
        if (arg2 != -1701) {
            method1192(false, -101);
        }
        field2763++;
        String var3 = class179.method1260(class138.method957(0, arg1), 0);
        boolean var4 = false;
        for (int var5 = 0; var5 < class134.field2172; var5++) {
            class12 var6 = class28.field494[class111.field1708[var5]];
            if (var6 != null && var6.field222 != null && var6.field222.equalsIgnoreCase(var3)) {
                var4 = true;
                if (arg0 == 1) {
                    class311.field5027.method2081(false, 154);
                    class41.field631++;
                    class311.field5027.method1832(class111.field1708[var5], (byte) 62);
                    class311.field5027.method1860(0, arg2 + 9940);
                } else if (arg0 == 4) {
                    class311.field5027.method2081(false, 193);
                    class80.field1300++;
                    class311.field5027.method1844(-1, class111.field1708[var5]);
                    class311.field5027.method1860(0, 8239);
                } else if (arg0 == 5) {
                    class311.field5027.method2081(false, 80);
                    class217.field3407++;
                    class311.field5027.method1844(-1, class111.field1708[var5]);
                    class311.field5027.method1814(0, (byte) -12);
                } else if (arg0 == 6) {
                    class246.field3877++;
                    class311.field5027.method2081(false, 78);
                    class311.field5027.method1860(0, arg2 + 9940);
                    class311.field5027.method1823(1617348648, class111.field1708[var5]);
                } else if (arg0 == 7) {
                    class304.field4953++;
                    class311.field5027.method2081(false, 254);
                    class311.field5027.method1823(1617348648, class111.field1708[var5]);
                    class311.field5027.method1827(0, -719196768);
                }
                break;
            }
        }
        if (!var4) {
            class74.method536(class22.field409 + var3, "", (byte) -57, 0);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
    public static void method1195(boolean arg0) {
        if (!arg0) {
            field2768 = null;
            field2765 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method1196(String arg0, boolean arg1, int arg2) {
        if (arg2 != 78) {
            method1196((String) null, false, -44);
        }
        field2761++;
        if (arg1) {
            try {
                class18.field329.getAppletContext().showDocument(new URL(class18.field329.getCodeBase(), arg0), "_blank");
            } catch (Exception var3) {
            }
            return;
        }
        try {
            class216.method1481(-93, class44.field659.field1105, "loggedout");
        } catch (Throwable var5) {
        }
        try {
            class18.field329.getAppletContext().showDocument(new URL(class18.field329.getCodeBase(), arg0), "_top");
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lfj;Z)Ldg;")
    public static final class148 method1197(class274 arg0, boolean arg1) {
        if (!arg1) {
            field2768 = null;
        }
        class148 var2 = new class148();
        var2.field2361 = arg0.method1837(252);
        field2767++;
        var2.field2362 = class297.method2037(var2.field2361, -15736);
        return var2;
    }
}
