import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class126 extends class224 {

    @OriginalMember(owner = "client!bm", name = "R", descriptor = "[I")
    public static int[] field1938 = new int[2];

    @OriginalMember(owner = "client!bm", name = "Y", descriptor = "Luf;")
    private static class168 field1945 = class148.method1019(-1720, "Examine");

    @OriginalMember(owner = "client!bm", name = "bb", descriptor = "Luf;")
    public static class168 field1948 = field1945;

    @OriginalMember(owner = "client!bm", name = "W", descriptor = "Luf;")
    private static class168 field1943 = class148.method1019(-1720, "wave2:");

    @OriginalMember(owner = "client!bm", name = "T", descriptor = "[I")
    public static int[] field1940 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!bm", name = "fb", descriptor = "Luf;")
    public static class168 field1952 = class148.method1019(-1720, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!bm", name = "cb", descriptor = "Luf;")
    public static class168 field1949 = field1943;

    @OriginalMember(owner = "client!bm", name = "eb", descriptor = "Luf;")
    public static class168 field1951 = field1943;

    @OriginalMember(owner = "client!bm", name = "S", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!bm", name = "U", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!bm", name = "V", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!bm", name = "X", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!bm", name = "Z", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!bm", name = "ab", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!bm", name = "db", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZLj;)V", line = 6)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        field1950++;
        if (arg1) {
            method894(-117, -20, 113, -24, 19, -50, -50);
        }
        if (arg0 == 0) {
            this.field3610 = arg2.method1042((byte) -35) == 1;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BI)[I", line = 19)
    public final int[] method18(byte arg0, int arg1) {
        field1947++;
        int var3 = 25 / ((arg0 - 20) / 51);
        int[] var4 = this.field3613.method1866(1, arg1);
        if (this.field3613.field4531) {
            int[] var5 = this.method1537(arg1, 0, 0);
            for (int var6 = 0; var6 < class187.field2961; var6++) {
                var4[var6] = 4096 - var5[var6];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V", line = 64)
    public class126() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZI)Luf;", line = 73)
    public static final class168 method891(boolean arg0, int arg1) {
        field1941++;
        class168 var2 = new class168();
        var2.field2716 = new byte[arg1];
        if (arg0) {
            var2.field2692 = 0;
            return var2;
        } else {
            return (class168) null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)[[I", line = 94)
    public final int[][] method17(int arg0, byte arg1) {
        if (arg1 != -77) {
            return (int[][]) ((int[][]) null);
        }
        field1944++;
        int[][] var3 = this.field3631.method1587(arg0, 9804);
        if (this.field3631.field3756) {
            int[][] var4 = this.method1535(0, arg1 ^ 0xFFFFFFB0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class187.field2961; var11++) {
                var6[var11] = 4096 - var5[var11];
                var7[var11] = 4096 - var8[var11];
                var10[var11] = 4096 - var9[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIII)V", line = 146)
    public static final void method892(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg0 - arg4;
        field1939++;
        int var7 = arg2 - arg3;
        if (arg5 != 861304876) {
            field1938 = (int[]) null;
        }
        if (var7 == 0) {
            if (var6 != 0) {
                class96.method735(arg1, arg3, arg0, arg4, 124);
            }
        } else if (var6 == 0) {
            class281.method1941(arg4, arg1, -1, arg2, arg3);
        } else {
            int var8 = (var6 << 12) / var7;
            int var9 = arg4 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (arg3 < class150.field2331) {
                var11 = (class150.field2331 * var8 >> 12) + var9;
                var10 = class150.field2331;
            } else if (arg3 <= class65.field874) {
                var10 = arg3;
                var11 = arg4;
            } else {
                var11 = (class65.field874 * var8 >> 12) + var9;
                var10 = class65.field874;
            }
            int var12;
            int var13;
            if (arg2 < class150.field2331) {
                var12 = class150.field2331;
                var13 = (class150.field2331 * var8 >> 12) + var9;
            } else if (class65.field874 < arg2) {
                var12 = class65.field874;
                var13 = (class65.field874 * var8 >> 12) + var9;
            } else {
                var12 = arg2;
                var13 = arg0;
            }
            if (class9.field112 > var11) {
                var11 = class9.field112;
                var10 = (class9.field112 - var9 << 12) / var8;
            } else if (class44.field538 < var11) {
                var10 = (class44.field538 - var9 << 12) / var8;
                var11 = class44.field538;
            }
            if (class9.field112 > var13) {
                var13 = class9.field112;
                var12 = (class9.field112 - var9 << 12) / var8;
            } else if (class44.field538 < var13) {
                var13 = class44.field538;
                var12 = (class44.field538 - var9 << 12) / var8;
            }
            class244.method1684(arg1, var13, var10, var12, -9045, var11);
        }
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(B)V", line = 250)
    public static void method893(byte arg0) {
        field1952 = null;
        field1948 = null;
        field1949 = null;
        field1945 = null;
        field1951 = null;
        field1940 = null;
        if (arg0 > -18) {
            method893((byte) 110);
        }
        field1943 = null;
        field1938 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIII)V", line = 275)
    public static final void method894(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1946++;
        if (arg6 != -28443) {
            field1952 = (class168) null;
        }
        class15[] var7 = class43.field534;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class15 var9 = var7[var8];
            if (var9 != null && var9.field151 == 2) {
                class134.method932(arg6 ^ 0x6F61, arg4, arg0, arg3 >> 1, arg2 >> 1, (var9.field152 - class276.field4641 << 7) + var9.field172, (-class182.field2916 + var9.field156 << 7) + var9.field153, var9.field158 * 2);
                if (class95.field1521 > -1 && class203.field3335 % 20 < 10) {
                    class148.field2285[var9.field150].method151(class95.field1521 + arg1 - 12, arg5 - -class234.field3758 + -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(BI)I", line = 306)
    public static final int method895(byte arg0, int arg1) {
        field1942++;
        if (arg1 < 0) {
            return 0;
        }
        if (arg0 != 9) {
            method894(-16, -82, 26, 84, -10, 38, -120);
        }
        class143 var2 = (class143) class259.field4390.method493((long) arg1, 50);
        if (var2 == null) {
            return class76.method438((byte) 59, arg1).field2092;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field2207.length; var4++) {
            if (var2.field2207[var4] == -1) {
                var3++;
            }
        }
        return var3 + class76.method438((byte) 59, arg1).field2092 - var2.field2207.length;
    }
}
