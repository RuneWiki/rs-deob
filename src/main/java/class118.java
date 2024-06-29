import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class118 extends class129 {

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "[Lie;")
    public class53[] field2837;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "Lv;")
    private static class122 field2844 = class55.method425(-103, "Could not complete login)3");

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "Lv;")
    public static class122 field2846 = class55.method425(-93, ":0");

    @OriginalMember(owner = "client!ua", name = "hb", descriptor = "Lv;")
    public static class122 field2854 = field2844;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
    public static int field2843 = 0;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "Lv;")
    public static class122 field2842 = class55.method425(-123, "Wen m\u001c1chten Sie der Liste hinzuf\u001c1gen?");

    @OriginalMember(owner = "client!ua", name = "fb", descriptor = "I")
    public static int field2852 = 2;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "Lv;")
    private static class122 field2839 = class55.method425(-110, "New User");

    @OriginalMember(owner = "client!ua", name = "eb", descriptor = "Lv;")
    public static class122 field2851 = field2839;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "Lfc;")
    public static class34 field2848 = new class34();

    @OriginalMember(owner = "client!ua", name = "nb", descriptor = "Lv;")
    private static class122 field2860 = class55.method425(-113, "Error loading your profile)3");

    @OriginalMember(owner = "client!ua", name = "lb", descriptor = "Lv;")
    public static class122 field2858 = field2860;

    @OriginalMember(owner = "client!ua", name = "mb", descriptor = "[I")
    public static int[] field2859 = new int[2048];

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!ua", name = "ib", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!ua", name = "jb", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!ua", name = "kb", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "[I")
    public static int[] field2840;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "[I")
    public static int[] field2847;

    @OriginalMember(owner = "client!ua", name = "gb", descriptor = "[I")
    public static int[] field2853;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "[[B")
    public static byte[][] field2838;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)Z", line = 8)
    public final boolean method902(int arg0, byte arg1) {
        int var3 = 76 / ((59 - arg1) / 60);
        field2845++;
        return this.field2837[arg0].field1358;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V", line = 19)
    public static void method903(byte arg0) {
        field2851 = null;
        field2848 = null;
        field2840 = null;
        field2844 = null;
        field2854 = null;
        field2847 = null;
        field2846 = null;
        field2853 = null;
        if (arg0 >= -90) {
            field2848 = null;
        }
        field2838 = null;
        field2859 = null;
        field2860 = null;
        field2839 = null;
        field2858 = null;
        field2842 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lv;Lmb;Lv;B)Lab;", line = 75)
    public static final class3 method904(class122 arg0, class74 arg1, class122 arg2, byte arg3) {
        field2841++;
        int var4 = arg1.method628(arg0, true);
        if (arg3 < 39) {
            method904(null, null, null, (byte) -23);
        }
        int var5 = arg1.method605(arg2, var4, 1036);
        return class6.method75(var5, 0, arg1, var4);
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lmb;Lmb;IZ)V", line = 110)
    public class118(class74 arg0, class74 arg1, int arg2, boolean arg3) {
        class34 var5 = new class34();
        int var6 = arg0.method601(-60, arg2);
        this.field2837 = new class53[var6];
        int[] var7 = arg0.method604(arg2, 4);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method611(0, arg2, var7[var8]);
            class115 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class115 var12 = (class115) var5.method311((byte) 81); var12 != null; var12 = (class115) var5.method302((byte) -94)) {
                if (var12.field2818 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method606(0, -1, var11);
                } else {
                    var13 = arg1.method606(var11, -1, 0);
                }
                var10 = new class115(var11, var13);
                var5.method312(false, var10);
            }
            this.field2837[var7[var8]] = new class53(var9, var10);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLmb;ILmb;)V", line = 168)
    public static final void method905(boolean arg0, class74 arg1, int arg2, class74 arg3) {
        class75.field2007 = arg3;
        class56.field1467 = arg1;
        class81.field2118 = arg0;
        class73.field1930 = class56.field1467.method601(-107, arg2);
        field2857++;
    }
}
