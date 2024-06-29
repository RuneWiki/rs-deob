import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class130 {

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public int field1919 = -1;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field1903 = 0;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "[I")
    public static int[] field1909 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Lee;")
    public static class195 field1908 = new class195();

    @OriginalMember(owner = "client!re", name = "o", descriptor = "[I")
    public static int[] field1915 = new int[5];

    @OriginalMember(owner = "client!re", name = "u", descriptor = "[Lob;")
    public static class152[] field1921 = new class152[14];

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public static int field1924 = 0;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field1922 = new String[1000];

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public int field1904;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public int field1905;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public int field1907;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public int field1910;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public int field1912;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public int field1913;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public int field1916;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public int field1918;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "[Lkj;")
    public static class30[] field1920;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILpk;)V")
    public static final void method892(int arg0, class237 arg1) {
        class51.field830 = class296.method1952(arg1, class1.field10, -116);
        field1902++;
        class256.field3937 = new int[256];
        if (arg0 != 1000) {
            return;
        }
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) ((class178.field2612[var2] & 0xFF0000) >> 16);
            int var5 = class178.field2612[var2 + 1] >> 16 & 0xFF;
            float var6 = ((float) var5 - var4) / 64.0F;
            float var7 = (float) (class178.field2612[var2] >> 8 & 0xFF);
            float var8 = (float) (class178.field2612[var2] & 0xFF);
            int var9 = class178.field2612[var2 + 1] >> 8 & 0xFF;
            float var10 = ((float) var9 - var7) / 64.0F;
            int var11 = class178.field2612[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var8) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class256.field3937[var2 * 64 + var13] = class186.method1215(class186.method1215((int) var4 << 16, (int) var7 << 8), (int) var8);
                var8 += var12;
                var7 += var10;
                var4 += var6;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class256.field3937[var3] = class178.field2612[3];
        }
        class160.field2333 = new int[32768];
        class221.field3446 = new int[32768];
        class237.method1618(126, (class46) null);
        class47.field795 = new int[32768];
        class111.field1681 = new int[32768];
        class49.field809 = new class289(128, 254);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
    public static final void method893(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 21) {
            method896(true, (String) null, (class54) null);
        }
        field1917++;
        if (arg1 > arg0) {
            class222.method1519((byte) -128, arg0, class241.field3751[arg3], arg1, arg4);
        } else {
            class222.method1519((byte) -109, arg1, class241.field3751[arg3], arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
    public static final void method894(int arg0, int arg1) {
        field1914++;
        class105 var2 = class9.method72(arg0, -1, arg1);
        var2.method764((byte) -119);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static void method895(int arg0) {
        field1922 = null;
        field1921 = null;
        field1920 = null;
        field1908 = null;
        field1915 = null;
        field1909 = null;
        if (arg0 <= 61) {
            method892(-109, (class237) null);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZLjava/lang/String;Lca;)I")
    public static final int method896(boolean arg0, String arg1, class54 arg2) {
        field1923++;
        if (!arg0) {
            field1922 = null;
        }
        int var3 = arg2.field887;
        byte[] var4 = class171.method1145((byte) 46, arg1);
        arg2.method412(var4.length, 5127);
        arg2.field887 += class209.field3128.method1866(var4.length, 0, arg2.field848, arg2.field887, var4, (byte) 123);
        return arg2.field887 - var3;
    }
}
