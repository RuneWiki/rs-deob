import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class35 extends class51 {

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "Lic;")
    private static class59 field919 = class59.method433(0, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "Lic;")
    private static class59 field923 = class59.method433(0, " seconds)3");

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "Z")
    public static boolean field925 = false;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "Lic;")
    private static class59 field924 = class59.method433(0, "Loaded update list");

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "I")
    public static int field926 = 0;

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "[I")
    public static int[] field928 = new int[128];

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "Lic;")
    public static class59 field929 = field924;

    @OriginalMember(owner = "client!ef", name = "hb", descriptor = "Lic;")
    public static class59 field933 = field923;

    @OriginalMember(owner = "client!ef", name = "jb", descriptor = "Lic;")
    public static class59 field935 = field919;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "B")
    public byte field927;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "client!ef", name = "gb", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!ef", name = "ib", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!ef", name = "eb", descriptor = "Lmd;")
    public class87 field930;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "[I")
    public static int[] field922;

    @OriginalMember(owner = "client!ef", name = "fb", descriptor = "[I")
    public static int[] field931;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V")
    public static final void method268(byte arg0) {
        field920++;
        if (arg0 < 4) {
            field924 = null;
        }
        if (class131.field2938 != null) {
            class131.field2938.method155(-25);
        }
        if (class107.field2582 != null) {
            class107.field2582.method155(-85);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ldd;BLid;Ldd;Ldd;)Z")
    public static final boolean method269(class26 arg0, byte arg1, class60 arg2, class26 arg3, class26 arg4) {
        class90.field2283 = arg3;
        class25.field620 = arg0;
        class49.field1245 = arg2;
        class19.field430 = arg4;
        if (arg1 < 85) {
            method270(96, 29, 58, -96, 23, 66, -83, (byte) -111, -22);
        }
        field934++;
        return true;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIIBI)V")
    public static final void method270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field932++;
        if (class114.method923(arg6, (byte) -128)) {
            class85.field2137 = null;
            if (arg7 != -27) {
                field922 = null;
            }
            class134.method1031(arg8, arg3, -1, 105, arg4, arg5, arg0, arg2, arg1, class46.field1173[arg6]);
            if (class85.field2137 != null) {
                class134.method1031(arg8, class121.field2789, -1412584499, 121, arg4, arg5, arg0, arg2, class102.field2496, class85.field2137);
                class85.field2137 = null;
            }
        } else if (arg2 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class25.field628[var9] = true;
            }
        } else {
            class25.field628[arg2] = true;
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
    public static void method271(int arg0) {
        field919 = null;
        field923 = null;
        field935 = null;
        field922 = null;
        if (arg0 != -1412584499) {
            method270(80, -116, 7, 55, -112, 88, 126, (byte) -62, 18);
        }
        field933 = null;
        field929 = null;
        field924 = null;
        field931 = null;
        field928 = null;
    }
}
