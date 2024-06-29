import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class138 {

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public int field2148 = 0;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public int field2156 = 0;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public int field2150 = 2048;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public int field2152 = 2048;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field2145 = -1;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "[[I")
    public static int[][] field2155 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field2146 = 0;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field2157 = 0;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Llb;")
    public static class211 field2151;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "Lqm;")
    public static class233 field2159;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "Lcb;")
    public static class283 field2158;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "[[B")
    public static byte[][] field2153;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([BI)Lm;", line = 10)
    public static final class48 method1046(byte[] arg0, int arg1) {
        field2149++;
        if (arg0 == null) {
            return null;
        }
        class48 var2;
        if (class36.field534) {
            var2 = new class140(arg0, class271.field4096, class101.field1541, class111.field1756, class323.field5027, class274.field4162);
        } else {
            var2 = new class74(arg0, class271.field4096, class101.field1541, class111.field1756, class323.field5027, class274.field4162);
        }
        int var3 = -32 % ((74 - arg1) / 51);
        class265.method1835(10);
        return var2;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII[I)V", line = 37)
    public static final void method1047(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field2147++;
        if (arg3 != 7) {
            return;
        }
        arg2--;
        int var6 = arg1 - 1;
        int var5 = var6 - 7;
        while (var5 > arg2) {
            int var7 = arg2 + 1;
            arg4[var7] = arg0;
            int var8 = var7 + 1;
            arg4[var8] = arg0;
            int var9 = var8 + 1;
            arg4[var9] = arg0;
            int var10 = var9 + 1;
            arg4[var10] = arg0;
            int var11 = var10 + 1;
            arg4[var11] = arg0;
            int var12 = var11 + 1;
            arg4[var12] = arg0;
            int var13 = var12 + 1;
            arg4[var13] = arg0;
            arg2 = var13 + 1;
            arg4[arg2] = arg0;
        }
        while (arg2 < var6) {
            arg2++;
            arg4[arg2] = arg0;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lhb;III)V", line = 69)
    private final void method1048(class35 arg0, int arg1, int arg2, int arg3) {
        field2160++;
        if (~arg2 == arg1) {
            this.field2148 = arg0.method273(65280);
        } else if (arg2 == 2) {
            this.field2152 = arg0.method300(-1394191632);
        } else if (arg2 == 3) {
            this.field2150 = arg0.method300(-1394191632);
        } else if (arg2 == 4) {
            this.field2156 = arg0.method260((byte) -63);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 94)
    public static void method1049(int arg0) {
        field2155 = (int[][]) null;
        field2153 = (byte[][]) null;
        field2151 = null;
        field2158 = null;
        int var1 = -40 / ((-arg0 - 15) / 60);
        field2159 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lhb;II)V", line = 109)
    public final void method1050(class35 arg0, int arg1, int arg2) {
        field2144++;
        while (true) {
            int var4 = arg0.method273(65280);
            if (var4 == 0) {
                if (arg1 != -16295) {
                    this.method1050((class35) null, 23, 103);
                }
                return;
            }
            this.method1048(arg0, -2, var4, arg2);
        }
    }
}
