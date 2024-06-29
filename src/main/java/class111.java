import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class111 extends class241 {

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "Z")
    public static boolean field2084 = false;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public int field2082;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public int field2086;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "Lqf;")
    public static class235 field2098;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "[I")
    public int[] field2083;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "[I")
    public int[] field2089;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "[I")
    public int[] field2091;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "[Lqf;")
    public class235[] field2085;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "[Lqf;")
    public class235[] field2092;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "[[[B")
    public byte[][][] field2087;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILoh;)V")
    public static final void method729(int arg0, int arg1, class263 arg2) {
        class64 var3 = class84.method563(2, arg0, -94);
        field2088++;
        int var4 = 61 % ((57 - arg1) / 32);
        var3.method396(true);
        var3.field1282 = arg2;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIZI)V")
    public static final void method730(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2093++;
        int var5 = 0;
        if (!arg3) {
            field2098 = null;
        }
        while (var5 < class257.field4471) {
            if (class216.field3835[var5] + class185.field3350[var5] > arg0 && class185.field3350[var5] < (arg0 + arg1) && class119.field2217[var5] + class115.field2155[var5] > arg2 && class115.field2155[var5] < arg2 + arg4) {
                class183.field3317[var5] = true;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lbb;B)V")
    public static final void method731(class88 arg0, byte arg1) {
        for (int var2 = 0; var2 < class4.field73.length; var2++) {
            class4.field73[var2] = 0;
        }
        field2095++;
        short var3 = 256;
        if (arg1 >= -18) {
            return;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var3 * Math.random() * 128.0D);
            class4.field73[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < (var3 - 1); var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class148.field2694[var15] = (class4.field73[var15 - 1] + class4.field73[var15 - -128] - (-class4.field73[var15 + 1] - class4.field73[var15 - 128])) / 4;
                }
            }
            int[] var13 = class4.field73;
            class4.field73 = class148.field2694;
            class148.field2694 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field2213; var7++) {
            for (int var8 = 0; var8 < arg0.field2205; var8++) {
                if (arg0.field1758[var6++] != 0) {
                    int var9 = arg0.field2204 + var8 + 16;
                    int var10 = var7 + arg0.field2216 + 16;
                    int var11 = (var10 << 7) + var9;
                    class4.field73[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static void method732(byte arg0) {
        field2098 = null;
        if (arg0 != -125) {
            method730(-106, 33, -54, false, -78);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLsi;)Lma;")
    public static final class184 method733(byte arg0, class194 arg1) {
        field2096++;
        class184 var2 = new class184(arg1.method1320(false), arg1.method1320(false), arg1.method1294((byte) 3), arg1.method1294((byte) 3), arg1.method1266(4), arg1.method1301(-8317) == 1);
        int var3 = arg1.method1301(-8317);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field3329.method1883(new class106(arg1.method1294((byte) 3), arg1.method1294((byte) 3), arg1.method1294((byte) 3), arg1.method1294((byte) 3)), (byte) -3);
        }
        var2.method1216((byte) -55);
        return arg0 == 127 ? var2 : null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)V")
    public static final void method734(byte arg0, int arg1) {
        field2097++;
        class64 var2 = class84.method563(3, arg1, arg0 + 36);
        if (arg0 == -111) {
            var2.method393(-92);
        }
    }
}
