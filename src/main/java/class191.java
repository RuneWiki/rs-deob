import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class191 {

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    private int field3326 = 0;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    private int field3329 = -1;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Lhe;")
    private class47 field3339 = new class47();

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "Z")
    public boolean field3344 = false;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    private int field3324;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    private int field3340;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "[Lcf;")
    private class42[] field3334;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "[[[I")
    private int[][][] field3331;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field3333 = 0;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Lqe;")
    public static class168 field3335 = class66.method448("Null", 43);

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field3327 = 2301979;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field3336 = 0;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Lrd;")
    public static class207 field3325;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public final void method1235(byte arg0) {
        field3341++;
        if (arg0 <= 44) {
            method1243((byte) -77, -110, null, null, -69);
        }
        for (int var2 = 0; var2 < this.field3324; var2++) {
            this.field3331[var2][0] = null;
            this.field3331[var2][1] = null;
            this.field3331[var2][2] = null;
            this.field3331[var2] = null;
        }
        this.field3334 = null;
        this.field3331 = null;
        this.field3339.method318((byte) -117);
        this.field3339 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIILmj;)V")
    public static final void method1236(int arg0, int arg1, int arg2, class129 arg3) {
        field3338++;
        if (class240.field4106 != null || class169.field2956 || (arg3 == null || class125.method846(-58, arg3) == null)) {
            return;
        }
        class240.field4106 = arg3;
        class91.field1430 = class125.method846(-58, arg3);
        class46.field599 = arg2;
        class155.field2706 = 0;
        class234.field3971 = false;
        class71.field1075 = arg0;
        if (arg1 != -23005) {
            field3327 = 34;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)I")
    public static final int method1237(int arg0, int arg1) {
        field3328++;
        int var2 = 70 / ((15 - arg1) / 59);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V")
    public static final void method1238(boolean arg0, int arg1) {
        field3332++;
        if (arg1 == -1 || !class169.field2938[arg1]) {
            return;
        }
        class62.field851.method1697(!arg0, arg1);
        if (class108.field1741[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class108.field1741[arg1].length; var3++) {
            if (class108.field1741[arg1][var3] != null) {
                if (class108.field1741[arg1][var3].field2230 == 2) {
                    var2 = false;
                } else {
                    class108.field1741[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class108.field1741[arg1] = null;
        }
        class169.field2938[arg1] = arg0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static void method1239(int arg0) {
        field3335 = null;
        if (arg0 > -8) {
            field3336 = 14;
        }
        field3325 = null;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method1240(int arg0) {
        field3343++;
        if (this.field3340 != this.field3324) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == 11605) {
            for (int var2 = 0; var2 < this.field3324; var2++) {
                this.field3334[var2] = class58.field806;
            }
            return this.field3331;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 23127) {
            return;
        }
        field3342++;
        int var8 = class97.method639(arg5, (byte) 12, class222.field3811, class196.field3402);
        int var9 = class97.method639(arg6, (byte) 12, class222.field3811, class196.field3402);
        int var10 = class97.method639(arg0, (byte) 12, class174.field3055, class249.field4314);
        int var11 = class97.method639(arg4, (byte) 12, class174.field3055, class249.field4314);
        int var12 = class97.method639(arg1 + arg5, (byte) 12, class222.field3811, class196.field3402);
        int var13 = class97.method639(arg6 - arg1, (byte) 12, class222.field3811, class196.field3402);
        for (int var14 = var8; var14 < var12; var14++) {
            class232.method1501(arg7, var10, (byte) -108, class241.field4117[var14], var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class232.method1501(arg7, var10, (byte) -108, class241.field4117[var15], var11);
        }
        int var16 = class97.method639(arg0 + arg1, (byte) 12, class174.field3055, class249.field4314);
        int var17 = class97.method639(arg4 - arg1, (byte) 12, class174.field3055, class249.field4314);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class241.field4117[var18];
            class232.method1501(arg7, var10, (byte) -108, var19, var16);
            class232.method1501(arg2, var16, (byte) -108, var19, var17);
            class232.method1501(arg7, var17, (byte) -108, var19, var11);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)[[I")
    public final int[][] method1242(int arg0, int arg1) {
        field3337++;
        int var3 = 29 / ((arg1 + 17) / 61);
        if (this.field3340 == this.field3324) {
            this.field3344 = this.field3334[arg0] == null;
            this.field3334[arg0] = class58.field806;
            return this.field3331[arg0];
        } else if (this.field3324 == 1) {
            this.field3344 = this.field3329 != arg0;
            this.field3329 = arg0;
            return this.field3331[0];
        } else {
            class42 var4 = this.field3334[arg0];
            if (var4 == null) {
                this.field3344 = true;
                if (this.field3324 <= this.field3326) {
                    class42 var5 = (class42) this.field3339.method322((byte) -58);
                    var4 = new class42(arg0, var5.field556);
                    this.field3334[var5.field559] = null;
                    var5.method1234(17216);
                } else {
                    var4 = new class42(arg0, this.field3326);
                    this.field3326++;
                }
                this.field3334[arg0] = var4;
            } else {
                this.field3344 = false;
            }
            this.field3339.method310(-15062, var4);
            return this.field3331[var4.field556];
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI[S[Lqe;I)V")
    public static final void method1243(byte arg0, int arg1, short[] arg2, class168[] arg3, int arg4) {
        if (arg0 > -15) {
            return;
        }
        if (arg1 > arg4) {
            int var5 = (arg4 + arg1) / 2;
            class168 var6 = arg3[var5];
            int var7 = arg4;
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var6;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var8;
            for (int var9 = arg4; var9 < arg1; var9++) {
                if (var6 == null || arg3[var9] != null && arg3[var9].method1115(var6, 44) < (var9 & 0x1)) {
                    class168 var10 = arg3[var9];
                    arg3[var9] = arg3[var7];
                    arg3[var7] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var7];
                    arg2[var7++] = var11;
                }
            }
            arg3[arg1] = arg3[var7];
            arg3[var7] = var6;
            arg2[arg1] = arg2[var7];
            arg2[var7] = var8;
            method1243((byte) -69, var7 - 1, arg2, arg3, arg4);
            method1243((byte) -64, arg1, arg2, arg3, var7 + 1);
        }
        field3330++;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(III)V")
    public class191(int arg0, int arg1, int arg2) {
        this.field3324 = arg0;
        this.field3340 = arg1;
        this.field3334 = new class42[this.field3340];
        this.field3331 = new int[this.field3324][3][arg2];
    }
}
