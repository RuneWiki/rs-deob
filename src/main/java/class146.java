import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class146 extends class312 {

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "Z")
    public boolean field2310 = true;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public static int field2290 = 0;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field2302 = 0;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    public static int field2306 = -1;

    @OriginalMember(owner = "client!th", name = "E", descriptor = "[I")
    public static int[] field2298 = new int[4096];

    @OriginalMember(owner = "client!th", name = "S", descriptor = "[I")
    public static int[] field2312;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!th", name = "T", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "[I")
    private int[] field2292;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "[I")
    public int[] field2303;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "[Lta;")
    public static class215[] field2297;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field2294;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "[[B")
    public static byte[][] field2307;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "[[I")
    private int[][] field2291;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lgn;I)Ljava/lang/String;", line = 9)
    public final String method1010(class303 arg0, int arg1) {
        int var3 = 117 / ((arg1 + 39) / 62);
        StringBuffer var4 = new StringBuffer(80);
        if (this.field2292 != null) {
            for (int var5 = 0; var5 < this.field2292.length; var5++) {
                var4.append(this.field2294[var5]);
                var4.append(class283.method1859(this.field2292[var5], this.field2291[var5], arg0.method2054(false, class228.field3647[this.field2292[var5]]), true));
            }
        }
        var4.append(this.field2294[this.field2294.length - 1]);
        field2299++;
        return var4.toString();
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V", line = 36)
    public static final void method1011(int arg0, int arg1) {
        field2313++;
        class132.field2089.method1287(arg0, -97);
        if (arg1 != -1) {
            field2312 = (int[]) null;
        }
        class274.field4214.method1287(arg0, 114);
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2298[var0] = class118.method812(var0, -95);
        }
        field2312 = new int[14];
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(II)I", line = 55)
    public static int method1012(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILgn;[I)V", line = 62)
    public final void method1013(int arg0, class303 arg1, int[] arg2) {
        if (arg0 != 20631) {
            field2312 = (int[]) null;
        }
        field2311++;
        if (this.field2292 == null) {
            return;
        }
        for (int var4 = 0; this.field2292.length > var4 && arg2.length > var4; var4++) {
            int var5 = class284.field4356[this.method1018(var4, false)];
            if (var5 > 0) {
                arg1.method2033((byte) -70, (long) arg2[var4], var5);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(III)Loj;", line = 92)
    public static final class23 method1014(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1375[arg0][arg1][arg2];
        return var3 == null || var3.field2667 == null ? null : var3.field2667;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V", line = 101)
    public final void method1015(int arg0) {
        field2304++;
        int var2 = -86 % ((-arg0 - 64) / 60);
        if (this.field2303 != null) {
            for (int var3 = 0; var3 < this.field2303.length; var3++) {
                this.field2303[var3] = class276.method1810(this.field2303[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)I", line = 121)
    public final int method1016(int arg0) {
        if (arg0 != -19798) {
            field2309 = 9;
        }
        field2293++;
        return this.field2292 == null ? 0 : this.field2292.length;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Lgn;I)V", line = 138)
    public final void method1017(class303 arg0, int arg1) {
        if (arg1 != 31153) {
            this.method1015(-94);
        }
        while (true) {
            int var3 = arg0.method2043((byte) -126);
            if (var3 == 0) {
                field2301++;
                return;
            }
            this.method1022(var3, arg1 - 49140, arg0);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)I", line = 159)
    public final int method1018(int arg0, boolean arg1) {
        if (arg1) {
            return 91;
        } else {
            field2308++;
            return this.field2292 == null || arg0 < 0 || arg0 > this.field2292.length ? -1 : this.field2292[arg0];
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLwf;Lwf;)V", line = 174)
    public static final void method1019(byte arg0, class306 arg1, class306 arg2) {
        field2296++;
        if (arg0 == -2) {
            class175.field2679 = arg2;
            class64.field978 = arg1;
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(III)I", line = 193)
    public final int method1020(int arg0, int arg1, int arg2) {
        field2295++;
        if (this.field2292 == null || arg0 < 0 || arg0 > this.field2292.length) {
            return -1;
        } else {
            if (arg2 != -1) {
                this.method1021((byte) 54);
            }
            return this.field2291[arg0] == null || arg1 < 0 || arg1 > this.field2291[arg0].length ? -1 : this.field2291[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(B)Ljava/lang/String;", line = 213)
    public final String method1021(byte arg0) {
        field2305++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field2294 == null) {
            return "";
        }
        var2.append(this.field2294[0]);
        if (arg0 != 120) {
            this.field2303 = (int[]) null;
        }
        for (int var3 = 1; var3 < this.field2294.length; var3++) {
            var2.append("...");
            var2.append(this.field2294[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILgn;)V", line = 247)
    private final void method1022(int arg0, int arg1, class303 arg2) {
        if (arg0 == 1) {
            this.field2294 = class318.method2163(arg2.method2027(0), -84, '<');
        } else if (arg0 == 2) {
            int var4 = arg2.method2043((byte) -123);
            this.field2303 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2303[var5] = arg2.method1994(false);
            }
        } else if (arg0 == 3) {
            int var6 = arg2.method2043((byte) -120);
            this.field2292 = new int[var6];
            this.field2291 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method1994(false);
                this.field2292[var7] = var8;
                this.field2291[var7] = new int[class132.field2087[var8]];
                for (int var9 = 0; var9 < class132.field2087[var8]; var9++) {
                    this.field2291[var7][var9] = arg2.method1994(false);
                }
            }
        } else if (arg0 == 4) {
            this.field2310 = false;
        }
        if (arg1 != -17987) {
            this.method1010((class303) null, 125);
        }
        field2300++;
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V", line = 312)
    public static void method1023(int arg0) {
        field2307 = (byte[][]) null;
        int var1 = -53 % ((arg0 - 36) / 43);
        field2312 = null;
        field2297 = null;
        field2298 = null;
    }
}
