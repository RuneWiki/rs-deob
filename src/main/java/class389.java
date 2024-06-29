import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class389 extends class117 {

    @OriginalMember(owner = "client!md", name = "V", descriptor = "Z")
    public boolean field5484 = true;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "Lcs;")
    public static class351 field5483 = new class351(24, -1);

    @OriginalMember(owner = "client!md", name = "X", descriptor = "Z")
    public static boolean field5486 = false;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "I")
    public static int field5485 = -1;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "Lsq;")
    public static class454 field5487 = new class454(8);

    @OriginalMember(owner = "client!md", name = "ab", descriptor = "Lcs;")
    public static class351 field5489 = new class351(64, -1);

    @OriginalMember(owner = "client!md", name = "bb", descriptor = "I")
    public static int field5490 = 0;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "[I")
    public int[] field5467;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "[I")
    private int[] field5471;

    @OriginalMember(owner = "client!md", name = "Z", descriptor = "[I")
    public static int[] field5488;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "[Ljava/lang/String;")
    private String[] field5478;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "[[I")
    private int[][] field5472;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Llk;I)V")
    public final void method2308(class425 arg0, int arg1) {
        if (arg1 != 0) {
            method2314((class277) null, (byte) 74, (class487) null);
        }
        field5474++;
        while (true) {
            int var3 = arg0.method2503(true);
            if (var3 == 0) {
                return;
            }
            this.method2315((byte) 37, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(I)V")
    public final void method2309(int arg0) {
        field5475++;
        if (arg0 == 0 && this.field5467 != null) {
            for (int var2 = 0; var2 < this.field5467.length; var2++) {
                this.field5467[var2] = class366.method2215(this.field5467[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "g", descriptor = "(I)V")
    public static final void method2310(int arg0) {
        if (arg0 != 0) {
            field5485 = 11;
        }
        class2.field18.method1069(class200.field2866, class241.field3412, class374.field5298);
        field5468++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IBI)I")
    public final int method2311(int arg0, byte arg1, int arg2) {
        field5473++;
        if (arg1 != -82) {
            return 72;
        } else if (this.field5471 == null || arg2 < 0 || this.field5471.length < arg2) {
            return -1;
        } else if (this.field5472[arg2] == null || arg0 < 0 || arg0 > this.field5472[arg2].length) {
            return -1;
        } else {
            return this.field5472[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!md", name = "h", descriptor = "(I)I")
    public final int method2312(int arg0) {
        field5481++;
        if (this.field5471 == null) {
            return 0;
        } else if (arg0 >= -31) {
            return -6;
        } else {
            return this.field5471.length;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILlk;)Ljava/lang/String;")
    public final String method2313(int arg0, class425 arg1) {
        field5480++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field5471 != null) {
            for (int var4 = 0; var4 < this.field5471.length; var4++) {
                var3.append(this.field5478[var4]);
                var3.append(class305.method1847(this.field5472[var4], arg1.method2457(false, class475.field6728[this.field5471[var4]]), 0, this.field5471[var4]));
            }
        }
        var3.append(this.field5478[this.field5478.length - 1]);
        if (arg0 != 0) {
            this.method2312(-54);
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lhc;BLkm;)I")
    public static final int method2314(class277 arg0, byte arg1, class487 arg2) {
        field5466++;
        if (arg1 != -40) {
            method2318((class363[]) null, -122, true, (byte) -115, -37, -103);
        }
        if (arg0.field3836 != -1) {
            return arg0.field3836;
        }
        if (arg0.field3831 != -1) {
            class192 var3 = arg2.field6863.method1218(arg2.method1092() ? arg0.field3831 : arg0.field3833, false);
            if (!var3.field2739) {
                return var3.field2732;
            }
        }
        return arg0.field3826;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLlk;I)V")
    private final void method2315(byte arg0, class425 arg1, int arg2) {
        if (arg0 != 37) {
            this.method2316(122, (class425) null, (int[]) null);
        }
        if (arg2 == 1) {
            this.field5478 = class326.method1958((byte) 126, arg1.method2464(false), '<');
        } else if (arg2 == 2) {
            int var8 = arg1.method2503(true);
            this.field5467 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field5467[var9] = arg1.method2508(true);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method2503(true);
            this.field5471 = new int[var4];
            this.field5472 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method2508(true);
                this.field5471[var5] = var6;
                this.field5472[var5] = new int[class155.field2237[var6]];
                for (int var7 = 0; var7 < class155.field2237[var6]; var7++) {
                    this.field5472[var5][var7] = arg1.method2508(true);
                }
            }
        } else if (arg2 == 4) {
            this.field5484 = false;
        }
        field5477++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILlk;[I)V")
    public final void method2316(int arg0, class425 arg1, int[] arg2) {
        field5470++;
        if (this.field5471 == null) {
            return;
        }
        for (int var4 = arg0; var4 < this.field5471.length; var4++) {
            if (var4 >= arg2.length) {
                return;
            }
            int var5 = class20.field356[this.method2319(var4, -1)];
            if (var5 > 0) {
                arg1.method2463(var5, (long) arg2[var4], false);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "i", descriptor = "(I)V")
    public static void method2317(int arg0) {
        field5488 = null;
        field5489 = null;
        if (arg0 == -1) {
            field5483 = null;
            field5487 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([Lms;IZBII)V")
    public static final void method2318(class363[] arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        int var6 = -103 % ((arg3 + 18) / 32);
        for (int var7 = 0; var7 < arg0.length; var7++) {
            class363 var8 = arg0[var7];
            if (var8 != null && var8.field5062 == arg1) {
                class248.method1537(var8, 16897, arg2, arg5, arg4);
                class321.method1935(arg4, arg5, var8, -14047);
                if (var8.field5111 > (var8.field5116 - var8.field5101)) {
                    var8.field5111 = var8.field5116 - var8.field5101;
                }
                if (var8.field5111 < 0) {
                    var8.field5111 = 0;
                }
                if (var8.field5186 > var8.field5114 - var8.field5200) {
                    var8.field5186 = var8.field5114 - var8.field5200;
                }
                if (var8.field5186 < 0) {
                    var8.field5186 = 0;
                }
                if (var8.field5093 == 0) {
                    class265.method1674(var8, (byte) 28, arg2);
                }
            }
        }
        field5482++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)I")
    public final int method2319(int arg0, int arg1) {
        if (arg1 == -1) {
            field5479++;
            return this.field5471 == null || arg0 < 0 || arg0 > this.field5471.length ? -1 : this.field5471[arg0];
        } else {
            return 126;
        }
    }

    @OriginalMember(owner = "client!md", name = "j", descriptor = "(I)Ljava/lang/String;")
    public final String method2320(int arg0) {
        field5469++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field5478 == null) {
            return "";
        }
        var2.append(this.field5478[0]);
        if (arg0 != -1) {
            return null;
        }
        for (int var3 = 1; var3 < this.field5478.length; var3++) {
            var2.append("...");
            var2.append(this.field5478[var3]);
        }
        return var2.toString();
    }
}
