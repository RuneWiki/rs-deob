import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class343 extends class71 {

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public int field5340;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public int field5350;

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "[[I")
    public int[][] field5351;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "[I")
    public int[] field5343;

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "[I")
    public int[] field5355;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "[Z")
    public boolean[] field5345;

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "I")
    public static int field5354 = 0;

    @OriginalMember(owner = "client!dj", name = "G", descriptor = "[Lp;")
    public static class108[] field5353 = new class108[50];

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "Lkb;")
    public static class39 field5342;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "Lkb;")
    public static class39 field5344;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method2362(byte arg0, int arg1) {
        if (arg0 > -113) {
            method2362((byte) -67, -30);
        }
        class56.field737.method1625(arg1, (byte) 80);
        field5347++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 15)
    public static final String method2363(long arg0, int arg1) {
        field5349++;
        return arg1 < 82 ? (String) null : class336.method2313((byte) -110, arg0);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V", line = 27)
    public static void method2364(boolean arg0) {
        field5353 = null;
        field5342 = null;
        field5344 = null;
        if (!arg0) {
            field5342 = (class39) null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V", line = 41)
    public static final void method2365(int arg0) {
        field5341++;
        class105.field1590 = null;
        class327.field5101 = null;
        class210.field3445 = null;
        if (arg0 != 0) {
            method2366(-115);
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)I", line = 54)
    public static final int method2366(int arg0) {
        if (arg0 != -20854) {
            field5342 = (class39) null;
        }
        field5348++;
        return 2;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILim;)V", line = 73)
    public static final void method2367(int arg0, class192 arg1) {
        int var2 = -30 % ((arg0 - 37) / 37);
        for (int var3 = 0; var3 < class325.field5080; var3++) {
            int var4 = arg1.method1362(126);
            int var5 = arg1.method1396(-74);
            if (var5 == 65535) {
                var5 = -1;
            }
            if (class147.field2197[var4] != null) {
                class147.field2197[var4].field3041 = var5;
            }
        }
        field5352++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILlg;)V", line = 107)
    public static final void method2368(int arg0, class132 arg1) {
        field5346++;
        int var2 = arg1.field1978 - class48.field648;
        int var3 = arg1.field1950 * 128 + (arg1.method910(-1) * 64);
        int var4 = arg1.field1995 * 128 + arg1.method910(-1) * 64;
        arg1.field1944 += (var4 - arg1.field1944) / var2;
        arg1.field2041 = 0;
        if (arg1.field1959 == 0) {
            arg1.field1973 = 1024;
        }
        arg1.field1980 += (var3 - arg1.field1980) / var2;
        if (arg1.field1959 == 1) {
            arg1.field1973 = 1536;
        }
        if (arg1.field1959 == 2) {
            arg1.field1973 = 0;
        }
        if (arg0 > 19 && arg1.field1959 == 3) {
            arg1.field1973 = 512;
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(I[B)V", line = 148)
    public class343(int arg0, byte[] arg1) {
        this.field5340 = arg0;
        class192 var3 = new class192(arg1);
        this.field5350 = var3.method1399(-1172389784);
        this.field5351 = new int[this.field5350][];
        this.field5343 = new int[this.field5350];
        this.field5355 = new int[this.field5350];
        this.field5345 = new boolean[this.field5350];
        for (int var4 = 0; var4 < this.field5350; var4++) {
            this.field5355[var4] = var3.method1399(-1172389784);
        }
        for (int var5 = 0; var5 < this.field5350; var5++) {
            this.field5345[var5] = var3.method1399(-1172389784) == 1;
        }
        for (int var6 = 0; var6 < this.field5350; var6++) {
            this.field5343[var6] = var3.method1396(-54);
        }
        for (int var7 = 0; var7 < this.field5350; var7++) {
            this.field5351[var7] = new int[var3.method1399(-1172389784)];
        }
        for (int var8 = 0; var8 < this.field5350; var8++) {
            for (int var9 = 0; var9 < this.field5351[var8].length; var9++) {
                this.field5351[var8][var9] = var3.method1399(-1172389784);
            }
        }
    }
}
