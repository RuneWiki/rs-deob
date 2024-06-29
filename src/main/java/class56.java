import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class56 {

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "[I")
    private int[] field1107;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field1109 = 0;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "Lrd;")
    private static class173 field1105 = class133.method843("Select", 116);

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "[I")
    public static int[] field1108 = new int[99];

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field1112 = 0;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lrd;")
    public static class173 field1106 = field1105;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
    public static void method358(boolean arg0) {
        if (arg0) {
            method364(19, null);
        }
        field1108 = null;
        field1106 = null;
        field1105 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([[IZ)V")
    public static final void method359(int[][] arg0, boolean arg1) {
        field1113++;
        if (!arg1) {
            field1109 = -83;
        }
        class107.field1998 = arg0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIBLbc;)Lsa;")
    public static final class180 method360(int arg0, int arg1, byte arg2, class14 arg3) {
        field1114++;
        if (class18.method155(arg1, arg0, arg3, (byte) -73)) {
            if (arg2 != -93) {
                method360(88, -22, (byte) -85, null);
            }
            return class155.method1020(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIBI)I")
    public static final int method361(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = -107 % ((36 - arg2) / 58);
        field1117++;
        int var5 = arg3 >> 7;
        int var6 = arg1 >> 7;
        if (var5 < 0 || var6 < 0 || var5 > 103 || var6 > 103) {
            return 0;
        }
        int var7 = arg0;
        if (arg0 < 3 && (class21.field462[1][var5][var6] & 0x2) == 2) {
            var7 = arg0 + 1;
        }
        int var8 = arg3 & 0x7F;
        int var9 = arg1 & 0x7F;
        int var10 = (128 - var8) * class46.field975[var7][var5][var6] + class46.field975[var7][var5 + 1][var6] * var8 >> 7;
        int var11 = (128 - var8) * class46.field975[var7][var5][var6 + 1] + class46.field975[var7][var5 + 1][var6 + 1] * var8 >> 7;
        return (128 - var9) * var10 + var9 * var11 >> 7;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)I")
    public final int method362(int arg0, boolean arg1) {
        field1110++;
        int var3 = (this.field1107.length >> 1) - 1;
        int var4 = arg0 & var3;
        if (!arg1) {
            return -28;
        }
        while (true) {
            int var5 = this.field1107[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1107[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([I)V")
    public class56(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field1107 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1107[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field1107[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field1107[var5 + var5] = arg0[var4];
            this.field1107[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILbc;ZLbc;)V")
    public static final void method363(int arg0, class14 arg1, boolean arg2, class14 arg3) {
        class25.field531 = arg2;
        class21.field465 = arg1;
        if (arg0 < 63) {
            field1109 = 10;
        }
        class117.field2177 = arg3;
        field1115++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILjava/lang/String;)Lrd;")
    public static final class173 method364(int arg0, String arg1) {
        field1116++;
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg1.getBytes();
        }
        class173 var3 = new class173();
        var3.field3379 = 0;
        var3.field3415 = var2;
        for (int var4 = arg0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field3379++] = var2[var4];
            }
        }
        return var3;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field1108[var1] = var0 / 4;
        }
    }
}
