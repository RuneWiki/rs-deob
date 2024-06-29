import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class335 extends class8 {

    @OriginalMember(owner = "client!s", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field5236 = new String[1000];

    @OriginalMember(owner = "client!s", name = "W", descriptor = "I")
    public static int field5245 = 0;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "I")
    public static int field5243 = 0;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "[I")
    public static int[] field5232 = new int[2500];

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
    public static int field5247 = 0;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!s", name = "L", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "I")
    public int field5237;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
    public int field5239;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "I")
    public int field5241;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "I")
    public int field5244;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "Lha;")
    public static class328 field5238;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "Ljava/lang/String;")
    public String field5230;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "[I")
    public int[] field5240;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "[I")
    public int[] field5246;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "[Lcd;")
    public class69[] field5229;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "[Ljava/lang/String;")
    public String[] field5242;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZII)V", line = 4)
    public static final void method2338(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field5233++;
        if (arg1 < -94 && class263.method1875(121, arg3)) {
            class168.method1224(arg4, arg0, arg2, -1, class221.field3547[arg3], (byte) 14);
        }
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V", line = 26)
    public static final void method2339(int arg0) {
        int var1 = -101 / ((arg0 + 27) / 53);
        class62.field909.method702((byte) 125);
        field5231++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 36)
    public static final int method2340(String arg0, int arg1) {
        field5228++;
        for (int var2 = arg1; var2 < class139.field2185.length; var2++) {
            if (class139.field2185[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(CLjava/lang/StringBuffer;II)Ljava/lang/StringBuffer;", line = 54)
    public static final StringBuffer method2341(char arg0, StringBuffer arg1, int arg2, int arg3) {
        field5234++;
        int var4 = arg1.length();
        arg1.setLength(arg3);
        for (int var5 = var4; var5 < arg3; var5++) {
            arg1.setCharAt(var5, arg0);
        }
        if (arg2 != -1) {
            field5245 = 76;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Ls;", line = 80)
    public static final class335 method2342(int arg0, int arg1) {
        field5235++;
        class335 var2 = (class335) class336.field5257.method755((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class226.field3610.method1287(0, arg1, arg0);
        if (var3 == null) {
            return null;
        }
        class335 var4 = new class335();
        class44 var5 = new class44(var3);
        var5.field586 = var5.field573.length - 2;
        int var6 = var5.method271(21081);
        int var7 = var5.field573.length - var6 - 14;
        var5.field586 = var7;
        int var8 = var5.method238((byte) 82);
        var4.field5237 = var5.method271(arg0 ^ 0xFFFFADA6);
        var4.field5244 = var5.method271(arg0 ^ 0xFFFFADA6);
        var4.field5241 = var5.method271(21081);
        var4.field5239 = var5.method271(21081);
        int var9 = var5.method286((byte) -94);
        if (var9 > 0) {
            var4.field5229 = new class69[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method271(21081);
                class69 var12 = new class69(class120.method843(53, var11));
                var4.field5229[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method238((byte) 82);
                    int var14 = var5.method238((byte) 82);
                    var12.method461(-127, (long) var13, new class174(var14));
                }
            }
        }
        var5.field586 = 0;
        var4.field5230 = var5.method235(false);
        var4.field5240 = new int[var8];
        int var15 = 0;
        var4.field5246 = new int[var8];
        var4.field5242 = new String[var8];
        while (var5.field586 < var7) {
            int var16 = var5.method271(21081);
            if (var16 == 3) {
                var4.field5242[var15] = var5.method265(0).intern();
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field5246[var15] = var5.method286((byte) -99);
            } else {
                var4.field5246[var15] = var5.method238((byte) 82);
            }
            var4.field5240[var15++] = var16;
        }
        class336.field5257.method750(var4, (long) arg1, -18339);
        return var4;
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V", line = 178)
    public static void method2343(int arg0) {
        field5232 = null;
        field5236 = null;
        if (arg0 == -10396) {
            field5238 = null;
        }
    }
}
