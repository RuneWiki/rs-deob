import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class153 {

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1930 = "Allocated memory";

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "[Lom;")
    public static class127[] field1934 = new class127[14];

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "F")
    public static float field1933;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "Lam;")
    public static class286 field1929;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "[[I")
    public static int[][] field1932;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    public static void method811(int arg0) {
        field1934 = null;
        field1929 = null;
        field1930 = null;
        if (arg0 != 13839) {
            method813((class286) null, (byte) -96);
        }
        field1932 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II[I)[I")
    public static final int[] method812(int arg0, int arg1, int[] arg2) {
        field1928++;
        int[] var3 = new int[1152];
        int var4 = 0;
        for (int var5 = arg1; var5 < 32; var5++) {
            for (int var6 = 0; var6 < 36; var6++) {
                int var7 = arg2[var4];
                if (var7 == 0) {
                    if (var6 > 0 && arg2[var4 - 1] != 0) {
                        var7 = arg0;
                    } else if (var5 > 0 && arg2[var4 - 36] != 0) {
                        var7 = arg0;
                    } else if (var6 < 35 && arg2[var4 + 1] != 0) {
                        var7 = arg0;
                    } else if (var5 < 31 && arg2[var4 + 36] != 0) {
                        var7 = arg0;
                    }
                }
                var3[var4++] = var7;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lam;B)V")
    public static final void method813(class286 arg0, byte arg1) {
        field1931++;
        class189.field2395 = arg0;
        int var2 = -128 % ((-arg1 - 66) / 40);
    }
}
