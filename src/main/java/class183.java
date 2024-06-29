import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class183 extends class134 {

    @OriginalMember(owner = "client!di", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2884 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field2881 = 0;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "Z")
    public static boolean field2893 = false;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "Ljl;")
    public static class263 field2900 = new class263(5000);

    @OriginalMember(owner = "client!di", name = "H", descriptor = "I")
    public static int field2901 = 0;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!di", name = "r", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "I")
    public int field2889;

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public int field2890;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "Lkm;")
    public static class297 field2895;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "[B")
    public static byte[] field2896;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "[I")
    public int[] field2888;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "[I")
    public int[] field2892;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "[I")
    public int[] field2897;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "[Lac;")
    public class139[] field2891;

    @OriginalMember(owner = "client!di", name = "E", descriptor = "[Lac;")
    public class139[] field2898;

    @OriginalMember(owner = "client!di", name = "t", descriptor = "[[[B")
    public byte[][][] field2887;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)J")
    public static final long method1310(int arg0, int arg1, int arg2) {
        class22 var3 = class149.field2210[arg0][arg1][arg2];
        return var3 == null || var3.field377 == null ? 0L : var3.field377.field1668;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V")
    public static final void method1311(int arg0) {
        field2882++;
        if (arg0 != 16495) {
            field2893 = true;
        }
        class272.field4346.method1169(true);
        class141.field2102.method1169(true);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)I")
    public static final int method1312(int arg0, byte arg1) {
        if (arg1 > -5) {
            return -126;
        } else {
            field2886++;
            return arg0 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    public static final boolean method1313(int arg0, String arg1, String arg2) {
        field2883++;
        int var3 = arg1.length();
        int var4 = arg2.length();
        if (var4 > var3) {
            return false;
        }
        for (int var5 = arg0; var5 < var4; var5++) {
            char var6 = arg1.charAt(var5);
            char var7 = arg2.charAt(var5);
            if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIII)V")
    public static final void method1314(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2899++;
        if (arg4 != -29103) {
            return;
        }
        class69 var5 = class255.method1723((byte) 32, arg1, 10);
        var5.method556((byte) -122);
        var5.field1091 = arg3;
        var5.field1088 = arg2;
        var5.field1086 = arg0;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V")
    public static void method1315(int arg0) {
        field2884 = null;
        if (arg0 < 78) {
            method1311(58);
        }
        field2900 = null;
        field2895 = null;
        field2896 = null;
    }
}
