import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class86 {

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    private int field2158 = 0;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    private int field2141;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "[Lsc;")
    private class128[] field2155;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Lid;")
    private static class60 field2149 = class11.method72(" is already on your ignore list", (byte) -48);

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Lid;")
    private static class60 field2147 = class11.method72("Loading textures )2 ", (byte) -4);

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Lid;")
    public static class60 field2144 = field2147;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Lid;")
    public static class60 field2153 = class11.method72("mn", (byte) 92);

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field2157 = 0;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Lid;")
    public static class60 field2151 = field2149;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Lid;")
    private static class60 field2146 = class11.method72("Loading fonts )2 ", (byte) -92);

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "Lid;")
    public static class60 field2160 = class11.method72("Benutzen Sie die (WPasswort -=ndern(W Option", (byte) 125);

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lid;")
    public static class60 field2145 = field2146;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "J")
    private long field2156;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Lsc;")
    private class128 field2148;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "Lsc;")
    private class128 field2161;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lae;")
    public static class6 field2140;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Lsc;")
    public final class128 method711(int arg0) {
        field2137++;
        if (this.field2158 > 0 && this.field2155[this.field2158 - 1] != this.field2161) {
            class128 var2 = this.field2161;
            this.field2161 = var2.field2920;
            return var2;
        }
        while (this.field2141 > this.field2158) {
            class128 var3 = this.field2155[this.field2158++].field2920;
            if (this.field2155[this.field2158 - 1] != var3) {
                this.field2161 = var3.field2920;
                return var3;
            }
        }
        return arg0 <= 92 ? null : null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(JLsc;B)V")
    public final void method712(long arg0, class128 arg1, byte arg2) {
        field2143++;
        if (arg1.field2918 != null) {
            arg1.method1009((byte) 113);
        }
        class128 var5 = this.field2155[(int) (arg0 & (long) (this.field2141 - 1))];
        arg1.field2920 = var5;
        arg1.field2918 = var5.field2918;
        arg1.field2918.field2920 = arg1;
        arg1.field2920.field2918 = arg1;
        arg1.field2929 = arg0;
        if (arg2 <= 43) {
            field2151 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Lsc;")
    public final class128 method713(int arg0) {
        if (arg0 != 12421) {
            this.method717(true);
        }
        field2138++;
        this.field2158 = 0;
        return this.method711(127);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static final void method714(byte arg0) {
        class77.field1889 = null;
        class97.field2377 = null;
        class22.field520 = null;
        class18.field458 = null;
        class8.field117 = null;
        field2142++;
        class116.field2736 = null;
        class152.field3417 = null;
        class18.field459 = null;
        class55.field1380 = null;
        class106.field2596 = null;
        class87.field2174 = null;
        class132.field2995 = null;
        if (arg0 >= -125) {
            method714((byte) -36);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIBII)V")
    public static final void method715(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = 0;
        if (arg2 != 40) {
            field2160 = null;
        }
        while (var5 < class87.field2164) {
            if (arg0 < class38.field903[var5] + class19.field469[var5] && class19.field469[var5] < arg0 + arg4 && class14.field281[var5] + class35.field885[var5] > arg3 && class14.field281[var5] < arg1 + arg3) {
                class47.field1237[var5] = true;
            }
            var5++;
        }
        field2139++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BJ)Lsc;")
    public final class128 method716(byte arg0, long arg1) {
        this.field2156 = arg1;
        class128 var4 = this.field2155[(int) ((long) (this.field2141 - 1) & arg1)];
        if (arg0 <= 0) {
            this.method712(37L, null, (byte) 63);
        }
        field2154++;
        for (this.field2148 = var4.field2920; this.field2148 != var4; this.field2148 = this.field2148.field2920) {
            if (this.field2148.field2929 == arg1) {
                class128 var5 = this.field2148;
                this.field2148 = this.field2148.field2920;
                return var5;
            }
        }
        this.field2148 = null;
        return null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)Lsc;")
    public final class128 method717(boolean arg0) {
        field2162++;
        if (this.field2148 == null) {
            return null;
        }
        if (arg0) {
            method720(-54, 90, null, true, null);
        }
        class128 var2 = this.field2155[(int) (this.field2156 & (long) (this.field2141 - 1))];
        while (this.field2148 != var2) {
            if (this.field2148.field2929 == this.field2156) {
                class128 var3 = this.field2148;
                this.field2148 = this.field2148.field2920;
                return var3;
            }
            this.field2148 = this.field2148.field2920;
        }
        this.field2148 = null;
        return null;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
    public static final void method718(int arg0) {
        class22.field519.method1214(172, 0);
        if (arg0 != 18261) {
            field2157 = -105;
        }
        for (class81 var1 = (class81) class39.field929.method713(arg0 - 5840); var1 != null; var1 = (class81) class39.field929.method711(123)) {
            if (var1.field2026 == 0 || var1.field2026 == 3) {
                class109.method894(false, var1, true);
            }
        }
        class133.field3019++;
        if (class124.field2864 != null) {
            class12.method79(-30833, class124.field2864);
            class124.field2864 = null;
        }
        field2159++;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I)V")
    public class86(int arg0) {
        this.field2141 = arg0;
        this.field2155 = new class128[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class128 var3 = this.field2155[var2] = new class128();
            var3.field2918 = var3;
            var3.field2920 = var3;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
    public static void method719(int arg0) {
        field2145 = null;
        field2146 = null;
        field2147 = null;
        field2153 = null;
        field2140 = null;
        field2151 = null;
        field2149 = null;
        int var1 = -32 % ((3 - arg0) / 51);
        field2144 = null;
        field2160 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILie;ZLie;)Lge;")
    public static final class47 method720(int arg0, int arg1, class61 arg2, boolean arg3, class61 arg4) {
        field2152++;
        int[] var5 = arg2.method480((byte) -69, arg0);
        boolean var6 = true;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg2.method477(var5[var7], 18734, arg0);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg3) {
                    var10 = arg4.method477(var9, 18734, 0);
                } else {
                    var10 = arg4.method477(0, 18734, var9);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        int var11 = -3 / ((arg1 + 69) / 50);
        if (!var6) {
            return null;
        }
        try {
            return new class47(arg2, arg4, arg0, arg3);
        } catch (Exception var12) {
            return null;
        }
    }
}
