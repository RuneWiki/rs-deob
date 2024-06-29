import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class280 {

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public int field4906 = -1;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "[I")
    private int[] field4913 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "Z")
    public boolean field4907 = false;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "Lsf;")
    public static class108 field4896 = class140.method973(255, ":trade:");

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "[Z")
    public static boolean[] field4910 = new boolean[100];

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lsf;")
    public static class108 field4902 = class140.method973(255, "gleiten:");

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "[Lsf;")
    public static class108[] field4912 = new class108[100];

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "[I")
    private int[] field4914;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "[S")
    private short[] field4898;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "[S")
    private short[] field4901;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "[S")
    private short[] field4903;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "[S")
    private short[] field4915;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "[[[I")
    public static int[][][] field4905;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IBIIILoj;I)V", line = 14)
    public static final void method2010(int arg0, byte arg1, int arg2, int arg3, int arg4, class328 arg5, int arg6) {
        long var7 = 0L;
        field4904++;
        if (arg4 == 0) {
            var7 = class282.method2031(arg0, arg6, arg3);
        } else if (arg4 == 1) {
            var7 = class289.method2068(arg0, arg6, arg3);
        } else if (arg4 == 2) {
            var7 = class312.method2175(arg0, arg6, arg3);
        } else if (arg4 == 3) {
            var7 = class45.method325(arg0, arg6, arg3);
        }
        if (arg1 != -107) {
            return;
        }
        boolean var9 = true;
        boolean var10 = false;
        int var11 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        boolean var12 = false;
        int var13 = ((int) var7 & 0x7F851) >> 14;
        int var14 = (int) var7 >> 20 & 0x3;
        class60 var15 = class201.method1424(var11, (byte) 109);
        if (var15.method408((byte) -29)) {
            class54.method379(arg6, arg0, var15, arg1 + 152, arg3);
        }
        if (var7 == 0L) {
            return;
        }
        class290 var16 = null;
        class290 var17 = null;
        if (arg4 == 0) {
            class174 var21 = class315.method2196(arg0, arg6, arg3);
            if (var21 != null) {
                var16 = var21.field3173;
                var17 = var21.field3183;
            }
            if (var15.field946 != 0) {
                arg5.method2246(arg6, arg3, var13, var15.field959, var14, 4);
            }
        } else if (arg4 == 1) {
            class36 var20 = class269.method1946(arg0, arg6, arg3);
            if (var20 != null) {
                var17 = var20.field513;
                var16 = var20.field510;
            }
        } else if (arg4 == 2) {
            class326 var18 = class3.method30(arg0, arg6, arg3);
            if (var18 != null) {
                var17 = var18.field5570;
            }
            if (var15.field946 != 0 && arg6 + var15.field939 < 104 && (var15.field939 + arg3) < 104 && var15.field899 + arg6 < 104 && var15.field899 + arg3 < 104) {
                arg5.method2233(arg3, var15.field899, var14, arg6, var15.field939, var15.field959, true);
            }
        } else if (arg4 == 3) {
            class258 var19 = class200.method1414(arg0, arg6, arg3);
            if (var19 != null) {
                var17 = var19.field4557;
            }
            if (var15.field946 == 1) {
                arg5.method2239(arg3, arg6, (byte) -101);
            }
        }
        if (!class231.field4051 || !var15.field921) {
            return;
        }
        if (var13 == 2) {
            if ((var17 instanceof class114)) {
                ((class114) var17).method816(arg1 ^ 0x6A);
            } else {
                class143.method985(var13, 20, 0, arg2, 0, arg6, var15, var14 + 4, arg3);
            }
            if (var16 instanceof class114) {
                ((class114) var16).method816(-1);
            } else {
                class143.method985(var13, 20, 0, arg2, 0, arg6, var15, var14 + 1 & 0x3, arg3);
            }
        } else if (var13 == 5) {
            if (var17 instanceof class114) {
                ((class114) var17).method816(-1);
            } else {
                class143.method985(4, 20, class142.field2504[var14] * 8, arg2, class68.field1047[var14] * 8, arg6, var15, var14, arg3);
            }
        } else if (var13 == 6) {
            if ((var17 instanceof class114)) {
                ((class114) var17).method816(-1);
            } else {
                class143.method985(4, 20, class69.field1077[var14] * 8, arg2, class90.field1414[var14] * 8, arg6, var15, var14 + 4, arg3);
            }
        } else if (var13 == 7) {
            if (var17 instanceof class114) {
                ((class114) var17).method816(-1);
            } else {
                class143.method985(4, 20, 0, arg2, 0, arg6, var15, (var14 + 2 & 0x3) + 4, arg3);
            }
        } else if (var13 == 8) {
            if (var17 instanceof class114) {
                ((class114) var17).method816(arg1 + 106);
            } else {
                class143.method985(4, 20, class69.field1077[var14] * 8, arg2, class90.field1414[var14] * 8, arg6, var15, var14 + 4, arg3);
            }
            if ((var16 instanceof class114)) {
                ((class114) var16).method816(-1);
            } else {
                class143.method985(4, 20, class69.field1077[var14] * 8, arg2, class90.field1414[var14] * 8, arg6, var15, (var14 + 2 & 0x3) + 4, arg3);
            }
        } else if (var13 == 11) {
            if (var17 instanceof class114) {
                ((class114) var17).method816(-1);
            } else {
                class143.method985(10, 20, 0, arg2, 0, arg6, var15, var14 + 4, arg3);
            }
        } else if (var17 instanceof class114) {
            ((class114) var17).method816(arg1 ^ 0x6A);
        } else {
            class143.method985(var13, 20, 0, arg2, 0, arg6, var15, var14, arg3);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lrm;I)V", line = 209)
    public final void method2011(class249 arg0, int arg1) {
        field4899++;
        int var3 = 101 % ((arg1 + 59) / 61);
        while (true) {
            int var4 = arg0.method1731(true);
            if (var4 == 0) {
                return;
            }
            this.method2016(var4, (byte) 112, arg0);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)Ljf;", line = 230)
    public final class230 method2012(byte arg0) {
        field4900++;
        if (this.field4914 == null) {
            return null;
        }
        class230[] var2 = new class230[this.field4914.length];
        if (arg0 != 8) {
            this.method2016(-127, (byte) -62, (class249) null);
        }
        for (int var3 = 0; var3 < this.field4914.length; var3++) {
            var2[var3] = class230.method1556(class101.field1779, this.field4914[var3], 0);
        }
        class230 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class230(var2, var2.length);
        }
        if (this.field4901 != null) {
            for (int var5 = 0; var5 < this.field4901.length; var5++) {
                var4.method1553(this.field4901[var5], this.field4915[var5]);
            }
        }
        if (this.field4903 != null) {
            for (int var6 = 0; var6 < this.field4903.length; var6++) {
                var4.method1565(this.field4903[var6], this.field4898[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Z", line = 286)
    public final boolean method2013(int arg0) {
        field4916++;
        if (this.field4914 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field4914.length; var3++) {
            if (!class101.field1779.method1885(0, (byte) 125, this.field4914[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)Ljf;", line = 312)
    public final class230 method2014(int arg0) {
        field4908++;
        class230[] var2 = new class230[5];
        int var3 = 0;
        if (arg0 != 4) {
            method2017(26, -126, 110, -118, -124, -113, 100, 113, -75);
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field4913[var4] != -1) {
                var2[var3++] = class230.method1556(class101.field1779, this.field4913[var4], 0);
            }
        }
        class230 var5 = new class230(var2, var3);
        if (this.field4901 != null) {
            for (int var6 = 0; var6 < this.field4901.length; var6++) {
                var5.method1553(this.field4901[var6], this.field4915[var6]);
            }
        }
        if (this.field4903 != null) {
            for (int var7 = 0; var7 < this.field4903.length; var7++) {
                var5.method1565(this.field4903[var7], this.field4898[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)Z", line = 370)
    public final boolean method2015(int arg0) {
        if (arg0 <= 16) {
            method2017(-83, 96, 85, 49, 63, 8, -40, -111, -56);
        }
        field4909++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field4913[var3] != -1 && !class101.field1779.method1885(0, (byte) 126, this.field4913[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IBLrm;)V", line = 397)
    private final void method2016(int arg0, byte arg1, class249 arg2) {
        if (arg1 < 17) {
            field4910 = (boolean[]) null;
        }
        field4911++;
        if (arg0 == 1) {
            this.field4906 = arg2.method1731(true);
        } else if (arg0 == 2) {
            int var4 = arg2.method1731(true);
            this.field4914 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4914[var5] = arg2.method1712(-1);
            }
        } else if (arg0 == 3) {
            this.field4907 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method1731(true);
            this.field4901 = new short[var6];
            this.field4915 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4901[var7] = (short) arg2.method1712(-1);
                this.field4915[var7] = (short) arg2.method1712(-1);
            }
        } else if (arg0 == 41) {
            int var8 = arg2.method1731(true);
            this.field4898 = new short[var8];
            this.field4903 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4903[var9] = (short) arg2.method1712(-1);
                this.field4898[var9] = (short) arg2.method1712(-1);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field4913[arg0 - 60] = arg2.method1712(-1);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIIII)V", line = 490)
    public static final void method2017(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4897++;
        if (class219.method1508(arg0, -123)) {
            class14.field186 = null;
            if (arg5 != 8619) {
                field4905 = (int[][][]) ((int[][][]) null);
            }
            class161.method1114(arg3, arg6, -1, arg4, arg8, arg1, arg5 - 8624, class320.field5485[arg0], arg2, arg7);
            if (class14.field186 != null) {
                class161.method1114(arg3, class282.field4938, -1412584499, arg4, arg8, arg1, -5, class14.field186, arg2, class259.field4570);
                class14.field186 = null;
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class47.field692[var9] = true;
            }
        } else {
            class47.field692[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V", line = 544)
    public static void method2018(int arg0) {
        field4912 = null;
        field4902 = null;
        field4905 = (int[][][]) null;
        if (arg0 != -12603) {
            method2017(118, 124, 25, 50, 108, 123, -68, 96, -16);
        }
        field4910 = null;
        field4896 = null;
    }
}
