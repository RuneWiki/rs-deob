import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class429 {

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field6231 = 0;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Ljm;")
    public static class167 field6237 = new class167("", 12);

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field6241 = 1;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "[I")
    public static int[] field6238 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "[[I")
    public static int[][] field6242 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "Ljava/lang/String;")
    public static String field6240 = null;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public int field6230;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public int field6234;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public int field6235;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public int field6236;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Lae;")
    public static class285 field6239;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method2640(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field6232++;
        if (!arg5) {
            method2642((byte) 94, (String) null);
        }
        int var8 = arg3 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class115.field1563 - class11.field153) * var8 / 100 + class11.field153;
        int var10 = arg2 * var9 >> 8;
        int var11 = 16384 - arg0 & 0x3FFF;
        int var12 = 16384 - arg6 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class327.field4863[var11] * -var10 >> 15;
            var15 = class327.field4862[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class327.field4863[var12] * var15 >> 15;
            var15 = class327.field4862[var12] * var15 >> 15;
        }
        class345.field5077 = arg4 - var15;
        class103.field1341 = arg0;
        class164.field2171 = arg7 - var14;
        class298.field4343 = arg1 - var13;
        class136.field1867 = arg6;
        class86.field1067 = 0;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static void method2641(byte arg0) {
        if (arg0 <= 100) {
            field6231 = -35;
        }
        field6239 = null;
        field6237 = null;
        field6238 = null;
        field6242 = null;
        field6240 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method2642(byte arg0, String arg1) {
        field6233++;
        int var2 = arg1.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        if (arg0 != 72) {
            method2640(122, -97, -81, -22, 31, true, -122, 103);
        }
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class233.method1584(-182, var6);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }
}
